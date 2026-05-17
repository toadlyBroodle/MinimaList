package android.support.v7.widget;

import android.support.v4.p016g.C0203e;
import android.support.v7.widget.C0484av;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: android.support.v7.widget.am */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC0475am implements Runnable {

    /* JADX INFO: renamed from: a */
    static final ThreadLocal<RunnableC0475am> f3094a = new ThreadLocal<>();

    /* JADX INFO: renamed from: e */
    static Comparator<b> f3095e = new Comparator<b>() { // from class: android.support.v7.widget.am.1
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(b bVar, b bVar2) {
            if ((bVar.f3107d == null) != (bVar2.f3107d == null)) {
                return bVar.f3107d == null ? 1 : -1;
            }
            if (bVar.f3104a != bVar2.f3104a) {
                return bVar.f3104a ? -1 : 1;
            }
            int i = bVar2.f3105b - bVar.f3105b;
            if (i != 0) {
                return i;
            }
            int i2 = bVar.f3106c - bVar2.f3106c;
            if (i2 == 0) {
                return 0;
            }
            return i2;
        }
    };

    /* JADX INFO: renamed from: c */
    long f3097c;

    /* JADX INFO: renamed from: d */
    long f3098d;

    /* JADX INFO: renamed from: b */
    ArrayList<C0484av> f3096b = new ArrayList<>();

    /* JADX INFO: renamed from: f */
    private ArrayList<b> f3099f = new ArrayList<>();

    /* JADX INFO: renamed from: android.support.v7.widget.am$a */
    static class a implements C0484av.h.a {

        /* JADX INFO: renamed from: a */
        int f3100a;

        /* JADX INFO: renamed from: b */
        int f3101b;

        /* JADX INFO: renamed from: c */
        int[] f3102c;

        /* JADX INFO: renamed from: d */
        int f3103d;

        a() {
        }

        /* JADX INFO: renamed from: a */
        void m3922a() {
            if (this.f3102c != null) {
                Arrays.fill(this.f3102c, -1);
            }
            this.f3103d = 0;
        }

        /* JADX INFO: renamed from: a */
        void m3923a(int i, int i2) {
            this.f3100a = i;
            this.f3101b = i2;
        }

        /* JADX INFO: renamed from: a */
        void m3924a(C0484av c0484av, boolean z) {
            this.f3103d = 0;
            if (this.f3102c != null) {
                Arrays.fill(this.f3102c, -1);
            }
            C0484av.h hVar = c0484av.f3265m;
            if (c0484av.f3264l == null || hVar == null || !hVar.m4280o()) {
                return;
            }
            if (z) {
                if (!c0484av.f3257e.m4640d()) {
                    hVar.mo3500a(c0484av.f3264l.mo191a(), this);
                }
            } else if (!c0484av.m4136w()) {
                hVar.mo3499a(this.f3100a, this.f3101b, c0484av.f3209B, this);
            }
            if (this.f3103d > hVar.f3313x) {
                hVar.f3313x = this.f3103d;
                hVar.f3314y = z;
                c0484av.f3256d.m4336b();
            }
        }

        /* JADX INFO: renamed from: a */
        boolean m3925a(int i) {
            if (this.f3102c == null) {
                return false;
            }
            int i2 = this.f3103d * 2;
            for (int i3 = 0; i3 < i2; i3 += 2) {
                if (this.f3102c[i3] == i) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.support.v7.widget.C0484av.h.a
        /* JADX INFO: renamed from: b */
        public void mo3926b(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i2 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i3 = this.f3103d * 2;
            if (this.f3102c == null) {
                this.f3102c = new int[4];
                Arrays.fill(this.f3102c, -1);
            } else if (i3 >= this.f3102c.length) {
                int[] iArr = this.f3102c;
                this.f3102c = new int[i3 * 2];
                System.arraycopy(iArr, 0, this.f3102c, 0, iArr.length);
            }
            this.f3102c[i3] = i;
            this.f3102c[i3 + 1] = i2;
            this.f3103d++;
        }
    }

    /* JADX INFO: renamed from: android.support.v7.widget.am$b */
    static class b {

        /* JADX INFO: renamed from: a */
        public boolean f3104a;

        /* JADX INFO: renamed from: b */
        public int f3105b;

        /* JADX INFO: renamed from: c */
        public int f3106c;

        /* JADX INFO: renamed from: d */
        public C0484av f3107d;

        /* JADX INFO: renamed from: e */
        public int f3108e;

        b() {
        }

        /* JADX INFO: renamed from: a */
        public void m3927a() {
            this.f3104a = false;
            this.f3105b = 0;
            this.f3106c = 0;
            this.f3107d = null;
            this.f3108e = 0;
        }
    }

    RunnableC0475am() {
    }

    /* JADX INFO: renamed from: a */
    private C0484av.w m3911a(C0484av c0484av, int i, long j) {
        if (m3915a(c0484av, i)) {
            return null;
        }
        C0484av.o oVar = c0484av.f3256d;
        try {
            c0484av.m4124l();
            C0484av.w wVarM4321a = oVar.m4321a(i, false, j);
            if (wVarM4321a != null) {
                if (!wVarM4321a.m4434p() || wVarM4321a.m4432n()) {
                    oVar.m4331a(wVarM4321a, false);
                } else {
                    oVar.m4332a(wVarM4321a.f3381a);
                }
            }
            return wVarM4321a;
        } finally {
            c0484av.m4090b(false);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m3912a() {
        b bVar;
        int i;
        int size = this.f3096b.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            C0484av c0484av = this.f3096b.get(i2);
            if (c0484av.getWindowVisibility() == 0) {
                c0484av.f3208A.m3924a(c0484av, false);
                i = c0484av.f3208A.f3103d + i3;
            } else {
                i = i3;
            }
            i2++;
            i3 = i;
        }
        this.f3099f.ensureCapacity(i3);
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            C0484av c0484av2 = this.f3096b.get(i5);
            if (c0484av2.getWindowVisibility() == 0) {
                a aVar = c0484av2.f3208A;
                int iAbs = Math.abs(aVar.f3100a) + Math.abs(aVar.f3101b);
                int i6 = i4;
                for (int i7 = 0; i7 < aVar.f3103d * 2; i7 += 2) {
                    if (i6 >= this.f3099f.size()) {
                        bVar = new b();
                        this.f3099f.add(bVar);
                    } else {
                        bVar = this.f3099f.get(i6);
                    }
                    int i8 = aVar.f3102c[i7 + 1];
                    bVar.f3104a = i8 <= iAbs;
                    bVar.f3105b = iAbs;
                    bVar.f3106c = i8;
                    bVar.f3107d = c0484av2;
                    bVar.f3108e = aVar.f3102c[i7];
                    i6++;
                }
                i4 = i6;
            }
        }
        Collections.sort(this.f3099f, f3095e);
    }

    /* JADX INFO: renamed from: a */
    private void m3913a(b bVar, long j) {
        C0484av.w wVarM3911a = m3911a(bVar.f3107d, bVar.f3108e, bVar.f3104a ? Long.MAX_VALUE : j);
        if (wVarM3911a == null || wVarM3911a.f3382b == null || !wVarM3911a.m4434p() || wVarM3911a.m4432n()) {
            return;
        }
        m3914a(wVarM3911a.f3382b.get(), j);
    }

    /* JADX INFO: renamed from: a */
    private void m3914a(C0484av c0484av, long j) {
        if (c0484av == null) {
            return;
        }
        if (c0484av.f3275w && c0484av.f3258f.m3785c() != 0) {
            c0484av.m4094c();
        }
        a aVar = c0484av.f3208A;
        aVar.m3924a(c0484av, true);
        if (aVar.f3103d != 0) {
            try {
                C0203e.m1472a("RV Nested Prefetch");
                c0484av.f3209B.m4378a(c0484av.f3264l);
                for (int i = 0; i < aVar.f3103d * 2; i += 2) {
                    m3911a(c0484av, aVar.f3102c[i], j);
                }
            } finally {
                C0203e.m1471a();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    static boolean m3915a(C0484av c0484av, int i) {
        int iM3785c = c0484av.f3258f.m3785c();
        for (int i2 = 0; i2 < iM3785c; i2++) {
            C0484av.w wVarM4052e = C0484av.m4052e(c0484av.f3258f.m3788d(i2));
            if (wVarM4052e.f3383c == i && !wVarM4052e.m4432n()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    private void m3916b(long j) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.f3099f.size()) {
                return;
            }
            b bVar = this.f3099f.get(i2);
            if (bVar.f3107d == null) {
                return;
            }
            m3913a(bVar, j);
            bVar.m3927a();
            i = i2 + 1;
        }
    }

    /* JADX INFO: renamed from: a */
    void m3917a(long j) {
        m3912a();
        m3916b(j);
    }

    /* JADX INFO: renamed from: a */
    public void m3918a(C0484av c0484av) {
        this.f3096b.add(c0484av);
    }

    /* JADX INFO: renamed from: a */
    void m3919a(C0484av c0484av, int i, int i2) {
        if (c0484av.isAttachedToWindow() && this.f3097c == 0) {
            this.f3097c = c0484av.getNanoTime();
            c0484av.post(this);
        }
        c0484av.f3208A.m3923a(i, i2);
    }

    /* JADX INFO: renamed from: b */
    public void m3920b(C0484av c0484av) {
        this.f3096b.remove(c0484av);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            C0203e.m1472a("RV Prefetch");
            if (this.f3096b.isEmpty()) {
                return;
            }
            int size = this.f3096b.size();
            int i = 0;
            long jMax = 0;
            while (i < size) {
                C0484av c0484av = this.f3096b.get(i);
                i++;
                jMax = c0484av.getWindowVisibility() == 0 ? Math.max(c0484av.getDrawingTime(), jMax) : jMax;
            }
            if (jMax == 0) {
                return;
            }
            m3917a(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f3098d);
        } finally {
            this.f3097c = 0L;
            C0203e.m1471a();
        }
    }
}
