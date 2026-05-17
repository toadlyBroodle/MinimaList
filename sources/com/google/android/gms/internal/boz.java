package com.google.android.gms.internal;

import com.google.android.gms.internal.boz;
import com.google.android.gms.internal.boz.AbstractC1441a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class boz<MessageType extends boz<MessageType, BuilderType>, BuilderType extends AbstractC1441a<MessageType, BuilderType>> extends bnw<MessageType, BuilderType> {

    /* JADX INFO: renamed from: d */
    private static Map<Object, boz<?, ?>> f8559d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b */
    protected brc f8560b = brc.m10023a();

    /* JADX INFO: renamed from: c */
    protected int f8561c = -1;

    /* JADX INFO: renamed from: com.google.android.gms.internal.boz$a */
    public static abstract class AbstractC1441a<MessageType extends boz<MessageType, BuilderType>, BuilderType extends AbstractC1441a<MessageType, BuilderType>> extends bnx<MessageType, BuilderType> {

        /* JADX INFO: renamed from: a */
        protected MessageType f8562a;

        /* JADX INFO: renamed from: b */
        private final MessageType f8563b;

        /* JADX INFO: renamed from: c */
        private boolean f8564c = false;

        protected AbstractC1441a(MessageType messagetype) {
            this.f8563b = messagetype;
            this.f8562a = (MessageType) messagetype.mo8340a(C1447g.f8577g, null, null);
        }

        /* JADX INFO: renamed from: a */
        private static void m9908a(MessageType messagetype, MessageType messagetype2) {
            C1446f c1446f = C1446f.f8570a;
            messagetype.mo8340a(C1447g.f8572b, c1446f, messagetype2);
            messagetype.f8560b = c1446f.mo9918a(messagetype.f8560b, messagetype2.f8560b);
        }

        @Override // com.google.android.gms.internal.bnx
        /* JADX INFO: renamed from: a */
        public final /* synthetic */ bnx clone() {
            return (AbstractC1441a) clone();
        }

        @Override // com.google.android.gms.internal.bnx
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BuilderType mo9750a(MessageType messagetype) {
            m9910b();
            m9908a(this.f8562a, messagetype);
            return this;
        }

        /* JADX INFO: renamed from: b */
        protected final void m9910b() {
            if (this.f8564c) {
                MessageType messagetype = (MessageType) this.f8562a.mo8340a(C1447g.f8577g, null, null);
                m9908a(messagetype, this.f8562a);
                this.f8562a = messagetype;
                this.f8564c = false;
            }
        }

        /* JADX INFO: renamed from: c */
        public final MessageType m9911c() {
            if (this.f8564c) {
                return this.f8562a;
            }
            MessageType messagetype = this.f8562a;
            messagetype.mo8340a(C1447g.f8576f, null, null);
            messagetype.f8560b.m10032c();
            this.f8564c = true;
            return this.f8562a;
        }

        @Override // com.google.android.gms.internal.bnx
        public /* synthetic */ Object clone() {
            MessageType messagetype;
            AbstractC1441a abstractC1441a = (AbstractC1441a) this.f8563b.mo8340a(C1447g.f8578h, null, null);
            if (this.f8564c) {
                messagetype = this.f8562a;
            } else {
                MessageType messagetype2 = this.f8562a;
                messagetype2.mo8340a(C1447g.f8576f, null, null);
                messagetype2.f8560b.m10032c();
                this.f8564c = true;
                messagetype = this.f8562a;
            }
            abstractC1441a.mo9750a((boz) messagetype);
            return abstractC1441a;
        }

        /* JADX INFO: renamed from: d */
        public final MessageType m9912d() {
            MessageType messagetype;
            boolean z;
            if (this.f8564c) {
                messagetype = this.f8562a;
            } else {
                MessageType messagetype2 = this.f8562a;
                messagetype2.mo8340a(C1447g.f8576f, null, null);
                messagetype2.f8560b.m10032c();
                this.f8564c = true;
                messagetype = this.f8562a;
            }
            MessageType messagetype3 = messagetype;
            boolean zBooleanValue = Boolean.TRUE.booleanValue();
            byte bByteValue = ((Byte) messagetype3.mo8340a(C1447g.f8573c, null, null)).byteValue();
            if (bByteValue == 1) {
                z = true;
            } else if (bByteValue == 0) {
                z = false;
            } else {
                boolean z2 = messagetype3.mo8340a(C1447g.f8571a, Boolean.FALSE, null) != null;
                if (zBooleanValue) {
                    messagetype3.mo8340a(C1447g.f8574d, z2 ? messagetype3 : null, null);
                }
                z = z2;
            }
            if (z) {
                return messagetype3;
            }
            throw new bra(messagetype3);
        }

        @Override // com.google.android.gms.internal.bqb
        /* JADX INFO: renamed from: e */
        public final /* synthetic */ bqa mo9913e() {
            MessageType messagetype;
            boolean z;
            if (this.f8564c) {
                messagetype = this.f8562a;
            } else {
                MessageType messagetype2 = this.f8562a;
                messagetype2.mo8340a(C1447g.f8576f, null, null);
                messagetype2.f8560b.m10032c();
                this.f8564c = true;
                messagetype = this.f8562a;
            }
            MessageType messagetype3 = messagetype;
            boolean zBooleanValue = Boolean.TRUE.booleanValue();
            byte bByteValue = ((Byte) messagetype3.mo8340a(C1447g.f8573c, null, null)).byteValue();
            if (bByteValue == 1) {
                z = true;
            } else if (bByteValue == 0) {
                z = false;
            } else {
                boolean z2 = messagetype3.mo8340a(C1447g.f8571a, Boolean.FALSE, null) != null;
                if (zBooleanValue) {
                    messagetype3.mo8340a(C1447g.f8574d, z2 ? messagetype3 : null, null);
                }
                z = z2;
            }
            if (z) {
                return messagetype3;
            }
            throw new bra(messagetype3);
        }

        @Override // com.google.android.gms.internal.bqc
        /* JADX INFO: renamed from: n */
        public final /* synthetic */ bqa mo9907n() {
            return this.f8563b;
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.internal.boz$b */
    public static class C1442b<T extends boz<T, ?>> extends bny<T> {

        /* JADX INFO: renamed from: a */
        private T f8565a;

        public C1442b(T t) {
            this.f8565a = t;
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.internal.boz$c */
    static class C1443c implements InterfaceC1448h {

        /* JADX INFO: renamed from: a */
        static final C1443c f8566a = new C1443c();

        /* JADX INFO: renamed from: b */
        private static bpa f8567b = new bpa();

        private C1443c() {
        }

        @Override // com.google.android.gms.internal.boz.InterfaceC1448h
        /* JADX INFO: renamed from: a */
        public final int mo9914a(boolean z, int i, boolean z2, int i2) {
            if (z == z2 && i == i2) {
                return i;
            }
            throw f8567b;
        }

        @Override // com.google.android.gms.internal.boz.InterfaceC1448h
        /* JADX INFO: renamed from: a */
        public final bob mo9915a(boolean z, bob bobVar, boolean z2, bob bobVar2) {
            if (z == z2 && bobVar.equals(bobVar2)) {
                return bobVar;
            }
            throw f8567b;
        }

        @Override // com.google.android.gms.internal.boz.InterfaceC1448h
        /* JADX INFO: renamed from: a */
        public final <T> bpe<T> mo9916a(bpe<T> bpeVar, bpe<T> bpeVar2) {
            if (bpeVar.equals(bpeVar2)) {
                return bpeVar;
            }
            throw f8567b;
        }

        @Override // com.google.android.gms.internal.boz.InterfaceC1448h
        /* JADX INFO: renamed from: a */
        public final <T extends bqa> T mo9917a(T t, T t2) {
            if (t == null && t2 == null) {
                return null;
            }
            if (t == null || t2 == null) {
                throw f8567b;
            }
            boz bozVar = (boz) t;
            if (bozVar == t2 || !((boz) bozVar.mo8340a(C1447g.f8579i, (Object) null, (Object) null)).getClass().isInstance(t2)) {
                return t;
            }
            boz bozVar2 = (boz) t2;
            bozVar.mo8340a(C1447g.f8572b, this, bozVar2);
            bozVar.f8560b = mo9918a(bozVar.f8560b, bozVar2.f8560b);
            return t;
        }

        @Override // com.google.android.gms.internal.boz.InterfaceC1448h
        /* JADX INFO: renamed from: a */
        public final brc mo9918a(brc brcVar, brc brcVar2) {
            if (brcVar.equals(brcVar2)) {
                return brcVar;
            }
            throw f8567b;
        }

        @Override // com.google.android.gms.internal.boz.InterfaceC1448h
        /* JADX INFO: renamed from: a */
        public final String mo9919a(boolean z, String str, boolean z2, String str2) {
            if (z == z2 && str.equals(str2)) {
                return str;
            }
            throw f8567b;
        }

        @Override // com.google.android.gms.internal.boz.InterfaceC1448h
        /* JADX INFO: renamed from: a */
        public final boolean mo9920a(boolean z, boolean z2, boolean z3, boolean z4) {
            if (z == z3 && z2 == z4) {
                return z2;
            }
            throw f8567b;
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.internal.boz$d */
    public static abstract class AbstractC1444d<MessageType extends AbstractC1444d<MessageType, BuilderType>, BuilderType> extends boz<MessageType, BuilderType> implements bqc {

        /* JADX INFO: renamed from: d */
        protected bov<Object> f8568d = bov.m9883a();
    }

    /* JADX INFO: renamed from: com.google.android.gms.internal.boz$e */
    static class C1445e implements InterfaceC1448h {

        /* JADX INFO: renamed from: a */
        int f8569a = 0;

        C1445e() {
        }

        @Override // com.google.android.gms.internal.boz.InterfaceC1448h
        /* JADX INFO: renamed from: a */
        public final int mo9914a(boolean z, int i, boolean z2, int i2) {
            this.f8569a = (this.f8569a * 53) + i;
            return i;
        }

        @Override // com.google.android.gms.internal.boz.InterfaceC1448h
        /* JADX INFO: renamed from: a */
        public final bob mo9915a(boolean z, bob bobVar, boolean z2, bob bobVar2) {
            this.f8569a = (this.f8569a * 53) + bobVar.hashCode();
            return bobVar;
        }

        @Override // com.google.android.gms.internal.boz.InterfaceC1448h
        /* JADX INFO: renamed from: a */
        public final <T> bpe<T> mo9916a(bpe<T> bpeVar, bpe<T> bpeVar2) {
            this.f8569a = (this.f8569a * 53) + bpeVar.hashCode();
            return bpeVar;
        }

        @Override // com.google.android.gms.internal.boz.InterfaceC1448h
        /* JADX INFO: renamed from: a */
        public final <T extends bqa> T mo9917a(T t, T t2) {
            int iHashCode;
            if (t == null) {
                iHashCode = 37;
            } else if (t instanceof boz) {
                boz bozVar = (boz) t;
                if (bozVar.f8508a == 0) {
                    int i = this.f8569a;
                    this.f8569a = 0;
                    bozVar.mo8340a(C1447g.f8572b, this, bozVar);
                    bozVar.f8560b = mo9918a(bozVar.f8560b, bozVar.f8560b);
                    bozVar.f8508a = this.f8569a;
                    this.f8569a = i;
                }
                iHashCode = bozVar.f8508a;
            } else {
                iHashCode = t.hashCode();
            }
            this.f8569a = iHashCode + (this.f8569a * 53);
            return t;
        }

        @Override // com.google.android.gms.internal.boz.InterfaceC1448h
        /* JADX INFO: renamed from: a */
        public final brc mo9918a(brc brcVar, brc brcVar2) {
            this.f8569a = (this.f8569a * 53) + brcVar.hashCode();
            return brcVar;
        }

        @Override // com.google.android.gms.internal.boz.InterfaceC1448h
        /* JADX INFO: renamed from: a */
        public final String mo9919a(boolean z, String str, boolean z2, String str2) {
            this.f8569a = (this.f8569a * 53) + str.hashCode();
            return str;
        }

        @Override // com.google.android.gms.internal.boz.InterfaceC1448h
        /* JADX INFO: renamed from: a */
        public final boolean mo9920a(boolean z, boolean z2, boolean z3, boolean z4) {
            this.f8569a = (this.f8569a * 53) + bpb.m9930a(z2);
            return z2;
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.internal.boz$f */
    public static class C1446f implements InterfaceC1448h {

        /* JADX INFO: renamed from: a */
        public static final C1446f f8570a = new C1446f();

        private C1446f() {
        }

        @Override // com.google.android.gms.internal.boz.InterfaceC1448h
        /* JADX INFO: renamed from: a */
        public final int mo9914a(boolean z, int i, boolean z2, int i2) {
            return z2 ? i2 : i;
        }

        @Override // com.google.android.gms.internal.boz.InterfaceC1448h
        /* JADX INFO: renamed from: a */
        public final bob mo9915a(boolean z, bob bobVar, boolean z2, bob bobVar2) {
            return z2 ? bobVar2 : bobVar;
        }

        @Override // com.google.android.gms.internal.boz.InterfaceC1448h
        /* JADX INFO: renamed from: a */
        public final <T> bpe<T> mo9916a(bpe<T> bpeVar, bpe<T> bpeVar2) {
            int size = bpeVar.size();
            int size2 = bpeVar2.size();
            if (size > 0 && size2 > 0) {
                if (!bpeVar.mo9752a()) {
                    bpeVar = bpeVar.mo9934a(size2 + size);
                }
                bpeVar.addAll(bpeVar2);
            }
            return size > 0 ? bpeVar : bpeVar2;
        }

        @Override // com.google.android.gms.internal.boz.InterfaceC1448h
        /* JADX INFO: renamed from: a */
        public final <T extends bqa> T mo9917a(T t, T t2) {
            return (t == null || t2 == null) ? t == null ? t2 : t : (T) t.mo9906m().mo9751a(t2).mo9913e();
        }

        @Override // com.google.android.gms.internal.boz.InterfaceC1448h
        /* JADX INFO: renamed from: a */
        public final brc mo9918a(brc brcVar, brc brcVar2) {
            return brcVar2 == brc.m10023a() ? brcVar : brc.m10024a(brcVar, brcVar2);
        }

        @Override // com.google.android.gms.internal.boz.InterfaceC1448h
        /* JADX INFO: renamed from: a */
        public final String mo9919a(boolean z, String str, boolean z2, String str2) {
            return z2 ? str2 : str;
        }

        @Override // com.google.android.gms.internal.boz.InterfaceC1448h
        /* JADX INFO: renamed from: a */
        public final boolean mo9920a(boolean z, boolean z2, boolean z3, boolean z4) {
            return z3 ? z4 : z2;
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.internal.boz$g */
    public enum C1447g {

        /* JADX INFO: renamed from: a */
        public static final int f8571a = 1;

        /* JADX INFO: renamed from: b */
        public static final int f8572b = 2;

        /* JADX INFO: renamed from: c */
        public static final int f8573c = 3;

        /* JADX INFO: renamed from: d */
        public static final int f8574d = 4;

        /* JADX INFO: renamed from: e */
        public static final int f8575e = 5;

        /* JADX INFO: renamed from: f */
        public static final int f8576f = 6;

        /* JADX INFO: renamed from: g */
        public static final int f8577g = 7;

        /* JADX INFO: renamed from: h */
        public static final int f8578h = 8;

        /* JADX INFO: renamed from: i */
        public static final int f8579i = 9;

        /* JADX INFO: renamed from: j */
        public static final int f8580j = 10;

        /* JADX INFO: renamed from: m */
        private static final /* synthetic */ int[] f8583m = {f8571a, f8572b, f8573c, f8574d, f8575e, f8576f, f8577g, f8578h, f8579i, f8580j};

        /* JADX INFO: renamed from: k */
        public static final int f8581k = 1;

        /* JADX INFO: renamed from: l */
        public static final int f8582l = 2;

        /* JADX INFO: renamed from: n */
        private static final /* synthetic */ int[] f8584n = {f8581k, f8582l};

        /* JADX INFO: renamed from: a */
        public static int[] m9921a() {
            return (int[]) f8583m.clone();
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.internal.boz$h */
    public interface InterfaceC1448h {
        /* JADX INFO: renamed from: a */
        int mo9914a(boolean z, int i, boolean z2, int i2);

        /* JADX INFO: renamed from: a */
        bob mo9915a(boolean z, bob bobVar, boolean z2, bob bobVar2);

        /* JADX INFO: renamed from: a */
        <T> bpe<T> mo9916a(bpe<T> bpeVar, bpe<T> bpeVar2);

        /* JADX INFO: renamed from: a */
        <T extends bqa> T mo9917a(T t, T t2);

        /* JADX INFO: renamed from: a */
        brc mo9918a(brc brcVar, brc brcVar2);

        /* JADX INFO: renamed from: a */
        String mo9919a(boolean z, String str, boolean z2, String str2);

        /* JADX INFO: renamed from: a */
        boolean mo9920a(boolean z, boolean z2, boolean z3, boolean z4);
    }

    /* JADX INFO: renamed from: a */
    protected static <T extends boz<T, ?>> T m9898a(T t, bob bobVar) throws bpf {
        boolean z;
        boolean z2;
        aul aulVar = (T) m9899a(t, bobVar, bor.m9874a());
        if (aulVar != null) {
            boolean zBooleanValue = Boolean.TRUE.booleanValue();
            byte bByteValue = ((Byte) aulVar.mo8340a(C1447g.f8573c, (Object) null, (Object) null)).byteValue();
            if (bByteValue == 1) {
                z2 = true;
            } else if (bByteValue == 0) {
                z2 = false;
            } else {
                boolean z3 = aulVar.mo8340a(C1447g.f8571a, Boolean.FALSE, (Object) null) != null;
                if (zBooleanValue) {
                    aulVar.mo8340a(C1447g.f8574d, z3 ? aulVar : null, (Object) null);
                }
                z2 = z3;
            }
            if (!z2) {
                throw new bra(aulVar).m10019a().m9943a(aulVar);
            }
        }
        if (aulVar != null) {
            boolean zBooleanValue2 = Boolean.TRUE.booleanValue();
            byte bByteValue2 = ((Byte) aulVar.mo8340a(C1447g.f8573c, (Object) null, (Object) null)).byteValue();
            if (bByteValue2 == 1) {
                z = true;
            } else if (bByteValue2 == 0) {
                z = false;
            } else {
                boolean z4 = aulVar.mo8340a(C1447g.f8571a, Boolean.FALSE, (Object) null) != null;
                if (zBooleanValue2) {
                    aulVar.mo8340a(C1447g.f8574d, z4 ? aulVar : null, (Object) null);
                }
                z = z4;
            }
            if (!z) {
                throw new bra(aulVar).m10019a().m9943a(aulVar);
            }
        }
        return aulVar;
    }

    /* JADX INFO: renamed from: a */
    private static <T extends boz<T, ?>> T m9899a(T t, bob bobVar, bor borVar) throws bpf {
        try {
            bok bokVarMo9771d = bobVar.mo9771d();
            T t2 = (T) m9900a(t, bokVarMo9771d, borVar);
            try {
                bokVarMo9771d.mo9783a(0);
                return t2;
            } catch (bpf e) {
                throw e.m9943a(t2);
            }
        } catch (bpf e2) {
            throw e2;
        }
    }

    /* JADX INFO: renamed from: a */
    static <T extends boz<T, ?>> T m9900a(T t, bok bokVar, bor borVar) throws bpf {
        T t2 = (T) t.mo8340a(C1447g.f8577g, null, null);
        try {
            t2.mo8340a(C1447g.f8575e, bokVar, borVar);
            t2.mo8340a(C1447g.f8576f, null, null);
            t2.f8560b.m10032c();
            return t2;
        } catch (RuntimeException e) {
            if (e.getCause() instanceof bpf) {
                throw ((bpf) e.getCause());
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: a */
    protected static <T extends boz<T, ?>> T m9901a(T t, byte[] bArr) throws bpf {
        boolean z;
        aul aulVar = (T) m9902a(t, bArr, bor.m9874a());
        if (aulVar != null) {
            boolean zBooleanValue = Boolean.TRUE.booleanValue();
            byte bByteValue = ((Byte) aulVar.mo8340a(C1447g.f8573c, (Object) null, (Object) null)).byteValue();
            if (bByteValue == 1) {
                z = true;
            } else if (bByteValue == 0) {
                z = false;
            } else {
                boolean z2 = aulVar.mo8340a(C1447g.f8571a, Boolean.FALSE, (Object) null) != null;
                if (zBooleanValue) {
                    aulVar.mo8340a(C1447g.f8574d, z2 ? aulVar : null, (Object) null);
                }
                z = z2;
            }
            if (!z) {
                throw new bra(aulVar).m10019a().m9943a(aulVar);
            }
        }
        return aulVar;
    }

    /* JADX INFO: renamed from: a */
    private static <T extends boz<T, ?>> T m9902a(T t, byte[] bArr, bor borVar) throws bpf {
        try {
            bok bokVarM9779a = bok.m9779a(bArr);
            T t2 = (T) m9900a(t, bokVarM9779a, borVar);
            try {
                bokVarM9779a.mo9783a(0);
                return t2;
            } catch (bpf e) {
                throw e.m9943a(t2);
            }
        } catch (bpf e2) {
            throw e2;
        }
    }

    /* JADX INFO: renamed from: a */
    static Object m9903a(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    /* JADX INFO: renamed from: l */
    protected static <E> bpe<E> m9904l() {
        return bqj.m9976d();
    }

    /* JADX INFO: renamed from: a */
    protected abstract Object mo8340a(int i, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.bqa
    /* JADX INFO: renamed from: a */
    public void mo8341a(bon bonVar) {
        bqi.m9973a().m9975a(getClass()).mo9971a(this, bop.m9868a(bonVar));
    }

    /* JADX INFO: renamed from: a */
    protected final boolean m9905a(int i, bok bokVar) {
        if ((i & 7) == 4) {
            return false;
        }
        if (this.f8560b == brc.m10023a()) {
            this.f8560b = brc.m10026b();
        }
        return this.f8560b.m10031a(i, bokVar);
    }

    @Override // com.google.android.gms.internal.bqa
    /* JADX INFO: renamed from: d */
    public int mo8344d() {
        if (this.f8561c == -1) {
            this.f8561c = bqi.m9973a().m9975a(getClass()).mo9970a(this);
        }
        return this.f8561c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((boz) mo8340a(C1447g.f8579i, (Object) null, (Object) null)).getClass().isInstance(obj)) {
            return false;
        }
        try {
            C1443c c1443c = C1443c.f8566a;
            boz bozVar = (boz) obj;
            mo8340a(C1447g.f8572b, c1443c, bozVar);
            this.f8560b = c1443c.mo9918a(this.f8560b, bozVar.f8560b);
            return true;
        } catch (bpa e) {
            return false;
        }
    }

    public int hashCode() {
        if (this.f8508a != 0) {
            return this.f8508a;
        }
        C1445e c1445e = new C1445e();
        mo8340a(C1447g.f8572b, c1445e, this);
        this.f8560b = c1445e.mo9918a(this.f8560b, this.f8560b);
        this.f8508a = c1445e.f8569a;
        return this.f8508a;
    }

    @Override // com.google.android.gms.internal.bqa
    /* JADX INFO: renamed from: m */
    public final /* synthetic */ bqb mo9906m() {
        AbstractC1441a abstractC1441a = (AbstractC1441a) mo8340a(C1447g.f8578h, (Object) null, (Object) null);
        abstractC1441a.mo9750a(this);
        return abstractC1441a;
    }

    @Override // com.google.android.gms.internal.bqc
    /* JADX INFO: renamed from: n */
    public final /* synthetic */ bqa mo9907n() {
        return (boz) mo8340a(C1447g.f8579i, (Object) null, (Object) null);
    }

    public String toString() {
        return bqd.m9964a(this, super.toString());
    }
}
