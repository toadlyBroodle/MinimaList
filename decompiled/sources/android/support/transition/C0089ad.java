package android.support.transition;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* JADX INFO: renamed from: android.support.transition.ad */
/* JADX INFO: loaded from: classes.dex */
class C0089ad implements InterfaceC0090ae {

    /* JADX INFO: renamed from: a */
    private final ViewGroupOverlay f504a;

    C0089ad(ViewGroup viewGroup) {
        this.f504a = viewGroup.getOverlay();
    }

    @Override // android.support.transition.InterfaceC0097al
    /* JADX INFO: renamed from: a */
    public void mo593a(Drawable drawable) {
        this.f504a.add(drawable);
    }

    @Override // android.support.transition.InterfaceC0090ae
    /* JADX INFO: renamed from: a */
    public void mo591a(View view) {
        this.f504a.add(view);
    }

    @Override // android.support.transition.InterfaceC0097al
    /* JADX INFO: renamed from: b */
    public void mo594b(Drawable drawable) {
        this.f504a.remove(drawable);
    }

    @Override // android.support.transition.InterfaceC0090ae
    /* JADX INFO: renamed from: b */
    public void mo592b(View view) {
        this.f504a.remove(view);
    }
}
