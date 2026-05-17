package com.google.android.gms.cast.framework.media;

import android.util.Log;
import com.google.android.gms.cast.framework.media.C1016e;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.InterfaceC1998vs;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.cast.framework.media.k */
/* JADX INFO: loaded from: classes.dex */
final class C1022k implements InterfaceC1998vs {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C1016e f5365a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ C1016e.f f5366b;

    C1022k(C1016e.f fVar, C1016e c1016e) {
        this.f5366b = fVar;
        this.f5365a = c1016e;
    }

    @Override // com.google.android.gms.internal.InterfaceC1998vs
    /* JADX INFO: renamed from: a */
    public final void mo6512a(long j) {
        try {
            this.f5366b.m6708a((C1016e.b) this.f5366b.mo6177a(new Status(2103)));
        } catch (IllegalStateException e) {
            Log.e("RemoteMediaClient", "Result already set when calling onRequestReplaced", e);
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC1998vs
    /* JADX INFO: renamed from: a */
    public final void mo6513a(long j, int i, Object obj) {
        try {
            this.f5366b.m6708a(new C1016e.g(new Status(i), obj instanceof JSONObject ? (JSONObject) obj : null));
        } catch (IllegalStateException e) {
            Log.e("RemoteMediaClient", "Result already set when calling onRequestCompleted", e);
        }
    }
}
