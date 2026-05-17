package com.google.p036a.p038b.p039a;

import com.google.p036a.AbstractC0619j;
import com.google.p036a.AbstractC0629t;
import com.google.p036a.C0614e;
import com.google.p036a.C0616g;
import com.google.p036a.C0620k;
import com.google.p036a.C0621l;
import com.google.p036a.C0622m;
import com.google.p036a.C0624o;
import com.google.p036a.C0627r;
import com.google.p036a.InterfaceC0630u;
import com.google.p036a.p037a.InterfaceC0577c;
import com.google.p036a.p038b.C0601f;
import com.google.p036a.p041c.C0608a;
import com.google.p036a.p042d.C0610a;
import com.google.p036a.p042d.C0612c;
import com.google.p036a.p042d.EnumC0611b;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* JADX INFO: renamed from: com.google.a.b.a.n */
/* JADX INFO: loaded from: classes.dex */
public final class C0596n {

    /* JADX INFO: renamed from: a */
    public static final AbstractC0629t<Class> f4087a = new AbstractC0629t<Class>() { // from class: com.google.a.b.a.n.1
        @Override // com.google.p036a.AbstractC0629t
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Class mo5040b(C0610a c0610a) throws IOException {
            if (c0610a.mo5061f() != EnumC0611b.NULL) {
                throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
            }
            c0610a.mo5065j();
            return null;
        }

        @Override // com.google.p036a.AbstractC0629t
        /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo5039a(C0612c c0612c, Class cls) throws IOException {
            if (cls != null) {
                throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?");
            }
            c0612c.mo5085f();
        }
    };

    /* JADX INFO: renamed from: b */
    public static final InterfaceC0630u f4088b = m5102a(Class.class, f4087a);

    /* JADX INFO: renamed from: c */
    public static final AbstractC0629t<BitSet> f4089c = new AbstractC0629t<BitSet>() { // from class: com.google.a.b.a.n.12
        @Override // com.google.p036a.AbstractC0629t
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BitSet mo5040b(C0610a c0610a) throws IOException {
            boolean zMo5064i;
            if (c0610a.mo5061f() == EnumC0611b.NULL) {
                c0610a.mo5065j();
                return null;
            }
            BitSet bitSet = new BitSet();
            c0610a.mo5056a();
            EnumC0611b enumC0611bMo5061f = c0610a.mo5061f();
            int i = 0;
            while (enumC0611bMo5061f != EnumC0611b.END_ARRAY) {
                switch (AnonymousClass29.f4127a[enumC0611bMo5061f.ordinal()]) {
                    case 1:
                        zMo5064i = c0610a.mo5068m() != 0;
                        break;
                    case 2:
                        zMo5064i = c0610a.mo5064i();
                        break;
                    case 3:
                        String strMo5063h = c0610a.mo5063h();
                        try {
                            zMo5064i = Integer.parseInt(strMo5063h) != 0;
                        } catch (NumberFormatException e) {
                            throw new C0627r("Error: Expecting: bitset number value (1, 0), Found: " + strMo5063h);
                        }
                        break;
                    default:
                        throw new C0627r("Invalid bitset value type: " + enumC0611bMo5061f);
                }
                if (zMo5064i) {
                    bitSet.set(i);
                }
                i++;
                enumC0611bMo5061f = c0610a.mo5061f();
            }
            c0610a.mo5057b();
            return bitSet;
        }

        @Override // com.google.p036a.AbstractC0629t
        /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo5039a(C0612c c0612c, BitSet bitSet) throws IOException {
            if (bitSet == null) {
                c0612c.mo5085f();
                return;
            }
            c0612c.mo5080b();
            for (int i = 0; i < bitSet.length(); i++) {
                c0612c.mo5074a(bitSet.get(i) ? 1 : 0);
            }
            c0612c.mo5082c();
        }
    };

    /* JADX INFO: renamed from: d */
    public static final InterfaceC0630u f4090d = m5102a(BitSet.class, f4089c);

    /* JADX INFO: renamed from: e */
    public static final AbstractC0629t<Boolean> f4091e = new AbstractC0629t<Boolean>() { // from class: com.google.a.b.a.n.23
        @Override // com.google.p036a.AbstractC0629t
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean mo5040b(C0610a c0610a) throws IOException {
            if (c0610a.mo5061f() != EnumC0611b.NULL) {
                return c0610a.mo5061f() == EnumC0611b.STRING ? Boolean.valueOf(Boolean.parseBoolean(c0610a.mo5063h())) : Boolean.valueOf(c0610a.mo5064i());
            }
            c0610a.mo5065j();
            return null;
        }

        @Override // com.google.p036a.AbstractC0629t
        /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo5039a(C0612c c0612c, Boolean bool) throws IOException {
            c0612c.mo5075a(bool);
        }
    };

    /* JADX INFO: renamed from: f */
    public static final AbstractC0629t<Boolean> f4092f = new AbstractC0629t<Boolean>() { // from class: com.google.a.b.a.n.30
        @Override // com.google.p036a.AbstractC0629t
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean mo5040b(C0610a c0610a) throws IOException {
            if (c0610a.mo5061f() != EnumC0611b.NULL) {
                return Boolean.valueOf(c0610a.mo5063h());
            }
            c0610a.mo5065j();
            return null;
        }

        @Override // com.google.p036a.AbstractC0629t
        /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo5039a(C0612c c0612c, Boolean bool) throws IOException {
            c0612c.mo5081b(bool == null ? "null" : bool.toString());
        }
    };

    /* JADX INFO: renamed from: g */
    public static final InterfaceC0630u f4093g = m5103a(Boolean.TYPE, Boolean.class, f4091e);

    /* JADX INFO: renamed from: h */
    public static final AbstractC0629t<Number> f4094h = new AbstractC0629t<Number>() { // from class: com.google.a.b.a.n.31
        @Override // com.google.p036a.AbstractC0629t
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Number mo5040b(C0610a c0610a) throws IOException {
            if (c0610a.mo5061f() == EnumC0611b.NULL) {
                c0610a.mo5065j();
                return null;
            }
            try {
                return Byte.valueOf((byte) c0610a.mo5068m());
            } catch (NumberFormatException e) {
                throw new C0627r(e);
            }
        }

        @Override // com.google.p036a.AbstractC0629t
        /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo5039a(C0612c c0612c, Number number) throws IOException {
            c0612c.mo5076a(number);
        }
    };

    /* JADX INFO: renamed from: i */
    public static final InterfaceC0630u f4095i = m5103a(Byte.TYPE, Byte.class, f4094h);

    /* JADX INFO: renamed from: j */
    public static final AbstractC0629t<Number> f4096j = new AbstractC0629t<Number>() { // from class: com.google.a.b.a.n.32
        @Override // com.google.p036a.AbstractC0629t
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Number mo5040b(C0610a c0610a) throws IOException {
            if (c0610a.mo5061f() == EnumC0611b.NULL) {
                c0610a.mo5065j();
                return null;
            }
            try {
                return Short.valueOf((short) c0610a.mo5068m());
            } catch (NumberFormatException e) {
                throw new C0627r(e);
            }
        }

        @Override // com.google.p036a.AbstractC0629t
        /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo5039a(C0612c c0612c, Number number) throws IOException {
            c0612c.mo5076a(number);
        }
    };

    /* JADX INFO: renamed from: k */
    public static final InterfaceC0630u f4097k = m5103a(Short.TYPE, Short.class, f4096j);

    /* JADX INFO: renamed from: l */
    public static final AbstractC0629t<Number> f4098l = new AbstractC0629t<Number>() { // from class: com.google.a.b.a.n.33
        @Override // com.google.p036a.AbstractC0629t
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Number mo5040b(C0610a c0610a) throws IOException {
            if (c0610a.mo5061f() == EnumC0611b.NULL) {
                c0610a.mo5065j();
                return null;
            }
            try {
                return Integer.valueOf(c0610a.mo5068m());
            } catch (NumberFormatException e) {
                throw new C0627r(e);
            }
        }

        @Override // com.google.p036a.AbstractC0629t
        /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo5039a(C0612c c0612c, Number number) throws IOException {
            c0612c.mo5076a(number);
        }
    };

    /* JADX INFO: renamed from: m */
    public static final InterfaceC0630u f4099m = m5103a(Integer.TYPE, Integer.class, f4098l);

    /* JADX INFO: renamed from: n */
    public static final AbstractC0629t<AtomicInteger> f4100n = new AbstractC0629t<AtomicInteger>() { // from class: com.google.a.b.a.n.34
        @Override // com.google.p036a.AbstractC0629t
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AtomicInteger mo5040b(C0610a c0610a) {
            try {
                return new AtomicInteger(c0610a.mo5068m());
            } catch (NumberFormatException e) {
                throw new C0627r(e);
            }
        }

        @Override // com.google.p036a.AbstractC0629t
        /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo5039a(C0612c c0612c, AtomicInteger atomicInteger) throws IOException {
            c0612c.mo5074a(atomicInteger.get());
        }
    }.m5299a();

    /* JADX INFO: renamed from: o */
    public static final InterfaceC0630u f4101o = m5102a(AtomicInteger.class, f4100n);

    /* JADX INFO: renamed from: p */
    public static final AbstractC0629t<AtomicBoolean> f4102p = new AbstractC0629t<AtomicBoolean>() { // from class: com.google.a.b.a.n.35
        @Override // com.google.p036a.AbstractC0629t
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AtomicBoolean mo5040b(C0610a c0610a) {
            return new AtomicBoolean(c0610a.mo5064i());
        }

        @Override // com.google.p036a.AbstractC0629t
        /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo5039a(C0612c c0612c, AtomicBoolean atomicBoolean) throws IOException {
            c0612c.mo5078a(atomicBoolean.get());
        }
    }.m5299a();

    /* JADX INFO: renamed from: q */
    public static final InterfaceC0630u f4103q = m5102a(AtomicBoolean.class, f4102p);

    /* JADX INFO: renamed from: r */
    public static final AbstractC0629t<AtomicIntegerArray> f4104r = new AbstractC0629t<AtomicIntegerArray>() { // from class: com.google.a.b.a.n.2
        @Override // com.google.p036a.AbstractC0629t
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AtomicIntegerArray mo5040b(C0610a c0610a) throws IOException {
            ArrayList arrayList = new ArrayList();
            c0610a.mo5056a();
            while (c0610a.mo5060e()) {
                try {
                    arrayList.add(Integer.valueOf(c0610a.mo5068m()));
                } catch (NumberFormatException e) {
                    throw new C0627r(e);
                }
            }
            c0610a.mo5057b();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i = 0; i < size; i++) {
                atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
            }
            return atomicIntegerArray;
        }

        @Override // com.google.p036a.AbstractC0629t
        /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo5039a(C0612c c0612c, AtomicIntegerArray atomicIntegerArray) throws IOException {
            c0612c.mo5080b();
            int length = atomicIntegerArray.length();
            for (int i = 0; i < length; i++) {
                c0612c.mo5074a(atomicIntegerArray.get(i));
            }
            c0612c.mo5082c();
        }
    }.m5299a();

    /* JADX INFO: renamed from: s */
    public static final InterfaceC0630u f4105s = m5102a(AtomicIntegerArray.class, f4104r);

    /* JADX INFO: renamed from: t */
    public static final AbstractC0629t<Number> f4106t = new AbstractC0629t<Number>() { // from class: com.google.a.b.a.n.3
        @Override // com.google.p036a.AbstractC0629t
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Number mo5040b(C0610a c0610a) throws IOException {
            if (c0610a.mo5061f() == EnumC0611b.NULL) {
                c0610a.mo5065j();
                return null;
            }
            try {
                return Long.valueOf(c0610a.mo5067l());
            } catch (NumberFormatException e) {
                throw new C0627r(e);
            }
        }

        @Override // com.google.p036a.AbstractC0629t
        /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo5039a(C0612c c0612c, Number number) throws IOException {
            c0612c.mo5076a(number);
        }
    };

    /* JADX INFO: renamed from: u */
    public static final AbstractC0629t<Number> f4107u = new AbstractC0629t<Number>() { // from class: com.google.a.b.a.n.4
        @Override // com.google.p036a.AbstractC0629t
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Number mo5040b(C0610a c0610a) throws IOException {
            if (c0610a.mo5061f() != EnumC0611b.NULL) {
                return Float.valueOf((float) c0610a.mo5066k());
            }
            c0610a.mo5065j();
            return null;
        }

        @Override // com.google.p036a.AbstractC0629t
        /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo5039a(C0612c c0612c, Number number) throws IOException {
            c0612c.mo5076a(number);
        }
    };

    /* JADX INFO: renamed from: v */
    public static final AbstractC0629t<Number> f4108v = new AbstractC0629t<Number>() { // from class: com.google.a.b.a.n.5
        @Override // com.google.p036a.AbstractC0629t
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Number mo5040b(C0610a c0610a) throws IOException {
            if (c0610a.mo5061f() != EnumC0611b.NULL) {
                return Double.valueOf(c0610a.mo5066k());
            }
            c0610a.mo5065j();
            return null;
        }

        @Override // com.google.p036a.AbstractC0629t
        /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo5039a(C0612c c0612c, Number number) throws IOException {
            c0612c.mo5076a(number);
        }
    };

    /* JADX INFO: renamed from: w */
    public static final AbstractC0629t<Number> f4109w = new AbstractC0629t<Number>() { // from class: com.google.a.b.a.n.6
        @Override // com.google.p036a.AbstractC0629t
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Number mo5040b(C0610a c0610a) throws IOException {
            EnumC0611b enumC0611bMo5061f = c0610a.mo5061f();
            switch (enumC0611bMo5061f) {
                case NUMBER:
                    return new C0601f(c0610a.mo5063h());
                case BOOLEAN:
                case STRING:
                default:
                    throw new C0627r("Expecting number, got: " + enumC0611bMo5061f);
                case NULL:
                    c0610a.mo5065j();
                    return null;
            }
        }

        @Override // com.google.p036a.AbstractC0629t
        /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo5039a(C0612c c0612c, Number number) throws IOException {
            c0612c.mo5076a(number);
        }
    };

    /* JADX INFO: renamed from: x */
    public static final InterfaceC0630u f4110x = m5102a(Number.class, f4109w);

    /* JADX INFO: renamed from: y */
    public static final AbstractC0629t<Character> f4111y = new AbstractC0629t<Character>() { // from class: com.google.a.b.a.n.7
        @Override // com.google.p036a.AbstractC0629t
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Character mo5040b(C0610a c0610a) throws IOException {
            if (c0610a.mo5061f() == EnumC0611b.NULL) {
                c0610a.mo5065j();
                return null;
            }
            String strMo5063h = c0610a.mo5063h();
            if (strMo5063h.length() != 1) {
                throw new C0627r("Expecting character, got: " + strMo5063h);
            }
            return Character.valueOf(strMo5063h.charAt(0));
        }

        @Override // com.google.p036a.AbstractC0629t
        /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo5039a(C0612c c0612c, Character ch) throws IOException {
            c0612c.mo5081b(ch == null ? null : String.valueOf(ch));
        }
    };

    /* JADX INFO: renamed from: z */
    public static final InterfaceC0630u f4112z = m5103a(Character.TYPE, Character.class, f4111y);

    /* JADX INFO: renamed from: A */
    public static final AbstractC0629t<String> f4061A = new AbstractC0629t<String>() { // from class: com.google.a.b.a.n.8
        @Override // com.google.p036a.AbstractC0629t
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String mo5040b(C0610a c0610a) throws IOException {
            EnumC0611b enumC0611bMo5061f = c0610a.mo5061f();
            if (enumC0611bMo5061f != EnumC0611b.NULL) {
                return enumC0611bMo5061f == EnumC0611b.BOOLEAN ? Boolean.toString(c0610a.mo5064i()) : c0610a.mo5063h();
            }
            c0610a.mo5065j();
            return null;
        }

        @Override // com.google.p036a.AbstractC0629t
        /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo5039a(C0612c c0612c, String str) throws IOException {
            c0612c.mo5081b(str);
        }
    };

    /* JADX INFO: renamed from: B */
    public static final AbstractC0629t<BigDecimal> f4062B = new AbstractC0629t<BigDecimal>() { // from class: com.google.a.b.a.n.9
        @Override // com.google.p036a.AbstractC0629t
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BigDecimal mo5040b(C0610a c0610a) throws IOException {
            if (c0610a.mo5061f() == EnumC0611b.NULL) {
                c0610a.mo5065j();
                return null;
            }
            try {
                return new BigDecimal(c0610a.mo5063h());
            } catch (NumberFormatException e) {
                throw new C0627r(e);
            }
        }

        @Override // com.google.p036a.AbstractC0629t
        /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo5039a(C0612c c0612c, BigDecimal bigDecimal) throws IOException {
            c0612c.mo5076a(bigDecimal);
        }
    };

    /* JADX INFO: renamed from: C */
    public static final AbstractC0629t<BigInteger> f4063C = new AbstractC0629t<BigInteger>() { // from class: com.google.a.b.a.n.10
        @Override // com.google.p036a.AbstractC0629t
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BigInteger mo5040b(C0610a c0610a) throws IOException {
            if (c0610a.mo5061f() == EnumC0611b.NULL) {
                c0610a.mo5065j();
                return null;
            }
            try {
                return new BigInteger(c0610a.mo5063h());
            } catch (NumberFormatException e) {
                throw new C0627r(e);
            }
        }

        @Override // com.google.p036a.AbstractC0629t
        /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo5039a(C0612c c0612c, BigInteger bigInteger) throws IOException {
            c0612c.mo5076a(bigInteger);
        }
    };

    /* JADX INFO: renamed from: D */
    public static final InterfaceC0630u f4064D = m5102a(String.class, f4061A);

    /* JADX INFO: renamed from: E */
    public static final AbstractC0629t<StringBuilder> f4065E = new AbstractC0629t<StringBuilder>() { // from class: com.google.a.b.a.n.11
        @Override // com.google.p036a.AbstractC0629t
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public StringBuilder mo5040b(C0610a c0610a) throws IOException {
            if (c0610a.mo5061f() != EnumC0611b.NULL) {
                return new StringBuilder(c0610a.mo5063h());
            }
            c0610a.mo5065j();
            return null;
        }

        @Override // com.google.p036a.AbstractC0629t
        /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo5039a(C0612c c0612c, StringBuilder sb) throws IOException {
            c0612c.mo5081b(sb == null ? null : sb.toString());
        }
    };

    /* JADX INFO: renamed from: F */
    public static final InterfaceC0630u f4066F = m5102a(StringBuilder.class, f4065E);

    /* JADX INFO: renamed from: G */
    public static final AbstractC0629t<StringBuffer> f4067G = new AbstractC0629t<StringBuffer>() { // from class: com.google.a.b.a.n.13
        @Override // com.google.p036a.AbstractC0629t
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public StringBuffer mo5040b(C0610a c0610a) throws IOException {
            if (c0610a.mo5061f() != EnumC0611b.NULL) {
                return new StringBuffer(c0610a.mo5063h());
            }
            c0610a.mo5065j();
            return null;
        }

        @Override // com.google.p036a.AbstractC0629t
        /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo5039a(C0612c c0612c, StringBuffer stringBuffer) throws IOException {
            c0612c.mo5081b(stringBuffer == null ? null : stringBuffer.toString());
        }
    };

    /* JADX INFO: renamed from: H */
    public static final InterfaceC0630u f4068H = m5102a(StringBuffer.class, f4067G);

    /* JADX INFO: renamed from: I */
    public static final AbstractC0629t<URL> f4069I = new AbstractC0629t<URL>() { // from class: com.google.a.b.a.n.14
        @Override // com.google.p036a.AbstractC0629t
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public URL mo5040b(C0610a c0610a) throws IOException {
            if (c0610a.mo5061f() == EnumC0611b.NULL) {
                c0610a.mo5065j();
                return null;
            }
            String strMo5063h = c0610a.mo5063h();
            if ("null".equals(strMo5063h)) {
                return null;
            }
            return new URL(strMo5063h);
        }

        @Override // com.google.p036a.AbstractC0629t
        /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo5039a(C0612c c0612c, URL url) throws IOException {
            c0612c.mo5081b(url == null ? null : url.toExternalForm());
        }
    };

    /* JADX INFO: renamed from: J */
    public static final InterfaceC0630u f4070J = m5102a(URL.class, f4069I);

    /* JADX INFO: renamed from: K */
    public static final AbstractC0629t<URI> f4071K = new AbstractC0629t<URI>() { // from class: com.google.a.b.a.n.15
        @Override // com.google.p036a.AbstractC0629t
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public URI mo5040b(C0610a c0610a) throws IOException {
            if (c0610a.mo5061f() == EnumC0611b.NULL) {
                c0610a.mo5065j();
                return null;
            }
            try {
                String strMo5063h = c0610a.mo5063h();
                if ("null".equals(strMo5063h)) {
                    return null;
                }
                return new URI(strMo5063h);
            } catch (URISyntaxException e) {
                throw new C0620k(e);
            }
        }

        @Override // com.google.p036a.AbstractC0629t
        /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo5039a(C0612c c0612c, URI uri) throws IOException {
            c0612c.mo5081b(uri == null ? null : uri.toASCIIString());
        }
    };

    /* JADX INFO: renamed from: L */
    public static final InterfaceC0630u f4072L = m5102a(URI.class, f4071K);

    /* JADX INFO: renamed from: M */
    public static final AbstractC0629t<InetAddress> f4073M = new AbstractC0629t<InetAddress>() { // from class: com.google.a.b.a.n.16
        @Override // com.google.p036a.AbstractC0629t
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public InetAddress mo5040b(C0610a c0610a) throws IOException {
            if (c0610a.mo5061f() != EnumC0611b.NULL) {
                return InetAddress.getByName(c0610a.mo5063h());
            }
            c0610a.mo5065j();
            return null;
        }

        @Override // com.google.p036a.AbstractC0629t
        /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo5039a(C0612c c0612c, InetAddress inetAddress) throws IOException {
            c0612c.mo5081b(inetAddress == null ? null : inetAddress.getHostAddress());
        }
    };

    /* JADX INFO: renamed from: N */
    public static final InterfaceC0630u f4074N = m5104b(InetAddress.class, f4073M);

    /* JADX INFO: renamed from: O */
    public static final AbstractC0629t<UUID> f4075O = new AbstractC0629t<UUID>() { // from class: com.google.a.b.a.n.17
        @Override // com.google.p036a.AbstractC0629t
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public UUID mo5040b(C0610a c0610a) throws IOException {
            if (c0610a.mo5061f() != EnumC0611b.NULL) {
                return UUID.fromString(c0610a.mo5063h());
            }
            c0610a.mo5065j();
            return null;
        }

        @Override // com.google.p036a.AbstractC0629t
        /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo5039a(C0612c c0612c, UUID uuid) throws IOException {
            c0612c.mo5081b(uuid == null ? null : uuid.toString());
        }
    };

    /* JADX INFO: renamed from: P */
    public static final InterfaceC0630u f4076P = m5102a(UUID.class, f4075O);

    /* JADX INFO: renamed from: Q */
    public static final AbstractC0629t<Currency> f4077Q = new AbstractC0629t<Currency>() { // from class: com.google.a.b.a.n.18
        @Override // com.google.p036a.AbstractC0629t
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Currency mo5040b(C0610a c0610a) {
            return Currency.getInstance(c0610a.mo5063h());
        }

        @Override // com.google.p036a.AbstractC0629t
        /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo5039a(C0612c c0612c, Currency currency) throws IOException {
            c0612c.mo5081b(currency.getCurrencyCode());
        }
    }.m5299a();

    /* JADX INFO: renamed from: R */
    public static final InterfaceC0630u f4078R = m5102a(Currency.class, f4077Q);

    /* JADX INFO: renamed from: S */
    public static final InterfaceC0630u f4079S = new InterfaceC0630u() { // from class: com.google.a.b.a.n.19
        @Override // com.google.p036a.InterfaceC0630u
        /* JADX INFO: renamed from: a */
        public <T> AbstractC0629t<T> mo5041a(C0614e c0614e, C0608a<T> c0608a) {
            if (c0608a.m5204a() != Timestamp.class) {
                return null;
            }
            final AbstractC0629t<T> abstractC0629tM5255a = c0614e.m5255a((Class) Date.class);
            return (AbstractC0629t<T>) new AbstractC0629t<Timestamp>() { // from class: com.google.a.b.a.n.19.1
                @Override // com.google.p036a.AbstractC0629t
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public Timestamp mo5040b(C0610a c0610a) {
                    Date date = (Date) abstractC0629tM5255a.mo5040b(c0610a);
                    if (date != null) {
                        return new Timestamp(date.getTime());
                    }
                    return null;
                }

                @Override // com.google.p036a.AbstractC0629t
                /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                public void mo5039a(C0612c c0612c, Timestamp timestamp) {
                    abstractC0629tM5255a.mo5039a(c0612c, timestamp);
                }
            };
        }
    };

    /* JADX INFO: renamed from: T */
    public static final AbstractC0629t<Calendar> f4080T = new AbstractC0629t<Calendar>() { // from class: com.google.a.b.a.n.20
        @Override // com.google.p036a.AbstractC0629t
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Calendar mo5040b(C0610a c0610a) throws IOException {
            int i = 0;
            if (c0610a.mo5061f() == EnumC0611b.NULL) {
                c0610a.mo5065j();
                return null;
            }
            c0610a.mo5058c();
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (c0610a.mo5061f() != EnumC0611b.END_OBJECT) {
                String strMo5062g = c0610a.mo5062g();
                int iMo5068m = c0610a.mo5068m();
                if ("year".equals(strMo5062g)) {
                    i6 = iMo5068m;
                } else if ("month".equals(strMo5062g)) {
                    i5 = iMo5068m;
                } else if ("dayOfMonth".equals(strMo5062g)) {
                    i4 = iMo5068m;
                } else if ("hourOfDay".equals(strMo5062g)) {
                    i3 = iMo5068m;
                } else if ("minute".equals(strMo5062g)) {
                    i2 = iMo5068m;
                } else if ("second".equals(strMo5062g)) {
                    i = iMo5068m;
                }
            }
            c0610a.mo5059d();
            return new GregorianCalendar(i6, i5, i4, i3, i2, i);
        }

        @Override // com.google.p036a.AbstractC0629t
        /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo5039a(C0612c c0612c, Calendar calendar) throws IOException {
            if (calendar == null) {
                c0612c.mo5085f();
                return;
            }
            c0612c.mo5083d();
            c0612c.mo5077a("year");
            c0612c.mo5074a(calendar.get(1));
            c0612c.mo5077a("month");
            c0612c.mo5074a(calendar.get(2));
            c0612c.mo5077a("dayOfMonth");
            c0612c.mo5074a(calendar.get(5));
            c0612c.mo5077a("hourOfDay");
            c0612c.mo5074a(calendar.get(11));
            c0612c.mo5077a("minute");
            c0612c.mo5074a(calendar.get(12));
            c0612c.mo5077a("second");
            c0612c.mo5074a(calendar.get(13));
            c0612c.mo5084e();
        }
    };

    /* JADX INFO: renamed from: U */
    public static final InterfaceC0630u f4081U = m5105b(Calendar.class, GregorianCalendar.class, f4080T);

    /* JADX INFO: renamed from: V */
    public static final AbstractC0629t<Locale> f4082V = new AbstractC0629t<Locale>() { // from class: com.google.a.b.a.n.21
        @Override // com.google.p036a.AbstractC0629t
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Locale mo5040b(C0610a c0610a) throws IOException {
            if (c0610a.mo5061f() == EnumC0611b.NULL) {
                c0610a.mo5065j();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(c0610a.mo5063h(), "_");
            String strNextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String strNextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String strNextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            return (strNextToken2 == null && strNextToken3 == null) ? new Locale(strNextToken) : strNextToken3 == null ? new Locale(strNextToken, strNextToken2) : new Locale(strNextToken, strNextToken2, strNextToken3);
        }

        @Override // com.google.p036a.AbstractC0629t
        /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo5039a(C0612c c0612c, Locale locale) throws IOException {
            c0612c.mo5081b(locale == null ? null : locale.toString());
        }
    };

    /* JADX INFO: renamed from: W */
    public static final InterfaceC0630u f4083W = m5102a(Locale.class, f4082V);

    /* JADX INFO: renamed from: X */
    public static final AbstractC0629t<AbstractC0619j> f4084X = new AbstractC0629t<AbstractC0619j>() { // from class: com.google.a.b.a.n.22
        @Override // com.google.p036a.AbstractC0629t
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC0619j mo5040b(C0610a c0610a) throws IOException {
            switch (AnonymousClass29.f4127a[c0610a.mo5061f().ordinal()]) {
                case 1:
                    return new C0624o(new C0601f(c0610a.mo5063h()));
                case 2:
                    return new C0624o(Boolean.valueOf(c0610a.mo5064i()));
                case 3:
                    return new C0624o(c0610a.mo5063h());
                case 4:
                    c0610a.mo5065j();
                    return C0621l.f4277a;
                case 5:
                    C0616g c0616g = new C0616g();
                    c0610a.mo5056a();
                    while (c0610a.mo5060e()) {
                        c0616g.m5274a(mo5040b(c0610a));
                    }
                    c0610a.mo5057b();
                    return c0616g;
                case 6:
                    C0622m c0622m = new C0622m();
                    c0610a.mo5058c();
                    while (c0610a.mo5060e()) {
                        c0622m.m5289a(c0610a.mo5062g(), mo5040b(c0610a));
                    }
                    c0610a.mo5059d();
                    return c0622m;
                default:
                    throw new IllegalArgumentException();
            }
        }

        @Override // com.google.p036a.AbstractC0629t
        /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo5039a(C0612c c0612c, AbstractC0619j abstractC0619j) throws IOException {
            if (abstractC0619j == null || abstractC0619j.m5284j()) {
                c0612c.mo5085f();
                return;
            }
            if (abstractC0619j.m5283i()) {
                C0624o c0624oM5287m = abstractC0619j.m5287m();
                if (c0624oM5287m.m5295p()) {
                    c0612c.mo5076a(c0624oM5287m.mo5273a());
                    return;
                } else if (c0624oM5287m.m5294o()) {
                    c0612c.mo5078a(c0624oM5287m.mo5279f());
                    return;
                } else {
                    c0612c.mo5081b(c0624oM5287m.mo5275b());
                    return;
                }
            }
            if (abstractC0619j.m5281g()) {
                c0612c.mo5080b();
                Iterator<AbstractC0619j> it = abstractC0619j.m5286l().iterator();
                while (it.hasNext()) {
                    mo5039a(c0612c, it.next());
                }
                c0612c.mo5082c();
                return;
            }
            if (!abstractC0619j.m5282h()) {
                throw new IllegalArgumentException("Couldn't write " + abstractC0619j.getClass());
            }
            c0612c.mo5083d();
            for (Map.Entry<String, AbstractC0619j> entry : abstractC0619j.m5285k().m5290o()) {
                c0612c.mo5077a(entry.getKey());
                mo5039a(c0612c, entry.getValue());
            }
            c0612c.mo5084e();
        }
    };

    /* JADX INFO: renamed from: Y */
    public static final InterfaceC0630u f4085Y = m5104b(AbstractC0619j.class, f4084X);

    /* JADX INFO: renamed from: Z */
    public static final InterfaceC0630u f4086Z = new InterfaceC0630u() { // from class: com.google.a.b.a.n.24
        @Override // com.google.p036a.InterfaceC0630u
        /* JADX INFO: renamed from: a */
        public <T> AbstractC0629t<T> mo5041a(C0614e c0614e, C0608a<T> c0608a) {
            Class<? super T> clsM5204a = c0608a.m5204a();
            if (!Enum.class.isAssignableFrom(clsM5204a) || clsM5204a == Enum.class) {
                return null;
            }
            if (!clsM5204a.isEnum()) {
                clsM5204a = clsM5204a.getSuperclass();
            }
            return new a(clsM5204a);
        }
    };

    /* JADX INFO: renamed from: com.google.a.b.a.n$a */
    private static final class a<T extends Enum<T>> extends AbstractC0629t<T> {

        /* JADX INFO: renamed from: a */
        private final Map<String, T> f4128a = new HashMap();

        /* JADX INFO: renamed from: b */
        private final Map<T, String> f4129b = new HashMap();

        public a(Class<T> cls) {
            try {
                for (T t : cls.getEnumConstants()) {
                    String strName = t.name();
                    InterfaceC0577c interfaceC0577c = (InterfaceC0577c) cls.getField(strName).getAnnotation(InterfaceC0577c.class);
                    if (interfaceC0577c != null) {
                        strName = interfaceC0577c.m5033a();
                        String[] strArrM5034b = interfaceC0577c.m5034b();
                        for (String str : strArrM5034b) {
                            this.f4128a.put(str, t);
                        }
                    }
                    String str2 = strName;
                    this.f4128a.put(str2, t);
                    this.f4129b.put(t, str2);
                }
            } catch (NoSuchFieldException e) {
                throw new AssertionError(e);
            }
        }

        @Override // com.google.p036a.AbstractC0629t
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public T mo5040b(C0610a c0610a) throws IOException {
            if (c0610a.mo5061f() != EnumC0611b.NULL) {
                return this.f4128a.get(c0610a.mo5063h());
            }
            c0610a.mo5065j();
            return null;
        }

        @Override // com.google.p036a.AbstractC0629t
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo5039a(C0612c c0612c, T t) throws IOException {
            c0612c.mo5081b(t == null ? null : this.f4129b.get(t));
        }
    }

    /* JADX INFO: renamed from: a */
    public static <TT> InterfaceC0630u m5102a(final Class<TT> cls, final AbstractC0629t<TT> abstractC0629t) {
        return new InterfaceC0630u() { // from class: com.google.a.b.a.n.25
            @Override // com.google.p036a.InterfaceC0630u
            /* JADX INFO: renamed from: a */
            public <T> AbstractC0629t<T> mo5041a(C0614e c0614e, C0608a<T> c0608a) {
                if (c0608a.m5204a() == cls) {
                    return abstractC0629t;
                }
                return null;
            }

            public String toString() {
                return "Factory[type=" + cls.getName() + ",adapter=" + abstractC0629t + "]";
            }
        };
    }

    /* JADX INFO: renamed from: a */
    public static <TT> InterfaceC0630u m5103a(final Class<TT> cls, final Class<TT> cls2, final AbstractC0629t<? super TT> abstractC0629t) {
        return new InterfaceC0630u() { // from class: com.google.a.b.a.n.26
            @Override // com.google.p036a.InterfaceC0630u
            /* JADX INFO: renamed from: a */
            public <T> AbstractC0629t<T> mo5041a(C0614e c0614e, C0608a<T> c0608a) {
                Class<? super T> clsM5204a = c0608a.m5204a();
                if (clsM5204a == cls || clsM5204a == cls2) {
                    return abstractC0629t;
                }
                return null;
            }

            public String toString() {
                return "Factory[type=" + cls2.getName() + "+" + cls.getName() + ",adapter=" + abstractC0629t + "]";
            }
        };
    }

    /* JADX INFO: renamed from: b */
    public static <T1> InterfaceC0630u m5104b(final Class<T1> cls, final AbstractC0629t<T1> abstractC0629t) {
        return new InterfaceC0630u() { // from class: com.google.a.b.a.n.28
            @Override // com.google.p036a.InterfaceC0630u
            /* JADX INFO: renamed from: a */
            public <T2> AbstractC0629t<T2> mo5041a(C0614e c0614e, C0608a<T2> c0608a) {
                final Class<? super T2> clsM5204a = c0608a.m5204a();
                if (cls.isAssignableFrom(clsM5204a)) {
                    return (AbstractC0629t<T2>) new AbstractC0629t<T1>() { // from class: com.google.a.b.a.n.28.1
                        @Override // com.google.p036a.AbstractC0629t
                        /* JADX INFO: renamed from: a */
                        public void mo5039a(C0612c c0612c, T1 t1) {
                            abstractC0629t.mo5039a(c0612c, t1);
                        }

                        @Override // com.google.p036a.AbstractC0629t
                        /* JADX INFO: renamed from: b */
                        public T1 mo5040b(C0610a c0610a) {
                            T1 t1 = (T1) abstractC0629t.mo5040b(c0610a);
                            if (t1 == null || clsM5204a.isInstance(t1)) {
                                return t1;
                            }
                            throw new C0627r("Expected a " + clsM5204a.getName() + " but was " + t1.getClass().getName());
                        }
                    };
                }
                return null;
            }

            public String toString() {
                return "Factory[typeHierarchy=" + cls.getName() + ",adapter=" + abstractC0629t + "]";
            }
        };
    }

    /* JADX INFO: renamed from: b */
    public static <TT> InterfaceC0630u m5105b(final Class<TT> cls, final Class<? extends TT> cls2, final AbstractC0629t<? super TT> abstractC0629t) {
        return new InterfaceC0630u() { // from class: com.google.a.b.a.n.27
            @Override // com.google.p036a.InterfaceC0630u
            /* JADX INFO: renamed from: a */
            public <T> AbstractC0629t<T> mo5041a(C0614e c0614e, C0608a<T> c0608a) {
                Class<? super T> clsM5204a = c0608a.m5204a();
                if (clsM5204a == cls || clsM5204a == cls2) {
                    return abstractC0629t;
                }
                return null;
            }

            public String toString() {
                return "Factory[type=" + cls.getName() + "+" + cls2.getName() + ",adapter=" + abstractC0629t + "]";
            }
        };
    }
}
