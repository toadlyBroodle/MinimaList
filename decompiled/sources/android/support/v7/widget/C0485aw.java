package android.support.v7.widget;

import android.os.Bundle;
import android.support.v4.p019j.C0227b;
import android.support.v4.p019j.p020a.C0224b;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: renamed from: android.support.v7.widget.aw */
/* JADX INFO: loaded from: classes.dex */
public class C0485aw extends C0227b {

    /* JADX INFO: renamed from: a */
    final C0484av f3399a;

    /* JADX INFO: renamed from: c */
    final C0227b f3400c = new a(this);

    /* JADX INFO: renamed from: android.support.v7.widget.aw$a */
    public static class a extends C0227b {

        /* JADX INFO: renamed from: a */
        final C0485aw f3401a;

        public a(C0485aw c0485aw) {
            this.f3401a = c0485aw;
        }

        @Override // android.support.v4.p019j.C0227b
        /* JADX INFO: renamed from: a */
        public void mo157a(View view, C0224b c0224b) {
            super.mo157a(view, c0224b);
            if (this.f3401a.m4443b() || this.f3401a.f3399a.getLayoutManager() == null) {
                return;
            }
            this.f3401a.f3399a.getLayoutManager().m4226a(view, c0224b);
        }

        @Override // android.support.v4.p019j.C0227b
        /* JADX INFO: renamed from: a */
        public boolean mo1671a(View view, int i, Bundle bundle) {
            if (super.mo1671a(view, i, bundle)) {
                return true;
            }
            if (this.f3401a.m4443b() || this.f3401a.f3399a.getLayoutManager() == null) {
                return false;
            }
            return this.f3401a.f3399a.getLayoutManager().m4238a(view, i, bundle);
        }
    }

    public C0485aw(C0484av c0484av) {
        this.f3399a = c0484av;
    }

    @Override // android.support.v4.p019j.C0227b
    /* JADX INFO: renamed from: a */
    public void mo157a(View view, C0224b c0224b) {
        super.mo157a(view, c0224b);
        c0224b.m1625b((CharSequence) C0484av.class.getName());
        if (m4443b() || this.f3399a.getLayoutManager() == null) {
            return;
        }
        this.f3399a.getLayoutManager().m4214a(c0224b);
    }

    @Override // android.support.v4.p019j.C0227b
    /* JADX INFO: renamed from: a */
    public void mo311a(View view, AccessibilityEvent accessibilityEvent) {
        super.mo311a(view, accessibilityEvent);
        accessibilityEvent.setClassName(C0484av.class.getName());
        if (!(view instanceof C0484av) || m4443b()) {
            return;
        }
        C0484av c0484av = (C0484av) view;
        if (c0484av.getLayoutManager() != null) {
            c0484av.getLayoutManager().mo3503a(accessibilityEvent);
        }
    }

    @Override // android.support.v4.p019j.C0227b
    /* JADX INFO: renamed from: a */
    public boolean mo1671a(View view, int i, Bundle bundle) {
        if (super.mo1671a(view, i, bundle)) {
            return true;
        }
        if (m4443b() || this.f3399a.getLayoutManager() == null) {
            return false;
        }
        return this.f3399a.getLayoutManager().m4229a(i, bundle);
    }

    /* JADX INFO: renamed from: b */
    boolean m4443b() {
        return this.f3399a.m4136w();
    }

    /* JADX INFO: renamed from: c */
    public C0227b m4444c() {
        return this.f3400c;
    }
}
