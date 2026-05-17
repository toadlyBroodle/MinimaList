package com.google.android.gms.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class bsc {

    /* JADX INFO: renamed from: Y */
    protected volatile int f8813Y = -1;

    /* JADX INFO: renamed from: a */
    public static final <T extends bsc> T m10162a(T t, byte[] bArr) {
        return (T) m10163a(t, bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: a */
    private static <T extends bsc> T m10163a(T t, byte[] bArr, int i, int i2) throws bsb {
        try {
            brt brtVarM10078a = brt.m10078a(bArr, 0, i2);
            t.mo7776a(brtVarM10078a);
            brtVarM10078a.m10083a(0);
            return t;
        } catch (bsb e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).", e2);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final byte[] m10164a(bsc bscVar) {
        byte[] bArr = new byte[bscVar.m10166f()];
        try {
            bru bruVarM10108a = bru.m10108a(bArr, 0, bArr.length);
            bscVar.mo7777a(bruVarM10108a);
            bruVarM10108a.m10122a();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
        }
    }

    /* JADX INFO: renamed from: a */
    protected int mo7775a() {
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public abstract bsc mo7776a(brt brtVar);

    /* JADX INFO: renamed from: a */
    public void mo7777a(bru bruVar) {
    }

    @Override // 
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public bsc clone() {
        return (bsc) super.clone();
    }

    /* JADX INFO: renamed from: e */
    public final int m10165e() {
        if (this.f8813Y < 0) {
            m10166f();
        }
        return this.f8813Y;
    }

    /* JADX INFO: renamed from: f */
    public final int m10166f() {
        int iMo7775a = mo7775a();
        this.f8813Y = iMo7775a;
        return iMo7775a;
    }

    public String toString() {
        return bsd.m10167a(this);
    }
}
