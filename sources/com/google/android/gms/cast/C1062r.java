package com.google.android.gms.cast;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.p052a.C1072a;
import com.google.android.gms.internal.C2012wf;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.android.gms.cast.r */
/* JADX INFO: loaded from: classes.dex */
public final class C1062r implements Parcelable.Creator<C1052h> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1052h createFromParcel(Parcel parcel) {
        Bundle bundleM12504m = null;
        int iM12486a = C2012wf.m12486a(parcel);
        int iM12495d = 0;
        ArrayList arrayListM12493c = null;
        while (parcel.dataPosition() < iM12486a) {
            int i = parcel.readInt();
            switch (65535 & i) {
                case 2:
                    arrayListM12493c = C2012wf.m12493c(parcel, i, C1072a.CREATOR);
                    break;
                case 3:
                    bundleM12504m = C2012wf.m12504m(parcel, i);
                    break;
                case 4:
                    iM12495d = C2012wf.m12495d(parcel, i);
                    break;
                default:
                    C2012wf.m12491b(parcel, i);
                    break;
            }
        }
        C2012wf.m12511t(parcel, iM12486a);
        return new C1052h(arrayListM12493c, bundleM12504m, iM12495d);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1052h[] newArray(int i) {
        return new C1052h[i];
    }
}
