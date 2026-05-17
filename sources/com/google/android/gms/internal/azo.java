package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C1221aj;
import com.google.firebase.C2213b;
import com.google.firebase.auth.AbstractC2198l;
import com.google.firebase.auth.C2204r;
import com.google.firebase.auth.C2205s;
import com.google.firebase.auth.internal.InterfaceC2189l;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
abstract class azo<SuccessT, CallbackT> {

    /* JADX INFO: renamed from: a */
    protected final int f7613a;

    /* JADX INFO: renamed from: c */
    protected C2213b f7615c;

    /* JADX INFO: renamed from: d */
    protected AbstractC2198l f7616d;

    /* JADX INFO: renamed from: e */
    protected azh f7617e;

    /* JADX INFO: renamed from: f */
    protected CallbackT f7618f;

    /* JADX INFO: renamed from: g */
    protected InterfaceC2189l f7619g;

    /* JADX INFO: renamed from: h */
    protected azn<SuccessT> f7620h;

    /* JADX INFO: renamed from: j */
    protected Executor f7622j;

    /* JADX INFO: renamed from: k */
    protected azq f7623k;

    /* JADX INFO: renamed from: l */
    protected bae f7624l;

    /* JADX INFO: renamed from: m */
    protected bac f7625m;

    /* JADX INFO: renamed from: n */
    protected baa f7626n;

    /* JADX INFO: renamed from: o */
    protected bak f7627o;

    /* JADX INFO: renamed from: p */
    protected String f7628p;

    /* JADX INFO: renamed from: q */
    protected String f7629q;

    /* JADX INFO: renamed from: r */
    protected C2204r f7630r;

    /* JADX INFO: renamed from: s */
    boolean f7631s;

    /* JADX INFO: renamed from: t */
    private boolean f7632t;

    /* JADX INFO: renamed from: u */
    private SuccessT f7633u;

    /* JADX INFO: renamed from: v */
    private Status f7634v;

    /* JADX INFO: renamed from: b */
    protected final azs f7614b = new azs(this);

    /* JADX INFO: renamed from: i */
    protected final List<C2205s.b> f7621i = new ArrayList();

    public azo(int i) {
        this.f7613a = i;
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ boolean m8739a(azo azoVar, boolean z) {
        azoVar.f7632t = true;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public final void m8740b(Status status) {
        if (this.f7619g != null) {
            this.f7619g.mo12847a(status);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public final void m8741c() {
        mo8709b();
        C1221aj.m7071a(this.f7632t, "no success or failure set on method implementation");
    }

    /* JADX INFO: renamed from: a */
    public final azo<SuccessT, CallbackT> m8742a(InterfaceC2189l interfaceC2189l) {
        this.f7619g = (InterfaceC2189l) C1221aj.m7066a(interfaceC2189l, "external failure callback cannot be null");
        return this;
    }

    /* JADX INFO: renamed from: a */
    public final azo<SuccessT, CallbackT> m8743a(AbstractC2198l abstractC2198l) {
        this.f7616d = (AbstractC2198l) C1221aj.m7066a(abstractC2198l, "firebaseUser cannot be null");
        return this;
    }

    /* JADX INFO: renamed from: a */
    public final azo<SuccessT, CallbackT> m8744a(C2213b c2213b) {
        this.f7615c = (C2213b) C1221aj.m7066a(c2213b, "firebaseApp cannot be null");
        return this;
    }

    /* JADX INFO: renamed from: a */
    public final azo<SuccessT, CallbackT> m8745a(CallbackT callbackt) {
        this.f7618f = (CallbackT) C1221aj.m7066a(callbackt, "external callback cannot be null");
        return this;
    }

    /* JADX INFO: renamed from: a */
    protected abstract void mo8708a();

    /* JADX INFO: renamed from: a */
    public final void m8746a(Status status) {
        this.f7632t = true;
        this.f7631s = false;
        this.f7634v = status;
        this.f7620h.mo8710a(null, status);
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo8709b();

    /* JADX INFO: renamed from: b */
    public final void m8747b(SuccessT successt) {
        this.f7632t = true;
        this.f7631s = true;
        this.f7633u = successt;
        this.f7620h.mo8710a(successt, null);
    }
}
