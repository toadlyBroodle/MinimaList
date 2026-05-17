package com.google.firebase.database.connection.idl;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.bnr;
import com.google.android.gms.internal.bnt;
import com.google.android.gms.p043a.InterfaceC0652a;
import java.util.List;

/* JADX INFO: renamed from: com.google.firebase.database.connection.idl.ah */
/* JADX INFO: loaded from: classes.dex */
public final class C2236ah extends bnr implements InterfaceC2234af {
    C2236ah(IBinder iBinder) {
        super(iBinder, "com.google.firebase.database.connection.idl.IPersistentConnection");
    }

    @Override // com.google.firebase.database.connection.idl.InterfaceC2234af
    public final void compareAndPut(List<String> list, InterfaceC0652a interfaceC0652a, String str, InterfaceC2248i interfaceC2248i) {
        Parcel parcelM9733o_ = m9733o_();
        parcelM9733o_.writeStringList(list);
        bnt.m9735a(parcelM9733o_, interfaceC0652a);
        parcelM9733o_.writeString(str);
        bnt.m9735a(parcelM9733o_, interfaceC2248i);
        m9731b(9, parcelM9733o_);
    }

    @Override // com.google.firebase.database.connection.idl.InterfaceC2234af
    public final void initialize() {
        m9731b(2, m9733o_());
    }

    @Override // com.google.firebase.database.connection.idl.InterfaceC2234af
    public final void interrupt(String str) {
        Parcel parcelM9733o_ = m9733o_();
        parcelM9733o_.writeString(str);
        m9731b(14, parcelM9733o_);
    }

    @Override // com.google.firebase.database.connection.idl.InterfaceC2234af
    public final boolean isInterrupted(String str) {
        Parcel parcelM9733o_ = m9733o_();
        parcelM9733o_.writeString(str);
        Parcel parcelM9730a = m9730a(16, parcelM9733o_);
        boolean zM9738a = bnt.m9738a(parcelM9730a);
        parcelM9730a.recycle();
        return zM9738a;
    }

    @Override // com.google.firebase.database.connection.idl.InterfaceC2234af
    public final void listen(List<String> list, InterfaceC0652a interfaceC0652a, InterfaceC2231ac interfaceC2231ac, long j, InterfaceC2248i interfaceC2248i) {
        Parcel parcelM9733o_ = m9733o_();
        parcelM9733o_.writeStringList(list);
        bnt.m9735a(parcelM9733o_, interfaceC0652a);
        bnt.m9735a(parcelM9733o_, interfaceC2231ac);
        parcelM9733o_.writeLong(j);
        bnt.m9735a(parcelM9733o_, interfaceC2248i);
        m9731b(5, parcelM9733o_);
    }

    @Override // com.google.firebase.database.connection.idl.InterfaceC2234af
    public final void merge(List<String> list, InterfaceC0652a interfaceC0652a, InterfaceC2248i interfaceC2248i) {
        Parcel parcelM9733o_ = m9733o_();
        parcelM9733o_.writeStringList(list);
        bnt.m9735a(parcelM9733o_, interfaceC0652a);
        bnt.m9735a(parcelM9733o_, interfaceC2248i);
        m9731b(10, parcelM9733o_);
    }

    @Override // com.google.firebase.database.connection.idl.InterfaceC2234af
    public final void onDisconnectCancel(List<String> list, InterfaceC2248i interfaceC2248i) {
        Parcel parcelM9733o_ = m9733o_();
        parcelM9733o_.writeStringList(list);
        bnt.m9735a(parcelM9733o_, interfaceC2248i);
        m9731b(13, parcelM9733o_);
    }

    @Override // com.google.firebase.database.connection.idl.InterfaceC2234af
    public final void onDisconnectMerge(List<String> list, InterfaceC0652a interfaceC0652a, InterfaceC2248i interfaceC2248i) {
        Parcel parcelM9733o_ = m9733o_();
        parcelM9733o_.writeStringList(list);
        bnt.m9735a(parcelM9733o_, interfaceC0652a);
        bnt.m9735a(parcelM9733o_, interfaceC2248i);
        m9731b(12, parcelM9733o_);
    }

    @Override // com.google.firebase.database.connection.idl.InterfaceC2234af
    public final void onDisconnectPut(List<String> list, InterfaceC0652a interfaceC0652a, InterfaceC2248i interfaceC2248i) {
        Parcel parcelM9733o_ = m9733o_();
        parcelM9733o_.writeStringList(list);
        bnt.m9735a(parcelM9733o_, interfaceC0652a);
        bnt.m9735a(parcelM9733o_, interfaceC2248i);
        m9731b(11, parcelM9733o_);
    }

    @Override // com.google.firebase.database.connection.idl.InterfaceC2234af
    public final void purgeOutstandingWrites() {
        m9731b(7, m9733o_());
    }

    @Override // com.google.firebase.database.connection.idl.InterfaceC2234af
    public final void put(List<String> list, InterfaceC0652a interfaceC0652a, InterfaceC2248i interfaceC2248i) {
        Parcel parcelM9733o_ = m9733o_();
        parcelM9733o_.writeStringList(list);
        bnt.m9735a(parcelM9733o_, interfaceC0652a);
        bnt.m9735a(parcelM9733o_, interfaceC2248i);
        m9731b(8, parcelM9733o_);
    }

    @Override // com.google.firebase.database.connection.idl.InterfaceC2234af
    public final void refreshAuthToken() {
        m9731b(4, m9733o_());
    }

    @Override // com.google.firebase.database.connection.idl.InterfaceC2234af
    public final void refreshAuthToken2(String str) {
        Parcel parcelM9733o_ = m9733o_();
        parcelM9733o_.writeString(str);
        m9731b(17, parcelM9733o_);
    }

    @Override // com.google.firebase.database.connection.idl.InterfaceC2234af
    public final void resume(String str) {
        Parcel parcelM9733o_ = m9733o_();
        parcelM9733o_.writeString(str);
        m9731b(15, parcelM9733o_);
    }

    @Override // com.google.firebase.database.connection.idl.InterfaceC2234af
    public final void setup(C2254o c2254o, InterfaceC2262w interfaceC2262w, InterfaceC0652a interfaceC0652a, InterfaceC2237ai interfaceC2237ai) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9736a(parcelM9733o_, c2254o);
        bnt.m9735a(parcelM9733o_, interfaceC2262w);
        bnt.m9735a(parcelM9733o_, interfaceC0652a);
        bnt.m9735a(parcelM9733o_, interfaceC2237ai);
        m9731b(1, parcelM9733o_);
    }

    @Override // com.google.firebase.database.connection.idl.InterfaceC2234af
    public final void shutdown() {
        m9731b(3, m9733o_());
    }

    @Override // com.google.firebase.database.connection.idl.InterfaceC2234af
    public final void unlisten(List<String> list, InterfaceC0652a interfaceC0652a) {
        Parcel parcelM9733o_ = m9733o_();
        parcelM9733o_.writeStringList(list);
        bnt.m9735a(parcelM9733o_, interfaceC0652a);
        m9731b(6, parcelM9733o_);
    }
}
