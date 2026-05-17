package com.google.android.gms.internal;

import java.io.UnsupportedEncodingException;

/* JADX INFO: renamed from: com.google.android.gms.internal.sh */
/* JADX INFO: loaded from: classes.dex */
public class C1906sh extends cej<String> {

    /* JADX INFO: renamed from: a */
    private final cle<String> f11514a;

    public C1906sh(int i, String str, cle<String> cleVar, ckd ckdVar) {
        super(i, str, ckdVar);
        this.f11514a = cleVar;
    }

    @Override // com.google.android.gms.internal.cej
    /* JADX INFO: renamed from: a */
    protected final cjk<String> mo10758a(cch cchVar) {
        String str;
        try {
            str = new String(cchVar.f9801b, C1778no.m11903a(cchVar.f9802c));
        } catch (UnsupportedEncodingException e) {
            str = new String(cchVar.f9801b);
        }
        return cjk.m11027a(str, C1778no.m11901a(cchVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.gms.internal.cej
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo10762a(String str) {
        if (this.f11514a != null) {
            this.f11514a.mo11080a(str);
        }
    }
}
