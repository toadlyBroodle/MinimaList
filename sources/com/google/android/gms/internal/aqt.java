package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class aqt {

    /* JADX INFO: renamed from: a */
    private final List<aqy> f7100a = new ArrayList();

    /* JADX INFO: renamed from: b */
    private final Map<String, aqu> f7101b = new HashMap();

    /* JADX INFO: renamed from: c */
    private String f7102c = "";

    /* JADX INFO: renamed from: d */
    private int f7103d = 0;

    /* JADX INFO: renamed from: a */
    public final aqs m8168a() {
        return new aqs(this.f7100a, this.f7101b, this.f7102c, 0);
    }

    /* JADX INFO: renamed from: a */
    public final aqt m8169a(aqu aquVar) {
        this.f7101b.put(aquVar.m8172a().get("instance_name").toString(), aquVar);
        return this;
    }

    /* JADX INFO: renamed from: a */
    public final aqt m8170a(aqy aqyVar) {
        this.f7100a.add(aqyVar);
        return this;
    }

    /* JADX INFO: renamed from: a */
    public final aqt m8171a(String str) {
        this.f7102c = str;
        return this;
    }
}
