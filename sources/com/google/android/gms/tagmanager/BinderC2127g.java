package com.google.android.gms.tagmanager;

import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.tagmanager.g */
/* JADX INFO: loaded from: classes.dex */
final class BinderC2127g extends AbstractBinderC2129i {
    BinderC2127g() {
    }

    @Override // com.google.android.gms.tagmanager.InterfaceC2128h
    /* JADX INFO: renamed from: a */
    public final void mo12819a(String str, Map map) {
        InterfaceC2121a interfaceC2121a;
        if (C2123c.f12770c.containsKey(str)) {
            interfaceC2121a = (InterfaceC2121a) C2123c.f12770c.get(str);
        } else {
            interfaceC2121a = (InterfaceC2121a) C2123c.m12809b(str, InterfaceC2121a.class);
            C2123c.f12770c.put(str, interfaceC2121a);
        }
        if (interfaceC2121a != null) {
            interfaceC2121a.m12803a(map);
        }
    }

    @Override // com.google.android.gms.tagmanager.InterfaceC2128h
    /* JADX INFO: renamed from: b */
    public final String mo12820b(String str, Map map) {
        InterfaceC2122b interfaceC2122b;
        if (C2123c.f12771d.containsKey(str)) {
            interfaceC2122b = (InterfaceC2122b) C2123c.f12771d.get(str);
        } else {
            interfaceC2122b = (InterfaceC2122b) C2123c.m12809b(str, InterfaceC2122b.class);
            C2123c.f12771d.put(str, interfaceC2122b);
        }
        if (interfaceC2122b != null) {
            return interfaceC2122b.m12804a(map);
        }
        return null;
    }
}
