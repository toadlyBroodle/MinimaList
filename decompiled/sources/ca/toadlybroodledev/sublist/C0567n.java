package ca.toadlybroodledev.sublist;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import ca.toadlybroodledev.sublist.p031b.InterfaceC0549a;
import ca.toadlybroodledev.sublist.p032c.C0554a;
// Phase 3.3: removed import ca.toadlybroodledev.sublist.p032c.C0555b (App-Invites tracker; class deleted)
// Phase 3.3: removed import ca.toadlybroodledev.sublist.p032c.C0556c (cloud user profile; sole live use was here)
// Phase 3.3: removed com.google.firebase.auth.{AbstractC2198l, FirebaseAuth}
// Phase 3.1: removed com.google.firebase.database.{C2225a,C2226b,C2266d,C2268f,C2269g,InterfaceC2276n}
//            (DataSnapshot, DatabaseError, DatabaseReference, FirebaseDatabase, GenericTypeIndicator, ValueEventListener)
import com.google.p036a.C0614e;
import com.google.p036a.p041c.C0608a;
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

/* JADX INFO: renamed from: ca.toadlybroodledev.sublist.n */
/* JADX INFO: loaded from: classes.dex */
public class C0567n extends C0566m {

    // Phase 3.3: removed `static FirebaseAuth f3972p` — singleton auth handle.
    // Phase 3.1: removed `static C2266d f3973r` — Firebase Realtime Database root reference.

    /* JADX INFO: renamed from: s */
    private static final String f3974s = "fuckn" + C0567n.class.getSimpleName();

    // Phase 3.3: removed `FirebaseAuth.InterfaceC2155a f3975q` — AuthStateListener that
    //   dispatched on sign-in (calling m4975z to materialize cloud profile, since
    //   removed in 3.1) and on sign-out (nulling local profile cache). Local-only app
    //   has no auth state to listen on.

    C0567n(InterfaceC0549a interfaceC0549a) {
        super(interfaceC0549a);
        // Phase 3.3: removed `f3972p = FirebaseAuth.getInstance()`
        // Phase 3.3: removed `f3975q = new FirebaseAuth.InterfaceC2155a(...)` AuthStateListener
        //   inner-class instantiation; the listener body lived here too.
        // Phase 3.1: removed `f3973r = C2268f.m13000a().m13004b()` — FirebaseDatabase.getInstance().getReference()
    }

    /* JADX INFO: renamed from: a */
    static Bitmap m4961a(Context context) {
        try {
            return BitmapFactory.decodeStream(new FileInputStream(new File(new ContextWrapper(context).getDir("widget_ss", 0), "widgetScreenShot.jpg")));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    static void m4962a(View view) throws Throwable {
        Exception e;
        Bitmap bitmapDecodeResource;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        Context contextMo4775m = f3938a.mo4775m();
        try {
            if (C0564k.m4911a()) {
                view.setDrawingCacheEnabled(true);
                bitmapDecodeResource = Bitmap.createBitmap(view.getDrawingCache());
                try {
                    view.setDrawingCacheEnabled(false);
                } catch (Exception e2) {
                    e = e2;
                    e.printStackTrace();
                }
            } else {
                bitmapDecodeResource = BitmapFactory.decodeResource(contextMo4775m.getResources(), R.drawable.widget_preview);
            }
        } catch (Exception e3) {
            e = e3;
            bitmapDecodeResource = null;
        }
        try {
            try {
                fileOutputStream = new FileOutputStream(new File(new ContextWrapper(f3938a.mo4775m()).getDir("widget_ss", 0), "widgetScreenShot.jpg"));
            } catch (Exception e4) {
                e = e4;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            bitmapDecodeResource.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            try {
                fileOutputStream.close();
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        } catch (Exception e6) {
            e = e6;
            fileOutputStream2 = fileOutputStream;
            e.printStackTrace();
            try {
                fileOutputStream2.close();
            } catch (Exception e7) {
                e7.printStackTrace();
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            try {
                fileOutputStream2.close();
            } catch (Exception e8) {
                e8.printStackTrace();
            }
            throw th;
        }
    }

    // Phase 3.3: removed static void m4963b(ArrayList<String> inviteIds)
    //   Wrote a new node under `invites/` in RTDB carrying the current user's id, the
    //   timestamp, and the list of invitee ids. Sole part of the App-Invites tracking
    //   loop; counterparts in ActMain (send + receive paths) also removed in this phase.

    /* JADX INFO: renamed from: c */
    private static File m4964c(boolean z, boolean z2) {
        ContextWrapper contextWrapper = new ContextWrapper(f3938a.mo4775m());
        String str = z ? "sublist_collection_backup" : "sublist_collection";
        return z2 ? new File(m4970u(), str) : new File(contextWrapper.getFilesDir(), str);
    }

    // Phase 3.1: removed static void m4965p() — cloud pull of sublist_collections/<uid>
    //   via ValueEventListener; would fall back to legacy m4949n() pull if doc missing.
    //   With local-only persistence (Phase 9 = Room), pull has no remote source.

    // Phase 3.1: removed static void m4966q() — cloud push of current outline state to
    //   sublist_collections/<uid>; gated on authenticated user + non-null profile.
    //   Local-only app has no remote destination.

    /* JADX INFO: renamed from: r */
    static void m4967r() {
        if (m4969t()) {
            for (C0563j c0563j : f3938a.mo4786x()) {
                ArrayList<C0557d> arrayList = c0563j.mo4849af().f3987b;
                File file = new File(m4970u(), c0563j.m961h() + C0572s.m5014c() + ".txt");
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
                    for (C0557d c0557d : arrayList) {
                        String str = "";
                        for (int i = 0; i < c0557d.m4859a(); i++) {
                            str = str + " ";
                        }
                        outputStreamWriter.append((CharSequence) ("\n" + str + (c0557d.f3823f ? "x-" : " -") + c0557d.f3822e.getText().toString().replaceAll("\n", " ")));
                    }
                    outputStreamWriter.close();
                    fileOutputStream.close();
                    Toast.makeText(f3938a.mo4775m(), f3938a.mo4775m().getString(R.string.toast_external_backup_saved, file.getAbsolutePath()), 1).show();
                } catch (IOException e) {
                    e.getMessage();
                    m4968s();
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: s */
    static void m4968s() {
        Toast.makeText(f3938a.mo4775m(), R.string.toast_enable_storage_permission, 0).show();
        f3938a.mo4773c(1);
    }

    /* JADX INFO: renamed from: t */
    static boolean m4969t() {
        boolean zEquals = "mounted".equals(Environment.getExternalStorageState());
        if (!zEquals) {
            Toast.makeText(f3938a.mo4775m(), R.string.settings_sd_not_available, 0).show();
            m4968s();
        }
        return zEquals;
    }

    /* JADX INFO: renamed from: u */
    static File m4970u() {
        String absolutePath = Environment.getExternalStoragePublicDirectory(f3938a.mo4775m().getString(R.string.app_name)).getAbsolutePath();
        File file = new File(absolutePath);
        if (!file.mkdir()) {
            Log.e(f3974s, "Directory not create at " + absolutePath);
        }
        return file;
    }

    // Phase 3.1: removed static void m4971v() — wrote `users/<uid>/lastConnectTime` on
    //   every cloud touch, also updated in-memory profile. With cloud gone, lastConnect
    //   has no remote sink; if Phase 8 still wants the local cache update, reintroduce
    //   the first 3 lines (in-memory bump only) at the relevant call site.

    // Phase 3.1: removed static void m4972w() — wrote full profile doc to `users/<uid>`.

    // Phase 3.1: removed public static void m4975z() — read `users/<uid>` profile, created
    //   it if missing, decremented trial-hours timer based on lastConnect delta, repushed.
    //   The trial-hours / install-time / connect-time bookkeeping was server-anchored;
    //   a local-only rewrite either drops trial gating entirely (recommended — no cloud
    //   to gate against) or reimplements it against SharedPreferences in Phase 8.

    /* JADX INFO: renamed from: a */
    boolean m4976a(boolean z, boolean z2) {
        String strM5260a = new C0614e().m5260a(C0563j.m4892a(f3938a.mo4786x()));
        try {
            File fileM4964c = m4964c(z, z2);
            FileOutputStream fileOutputStream = new FileOutputStream(fileM4964c, false);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(strM5260a);
            objectOutputStream.close();
            fileOutputStream.close();
            if (z) {
                if (z2) {
                    Toast.makeText(f3938a.mo4775m(), f3938a.mo4775m().getString(R.string.toast_external_backup_saved, fileM4964c.getAbsolutePath()), 1).show();
                } else {
                    Toast.makeText(f3938a.mo4775m(), R.string.toast_internal_backup_saved, 0).show();
                }
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            if (z) {
                if (z2) {
                    m4968s();
                } else {
                    Toast.makeText(f3938a.mo4775m(), R.string.toast_backup_fail, 0).show();
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    HashMap<String, ArrayList<C0554a>> m4977b(boolean z, boolean z2) {
        HashMap<String, ArrayList<C0554a>> map;
        HashMap<String, ArrayList<C0554a>> map2 = new HashMap<>();
        try {
            File fileM4964c = m4964c(z, z2);
            FileInputStream fileInputStream = new FileInputStream(fileM4964c);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            String str = (String) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
            map = (HashMap) new C0614e().m5258a(str, new C0608a<HashMap<String, ArrayList<C0554a>>>() { // from class: ca.toadlybroodledev.sublist.n.2
            }.m5205b());
            if (z) {
                try {
                    if (z2) {
                        Toast.makeText(f3938a.mo4775m(), f3938a.mo4775m().getString(R.string.toast_external_backup_loaded, fileM4964c.getAbsolutePath()), 1).show();
                    } else {
                        Toast.makeText(f3938a.mo4775m(), R.string.toast_done, 0).show();
                    }
                    m4976a(false, false);
                } catch (Exception e) {
                    if (z) {
                        if (z2) {
                            m4968s();
                        } else {
                            Toast.makeText(f3938a.mo4775m(), R.string.toast_backup_none, 0).show();
                        }
                        return null;
                    }
                }
            }
        } catch (Exception e2) {
            map = map2;
        }
        String strMo4770b = f3938a.mo4770b(Integer.valueOf(R.string.app_name));
        if (map != null && !map.isEmpty()) {
            return map;
        }
        HashMap<String, ArrayList<C0554a>> map3 = new HashMap<>();
        ArrayList<C0554a> arrayListD = z ? z2 ? m4937d(true) : m4948m() : z2 ? m4948m() : m4937d(false);
        if (arrayListD == null || arrayListD.isEmpty()) {
            return null;
        }
        map3.put(strMo4770b, arrayListD);
        if (!z) {
            return map3;
        }
        Toast.makeText(f3938a.mo4775m(), f3938a.mo4770b(Integer.valueOf(R.string.toast_done)), 0).show();
        return map3;
    }
}
