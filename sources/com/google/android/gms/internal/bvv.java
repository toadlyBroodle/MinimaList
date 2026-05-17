package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class bvv extends AbstractC2011we {
    public static final Parcelable.Creator<bvv> CREATOR = new bvw();

    /* JADX INFO: renamed from: a */
    private ParcelFileDescriptor f9142a;

    public bvv() {
        this(null);
    }

    public bvv(ParcelFileDescriptor parcelFileDescriptor) {
        this.f9142a = parcelFileDescriptor;
    }

    /* JADX INFO: renamed from: c */
    private synchronized ParcelFileDescriptor m10344c() {
        return this.f9142a;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized boolean m10345a() {
        return this.f9142a != null;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized InputStream m10346b() {
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = null;
        synchronized (this) {
            if (this.f9142a != null) {
                autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(this.f9142a);
                this.f9142a = null;
            }
        }
        return autoCloseInputStream;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM12512a = C2014wh.m12512a(parcel);
        C2014wh.m12520a(parcel, 2, (Parcelable) m10344c(), i, false);
        C2014wh.m12513a(parcel, iM12512a);
    }
}
