package android.support.v4.media;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.p018i.C0207a;

/* JADX INFO: loaded from: classes.dex */
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR;

    /* JADX INFO: renamed from: a */
    static final C0207a<String, Integer> f1447a = new C0207a<>();

    /* JADX INFO: renamed from: c */
    private static final String[] f1448c;

    /* JADX INFO: renamed from: d */
    private static final String[] f1449d;

    /* JADX INFO: renamed from: e */
    private static final String[] f1450e;

    /* JADX INFO: renamed from: b */
    final Bundle f1451b;

    /* JADX INFO: renamed from: f */
    private Object f1452f;

    /* JADX INFO: renamed from: android.support.v4.media.MediaMetadataCompat$a */
    public static final class C0273a {

        /* JADX INFO: renamed from: a */
        private final Bundle f1453a;

        public C0273a() {
            this.f1453a = new Bundle();
        }

        public C0273a(MediaMetadataCompat mediaMetadataCompat) {
            this.f1453a = new Bundle(mediaMetadataCompat.f1451b);
        }

        public C0273a(MediaMetadataCompat mediaMetadataCompat, int i) {
            this(mediaMetadataCompat);
            for (String str : this.f1453a.keySet()) {
                Object obj = this.f1453a.get(str);
                if (obj instanceof Bitmap) {
                    Bitmap bitmap = (Bitmap) obj;
                    if (bitmap.getHeight() > i || bitmap.getWidth() > i) {
                        m1956a(str, m1954a(bitmap, i));
                    }
                }
            }
        }

        /* JADX INFO: renamed from: a */
        private Bitmap m1954a(Bitmap bitmap, int i) {
            float f = i;
            float fMin = Math.min(f / bitmap.getWidth(), f / bitmap.getHeight());
            return Bitmap.createScaledBitmap(bitmap, (int) (fMin * bitmap.getWidth()), (int) (bitmap.getHeight() * fMin), true);
        }

        /* JADX INFO: renamed from: a */
        public C0273a m1955a(String str, long j) {
            if (MediaMetadataCompat.f1447a.containsKey(str) && MediaMetadataCompat.f1447a.get(str).intValue() != 0) {
                throw new IllegalArgumentException("The " + str + " key cannot be used to put a long");
            }
            this.f1453a.putLong(str, j);
            return this;
        }

        /* JADX INFO: renamed from: a */
        public C0273a m1956a(String str, Bitmap bitmap) {
            if (MediaMetadataCompat.f1447a.containsKey(str) && MediaMetadataCompat.f1447a.get(str).intValue() != 2) {
                throw new IllegalArgumentException("The " + str + " key cannot be used to put a Bitmap");
            }
            this.f1453a.putParcelable(str, bitmap);
            return this;
        }

        /* JADX INFO: renamed from: a */
        public C0273a m1957a(String str, String str2) {
            if (MediaMetadataCompat.f1447a.containsKey(str) && MediaMetadataCompat.f1447a.get(str).intValue() != 1) {
                throw new IllegalArgumentException("The " + str + " key cannot be used to put a String");
            }
            this.f1453a.putCharSequence(str, str2);
            return this;
        }

        /* JADX INFO: renamed from: a */
        public MediaMetadataCompat m1958a() {
            return new MediaMetadataCompat(this.f1453a);
        }
    }

    static {
        f1447a.put("android.media.metadata.TITLE", 1);
        f1447a.put("android.media.metadata.ARTIST", 1);
        f1447a.put("android.media.metadata.DURATION", 0);
        f1447a.put("android.media.metadata.ALBUM", 1);
        f1447a.put("android.media.metadata.AUTHOR", 1);
        f1447a.put("android.media.metadata.WRITER", 1);
        f1447a.put("android.media.metadata.COMPOSER", 1);
        f1447a.put("android.media.metadata.COMPILATION", 1);
        f1447a.put("android.media.metadata.DATE", 1);
        f1447a.put("android.media.metadata.YEAR", 0);
        f1447a.put("android.media.metadata.GENRE", 1);
        f1447a.put("android.media.metadata.TRACK_NUMBER", 0);
        f1447a.put("android.media.metadata.NUM_TRACKS", 0);
        f1447a.put("android.media.metadata.DISC_NUMBER", 0);
        f1447a.put("android.media.metadata.ALBUM_ARTIST", 1);
        f1447a.put("android.media.metadata.ART", 2);
        f1447a.put("android.media.metadata.ART_URI", 1);
        f1447a.put("android.media.metadata.ALBUM_ART", 2);
        f1447a.put("android.media.metadata.ALBUM_ART_URI", 1);
        f1447a.put("android.media.metadata.USER_RATING", 3);
        f1447a.put("android.media.metadata.RATING", 3);
        f1447a.put("android.media.metadata.DISPLAY_TITLE", 1);
        f1447a.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        f1447a.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        f1447a.put("android.media.metadata.DISPLAY_ICON", 2);
        f1447a.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        f1447a.put("android.media.metadata.MEDIA_ID", 1);
        f1447a.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        f1447a.put("android.media.metadata.MEDIA_URI", 1);
        f1447a.put("android.media.metadata.ADVERTISEMENT", 0);
        f1447a.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        f1448c = new String[]{"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"};
        f1449d = new String[]{"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART"};
        f1450e = new String[]{"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI"};
        CREATOR = new Parcelable.Creator<MediaMetadataCompat>() { // from class: android.support.v4.media.MediaMetadataCompat.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public MediaMetadataCompat createFromParcel(Parcel parcel) {
                return new MediaMetadataCompat(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public MediaMetadataCompat[] newArray(int i) {
                return new MediaMetadataCompat[i];
            }
        };
    }

    MediaMetadataCompat(Bundle bundle) {
        this.f1451b = new Bundle(bundle);
    }

    MediaMetadataCompat(Parcel parcel) {
        this.f1451b = parcel.readBundle();
    }

    /* JADX INFO: renamed from: a */
    public static MediaMetadataCompat m1947a(Object obj) {
        if (obj == null || Build.VERSION.SDK_INT < 21) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        C0280f.m1999a(obj, parcelObtain, 0);
        parcelObtain.setDataPosition(0);
        MediaMetadataCompat mediaMetadataCompatCreateFromParcel = CREATOR.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        mediaMetadataCompatCreateFromParcel.f1452f = obj;
        return mediaMetadataCompatCreateFromParcel;
    }

    /* JADX INFO: renamed from: a */
    public Bundle m1948a() {
        return this.f1451b;
    }

    /* JADX INFO: renamed from: a */
    public boolean m1949a(String str) {
        return this.f1451b.containsKey(str);
    }

    /* JADX INFO: renamed from: b */
    public long m1950b(String str) {
        return this.f1451b.getLong(str, 0L);
    }

    /* JADX INFO: renamed from: b */
    public Object m1951b() {
        if (this.f1452f == null && Build.VERSION.SDK_INT >= 21) {
            Parcel parcelObtain = Parcel.obtain();
            writeToParcel(parcelObtain, 0);
            parcelObtain.setDataPosition(0);
            this.f1452f = C0280f.m1998a(parcelObtain);
            parcelObtain.recycle();
        }
        return this.f1452f;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f1451b);
    }
}
