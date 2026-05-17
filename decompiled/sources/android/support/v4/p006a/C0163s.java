package android.support.v4.p006a;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

/* JADX INFO: renamed from: android.support.v4.a.s */
/* JADX INFO: loaded from: classes.dex */
final class C0163s implements Parcelable {
    public static final Parcelable.Creator<C0163s> CREATOR = new Parcelable.Creator<C0163s>() { // from class: android.support.v4.a.s.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0163s createFromParcel(Parcel parcel) {
            return new C0163s(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0163s[] newArray(int i) {
            return new C0163s[i];
        }
    };

    /* JADX INFO: renamed from: a */
    final String f967a;

    /* JADX INFO: renamed from: b */
    final int f968b;

    /* JADX INFO: renamed from: c */
    final boolean f969c;

    /* JADX INFO: renamed from: d */
    final int f970d;

    /* JADX INFO: renamed from: e */
    final int f971e;

    /* JADX INFO: renamed from: f */
    final String f972f;

    /* JADX INFO: renamed from: g */
    final boolean f973g;

    /* JADX INFO: renamed from: h */
    final boolean f974h;

    /* JADX INFO: renamed from: i */
    final Bundle f975i;

    /* JADX INFO: renamed from: j */
    final boolean f976j;

    /* JADX INFO: renamed from: k */
    Bundle f977k;

    /* JADX INFO: renamed from: l */
    ComponentCallbacksC0154j f978l;

    C0163s(Parcel parcel) {
        this.f967a = parcel.readString();
        this.f968b = parcel.readInt();
        this.f969c = parcel.readInt() != 0;
        this.f970d = parcel.readInt();
        this.f971e = parcel.readInt();
        this.f972f = parcel.readString();
        this.f973g = parcel.readInt() != 0;
        this.f974h = parcel.readInt() != 0;
        this.f975i = parcel.readBundle();
        this.f976j = parcel.readInt() != 0;
        this.f977k = parcel.readBundle();
    }

    C0163s(ComponentCallbacksC0154j componentCallbacksC0154j) {
        this.f967a = componentCallbacksC0154j.getClass().getName();
        this.f968b = componentCallbacksC0154j.f837n;
        this.f969c = componentCallbacksC0154j.f845v;
        this.f970d = componentCallbacksC0154j.f809F;
        this.f971e = componentCallbacksC0154j.f810G;
        this.f972f = componentCallbacksC0154j.f811H;
        this.f973g = componentCallbacksC0154j.f814K;
        this.f974h = componentCallbacksC0154j.f813J;
        this.f975i = componentCallbacksC0154j.f839p;
        this.f976j = componentCallbacksC0154j.f812I;
    }

    /* JADX INFO: renamed from: a */
    public ComponentCallbacksC0154j m1210a(AbstractC0158n abstractC0158n, AbstractC0156l abstractC0156l, ComponentCallbacksC0154j componentCallbacksC0154j, C0161q c0161q) {
        if (this.f978l == null) {
            Context contextM1063g = abstractC0158n.m1063g();
            if (this.f975i != null) {
                this.f975i.setClassLoader(contextM1063g.getClassLoader());
            }
            if (abstractC0156l != null) {
                this.f978l = abstractC0156l.mo989a(contextM1063g, this.f967a, this.f975i);
            } else {
                this.f978l = ComponentCallbacksC0154j.m882a(contextM1063g, this.f967a, this.f975i);
            }
            if (this.f977k != null) {
                this.f977k.setClassLoader(contextM1063g.getClassLoader());
                this.f978l.f835l = this.f977k;
            }
            this.f978l.m920a(this.f968b, componentCallbacksC0154j);
            this.f978l.f845v = this.f969c;
            this.f978l.f847x = true;
            this.f978l.f809F = this.f970d;
            this.f978l.f810G = this.f971e;
            this.f978l.f811H = this.f972f;
            this.f978l.f814K = this.f973g;
            this.f978l.f813J = this.f974h;
            this.f978l.f812I = this.f976j;
            this.f978l.f804A = abstractC0158n.f890d;
            if (LayoutInflaterFactory2C0160p.f901a) {
                Log.v("FragmentManager", "Instantiated fragment " + this.f978l);
            }
        }
        this.f978l.f807D = c0161q;
        return this.f978l;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f967a);
        parcel.writeInt(this.f968b);
        parcel.writeInt(this.f969c ? 1 : 0);
        parcel.writeInt(this.f970d);
        parcel.writeInt(this.f971e);
        parcel.writeString(this.f972f);
        parcel.writeInt(this.f973g ? 1 : 0);
        parcel.writeInt(this.f974h ? 1 : 0);
        parcel.writeBundle(this.f975i);
        parcel.writeInt(this.f976j ? 1 : 0);
        parcel.writeBundle(this.f977k);
    }
}
