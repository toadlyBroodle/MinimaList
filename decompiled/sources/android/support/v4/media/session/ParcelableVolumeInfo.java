package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new Parcelable.Creator<ParcelableVolumeInfo>() { // from class: android.support.v4.media.session.ParcelableVolumeInfo.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ParcelableVolumeInfo[] newArray(int i) {
            return new ParcelableVolumeInfo[i];
        }
    };

    /* JADX INFO: renamed from: a */
    public int f1559a;

    /* JADX INFO: renamed from: b */
    public int f1560b;

    /* JADX INFO: renamed from: c */
    public int f1561c;

    /* JADX INFO: renamed from: d */
    public int f1562d;

    /* JADX INFO: renamed from: e */
    public int f1563e;

    public ParcelableVolumeInfo(int i, int i2, int i3, int i4, int i5) {
        this.f1559a = i;
        this.f1560b = i2;
        this.f1561c = i3;
        this.f1562d = i4;
        this.f1563e = i5;
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f1559a = parcel.readInt();
        this.f1561c = parcel.readInt();
        this.f1562d = parcel.readInt();
        this.f1563e = parcel.readInt();
        this.f1560b = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f1559a);
        parcel.writeInt(this.f1561c);
        parcel.writeInt(this.f1562d);
        parcel.writeInt(this.f1563e);
        parcel.writeInt(this.f1560b);
    }
}
