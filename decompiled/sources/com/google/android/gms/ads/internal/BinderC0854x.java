package com.google.android.gms.ads.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.internal.C1560fm;
import com.google.android.gms.internal.C1617hp;
import com.google.android.gms.internal.C1670jo;
import com.google.android.gms.internal.bxm;
import com.google.android.gms.internal.byt;
import com.google.android.gms.internal.can;
import com.google.android.gms.internal.cnb;
import com.google.android.gms.p043a.BinderC0654c;
import com.google.android.gms.p043a.InterfaceC0652a;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.x */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class BinderC0854x extends byt {

    /* JADX INFO: renamed from: b */
    private static final Object f4859b = new Object();

    /* JADX INFO: renamed from: c */
    private static BinderC0854x f4860c;

    /* JADX INFO: renamed from: a */
    private final Context f4861a;

    /* JADX INFO: renamed from: d */
    private final Object f4862d = new Object();

    /* JADX INFO: renamed from: e */
    private boolean f4863e = false;

    /* JADX INFO: renamed from: f */
    private C1670jo f4864f;

    private BinderC0854x(Context context, C1670jo c1670jo) {
        this.f4861a = context;
        this.f4864f = c1670jo;
    }

    /* JADX INFO: renamed from: a */
    public static BinderC0854x m5820a(Context context, C1670jo c1670jo) {
        BinderC0854x binderC0854x;
        synchronized (f4859b) {
            if (f4860c == null) {
                f4860c = new BinderC0854x(context.getApplicationContext(), c1670jo);
            }
            binderC0854x = f4860c;
        }
        return binderC0854x;
    }

    @Override // com.google.android.gms.internal.bys
    /* JADX INFO: renamed from: a */
    public final void mo5821a() {
        synchronized (f4859b) {
            if (this.f4863e) {
                C1560fm.m11615e("Mobile ads is initialized already.");
                return;
            }
            this.f4863e = true;
            can.m10549a(this.f4861a);
            C0710au.m5573i().m11287a(this.f4861a, this.f4864f);
            C0710au.m5574j().m10343a(this.f4861a);
        }
    }

    @Override // com.google.android.gms.internal.bys
    /* JADX INFO: renamed from: a */
    public final void mo5822a(float f) {
        C0710au.m5562B().m11486a(f);
    }

    @Override // com.google.android.gms.internal.bys
    /* JADX INFO: renamed from: a */
    public final void mo5823a(InterfaceC0652a interfaceC0652a, String str) {
        if (interfaceC0652a == null) {
            C1560fm.m11612c("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) BinderC0654c.m5330a(interfaceC0652a);
        if (context == null) {
            C1560fm.m11612c("Context is null. Failed to open debug menu.");
            return;
        }
        C1617hp c1617hp = new C1617hp(context);
        c1617hp.m11503a(str);
        c1617hp.m11504b(this.f4864f.f10855a);
        c1617hp.m11501a();
    }

    @Override // com.google.android.gms.internal.bys
    /* JADX INFO: renamed from: a */
    public final void mo5824a(String str) {
        can.m10549a(this.f4861a);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (((Boolean) bxm.m10409f().m10546a(can.f9562cc)).booleanValue()) {
            C0710au.m5576l().m5650a(this.f4861a, this.f4864f, str, null);
        }
    }

    @Override // com.google.android.gms.internal.bys
    /* JADX INFO: renamed from: a */
    public final void mo5825a(String str, InterfaceC0652a interfaceC0652a) {
        RunnableC0855y runnableC0855y;
        boolean z;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        can.m10549a(this.f4861a);
        boolean zBooleanValue = ((Boolean) bxm.m10409f().m10546a(can.f9562cc)).booleanValue() | ((Boolean) bxm.m10409f().m10546a(can.f9472as)).booleanValue();
        if (((Boolean) bxm.m10409f().m10546a(can.f9472as)).booleanValue()) {
            runnableC0855y = new RunnableC0855y(this, (Runnable) BinderC0654c.m5330a(interfaceC0652a));
            z = true;
        } else {
            runnableC0855y = null;
            z = zBooleanValue;
        }
        if (z) {
            C0710au.m5576l().m5650a(this.f4861a, this.f4864f, str, runnableC0855y);
        }
    }

    @Override // com.google.android.gms.internal.bys
    /* JADX INFO: renamed from: a */
    public final void mo5826a(boolean z) {
        C0710au.m5562B().m11487a(z);
    }

    @Override // com.google.android.gms.internal.bys
    /* JADX INFO: renamed from: b */
    public final float mo5827b() {
        return C0710au.m5562B().m11485a();
    }

    @Override // com.google.android.gms.internal.bys
    /* JADX INFO: renamed from: c */
    public final boolean mo5828c() {
        return C0710au.m5562B().m11488b();
    }
}
