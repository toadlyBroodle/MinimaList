package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.zm */
/* JADX INFO: loaded from: classes.dex */
public final class C2100zm extends AbstractC2011we implements Iterable<String> {
    public static final Parcelable.Creator<C2100zm> CREATOR = new C2102zo();

    /* JADX INFO: renamed from: a */
    private final Bundle f12686a;

    C2100zm(Bundle bundle) {
        this.f12686a = bundle;
    }

    /* JADX INFO: renamed from: a */
    public final int m12767a() {
        return this.f12686a.size();
    }

    /* JADX INFO: renamed from: a */
    final Object m12768a(String str) {
        return this.f12686a.get(str);
    }

    /* JADX INFO: renamed from: b */
    public final Bundle m12769b() {
        return new Bundle(this.f12686a);
    }

    /* JADX INFO: renamed from: b */
    final Long m12770b(String str) {
        return Long.valueOf(this.f12686a.getLong(str));
    }

    /* JADX INFO: renamed from: c */
    final Double m12771c(String str) {
        return Double.valueOf(this.f12686a.getDouble(str));
    }

    /* JADX INFO: renamed from: d */
    final String m12772d(String str) {
        return this.f12686a.getString(str);
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return new C2101zn(this);
    }

    public final String toString() {
        return this.f12686a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM12512a = C2014wh.m12512a(parcel);
        C2014wh.m12518a(parcel, 2, m12769b(), false);
        C2014wh.m12513a(parcel, iM12512a);
    }
}
