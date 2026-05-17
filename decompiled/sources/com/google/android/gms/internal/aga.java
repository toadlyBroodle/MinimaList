package com.google.android.gms.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.internal.C0959x;
import com.google.android.gms.common.api.AbstractC1079f;
import com.google.android.gms.common.internal.AbstractC1256c;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.common.internal.C1222ak;
import com.google.android.gms.common.internal.C1243be;
import com.google.android.gms.common.internal.C1248bj;
import com.google.android.gms.common.internal.InterfaceC1268o;

/* JADX INFO: loaded from: classes.dex */
public final class aga extends AbstractC1256c<afy> implements afq {

    /* JADX INFO: renamed from: d */
    private final boolean f6678d;

    /* JADX INFO: renamed from: e */
    private final C1248bj f6679e;

    /* JADX INFO: renamed from: f */
    private final Bundle f6680f;

    /* JADX INFO: renamed from: g */
    private Integer f6681g;

    private aga(Context context, Looper looper, boolean z, C1248bj c1248bj, Bundle bundle, AbstractC1079f.b bVar, AbstractC1079f.c cVar) {
        super(context, looper, 44, c1248bj, bVar, cVar);
        this.f6678d = true;
        this.f6679e = c1248bj;
        this.f6680f = bundle;
        this.f6681g = c1248bj.m7157j();
    }

    public aga(Context context, Looper looper, boolean z, C1248bj c1248bj, afr afrVar, AbstractC1079f.b bVar, AbstractC1079f.c cVar) {
        this(context, looper, true, c1248bj, m7833a(c1248bj), bVar, cVar);
    }

    /* JADX INFO: renamed from: a */
    public static Bundle m7833a(C1248bj c1248bj) {
        afr afrVarM7156i = c1248bj.m7156i();
        Integer numM7157j = c1248bj.m7157j();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", c1248bj.m7149b());
        if (numM7157j != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", numM7157j.intValue());
        }
        if (afrVarM7156i != null) {
            bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", afrVarM7156i.m7822a());
            bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", afrVarM7156i.m7823b());
            bundle.putString("com.google.android.gms.signin.internal.serverClientId", afrVarM7156i.m7824c());
            bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
            bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", afrVarM7156i.m7825d());
            bundle.putString("com.google.android.gms.signin.internal.hostedDomain", afrVarM7156i.m7826e());
            bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", afrVarM7156i.m7827f());
            if (afrVarM7156i.m7828g() != null) {
                bundle.putLong("com.google.android.gms.signin.internal.authApiSignInModuleVersion", afrVarM7156i.m7828g().longValue());
            }
            if (afrVarM7156i.m7829h() != null) {
                bundle.putLong("com.google.android.gms.signin.internal.realClientLibraryVersion", afrVarM7156i.m7829h().longValue());
            }
        }
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1233av
    /* JADX INFO: renamed from: a */
    protected final /* synthetic */ IInterface mo6166a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof afy ? (afy) iInterfaceQueryLocalInterface : new afz(iBinder);
    }

    @Override // com.google.android.gms.internal.afq
    /* JADX INFO: renamed from: a */
    public final void mo7818a(InterfaceC1268o interfaceC1268o, boolean z) {
        try {
            ((afy) m7131w()).mo7831a(interfaceC1268o, this.f6681g.intValue(), z);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
        }
    }

    @Override // com.google.android.gms.internal.afq
    /* JADX INFO: renamed from: a */
    public final void mo7819a(afw afwVar) {
        C1221aj.m7066a(afwVar, "Expecting a valid ISignInCallbacks");
        try {
            Account accountM7150c = this.f6679e.m7150c();
            ((afy) m7131w()).mo7832a(new agb(new C1222ak(accountM7150c, this.f6681g.intValue(), "<<default account>>".equals(accountM7150c.name) ? C0959x.m6194a(m7127s()).m6199a() : null)), afwVar);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                afwVar.mo6899a(new agd(8));
            } catch (RemoteException e2) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC1233av
    /* JADX INFO: renamed from: b */
    protected final String mo6167b() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.internal.afq
    /* JADX INFO: renamed from: e */
    public final void mo7820e() {
        try {
            ((afy) m7131w()).mo7830a(this.f6681g.intValue());
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC1233av, com.google.android.gms.common.api.C1074a.f
    /* JADX INFO: renamed from: i */
    public final boolean mo6643i() {
        return this.f6678d;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1233av
    /* JADX INFO: renamed from: j_ */
    protected final String mo6171j_() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // com.google.android.gms.internal.afq
    /* JADX INFO: renamed from: m */
    public final void mo7821m() {
        m7112a(new C1243be(this));
    }

    @Override // com.google.android.gms.common.internal.AbstractC1233av
    /* JADX INFO: renamed from: u */
    protected final Bundle mo7129u() {
        if (!m7127s().getPackageName().equals(this.f6679e.m7154g())) {
            this.f6680f.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f6679e.m7154g());
        }
        return this.f6680f;
    }
}
