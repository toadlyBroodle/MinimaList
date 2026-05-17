package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class bai extends AbstractC2011we {
    public static final Parcelable.Creator<bai> CREATOR = new baj();

    /* JADX INFO: renamed from: a */
    private List<bag> f7673a;

    public bai() {
        this.f7673a = new ArrayList();
    }

    bai(List<bag> list) {
        if (list == null || list.isEmpty()) {
            this.f7673a = Collections.emptyList();
        } else {
            this.f7673a = Collections.unmodifiableList(list);
        }
    }

    /* JADX INFO: renamed from: a */
    public static bai m8780a(bai baiVar) {
        List<bag> list = baiVar.f7673a;
        bai baiVar2 = new bai();
        if (list != null) {
            baiVar2.f7673a.addAll(list);
        }
        return baiVar2;
    }

    /* JADX INFO: renamed from: a */
    public final List<bag> m8781a() {
        return this.f7673a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM12512a = C2014wh.m12512a(parcel);
        C2014wh.m12537c(parcel, 2, this.f7673a, false);
        C2014wh.m12513a(parcel, iM12512a);
    }
}
