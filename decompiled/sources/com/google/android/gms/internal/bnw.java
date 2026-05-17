package com.google.android.gms.internal;

import com.google.android.gms.internal.bnw;
import com.google.android.gms.internal.bnx;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class bnw<MessageType extends bnw<MessageType, BuilderType>, BuilderType extends bnx<MessageType, BuilderType>> implements bqa {

    /* JADX INFO: renamed from: b */
    private static boolean f8507b = false;

    /* JADX INFO: renamed from: a */
    protected int f8508a = 0;

    @Override // com.google.android.gms.internal.bqa
    /* JADX INFO: renamed from: j */
    public final bob mo9747j() {
        try {
            bog bogVarM9761b = bob.m9761b(mo8344d());
            mo8341a(bogVarM9761b.m9777b());
            return bogVarM9761b.m9776a();
        } catch (IOException e) {
            String name = getClass().getName();
            throw new RuntimeException(new StringBuilder(String.valueOf(name).length() + 62 + String.valueOf("ByteString").length()).append("Serializing ").append(name).append(" to a ").append("ByteString").append(" threw an IOException (should never happen).").toString(), e);
        }
    }

    @Override // com.google.android.gms.internal.bqa
    /* JADX INFO: renamed from: k */
    public final byte[] mo9748k() {
        try {
            byte[] bArr = new byte[mo8344d()];
            bon bonVarM9808a = bon.m9808a(bArr);
            mo8341a(bonVarM9808a);
            bonVarM9808a.m9857b();
            return bArr;
        } catch (IOException e) {
            String name = getClass().getName();
            throw new RuntimeException(new StringBuilder(String.valueOf(name).length() + 62 + String.valueOf("byte array").length()).append("Serializing ").append(name).append(" to a ").append("byte array").append(" threw an IOException (should never happen).").toString(), e);
        }
    }
}
