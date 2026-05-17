package com.google.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.C0657a;
import com.google.android.gms.ads.C0663b;
import com.google.android.gms.ads.C0676c;
import com.google.android.gms.ads.C0681d;
import com.google.android.gms.ads.C0684e;
import com.google.android.gms.ads.C0687h;
import com.google.android.gms.ads.C0688i;
import com.google.android.gms.ads.mediation.C0874g;
import com.google.android.gms.ads.mediation.C0875h;
import com.google.android.gms.ads.mediation.InterfaceC0860a;
import com.google.android.gms.ads.mediation.InterfaceC0861b;
import com.google.android.gms.ads.mediation.InterfaceC0862c;
import com.google.android.gms.ads.mediation.InterfaceC0871d;
import com.google.android.gms.ads.mediation.InterfaceC0872e;
import com.google.android.gms.ads.mediation.InterfaceC0876i;
import com.google.android.gms.ads.mediation.InterfaceC0878k;
import com.google.android.gms.ads.mediation.InterfaceC0879l;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.p044a.InterfaceC0658a;
import com.google.android.gms.ads.p045b.AbstractC0670g;
import com.google.android.gms.ads.p045b.AbstractC0671h;
import com.google.android.gms.ads.p045b.C0667d;
import com.google.android.gms.ads.p045b.C0668e;
import com.google.android.gms.ads.p045b.C0669f;
import com.google.android.gms.ads.p045b.InterfaceC0672i;
import com.google.android.gms.ads.reward.InterfaceC0881b;
import com.google.android.gms.ads.reward.mediation.InterfaceC0882a;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.internal.C1657jb;
import com.google.android.gms.internal.C1668jm;
import com.google.android.gms.internal.bws;
import com.google.android.gms.internal.bxm;
import com.google.android.gms.internal.byx;
import com.google.android.gms.internal.cnb;
import com.google.android.gms.internal.zzapc;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@cnb
public abstract class AbstractAdViewAdapter implements com.google.android.gms.ads.mediation.MediationBannerAdapter, MediationNativeAdapter, InterfaceC0878k, InterfaceC0879l, MediationRewardedVideoAdAdapter, zzapc {
    public static final String AD_UNIT_ID_PARAMETER = "pubid";
    private C0684e zzgt;
    private C0687h zzgu;
    private C0663b zzgv;
    private Context zzgw;
    private C0687h zzgx;
    private InterfaceC0882a zzgy;
    private InterfaceC0881b zzgz = new C0650g(this);

    /* JADX INFO: renamed from: com.google.ads.mediation.AbstractAdViewAdapter$a */
    static class C0633a extends C0874g {

        /* JADX INFO: renamed from: e */
        private final AbstractC0670g f4302e;

        public C0633a(AbstractC0670g abstractC0670g) {
            this.f4302e = abstractC0670g;
            m5884a(abstractC0670g.mo5366b().toString());
            m5885a(abstractC0670g.mo5367c());
            m5886b(abstractC0670g.mo5368d().toString());
            m5883a(abstractC0670g.mo5369e());
            m5887c(abstractC0670g.mo5370f().toString());
            if (abstractC0670g.mo5371g() != null) {
                m5882a(abstractC0670g.mo5371g().doubleValue());
            }
            if (abstractC0670g.mo5372h() != null) {
                m5888d(abstractC0670g.mo5372h().toString());
            }
            if (abstractC0670g.mo5373i() != null) {
                m5889e(abstractC0670g.mo5373i().toString());
            }
            m5870a(true);
            m5873b(true);
            m5869a(abstractC0670g.mo5374j());
        }

        @Override // com.google.android.gms.ads.mediation.C0873f
        /* JADX INFO: renamed from: a */
        public final void mo5302a(View view) {
            if (view instanceof C0668e) {
                ((C0668e) view).setNativeAd(this.f4302e);
            }
            C0669f c0669f = C0669f.f4357a.get(view);
            if (c0669f != null) {
                c0669f.m5365a(this.f4302e);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.ads.mediation.AbstractAdViewAdapter$b */
    static class C0634b extends C0875h {

        /* JADX INFO: renamed from: e */
        private final AbstractC0671h f4303e;

        public C0634b(AbstractC0671h abstractC0671h) {
            this.f4303e = abstractC0671h;
            m5899a(abstractC0671h.mo5375b().toString());
            m5900a(abstractC0671h.mo5376c());
            m5901b(abstractC0671h.mo5377d().toString());
            if (abstractC0671h.mo5378e() != null) {
                m5898a(abstractC0671h.mo5378e());
            }
            m5902c(abstractC0671h.mo5379f().toString());
            m5903d(abstractC0671h.mo5380g().toString());
            m5870a(true);
            m5873b(true);
            m5869a(abstractC0671h.mo5381h());
        }

        @Override // com.google.android.gms.ads.mediation.C0873f
        /* JADX INFO: renamed from: a */
        public final void mo5302a(View view) {
            if (view instanceof C0668e) {
                ((C0668e) view).setNativeAd(this.f4303e);
            }
            C0669f c0669f = C0669f.f4357a.get(view);
            if (c0669f != null) {
                c0669f.m5365a(this.f4303e);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.ads.mediation.AbstractAdViewAdapter$c */
    static final class C0635c extends C0657a implements InterfaceC0658a, bws {

        /* JADX INFO: renamed from: a */
        private AbstractAdViewAdapter f4304a;

        /* JADX INFO: renamed from: b */
        private InterfaceC0862c f4305b;

        public C0635c(AbstractAdViewAdapter abstractAdViewAdapter, InterfaceC0862c interfaceC0862c) {
            this.f4304a = abstractAdViewAdapter;
            this.f4305b = interfaceC0862c;
        }

        @Override // com.google.android.gms.ads.C0657a
        /* JADX INFO: renamed from: a */
        public final void mo4789a() {
            this.f4305b.mo5846c(this.f4304a);
        }

        @Override // com.google.android.gms.ads.C0657a
        /* JADX INFO: renamed from: a */
        public final void mo5303a(int i) {
            this.f4305b.mo5843a(this.f4304a, i);
        }

        @Override // com.google.android.gms.ads.p044a.InterfaceC0658a
        /* JADX INFO: renamed from: a */
        public final void mo5304a(String str, String str2) {
            this.f4305b.mo5844a(this.f4304a, str, str2);
        }

        @Override // com.google.android.gms.ads.C0657a
        /* JADX INFO: renamed from: b */
        public final void mo5305b() {
            this.f4305b.mo5842a(this.f4304a);
        }

        @Override // com.google.android.gms.ads.C0657a
        /* JADX INFO: renamed from: c */
        public final void mo5306c() {
            this.f4305b.mo5845b(this.f4304a);
        }

        @Override // com.google.android.gms.ads.C0657a
        /* JADX INFO: renamed from: d */
        public final void mo5307d() {
            this.f4305b.mo5847d(this.f4304a);
        }

        @Override // com.google.android.gms.ads.C0657a, com.google.android.gms.internal.bws
        /* JADX INFO: renamed from: e */
        public final void mo5308e() {
            this.f4305b.mo5848e(this.f4304a);
        }
    }

    /* JADX INFO: renamed from: com.google.ads.mediation.AbstractAdViewAdapter$d */
    static final class C0636d extends C0657a implements bws {

        /* JADX INFO: renamed from: a */
        private AbstractAdViewAdapter f4306a;

        /* JADX INFO: renamed from: b */
        private InterfaceC0871d f4307b;

        public C0636d(AbstractAdViewAdapter abstractAdViewAdapter, InterfaceC0871d interfaceC0871d) {
            this.f4306a = abstractAdViewAdapter;
            this.f4307b = interfaceC0871d;
        }

        @Override // com.google.android.gms.ads.C0657a
        /* JADX INFO: renamed from: a */
        public final void mo4789a() {
            this.f4307b.mo5857c(this.f4306a);
        }

        @Override // com.google.android.gms.ads.C0657a
        /* JADX INFO: renamed from: a */
        public final void mo5303a(int i) {
            this.f4307b.mo5855a(this.f4306a, i);
        }

        @Override // com.google.android.gms.ads.C0657a
        /* JADX INFO: renamed from: b */
        public final void mo5305b() {
            this.f4307b.mo5854a(this.f4306a);
        }

        @Override // com.google.android.gms.ads.C0657a
        /* JADX INFO: renamed from: c */
        public final void mo5306c() {
            this.f4307b.mo5856b(this.f4306a);
        }

        @Override // com.google.android.gms.ads.C0657a
        /* JADX INFO: renamed from: d */
        public final void mo5307d() {
            this.f4307b.mo5858d(this.f4306a);
        }

        @Override // com.google.android.gms.ads.C0657a, com.google.android.gms.internal.bws
        /* JADX INFO: renamed from: e */
        public final void mo5308e() {
            this.f4307b.mo5859e(this.f4306a);
        }
    }

    /* JADX INFO: renamed from: com.google.ads.mediation.AbstractAdViewAdapter$e */
    static final class C0637e extends C0657a implements AbstractC0670g.a, AbstractC0671h.a, InterfaceC0672i.a, InterfaceC0672i.b {

        /* JADX INFO: renamed from: a */
        private AbstractAdViewAdapter f4308a;

        /* JADX INFO: renamed from: b */
        private InterfaceC0872e f4309b;

        public C0637e(AbstractAdViewAdapter abstractAdViewAdapter, InterfaceC0872e interfaceC0872e) {
            this.f4308a = abstractAdViewAdapter;
            this.f4309b = interfaceC0872e;
        }

        @Override // com.google.android.gms.ads.C0657a
        /* JADX INFO: renamed from: a */
        public final void mo4789a() {
            this.f4309b.mo5865b(this.f4308a);
        }

        @Override // com.google.android.gms.ads.C0657a
        /* JADX INFO: renamed from: a */
        public final void mo5303a(int i) {
            this.f4309b.mo5861a(this.f4308a, i);
        }

        @Override // com.google.android.gms.ads.p045b.AbstractC0670g.a
        /* JADX INFO: renamed from: a */
        public final void mo5309a(AbstractC0670g abstractC0670g) {
            this.f4309b.mo5864a(this.f4308a, new C0633a(abstractC0670g));
        }

        @Override // com.google.android.gms.ads.p045b.AbstractC0671h.a
        /* JADX INFO: renamed from: a */
        public final void mo5310a(AbstractC0671h abstractC0671h) {
            this.f4309b.mo5864a(this.f4308a, new C0634b(abstractC0671h));
        }

        @Override // com.google.android.gms.ads.p045b.InterfaceC0672i.b
        /* JADX INFO: renamed from: a */
        public final void mo5311a(InterfaceC0672i interfaceC0672i) {
            this.f4309b.mo5862a(this.f4308a, interfaceC0672i);
        }

        @Override // com.google.android.gms.ads.p045b.InterfaceC0672i.a
        /* JADX INFO: renamed from: a */
        public final void mo5312a(InterfaceC0672i interfaceC0672i, String str) {
            this.f4309b.mo5863a(this.f4308a, interfaceC0672i, str);
        }

        @Override // com.google.android.gms.ads.C0657a
        /* JADX INFO: renamed from: b */
        public final void mo5305b() {
        }

        @Override // com.google.android.gms.ads.C0657a
        /* JADX INFO: renamed from: c */
        public final void mo5306c() {
            this.f4309b.mo5860a(this.f4308a);
        }

        @Override // com.google.android.gms.ads.C0657a
        /* JADX INFO: renamed from: d */
        public final void mo5307d() {
            this.f4309b.mo5866c(this.f4308a);
        }

        @Override // com.google.android.gms.ads.C0657a, com.google.android.gms.internal.bws
        /* JADX INFO: renamed from: e */
        public final void mo5308e() {
            this.f4309b.mo5867d(this.f4308a);
        }

        @Override // com.google.android.gms.ads.C0657a
        /* JADX INFO: renamed from: f */
        public final void mo5313f() {
            this.f4309b.mo5868e(this.f4308a);
        }
    }

    private final C0676c zza(Context context, InterfaceC0860a interfaceC0860a, Bundle bundle, Bundle bundle2) {
        C0676c.a aVar = new C0676c.a();
        Date dateMo5833a = interfaceC0860a.mo5833a();
        if (dateMo5833a != null) {
            aVar.m5391a(dateMo5833a);
        }
        int iMo5834b = interfaceC0860a.mo5834b();
        if (iMo5834b != 0) {
            aVar.m5387a(iMo5834b);
        }
        Set<String> setMo5835c = interfaceC0860a.mo5835c();
        if (setMo5835c != null) {
            Iterator<String> it = setMo5835c.iterator();
            while (it.hasNext()) {
                aVar.m5390a(it.next());
            }
        }
        Location locationMo5836d = interfaceC0860a.mo5836d();
        if (locationMo5836d != null) {
            aVar.m5388a(locationMo5836d);
        }
        if (interfaceC0860a.mo5838f()) {
            bxm.m10404a();
            aVar.m5394b(C1657jb.m11562a(context));
        }
        if (interfaceC0860a.mo5837e() != -1) {
            aVar.m5392a(interfaceC0860a.mo5837e() == 1);
        }
        aVar.m5395b(interfaceC0860a.mo5839g());
        aVar.m5389a(AdMobAdapter.class, zza(bundle, bundle2));
        return aVar.m5393a();
    }

    static /* synthetic */ C0687h zza(AbstractAdViewAdapter abstractAdViewAdapter, C0687h c0687h) {
        abstractAdViewAdapter.zzgx = null;
        return null;
    }

    public String getAdUnitId(Bundle bundle) {
        return bundle.getString(AD_UNIT_ID_PARAMETER);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public View getBannerView() {
        return this.zzgt;
    }

    @Override // com.google.android.gms.internal.zzapc
    public Bundle getInterstitialAdapterInfo() {
        return new InterfaceC0861b.a().m5841a(1).m5840a();
    }

    @Override // com.google.android.gms.ads.mediation.InterfaceC0879l
    public byx getVideoController() {
        C0688i videoController;
        if (this.zzgt == null || (videoController = this.zzgt.getVideoController()) == null) {
            return null;
        }
        return videoController.m5433a();
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter
    public void initialize(Context context, InterfaceC0860a interfaceC0860a, String str, InterfaceC0882a interfaceC0882a, Bundle bundle, Bundle bundle2) {
        this.zzgw = context.getApplicationContext();
        this.zzgy = interfaceC0882a;
        this.zzgy.mo5918a(this);
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter
    public boolean isInitialized() {
        return this.zzgy != null;
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter
    public void loadAd(InterfaceC0860a interfaceC0860a, Bundle bundle, Bundle bundle2) {
        if (this.zzgw == null || this.zzgy == null) {
            C1668jm.m11612c("AdMobAdapter.loadAd called before initialize.");
            return;
        }
        this.zzgx = new C0687h(this.zzgw);
        this.zzgx.m5429a(true);
        this.zzgx.m5428a(getAdUnitId(bundle));
        this.zzgx.m5427a(this.zzgz);
        this.zzgx.m5426a(zza(this.zzgw, interfaceC0860a, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.InterfaceC0861b
    public void onDestroy() {
        if (this.zzgt != null) {
            this.zzgt.mo5423c();
            this.zzgt = null;
        }
        if (this.zzgu != null) {
            this.zzgu = null;
        }
        if (this.zzgv != null) {
            this.zzgv = null;
        }
        if (this.zzgx != null) {
            this.zzgx = null;
        }
    }

    @Override // com.google.android.gms.ads.mediation.InterfaceC0878k
    public void onImmersiveModeUpdated(boolean z) {
        if (this.zzgu != null) {
            this.zzgu.m5432b(z);
        }
        if (this.zzgx != null) {
            this.zzgx.m5432b(z);
        }
    }

    @Override // com.google.android.gms.ads.mediation.InterfaceC0861b
    public void onPause() {
        if (this.zzgt != null) {
            this.zzgt.mo5422b();
        }
    }

    @Override // com.google.android.gms.ads.mediation.InterfaceC0861b
    public void onResume() {
        if (this.zzgt != null) {
            this.zzgt.mo5420a();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(Context context, InterfaceC0862c interfaceC0862c, Bundle bundle, C0681d c0681d, InterfaceC0860a interfaceC0860a, Bundle bundle2) {
        this.zzgt = new C0684e(context);
        this.zzgt.setAdSize(new C0681d(c0681d.m5416b(), c0681d.m5414a()));
        this.zzgt.setAdUnitId(getAdUnitId(bundle));
        this.zzgt.setAdListener(new C0635c(this, interfaceC0862c));
        this.zzgt.mo5421a(zza(context, interfaceC0860a, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(Context context, InterfaceC0871d interfaceC0871d, Bundle bundle, InterfaceC0860a interfaceC0860a, Bundle bundle2) {
        this.zzgu = new C0687h(context);
        this.zzgu.m5428a(getAdUnitId(bundle));
        this.zzgu.m5425a(new C0636d(this, interfaceC0871d));
        this.zzgu.m5426a(zza(context, interfaceC0860a, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void requestNativeAd(Context context, InterfaceC0872e interfaceC0872e, Bundle bundle, InterfaceC0876i interfaceC0876i, Bundle bundle2) {
        C0637e c0637e = new C0637e(this, interfaceC0872e);
        C0663b.a aVarM5337a = new C0663b.a(context, bundle.getString(AD_UNIT_ID_PARAMETER)).m5337a((C0657a) c0637e);
        C0667d c0667dMo5910h = interfaceC0876i.mo5910h();
        if (c0667dMo5910h != null) {
            aVarM5337a.m5338a(c0667dMo5910h);
        }
        if (interfaceC0876i.mo5911i()) {
            aVarM5337a.m5339a((AbstractC0670g.a) c0637e);
        }
        if (interfaceC0876i.mo5912j()) {
            aVarM5337a.m5340a((AbstractC0671h.a) c0637e);
        }
        if (interfaceC0876i.mo5913k()) {
            for (String str : interfaceC0876i.mo5914l().keySet()) {
                aVarM5337a.m5341a(str, c0637e, interfaceC0876i.mo5914l().get(str).booleanValue() ? c0637e : null);
            }
        }
        this.zzgv = aVarM5337a.m5342a();
        this.zzgv.m5336a(zza(context, interfaceC0876i, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        this.zzgu.m5431b();
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter
    public void showVideo() {
        this.zzgx.m5431b();
    }

    protected abstract Bundle zza(Bundle bundle, Bundle bundle2);
}
