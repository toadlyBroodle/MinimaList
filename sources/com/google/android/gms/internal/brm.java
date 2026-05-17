package com.google.android.gms.internal;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'i' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public class brm {

    /* JADX INFO: renamed from: a */
    public static final brm f8725a = new brm("DOUBLE", 0, brr.DOUBLE, 1);

    /* JADX INFO: renamed from: b */
    public static final brm f8726b = new brm("FLOAT", 1, brr.FLOAT, 5);

    /* JADX INFO: renamed from: c */
    public static final brm f8727c = new brm("INT64", 2, brr.LONG, 0);

    /* JADX INFO: renamed from: d */
    public static final brm f8728d = new brm("UINT64", 3, brr.LONG, 0);

    /* JADX INFO: renamed from: e */
    public static final brm f8729e = new brm("INT32", 4, brr.INT, 0);

    /* JADX INFO: renamed from: f */
    public static final brm f8730f = new brm("FIXED64", 5, brr.LONG, 1);

    /* JADX INFO: renamed from: g */
    public static final brm f8731g = new brm("FIXED32", 6, brr.INT, 5);

    /* JADX INFO: renamed from: h */
    public static final brm f8732h = new brm("BOOL", 7, brr.BOOLEAN, 0);

    /* JADX INFO: renamed from: i */
    public static final brm f8733i;

    /* JADX INFO: renamed from: j */
    public static final brm f8734j;

    /* JADX INFO: renamed from: k */
    public static final brm f8735k;

    /* JADX INFO: renamed from: l */
    public static final brm f8736l;

    /* JADX INFO: renamed from: m */
    public static final brm f8737m;

    /* JADX INFO: renamed from: n */
    public static final brm f8738n;

    /* JADX INFO: renamed from: o */
    public static final brm f8739o;

    /* JADX INFO: renamed from: p */
    public static final brm f8740p;

    /* JADX INFO: renamed from: q */
    public static final brm f8741q;

    /* JADX INFO: renamed from: r */
    public static final brm f8742r;

    /* JADX INFO: renamed from: u */
    private static final /* synthetic */ brm[] f8743u;

    /* JADX INFO: renamed from: s */
    private final brr f8744s;

    /* JADX INFO: renamed from: t */
    private final int f8745t;

    static {
        final int i = 3;
        final int i2 = 2;
        final String str = "STRING";
        final int i3 = 8;
        final brr brrVar = brr.STRING;
        f8733i = new brm(str, i3, brrVar, i2) { // from class: com.google.android.gms.internal.brn
            {
                int i4 = 8;
                int i5 = 2;
                brl brlVar = null;
            }
        };
        final String str2 = "GROUP";
        final int i4 = 9;
        final brr brrVar2 = brr.MESSAGE;
        f8734j = new brm(str2, i4, brrVar2, i) { // from class: com.google.android.gms.internal.bro
            {
                int i5 = 9;
                int i6 = 3;
                brl brlVar = null;
            }
        };
        final String str3 = "MESSAGE";
        final int i5 = 10;
        final brr brrVar3 = brr.MESSAGE;
        f8735k = new brm(str3, i5, brrVar3, i2) { // from class: com.google.android.gms.internal.brp
            {
                int i6 = 10;
                int i7 = 2;
                brl brlVar = null;
            }
        };
        final String str4 = "BYTES";
        final int i6 = 11;
        final brr brrVar4 = brr.BYTE_STRING;
        f8736l = new brm(str4, i6, brrVar4, i2) { // from class: com.google.android.gms.internal.brq
            {
                int i7 = 11;
                int i8 = 2;
                brl brlVar = null;
            }
        };
        f8737m = new brm("UINT32", 12, brr.INT, 0);
        f8738n = new brm("ENUM", 13, brr.ENUM, 0);
        f8739o = new brm("SFIXED32", 14, brr.INT, 5);
        f8740p = new brm("SFIXED64", 15, brr.LONG, 1);
        f8741q = new brm("SINT32", 16, brr.INT, 0);
        f8742r = new brm("SINT64", 17, brr.LONG, 0);
        f8743u = new brm[]{f8725a, f8726b, f8727c, f8728d, f8729e, f8730f, f8731g, f8732h, f8733i, f8734j, f8735k, f8736l, f8737m, f8738n, f8739o, f8740p, f8741q, f8742r};
    }

    private brm(String str, int i, brr brrVar, int i2) {
        this.f8744s = brrVar;
        this.f8745t = i2;
    }

    /* synthetic */ brm(String str, int i, brr brrVar, int i2, brl brlVar) {
        this(str, i, brrVar, i2);
    }

    public static brm[] values() {
        return (brm[]) f8743u.clone();
    }

    /* JADX INFO: renamed from: a */
    public final brr m10077a() {
        return this.f8744s;
    }
}
