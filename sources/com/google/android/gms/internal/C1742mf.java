package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.AudioManager;

/* JADX INFO: renamed from: com.google.android.gms.internal.mf */
/* JADX INFO: loaded from: classes.dex */
@cnb
@TargetApi(14)
public final class C1742mf implements AudioManager.OnAudioFocusChangeListener {

    /* JADX INFO: renamed from: a */
    private final AudioManager f11042a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC1743mg f11043b;

    /* JADX INFO: renamed from: c */
    private boolean f11044c;

    /* JADX INFO: renamed from: d */
    private boolean f11045d;

    /* JADX INFO: renamed from: e */
    private boolean f11046e;

    /* JADX INFO: renamed from: f */
    private float f11047f = 1.0f;

    public C1742mf(Context context, InterfaceC1743mg interfaceC1743mg) {
        this.f11042a = (AudioManager) context.getSystemService("audio");
        this.f11043b = interfaceC1743mg;
    }

    /* JADX INFO: renamed from: d */
    private final void m11772d() {
        boolean z = this.f11045d && !this.f11046e && this.f11047f > 0.0f;
        if (z && !this.f11044c) {
            if (this.f11042a != null && !this.f11044c) {
                this.f11044c = this.f11042a.requestAudioFocus(this, 3, 2) == 1;
            }
            this.f11043b.mo11686e();
            return;
        }
        if (z || !this.f11044c) {
            return;
        }
        if (this.f11042a != null && this.f11044c) {
            this.f11044c = this.f11042a.abandonAudioFocus(this) == 0;
        }
        this.f11043b.mo11686e();
    }

    /* JADX INFO: renamed from: a */
    public final float m11773a() {
        float f = this.f11046e ? 0.0f : this.f11047f;
        if (this.f11044c) {
            return f;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: a */
    public final void m11774a(float f) {
        this.f11047f = f;
        m11772d();
    }

    /* JADX INFO: renamed from: a */
    public final void m11775a(boolean z) {
        this.f11046e = z;
        m11772d();
    }

    /* JADX INFO: renamed from: b */
    public final void m11776b() {
        this.f11045d = true;
        m11772d();
    }

    /* JADX INFO: renamed from: c */
    public final void m11777c() {
        this.f11045d = false;
        m11772d();
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        this.f11044c = i > 0;
        this.f11043b.mo11686e();
    }
}
