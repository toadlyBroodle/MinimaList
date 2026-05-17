package com.google.android.gms.ads.p044a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.C0657a;
import com.google.android.gms.ads.C0681d;
import com.google.android.gms.ads.C0686g;
import com.google.android.gms.ads.C0688i;
import com.google.android.gms.ads.C0857j;
import com.google.android.gms.internal.C1668jm;
import com.google.android.gms.internal.bzh;

/* JADX INFO: renamed from: com.google.android.gms.ads.a.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0661d extends ViewGroup {

    /* JADX INFO: renamed from: a */
    private final bzh f4339a;

    public final C0657a getAdListener() {
        return this.f4339a.m10493b();
    }

    public final C0681d getAdSize() {
        return this.f4339a.m10495c();
    }

    public final C0681d[] getAdSizes() {
        return this.f4339a.m10496d();
    }

    public final String getAdUnitId() {
        return this.f4339a.m10497e();
    }

    public final InterfaceC0658a getAppEventListener() {
        return this.f4339a.m10498f();
    }

    public final String getMediationAdapterClassName() {
        return this.f4339a.m10502j();
    }

    public final InterfaceC0660c getOnCustomRenderedAdLoadedListener() {
        return this.f4339a.m10499g();
    }

    public final C0688i getVideoController() {
        return this.f4339a.m10503k();
    }

    public final C0857j getVideoOptions() {
        return this.f4339a.m10505m();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
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
    protected final void onMeasure(int i, int i2) {
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

    public final void setAdListener(C0657a c0657a) {
        this.f4339a.m10485a(c0657a);
    }

    public final void setAdSizes(C0681d... c0681dArr) {
        if (c0681dArr == null || c0681dArr.length <= 0) {
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }
        this.f4339a.m10494b(c0681dArr);
    }

    public final void setAdUnitId(String str) {
        this.f4339a.m10490a(str);
    }

    public final void setAppEventListener(InterfaceC0658a interfaceC0658a) {
        this.f4339a.m10483a(interfaceC0658a);
    }

    public final void setCorrelator(C0686g c0686g) {
        this.f4339a.m10486a(c0686g);
    }

    public final void setManualImpressionsEnabled(boolean z) {
        this.f4339a.m10491a(z);
    }

    public final void setOnCustomRenderedAdLoadedListener(InterfaceC0660c interfaceC0660c) {
        this.f4339a.m10484a(interfaceC0660c);
    }

    public final void setVideoOptions(C0857j c0857j) {
        this.f4339a.m10487a(c0857j);
    }
}
