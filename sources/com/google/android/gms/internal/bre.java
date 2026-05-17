package com.google.android.gms.internal;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
final class bre {

    /* JADX INFO: renamed from: a */
    private static final Logger f8698a = Logger.getLogger(bre.class.getName());

    /* JADX INFO: renamed from: b */
    private static final Unsafe f8699b = m10053d();

    /* JADX INFO: renamed from: c */
    private static final Class<?> f8700c = m10038a("libcore.io.Memory");

    /* JADX INFO: renamed from: d */
    private static final boolean f8701d;

    /* JADX INFO: renamed from: e */
    private static final boolean f8702e;

    /* JADX INFO: renamed from: f */
    private static final boolean f8703f;

    /* JADX INFO: renamed from: g */
    private static final AbstractC1455d f8704g;

    /* JADX INFO: renamed from: h */
    private static final boolean f8705h;

    /* JADX INFO: renamed from: i */
    private static final boolean f8706i;

    /* JADX INFO: renamed from: j */
    private static final long f8707j;

    /* JADX INFO: renamed from: k */
    private static final long f8708k;

    /* JADX INFO: renamed from: l */
    private static final long f8709l;

    /* JADX INFO: renamed from: m */
    private static final long f8710m;

    /* JADX INFO: renamed from: n */
    private static final long f8711n;

    /* JADX INFO: renamed from: o */
    private static final long f8712o;

    /* JADX INFO: renamed from: p */
    private static final long f8713p;

    /* JADX INFO: renamed from: q */
    private static final long f8714q;

    /* JADX INFO: renamed from: r */
    private static final long f8715r;

    /* JADX INFO: renamed from: s */
    private static final long f8716s;

    /* JADX INFO: renamed from: t */
    private static final long f8717t;

    /* JADX INFO: renamed from: u */
    private static final long f8718u;

    /* JADX INFO: renamed from: v */
    private static final long f8719v;

    /* JADX INFO: renamed from: w */
    private static final long f8720w;

    /* JADX INFO: renamed from: x */
    private static final boolean f8721x;

    /* JADX INFO: renamed from: com.google.android.gms.internal.bre$a */
    static final class C1452a extends AbstractC1455d {
        C1452a(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.bre.AbstractC1455d
        /* JADX INFO: renamed from: a */
        public final byte mo10059a(Object obj, long j) {
            return bre.f8721x ? bre.m10052d(obj, j) : bre.m10055e(obj, j);
        }

        @Override // com.google.android.gms.internal.bre.AbstractC1455d
        /* JADX INFO: renamed from: a */
        public final void mo10060a(Object obj, long j, byte b) {
            if (bre.f8721x) {
                bre.m10049c(obj, j, b);
            } else {
                bre.m10054d(obj, j, b);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.internal.bre$b */
    static final class C1453b extends AbstractC1455d {
        C1453b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.bre.AbstractC1455d
        /* JADX INFO: renamed from: a */
        public final byte mo10059a(Object obj, long j) {
            return bre.f8721x ? bre.m10052d(obj, j) : bre.m10055e(obj, j);
        }

        @Override // com.google.android.gms.internal.bre.AbstractC1455d
        /* JADX INFO: renamed from: a */
        public final void mo10060a(Object obj, long j, byte b) {
            if (bre.f8721x) {
                bre.m10049c(obj, j, b);
            } else {
                bre.m10054d(obj, j, b);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.internal.bre$c */
    static final class C1454c extends AbstractC1455d {
        C1454c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.bre.AbstractC1455d
        /* JADX INFO: renamed from: a */
        public final byte mo10059a(Object obj, long j) {
            return this.f8722a.getByte(obj, j);
        }

        @Override // com.google.android.gms.internal.bre.AbstractC1455d
        /* JADX INFO: renamed from: a */
        public final void mo10060a(Object obj, long j, byte b) {
            this.f8722a.putByte(obj, j, b);
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.internal.bre$d */
    static abstract class AbstractC1455d {

        /* JADX INFO: renamed from: a */
        Unsafe f8722a;

        AbstractC1455d(Unsafe unsafe) {
            this.f8722a = unsafe;
        }

        /* JADX INFO: renamed from: a */
        public abstract byte mo10059a(Object obj, long j);

        /* JADX INFO: renamed from: a */
        public abstract void mo10060a(Object obj, long j, byte b);

        /* JADX INFO: renamed from: b */
        public final int m10061b(Object obj, long j) {
            return this.f8722a.getInt(obj, j);
        }
    }

    static {
        Field fieldM10039a;
        f8701d = m10038a("org.robolectric.Robolectric") != null;
        f8702e = m10051c(Long.TYPE);
        f8703f = m10051c(Integer.TYPE);
        f8704g = f8699b == null ? null : m10058g() ? f8702e ? new C1453b(f8699b) : f8703f ? new C1452a(f8699b) : null : new C1454c(f8699b);
        f8705h = m10057f();
        f8706i = m10056e();
        f8707j = m10036a((Class<?>) byte[].class);
        f8708k = m10036a((Class<?>) boolean[].class);
        f8709l = m10045b(boolean[].class);
        f8710m = m10036a((Class<?>) int[].class);
        f8711n = m10045b(int[].class);
        f8712o = m10036a((Class<?>) long[].class);
        f8713p = m10045b(long[].class);
        f8714q = m10036a((Class<?>) float[].class);
        f8715r = m10045b(float[].class);
        f8716s = m10036a((Class<?>) double[].class);
        f8717t = m10045b(double[].class);
        f8718u = m10036a((Class<?>) Object[].class);
        f8719v = m10045b(Object[].class);
        if (!m10058g() || (fieldM10039a = m10039a((Class<?>) Buffer.class, "effectiveDirectAddress")) == null) {
            fieldM10039a = m10039a((Class<?>) Buffer.class, "address");
        }
        f8720w = (fieldM10039a == null || f8704g == null) ? -1L : f8704g.f8722a.objectFieldOffset(fieldM10039a);
        f8721x = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private bre() {
    }

    /* JADX INFO: renamed from: a */
    static byte m10035a(byte[] bArr, long j) {
        return f8704g.mo10059a(bArr, f8707j + j);
    }

    /* JADX INFO: renamed from: a */
    private static int m10036a(Class<?> cls) {
        if (f8706i) {
            return f8704g.f8722a.arrayBaseOffset(cls);
        }
        return -1;
    }

    /* JADX INFO: renamed from: a */
    static int m10037a(Object obj, long j) {
        return f8704g.m10061b(obj, j);
    }

    /* JADX INFO: renamed from: a */
    private static <T> Class<T> m10038a(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable th) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private static Field m10039a(Class<?> cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable th) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m10041a(Object obj, long j, int i) {
        f8704g.f8722a.putInt(obj, j, i);
    }

    /* JADX INFO: renamed from: a */
    static void m10042a(byte[] bArr, long j, byte b) {
        f8704g.mo10060a(bArr, f8707j + j, b);
    }

    /* JADX INFO: renamed from: a */
    static boolean m10043a() {
        return f8706i;
    }

    /* JADX INFO: renamed from: b */
    private static int m10045b(Class<?> cls) {
        if (f8706i) {
            return f8704g.f8722a.arrayIndexScale(cls);
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    static boolean m10047b() {
        return f8705h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static void m10049c(Object obj, long j, byte b) {
        int i = ((((int) j) ^ (-1)) & 3) << 3;
        m10041a(obj, j & (-4), (m10037a(obj, j & (-4)) & ((255 << i) ^ (-1))) | ((b & 255) << i));
    }

    /* JADX INFO: renamed from: c */
    private static boolean m10051c(Class<?> cls) {
        if (!m10058g()) {
            return false;
        }
        try {
            Class<?> cls2 = f8700c;
            cls2.getMethod("peekLong", cls, Boolean.TYPE);
            cls2.getMethod("pokeLong", cls, Long.TYPE, Boolean.TYPE);
            cls2.getMethod("pokeInt", cls, Integer.TYPE, Boolean.TYPE);
            cls2.getMethod("peekInt", cls, Boolean.TYPE);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, Integer.TYPE, Integer.TYPE);
            cls2.getMethod("peekByteArray", cls, byte[].class, Integer.TYPE, Integer.TYPE);
            return true;
        } catch (Throwable th) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static byte m10052d(Object obj, long j) {
        return (byte) (m10037a(obj, (-4) & j) >>> ((int) ((((-1) ^ j) & 3) << 3)));
    }

    /* JADX INFO: renamed from: d */
    private static Unsafe m10053d() {
        try {
            return (Unsafe) AccessController.doPrivileged(new brf());
        } catch (Throwable th) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static void m10054d(Object obj, long j, byte b) {
        int i = (((int) j) & 3) << 3;
        m10041a(obj, j & (-4), (m10037a(obj, j & (-4)) & ((255 << i) ^ (-1))) | ((b & 255) << i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static byte m10055e(Object obj, long j) {
        return (byte) (m10037a(obj, (-4) & j) >>> ((int) ((3 & j) << 3)));
    }

    /* JADX INFO: renamed from: e */
    private static boolean m10056e() {
        if (f8699b == null) {
            return false;
        }
        try {
            Class<?> cls = f8699b.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            cls.getMethod("getInt", Object.class, Long.TYPE);
            cls.getMethod("putInt", Object.class, Long.TYPE, Integer.TYPE);
            cls.getMethod("getLong", Object.class, Long.TYPE);
            cls.getMethod("putLong", Object.class, Long.TYPE, Long.TYPE);
            cls.getMethod("getObject", Object.class, Long.TYPE);
            cls.getMethod("putObject", Object.class, Long.TYPE, Object.class);
            if (m10058g()) {
                return true;
            }
            cls.getMethod("getByte", Object.class, Long.TYPE);
            cls.getMethod("putByte", Object.class, Long.TYPE, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, Long.TYPE);
            cls.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, Long.TYPE);
            cls.getMethod("putFloat", Object.class, Long.TYPE, Float.TYPE);
            cls.getMethod("getDouble", Object.class, Long.TYPE);
            cls.getMethod("putDouble", Object.class, Long.TYPE, Double.TYPE);
            return true;
        } catch (Throwable th) {
            Logger logger = f8698a;
            Level level = Level.WARNING;
            String strValueOf = String.valueOf(th);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", new StringBuilder(String.valueOf(strValueOf).length() + 71).append("platform method missing - proto runtime falling back to safer methods: ").append(strValueOf).toString());
            return false;
        }
    }

    /* JADX INFO: renamed from: f */
    private static boolean m10057f() {
        if (f8699b == null) {
            return false;
        }
        try {
            Class<?> cls = f8699b.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("getLong", Object.class, Long.TYPE);
            if (m10058g()) {
                return true;
            }
            cls.getMethod("getByte", Long.TYPE);
            cls.getMethod("putByte", Long.TYPE, Byte.TYPE);
            cls.getMethod("getInt", Long.TYPE);
            cls.getMethod("putInt", Long.TYPE, Integer.TYPE);
            cls.getMethod("getLong", Long.TYPE);
            cls.getMethod("putLong", Long.TYPE, Long.TYPE);
            cls.getMethod("copyMemory", Long.TYPE, Long.TYPE, Long.TYPE);
            cls.getMethod("copyMemory", Object.class, Long.TYPE, Object.class, Long.TYPE, Long.TYPE);
            return true;
        } catch (Throwable th) {
            Logger logger = f8698a;
            Level level = Level.WARNING;
            String strValueOf = String.valueOf(th);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", new StringBuilder(String.valueOf(strValueOf).length() + 71).append("platform method missing - proto runtime falling back to safer methods: ").append(strValueOf).toString());
            return false;
        }
    }

    /* JADX INFO: renamed from: g */
    private static boolean m10058g() {
        return (f8700c == null || f8701d) ? false : true;
    }
}
