package com.google.android.gms.internal;

import android.os.Binder;
import android.text.TextUtils;
import com.google.android.gms.common.C1319w;
import com.google.android.gms.common.C1320x;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.common.util.C1316t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class abi extends AbstractBinderC2109zv {

    /* JADX INFO: renamed from: a */
    private final abd f6271a;

    /* JADX INFO: renamed from: b */
    private Boolean f6272b;

    /* JADX INFO: renamed from: c */
    private String f6273c;

    public abi(abd abdVar) {
        this(abdVar, null);
    }

    private abi(abd abdVar, String str) {
        C1221aj.m7065a(abdVar);
        this.f6271a = abdVar;
        this.f6273c = null;
    }

    /* JADX INFO: renamed from: a */
    private final void m7565a(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            this.f6271a.m7540f().m7410y().m7412a("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z) {
            try {
                if (this.f6272b == null) {
                    this.f6272b = Boolean.valueOf("com.google.android.gms".equals(this.f6273c) || C1316t.m7293a(this.f6271a.m7554t(), Binder.getCallingUid()) || C1320x.m7319a(this.f6271a.m7554t()).m7323a(Binder.getCallingUid()));
                }
                if (this.f6272b.booleanValue()) {
                    return;
                }
            } catch (SecurityException e) {
                this.f6271a.m7540f().m7410y().m7413a("Measurement Service called with invalid calling package. appId", aac.m7397a(str));
                throw e;
            }
        }
        if (this.f6273c == null && C1319w.m7308a(this.f6271a.m7554t(), Binder.getCallingUid(), str)) {
            this.f6273c = str;
        }
        if (str.equals(this.f6273c)) {
        } else {
            throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
        }
    }

    /* JADX INFO: renamed from: b */
    private final void m7566b(C2084yx c2084yx, boolean z) {
        C1221aj.m7065a(c2084yx);
        m7565a(c2084yx.f12574a, false);
        this.f6271a.m7549o().m7767f(c2084yx.f12575b);
    }

    @Override // com.google.android.gms.internal.InterfaceC2108zu
    /* JADX INFO: renamed from: a */
    public final List<aeh> mo7567a(C2084yx c2084yx, boolean z) {
        m7566b(c2084yx, false);
        try {
            List<aej> list = (List) this.f6271a.m7542h().m7478a(new abz(this, c2084yx)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (aej aejVar : list) {
                if (z || !aek.m7739i(aejVar.f6498c)) {
                    arrayList.add(new aeh(aejVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f6271a.m7540f().m7410y().m7414a("Failed to get user attributes. appId", aac.m7397a(c2084yx.f12574a), e);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC2108zu
    /* JADX INFO: renamed from: a */
    public final List<C2088za> mo7568a(String str, String str2, C2084yx c2084yx) {
        m7566b(c2084yx, false);
        try {
            return (List) this.f6271a.m7542h().m7478a(new abq(this, c2084yx, str, str2)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.f6271a.m7540f().m7410y().m7413a("Failed to get conditional user properties", e);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC2108zu
    /* JADX INFO: renamed from: a */
    public final List<C2088za> mo7569a(String str, String str2, String str3) {
        m7565a(str, true);
        try {
            return (List) this.f6271a.m7542h().m7478a(new abs(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.f6271a.m7540f().m7410y().m7413a("Failed to get conditional user properties", e);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC2108zu
    /* JADX INFO: renamed from: a */
    public final List<aeh> mo7570a(String str, String str2, String str3, boolean z) {
        m7565a(str, true);
        try {
            List<aej> list = (List) this.f6271a.m7542h().m7478a(new abp(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (aej aejVar : list) {
                if (z || !aek.m7739i(aejVar.f6498c)) {
                    arrayList.add(new aeh(aejVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f6271a.m7540f().m7410y().m7414a("Failed to get user attributes. appId", aac.m7397a(str), e);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC2108zu
    /* JADX INFO: renamed from: a */
    public final List<aeh> mo7571a(String str, String str2, boolean z, C2084yx c2084yx) {
        m7566b(c2084yx, false);
        try {
            List<aej> list = (List) this.f6271a.m7542h().m7478a(new abo(this, c2084yx, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (aej aejVar : list) {
                if (z || !aek.m7739i(aejVar.f6498c)) {
                    arrayList.add(new aeh(aejVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f6271a.m7540f().m7410y().m7414a("Failed to get user attributes. appId", aac.m7397a(c2084yx.f12574a), e);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC2108zu
    /* JADX INFO: renamed from: a */
    public final void mo7572a(long j, String str, String str2, String str3) {
        this.f6271a.m7542h().m7479a(new acb(this, str2, str3, str, j));
    }

    @Override // com.google.android.gms.internal.InterfaceC2108zu
    /* JADX INFO: renamed from: a */
    public final void mo7573a(aeh aehVar, C2084yx c2084yx) {
        C1221aj.m7065a(aehVar);
        m7566b(c2084yx, false);
        if (aehVar.m7712a() == null) {
            this.f6271a.m7542h().m7479a(new abx(this, aehVar, c2084yx));
        } else {
            this.f6271a.m7542h().m7479a(new aby(this, aehVar, c2084yx));
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC2108zu
    /* JADX INFO: renamed from: a */
    public final void mo7574a(C2084yx c2084yx) {
        m7566b(c2084yx, false);
        aca acaVar = new aca(this, c2084yx);
        if (this.f6271a.m7542h().m7482z()) {
            acaVar.run();
        } else {
            this.f6271a.m7542h().m7479a(acaVar);
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC2108zu
    /* JADX INFO: renamed from: a */
    public final void mo7575a(C2088za c2088za) {
        C1221aj.m7065a(c2088za);
        C1221aj.m7065a(c2088za.f12637c);
        m7565a(c2088za.f12635a, true);
        C2088za c2088za2 = new C2088za(c2088za);
        if (c2088za.f12637c.m7712a() == null) {
            this.f6271a.m7542h().m7479a(new abm(this, c2088za2));
        } else {
            this.f6271a.m7542h().m7479a(new abn(this, c2088za2));
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC2108zu
    /* JADX INFO: renamed from: a */
    public final void mo7576a(C2088za c2088za, C2084yx c2084yx) {
        C1221aj.m7065a(c2088za);
        C1221aj.m7065a(c2088za.f12637c);
        m7566b(c2084yx, false);
        C2088za c2088za2 = new C2088za(c2088za);
        c2088za2.f12635a = c2084yx.f12574a;
        if (c2088za.f12637c.m7712a() == null) {
            this.f6271a.m7542h().m7479a(new abk(this, c2088za2, c2084yx));
        } else {
            this.f6271a.m7542h().m7479a(new abl(this, c2088za2, c2084yx));
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC2108zu
    /* JADX INFO: renamed from: a */
    public final void mo7577a(C2104zq c2104zq, C2084yx c2084yx) {
        C1221aj.m7065a(c2104zq);
        m7566b(c2084yx, false);
        this.f6271a.m7542h().m7479a(new abu(this, c2104zq, c2084yx));
    }

    @Override // com.google.android.gms.internal.InterfaceC2108zu
    /* JADX INFO: renamed from: a */
    public final void mo7578a(C2104zq c2104zq, String str, String str2) {
        C1221aj.m7065a(c2104zq);
        C1221aj.m7067a(str);
        m7565a(str, true);
        this.f6271a.m7542h().m7479a(new abv(this, c2104zq, str));
    }

    @Override // com.google.android.gms.internal.InterfaceC2108zu
    /* JADX INFO: renamed from: a */
    public final byte[] mo7579a(C2104zq c2104zq, String str) {
        C1221aj.m7067a(str);
        C1221aj.m7065a(c2104zq);
        m7565a(str, true);
        this.f6271a.m7540f().m7404D().m7413a("Log and bundle. event", this.f6271a.m7550p().m7371a(c2104zq.f12690a));
        long jMo7254c = this.f6271a.m7555u().mo7254c() / 1000000;
        try {
            byte[] bArr = (byte[]) this.f6271a.m7542h().m7480b(new abw(this, c2104zq, str)).get();
            if (bArr == null) {
                this.f6271a.m7540f().m7410y().m7413a("Log and bundle returned null. appId", aac.m7397a(str));
                bArr = new byte[0];
            }
            this.f6271a.m7540f().m7404D().m7415a("Log and bundle processed. event, size, time_ms", this.f6271a.m7550p().m7371a(c2104zq.f12690a), Integer.valueOf(bArr.length), Long.valueOf((this.f6271a.m7555u().mo7254c() / 1000000) - jMo7254c));
            return bArr;
        } catch (InterruptedException | ExecutionException e) {
            this.f6271a.m7540f().m7410y().m7415a("Failed to log and bundle. appId, event, error", aac.m7397a(str), this.f6271a.m7550p().m7371a(c2104zq.f12690a), e);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC2108zu
    /* JADX INFO: renamed from: b */
    public final void mo7580b(C2084yx c2084yx) {
        m7566b(c2084yx, false);
        this.f6271a.m7542h().m7479a(new abj(this, c2084yx));
    }

    @Override // com.google.android.gms.internal.InterfaceC2108zu
    /* JADX INFO: renamed from: c */
    public final String mo7581c(C2084yx c2084yx) {
        m7566b(c2084yx, false);
        return this.f6271a.m7517a(c2084yx.f12574a);
    }

    @Override // com.google.android.gms.internal.InterfaceC2108zu
    /* JADX INFO: renamed from: d */
    public final void mo7582d(C2084yx c2084yx) {
        m7565a(c2084yx.f12574a, false);
        this.f6271a.m7542h().m7479a(new abt(this, c2084yx));
    }
}
