package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C1221aj;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ars extends arh<String> {

    /* JADX INFO: renamed from: b */
    private final String f7166b;

    /* JADX INFO: renamed from: c */
    private final List<arh<?>> f7167c;

    public ars(String str, List<arh<?>> list) {
        C1221aj.m7066a(str, (Object) "Instruction name must be a string.");
        C1221aj.m7065a(list);
        this.f7166b = str;
        this.f7167c = list;
    }

    @Override // com.google.android.gms.internal.arh
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String mo8208b() {
        return toString();
    }

    /* JADX INFO: renamed from: d */
    public final String m8220d() {
        return this.f7166b;
    }

    /* JADX INFO: renamed from: e */
    public final List<arh<?>> m8221e() {
        return this.f7167c;
    }

    @Override // com.google.android.gms.internal.arh
    public final String toString() {
        String str = this.f7166b;
        String string = this.f7167c.toString();
        return new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(string).length()).append("*").append(str).append(": ").append(string).toString();
    }
}
