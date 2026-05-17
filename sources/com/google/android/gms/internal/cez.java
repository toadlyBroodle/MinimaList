package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class cez extends AbstractC2011we {
    public static final Parcelable.Creator<cez> CREATOR = new cfa();

    /* JADX INFO: renamed from: a */
    private String f9894a;

    /* JADX INFO: renamed from: b */
    private String[] f9895b;

    /* JADX INFO: renamed from: c */
    private String[] f9896c;

    cez(String str, String[] strArr, String[] strArr2) {
        this.f9894a = str;
        this.f9895b = strArr;
        this.f9896c = strArr2;
    }

    /* JADX INFO: renamed from: a */
    public static cez m10782a(cej cejVar) {
        Map<String, String> mapMo10764b = cejVar.mo10764b();
        int size = mapMo10764b.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i = 0;
        Iterator<Map.Entry<String, String>> it = mapMo10764b.entrySet().iterator();
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                return new cez(cejVar.m10769e(), strArr, strArr2);
            }
            Map.Entry<String, String> next = it.next();
            strArr[i2] = next.getKey();
            strArr2[i2] = next.getValue();
            i = i2 + 1;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM12512a = C2014wh.m12512a(parcel);
        C2014wh.m12524a(parcel, 1, this.f9894a, false);
        C2014wh.m12531a(parcel, 2, this.f9895b, false);
        C2014wh.m12531a(parcel, 3, this.f9896c, false);
        C2014wh.m12513a(parcel, iM12512a);
    }
}
