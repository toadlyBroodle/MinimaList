package com.google.android.gms.common.api.internal;

import android.support.v4.p018i.C0207a;
import com.google.android.gms.common.C1071a;
import com.google.android.gms.common.api.C1076c;
import com.google.android.gms.common.api.C1078e;
import com.google.android.gms.p051b.AbstractC0964e;
import com.google.android.gms.p051b.C0965f;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.cm */
/* JADX INFO: loaded from: classes.dex */
public final class C1152cm {

    /* JADX INFO: renamed from: d */
    private int f5722d;

    /* JADX INFO: renamed from: b */
    private final C0207a<C1150ck<?>, String> f5720b = new C0207a<>();

    /* JADX INFO: renamed from: c */
    private final C0965f<Map<C1150ck<?>, String>> f5721c = new C0965f<>();

    /* JADX INFO: renamed from: e */
    private boolean f5723e = false;

    /* JADX INFO: renamed from: a */
    private final C0207a<C1150ck<?>, C1071a> f5719a = new C0207a<>();

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
    public C1152cm(Iterable<? extends C1078e<?>> iterable) {
        Iterator<? extends C1078e<?>> it = iterable.iterator();
        while (it.hasNext()) {
            this.f5719a.put(it.next().m6659b(), null);
        }
        this.f5722d = this.f5719a.keySet().size();
    }

    /* JADX INFO: renamed from: a */
    public final Set<C1150ck<?>> m6936a() {
        return this.f5719a.keySet();
    }

    /* JADX INFO: renamed from: a */
    public final void m6937a(C1150ck<?> c1150ck, C1071a c1071a, String str) {
        this.f5719a.put(c1150ck, c1071a);
        this.f5720b.put(c1150ck, str);
        this.f5722d--;
        if (!c1071a.m6612b()) {
            this.f5723e = true;
        }
        if (this.f5722d == 0) {
            if (!this.f5723e) {
                this.f5721c.m6219a(this.f5720b);
            } else {
                this.f5721c.m6218a(new C1076c(this.f5719a));
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC0964e<Map<C1150ck<?>, String>> m6938b() {
        return this.f5721c.m6217a();
    }
}
