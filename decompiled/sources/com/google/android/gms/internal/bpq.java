package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
final class bpq implements bqm {

    /* JADX INFO: renamed from: c */
    private static final bpz f8636c = new bpr();

    /* JADX INFO: renamed from: a */
    private final bpz f8637a;

    /* JADX INFO: renamed from: b */
    private final bpu f8638b;

    public bpq() {
        this(bpu.DYNAMIC);
    }

    private bpq(bpu bpuVar) {
        this(new bpt(boy.m9895a(), m9952a()), bpuVar);
    }

    private bpq(bpz bpzVar, bpu bpuVar) {
        this.f8637a = (bpz) bpb.m9932a(bpzVar, "messageInfoFactory");
        this.f8638b = (bpu) bpb.m9932a(bpuVar, "mode");
    }

    /* JADX INFO: renamed from: a */
    private static bpz m9952a() {
        try {
            return (bpz) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception e) {
            return f8636c;
        }
    }

    /* JADX INFO: renamed from: a */
    private static <T> bql<T> m9953a(Class<T> cls, bpy bpyVar) {
        return boz.class.isAssignableFrom(cls) ? m9954a(bpyVar) ? bqe.m9968a(cls, bpyVar, bpm.m9951b(), bqn.m9981c(), bou.m9878a(), bpx.m9958b()) : bqe.m9968a(cls, bpyVar, bpm.m9951b(), bqn.m9981c(), null, bpx.m9958b()) : m9954a(bpyVar) ? bqe.m9968a(cls, bpyVar, bpm.m9950a(), bqn.m9977a(), bou.m9879b(), bpx.m9957a()) : bqe.m9968a(cls, bpyVar, bpm.m9950a(), bqn.m9980b(), null, bpx.m9957a());
    }

    /* JADX INFO: renamed from: a */
    private static boolean m9954a(bpy bpyVar) {
        return bpyVar.mo9960a() == bqh.f8651a;
    }

    /* JADX INFO: renamed from: b */
    private static <T> bql<T> m9955b(Class<T> cls, bpy bpyVar) {
        return boz.class.isAssignableFrom(cls) ? m9954a(bpyVar) ? bqe.m9969b(cls, bpyVar, bpm.m9951b(), bqn.m9981c(), bou.m9878a(), bpx.m9958b()) : bqe.m9969b(cls, bpyVar, bpm.m9951b(), bqn.m9981c(), null, bpx.m9958b()) : m9954a(bpyVar) ? bqe.m9969b(cls, bpyVar, bpm.m9950a(), bqn.m9977a(), bou.m9879b(), bpx.m9957a()) : bqe.m9969b(cls, bpyVar, bpm.m9950a(), bqn.m9980b(), null, bpx.m9957a());
    }

    @Override // com.google.android.gms.internal.bqm
    /* JADX INFO: renamed from: a */
    public final <T> bql<T> mo9956a(Class<T> cls) {
        bqn.m9979a((Class<?>) cls);
        bpy bpyVarMo9897b = this.f8637a.mo9897b(cls);
        if (bpyVarMo9897b.mo9961b()) {
            return boz.class.isAssignableFrom(cls) ? bqf.m9972a(cls, bqn.m9981c(), bou.m9878a(), bpyVarMo9897b.mo9962c()) : bqf.m9972a(cls, bqn.m9977a(), bou.m9879b(), bpyVarMo9897b.mo9962c());
        }
        switch (this.f8638b) {
            case TABLE:
                return m9953a(cls, bpyVarMo9897b);
            case LOOKUP:
                return m9955b(cls, bpyVarMo9897b);
            default:
                return bpyVarMo9897b.mo9963d() ? m9953a(cls, bpyVarMo9897b) : m9955b(cls, bpyVarMo9897b);
        }
    }
}
