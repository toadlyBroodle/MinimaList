package android.support.v4.p018i;

/* JADX INFO: renamed from: android.support.v4.i.j */
/* JADX INFO: loaded from: classes.dex */
public class C0216j<F, S> {

    /* JADX INFO: renamed from: a */
    public final F f1262a;

    /* JADX INFO: renamed from: b */
    public final S f1263b;

    public C0216j(F f, S s) {
        this.f1262a = f;
        this.f1263b = s;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m1568a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0216j)) {
            return false;
        }
        C0216j c0216j = (C0216j) obj;
        return m1568a(c0216j.f1262a, this.f1262a) && m1568a(c0216j.f1263b, this.f1263b);
    }

    public int hashCode() {
        return (this.f1262a == null ? 0 : this.f1262a.hashCode()) ^ (this.f1263b != null ? this.f1263b.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + String.valueOf(this.f1262a) + " " + String.valueOf(this.f1263b) + "}";
    }
}
