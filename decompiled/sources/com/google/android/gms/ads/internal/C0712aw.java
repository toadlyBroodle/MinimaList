package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewTreeObserver;
import android.widget.ViewSwitcher;
import com.google.android.gms.internal.C1560fm;
import com.google.android.gms.internal.C1617hp;
import com.google.android.gms.internal.C1656ja;
import com.google.android.gms.internal.InterfaceC1758mv;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.aw */
/* JADX INFO: loaded from: classes.dex */
public final class C0712aw extends ViewSwitcher {

    /* JADX INFO: renamed from: a */
    private final C1617hp f4541a;

    /* JADX INFO: renamed from: b */
    private final C1656ja f4542b;

    /* JADX INFO: renamed from: c */
    private boolean f4543c;

    public C0712aw(Context context, String str, String str2, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        super(context);
        this.f4541a = new C1617hp(context);
        this.f4541a.m11503a(str);
        this.f4541a.m11504b(str2);
        this.f4543c = true;
        if (context instanceof Activity) {
            this.f4542b = new C1656ja((Activity) context, this, onGlobalLayoutListener, onScrollChangedListener);
        } else {
            this.f4542b = new C1656ja(null, this, onGlobalLayoutListener, onScrollChangedListener);
        }
        this.f4542b.m11555a();
    }

    /* JADX INFO: renamed from: a */
    public final C1617hp m5601a() {
        return this.f4541a;
    }

    /* JADX INFO: renamed from: b */
    public final void m5602b() {
        C1560fm.m11343a("Disable position monitoring on adFrame.");
        if (this.f4542b != null) {
            this.f4542b.m11557b();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m5603c() {
        C1560fm.m11343a("Enable debug gesture detector on adFrame.");
        this.f4543c = true;
    }

    /* JADX INFO: renamed from: d */
    public final void m5604d() {
        C1560fm.m11343a("Disable debug gesture detector on adFrame.");
        this.f4543c = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f4542b != null) {
            this.f4542b.m11558c();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f4542b != null) {
            this.f4542b.m11559d();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f4543c) {
            return false;
        }
        this.f4541a.m11502a(motionEvent);
        return false;
    }

    @Override // android.widget.ViewAnimator, android.view.ViewGroup
    public final void removeAllViews() {
        int i = 0;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            KeyEvent.Callback childAt = getChildAt(i2);
            if (childAt != null && (childAt instanceof InterfaceC1758mv)) {
                arrayList.add((InterfaceC1758mv) childAt);
            }
        }
        super.removeAllViews();
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            ((InterfaceC1758mv) obj).destroy();
        }
    }
}
