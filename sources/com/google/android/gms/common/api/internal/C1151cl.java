package com.google.android.gms.common.api.internal;

import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.C1071a;
import com.google.android.gms.common.api.AbstractC1079f;
import com.google.android.gms.common.internal.C1221aj;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.cl */
/* JADX INFO: loaded from: classes.dex */
public class C1151cl extends AbstractDialogInterfaceOnCancelListenerC1157cr {

    /* JADX INFO: renamed from: e */
    private final SparseArray<a> f5714e;

    /* JADX INFO: renamed from: com.google.android.gms.common.api.internal.cl$a */
    class a implements AbstractC1079f.c {

        /* JADX INFO: renamed from: a */
        public final int f5715a;

        /* JADX INFO: renamed from: b */
        public final AbstractC1079f f5716b;

        /* JADX INFO: renamed from: c */
        public final AbstractC1079f.c f5717c;

        public a(int i, AbstractC1079f abstractC1079f, AbstractC1079f.c cVar) {
            this.f5715a = i;
            this.f5716b = abstractC1079f;
            this.f5717c = cVar;
            abstractC1079f.mo6669a(this);
        }

        @Override // com.google.android.gms.common.api.AbstractC1079f.c
        /* JADX INFO: renamed from: a */
        public final void mo4766a(C1071a c1071a) {
            String strValueOf = String.valueOf(c1071a);
            Log.d("AutoManageHelper", new StringBuilder(String.valueOf(strValueOf).length() + 27).append("beginFailureResolution for ").append(strValueOf).toString());
            C1151cl.this.m6951b(c1071a, this.f5715a);
        }
    }

    private C1151cl(InterfaceC1117be interfaceC1117be) {
        super(interfaceC1117be);
        this.f5714e = new SparseArray<>();
        this.f5519a.mo6883a("AutoManageHelper", this);
    }

    /* JADX INFO: renamed from: b */
    private final a m6930b(int i) {
        if (this.f5714e.size() <= i) {
            return null;
        }
        return this.f5714e.get(this.f5714e.keyAt(i));
    }

    /* JADX INFO: renamed from: b */
    public static C1151cl m6931b(C1116bd c1116bd) {
        InterfaceC1117be interfaceC1117beA = m6715a(c1116bd);
        C1151cl c1151cl = (C1151cl) interfaceC1117beA.mo6882a("AutoManageHelper", C1151cl.class);
        return c1151cl != null ? c1151cl : new C1151cl(interfaceC1117beA);
    }

    /* JADX INFO: renamed from: a */
    public final void m6932a(int i) {
        a aVar = this.f5714e.get(i);
        this.f5714e.remove(i);
        if (aVar != null) {
            aVar.f5716b.mo6675b(aVar);
            aVar.f5716b.mo6681g();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m6933a(int i, AbstractC1079f abstractC1079f, AbstractC1079f.c cVar) {
        C1221aj.m7066a(abstractC1079f, "GoogleApiClient instance cannot be null");
        C1221aj.m7071a(this.f5714e.indexOfKey(i) < 0, new StringBuilder(54).append("Already managing a GoogleApiClient with id ").append(i).toString());
        C1158cs c1158cs = this.f5732c.get();
        boolean z = this.f5731b;
        String strValueOf = String.valueOf(c1158cs);
        Log.d("AutoManageHelper", new StringBuilder(String.valueOf(strValueOf).length() + 49).append("starting AutoManage for client ").append(i).append(" ").append(z).append(" ").append(strValueOf).toString());
        this.f5714e.put(i, new a(i, abstractC1079f, cVar));
        if (this.f5731b && c1158cs == null) {
            String strValueOf2 = String.valueOf(abstractC1079f);
            Log.d("AutoManageHelper", new StringBuilder(String.valueOf(strValueOf2).length() + 11).append("connecting ").append(strValueOf2).toString());
            abstractC1079f.mo6679e();
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractDialogInterfaceOnCancelListenerC1157cr
    /* JADX INFO: renamed from: a */
    protected final void mo6934a(C1071a c1071a, int i) {
        Log.w("AutoManageHelper", "Unresolved error while connecting client. Stopping auto-manage.");
        if (i < 0) {
            Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
            return;
        }
        a aVar = this.f5714e.get(i);
        if (aVar != null) {
            m6932a(i);
            AbstractC1079f.c cVar = aVar.f5717c;
            if (cVar != null) {
                cVar.mo4766a(c1071a);
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* JADX INFO: renamed from: a */
    public final void mo6719a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        for (int i = 0; i < this.f5714e.size(); i++) {
            a aVarM6930b = m6930b(i);
            if (aVarM6930b != null) {
                printWriter.append((CharSequence) str).append("GoogleApiClient #").print(aVarM6930b.f5715a);
                printWriter.println(":");
                aVarM6930b.f5716b.mo6671a(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractDialogInterfaceOnCancelListenerC1157cr, com.google.android.gms.common.api.internal.LifecycleCallback
    /* JADX INFO: renamed from: b */
    public final void mo6720b() {
        super.mo6720b();
        boolean z = this.f5731b;
        String strValueOf = String.valueOf(this.f5714e);
        Log.d("AutoManageHelper", new StringBuilder(String.valueOf(strValueOf).length() + 14).append("onStart ").append(z).append(" ").append(strValueOf).toString());
        if (this.f5732c.get() == null) {
            for (int i = 0; i < this.f5714e.size(); i++) {
                a aVarM6930b = m6930b(i);
                if (aVarM6930b != null) {
                    aVarM6930b.f5716b.mo6679e();
                }
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractDialogInterfaceOnCancelListenerC1157cr, com.google.android.gms.common.api.internal.LifecycleCallback
    /* JADX INFO: renamed from: d */
    public final void mo6250d() {
        super.mo6250d();
        for (int i = 0; i < this.f5714e.size(); i++) {
            a aVarM6930b = m6930b(i);
            if (aVarM6930b != null) {
                aVarM6930b.f5716b.mo6681g();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractDialogInterfaceOnCancelListenerC1157cr
    /* JADX INFO: renamed from: f */
    protected final void mo6935f() {
        for (int i = 0; i < this.f5714e.size(); i++) {
            a aVarM6930b = m6930b(i);
            if (aVarM6930b != null) {
                aVarM6930b.f5716b.mo6679e();
            }
        }
    }
}
