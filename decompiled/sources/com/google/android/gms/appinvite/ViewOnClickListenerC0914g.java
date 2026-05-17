package com.google.android.gms.appinvite;

import android.view.View;

/* JADX INFO: renamed from: com.google.android.gms.appinvite.g */
/* JADX INFO: loaded from: classes.dex */
final class ViewOnClickListenerC0914g implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ PreviewActivity f4995a;

    ViewOnClickListenerC0914g(PreviewActivity previewActivity) {
        this.f4995a = previewActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f4995a.finish();
    }
}
