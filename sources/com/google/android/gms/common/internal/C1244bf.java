package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.C1071a;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.bf */
/* JADX INFO: loaded from: classes.dex */
public final class C1244bf extends AbstractC1234aw {

    /* JADX INFO: renamed from: a */
    private IBinder f5900a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ AbstractC1233av f5901b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1244bf(AbstractC1233av abstractC1233av, int i, IBinder iBinder, Bundle bundle) {
        super(abstractC1233av, i, bundle);
        this.f5901b = abstractC1233av;
        this.f5900a = iBinder;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1234aw
    /* JADX INFO: renamed from: a */
    protected final void mo7133a(C1071a c1071a) {
        if (this.f5901b.f5883v != null) {
            this.f5901b.f5883v.mo7138a(c1071a);
        }
        this.f5901b.mo7111a(c1071a);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1234aw
    /* JADX INFO: renamed from: a */
    protected final boolean mo7135a() {
        try {
            String interfaceDescriptor = this.f5900a.getInterfaceDescriptor();
            if (!this.f5901b.mo6167b().equals(interfaceDescriptor)) {
                String strMo6167b = this.f5901b.mo6167b();
                Log.e("GmsClient", new StringBuilder(String.valueOf(strMo6167b).length() + 34 + String.valueOf(interfaceDescriptor).length()).append("service descriptor mismatch: ").append(strMo6167b).append(" vs. ").append(interfaceDescriptor).toString());
                return false;
            }
            IInterface iInterfaceMo6166a = this.f5901b.mo6166a(this.f5900a);
            if (iInterfaceMo6166a == null) {
                return false;
            }
            if (!this.f5901b.m7095a(2, 4, iInterfaceMo6166a) && !this.f5901b.m7095a(3, 4, iInterfaceMo6166a)) {
                return false;
            }
            this.f5901b.f5886y = null;
            Bundle bundleMo6746a = this.f5901b.mo6746a();
            if (this.f5901b.f5882u != null) {
                this.f5901b.f5882u.mo7137a(bundleMo6746a);
            }
            return true;
        } catch (RemoteException e) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
