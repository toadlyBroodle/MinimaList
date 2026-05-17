package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes.dex */
public abstract class afh implements afg {

    /* JADX INFO: renamed from: a */
    protected MotionEvent f6619a;

    /* JADX INFO: renamed from: j */
    protected double f6628j;

    /* JADX INFO: renamed from: k */
    protected float f6629k;

    /* JADX INFO: renamed from: l */
    protected float f6630l;

    /* JADX INFO: renamed from: m */
    protected float f6631m;

    /* JADX INFO: renamed from: n */
    protected float f6632n;

    /* JADX INFO: renamed from: p */
    protected DisplayMetrics f6634p;

    /* JADX INFO: renamed from: q */
    private double f6635q;

    /* JADX INFO: renamed from: r */
    private double f6636r;

    /* JADX INFO: renamed from: b */
    protected LinkedList<MotionEvent> f6620b = new LinkedList<>();

    /* JADX INFO: renamed from: c */
    protected long f6621c = 0;

    /* JADX INFO: renamed from: d */
    protected long f6622d = 0;

    /* JADX INFO: renamed from: e */
    protected long f6623e = 0;

    /* JADX INFO: renamed from: f */
    protected long f6624f = 0;

    /* JADX INFO: renamed from: g */
    protected long f6625g = 0;

    /* JADX INFO: renamed from: h */
    protected long f6626h = 0;

    /* JADX INFO: renamed from: i */
    protected long f6627i = 0;

    /* JADX INFO: renamed from: s */
    private boolean f6637s = false;

    /* JADX INFO: renamed from: o */
    protected boolean f6633o = false;

    protected afh(Context context) {
        try {
            if (((Boolean) bxm.m10409f().m10546a(can.f9531by)).booleanValue()) {
                C2044xk.m12571a();
            } else {
                C2047xn.m12576a();
            }
            this.f6634p = context.getResources().getDisplayMetrics();
        } catch (Throwable th) {
        }
    }

    /* JADX INFO: renamed from: a */
    private final String m7795a(Context context, String str, boolean z, View view, Activity activity, byte[] bArr) {
        C1937tl c1937tlMo7798a;
        try {
            if (z) {
                c1937tlMo7798a = mo7797a(context, view, activity);
                this.f6637s = true;
            } else {
                c1937tlMo7798a = mo7798a(context, null);
            }
            return (c1937tlMo7798a == null || c1937tlMo7798a.m10166f() == 0) ? Integer.toString(5) : C2044xk.m12568a(c1937tlMo7798a, str);
        } catch (UnsupportedEncodingException e) {
            return Integer.toString(7);
        } catch (GeneralSecurityException e2) {
            return Integer.toString(7);
        } catch (Throwable th) {
            return Integer.toString(3);
        }
    }

    /* JADX INFO: renamed from: a */
    protected abstract long mo7796a(StackTraceElement[] stackTraceElementArr);

    /* JADX INFO: renamed from: a */
    protected abstract C1937tl mo7797a(Context context, View view, Activity activity);

    /* JADX INFO: renamed from: a */
    protected abstract C1937tl mo7798a(Context context, C1921sw c1921sw);

    @Override // com.google.android.gms.internal.afg
    /* JADX INFO: renamed from: a */
    public final String mo5656a(Context context) {
        if (atq.m8327b()) {
            if (((Boolean) bxm.m10409f().m10546a(can.f9481bA)).booleanValue()) {
                throw new IllegalStateException("The caller must not be called from the UI thread.");
            }
        }
        return m7795a(context, null, false, null, null, null);
    }

    @Override // com.google.android.gms.internal.afg
    /* JADX INFO: renamed from: a */
    public final String mo5657a(Context context, String str, View view) {
        return mo5658a(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.afg
    /* JADX INFO: renamed from: a */
    public final String mo5658a(Context context, String str, View view, Activity activity) {
        return m7795a(context, str, true, view, activity, null);
    }

    @Override // com.google.android.gms.internal.afg
    /* JADX INFO: renamed from: a */
    public final void mo5659a(int i, int i2, int i3) {
        if (this.f6619a != null) {
            this.f6619a.recycle();
        }
        if (this.f6634p != null) {
            this.f6619a = MotionEvent.obtain(0L, i3, 1, i * this.f6634p.density, i2 * this.f6634p.density, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        } else {
            this.f6619a = null;
        }
        this.f6633o = false;
    }

    @Override // com.google.android.gms.internal.afg
    /* JADX INFO: renamed from: a */
    public final void mo5660a(MotionEvent motionEvent) {
        if (this.f6637s) {
            this.f6624f = 0L;
            this.f6623e = 0L;
            this.f6622d = 0L;
            this.f6621c = 0L;
            this.f6625g = 0L;
            this.f6627i = 0L;
            this.f6626h = 0L;
            Iterator<MotionEvent> it = this.f6620b.iterator();
            while (it.hasNext()) {
                it.next().recycle();
            }
            this.f6620b.clear();
            this.f6619a = null;
            this.f6637s = false;
        }
        switch (motionEvent.getAction()) {
            case 0:
                this.f6628j = 0.0d;
                this.f6635q = motionEvent.getRawX();
                this.f6636r = motionEvent.getRawY();
                break;
            case 1:
            case 2:
                double rawX = motionEvent.getRawX();
                double rawY = motionEvent.getRawY();
                double d = rawX - this.f6635q;
                double d2 = rawY - this.f6636r;
                this.f6628j = Math.sqrt((d * d) + (d2 * d2)) + this.f6628j;
                this.f6635q = rawX;
                this.f6636r = rawY;
                break;
        }
        switch (motionEvent.getAction()) {
            case 0:
                if (((Boolean) bxm.m10409f().m10546a(can.f9528bv)).booleanValue()) {
                    this.f6629k = motionEvent.getX();
                    this.f6630l = motionEvent.getY();
                    this.f6631m = motionEvent.getRawX();
                    this.f6632n = motionEvent.getRawY();
                }
                this.f6621c++;
                break;
            case 1:
                this.f6619a = MotionEvent.obtain(motionEvent);
                this.f6620b.add(this.f6619a);
                if (this.f6620b.size() > 6) {
                    this.f6620b.remove().recycle();
                }
                this.f6623e++;
                try {
                    this.f6625g = mo7796a(new Throwable().getStackTrace());
                } catch (arw e) {
                }
                break;
            case 2:
                this.f6622d += (long) (motionEvent.getHistorySize() + 1);
                try {
                    asp aspVarMo7799b = mo7799b(motionEvent);
                    if ((aspVarMo7799b == null || aspVarMo7799b.f7211d == null || aspVarMo7799b.f7214g == null) ? false : true) {
                        this.f6626h += aspVarMo7799b.f7211d.longValue() + aspVarMo7799b.f7214g.longValue();
                    }
                    if ((this.f6634p == null || aspVarMo7799b == null || aspVarMo7799b.f7212e == null || aspVarMo7799b.f7215h == null) ? false : true) {
                        this.f6627i = aspVarMo7799b.f7215h.longValue() + aspVarMo7799b.f7212e.longValue() + this.f6627i;
                    }
                } catch (arw e2) {
                }
                break;
            case 3:
                this.f6624f++;
                break;
        }
        this.f6633o = true;
    }

    @Override // com.google.android.gms.internal.afg
    /* JADX INFO: renamed from: a */
    public void mo5661a(View view) {
    }

    /* JADX INFO: renamed from: b */
    protected abstract asp mo7799b(MotionEvent motionEvent);
}
