package ca.toadlybroodledev.sublist.p030a;

/* JADX INFO: renamed from: ca.toadlybroodledev.sublist.a.e */
/* JADX INFO: loaded from: classes.dex */
public class C0543e {

    /* JADX INFO: renamed from: a */
    int f3779a;

    /* JADX INFO: renamed from: b */
    String f3780b;

    public C0543e(int i, String str) {
        this.f3779a = i;
        if (str == null || str.trim().length() == 0) {
            this.f3780b = C0542d.m4809a(i);
        } else {
            this.f3780b = str + " (response: " + C0542d.m4809a(i) + ")";
        }
    }

    /* JADX INFO: renamed from: a */
    public String m4829a() {
        return this.f3780b;
    }

    /* JADX INFO: renamed from: b */
    public boolean m4830b() {
        return this.f3779a == 0;
    }

    /* JADX INFO: renamed from: c */
    public boolean m4831c() {
        return !m4830b();
    }

    public String toString() {
        return "IabResult: " + m4829a();
    }
}
