package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class byz extends bnr implements byx {
    byz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController");
    }

    @Override // com.google.android.gms.internal.byx
    /* JADX INFO: renamed from: a */
    public final void mo10420a() {
        m9731b(1, m9733o_());
    }

    @Override // com.google.android.gms.internal.byx
    /* JADX INFO: renamed from: a */
    public final void mo10421a(bza bzaVar) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9735a(parcelM9733o_, bzaVar);
        m9731b(8, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.byx
    /* JADX INFO: renamed from: a */
    public final void mo10422a(boolean z) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9737a(parcelM9733o_, z);
        m9731b(3, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.byx
    /* JADX INFO: renamed from: b */
    public final void mo10423b() {
        m9731b(2, m9733o_());
    }

    @Override // com.google.android.gms.internal.byx
    /* JADX INFO: renamed from: c */
    public final boolean mo10424c() {
        Parcel parcelM9730a = m9730a(4, m9733o_());
        boolean zM9738a = bnt.m9738a(parcelM9730a);
        parcelM9730a.recycle();
        return zM9738a;
    }

    @Override // com.google.android.gms.internal.byx
    /* JADX INFO: renamed from: d */
    public final int mo10425d() {
        Parcel parcelM9730a = m9730a(5, m9733o_());
        int i = parcelM9730a.readInt();
        parcelM9730a.recycle();
        return i;
    }

    @Override // com.google.android.gms.internal.byx
    /* JADX INFO: renamed from: e */
    public final float mo10426e() {
        Parcel parcelM9730a = m9730a(9, m9733o_());
        float f = parcelM9730a.readFloat();
        parcelM9730a.recycle();
        return f;
    }

    @Override // com.google.android.gms.internal.byx
    /* JADX INFO: renamed from: f */
    public final float mo10427f() {
        Parcel parcelM9730a = m9730a(6, m9733o_());
        float f = parcelM9730a.readFloat();
        parcelM9730a.recycle();
        return f;
    }

    @Override // com.google.android.gms.internal.byx
    /* JADX INFO: renamed from: g */
    public final float mo10428g() {
        Parcel parcelM9730a = m9730a(7, m9733o_());
        float f = parcelM9730a.readFloat();
        parcelM9730a.recycle();
        return f;
    }

    @Override // com.google.android.gms.internal.byx
    /* JADX INFO: renamed from: h */
    public final bza mo10429h() {
        bza bzcVar;
        Parcel parcelM9730a = m9730a(11, m9733o_());
        IBinder strongBinder = parcelM9730a.readStrongBinder();
        if (strongBinder == null) {
            bzcVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
            bzcVar = iInterfaceQueryLocalInterface instanceof bza ? (bza) iInterfaceQueryLocalInterface : new bzc(strongBinder);
        }
        parcelM9730a.recycle();
        return bzcVar;
    }

    @Override // com.google.android.gms.internal.byx
    /* JADX INFO: renamed from: i */
    public final boolean mo10430i() {
        Parcel parcelM9730a = m9730a(10, m9733o_());
        boolean zM9738a = bnt.m9738a(parcelM9730a);
        parcelM9730a.recycle();
        return zM9738a;
    }

    @Override // com.google.android.gms.internal.byx
    /* JADX INFO: renamed from: j */
    public final boolean mo10431j() {
        Parcel parcelM9730a = m9730a(12, m9733o_());
        boolean zM9738a = bnt.m9738a(parcelM9730a);
        parcelM9730a.recycle();
        return zM9738a;
    }
}
