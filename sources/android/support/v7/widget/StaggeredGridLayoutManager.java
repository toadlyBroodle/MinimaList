package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.p019j.p020a.C0224b;
import android.support.v7.widget.C0484av;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends C0484av.h {

    /* JADX INFO: renamed from: A */
    private C0452d f2846A;

    /* JADX INFO: renamed from: B */
    private int f2847B;

    /* JADX INFO: renamed from: G */
    private int[] f2852G;

    /* JADX INFO: renamed from: a */
    C0453e[] f2854a;

    /* JADX INFO: renamed from: b */
    AbstractC0483au f2855b;

    /* JADX INFO: renamed from: c */
    AbstractC0483au f2856c;

    /* JADX INFO: renamed from: j */
    private int f2863j;

    /* JADX INFO: renamed from: k */
    private int f2864k;

    /* JADX INFO: renamed from: l */
    private final C0476an f2865l;

    /* JADX INFO: renamed from: m */
    private BitSet f2866m;

    /* JADX INFO: renamed from: o */
    private boolean f2868o;

    /* JADX INFO: renamed from: z */
    private boolean f2869z;

    /* JADX INFO: renamed from: i */
    private int f2862i = -1;

    /* JADX INFO: renamed from: d */
    boolean f2857d = false;

    /* JADX INFO: renamed from: e */
    boolean f2858e = false;

    /* JADX INFO: renamed from: f */
    int f2859f = -1;

    /* JADX INFO: renamed from: g */
    int f2860g = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: h */
    C0451c f2861h = new C0451c();

    /* JADX INFO: renamed from: n */
    private int f2867n = 2;

    /* JADX INFO: renamed from: C */
    private final Rect f2848C = new Rect();

    /* JADX INFO: renamed from: D */
    private final C0449a f2849D = new C0449a();

    /* JADX INFO: renamed from: E */
    private boolean f2850E = false;

    /* JADX INFO: renamed from: F */
    private boolean f2851F = true;

    /* JADX INFO: renamed from: H */
    private final Runnable f2853H = new Runnable() { // from class: android.support.v7.widget.StaggeredGridLayoutManager.1
        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.m3633f();
        }
    };

    /* JADX INFO: renamed from: android.support.v7.widget.StaggeredGridLayoutManager$a */
    class C0449a {

        /* JADX INFO: renamed from: a */
        int f2871a;

        /* JADX INFO: renamed from: b */
        int f2872b;

        /* JADX INFO: renamed from: c */
        boolean f2873c;

        /* JADX INFO: renamed from: d */
        boolean f2874d;

        /* JADX INFO: renamed from: e */
        boolean f2875e;

        /* JADX INFO: renamed from: f */
        int[] f2876f;

        C0449a() {
            m3643a();
        }

        /* JADX INFO: renamed from: a */
        void m3643a() {
            this.f2871a = -1;
            this.f2872b = Integer.MIN_VALUE;
            this.f2873c = false;
            this.f2874d = false;
            this.f2875e = false;
            if (this.f2876f != null) {
                Arrays.fill(this.f2876f, -1);
            }
        }

        /* JADX INFO: renamed from: a */
        void m3644a(int i) {
            if (this.f2873c) {
                this.f2872b = StaggeredGridLayoutManager.this.f2855b.mo4008d() - i;
            } else {
                this.f2872b = StaggeredGridLayoutManager.this.f2855b.mo4006c() + i;
            }
        }

        /* JADX INFO: renamed from: a */
        void m3645a(C0453e[] c0453eArr) {
            int length = c0453eArr.length;
            if (this.f2876f == null || this.f2876f.length < length) {
                this.f2876f = new int[StaggeredGridLayoutManager.this.f2854a.length];
            }
            for (int i = 0; i < length; i++) {
                this.f2876f[i] = c0453eArr[i].m3671a(Integer.MIN_VALUE);
            }
        }

        /* JADX INFO: renamed from: b */
        void m3646b() {
            this.f2872b = this.f2873c ? StaggeredGridLayoutManager.this.f2855b.mo4008d() : StaggeredGridLayoutManager.this.f2855b.mo4006c();
        }
    }

    /* JADX INFO: renamed from: android.support.v7.widget.StaggeredGridLayoutManager$b */
    public static class C0450b extends C0484av.i {

        /* JADX INFO: renamed from: a */
        C0453e f2878a;

        /* JADX INFO: renamed from: b */
        boolean f2879b;

        public C0450b(int i, int i2) {
            super(i, i2);
        }

        public C0450b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0450b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0450b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        /* JADX INFO: renamed from: a */
        public boolean m3647a() {
            return this.f2879b;
        }

        /* JADX INFO: renamed from: b */
        public final int m3648b() {
            if (this.f2878a == null) {
                return -1;
            }
            return this.f2878a.f2900e;
        }
    }

    /* JADX INFO: renamed from: android.support.v7.widget.StaggeredGridLayoutManager$c */
    static class C0451c {

        /* JADX INFO: renamed from: a */
        int[] f2880a;

        /* JADX INFO: renamed from: b */
        List<a> f2881b;

        /* JADX INFO: renamed from: android.support.v7.widget.StaggeredGridLayoutManager$c$a */
        static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>() { // from class: android.support.v7.widget.StaggeredGridLayoutManager.c.a.1
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public a createFromParcel(Parcel parcel) {
                    return new a(parcel);
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public a[] newArray(int i) {
                    return new a[i];
                }
            };

            /* JADX INFO: renamed from: a */
            int f2882a;

            /* JADX INFO: renamed from: b */
            int f2883b;

            /* JADX INFO: renamed from: c */
            int[] f2884c;

            /* JADX INFO: renamed from: d */
            boolean f2885d;

            a() {
            }

            a(Parcel parcel) {
                this.f2882a = parcel.readInt();
                this.f2883b = parcel.readInt();
                this.f2885d = parcel.readInt() == 1;
                int i = parcel.readInt();
                if (i > 0) {
                    this.f2884c = new int[i];
                    parcel.readIntArray(this.f2884c);
                }
            }

            /* JADX INFO: renamed from: a */
            int m3664a(int i) {
                if (this.f2884c == null) {
                    return 0;
                }
                return this.f2884c[i];
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f2882a + ", mGapDir=" + this.f2883b + ", mHasUnwantedGapAfter=" + this.f2885d + ", mGapPerSpan=" + Arrays.toString(this.f2884c) + '}';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f2882a);
                parcel.writeInt(this.f2883b);
                parcel.writeInt(this.f2885d ? 1 : 0);
                if (this.f2884c == null || this.f2884c.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(this.f2884c.length);
                    parcel.writeIntArray(this.f2884c);
                }
            }
        }

        C0451c() {
        }

        /* JADX INFO: renamed from: c */
        private void m3649c(int i, int i2) {
            if (this.f2881b == null) {
                return;
            }
            int i3 = i + i2;
            for (int size = this.f2881b.size() - 1; size >= 0; size--) {
                a aVar = this.f2881b.get(size);
                if (aVar.f2882a >= i) {
                    if (aVar.f2882a < i3) {
                        this.f2881b.remove(size);
                    } else {
                        aVar.f2882a -= i2;
                    }
                }
            }
        }

        /* JADX INFO: renamed from: d */
        private void m3650d(int i, int i2) {
            if (this.f2881b == null) {
                return;
            }
            for (int size = this.f2881b.size() - 1; size >= 0; size--) {
                a aVar = this.f2881b.get(size);
                if (aVar.f2882a >= i) {
                    aVar.f2882a += i2;
                }
            }
        }

        /* JADX INFO: renamed from: g */
        private int m3651g(int i) {
            if (this.f2881b == null) {
                return -1;
            }
            a aVarM3663f = m3663f(i);
            if (aVarM3663f != null) {
                this.f2881b.remove(aVarM3663f);
            }
            int size = this.f2881b.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                }
                if (this.f2881b.get(i2).f2882a >= i) {
                    break;
                }
                i2++;
            }
            if (i2 == -1) {
                return -1;
            }
            a aVar = this.f2881b.get(i2);
            this.f2881b.remove(i2);
            return aVar.f2882a;
        }

        /* JADX INFO: renamed from: a */
        int m3652a(int i) {
            if (this.f2881b != null) {
                for (int size = this.f2881b.size() - 1; size >= 0; size--) {
                    if (this.f2881b.get(size).f2882a >= i) {
                        this.f2881b.remove(size);
                    }
                }
            }
            return m3658b(i);
        }

        /* JADX INFO: renamed from: a */
        public a m3653a(int i, int i2, int i3, boolean z) {
            if (this.f2881b == null) {
                return null;
            }
            int size = this.f2881b.size();
            for (int i4 = 0; i4 < size; i4++) {
                a aVar = this.f2881b.get(i4);
                if (aVar.f2882a >= i2) {
                    return null;
                }
                if (aVar.f2882a >= i) {
                    if (i3 == 0 || aVar.f2883b == i3) {
                        return aVar;
                    }
                    if (z && aVar.f2885d) {
                        return aVar;
                    }
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: a */
        void m3654a() {
            if (this.f2880a != null) {
                Arrays.fill(this.f2880a, -1);
            }
            this.f2881b = null;
        }

        /* JADX INFO: renamed from: a */
        void m3655a(int i, int i2) {
            if (this.f2880a == null || i >= this.f2880a.length) {
                return;
            }
            m3662e(i + i2);
            System.arraycopy(this.f2880a, i + i2, this.f2880a, i, (this.f2880a.length - i) - i2);
            Arrays.fill(this.f2880a, this.f2880a.length - i2, this.f2880a.length, -1);
            m3649c(i, i2);
        }

        /* JADX INFO: renamed from: a */
        void m3656a(int i, C0453e c0453e) {
            m3662e(i);
            this.f2880a[i] = c0453e.f2900e;
        }

        /* JADX INFO: renamed from: a */
        public void m3657a(a aVar) {
            if (this.f2881b == null) {
                this.f2881b = new ArrayList();
            }
            int size = this.f2881b.size();
            for (int i = 0; i < size; i++) {
                a aVar2 = this.f2881b.get(i);
                if (aVar2.f2882a == aVar.f2882a) {
                    this.f2881b.remove(i);
                }
                if (aVar2.f2882a >= aVar.f2882a) {
                    this.f2881b.add(i, aVar);
                    return;
                }
            }
            this.f2881b.add(aVar);
        }

        /* JADX INFO: renamed from: b */
        int m3658b(int i) {
            if (this.f2880a == null || i >= this.f2880a.length) {
                return -1;
            }
            int iM3651g = m3651g(i);
            if (iM3651g == -1) {
                Arrays.fill(this.f2880a, i, this.f2880a.length, -1);
                return this.f2880a.length;
            }
            Arrays.fill(this.f2880a, i, iM3651g + 1, -1);
            return iM3651g + 1;
        }

        /* JADX INFO: renamed from: b */
        void m3659b(int i, int i2) {
            if (this.f2880a == null || i >= this.f2880a.length) {
                return;
            }
            m3662e(i + i2);
            System.arraycopy(this.f2880a, i, this.f2880a, i + i2, (this.f2880a.length - i) - i2);
            Arrays.fill(this.f2880a, i, i + i2, -1);
            m3650d(i, i2);
        }

        /* JADX INFO: renamed from: c */
        int m3660c(int i) {
            if (this.f2880a == null || i >= this.f2880a.length) {
                return -1;
            }
            return this.f2880a[i];
        }

        /* JADX INFO: renamed from: d */
        int m3661d(int i) {
            int length = this.f2880a.length;
            while (length <= i) {
                length *= 2;
            }
            return length;
        }

        /* JADX INFO: renamed from: e */
        void m3662e(int i) {
            if (this.f2880a == null) {
                this.f2880a = new int[Math.max(i, 10) + 1];
                Arrays.fill(this.f2880a, -1);
            } else if (i >= this.f2880a.length) {
                int[] iArr = this.f2880a;
                this.f2880a = new int[m3661d(i)];
                System.arraycopy(iArr, 0, this.f2880a, 0, iArr.length);
                Arrays.fill(this.f2880a, iArr.length, this.f2880a.length, -1);
            }
        }

        /* JADX INFO: renamed from: f */
        public a m3663f(int i) {
            if (this.f2881b == null) {
                return null;
            }
            for (int size = this.f2881b.size() - 1; size >= 0; size--) {
                a aVar = this.f2881b.get(size);
                if (aVar.f2882a == i) {
                    return aVar;
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: android.support.v7.widget.StaggeredGridLayoutManager$d */
    public static class C0452d implements Parcelable {
        public static final Parcelable.Creator<C0452d> CREATOR = new Parcelable.Creator<C0452d>() { // from class: android.support.v7.widget.StaggeredGridLayoutManager.d.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public C0452d createFromParcel(Parcel parcel) {
                return new C0452d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public C0452d[] newArray(int i) {
                return new C0452d[i];
            }
        };

        /* JADX INFO: renamed from: a */
        int f2886a;

        /* JADX INFO: renamed from: b */
        int f2887b;

        /* JADX INFO: renamed from: c */
        int f2888c;

        /* JADX INFO: renamed from: d */
        int[] f2889d;

        /* JADX INFO: renamed from: e */
        int f2890e;

        /* JADX INFO: renamed from: f */
        int[] f2891f;

        /* JADX INFO: renamed from: g */
        List<C0451c.a> f2892g;

        /* JADX INFO: renamed from: h */
        boolean f2893h;

        /* JADX INFO: renamed from: i */
        boolean f2894i;

        /* JADX INFO: renamed from: j */
        boolean f2895j;

        public C0452d() {
        }

        C0452d(Parcel parcel) {
            this.f2886a = parcel.readInt();
            this.f2887b = parcel.readInt();
            this.f2888c = parcel.readInt();
            if (this.f2888c > 0) {
                this.f2889d = new int[this.f2888c];
                parcel.readIntArray(this.f2889d);
            }
            this.f2890e = parcel.readInt();
            if (this.f2890e > 0) {
                this.f2891f = new int[this.f2890e];
                parcel.readIntArray(this.f2891f);
            }
            this.f2893h = parcel.readInt() == 1;
            this.f2894i = parcel.readInt() == 1;
            this.f2895j = parcel.readInt() == 1;
            this.f2892g = parcel.readArrayList(C0451c.a.class.getClassLoader());
        }

        public C0452d(C0452d c0452d) {
            this.f2888c = c0452d.f2888c;
            this.f2886a = c0452d.f2886a;
            this.f2887b = c0452d.f2887b;
            this.f2889d = c0452d.f2889d;
            this.f2890e = c0452d.f2890e;
            this.f2891f = c0452d.f2891f;
            this.f2893h = c0452d.f2893h;
            this.f2894i = c0452d.f2894i;
            this.f2895j = c0452d.f2895j;
            this.f2892g = c0452d.f2892g;
        }

        /* JADX INFO: renamed from: a */
        void m3667a() {
            this.f2889d = null;
            this.f2888c = 0;
            this.f2890e = 0;
            this.f2891f = null;
            this.f2892g = null;
        }

        /* JADX INFO: renamed from: b */
        void m3668b() {
            this.f2889d = null;
            this.f2888c = 0;
            this.f2886a = -1;
            this.f2887b = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f2886a);
            parcel.writeInt(this.f2887b);
            parcel.writeInt(this.f2888c);
            if (this.f2888c > 0) {
                parcel.writeIntArray(this.f2889d);
            }
            parcel.writeInt(this.f2890e);
            if (this.f2890e > 0) {
                parcel.writeIntArray(this.f2891f);
            }
            parcel.writeInt(this.f2893h ? 1 : 0);
            parcel.writeInt(this.f2894i ? 1 : 0);
            parcel.writeInt(this.f2895j ? 1 : 0);
            parcel.writeList(this.f2892g);
        }
    }

    /* JADX INFO: renamed from: android.support.v7.widget.StaggeredGridLayoutManager$e */
    class C0453e {

        /* JADX INFO: renamed from: a */
        ArrayList<View> f2896a = new ArrayList<>();

        /* JADX INFO: renamed from: b */
        int f2897b = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: c */
        int f2898c = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: d */
        int f2899d = 0;

        /* JADX INFO: renamed from: e */
        final int f2900e;

        C0453e(int i) {
            this.f2900e = i;
        }

        /* JADX INFO: renamed from: a */
        int m3671a(int i) {
            if (this.f2897b != Integer.MIN_VALUE) {
                return this.f2897b;
            }
            if (this.f2896a.size() == 0) {
                return i;
            }
            m3675a();
            return this.f2897b;
        }

        /* JADX INFO: renamed from: a */
        int m3672a(int i, int i2, boolean z) {
            return m3673a(i, i2, false, false, z);
        }

        /* JADX INFO: renamed from: a */
        int m3673a(int i, int i2, boolean z, boolean z2, boolean z3) {
            int iMo4006c = StaggeredGridLayoutManager.this.f2855b.mo4006c();
            int iMo4008d = StaggeredGridLayoutManager.this.f2855b.mo4008d();
            int i3 = i2 > i ? 1 : -1;
            while (i != i2) {
                View view = this.f2896a.get(i);
                int iMo4001a = StaggeredGridLayoutManager.this.f2855b.mo4001a(view);
                int iMo4005b = StaggeredGridLayoutManager.this.f2855b.mo4005b(view);
                boolean z4 = z3 ? iMo4001a <= iMo4008d : iMo4001a < iMo4008d;
                boolean z5 = z3 ? iMo4005b >= iMo4006c : iMo4005b > iMo4006c;
                if (z4 && z5) {
                    if (z && z2) {
                        if (iMo4001a >= iMo4006c && iMo4005b <= iMo4008d) {
                            return StaggeredGridLayoutManager.this.m4256d(view);
                        }
                    } else {
                        if (z2) {
                            return StaggeredGridLayoutManager.this.m4256d(view);
                        }
                        if (iMo4001a < iMo4006c || iMo4005b > iMo4008d) {
                            return StaggeredGridLayoutManager.this.m4256d(view);
                        }
                    }
                }
                i += i3;
            }
            return -1;
        }

        /* JADX INFO: renamed from: a */
        public View m3674a(int i, int i2) {
            View view = null;
            if (i2 == -1) {
                int size = this.f2896a.size();
                int i3 = 0;
                while (i3 < size) {
                    View view2 = this.f2896a.get(i3);
                    if ((StaggeredGridLayoutManager.this.f2857d && StaggeredGridLayoutManager.this.m4256d(view2) <= i) || ((!StaggeredGridLayoutManager.this.f2857d && StaggeredGridLayoutManager.this.m4256d(view2) >= i) || !view2.hasFocusable())) {
                        break;
                    }
                    i3++;
                    view = view2;
                }
                return view;
            }
            int size2 = this.f2896a.size() - 1;
            while (size2 >= 0) {
                View view3 = this.f2896a.get(size2);
                if (StaggeredGridLayoutManager.this.f2857d && StaggeredGridLayoutManager.this.m4256d(view3) >= i) {
                    break;
                }
                if (!StaggeredGridLayoutManager.this.f2857d && StaggeredGridLayoutManager.this.m4256d(view3) <= i) {
                    return view;
                }
                if (!view3.hasFocusable()) {
                    break;
                }
                size2--;
                view = view3;
            }
            return view;
        }

        /* JADX INFO: renamed from: a */
        void m3675a() {
            C0451c.a aVarM3663f;
            View view = this.f2896a.get(0);
            C0450b c0450bM3681c = m3681c(view);
            this.f2897b = StaggeredGridLayoutManager.this.f2855b.mo4001a(view);
            if (c0450bM3681c.f2879b && (aVarM3663f = StaggeredGridLayoutManager.this.f2861h.m3663f(c0450bM3681c.m4300f())) != null && aVarM3663f.f2883b == -1) {
                this.f2897b -= aVarM3663f.m3664a(this.f2900e);
            }
        }

        /* JADX INFO: renamed from: a */
        void m3676a(View view) {
            C0450b c0450bM3681c = m3681c(view);
            c0450bM3681c.f2878a = this;
            this.f2896a.add(0, view);
            this.f2897b = Integer.MIN_VALUE;
            if (this.f2896a.size() == 1) {
                this.f2898c = Integer.MIN_VALUE;
            }
            if (c0450bM3681c.m4298d() || c0450bM3681c.m4299e()) {
                this.f2899d += StaggeredGridLayoutManager.this.f2855b.mo4011e(view);
            }
        }

        /* JADX INFO: renamed from: a */
        void m3677a(boolean z, int i) {
            int iM3679b = z ? m3679b(Integer.MIN_VALUE) : m3671a(Integer.MIN_VALUE);
            m3686e();
            if (iM3679b == Integer.MIN_VALUE) {
                return;
            }
            if (!z || iM3679b >= StaggeredGridLayoutManager.this.f2855b.mo4008d()) {
                if (z || iM3679b <= StaggeredGridLayoutManager.this.f2855b.mo4006c()) {
                    if (i != Integer.MIN_VALUE) {
                        iM3679b += i;
                    }
                    this.f2898c = iM3679b;
                    this.f2897b = iM3679b;
                }
            }
        }

        /* JADX INFO: renamed from: b */
        int m3678b() {
            if (this.f2897b != Integer.MIN_VALUE) {
                return this.f2897b;
            }
            m3675a();
            return this.f2897b;
        }

        /* JADX INFO: renamed from: b */
        int m3679b(int i) {
            if (this.f2898c != Integer.MIN_VALUE) {
                return this.f2898c;
            }
            if (this.f2896a.size() == 0) {
                return i;
            }
            m3682c();
            return this.f2898c;
        }

        /* JADX INFO: renamed from: b */
        void m3680b(View view) {
            C0450b c0450bM3681c = m3681c(view);
            c0450bM3681c.f2878a = this;
            this.f2896a.add(view);
            this.f2898c = Integer.MIN_VALUE;
            if (this.f2896a.size() == 1) {
                this.f2897b = Integer.MIN_VALUE;
            }
            if (c0450bM3681c.m4298d() || c0450bM3681c.m4299e()) {
                this.f2899d += StaggeredGridLayoutManager.this.f2855b.mo4011e(view);
            }
        }

        /* JADX INFO: renamed from: c */
        C0450b m3681c(View view) {
            return (C0450b) view.getLayoutParams();
        }

        /* JADX INFO: renamed from: c */
        void m3682c() {
            C0451c.a aVarM3663f;
            View view = this.f2896a.get(this.f2896a.size() - 1);
            C0450b c0450bM3681c = m3681c(view);
            this.f2898c = StaggeredGridLayoutManager.this.f2855b.mo4005b(view);
            if (c0450bM3681c.f2879b && (aVarM3663f = StaggeredGridLayoutManager.this.f2861h.m3663f(c0450bM3681c.m4300f())) != null && aVarM3663f.f2883b == 1) {
                this.f2898c = aVarM3663f.m3664a(this.f2900e) + this.f2898c;
            }
        }

        /* JADX INFO: renamed from: c */
        void m3683c(int i) {
            this.f2897b = i;
            this.f2898c = i;
        }

        /* JADX INFO: renamed from: d */
        int m3684d() {
            if (this.f2898c != Integer.MIN_VALUE) {
                return this.f2898c;
            }
            m3682c();
            return this.f2898c;
        }

        /* JADX INFO: renamed from: d */
        void m3685d(int i) {
            if (this.f2897b != Integer.MIN_VALUE) {
                this.f2897b += i;
            }
            if (this.f2898c != Integer.MIN_VALUE) {
                this.f2898c += i;
            }
        }

        /* JADX INFO: renamed from: e */
        void m3686e() {
            this.f2896a.clear();
            m3687f();
            this.f2899d = 0;
        }

        /* JADX INFO: renamed from: f */
        void m3687f() {
            this.f2897b = Integer.MIN_VALUE;
            this.f2898c = Integer.MIN_VALUE;
        }

        /* JADX INFO: renamed from: g */
        void m3688g() {
            int size = this.f2896a.size();
            View viewRemove = this.f2896a.remove(size - 1);
            C0450b c0450bM3681c = m3681c(viewRemove);
            c0450bM3681c.f2878a = null;
            if (c0450bM3681c.m4298d() || c0450bM3681c.m4299e()) {
                this.f2899d -= StaggeredGridLayoutManager.this.f2855b.mo4011e(viewRemove);
            }
            if (size == 1) {
                this.f2897b = Integer.MIN_VALUE;
            }
            this.f2898c = Integer.MIN_VALUE;
        }

        /* JADX INFO: renamed from: h */
        void m3689h() {
            View viewRemove = this.f2896a.remove(0);
            C0450b c0450bM3681c = m3681c(viewRemove);
            c0450bM3681c.f2878a = null;
            if (this.f2896a.size() == 0) {
                this.f2898c = Integer.MIN_VALUE;
            }
            if (c0450bM3681c.m4298d() || c0450bM3681c.m4299e()) {
                this.f2899d -= StaggeredGridLayoutManager.this.f2855b.mo4011e(viewRemove);
            }
            this.f2897b = Integer.MIN_VALUE;
        }

        /* JADX INFO: renamed from: i */
        public int m3690i() {
            return this.f2899d;
        }

        /* JADX INFO: renamed from: j */
        public int m3691j() {
            return StaggeredGridLayoutManager.this.f2857d ? m3672a(this.f2896a.size() - 1, -1, true) : m3672a(0, this.f2896a.size(), true);
        }

        /* JADX INFO: renamed from: k */
        public int m3692k() {
            return StaggeredGridLayoutManager.this.f2857d ? m3672a(0, this.f2896a.size(), true) : m3672a(this.f2896a.size() - 1, -1, true);
        }
    }

    public StaggeredGridLayoutManager(int i, int i2) {
        this.f2863j = i2;
        m3623a(i);
        m4254c(this.f2867n != 0);
        this.f2865l = new C0476an();
        m3582L();
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        C0484av.h.b bVarA = m4195a(context, attributeSet, i, i2);
        m3628b(bVarA.f3317a);
        m3623a(bVarA.f3318b);
        m3626a(bVarA.f3319c);
        m4254c(this.f2867n != 0);
        this.f2865l = new C0476an();
        m3582L();
    }

    /* JADX INFO: renamed from: L */
    private void m3582L() {
        this.f2855b = AbstractC0483au.m3999a(this, this.f2863j);
        this.f2856c = AbstractC0483au.m3999a(this, 1 - this.f2863j);
    }

    /* JADX INFO: renamed from: M */
    private void m3583M() {
        if (this.f2863j == 1 || !m3637i()) {
            this.f2858e = this.f2857d;
        } else {
            this.f2858e = this.f2857d ? false : true;
        }
    }

    /* JADX INFO: renamed from: N */
    private void m3584N() {
        if (this.f2856c.mo4015h() == 1073741824) {
            return;
        }
        float fMax = 0.0f;
        int iU = m4286u();
        int i = 0;
        while (i < iU) {
            View viewH = m4271h(i);
            float fMo4011e = this.f2856c.mo4011e(viewH);
            i++;
            fMax = fMo4011e < fMax ? fMax : Math.max(fMax, ((C0450b) viewH.getLayoutParams()).m3647a() ? (1.0f * fMo4011e) / this.f2862i : fMo4011e);
        }
        int i2 = this.f2864k;
        int iRound = Math.round(this.f2862i * fMax);
        if (this.f2856c.mo4015h() == Integer.MIN_VALUE) {
            iRound = Math.min(iRound, this.f2856c.mo4012f());
        }
        m3632e(iRound);
        if (this.f2864k != i2) {
            for (int i3 = 0; i3 < iU; i3++) {
                View viewH2 = m4271h(i3);
                C0450b c0450b = (C0450b) viewH2.getLayoutParams();
                if (!c0450b.f2879b) {
                    if (m3637i() && this.f2863j == 1) {
                        viewH2.offsetLeftAndRight(((-((this.f2862i - 1) - c0450b.f2878a.f2900e)) * this.f2864k) - ((-((this.f2862i - 1) - c0450b.f2878a.f2900e)) * i2));
                    } else {
                        int i4 = c0450b.f2878a.f2900e * this.f2864k;
                        int i5 = c0450b.f2878a.f2900e * i2;
                        if (this.f2863j == 1) {
                            viewH2.offsetLeftAndRight(i4 - i5);
                        } else {
                            viewH2.offsetTopAndBottom(i4 - i5);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private int m3585a(C0484av.o oVar, C0476an c0476an, C0484av.t tVar) {
        C0453e c0453e;
        int iMo4011e;
        int iMo4011e2;
        int iMo4011e3;
        int iMo4011e4;
        this.f2866m.set(0, this.f2862i, true);
        int i = this.f2865l.f3117i ? c0476an.f3113e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : c0476an.f3113e == 1 ? c0476an.f3115g + c0476an.f3110b : c0476an.f3114f - c0476an.f3110b;
        m3587a(c0476an.f3113e, i);
        int iMo4008d = this.f2858e ? this.f2855b.mo4008d() : this.f2855b.mo4006c();
        boolean z = false;
        while (c0476an.m3929a(tVar) && (this.f2865l.f3117i || !this.f2866m.isEmpty())) {
            View viewM3928a = c0476an.m3928a(oVar);
            C0450b c0450b = (C0450b) viewM3928a.getLayoutParams();
            int iF = c0450b.m4300f();
            int iM3660c = this.f2861h.m3660c(iF);
            boolean z2 = iM3660c == -1;
            if (z2) {
                C0453e c0453eM3586a = c0450b.f2879b ? this.f2854a[0] : m3586a(c0476an);
                this.f2861h.m3656a(iF, c0453eM3586a);
                c0453e = c0453eM3586a;
            } else {
                c0453e = this.f2854a[iM3660c];
            }
            c0450b.f2878a = c0453e;
            if (c0476an.f3113e == 1) {
                m4244b(viewM3928a);
            } else {
                m4245b(viewM3928a, 0);
            }
            m3595a(viewM3928a, c0450b, false);
            if (c0476an.f3113e == 1) {
                int iM3613q = c0450b.f2879b ? m3613q(iMo4008d) : c0453e.m3679b(iMo4008d);
                iMo4011e2 = iM3613q + this.f2855b.mo4011e(viewM3928a);
                if (z2 && c0450b.f2879b) {
                    C0451c.a aVarM3608m = m3608m(iM3613q);
                    aVarM3608m.f2883b = -1;
                    aVarM3608m.f2882a = iF;
                    this.f2861h.m3657a(aVarM3608m);
                    iMo4011e = iM3613q;
                } else {
                    iMo4011e = iM3613q;
                }
            } else {
                int iM3611p = c0450b.f2879b ? m3611p(iMo4008d) : c0453e.m3671a(iMo4008d);
                iMo4011e = iM3611p - this.f2855b.mo4011e(viewM3928a);
                if (z2 && c0450b.f2879b) {
                    C0451c.a aVarM3609n = m3609n(iM3611p);
                    aVarM3609n.f2883b = 1;
                    aVarM3609n.f2882a = iF;
                    this.f2861h.m3657a(aVarM3609n);
                }
                iMo4011e2 = iM3611p;
            }
            if (c0450b.f2879b && c0476an.f3112d == -1) {
                if (z2) {
                    this.f2850E = true;
                } else {
                    if (c0476an.f3113e == 1 ? !m3641l() : !m3642m()) {
                        C0451c.a aVarM3663f = this.f2861h.m3663f(iF);
                        if (aVarM3663f != null) {
                            aVarM3663f.f2885d = true;
                        }
                        this.f2850E = true;
                    }
                }
            }
            m3594a(viewM3928a, c0450b, c0476an);
            if (m3637i() && this.f2863j == 1) {
                int iMo4008d2 = c0450b.f2879b ? this.f2856c.mo4008d() : this.f2856c.mo4008d() - (((this.f2862i - 1) - c0453e.f2900e) * this.f2864k);
                iMo4011e4 = iMo4008d2 - this.f2856c.mo4011e(viewM3928a);
                iMo4011e3 = iMo4008d2;
            } else {
                int iMo4006c = c0450b.f2879b ? this.f2856c.mo4006c() : (c0453e.f2900e * this.f2864k) + this.f2856c.mo4006c();
                iMo4011e3 = iMo4006c + this.f2856c.mo4011e(viewM3928a);
                iMo4011e4 = iMo4006c;
            }
            if (this.f2863j == 1) {
                m4223a(viewM3928a, iMo4011e4, iMo4011e, iMo4011e3, iMo4011e2);
            } else {
                m4223a(viewM3928a, iMo4011e, iMo4011e4, iMo4011e2, iMo4011e3);
            }
            if (c0450b.f2879b) {
                m3587a(this.f2865l.f3113e, i);
            } else {
                m3589a(c0453e, this.f2865l.f3113e, i);
            }
            m3591a(oVar, this.f2865l);
            if (this.f2865l.f3116h && viewM3928a.hasFocusable()) {
                if (c0450b.f2879b) {
                    this.f2866m.clear();
                } else {
                    this.f2866m.set(c0453e.f2900e, false);
                }
            }
            z = true;
        }
        if (!z) {
            m3591a(oVar, this.f2865l);
        }
        int iMo4006c2 = this.f2865l.f3113e == -1 ? this.f2855b.mo4006c() - m3611p(this.f2855b.mo4006c()) : m3613q(this.f2855b.mo4008d()) - this.f2855b.mo4008d();
        if (iMo4006c2 > 0) {
            return Math.min(c0476an.f3110b, iMo4006c2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: a */
    private C0453e m3586a(C0476an c0476an) {
        int i;
        int i2;
        C0453e c0453e;
        C0453e c0453e2;
        C0453e c0453e3 = null;
        int i3 = -1;
        if (m3616s(c0476an.f3113e)) {
            i = this.f2862i - 1;
            i2 = -1;
        } else {
            i = 0;
            i2 = this.f2862i;
            i3 = 1;
        }
        if (c0476an.f3113e == 1) {
            int iMo4006c = this.f2855b.mo4006c();
            int i4 = i;
            int i5 = Integer.MAX_VALUE;
            while (i4 != i2) {
                C0453e c0453e4 = this.f2854a[i4];
                int iM3679b = c0453e4.m3679b(iMo4006c);
                if (iM3679b < i5) {
                    c0453e2 = c0453e4;
                } else {
                    iM3679b = i5;
                    c0453e2 = c0453e3;
                }
                i4 += i3;
                c0453e3 = c0453e2;
                i5 = iM3679b;
            }
        } else {
            int iMo4008d = this.f2855b.mo4008d();
            int i6 = i;
            int i7 = Integer.MIN_VALUE;
            while (i6 != i2) {
                C0453e c0453e5 = this.f2854a[i6];
                int iM3671a = c0453e5.m3671a(iMo4008d);
                if (iM3671a > i7) {
                    c0453e = c0453e5;
                } else {
                    iM3671a = i7;
                    c0453e = c0453e3;
                }
                i6 += i3;
                c0453e3 = c0453e;
                i7 = iM3671a;
            }
        }
        return c0453e3;
    }

    /* JADX INFO: renamed from: a */
    private void m3587a(int i, int i2) {
        for (int i3 = 0; i3 < this.f2862i; i3++) {
            if (!this.f2854a[i3].f2896a.isEmpty()) {
                m3589a(this.f2854a[i3], i, i2);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m3588a(C0449a c0449a) {
        if (this.f2846A.f2888c > 0) {
            if (this.f2846A.f2888c == this.f2862i) {
                for (int i = 0; i < this.f2862i; i++) {
                    this.f2854a[i].m3686e();
                    int iMo4008d = this.f2846A.f2889d[i];
                    if (iMo4008d != Integer.MIN_VALUE) {
                        iMo4008d = this.f2846A.f2894i ? iMo4008d + this.f2855b.mo4008d() : iMo4008d + this.f2855b.mo4006c();
                    }
                    this.f2854a[i].m3683c(iMo4008d);
                }
            } else {
                this.f2846A.m3667a();
                this.f2846A.f2886a = this.f2846A.f2887b;
            }
        }
        this.f2869z = this.f2846A.f2895j;
        m3626a(this.f2846A.f2893h);
        m3583M();
        if (this.f2846A.f2886a != -1) {
            this.f2859f = this.f2846A.f2886a;
            c0449a.f2873c = this.f2846A.f2894i;
        } else {
            c0449a.f2873c = this.f2858e;
        }
        if (this.f2846A.f2890e > 1) {
            this.f2861h.f2880a = this.f2846A.f2891f;
            this.f2861h.f2881b = this.f2846A.f2892g;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m3589a(C0453e c0453e, int i, int i2) {
        int iM3690i = c0453e.m3690i();
        if (i == -1) {
            if (iM3690i + c0453e.m3678b() <= i2) {
                this.f2866m.set(c0453e.f2900e, false);
            }
        } else if (c0453e.m3684d() - iM3690i >= i2) {
            this.f2866m.set(c0453e.f2900e, false);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m3590a(C0484av.o oVar, int i) {
        while (m4286u() > 0) {
            View viewH = m4271h(0);
            if (this.f2855b.mo4005b(viewH) > i || this.f2855b.mo4007c(viewH) > i) {
                return;
            }
            C0450b c0450b = (C0450b) viewH.getLayoutParams();
            if (c0450b.f2879b) {
                for (int i2 = 0; i2 < this.f2862i; i2++) {
                    if (this.f2854a[i2].f2896a.size() == 1) {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.f2862i; i3++) {
                    this.f2854a[i3].m3689h();
                }
            } else if (c0450b.f2878a.f2896a.size() == 1) {
                return;
            } else {
                c0450b.f2878a.m3689h();
            }
            m4227a(viewH, oVar);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m3591a(C0484av.o oVar, C0476an c0476an) {
        if (!c0476an.f3109a || c0476an.f3117i) {
            return;
        }
        if (c0476an.f3110b == 0) {
            if (c0476an.f3113e == -1) {
                m3600b(oVar, c0476an.f3115g);
                return;
            } else {
                m3590a(oVar, c0476an.f3114f);
                return;
            }
        }
        if (c0476an.f3113e == -1) {
            int iM3610o = c0476an.f3114f - m3610o(c0476an.f3114f);
            m3600b(oVar, iM3610o < 0 ? c0476an.f3115g : c0476an.f3115g - Math.min(iM3610o, c0476an.f3110b));
        } else {
            int iM3615r = m3615r(c0476an.f3115g) - c0476an.f3115g;
            m3590a(oVar, iM3615r < 0 ? c0476an.f3114f : Math.min(iM3615r, c0476an.f3110b) + c0476an.f3114f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x0187  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m3592a(C0484av.o oVar, C0484av.t tVar, boolean z) {
        boolean z2;
        C0449a c0449a = this.f2849D;
        if (!(this.f2846A == null && this.f2859f == -1) && tVar.m4383e() == 0) {
            m4249c(oVar);
            c0449a.m3643a();
            return;
        }
        boolean z3 = (c0449a.f2875e && this.f2859f == -1 && this.f2846A == null) ? false : true;
        if (z3) {
            c0449a.m3643a();
            if (this.f2846A != null) {
                m3588a(c0449a);
            } else {
                m3583M();
                c0449a.f2873c = this.f2858e;
            }
            m3625a(tVar, c0449a);
            c0449a.f2875e = true;
        }
        if (this.f2846A == null && this.f2859f == -1 && (c0449a.f2873c != this.f2868o || m3637i() != this.f2869z)) {
            this.f2861h.m3654a();
            c0449a.f2874d = true;
        }
        if (m4286u() > 0 && (this.f2846A == null || this.f2846A.f2888c < 1)) {
            if (c0449a.f2874d) {
                for (int i = 0; i < this.f2862i; i++) {
                    this.f2854a[i].m3686e();
                    if (c0449a.f2872b != Integer.MIN_VALUE) {
                        this.f2854a[i].m3683c(c0449a.f2872b);
                    }
                }
            } else if (z3 || this.f2849D.f2876f == null) {
                for (int i2 = 0; i2 < this.f2862i; i2++) {
                    this.f2854a[i2].m3677a(this.f2858e, c0449a.f2872b);
                }
                this.f2849D.m3645a(this.f2854a);
            } else {
                for (int i3 = 0; i3 < this.f2862i; i3++) {
                    C0453e c0453e = this.f2854a[i3];
                    c0453e.m3686e();
                    c0453e.m3683c(this.f2849D.f2876f[i3]);
                }
            }
        }
        m4216a(oVar);
        this.f2865l.f3109a = false;
        this.f2850E = false;
        m3632e(this.f2856c.mo4012f());
        m3599b(c0449a.f2871a, tVar);
        if (c0449a.f2873c) {
            m3607l(-1);
            m3585a(oVar, this.f2865l, tVar);
            m3607l(1);
            this.f2865l.f3111c = c0449a.f2871a + this.f2865l.f3112d;
            m3585a(oVar, this.f2865l, tVar);
        } else {
            m3607l(1);
            m3585a(oVar, this.f2865l, tVar);
            m3607l(-1);
            this.f2865l.f3111c = c0449a.f2871a + this.f2865l.f3112d;
            m3585a(oVar, this.f2865l, tVar);
        }
        m3584N();
        if (m4286u() > 0) {
            if (this.f2858e) {
                m3601b(oVar, tVar, true);
                m3603c(oVar, tVar, false);
            } else {
                m3603c(oVar, tVar, true);
                m3601b(oVar, tVar, false);
            }
        }
        if (!z || tVar.m4379a()) {
            z2 = false;
        } else if (this.f2867n != 0 && m4286u() > 0 && (this.f2850E || m3634g() != null)) {
            m4240a(this.f2853H);
            if (m3633f()) {
                z2 = true;
            }
        }
        if (tVar.m4379a()) {
            this.f2849D.m3643a();
        }
        this.f2868o = c0449a.f2873c;
        this.f2869z = m3637i();
        if (z2) {
            this.f2849D.m3643a();
            m3592a(oVar, tVar, false);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m3593a(View view, int i, int i2, boolean z) {
        m4246b(view, this.f2848C);
        C0450b c0450b = (C0450b) view.getLayoutParams();
        int iM3597b = m3597b(i, c0450b.leftMargin + this.f2848C.left, c0450b.rightMargin + this.f2848C.right);
        int iM3597b2 = m3597b(i2, c0450b.topMargin + this.f2848C.top, c0450b.bottomMargin + this.f2848C.bottom);
        if (z ? m4237a(view, iM3597b, iM3597b2, c0450b) : m4247b(view, iM3597b, iM3597b2, c0450b)) {
            view.measure(iM3597b, iM3597b2);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m3594a(View view, C0450b c0450b, C0476an c0476an) {
        if (c0476an.f3113e == 1) {
            if (c0450b.f2879b) {
                m3612p(view);
                return;
            } else {
                c0450b.f2878a.m3680b(view);
                return;
            }
        }
        if (c0450b.f2879b) {
            m3614q(view);
        } else {
            c0450b.f2878a.m3676a(view);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m3595a(View view, C0450b c0450b, boolean z) {
        if (c0450b.f2879b) {
            if (this.f2863j == 1) {
                m3593a(view, this.f2847B, m4194a(m4290y(), m4288w(), 0, c0450b.height, true), z);
                return;
            } else {
                m3593a(view, m4194a(m4289x(), m4287v(), 0, c0450b.width, true), this.f2847B, z);
                return;
            }
        }
        if (this.f2863j == 1) {
            m3593a(view, m4194a(this.f2864k, m4287v(), 0, c0450b.width, false), m4194a(m4290y(), m4288w(), 0, c0450b.height, true), z);
        } else {
            m3593a(view, m4194a(m4289x(), m4287v(), 0, c0450b.width, true), m4194a(this.f2864k, m4288w(), 0, c0450b.height, false), z);
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m3596a(C0453e c0453e) {
        if (this.f2858e) {
            if (c0453e.m3684d() < this.f2855b.mo4008d()) {
                return !c0453e.m3681c(c0453e.f2896a.get(c0453e.f2896a.size() + (-1))).f2879b;
            }
        } else if (c0453e.m3678b() > this.f2855b.mo4006c()) {
            return c0453e.m3681c(c0453e.f2896a.get(0)).f2879b ? false : true;
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    private int m3597b(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    /* JADX INFO: renamed from: b */
    private int m3598b(C0484av.t tVar) {
        if (m4286u() == 0) {
            return 0;
        }
        return C0488az.m4453a(tVar, this.f2855b, m3627b(!this.f2851F), m3631d(this.f2851F ? false : true), this, this.f2851F, this.f2858e);
    }

    /* JADX INFO: renamed from: b */
    private void m3599b(int i, C0484av.t tVar) {
        int iMo4012f;
        int iMo4012f2;
        int iM4381c;
        boolean z = false;
        this.f2865l.f3110b = 0;
        this.f2865l.f3111c = i;
        if (!m4283r() || (iM4381c = tVar.m4381c()) == -1) {
            iMo4012f = 0;
            iMo4012f2 = 0;
        } else {
            if (this.f2858e == (iM4381c < i)) {
                iMo4012f = this.f2855b.mo4012f();
                iMo4012f2 = 0;
            } else {
                iMo4012f2 = this.f2855b.mo4012f();
                iMo4012f = 0;
            }
        }
        if (m4282q()) {
            this.f2865l.f3114f = this.f2855b.mo4006c() - iMo4012f2;
            this.f2865l.f3115g = iMo4012f + this.f2855b.mo4008d();
        } else {
            this.f2865l.f3115g = iMo4012f + this.f2855b.mo4010e();
            this.f2865l.f3114f = -iMo4012f2;
        }
        this.f2865l.f3116h = false;
        this.f2865l.f3109a = true;
        C0476an c0476an = this.f2865l;
        if (this.f2855b.mo4015h() == 0 && this.f2855b.mo4010e() == 0) {
            z = true;
        }
        c0476an.f3117i = z;
    }

    /* JADX INFO: renamed from: b */
    private void m3600b(C0484av.o oVar, int i) {
        for (int iU = m4286u() - 1; iU >= 0; iU--) {
            View viewH = m4271h(iU);
            if (this.f2855b.mo4001a(viewH) < i || this.f2855b.mo4009d(viewH) < i) {
                return;
            }
            C0450b c0450b = (C0450b) viewH.getLayoutParams();
            if (c0450b.f2879b) {
                for (int i2 = 0; i2 < this.f2862i; i2++) {
                    if (this.f2854a[i2].f2896a.size() == 1) {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.f2862i; i3++) {
                    this.f2854a[i3].m3688g();
                }
            } else if (c0450b.f2878a.f2896a.size() == 1) {
                return;
            } else {
                c0450b.f2878a.m3688g();
            }
            m4227a(viewH, oVar);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m3601b(C0484av.o oVar, C0484av.t tVar, boolean z) {
        int iMo4008d;
        int iM3613q = m3613q(Integer.MIN_VALUE);
        if (iM3613q != Integer.MIN_VALUE && (iMo4008d = this.f2855b.mo4008d() - iM3613q) > 0) {
            int i = iMo4008d - (-m3630c(-iMo4008d, oVar, tVar));
            if (!z || i <= 0) {
                return;
            }
            this.f2855b.mo4003a(i);
        }
    }

    /* JADX INFO: renamed from: c */
    private void m3602c(int i, int i2, int i3) {
        int i4;
        int i5;
        int iM3621J = this.f2858e ? m3621J() : m3622K();
        if (i3 != 8) {
            i4 = i + i2;
            i5 = i;
        } else if (i < i2) {
            i4 = i2 + 1;
            i5 = i;
        } else {
            i4 = i + 1;
            i5 = i2;
        }
        this.f2861h.m3658b(i5);
        switch (i3) {
            case 1:
                this.f2861h.m3659b(i, i2);
                break;
            case 2:
                this.f2861h.m3655a(i, i2);
                break;
            case 8:
                this.f2861h.m3655a(i, 1);
                this.f2861h.m3659b(i2, 1);
                break;
        }
        if (i4 <= iM3621J) {
            return;
        }
        if (i5 <= (this.f2858e ? m3622K() : m3621J())) {
            m4278n();
        }
    }

    /* JADX INFO: renamed from: c */
    private void m3603c(C0484av.o oVar, C0484av.t tVar, boolean z) {
        int iMo4006c;
        int iM3611p = m3611p(Integer.MAX_VALUE);
        if (iM3611p != Integer.MAX_VALUE && (iMo4006c = iM3611p - this.f2855b.mo4006c()) > 0) {
            int iM3630c = iMo4006c - m3630c(iMo4006c, oVar, tVar);
            if (!z || iM3630c <= 0) {
                return;
            }
            this.f2855b.mo4003a(-iM3630c);
        }
    }

    /* JADX INFO: renamed from: c */
    private boolean m3604c(C0484av.t tVar, C0449a c0449a) {
        c0449a.f2871a = this.f2868o ? m3619v(tVar.m4383e()) : m3618u(tVar.m4383e());
        c0449a.f2872b = Integer.MIN_VALUE;
        return true;
    }

    /* JADX INFO: renamed from: i */
    private int m3605i(C0484av.t tVar) {
        if (m4286u() == 0) {
            return 0;
        }
        return C0488az.m4452a(tVar, this.f2855b, m3627b(!this.f2851F), m3631d(this.f2851F ? false : true), this, this.f2851F);
    }

    /* JADX INFO: renamed from: j */
    private int m3606j(C0484av.t tVar) {
        if (m4286u() == 0) {
            return 0;
        }
        return C0488az.m4454b(tVar, this.f2855b, m3627b(!this.f2851F), m3631d(this.f2851F ? false : true), this, this.f2851F);
    }

    /* JADX INFO: renamed from: l */
    private void m3607l(int i) {
        this.f2865l.f3113e = i;
        this.f2865l.f3112d = this.f2858e != (i == -1) ? -1 : 1;
    }

    /* JADX INFO: renamed from: m */
    private C0451c.a m3608m(int i) {
        C0451c.a aVar = new C0451c.a();
        aVar.f2884c = new int[this.f2862i];
        for (int i2 = 0; i2 < this.f2862i; i2++) {
            aVar.f2884c[i2] = i - this.f2854a[i2].m3679b(i);
        }
        return aVar;
    }

    /* JADX INFO: renamed from: n */
    private C0451c.a m3609n(int i) {
        C0451c.a aVar = new C0451c.a();
        aVar.f2884c = new int[this.f2862i];
        for (int i2 = 0; i2 < this.f2862i; i2++) {
            aVar.f2884c[i2] = this.f2854a[i2].m3671a(i) - i;
        }
        return aVar;
    }

    /* JADX INFO: renamed from: o */
    private int m3610o(int i) {
        int iM3671a = this.f2854a[0].m3671a(i);
        for (int i2 = 1; i2 < this.f2862i; i2++) {
            int iM3671a2 = this.f2854a[i2].m3671a(i);
            if (iM3671a2 > iM3671a) {
                iM3671a = iM3671a2;
            }
        }
        return iM3671a;
    }

    /* JADX INFO: renamed from: p */
    private int m3611p(int i) {
        int iM3671a = this.f2854a[0].m3671a(i);
        for (int i2 = 1; i2 < this.f2862i; i2++) {
            int iM3671a2 = this.f2854a[i2].m3671a(i);
            if (iM3671a2 < iM3671a) {
                iM3671a = iM3671a2;
            }
        }
        return iM3671a;
    }

    /* JADX INFO: renamed from: p */
    private void m3612p(View view) {
        for (int i = this.f2862i - 1; i >= 0; i--) {
            this.f2854a[i].m3680b(view);
        }
    }

    /* JADX INFO: renamed from: q */
    private int m3613q(int i) {
        int iM3679b = this.f2854a[0].m3679b(i);
        for (int i2 = 1; i2 < this.f2862i; i2++) {
            int iM3679b2 = this.f2854a[i2].m3679b(i);
            if (iM3679b2 > iM3679b) {
                iM3679b = iM3679b2;
            }
        }
        return iM3679b;
    }

    /* JADX INFO: renamed from: q */
    private void m3614q(View view) {
        for (int i = this.f2862i - 1; i >= 0; i--) {
            this.f2854a[i].m3676a(view);
        }
    }

    /* JADX INFO: renamed from: r */
    private int m3615r(int i) {
        int iM3679b = this.f2854a[0].m3679b(i);
        for (int i2 = 1; i2 < this.f2862i; i2++) {
            int iM3679b2 = this.f2854a[i2].m3679b(i);
            if (iM3679b2 < iM3679b) {
                iM3679b = iM3679b2;
            }
        }
        return iM3679b;
    }

    /* JADX INFO: renamed from: s */
    private boolean m3616s(int i) {
        if (this.f2863j == 0) {
            return (i == -1) != this.f2858e;
        }
        return ((i == -1) == this.f2858e) == m3637i();
    }

    /* JADX INFO: renamed from: t */
    private int m3617t(int i) {
        if (m4286u() == 0) {
            return this.f2858e ? 1 : -1;
        }
        return (i < m3622K()) == this.f2858e ? 1 : -1;
    }

    /* JADX INFO: renamed from: u */
    private int m3618u(int i) {
        int iU = m4286u();
        for (int i2 = 0; i2 < iU; i2++) {
            int iD = m4256d(m4271h(i2));
            if (iD >= 0 && iD < i) {
                return iD;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: v */
    private int m3619v(int i) {
        for (int iU = m4286u() - 1; iU >= 0; iU--) {
            int iD = m4256d(m4271h(iU));
            if (iD >= 0 && iD < i) {
                return iD;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: w */
    private int m3620w(int i) {
        switch (i) {
            case 1:
                return (this.f2863j == 1 || !m3637i()) ? -1 : 1;
            case 2:
                return (this.f2863j != 1 && m3637i()) ? -1 : 1;
            case 17:
                return this.f2863j != 0 ? Integer.MIN_VALUE : -1;
            case 33:
                return this.f2863j != 1 ? Integer.MIN_VALUE : -1;
            case 66:
                return this.f2863j != 0 ? Integer.MIN_VALUE : 1;
            case 130:
                return this.f2863j == 1 ? 1 : Integer.MIN_VALUE;
            default:
                return Integer.MIN_VALUE;
        }
    }

    /* JADX INFO: renamed from: J */
    int m3621J() {
        int iU = m4286u();
        if (iU == 0) {
            return 0;
        }
        return m4256d(m4271h(iU - 1));
    }

    /* JADX INFO: renamed from: K */
    int m3622K() {
        if (m4286u() == 0) {
            return 0;
        }
        return m4256d(m4271h(0));
    }

    @Override // android.support.v7.widget.C0484av.h
    /* JADX INFO: renamed from: a */
    public int mo3433a(int i, C0484av.o oVar, C0484av.t tVar) {
        return m3630c(i, oVar, tVar);
    }

    @Override // android.support.v7.widget.C0484av.h
    /* JADX INFO: renamed from: a */
    public int mo3434a(C0484av.o oVar, C0484av.t tVar) {
        return this.f2863j == 0 ? this.f2862i : super.mo3434a(oVar, tVar);
    }

    @Override // android.support.v7.widget.C0484av.h
    /* JADX INFO: renamed from: a */
    public C0484av.i mo3435a() {
        return this.f2863j == 0 ? new C0450b(-2, -1) : new C0450b(-1, -2);
    }

    @Override // android.support.v7.widget.C0484av.h
    /* JADX INFO: renamed from: a */
    public C0484av.i mo3436a(Context context, AttributeSet attributeSet) {
        return new C0450b(context, attributeSet);
    }

    @Override // android.support.v7.widget.C0484av.h
    /* JADX INFO: renamed from: a */
    public C0484av.i mo3437a(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0450b((ViewGroup.MarginLayoutParams) layoutParams) : new C0450b(layoutParams);
    }

    @Override // android.support.v7.widget.C0484av.h
    /* JADX INFO: renamed from: a */
    public View mo3439a(View view, int i, C0484av.o oVar, C0484av.t tVar) {
        View viewE;
        View viewM3674a;
        if (m4286u() != 0 && (viewE = m4260e(view)) != null) {
            m3583M();
            int iM3620w = m3620w(i);
            if (iM3620w == Integer.MIN_VALUE) {
                return null;
            }
            C0450b c0450b = (C0450b) viewE.getLayoutParams();
            boolean z = c0450b.f2879b;
            C0453e c0453e = c0450b.f2878a;
            int iM3621J = iM3620w == 1 ? m3621J() : m3622K();
            m3599b(iM3621J, tVar);
            m3607l(iM3620w);
            this.f2865l.f3111c = this.f2865l.f3112d + iM3621J;
            this.f2865l.f3110b = (int) (0.33333334f * this.f2855b.mo4012f());
            this.f2865l.f3116h = true;
            this.f2865l.f3109a = false;
            m3585a(oVar, this.f2865l, tVar);
            this.f2868o = this.f2858e;
            if (!z && (viewM3674a = c0453e.m3674a(iM3621J, iM3620w)) != null && viewM3674a != viewE) {
                return viewM3674a;
            }
            if (m3616s(iM3620w)) {
                for (int i2 = this.f2862i - 1; i2 >= 0; i2--) {
                    View viewM3674a2 = this.f2854a[i2].m3674a(iM3621J, iM3620w);
                    if (viewM3674a2 != null && viewM3674a2 != viewE) {
                        return viewM3674a2;
                    }
                }
            } else {
                for (int i3 = 0; i3 < this.f2862i; i3++) {
                    View viewM3674a3 = this.f2854a[i3].m3674a(iM3621J, iM3620w);
                    if (viewM3674a3 != null && viewM3674a3 != viewE) {
                        return viewM3674a3;
                    }
                }
            }
            boolean z2 = (!this.f2857d) == (iM3620w == -1);
            if (!z) {
                View viewC = mo3512c(z2 ? c0453e.m3691j() : c0453e.m3692k());
                if (viewC != null && viewC != viewE) {
                    return viewC;
                }
            }
            if (m3616s(iM3620w)) {
                for (int i4 = this.f2862i - 1; i4 >= 0; i4--) {
                    if (i4 != c0453e.f2900e) {
                        View viewC2 = mo3512c(z2 ? this.f2854a[i4].m3691j() : this.f2854a[i4].m3692k());
                        if (viewC2 != null && viewC2 != viewE) {
                            return viewC2;
                        }
                    }
                }
            } else {
                for (int i5 = 0; i5 < this.f2862i; i5++) {
                    View viewC3 = mo3512c(z2 ? this.f2854a[i5].m3691j() : this.f2854a[i5].m3692k());
                    if (viewC3 != null && viewC3 != viewE) {
                        return viewC3;
                    }
                }
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public void m3623a(int i) {
        mo3504a((String) null);
        if (i != this.f2862i) {
            m3635h();
            this.f2862i = i;
            this.f2866m = new BitSet(this.f2862i);
            this.f2854a = new C0453e[this.f2862i];
            for (int i2 = 0; i2 < this.f2862i; i2++) {
                this.f2854a[i2] = new C0453e(i2);
            }
            m4278n();
        }
    }

    @Override // android.support.v7.widget.C0484av.h
    /* JADX INFO: renamed from: a */
    public void mo3499a(int i, int i2, C0484av.t tVar, C0484av.h.a aVar) {
        if (this.f2863j != 0) {
            i = i2;
        }
        if (m4286u() == 0 || i == 0) {
            return;
        }
        m3624a(i, tVar);
        if (this.f2852G == null || this.f2852G.length < this.f2862i) {
            this.f2852G = new int[this.f2862i];
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f2862i; i4++) {
            int iM3671a = this.f2865l.f3112d == -1 ? this.f2865l.f3114f - this.f2854a[i4].m3671a(this.f2865l.f3114f) : this.f2854a[i4].m3679b(this.f2865l.f3115g) - this.f2865l.f3115g;
            if (iM3671a >= 0) {
                this.f2852G[i3] = iM3671a;
                i3++;
            }
        }
        Arrays.sort(this.f2852G, 0, i3);
        for (int i5 = 0; i5 < i3 && this.f2865l.m3929a(tVar); i5++) {
            aVar.mo3926b(this.f2865l.f3111c, this.f2852G[i5]);
            this.f2865l.f3111c += this.f2865l.f3112d;
        }
    }

    /* JADX INFO: renamed from: a */
    void m3624a(int i, C0484av.t tVar) {
        int i2;
        int iM3622K;
        if (i > 0) {
            iM3622K = m3621J();
            i2 = 1;
        } else {
            i2 = -1;
            iM3622K = m3622K();
        }
        this.f2865l.f3109a = true;
        m3599b(iM3622K, tVar);
        m3607l(i2);
        this.f2865l.f3111c = this.f2865l.f3112d + iM3622K;
        this.f2865l.f3110b = Math.abs(i);
    }

    @Override // android.support.v7.widget.C0484av.h
    /* JADX INFO: renamed from: a */
    public void mo3441a(Rect rect, int i, int i2) {
        int iA;
        int iA2;
        int iB = m4205B() + m4291z();
        int iA3 = m4204A() + m4206C();
        if (this.f2863j == 1) {
            iA2 = m4193a(i2, iA3 + rect.height(), m4209F());
            iA = m4193a(i, iB + (this.f2864k * this.f2862i), m4208E());
        } else {
            iA = m4193a(i, iB + rect.width(), m4208E());
            iA2 = m4193a(i2, iA3 + (this.f2864k * this.f2862i), m4209F());
        }
        m4266f(iA, iA2);
    }

    @Override // android.support.v7.widget.C0484av.h
    /* JADX INFO: renamed from: a */
    public void mo3501a(Parcelable parcelable) {
        if (parcelable instanceof C0452d) {
            this.f2846A = (C0452d) parcelable;
            m4278n();
        }
    }

    @Override // android.support.v7.widget.C0484av.h
    /* JADX INFO: renamed from: a */
    public void mo3444a(C0484av.o oVar, C0484av.t tVar, View view, C0224b c0224b) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0450b)) {
            super.m4226a(view, c0224b);
            return;
        }
        C0450b c0450b = (C0450b) layoutParams;
        if (this.f2863j == 0) {
            c0224b.m1626b(C0224b.c.m1660a(c0450b.m3648b(), c0450b.f2879b ? this.f2862i : 1, -1, -1, c0450b.f2879b, false));
        } else {
            c0224b.m1626b(C0224b.c.m1660a(-1, -1, c0450b.m3648b(), c0450b.f2879b ? this.f2862i : 1, c0450b.f2879b, false));
        }
    }

    @Override // android.support.v7.widget.C0484av.h
    /* JADX INFO: renamed from: a */
    public void mo3445a(C0484av.t tVar) {
        super.mo3445a(tVar);
        this.f2859f = -1;
        this.f2860g = Integer.MIN_VALUE;
        this.f2846A = null;
        this.f2849D.m3643a();
    }

    /* JADX INFO: renamed from: a */
    void m3625a(C0484av.t tVar, C0449a c0449a) {
        if (m3629b(tVar, c0449a) || m3604c(tVar, c0449a)) {
            return;
        }
        c0449a.m3646b();
        c0449a.f2871a = 0;
    }

    @Override // android.support.v7.widget.C0484av.h
    /* JADX INFO: renamed from: a */
    public void mo3447a(C0484av c0484av) {
        this.f2861h.m3654a();
        m4278n();
    }

    @Override // android.support.v7.widget.C0484av.h
    /* JADX INFO: renamed from: a */
    public void mo3448a(C0484av c0484av, int i, int i2) {
        m3602c(i, i2, 1);
    }

    @Override // android.support.v7.widget.C0484av.h
    /* JADX INFO: renamed from: a */
    public void mo3449a(C0484av c0484av, int i, int i2, int i3) {
        m3602c(i, i2, 8);
    }

    @Override // android.support.v7.widget.C0484av.h
    /* JADX INFO: renamed from: a */
    public void mo3450a(C0484av c0484av, int i, int i2, Object obj) {
        m3602c(i, i2, 4);
    }

    @Override // android.support.v7.widget.C0484av.h
    /* JADX INFO: renamed from: a */
    public void mo3502a(C0484av c0484av, C0484av.o oVar) {
        m4240a(this.f2853H);
        for (int i = 0; i < this.f2862i; i++) {
            this.f2854a[i].m3686e();
        }
        c0484av.requestLayout();
    }

    @Override // android.support.v7.widget.C0484av.h
    /* JADX INFO: renamed from: a */
    public void mo3503a(AccessibilityEvent accessibilityEvent) {
        super.mo3503a(accessibilityEvent);
        if (m4286u() > 0) {
            View viewM3627b = m3627b(false);
            View viewM3631d = m3631d(false);
            if (viewM3627b == null || viewM3631d == null) {
                return;
            }
            int iD = m4256d(viewM3627b);
            int iD2 = m4256d(viewM3631d);
            if (iD < iD2) {
                accessibilityEvent.setFromIndex(iD);
                accessibilityEvent.setToIndex(iD2);
            } else {
                accessibilityEvent.setFromIndex(iD2);
                accessibilityEvent.setToIndex(iD);
            }
        }
    }

    @Override // android.support.v7.widget.C0484av.h
    /* JADX INFO: renamed from: a */
    public void mo3504a(String str) {
        if (this.f2846A == null) {
            super.mo3504a(str);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m3626a(boolean z) {
        mo3504a((String) null);
        if (this.f2846A != null && this.f2846A.f2893h != z) {
            this.f2846A.f2893h = z;
        }
        this.f2857d = z;
        m4278n();
    }

    @Override // android.support.v7.widget.C0484av.h
    /* JADX INFO: renamed from: a */
    public boolean mo3452a(C0484av.i iVar) {
        return iVar instanceof C0450b;
    }

    @Override // android.support.v7.widget.C0484av.h
    /* JADX INFO: renamed from: b */
    public int mo3453b(int i, C0484av.o oVar, C0484av.t tVar) {
        return m3630c(i, oVar, tVar);
    }

    @Override // android.support.v7.widget.C0484av.h
    /* JADX INFO: renamed from: b */
    public int mo3454b(C0484av.o oVar, C0484av.t tVar) {
        return this.f2863j == 1 ? this.f2862i : super.mo3454b(oVar, tVar);
    }

    /* JADX INFO: renamed from: b */
    View m3627b(boolean z) {
        int iMo4006c = this.f2855b.mo4006c();
        int iMo4008d = this.f2855b.mo4008d();
        int iU = m4286u();
        View view = null;
        for (int i = 0; i < iU; i++) {
            View viewH = m4271h(i);
            int iMo4001a = this.f2855b.mo4001a(viewH);
            if (this.f2855b.mo4005b(viewH) > iMo4006c && iMo4001a < iMo4008d) {
                if (iMo4001a >= iMo4006c || !z) {
                    return viewH;
                }
                if (view == null) {
                    view = viewH;
                }
            }
        }
        return view;
    }

    /* JADX INFO: renamed from: b */
    public void m3628b(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        mo3504a((String) null);
        if (i == this.f2863j) {
            return;
        }
        this.f2863j = i;
        AbstractC0483au abstractC0483au = this.f2855b;
        this.f2855b = this.f2856c;
        this.f2856c = abstractC0483au;
        m4278n();
    }

    @Override // android.support.v7.widget.C0484av.h
    /* JADX INFO: renamed from: b */
    public void mo3455b(C0484av c0484av, int i, int i2) {
        m3602c(i, i2, 2);
    }

    @Override // android.support.v7.widget.C0484av.h
    /* JADX INFO: renamed from: b */
    public boolean mo3456b() {
        return this.f2846A == null;
    }

    /* JADX INFO: renamed from: b */
    boolean m3629b(C0484av.t tVar, C0449a c0449a) {
        if (tVar.m4379a() || this.f2859f == -1) {
            return false;
        }
        if (this.f2859f < 0 || this.f2859f >= tVar.m4383e()) {
            this.f2859f = -1;
            this.f2860g = Integer.MIN_VALUE;
            return false;
        }
        if (this.f2846A != null && this.f2846A.f2886a != -1 && this.f2846A.f2888c >= 1) {
            c0449a.f2872b = Integer.MIN_VALUE;
            c0449a.f2871a = this.f2859f;
            return true;
        }
        View viewC = mo3512c(this.f2859f);
        if (viewC == null) {
            c0449a.f2871a = this.f2859f;
            if (this.f2860g == Integer.MIN_VALUE) {
                c0449a.f2873c = m3617t(c0449a.f2871a) == 1;
                c0449a.m3646b();
            } else {
                c0449a.m3644a(this.f2860g);
            }
            c0449a.f2874d = true;
            return true;
        }
        c0449a.f2871a = this.f2858e ? m3621J() : m3622K();
        if (this.f2860g != Integer.MIN_VALUE) {
            if (c0449a.f2873c) {
                c0449a.f2872b = (this.f2855b.mo4008d() - this.f2860g) - this.f2855b.mo4005b(viewC);
                return true;
            }
            c0449a.f2872b = (this.f2855b.mo4006c() + this.f2860g) - this.f2855b.mo4001a(viewC);
            return true;
        }
        if (this.f2855b.mo4011e(viewC) > this.f2855b.mo4012f()) {
            c0449a.f2872b = c0449a.f2873c ? this.f2855b.mo4008d() : this.f2855b.mo4006c();
            return true;
        }
        int iMo4001a = this.f2855b.mo4001a(viewC) - this.f2855b.mo4006c();
        if (iMo4001a < 0) {
            c0449a.f2872b = -iMo4001a;
            return true;
        }
        int iMo4008d = this.f2855b.mo4008d() - this.f2855b.mo4005b(viewC);
        if (iMo4008d < 0) {
            c0449a.f2872b = iMo4008d;
            return true;
        }
        c0449a.f2872b = Integer.MIN_VALUE;
        return true;
    }

    /* JADX INFO: renamed from: c */
    int m3630c(int i, C0484av.o oVar, C0484av.t tVar) {
        if (m4286u() == 0 || i == 0) {
            return 0;
        }
        m3624a(i, tVar);
        int iM3585a = m3585a(oVar, this.f2865l, tVar);
        if (this.f2865l.f3110b >= iM3585a) {
            i = i < 0 ? -iM3585a : iM3585a;
        }
        this.f2855b.mo4003a(-i);
        this.f2868o = this.f2858e;
        this.f2865l.f3110b = 0;
        m3591a(oVar, this.f2865l);
        return i;
    }

    @Override // android.support.v7.widget.C0484av.h
    /* JADX INFO: renamed from: c */
    public int mo3510c(C0484av.t tVar) {
        return m3598b(tVar);
    }

    @Override // android.support.v7.widget.C0484av.h
    /* JADX INFO: renamed from: c */
    public Parcelable mo3511c() {
        int iM3671a;
        if (this.f2846A != null) {
            return new C0452d(this.f2846A);
        }
        C0452d c0452d = new C0452d();
        c0452d.f2893h = this.f2857d;
        c0452d.f2894i = this.f2868o;
        c0452d.f2895j = this.f2869z;
        if (this.f2861h == null || this.f2861h.f2880a == null) {
            c0452d.f2890e = 0;
        } else {
            c0452d.f2891f = this.f2861h.f2880a;
            c0452d.f2890e = c0452d.f2891f.length;
            c0452d.f2892g = this.f2861h.f2881b;
        }
        if (m4286u() > 0) {
            c0452d.f2886a = this.f2868o ? m3621J() : m3622K();
            c0452d.f2887b = m3638j();
            c0452d.f2888c = this.f2862i;
            c0452d.f2889d = new int[this.f2862i];
            for (int i = 0; i < this.f2862i; i++) {
                if (this.f2868o) {
                    iM3671a = this.f2854a[i].m3679b(Integer.MIN_VALUE);
                    if (iM3671a != Integer.MIN_VALUE) {
                        iM3671a -= this.f2855b.mo4008d();
                    }
                } else {
                    iM3671a = this.f2854a[i].m3671a(Integer.MIN_VALUE);
                    if (iM3671a != Integer.MIN_VALUE) {
                        iM3671a -= this.f2855b.mo4006c();
                    }
                }
                c0452d.f2889d[i] = iM3671a;
            }
        } else {
            c0452d.f2886a = -1;
            c0452d.f2887b = -1;
            c0452d.f2888c = 0;
        }
        return c0452d;
    }

    @Override // android.support.v7.widget.C0484av.h
    /* JADX INFO: renamed from: c */
    public void mo3457c(C0484av.o oVar, C0484av.t tVar) {
        m3592a(oVar, tVar, true);
    }

    @Override // android.support.v7.widget.C0484av.h
    /* JADX INFO: renamed from: d */
    public int mo3513d(C0484av.t tVar) {
        return m3598b(tVar);
    }

    /* JADX INFO: renamed from: d */
    View m3631d(boolean z) {
        int iMo4006c = this.f2855b.mo4006c();
        int iMo4008d = this.f2855b.mo4008d();
        View view = null;
        for (int iU = m4286u() - 1; iU >= 0; iU--) {
            View viewH = m4271h(iU);
            int iMo4001a = this.f2855b.mo4001a(viewH);
            int iMo4005b = this.f2855b.mo4005b(viewH);
            if (iMo4005b > iMo4006c && iMo4001a < iMo4008d) {
                if (iMo4005b <= iMo4008d || !z) {
                    return viewH;
                }
                if (view == null) {
                    view = viewH;
                }
            }
        }
        return view;
    }

    @Override // android.support.v7.widget.C0484av.h
    /* JADX INFO: renamed from: d */
    public void mo3514d(int i) {
        if (this.f2846A != null && this.f2846A.f2886a != i) {
            this.f2846A.m3668b();
        }
        this.f2859f = i;
        this.f2860g = Integer.MIN_VALUE;
        m4278n();
    }

    @Override // android.support.v7.widget.C0484av.h
    /* JADX INFO: renamed from: d */
    public boolean mo3515d() {
        return this.f2863j == 0;
    }

    @Override // android.support.v7.widget.C0484av.h
    /* JADX INFO: renamed from: e */
    public int mo3517e(C0484av.t tVar) {
        return m3605i(tVar);
    }

    /* JADX INFO: renamed from: e */
    void m3632e(int i) {
        this.f2864k = i / this.f2862i;
        this.f2847B = View.MeasureSpec.makeMeasureSpec(i, this.f2856c.mo4015h());
    }

    @Override // android.support.v7.widget.C0484av.h
    /* JADX INFO: renamed from: e */
    public boolean mo3518e() {
        return this.f2863j == 1;
    }

    @Override // android.support.v7.widget.C0484av.h
    /* JADX INFO: renamed from: f */
    public int mo3520f(C0484av.t tVar) {
        return m3605i(tVar);
    }

    /* JADX INFO: renamed from: f */
    boolean m3633f() {
        int iM3622K;
        int iM3621J;
        if (m4286u() == 0 || this.f2867n == 0 || !m4281p()) {
            return false;
        }
        if (this.f2858e) {
            iM3622K = m3621J();
            iM3621J = m3622K();
        } else {
            iM3622K = m3622K();
            iM3621J = m3621J();
        }
        if (iM3622K == 0 && m3634g() != null) {
            this.f2861h.m3654a();
            m4211H();
            m4278n();
            return true;
        }
        if (!this.f2850E) {
            return false;
        }
        int i = this.f2858e ? -1 : 1;
        C0451c.a aVarM3653a = this.f2861h.m3653a(iM3622K, iM3621J + 1, i, true);
        if (aVarM3653a == null) {
            this.f2850E = false;
            this.f2861h.m3652a(iM3621J + 1);
            return false;
        }
        C0451c.a aVarM3653a2 = this.f2861h.m3653a(iM3622K, aVarM3653a.f2882a, i * (-1), true);
        if (aVarM3653a2 == null) {
            this.f2861h.m3652a(aVarM3653a.f2882a);
        } else {
            this.f2861h.m3652a(aVarM3653a2.f2882a + 1);
        }
        m4211H();
        m4278n();
        return true;
    }

    @Override // android.support.v7.widget.C0484av.h
    /* JADX INFO: renamed from: g */
    public int mo3521g(C0484av.t tVar) {
        return m3606j(tVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x005d A[SYNTHETIC] */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    View m3634g() {
        int i;
        boolean z;
        int iU = m4286u() - 1;
        BitSet bitSet = new BitSet(this.f2862i);
        bitSet.set(0, this.f2862i, true);
        byte b = (this.f2863j == 1 && m3637i()) ? (byte) 1 : (byte) -1;
        if (this.f2858e) {
            i = -1;
        } else {
            i = iU + 1;
            iU = 0;
        }
        int i2 = iU < i ? 1 : -1;
        for (int i3 = iU; i3 != i; i3 += i2) {
            View viewH = m4271h(i3);
            C0450b c0450b = (C0450b) viewH.getLayoutParams();
            if (bitSet.get(c0450b.f2878a.f2900e)) {
                if (m3596a(c0450b.f2878a)) {
                    return viewH;
                }
                bitSet.clear(c0450b.f2878a.f2900e);
            }
            if (!c0450b.f2879b && i3 + i2 != i) {
                View viewH2 = m4271h(i3 + i2);
                if (this.f2858e) {
                    int iMo4005b = this.f2855b.mo4005b(viewH);
                    int iMo4005b2 = this.f2855b.mo4005b(viewH2);
                    if (iMo4005b < iMo4005b2) {
                        return viewH;
                    }
                    z = iMo4005b == iMo4005b2;
                    if (z) {
                        continue;
                    } else {
                        if ((c0450b.f2878a.f2900e - ((C0450b) viewH2.getLayoutParams()).f2878a.f2900e < 0) != (b < 0)) {
                            return viewH;
                        }
                    }
                } else {
                    int iMo4001a = this.f2855b.mo4001a(viewH);
                    int iMo4001a2 = this.f2855b.mo4001a(viewH2);
                    if (iMo4001a > iMo4001a2) {
                        return viewH;
                    }
                    if (iMo4001a == iMo4001a2) {
                        z = true;
                    }
                    if (z) {
                    }
                }
            }
        }
        return null;
    }

    @Override // android.support.v7.widget.C0484av.h
    /* JADX INFO: renamed from: h */
    public int mo3523h(C0484av.t tVar) {
        return m3606j(tVar);
    }

    /* JADX INFO: renamed from: h */
    public void m3635h() {
        this.f2861h.m3654a();
        m4278n();
    }

    @Override // android.support.v7.widget.C0484av.h
    /* JADX INFO: renamed from: i */
    public void mo3636i(int i) {
        super.mo3636i(i);
        for (int i2 = 0; i2 < this.f2862i; i2++) {
            this.f2854a[i2].m3685d(i);
        }
    }

    /* JADX INFO: renamed from: i */
    boolean m3637i() {
        return m4284s() == 1;
    }

    /* JADX INFO: renamed from: j */
    int m3638j() {
        View viewM3631d = this.f2858e ? m3631d(true) : m3627b(true);
        if (viewM3631d == null) {
            return -1;
        }
        return m4256d(viewM3631d);
    }

    @Override // android.support.v7.widget.C0484av.h
    /* JADX INFO: renamed from: j */
    public void mo3639j(int i) {
        super.mo3639j(i);
        for (int i2 = 0; i2 < this.f2862i; i2++) {
            this.f2854a[i2].m3685d(i);
        }
    }

    @Override // android.support.v7.widget.C0484av.h
    /* JADX INFO: renamed from: k */
    public void mo3640k(int i) {
        if (i == 0) {
            m3633f();
        }
    }

    /* JADX INFO: renamed from: l */
    boolean m3641l() {
        int iM3679b = this.f2854a[0].m3679b(Integer.MIN_VALUE);
        for (int i = 1; i < this.f2862i; i++) {
            if (this.f2854a[i].m3679b(Integer.MIN_VALUE) != iM3679b) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: m */
    boolean m3642m() {
        int iM3671a = this.f2854a[0].m3671a(Integer.MIN_VALUE);
        for (int i = 1; i < this.f2862i; i++) {
            if (this.f2854a[i].m3671a(Integer.MIN_VALUE) != iM3671a) {
                return false;
            }
        }
        return true;
    }
}
