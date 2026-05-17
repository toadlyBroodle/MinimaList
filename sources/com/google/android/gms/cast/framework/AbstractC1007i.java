package com.google.android.gms.cast.framework;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.p043a.InterfaceC0652a;

/* JADX INFO: renamed from: com.google.android.gms.cast.framework.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1007i {

    /* JADX INFO: renamed from: a */
    private final Context f5265a;

    /* JADX INFO: renamed from: b */
    private final String f5266b;

    /* JADX INFO: renamed from: c */
    private final a f5267c = new a();

    /* JADX INFO: renamed from: com.google.android.gms.cast.framework.i$a */
    class a extends AbstractBinderC1008j {
        private a() {
        }

        @Override // com.google.android.gms.cast.framework.InterfaceC0999af
        /* JADX INFO: renamed from: a */
        public final InterfaceC0652a mo6351a(String str) {
            AbstractC1005g abstractC1005gMo6407a = AbstractC1007i.this.mo6407a(str);
            if (abstractC1005gMo6407a == null) {
                return null;
            }
            return abstractC1005gMo6407a.m6395g();
        }

        @Override // com.google.android.gms.cast.framework.InterfaceC0999af
        /* JADX INFO: renamed from: a */
        public final boolean mo6352a() {
            return AbstractC1007i.this.mo6409c();
        }

        @Override // com.google.android.gms.cast.framework.InterfaceC0999af
        /* JADX INFO: renamed from: b */
        public final String mo6353b() {
            return AbstractC1007i.this.m6408b();
        }
    }

    protected AbstractC1007i(Context context, String str) {
        this.f5265a = ((Context) C1221aj.m7065a(context)).getApplicationContext();
        this.f5266b = C1221aj.m7067a(str);
    }

    /* JADX INFO: renamed from: a */
    public final Context m6406a() {
        return this.f5265a;
    }

    /* JADX INFO: renamed from: a */
    public abstract AbstractC1005g mo6407a(String str);

    /* JADX INFO: renamed from: b */
    public final String m6408b() {
        return this.f5266b;
    }

    /* JADX INFO: renamed from: c */
    public abstract boolean mo6409c();

    /* JADX INFO: renamed from: d */
    public final IBinder m6410d() {
        return this.f5267c;
    }
}
