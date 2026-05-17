package ca.toadlybroodledev.sublist.p030a;

/* JADX INFO: renamed from: ca.toadlybroodledev.sublist.a.c */
/* JADX INFO: loaded from: classes.dex */
public class C0541c extends Exception {

    /* JADX INFO: renamed from: a */
    C0543e f3754a;

    public C0541c(int i, String str) {
        this(new C0543e(i, str));
    }

    public C0541c(int i, String str, Exception exc) {
        this(new C0543e(i, str), exc);
    }

    public C0541c(C0543e c0543e) {
        this(c0543e, (Exception) null);
    }

    public C0541c(C0543e c0543e, Exception exc) {
        super(c0543e.m4829a(), exc);
        this.f3754a = c0543e;
    }

    /* JADX INFO: renamed from: a */
    public C0543e m4808a() {
        return this.f3754a;
    }
}
