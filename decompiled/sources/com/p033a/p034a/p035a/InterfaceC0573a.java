package com.p033a.p034a.p035a;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: com.a.a.a.a */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0573a extends IInterface {

    /* JADX INFO: renamed from: com.a.a.a.a$a */
    public static abstract class a extends Binder implements InterfaceC0573a {

        /* JADX INFO: renamed from: com.a.a.a.a$a$a, reason: collision with other inner class name */
        private static class C2329a implements InterfaceC0573a {

            /* JADX INFO: renamed from: a */
            private IBinder f3997a;

            C2329a(IBinder iBinder) {
                this.f3997a = iBinder;
            }

            @Override // com.p033a.p034a.p035a.InterfaceC0573a
            /* JADX INFO: renamed from: a */
            public int mo5021a(int i, String str, String str2) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    this.f3997a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.p033a.p034a.p035a.InterfaceC0573a
            /* JADX INFO: renamed from: a */
            public Bundle mo5022a(int i, String str, String str2, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.f3997a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.p033a.p034a.p035a.InterfaceC0573a
            /* JADX INFO: renamed from: a */
            public Bundle mo5023a(int i, String str, String str2, String str3) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    this.f3997a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.p033a.p034a.p035a.InterfaceC0573a
            /* JADX INFO: renamed from: a */
            public Bundle mo5024a(int i, String str, String str2, String str3, String str4) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    parcelObtain.writeString(str4);
                    this.f3997a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f3997a;
            }

            @Override // com.p033a.p034a.p035a.InterfaceC0573a
            /* JADX INFO: renamed from: b */
            public int mo5025b(int i, String str, String str2) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    this.f3997a.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        /* JADX INFO: renamed from: a */
        public static InterfaceC0573a m5026a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0573a)) ? new C2329a(iBinder) : (InterfaceC0573a) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.android.vending.billing.IInAppBillingService");
                    int iA = mo5021a(parcel.readInt(), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(iA);
                    return true;
                case 2:
                    parcel.enforceInterface("com.android.vending.billing.IInAppBillingService");
                    Bundle bundleA = mo5022a(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    if (bundleA != null) {
                        parcel2.writeInt(1);
                        bundleA.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 3:
                    parcel.enforceInterface("com.android.vending.billing.IInAppBillingService");
                    Bundle bundleA2 = mo5024a(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    if (bundleA2 != null) {
                        parcel2.writeInt(1);
                        bundleA2.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 4:
                    parcel.enforceInterface("com.android.vending.billing.IInAppBillingService");
                    Bundle bundleA3 = mo5023a(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    if (bundleA3 != null) {
                        parcel2.writeInt(1);
                        bundleA3.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 5:
                    parcel.enforceInterface("com.android.vending.billing.IInAppBillingService");
                    int iB = mo5025b(parcel.readInt(), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(iB);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.android.vending.billing.IInAppBillingService");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    int mo5021a(int i, String str, String str2);

    /* JADX INFO: renamed from: a */
    Bundle mo5022a(int i, String str, String str2, Bundle bundle);

    /* JADX INFO: renamed from: a */
    Bundle mo5023a(int i, String str, String str2, String str3);

    /* JADX INFO: renamed from: a */
    Bundle mo5024a(int i, String str, String str2, String str3, String str4);

    /* JADX INFO: renamed from: b */
    int mo5025b(int i, String str, String str2);
}
