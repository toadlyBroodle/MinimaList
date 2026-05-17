package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.support.design.C0025a;
import android.text.TextUtils;
import com.google.android.gms.common.api.AbstractC1079f;
import com.google.android.gms.common.internal.AbstractC1256c;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.common.internal.C1248bj;
import com.google.android.gms.dynamite.DynamiteModule;

/* JADX INFO: loaded from: classes.dex */
public final class azd extends AbstractC1256c<azh> implements azc {

    /* JADX INFO: renamed from: d */
    private static C2032wz f7604d = new C2032wz("FirebaseAuth", "FirebaseAuth:");

    /* JADX INFO: renamed from: e */
    private final Context f7605e;

    /* JADX INFO: renamed from: f */
    private final azl f7606f;

    public azd(Context context, Looper looper, C1248bj c1248bj, azl azlVar, AbstractC1079f.b bVar, AbstractC1079f.c cVar) {
        super(context, looper, C0025a.j.AppCompatTheme_windowFixedHeightMajor, c1248bj, bVar, cVar);
        this.f7605e = (Context) C1221aj.m7065a(context);
        this.f7606f = azlVar;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1233av
    /* JADX INFO: renamed from: a */
    protected final /* synthetic */ IInterface mo6166a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthService");
        return iInterfaceQueryLocalInterface instanceof azh ? (azh) iInterfaceQueryLocalInterface : new azi(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1233av
    /* JADX INFO: renamed from: b */
    protected final String mo6167b() {
        return "com.google.firebase.auth.api.internal.IFirebaseAuthService";
    }

    @Override // com.google.android.gms.internal.azc
    /* JADX INFO: renamed from: e */
    public final /* synthetic */ azh mo8711e() {
        return (azh) super.m7131w();
    }

    @Override // com.google.android.gms.common.internal.AbstractC1233av, com.google.android.gms.common.api.C1074a.f
    /* JADX INFO: renamed from: j */
    public final boolean mo6644j() {
        return DynamiteModule.m7325a(this.f7605e, "com.google.firebase.auth") == 0;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1233av
    /* JADX INFO: renamed from: j_ */
    protected final String mo6171j_() {
        return "com.google.firebase.auth.api.gms.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1233av
    /* JADX INFO: renamed from: q */
    protected final String mo7125q() {
        String strM8751a;
        strM8751a = azz.m8751a("firebear.preference");
        if (TextUtils.isEmpty(strM8751a)) {
            strM8751a = "default";
        }
        switch (strM8751a) {
            case "local":
            case "default":
                break;
            default:
                strM8751a = "default";
                break;
        }
        switch (strM8751a) {
            case "local":
                f7604d.m12551c("Loading fallback module override.", new Object[0]);
                break;
            default:
                f7604d.m12551c("Loading module via FirebaseOptions.", new Object[0]);
                if (!this.f7606f.f7586a) {
                    f7604d.m12551c("Preparing to create service connection to gms implementation", new Object[0]);
                    break;
                } else {
                    f7604d.m12551c("Preparing to create service connection to fallback implementation", new Object[0]);
                    break;
                }
                break;
        }
        return this.f7605e.getPackageName();
    }

    @Override // com.google.android.gms.common.internal.AbstractC1233av
    /* JADX INFO: renamed from: u */
    protected final Bundle mo7129u() {
        Bundle bundleU = super.mo7129u();
        if (bundleU == null) {
            bundleU = new Bundle();
        }
        if (this.f7606f != null) {
            bundleU.putString("com.google.firebase.auth.API_KEY", this.f7606f.m8735b());
        }
        return bundleU;
    }
}
