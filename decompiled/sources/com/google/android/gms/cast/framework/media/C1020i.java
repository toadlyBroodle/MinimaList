package com.google.android.gms.cast.framework.media;

import com.google.android.gms.cast.framework.media.C1016e;
import com.google.android.gms.common.api.AbstractC1079f;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.C1973uu;
import com.google.android.gms.internal.C1996vq;
import java.io.IOException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.cast.framework.media.i */
/* JADX INFO: loaded from: classes.dex */
final class C1020i extends C1016e.f {

    /* JADX INFO: renamed from: c */
    private /* synthetic */ long f5359c;

    /* JADX INFO: renamed from: d */
    private /* synthetic */ int f5360d;

    /* JADX INFO: renamed from: e */
    private /* synthetic */ JSONObject f5361e;

    /* JADX INFO: renamed from: f */
    private /* synthetic */ C1016e f5362f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1020i(C1016e c1016e, AbstractC1079f abstractC1079f, long j, int i, JSONObject jSONObject) {
        super(c1016e, abstractC1079f);
        this.f5362f = c1016e;
        this.f5359c = j;
        this.f5360d = i;
        this.f5361e = jSONObject;
    }

    @Override // com.google.android.gms.cast.framework.media.C1016e.f
    /* JADX INFO: renamed from: a */
    protected final void mo6506a(C1973uu c1973uu) {
        synchronized (this.f5362f.f5332b) {
            try {
                this.f5362f.f5334d.m12460a(this.f5345a, this.f5359c, this.f5360d, this.f5361e);
            } catch (C1996vq | IOException e) {
                m6708a((C1016e.b) mo6177a(new Status(2100)));
            }
        }
    }
}
