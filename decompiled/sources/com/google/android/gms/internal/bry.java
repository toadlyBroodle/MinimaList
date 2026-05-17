package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bry implements Cloneable {

    /* JADX INFO: renamed from: a */
    private static final brz f8774a = new brz();

    /* JADX INFO: renamed from: b */
    private boolean f8775b;

    /* JADX INFO: renamed from: c */
    private int[] f8776c;

    /* JADX INFO: renamed from: d */
    private brz[] f8777d;

    /* JADX INFO: renamed from: e */
    private int f8778e;

    bry() {
        this(10);
    }

    private bry(int i) {
        this.f8775b = false;
        int iM10141c = m10141c(i);
        this.f8776c = new int[iM10141c];
        this.f8777d = new brz[iM10141c];
        this.f8778e = 0;
    }

    /* JADX INFO: renamed from: c */
    private static int m10141c(int i) {
        int i2 = i << 2;
        int i3 = 4;
        while (true) {
            if (i3 >= 32) {
                break;
            }
            if (i2 <= (1 << i3) - 12) {
                i2 = (1 << i3) - 12;
                break;
            }
            i3++;
        }
        return i2 / 4;
    }

    /* JADX INFO: renamed from: d */
    private final int m10142d(int i) {
        int i2 = 0;
        int i3 = this.f8778e - 1;
        while (i2 <= i3) {
            int i4 = (i2 + i3) >>> 1;
            int i5 = this.f8776c[i4];
            if (i5 < i) {
                i2 = i4 + 1;
            } else {
                if (i5 <= i) {
                    return i4;
                }
                i3 = i4 - 1;
            }
        }
        return i2 ^ (-1);
    }

    /* JADX INFO: renamed from: a */
    final int m10143a() {
        return this.f8778e;
    }

    /* JADX INFO: renamed from: a */
    final brz m10144a(int i) {
        int iM10142d = m10142d(i);
        if (iM10142d < 0 || this.f8777d[iM10142d] == f8774a) {
            return null;
        }
        return this.f8777d[iM10142d];
    }

    /* JADX INFO: renamed from: a */
    final void m10145a(int i, brz brzVar) {
        int iM10142d = m10142d(i);
        if (iM10142d >= 0) {
            this.f8777d[iM10142d] = brzVar;
            return;
        }
        int i2 = iM10142d ^ (-1);
        if (i2 < this.f8778e && this.f8777d[i2] == f8774a) {
            this.f8776c[i2] = i;
            this.f8777d[i2] = brzVar;
            return;
        }
        if (this.f8778e >= this.f8776c.length) {
            int iM10141c = m10141c(this.f8778e + 1);
            int[] iArr = new int[iM10141c];
            brz[] brzVarArr = new brz[iM10141c];
            System.arraycopy(this.f8776c, 0, iArr, 0, this.f8776c.length);
            System.arraycopy(this.f8777d, 0, brzVarArr, 0, this.f8777d.length);
            this.f8776c = iArr;
            this.f8777d = brzVarArr;
        }
        if (this.f8778e - i2 != 0) {
            System.arraycopy(this.f8776c, i2, this.f8776c, i2 + 1, this.f8778e - i2);
            System.arraycopy(this.f8777d, i2, this.f8777d, i2 + 1, this.f8778e - i2);
        }
        this.f8776c[i2] = i;
        this.f8777d[i2] = brzVar;
        this.f8778e++;
    }

    /* JADX INFO: renamed from: b */
    final brz m10146b(int i) {
        return this.f8777d[i];
    }

    /* JADX INFO: renamed from: b */
    public final boolean m10147b() {
        return this.f8778e == 0;
    }

    public final /* synthetic */ Object clone() {
        int i = this.f8778e;
        bry bryVar = new bry(i);
        System.arraycopy(this.f8776c, 0, bryVar.f8776c, 0, i);
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f8777d[i2] != null) {
                bryVar.f8777d[i2] = (brz) this.f8777d[i2].clone();
            }
        }
        bryVar.f8778e = i;
        return bryVar;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bry)) {
            return false;
        }
        bry bryVar = (bry) obj;
        if (this.f8778e != bryVar.f8778e) {
            return false;
        }
        int[] iArr = this.f8776c;
        int[] iArr2 = bryVar.f8776c;
        int i = this.f8778e;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                z = true;
                break;
            }
            if (iArr[i2] != iArr2[i2]) {
                z = false;
                break;
            }
            i2++;
        }
        if (z) {
            brz[] brzVarArr = this.f8777d;
            brz[] brzVarArr2 = bryVar.f8777d;
            int i3 = this.f8778e;
            int i4 = 0;
            while (true) {
                if (i4 >= i3) {
                    z2 = true;
                    break;
                }
                if (!brzVarArr[i4].equals(brzVarArr2[i4])) {
                    z2 = false;
                    break;
                }
                i4++;
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = 17;
        for (int i = 0; i < this.f8778e; i++) {
            iHashCode = (((iHashCode * 31) + this.f8776c[i]) * 31) + this.f8777d[i].hashCode();
        }
        return iHashCode;
    }
}
