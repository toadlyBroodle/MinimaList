package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
final class aff implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ afe f6618a;

    aff(afe afeVar) {
        this.f6618a = afeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f6618a.f6616b != null) {
            return;
        }
        synchronized (afe.f6614d) {
            if (this.f6618a.f6616b != null) {
                return;
            }
            boolean zBooleanValue = ((Boolean) bxm.m10409f().m10546a(can.f9521bo)).booleanValue();
            if (zBooleanValue) {
                try {
                    afe.f6613a = new bwk(this.f6618a.f6617c.f7178a, "ADSHIELD", null);
                } catch (Throwable th) {
                    zBooleanValue = false;
                }
            }
            this.f6618a.f6616b = Boolean.valueOf(zBooleanValue);
            afe.f6614d.open();
        }
    }
}
