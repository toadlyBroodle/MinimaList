package com.google.android.gms.internal;

import com.google.ads.C0631a;
import com.google.ads.C0632b;
import com.google.ads.mediation.C0638a;
import com.google.android.gms.ads.C0859l;
import java.util.Date;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class cjn {
    /* JADX INFO: renamed from: a */
    public static int m11028a(C0631a.a aVar) {
        switch (aVar) {
            case INVALID_REQUEST:
                return 1;
            case NETWORK_ERROR:
                return 2;
            case NO_FILL:
                return 3;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C0632b m11029a(bxb bxbVar) {
        C0632b[] c0632bArr = {C0632b.f4295a, C0632b.f4296b, C0632b.f4297c, C0632b.f4298d, C0632b.f4299e, C0632b.f4300f};
        for (int i = 0; i < 6; i++) {
            if (c0632bArr[i].m5300a() == bxbVar.f9251e && c0632bArr[i].m5301b() == bxbVar.f9248b) {
                return c0632bArr[i];
            }
        }
        return new C0632b(C0859l.m5832a(bxbVar.f9251e, bxbVar.f9248b, bxbVar.f9247a));
    }

    /* JADX INFO: renamed from: a */
    public static C0638a m11030a(bwx bwxVar, boolean z) {
        C0631a.b bVar;
        HashSet hashSet = bwxVar.f9211e != null ? new HashSet(bwxVar.f9211e) : null;
        Date date = new Date(bwxVar.f9208b);
        switch (bwxVar.f9210d) {
            case 1:
                bVar = C0631a.b.MALE;
                break;
            case 2:
                bVar = C0631a.b.FEMALE;
                break;
            default:
                bVar = C0631a.b.UNKNOWN;
                break;
        }
        return new C0638a(date, bVar, hashSet, z, bwxVar.f9217k);
    }
}
