package android.support.v4.media.session;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.media.session.C0312h;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new Parcelable.Creator<PlaybackStateCompat>() { // from class: android.support.v4.media.session.PlaybackStateCompat.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PlaybackStateCompat[] newArray(int i) {
            return new PlaybackStateCompat[i];
        }
    };

    /* JADX INFO: renamed from: a */
    final int f1564a;

    /* JADX INFO: renamed from: b */
    final long f1565b;

    /* JADX INFO: renamed from: c */
    final long f1566c;

    /* JADX INFO: renamed from: d */
    final float f1567d;

    /* JADX INFO: renamed from: e */
    final long f1568e;

    /* JADX INFO: renamed from: f */
    final int f1569f;

    /* JADX INFO: renamed from: g */
    final CharSequence f1570g;

    /* JADX INFO: renamed from: h */
    final long f1571h;

    /* JADX INFO: renamed from: i */
    List<CustomAction> f1572i;

    /* JADX INFO: renamed from: j */
    final long f1573j;

    /* JADX INFO: renamed from: k */
    final Bundle f1574k;

    /* JADX INFO: renamed from: l */
    private Object f1575l;

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new Parcelable.Creator<CustomAction>() { // from class: android.support.v4.media.session.PlaybackStateCompat.CustomAction.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public CustomAction[] newArray(int i) {
                return new CustomAction[i];
            }
        };

        /* JADX INFO: renamed from: a */
        private final String f1576a;

        /* JADX INFO: renamed from: b */
        private final CharSequence f1577b;

        /* JADX INFO: renamed from: c */
        private final int f1578c;

        /* JADX INFO: renamed from: d */
        private final Bundle f1579d;

        /* JADX INFO: renamed from: e */
        private Object f1580e;

        CustomAction(Parcel parcel) {
            this.f1576a = parcel.readString();
            this.f1577b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f1578c = parcel.readInt();
            this.f1579d = parcel.readBundle();
        }

        CustomAction(String str, CharSequence charSequence, int i, Bundle bundle) {
            this.f1576a = str;
            this.f1577b = charSequence;
            this.f1578c = i;
            this.f1579d = bundle;
        }

        /* JADX INFO: renamed from: a */
        public static CustomAction m2241a(Object obj) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            CustomAction customAction = new CustomAction(C0312h.a.m2294a(obj), C0312h.a.m2295b(obj), C0312h.a.m2296c(obj), C0312h.a.m2297d(obj));
            customAction.f1580e = obj;
            return customAction;
        }

        /* JADX INFO: renamed from: a */
        public Object m2242a() {
            if (this.f1580e != null || Build.VERSION.SDK_INT < 21) {
                return this.f1580e;
            }
            this.f1580e = C0312h.a.m2293a(this.f1576a, this.f1577b, this.f1578c, this.f1579d);
            return this.f1580e;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Action:mName='" + ((Object) this.f1577b) + ", mIcon=" + this.f1578c + ", mExtras=" + this.f1579d;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f1576a);
            TextUtils.writeToParcel(this.f1577b, parcel, i);
            parcel.writeInt(this.f1578c);
            parcel.writeBundle(this.f1579d);
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.session.PlaybackStateCompat$a */
    public static final class C0304a {

        /* JADX INFO: renamed from: a */
        private final List<CustomAction> f1581a;

        /* JADX INFO: renamed from: b */
        private int f1582b;

        /* JADX INFO: renamed from: c */
        private long f1583c;

        /* JADX INFO: renamed from: d */
        private long f1584d;

        /* JADX INFO: renamed from: e */
        private float f1585e;

        /* JADX INFO: renamed from: f */
        private long f1586f;

        /* JADX INFO: renamed from: g */
        private int f1587g;

        /* JADX INFO: renamed from: h */
        private CharSequence f1588h;

        /* JADX INFO: renamed from: i */
        private long f1589i;

        /* JADX INFO: renamed from: j */
        private long f1590j;

        /* JADX INFO: renamed from: k */
        private Bundle f1591k;

        public C0304a() {
            this.f1581a = new ArrayList();
            this.f1590j = -1L;
        }

        public C0304a(PlaybackStateCompat playbackStateCompat) {
            this.f1581a = new ArrayList();
            this.f1590j = -1L;
            this.f1582b = playbackStateCompat.f1564a;
            this.f1583c = playbackStateCompat.f1565b;
            this.f1585e = playbackStateCompat.f1567d;
            this.f1589i = playbackStateCompat.f1571h;
            this.f1584d = playbackStateCompat.f1566c;
            this.f1586f = playbackStateCompat.f1568e;
            this.f1587g = playbackStateCompat.f1569f;
            this.f1588h = playbackStateCompat.f1570g;
            if (playbackStateCompat.f1572i != null) {
                this.f1581a.addAll(playbackStateCompat.f1572i);
            }
            this.f1590j = playbackStateCompat.f1573j;
            this.f1591k = playbackStateCompat.f1574k;
        }

        /* JADX INFO: renamed from: a */
        public C0304a m2245a(int i, long j, float f) {
            return m2246a(i, j, f, SystemClock.elapsedRealtime());
        }

        /* JADX INFO: renamed from: a */
        public C0304a m2246a(int i, long j, float f, long j2) {
            this.f1582b = i;
            this.f1583c = j;
            this.f1589i = j2;
            this.f1585e = f;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public C0304a m2247a(long j) {
            this.f1586f = j;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public PlaybackStateCompat m2248a() {
            return new PlaybackStateCompat(this.f1582b, this.f1583c, this.f1584d, this.f1585e, this.f1586f, this.f1587g, this.f1588h, this.f1589i, this.f1581a, this.f1590j, this.f1591k);
        }
    }

    PlaybackStateCompat(int i, long j, long j2, float f, long j3, int i2, CharSequence charSequence, long j4, List<CustomAction> list, long j5, Bundle bundle) {
        this.f1564a = i;
        this.f1565b = j;
        this.f1566c = j2;
        this.f1567d = f;
        this.f1568e = j3;
        this.f1569f = i2;
        this.f1570g = charSequence;
        this.f1571h = j4;
        this.f1572i = new ArrayList(list);
        this.f1573j = j5;
        this.f1574k = bundle;
    }

    PlaybackStateCompat(Parcel parcel) {
        this.f1564a = parcel.readInt();
        this.f1565b = parcel.readLong();
        this.f1567d = parcel.readFloat();
        this.f1571h = parcel.readLong();
        this.f1566c = parcel.readLong();
        this.f1568e = parcel.readLong();
        this.f1570g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1572i = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f1573j = parcel.readLong();
        this.f1574k = parcel.readBundle();
        this.f1569f = parcel.readInt();
    }

    /* JADX INFO: renamed from: a */
    public static PlaybackStateCompat m2232a(Object obj) {
        if (obj == null || Build.VERSION.SDK_INT < 21) {
            return null;
        }
        List<Object> listM2291h = C0312h.m2291h(obj);
        ArrayList arrayList = null;
        if (listM2291h != null) {
            arrayList = new ArrayList(listM2291h.size());
            Iterator<Object> it = listM2291h.iterator();
            while (it.hasNext()) {
                arrayList.add(CustomAction.m2241a(it.next()));
            }
        }
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(C0312h.m2283a(obj), C0312h.m2285b(obj), C0312h.m2286c(obj), C0312h.m2287d(obj), C0312h.m2288e(obj), 0, C0312h.m2289f(obj), C0312h.m2290g(obj), arrayList, C0312h.m2292i(obj), Build.VERSION.SDK_INT >= 22 ? C0313i.m2298a(obj) : null);
        playbackStateCompat.f1575l = obj;
        return playbackStateCompat;
    }

    /* JADX INFO: renamed from: a */
    public int m2233a() {
        return this.f1564a;
    }

    /* JADX INFO: renamed from: b */
    public long m2234b() {
        return this.f1565b;
    }

    /* JADX INFO: renamed from: c */
    public float m2235c() {
        return this.f1567d;
    }

    /* JADX INFO: renamed from: d */
    public long m2236d() {
        return this.f1568e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public long m2237e() {
        return this.f1571h;
    }

    /* JADX INFO: renamed from: f */
    public Object m2238f() {
        if (this.f1575l == null && Build.VERSION.SDK_INT >= 21) {
            ArrayList arrayList = null;
            if (this.f1572i != null) {
                arrayList = new ArrayList(this.f1572i.size());
                Iterator<CustomAction> it = this.f1572i.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().m2242a());
                }
            }
            if (Build.VERSION.SDK_INT >= 22) {
                this.f1575l = C0313i.m2299a(this.f1564a, this.f1565b, this.f1566c, this.f1567d, this.f1568e, this.f1570g, this.f1571h, arrayList, this.f1573j, this.f1574k);
            } else {
                this.f1575l = C0312h.m2284a(this.f1564a, this.f1565b, this.f1566c, this.f1567d, this.f1568e, this.f1570g, this.f1571h, arrayList, this.f1573j);
            }
        }
        return this.f1575l;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PlaybackState {");
        sb.append("state=").append(this.f1564a);
        sb.append(", position=").append(this.f1565b);
        sb.append(", buffered position=").append(this.f1566c);
        sb.append(", speed=").append(this.f1567d);
        sb.append(", updated=").append(this.f1571h);
        sb.append(", actions=").append(this.f1568e);
        sb.append(", error code=").append(this.f1569f);
        sb.append(", error message=").append(this.f1570g);
        sb.append(", custom actions=").append(this.f1572i);
        sb.append(", active item id=").append(this.f1573j);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f1564a);
        parcel.writeLong(this.f1565b);
        parcel.writeFloat(this.f1567d);
        parcel.writeLong(this.f1571h);
        parcel.writeLong(this.f1566c);
        parcel.writeLong(this.f1568e);
        TextUtils.writeToParcel(this.f1570g, parcel, i);
        parcel.writeTypedList(this.f1572i);
        parcel.writeLong(this.f1573j);
        parcel.writeBundle(this.f1574k);
        parcel.writeInt(this.f1569f);
    }
}
