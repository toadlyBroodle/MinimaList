package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.gmsg.InterfaceC0748aa;
import com.google.android.gms.internal.cmh;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
@cnb
public abstract class clp<T extends cmh> implements cmh<T> {

    /* JADX INFO: renamed from: a */
    private final HashMap<String, List<InterfaceC0748aa<? super T>>> f10294a = new HashMap<>();

    @Override // com.google.android.gms.internal.cmh
    /* JADX INFO: renamed from: a */
    public void mo11089a(String str, InterfaceC0748aa<? super T> interfaceC0748aa) {
        List<InterfaceC0748aa<? super T>> copyOnWriteArrayList = this.f10294a.get(str);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            this.f10294a.put(str, copyOnWriteArrayList);
        }
        copyOnWriteArrayList.add(interfaceC0748aa);
    }

    @Override // com.google.android.gms.internal.cmh
    /* JADX INFO: renamed from: b */
    public void mo11090b(String str, InterfaceC0748aa<? super T> interfaceC0748aa) {
        List<InterfaceC0748aa<? super T>> list = this.f10294a.get(str);
        if (list == null) {
            return;
        }
        list.remove(interfaceC0748aa);
    }
}
