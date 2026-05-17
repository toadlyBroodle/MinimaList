package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C1221aj;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class aop implements ajz {
    @Override // com.google.android.gms.internal.ajz
    /* JADX INFO: renamed from: b */
    public final arh<?> mo8076b(aii aiiVar, arh<?>... arhVarArr) {
        String language;
        C1221aj.m7074b(arhVarArr != null);
        C1221aj.m7074b(arhVarArr.length == 0);
        Locale locale = Locale.getDefault();
        if (locale != null && (language = locale.getLanguage()) != null) {
            return new art(language.toLowerCase());
        }
        return new art("");
    }
}
