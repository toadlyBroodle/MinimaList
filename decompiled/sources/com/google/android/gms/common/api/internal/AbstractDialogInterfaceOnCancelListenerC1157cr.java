package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.C1071a;
import com.google.android.gms.common.C1204c;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.cr */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractDialogInterfaceOnCancelListenerC1157cr extends LifecycleCallback implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: b */
    protected volatile boolean f5731b;

    /* JADX INFO: renamed from: c */
    protected final AtomicReference<C1158cs> f5732c;

    /* JADX INFO: renamed from: d */
    protected final C1204c f5733d;

    /* JADX INFO: renamed from: e */
    private final Handler f5734e;

    protected AbstractDialogInterfaceOnCancelListenerC1157cr(InterfaceC1117be interfaceC1117be) {
        this(interfaceC1117be, C1204c.m7035a());
    }

    private AbstractDialogInterfaceOnCancelListenerC1157cr(InterfaceC1117be interfaceC1117be, C1204c c1204c) {
        super(interfaceC1117be);
        this.f5732c = new AtomicReference<>(null);
        this.f5734e = new Handler(Looper.getMainLooper());
        this.f5733d = c1204c;
    }

    /* JADX INFO: renamed from: a */
    private static int m6950a(C1158cs c1158cs) {
        if (c1158cs == null) {
            return -1;
        }
        return c1158cs.m6953a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0011  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0014  */
    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo6717a(int i, int i2, Intent intent) {
        boolean z;
        C1158cs c1158cs = this.f5732c.get();
        switch (i) {
            case 1:
                if (i2 == -1) {
                    z = true;
                } else if (i2 == 0) {
                    C1158cs c1158cs2 = new C1158cs(new C1071a(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null), m6950a(c1158cs));
                    this.f5732c.set(c1158cs2);
                    c1158cs = c1158cs2;
                    z = false;
                } else {
                    z = false;
                }
                if (!z) {
                    m6952h();
                } else if (c1158cs != null) {
                    mo6934a(c1158cs.m6954b(), c1158cs.m6953a());
                }
                break;
            case 2:
                int iMo7040a = this.f5733d.mo7040a(m6716a());
                z = iMo7040a == 0;
                if (c1158cs != null) {
                    if (c1158cs.m6954b().m6613c() == 18 && iMo7040a == 18) {
                    }
                    if (!z) {
                    }
                }
                break;
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* JADX INFO: renamed from: a */
    public final void mo6718a(Bundle bundle) {
        super.mo6718a(bundle);
        if (bundle != null) {
            this.f5732c.set(bundle.getBoolean("resolving_error", false) ? new C1158cs(new C1071a(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    /* JADX INFO: renamed from: a */
    protected abstract void mo6934a(C1071a c1071a, int i);

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* JADX INFO: renamed from: b */
    public void mo6720b() {
        super.mo6720b();
        this.f5731b = true;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* JADX INFO: renamed from: b */
    public final void mo6721b(Bundle bundle) {
        super.mo6721b(bundle);
        C1158cs c1158cs = this.f5732c.get();
        if (c1158cs != null) {
            bundle.putBoolean("resolving_error", true);
            bundle.putInt("failed_client_id", c1158cs.m6953a());
            bundle.putInt("failed_status", c1158cs.m6954b().m6613c());
            bundle.putParcelable("failed_resolution", c1158cs.m6954b().m6614d());
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m6951b(C1071a c1071a, int i) {
        C1158cs c1158cs = new C1158cs(c1071a, i);
        if (this.f5732c.compareAndSet(null, c1158cs)) {
            this.f5734e.post(new RunnableC1159ct(this, c1158cs));
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* JADX INFO: renamed from: d */
    public void mo6250d() {
        super.mo6250d();
        this.f5731b = false;
    }

    /* JADX INFO: renamed from: f */
    protected abstract void mo6935f();

    /* JADX INFO: renamed from: h */
    protected final void m6952h() {
        this.f5732c.set(null);
        mo6935f();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        mo6934a(new C1071a(13, null), m6950a(this.f5732c.get()));
        m6952h();
    }
}
