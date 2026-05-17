package com.google.android.gms.internal;

import java.util.Map;
import java.util.concurrent.ExecutionException;
import org.json.JSONException;

/* JADX INFO: renamed from: com.google.android.gms.internal.dz */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1519dz implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ InterfaceFutureC1689kg f10490a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ C1517dx f10491b;

    RunnableC1519dz(C1517dx c1517dx, InterfaceFutureC1689kg interfaceFutureC1689kg) {
        this.f10491b = c1517dx;
        this.f10490a = interfaceFutureC1689kg;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Throwable th;
        try {
            this.f10491b.m11211a((Map<String, String>) this.f10490a.get());
            if (this.f10491b.f10477a) {
                synchronized (this.f10491b.f10483g) {
                    this.f10491b.f10478b.f8828a = 9;
                }
            }
            this.f10491b.m11215e();
        } catch (InterruptedException e) {
            th = e;
            if (((Boolean) bxm.m10409f().m10546a(can.f9571cl)).booleanValue()) {
                C1560fm.m11608a("Failed to get SafeBrowsing metadata", th);
            }
        } catch (ExecutionException e2) {
            th = e2;
            if (((Boolean) bxm.m10409f().m10546a(can.f9571cl)).booleanValue()) {
            }
        } catch (JSONException e3) {
            th = e3;
            if (((Boolean) bxm.m10409f().m10546a(can.f9571cl)).booleanValue()) {
            }
        }
    }
}
