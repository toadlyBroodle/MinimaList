package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.internal.InterfaceC1758mv;
import com.google.android.gms.internal.cnb;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.overlay.i */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C0834i {

    /* JADX INFO: renamed from: a */
    public final int f4826a;

    /* JADX INFO: renamed from: b */
    public final ViewGroup.LayoutParams f4827b;

    /* JADX INFO: renamed from: c */
    public final ViewGroup f4828c;

    /* JADX INFO: renamed from: d */
    public final Context f4829d;

    /* JADX WARN: Multi-variable type inference failed */
    public C0834i(InterfaceC1758mv interfaceC1758mv) throws C0832g {
        this.f4827b = interfaceC1758mv.getLayoutParams();
        ViewParent parent = interfaceC1758mv.getParent();
        this.f4829d = interfaceC1758mv.mo11828r();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new C0832g("Could not get the parent of the WebView for an overlay.");
        }
        this.f4828c = (ViewGroup) parent;
        ViewGroup viewGroup = this.f4828c;
        if (interfaceC1758mv == 0) {
            throw null;
        }
        this.f4826a = viewGroup.indexOfChild((View) interfaceC1758mv);
        ViewGroup viewGroup2 = this.f4828c;
        if (interfaceC1758mv == 0) {
            throw null;
        }
        viewGroup2.removeView((View) interfaceC1758mv);
        interfaceC1758mv.mo11820b(true);
    }
}
