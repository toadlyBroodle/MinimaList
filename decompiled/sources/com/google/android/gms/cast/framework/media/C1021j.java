package com.google.android.gms.cast.framework.media;

import com.google.android.gms.cast.framework.media.C1016e;
import com.google.android.gms.common.api.InterfaceC1193k;
import com.google.android.gms.common.api.InterfaceC1194l;
import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: com.google.android.gms.cast.framework.media.j */
/* JADX INFO: loaded from: classes.dex */
final class C1021j implements InterfaceC1194l<Status> {

    /* JADX INFO: renamed from: a */
    private final long f5363a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ C1016e.e f5364b;

    C1021j(C1016e.e eVar, long j) {
        this.f5364b = eVar;
        this.f5363a = j;
    }

    @Override // com.google.android.gms.common.api.InterfaceC1194l
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo4791a(InterfaceC1193k interfaceC1193k) {
        Status status = (Status) interfaceC1193k;
        if (status.m6626d()) {
            return;
        }
        C1016e.this.f5334d.mo12370a(this.f5363a, status.m6627e());
    }
}
