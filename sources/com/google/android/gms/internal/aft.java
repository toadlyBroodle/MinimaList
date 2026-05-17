package com.google.android.gms.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.InterfaceC1193k;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public final class aft extends AbstractC2011we implements InterfaceC1193k {
    public static final Parcelable.Creator<aft> CREATOR = new afu();

    /* JADX INFO: renamed from: a */
    private int f6675a;

    /* JADX INFO: renamed from: b */
    private int f6676b;

    /* JADX INFO: renamed from: c */
    private Intent f6677c;

    public aft() {
        this(0, null);
    }

    aft(int i, int i2, Intent intent) {
        this.f6675a = i;
        this.f6676b = i2;
        this.f6677c = intent;
    }

    private aft(int i, Intent intent) {
        this(2, 0, null);
    }

    @Override // com.google.android.gms.common.api.InterfaceC1193k
    /* JADX INFO: renamed from: a */
    public final Status mo6094a() {
        return this.f6676b == 0 ? Status.f5451a : Status.f5455e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM12512a = C2014wh.m12512a(parcel);
        C2014wh.m12516a(parcel, 1, this.f6675a);
        C2014wh.m12516a(parcel, 2, this.f6676b);
        C2014wh.m12520a(parcel, 3, (Parcelable) this.f6677c, i, false);
        C2014wh.m12513a(parcel, iM12512a);
    }
}
