package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.google.android.gms.internal.ql */
/* JADX INFO: loaded from: classes.dex */
public final class C1856ql implements Parcelable {

    @Deprecated
    public static final Parcelable.Creator<C1856ql> CREATOR = new C1857qm();

    /* JADX INFO: renamed from: a */
    private String f11376a;

    /* JADX INFO: renamed from: b */
    private String f11377b;

    /* JADX INFO: renamed from: c */
    private String f11378c;

    @Deprecated
    public C1856ql() {
    }

    @Deprecated
    C1856ql(Parcel parcel) {
        this.f11376a = parcel.readString();
        this.f11377b = parcel.readString();
        this.f11378c = parcel.readString();
    }

    /* JADX INFO: renamed from: a */
    public final String m12157a() {
        return this.f11376a;
    }

    /* JADX INFO: renamed from: b */
    public final String m12158b() {
        return this.f11378c;
    }

    @Override // android.os.Parcelable
    @Deprecated
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    @Deprecated
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f11376a);
        parcel.writeString(this.f11377b);
        parcel.writeString(this.f11378c);
    }
}
