package android.support.v4.p006a;

import android.os.Bundle;
import android.support.v4.p006a.AbstractC0168x;
import android.support.v4.p007b.C0176c;
import android.support.v4.p018i.C0210d;
import android.support.v4.p018i.C0220n;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

/* JADX INFO: renamed from: android.support.v4.a.y */
/* JADX INFO: loaded from: classes.dex */
class C0169y extends AbstractC0168x {

    /* JADX INFO: renamed from: a */
    static boolean f1042a = false;

    /* JADX INFO: renamed from: b */
    final C0220n<a> f1043b = new C0220n<>();

    /* JADX INFO: renamed from: c */
    final C0220n<a> f1044c = new C0220n<>();

    /* JADX INFO: renamed from: d */
    final String f1045d;

    /* JADX INFO: renamed from: e */
    boolean f1046e;

    /* JADX INFO: renamed from: f */
    boolean f1047f;

    /* JADX INFO: renamed from: g */
    boolean f1048g;

    /* JADX INFO: renamed from: h */
    AbstractC0158n f1049h;

    /* JADX INFO: renamed from: android.support.v4.a.y$a */
    final class a implements C0176c.a<Object>, C0176c.b<Object> {

        /* JADX INFO: renamed from: a */
        final int f1050a;

        /* JADX INFO: renamed from: b */
        final Bundle f1051b;

        /* JADX INFO: renamed from: c */
        AbstractC0168x.a<Object> f1052c;

        /* JADX INFO: renamed from: d */
        C0176c<Object> f1053d;

        /* JADX INFO: renamed from: e */
        boolean f1054e;

        /* JADX INFO: renamed from: f */
        boolean f1055f;

        /* JADX INFO: renamed from: g */
        Object f1056g;

        /* JADX INFO: renamed from: h */
        boolean f1057h;

        /* JADX INFO: renamed from: i */
        boolean f1058i;

        /* JADX INFO: renamed from: j */
        boolean f1059j;

        /* JADX INFO: renamed from: k */
        boolean f1060k;

        /* JADX INFO: renamed from: l */
        boolean f1061l;

        /* JADX INFO: renamed from: m */
        boolean f1062m;

        /* JADX INFO: renamed from: n */
        a f1063n;

        public a(int i, Bundle bundle, AbstractC0168x.a<Object> aVar) {
            this.f1050a = i;
            this.f1051b = bundle;
            this.f1052c = aVar;
        }

        /* JADX INFO: renamed from: a */
        void m1276a() {
            if (this.f1058i && this.f1059j) {
                this.f1057h = true;
                return;
            }
            if (this.f1057h) {
                return;
            }
            this.f1057h = true;
            if (C0169y.f1042a) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            if (this.f1053d == null && this.f1052c != null) {
                this.f1053d = this.f1052c.mo1261a(this.f1050a, this.f1051b);
            }
            if (this.f1053d != null) {
                if (this.f1053d.getClass().isMemberClass() && !Modifier.isStatic(this.f1053d.getClass().getModifiers())) {
                    throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + this.f1053d);
                }
                if (!this.f1062m) {
                    this.f1053d.m1342a(this.f1050a, this);
                    this.f1053d.m1343a((C0176c.a<Object>) this);
                    this.f1062m = true;
                }
                this.f1053d.m1350i();
            }
        }

        @Override // android.support.v4.p007b.C0176c.a
        /* JADX INFO: renamed from: a */
        public void mo1277a(C0176c<Object> c0176c) {
            if (C0169y.f1042a) {
                Log.v("LoaderManager", "onLoadCanceled: " + this);
            }
            if (this.f1061l) {
                if (C0169y.f1042a) {
                    Log.v("LoaderManager", "  Ignoring load canceled -- destroyed");
                }
            } else {
                if (C0169y.this.f1043b.m1588a(this.f1050a) != this) {
                    if (C0169y.f1042a) {
                        Log.v("LoaderManager", "  Ignoring load canceled -- not active");
                        return;
                    }
                    return;
                }
                a aVar = this.f1063n;
                if (aVar != null) {
                    if (C0169y.f1042a) {
                        Log.v("LoaderManager", "  Switching to pending loader: " + aVar);
                    }
                    this.f1063n = null;
                    C0169y.this.f1043b.m1592b(this.f1050a, null);
                    m1285f();
                    C0169y.this.m1267a(aVar);
                }
            }
        }

        @Override // android.support.v4.p007b.C0176c.b
        /* JADX INFO: renamed from: a */
        public void mo1278a(C0176c<Object> c0176c, Object obj) {
            if (C0169y.f1042a) {
                Log.v("LoaderManager", "onLoadComplete: " + this);
            }
            if (this.f1061l) {
                if (C0169y.f1042a) {
                    Log.v("LoaderManager", "  Ignoring load complete -- destroyed");
                    return;
                }
                return;
            }
            if (C0169y.this.f1043b.m1588a(this.f1050a) != this) {
                if (C0169y.f1042a) {
                    Log.v("LoaderManager", "  Ignoring load complete -- not active");
                    return;
                }
                return;
            }
            a aVar = this.f1063n;
            if (aVar != null) {
                if (C0169y.f1042a) {
                    Log.v("LoaderManager", "  Switching to pending loader: " + aVar);
                }
                this.f1063n = null;
                C0169y.this.f1043b.m1592b(this.f1050a, null);
                m1285f();
                C0169y.this.m1267a(aVar);
                return;
            }
            if (this.f1056g != obj || !this.f1054e) {
                this.f1056g = obj;
                this.f1054e = true;
                if (this.f1057h) {
                    m1281b(c0176c, obj);
                }
            }
            a aVarM1588a = C0169y.this.f1044c.m1588a(this.f1050a);
            if (aVarM1588a != null && aVarM1588a != this) {
                aVarM1588a.f1055f = false;
                aVarM1588a.m1285f();
                C0169y.this.f1044c.m1594c(this.f1050a);
            }
            if (C0169y.this.f1049h == null || C0169y.this.mo1260a()) {
                return;
            }
            C0169y.this.f1049h.f890d.m1166e();
        }

        /* JADX INFO: renamed from: a */
        public void m1279a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f1050a);
            printWriter.print(" mArgs=");
            printWriter.println(this.f1051b);
            printWriter.print(str);
            printWriter.print("mCallbacks=");
            printWriter.println(this.f1052c);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f1053d);
            if (this.f1053d != null) {
                this.f1053d.mo1295a(str + "  ", fileDescriptor, printWriter, strArr);
            }
            if (this.f1054e || this.f1055f) {
                printWriter.print(str);
                printWriter.print("mHaveData=");
                printWriter.print(this.f1054e);
                printWriter.print("  mDeliveredData=");
                printWriter.println(this.f1055f);
                printWriter.print(str);
                printWriter.print("mData=");
                printWriter.println(this.f1056g);
            }
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f1057h);
            printWriter.print(" mReportNextStart=");
            printWriter.print(this.f1060k);
            printWriter.print(" mDestroyed=");
            printWriter.println(this.f1061l);
            printWriter.print(str);
            printWriter.print("mRetaining=");
            printWriter.print(this.f1058i);
            printWriter.print(" mRetainingStarted=");
            printWriter.print(this.f1059j);
            printWriter.print(" mListenerRegistered=");
            printWriter.println(this.f1062m);
            if (this.f1063n != null) {
                printWriter.print(str);
                printWriter.println("Pending Loader ");
                printWriter.print(this.f1063n);
                printWriter.println(":");
                this.f1063n.m1279a(str + "  ", fileDescriptor, printWriter, strArr);
            }
        }

        /* JADX INFO: renamed from: b */
        void m1280b() {
            if (C0169y.f1042a) {
                Log.v("LoaderManager", "  Retaining: " + this);
            }
            this.f1058i = true;
            this.f1059j = this.f1057h;
            this.f1057h = false;
            this.f1052c = null;
        }

        /* JADX INFO: renamed from: b */
        void m1281b(C0176c<Object> c0176c, Object obj) {
            String str;
            if (this.f1052c != null) {
                if (C0169y.this.f1049h != null) {
                    String str2 = C0169y.this.f1049h.f890d.f926u;
                    C0169y.this.f1049h.f890d.f926u = "onLoadFinished";
                    str = str2;
                } else {
                    str = null;
                }
                try {
                    if (C0169y.f1042a) {
                        Log.v("LoaderManager", "  onLoadFinished in " + c0176c + ": " + c0176c.m1347c(obj));
                    }
                    this.f1052c.mo1263a(c0176c, obj);
                    this.f1055f = true;
                } finally {
                    if (C0169y.this.f1049h != null) {
                        C0169y.this.f1049h.f890d.f926u = str;
                    }
                }
            }
        }

        /* JADX INFO: renamed from: c */
        void m1282c() {
            if (this.f1058i) {
                if (C0169y.f1042a) {
                    Log.v("LoaderManager", "  Finished Retaining: " + this);
                }
                this.f1058i = false;
                if (this.f1057h != this.f1059j && !this.f1057h) {
                    m1284e();
                }
            }
            if (this.f1057h && this.f1054e && !this.f1060k) {
                m1281b(this.f1053d, this.f1056g);
            }
        }

        /* JADX INFO: renamed from: d */
        void m1283d() {
            if (this.f1057h && this.f1060k) {
                this.f1060k = false;
                if (!this.f1054e || this.f1058i) {
                    return;
                }
                m1281b(this.f1053d, this.f1056g);
            }
        }

        /* JADX INFO: renamed from: e */
        void m1284e() {
            if (C0169y.f1042a) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.f1057h = false;
            if (this.f1058i || this.f1053d == null || !this.f1062m) {
                return;
            }
            this.f1062m = false;
            this.f1053d.m1344a((C0176c.b<Object>) this);
            this.f1053d.m1345b((C0176c.a<Object>) this);
            this.f1053d.m1354m();
        }

        /* JADX INFO: renamed from: f */
        void m1285f() {
            String str;
            if (C0169y.f1042a) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.f1061l = true;
            boolean z = this.f1055f;
            this.f1055f = false;
            if (this.f1052c != null && this.f1053d != null && this.f1054e && z) {
                if (C0169y.f1042a) {
                    Log.v("LoaderManager", "  Resetting: " + this);
                }
                if (C0169y.this.f1049h != null) {
                    String str2 = C0169y.this.f1049h.f890d.f926u;
                    C0169y.this.f1049h.f890d.f926u = "onLoaderReset";
                    str = str2;
                } else {
                    str = null;
                }
                try {
                    this.f1052c.mo1262a(this.f1053d);
                } finally {
                    if (C0169y.this.f1049h != null) {
                        C0169y.this.f1049h.f890d.f926u = str;
                    }
                }
            }
            this.f1052c = null;
            this.f1056g = null;
            this.f1054e = false;
            if (this.f1053d != null) {
                if (this.f1062m) {
                    this.f1062m = false;
                    this.f1053d.m1344a((C0176c.b<Object>) this);
                    this.f1053d.m1345b((C0176c.a<Object>) this);
                }
                this.f1053d.m1356o();
            }
            if (this.f1063n != null) {
                this.f1063n.m1285f();
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f1050a);
            sb.append(" : ");
            C0210d.m1535a(this.f1053d, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    C0169y(String str, AbstractC0158n abstractC0158n, boolean z) {
        this.f1045d = str;
        this.f1049h = abstractC0158n;
        this.f1046e = z;
    }

    /* JADX INFO: renamed from: b */
    private a m1264b(int i, Bundle bundle, AbstractC0168x.a<Object> aVar) {
        a aVar2 = new a(i, bundle, aVar);
        aVar2.f1053d = aVar.mo1261a(i, bundle);
        return aVar2;
    }

    /* JADX INFO: renamed from: c */
    private a m1265c(int i, Bundle bundle, AbstractC0168x.a<Object> aVar) {
        try {
            this.f1048g = true;
            a aVarM1264b = m1264b(i, bundle, aVar);
            m1267a(aVarM1264b);
            return aVarM1264b;
        } finally {
            this.f1048g = false;
        }
    }

    @Override // android.support.v4.p006a.AbstractC0168x
    /* JADX INFO: renamed from: a */
    public <D> C0176c<D> mo1259a(int i, Bundle bundle, AbstractC0168x.a<D> aVar) {
        if (this.f1048g) {
            throw new IllegalStateException("Called while creating a loader");
        }
        a aVarM1588a = this.f1043b.m1588a(i);
        if (f1042a) {
            Log.v("LoaderManager", "initLoader in " + this + ": args=" + bundle);
        }
        if (aVarM1588a == null) {
            aVarM1588a = m1265c(i, bundle, aVar);
            if (f1042a) {
                Log.v("LoaderManager", "  Created new loader " + aVarM1588a);
            }
        } else {
            if (f1042a) {
                Log.v("LoaderManager", "  Re-using existing loader " + aVarM1588a);
            }
            aVarM1588a.f1052c = aVar;
        }
        if (aVarM1588a.f1054e && this.f1046e) {
            aVarM1588a.m1281b(aVarM1588a.f1053d, aVarM1588a.f1056g);
        }
        return (C0176c<D>) aVarM1588a.f1053d;
    }

    /* JADX INFO: renamed from: a */
    void m1266a(AbstractC0158n abstractC0158n) {
        this.f1049h = abstractC0158n;
    }

    /* JADX INFO: renamed from: a */
    void m1267a(a aVar) {
        this.f1043b.m1592b(aVar.f1050a, aVar);
        if (this.f1046e) {
            aVar.m1276a();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m1268a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        if (this.f1043b.m1590b() > 0) {
            printWriter.print(str);
            printWriter.println("Active Loaders:");
            String str2 = str + "    ";
            for (int i = 0; i < this.f1043b.m1590b(); i++) {
                a aVarM1597e = this.f1043b.m1597e(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(this.f1043b.m1596d(i));
                printWriter.print(": ");
                printWriter.println(aVarM1597e.toString());
                aVarM1597e.m1279a(str2, fileDescriptor, printWriter, strArr);
            }
        }
        if (this.f1044c.m1590b() > 0) {
            printWriter.print(str);
            printWriter.println("Inactive Loaders:");
            String str3 = str + "    ";
            for (int i2 = 0; i2 < this.f1044c.m1590b(); i2++) {
                a aVarM1597e2 = this.f1044c.m1597e(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(this.f1044c.m1596d(i2));
                printWriter.print(": ");
                printWriter.println(aVarM1597e2.toString());
                aVarM1597e2.m1279a(str3, fileDescriptor, printWriter, strArr);
            }
        }
    }

    @Override // android.support.v4.p006a.AbstractC0168x
    /* JADX INFO: renamed from: a */
    public boolean mo1260a() {
        int iM1590b = this.f1043b.m1590b();
        boolean z = false;
        for (int i = 0; i < iM1590b; i++) {
            a aVarM1597e = this.f1043b.m1597e(i);
            z |= aVarM1597e.f1057h && !aVarM1597e.f1055f;
        }
        return z;
    }

    /* JADX INFO: renamed from: b */
    void m1269b() {
        if (f1042a) {
            Log.v("LoaderManager", "Starting in " + this);
        }
        if (this.f1046e) {
            RuntimeException runtimeException = new RuntimeException("here");
            runtimeException.fillInStackTrace();
            Log.w("LoaderManager", "Called doStart when already started: " + this, runtimeException);
        } else {
            this.f1046e = true;
            for (int iM1590b = this.f1043b.m1590b() - 1; iM1590b >= 0; iM1590b--) {
                this.f1043b.m1597e(iM1590b).m1276a();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    void m1270c() {
        if (f1042a) {
            Log.v("LoaderManager", "Stopping in " + this);
        }
        if (!this.f1046e) {
            RuntimeException runtimeException = new RuntimeException("here");
            runtimeException.fillInStackTrace();
            Log.w("LoaderManager", "Called doStop when not started: " + this, runtimeException);
        } else {
            for (int iM1590b = this.f1043b.m1590b() - 1; iM1590b >= 0; iM1590b--) {
                this.f1043b.m1597e(iM1590b).m1284e();
            }
            this.f1046e = false;
        }
    }

    /* JADX INFO: renamed from: d */
    void m1271d() {
        if (f1042a) {
            Log.v("LoaderManager", "Retaining in " + this);
        }
        if (!this.f1046e) {
            RuntimeException runtimeException = new RuntimeException("here");
            runtimeException.fillInStackTrace();
            Log.w("LoaderManager", "Called doRetain when not started: " + this, runtimeException);
        } else {
            this.f1047f = true;
            this.f1046e = false;
            for (int iM1590b = this.f1043b.m1590b() - 1; iM1590b >= 0; iM1590b--) {
                this.f1043b.m1597e(iM1590b).m1280b();
            }
        }
    }

    /* JADX INFO: renamed from: e */
    void m1272e() {
        if (this.f1047f) {
            if (f1042a) {
                Log.v("LoaderManager", "Finished Retaining in " + this);
            }
            this.f1047f = false;
            for (int iM1590b = this.f1043b.m1590b() - 1; iM1590b >= 0; iM1590b--) {
                this.f1043b.m1597e(iM1590b).m1282c();
            }
        }
    }

    /* JADX INFO: renamed from: f */
    void m1273f() {
        for (int iM1590b = this.f1043b.m1590b() - 1; iM1590b >= 0; iM1590b--) {
            this.f1043b.m1597e(iM1590b).f1060k = true;
        }
    }

    /* JADX INFO: renamed from: g */
    void m1274g() {
        for (int iM1590b = this.f1043b.m1590b() - 1; iM1590b >= 0; iM1590b--) {
            this.f1043b.m1597e(iM1590b).m1283d();
        }
    }

    /* JADX INFO: renamed from: h */
    void m1275h() {
        if (!this.f1047f) {
            if (f1042a) {
                Log.v("LoaderManager", "Destroying Active in " + this);
            }
            for (int iM1590b = this.f1043b.m1590b() - 1; iM1590b >= 0; iM1590b--) {
                this.f1043b.m1597e(iM1590b).m1285f();
            }
            this.f1043b.m1593c();
        }
        if (f1042a) {
            Log.v("LoaderManager", "Destroying Inactive in " + this);
        }
        for (int iM1590b2 = this.f1044c.m1590b() - 1; iM1590b2 >= 0; iM1590b2--) {
            this.f1044c.m1597e(iM1590b2).m1285f();
        }
        this.f1044c.m1593c();
        this.f1049h = null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        C0210d.m1535a(this.f1049h, sb);
        sb.append("}}");
        return sb.toString();
    }
}
