package ca.toadlybroodledev.sublist;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import ca.toadlybroodledev.sublist.iface.HostContract;
import ca.toadlybroodledev.sublist.model.OutlineRow;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;

// Ported from decompiled C0567n. Extends AppSettings; provides local backup/export helpers.
// Cloud fields (FirebaseAuth, RTDB reference, AuthStateListener) removed in Phase 3.1/3.3.
// Methods m4963b, m4965p, m4966q, m4971v, m4972w, m4975z removed in Phase 3.1–3.3.
public class OutlineStore extends AppSettings {

    private static final String f3974s = "fuckn" + OutlineStore.class.getSimpleName();

    OutlineStore(HostContract host) {
        super(host);
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
        if (m4969t()) {
            for (SublistFragment frag : f3938a.mo4786x()) {
                ArrayList<OutlineRowView> rows = frag.mo4849af().f3987b;
                File file = new File(m4970u(),
                        frag.getTag() + DateTimeUtil.m5014c() + ".txt");
                try {
                    FileOutputStream fos = new FileOutputStream(file);
                    OutputStreamWriter writer = new OutputStreamWriter(fos);
                    for (OutlineRowView rv : rows) {
                        String indent = "";
                        for (int i = 0; i < rv.m4859a(); i++) {
                            indent = indent + " ";
                        }
                        writer.append("\n" + indent + (rv.f3823f ? "x-" : " -")
                                + rv.f3822e.getText().toString().replaceAll("\n", " "));
                    }
                    writer.close();
                    fos.close();
                    Toast.makeText(f3938a.mo4775m(),
                            f3938a.mo4775m().getString(R.string.toast_external_backup_saved,
                                    file.getAbsolutePath()), Toast.LENGTH_LONG).show();
                } catch (IOException ex) {
                    ex.getMessage();
                    m4968s();
                    return;
                }
            }
        }
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
        String json = new Gson().toJson(SublistFragment.m4892a(f3938a.mo4786x()));
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
                    m4976a(false, false);
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
        String appName = f3938a.mo4770b(Integer.valueOf(R.string.app_name));
        if (map != null && !map.isEmpty()) {
            return map;
        }
        HashMap<String, ArrayList<OutlineRow>> fallback = new HashMap<>();
        ArrayList<OutlineRow> rows = backup ? (external ? m4937d(true) : m4948m())
                : (external ? m4948m() : m4937d(false));
        if (rows == null || rows.isEmpty()) {
            return null;
        }
        fallback.put(appName, rows);
        if (!backup) {
            return fallback;
        }
        Toast.makeText(f3938a.mo4775m(),
                f3938a.mo4770b(Integer.valueOf(R.string.toast_done)), Toast.LENGTH_SHORT).show();
        return fallback;
    }
}
