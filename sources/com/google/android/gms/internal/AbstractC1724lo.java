package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.TextureView;

/* JADX INFO: renamed from: com.google.android.gms.internal.lo */
/* JADX INFO: loaded from: classes.dex */
@cnb
@TargetApi(14)
public abstract class AbstractC1724lo extends TextureView implements InterfaceC1743mg {

    /* JADX INFO: renamed from: a */
    protected final C1731lv f10951a;

    /* JADX INFO: renamed from: b */
    protected final C1742mf f10952b;

    public AbstractC1724lo(Context context) {
        super(context);
        this.f10951a = new C1731lv();
        this.f10952b = new C1742mf(context, this);
    }

    /* JADX INFO: renamed from: a */
    public abstract String mo11679a();

    /* JADX INFO: renamed from: a */
    public abstract void mo11680a(float f, float f2);

    /* JADX INFO: renamed from: a */
    public abstract void mo11681a(int i);

    /* JADX INFO: renamed from: a */
    public abstract void mo11682a(InterfaceC1723ln interfaceC1723ln);

    /* JADX INFO: renamed from: b */
    public abstract void mo11683b();

    /* JADX INFO: renamed from: c */
    public abstract void mo11684c();

    /* JADX INFO: renamed from: d */
    public abstract void mo11685d();

    /* JADX INFO: renamed from: e */
    public abstract void mo11686e();

    public abstract int getCurrentPosition();

    public abstract int getDuration();

    public abstract int getVideoHeight();

    public abstract int getVideoWidth();

    public abstract void setVideoPath(String str);
}
