package com.google.android.gms.internal;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class bvo implements Comparator<bvb> {
    public bvo(bvn bvnVar) {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(bvb bvbVar, bvb bvbVar2) {
        bvb bvbVar3 = bvbVar;
        bvb bvbVar4 = bvbVar2;
        if (bvbVar3.m10311b() < bvbVar4.m10311b()) {
            return -1;
        }
        if (bvbVar3.m10311b() > bvbVar4.m10311b()) {
            return 1;
        }
        if (bvbVar3.m10310a() < bvbVar4.m10310a()) {
            return -1;
        }
        if (bvbVar3.m10310a() > bvbVar4.m10310a()) {
            return 1;
        }
        float fM10313d = (bvbVar3.m10313d() - bvbVar3.m10311b()) * (bvbVar3.m10312c() - bvbVar3.m10310a());
        float fM10313d2 = (bvbVar4.m10313d() - bvbVar4.m10311b()) * (bvbVar4.m10312c() - bvbVar4.m10310a());
        if (fM10313d <= fM10313d2) {
            return fM10313d < fM10313d2 ? 1 : 0;
        }
        return -1;
    }
}
