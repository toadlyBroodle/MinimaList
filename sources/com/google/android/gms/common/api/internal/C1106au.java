package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.C1071a;
import com.google.android.gms.common.api.C1074a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.InterfaceC1240bb;
import com.google.android.gms.common.internal.InterfaceC1268o;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.au */
/* JADX INFO: loaded from: classes.dex */
final class C1106au implements InterfaceC1132bt, InterfaceC1240bb {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C1098am f5611a;

    /* JADX INFO: renamed from: b */
    private final C1074a.f f5612b;

    /* JADX INFO: renamed from: c */
    private final C1150ck<?> f5613c;

    /* JADX INFO: renamed from: d */
    private InterfaceC1268o f5614d = null;

    /* JADX INFO: renamed from: e */
    private Set<Scope> f5615e = null;

    /* JADX INFO: renamed from: f */
    private boolean f5616f = false;

    public C1106au(C1098am c1098am, C1074a.f fVar, C1150ck<?> c1150ck) {
        this.f5611a = c1098am;
        this.f5612b = fVar;
        this.f5613c = c1150ck;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m6838a() {
        if (!this.f5616f || this.f5614d == null) {
            return;
        }
        this.f5612b.m6638a(this.f5614d, this.f5615e);
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ boolean m6839a(C1106au c1106au, boolean z) {
        c1106au.f5616f = true;
        return true;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC1240bb
    /* JADX INFO: renamed from: a */
    public final void mo6842a(C1071a c1071a) {
        this.f5611a.f5591q.post(new RunnableC1107av(this, c1071a));
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1132bt
    /* JADX INFO: renamed from: a */
    public final void mo6843a(InterfaceC1268o interfaceC1268o, Set<Scope> set) {
        if (interfaceC1268o == null || set == null) {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            mo6844b(new C1071a(4));
        } else {
            this.f5614d = interfaceC1268o;
            this.f5615e = set;
            m6838a();
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1132bt
    /* JADX INFO: renamed from: b */
    public final void mo6844b(C1071a c1071a) {
        ((C1100ao) this.f5611a.f5587m.get(this.f5613c)).m6824b(c1071a);
    }
}
