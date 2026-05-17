package com.google.android.gms.internal;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class ahl extends bns implements ahk {
    public ahl() {
        attachInterface(this, "com.google.android.gms.tagmanager.internal.ITagManagerLoadContainerCallback");
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        if (i != 1) {
            return false;
        }
        mo7930a(bnt.m9738a(parcel), parcel.readString());
        return true;
    }
}
