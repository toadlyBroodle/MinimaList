package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.api.AbstractC1079f;
import com.google.android.gms.common.api.AbstractC1080g;
import com.google.android.gms.common.api.AbstractC1195m;
import com.google.android.gms.common.api.AbstractC1196n;
import com.google.android.gms.common.api.AbstractC1197o;
import com.google.android.gms.common.api.InterfaceC1082i;
import com.google.android.gms.common.api.InterfaceC1193k;
import com.google.android.gms.common.api.InterfaceC1194l;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C1221aj;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.bz */
/* JADX INFO: loaded from: classes.dex */
public final class C1138bz<R extends InterfaceC1193k> extends AbstractC1197o<R> implements InterfaceC1194l<R> {

    /* JADX INFO: renamed from: a */
    private AbstractC1196n<? super R, ? extends InterfaceC1193k> f5685a;

    /* JADX INFO: renamed from: b */
    private C1138bz<? extends InterfaceC1193k> f5686b;

    /* JADX INFO: renamed from: c */
    private volatile AbstractC1195m<? super R> f5687c;

    /* JADX INFO: renamed from: d */
    private AbstractC1080g<R> f5688d;

    /* JADX INFO: renamed from: e */
    private final Object f5689e;

    /* JADX INFO: renamed from: f */
    private Status f5690f;

    /* JADX INFO: renamed from: g */
    private final WeakReference<AbstractC1079f> f5691g;

    /* JADX INFO: renamed from: h */
    private final HandlerC1141cb f5692h;

    /* JADX INFO: renamed from: i */
    private boolean f5693i;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m6907a(Status status) {
        synchronized (this.f5689e) {
            this.f5690f = status;
            m6912b(this.f5690f);
        }
    }

    /* JADX INFO: renamed from: b */
    private final void m6911b() {
        if (this.f5685a == null && this.f5687c == null) {
            return;
        }
        AbstractC1079f abstractC1079f = this.f5691g.get();
        if (!this.f5693i && this.f5685a != null && abstractC1079f != null) {
            abstractC1079f.mo6670a(this);
            this.f5693i = true;
        }
        if (this.f5690f != null) {
            m6912b(this.f5690f);
        } else if (this.f5688d != null) {
            this.f5688d.mo6696a(this);
        }
    }

    /* JADX INFO: renamed from: b */
    private final void m6912b(Status status) {
        synchronized (this.f5689e) {
            if (this.f5685a != null) {
                Status statusM7026a = this.f5685a.m7026a(status);
                C1221aj.m7066a(statusM7026a, "onFailure must not return null");
                this.f5686b.m6907a(statusM7026a);
            } else if (m6915c()) {
                this.f5687c.m7024a(status);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static void m6913b(InterfaceC1193k interfaceC1193k) {
        if (interfaceC1193k instanceof InterfaceC1082i) {
            try {
                ((InterfaceC1082i) interfaceC1193k).mo6702a();
            } catch (RuntimeException e) {
                String strValueOf = String.valueOf(interfaceC1193k);
                Log.w("TransformedResultImpl", new StringBuilder(String.valueOf(strValueOf).length() + 18).append("Unable to release ").append(strValueOf).toString(), e);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private final boolean m6915c() {
        return (this.f5687c == null || this.f5691g.get() == null) ? false : true;
    }

    /* JADX INFO: renamed from: a */
    final void m6918a() {
        this.f5687c = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final void m6919a(AbstractC1080g<?> abstractC1080g) {
        synchronized (this.f5689e) {
            this.f5688d = abstractC1080g;
            m6911b();
        }
    }

    @Override // com.google.android.gms.common.api.InterfaceC1194l
    /* JADX INFO: renamed from: a */
    public final void mo4791a(R r) {
        synchronized (this.f5689e) {
            if (!r.mo6094a().m6626d()) {
                m6907a(r.mo6094a());
                m6913b(r);
            } else if (this.f5685a != null) {
                C1126bn.m6892a().submit(new RunnableC1140ca(this, r));
            } else if (m6915c()) {
                this.f5687c.m7025b(r);
            }
        }
    }
}
