package com.google.android.gms.internal;

import android.os.Build;
import android.os.ConditionVariable;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* JADX INFO: loaded from: classes.dex */
public class afe {

    /* JADX INFO: renamed from: b */
    protected volatile Boolean f6616b;

    /* JADX INFO: renamed from: c */
    private arz f6617c;

    /* JADX INFO: renamed from: d */
    private static final ConditionVariable f6614d = new ConditionVariable();

    /* JADX INFO: renamed from: a */
    protected static volatile bwk f6613a = null;

    /* JADX INFO: renamed from: e */
    private static volatile Random f6615e = null;

    public afe(arz arzVar) {
        this.f6617c = arzVar;
        arzVar.m8253c().execute(new aff(this));
    }

    /* JADX INFO: renamed from: a */
    public static int m7790a() {
        try {
            return Build.VERSION.SDK_INT >= 21 ? ThreadLocalRandom.current().nextInt() : m7793c().nextInt();
        } catch (RuntimeException e) {
            return m7793c().nextInt();
        }
    }

    /* JADX INFO: renamed from: c */
    private static Random m7793c() {
        if (f6615e == null) {
            synchronized (afe.class) {
                if (f6615e == null) {
                    f6615e = new Random();
                }
            }
        }
        return f6615e;
    }

    /* JADX INFO: renamed from: a */
    public final void m7794a(int i, int i2, long j) {
        try {
            f6614d.block();
            if (!this.f6616b.booleanValue() || f6613a == null) {
                return;
            }
            C1918st c1918st = new C1918st();
            c1918st.f11518a = this.f6617c.f7178a.getPackageName();
            c1918st.f11519b = Long.valueOf(j);
            bwm bwmVarM10358a = f6613a.m10358a(bsc.m10164a(c1918st));
            bwmVarM10358a.m10359a(i2);
            bwmVarM10358a.m10361b(i);
            bwmVarM10358a.m10360a();
        } catch (Exception e) {
        }
    }
}
