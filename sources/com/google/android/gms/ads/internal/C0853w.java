package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.gmsg.InterfaceC0748aa;
import com.google.android.gms.internal.C1560fm;
import com.google.android.gms.internal.InterfaceC1758mv;
import com.google.android.gms.internal.civ;
import com.google.android.gms.internal.ciy;
import com.google.android.gms.p043a.BinderC0654c;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.w */
/* JADX INFO: loaded from: classes.dex */
final class C0853w implements InterfaceC0748aa<InterfaceC1758mv> {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ civ f4856a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ C0738c f4857b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ ciy f4858c;

    C0853w(civ civVar, C0738c c0738c, ciy ciyVar) {
        this.f4856a = civVar;
        this.f4857b = c0738c;
        this.f4858c = ciyVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.ads.internal.gmsg.InterfaceC0748aa
    public final /* synthetic */ void zza(InterfaceC1758mv interfaceC1758mv, Map map) {
        InterfaceC1758mv interfaceC1758mv2 = interfaceC1758mv;
        if (interfaceC1758mv2 == 0) {
            throw null;
        }
        View view = (View) interfaceC1758mv2;
        if (view != null) {
            try {
                if (this.f4856a != null) {
                    if (this.f4856a.mo10980k()) {
                        C0848r.m5817b(interfaceC1758mv2);
                    } else {
                        this.f4856a.mo10968a(BinderC0654c.m5329a(view));
                        this.f4857b.f4589a.mo5308e();
                    }
                } else if (this.f4858c != null) {
                    if (this.f4858c.mo10998i()) {
                        C0848r.m5817b(interfaceC1758mv2);
                    } else {
                        this.f4858c.mo10988a(BinderC0654c.m5329a(view));
                        this.f4857b.f4589a.mo5308e();
                    }
                }
            } catch (RemoteException e) {
                C1560fm.m11613c("Unable to call handleClick on mapper", e);
            }
        }
    }
}
