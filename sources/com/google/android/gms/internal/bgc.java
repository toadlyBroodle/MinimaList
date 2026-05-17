package com.google.android.gms.internal;

import com.google.firebase.database.C2268f;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class bgc {

    /* JADX INFO: renamed from: a */
    private static final bgc f8078a = new bgc();

    /* JADX INFO: renamed from: b */
    private final Map<bet, Map<String, bfd>> f8079b = new HashMap();

    /* JADX INFO: renamed from: a */
    public static bfd m9231a(bet betVar, bgb bgbVar, C2268f c2268f) {
        return f8078a.m9232b(betVar, bgbVar, c2268f);
    }

    /* JADX INFO: renamed from: b */
    private final bfd m9232b(bet betVar, bgb bgbVar, C2268f c2268f) {
        bfd bfdVar;
        betVar.m9118a();
        String str = bgbVar.f8074a;
        String str2 = bgbVar.f8076c;
        String string = new StringBuilder(String.valueOf(str).length() + 9 + String.valueOf(str2).length()).append("https://").append(str).append("/").append(str2).toString();
        synchronized (this.f8079b) {
            if (!this.f8079b.containsKey(betVar)) {
                this.f8079b.put(betVar, new HashMap());
            }
            Map<String, bfd> map = this.f8079b.get(betVar);
            if (map.containsKey(string)) {
                throw new IllegalStateException("createLocalRepo() called for existing repo.");
            }
            bfdVar = new bfd(bgbVar, betVar, c2268f);
            map.put(string, bfdVar);
        }
        return bfdVar;
    }
}
