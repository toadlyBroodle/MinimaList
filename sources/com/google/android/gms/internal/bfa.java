package com.google.android.gms.internal;

import com.google.firebase.database.C2227c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class bfa implements Comparable<bfa>, Iterable<bkp> {

    /* JADX INFO: renamed from: d */
    private static final bfa f7986d = new bfa("");

    /* JADX INFO: renamed from: a */
    private final bkp[] f7987a;

    /* JADX INFO: renamed from: b */
    private final int f7988b;

    /* JADX INFO: renamed from: c */
    private final int f7989c;

    public bfa(String str) {
        int i;
        String[] strArrSplit = str.split("/");
        int i2 = 0;
        for (String str2 : strArrSplit) {
            if (str2.length() > 0) {
                i2++;
            }
        }
        this.f7987a = new bkp[i2];
        int length = strArrSplit.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            String str3 = strArrSplit[i3];
            if (str3.length() > 0) {
                i = i4 + 1;
                this.f7987a[i4] = bkp.m9549a(str3);
            } else {
                i = i4;
            }
            i3++;
            i4 = i;
        }
        this.f7988b = 0;
        this.f7989c = this.f7987a.length;
    }

    public bfa(List<String> list) {
        this.f7987a = new bkp[list.size()];
        Iterator<String> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            this.f7987a[i] = bkp.m9549a(it.next());
            i++;
        }
        this.f7988b = 0;
        this.f7989c = list.size();
    }

    public bfa(bkp... bkpVarArr) {
        this.f7987a = (bkp[]) Arrays.copyOf(bkpVarArr, bkpVarArr.length);
        this.f7988b = 0;
        this.f7989c = bkpVarArr.length;
    }

    private bfa(bkp[] bkpVarArr, int i, int i2) {
        this.f7987a = bkpVarArr;
        this.f7988b = i;
        this.f7989c = i2;
    }

    /* JADX INFO: renamed from: a */
    public static bfa m9147a() {
        return f7986d;
    }

    /* JADX INFO: renamed from: a */
    public static bfa m9148a(bfa bfaVar, bfa bfaVar2) {
        while (true) {
            bkp bkpVarM9158d = bfaVar.m9158d();
            bkp bkpVarM9158d2 = bfaVar2.m9158d();
            if (bkpVarM9158d == null) {
                return bfaVar2;
            }
            if (!bkpVarM9158d.equals(bkpVarM9158d2)) {
                String strValueOf = String.valueOf(bfaVar2);
                String strValueOf2 = String.valueOf(bfaVar);
                throw new C2227c(new StringBuilder(String.valueOf(strValueOf).length() + 37 + String.valueOf(strValueOf2).length()).append("INTERNAL ERROR: ").append(strValueOf).append(" is not contained in ").append(strValueOf2).toString());
            }
            bfaVar = bfaVar.m9159e();
            bfaVar2 = bfaVar2.m9159e();
        }
    }

    /* JADX INFO: renamed from: a */
    public final bfa m9152a(bfa bfaVar) {
        int iM9163i = m9163i() + bfaVar.m9163i();
        bkp[] bkpVarArr = new bkp[iM9163i];
        System.arraycopy(this.f7987a, this.f7988b, bkpVarArr, 0, m9163i());
        System.arraycopy(bfaVar.f7987a, bfaVar.f7988b, bkpVarArr, m9163i(), bfaVar.m9163i());
        return new bfa(bkpVarArr, 0, iM9163i);
    }

    /* JADX INFO: renamed from: a */
    public final bfa m9153a(bkp bkpVar) {
        int iM9163i = m9163i();
        bkp[] bkpVarArr = new bkp[iM9163i + 1];
        System.arraycopy(this.f7987a, this.f7988b, bkpVarArr, 0, iM9163i);
        bkpVarArr[iM9163i] = bkpVar;
        return new bfa(bkpVarArr, 0, iM9163i + 1);
    }

    /* JADX INFO: renamed from: b */
    public final String m9154b() {
        if (m9162h()) {
            return "/";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = this.f7988b; i < this.f7989c; i++) {
            if (i > this.f7988b) {
                sb.append("/");
            }
            sb.append(this.f7987a[i].m9554d());
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m9155b(bfa bfaVar) {
        if (m9163i() > bfaVar.m9163i()) {
            return false;
        }
        int i = this.f7988b;
        int i2 = bfaVar.f7988b;
        while (i < this.f7989c) {
            if (!this.f7987a[i].equals(bfaVar.f7987a[i2])) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(bfa bfaVar) {
        int i = this.f7988b;
        int i2 = bfaVar.f7988b;
        while (i < this.f7989c && i2 < bfaVar.f7989c) {
            int iCompareTo = this.f7987a[i].compareTo(bfaVar.f7987a[i2]);
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            i++;
            i2++;
        }
        if (i == this.f7989c && i2 == bfaVar.f7989c) {
            return 0;
        }
        return i == this.f7989c ? -1 : 1;
    }

    /* JADX INFO: renamed from: c */
    public final List<String> m9157c() {
        ArrayList arrayList = new ArrayList(m9163i());
        Iterator<bkp> it = iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().m9554d());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public final bkp m9158d() {
        if (m9162h()) {
            return null;
        }
        return this.f7987a[this.f7988b];
    }

    /* JADX INFO: renamed from: e */
    public final bfa m9159e() {
        int i = this.f7988b;
        if (!m9162h()) {
            i++;
        }
        return new bfa(this.f7987a, i, this.f7989c);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bfa)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        bfa bfaVar = (bfa) obj;
        if (m9163i() != bfaVar.m9163i()) {
            return false;
        }
        int i = this.f7988b;
        for (int i2 = bfaVar.f7988b; i < this.f7989c && i2 < bfaVar.f7989c; i2++) {
            if (!this.f7987a[i].equals(bfaVar.f7987a[i2])) {
                return false;
            }
            i++;
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final bfa m9160f() {
        if (m9162h()) {
            return null;
        }
        return new bfa(this.f7987a, this.f7988b, this.f7989c - 1);
    }

    /* JADX INFO: renamed from: g */
    public final bkp m9161g() {
        if (m9162h()) {
            return null;
        }
        return this.f7987a[this.f7989c - 1];
    }

    /* JADX INFO: renamed from: h */
    public final boolean m9162h() {
        return this.f7988b >= this.f7989c;
    }

    public final int hashCode() {
        int iHashCode = 0;
        for (int i = this.f7988b; i < this.f7989c; i++) {
            iHashCode = (iHashCode * 37) + this.f7987a[i].hashCode();
        }
        return iHashCode;
    }

    /* JADX INFO: renamed from: i */
    public final int m9163i() {
        return this.f7989c - this.f7988b;
    }

    @Override // java.lang.Iterable
    public final Iterator<bkp> iterator() {
        return new bfb(this);
    }

    public final String toString() {
        if (m9162h()) {
            return "/";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = this.f7988b; i < this.f7989c; i++) {
            sb.append("/");
            sb.append(this.f7987a[i].m9554d());
        }
        return sb.toString();
    }
}
