package com.google.android.gms.internal;

import android.content.Intent;
import android.support.v4.media.session.MediaSessionCompat;
import android.view.KeyEvent;

/* JADX INFO: renamed from: com.google.android.gms.internal.uh */
/* JADX INFO: loaded from: classes.dex */
final class C1960uh extends MediaSessionCompat.AbstractC0294a {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C1955uc f11661a;

    C1960uh(C1955uc c1955uc) {
        this.f11661a = c1955uc;
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.AbstractC0294a
    /* JADX INFO: renamed from: a */
    public final boolean mo2104a(Intent intent) {
        KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        if (keyEvent == null) {
            return true;
        }
        if (keyEvent.getKeyCode() != 127 && keyEvent.getKeyCode() != 126) {
            return true;
        }
        this.f11661a.f11632g.m6490q();
        return true;
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.AbstractC0294a
    /* JADX INFO: renamed from: b */
    public final void mo2105b() {
        this.f11661a.f11632g.m6490q();
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.AbstractC0294a
    /* JADX INFO: renamed from: c */
    public final void mo2111c() {
        this.f11661a.f11632g.m6490q();
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.AbstractC0294a
    /* JADX INFO: renamed from: h */
    public final void mo2119h() {
        if (this.f11661a.f11632g.m6484k()) {
            this.f11661a.f11632g.m6490q();
        }
    }
}
