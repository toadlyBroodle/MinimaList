package com.google.android.gms.cast.framework.media;

import com.google.android.gms.cast.framework.media.C1016e;
import com.google.android.gms.common.api.AbstractC1079f;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.C1973uu;
import java.io.IOException;

/* JADX INFO: renamed from: com.google.android.gms.cast.framework.media.x */
/* JADX INFO: loaded from: classes.dex */
final class C1035x extends C1016e.f {

    /* JADX INFO: renamed from: c */
    private /* synthetic */ C1016e f5370c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1035x(C1016e c1016e, AbstractC1079f abstractC1079f) {
        super(c1016e, abstractC1079f);
        this.f5370c = c1016e;
    }

    @Override // com.google.android.gms.cast.framework.media.C1016e.f
    /* JADX INFO: renamed from: a */
    protected final void mo6506a(C1973uu c1973uu) {
        synchronized (this.f5370c.f5332b) {
            try {
                this.f5370c.f5334d.m12458a(this.f5345a);
            } catch (IOException e) {
                m6708a((C1016e.b) mo6177a(new Status(2100)));
            }
        }
    }
}
