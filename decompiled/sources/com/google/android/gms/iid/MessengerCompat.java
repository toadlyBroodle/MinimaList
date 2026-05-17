package com.google.android.gms.iid;

import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* JADX INFO: loaded from: classes.dex */
public class MessengerCompat implements ReflectedParcelable {
    public static final Parcelable.Creator<MessengerCompat> CREATOR = new C1352c();

    /* JADX INFO: renamed from: a */
    private Messenger f6098a;

    /* JADX INFO: renamed from: b */
    private InterfaceC1350a f6099b;

    public MessengerCompat(IBinder iBinder) {
        InterfaceC1350a c1351b;
        if (Build.VERSION.SDK_INT >= 21) {
            this.f6098a = new Messenger(iBinder);
            return;
        }
        if (iBinder == null) {
            c1351b = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.iid.IMessengerCompat");
            c1351b = iInterfaceQueryLocalInterface instanceof InterfaceC1350a ? (InterfaceC1350a) iInterfaceQueryLocalInterface : new C1351b(iBinder);
        }
        this.f6099b = c1351b;
    }

    /* JADX INFO: renamed from: a */
    private final IBinder m7351a() {
        return this.f6098a != null ? this.f6098a.getBinder() : this.f6099b.asBinder();
    }

    /* JADX INFO: renamed from: a */
    public final void m7352a(Message message) throws RemoteException {
        if (this.f6098a != null) {
            this.f6098a.send(message);
        } else {
            this.f6099b.mo7353a(message);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return m7351a().equals(((MessengerCompat) obj).m7351a());
        } catch (ClassCastException e) {
            return false;
        }
    }

    public int hashCode() {
        return m7351a().hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (this.f6098a != null) {
            parcel.writeStrongBinder(this.f6098a.getBinder());
        } else {
            parcel.writeStrongBinder(this.f6099b.asBinder());
        }
    }
}
