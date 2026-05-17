package android.support.v4.p016g;

import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.p016g.InterfaceC0200b;

/* JADX INFO: renamed from: android.support.v4.g.d */
/* JADX INFO: loaded from: classes.dex */
public class C0202d implements Parcelable {
    public static final Parcelable.Creator<C0202d> CREATOR = new Parcelable.Creator<C0202d>() { // from class: android.support.v4.g.d.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0202d createFromParcel(Parcel parcel) {
            return new C0202d(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0202d[] newArray(int i) {
            return new C0202d[i];
        }
    };

    /* JADX INFO: renamed from: a */
    final boolean f1160a = false;

    /* JADX INFO: renamed from: b */
    final Handler f1161b = null;

    /* JADX INFO: renamed from: c */
    InterfaceC0200b f1162c;

    /* JADX INFO: renamed from: android.support.v4.g.d$a */
    class a extends InterfaceC0200b.a {
        a() {
        }

        @Override // android.support.v4.p016g.InterfaceC0200b
        /* JADX INFO: renamed from: a */
        public void mo1466a(int i, Bundle bundle) {
            if (C0202d.this.f1161b != null) {
                C0202d.this.f1161b.post(C0202d.this.new b(i, bundle));
            } else {
                C0202d.this.mo1468a(i, bundle);
            }
        }
    }

    /* JADX INFO: renamed from: android.support.v4.g.d$b */
    class b implements Runnable {

        /* JADX INFO: renamed from: a */
        final int f1164a;

        /* JADX INFO: renamed from: b */
        final Bundle f1165b;

        b(int i, Bundle bundle) {
            this.f1164a = i;
            this.f1165b = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0202d.this.mo1468a(this.f1164a, this.f1165b);
        }
    }

    C0202d(Parcel parcel) {
        this.f1162c = InterfaceC0200b.a.m1467a(parcel.readStrongBinder());
    }

    /* JADX INFO: renamed from: a */
    protected void mo1468a(int i, Bundle bundle) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.f1162c == null) {
                this.f1162c = new a();
            }
            parcel.writeStrongBinder(this.f1162c.asBinder());
        }
    }
}
