package com.google.android.gms.internal;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class bjd<T> {

    /* JADX INFO: renamed from: a */
    public Map<bkp, bjd<T>> f8244a = new HashMap();

    /* JADX INFO: renamed from: b */
    public T f8245b;

    /* JADX INFO: renamed from: a */
    final String m9435a(String str) {
        String strValueOf = String.valueOf(this.f8245b);
        String string = new StringBuilder(String.valueOf(str).length() + 10 + String.valueOf(strValueOf).length()).append(str).append("<value>: ").append(strValueOf).append("\n").toString();
        if (this.f8244a.isEmpty()) {
            return new StringBuilder(String.valueOf(string).length() + 7 + String.valueOf(str).length()).append(string).append(str).append("<empty>").toString();
        }
        Iterator<Map.Entry<bkp, bjd<T>>> it = this.f8244a.entrySet().iterator();
        while (true) {
            String str2 = string;
            if (!it.hasNext()) {
                return str2;
            }
            Map.Entry<bkp, bjd<T>> next = it.next();
            String strValueOf2 = String.valueOf(str2);
            String strValueOf3 = String.valueOf(next.getKey());
            String strM9435a = next.getValue().m9435a(String.valueOf(str).concat("\t"));
            string = new StringBuilder(String.valueOf(strValueOf2).length() + 3 + String.valueOf(str).length() + String.valueOf(strValueOf3).length() + String.valueOf(strM9435a).length()).append(strValueOf2).append(str).append(strValueOf3).append(":\n").append(strM9435a).append("\n").toString();
        }
    }
}
