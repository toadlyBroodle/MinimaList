package android.support.design.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

/* JADX INFO: renamed from: android.support.design.internal.e */
/* JADX INFO: loaded from: classes.dex */
public class C0031e extends SparseArray<Parcelable> implements Parcelable {
    public static final Parcelable.Creator<C0031e> CREATOR = new Parcelable.ClassLoaderCreator<C0031e>() { // from class: android.support.design.internal.e.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0031e createFromParcel(Parcel parcel) {
            return new C0031e(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0031e createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new C0031e(parcel, classLoader);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0031e[] newArray(int i) {
            return new C0031e[i];
        }
    };

    public C0031e() {
    }

    public C0031e(Parcel parcel, ClassLoader classLoader) {
        int i = parcel.readInt();
        int[] iArr = new int[i];
        parcel.readIntArray(iArr);
        Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
        for (int i2 = 0; i2 < i; i2++) {
            put(iArr[i2], parcelableArray[i2]);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int size = size();
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = keyAt(i2);
            parcelableArr[i2] = valueAt(i2);
        }
        parcel.writeInt(size);
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i);
    }
}
