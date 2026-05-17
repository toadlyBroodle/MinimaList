package android.support.transition;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* JADX INFO: renamed from: android.support.transition.ak */
/* JADX INFO: loaded from: classes.dex */
class C0096ak implements InterfaceC0097al {

    /* JADX INFO: renamed from: a */
    private final ViewOverlay f520a;

    C0096ak(View view) {
        this.f520a = view.getOverlay();
    }

    @Override // android.support.transition.InterfaceC0097al
    /* JADX INFO: renamed from: a */
    public void mo593a(Drawable drawable) {
        this.f520a.add(drawable);
    }

    @Override // android.support.transition.InterfaceC0097al
    /* JADX INFO: renamed from: b */
    public void mo594b(Drawable drawable) {
        this.f520a.remove(drawable);
    }
}
