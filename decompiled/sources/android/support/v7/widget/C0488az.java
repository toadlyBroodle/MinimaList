package android.support.v7.widget;

import android.support.v7.widget.C0484av;
import android.view.View;

/* JADX INFO: renamed from: android.support.v7.widget.az */
/* JADX INFO: loaded from: classes.dex */
class C0488az {
    /* JADX INFO: renamed from: a */
    static int m4452a(C0484av.t tVar, AbstractC0483au abstractC0483au, View view, View view2, C0484av.h hVar, boolean z) {
        if (hVar.m4286u() == 0 || tVar.m4383e() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(hVar.m4256d(view) - hVar.m4256d(view2)) + 1;
        }
        return Math.min(abstractC0483au.mo4012f(), abstractC0483au.mo4005b(view2) - abstractC0483au.mo4001a(view));
    }

    /* JADX INFO: renamed from: a */
    static int m4453a(C0484av.t tVar, AbstractC0483au abstractC0483au, View view, View view2, C0484av.h hVar, boolean z, boolean z2) {
        if (hVar.m4286u() == 0 || tVar.m4383e() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z2 ? Math.max(0, (tVar.m4383e() - Math.max(hVar.m4256d(view), hVar.m4256d(view2))) - 1) : Math.max(0, Math.min(hVar.m4256d(view), hVar.m4256d(view2)));
        if (z) {
            return Math.round((iMax * (Math.abs(abstractC0483au.mo4005b(view2) - abstractC0483au.mo4001a(view)) / (Math.abs(hVar.m4256d(view) - hVar.m4256d(view2)) + 1))) + (abstractC0483au.mo4006c() - abstractC0483au.mo4001a(view)));
        }
        return iMax;
    }

    /* JADX INFO: renamed from: b */
    static int m4454b(C0484av.t tVar, AbstractC0483au abstractC0483au, View view, View view2, C0484av.h hVar, boolean z) {
        if (hVar.m4286u() == 0 || tVar.m4383e() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return tVar.m4383e();
        }
        return (int) (((abstractC0483au.mo4005b(view2) - abstractC0483au.mo4001a(view)) / (Math.abs(hVar.m4256d(view) - hVar.m4256d(view2)) + 1)) * tVar.m4383e());
    }
}
