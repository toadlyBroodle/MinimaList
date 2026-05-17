package android.support.v4.p007b;

import android.content.Context;
import android.support.v4.p018i.C0210d;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: renamed from: android.support.v4.b.c */
/* JADX INFO: loaded from: classes.dex */
public class C0176c<D> {

    /* JADX INFO: renamed from: f */
    int f1088f;

    /* JADX INFO: renamed from: g */
    b<D> f1089g;

    /* JADX INFO: renamed from: h */
    a<D> f1090h;

    /* JADX INFO: renamed from: i */
    Context f1091i;

    /* JADX INFO: renamed from: j */
    boolean f1092j = false;

    /* JADX INFO: renamed from: k */
    boolean f1093k = false;

    /* JADX INFO: renamed from: l */
    boolean f1094l = true;

    /* JADX INFO: renamed from: m */
    boolean f1095m = false;

    /* JADX INFO: renamed from: n */
    boolean f1096n = false;

    /* JADX INFO: renamed from: android.support.v4.b.c$a */
    public interface a<D> {
        /* JADX INFO: renamed from: a */
        void mo1277a(C0176c<D> c0176c);
    }

    /* JADX INFO: renamed from: android.support.v4.b.c$b */
    public interface b<D> {
        /* JADX INFO: renamed from: a */
        void mo1278a(C0176c<D> c0176c, D d);
    }

    public C0176c(Context context) {
        this.f1091i = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: a */
    protected void mo1292a() {
    }

    /* JADX INFO: renamed from: a */
    public void m1342a(int i, b<D> bVar) {
        if (this.f1089g != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.f1089g = bVar;
        this.f1088f = i;
    }

    /* JADX INFO: renamed from: a */
    public void m1343a(a<D> aVar) {
        if (this.f1090h != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.f1090h = aVar;
    }

    /* JADX INFO: renamed from: a */
    public void m1344a(b<D> bVar) {
        if (this.f1089g == null) {
            throw new IllegalStateException("No listener register");
        }
        if (this.f1089g != bVar) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        this.f1089g = null;
    }

    /* JADX INFO: renamed from: a */
    public void mo1295a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f1088f);
        printWriter.print(" mListener=");
        printWriter.println(this.f1089g);
        if (this.f1092j || this.f1095m || this.f1096n) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f1092j);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f1095m);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f1096n);
        }
        if (this.f1093k || this.f1094l) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f1093k);
            printWriter.print(" mReset=");
            printWriter.println(this.f1094l);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m1345b(a<D> aVar) {
        if (this.f1090h == null) {
            throw new IllegalStateException("No listener register");
        }
        if (this.f1090h != aVar) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        this.f1090h = null;
    }

    /* JADX INFO: renamed from: b */
    public void m1346b(D d) {
        if (this.f1089g != null) {
            this.f1089g.mo1278a(this, d);
        }
    }

    /* JADX INFO: renamed from: b */
    protected boolean mo1297b() {
        return false;
    }

    /* JADX INFO: renamed from: c */
    public String m1347c(D d) {
        StringBuilder sb = new StringBuilder(64);
        C0210d.m1535a(d, sb);
        sb.append("}");
        return sb.toString();
    }

    /* JADX INFO: renamed from: g */
    public void m1348g() {
        if (this.f1090h != null) {
            this.f1090h.mo1277a(this);
        }
    }

    /* JADX INFO: renamed from: h */
    public boolean m1349h() {
        return this.f1093k;
    }

    /* JADX INFO: renamed from: i */
    public final void m1350i() {
        this.f1092j = true;
        this.f1094l = false;
        this.f1093k = false;
        mo1351j();
    }

    /* JADX INFO: renamed from: j */
    protected void mo1351j() {
    }

    /* JADX INFO: renamed from: k */
    public boolean m1352k() {
        return mo1297b();
    }

    /* JADX INFO: renamed from: l */
    public void m1353l() {
        mo1292a();
    }

    /* JADX INFO: renamed from: m */
    public void m1354m() {
        this.f1092j = false;
        m1355n();
    }

    /* JADX INFO: renamed from: n */
    protected void m1355n() {
    }

    /* JADX INFO: renamed from: o */
    public void m1356o() {
        m1357p();
        this.f1094l = true;
        this.f1092j = false;
        this.f1093k = false;
        this.f1095m = false;
        this.f1096n = false;
    }

    /* JADX INFO: renamed from: p */
    protected void m1357p() {
    }

    /* JADX INFO: renamed from: q */
    public void m1358q() {
        this.f1096n = false;
    }

    /* JADX INFO: renamed from: r */
    public void m1359r() {
        if (this.f1096n) {
            m1360s();
        }
    }

    /* JADX INFO: renamed from: s */
    public void m1360s() {
        if (this.f1092j) {
            m1353l();
        } else {
            this.f1095m = true;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        C0210d.m1535a(this, sb);
        sb.append(" id=");
        sb.append(this.f1088f);
        sb.append("}");
        return sb.toString();
    }
}
