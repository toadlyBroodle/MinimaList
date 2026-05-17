package com.google.firebase.iid;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.common.stats.C1290a;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.google.firebase.iid.m */
/* JADX INFO: loaded from: classes.dex */
final class ServiceConnectionC2301m implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    int f13024a;

    /* JADX INFO: renamed from: b */
    final Messenger f13025b;

    /* JADX INFO: renamed from: c */
    C2306r f13026c;

    /* JADX INFO: renamed from: d */
    final Queue<AbstractC2308t<?>> f13027d;

    /* JADX INFO: renamed from: e */
    final SparseArray<AbstractC2308t<?>> f13028e;

    /* JADX INFO: renamed from: f */
    final /* synthetic */ C2299k f13029f;

    private ServiceConnectionC2301m(C2299k c2299k) {
        this.f13029f = c2299k;
        this.f13024a = 0;
        this.f13025b = new Messenger(new Handler(Looper.getMainLooper(), new Handler.Callback(this) { // from class: com.google.firebase.iid.n

            /* JADX INFO: renamed from: a */
            private final ServiceConnectionC2301m f13030a;

            {
                this.f13030a = this;
            }

            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f13030a.m13093a(message);
            }
        }));
        this.f13027d = new ArrayDeque();
        this.f13028e = new SparseArray<>();
    }

    /* JADX INFO: renamed from: a */
    private final void m13088a(C2309u c2309u) {
        Iterator<AbstractC2308t<?>> it = this.f13027d.iterator();
        while (it.hasNext()) {
            it.next().m13099a(c2309u);
        }
        this.f13027d.clear();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.f13028e.size()) {
                this.f13028e.clear();
                return;
            } else {
                this.f13028e.valueAt(i2).m13099a(c2309u);
                i = i2 + 1;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private final void m13089c() {
        this.f13029f.f13021c.execute(new Runnable(this) { // from class: com.google.firebase.iid.p

            /* JADX INFO: renamed from: a */
            private final ServiceConnectionC2301m f13032a;

            {
                this.f13032a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final AbstractC2308t<?> abstractC2308tPoll;
                final ServiceConnectionC2301m serviceConnectionC2301m = this.f13032a;
                while (true) {
                    synchronized (serviceConnectionC2301m) {
                        if (serviceConnectionC2301m.f13024a != 2) {
                            return;
                        }
                        if (serviceConnectionC2301m.f13027d.isEmpty()) {
                            serviceConnectionC2301m.m13090a();
                            return;
                        } else {
                            abstractC2308tPoll = serviceConnectionC2301m.f13027d.poll();
                            serviceConnectionC2301m.f13028e.put(abstractC2308tPoll.f13037a, abstractC2308tPoll);
                            serviceConnectionC2301m.f13029f.f13021c.schedule(new Runnable(serviceConnectionC2301m, abstractC2308tPoll) { // from class: com.google.firebase.iid.q

                                /* JADX INFO: renamed from: a */
                                private final ServiceConnectionC2301m f13033a;

                                /* JADX INFO: renamed from: b */
                                private final AbstractC2308t f13034b;

                                {
                                    this.f13033a = serviceConnectionC2301m;
                                    this.f13034b = abstractC2308tPoll;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    this.f13033a.m13091a(this.f13034b.f13037a);
                                }
                            }, 30L, TimeUnit.SECONDS);
                        }
                    }
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        String strValueOf = String.valueOf(abstractC2308tPoll);
                        Log.d("MessengerIpcClient", new StringBuilder(String.valueOf(strValueOf).length() + 8).append("Sending ").append(strValueOf).toString());
                    }
                    Context context = serviceConnectionC2301m.f13029f.f13020b;
                    Messenger messenger = serviceConnectionC2301m.f13025b;
                    Message messageObtain = Message.obtain();
                    messageObtain.what = abstractC2308tPoll.f13039c;
                    messageObtain.arg1 = abstractC2308tPoll.f13037a;
                    messageObtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", abstractC2308tPoll.mo13098a());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", abstractC2308tPoll.f13040d);
                    messageObtain.setData(bundle);
                    try {
                        serviceConnectionC2301m.f13026c.m13096a(messageObtain);
                    } catch (RemoteException e) {
                        serviceConnectionC2301m.m13092a(2, e.getMessage());
                    }
                }
            }
        });
    }

    /* JADX INFO: renamed from: a */
    final synchronized void m13090a() {
        if (this.f13024a == 2 && this.f13027d.isEmpty() && this.f13028e.size() == 0) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
            }
            this.f13024a = 3;
            C1290a.m7240a();
            this.f13029f.f13020b.unbindService(this);
        }
    }

    /* JADX INFO: renamed from: a */
    final synchronized void m13091a(int i) {
        AbstractC2308t<?> abstractC2308t = this.f13028e.get(i);
        if (abstractC2308t != null) {
            Log.w("MessengerIpcClient", new StringBuilder(31).append("Timing out request: ").append(i).toString());
            this.f13028e.remove(i);
            abstractC2308t.m13099a(new C2309u(3, "Timed out waiting for response"));
            m13090a();
        }
    }

    /* JADX INFO: renamed from: a */
    final synchronized void m13092a(int i, String str) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String strValueOf = String.valueOf(str);
            Log.d("MessengerIpcClient", strValueOf.length() != 0 ? "Disconnected: ".concat(strValueOf) : new String("Disconnected: "));
        }
        switch (this.f13024a) {
            case 0:
                throw new IllegalStateException();
            case 1:
            case 2:
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Unbinding service");
                }
                this.f13024a = 4;
                C1290a.m7240a();
                this.f13029f.f13020b.unbindService(this);
                m13088a(new C2309u(i, str));
                break;
            case 3:
                this.f13024a = 4;
                break;
            case 4:
                break;
            default:
                throw new IllegalStateException(new StringBuilder(26).append("Unknown state: ").append(this.f13024a).toString());
        }
    }

    /* JADX INFO: renamed from: a */
    final boolean m13093a(Message message) {
        int i = message.arg1;
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", new StringBuilder(41).append("Received response to request: ").append(i).toString());
        }
        synchronized (this) {
            AbstractC2308t<?> abstractC2308t = this.f13028e.get(i);
            if (abstractC2308t == null) {
                Log.w("MessengerIpcClient", new StringBuilder(50).append("Received response for unknown request: ").append(i).toString());
            } else {
                this.f13028e.remove(i);
                m13090a();
                Bundle data = message.getData();
                if (data.getBoolean("unsupported", false)) {
                    abstractC2308t.m13099a(new C2309u(4, "Not supported by GmsCore"));
                } else {
                    abstractC2308t.mo13097a(data);
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    final synchronized boolean m13094a(AbstractC2308t abstractC2308t) {
        boolean z = true;
        synchronized (this) {
            switch (this.f13024a) {
                case 0:
                    this.f13027d.add(abstractC2308t);
                    C1221aj.m7070a(this.f13024a == 0);
                    if (Log.isLoggable("MessengerIpcClient", 2)) {
                        Log.v("MessengerIpcClient", "Starting bind to GmsCore");
                    }
                    this.f13024a = 1;
                    Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                    intent.setPackage("com.google.android.gms");
                    if (!C1290a.m7240a().m7241a(this.f13029f.f13020b, intent, this, 1)) {
                        m13092a(0, "Unable to bind to service");
                    } else {
                        this.f13029f.f13021c.schedule(new Runnable(this) { // from class: com.google.firebase.iid.o

                            /* JADX INFO: renamed from: a */
                            private final ServiceConnectionC2301m f13031a;

                            {
                                this.f13031a = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f13031a.m13095b();
                            }
                        }, 30L, TimeUnit.SECONDS);
                    }
                    break;
                case 1:
                    this.f13027d.add(abstractC2308t);
                    break;
                case 2:
                    this.f13027d.add(abstractC2308t);
                    m13089c();
                    break;
                case 3:
                case 4:
                    z = false;
                    break;
                default:
                    throw new IllegalStateException(new StringBuilder(26).append("Unknown state: ").append(this.f13024a).toString());
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: b */
    final synchronized void m13095b() {
        if (this.f13024a == 1) {
            m13092a(1, "Timed out while binding");
        }
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        if (iBinder == null) {
            m13092a(0, "Null service connection");
        } else {
            try {
                this.f13026c = new C2306r(iBinder);
                this.f13024a = 2;
                m13089c();
            } catch (RemoteException e) {
                m13092a(0, e.getMessage());
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        m13092a(2, "Service disconnected");
    }
}
