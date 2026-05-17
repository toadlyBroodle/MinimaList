package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepName;

/* JADX INFO: loaded from: classes.dex */
@KeepName
public final class BinderWrapper implements Parcelable {
    public static final Parcelable.Creator<BinderWrapper> CREATOR = new C1247bi();

    /* JADX INFO: renamed from: a */
    private IBinder f5838a;

    public BinderWrapper() {
        this.f5838a = null;
    }

    public BinderWrapper(IBinder iBinder) {
        this.f5838a = null;
        this.f5838a = iBinder;
    }

    private BinderWrapper(Parcel parcel) {
        this.f5838a = null;
        this.f5838a = parcel.readStrongBinder();
    }

    /* synthetic */ BinderWrapper(Parcel parcel, C1247bi c1247bi) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.f5838a);
    }
}
