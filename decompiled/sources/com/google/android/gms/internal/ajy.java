package com.google.android.gms.internal;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ajy extends akb {

    /* JADX INFO: renamed from: a */
    private aii f6961a = null;

    /* JADX INFO: renamed from: b */
    private final String f6962b;

    /* JADX INFO: renamed from: c */
    private final List<String> f6963c;

    /* JADX INFO: renamed from: d */
    private final List<ars> f6964d;

    public ajy(aii aiiVar, String str, List<String> list, List<ars> list2) {
        this.f6962b = str;
        this.f6963c = list;
        this.f6964d = list2;
    }

    @Override // com.google.android.gms.internal.akb
    /* JADX INFO: renamed from: a */
    public final arh<?> mo8073a(aii aiiVar, arh<?>... arhVarArr) {
        aii aiiVarM8000a;
        Iterator<ars> it;
        try {
            aiiVarM8000a = this.f6961a.m8000a();
            for (int i = 0; i < this.f6963c.size(); i++) {
                if (arhVarArr.length > i) {
                    aiiVarM8000a.m8001a(this.f6963c.get(i), arhVarArr[i]);
                } else {
                    aiiVarM8000a.m8001a(this.f6963c.get(i), arn.f7154e);
                }
            }
            aiiVarM8000a.m8001a("arguments", new aro(Arrays.asList(arhVarArr)));
            it = this.f6964d.iterator();
        } catch (RuntimeException e) {
            String str = this.f6962b;
            String message = e.getMessage();
            ahs.m7942a(new StringBuilder(String.valueOf(str).length() + 33 + String.valueOf(message).length()).append("Internal error - Function call: ").append(str).append("\n").append(message).toString());
        }
        while (it.hasNext()) {
            arh arhVarM8226a = arv.m8226a(aiiVarM8000a, it.next());
            if ((arhVarM8226a instanceof arn) && ((arn) arhVarM8226a).m8212d()) {
                return ((arn) arhVarM8226a).mo8208b();
            }
            return arn.f7154e;
        }
        return arn.f7154e;
    }

    /* JADX INFO: renamed from: a */
    public final String m8074a() {
        return this.f6962b;
    }

    /* JADX INFO: renamed from: a */
    public final void m8075a(aii aiiVar) {
        this.f6961a = aiiVar;
    }

    public final String toString() {
        String str = this.f6962b;
        String string = this.f6963c.toString();
        String string2 = this.f6964d.toString();
        return new StringBuilder(String.valueOf(str).length() + 26 + String.valueOf(string).length() + String.valueOf(string2).length()).append(str).append("\n\tparams: ").append(string).append("\n\t: statements: ").append(string2).toString();
    }
}
