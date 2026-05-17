package com.google.firebase.database.connection.idl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.bns;
import com.google.android.gms.internal.bnt;
import com.google.android.gms.p043a.InterfaceC0652a;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.firebase.database.connection.idl.ag */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC2235ag extends bns implements InterfaceC2234af {
    public AbstractBinderC2235ag() {
        attachInterface(this, "com.google.firebase.database.connection.idl.IPersistentConnection");
    }

    public static InterfaceC2234af asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.database.connection.idl.IPersistentConnection");
        return iInterfaceQueryLocalInterface instanceof InterfaceC2234af ? (InterfaceC2234af) iInterfaceQueryLocalInterface : new C2236ah(iBinder);
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        InterfaceC2231ac c2233ae;
        InterfaceC2262w c2264y;
        InterfaceC2248i c2250k = null;
        InterfaceC2237ai c2239ak = null;
        InterfaceC2248i c2250k2 = null;
        InterfaceC2248i c2250k3 = null;
        InterfaceC2248i c2250k4 = null;
        InterfaceC2248i c2250k5 = null;
        InterfaceC2248i c2250k6 = null;
        InterfaceC2248i c2250k7 = null;
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                C2254o c2254o = (C2254o) bnt.m9734a(parcel, C2254o.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    c2264y = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.firebase.database.connection.idl.IConnectionAuthTokenProvider");
                    c2264y = iInterfaceQueryLocalInterface instanceof InterfaceC2262w ? (InterfaceC2262w) iInterfaceQueryLocalInterface : new C2264y(strongBinder);
                }
                InterfaceC0652a interfaceC0652aM5328a = InterfaceC0652a.a.m5328a(parcel.readStrongBinder());
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.firebase.database.connection.idl.IPersistentConnectionDelegate");
                    c2239ak = iInterfaceQueryLocalInterface2 instanceof InterfaceC2237ai ? (InterfaceC2237ai) iInterfaceQueryLocalInterface2 : new C2239ak(strongBinder2);
                }
                setup(c2254o, c2264y, interfaceC0652aM5328a, c2239ak);
                parcel2.writeNoException();
                break;
            case 2:
                initialize();
                parcel2.writeNoException();
                break;
            case 3:
                shutdown();
                parcel2.writeNoException();
                break;
            case 4:
                refreshAuthToken();
                parcel2.writeNoException();
                break;
            case 5:
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                InterfaceC0652a interfaceC0652aM5328a2 = InterfaceC0652a.a.m5328a(parcel.readStrongBinder());
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 == null) {
                    c2233ae = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.firebase.database.connection.idl.IListenHashProvider");
                    c2233ae = iInterfaceQueryLocalInterface3 instanceof InterfaceC2231ac ? (InterfaceC2231ac) iInterfaceQueryLocalInterface3 : new C2233ae(strongBinder3);
                }
                long j = parcel.readLong();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.firebase.database.connection.idl.IRequestResultCallback");
                    c2250k2 = iInterfaceQueryLocalInterface4 instanceof InterfaceC2248i ? (InterfaceC2248i) iInterfaceQueryLocalInterface4 : new C2250k(strongBinder4);
                }
                listen(arrayListCreateStringArrayList, interfaceC0652aM5328a2, c2233ae, j, c2250k2);
                parcel2.writeNoException();
                break;
            case 6:
                unlisten(parcel.createStringArrayList(), InterfaceC0652a.a.m5328a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 7:
                purgeOutstandingWrites();
                parcel2.writeNoException();
                break;
            case 8:
                ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
                InterfaceC0652a interfaceC0652aM5328a3 = InterfaceC0652a.a.m5328a(parcel.readStrongBinder());
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.firebase.database.connection.idl.IRequestResultCallback");
                    c2250k3 = iInterfaceQueryLocalInterface5 instanceof InterfaceC2248i ? (InterfaceC2248i) iInterfaceQueryLocalInterface5 : new C2250k(strongBinder5);
                }
                put(arrayListCreateStringArrayList2, interfaceC0652aM5328a3, c2250k3);
                parcel2.writeNoException();
                break;
            case 9:
                ArrayList<String> arrayListCreateStringArrayList3 = parcel.createStringArrayList();
                InterfaceC0652a interfaceC0652aM5328a4 = InterfaceC0652a.a.m5328a(parcel.readStrongBinder());
                String string = parcel.readString();
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.firebase.database.connection.idl.IRequestResultCallback");
                    c2250k4 = iInterfaceQueryLocalInterface6 instanceof InterfaceC2248i ? (InterfaceC2248i) iInterfaceQueryLocalInterface6 : new C2250k(strongBinder6);
                }
                compareAndPut(arrayListCreateStringArrayList3, interfaceC0652aM5328a4, string, c2250k4);
                parcel2.writeNoException();
                break;
            case 10:
                ArrayList<String> arrayListCreateStringArrayList4 = parcel.createStringArrayList();
                InterfaceC0652a interfaceC0652aM5328a5 = InterfaceC0652a.a.m5328a(parcel.readStrongBinder());
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.firebase.database.connection.idl.IRequestResultCallback");
                    c2250k5 = iInterfaceQueryLocalInterface7 instanceof InterfaceC2248i ? (InterfaceC2248i) iInterfaceQueryLocalInterface7 : new C2250k(strongBinder7);
                }
                merge(arrayListCreateStringArrayList4, interfaceC0652aM5328a5, c2250k5);
                parcel2.writeNoException();
                break;
            case 11:
                ArrayList<String> arrayListCreateStringArrayList5 = parcel.createStringArrayList();
                InterfaceC0652a interfaceC0652aM5328a6 = InterfaceC0652a.a.m5328a(parcel.readStrongBinder());
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.firebase.database.connection.idl.IRequestResultCallback");
                    c2250k6 = iInterfaceQueryLocalInterface8 instanceof InterfaceC2248i ? (InterfaceC2248i) iInterfaceQueryLocalInterface8 : new C2250k(strongBinder8);
                }
                onDisconnectPut(arrayListCreateStringArrayList5, interfaceC0652aM5328a6, c2250k6);
                parcel2.writeNoException();
                break;
            case 12:
                ArrayList<String> arrayListCreateStringArrayList6 = parcel.createStringArrayList();
                InterfaceC0652a interfaceC0652aM5328a7 = InterfaceC0652a.a.m5328a(parcel.readStrongBinder());
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.firebase.database.connection.idl.IRequestResultCallback");
                    c2250k7 = iInterfaceQueryLocalInterface9 instanceof InterfaceC2248i ? (InterfaceC2248i) iInterfaceQueryLocalInterface9 : new C2250k(strongBinder9);
                }
                onDisconnectMerge(arrayListCreateStringArrayList6, interfaceC0652aM5328a7, c2250k7);
                parcel2.writeNoException();
                break;
            case 13:
                ArrayList<String> arrayListCreateStringArrayList7 = parcel.createStringArrayList();
                IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 != null) {
                    IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.firebase.database.connection.idl.IRequestResultCallback");
                    c2250k = iInterfaceQueryLocalInterface10 instanceof InterfaceC2248i ? (InterfaceC2248i) iInterfaceQueryLocalInterface10 : new C2250k(strongBinder10);
                }
                onDisconnectCancel(arrayListCreateStringArrayList7, c2250k);
                parcel2.writeNoException();
                break;
            case 14:
                interrupt(parcel.readString());
                parcel2.writeNoException();
                break;
            case 15:
                resume(parcel.readString());
                parcel2.writeNoException();
                break;
            case 16:
                boolean zIsInterrupted = isInterrupted(parcel.readString());
                parcel2.writeNoException();
                bnt.m9737a(parcel2, zIsInterrupted);
                break;
            case 17:
                refreshAuthToken2(parcel.readString());
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}
