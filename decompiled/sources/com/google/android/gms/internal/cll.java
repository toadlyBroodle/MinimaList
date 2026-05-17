package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class cll extends cla {

    /* JADX INFO: renamed from: g */
    protected chz f10277g;

    /* JADX INFO: renamed from: h */
    private cii f10278h;

    /* JADX INFO: renamed from: i */
    private chr f10279i;

    /* JADX INFO: renamed from: j */
    private cht f10280j;

    /* JADX INFO: renamed from: k */
    private final cba f10281k;

    /* JADX INFO: renamed from: l */
    private final InterfaceC1758mv f10282l;

    /* JADX INFO: renamed from: m */
    private boolean f10283m;

    cll(Context context, C1542ev c1542ev, cii ciiVar, clg clgVar, cba cbaVar, InterfaceC1758mv interfaceC1758mv) {
        super(context, c1542ev, clgVar);
        this.f10278h = ciiVar;
        this.f10280j = c1542ev.f10562c;
        this.f10281k = cbaVar;
        this.f10282l = interfaceC1758mv;
    }

    /* JADX INFO: renamed from: a */
    private static String m11086a(List<chz> list) {
        int i;
        if (list == null) {
            return "".toString();
        }
        String string = "";
        for (chz chzVar : list) {
            if (chzVar != null && chzVar.f10080b != null && !TextUtils.isEmpty(chzVar.f10080b.f10018d)) {
                String strValueOf = String.valueOf(string);
                String str = chzVar.f10080b.f10018d;
                switch (chzVar.f10079a) {
                    case -1:
                        i = 4;
                        break;
                    case 0:
                        i = 0;
                        break;
                    case 1:
                        i = 1;
                        break;
                    case 2:
                    default:
                        i = 6;
                        break;
                    case 3:
                        i = 2;
                        break;
                    case 4:
                        i = 3;
                        break;
                    case 5:
                        i = 5;
                        break;
                }
                String string2 = new StringBuilder(String.valueOf(str).length() + 33).append(str).append(".").append(i).append(".").append(chzVar.f10085g).toString();
                string = new StringBuilder(String.valueOf(strValueOf).length() + 1 + String.valueOf(string2).length()).append(strValueOf).append(string2).append("_").toString();
            }
        }
        return string.substring(0, Math.max(0, string.length() - 1));
    }

    @Override // com.google.android.gms.internal.cla
    /* JADX INFO: renamed from: a */
    protected final C1541eu mo11077a(int i) {
        C1979v c1979v = this.f10263e.f10560a;
        return new C1541eu(c1979v.f11753c, this.f10282l, this.f10264f.f12611c, i, this.f10264f.f12613e, this.f10264f.f12617i, this.f10264f.f12619k, this.f10264f.f12618j, c1979v.f11759i, this.f10264f.f12615g, this.f10277g != null ? this.f10277g.f10080b : null, this.f10277g != null ? this.f10277g.f10081c : null, this.f10277g != null ? this.f10277g.f10082d : AdMobAdapter.class.getName(), this.f10280j, this.f10277g != null ? this.f10277g.f10083e : null, this.f10264f.f12616h, this.f10263e.f10563d, this.f10264f.f12614f, this.f10263e.f10565f, this.f10264f.f12621m, this.f10264f.f12622n, this.f10263e.f10567h, null, this.f10264f.f12589A, this.f10264f.f12590B, this.f10264f.f12591C, this.f10280j != null ? this.f10280j.f10047n : false, this.f10264f.f12593E, this.f10279i != null ? m11086a(this.f10279i.mo10864b()) : null, this.f10264f.f12596H, this.f10264f.f12600L, this.f10263e.f10568i, this.f10264f.f12603O, this.f10263e.f10569j);
    }

    @Override // com.google.android.gms.internal.cla
    /* JADX INFO: renamed from: a */
    protected final void mo11078a(long j) throws cld {
        Bundle bundle;
        synchronized (this.f10262d) {
            this.f10279i = this.f10280j.f10045l != -1 ? new cic(this.f10260b, this.f10263e.f10560a, this.f10278h, this.f10280j, this.f10264f.f12627s, this.f10264f.f12634z, this.f10264f.f12598J, j, ((Long) bxm.m10409f().m10546a(can.f9520bn)).longValue(), 2, this.f10263e.f10569j) : new cif(this.f10260b, this.f10263e.f10560a, this.f10278h, this.f10280j, this.f10264f.f12627s, this.f10264f.f12634z, this.f10264f.f12598J, j, ((Long) bxm.m10409f().m10546a(can.f9520bn)).longValue(), this.f10281k, this.f10263e.f10569j);
        }
        ArrayList arrayList = new ArrayList(this.f10280j.f10034a);
        boolean z = false;
        Bundle bundle2 = this.f10263e.f10560a.f11753c.f9219m;
        if (bundle2 != null && (bundle = bundle2.getBundle("com.google.ads.mediation.admob.AdMobAdapter")) != null) {
            z = bundle.getBoolean("_skipMediation");
        }
        if (z) {
            ListIterator listIterator = arrayList.listIterator();
            while (listIterator.hasNext()) {
                if (!((chs) listIterator.next()).f10017c.contains("com.google.ads.mediation.admob.AdMobAdapter")) {
                    listIterator.remove();
                }
            }
        }
        this.f10277g = this.f10279i.mo10862a(arrayList);
        switch (this.f10277g.f10079a) {
            case 0:
                if (this.f10277g.f10080b == null || this.f10277g.f10080b.f10027m == null) {
                    return;
                }
                CountDownLatch countDownLatch = new CountDownLatch(1);
                C1596gv.f10711a.post(new clm(this, countDownLatch));
                try {
                    countDownLatch.await(10L, TimeUnit.SECONDS);
                    synchronized (this.f10262d) {
                        if (!this.f10283m) {
                            throw new cld("View could not be prepared", 0);
                        }
                        if (this.f10282l.mo11798B()) {
                            throw new cld("Assets not loaded, web view is destroyed", 0);
                        }
                    }
                    return;
                } catch (InterruptedException e) {
                    String strValueOf = String.valueOf(e);
                    throw new cld(new StringBuilder(String.valueOf(strValueOf).length() + 38).append("Interrupted while waiting for latch : ").append(strValueOf).toString(), 0);
                }
            case 1:
                throw new cld("No fill from any mediation ad networks.", 3);
            default:
                throw new cld(new StringBuilder(40).append("Unexpected mediation result: ").append(this.f10277g.f10079a).toString(), 0);
        }
    }

    @Override // com.google.android.gms.internal.cla, com.google.android.gms.internal.AbstractC1556fi
    /* JADX INFO: renamed from: b */
    public final void mo5770b() {
        synchronized (this.f10262d) {
            super.mo5770b();
            if (this.f10279i != null) {
                this.f10279i.mo10863a();
            }
        }
    }
}
