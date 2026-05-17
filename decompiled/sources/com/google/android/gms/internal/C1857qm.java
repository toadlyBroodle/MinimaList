package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.google.android.gms.internal.qm */
/* JADX INFO: loaded from: classes.dex */
final class C1857qm implements Parcelable.Creator<C1856ql> {
    C1857qm() {
    }

    @Override // android.os.Parcelable.Creator
    @Deprecated
    public final /* synthetic */ C1856ql createFromParcel(Parcel parcel) {
        return new C1856ql(parcel);
    }

    @Override // android.os.Parcelable.Creator
    @Deprecated
    public final /* synthetic */ C1856ql[] newArray(int i) {
        return new C1856ql[i];
    }
}
