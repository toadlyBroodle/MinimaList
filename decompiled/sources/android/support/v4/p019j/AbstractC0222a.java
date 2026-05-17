package android.support.v4.p019j;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: android.support.v4.j.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0222a implements Parcelable {

    /* JADX INFO: renamed from: a */
    private final Parcelable f1282a;

    /* JADX INFO: renamed from: d */
    public static final AbstractC0222a f1281d = new AbstractC0222a() { // from class: android.support.v4.j.a.1
    };
    public static final Parcelable.Creator<AbstractC0222a> CREATOR = new Parcelable.ClassLoaderCreator<AbstractC0222a>() { // from class: android.support.v4.j.a.2
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC0222a createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC0222a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) != null) {
                throw new IllegalStateException("superState must be null");
            }
            return AbstractC0222a.f1281d;
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC0222a[] newArray(int i) {
            return new AbstractC0222a[i];
        }
    };

    private AbstractC0222a() {
        this.f1282a = null;
    }

    protected AbstractC0222a(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f1282a = parcelable == null ? f1281d : parcelable;
    }

    protected AbstractC0222a(Parcelable parcelable) {
        if (parcelable == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        this.f1282a = parcelable == f1281d ? null : parcelable;
    }

    /* JADX INFO: renamed from: a */
    public final Parcelable m1605a() {
        return this.f1282a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f1282a, i);
    }
}
