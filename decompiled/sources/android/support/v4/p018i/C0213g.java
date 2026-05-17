package android.support.v4.p018i;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: android.support.v4.i.g */
/* JADX INFO: loaded from: classes.dex */
public class C0213g<K, V> {

    /* JADX INFO: renamed from: a */
    private final LinkedHashMap<K, V> f1239a;

    /* JADX INFO: renamed from: b */
    private int f1240b;

    /* JADX INFO: renamed from: c */
    private int f1241c;

    /* JADX INFO: renamed from: d */
    private int f1242d;

    /* JADX INFO: renamed from: e */
    private int f1243e;

    /* JADX INFO: renamed from: f */
    private int f1244f;

    /* JADX INFO: renamed from: g */
    private int f1245g;

    /* JADX INFO: renamed from: h */
    private int f1246h;

    public C0213g(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f1241c = i;
        this.f1239a = new LinkedHashMap<>(0, 0.75f, true);
    }

    /* JADX INFO: renamed from: c */
    private int m1549c(K k, V v) {
        int iM1554b = m1554b(k, v);
        if (iM1554b < 0) {
            throw new IllegalStateException("Negative size: " + k + "=" + v);
        }
        return iM1554b;
    }

    /* JADX INFO: renamed from: a */
    public final V m1550a(K k) {
        V vPut;
        if (k == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            V v = this.f1239a.get(k);
            if (v != null) {
                this.f1245g++;
                return v;
            }
            this.f1246h++;
            V vM1555b = m1555b(k);
            if (vM1555b == null) {
                return null;
            }
            synchronized (this) {
                this.f1243e++;
                vPut = this.f1239a.put(k, vM1555b);
                if (vPut != null) {
                    this.f1239a.put(k, vPut);
                } else {
                    this.f1240b += m1549c(k, vM1555b);
                }
            }
            if (vPut != null) {
                m1553a(false, k, vM1555b, vPut);
                return vPut;
            }
            m1552a(this.f1241c);
            return vM1555b;
        }
    }

    /* JADX INFO: renamed from: a */
    public final V m1551a(K k, V v) {
        V vPut;
        if (k == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f1242d++;
            this.f1240b += m1549c(k, v);
            vPut = this.f1239a.put(k, v);
            if (vPut != null) {
                this.f1240b -= m1549c(k, vPut);
            }
        }
        if (vPut != null) {
            m1553a(false, k, vPut, v);
        }
        m1552a(this.f1241c);
        return vPut;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m1552a(int i) {
        K key;
        V value;
        while (true) {
            synchronized (this) {
                if (this.f1240b < 0 || (this.f1239a.isEmpty() && this.f1240b != 0)) {
                    break;
                }
                if (this.f1240b <= i || this.f1239a.isEmpty()) {
                    break;
                }
                Map.Entry<K, V> next = this.f1239a.entrySet().iterator().next();
                key = next.getKey();
                value = next.getValue();
                this.f1239a.remove(key);
                this.f1240b -= m1549c(key, value);
                this.f1244f++;
            }
            m1553a(true, key, value, null);
        }
    }

    /* JADX INFO: renamed from: a */
    protected void m1553a(boolean z, K k, V v, V v2) {
    }

    /* JADX INFO: renamed from: b */
    protected int m1554b(K k, V v) {
        return 1;
    }

    /* JADX INFO: renamed from: b */
    protected V m1555b(K k) {
        return null;
    }

    public final synchronized String toString() {
        String str;
        synchronized (this) {
            int i = this.f1245g + this.f1246h;
            str = String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f1241c), Integer.valueOf(this.f1245g), Integer.valueOf(this.f1246h), Integer.valueOf(i != 0 ? (this.f1245g * 100) / i : 0));
        }
        return str;
    }
}
