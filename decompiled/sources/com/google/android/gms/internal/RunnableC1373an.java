package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.C0710au;
import com.google.android.gms.common.util.C1308l;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: com.google.android.gms.internal.an */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1373an implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ OutputStream f6975a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ byte[] f6976b;

    RunnableC1373an(C1372am c1372am, OutputStream outputStream, byte[] bArr) {
        this.f6975a = outputStream;
        this.f6976b = bArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() throws Throwable {
        DataOutputStream dataOutputStream;
        try {
            try {
                dataOutputStream = new DataOutputStream(this.f6975a);
                try {
                    dataOutputStream.writeInt(this.f6976b.length);
                    dataOutputStream.write(this.f6976b);
                    C1308l.m7275a(dataOutputStream);
                } catch (IOException e) {
                    e = e;
                    C1560fm.m11611b("Error transporting the ad response", e);
                    C0710au.m5573i().m11292a(e, "LargeParcelTeleporter.pipeData.1");
                    if (dataOutputStream == null) {
                        C1308l.m7275a(this.f6975a);
                    } else {
                        C1308l.m7275a(dataOutputStream);
                    }
                }
            } catch (Throwable th) {
                th = th;
                if (dataOutputStream != null) {
                    C1308l.m7275a(this.f6975a);
                } else {
                    C1308l.m7275a(dataOutputStream);
                }
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            dataOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
            dataOutputStream = null;
            if (dataOutputStream != null) {
            }
            throw th;
        }
    }
}
