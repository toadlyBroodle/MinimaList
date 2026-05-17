package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.util.C1308l;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class aqf {

    /* JADX INFO: renamed from: a */
    private final Context f7070a;

    /* JADX INFO: renamed from: b */
    private final aqk f7071b;

    /* JADX INFO: renamed from: c */
    private final ExecutorService f7072c;

    public aqf(Context context) {
        this(context, Executors.newSingleThreadExecutor(), new aqg(context));
    }

    private aqf(Context context, ExecutorService executorService, aqk aqkVar) {
        this.f7070a = context;
        this.f7072c = executorService;
        this.f7071b = aqkVar;
    }

    /* JADX INFO: renamed from: a */
    private static byte[] m8148a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            try {
                C1308l.m7273a(inputStream, byteArrayOutputStream, false);
            } catch (IOException e) {
                ahs.m7944b("Failed to read the resource from disk");
                try {
                    inputStream.close();
                } catch (IOException e2) {
                    ahs.m7944b("Error closing stream for reading resource from disk");
                    return null;
                }
            }
            try {
                inputStream.close();
                return byteArrayOutputStream.toByteArray();
            } catch (IOException e3) {
                ahs.m7944b("Error closing stream for reading resource from disk");
                return null;
            }
        } catch (Throwable th) {
            try {
                inputStream.close();
                throw th;
            } catch (IOException e4) {
                ahs.m7944b("Error closing stream for reading resource from disk");
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private final File m8149b(String str) {
        return new File(this.f7070a.getDir("google_tagmanager", 0), m8150c(str));
    }

    /* JADX INFO: renamed from: c */
    private static String m8150c(String str) {
        String strValueOf = String.valueOf("resource_");
        String strValueOf2 = String.valueOf(str);
        return strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
    }

    /* JADX INFO: renamed from: a */
    public final long m8151a(String str) {
        File fileM8149b = m8149b(str);
        if (fileM8149b.exists()) {
            return fileM8149b.lastModified();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: a */
    public final void m8152a(String str, aps apsVar) {
        this.f7072c.execute(new aqh(this, str, apsVar));
    }

    /* JADX INFO: renamed from: a */
    public final void m8153a(String str, String str2, aps apsVar) {
        this.f7072c.execute(new aqi(this, str, str2, apsVar));
    }

    /* JADX INFO: renamed from: a */
    public final void m8154a(String str, byte[] bArr) {
        this.f7072c.execute(new aqj(this, str, bArr));
    }

    /* JADX INFO: renamed from: b */
    final void m8155b(String str, aps apsVar) {
        ahs.m7947d("Starting to load a saved resource file from Disk.");
        try {
            apsVar.m8127a(m8148a(new FileInputStream(m8149b(str))));
        } catch (FileNotFoundException e) {
            String strValueOf = String.valueOf(m8150c(str));
            ahs.m7942a(strValueOf.length() != 0 ? "Saved resource not found: ".concat(strValueOf) : new String("Saved resource not found: "));
            apsVar.m8125a(0, 1);
        }
    }

    /* JADX INFO: renamed from: b */
    final void m8156b(String str, String str2, aps apsVar) {
        ahs.m7947d("Starting to load a default asset file from Disk.");
        if (str2 == null) {
            ahs.m7947d("Default asset file is not specified. Not proceeding with the loading");
            apsVar.m8125a(0, 2);
            return;
        }
        try {
            InputStream inputStreamMo8158a = this.f7071b.mo8158a(str2);
            if (inputStreamMo8158a != null) {
                apsVar.m8127a(m8148a(inputStreamMo8158a));
            } else {
                apsVar.m8125a(0, 2);
            }
        } catch (IOException e) {
            ahs.m7942a(new StringBuilder(String.valueOf(str).length() + 42 + String.valueOf(str2).length()).append("Default asset file not found. ").append(str).append(". Filename: ").append(str2).toString());
            apsVar.m8125a(0, 2);
        }
    }

    /* JADX INFO: renamed from: b */
    final void m8157b(String str, byte[] bArr) {
        File fileM8149b = m8149b(str);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileM8149b);
            try {
                try {
                    fileOutputStream.write(bArr);
                } catch (IOException e) {
                    ahs.m7942a("Error writing resource to disk. Removing resource from disk");
                    fileM8149b.delete();
                    try {
                        fileOutputStream.close();
                        ahs.m7947d(new StringBuilder(String.valueOf(str).length() + 24).append("Resource ").append(str).append(" saved on Disk.").toString());
                    } catch (IOException e2) {
                        ahs.m7942a("Error closing stream for writing resource to disk");
                    }
                }
            } finally {
                try {
                    fileOutputStream.close();
                    ahs.m7947d(new StringBuilder(String.valueOf(str).length() + 24).append("Resource ").append(str).append(" saved on Disk.").toString());
                } catch (IOException e3) {
                    ahs.m7942a("Error closing stream for writing resource to disk");
                }
            }
        } catch (FileNotFoundException e4) {
            ahs.m7942a("Error opening resource file for writing");
        }
    }
}
