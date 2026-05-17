package android.support.v4.media;

import android.media.Rating;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new Parcelable.Creator<RatingCompat>() { // from class: android.support.v4.media.RatingCompat.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public RatingCompat[] newArray(int i) {
            return new RatingCompat[i];
        }
    };

    /* JADX INFO: renamed from: a */
    private final int f1454a;

    /* JADX INFO: renamed from: b */
    private final float f1455b;

    /* JADX INFO: renamed from: c */
    private Object f1456c;

    RatingCompat(int i, float f) {
        this.f1454a = i;
        this.f1455b = f;
    }

    /* JADX INFO: renamed from: a */
    public static RatingCompat m1959a(float f) {
        if (f >= 0.0f && f <= 100.0f) {
            return new RatingCompat(6, f);
        }
        Log.e("Rating", "Invalid percentage-based rating value");
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static RatingCompat m1960a(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return new RatingCompat(i, -1.0f);
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static RatingCompat m1961a(int i, float f) {
        float f2;
        switch (i) {
            case 3:
                f2 = 3.0f;
                break;
            case 4:
                f2 = 4.0f;
                break;
            case 5:
                f2 = 5.0f;
                break;
            default:
                Log.e("Rating", "Invalid rating style (" + i + ") for a star rating");
                return null;
        }
        if (f >= 0.0f && f <= f2) {
            return new RatingCompat(i, f);
        }
        Log.e("Rating", "Trying to set out of range star-based rating");
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static RatingCompat m1962a(Object obj) {
        RatingCompat ratingCompatM1960a;
        if (obj == null || Build.VERSION.SDK_INT < 19) {
            return null;
        }
        int ratingStyle = ((Rating) obj).getRatingStyle();
        if (((Rating) obj).isRated()) {
            switch (ratingStyle) {
                case 1:
                    ratingCompatM1960a = m1963a(((Rating) obj).hasHeart());
                    break;
                case 2:
                    ratingCompatM1960a = m1964b(((Rating) obj).isThumbUp());
                    break;
                case 3:
                case 4:
                case 5:
                    ratingCompatM1960a = m1961a(ratingStyle, ((Rating) obj).getStarRating());
                    break;
                case 6:
                    ratingCompatM1960a = m1959a(((Rating) obj).getPercentRating());
                    break;
                default:
                    return null;
            }
        } else {
            ratingCompatM1960a = m1960a(ratingStyle);
        }
        ratingCompatM1960a.f1456c = obj;
        return ratingCompatM1960a;
    }

    /* JADX INFO: renamed from: a */
    public static RatingCompat m1963a(boolean z) {
        return new RatingCompat(1, z ? 1.0f : 0.0f);
    }

    /* JADX INFO: renamed from: b */
    public static RatingCompat m1964b(boolean z) {
        return new RatingCompat(2, z ? 1.0f : 0.0f);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return this.f1454a;
    }

    public String toString() {
        return "Rating:style=" + this.f1454a + " rating=" + (this.f1455b < 0.0f ? "unrated" : String.valueOf(this.f1455b));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f1454a);
        parcel.writeFloat(this.f1455b);
    }
}
