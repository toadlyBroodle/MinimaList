package com.google.android.gms.internal;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class bmz {
    /* JADX INFO: renamed from: a */
    private static long m9683a(blh<?> blhVar) {
        long length = 8;
        if (!(blhVar instanceof blc) && !(blhVar instanceof bll)) {
            if (blhVar instanceof bko) {
                length = 4;
            } else {
                if (!(blhVar instanceof blv)) {
                    String strValueOf = String.valueOf(blhVar.getClass());
                    throw new IllegalArgumentException(new StringBuilder(String.valueOf(strValueOf).length() + 24).append("Unknown leaf node type: ").append(strValueOf).toString());
                }
                length = ((String) blhVar.mo9545a()).length() + 2;
            }
        }
        if (blhVar.mo9573f().mo9568b()) {
            return length;
        }
        return m9683a((blh<?>) blhVar.mo9573f()) + 24 + length;
    }

    /* JADX INFO: renamed from: a */
    public static long m9684a(bln blnVar) {
        long j;
        if (blnVar.mo9568b()) {
            return 4L;
        }
        if (blnVar.mo9572e()) {
            return m9683a((blh<?>) blnVar);
        }
        long jM9684a = 1;
        Iterator<blm> it = blnVar.iterator();
        while (true) {
            j = jM9684a;
            if (!it.hasNext()) {
                break;
            }
            blm next = it.next();
            jM9684a = m9684a(next.m9627d()) + j + ((long) next.m9626c().m9554d().length()) + 4;
        }
        return !blnVar.mo9573f().mo9568b() ? j + 12 + m9683a((blh<?>) blnVar.mo9573f()) : j;
    }

    /* JADX INFO: renamed from: b */
    public static int m9685b(bln blnVar) {
        int iM9685b = 0;
        if (blnVar.mo9568b()) {
            return 0;
        }
        if (blnVar.mo9572e()) {
            return 1;
        }
        Iterator<blm> it = blnVar.iterator();
        while (true) {
            int i = iM9685b;
            if (!it.hasNext()) {
                return i;
            }
            iM9685b = m9685b(it.next().m9627d()) + i;
        }
    }
}
