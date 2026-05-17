package com.google.android.gms.internal;

import java.lang.Comparable;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class bcr<A extends Comparable<A>> implements Comparator<A> {

    /* JADX INFO: renamed from: a */
    private static bcr f7801a = new bcr();

    private bcr() {
    }

    /* JADX INFO: renamed from: a */
    public static <T extends Comparable<T>> bcr<T> m8925a(Class<T> cls) {
        return f7801a;
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return ((Comparable) obj).compareTo((Comparable) obj2);
    }
}
