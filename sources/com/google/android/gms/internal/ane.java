package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C1221aj;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class ane extends akb {
    @Override // com.google.android.gms.internal.akb
    /* JADX INFO: renamed from: a */
    protected final arh<?> mo8073a(aii aiiVar, arh<?>... arhVarArr) {
        C1221aj.m7074b(true);
        C1221aj.m7074b(arhVarArr.length == 1);
        C1221aj.m7074b(arhVarArr[0] instanceof art);
        return new art(((art) arhVarArr[0]).mo8208b().toLowerCase(Locale.ENGLISH));
    }
}
