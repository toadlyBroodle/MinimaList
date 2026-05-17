package com.google.android.gms.internal;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
final class bve implements Comparator<bvk> {
    bve(bvd bvdVar) {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(bvk bvkVar, bvk bvkVar2) {
        bvk bvkVar3 = bvkVar;
        bvk bvkVar4 = bvkVar2;
        int i = bvkVar3.f9119c - bvkVar4.f9119c;
        return i != 0 ? i : (int) (bvkVar3.f9117a - bvkVar4.f9117a);
    }
}
