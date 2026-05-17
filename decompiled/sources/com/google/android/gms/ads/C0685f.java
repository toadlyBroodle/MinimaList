package com.google.android.gms.ads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.p044a.InterfaceC0658a;
import com.google.android.gms.internal.C1668jm;
import com.google.android.gms.internal.bws;
import com.google.android.gms.internal.bzh;

/* JADX INFO: renamed from: com.google.android.gms.ads.f */
/* JADX INFO: loaded from: classes.dex */
class C0685f extends ViewGroup {

    /* JADX INFO: renamed from: a */
    protected final bzh f4395a;

    public C0685f(Context context, int i) {
        super(context);
        this.f4395a = new bzh(this, i);
    }

    /* JADX INFO: renamed from: a */
    public void mo5420a() {
        this.f4395a.m10501i();
    }

    /* JADX INFO: renamed from: a */
    public void mo5421a(C0676c c0676c) {
        this.f4395a.m10489a(c0676c.m5385a());
    }

    /* JADX INFO: renamed from: b */
    public void mo5422b() {
        this.f4395a.m10500h();
    }

    /* JADX INFO: renamed from: c */
    public void mo5423c() {
        this.f4395a.m10482a();
    }

    public C0657a getAdListener() {
        return this.f4395a.m10493b();
    }

    public C0681d getAdSize() {
        return this.f4395a.m10495c();
    }

    public String getAdUnitId() {
        return this.f4395a.m10497e();
    }

    public String getMediationAdapterClassName() {
        return this.f4395a.m10502j();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int i5 = ((i3 - i) - measuredWidth) / 2;
        int i6 = ((i4 - i2) - measuredHeight) / 2;
        childAt.layout(i5, i6, measuredWidth + i5, measuredHeight + i6);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        C0681d adSize;
        int iM5417b;
        int iM5415a = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            try {
                adSize = getAdSize();
            } catch (NullPointerException e) {
                C1668jm.m11611b("Unable to retrieve ad size.", e);
                adSize = null;
            }
            if (adSize != null) {
                Context context = getContext();
                iM5417b = adSize.m5417b(context);
                iM5415a = adSize.m5415a(context);
            } else {
                iM5417b = 0;
            }
        } else {
            measureChild(childAt, i, i2);
            iM5417b = childAt.getMeasuredWidth();
            iM5415a = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(iM5417b, getSuggestedMinimumWidth()), i), View.resolveSize(Math.max(iM5415a, getSuggestedMinimumHeight()), i2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setAdListener(C0657a c0657a) {
        this.f4395a.m10485a(c0657a);
        if (c0657a == 0) {
            this.f4395a.m10488a((bws) null);
            this.f4395a.m10483a((InterfaceC0658a) null);
            return;
        }
        if (c0657a instanceof bws) {
            this.f4395a.m10488a((bws) c0657a);
        }
        if (c0657a instanceof InterfaceC0658a) {
            this.f4395a.m10483a((InterfaceC0658a) c0657a);
        }
    }

    public void setAdSize(C0681d c0681d) {
        this.f4395a.m10492a(c0681d);
    }

    public void setAdUnitId(String str) {
        this.f4395a.m10490a(str);
    }
}
