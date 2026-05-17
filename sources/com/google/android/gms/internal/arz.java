package com.google.android.gms.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.ads.p046c.C0677a;
import com.google.android.gms.common.C1205d;
import com.google.android.gms.common.C1206e;
import com.google.android.gms.common.C1283m;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public class arz {

    /* JADX INFO: renamed from: b */
    private static final String f7177b = arz.class.getSimpleName();

    /* JADX INFO: renamed from: a */
    protected Context f7178a;

    /* JADX INFO: renamed from: c */
    private ExecutorService f7179c;

    /* JADX INFO: renamed from: d */
    private DexClassLoader f7180d;

    /* JADX INFO: renamed from: e */
    private afm f7181e;

    /* JADX INFO: renamed from: f */
    private byte[] f7182f;

    /* JADX INFO: renamed from: j */
    private boolean f7186j;

    /* JADX INFO: renamed from: m */
    private afe f7189m;

    /* JADX INFO: renamed from: p */
    private Map<Pair<String, String>, bno> f7192p;

    /* JADX INFO: renamed from: g */
    private volatile C0677a f7183g = null;

    /* JADX INFO: renamed from: h */
    private volatile boolean f7184h = false;

    /* JADX INFO: renamed from: i */
    private Future f7185i = null;

    /* JADX INFO: renamed from: k */
    private volatile C1937tl f7187k = null;

    /* JADX INFO: renamed from: l */
    private Future f7188l = null;

    /* JADX INFO: renamed from: n */
    private boolean f7190n = false;

    /* JADX INFO: renamed from: o */
    private boolean f7191o = false;

    /* JADX INFO: renamed from: q */
    private boolean f7193q = false;

    /* JADX INFO: renamed from: r */
    private boolean f7194r = true;

    /* JADX INFO: renamed from: s */
    private boolean f7195s = false;

    /* JADX INFO: renamed from: com.google.android.gms.internal.arz$a */
    final class C1378a extends BroadcastReceiver {
        private C1378a() {
        }

        /* synthetic */ C1378a(arz arzVar, asb asbVar) {
            this();
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                arz.this.f7194r = true;
            } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                arz.this.f7194r = false;
            }
        }
    }

    private arz(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f7186j = applicationContext != null;
        this.f7178a = this.f7186j ? applicationContext : context;
        this.f7192p = new HashMap();
    }

    /* JADX INFO: renamed from: a */
    public static arz m8235a(Context context, String str, String str2, boolean z) throws Throwable {
        arz arzVar = new arz(context);
        try {
            arzVar.f7179c = Executors.newCachedThreadPool();
            arzVar.f7184h = z;
            if (z) {
                arzVar.f7185i = arzVar.f7179c.submit(new asb(arzVar));
            }
            arzVar.f7179c.execute(new asd(arzVar));
            try {
                C1283m c1283mM7222b = C1283m.m7222b();
                arzVar.f7190n = C1283m.m7225d(arzVar.f7178a) > 0;
                arzVar.f7191o = c1283mM7222b.mo7040a(arzVar.f7178a) == 0;
            } catch (Throwable th) {
            }
            arzVar.m8249a(0, true);
            if (atq.m8327b() && ((Boolean) bxm.m10409f().m10546a(can.f9532bz)).booleanValue()) {
                throw new IllegalStateException("Task Context initialization must not be called from the UI thread.");
            }
            arzVar.f7181e = new afm(null);
            try {
                arzVar.f7182f = arzVar.f7181e.m7816a(str);
                try {
                    try {
                        try {
                            File cacheDir = arzVar.f7178a.getCacheDir();
                            if (cacheDir == null && (cacheDir = arzVar.f7178a.getDir("dex", 0)) == null) {
                                throw new arw();
                            }
                            File file = cacheDir;
                            File file2 = new File(String.format("%s/%s.jar", file, "1505450608132"));
                            if (!file2.exists()) {
                                byte[] bArrM7817a = arzVar.f7181e.m7817a(arzVar.f7182f, str2);
                                file2.createNewFile();
                                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                fileOutputStream.write(bArrM7817a, 0, bArrM7817a.length);
                                fileOutputStream.close();
                            }
                            arzVar.m8244b(file, "1505450608132");
                            try {
                                arzVar.f7180d = new DexClassLoader(file2.getAbsolutePath(), file.getAbsolutePath(), null, arzVar.f7178a.getClassLoader());
                                m8238a(file2);
                                arzVar.m8239a(file, "1505450608132");
                                m8240a(String.format("%s/%s.dex", file, "1505450608132"));
                                if (((Boolean) bxm.m10409f().m10546a(can.f9524br)).booleanValue() && !arzVar.f7195s) {
                                    IntentFilter intentFilter = new IntentFilter();
                                    intentFilter.addAction("android.intent.action.USER_PRESENT");
                                    intentFilter.addAction("android.intent.action.SCREEN_OFF");
                                    arzVar.f7178a.registerReceiver(new C1378a(arzVar, null), intentFilter);
                                    arzVar.f7195s = true;
                                }
                                arzVar.f7189m = new afe(arzVar);
                                arzVar.f7193q = true;
                            } catch (Throwable th2) {
                                m8238a(file2);
                                arzVar.m8239a(file, "1505450608132");
                                m8240a(String.format("%s/%s.dex", file, "1505450608132"));
                                throw th2;
                            }
                        } catch (NullPointerException e) {
                            throw new arw(e);
                        }
                    } catch (agm e2) {
                        throw new arw(e2);
                    }
                } catch (FileNotFoundException e3) {
                    throw new arw(e3);
                } catch (IOException e4) {
                    throw new arw(e4);
                }
            } catch (agm e5) {
                throw new arw(e5);
            }
        } catch (arw e6) {
        }
        return arzVar;
    }

    /* JADX INFO: renamed from: a */
    private static void m8238a(File file) {
        if (file.exists()) {
            file.delete();
        } else {
            Log.d(f7177b, String.format("File %s not found. No need for deletion", file.getAbsolutePath()));
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m8239a(File file, String str) throws Throwable {
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        fileOutputStream2 = null;
        fileInputStream = null;
        fileInputStream = null;
        FileInputStream fileInputStream2 = null;
        File file2 = new File(String.format("%s/%s.tmp", file, str));
        if (file2.exists()) {
            return;
        }
        File file3 = new File(String.format("%s/%s.dex", file, str));
        if (file3.exists()) {
            long length = file3.length();
            if (length > 0) {
                byte[] bArr = new byte[(int) length];
                try {
                    fileInputStream = new FileInputStream(file3);
                    try {
                        if (fileInputStream.read(bArr) <= 0) {
                            try {
                                fileInputStream.close();
                            } catch (IOException e) {
                            }
                            m8238a(file3);
                            return;
                        }
                        C1994vo c1994vo = new C1994vo();
                        c1994vo.f11822d = Build.VERSION.SDK.getBytes();
                        c1994vo.f11821c = str.getBytes();
                        byte[] bytes = this.f7181e.m7815a(this.f7182f, bArr).getBytes();
                        c1994vo.f11819a = bytes;
                        c1994vo.f11820b = C2044xk.m12572a(bytes);
                        file2.createNewFile();
                        fileOutputStream = new FileOutputStream(file2);
                        try {
                            byte[] bArrM10164a = bsc.m10164a(c1994vo);
                            fileOutputStream.write(bArrM10164a, 0, bArrM10164a.length);
                            fileOutputStream.close();
                            try {
                                fileInputStream.close();
                            } catch (IOException e2) {
                            }
                            try {
                                fileOutputStream.close();
                            } catch (IOException e3) {
                            }
                            m8238a(file3);
                            return;
                        } catch (agm e4) {
                            fileInputStream2 = fileInputStream;
                        } catch (IOException e5) {
                            fileInputStream2 = fileInputStream;
                        } catch (NoSuchAlgorithmException e6) {
                            fileInputStream2 = fileInputStream;
                        } catch (Throwable th) {
                            fileOutputStream2 = fileOutputStream;
                            th = th;
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (IOException e7) {
                                }
                            }
                            if (fileOutputStream2 != null) {
                                try {
                                    fileOutputStream2.close();
                                } catch (IOException e8) {
                                }
                            }
                            m8238a(file3);
                            throw th;
                        }
                    } catch (agm e9) {
                        fileOutputStream = null;
                        fileInputStream2 = fileInputStream;
                    } catch (IOException e10) {
                        fileOutputStream = null;
                        fileInputStream2 = fileInputStream;
                    } catch (NoSuchAlgorithmException e11) {
                        fileOutputStream = null;
                        fileInputStream2 = fileInputStream;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (agm e12) {
                    fileOutputStream = null;
                } catch (IOException e13) {
                    fileOutputStream = null;
                } catch (NoSuchAlgorithmException e14) {
                    fileOutputStream = null;
                } catch (Throwable th3) {
                    th = th3;
                    fileInputStream = null;
                }
                if (fileInputStream2 != null) {
                    try {
                        fileInputStream2.close();
                    } catch (IOException e15) {
                    }
                }
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException e16) {
                    }
                }
                m8238a(file3);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m8240a(String str) {
        m8238a(new File(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static boolean m8243b(int i, C1937tl c1937tl) {
        if (i < 4) {
            if (c1937tl == null) {
                return true;
            }
            if (((Boolean) bxm.m10409f().m10546a(can.f9483bC)).booleanValue() && (c1937tl.f11596n == null || c1937tl.f11596n.equals("0000000000000000000000000000000000000000000000000000000000000000"))) {
                return true;
            }
            if (((Boolean) bxm.m10409f().m10546a(can.f9484bD)).booleanValue() && (c1937tl.f11566W == null || c1937tl.f11566W.f11833a == null || c1937tl.f11566W.f11833a.longValue() == -2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ce A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00c9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean m8244b(File file, String str) throws Throwable {
        ?? fileInputStream;
        FileOutputStream fileOutputStream;
        ?? r1;
        boolean z;
        FileOutputStream fileOutputStream2 = null;
        IOException e = null;
        File file2 = new File(String.format("%s/%s.tmp", file, str));
        if (!file2.exists()) {
            return false;
        }
        Object[] objArr = {file, str};
        File file3 = new File(String.format("%s/%s.dex", objArr));
        if (file3.exists()) {
            return false;
        }
        try {
            long length = file2.length();
            if (length <= 0) {
                m8238a(file2);
                z = false;
                fileInputStream = objArr;
            } else {
                byte[] bArr = new byte[(int) length];
                fileInputStream = new FileInputStream(file2);
                try {
                    if (fileInputStream.read(bArr) <= 0) {
                        Log.d(f7177b, "Cannot read the cache data.");
                        m8238a(file2);
                        try {
                            fileInputStream.close();
                        } catch (IOException e2) {
                        }
                        z = false;
                        fileInputStream = fileInputStream;
                    } else {
                        C1994vo c1994vo = (C1994vo) bsc.m10162a(new C1994vo(), bArr);
                        if (str.equals(new String(c1994vo.f11821c)) && Arrays.equals(c1994vo.f11820b, C2044xk.m12572a(c1994vo.f11819a)) && Arrays.equals(c1994vo.f11822d, Build.VERSION.SDK.getBytes())) {
                            byte[] bArrM7817a = this.f7181e.m7817a(this.f7182f, new String(c1994vo.f11819a));
                            file3.createNewFile();
                            fileOutputStream = new FileOutputStream(file3);
                            fileOutputStream2 = null;
                            try {
                                fileOutputStream.write(bArrM7817a, 0, bArrM7817a.length);
                                try {
                                    fileInputStream.close();
                                } catch (IOException e3) {
                                    e = e3;
                                }
                                try {
                                    fileOutputStream.close();
                                } catch (IOException e4) {
                                }
                                z = true;
                                fileInputStream = fileInputStream;
                            } catch (agm e5) {
                                r1 = fileInputStream;
                                if (r1 != 0) {
                                    try {
                                        r1.close();
                                    } catch (IOException e6) {
                                    }
                                }
                                if (fileOutputStream != null) {
                                    try {
                                        fileOutputStream.close();
                                    } catch (IOException e7) {
                                    }
                                }
                                return e;
                            } catch (IOException e8) {
                                r1 = fileInputStream;
                                if (r1 != 0) {
                                }
                                if (fileOutputStream != null) {
                                }
                                return e;
                            } catch (NoSuchAlgorithmException e9) {
                                r1 = fileInputStream;
                                if (r1 != 0) {
                                }
                                if (fileOutputStream != null) {
                                }
                                return e;
                            } catch (Throwable th) {
                                fileOutputStream2 = fileOutputStream;
                                th = th;
                                if (fileInputStream != 0) {
                                    try {
                                        fileInputStream.close();
                                    } catch (IOException e10) {
                                    }
                                }
                                if (fileOutputStream2 == null) {
                                    throw th;
                                }
                                try {
                                    fileOutputStream2.close();
                                    throw th;
                                } catch (IOException e11) {
                                    throw th;
                                }
                            }
                        } else {
                            m8238a(file2);
                            try {
                                fileInputStream.close();
                            } catch (IOException e12) {
                            }
                            z = false;
                            fileInputStream = fileInputStream;
                        }
                    }
                } catch (agm e13) {
                    fileOutputStream = fileOutputStream2;
                    r1 = fileInputStream;
                } catch (IOException e14) {
                    fileOutputStream = fileOutputStream2;
                    r1 = fileInputStream;
                } catch (NoSuchAlgorithmException e15) {
                    fileOutputStream = fileOutputStream2;
                    r1 = fileInputStream;
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            return z;
        } catch (agm e16) {
            fileOutputStream = fileOutputStream2;
            r1 = fileOutputStream2;
        } catch (IOException e17) {
            fileOutputStream = fileOutputStream2;
            r1 = fileOutputStream2;
        } catch (NoSuchAlgorithmException e18) {
            fileOutputStream = fileOutputStream2;
            r1 = fileOutputStream2;
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = fileOutputStream2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final void m8245o() {
        try {
            if (this.f7183g == null && this.f7186j) {
                C0677a c0677a = new C0677a(this.f7178a);
                c0677a.m5404a();
                this.f7183g = c0677a;
            }
        } catch (C1205d | C1206e | IOException e) {
            this.f7183g = null;
        }
    }

    /* JADX INFO: renamed from: p */
    private final C1937tl m8246p() {
        try {
            return C2065ye.m12597a(this.f7178a, this.f7178a.getPackageName(), Integer.toString(this.f7178a.getPackageManager().getPackageInfo(this.f7178a.getPackageName(), 0).versionCode));
        } catch (Throwable th) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final Context m8247a() {
        return this.f7178a;
    }

    /* JADX INFO: renamed from: a */
    public final Method m8248a(String str, String str2) {
        bno bnoVar = this.f7192p.get(new Pair(str, str2));
        if (bnoVar == null) {
            return null;
        }
        return bnoVar.m9729a();
    }

    /* JADX INFO: renamed from: a */
    final void m8249a(int i, boolean z) {
        if (this.f7191o) {
            Future<?> futureSubmit = this.f7179c.submit(new asc(this, i, z));
            if (i == 0) {
                this.f7188l = futureSubmit;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m8250a(String str, String str2, Class<?>... clsArr) {
        if (this.f7192p.containsKey(new Pair(str, str2))) {
            return false;
        }
        this.f7192p.put(new Pair<>(str, str2), new bno(this, str, str2, clsArr));
        return true;
    }

    /* JADX INFO: renamed from: b */
    final C1937tl m8251b(int i, boolean z) {
        if (i > 0 && z) {
            try {
                Thread.sleep(i * 1000);
            } catch (InterruptedException e) {
            }
        }
        return m8246p();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m8252b() {
        return this.f7193q;
    }

    /* JADX INFO: renamed from: c */
    public final ExecutorService m8253c() {
        return this.f7179c;
    }

    /* JADX INFO: renamed from: d */
    public final DexClassLoader m8254d() {
        return this.f7180d;
    }

    /* JADX INFO: renamed from: e */
    public final afm m8255e() {
        return this.f7181e;
    }

    /* JADX INFO: renamed from: f */
    public final byte[] m8256f() {
        return this.f7182f;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m8257g() {
        return this.f7190n;
    }

    /* JADX INFO: renamed from: h */
    public final afe m8258h() {
        return this.f7189m;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m8259i() {
        return this.f7191o;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m8260j() {
        return this.f7194r;
    }

    /* JADX INFO: renamed from: k */
    public final C1937tl m8261k() {
        return this.f7187k;
    }

    /* JADX INFO: renamed from: l */
    public final Future m8262l() {
        return this.f7188l;
    }

    /* JADX INFO: renamed from: m */
    public final C0677a m8263m() {
        if (!this.f7184h) {
            return null;
        }
        if (this.f7183g != null) {
            return this.f7183g;
        }
        if (this.f7185i != null) {
            try {
                this.f7185i.get(2000L, TimeUnit.MILLISECONDS);
                this.f7185i = null;
            } catch (InterruptedException e) {
            } catch (ExecutionException e2) {
            } catch (TimeoutException e3) {
                this.f7185i.cancel(true);
            }
        }
        return this.f7183g;
    }

    /* JADX INFO: renamed from: n */
    public final int m8264n() {
        if (this.f7189m != null) {
            return afe.m7790a();
        }
        return Integer.MIN_VALUE;
    }
}
