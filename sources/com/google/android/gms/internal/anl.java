package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C1221aj;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes.dex */
public final class anl extends akb {
    @Override // com.google.android.gms.internal.akb
    /* JADX INFO: renamed from: a */
    protected final arh<?> mo8073a(aii aiiVar, arh<?>... arhVarArr) {
        C1221aj.m7074b(true);
        try {
            return new art(ank.m8092a(aka.m8083d(arhVarArr.length > 0 ? (arh) C1221aj.m7065a(arhVarArr[0]) : arn.f7154e), "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789-_.!~*'()"));
        } catch (UnsupportedEncodingException e) {
            return arn.f7154e;
        }
    }
}
