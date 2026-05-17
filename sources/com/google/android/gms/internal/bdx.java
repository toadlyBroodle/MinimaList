package com.google.android.gms.internal;

import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
final class bdx {

    /* JADX INFO: renamed from: a */
    private static long f7895a = 0;

    /* JADX INFO: renamed from: b */
    private beb f7896b;

    /* JADX INFO: renamed from: c */
    private boolean f7897c = false;

    /* JADX INFO: renamed from: d */
    private boolean f7898d = false;

    /* JADX INFO: renamed from: e */
    private long f7899e = 0;

    /* JADX INFO: renamed from: f */
    private bek f7900f;

    /* JADX INFO: renamed from: g */
    private bea f7901g;

    /* JADX INFO: renamed from: h */
    private ScheduledFuture<?> f7902h;

    /* JADX INFO: renamed from: i */
    private ScheduledFuture<?> f7903i;

    /* JADX INFO: renamed from: j */
    private final bcz f7904j;

    /* JADX INFO: renamed from: k */
    private final ScheduledExecutorService f7905k;

    /* JADX INFO: renamed from: l */
    private final bkl f7906l;

    public bdx(bcz bczVar, bdb bdbVar, String str, bea beaVar, String str2) {
        bdy bdyVar = null;
        this.f7904j = bczVar;
        this.f7905k = bczVar.m8944c();
        this.f7901g = beaVar;
        long j = f7895a;
        f7895a = 1 + j;
        this.f7906l = new bkl(bczVar.m8942a(), "WebSocket", new StringBuilder(23).append("ws_").append(j).toString());
        str = str == null ? bdbVar.m8953a() : str;
        boolean zM8955c = bdbVar.m8955c();
        String strM8954b = bdbVar.m8954b();
        String str3 = zM8955c ? "wss" : "ws";
        String string = new StringBuilder(String.valueOf(str3).length() + 13 + String.valueOf(str).length() + String.valueOf(strM8954b).length() + String.valueOf("v").length() + String.valueOf("5").length()).append(str3).append("://").append(str).append("/.ws?ns=").append(strM8954b).append("&").append("v").append("=").append("5").toString();
        if (str2 != null) {
            String strValueOf = String.valueOf(string);
            string = new StringBuilder(String.valueOf(strValueOf).length() + String.valueOf("&ls=").length() + String.valueOf(str2).length()).append(strValueOf).append("&ls=").append(str2).toString();
        }
        URI uriCreate = URI.create(string);
        HashMap map = new HashMap();
        map.put("User-Agent", this.f7904j.m8947f());
        this.f7896b = new bec(this, new bme(this.f7904j, uriCreate, null, map), bdyVar);
    }

    /* JADX INFO: renamed from: a */
    private final void m9048a(int i) {
        this.f7899e = i;
        this.f7900f = new bek();
        if (this.f7906l.m9541a()) {
            this.f7906l.m9540a(new StringBuilder(41).append("HandleNewFrameCount: ").append(this.f7899e).toString(), null, new Object[0]);
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m9050a(String str) {
        this.f7900f.m9090a(str);
        this.f7899e--;
        if (this.f7899e == 0) {
            try {
                this.f7900f.m9089a();
                Map<String, Object> mapM9676a = bms.m9676a(this.f7900f.toString());
                this.f7900f = null;
                if (this.f7906l.m9541a()) {
                    bkl bklVar = this.f7906l;
                    String strValueOf = String.valueOf(mapM9676a);
                    bklVar.m9540a(new StringBuilder(String.valueOf(strValueOf).length() + 36).append("handleIncomingFrame complete frame: ").append(strValueOf).toString(), null, new Object[0]);
                }
                this.f7901g.mo8930a(mapM9676a);
            } catch (IOException e) {
                bkl bklVar2 = this.f7906l;
                String strValueOf2 = String.valueOf(this.f7900f.toString());
                bklVar2.m9539a(strValueOf2.length() != 0 ? "Error parsing frame: ".concat(strValueOf2) : new String("Error parsing frame: "), e);
                m9066b();
                m9059e();
            } catch (ClassCastException e2) {
                bkl bklVar3 = this.f7906l;
                String strValueOf3 = String.valueOf(this.f7900f.toString());
                bklVar3.m9539a(strValueOf3.length() != 0 ? "Error parsing frame (cast error): ".concat(strValueOf3) : new String("Error parsing frame (cast error): "), e2);
                m9066b();
                m9059e();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ boolean m9051a(bdx bdxVar, boolean z) {
        bdxVar.f7897c = true;
        return true;
    }

    /* JADX INFO: renamed from: b */
    private final String m9053b(String str) {
        if (str.length() <= 6) {
            try {
                int i = Integer.parseInt(str);
                if (i > 0) {
                    m9048a(i);
                }
                return null;
            } catch (NumberFormatException e) {
            }
        }
        m9048a(1);
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public final void m9054c() {
        if (this.f7898d) {
            return;
        }
        if (this.f7902h != null) {
            this.f7902h.cancel(false);
            if (this.f7906l.m9541a()) {
                this.f7906l.m9540a(new StringBuilder(48).append("Reset keepAlive. Remaining: ").append(this.f7902h.getDelay(TimeUnit.MILLISECONDS)).toString(), null, new Object[0]);
            }
        } else if (this.f7906l.m9541a()) {
            this.f7906l.m9540a("Reset keepAlive", null, new Object[0]);
        }
        this.f7902h = this.f7905k.schedule(new bdz(this), 45000L, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public final void m9056c(String str) {
        if (this.f7898d) {
            return;
        }
        m9054c();
        if (this.f7900f != null) {
            m9050a(str);
            return;
        }
        String strM9053b = m9053b(str);
        if (strM9053b != null) {
            m9050a(strM9053b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public final void m9058d() {
        if (!this.f7898d) {
            if (this.f7906l.m9541a()) {
                this.f7906l.m9540a("closing itself", null, new Object[0]);
            }
            m9059e();
        }
        this.f7896b = null;
        if (this.f7902h != null) {
            this.f7902h.cancel(false);
        }
    }

    /* JADX INFO: renamed from: e */
    private final void m9059e() {
        this.f7898d = true;
        this.f7901g.mo8932a(this.f7897c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public final void m9061f() {
        if (this.f7897c || this.f7898d) {
            return;
        }
        if (this.f7906l.m9541a()) {
            this.f7906l.m9540a("timed out on connect", null, new Object[0]);
        }
        this.f7896b.mo9070b();
    }

    /* JADX INFO: renamed from: a */
    public final void m9064a() {
        this.f7896b.mo9068a();
        this.f7903i = this.f7905k.schedule(new bdy(this), 30000L, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: renamed from: a */
    public final void m9065a(Map<String, Object> map) {
        String[] strArr;
        m9054c();
        try {
            String strM9675a = bms.m9675a(map);
            if (strM9675a.length() <= 16384) {
                strArr = new String[]{strM9675a};
            } else {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < strM9675a.length(); i += 16384) {
                    arrayList.add(strM9675a.substring(i, Math.min(i + 16384, strM9675a.length())));
                }
                strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
            }
            if (strArr.length > 1) {
                this.f7896b.mo9069a(new StringBuilder(11).append(strArr.length).toString());
            }
            for (String str : strArr) {
                this.f7896b.mo9069a(str);
            }
        } catch (IOException e) {
            bkl bklVar = this.f7906l;
            String strValueOf = String.valueOf(map.toString());
            bklVar.m9539a(strValueOf.length() != 0 ? "Failed to serialize message: ".concat(strValueOf) : new String("Failed to serialize message: "), e);
            m9059e();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m9066b() {
        if (this.f7906l.m9541a()) {
            this.f7906l.m9540a("websocket is being closed", null, new Object[0]);
        }
        this.f7898d = true;
        this.f7896b.mo9070b();
        if (this.f7903i != null) {
            this.f7903i.cancel(true);
        }
        if (this.f7902h != null) {
            this.f7902h.cancel(true);
        }
    }
}
