package com.google.android.gms.analytics;

import java.util.Comparator;

/* JADX INFO: renamed from: com.google.android.gms.analytics.n */
/* JADX INFO: loaded from: classes.dex */
final class C0899n implements Comparator<AbstractC0901p> {
    C0899n(C0898m c0898m) {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(AbstractC0901p abstractC0901p, AbstractC0901p abstractC0901p2) {
        return abstractC0901p.getClass().getCanonicalName().compareTo(abstractC0901p2.getClass().getCanonicalName());
    }
}
