package com.google.android.gms.cast.framework.media;

import com.google.android.gms.cast.framework.media.C1016e;
import com.google.android.gms.common.api.AbstractC1079f;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.C1973uu;
import com.google.android.gms.internal.C1996vq;
import java.io.IOException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.cast.framework.media.h */
/* JADX INFO: loaded from: classes.dex */
final class C1019h extends C1016e.f {

    /* JADX INFO: renamed from: c */
    private /* synthetic */ JSONObject f5357c;

    /* JADX INFO: renamed from: d */
    private /* synthetic */ C1016e f5358d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1019h(C1016e c1016e, AbstractC1079f abstractC1079f, JSONObject jSONObject) {
        super(c1016e, abstractC1079f);
        this.f5358d = c1016e;
        this.f5357c = jSONObject;
    }

    @Override // com.google.android.gms.cast.framework.media.C1016e.f
    /* JADX INFO: renamed from: a */
    protected final void mo6506a(C1973uu c1973uu) {
        synchronized (this.f5358d.f5332b) {
            try {
                this.f5358d.f5334d.m12463b(this.f5345a, this.f5357c);
            } catch (C1996vq | IOException e) {
                m6708a((C1016e.b) mo6177a(new Status(2100)));
            }
        }
    }
}
