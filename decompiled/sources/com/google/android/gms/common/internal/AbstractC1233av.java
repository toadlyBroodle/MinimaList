package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.C1071a;
import com.google.android.gms.common.C1281k;
import com.google.android.gms.common.C1283m;
import com.google.android.gms.common.api.C1077d;
import com.google.android.gms.common.api.Scope;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.av */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1233av<T extends IInterface> {

    /* JADX INFO: renamed from: A */
    private static String[] f5861A = {"service_esmobile", "service_googleme"};

    /* JADX INFO: renamed from: a */
    final Handler f5862a;

    /* JADX INFO: renamed from: b */
    protected InterfaceC1240bb f5863b;

    /* JADX INFO: renamed from: c */
    protected AtomicInteger f5864c;

    /* JADX INFO: renamed from: d */
    private int f5865d;

    /* JADX INFO: renamed from: e */
    private long f5866e;

    /* JADX INFO: renamed from: f */
    private long f5867f;

    /* JADX INFO: renamed from: g */
    private int f5868g;

    /* JADX INFO: renamed from: h */
    private long f5869h;

    /* JADX INFO: renamed from: i */
    private C1267n f5870i;

    /* JADX INFO: renamed from: j */
    private final Context f5871j;

    /* JADX INFO: renamed from: k */
    private final Looper f5872k;

    /* JADX INFO: renamed from: l */
    private final AbstractC1261h f5873l;

    /* JADX INFO: renamed from: m */
    private final C1283m f5874m;

    /* JADX INFO: renamed from: n */
    private final Object f5875n;

    /* JADX INFO: renamed from: o */
    private final Object f5876o;

    /* JADX INFO: renamed from: p */
    private InterfaceC1277x f5877p;

    /* JADX INFO: renamed from: q */
    private T f5878q;

    /* JADX INFO: renamed from: r */
    private final ArrayList<AbstractC1239ba<?>> f5879r;

    /* JADX INFO: renamed from: s */
    private ServiceConnectionC1242bd f5880s;

    /* JADX INFO: renamed from: t */
    private int f5881t;

    /* JADX INFO: renamed from: u */
    private final InterfaceC1235ax f5882u;

    /* JADX INFO: renamed from: v */
    private final InterfaceC1236ay f5883v;

    /* JADX INFO: renamed from: w */
    private final int f5884w;

    /* JADX INFO: renamed from: x */
    private final String f5885x;

    /* JADX INFO: renamed from: y */
    private C1071a f5886y;

    /* JADX INFO: renamed from: z */
    private boolean f5887z;

    protected AbstractC1233av(Context context, Looper looper, int i, InterfaceC1235ax interfaceC1235ax, InterfaceC1236ay interfaceC1236ay, String str) {
        this(context, looper, AbstractC1261h.m7185a(context), C1283m.m7222b(), i, (InterfaceC1235ax) C1221aj.m7065a(interfaceC1235ax), (InterfaceC1236ay) C1221aj.m7065a(interfaceC1236ay), null);
    }

    protected AbstractC1233av(Context context, Looper looper, AbstractC1261h abstractC1261h, C1283m c1283m, int i, InterfaceC1235ax interfaceC1235ax, InterfaceC1236ay interfaceC1236ay, String str) {
        this.f5875n = new Object();
        this.f5876o = new Object();
        this.f5879r = new ArrayList<>();
        this.f5881t = 1;
        this.f5886y = null;
        this.f5887z = false;
        this.f5864c = new AtomicInteger(0);
        this.f5871j = (Context) C1221aj.m7066a(context, "Context must not be null");
        this.f5872k = (Looper) C1221aj.m7066a(looper, "Looper must not be null");
        this.f5873l = (AbstractC1261h) C1221aj.m7066a(abstractC1261h, "Supervisor must not be null");
        this.f5874m = (C1283m) C1221aj.m7066a(c1283m, "API availability must not be null");
        this.f5862a = new HandlerC1237az(this, looper);
        this.f5884w = i;
        this.f5882u = interfaceC1235ax;
        this.f5883v = interfaceC1236ay;
        this.f5885x = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m7092a(int i, T t) {
        C1221aj.m7074b((i == 4) == (t != null));
        synchronized (this.f5875n) {
            this.f5881t = i;
            this.f5878q = t;
            switch (i) {
                case 1:
                    if (this.f5880s != null) {
                        this.f5873l.m7186a(mo6171j_(), mo7125q(), 129, this.f5880s, m7102e());
                        this.f5880s = null;
                    }
                    break;
                case 2:
                case 3:
                    if (this.f5880s != null && this.f5870i != null) {
                        String strM7211a = this.f5870i.m7211a();
                        String strM7212b = this.f5870i.m7212b();
                        Log.e("GmsClient", new StringBuilder(String.valueOf(strM7211a).length() + 70 + String.valueOf(strM7212b).length()).append("Calling connect() while still connected, missing disconnect() for ").append(strM7211a).append(" on ").append(strM7212b).toString());
                        this.f5873l.m7186a(this.f5870i.m7211a(), this.f5870i.m7212b(), this.f5870i.m7213c(), this.f5880s, m7102e());
                        this.f5864c.incrementAndGet();
                    }
                    this.f5880s = new ServiceConnectionC1242bd(this, this.f5864c.get());
                    this.f5870i = new C1267n(mo7125q(), mo6171j_(), false, 129);
                    if (!this.f5873l.mo7187a(new C1262i(this.f5870i.m7211a(), this.f5870i.m7212b(), this.f5870i.m7213c()), this.f5880s, m7102e())) {
                        String strM7211a2 = this.f5870i.m7211a();
                        String strM7212b2 = this.f5870i.m7212b();
                        Log.e("GmsClient", new StringBuilder(String.valueOf(strM7211a2).length() + 34 + String.valueOf(strM7212b2).length()).append("unable to connect to service: ").append(strM7211a2).append(" on ").append(strM7212b2).toString());
                        m7108a(16, (Bundle) null, this.f5864c.get());
                    }
                    break;
                case 4:
                    m7110a(t);
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final boolean m7095a(int i, int i2, T t) {
        boolean z;
        synchronized (this.f5875n) {
            if (this.f5881t != i) {
                z = false;
            } else {
                m7092a(i2, t);
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public final void m7098c(int i) {
        int i2;
        if (m7105n()) {
            i2 = 5;
            this.f5887z = true;
        } else {
            i2 = 4;
        }
        this.f5862a.sendMessage(this.f5862a.obtainMessage(i2, this.f5864c.get(), 16));
    }

    /* JADX INFO: renamed from: e */
    private final String m7102e() {
        return this.f5885x == null ? this.f5871j.getClass().getName() : this.f5885x;
    }

    /* JADX INFO: renamed from: n */
    private final boolean m7105n() {
        boolean z;
        synchronized (this.f5875n) {
            z = this.f5881t == 3;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public final boolean m7106y() {
        if (this.f5887z || TextUtils.isEmpty(mo6167b()) || TextUtils.isEmpty(null)) {
            return false;
        }
        try {
            Class.forName(mo6167b());
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public Bundle mo6746a() {
        return null;
    }

    /* JADX INFO: renamed from: a */
    protected abstract T mo6166a(IBinder iBinder);

    /* JADX INFO: renamed from: a */
    protected void m7107a(int i) {
        this.f5865d = i;
        this.f5866e = System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: a */
    protected final void m7108a(int i, Bundle bundle, int i2) {
        this.f5862a.sendMessage(this.f5862a.obtainMessage(7, i2, -1, new C1245bg(this, i, null)));
    }

    /* JADX INFO: renamed from: a */
    protected void mo7109a(int i, IBinder iBinder, Bundle bundle, int i2) {
        this.f5862a.sendMessage(this.f5862a.obtainMessage(1, i2, -1, new C1244bf(this, i, iBinder, bundle)));
    }

    /* JADX INFO: renamed from: a */
    protected void m7110a(T t) {
        this.f5867f = System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: a */
    protected void mo7111a(C1071a c1071a) {
        this.f5868g = c1071a.m6613c();
        this.f5869h = System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: a */
    public void m7112a(InterfaceC1240bb interfaceC1240bb) {
        this.f5863b = (InterfaceC1240bb) C1221aj.m7066a(interfaceC1240bb, "Connection progress callbacks cannot be null.");
        m7092a(2, (IInterface) null);
    }

    /* JADX INFO: renamed from: a */
    protected final void m7113a(InterfaceC1240bb interfaceC1240bb, int i, PendingIntent pendingIntent) {
        this.f5863b = (InterfaceC1240bb) C1221aj.m7066a(interfaceC1240bb, "Connection progress callbacks cannot be null.");
        this.f5862a.sendMessage(this.f5862a.obtainMessage(3, this.f5864c.get(), i, pendingIntent));
    }

    /* JADX INFO: renamed from: a */
    public void m7114a(InterfaceC1246bh interfaceC1246bh) {
        interfaceC1246bh.mo6836a();
    }

    /* JADX INFO: renamed from: a */
    public final void m7115a(InterfaceC1268o interfaceC1268o, Set<Scope> set) {
        Bundle bundleMo7129u = mo7129u();
        C1255bq c1255bq = new C1255bq(this.f5884w);
        c1255bq.f5927a = this.f5871j.getPackageName();
        c1255bq.f5930d = bundleMo7129u;
        if (set != null) {
            c1255bq.f5929c = (Scope[]) set.toArray(new Scope[set.size()]);
        }
        if (mo6643i()) {
            c1255bq.f5931e = mo7122m_() != null ? mo7122m_() : new Account("<<default account>>", "com.google");
            if (interfaceC1268o != null) {
                c1255bq.f5928b = interfaceC1268o.asBinder();
            }
        } else if (m7132x()) {
            c1255bq.f5931e = mo7122m_();
        }
        c1255bq.f5932f = mo7124p();
        try {
            synchronized (this.f5876o) {
                if (this.f5877p != null) {
                    this.f5877p.mo7218a(new BinderC1241bc(this, this.f5864c.get()), c1255bq);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            m7117b(1);
        } catch (RemoteException e2) {
            e = e2;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            mo7109a(8, (IBinder) null, (Bundle) null, this.f5864c.get());
        } catch (SecurityException e3) {
            throw e3;
        } catch (RuntimeException e4) {
            e = e4;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            mo7109a(8, (IBinder) null, (Bundle) null, this.f5864c.get());
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m7116a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i;
        T t;
        InterfaceC1277x interfaceC1277x;
        synchronized (this.f5875n) {
            i = this.f5881t;
            t = this.f5878q;
        }
        synchronized (this.f5876o) {
            interfaceC1277x = this.f5877p;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        switch (i) {
            case 1:
                printWriter.print("DISCONNECTED");
                break;
            case 2:
                printWriter.print("REMOTE_CONNECTING");
                break;
            case 3:
                printWriter.print("LOCAL_CONNECTING");
                break;
            case 4:
                printWriter.print("CONNECTED");
                break;
            case 5:
                printWriter.print("DISCONNECTING");
                break;
            default:
                printWriter.print("UNKNOWN");
                break;
        }
        printWriter.append(" mService=");
        if (t == null) {
            printWriter.append("null");
        } else {
            printWriter.append((CharSequence) mo6167b()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(t.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (interfaceC1277x == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(interfaceC1277x.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.f5867f > 0) {
            PrintWriter printWriterAppend = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j = this.f5867f;
            String str2 = simpleDateFormat.format(new Date(this.f5867f));
            printWriterAppend.println(new StringBuilder(String.valueOf(str2).length() + 21).append(j).append(" ").append(str2).toString());
        }
        if (this.f5866e > 0) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            switch (this.f5865d) {
                case 1:
                    printWriter.append("CAUSE_SERVICE_DISCONNECTED");
                    break;
                case 2:
                    printWriter.append("CAUSE_NETWORK_LOST");
                    break;
                default:
                    printWriter.append((CharSequence) String.valueOf(this.f5865d));
                    break;
            }
            PrintWriter printWriterAppend2 = printWriter.append(" lastSuspendedTime=");
            long j2 = this.f5866e;
            String str3 = simpleDateFormat.format(new Date(this.f5866e));
            printWriterAppend2.println(new StringBuilder(String.valueOf(str3).length() + 21).append(j2).append(" ").append(str3).toString());
        }
        if (this.f5869h > 0) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) C1077d.m6649a(this.f5868g));
            PrintWriter printWriterAppend3 = printWriter.append(" lastFailedTime=");
            long j3 = this.f5869h;
            String str4 = simpleDateFormat.format(new Date(this.f5869h));
            printWriterAppend3.println(new StringBuilder(String.valueOf(str4).length() + 21).append(j3).append(" ").append(str4).toString());
        }
    }

    /* JADX INFO: renamed from: b */
    protected abstract String mo6167b();

    /* JADX INFO: renamed from: b */
    public final void m7117b(int i) {
        this.f5862a.sendMessage(this.f5862a.obtainMessage(6, this.f5864c.get(), i));
    }

    /* JADX INFO: renamed from: c */
    public boolean mo6168c() {
        return false;
    }

    /* JADX INFO: renamed from: d */
    public Intent mo6169d() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    /* JADX INFO: renamed from: f */
    public void mo6640f() {
        this.f5864c.incrementAndGet();
        synchronized (this.f5879r) {
            int size = this.f5879r.size();
            for (int i = 0; i < size; i++) {
                this.f5879r.get(i).m7143d();
            }
            this.f5879r.clear();
        }
        synchronized (this.f5876o) {
            this.f5877p = null;
        }
        m7092a(1, (IInterface) null);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m7118g() {
        boolean z;
        synchronized (this.f5875n) {
            z = this.f5881t == 4;
        }
        return z;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m7119h() {
        boolean z;
        synchronized (this.f5875n) {
            z = this.f5881t == 2 || this.f5881t == 3;
        }
        return z;
    }

    /* JADX INFO: renamed from: i */
    public boolean mo6643i() {
        return false;
    }

    /* JADX INFO: renamed from: j */
    public boolean mo6644j() {
        return true;
    }

    /* JADX INFO: renamed from: j_ */
    protected abstract String mo6171j_();

    /* JADX INFO: renamed from: k */
    public final IBinder m7120k() {
        IBinder iBinderAsBinder;
        synchronized (this.f5876o) {
            iBinderAsBinder = this.f5877p == null ? null : this.f5877p.asBinder();
        }
        return iBinderAsBinder;
    }

    /* JADX INFO: renamed from: l */
    public final String m7121l() {
        if (!m7118g() || this.f5870i == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return this.f5870i.m7212b();
    }

    /* JADX INFO: renamed from: m_ */
    public Account mo7122m_() {
        return null;
    }

    /* JADX INFO: renamed from: o */
    protected Set<Scope> mo7123o() {
        return Collections.EMPTY_SET;
    }

    /* JADX INFO: renamed from: p */
    public C1281k[] mo7124p() {
        return new C1281k[0];
    }

    /* JADX INFO: renamed from: q */
    protected String mo7125q() {
        return "com.google.android.gms";
    }

    /* JADX INFO: renamed from: r */
    public final void m7126r() {
        int iMo7040a = this.f5874m.mo7040a(this.f5871j);
        if (iMo7040a == 0) {
            m7112a(new C1243be(this));
        } else {
            m7092a(1, (IInterface) null);
            m7113a(new C1243be(this), iMo7040a, (PendingIntent) null);
        }
    }

    /* JADX INFO: renamed from: s */
    public final Context m7127s() {
        return this.f5871j;
    }

    /* JADX INFO: renamed from: t */
    public final Looper m7128t() {
        return this.f5872k;
    }

    /* JADX INFO: renamed from: u */
    protected Bundle mo7129u() {
        return new Bundle();
    }

    /* JADX INFO: renamed from: v */
    protected final void m7130v() {
        if (!m7118g()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    /* JADX INFO: renamed from: w */
    public final T m7131w() {
        T t;
        synchronized (this.f5875n) {
            if (this.f5881t == 5) {
                throw new DeadObjectException();
            }
            m7130v();
            C1221aj.m7071a(this.f5878q != null, "Client is connected but service is null");
            t = this.f5878q;
        }
        return t;
    }

    /* JADX INFO: renamed from: x */
    public boolean m7132x() {
        return false;
    }
}
