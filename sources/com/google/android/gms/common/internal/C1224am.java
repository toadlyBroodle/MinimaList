package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.C1071a;
import com.google.android.gms.internal.AbstractC2011we;
import com.google.android.gms.internal.C2014wh;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.am */
/* JADX INFO: loaded from: classes.dex */
public final class C1224am extends AbstractC2011we {
    public static final Parcelable.Creator<C1224am> CREATOR = new C1225an();

    /* JADX INFO: renamed from: a */
    private int f5849a;

    /* JADX INFO: renamed from: b */
    private IBinder f5850b;

    /* JADX INFO: renamed from: c */
    private C1071a f5851c;

    /* JADX INFO: renamed from: d */
    private boolean f5852d;

    /* JADX INFO: renamed from: e */
    private boolean f5853e;

    C1224am(int i, IBinder iBinder, C1071a c1071a, boolean z, boolean z2) {
        this.f5849a = i;
        this.f5850b = iBinder;
        this.f5851c = c1071a;
        this.f5852d = z;
        this.f5853e = z2;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC1268o m7078a() {
        IBinder iBinder = this.f5850b;
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
        return iInterfaceQueryLocalInterface instanceof InterfaceC1268o ? (InterfaceC1268o) iInterfaceQueryLocalInterface : new C1270q(iBinder);
    }

    /* JADX INFO: renamed from: b */
    public final C1071a m7079b() {
        return this.f5851c;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m7080c() {
        return this.f5852d;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m7081d() {
        return this.f5853e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1224am)) {
            return false;
        }
        C1224am c1224am = (C1224am) obj;
        return this.f5851c.equals(c1224am.f5851c) && m7078a().equals(c1224am.m7078a());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM12512a = C2014wh.m12512a(parcel);
        C2014wh.m12516a(parcel, 1, this.f5849a);
        C2014wh.m12519a(parcel, 2, this.f5850b, false);
        C2014wh.m12520a(parcel, 3, (Parcelable) this.f5851c, i, false);
        C2014wh.m12526a(parcel, 4, this.f5852d);
        C2014wh.m12526a(parcel, 5, this.f5853e);
        C2014wh.m12513a(parcel, iM12512a);
    }
}
