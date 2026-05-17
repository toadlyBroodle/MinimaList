package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.C1071a;
import com.google.android.gms.common.api.C1074a;
import com.google.android.gms.common.api.InterfaceC1193k;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.y */
/* JADX INFO: loaded from: classes.dex */
public final class C1190y implements InterfaceC1093ah {

    /* JADX INFO: renamed from: a */
    private final C1094ai f5818a;

    public C1190y(C1094ai c1094ai) {
        this.f5818a = c1094ai;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1093ah
    /* JADX INFO: renamed from: a */
    public final <A extends C1074a.c, R extends InterfaceC1193k, T extends AbstractC1155cp<R, A>> T mo6749a(T t) {
        this.f5818a.f5560d.f5521a.add(t);
        return t;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1093ah
    /* JADX INFO: renamed from: a */
    public final void mo6750a() {
        Iterator<C1074a.f> it = this.f5818a.f5557a.values().iterator();
        while (it.hasNext()) {
            it.next().mo6640f();
        }
        this.f5818a.f5560d.f5523c = Collections.emptySet();
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1093ah
    /* JADX INFO: renamed from: a */
    public final void mo6751a(int i) {
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1093ah
    /* JADX INFO: renamed from: a */
    public final void mo6752a(Bundle bundle) {
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1093ah
    /* JADX INFO: renamed from: a */
    public final void mo6753a(C1071a c1071a, C1074a<?> c1074a, boolean z) {
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1093ah
    /* JADX INFO: renamed from: b */
    public final <A extends C1074a.c, T extends AbstractC1155cp<? extends InterfaceC1193k, A>> T mo6754b(T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1093ah
    /* JADX INFO: renamed from: b */
    public final boolean mo6755b() {
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1093ah
    /* JADX INFO: renamed from: c */
    public final void mo6756c() {
        this.f5818a.m6771e();
    }
}
