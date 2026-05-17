package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C1221aj;

/* JADX INFO: loaded from: classes.dex */
public final class arn extends arh<arh<?>> {

    /* JADX INFO: renamed from: b */
    public static final arn f7151b = new arn("BREAK");

    /* JADX INFO: renamed from: c */
    public static final arn f7152c = new arn("CONTINUE");

    /* JADX INFO: renamed from: d */
    public static final arn f7153d = new arn("NULL");

    /* JADX INFO: renamed from: e */
    public static final arn f7154e = new arn("UNDEFINED");

    /* JADX INFO: renamed from: f */
    private final String f7155f;

    /* JADX INFO: renamed from: g */
    private final boolean f7156g;

    /* JADX INFO: renamed from: h */
    private final arh<?> f7157h;

    public arn(arh<?> arhVar) {
        C1221aj.m7065a(arhVar);
        this.f7155f = "RETURN";
        this.f7156g = true;
        this.f7157h = arhVar;
    }

    private arn(String str) {
        this.f7155f = str;
        this.f7156g = false;
        this.f7157h = null;
    }

    @Override // com.google.android.gms.internal.arh
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ arh<?> mo8208b() {
        return this.f7157h;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m8212d() {
        return this.f7156g;
    }

    @Override // com.google.android.gms.internal.arh
    public final String toString() {
        return this.f7155f;
    }
}
