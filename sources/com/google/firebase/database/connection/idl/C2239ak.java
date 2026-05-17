package com.google.firebase.database.connection.idl;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.bnr;
import com.google.android.gms.internal.bnt;
import com.google.android.gms.p043a.InterfaceC0652a;
import java.util.List;

/* JADX INFO: renamed from: com.google.firebase.database.connection.idl.ak */
/* JADX INFO: loaded from: classes.dex */
public final class C2239ak extends bnr implements InterfaceC2237ai {
    C2239ak(IBinder iBinder) {
        super(iBinder, "com.google.firebase.database.connection.idl.IPersistentConnectionDelegate");
    }

    @Override // com.google.firebase.database.connection.idl.InterfaceC2237ai
    /* JADX INFO: renamed from: a */
    public final void mo12981a() {
        m9731b(3, m9733o_());
    }

    @Override // com.google.firebase.database.connection.idl.InterfaceC2237ai
    /* JADX INFO: renamed from: a */
    public final void mo12982a(InterfaceC0652a interfaceC0652a) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9735a(parcelM9733o_, interfaceC0652a);
        m9731b(6, parcelM9733o_);
    }

    @Override // com.google.firebase.database.connection.idl.InterfaceC2237ai
    /* JADX INFO: renamed from: a */
    public final void mo12983a(List<String> list, InterfaceC0652a interfaceC0652a, boolean z, long j) {
        Parcel parcelM9733o_ = m9733o_();
        parcelM9733o_.writeStringList(list);
        bnt.m9735a(parcelM9733o_, interfaceC0652a);
        bnt.m9737a(parcelM9733o_, z);
        parcelM9733o_.writeLong(j);
        m9731b(1, parcelM9733o_);
    }

    @Override // com.google.firebase.database.connection.idl.InterfaceC2237ai
    /* JADX INFO: renamed from: a */
    public final void mo12984a(List<String> list, List<C2251l> list2, InterfaceC0652a interfaceC0652a, long j) {
        Parcel parcelM9733o_ = m9733o_();
        parcelM9733o_.writeStringList(list);
        parcelM9733o_.writeTypedList(list2);
        bnt.m9735a(parcelM9733o_, interfaceC0652a);
        parcelM9733o_.writeLong(j);
        m9731b(2, parcelM9733o_);
    }

    @Override // com.google.firebase.database.connection.idl.InterfaceC2237ai
    /* JADX INFO: renamed from: a */
    public final void mo12985a(boolean z) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9737a(parcelM9733o_, z);
        m9731b(5, parcelM9733o_);
    }

    @Override // com.google.firebase.database.connection.idl.InterfaceC2237ai
    /* JADX INFO: renamed from: b */
    public final void mo12986b() {
        m9731b(4, m9733o_());
    }
}
