package com.google.android.gms.ads.internal.p048js;

import com.google.android.gms.ads.internal.gmsg.InterfaceC0748aa;
import com.google.android.gms.internal.C1560fm;
import com.google.android.gms.internal.cnb;
import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.js.m */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C0807m implements InterfaceC0806l {

    /* JADX INFO: renamed from: a */
    private final InterfaceC0805k f4723a;

    /* JADX INFO: renamed from: b */
    private final HashSet<AbstractMap.SimpleEntry<String, InterfaceC0748aa<? super InterfaceC0805k>>> f4724b = new HashSet<>();

    public C0807m(InterfaceC0805k interfaceC0805k) {
        this.f4723a = interfaceC0805k;
    }

    @Override // com.google.android.gms.ads.internal.p048js.InterfaceC0806l
    /* JADX INFO: renamed from: a */
    public final void mo5727a() {
        for (AbstractMap.SimpleEntry<String, InterfaceC0748aa<? super InterfaceC0805k>> simpleEntry : this.f4724b) {
            String strValueOf = String.valueOf(simpleEntry.getValue().toString());
            C1560fm.m11343a(strValueOf.length() != 0 ? "Unregistering eventhandler: ".concat(strValueOf) : new String("Unregistering eventhandler: "));
            this.f4723a.mo5726b(simpleEntry.getKey(), simpleEntry.getValue());
        }
        this.f4724b.clear();
    }

    @Override // com.google.android.gms.ads.internal.p048js.InterfaceC0805k
    /* JADX INFO: renamed from: a */
    public final void mo5725a(String str, InterfaceC0748aa<? super InterfaceC0805k> interfaceC0748aa) {
        this.f4723a.mo5725a(str, interfaceC0748aa);
        this.f4724b.add(new AbstractMap.SimpleEntry<>(str, interfaceC0748aa));
    }

    @Override // com.google.android.gms.ads.internal.p048js.InterfaceC0783a
    /* JADX INFO: renamed from: a */
    public final void mo5712a(String str, Map<String, ?> map) {
        this.f4723a.mo5712a(str, map);
    }

    @Override // com.google.android.gms.ads.internal.p048js.InterfaceC0783a
    /* JADX INFO: renamed from: a */
    public final void mo5713a(String str, JSONObject jSONObject) {
        this.f4723a.mo5713a(str, jSONObject);
    }

    @Override // com.google.android.gms.ads.internal.p048js.InterfaceC0805k
    /* JADX INFO: renamed from: b */
    public final void mo5726b(String str, InterfaceC0748aa<? super InterfaceC0805k> interfaceC0748aa) {
        this.f4723a.mo5726b(str, interfaceC0748aa);
        this.f4724b.remove(new AbstractMap.SimpleEntry(str, interfaceC0748aa));
    }

    @Override // com.google.android.gms.ads.internal.p048js.InterfaceC0819y
    /* JADX INFO: renamed from: b */
    public final void mo5728b(String str, JSONObject jSONObject) {
        this.f4723a.mo5728b(str, jSONObject);
    }
}
