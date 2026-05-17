package com.google.android.gms.internal;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class brz implements Cloneable {

    /* JADX INFO: renamed from: a */
    private brx<?, ?> f8779a;

    /* JADX INFO: renamed from: b */
    private Object f8780b;

    /* JADX INFO: renamed from: c */
    private List<bse> f8781c = new ArrayList();

    brz() {
    }

    /* JADX INFO: renamed from: b */
    private final byte[] m10148b() throws brv {
        byte[] bArr = new byte[m10150a()];
        m10151a(bru.m10107a(bArr));
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public brz clone() {
        int i = 0;
        brz brzVar = new brz();
        try {
            brzVar.f8779a = this.f8779a;
            if (this.f8781c == null) {
                brzVar.f8781c = null;
            } else {
                brzVar.f8781c.addAll(this.f8781c);
            }
            if (this.f8780b != null) {
                if (this.f8780b instanceof bsc) {
                    brzVar.f8780b = (bsc) ((bsc) this.f8780b).clone();
                } else if (this.f8780b instanceof byte[]) {
                    brzVar.f8780b = ((byte[]) this.f8780b).clone();
                } else if (this.f8780b instanceof byte[][]) {
                    byte[][] bArr = (byte[][]) this.f8780b;
                    byte[][] bArr2 = new byte[bArr.length][];
                    brzVar.f8780b = bArr2;
                    for (int i2 = 0; i2 < bArr.length; i2++) {
                        bArr2[i2] = (byte[]) bArr[i2].clone();
                    }
                } else if (this.f8780b instanceof boolean[]) {
                    brzVar.f8780b = ((boolean[]) this.f8780b).clone();
                } else if (this.f8780b instanceof int[]) {
                    brzVar.f8780b = ((int[]) this.f8780b).clone();
                } else if (this.f8780b instanceof long[]) {
                    brzVar.f8780b = ((long[]) this.f8780b).clone();
                } else if (this.f8780b instanceof float[]) {
                    brzVar.f8780b = ((float[]) this.f8780b).clone();
                } else if (this.f8780b instanceof double[]) {
                    brzVar.f8780b = ((double[]) this.f8780b).clone();
                } else if (this.f8780b instanceof bsc[]) {
                    bsc[] bscVarArr = (bsc[]) this.f8780b;
                    bsc[] bscVarArr2 = new bsc[bscVarArr.length];
                    brzVar.f8780b = bscVarArr2;
                    while (true) {
                        int i3 = i;
                        if (i3 >= bscVarArr.length) {
                            break;
                        }
                        bscVarArr2[i3] = (bsc) bscVarArr[i3].clone();
                        i = i3 + 1;
                    }
                }
            }
            return brzVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX INFO: renamed from: a */
    final int m10150a() {
        int length = 0;
        if (this.f8780b != null) {
            brx<?, ?> brxVar = this.f8779a;
            Object obj = this.f8780b;
            if (!brxVar.f8772c) {
                return brxVar.m10139a(obj);
            }
            int length2 = Array.getLength(obj);
            for (int i = 0; i < length2; i++) {
                if (Array.get(obj, i) != null) {
                    length += brxVar.m10139a(Array.get(obj, i));
                }
            }
            return length;
        }
        Iterator<bse> it = this.f8781c.iterator();
        while (true) {
            int i2 = length;
            if (!it.hasNext()) {
                return i2;
            }
            bse next = it.next();
            length = next.f8815b.length + bru.m10120d(next.f8814a) + 0 + i2;
        }
    }

    /* JADX INFO: renamed from: a */
    final void m10151a(bru bruVar) throws brv {
        if (this.f8780b == null) {
            for (bse bseVar : this.f8781c) {
                bruVar.m10133c(bseVar.f8814a);
                bruVar.m10135c(bseVar.f8815b);
            }
            return;
        }
        brx<?, ?> brxVar = this.f8779a;
        Object obj = this.f8780b;
        if (!brxVar.f8772c) {
            brxVar.m10140a(obj, bruVar);
            return;
        }
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            Object obj2 = Array.get(obj, i);
            if (obj2 != null) {
                brxVar.m10140a(obj2, bruVar);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    final void m10152a(bse bseVar) {
        this.f8781c.add(bseVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof brz)) {
            return false;
        }
        brz brzVar = (brz) obj;
        if (this.f8780b != null && brzVar.f8780b != null) {
            if (this.f8779a == brzVar.f8779a) {
                return !this.f8779a.f8770a.isArray() ? this.f8780b.equals(brzVar.f8780b) : this.f8780b instanceof byte[] ? Arrays.equals((byte[]) this.f8780b, (byte[]) brzVar.f8780b) : this.f8780b instanceof int[] ? Arrays.equals((int[]) this.f8780b, (int[]) brzVar.f8780b) : this.f8780b instanceof long[] ? Arrays.equals((long[]) this.f8780b, (long[]) brzVar.f8780b) : this.f8780b instanceof float[] ? Arrays.equals((float[]) this.f8780b, (float[]) brzVar.f8780b) : this.f8780b instanceof double[] ? Arrays.equals((double[]) this.f8780b, (double[]) brzVar.f8780b) : this.f8780b instanceof boolean[] ? Arrays.equals((boolean[]) this.f8780b, (boolean[]) brzVar.f8780b) : Arrays.deepEquals((Object[]) this.f8780b, (Object[]) brzVar.f8780b);
            }
            return false;
        }
        if (this.f8781c != null && brzVar.f8781c != null) {
            return this.f8781c.equals(brzVar.f8781c);
        }
        try {
            return Arrays.equals(m10148b(), brzVar.m10148b());
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    public final int hashCode() {
        try {
            return Arrays.hashCode(m10148b()) + 527;
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }
}
