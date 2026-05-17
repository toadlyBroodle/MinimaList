package com.google.android.gms.internal;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class bvm implements cmf {

    /* JADX INFO: renamed from: a */
    private final Executor f9123a;

    public bvm(Handler handler) {
        this.f9123a = new bwn(this, handler);
    }

    @Override // com.google.android.gms.internal.cmf
    /* JADX INFO: renamed from: a */
    public final void mo10328a(cej<?> cejVar, C1471ce c1471ce) {
        cejVar.m10765b("post-error");
        this.f9123a.execute(new bxk(this, cejVar, cjk.m11026a(c1471ce), null));
    }

    @Override // com.google.android.gms.internal.cmf
    /* JADX INFO: renamed from: a */
    public final void mo10329a(cej<?> cejVar, cjk<?> cjkVar) {
        mo10330a(cejVar, cjkVar, null);
    }

    @Override // com.google.android.gms.internal.cmf
    /* JADX INFO: renamed from: a */
    public final void mo10330a(cej<?> cejVar, cjk<?> cjkVar, Runnable runnable) {
        cejVar.m10774j();
        cejVar.m10765b("post-response");
        this.f9123a.execute(new bxk(this, cejVar, cjkVar, runnable));
    }
}
