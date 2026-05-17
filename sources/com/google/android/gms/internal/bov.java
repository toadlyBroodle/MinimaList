package com.google.android.gms.internal;

import com.google.android.gms.internal.box;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class bov<FieldDescriptorType extends box<FieldDescriptorType>> {

    /* JADX INFO: renamed from: d */
    private static final bov f8551d = new bov(true);

    /* JADX INFO: renamed from: b */
    private boolean f8553b;

    /* JADX INFO: renamed from: c */
    private boolean f8554c = false;

    /* JADX INFO: renamed from: a */
    private final bqo<FieldDescriptorType, Object> f8552a = bqo.m9985a(16);

    private bov() {
    }

    private bov(boolean z) {
        if (this.f8553b) {
            return;
        }
        this.f8552a.mo9994a();
        this.f8553b = true;
    }

    /* JADX INFO: renamed from: a */
    static int m9881a(brm brmVar, int i, Object obj) {
        int i2;
        int iM9823d = bon.m9823d(i);
        if (brmVar == brm.f8734j) {
            bpb.m9933a((bqa) obj);
            i2 = iM9823d << 1;
        } else {
            i2 = iM9823d;
        }
        return i2 + m9887b(brmVar, obj);
    }

    /* JADX INFO: renamed from: a */
    private static int m9882a(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        return (key.m9892c() != brr.MESSAGE || key.m9893d() || key.m9894e()) ? m9886b((box<?>) key, value) : value instanceof bph ? bon.m9809b(entry.getKey().m9890a(), (bph) value) : bon.m9826d(entry.getKey().m9890a(), (bqa) value);
    }

    /* JADX INFO: renamed from: a */
    public static <T extends box<T>> bov<T> m9883a() {
        return new bov<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: a */
    private void m9884a(FieldDescriptorType fielddescriptortype, Object obj) {
        ?? arrayList;
        if (!fielddescriptortype.m9893d()) {
            m9885a(fielddescriptortype.m9891b(), obj);
            arrayList = obj;
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            ArrayList arrayList2 = (ArrayList) arrayList;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList2.get(i);
                i++;
                m9885a(fielddescriptortype.m9891b(), obj2);
            }
        }
        if (arrayList instanceof bph) {
            this.f8554c = true;
        }
        this.f8552a.put(fielddescriptortype, arrayList);
    }

    /* JADX INFO: renamed from: a */
    private static void m9885a(brm brmVar, Object obj) {
        boolean z = false;
        bpb.m9931a(obj);
        switch (bow.f8555a[brmVar.m10077a().ordinal()]) {
            case 1:
                z = obj instanceof Integer;
                break;
            case 2:
                z = obj instanceof Long;
                break;
            case 3:
                z = obj instanceof Float;
                break;
            case 4:
                z = obj instanceof Double;
                break;
            case 5:
                z = obj instanceof Boolean;
                break;
            case 6:
                z = obj instanceof String;
                break;
            case 7:
                if ((obj instanceof bob) || (obj instanceof byte[])) {
                    z = true;
                }
                break;
            case 8:
                if ((obj instanceof Integer) || (obj instanceof bpc)) {
                    z = true;
                }
                break;
            case 9:
                if ((obj instanceof bqa) || (obj instanceof bph)) {
                    z = true;
                }
                break;
        }
        if (!z) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    /* JADX INFO: renamed from: b */
    private static int m9886b(box<?> boxVar, Object obj) {
        int iM9881a = 0;
        brm brmVarM9891b = boxVar.m9891b();
        int iM9890a = boxVar.m9890a();
        if (!boxVar.m9893d()) {
            return m9881a(brmVarM9891b, iM9890a, obj);
        }
        if (!boxVar.m9894e()) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                iM9881a += m9881a(brmVarM9891b, iM9890a, it.next());
            }
            return iM9881a;
        }
        Iterator it2 = ((List) obj).iterator();
        while (it2.hasNext()) {
            iM9881a += m9887b(brmVarM9891b, it2.next());
        }
        return bon.m9841k(iM9881a) + bon.m9823d(iM9890a) + iM9881a;
    }

    /* JADX INFO: renamed from: b */
    private static int m9887b(brm brmVar, Object obj) {
        switch (bow.f8556b[brmVar.ordinal()]) {
            case 1:
                return bon.m9803a(((Double) obj).doubleValue());
            case 2:
                return bon.m9804a(((Float) obj).floatValue());
            case 3:
                return bon.m9820c(((Long) obj).longValue());
            case 4:
                return bon.m9827d(((Long) obj).longValue());
            case 5:
                return bon.m9828e(((Integer) obj).intValue());
            case 6:
                return bon.m9833f(((Long) obj).longValue());
            case 7:
                return bon.m9837h(((Integer) obj).intValue());
            case 8:
                return bon.m9807a(((Boolean) obj).booleanValue());
            case 9:
                return bon.m9821c((bqa) obj);
            case 10:
                return obj instanceof bph ? bon.m9806a((bph) obj) : bon.m9813b((bqa) obj);
            case 11:
                return obj instanceof bob ? bon.m9812b((bob) obj) : bon.m9814b((String) obj);
            case 12:
                return obj instanceof bob ? bon.m9812b((bob) obj) : bon.m9815b((byte[]) obj);
            case 13:
                return bon.m9831f(((Integer) obj).intValue());
            case 14:
                return bon.m9839i(((Integer) obj).intValue());
            case 15:
                return bon.m9836g(((Long) obj).longValue());
            case 16:
                return bon.m9834g(((Integer) obj).intValue());
            case 17:
                return bon.m9830e(((Long) obj).longValue());
            case 18:
                return obj instanceof bpc ? bon.m9840j(((bpc) obj).mo8430a()) : bon.m9840j(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX INFO: renamed from: b */
    public final Iterator<Map.Entry<FieldDescriptorType, Object>> m9888b() {
        return this.f8554c ? new bpk(this.f8552a.entrySet().iterator()) : this.f8552a.entrySet().iterator();
    }

    /* JADX INFO: renamed from: c */
    public final int m9889c() {
        int iM9882a = 0;
        for (int i = 0; i < this.f8552a.m9997c(); i++) {
            iM9882a += m9882a(this.f8552a.m9995b(i));
        }
        Iterator it = this.f8552a.m9998d().iterator();
        while (it.hasNext()) {
            iM9882a += m9882a((Map.Entry) it.next());
        }
        return iM9882a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ Object clone() {
        bov bovVar = new bov();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.f8552a.m9997c()) {
                break;
            }
            Map.Entry<K, Object> entryM9995b = this.f8552a.m9995b(i2);
            bovVar.m9884a((box) entryM9995b.getKey(), entryM9995b.getValue());
            i = i2 + 1;
        }
        Iterator it = this.f8552a.m9998d().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            bovVar.m9884a((box) entry.getKey(), entry.getValue());
        }
        bovVar.f8554c = this.f8554c;
        return bovVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bov) {
            return this.f8552a.equals(((bov) obj).f8552a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8552a.hashCode();
    }
}
