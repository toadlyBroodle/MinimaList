package com.google.android.gms.ads.internal.overlay;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.C0846p;
import com.google.android.gms.internal.C1670jo;
import com.google.android.gms.internal.C2012wf;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.overlay.m */
/* JADX INFO: loaded from: classes.dex */
public final class C0838m implements Parcelable.Creator<AdOverlayInfoParcel> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ AdOverlayInfoParcel createFromParcel(Parcel parcel) {
        int iM12486a = C2012wf.m12486a(parcel);
        C0828c c0828c = null;
        IBinder iBinderM12503l = null;
        IBinder iBinderM12503l2 = null;
        IBinder iBinderM12503l3 = null;
        IBinder iBinderM12503l4 = null;
        String strM12502k = null;
        boolean zM12494c = false;
        String strM12502k2 = null;
        IBinder iBinderM12503l5 = null;
        int iM12495d = 0;
        int iM12495d2 = 0;
        String strM12502k3 = null;
        C1670jo c1670jo = null;
        String strM12502k4 = null;
        C0846p c0846p = null;
        while (parcel.dataPosition() < iM12486a) {
            int i = parcel.readInt();
            switch (65535 & i) {
                case 2:
                    c0828c = (C0828c) C2012wf.m12488a(parcel, i, C0828c.CREATOR);
                    break;
                case 3:
                    iBinderM12503l = C2012wf.m12503l(parcel, i);
                    break;
                case 4:
                    iBinderM12503l2 = C2012wf.m12503l(parcel, i);
                    break;
                case 5:
                    iBinderM12503l3 = C2012wf.m12503l(parcel, i);
                    break;
                case 6:
                    iBinderM12503l4 = C2012wf.m12503l(parcel, i);
                    break;
                case 7:
                    strM12502k = C2012wf.m12502k(parcel, i);
                    break;
                case 8:
                    zM12494c = C2012wf.m12494c(parcel, i);
                    break;
                case 9:
                    strM12502k2 = C2012wf.m12502k(parcel, i);
                    break;
                case 10:
                    iBinderM12503l5 = C2012wf.m12503l(parcel, i);
                    break;
                case 11:
                    iM12495d = C2012wf.m12495d(parcel, i);
                    break;
                case 12:
                    iM12495d2 = C2012wf.m12495d(parcel, i);
                    break;
                case 13:
                    strM12502k3 = C2012wf.m12502k(parcel, i);
                    break;
                case 14:
                    c1670jo = (C1670jo) C2012wf.m12488a(parcel, i, C1670jo.CREATOR);
                    break;
                case 15:
                default:
                    C2012wf.m12491b(parcel, i);
                    break;
                case 16:
                    strM12502k4 = C2012wf.m12502k(parcel, i);
                    break;
                case 17:
                    c0846p = (C0846p) C2012wf.m12488a(parcel, i, C0846p.CREATOR);
                    break;
            }
        }
        C2012wf.m12511t(parcel, iM12486a);
        return new AdOverlayInfoParcel(c0828c, iBinderM12503l, iBinderM12503l2, iBinderM12503l3, iBinderM12503l4, strM12502k, zM12494c, strM12502k2, iBinderM12503l5, iM12495d, iM12495d2, strM12502k3, c1670jo, strM12502k4, c0846p);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ AdOverlayInfoParcel[] newArray(int i) {
        return new AdOverlayInfoParcel[i];
    }
}
