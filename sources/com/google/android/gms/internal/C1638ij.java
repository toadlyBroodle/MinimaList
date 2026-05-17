package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.ij */
/* JADX INFO: loaded from: classes.dex */
public final class C1638ij {

    /* JADX INFO: renamed from: e */
    private static Comparator<byte[]> f10786e = new C1666jk();

    /* JADX INFO: renamed from: a */
    private final List<byte[]> f10787a = new LinkedList();

    /* JADX INFO: renamed from: b */
    private final List<byte[]> f10788b = new ArrayList(64);

    /* JADX INFO: renamed from: c */
    private int f10789c = 0;

    /* JADX INFO: renamed from: d */
    private final int f10790d = 4096;

    public C1638ij(int i) {
    }

    /* JADX INFO: renamed from: a */
    private final synchronized void m11532a() {
        while (this.f10789c > this.f10790d) {
            byte[] bArrRemove = this.f10787a.remove(0);
            this.f10788b.remove(bArrRemove);
            this.f10789c -= bArrRemove.length;
        }
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m11533a(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length <= this.f10790d) {
                this.f10787a.add(bArr);
                int iBinarySearch = Collections.binarySearch(this.f10788b, bArr, f10786e);
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 1;
                }
                this.f10788b.add(iBinarySearch, bArr);
                this.f10789c += bArr.length;
                m11532a();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final synchronized byte[] m11534a(int i) {
        byte[] bArr;
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= this.f10788b.size()) {
                bArr = new byte[i];
                break;
            }
            bArr = this.f10788b.get(i3);
            if (bArr.length >= i) {
                this.f10789c -= bArr.length;
                this.f10788b.remove(i3);
                this.f10787a.remove(bArr);
                break;
            }
            i2 = i3 + 1;
        }
        return bArr;
    }
}
