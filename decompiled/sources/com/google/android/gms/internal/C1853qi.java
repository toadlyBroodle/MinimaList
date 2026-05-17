package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.internal.C1221aj;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: renamed from: com.google.android.gms.internal.qi */
/* JADX INFO: loaded from: classes.dex */
public final class C1853qi extends AbstractC1832po {

    /* JADX INFO: renamed from: a */
    private volatile String f11372a;

    /* JADX INFO: renamed from: b */
    private Future<String> f11373b;

    protected C1853qi(C1834pq c1834pq) {
        super(c1834pq);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x008e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x008c -> B:63:0x002f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x008e -> B:63:0x002f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0093 -> B:63:0x002f). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String m12150a(Context context) throws Throwable {
        ?? OpenFileInput;
        Throwable th;
        ?? r1;
        String str = null;
        C1221aj.m7077c("ClientId should be loaded from worker thread");
        try {
            try {
                OpenFileInput = context.openFileInput("gaClientId");
            } catch (Throwable th2) {
                th = th2;
                if (OpenFileInput != 0) {
                    try {
                        OpenFileInput.close();
                    } catch (IOException e) {
                        m12034e("Failed to close client id reading stream", e);
                    }
                }
                throw th;
            }
        } catch (FileNotFoundException e2) {
            r1 = 0;
            if (r1 != 0) {
                try {
                    r1.close();
                } catch (IOException e3) {
                    m12034e("Failed to close client id reading stream", e3);
                }
            }
            return str;
        } catch (IOException e4) {
            e = e4;
            OpenFileInput = 0;
            m12034e("Error reading client id file, deleting it", e);
            context.deleteFile("gaClientId");
            OpenFileInput = OpenFileInput;
            if (OpenFileInput != 0) {
                try {
                    OpenFileInput.close();
                    OpenFileInput = OpenFileInput;
                } catch (IOException e5) {
                    m12034e("Failed to close client id reading stream", e5);
                    OpenFileInput = "Failed to close client id reading stream";
                }
            }
            return str;
        } catch (Throwable th3) {
            OpenFileInput = 0;
            th = th3;
            if (OpenFileInput != 0) {
            }
            throw th;
        }
        try {
            byte[] bArr = new byte[36];
            int i = OpenFileInput.read(bArr, 0, 36);
            if (OpenFileInput.available() > 0) {
                m12033e("clientId file seems corrupted, deleting it.");
                OpenFileInput.close();
                context.deleteFile("gaClientId");
                OpenFileInput = OpenFileInput;
                if (OpenFileInput != 0) {
                    try {
                        OpenFileInput.close();
                        OpenFileInput = OpenFileInput;
                    } catch (IOException e6) {
                        m12034e("Failed to close client id reading stream", e6);
                        OpenFileInput = "Failed to close client id reading stream";
                    }
                }
            } else if (i < 14) {
                m12033e("clientId file is empty, deleting it.");
                OpenFileInput.close();
                context.deleteFile("gaClientId");
                OpenFileInput = OpenFileInput;
                if (OpenFileInput != 0) {
                    try {
                        OpenFileInput.close();
                        OpenFileInput = OpenFileInput;
                    } catch (IOException e7) {
                        m12034e("Failed to close client id reading stream", e7);
                        OpenFileInput = "Failed to close client id reading stream";
                    }
                }
            } else {
                OpenFileInput.close();
                String str2 = new String(bArr, 0, i);
                m12020a("Read client id from disk", str2);
                ?? r2 = OpenFileInput;
                if (OpenFileInput != 0) {
                    try {
                        OpenFileInput.close();
                        r2 = OpenFileInput;
                    } catch (IOException e8) {
                        m12034e("Failed to close client id reading stream", e8);
                        r2 = "Failed to close client id reading stream";
                    }
                }
                str = str2;
                OpenFileInput = r2;
            }
        } catch (FileNotFoundException e9) {
            r1 = OpenFileInput;
            if (r1 != 0) {
            }
            return str;
        } catch (IOException e10) {
            e = e10;
            m12034e("Error reading client id file, deleting it", e);
            context.deleteFile("gaClientId");
            OpenFileInput = OpenFileInput;
            if (OpenFileInput != 0) {
            }
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    private final boolean m12152a(Context context, String str) {
        boolean z = false;
        C1221aj.m7067a(str);
        C1221aj.m7077c("ClientId should be saved from worker thread");
        FileOutputStream fileOutputStreamOpenFileOutput = 0;
        fileOutputStreamOpenFileOutput = 0;
        fileOutputStreamOpenFileOutput = 0;
        try {
            try {
                try {
                    m12020a("Storing clientId", str);
                    fileOutputStreamOpenFileOutput = context.openFileOutput("gaClientId", 0);
                    fileOutputStreamOpenFileOutput.write(str.getBytes());
                    if (fileOutputStreamOpenFileOutput != 0) {
                        try {
                            fileOutputStreamOpenFileOutput.close();
                        } catch (IOException e) {
                            m12034e("Failed to close clientId writing stream", e);
                        }
                    }
                    z = true;
                    fileOutputStreamOpenFileOutput = fileOutputStreamOpenFileOutput;
                } catch (Throwable th) {
                    if (fileOutputStreamOpenFileOutput != 0) {
                        try {
                            fileOutputStreamOpenFileOutput.close();
                        } catch (IOException e2) {
                            m12034e("Failed to close clientId writing stream", e2);
                        }
                    }
                    throw th;
                }
            } catch (IOException e3) {
                m12034e("Error writing to clientId file", e3);
                fileOutputStreamOpenFileOutput = fileOutputStreamOpenFileOutput;
                if (fileOutputStreamOpenFileOutput != 0) {
                    try {
                        fileOutputStreamOpenFileOutput.close();
                        fileOutputStreamOpenFileOutput = fileOutputStreamOpenFileOutput;
                    } catch (IOException e4) {
                        m12034e("Failed to close clientId writing stream", e4);
                        fileOutputStreamOpenFileOutput = "Failed to close clientId writing stream";
                    }
                }
            }
        } catch (FileNotFoundException e5) {
            m12034e("Error creating clientId file", e5);
            fileOutputStreamOpenFileOutput = fileOutputStreamOpenFileOutput;
            if (fileOutputStreamOpenFileOutput != 0) {
                try {
                    fileOutputStreamOpenFileOutput.close();
                    fileOutputStreamOpenFileOutput = fileOutputStreamOpenFileOutput;
                } catch (IOException e6) {
                    m12034e("Failed to close clientId writing stream", e6);
                    fileOutputStreamOpenFileOutput = "Failed to close clientId writing stream";
                }
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public final String m12153e() {
        String lowerCase = UUID.randomUUID().toString().toLowerCase();
        try {
            return !m12152a(m12041m().m6083c(), lowerCase) ? "0" : lowerCase;
        } catch (Exception e) {
            m12034e("Error saving clientId file", e);
            return "0";
        }
    }

    @Override // com.google.android.gms.internal.AbstractC1832po
    /* JADX INFO: renamed from: a */
    protected final void mo6013a() {
    }

    /* JADX INFO: renamed from: b */
    public final String m12154b() {
        String str;
        m12052y();
        synchronized (this) {
            if (this.f11372a == null) {
                this.f11373b = m12041m().m6078a(new CallableC1854qj(this));
            }
            if (this.f11373b != null) {
                try {
                    this.f11372a = this.f11373b.get();
                } catch (InterruptedException e) {
                    m12031d("ClientId loading or generation was interrupted", e);
                    this.f11372a = "0";
                } catch (ExecutionException e2) {
                    m12034e("Failed to load or generate client id", e2);
                    this.f11372a = "0";
                }
                if (this.f11372a == null) {
                    this.f11372a = "0";
                }
                m12020a("Loaded clientId", this.f11372a);
                this.f11373b = null;
                str = this.f11372a;
            } else {
                str = this.f11372a;
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: c */
    final String m12155c() {
        synchronized (this) {
            this.f11372a = null;
            this.f11373b = m12041m().m6078a(new CallableC1855qk(this));
        }
        return m12154b();
    }

    /* JADX INFO: renamed from: d */
    final String m12156d() throws Throwable {
        String strM12150a = m12150a(m12041m().m6083c());
        return strM12150a == null ? m12153e() : strM12150a;
    }
}
