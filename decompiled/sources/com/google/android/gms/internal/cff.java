package com.google.android.gms.internal;

import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.C0710au;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class cff implements bzk {

    /* JADX INFO: renamed from: a */
    private cey f9905a;

    /* JADX INFO: renamed from: b */
    private boolean f9906b;

    /* JADX INFO: renamed from: c */
    private final Context f9907c;

    /* JADX INFO: renamed from: d */
    private final Object f9908d = new Object();

    public cff(Context context) {
        this.f9907c = context;
    }

    /* JADX INFO: renamed from: a */
    private final Future<ParcelFileDescriptor> m10784a(cez cezVar) {
        cfg cfgVar = new cfg(this);
        cfh cfhVar = new cfh(this, cfgVar, cezVar);
        cfl cflVar = new cfl(this, cfgVar);
        synchronized (this.f9908d) {
            this.f9905a = new cey(this.f9907c, C0710au.m5583s().m11535a(), cfhVar, cflVar);
            this.f9905a.m7126r();
        }
        return cfgVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m10785a() {
        synchronized (this.f9908d) {
            if (this.f9905a == null) {
                return;
            }
            this.f9905a.mo6640f();
            this.f9905a = null;
            Binder.flushPendingCommands();
        }
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ boolean m10787a(cff cffVar, boolean z) {
        cffVar.f9906b = true;
        return true;
    }

    @Override // com.google.android.gms.internal.bzk
    /* JADX INFO: renamed from: a */
    public final cch mo10516a(cej<?> cejVar) {
        cch cchVar;
        cez cezVarM10782a = cez.m10782a(cejVar);
        long jIntValue = ((Integer) bxm.m10409f().m10546a(can.f9580cu)).intValue();
        long jMo7253b = C0710au.m5575k().mo7253b();
        try {
            cfb cfbVar = (cfb) new C1372am(m10784a(cezVarM10782a).get(jIntValue, TimeUnit.MILLISECONDS)).m8089a(cfb.CREATOR);
            if (cfbVar.f9897a) {
                throw new C1471ce(cfbVar.f9898b);
            }
            if (cfbVar.f9901e.length != cfbVar.f9902f.length) {
                cchVar = null;
            } else {
                HashMap map = new HashMap();
                for (int i = 0; i < cfbVar.f9901e.length; i++) {
                    map.put(cfbVar.f9901e[i], cfbVar.f9902f[i]);
                }
                cchVar = new cch(cfbVar.f9899c, cfbVar.f9900d, map, cfbVar.f9903g, cfbVar.f9904h);
            }
            C1560fm.m11343a(new StringBuilder(52).append("Http assets remote cache took ").append(C0710au.m5575k().mo7253b() - jMo7253b).append("ms").toString());
            return cchVar;
        } catch (InterruptedException e) {
            C1560fm.m11343a(new StringBuilder(52).append("Http assets remote cache took ").append(C0710au.m5575k().mo7253b() - jMo7253b).append("ms").toString());
            return null;
        } catch (ExecutionException e2) {
            C1560fm.m11343a(new StringBuilder(52).append("Http assets remote cache took ").append(C0710au.m5575k().mo7253b() - jMo7253b).append("ms").toString());
            return null;
        } catch (TimeoutException e3) {
            C1560fm.m11343a(new StringBuilder(52).append("Http assets remote cache took ").append(C0710au.m5575k().mo7253b() - jMo7253b).append("ms").toString());
            return null;
        } catch (Throwable th) {
            C1560fm.m11343a(new StringBuilder(52).append("Http assets remote cache took ").append(C0710au.m5575k().mo7253b() - jMo7253b).append("ms").toString());
            throw th;
        }
    }
}
