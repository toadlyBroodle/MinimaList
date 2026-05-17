package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.internal.C2014wh;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class WakeLockEvent extends StatsEvent {
    public static final Parcelable.Creator<WakeLockEvent> CREATOR = new C1293d();

    /* JADX INFO: renamed from: a */
    private int f5992a;

    /* JADX INFO: renamed from: b */
    private final long f5993b;

    /* JADX INFO: renamed from: c */
    private int f5994c;

    /* JADX INFO: renamed from: d */
    private final String f5995d;

    /* JADX INFO: renamed from: e */
    private final String f5996e;

    /* JADX INFO: renamed from: f */
    private final String f5997f;

    /* JADX INFO: renamed from: g */
    private final int f5998g;

    /* JADX INFO: renamed from: h */
    private final List<String> f5999h;

    /* JADX INFO: renamed from: i */
    private final String f6000i;

    /* JADX INFO: renamed from: j */
    private final long f6001j;

    /* JADX INFO: renamed from: k */
    private int f6002k;

    /* JADX INFO: renamed from: l */
    private final String f6003l;

    /* JADX INFO: renamed from: m */
    private final float f6004m;

    /* JADX INFO: renamed from: n */
    private final long f6005n;

    /* JADX INFO: renamed from: o */
    private long f6006o;

    WakeLockEvent(int i, long j, int i2, String str, int i3, List<String> list, String str2, long j2, int i4, String str3, String str4, float f, long j3, String str5) {
        this.f5992a = i;
        this.f5993b = j;
        this.f5994c = i2;
        this.f5995d = str;
        this.f5996e = str3;
        this.f5997f = str5;
        this.f5998g = i3;
        this.f6006o = -1L;
        this.f5999h = list;
        this.f6000i = str2;
        this.f6001j = j2;
        this.f6002k = i4;
        this.f6003l = str4;
        this.f6004m = f;
        this.f6005n = j3;
    }

    public WakeLockEvent(long j, int i, String str, int i2, List<String> list, String str2, long j2, int i3, String str3, String str4, float f, long j3, String str5) {
        this(2, j, i, str, i2, list, str2, j2, i3, str3, str4, f, j3, str5);
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    /* JADX INFO: renamed from: a */
    public final long mo7236a() {
        return this.f5993b;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    /* JADX INFO: renamed from: b */
    public final int mo7237b() {
        return this.f5994c;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    /* JADX INFO: renamed from: c */
    public final long mo7238c() {
        return this.f6006o;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    /* JADX INFO: renamed from: d */
    public final String mo7239d() {
        String str = this.f5995d;
        int i = this.f5998g;
        String strJoin = this.f5999h == null ? "" : TextUtils.join(",", this.f5999h);
        int i2 = this.f6002k;
        String str2 = this.f5996e == null ? "" : this.f5996e;
        String str3 = this.f6003l == null ? "" : this.f6003l;
        float f = this.f6004m;
        String str4 = this.f5997f == null ? "" : this.f5997f;
        return new StringBuilder(String.valueOf("\t").length() + 37 + String.valueOf(str).length() + String.valueOf("\t").length() + String.valueOf("\t").length() + String.valueOf(strJoin).length() + String.valueOf("\t").length() + String.valueOf("\t").length() + String.valueOf(str2).length() + String.valueOf("\t").length() + String.valueOf(str3).length() + String.valueOf("\t").length() + String.valueOf("\t").length() + String.valueOf(str4).length()).append("\t").append(str).append("\t").append(i).append("\t").append(strJoin).append("\t").append(i2).append("\t").append(str2).append("\t").append(str3).append("\t").append(f).append("\t").append(str4).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM12512a = C2014wh.m12512a(parcel);
        C2014wh.m12516a(parcel, 1, this.f5992a);
        C2014wh.m12517a(parcel, 2, mo7236a());
        C2014wh.m12524a(parcel, 4, this.f5995d, false);
        C2014wh.m12516a(parcel, 5, this.f5998g);
        C2014wh.m12535b(parcel, 6, this.f5999h, false);
        C2014wh.m12517a(parcel, 8, this.f6001j);
        C2014wh.m12524a(parcel, 10, this.f5996e, false);
        C2014wh.m12516a(parcel, 11, mo7237b());
        C2014wh.m12524a(parcel, 12, this.f6000i, false);
        C2014wh.m12524a(parcel, 13, this.f6003l, false);
        C2014wh.m12516a(parcel, 14, this.f6002k);
        C2014wh.m12515a(parcel, 15, this.f6004m);
        C2014wh.m12517a(parcel, 16, this.f6005n);
        C2014wh.m12524a(parcel, 17, this.f5997f, false);
        C2014wh.m12513a(parcel, iM12512a);
    }
}
