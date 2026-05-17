package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.C1071a;
import com.google.android.gms.common.api.AbstractC1079f;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1259f implements Handler.Callback {

    /* JADX INFO: renamed from: a */
    private final InterfaceC1260g f5941a;

    /* JADX INFO: renamed from: h */
    private final Handler f5948h;

    /* JADX INFO: renamed from: b */
    private final ArrayList<AbstractC1079f.b> f5942b = new ArrayList<>();

    /* JADX INFO: renamed from: c */
    private ArrayList<AbstractC1079f.b> f5943c = new ArrayList<>();

    /* JADX INFO: renamed from: d */
    private final ArrayList<AbstractC1079f.c> f5944d = new ArrayList<>();

    /* JADX INFO: renamed from: e */
    private volatile boolean f5945e = false;

    /* JADX INFO: renamed from: f */
    private final AtomicInteger f5946f = new AtomicInteger(0);

    /* JADX INFO: renamed from: g */
    private boolean f5947g = false;

    /* JADX INFO: renamed from: i */
    private final Object f5949i = new Object();

    public C1259f(Looper looper, InterfaceC1260g interfaceC1260g) {
        this.f5941a = interfaceC1260g;
        this.f5948h = new Handler(looper, this);
    }

    /* JADX INFO: renamed from: a */
    public final void m7177a() {
        this.f5945e = false;
        this.f5946f.incrementAndGet();
    }

    /* JADX INFO: renamed from: a */
    public final void m7178a(int i) {
        int i2 = 0;
        C1221aj.m7071a(Looper.myLooper() == this.f5948h.getLooper(), "onUnintentionalDisconnection must only be called on the Handler thread");
        this.f5948h.removeMessages(1);
        synchronized (this.f5949i) {
            this.f5947g = true;
            ArrayList arrayList = new ArrayList(this.f5942b);
            int i3 = this.f5946f.get();
            ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            while (i2 < size) {
                Object obj = arrayList2.get(i2);
                i2++;
                AbstractC1079f.b bVar = (AbstractC1079f.b) obj;
                if (!this.f5945e || this.f5946f.get() != i3) {
                    break;
                } else if (this.f5942b.contains(bVar)) {
                    bVar.mo6386a(i);
                }
            }
            this.f5943c.clear();
            this.f5947g = false;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m7179a(Bundle bundle) {
        int i = 0;
        C1221aj.m7071a(Looper.myLooper() == this.f5948h.getLooper(), "onConnectionSuccess must only be called on the Handler thread");
        synchronized (this.f5949i) {
            C1221aj.m7070a(!this.f5947g);
            this.f5948h.removeMessages(1);
            this.f5947g = true;
            C1221aj.m7070a(this.f5943c.size() == 0);
            ArrayList arrayList = new ArrayList(this.f5942b);
            int i2 = this.f5946f.get();
            ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                AbstractC1079f.b bVar = (AbstractC1079f.b) obj;
                if (!this.f5945e || !this.f5941a.mo6747g() || this.f5946f.get() != i2) {
                    break;
                } else if (!this.f5943c.contains(bVar)) {
                    bVar.mo6387a(bundle);
                }
            }
            this.f5943c.clear();
            this.f5947g = false;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m7180a(C1071a c1071a) {
        int i = 0;
        C1221aj.m7071a(Looper.myLooper() == this.f5948h.getLooper(), "onConnectionFailure must only be called on the Handler thread");
        this.f5948h.removeMessages(1);
        synchronized (this.f5949i) {
            ArrayList arrayList = new ArrayList(this.f5944d);
            int i2 = this.f5946f.get();
            ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                AbstractC1079f.c cVar = (AbstractC1079f.c) obj;
                if (!this.f5945e || this.f5946f.get() != i2) {
                    return;
                }
                if (this.f5944d.contains(cVar)) {
                    cVar.mo4766a(c1071a);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m7181a(AbstractC1079f.b bVar) {
        C1221aj.m7065a(bVar);
        synchronized (this.f5949i) {
            if (this.f5942b.contains(bVar)) {
                String strValueOf = String.valueOf(bVar);
                Log.w("GmsClientEvents", new StringBuilder(String.valueOf(strValueOf).length() + 62).append("registerConnectionCallbacks(): listener ").append(strValueOf).append(" is already registered").toString());
            } else {
                this.f5942b.add(bVar);
            }
        }
        if (this.f5941a.mo6747g()) {
            this.f5948h.sendMessage(this.f5948h.obtainMessage(1, bVar));
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m7182a(AbstractC1079f.c cVar) {
        C1221aj.m7065a(cVar);
        synchronized (this.f5949i) {
            if (this.f5944d.contains(cVar)) {
                String strValueOf = String.valueOf(cVar);
                Log.w("GmsClientEvents", new StringBuilder(String.valueOf(strValueOf).length() + 67).append("registerConnectionFailedListener(): listener ").append(strValueOf).append(" is already registered").toString());
            } else {
                this.f5944d.add(cVar);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m7183b() {
        this.f5945e = true;
    }

    /* JADX INFO: renamed from: b */
    public final void m7184b(AbstractC1079f.c cVar) {
        C1221aj.m7065a(cVar);
        synchronized (this.f5949i) {
            if (!this.f5944d.remove(cVar)) {
                String strValueOf = String.valueOf(cVar);
                Log.w("GmsClientEvents", new StringBuilder(String.valueOf(strValueOf).length() + 57).append("unregisterConnectionFailedListener(): listener ").append(strValueOf).append(" not found").toString());
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            Log.wtf("GmsClientEvents", new StringBuilder(45).append("Don't know how to handle message: ").append(message.what).toString(), new Exception());
            return false;
        }
        AbstractC1079f.b bVar = (AbstractC1079f.b) message.obj;
        synchronized (this.f5949i) {
            if (this.f5945e && this.f5941a.mo6747g() && this.f5942b.contains(bVar)) {
                bVar.mo6387a(this.f5941a.mo6746a());
            }
        }
        return true;
    }
}
