package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class bam extends AbstractC2011we {
    public static final Parcelable.Creator<bam> CREATOR = new ban();

    /* JADX INFO: renamed from: a */
    private int f7677a;

    /* JADX INFO: renamed from: b */
    private List<String> f7678b;

    public bam() {
        this(null);
    }

    bam(int i, List<String> list) {
        this.f7677a = i;
        if (list == null || list.isEmpty()) {
            this.f7678b = Collections.emptyList();
            return;
        }
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= list.size()) {
                this.f7678b = Collections.unmodifiableList(list);
                return;
            }
            String str = list.get(i3);
            if (TextUtils.isEmpty(str)) {
                str = null;
            }
            list.set(i3, str);
            i2 = i3 + 1;
        }
    }

    private bam(List<String> list) {
        this.f7677a = 1;
        this.f7678b = new ArrayList();
        if (list == null || list.isEmpty()) {
            return;
        }
        this.f7678b.addAll(list);
    }

    /* JADX INFO: renamed from: a */
    public static bam m8782a() {
        return new bam(null);
    }

    /* JADX INFO: renamed from: a */
    public static bam m8783a(bam bamVar) {
        return new bam(bamVar != null ? bamVar.f7678b : null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM12512a = C2014wh.m12512a(parcel);
        C2014wh.m12516a(parcel, 1, this.f7677a);
        C2014wh.m12535b(parcel, 2, this.f7678b, false);
        C2014wh.m12513a(parcel, iM12512a);
    }
}
