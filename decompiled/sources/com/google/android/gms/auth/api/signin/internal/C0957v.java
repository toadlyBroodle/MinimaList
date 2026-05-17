package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.internal.C2012wf;

/* JADX INFO: renamed from: com.google.android.gms.auth.api.signin.internal.v */
/* JADX INFO: loaded from: classes.dex */
public final class C0957v implements Parcelable.Creator<SignInConfiguration> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ SignInConfiguration createFromParcel(Parcel parcel) {
        GoogleSignInOptions googleSignInOptions = null;
        int iM12486a = C2012wf.m12486a(parcel);
        String strM12502k = null;
        while (parcel.dataPosition() < iM12486a) {
            int i = parcel.readInt();
            switch (65535 & i) {
                case 2:
                    strM12502k = C2012wf.m12502k(parcel, i);
                    break;
                case 3:
                case 4:
                default:
                    C2012wf.m12491b(parcel, i);
                    break;
                case 5:
                    googleSignInOptions = (GoogleSignInOptions) C2012wf.m12488a(parcel, i, GoogleSignInOptions.CREATOR);
                    break;
            }
        }
        C2012wf.m12511t(parcel, iM12486a);
        return new SignInConfiguration(strM12502k, googleSignInOptions);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ SignInConfiguration[] newArray(int i) {
        return new SignInConfiguration[i];
    }
}
