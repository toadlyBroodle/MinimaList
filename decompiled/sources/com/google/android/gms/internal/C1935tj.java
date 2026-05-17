package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.cast.framework.C1000b;
import com.google.android.gms.cast.framework.InterfaceC0995ab;
import com.google.android.gms.cast.framework.InterfaceC1009k;
import com.google.android.gms.cast.framework.InterfaceC1042r;
import com.google.android.gms.cast.framework.InterfaceC1044t;
import com.google.android.gms.cast.framework.InterfaceC1046v;
import com.google.android.gms.cast.framework.InterfaceC1050z;
import com.google.android.gms.cast.framework.media.C1012a;
import com.google.android.gms.cast.framework.media.InterfaceC1027p;
import com.google.android.gms.internal.InterfaceC1950ty;
import com.google.android.gms.p043a.InterfaceC0652a;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.tj */
/* JADX INFO: loaded from: classes.dex */
public final class C1935tj extends bnr implements InterfaceC1934ti {
    C1935tj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
    }

    @Override // com.google.android.gms.internal.InterfaceC1934ti
    /* JADX INFO: renamed from: a */
    public final InterfaceC0995ab mo12318a(String str, String str2, InterfaceC1009k interfaceC1009k) {
        Parcel parcelM9733o_ = m9733o_();
        parcelM9733o_.writeString(str);
        parcelM9733o_.writeString(str2);
        bnt.m9735a(parcelM9733o_, interfaceC1009k);
        Parcel parcelM9730a = m9730a(2, parcelM9733o_);
        InterfaceC0995ab interfaceC0995abM6347a = InterfaceC0995ab.a.m6347a(parcelM9730a.readStrongBinder());
        parcelM9730a.recycle();
        return interfaceC0995abM6347a;
    }

    @Override // com.google.android.gms.internal.InterfaceC1934ti
    /* JADX INFO: renamed from: a */
    public final InterfaceC1027p mo12319a(InterfaceC0652a interfaceC0652a, InterfaceC0652a interfaceC0652a2, InterfaceC0652a interfaceC0652a3, C1012a c1012a) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9735a(parcelM9733o_, interfaceC0652a);
        bnt.m9735a(parcelM9733o_, interfaceC0652a2);
        bnt.m9735a(parcelM9733o_, interfaceC0652a3);
        bnt.m9736a(parcelM9733o_, c1012a);
        Parcel parcelM9730a = m9730a(4, parcelM9733o_);
        InterfaceC1027p interfaceC1027pM6518a = InterfaceC1027p.a.m6518a(parcelM9730a.readStrongBinder());
        parcelM9730a.recycle();
        return interfaceC1027pM6518a;
    }

    @Override // com.google.android.gms.internal.InterfaceC1934ti
    /* JADX INFO: renamed from: a */
    public final InterfaceC1044t mo12320a(InterfaceC0652a interfaceC0652a, C1000b c1000b, InterfaceC1936tk interfaceC1936tk, Map map) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9735a(parcelM9733o_, interfaceC0652a);
        bnt.m9736a(parcelM9733o_, c1000b);
        bnt.m9735a(parcelM9733o_, interfaceC1936tk);
        parcelM9733o_.writeMap(map);
        Parcel parcelM9730a = m9730a(1, parcelM9733o_);
        InterfaceC1044t interfaceC1044tM6529a = InterfaceC1044t.a.m6529a(parcelM9730a.readStrongBinder());
        parcelM9730a.recycle();
        return interfaceC1044tM6529a;
    }

    @Override // com.google.android.gms.internal.InterfaceC1934ti
    /* JADX INFO: renamed from: a */
    public final InterfaceC1046v mo12321a(C1000b c1000b, InterfaceC0652a interfaceC0652a, InterfaceC1042r interfaceC1042r) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9736a(parcelM9733o_, c1000b);
        bnt.m9735a(parcelM9733o_, interfaceC0652a);
        bnt.m9735a(parcelM9733o_, interfaceC1042r);
        Parcel parcelM9730a = m9730a(3, parcelM9733o_);
        InterfaceC1046v interfaceC1046vM6536a = InterfaceC1046v.a.m6536a(parcelM9730a.readStrongBinder());
        parcelM9730a.recycle();
        return interfaceC1046vM6536a;
    }

    @Override // com.google.android.gms.internal.InterfaceC1934ti
    /* JADX INFO: renamed from: a */
    public final InterfaceC1050z mo12322a(InterfaceC0652a interfaceC0652a, InterfaceC0652a interfaceC0652a2, InterfaceC0652a interfaceC0652a3) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9735a(parcelM9733o_, interfaceC0652a);
        bnt.m9735a(parcelM9733o_, interfaceC0652a2);
        bnt.m9735a(parcelM9733o_, interfaceC0652a3);
        Parcel parcelM9730a = m9730a(5, parcelM9733o_);
        InterfaceC1050z interfaceC1050zM6538a = InterfaceC1050z.a.m6538a(parcelM9730a.readStrongBinder());
        parcelM9730a.recycle();
        return interfaceC1050zM6538a;
    }

    @Override // com.google.android.gms.internal.InterfaceC1934ti
    /* JADX INFO: renamed from: a */
    public final InterfaceC1950ty mo12323a(InterfaceC0652a interfaceC0652a, InterfaceC1953ua interfaceC1953ua, int i, int i2, boolean z, long j, int i3, int i4, int i5) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9735a(parcelM9733o_, interfaceC0652a);
        bnt.m9735a(parcelM9733o_, interfaceC1953ua);
        parcelM9733o_.writeInt(i);
        parcelM9733o_.writeInt(i2);
        bnt.m9737a(parcelM9733o_, z);
        parcelM9733o_.writeLong(j);
        parcelM9733o_.writeInt(i3);
        parcelM9733o_.writeInt(i4);
        parcelM9733o_.writeInt(i5);
        Parcel parcelM9730a = m9730a(6, parcelM9733o_);
        InterfaceC1950ty interfaceC1950tyM12350a = InterfaceC1950ty.a.m12350a(parcelM9730a.readStrongBinder());
        parcelM9730a.recycle();
        return interfaceC1950tyM12350a;
    }
}
