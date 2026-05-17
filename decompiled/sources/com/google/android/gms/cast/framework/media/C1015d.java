package com.google.android.gms.cast.framework.media;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.AbstractC2011we;
import com.google.android.gms.internal.C2014wh;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.cast.framework.media.d */
/* JADX INFO: loaded from: classes.dex */
public class C1015d extends AbstractC2011we {

    /* JADX INFO: renamed from: A */
    private final int f5299A;

    /* JADX INFO: renamed from: B */
    private final int f5300B;

    /* JADX INFO: renamed from: C */
    private final int f5301C;

    /* JADX INFO: renamed from: D */
    private final int f5302D;

    /* JADX INFO: renamed from: E */
    private final int f5303E;

    /* JADX INFO: renamed from: F */
    private final int f5304F;

    /* JADX INFO: renamed from: G */
    private final int f5305G;

    /* JADX INFO: renamed from: H */
    private final InterfaceC1029r f5306H;

    /* JADX INFO: renamed from: c */
    private final List<String> f5307c;

    /* JADX INFO: renamed from: d */
    private final int[] f5308d;

    /* JADX INFO: renamed from: e */
    private final long f5309e;

    /* JADX INFO: renamed from: f */
    private final String f5310f;

    /* JADX INFO: renamed from: g */
    private final int f5311g;

    /* JADX INFO: renamed from: h */
    private final int f5312h;

    /* JADX INFO: renamed from: i */
    private final int f5313i;

    /* JADX INFO: renamed from: j */
    private final int f5314j;

    /* JADX INFO: renamed from: k */
    private final int f5315k;

    /* JADX INFO: renamed from: l */
    private final int f5316l;

    /* JADX INFO: renamed from: m */
    private final int f5317m;

    /* JADX INFO: renamed from: n */
    private final int f5318n;

    /* JADX INFO: renamed from: o */
    private final int f5319o;

    /* JADX INFO: renamed from: p */
    private final int f5320p;

    /* JADX INFO: renamed from: q */
    private final int f5321q;

    /* JADX INFO: renamed from: r */
    private final int f5322r;

    /* JADX INFO: renamed from: s */
    private final int f5323s;

    /* JADX INFO: renamed from: t */
    private final int f5324t;

    /* JADX INFO: renamed from: u */
    private final int f5325u;

    /* JADX INFO: renamed from: v */
    private final int f5326v;

    /* JADX INFO: renamed from: w */
    private final int f5327w;

    /* JADX INFO: renamed from: x */
    private final int f5328x;

    /* JADX INFO: renamed from: y */
    private final int f5329y;

    /* JADX INFO: renamed from: z */
    private final int f5330z;

    /* JADX INFO: renamed from: a */
    private static final List<String> f5297a = Arrays.asList("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK", "com.google.android.gms.cast.framework.action.STOP_CASTING");

    /* JADX INFO: renamed from: b */
    private static final int[] f5298b = {0, 1};
    public static final Parcelable.Creator<C1015d> CREATOR = new C1033v();

    public C1015d(List<String> list, int[] iArr, long j, String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, IBinder iBinder) {
        InterfaceC1029r c1030s;
        if (list != null) {
            this.f5307c = new ArrayList(list);
        } else {
            this.f5307c = null;
        }
        if (iArr != null) {
            this.f5308d = Arrays.copyOf(iArr, iArr.length);
        } else {
            this.f5308d = null;
        }
        this.f5309e = j;
        this.f5310f = str;
        this.f5311g = i;
        this.f5312h = i2;
        this.f5313i = i3;
        this.f5314j = i4;
        this.f5315k = i5;
        this.f5316l = i6;
        this.f5317m = i7;
        this.f5318n = i8;
        this.f5319o = i9;
        this.f5320p = i10;
        this.f5321q = i11;
        this.f5322r = i12;
        this.f5323s = i13;
        this.f5324t = i14;
        this.f5325u = i15;
        this.f5326v = i16;
        this.f5327w = i17;
        this.f5328x = i18;
        this.f5329y = i19;
        this.f5330z = i20;
        this.f5299A = i21;
        this.f5300B = i22;
        this.f5301C = i23;
        this.f5302D = i24;
        this.f5303E = i25;
        this.f5304F = i26;
        this.f5305G = i27;
        if (iBinder == null) {
            c1030s = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.INotificationActionsProvider");
            c1030s = iInterfaceQueryLocalInterface instanceof InterfaceC1029r ? (InterfaceC1029r) iInterfaceQueryLocalInterface : new C1030s(iBinder);
        }
        this.f5306H = c1030s;
    }

    /* JADX INFO: renamed from: a */
    public List<String> m6434a() {
        return this.f5307c;
    }

    /* JADX INFO: renamed from: b */
    public int[] m6435b() {
        return Arrays.copyOf(this.f5308d, this.f5308d.length);
    }

    /* JADX INFO: renamed from: c */
    public long m6436c() {
        return this.f5309e;
    }

    /* JADX INFO: renamed from: d */
    public String m6437d() {
        return this.f5310f;
    }

    /* JADX INFO: renamed from: e */
    public int m6438e() {
        return this.f5311g;
    }

    /* JADX INFO: renamed from: f */
    public int m6439f() {
        return this.f5312h;
    }

    /* JADX INFO: renamed from: g */
    public int m6440g() {
        return this.f5313i;
    }

    /* JADX INFO: renamed from: h */
    public int m6441h() {
        return this.f5314j;
    }

    /* JADX INFO: renamed from: i */
    public int m6442i() {
        return this.f5315k;
    }

    /* JADX INFO: renamed from: j */
    public int m6443j() {
        return this.f5316l;
    }

    /* JADX INFO: renamed from: k */
    public int m6444k() {
        return this.f5317m;
    }

    /* JADX INFO: renamed from: l */
    public int m6445l() {
        return this.f5318n;
    }

    /* JADX INFO: renamed from: m */
    public int m6446m() {
        return this.f5319o;
    }

    /* JADX INFO: renamed from: n */
    public int m6447n() {
        return this.f5320p;
    }

    /* JADX INFO: renamed from: o */
    public int m6448o() {
        return this.f5321q;
    }

    /* JADX INFO: renamed from: p */
    public int m6449p() {
        return this.f5322r;
    }

    /* JADX INFO: renamed from: q */
    public int m6450q() {
        return this.f5323s;
    }

    /* JADX INFO: renamed from: r */
    public int m6451r() {
        return this.f5325u;
    }

    /* JADX INFO: renamed from: s */
    public int m6452s() {
        return this.f5326v;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iM12512a = C2014wh.m12512a(parcel);
        C2014wh.m12535b(parcel, 2, m6434a(), false);
        C2014wh.m12528a(parcel, 3, m6435b(), false);
        C2014wh.m12517a(parcel, 4, m6436c());
        C2014wh.m12524a(parcel, 5, m6437d(), false);
        C2014wh.m12516a(parcel, 6, m6438e());
        C2014wh.m12516a(parcel, 7, m6439f());
        C2014wh.m12516a(parcel, 8, m6440g());
        C2014wh.m12516a(parcel, 9, m6441h());
        C2014wh.m12516a(parcel, 10, m6442i());
        C2014wh.m12516a(parcel, 11, m6443j());
        C2014wh.m12516a(parcel, 12, m6444k());
        C2014wh.m12516a(parcel, 13, m6445l());
        C2014wh.m12516a(parcel, 14, m6446m());
        C2014wh.m12516a(parcel, 15, m6447n());
        C2014wh.m12516a(parcel, 16, m6448o());
        C2014wh.m12516a(parcel, 17, m6449p());
        C2014wh.m12516a(parcel, 18, m6450q());
        C2014wh.m12516a(parcel, 19, this.f5324t);
        C2014wh.m12516a(parcel, 20, m6451r());
        C2014wh.m12516a(parcel, 21, m6452s());
        C2014wh.m12516a(parcel, 22, this.f5327w);
        C2014wh.m12516a(parcel, 23, this.f5328x);
        C2014wh.m12516a(parcel, 24, this.f5329y);
        C2014wh.m12516a(parcel, 25, this.f5330z);
        C2014wh.m12516a(parcel, 26, this.f5299A);
        C2014wh.m12516a(parcel, 27, this.f5300B);
        C2014wh.m12516a(parcel, 28, this.f5301C);
        C2014wh.m12516a(parcel, 29, this.f5302D);
        C2014wh.m12516a(parcel, 30, this.f5303E);
        C2014wh.m12516a(parcel, 31, this.f5304F);
        C2014wh.m12516a(parcel, 32, this.f5305G);
        C2014wh.m12519a(parcel, 33, this.f5306H == null ? null : this.f5306H.asBinder(), false);
        C2014wh.m12513a(parcel, iM12512a);
    }
}
