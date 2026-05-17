package com.google.android.gms.cast.framework.media;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.cast.C1052h;
import com.google.android.gms.common.p052a.C1072a;
import com.google.android.gms.internal.bns;
import com.google.android.gms.internal.bnt;
import com.google.android.gms.p043a.InterfaceC0652a;

/* JADX INFO: renamed from: com.google.android.gms.cast.framework.media.n */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1025n extends IInterface {

    /* JADX INFO: renamed from: com.google.android.gms.cast.framework.media.n$a */
    public static abstract class a extends bns implements InterfaceC1025n {
        public a() {
            attachInterface(this, "com.google.android.gms.cast.framework.media.IImagePicker");
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (zza(i, parcel, parcel2, i2)) {
                return true;
            }
            switch (i) {
                case 1:
                    C1072a c1072aA = mo6431a((C1052h) bnt.m9734a(parcel, C1052h.CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    bnt.m9740b(parcel2, c1072aA);
                    break;
                case 2:
                    InterfaceC0652a interfaceC0652aB = mo6433b();
                    parcel2.writeNoException();
                    bnt.m9735a(parcel2, interfaceC0652aB);
                    break;
                case 3:
                    int iA = mo6430a();
                    parcel2.writeNoException();
                    parcel2.writeInt(iA);
                    break;
                case 4:
                    C1072a c1072aA2 = mo6432a((C1052h) bnt.m9734a(parcel, C1052h.CREATOR), (C1013b) bnt.m9734a(parcel, C1013b.CREATOR));
                    parcel2.writeNoException();
                    bnt.m9740b(parcel2, c1072aA2);
                    break;
                default:
                    return false;
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: a */
    int mo6430a();

    /* JADX INFO: renamed from: a */
    C1072a mo6431a(C1052h c1052h, int i);

    /* JADX INFO: renamed from: a */
    C1072a mo6432a(C1052h c1052h, C1013b c1013b);

    /* JADX INFO: renamed from: b */
    InterfaceC0652a mo6433b();
}
