package android.support.v7.p027d;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.support.v7.p027d.AbstractC0372c;
import android.support.v7.p027d.C0376g;
import android.util.Log;
import android.util.SparseArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: android.support.v7.d.l */
/* JADX INFO: loaded from: classes.dex */
final class ServiceConnectionC0381l extends AbstractC0372c implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    static final boolean f2242a = Log.isLoggable("MediaRouteProviderProxy", 3);

    /* JADX INFO: renamed from: b */
    final c f2243b;

    /* JADX INFO: renamed from: c */
    private final ComponentName f2244c;

    /* JADX INFO: renamed from: d */
    private final ArrayList<b> f2245d;

    /* JADX INFO: renamed from: e */
    private boolean f2246e;

    /* JADX INFO: renamed from: f */
    private boolean f2247f;

    /* JADX INFO: renamed from: g */
    private a f2248g;

    /* JADX INFO: renamed from: h */
    private boolean f2249h;

    /* JADX INFO: renamed from: android.support.v7.d.l$a */
    private final class a implements IBinder.DeathRecipient {

        /* JADX INFO: renamed from: b */
        private final Messenger f2251b;

        /* JADX INFO: renamed from: g */
        private int f2256g;

        /* JADX INFO: renamed from: h */
        private int f2257h;

        /* JADX INFO: renamed from: e */
        private int f2254e = 1;

        /* JADX INFO: renamed from: f */
        private int f2255f = 1;

        /* JADX INFO: renamed from: i */
        private final SparseArray<C0376g.c> f2258i = new SparseArray<>();

        /* JADX INFO: renamed from: c */
        private final d f2252c = new d(this);

        /* JADX INFO: renamed from: d */
        private final Messenger f2253d = new Messenger(this.f2252c);

        public a(Messenger messenger) {
            this.f2251b = messenger;
        }

        /* JADX INFO: renamed from: a */
        private boolean m3071a(int i, int i2, int i3, Object obj, Bundle bundle) {
            Message messageObtain = Message.obtain();
            messageObtain.what = i;
            messageObtain.arg1 = i2;
            messageObtain.arg2 = i3;
            messageObtain.obj = obj;
            messageObtain.setData(bundle);
            messageObtain.replyTo = this.f2253d;
            try {
                this.f2251b.send(messageObtain);
                return true;
            } catch (DeadObjectException e) {
                return false;
            } catch (RemoteException e2) {
                if (i != 2) {
                    Log.e("MediaRouteProviderProxy", "Could not send message to service.", e2);
                }
                return false;
            }
        }

        /* JADX INFO: renamed from: a */
        public int m3072a(String str, String str2) {
            int i = this.f2255f;
            this.f2255f = i + 1;
            Bundle bundle = new Bundle();
            bundle.putString("routeId", str);
            bundle.putString("routeGroupId", str2);
            int i2 = this.f2254e;
            this.f2254e = i2 + 1;
            m3071a(3, i2, i, null, bundle);
            return i;
        }

        /* JADX INFO: renamed from: a */
        public void m3073a(int i, int i2) {
            Bundle bundle = new Bundle();
            bundle.putInt("unselectReason", i2);
            int i3 = this.f2254e;
            this.f2254e = i3 + 1;
            m3071a(6, i3, i, null, bundle);
        }

        /* JADX INFO: renamed from: a */
        public void m3074a(C0371b c0371b) {
            int i = this.f2254e;
            this.f2254e = i + 1;
            m3071a(10, i, 0, c0371b != null ? c0371b.m2850d() : null, null);
        }

        /* JADX INFO: renamed from: a */
        public boolean m3075a() {
            int i = this.f2254e;
            this.f2254e = i + 1;
            this.f2257h = i;
            if (!m3071a(1, this.f2257h, 2, null, null)) {
                return false;
            }
            try {
                this.f2251b.getBinder().linkToDeath(this, 0);
                return true;
            } catch (RemoteException e) {
                binderDied();
                return false;
            }
        }

        /* JADX INFO: renamed from: a */
        public boolean m3076a(int i) {
            if (i == this.f2257h) {
                this.f2257h = 0;
                ServiceConnectionC0381l.this.m3064a(this, "Registration failed");
            }
            C0376g.c cVar = this.f2258i.get(i);
            if (cVar == null) {
                return true;
            }
            this.f2258i.remove(i);
            cVar.m2917a(null, null);
            return true;
        }

        /* JADX INFO: renamed from: a */
        public boolean m3077a(int i, int i2, Bundle bundle) {
            if (this.f2256g != 0 || i != this.f2257h || i2 < 1) {
                return false;
            }
            this.f2257h = 0;
            this.f2256g = i2;
            ServiceConnectionC0381l.this.m3063a(this, C0373d.m2873a(bundle));
            ServiceConnectionC0381l.this.m3062a(this);
            return true;
        }

        /* JADX INFO: renamed from: a */
        public boolean m3078a(int i, Bundle bundle) {
            C0376g.c cVar = this.f2258i.get(i);
            if (cVar == null) {
                return false;
            }
            this.f2258i.remove(i);
            cVar.m2916a(bundle);
            return true;
        }

        /* JADX INFO: renamed from: a */
        public boolean m3079a(int i, String str, Bundle bundle) {
            C0376g.c cVar = this.f2258i.get(i);
            if (cVar == null) {
                return false;
            }
            this.f2258i.remove(i);
            cVar.m2917a(str, bundle);
            return true;
        }

        /* JADX INFO: renamed from: a */
        public boolean m3080a(Bundle bundle) {
            if (this.f2256g == 0) {
                return false;
            }
            ServiceConnectionC0381l.this.m3063a(this, C0373d.m2873a(bundle));
            return true;
        }

        /* JADX INFO: renamed from: b */
        public void m3081b() {
            m3071a(2, 0, 0, null, null);
            this.f2252c.m3091a();
            this.f2251b.getBinder().unlinkToDeath(this, 0);
            ServiceConnectionC0381l.this.f2243b.post(new Runnable() { // from class: android.support.v7.d.l.a.1
                @Override // java.lang.Runnable
                public void run() {
                    a.this.m3084c();
                }
            });
        }

        /* JADX INFO: renamed from: b */
        public void m3082b(int i, int i2) {
            Bundle bundle = new Bundle();
            bundle.putInt("volume", i2);
            int i3 = this.f2254e;
            this.f2254e = i3 + 1;
            m3071a(7, i3, i, null, bundle);
        }

        /* JADX INFO: renamed from: b */
        public boolean m3083b(int i) {
            return true;
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            ServiceConnectionC0381l.this.f2243b.post(new Runnable() { // from class: android.support.v7.d.l.a.2
                @Override // java.lang.Runnable
                public void run() {
                    ServiceConnectionC0381l.this.m3066b(a.this);
                }
            });
        }

        /* JADX INFO: renamed from: c */
        void m3084c() {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= this.f2258i.size()) {
                    this.f2258i.clear();
                    return;
                } else {
                    this.f2258i.valueAt(i2).m2917a(null, null);
                    i = i2 + 1;
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public void m3085c(int i) {
            int i2 = this.f2254e;
            this.f2254e = i2 + 1;
            m3071a(4, i2, i, null, null);
        }

        /* JADX INFO: renamed from: c */
        public void m3086c(int i, int i2) {
            Bundle bundle = new Bundle();
            bundle.putInt("volume", i2);
            int i3 = this.f2254e;
            this.f2254e = i3 + 1;
            m3071a(8, i3, i, null, bundle);
        }

        /* JADX INFO: renamed from: d */
        public void m3087d(int i) {
            int i2 = this.f2254e;
            this.f2254e = i2 + 1;
            m3071a(5, i2, i, null, null);
        }
    }

    /* JADX INFO: renamed from: android.support.v7.d.l$b */
    private final class b extends AbstractC0372c.d {

        /* JADX INFO: renamed from: b */
        private final String f2262b;

        /* JADX INFO: renamed from: c */
        private final String f2263c;

        /* JADX INFO: renamed from: d */
        private boolean f2264d;

        /* JADX INFO: renamed from: e */
        private int f2265e = -1;

        /* JADX INFO: renamed from: f */
        private int f2266f;

        /* JADX INFO: renamed from: g */
        private a f2267g;

        /* JADX INFO: renamed from: h */
        private int f2268h;

        public b(String str, String str2) {
            this.f2262b = str;
            this.f2263c = str2;
        }

        @Override // android.support.v7.p027d.AbstractC0372c.d
        /* JADX INFO: renamed from: a */
        public void mo2867a() {
            ServiceConnectionC0381l.this.m3065a(this);
        }

        @Override // android.support.v7.p027d.AbstractC0372c.d
        /* JADX INFO: renamed from: a */
        public void mo2868a(int i) {
            this.f2264d = false;
            if (this.f2267g != null) {
                this.f2267g.m3073a(this.f2268h, i);
            }
        }

        /* JADX INFO: renamed from: a */
        public void m3088a(a aVar) {
            this.f2267g = aVar;
            this.f2268h = aVar.m3072a(this.f2262b, this.f2263c);
            if (this.f2264d) {
                aVar.m3087d(this.f2268h);
                if (this.f2265e >= 0) {
                    aVar.m3082b(this.f2268h, this.f2265e);
                    this.f2265e = -1;
                }
                if (this.f2266f != 0) {
                    aVar.m3086c(this.f2268h, this.f2266f);
                    this.f2266f = 0;
                }
            }
        }

        @Override // android.support.v7.p027d.AbstractC0372c.d
        /* JADX INFO: renamed from: b */
        public void mo2869b() {
            this.f2264d = true;
            if (this.f2267g != null) {
                this.f2267g.m3087d(this.f2268h);
            }
        }

        @Override // android.support.v7.p027d.AbstractC0372c.d
        /* JADX INFO: renamed from: b */
        public void mo2870b(int i) {
            if (this.f2267g != null) {
                this.f2267g.m3082b(this.f2268h, i);
            } else {
                this.f2265e = i;
                this.f2266f = 0;
            }
        }

        @Override // android.support.v7.p027d.AbstractC0372c.d
        /* JADX INFO: renamed from: c */
        public void mo2871c() {
            mo2868a(0);
        }

        @Override // android.support.v7.p027d.AbstractC0372c.d
        /* JADX INFO: renamed from: c */
        public void mo2872c(int i) {
            if (this.f2267g != null) {
                this.f2267g.m3086c(this.f2268h, i);
            } else {
                this.f2266f += i;
            }
        }

        /* JADX INFO: renamed from: d */
        public void m3089d() {
            if (this.f2267g != null) {
                this.f2267g.m3085c(this.f2268h);
                this.f2267g = null;
                this.f2268h = 0;
            }
        }
    }

    /* JADX INFO: renamed from: android.support.v7.d.l$c */
    private final class c extends Handler {
        c() {
        }
    }

    /* JADX INFO: renamed from: android.support.v7.d.l$d */
    private static final class d extends Handler {

        /* JADX INFO: renamed from: a */
        private final WeakReference<a> f2270a;

        public d(a aVar) {
            this.f2270a = new WeakReference<>(aVar);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX INFO: renamed from: a */
        private boolean m3090a(a aVar, int i, int i2, int i3, Object obj, Bundle bundle) {
            switch (i) {
                case 0:
                    aVar.m3076a(i2);
                    return true;
                case 1:
                    aVar.m3083b(i2);
                    return true;
                case 2:
                    if (obj == null || (obj instanceof Bundle)) {
                        return aVar.m3077a(i2, i3, (Bundle) obj);
                    }
                    return false;
                case 3:
                    if (obj == null || (obj instanceof Bundle)) {
                        return aVar.m3078a(i2, (Bundle) obj);
                    }
                    return false;
                case 4:
                    if (obj == null || (obj instanceof Bundle)) {
                        return aVar.m3079a(i2, bundle == null ? null : bundle.getString("error"), (Bundle) obj);
                    }
                    return false;
                case 5:
                    if (obj == null || (obj instanceof Bundle)) {
                        return aVar.m3080a((Bundle) obj);
                    }
                    return false;
                default:
                    return false;
            }
        }

        /* JADX INFO: renamed from: a */
        public void m3091a() {
            this.f2270a.clear();
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            a aVar = this.f2270a.get();
            if (aVar == null || m3090a(aVar, message.what, message.arg1, message.arg2, message.obj, message.peekData()) || !ServiceConnectionC0381l.f2242a) {
                return;
            }
            Log.d("MediaRouteProviderProxy", "Unhandled message from server: " + message);
        }
    }

    public ServiceConnectionC0381l(Context context, ComponentName componentName) {
        super(context, new AbstractC0372c.c(componentName));
        this.f2245d = new ArrayList<>();
        this.f2244c = componentName;
        this.f2243b = new c();
    }

    /* JADX INFO: renamed from: c */
    private AbstractC0372c.d m3054c(String str, String str2) {
        C0373d c0373dF = m2862f();
        if (c0373dF != null) {
            List<C0370a> listM2874a = c0373dF.m2874a();
            int size = listM2874a.size();
            for (int i = 0; i < size; i++) {
                if (listM2874a.get(i).m2807a().equals(str)) {
                    b bVar = new b(str, str2);
                    this.f2245d.add(bVar);
                    if (this.f2249h) {
                        bVar.m3088a(this.f2248g);
                    }
                    m3055k();
                    return bVar;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    private void m3055k() {
        if (m3056l()) {
            m3057m();
        } else {
            m3058n();
        }
    }

    /* JADX INFO: renamed from: l */
    private boolean m3056l() {
        return this.f2246e && !(m2860d() == null && this.f2245d.isEmpty());
    }

    /* JADX INFO: renamed from: m */
    private void m3057m() {
        if (this.f2247f) {
            return;
        }
        if (f2242a) {
            Log.d("MediaRouteProviderProxy", this + ": Binding");
        }
        Intent intent = new Intent("android.media.MediaRouteProviderService");
        intent.setComponent(this.f2244c);
        try {
            this.f2247f = m2851a().bindService(intent, this, 1);
            if (this.f2247f || !f2242a) {
                return;
            }
            Log.d("MediaRouteProviderProxy", this + ": Bind failed");
        } catch (SecurityException e) {
            if (f2242a) {
                Log.d("MediaRouteProviderProxy", this + ": Bind failed", e);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    private void m3058n() {
        if (this.f2247f) {
            if (f2242a) {
                Log.d("MediaRouteProviderProxy", this + ": Unbinding");
            }
            this.f2247f = false;
            m3059o();
            m2851a().unbindService(this);
        }
    }

    /* JADX INFO: renamed from: o */
    private void m3059o() {
        if (this.f2248g != null) {
            m2856a((C0373d) null);
            this.f2249h = false;
            m3061q();
            this.f2248g.m3081b();
            this.f2248g = null;
        }
    }

    /* JADX INFO: renamed from: p */
    private void m3060p() {
        int size = this.f2245d.size();
        for (int i = 0; i < size; i++) {
            this.f2245d.get(i).m3088a(this.f2248g);
        }
    }

    /* JADX INFO: renamed from: q */
    private void m3061q() {
        int size = this.f2245d.size();
        for (int i = 0; i < size; i++) {
            this.f2245d.get(i).m3089d();
        }
    }

    @Override // android.support.v7.p027d.AbstractC0372c
    /* JADX INFO: renamed from: a */
    public AbstractC0372c.d mo2852a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("routeId cannot be null");
        }
        return m3054c(str, null);
    }

    @Override // android.support.v7.p027d.AbstractC0372c
    /* JADX INFO: renamed from: a */
    public AbstractC0372c.d mo2853a(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("routeId cannot be null");
        }
        if (str2 == null) {
            throw new IllegalArgumentException("routeGroupId cannot be null");
        }
        return m3054c(str, str2);
    }

    /* JADX INFO: renamed from: a */
    void m3062a(a aVar) {
        if (this.f2248g == aVar) {
            this.f2249h = true;
            m3060p();
            C0371b c0371bD = m2860d();
            if (c0371bD != null) {
                this.f2248g.m3074a(c0371bD);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    void m3063a(a aVar, C0373d c0373d) {
        if (this.f2248g == aVar) {
            if (f2242a) {
                Log.d("MediaRouteProviderProxy", this + ": Descriptor changed, descriptor=" + c0373d);
            }
            m2856a(c0373d);
        }
    }

    /* JADX INFO: renamed from: a */
    void m3064a(a aVar, String str) {
        if (this.f2248g == aVar) {
            if (f2242a) {
                Log.d("MediaRouteProviderProxy", this + ": Service connection error - " + str);
            }
            m3058n();
        }
    }

    /* JADX INFO: renamed from: a */
    void m3065a(b bVar) {
        this.f2245d.remove(bVar);
        bVar.m3089d();
        m3055k();
    }

    @Override // android.support.v7.p027d.AbstractC0372c
    /* JADX INFO: renamed from: b */
    public void mo2858b(C0371b c0371b) {
        if (this.f2249h) {
            this.f2248g.m3074a(c0371b);
        }
        m3055k();
    }

    /* JADX INFO: renamed from: b */
    void m3066b(a aVar) {
        if (this.f2248g == aVar) {
            if (f2242a) {
                Log.d("MediaRouteProviderProxy", this + ": Service connection died");
            }
            m3059o();
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m3067b(String str, String str2) {
        return this.f2244c.getPackageName().equals(str) && this.f2244c.getClassName().equals(str2);
    }

    /* JADX INFO: renamed from: h */
    public void m3068h() {
        if (this.f2246e) {
            return;
        }
        if (f2242a) {
            Log.d("MediaRouteProviderProxy", this + ": Starting");
        }
        this.f2246e = true;
        m3055k();
    }

    /* JADX INFO: renamed from: i */
    public void m3069i() {
        if (this.f2246e) {
            if (f2242a) {
                Log.d("MediaRouteProviderProxy", this + ": Stopping");
            }
            this.f2246e = false;
            m3055k();
        }
    }

    /* JADX INFO: renamed from: j */
    public void m3070j() {
        if (this.f2248g == null && m3056l()) {
            m3058n();
            m3057m();
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (f2242a) {
            Log.d("MediaRouteProviderProxy", this + ": Connected");
        }
        if (this.f2247f) {
            m3059o();
            Messenger messenger = iBinder != null ? new Messenger(iBinder) : null;
            if (!AbstractC0374e.m2879a(messenger)) {
                Log.e("MediaRouteProviderProxy", this + ": Service returned invalid messenger binder");
                return;
            }
            a aVar = new a(messenger);
            if (aVar.m3075a()) {
                this.f2248g = aVar;
            } else if (f2242a) {
                Log.d("MediaRouteProviderProxy", this + ": Registration failed");
            }
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (f2242a) {
            Log.d("MediaRouteProviderProxy", this + ": Service disconnected");
        }
        m3059o();
    }

    public String toString() {
        return "Service connection " + this.f2244c.flattenToShortString();
    }
}
