package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.ads.p046c.C0677a;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;

/* JADX INFO: renamed from: com.google.android.gms.internal.pe */
/* JADX INFO: loaded from: classes.dex */
public final class C1822pe extends AbstractC1832po {

    /* JADX INFO: renamed from: a */
    private static boolean f11281a;

    /* JADX INFO: renamed from: b */
    private C0677a.a f11282b;

    /* JADX INFO: renamed from: c */
    private final C1895rx f11283c;

    /* JADX INFO: renamed from: d */
    private String f11284d;

    /* JADX INFO: renamed from: e */
    private boolean f11285e;

    /* JADX INFO: renamed from: f */
    private final Object f11286f;

    C1822pe(C1834pq c1834pq) {
        super(c1834pq);
        this.f11285e = false;
        this.f11286f = new Object();
        this.f11283c = new C1895rx(c1834pq.m12058c());
    }

    /* JADX INFO: renamed from: a */
    private static String m11996a(String str) {
        MessageDigest messageDigestM12294b = C1897rz.m12294b("MD5");
        if (messageDigestM12294b == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, messageDigestM12294b.digest(str.getBytes())));
    }

    /* JADX INFO: renamed from: a */
    private final boolean m11997a(C0677a.a aVar, C0677a.a aVar2) {
        String strM12155c;
        String strM5408a = aVar2 == null ? null : aVar2.m5408a();
        if (TextUtils.isEmpty(strM5408a)) {
            return true;
        }
        String strM12154b = m12047s().m12154b();
        synchronized (this.f11286f) {
            if (!this.f11285e) {
                this.f11284d = m12000f();
                this.f11285e = true;
            } else if (TextUtils.isEmpty(this.f11284d)) {
                String strM5408a2 = aVar != null ? aVar.m5408a() : null;
                if (strM5408a2 == null) {
                    String strValueOf = String.valueOf(strM5408a);
                    String strValueOf2 = String.valueOf(strM12154b);
                    return m12001g(strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf));
                }
                String strValueOf3 = String.valueOf(strM5408a2);
                String strValueOf4 = String.valueOf(strM12154b);
                this.f11284d = m11996a(strValueOf4.length() != 0 ? strValueOf3.concat(strValueOf4) : new String(strValueOf3));
            }
            String strValueOf5 = String.valueOf(strM5408a);
            String strValueOf6 = String.valueOf(strM12154b);
            String strM11996a = m11996a(strValueOf6.length() != 0 ? strValueOf5.concat(strValueOf6) : new String(strValueOf5));
            if (TextUtils.isEmpty(strM11996a)) {
                return false;
            }
            if (strM11996a.equals(this.f11284d)) {
                return true;
            }
            if (TextUtils.isEmpty(this.f11284d)) {
                strM12155c = strM12154b;
            } else {
                m12023b("Resetting the client id because Advertising Id changed.");
                strM12155c = m12047s().m12155c();
                m12020a("New client Id", strM12155c);
            }
            String strValueOf7 = String.valueOf(strM5408a);
            String strValueOf8 = String.valueOf(strM12155c);
            return m12001g(strValueOf8.length() != 0 ? strValueOf7.concat(strValueOf8) : new String(strValueOf7));
        }
    }

    /* JADX INFO: renamed from: d */
    private final synchronized C0677a.a m11998d() {
        if (this.f11283c.m12280a(1000L)) {
            this.f11283c.m12279a();
            C0677a.a aVarM11999e = m11999e();
            if (m11997a(this.f11282b, aVarM11999e)) {
                this.f11282b = aVarM11999e;
            } else {
                m12035f("Failed to reset client id on adid change. Not using adid");
                this.f11282b = new C0677a.a("", false);
            }
        }
        return this.f11282b;
    }

    /* JADX INFO: renamed from: e */
    private final C0677a.a m11999e() {
        try {
            return C0677a.m5396a(m12038j());
        } catch (IllegalStateException e) {
            m12033e("IllegalStateException getting Ad Id Info. If you would like to see Audience reports, please ensure that you have added '<meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />' to your application manifest file. See http://goo.gl/naFqQk for details.");
            return null;
        } catch (Throwable th) {
            if (f11281a) {
                return null;
            }
            f11281a = true;
            m12031d("Error getting advertiser id", th);
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    private final String m12000f() {
        String str = null;
        try {
            FileInputStream fileInputStreamOpenFileInput = m12038j().openFileInput("gaClientIdData");
            byte[] bArr = new byte[128];
            int i = fileInputStreamOpenFileInput.read(bArr, 0, 128);
            if (fileInputStreamOpenFileInput.available() > 0) {
                m12033e("Hash file seems corrupted, deleting it.");
                fileInputStreamOpenFileInput.close();
                m12038j().deleteFile("gaClientIdData");
            } else if (i <= 0) {
                m12023b("Hash file is empty.");
                fileInputStreamOpenFileInput.close();
            } else {
                String str2 = new String(bArr, 0, i);
                try {
                    fileInputStreamOpenFileInput.close();
                    str = str2;
                } catch (FileNotFoundException e) {
                    str = str2;
                } catch (IOException e2) {
                    str = str2;
                    e = e2;
                    m12031d("Error reading Hash file, deleting it", e);
                    m12038j().deleteFile("gaClientIdData");
                    return str;
                }
            }
        } catch (FileNotFoundException e3) {
        } catch (IOException e4) {
            e = e4;
        }
        return str;
    }

    /* JADX INFO: renamed from: g */
    private final boolean m12001g(String str) {
        try {
            String strM11996a = m11996a(str);
            m12023b("Storing hashed adid.");
            FileOutputStream fileOutputStreamOpenFileOutput = m12038j().openFileOutput("gaClientIdData", 0);
            fileOutputStreamOpenFileOutput.write(strM11996a.getBytes());
            fileOutputStreamOpenFileOutput.close();
            this.f11284d = strM11996a;
            return true;
        } catch (IOException e) {
            m12034e("Error creating hash file", e);
            return false;
        }
    }

    @Override // com.google.android.gms.internal.AbstractC1832po
    /* JADX INFO: renamed from: a */
    protected final void mo6013a() {
    }

    /* JADX INFO: renamed from: b */
    public final boolean m12002b() {
        m12052y();
        C0677a.a aVarM11998d = m11998d();
        return (aVarM11998d == null || aVarM11998d.m5409b()) ? false : true;
    }

    /* JADX INFO: renamed from: c */
    public final String m12003c() {
        m12052y();
        C0677a.a aVarM11998d = m11998d();
        String strM5408a = aVarM11998d != null ? aVarM11998d.m5408a() : null;
        if (TextUtils.isEmpty(strM5408a)) {
            return null;
        }
        return strM5408a;
    }
}
