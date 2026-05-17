package android.support.transition;

import android.os.IBinder;

/* JADX INFO: renamed from: android.support.transition.au */
/* JADX INFO: loaded from: classes.dex */
class C0106au implements InterfaceC0108aw {

    /* JADX INFO: renamed from: a */
    private final IBinder f553a;

    C0106au(IBinder iBinder) {
        this.f553a = iBinder;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C0106au) && ((C0106au) obj).f553a.equals(this.f553a);
    }

    public int hashCode() {
        return this.f553a.hashCode();
    }
}
