package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.C2012wf;

/* JADX INFO: renamed from: com.google.android.gms.cast.x */
/* JADX INFO: loaded from: classes.dex */
public final class C1068x implements Parcelable.Creator<C1055k> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1055k createFromParcel(Parcel parcel) {
        int iM12486a = C2012wf.m12486a(parcel);
        float fM12498g = 0.0f;
        int iM12495d = 0;
        int iM12495d2 = 0;
        int iM12495d3 = 0;
        int iM12495d4 = 0;
        int iM12495d5 = 0;
        int iM12495d6 = 0;
        int iM12495d7 = 0;
        String strM12502k = null;
        int iM12495d8 = 0;
        int iM12495d9 = 0;
        String strM12502k2 = null;
        while (parcel.dataPosition() < iM12486a) {
            int i = parcel.readInt();
            switch (65535 & i) {
                case 2:
                    fM12498g = C2012wf.m12498g(parcel, i);
                    break;
                case 3:
                    iM12495d = C2012wf.m12495d(parcel, i);
                    break;
                case 4:
                    iM12495d2 = C2012wf.m12495d(parcel, i);
                    break;
                case 5:
                    iM12495d3 = C2012wf.m12495d(parcel, i);
                    break;
                case 6:
                    iM12495d4 = C2012wf.m12495d(parcel, i);
                    break;
                case 7:
                    iM12495d5 = C2012wf.m12495d(parcel, i);
                    break;
                case 8:
                    iM12495d6 = C2012wf.m12495d(parcel, i);
                    break;
                case 9:
                    iM12495d7 = C2012wf.m12495d(parcel, i);
                    break;
                case 10:
                    strM12502k = C2012wf.m12502k(parcel, i);
                    break;
                case 11:
                    iM12495d8 = C2012wf.m12495d(parcel, i);
                    break;
                case 12:
                    iM12495d9 = C2012wf.m12495d(parcel, i);
                    break;
                case 13:
                    strM12502k2 = C2012wf.m12502k(parcel, i);
                    break;
                default:
                    C2012wf.m12491b(parcel, i);
                    break;
            }
        }
        C2012wf.m12511t(parcel, iM12486a);
        return new C1055k(fM12498g, iM12495d, iM12495d2, iM12495d3, iM12495d4, iM12495d5, iM12495d6, iM12495d7, strM12502k, iM12495d8, iM12495d9, strM12502k2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1055k[] newArray(int i) {
        return new C1055k[i];
    }
}
