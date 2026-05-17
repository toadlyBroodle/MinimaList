package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.C2012wf;
import com.google.android.gms.internal.bao;

/* JADX INFO: renamed from: com.google.firebase.auth.y */
/* JADX INFO: loaded from: classes.dex */
public final class C2211y implements Parcelable.Creator<C2210x> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2210x createFromParcel(Parcel parcel) {
        bao baoVar = null;
        int iM12486a = C2012wf.m12486a(parcel);
        String strM12502k = null;
        String strM12502k2 = null;
        String strM12502k3 = null;
        while (parcel.dataPosition() < iM12486a) {
            int i = parcel.readInt();
            switch (65535 & i) {
                case 1:
                    strM12502k3 = C2012wf.m12502k(parcel, i);
                    break;
                case 2:
                    strM12502k2 = C2012wf.m12502k(parcel, i);
                    break;
                case 3:
                    strM12502k = C2012wf.m12502k(parcel, i);
                    break;
                case 4:
                    baoVar = (bao) C2012wf.m12488a(parcel, i, bao.CREATOR);
                    break;
                default:
                    C2012wf.m12491b(parcel, i);
                    break;
            }
        }
        C2012wf.m12511t(parcel, iM12486a);
        return new C2210x(strM12502k3, strM12502k2, strM12502k, baoVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2210x[] newArray(int i) {
        return new C2210x[i];
    }
}
