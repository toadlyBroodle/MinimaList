package ca.toadlybroodle.minimalist;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import ca.toadlybroodle.minimalist.db.OutlineRepository;
import ca.toadlybroodle.minimalist.iface.HostContract;
import ca.toadlybroodle.minimalist.model.OutlineRow;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;

// Ported from decompiled C0567n. Extends AppSettings; provides local backup/export helpers.
// Cloud fields (FirebaseAuth, RTDB reference, AuthStateListener) removed in Phase 3.1/3.3.
// Methods m4963b, m4965p, m4966q, m4971v, m4972w, m4975z removed in Phase 3.1–3.3.
// Phase 9.2a: autosave now goes through OutlineRepository (Room); m4976a / m4977b retained
// only for the manual-backup user feature (backup=true), to be replaced by 9.3 SAF JSON.
public class OutlineStore extends AppSettings {

    private static final String f3974s = "fuckn" + OutlineStore.class.getSimpleName();

    public interface LoadCallback {
        void onLoaded(HashMap<String, ArrayList<OutlineRow>> data);
    }

    OutlineStore(HostContract host) {
        super(host);
    }

    // Captures the current in-memory outline on the calling thread (TextView access is
    // main-thread-only) and hands the snapshot off to the background executor for the
    // actual Room write. Replaces the autosave half of m4976a(false, false).
    void saveAllToRepo() {
        OutlineRepository repo = AppMain.repository();
        if (repo == null) {
            Log.w(f3974s, "saveAllToRepo: repository not initialised yet");
            return;
        }
        HashMap<String, ArrayList<OutlineRow>> snapshot =
                OutlineFragment.m4892a(f3938a.mo4786x());
        AppMain.io().execute(() -> repo.saveAllAsHashMap(snapshot));
    }

    // Loads the full outline from Room on the background executor and delivers the resulting
    // HashMap to `callback` on the main thread. Replaces the autosave-read half of
    // m4977b(false, false).
    void loadAllFromRepo(LoadCallback callback) {
        OutlineRepository repo = AppMain.repository();
        if (repo == null) {
            Log.w(f3974s, "loadAllFromRepo: repository not initialised yet");
            callback.onLoaded(null);
            return;
        }
        Handler main = new Handler(Looper.getMainLooper());
        AppMain.io().execute(() -> {
            HashMap<String, ArrayList<OutlineRow>> data = repo.loadAllAsHashMap();
            main.post(() -> callback.onLoaded(data));
        });
    }

    // Phase 9.3: capture the current in-memory outline on the calling (main) thread, then
    // write it as plain Gson JSON to a user-chosen SAF URI on the IO executor.
    void exportToUri(Uri uri) {
        String json = new Gson().toJson(OutlineFragment.m4892a(f3938a.mo4786x()));
        Context ctx = f3938a.mo4775m();
        Handler main = new Handler(Looper.getMainLooper());
        AppMain.io().execute(() -> {
            try (OutputStream os = ctx.getContentResolver().openOutputStream(uri, "wt")) {
                if (os == null) throw new IOException("null OutputStream for URI");
                os.write(json.getBytes("UTF-8"));
                main.post(() -> Toast.makeText(ctx, R.string.toast_json_exported,
                        Toast.LENGTH_SHORT).show());
            } catch (Exception e) {
                Log.e(f3974s, "exportToUri failed: " + e.getMessage());
                main.post(() -> Toast.makeText(ctx, R.string.toast_json_export_fail,
                        Toast.LENGTH_SHORT).show());
            }
        });
    }

    // Phase 9.3: read a JSON outline from a SAF URI and return the parsed HashMap.
    // Must be called on a background thread (IO). Returns null on any parse/IO failure.
    static HashMap<String, ArrayList<OutlineRow>> importFromUri(Context ctx, Uri uri) {
        try (InputStream is = ctx.getContentResolver().openInputStream(uri)) {
            if (is == null) return null;
            byte[] bytes = readAllBytes(is);
            String json = new String(bytes, "UTF-8");
            return new Gson().fromJson(json,
                    new TypeToken<HashMap<String, ArrayList<OutlineRow>>>() {}.getType());
        } catch (Exception e) {
            Log.e("fucknOutlineStore", "importFromUri failed: " + e.getMessage());
            return null;
        }
    }

    // Phase 10.7: read a plain-text outline (the legacy m4967r export format) from a
    // SAF URI and return it as a single-entry HashMap keyed by the sublist name
    // derived from the file's display name. Must be called on a background thread.
    // Returns null on any parse/IO failure or if the file has zero parseable rows.
    //
    // Export format per row (one row per line, written by m4967r):
    //   <indent-spaces> + ("x-" | " -") + <text>
    // i.e. indent = leading-spaces-before-marker, completed = marker starts with 'x'.
    static HashMap<String, ArrayList<OutlineRow>> importTxtFromUri(Context ctx, Uri uri) {
        try (InputStream is = ctx.getContentResolver().openInputStream(uri)) {
            if (is == null) return null;
            byte[] bytes = readAllBytes(is);
            String txt = new String(bytes, "UTF-8");
            ArrayList<OutlineRow> rows = parseTxtRows(txt);
            if (rows.isEmpty()) return null;
            String name = sublistNameFromUri(ctx, uri);
            HashMap<String, ArrayList<OutlineRow>> map = new HashMap<>();
            map.put(name, rows);
            return map;
        } catch (Exception e) {
            Log.e(f3974s, "importTxtFromUri failed: " + e.getMessage());
            return null;
        }
    }

    static ArrayList<OutlineRow> parseTxtRows(String txt) {
        ArrayList<OutlineRow> rows = new ArrayList<>();
        for (String line : txt.split("\\r?\\n", -1)) {
            if (line.isEmpty()) continue;
            int n = line.length();
            int leading = 0;
            while (leading < n && line.charAt(leading) == ' ') leading++;
            if (leading >= n) continue;
            char marker = line.charAt(leading);
            int textStart;
            int indent;
            boolean complete;
            if (marker == 'x' && leading + 1 < n && line.charAt(leading + 1) == '-') {
                indent = leading;
                complete = true;
                textStart = leading + 2;
            } else if (marker == '-' && leading > 0) {
                // " -" marker: the last leading space was the marker space.
                indent = leading - 1;
                complete = false;
                textStart = leading + 1;
            } else {
                continue; // malformed line, skip silently
            }
            String text = textStart < n ? line.substring(textStart) : "";
            rows.add(new OutlineRow(indent, text, complete, false, 0L, false));
        }
        return rows;
    }

    // Use the SAF file's display name, strip the .txt extension and any trailing
    // 13-digit epoch-ms stamp (m5014c() appended by the legacy m4967r exporter).
    private static String sublistNameFromUri(Context ctx, Uri uri) {
        String display = null;
        try (android.database.Cursor c = ctx.getContentResolver()
                .query(uri, new String[]{android.provider.OpenableColumns.DISPLAY_NAME},
                        null, null, null)) {
            if (c != null && c.moveToFirst() && !c.isNull(0)) display = c.getString(0);
        } catch (Exception ignored) { /* fall through to last-resort */ }
        if (display == null || display.isEmpty()) display = "Imported";
        if (display.endsWith(".txt") || display.endsWith(".TXT")) {
            display = display.substring(0, display.length() - 4);
        }
        // Strip trailing legacy epoch-ms stamp (13 digits) if present.
        int len = display.length();
        if (len > 13) {
            int i = len - 1;
            int digits = 0;
            while (i >= 0 && Character.isDigit(display.charAt(i)) && digits < 13) {
                i--;
                digits++;
            }
            if (digits == 13) display = display.substring(0, i + 1);
        }
        display = display.trim();
        return display.isEmpty() ? "Imported" : display;
    }

    private static byte[] readAllBytes(InputStream is) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] buf = new byte[4096];
        int n;
        while ((n = is.read(buf)) != -1) {
            baos.write(buf, 0, n);
        }
        return baos.toByteArray();
    }

    static Bitmap m4961a(Context context) {
        try {
            return BitmapFactory.decodeStream(new FileInputStream(
                    new File(new ContextWrapper(context).getDir("widget_ss", 0),
                            "widgetScreenShot.jpg")));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    static void m4962a(View view) throws Throwable {
        Exception e;
        Bitmap bitmap;
        FileOutputStream fos;
        FileOutputStream fos2 = null;
        try {
            // Phase 3.5: billing removed; give everyone the live screenshot unconditionally.
            view.setDrawingCacheEnabled(true);
            bitmap = Bitmap.createBitmap(view.getDrawingCache());
            try {
                view.setDrawingCacheEnabled(false);
            } catch (Exception e2) {
                e = e2;
                e.printStackTrace();
            }
        } catch (Exception e3) {
            e = e3;
            bitmap = null;
        }
        try {
            try {
                fos = new FileOutputStream(new File(
                        new ContextWrapper(f3938a.mo4775m()).getDir("widget_ss", 0),
                        "widgetScreenShot.jpg"));
            } catch (Exception e4) {
                e = e4;
                return;
            }
        } catch (Throwable th) {
            throw th;
        }
        try {
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, fos);
            try {
                fos.close();
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        } catch (Exception e6) {
            e = e6;
            fos2 = fos;
            e.printStackTrace();
            try {
                fos2.close();
            } catch (Exception e7) {
                e7.printStackTrace();
            }
        } catch (Throwable th2) {
            fos2 = fos;
            try {
                fos2.close();
            } catch (Exception e8) {
                e8.printStackTrace();
            }
            throw th2;
        }
    }

    // Phase 3.3: removed m4963b (App-Invites RTDB write).

    private static File m4964c(boolean backup, boolean external) {
        ContextWrapper cw = new ContextWrapper(f3938a.mo4775m());
        String name = backup ? "sublist_collection_backup" : "sublist_collection";
        return external ? new File(m4970u(), name) : new File(cw.getFilesDir(), name);
    }

    // Phase 3.1: removed m4965p() — cloud pull via ValueEventListener.
    // Phase 3.1: removed m4966q() — cloud push to sublist_collections/<uid>.

    static void m4967r() {
        exportTxtToDir(m4970u());
    }

    // Phase 10.8: parameterized TXT export — write each open sublist to <dir>/<name>.txt
    // using the same line format the legacy m4967r() shipped. Returns the parent dir
    // path on success (for toast) or null on failure. The 13-digit epoch suffix the
    // legacy exporter appended is dropped — filenames are now plain sublist names so
    // a re-export overwrites the previous file rather than littering the directory.
    static String exportTxtToDir(File dir) {
        if (dir == null) return null;
        if (!dir.exists() && !dir.mkdirs()) return null;
        for (OutlineFragment frag : f3938a.mo4786x()) {
            ArrayList<OutlineRowView> rows = frag.mo4849af().f3987b;
            String name = frag.getTag();
            if (name == null || name.isEmpty()) name = "Imported";
            File file = new File(dir, sanitizeFileName(name) + ".txt");
            try {
                FileOutputStream fos = new FileOutputStream(file);
                OutputStreamWriter writer = new OutputStreamWriter(fos);
                for (OutlineRowView rv : rows) {
                    StringBuilder indent = new StringBuilder();
                    for (int i = 0; i < rv.m4859a(); i++) indent.append(' ');
                    writer.append("\n").append(indent)
                            .append(rv.f3823f ? "x-" : " -")
                            .append(rv.f3822e.getText().toString().replaceAll("\n", " "));
                }
                writer.close();
                fos.close();
            } catch (IOException ex) {
                Log.e(f3974s, "exportTxtToDir failed: " + ex.getMessage());
                return null;
            }
        }
        return dir.getAbsolutePath();
    }

    // Phase 10.8: direct JSON export (no SAF) — writes all open sublists to
    // <dir>/minimalist_export.json. Returns the file path on success or null on failure.
    static String exportJsonToDir(File dir) {
        if (dir == null) return null;
        if (!dir.exists() && !dir.mkdirs()) return null;
        String json = new Gson().toJson(OutlineFragment.m4892a(f3938a.mo4786x()));
        File file = new File(dir, "minimalist_export.json");
        try (FileOutputStream fos = new FileOutputStream(file, false)) {
            fos.write(json.getBytes("UTF-8"));
            return file.getAbsolutePath();
        } catch (IOException ex) {
            Log.e(f3974s, "exportJsonToDir failed: " + ex.getMessage());
            return null;
        }
    }

    // SD-via-SAF JSON export. Caller obtained `uri` via ACTION_CREATE_DOCUMENT, so
    // the system already created the document at the user's chosen location and
    // we only need to write bytes through the content resolver. Returns the URI
    // string on success (used in the toast so the user can see where it landed).
    static String exportJsonToUri(Context ctx, Uri uri) {
        if (uri == null) return null;
        String json = new Gson().toJson(OutlineFragment.m4892a(f3938a.mo4786x()));
        try (OutputStream os = ctx.getContentResolver().openOutputStream(uri, "wt")) {
            if (os == null) return null;
            os.write(json.getBytes("UTF-8"));
            return uri.toString();
        } catch (IOException ex) {
            Log.e(f3974s, "exportJsonToUri failed: " + ex.getMessage());
            return null;
        }
    }

    // SD-via-SAF TXT export. Caller obtained `treeUri` via ACTION_OPEN_DOCUMENT_TREE.
    // For each open sublist, find any existing child with the same display name and
    // delete it (so the user's repeated exports overwrite rather than producing
    // "name (1).txt", "name (2).txt" copies — matching the deterministic behaviour
    // of exportTxtToDir), then createDocument + stream the rows out. Returns the
    // tree's display name on success or null on any failure.
    static String exportTxtToTreeUri(Context ctx, Uri treeUri) {
        if (treeUri == null) return null;
        android.content.ContentResolver cr = ctx.getContentResolver();
        try {
            Uri parentDocUri = android.provider.DocumentsContract.buildDocumentUriUsingTree(
                    treeUri, android.provider.DocumentsContract.getTreeDocumentId(treeUri));
            for (OutlineFragment frag : f3938a.mo4786x()) {
                String name = frag.getTag();
                if (name == null || name.isEmpty()) name = "Imported";
                String filename = sanitizeFileName(name) + ".txt";
                deleteTreeChildByName(cr, treeUri, parentDocUri, filename);
                Uri docUri = android.provider.DocumentsContract.createDocument(
                        cr, parentDocUri, "text/plain", filename);
                if (docUri == null) {
                    Log.e(f3974s, "exportTxtToTreeUri: createDocument returned null for " + filename);
                    return null;
                }
                ArrayList<OutlineRowView> rows = frag.mo4849af().f3987b;
                try (OutputStream os = cr.openOutputStream(docUri, "wt");
                        OutputStreamWriter writer = new OutputStreamWriter(os)) {
                    for (OutlineRowView rv : rows) {
                        StringBuilder indent = new StringBuilder();
                        for (int i = 0; i < rv.m4859a(); i++) indent.append(' ');
                        writer.append("\n").append(indent)
                                .append(rv.f3823f ? "x-" : " -")
                                .append(rv.f3822e.getText().toString().replaceAll("\n", " "));
                    }
                }
            }
            return queryTreeDisplayName(cr, parentDocUri, treeUri.toString());
        } catch (Exception ex) {
            Log.e(f3974s, "exportTxtToTreeUri failed: " + ex.getMessage(), ex);
            return null;
        }
    }

    private static void deleteTreeChildByName(android.content.ContentResolver cr,
            Uri treeUri, Uri parentDocUri, String displayName) {
        Uri childrenUri = android.provider.DocumentsContract.buildChildDocumentsUriUsingTree(
                treeUri, android.provider.DocumentsContract.getDocumentId(parentDocUri));
        String[] proj = {
                android.provider.DocumentsContract.Document.COLUMN_DOCUMENT_ID,
                android.provider.DocumentsContract.Document.COLUMN_DISPLAY_NAME };
        try (android.database.Cursor c = cr.query(childrenUri, proj, null, null, null)) {
            if (c == null) return;
            while (c.moveToNext()) {
                if (displayName.equals(c.getString(1))) {
                    Uri victim = android.provider.DocumentsContract.buildDocumentUriUsingTree(
                            treeUri, c.getString(0));
                    try {
                        android.provider.DocumentsContract.deleteDocument(cr, victim);
                    } catch (Exception ignore) { }
                }
            }
        }
    }

    private static String queryTreeDisplayName(android.content.ContentResolver cr,
            Uri parentDocUri, String fallback) {
        try (android.database.Cursor c = cr.query(parentDocUri,
                new String[] { android.provider.DocumentsContract.Document.COLUMN_DISPLAY_NAME },
                null, null, null)) {
            if (c != null && c.moveToFirst()) {
                String name = c.getString(0);
                if (name != null && !name.isEmpty()) return name;
            }
        } catch (Exception ignore) { }
        return fallback;
    }

    // Strip filename-unfriendly characters so the user's sublist name maps to a
    // legal cross-FS filename. Keeps unicode letters/digits, replaces the rest with '_'.
    private static String sanitizeFileName(String name) {
        StringBuilder sb = new StringBuilder(name.length());
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if (c == '/' || c == '\\' || c == ':' || c == '*' || c == '?'
                    || c == '"' || c == '<' || c == '>' || c == '|'
                    || c == '\n' || c == '\r' || c == '\t') {
                sb.append('_');
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    static void m4968s() {
        Toast.makeText(f3938a.mo4775m(), R.string.toast_enable_storage_permission,
                Toast.LENGTH_SHORT).show();
        f3938a.mo4773c(1);
    }

    static boolean m4969t() {
        boolean mounted = "mounted".equals(Environment.getExternalStorageState());
        if (!mounted) {
            Toast.makeText(f3938a.mo4775m(), R.string.settings_sd_not_available,
                    Toast.LENGTH_SHORT).show();
            m4968s();
        }
        return mounted;
    }

    static File m4970u() {
        // Phase 6.4: use app-scoped external dir (no WRITE_EXTERNAL_STORAGE permission needed).
        File dir = f3938a.mo4775m().getExternalFilesDir(null);
        if (dir == null) {
            Log.e(f3974s, "getExternalFilesDir returned null; falling back to filesDir");
            dir = new ContextWrapper(f3938a.mo4775m()).getFilesDir();
        }
        return dir;
    }

    // Phase 3.1: removed m4971v, m4972w, m4975z (cloud profile/connect-time writes).

    boolean m4976a(boolean backup, boolean external) {
        String json = new Gson().toJson(OutlineFragment.m4892a(f3938a.mo4786x()));
        try {
            File file = m4964c(backup, external);
            FileOutputStream fos = new FileOutputStream(file, false);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(json);
            oos.close();
            fos.close();
            if (backup) {
                if (external) {
                    Toast.makeText(f3938a.mo4775m(),
                            f3938a.mo4775m().getString(R.string.toast_external_backup_saved,
                                    file.getAbsolutePath()), Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(f3938a.mo4775m(), R.string.toast_internal_backup_saved,
                            Toast.LENGTH_SHORT).show();
                }
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            if (backup) {
                if (external) {
                    m4968s();
                } else {
                    Toast.makeText(f3938a.mo4775m(), R.string.toast_backup_fail,
                            Toast.LENGTH_SHORT).show();
                }
            }
            return false;
        }
    }

    HashMap<String, ArrayList<OutlineRow>> m4977b(boolean backup, boolean external) {
        HashMap<String, ArrayList<OutlineRow>> map;
        HashMap<String, ArrayList<OutlineRow>> map2 = new HashMap<>();
        try {
            File file = m4964c(backup, external);
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            String str = (String) ois.readObject();
            ois.close();
            fis.close();
            map = new Gson().fromJson(str,
                    new TypeToken<HashMap<String, ArrayList<OutlineRow>>>() {}.getType());
            if (backup) {
                try {
                    if (external) {
                        Toast.makeText(f3938a.mo4775m(),
                                f3938a.mo4775m().getString(R.string.toast_external_backup_loaded,
                                        file.getAbsolutePath()), Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(f3938a.mo4775m(), R.string.toast_done,
                                Toast.LENGTH_SHORT).show();
                    }
                    saveAllToRepo();
                } catch (Exception e) {
                    if (backup) {
                        if (external) {
                            m4968s();
                        } else {
                            Toast.makeText(f3938a.mo4775m(), R.string.toast_backup_none,
                                    Toast.LENGTH_SHORT).show();
                        }
                        return null;
                    }
                }
            }
        } catch (Exception e2) {
            map = map2;
        }
        // Phase 9.2a: removed legacy ObjectInputStream "backupFile" / "jsonListEntries" /
        // "backup.sub" fallback (pre-2018 single-list format). The autosave read path no
        // longer goes through this method at all — it uses loadAllFromRepo. Manual restore
        // (backup=true) returns whatever the Gson HashMap decode produced, or null on miss.
        if (map != null && !map.isEmpty()) {
            return map;
        }
        return null;
    }
}
