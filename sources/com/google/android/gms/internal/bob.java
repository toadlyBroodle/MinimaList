package com.google.android.gms.internal;

import java.io.Serializable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class bob implements Serializable, Iterable<Byte> {

    /* JADX INFO: renamed from: a */
    public static final bob f8512a = new boi(bpb.f8622b);

    /* JADX INFO: renamed from: b */
    private static final bof f8513b;

    /* JADX INFO: renamed from: c */
    private int f8514c = 0;

    static {
        boc bocVar = null;
        boolean z = true;
        try {
            Class.forName("android.content.Context");
        } catch (ClassNotFoundException e) {
            z = false;
        }
        f8513b = z ? new boj(bocVar) : new bod(bocVar);
    }

    bob() {
    }

    /* JADX INFO: renamed from: a */
    public static bob m9756a(String str) {
        return new boi(str.getBytes(bpb.f8621a));
    }

    /* JADX INFO: renamed from: a */
    public static bob m9757a(byte[] bArr) {
        return m9758a(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: a */
    public static bob m9758a(byte[] bArr, int i, int i2) {
        return new boi(f8513b.mo9774a(bArr, i, i2));
    }

    /* JADX INFO: renamed from: b */
    static int m9759b(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(new StringBuilder(32).append("Beginning index: ").append(i).append(" < 0").toString());
        }
        if (i2 < i) {
            throw new IndexOutOfBoundsException(new StringBuilder(66).append("Beginning index larger than ending index: ").append(i).append(", ").append(i2).toString());
        }
        throw new IndexOutOfBoundsException(new StringBuilder(37).append("End index: ").append(i2).append(" >= ").append(i3).toString());
    }

    /* JADX INFO: renamed from: b */
    static bob m9760b(byte[] bArr) {
        return new boi(bArr);
    }

    /* JADX INFO: renamed from: b */
    static bog m9761b(int i) {
        return new bog(i, null);
    }

    /* JADX INFO: renamed from: b */
    static void m9762b(int i, int i2) {
        if (((i2 - (i + 1)) | i) < 0) {
            if (i >= 0) {
                throw new ArrayIndexOutOfBoundsException(new StringBuilder(40).append("Index > length: ").append(i).append(", ").append(i2).toString());
            }
            throw new ArrayIndexOutOfBoundsException(new StringBuilder(22).append("Index < 0: ").append(i).toString());
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract byte mo9763a(int i);

    /* JADX INFO: renamed from: a */
    public abstract int mo9764a();

    /* JADX INFO: renamed from: a */
    protected abstract int mo9765a(int i, int i2, int i3);

    /* JADX INFO: renamed from: a */
    public abstract bob mo9766a(int i, int i2);

    /* JADX INFO: renamed from: a */
    abstract void mo9767a(boa boaVar);

    /* JADX INFO: renamed from: a */
    protected abstract void mo9768a(byte[] bArr, int i, int i2, int i3);

    /* JADX INFO: renamed from: b */
    public final boolean m9769b() {
        return mo9764a() == 0;
    }

    /* JADX INFO: renamed from: c */
    public final byte[] m9770c() {
        int iMo9764a = mo9764a();
        if (iMo9764a == 0) {
            return bpb.f8622b;
        }
        byte[] bArr = new byte[iMo9764a];
        mo9768a(bArr, 0, 0, iMo9764a);
        return bArr;
    }

    /* JADX INFO: renamed from: d */
    public abstract bok mo9771d();

    /* JADX INFO: renamed from: e */
    protected final int m9772e() {
        return this.f8514c;
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iMo9765a = this.f8514c;
        if (iMo9765a == 0) {
            int iMo9764a = mo9764a();
            iMo9765a = mo9765a(iMo9764a, 0, iMo9764a);
            if (iMo9765a == 0) {
                iMo9765a = 1;
            }
            this.f8514c = iMo9765a;
        }
        return iMo9765a;
    }

    @Override // java.lang.Iterable
    public /* synthetic */ Iterator<Byte> iterator() {
        return new boc(this);
    }

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(mo9764a()));
    }
}
