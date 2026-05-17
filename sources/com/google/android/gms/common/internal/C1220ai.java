package com.google.android.gms.common.internal;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.ai */
/* JADX INFO: loaded from: classes.dex */
public final class C1220ai {

    /* JADX INFO: renamed from: a */
    private final List<String> f5843a;

    /* JADX INFO: renamed from: b */
    private final Object f5844b;

    private C1220ai(Object obj) {
        this.f5844b = C1221aj.m7065a(obj);
        this.f5843a = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public final C1220ai m7064a(String str, Object obj) {
        List<String> list = this.f5843a;
        String str2 = (String) C1221aj.m7065a(str);
        String strValueOf = String.valueOf(obj);
        list.add(new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(strValueOf).length()).append(str2).append("=").append(strValueOf).toString());
        return this;
    }

    public final String toString() {
        StringBuilder sbAppend = new StringBuilder(100).append(this.f5844b.getClass().getSimpleName()).append('{');
        int size = this.f5843a.size();
        for (int i = 0; i < size; i++) {
            sbAppend.append(this.f5843a.get(i));
            if (i < size - 1) {
                sbAppend.append(", ");
            }
        }
        return sbAppend.append('}').toString();
    }
}
