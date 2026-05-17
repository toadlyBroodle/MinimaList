package android.support.v4.p006a;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.p006a.C0148d;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;

/* JADX INFO: renamed from: android.support.v4.a.e */
/* JADX INFO: loaded from: classes.dex */
final class C0149e implements Parcelable {
    public static final Parcelable.Creator<C0149e> CREATOR = new Parcelable.Creator<C0149e>() { // from class: android.support.v4.a.e.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0149e createFromParcel(Parcel parcel) {
            return new C0149e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0149e[] newArray(int i) {
            return new C0149e[i];
        }
    };

    /* JADX INFO: renamed from: a */
    final int[] f775a;

    /* JADX INFO: renamed from: b */
    final int f776b;

    /* JADX INFO: renamed from: c */
    final int f777c;

    /* JADX INFO: renamed from: d */
    final String f778d;

    /* JADX INFO: renamed from: e */
    final int f779e;

    /* JADX INFO: renamed from: f */
    final int f780f;

    /* JADX INFO: renamed from: g */
    final CharSequence f781g;

    /* JADX INFO: renamed from: h */
    final int f782h;

    /* JADX INFO: renamed from: i */
    final CharSequence f783i;

    /* JADX INFO: renamed from: j */
    final ArrayList<String> f784j;

    /* JADX INFO: renamed from: k */
    final ArrayList<String> f785k;

    /* JADX INFO: renamed from: l */
    final boolean f786l;

    public C0149e(Parcel parcel) {
        this.f775a = parcel.createIntArray();
        this.f776b = parcel.readInt();
        this.f777c = parcel.readInt();
        this.f778d = parcel.readString();
        this.f779e = parcel.readInt();
        this.f780f = parcel.readInt();
        this.f781g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f782h = parcel.readInt();
        this.f783i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f784j = parcel.createStringArrayList();
        this.f785k = parcel.createStringArrayList();
        this.f786l = parcel.readInt() != 0;
    }

    public C0149e(C0148d c0148d) {
        int size = c0148d.f749b.size();
        this.f775a = new int[size * 6];
        if (!c0148d.f756i) {
            throw new IllegalStateException("Not on back stack");
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C0148d.a aVar = c0148d.f749b.get(i2);
            int i3 = i + 1;
            this.f775a[i] = aVar.f769a;
            int i4 = i3 + 1;
            this.f775a[i3] = aVar.f770b != null ? aVar.f770b.f837n : -1;
            int i5 = i4 + 1;
            this.f775a[i4] = aVar.f771c;
            int i6 = i5 + 1;
            this.f775a[i5] = aVar.f772d;
            int i7 = i6 + 1;
            this.f775a[i6] = aVar.f773e;
            i = i7 + 1;
            this.f775a[i7] = aVar.f774f;
        }
        this.f776b = c0148d.f754g;
        this.f777c = c0148d.f755h;
        this.f778d = c0148d.f758k;
        this.f779e = c0148d.f760m;
        this.f780f = c0148d.f761n;
        this.f781g = c0148d.f762o;
        this.f782h = c0148d.f763p;
        this.f783i = c0148d.f764q;
        this.f784j = c0148d.f765r;
        this.f785k = c0148d.f766s;
        this.f786l = c0148d.f767t;
    }

    /* JADX INFO: renamed from: a */
    public C0148d m857a(LayoutInflaterFactory2C0160p layoutInflaterFactory2C0160p) {
        int i = 0;
        C0148d c0148d = new C0148d(layoutInflaterFactory2C0160p);
        int i2 = 0;
        while (i < this.f775a.length) {
            C0148d.a aVar = new C0148d.a();
            int i3 = i + 1;
            aVar.f769a = this.f775a[i];
            if (LayoutInflaterFactory2C0160p.f901a) {
                Log.v("FragmentManager", "Instantiate " + c0148d + " op #" + i2 + " base fragment #" + this.f775a[i3]);
            }
            int i4 = i3 + 1;
            int i5 = this.f775a[i3];
            if (i5 >= 0) {
                aVar.f770b = layoutInflaterFactory2C0160p.f912f.get(i5);
            } else {
                aVar.f770b = null;
            }
            int i6 = i4 + 1;
            aVar.f771c = this.f775a[i4];
            int i7 = i6 + 1;
            aVar.f772d = this.f775a[i6];
            int i8 = i7 + 1;
            aVar.f773e = this.f775a[i7];
            aVar.f774f = this.f775a[i8];
            c0148d.f750c = aVar.f771c;
            c0148d.f751d = aVar.f772d;
            c0148d.f752e = aVar.f773e;
            c0148d.f753f = aVar.f774f;
            c0148d.m841a(aVar);
            i2++;
            i = i8 + 1;
        }
        c0148d.f754g = this.f776b;
        c0148d.f755h = this.f777c;
        c0148d.f758k = this.f778d;
        c0148d.f760m = this.f779e;
        c0148d.f756i = true;
        c0148d.f761n = this.f780f;
        c0148d.f762o = this.f781g;
        c0148d.f763p = this.f782h;
        c0148d.f764q = this.f783i;
        c0148d.f765r = this.f784j;
        c0148d.f766s = this.f785k;
        c0148d.f767t = this.f786l;
        c0148d.m840a(1);
        return c0148d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f775a);
        parcel.writeInt(this.f776b);
        parcel.writeInt(this.f777c);
        parcel.writeString(this.f778d);
        parcel.writeInt(this.f779e);
        parcel.writeInt(this.f780f);
        TextUtils.writeToParcel(this.f781g, parcel, 0);
        parcel.writeInt(this.f782h);
        TextUtils.writeToParcel(this.f783i, parcel, 0);
        parcel.writeStringList(this.f784j);
        parcel.writeStringList(this.f785k);
        parcel.writeInt(this.f786l ? 1 : 0);
    }
}
