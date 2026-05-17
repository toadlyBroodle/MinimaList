package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.AbstractC2011we;
import com.google.android.gms.internal.C2014wh;

/* JADX INFO: renamed from: com.google.firebase.messaging.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2315a extends AbstractC2011we {
    public static final Parcelable.Creator<C2315a> CREATOR = new C2321g();

    /* JADX INFO: renamed from: a */
    Bundle f13062a;

    C2315a(Bundle bundle) {
        this.f13062a = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM12512a = C2014wh.m12512a(parcel);
        C2014wh.m12518a(parcel, 2, this.f13062a, false);
        C2014wh.m12513a(parcel, iM12512a);
    }
}
