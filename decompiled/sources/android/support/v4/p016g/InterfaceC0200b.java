package android.support.v4.p016g;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: android.support.v4.g.b */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0200b extends IInterface {

    /* JADX INFO: renamed from: android.support.v4.g.b$a */
    public static abstract class a extends Binder implements InterfaceC0200b {

        /* JADX INFO: renamed from: android.support.v4.g.b$a$a, reason: collision with other inner class name */
        private static class C2322a implements InterfaceC0200b {

            /* JADX INFO: renamed from: a */
            private IBinder f1159a;

            C2322a(IBinder iBinder) {
                this.f1159a = iBinder;
            }

            @Override // android.support.v4.p016g.InterfaceC0200b
            /* JADX INFO: renamed from: a */
            public void mo1466a(int i, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.os.IResultReceiver");
                    parcelObtain.writeInt(i);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.f1159a.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f1159a;
            }
        }

        public a() {
            attachInterface(this, "android.support.v4.os.IResultReceiver");
        }

        /* JADX INFO: renamed from: a */
        public static InterfaceC0200b m1467a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0200b)) ? new C2322a(iBinder) : (InterfaceC0200b) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("android.support.v4.os.IResultReceiver");
                    mo1466a(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 1598968902:
                    parcel2.writeString("android.support.v4.os.IResultReceiver");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    void mo1466a(int i, Bundle bundle);
}
