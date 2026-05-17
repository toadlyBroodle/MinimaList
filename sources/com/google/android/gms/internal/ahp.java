package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class ahp extends bns implements aho {
    public ahp() {
        attachInterface(this, "com.google.android.gms.tagmanager.internal.ITagManagerService");
    }

    /* JADX INFO: renamed from: a */
    public static aho m7938a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.tagmanager.internal.ITagManagerService");
        return iInterfaceQueryLocalInterface instanceof aho ? (aho) iInterfaceQueryLocalInterface : new ahq(iBinder);
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        ahk ahmVar;
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                mo7935a(parcel.readString(), parcel.readString(), parcel.readString());
                break;
            case 2:
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    ahmVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.tagmanager.internal.ITagManagerLoadContainerCallback");
                    ahmVar = iInterfaceQueryLocalInterface instanceof ahk ? (ahk) iInterfaceQueryLocalInterface : new ahm(strongBinder);
                }
                mo7936a(string, string2, string3, ahmVar);
                break;
            case 3:
                mo7933a();
                break;
            case 101:
                mo7934a(parcel.readString(), (Bundle) bnt.m9734a(parcel, Bundle.CREATOR), parcel.readString(), parcel.readLong(), bnt.m9738a(parcel));
                break;
            case 102:
                mo7937b();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
