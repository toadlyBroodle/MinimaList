package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.C1560fm;
import com.google.android.gms.internal.C1590gp;
import com.google.android.gms.internal.C1657jb;
import com.google.android.gms.internal.C1670jo;
import com.google.android.gms.internal.afg;
import com.google.android.gms.internal.afj;
import com.google.android.gms.internal.bxm;
import com.google.android.gms.internal.can;
import com.google.android.gms.internal.cnb;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.g */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class RunnableC0742g implements afg, Runnable {

    /* JADX INFO: renamed from: a */
    private final List<Object[]> f4594a;

    /* JADX INFO: renamed from: b */
    private final AtomicReference<afg> f4595b;

    /* JADX INFO: renamed from: c */
    private Context f4596c;

    /* JADX INFO: renamed from: d */
    private C1670jo f4597d;

    /* JADX INFO: renamed from: e */
    private CountDownLatch f4598e;

    private RunnableC0742g(Context context, C1670jo c1670jo) {
        this.f4594a = new Vector();
        this.f4595b = new AtomicReference<>();
        this.f4598e = new CountDownLatch(1);
        this.f4596c = context;
        this.f4597d = c1670jo;
        bxm.m10404a();
        if (C1657jb.m11573b()) {
            C1590gp.m11370a(this);
        } else {
            run();
        }
    }

    public RunnableC0742g(ViewTreeObserverOnGlobalLayoutListenerC0711av viewTreeObserverOnGlobalLayoutListenerC0711av) {
        this(viewTreeObserverOnGlobalLayoutListenerC0711av.f4517c, viewTreeObserverOnGlobalLayoutListenerC0711av.f4519e);
    }

    /* JADX INFO: renamed from: a */
    private final boolean m5653a() {
        try {
            this.f4598e.await();
            return true;
        } catch (InterruptedException e) {
            C1560fm.m11613c("Interrupted during GADSignals creation.", e);
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    private static Context m5654b(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    /* JADX INFO: renamed from: b */
    private final void m5655b() {
        if (this.f4594a.isEmpty()) {
            return;
        }
        for (Object[] objArr : this.f4594a) {
            if (objArr.length == 1) {
                this.f4595b.get().mo5660a((MotionEvent) objArr[0]);
            } else if (objArr.length == 3) {
                this.f4595b.get().mo5659a(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
            }
        }
        this.f4594a.clear();
    }

    @Override // com.google.android.gms.internal.afg
    /* JADX INFO: renamed from: a */
    public final String mo5656a(Context context) {
        afg afgVar;
        if (!m5653a() || (afgVar = this.f4595b.get()) == null) {
            return "";
        }
        m5655b();
        return afgVar.mo5656a(m5654b(context));
    }

    @Override // com.google.android.gms.internal.afg
    /* JADX INFO: renamed from: a */
    public final String mo5657a(Context context, String str, View view) {
        return mo5658a(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.afg
    /* JADX INFO: renamed from: a */
    public final String mo5658a(Context context, String str, View view, Activity activity) {
        afg afgVar;
        if (!m5653a() || (afgVar = this.f4595b.get()) == null) {
            return "";
        }
        m5655b();
        return afgVar.mo5658a(m5654b(context), str, view, activity);
    }

    @Override // com.google.android.gms.internal.afg
    /* JADX INFO: renamed from: a */
    public final void mo5659a(int i, int i2, int i3) {
        afg afgVar = this.f4595b.get();
        if (afgVar == null) {
            this.f4594a.add(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
        } else {
            m5655b();
            afgVar.mo5659a(i, i2, i3);
        }
    }

    @Override // com.google.android.gms.internal.afg
    /* JADX INFO: renamed from: a */
    public final void mo5660a(MotionEvent motionEvent) {
        afg afgVar = this.f4595b.get();
        if (afgVar == null) {
            this.f4594a.add(new Object[]{motionEvent});
        } else {
            m5655b();
            afgVar.mo5660a(motionEvent);
        }
    }

    @Override // com.google.android.gms.internal.afg
    /* JADX INFO: renamed from: a */
    public final void mo5661a(View view) {
        afg afgVar = this.f4595b.get();
        if (afgVar != null) {
            afgVar.mo5661a(view);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f4595b.set(afj.m7805a(this.f4597d.f10855a, m5654b(this.f4596c), !((Boolean) bxm.m10409f().m10546a(can.f9479az)).booleanValue() && (this.f4597d.f10858d) == true));
        } finally {
            this.f4598e.countDown();
            this.f4596c = null;
            this.f4597d = null;
        }
    }
}
