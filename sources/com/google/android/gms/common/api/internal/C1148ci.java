package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.p051b.C0965f;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.ci */
/* JADX INFO: loaded from: classes.dex */
public final class C1148ci extends AbstractC1191z<Boolean> {

    /* JADX INFO: renamed from: b */
    private C1121bi<?> f5709b;

    public C1148ci(C1121bi<?> c1121bi, C0965f<Boolean> c0965f) {
        super(4, c0965f);
        this.f5709b = c1121bi;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1191z, com.google.android.gms.common.api.internal.AbstractC1085a
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6726a(Status status) {
        super.mo6726a(status);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1191z, com.google.android.gms.common.api.internal.AbstractC1085a
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6728a(C1171f c1171f, boolean z) {
    }

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
    /*  JADX ERROR: JadxRuntimeException in pass: FinishTypeInference
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r1v4 boolean
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
        */
    @Override // com.google.android.gms.common.api.internal.AbstractC1191z
    /* JADX INFO: renamed from: b */
    public final void mo6926b(com.google.android.gms.common.api.internal.C1100ao<?> r5) {
        /*
            r4 = this;
            java.util.Map r0 = r5.m6825c()
            com.google.android.gms.common.api.internal.bi<?> r1 = r4.f5709b
            java.lang.Object r0 = r0.remove(r1)
            com.google.android.gms.common.api.internal.bm r0 = (com.google.android.gms.common.api.internal.C1125bm) r0
            if (r0 == 0) goto L1f
            com.google.android.gms.common.api.internal.cg<com.google.android.gms.common.api.a$c, ?> r1 = r0.f5664b
            com.google.android.gms.common.api.a$f r2 = r5.m6823b()
            com.google.android.gms.b.f<T> r3 = r4.f5819a
            r1.m6925a(r2, r3)
            com.google.android.gms.common.api.internal.bl<com.google.android.gms.common.api.a$c, ?> r0 = r0.f5663a
            r0.m6890a()
        L1e:
            return
        L1f:
            com.google.android.gms.b.f<T> r0 = r4.f5819a
            r1 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.m6221b(r1)
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.C1148ci.mo6926b(com.google.android.gms.common.api.internal.ao):void");
    }
}
