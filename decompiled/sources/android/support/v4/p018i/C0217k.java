package android.support.v4.p018i;

/* JADX INFO: renamed from: android.support.v4.i.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0217k {

    /* JADX INFO: renamed from: android.support.v4.i.k$a */
    public interface a<T> {
        /* JADX INFO: renamed from: a */
        T mo1569a();

        /* JADX INFO: renamed from: a */
        boolean mo1570a(T t);
    }

    /* JADX INFO: renamed from: android.support.v4.i.k$b */
    public static class b<T> implements a<T> {

        /* JADX INFO: renamed from: a */
        private final Object[] f1264a;

        /* JADX INFO: renamed from: b */
        private int f1265b;

        public b(int i) {
            if (i <= 0) {
                throw new IllegalArgumentException("The max pool size must be > 0");
            }
            this.f1264a = new Object[i];
        }

        /* JADX INFO: renamed from: b */
        private boolean m1571b(T t) {
            for (int i = 0; i < this.f1265b; i++) {
                if (this.f1264a[i] == t) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.support.v4.p018i.C0217k.a
        /* JADX INFO: renamed from: a */
        public T mo1569a() {
            if (this.f1265b <= 0) {
                return null;
            }
            int i = this.f1265b - 1;
            T t = (T) this.f1264a[i];
            this.f1264a[i] = null;
            this.f1265b--;
            return t;
        }

        @Override // android.support.v4.p018i.C0217k.a
        /* JADX INFO: renamed from: a */
        public boolean mo1570a(T t) {
            if (m1571b(t)) {
                throw new IllegalStateException("Already in the pool!");
            }
            if (this.f1265b >= this.f1264a.length) {
                return false;
            }
            this.f1264a[this.f1265b] = t;
            this.f1265b++;
            return true;
        }
    }

    /* JADX INFO: renamed from: android.support.v4.i.k$c */
    public static class c<T> extends b<T> {

        /* JADX INFO: renamed from: a */
        private final Object f1266a;

        public c(int i) {
            super(i);
            this.f1266a = new Object();
        }

        @Override // android.support.v4.p018i.C0217k.b, android.support.v4.p018i.C0217k.a
        /* JADX INFO: renamed from: a */
        public T mo1569a() {
            T t;
            synchronized (this.f1266a) {
                t = (T) super.mo1569a();
            }
            return t;
        }

        @Override // android.support.v4.p018i.C0217k.b, android.support.v4.p018i.C0217k.a
        /* JADX INFO: renamed from: a */
        public boolean mo1570a(T t) {
            boolean zMo1570a;
            synchronized (this.f1266a) {
                zMo1570a = super.mo1570a(t);
            }
            return zMo1570a;
        }
    }
}
