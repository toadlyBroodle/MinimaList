package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.support.v4.p018i.C0208b;
import android.util.Log;
import com.google.android.gms.common.C1071a;
import com.google.android.gms.common.C1204c;
import com.google.android.gms.common.api.C1074a;
import com.google.android.gms.common.api.C1078e;
import com.google.android.gms.common.api.InterfaceC1193k;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.internal.afq;
import com.google.android.gms.p051b.AbstractC0964e;
import com.google.android.gms.p051b.C0965f;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.am */
/* JADX INFO: loaded from: classes.dex */
public final class C1098am implements Handler.Callback {

    /* JADX INFO: renamed from: a */
    public static final Status f5575a = new Status(4, "Sign-out occurred while this API call was in progress.");

    /* JADX INFO: renamed from: b */
    private static final Status f5576b = new Status(4, "The user must be signed in to make this API call.");

    /* JADX INFO: renamed from: f */
    private static final Object f5577f = new Object();

    /* JADX INFO: renamed from: g */
    private static C1098am f5578g;

    /* JADX INFO: renamed from: h */
    private final Context f5582h;

    /* JADX INFO: renamed from: i */
    private final C1204c f5583i;

    /* JADX INFO: renamed from: q */
    private final Handler f5591q;

    /* JADX INFO: renamed from: c */
    private long f5579c = 5000;

    /* JADX INFO: renamed from: d */
    private long f5580d = 120000;

    /* JADX INFO: renamed from: e */
    private long f5581e = 10000;

    /* JADX INFO: renamed from: j */
    private int f5584j = -1;

    /* JADX INFO: renamed from: k */
    private final AtomicInteger f5585k = new AtomicInteger(1);

    /* JADX INFO: renamed from: l */
    private final AtomicInteger f5586l = new AtomicInteger(0);

    /* JADX INFO: renamed from: m */
    private final Map<C1150ck<?>, C1100ao<?>> f5587m = new ConcurrentHashMap(5, 0.75f, 1);

    /* JADX INFO: renamed from: n */
    private C1174i f5588n = null;

    /* JADX INFO: renamed from: o */
    private final Set<C1150ck<?>> f5589o = new C0208b();

    /* JADX INFO: renamed from: p */
    private final Set<C1150ck<?>> f5590p = new C0208b();

    private C1098am(Context context, Looper looper, C1204c c1204c) {
        this.f5582h = context;
        this.f5591q = new Handler(looper, this);
        this.f5583i = c1204c;
        this.f5591q.sendMessage(this.f5591q.obtainMessage(6));
    }

    /* JADX INFO: renamed from: a */
    public static C1098am m6781a() {
        C1098am c1098am;
        synchronized (f5577f) {
            C1221aj.m7066a(f5578g, "Must guarantee manager is non-null before using getInstance");
            c1098am = f5578g;
        }
        return c1098am;
    }

    /* JADX INFO: renamed from: a */
    public static C1098am m6782a(Context context) {
        C1098am c1098am;
        synchronized (f5577f) {
            if (f5578g == null) {
                HandlerThread handlerThread = new HandlerThread("GoogleApiHandler", 9);
                handlerThread.start();
                f5578g = new C1098am(context.getApplicationContext(), handlerThread.getLooper(), C1204c.m7035a());
            }
            c1098am = f5578g;
        }
        return c1098am;
    }

    /* JADX INFO: renamed from: b */
    public static void m6784b() {
        synchronized (f5577f) {
            if (f5578g != null) {
                C1098am c1098am = f5578g;
                c1098am.f5586l.incrementAndGet();
                c1098am.f5591q.sendMessageAtFrontOfQueue(c1098am.f5591q.obtainMessage(10));
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private final void m6785b(C1078e<?> c1078e) {
        Object objM6659b = c1078e.m6659b();
        C1100ao<?> c1100ao = this.f5587m.get(objM6659b);
        if (c1100ao == null) {
            c1100ao = new C1100ao<>(this, c1078e);
            this.f5587m.put((C1150ck<?>) objM6659b, c1100ao);
        }
        if (c1100ao.m6833k()) {
            this.f5590p.add((C1150ck<?>) objM6659b);
        }
        c1100ao.m6831i();
    }

    /* JADX INFO: renamed from: h */
    private final void m6794h() {
        Iterator<C1150ck<?>> it = this.f5590p.iterator();
        while (it.hasNext()) {
            this.f5587m.remove(it.next()).m6819a();
        }
        this.f5590p.clear();
    }

    /* JADX INFO: renamed from: a */
    final PendingIntent m6797a(C1150ck<?> c1150ck, int i) {
        afq afqVarM6835m;
        C1100ao<?> c1100ao = this.f5587m.get(c1150ck);
        if (c1100ao != null && (afqVarM6835m = c1100ao.m6835m()) != null) {
            return PendingIntent.getActivity(this.f5582h, i, afqVarM6835m.mo6169d(), 134217728);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC0964e<Map<C1150ck<?>, String>> m6798a(Iterable<? extends C1078e<?>> iterable) {
        C1152cm c1152cm = new C1152cm(iterable);
        for (C1078e<?> c1078e : iterable) {
            C1100ao<?> c1100ao = this.f5587m.get(c1078e.m6659b());
            if (c1100ao == null || !c1100ao.m6832j()) {
                this.f5591q.sendMessage(this.f5591q.obtainMessage(2, c1152cm));
                return c1152cm.m6938b();
            }
            c1152cm.m6937a(c1078e.m6659b(), C1071a.f5439a, c1100ao.m6823b().m6646l());
        }
        return c1152cm.m6938b();
    }

    /* JADX INFO: renamed from: a */
    public final void m6799a(C1078e<?> c1078e) {
        this.f5591q.sendMessage(this.f5591q.obtainMessage(7, c1078e));
    }

    /* JADX INFO: renamed from: a */
    public final <O extends C1074a.a, TResult> void m6800a(C1078e<O> c1078e, int i, AbstractC1137by<C1074a.c, TResult> abstractC1137by, C0965f<TResult> c0965f, InterfaceC1133bu interfaceC1133bu) {
        this.f5591q.sendMessage(this.f5591q.obtainMessage(4, new C1123bk(new C1147ch(i, abstractC1137by, c0965f, interfaceC1133bu), this.f5586l.get(), c1078e)));
    }

    /* JADX INFO: renamed from: a */
    public final <O extends C1074a.a> void m6801a(C1078e<O> c1078e, int i, AbstractC1155cp<? extends InterfaceC1193k, C1074a.c> abstractC1155cp) {
        this.f5591q.sendMessage(this.f5591q.obtainMessage(4, new C1123bk(new C1113ba(i, abstractC1155cp), this.f5586l.get(), c1078e)));
    }

    /* JADX INFO: renamed from: a */
    public final void m6802a(C1174i c1174i) {
        synchronized (f5577f) {
            if (this.f5588n != c1174i) {
                this.f5588n = c1174i;
                this.f5589o.clear();
                this.f5589o.addAll(c1174i.m6990g());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    final boolean m6803a(C1071a c1071a, int i) {
        return this.f5583i.m7047a(this.f5582h, c1071a, i);
    }

    /* JADX INFO: renamed from: b */
    public final void m6804b(C1071a c1071a, int i) {
        if (m6803a(c1071a, i)) {
            return;
        }
        this.f5591q.sendMessage(this.f5591q.obtainMessage(5, i, 0, c1071a));
    }

    /* JADX INFO: renamed from: b */
    final void m6805b(C1174i c1174i) {
        synchronized (f5577f) {
            if (this.f5588n == c1174i) {
                this.f5588n = null;
                this.f5589o.clear();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m6806c() {
        return this.f5585k.getAndIncrement();
    }

    /* JADX INFO: renamed from: d */
    public final void m6807d() {
        this.f5591q.sendMessage(this.f5591q.obtainMessage(3));
    }

    /* JADX INFO: renamed from: e */
    final void m6808e() {
        this.f5586l.incrementAndGet();
        this.f5591q.sendMessage(this.f5591q.obtainMessage(10));
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        C1100ao<?> next;
        switch (message.what) {
            case 1:
                this.f5581e = ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                this.f5591q.removeMessages(12);
                Iterator<C1150ck<?>> it = this.f5587m.keySet().iterator();
                while (it.hasNext()) {
                    this.f5591q.sendMessageDelayed(this.f5591q.obtainMessage(12, it.next()), this.f5581e);
                }
                break;
            case 2:
                C1152cm c1152cm = (C1152cm) message.obj;
                Iterator<C1150ck<?>> it2 = c1152cm.m6936a().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    } else {
                        C1150ck<?> next2 = it2.next();
                        C1100ao<?> c1100ao = this.f5587m.get(next2);
                        if (c1100ao == null) {
                            c1152cm.m6937a(next2, new C1071a(13), null);
                            break;
                        } else if (c1100ao.m6832j()) {
                            c1152cm.m6937a(next2, C1071a.f5439a, c1100ao.m6823b().m6646l());
                        } else if (c1100ao.m6827e() != null) {
                            c1152cm.m6937a(next2, c1100ao.m6827e(), null);
                        } else {
                            c1100ao.m6822a(c1152cm);
                        }
                    }
                }
                break;
            case 3:
                for (C1100ao<?> c1100ao2 : this.f5587m.values()) {
                    c1100ao2.m6826d();
                    c1100ao2.m6831i();
                }
                break;
            case 4:
            case 8:
            case 13:
                C1123bk c1123bk = (C1123bk) message.obj;
                C1100ao<?> c1100ao3 = this.f5587m.get(c1123bk.f5661c.m6659b());
                if (c1100ao3 == null) {
                    m6785b(c1123bk.f5661c);
                    c1100ao3 = this.f5587m.get(c1123bk.f5661c.m6659b());
                }
                if (!c1100ao3.m6833k() || this.f5586l.get() == c1123bk.f5660b) {
                    c1100ao3.m6821a(c1123bk.f5659a);
                } else {
                    c1123bk.f5659a.mo6726a(f5575a);
                    c1100ao3.m6819a();
                }
                break;
            case 5:
                int i = message.arg1;
                C1071a c1071a = (C1071a) message.obj;
                Iterator<C1100ao<?>> it3 = this.f5587m.values().iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next = it3.next();
                        if (next.m6834l() == i) {
                        }
                    } else {
                        next = null;
                    }
                }
                if (next != null) {
                    String strMo7048b = this.f5583i.mo7048b(c1071a.m6613c());
                    String strM6615e = c1071a.m6615e();
                    next.m6820a(new Status(17, new StringBuilder(String.valueOf(strMo7048b).length() + 69 + String.valueOf(strM6615e).length()).append("Error resolution was canceled by the user, original error message: ").append(strMo7048b).append(": ").append(strM6615e).toString()));
                } else {
                    Log.wtf("GoogleApiManager", new StringBuilder(76).append("Could not find API instance ").append(i).append(" while trying to fail enqueued calls.").toString(), new Exception());
                }
                break;
            case 6:
                if (this.f5582h.getApplicationContext() instanceof Application) {
                    ComponentCallbacks2C1153cn.m6940a((Application) this.f5582h.getApplicationContext());
                    ComponentCallbacks2C1153cn.m6939a().m6942a(new C1099an(this));
                    if (!ComponentCallbacks2C1153cn.m6939a().m6943a(true)) {
                        this.f5581e = 300000L;
                    }
                }
                break;
            case 7:
                m6785b((C1078e<?>) message.obj);
                break;
            case 9:
                if (this.f5587m.containsKey(message.obj)) {
                    this.f5587m.get(message.obj).m6828f();
                }
                break;
            case 10:
                m6794h();
                break;
            case 11:
                if (this.f5587m.containsKey(message.obj)) {
                    this.f5587m.get(message.obj).m6829g();
                }
                break;
            case 12:
                if (this.f5587m.containsKey(message.obj)) {
                    this.f5587m.get(message.obj).m6830h();
                }
                break;
            default:
                Log.w("GoogleApiManager", new StringBuilder(31).append("Unknown message id: ").append(message.what).toString());
                return false;
        }
        return true;
    }
}
