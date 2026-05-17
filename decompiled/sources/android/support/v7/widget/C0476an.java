package android.support.v7.widget;

import android.support.v7.widget.C0484av;
import android.view.View;

/* JADX INFO: renamed from: android.support.v7.widget.an */
/* JADX INFO: loaded from: classes.dex */
class C0476an {

    /* JADX INFO: renamed from: b */
    int f3110b;

    /* JADX INFO: renamed from: c */
    int f3111c;

    /* JADX INFO: renamed from: d */
    int f3112d;

    /* JADX INFO: renamed from: e */
    int f3113e;

    /* JADX INFO: renamed from: h */
    boolean f3116h;

    /* JADX INFO: renamed from: i */
    boolean f3117i;

    /* JADX INFO: renamed from: a */
    boolean f3109a = true;

    /* JADX INFO: renamed from: f */
    int f3114f = 0;

    /* JADX INFO: renamed from: g */
    int f3115g = 0;

    C0476an() {
    }

    /* JADX INFO: renamed from: a */
    View m3928a(C0484av.o oVar) {
        View viewM4340c = oVar.m4340c(this.f3111c);
        this.f3111c += this.f3112d;
        return viewM4340c;
    }

    /* JADX INFO: renamed from: a */
    boolean m3929a(C0484av.t tVar) {
        return this.f3111c >= 0 && this.f3111c < tVar.m4383e();
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f3110b + ", mCurrentPosition=" + this.f3111c + ", mItemDirection=" + this.f3112d + ", mLayoutDirection=" + this.f3113e + ", mStartLine=" + this.f3114f + ", mEndLine=" + this.f3115g + '}';
    }
}
