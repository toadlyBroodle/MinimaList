package android.support.v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.C0278d;
import android.support.v4.media.C0279e;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new Parcelable.Creator<MediaDescriptionCompat>() { // from class: android.support.v4.media.MediaDescriptionCompat.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return Build.VERSION.SDK_INT < 21 ? new MediaDescriptionCompat(parcel) : MediaDescriptionCompat.m1933a(C0278d.m1978a(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MediaDescriptionCompat[] newArray(int i) {
            return new MediaDescriptionCompat[i];
        }
    };

    /* JADX INFO: renamed from: a */
    private final String f1430a;

    /* JADX INFO: renamed from: b */
    private final CharSequence f1431b;

    /* JADX INFO: renamed from: c */
    private final CharSequence f1432c;

    /* JADX INFO: renamed from: d */
    private final CharSequence f1433d;

    /* JADX INFO: renamed from: e */
    private final Bitmap f1434e;

    /* JADX INFO: renamed from: f */
    private final Uri f1435f;

    /* JADX INFO: renamed from: g */
    private final Bundle f1436g;

    /* JADX INFO: renamed from: h */
    private final Uri f1437h;

    /* JADX INFO: renamed from: i */
    private Object f1438i;

    /* JADX INFO: renamed from: android.support.v4.media.MediaDescriptionCompat$a */
    public static final class C0271a {

        /* JADX INFO: renamed from: a */
        private String f1439a;

        /* JADX INFO: renamed from: b */
        private CharSequence f1440b;

        /* JADX INFO: renamed from: c */
        private CharSequence f1441c;

        /* JADX INFO: renamed from: d */
        private CharSequence f1442d;

        /* JADX INFO: renamed from: e */
        private Bitmap f1443e;

        /* JADX INFO: renamed from: f */
        private Uri f1444f;

        /* JADX INFO: renamed from: g */
        private Bundle f1445g;

        /* JADX INFO: renamed from: h */
        private Uri f1446h;

        /* JADX INFO: renamed from: a */
        public C0271a m1938a(Bitmap bitmap) {
            this.f1443e = bitmap;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public C0271a m1939a(Uri uri) {
            this.f1444f = uri;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public C0271a m1940a(Bundle bundle) {
            this.f1445g = bundle;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public C0271a m1941a(CharSequence charSequence) {
            this.f1440b = charSequence;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public C0271a m1942a(String str) {
            this.f1439a = str;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public MediaDescriptionCompat m1943a() {
            return new MediaDescriptionCompat(this.f1439a, this.f1440b, this.f1441c, this.f1442d, this.f1443e, this.f1444f, this.f1445g, this.f1446h);
        }

        /* JADX INFO: renamed from: b */
        public C0271a m1944b(Uri uri) {
            this.f1446h = uri;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public C0271a m1945b(CharSequence charSequence) {
            this.f1441c = charSequence;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C0271a m1946c(CharSequence charSequence) {
            this.f1442d = charSequence;
            return this;
        }
    }

    MediaDescriptionCompat(Parcel parcel) {
        this.f1430a = parcel.readString();
        this.f1431b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1432c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1433d = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1434e = (Bitmap) parcel.readParcelable(null);
        this.f1435f = (Uri) parcel.readParcelable(null);
        this.f1436g = parcel.readBundle();
        this.f1437h = (Uri) parcel.readParcelable(null);
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f1430a = str;
        this.f1431b = charSequence;
        this.f1432c = charSequence2;
        this.f1433d = charSequence3;
        this.f1434e = bitmap;
        this.f1435f = uri;
        this.f1436g = bundle;
        this.f1437h = uri2;
    }

    /* JADX INFO: renamed from: a */
    public static MediaDescriptionCompat m1933a(Object obj) {
        Bundle bundle;
        if (obj == null || Build.VERSION.SDK_INT < 21) {
            return null;
        }
        C0271a c0271a = new C0271a();
        c0271a.m1942a(C0278d.m1979a(obj));
        c0271a.m1941a(C0278d.m1981b(obj));
        c0271a.m1945b(C0278d.m1982c(obj));
        c0271a.m1946c(C0278d.m1983d(obj));
        c0271a.m1938a(C0278d.m1984e(obj));
        c0271a.m1939a(C0278d.m1985f(obj));
        Bundle bundleM1986g = C0278d.m1986g(obj);
        Uri uri = bundleM1986g == null ? null : (Uri) bundleM1986g.getParcelable("android.support.v4.media.description.MEDIA_URI");
        if (uri == null) {
            bundle = bundleM1986g;
        } else if (bundleM1986g.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") && bundleM1986g.size() == 2) {
            bundle = null;
        } else {
            bundleM1986g.remove("android.support.v4.media.description.MEDIA_URI");
            bundleM1986g.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
            bundle = bundleM1986g;
        }
        c0271a.m1940a(bundle);
        if (uri != null) {
            c0271a.m1944b(uri);
        } else if (Build.VERSION.SDK_INT >= 23) {
            c0271a.m1944b(C0279e.m1996h(obj));
        }
        MediaDescriptionCompat mediaDescriptionCompatM1943a = c0271a.m1943a();
        mediaDescriptionCompatM1943a.f1438i = obj;
        return mediaDescriptionCompatM1943a;
    }

    /* JADX INFO: renamed from: a */
    public String m1934a() {
        return this.f1430a;
    }

    /* JADX INFO: renamed from: b */
    public Object m1935b() {
        if (this.f1438i != null || Build.VERSION.SDK_INT < 21) {
            return this.f1438i;
        }
        Object objM1987a = C0278d.a.m1987a();
        C0278d.a.m1993a(objM1987a, this.f1430a);
        C0278d.a.m1992a(objM1987a, this.f1431b);
        C0278d.a.m1994b(objM1987a, this.f1432c);
        C0278d.a.m1995c(objM1987a, this.f1433d);
        C0278d.a.m1989a(objM1987a, this.f1434e);
        C0278d.a.m1990a(objM1987a, this.f1435f);
        Bundle bundle = this.f1436g;
        if (Build.VERSION.SDK_INT < 23 && this.f1437h != null) {
            if (bundle == null) {
                bundle = new Bundle();
                bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
            }
            bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", this.f1437h);
        }
        C0278d.a.m1991a(objM1987a, bundle);
        if (Build.VERSION.SDK_INT >= 23) {
            C0279e.a.m1997b(objM1987a, this.f1437h);
        }
        this.f1438i = C0278d.a.m1988a(objM1987a);
        return this.f1438i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return ((Object) this.f1431b) + ", " + ((Object) this.f1432c) + ", " + ((Object) this.f1433d);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            C0278d.m1980a(m1935b(), parcel, i);
            return;
        }
        parcel.writeString(this.f1430a);
        TextUtils.writeToParcel(this.f1431b, parcel, i);
        TextUtils.writeToParcel(this.f1432c, parcel, i);
        TextUtils.writeToParcel(this.f1433d, parcel, i);
        parcel.writeParcelable(this.f1434e, i);
        parcel.writeParcelable(this.f1435f, i);
        parcel.writeBundle(this.f1436g);
        parcel.writeParcelable(this.f1437h, i);
    }
}
