package android.support.transition;

import android.view.View;
import android.view.WindowId;

/* JADX INFO: renamed from: android.support.transition.av */
/* JADX INFO: loaded from: classes.dex */
class C0107av implements InterfaceC0108aw {

    /* JADX INFO: renamed from: a */
    private final WindowId f554a;

    C0107av(View view) {
        this.f554a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof C0107av) && ((C0107av) obj).f554a.equals(this.f554a);
    }

    public int hashCode() {
        return this.f554a.hashCode();
    }
}
