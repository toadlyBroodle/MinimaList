package com.google.firebase.database.connection.idl;

import android.os.IInterface;
import com.google.android.gms.p043a.InterfaceC0652a;
import java.util.List;

/* JADX INFO: renamed from: com.google.firebase.database.connection.idl.af */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2234af extends IInterface {
    void compareAndPut(List<String> list, InterfaceC0652a interfaceC0652a, String str, InterfaceC2248i interfaceC2248i);

    void initialize();

    void interrupt(String str);

    boolean isInterrupted(String str);

    void listen(List<String> list, InterfaceC0652a interfaceC0652a, InterfaceC2231ac interfaceC2231ac, long j, InterfaceC2248i interfaceC2248i);

    void merge(List<String> list, InterfaceC0652a interfaceC0652a, InterfaceC2248i interfaceC2248i);

    void onDisconnectCancel(List<String> list, InterfaceC2248i interfaceC2248i);

    void onDisconnectMerge(List<String> list, InterfaceC0652a interfaceC0652a, InterfaceC2248i interfaceC2248i);

    void onDisconnectPut(List<String> list, InterfaceC0652a interfaceC0652a, InterfaceC2248i interfaceC2248i);

    void purgeOutstandingWrites();

    void put(List<String> list, InterfaceC0652a interfaceC0652a, InterfaceC2248i interfaceC2248i);

    void refreshAuthToken();

    void refreshAuthToken2(String str);

    void resume(String str);

    void setup(C2254o c2254o, InterfaceC2262w interfaceC2262w, InterfaceC0652a interfaceC0652a, InterfaceC2237ai interfaceC2237ai);

    void shutdown();

    void unlisten(List<String> list, InterfaceC0652a interfaceC0652a);
}
