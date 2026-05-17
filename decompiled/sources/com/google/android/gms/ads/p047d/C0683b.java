package com.google.android.gms.ads.p047d;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.C0657a;
import com.google.android.gms.ads.C0681d;
import com.google.android.gms.internal.C1668jm;
import com.google.android.gms.internal.bzh;
import com.google.android.gms.internal.cnb;

/* JADX INFO: renamed from: com.google.android.gms.ads.d.b */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C0683b extends ViewGroup {

    /* JADX INFO: renamed from: a */
    private final bzh f4394a;

    public final C0657a getAdListener() {
        return this.f4394a.m10493b();
    }

    public final C0681d getAdSize() {
        return this.f4394a.m10495c();
    }

    public final String getAdUnitId() {
        return this.f4394a.m10497e();
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
        this.f4394a.m10485a(c0657a);
    }

    public final void setAdSize(C0681d c0681d) {
        this.f4394a.m10492a(c0681d);
    }

    public final void setAdUnitId(String str) {
        this.f4394a.m10490a(str);
    }
}
