package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.C2012wf;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.ap */
/* JADX INFO: loaded from: classes.dex */
public final class C1227ap implements Parcelable.Creator<C1226ao> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1226ao createFromParcel(Parcel parcel) {
        int iM12495d = 0;
        int iM12486a = C2012wf.m12486a(parcel);
        Scope[] scopeArr = null;
        int iM12495d2 = 0;
        int iM12495d3 = 0;
        while (parcel.dataPosition() < iM12486a) {
            int i = parcel.readInt();
            switch (65535 & i) {
                case 1:
                    iM12495d3 = C2012wf.m12495d(parcel, i);
                    break;
                case 2:
                    iM12495d2 = C2012wf.m12495d(parcel, i);
                    break;
                case 3:
                    iM12495d = C2012wf.m12495d(parcel, i);
                    break;
                case 4:
                    scopeArr = (Scope[]) C2012wf.m12492b(parcel, i, Scope.CREATOR);
                    break;
                default:
                    C2012wf.m12491b(parcel, i);
                    break;
            }
        }
        C2012wf.m12511t(parcel, iM12486a);
        return new C1226ao(iM12495d3, iM12495d2, iM12495d, scopeArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1226ao[] newArray(int i) {
        return new C1226ao[i];
    }
}
