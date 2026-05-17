package com.google.android.gms.ads.p045b;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.AbstractC2011we;
import com.google.android.gms.internal.C2014wh;
import com.google.android.gms.internal.byi;
import com.google.android.gms.internal.byj;
import com.google.android.gms.internal.cnb;

/* JADX INFO: renamed from: com.google.android.gms.ads.b.j */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C0673j extends AbstractC2011we {
    public static final Parcelable.Creator<C0673j> CREATOR = new C0675l();

    /* JADX INFO: renamed from: a */
    private final boolean f4360a;

    /* JADX INFO: renamed from: b */
    private final byi f4361b;

    C0673j(boolean z, IBinder iBinder) {
        this.f4360a = z;
        this.f4361b = iBinder != null ? byj.m10417a(iBinder) : null;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m5383a() {
        return this.f4360a;
    }

    /* JADX INFO: renamed from: b */
    public final byi m5384b() {
        return this.f4361b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM12512a = C2014wh.m12512a(parcel);
        C2014wh.m12526a(parcel, 1, m5383a());
        C2014wh.m12519a(parcel, 2, this.f4361b == null ? null : this.f4361b.asBinder(), false);
        C2014wh.m12513a(parcel, iM12512a);
    }
}
