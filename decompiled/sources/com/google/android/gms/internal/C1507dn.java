package com.google.android.gms.internal;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Future;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.dn */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C1507dn extends AbstractC1556fi implements InterfaceC1506dm {

    /* JADX INFO: renamed from: a */
    private final C1542ev f10458a;

    /* JADX INFO: renamed from: b */
    private final Context f10459b;

    /* JADX INFO: renamed from: c */
    private final ArrayList<Future> f10460c;

    /* JADX INFO: renamed from: d */
    private final ArrayList<String> f10461d;

    /* JADX INFO: renamed from: e */
    private final HashMap<String, C1496dc> f10462e;

    /* JADX INFO: renamed from: f */
    private final List<C1500dg> f10463f;

    /* JADX INFO: renamed from: g */
    private final HashSet<String> f10464g;

    /* JADX INFO: renamed from: h */
    private final Object f10465h;

    /* JADX INFO: renamed from: i */
    private final BinderC1476cj f10466i;

    /* JADX INFO: renamed from: j */
    private final long f10467j;

    public C1507dn(Context context, C1542ev c1542ev, BinderC1476cj binderC1476cj) {
        this(context, c1542ev, binderC1476cj, ((Long) bxm.m10409f().m10546a(can.f9473at)).longValue());
    }

    private C1507dn(Context context, C1542ev c1542ev, BinderC1476cj binderC1476cj, long j) {
        this.f10460c = new ArrayList<>();
        this.f10461d = new ArrayList<>();
        this.f10462e = new HashMap<>();
        this.f10463f = new ArrayList();
        this.f10464g = new HashSet<>();
        this.f10465h = new Object();
        this.f10459b = context;
        this.f10458a = c1542ev;
        this.f10466i = binderC1476cj;
        this.f10467j = j;
    }

    /* JADX INFO: renamed from: a */
    private final C1541eu m11197a(int i, String str, chs chsVar) {
        return new C1541eu(this.f10458a.f10560a.f11753c, null, this.f10458a.f10561b.f12611c, i, this.f10458a.f10561b.f12613e, this.f10458a.f10561b.f12617i, this.f10458a.f10561b.f12619k, this.f10458a.f10561b.f12618j, this.f10458a.f10560a.f11759i, this.f10458a.f10561b.f12615g, chsVar, null, str, this.f10458a.f10562c, null, this.f10458a.f10561b.f12616h, this.f10458a.f10563d, this.f10458a.f10561b.f12614f, this.f10458a.f10565f, this.f10458a.f10561b.f12621m, this.f10458a.f10561b.f12622n, this.f10458a.f10567h, null, this.f10458a.f10561b.f12589A, this.f10458a.f10561b.f12590B, this.f10458a.f10561b.f12591C, this.f10458a.f10561b.f12592D, this.f10458a.f10561b.f12593E, m11198e(), this.f10458a.f10561b.f12596H, this.f10458a.f10561b.f12600L, this.f10458a.f10568i, this.f10458a.f10561b.f12603O, this.f10458a.f10569j);
    }

    /* JADX INFO: renamed from: e */
    private final String m11198e() {
        int i;
        StringBuilder sb = new StringBuilder("");
        if (this.f10463f == null) {
            return sb.toString();
        }
        for (C1500dg c1500dg : this.f10463f) {
            if (c1500dg != null && !TextUtils.isEmpty(c1500dg.f10447a)) {
                String str = c1500dg.f10447a;
                switch (c1500dg.f10448b) {
                    case 3:
                        i = 1;
                        break;
                    case 4:
                        i = 2;
                        break;
                    case 5:
                        i = 4;
                        break;
                    case 6:
                        i = 0;
                        break;
                    case 7:
                        i = 3;
                        break;
                    default:
                        i = 6;
                        break;
                }
                sb.append(String.valueOf(new StringBuilder(String.valueOf(str).length() + 33).append(str).append(".").append(i).append(".").append(c1500dg.f10449c).toString()).concat("_"));
            }
        }
        return sb.substring(0, Math.max(0, sb.length() - 1));
    }

    @Override // com.google.android.gms.internal.AbstractC1556fi
    /* JADX INFO: renamed from: a */
    public final void mo5769a() {
        C1496dc c1496dc;
        C1496dc c1496dc2;
        C1496dc c1496dc3;
        C1496dc c1496dc4;
        String string;
        for (chs chsVar : this.f10458a.f10562c.f10034a) {
            String str = chsVar.f10024j;
            for (String str2 : chsVar.f10017c) {
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str2) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str2)) {
                    try {
                        string = new JSONObject(str).getString("class_name");
                    } catch (JSONException e) {
                        C1560fm.m11611b("Unable to determine custom event class name, skipping...", e);
                    }
                } else {
                    string = str2;
                }
                synchronized (this.f10465h) {
                    C1510dq c1510dqM11018b = this.f10466i.m11018b(string);
                    if (c1510dqM11018b == null || c1510dqM11018b.m11200b() == null || c1510dqM11018b.m11199a() == null) {
                        this.f10463f.add(new C1502di().m11183b(chsVar.f10018d).m11182a(string).m11181a(0L).m11180a(7).m11179a());
                    } else {
                        C1496dc c1496dc5 = new C1496dc(this.f10459b, string, str, chsVar, this.f10458a, c1510dqM11018b, this, this.f10467j);
                        this.f10460c.add((InterfaceFutureC1689kg) c1496dc5.mo11076d());
                        this.f10461d.add(string);
                        this.f10462e.put(string, c1496dc5);
                    }
                }
            }
        }
        for (int i = 0; i < this.f10460c.size(); i++) {
            try {
                try {
                    this.f10460c.get(i).get();
                    synchronized (this.f10465h) {
                        String str3 = this.f10461d.get(i);
                        if (!TextUtils.isEmpty(str3) && (c1496dc4 = this.f10462e.get(str3)) != null) {
                            this.f10463f.add(c1496dc4.m11165e());
                        }
                    }
                    synchronized (this.f10465h) {
                        if (this.f10464g.contains(this.f10461d.get(i))) {
                            String str4 = this.f10461d.get(i);
                            C1657jb.f10832a.post(new RunnableC1508do(this, m11197a(-2, str4, this.f10462e.get(str4) != null ? this.f10462e.get(str4).m11166f() : null)));
                            return;
                        }
                    }
                } catch (Throwable th) {
                    synchronized (this.f10465h) {
                        String str5 = this.f10461d.get(i);
                        if (!TextUtils.isEmpty(str5) && (c1496dc3 = this.f10462e.get(str5)) != null) {
                            this.f10463f.add(c1496dc3.m11165e());
                        }
                        throw th;
                    }
                }
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                synchronized (this.f10465h) {
                    String str6 = this.f10461d.get(i);
                    if (!TextUtils.isEmpty(str6) && (c1496dc2 = this.f10462e.get(str6)) != null) {
                        this.f10463f.add(c1496dc2.m11165e());
                    }
                    C1657jb.f10832a.post(new RunnableC1509dp(this, m11197a(3, null, null)));
                }
            } catch (Exception e3) {
                C1560fm.m11613c("Unable to resolve rewarded adapter.", e3);
                synchronized (this.f10465h) {
                    String str7 = this.f10461d.get(i);
                    if (!TextUtils.isEmpty(str7) && (c1496dc = this.f10462e.get(str7)) != null) {
                        this.f10463f.add(c1496dc.m11165e());
                    }
                }
            }
        }
        C1657jb.f10832a.post(new RunnableC1509dp(this, m11197a(3, null, null)));
    }

    @Override // com.google.android.gms.internal.InterfaceC1506dm
    /* JADX INFO: renamed from: a */
    public final void mo11163a(String str) {
        synchronized (this.f10465h) {
            this.f10464g.add(str);
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC1506dm
    /* JADX INFO: renamed from: a */
    public final void mo11164a(String str, int i) {
    }

    @Override // com.google.android.gms.internal.AbstractC1556fi
    /* JADX INFO: renamed from: b */
    public final void mo5770b() {
    }
}
