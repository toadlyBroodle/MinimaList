package com.google.android.gms.cast.framework.media;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.cast.C1052h;
import com.google.android.gms.common.p052a.C1072a;
import com.google.android.gms.internal.bnr;
import com.google.android.gms.internal.bnt;
import com.google.android.gms.p043a.InterfaceC0652a;

/* JADX INFO: renamed from: com.google.android.gms.cast.framework.media.o */
/* JADX INFO: loaded from: classes.dex */
public final class C1026o extends bnr implements InterfaceC1025n {
    C1026o(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.media.IImagePicker");
    }

    @Override // com.google.android.gms.cast.framework.media.InterfaceC1025n
    /* JADX INFO: renamed from: a */
    public final int mo6430a() {
        Parcel parcelM9730a = m9730a(3, m9733o_());
        int i = parcelM9730a.readInt();
        parcelM9730a.recycle();
        return i;
    }

    @Override // com.google.android.gms.cast.framework.media.InterfaceC1025n
    /* JADX INFO: renamed from: a */
    public final C1072a mo6431a(C1052h c1052h, int i) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9736a(parcelM9733o_, c1052h);
        parcelM9733o_.writeInt(i);
        Parcel parcelM9730a = m9730a(1, parcelM9733o_);
        C1072a c1072a = (C1072a) bnt.m9734a(parcelM9730a, C1072a.CREATOR);
        parcelM9730a.recycle();
        return c1072a;
    }

    @Override // com.google.android.gms.cast.framework.media.InterfaceC1025n
    /* JADX INFO: renamed from: a */
    public final C1072a mo6432a(C1052h c1052h, C1013b c1013b) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9736a(parcelM9733o_, c1052h);
        bnt.m9736a(parcelM9733o_, c1013b);
        Parcel parcelM9730a = m9730a(4, parcelM9733o_);
        C1072a c1072a = (C1072a) bnt.m9734a(parcelM9730a, C1072a.CREATOR);
        parcelM9730a.recycle();
        return c1072a;
    }

    @Override // com.google.android.gms.cast.framework.media.InterfaceC1025n
    /* JADX INFO: renamed from: b */
    public final InterfaceC0652a mo6433b() {
        Parcel parcelM9730a = m9730a(2, m9733o_());
        InterfaceC0652a interfaceC0652aM5328a = InterfaceC0652a.a.m5328a(parcelM9730a.readStrongBinder());
        parcelM9730a.recycle();
        return interfaceC0652aM5328a;
    }
}
