package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1218ag;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.AbstractC2011we;
import com.google.android.gms.internal.C2014wh;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class Status extends AbstractC2011we implements InterfaceC1193k, ReflectedParcelable {

    /* JADX INFO: renamed from: h */
    private int f5458h;

    /* JADX INFO: renamed from: i */
    private final int f5459i;

    /* JADX INFO: renamed from: j */
    private final String f5460j;

    /* JADX INFO: renamed from: k */
    private final PendingIntent f5461k;

    /* JADX INFO: renamed from: a */
    public static final Status f5451a = new Status(0);

    /* JADX INFO: renamed from: b */
    public static final Status f5452b = new Status(14);

    /* JADX INFO: renamed from: c */
    public static final Status f5453c = new Status(8);

    /* JADX INFO: renamed from: d */
    public static final Status f5454d = new Status(15);

    /* JADX INFO: renamed from: e */
    public static final Status f5455e = new Status(16);

    /* JADX INFO: renamed from: f */
    public static final Status f5456f = new Status(17);

    /* JADX INFO: renamed from: g */
    private static Status f5457g = new Status(18);
    public static final Parcelable.Creator<Status> CREATOR = new C1202t();

    public Status(int i) {
        this(i, null);
    }

    Status(int i, int i2, String str, PendingIntent pendingIntent) {
        this.f5458h = i;
        this.f5459i = i2;
        this.f5460j = str;
        this.f5461k = pendingIntent;
    }

    public Status(int i, String str) {
        this(1, i, str, null);
    }

    public Status(int i, String str, PendingIntent pendingIntent) {
        this(1, i, str, pendingIntent);
    }

    @Override // com.google.android.gms.common.api.InterfaceC1193k
    /* JADX INFO: renamed from: a */
    public final Status mo6094a() {
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final String m6624b() {
        return this.f5460j;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m6625c() {
        return this.f5461k != null;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m6626d() {
        return this.f5459i <= 0;
    }

    /* JADX INFO: renamed from: e */
    public final int m6627e() {
        return this.f5459i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f5458h == status.f5458h && this.f5459i == status.f5459i && C1218ag.m7063a(this.f5460j, status.f5460j) && C1218ag.m7063a(this.f5461k, status.f5461k);
    }

    /* JADX INFO: renamed from: f */
    public final String m6628f() {
        return this.f5460j != null ? this.f5460j : C1077d.m6649a(this.f5459i);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f5458h), Integer.valueOf(this.f5459i), this.f5460j, this.f5461k});
    }

    public final String toString() {
        return C1218ag.m7062a(this).m7064a("statusCode", m6628f()).m7064a("resolution", this.f5461k).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM12512a = C2014wh.m12512a(parcel);
        C2014wh.m12516a(parcel, 1, m6627e());
        C2014wh.m12524a(parcel, 2, m6624b(), false);
        C2014wh.m12520a(parcel, 3, (Parcelable) this.f5461k, i, false);
        C2014wh.m12516a(parcel, 1000, this.f5458h);
        C2014wh.m12513a(parcel, iM12512a);
    }
}
