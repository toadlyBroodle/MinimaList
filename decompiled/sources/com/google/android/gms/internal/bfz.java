package com.google.android.gms.internal;

import com.google.firebase.database.C2226b;
import com.google.firebase.database.C2275m;
import com.google.firebase.database.InterfaceC2276n;

/* JADX INFO: loaded from: classes.dex */
final class bfz implements Comparable<bfz> {

    /* JADX INFO: renamed from: a */
    private bfa f8054a;

    /* JADX INFO: renamed from: b */
    private C2275m.a f8055b;

    /* JADX INFO: renamed from: c */
    private InterfaceC2276n f8056c;

    /* JADX INFO: renamed from: d */
    private int f8057d;

    /* JADX INFO: renamed from: e */
    private long f8058e;

    /* JADX INFO: renamed from: f */
    private boolean f8059f;

    /* JADX INFO: renamed from: g */
    private int f8060g;

    /* JADX INFO: renamed from: h */
    private C2226b f8061h;

    /* JADX INFO: renamed from: i */
    private long f8062i;

    /* JADX INFO: renamed from: j */
    private bln f8063j;

    /* JADX INFO: renamed from: k */
    private bln f8064k;

    /* JADX INFO: renamed from: l */
    private bln f8065l;

    /* JADX INFO: renamed from: d */
    static /* synthetic */ int m9222d(bfz bfzVar) {
        int i = bfzVar.f8060g;
        bfzVar.f8060g = i + 1;
        return i;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(bfz bfzVar) {
        bfz bfzVar2 = bfzVar;
        if (this.f8058e < bfzVar2.f8058e) {
            return -1;
        }
        return this.f8058e == bfzVar2.f8058e ? 0 : 1;
    }
}
