package android.support.v4.p006a;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: android.support.v4.a.r */
/* JADX INFO: loaded from: classes.dex */
final class C0162r implements Parcelable {
    public static final Parcelable.Creator<C0162r> CREATOR = new Parcelable.Creator<C0162r>() { // from class: android.support.v4.a.r.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0162r createFromParcel(Parcel parcel) {
            return new C0162r(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0162r[] newArray(int i) {
            return new C0162r[i];
        }
    };

    /* JADX INFO: renamed from: a */
    C0163s[] f962a;

    /* JADX INFO: renamed from: b */
    int[] f963b;

    /* JADX INFO: renamed from: c */
    C0149e[] f964c;

    /* JADX INFO: renamed from: d */
    int f965d;

    /* JADX INFO: renamed from: e */
    int f966e;

    public C0162r() {
        this.f965d = -1;
    }

    public C0162r(Parcel parcel) {
        this.f965d = -1;
        this.f962a = (C0163s[]) parcel.createTypedArray(C0163s.CREATOR);
        this.f963b = parcel.createIntArray();
        this.f964c = (C0149e[]) parcel.createTypedArray(C0149e.CREATOR);
        this.f965d = parcel.readInt();
        this.f966e = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.f962a, i);
        parcel.writeIntArray(this.f963b);
        parcel.writeTypedArray(this.f964c, i);
        parcel.writeInt(this.f965d);
        parcel.writeInt(this.f966e);
    }
}
