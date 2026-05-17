package android.support.v4.media;

import android.media.MediaMetadata;
import android.os.Parcel;

/* JADX INFO: renamed from: android.support.v4.media.f */
/* JADX INFO: loaded from: classes.dex */
class C0280f {
    /* JADX INFO: renamed from: a */
    public static Object m1998a(Parcel parcel) {
        return MediaMetadata.CREATOR.createFromParcel(parcel);
    }

    /* JADX INFO: renamed from: a */
    public static void m1999a(Object obj, Parcel parcel, int i) {
        ((MediaMetadata) obj).writeToParcel(parcel, i);
    }
}
