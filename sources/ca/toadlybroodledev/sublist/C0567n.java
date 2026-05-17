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
import ca.toadlybroodledev.sublist.p032c.C0555b;
import ca.toadlybroodledev.sublist.p032c.C0556c;
import com.google.firebase.auth.AbstractC2198l;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.C2225a;
import com.google.firebase.database.C2226b;
import com.google.firebase.database.C2266d;
import com.google.firebase.database.C2268f;
import com.google.firebase.database.C2269g;
import com.google.firebase.database.InterfaceC2276n;
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

    /* JADX INFO: renamed from: p */
    static FirebaseAuth f3972p;

    /* JADX INFO: renamed from: r */
    static C2266d f3973r;

    /* JADX INFO: renamed from: s */
    private static final String f3974s = "fuckn" + C0567n.class.getSimpleName();

    /* JADX INFO: renamed from: q */
    FirebaseAuth.InterfaceC2155a f3975q;

    C0567n(InterfaceC0549a interfaceC0549a) {
        super(interfaceC0549a);
        f3972p = FirebaseAuth.getInstance();
        this.f3975q = new FirebaseAuth.InterfaceC2155a() { // from class: ca.toadlybroodledev.sublist.n.1
            @Override // com.google.firebase.auth.FirebaseAuth.InterfaceC2155a
            /* JADX INFO: renamed from: a */
            public void mo4978a(FirebaseAuth firebaseAuth) {
                AbstractC2198l abstractC2198lM12838a = firebaseAuth.m12838a();
                if (abstractC2198lM12838a != null) {
                    Log.d(C0567n.f3974s, "onAuthStateChanged:signed_in:" + abstractC2198lM12838a.mo12866a());
                    C0567n.m4975z();
                } else {
                    Log.d(C0567n.f3974s, "onAuthStateChanged:signed_out");
                    C0566m.f3938a.mo4762a((C0556c) null);
                }
                try {
                    C0566m.f3938a.mo4777o().mo4868af();
                } catch (Exception e) {
                    e.getMessage();
                }
            }
        };
        f3973r = C2268f.m13000a().m13004b();
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

    /* JADX INFO: renamed from: b */
    static void m4963b(ArrayList<String> arrayList) {
        AbstractC2198l abstractC2198lM12838a = FirebaseAuth.getInstance().m12838a();
        if (abstractC2198lM12838a == null || arrayList.isEmpty()) {
            return;
        }
        f3973r.m12996a("invites").m12995a().m12994a(new C0555b(C0572s.m5014c(), abstractC2198lM12838a.mo12866a(), arrayList));
    }

    /* JADX INFO: renamed from: c */
    private static File m4964c(boolean z, boolean z2) {
        ContextWrapper contextWrapper = new ContextWrapper(f3938a.mo4775m());
        String str = z ? "sublist_collection_backup" : "sublist_collection";
        return z2 ? new File(m4970u(), str) : new File(contextWrapper.getFilesDir(), str);
    }

    /* JADX INFO: renamed from: p */
    static void m4965p() {
        final AbstractC2198l abstractC2198lM12838a = f3972p.m12838a();
        if (abstractC2198lM12838a != null) {
            f3973r.m13010a(new InterfaceC2276n() { // from class: ca.toadlybroodledev.sublist.n.3
                @Override // com.google.firebase.database.InterfaceC2276n
                /* JADX INFO: renamed from: a */
                public void mo4958a(C2225a c2225a) {
                    HashMap<String, ArrayList<C0554a>> map;
                    C2269g<HashMap<String, ArrayList<C0554a>>> c2269g = new C2269g<HashMap<String, ArrayList<C0554a>>>() { // from class: ca.toadlybroodledev.sublist.n.3.1
                    };
                    HashMap<String, ArrayList<C0554a>> map2 = new HashMap<>();
                    try {
                        map = (HashMap) c2225a.m12957a("sublist_collections").m12957a(abstractC2198lM12838a.mo12866a()).m12959a(c2269g);
                    } catch (Exception e) {
                        Log.d(C0567n.f3974s, e.getMessage());
                        map = map2;
                    }
                    if (map == null || map.isEmpty()) {
                        new C2269g<HashMap<String, ArrayList<C0554a>>>() { // from class: ca.toadlybroodledev.sublist.n.3.2
                        };
                        ArrayList<C0554a> arrayListM4949n = C0566m.m4949n();
                        if (arrayListM4949n == null) {
                            Toast.makeText(C0566m.f3938a.mo4775m(), R.string.toast_no_sublist_in_database, 0).show();
                            AppMain.m4792a("DatabasePull_fail", "db_pull_fail");
                            return;
                        } else {
                            map = new HashMap<>();
                            map.put(C0566m.f3938a.mo4770b(Integer.valueOf(R.string.app_name)), arrayListM4949n);
                        }
                    }
                    C0567n.m4971v();
                    C0566m.f3938a.mo4769a(map);
                    Toast.makeText(C0566m.f3938a.mo4775m(), R.string.toast_pull_sublist_success, 0).show();
                    AppMain.m4792a("DatabasePull_success", "db_pull_succ");
                }

                @Override // com.google.firebase.database.InterfaceC2276n
                /* JADX INFO: renamed from: a */
                public void mo4959a(C2226b c2226b) {
                    Toast.makeText(C0566m.f3938a.mo4775m(), R.string.toast_pull_sublist_fail, 0).show();
                }
            });
        }
    }

    /* JADX INFO: renamed from: q */
    static void m4966q() {
        AbstractC2198l abstractC2198lM12838a = FirebaseAuth.getInstance().m12838a();
        if (ViewOnClickListenerC0558e.m4863b() == null || abstractC2198lM12838a == null) {
            return;
        }
        try {
            HashMap<String, ArrayList<C0554a>> mapM4892a = C0563j.m4892a(f3938a.mo4786x());
            f3973r.m12996a("sublist_collections").m12996a(abstractC2198lM12838a.mo12866a()).m12997b();
            f3973r.m12996a("sublist_collections").m12996a(abstractC2198lM12838a.mo12866a()).m12994a(mapM4892a);
            f3938a.mo4776n().m4866ad();
            m4971v();
            Toast.makeText(f3938a.mo4775m(), R.string.toast_done, 0).show();
            AppMain.m4792a("DatabasePush_success", "db_push_succ");
        } catch (Exception e) {
            Log.e(f3974s, e.getMessage());
            Toast.makeText(f3938a.mo4775m(), R.string.toast_push_sublist_fail, 0).show();
            AppMain.m4792a("DatabasePush_fail", "db_push_fail");
        }
    }

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
                    AppMain.m4792a("ExportTxt_true", "export_txt_succ");
                } catch (IOException e) {
                    e.getMessage();
                    m4968s();
                    AppMain.m4792a("ExportTxt_false", "export_txt_fail");
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
            AppMain.m4792a("ExternStorgWritbl_false", "ext_storg_writ_fail");
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

    /* JADX INFO: renamed from: v */
    static void m4971v() {
        C0556c c0556cM4863b = ViewOnClickListenerC0558e.m4863b();
        if (c0556cM4863b != null) {
            c0556cM4863b.lastConnectTime = C0572s.m5014c();
        }
        AbstractC2198l abstractC2198lM12838a = FirebaseAuth.getInstance().m12838a();
        if (abstractC2198lM12838a != null) {
            f3973r.m12996a("users").m12996a(abstractC2198lM12838a.mo12866a()).m12996a("lastConnectTime").m12994a(Long.valueOf(C0572s.m5014c()));
        }
    }

    /* JADX INFO: renamed from: w */
    static void m4972w() {
        AbstractC2198l abstractC2198lM12838a = FirebaseAuth.getInstance().m12838a();
        C0556c c0556cM4863b = ViewOnClickListenerC0558e.m4863b();
        if (c0556cM4863b == null || abstractC2198lM12838a == null) {
            return;
        }
        c0556cM4863b.lastConnectTime = C0572s.m5014c();
        f3973r.m12996a("users").m12996a(abstractC2198lM12838a.mo12866a()).m12994a(c0556cM4863b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static void m4975z() {
        final AbstractC2198l abstractC2198lM12838a = FirebaseAuth.getInstance().m12838a();
        if (abstractC2198lM12838a != null) {
            f3973r.m13010a(new InterfaceC2276n() { // from class: ca.toadlybroodledev.sublist.n.4
                @Override // com.google.firebase.database.InterfaceC2276n
                /* JADX INFO: renamed from: a */
                public void mo4958a(C2225a c2225a) {
                    C0556c c0556c = (C0556c) c2225a.m12957a("users").m12957a(abstractC2198lM12838a.mo12866a()).m12960a(C0556c.class);
                    if (c0556c == null) {
                        long jM5014c = C0572s.m5014c();
                        C0566m.f3938a.mo4776n().m4864a(new C0556c(abstractC2198lM12838a.mo12873e(), abstractC2198lM12838a.mo12874f(), 0, 0, 0, C0572s.m5007a(), jM5014c, jM5014c, C0566m.f3943f ? C0572s.m5006a(30) : 0));
                        C0567n.m4972w();
                        return;
                    }
                    long jM5014c2 = C0572s.m5014c();
                    if (c0556c.initInstallTime <= 0) {
                        c0556c.initInstallTime = C0572s.m5007a();
                    }
                    if (c0556c.firstConnectTime == 0) {
                        c0556c.firstConnectTime = jM5014c2;
                    }
                    int iM5013c = c0556c.trialHoursRemaining - C0572s.m5013c(jM5014c2 - c0556c.lastConnectTime);
                    c0556c.trialHoursRemaining = iM5013c >= 0 ? iM5013c : 0;
                    C0566m.f3938a.mo4776n().m4864a(c0556c);
                    C0567n.m4972w();
                }

                @Override // com.google.firebase.database.InterfaceC2276n
                /* JADX INFO: renamed from: a */
                public void mo4959a(C2226b c2226b) {
                    Toast.makeText(C0566m.f3938a.mo4775m(), R.string.toast_error_fetching_user, 1).show();
                    Log.w(C0567n.f3974s, "Failed to read value.", c2226b.m12968b());
                    C0566m.f3938a.mo4776n().m4864a((C0556c) null);
                }
            });
        }
    }

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
                    AppMain.m4792a("BackupExternSave_true", "backup_ext_save_succ");
                } else {
                    Toast.makeText(f3938a.mo4775m(), R.string.toast_internal_backup_saved, 0).show();
                    AppMain.m4792a("BackupInternSave_true", "backup_int_save_succ");
                }
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            if (z) {
                if (z2) {
                    m4968s();
                    AppMain.m4792a("BackupExternLoad_false", "backup_ext_save_fail");
                } else {
                    Toast.makeText(f3938a.mo4775m(), R.string.toast_backup_fail, 0).show();
                    AppMain.m4792a("BackupInternSave_false", "backup_int_save_fail");
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
                        AppMain.m4792a("BackupExternSave_true", "backup_ext_save_succ");
                    } else {
                        Toast.makeText(f3938a.mo4775m(), R.string.toast_done, 0).show();
                        AppMain.m4792a("BackupInternLoad_true", "backup_int_load_succ");
                    }
                    m4976a(false, false);
                } catch (Exception e) {
                    if (z) {
                        if (z2) {
                            m4968s();
                            AppMain.m4792a("BackupExternLoad_false", "backup_ext_save_fail");
                        } else {
                            Toast.makeText(f3938a.mo4775m(), R.string.toast_backup_none, 0).show();
                            AppMain.m4792a("BackupInternLoad_false", "backup_int_load_fail");
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
