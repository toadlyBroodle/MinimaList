package com.google.android.gms.internal;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class bkj implements bkm {

    /* JADX INFO: renamed from: a */
    private final Set<String> f8318a;

    /* JADX INFO: renamed from: b */
    private final bkn f8319b;

    public bkj(bkn bknVar, List<String> list) {
        if (list != null) {
            this.f8318a = new HashSet(list);
        } else {
            this.f8318a = null;
        }
        this.f8319b = bknVar;
    }

    @Override // com.google.android.gms.internal.bkm
    /* JADX INFO: renamed from: a */
    public final bkn mo9534a() {
        return this.f8319b;
    }

    /* JADX INFO: renamed from: a */
    protected String mo9529a(bkn bknVar, String str, String str2, long j) {
        String string = new Date(j).toString();
        String strValueOf = String.valueOf(bknVar);
        return new StringBuilder(String.valueOf(string).length() + 6 + String.valueOf(strValueOf).length() + String.valueOf(str).length() + String.valueOf(str2).length()).append(string).append(" [").append(strValueOf).append("] ").append(str).append(": ").append(str2).toString();
    }

    /* JADX INFO: renamed from: a */
    protected void mo9530a(String str, String str2) {
        System.err.println(str2);
    }

    @Override // com.google.android.gms.internal.bkm
    /* JADX INFO: renamed from: b */
    public final void mo9535b(bkn bknVar, String str, String str2, long j) {
        if (bknVar.ordinal() >= this.f8319b.ordinal() && (this.f8318a == null || bknVar.ordinal() > bkn.DEBUG.ordinal() || this.f8318a.contains(str))) {
            String strMo9529a = mo9529a(bknVar, str, str2, j);
            switch (bknVar) {
                case ERROR:
                    mo9530a(str, strMo9529a);
                    return;
                case WARN:
                    mo9531b(str, strMo9529a);
                    return;
                case INFO:
                    mo9532c(str, strMo9529a);
                    return;
                case DEBUG:
                    mo9533d(str, strMo9529a);
                    return;
                default:
                    throw new RuntimeException("Should not reach here!");
            }
        }
    }

    /* JADX INFO: renamed from: b */
    protected void mo9531b(String str, String str2) {
        System.out.println(str2);
    }

    /* JADX INFO: renamed from: c */
    protected void mo9532c(String str, String str2) {
        System.out.println(str2);
    }

    /* JADX INFO: renamed from: d */
    protected void mo9533d(String str, String str2) {
        System.out.println(str2);
    }
}
