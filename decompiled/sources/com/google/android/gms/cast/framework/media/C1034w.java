package com.google.android.gms.cast.framework.media;

import com.google.android.gms.cast.C0988b;
import com.google.android.gms.cast.C1054j;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.framework.media.C1016e;
import com.google.android.gms.internal.InterfaceC1995vp;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.cast.framework.media.w */
/* JADX INFO: loaded from: classes.dex */
final class C1034w implements InterfaceC1995vp {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C1016e f5369a;

    C1034w(C1016e c1016e) {
        this.f5369a = c1016e;
    }

    /* JADX INFO: renamed from: f */
    private final void m6519f() {
        C1054j c1054jM6480g;
        if (this.f5369a.f5341k == null || (c1054jM6480g = this.f5369a.m6480g()) == null) {
            return;
        }
        c1054jM6480g.m6571a(this.f5369a.f5341k.m6500a(c1054jM6480g));
        List<C0988b> listM6501b = this.f5369a.f5341k.m6501b(c1054jM6480g);
        MediaInfo mediaInfoM6481h = this.f5369a.m6481h();
        if (mediaInfoM6481h != null) {
            mediaInfoM6481h.m6260a(listM6501b);
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC1995vp
    /* JADX INFO: renamed from: a */
    public final void mo6520a() {
        m6519f();
        this.f5369a.m6464w();
        Iterator it = this.f5369a.f5338h.iterator();
        while (it.hasNext()) {
            ((C1016e.a) it.next()).mo6494a();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC1995vp
    /* JADX INFO: renamed from: b */
    public final void mo6521b() {
        m6519f();
        Iterator it = this.f5369a.f5338h.iterator();
        while (it.hasNext()) {
            ((C1016e.a) it.next()).mo6495b();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC1995vp
    /* JADX INFO: renamed from: c */
    public final void mo6522c() {
        Iterator it = this.f5369a.f5338h.iterator();
        while (it.hasNext()) {
            ((C1016e.a) it.next()).mo6496c();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC1995vp
    /* JADX INFO: renamed from: d */
    public final void mo6523d() {
        Iterator it = this.f5369a.f5338h.iterator();
        while (it.hasNext()) {
            ((C1016e.a) it.next()).mo6497d();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC1995vp
    /* JADX INFO: renamed from: e */
    public final void mo6524e() {
        Iterator it = this.f5369a.f5338h.iterator();
        while (it.hasNext()) {
            ((C1016e.a) it.next()).mo6499f();
        }
    }
}
