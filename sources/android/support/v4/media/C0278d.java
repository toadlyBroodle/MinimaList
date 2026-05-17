package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: renamed from: android.support.v4.media.d */
/* JADX INFO: loaded from: classes.dex */
class C0278d {

    /* JADX INFO: renamed from: android.support.v4.media.d$a */
    static class a {
        /* JADX INFO: renamed from: a */
        public static Object m1987a() {
            return new MediaDescription.Builder();
        }

        /* JADX INFO: renamed from: a */
        public static Object m1988a(Object obj) {
            return ((MediaDescription.Builder) obj).build();
        }

        /* JADX INFO: renamed from: a */
        public static void m1989a(Object obj, Bitmap bitmap) {
            ((MediaDescription.Builder) obj).setIconBitmap(bitmap);
        }

        /* JADX INFO: renamed from: a */
        public static void m1990a(Object obj, Uri uri) {
            ((MediaDescription.Builder) obj).setIconUri(uri);
        }

        /* JADX INFO: renamed from: a */
        public static void m1991a(Object obj, Bundle bundle) {
            ((MediaDescription.Builder) obj).setExtras(bundle);
        }

        /* JADX INFO: renamed from: a */
        public static void m1992a(Object obj, CharSequence charSequence) {
            ((MediaDescription.Builder) obj).setTitle(charSequence);
        }

        /* JADX INFO: renamed from: a */
        public static void m1993a(Object obj, String str) {
            ((MediaDescription.Builder) obj).setMediaId(str);
        }

        /* JADX INFO: renamed from: b */
        public static void m1994b(Object obj, CharSequence charSequence) {
            ((MediaDescription.Builder) obj).setSubtitle(charSequence);
        }

        /* JADX INFO: renamed from: c */
        public static void m1995c(Object obj, CharSequence charSequence) {
            ((MediaDescription.Builder) obj).setDescription(charSequence);
        }
    }

    /* JADX INFO: renamed from: a */
    public static Object m1978a(Parcel parcel) {
        return MediaDescription.CREATOR.createFromParcel(parcel);
    }

    /* JADX INFO: renamed from: a */
    public static String m1979a(Object obj) {
        return ((MediaDescription) obj).getMediaId();
    }

    /* JADX INFO: renamed from: a */
    public static void m1980a(Object obj, Parcel parcel, int i) {
        ((MediaDescription) obj).writeToParcel(parcel, i);
    }

    /* JADX INFO: renamed from: b */
    public static CharSequence m1981b(Object obj) {
        return ((MediaDescription) obj).getTitle();
    }

    /* JADX INFO: renamed from: c */
    public static CharSequence m1982c(Object obj) {
        return ((MediaDescription) obj).getSubtitle();
    }

    /* JADX INFO: renamed from: d */
    public static CharSequence m1983d(Object obj) {
        return ((MediaDescription) obj).getDescription();
    }

    /* JADX INFO: renamed from: e */
    public static Bitmap m1984e(Object obj) {
        return ((MediaDescription) obj).getIconBitmap();
    }

    /* JADX INFO: renamed from: f */
    public static Uri m1985f(Object obj) {
        return ((MediaDescription) obj).getIconUri();
    }

    /* JADX INFO: renamed from: g */
    public static Bundle m1986g(Object obj) {
        return ((MediaDescription) obj).getExtras();
    }
}
