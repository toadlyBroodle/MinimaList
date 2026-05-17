package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.google.android.gms.internal.C1617hp;
import com.google.android.gms.internal.cnb;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.overlay.h */
/* JADX INFO: loaded from: classes.dex */
@cnb
final class C0833h extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    boolean f4824a;

    /* JADX INFO: renamed from: b */
    private C1617hp f4825b;

    public C0833h(Context context, String str, String str2) {
        super(context);
        this.f4825b = new C1617hp(context, str);
        this.f4825b.m11504b(str2);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f4824a) {
            return false;
        }
        this.f4825b.m11502a(motionEvent);
        return false;
    }
}
