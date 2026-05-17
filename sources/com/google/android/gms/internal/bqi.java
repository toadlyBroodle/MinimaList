package com.google.android.gms.internal;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes.dex */
final class bqi {

    /* JADX INFO: renamed from: a */
    private static final bqi f8654a = new bqi();

    /* JADX INFO: renamed from: b */
    private final bqm f8655b;

    /* JADX INFO: renamed from: c */
    private final ConcurrentMap<Class<?>, bql<?>> f8656c = new ConcurrentHashMap();

    private bqi() {
        bqm bqmVarM9974a = null;
        String[] strArr = {"com.google.protobuf.AndroidProto3SchemaFactory"};
        for (int i = 0; i <= 0; i++) {
            bqmVarM9974a = m9974a(strArr[0]);
            if (bqmVarM9974a != null) {
                break;
            }
        }
        this.f8655b = bqmVarM9974a == null ? new bpq() : bqmVarM9974a;
    }

    /* JADX INFO: renamed from: a */
    public static bqi m9973a() {
        return f8654a;
    }

    /* JADX INFO: renamed from: a */
    private static bqm m9974a(String str) {
        try {
            return (bqm) Class.forName(str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Throwable th) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final <T> bql<T> m9975a(Class<T> cls) {
        bpb.m9932a(cls, "messageType");
        bql<T> bqlVar = (bql) this.f8656c.get(cls);
        if (bqlVar != null) {
            return bqlVar;
        }
        bql<T> bqlVarMo9956a = this.f8655b.mo9956a(cls);
        bpb.m9932a(cls, "messageType");
        bpb.m9932a(bqlVarMo9956a, "schema");
        bql<T> bqlVar2 = (bql) this.f8656c.putIfAbsent(cls, bqlVarMo9956a);
        return bqlVar2 != null ? bqlVar2 : bqlVarMo9956a;
    }
}
