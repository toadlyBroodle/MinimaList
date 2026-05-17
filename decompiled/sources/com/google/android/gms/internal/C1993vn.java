package com.google.android.gms.internal;

import com.google.android.gms.cast.C1053i;
import com.google.android.gms.cast.C1054j;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.util.InterfaceC1300d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.vn */
/* JADX INFO: loaded from: classes.dex */
public final class C1993vn extends AbstractC1965um {

    /* JADX INFO: renamed from: d */
    public static final String f11799d = C1981vb.m12428b("com.google.cast.media");

    /* JADX INFO: renamed from: e */
    private long f11800e;

    /* JADX INFO: renamed from: f */
    private C1054j f11801f;

    /* JADX INFO: renamed from: g */
    private final List<C1999vt> f11802g;

    /* JADX INFO: renamed from: h */
    private InterfaceC1995vp f11803h;

    /* JADX INFO: renamed from: i */
    private final C1999vt f11804i;

    /* JADX INFO: renamed from: j */
    private final C1999vt f11805j;

    /* JADX INFO: renamed from: k */
    private final C1999vt f11806k;

    /* JADX INFO: renamed from: l */
    private final C1999vt f11807l;

    /* JADX INFO: renamed from: m */
    private final C1999vt f11808m;

    /* JADX INFO: renamed from: n */
    private final C1999vt f11809n;

    /* JADX INFO: renamed from: o */
    private final C1999vt f11810o;

    /* JADX INFO: renamed from: p */
    private final C1999vt f11811p;

    /* JADX INFO: renamed from: q */
    private final C1999vt f11812q;

    /* JADX INFO: renamed from: r */
    private final C1999vt f11813r;

    /* JADX INFO: renamed from: s */
    private final C1999vt f11814s;

    /* JADX INFO: renamed from: t */
    private final C1999vt f11815t;

    /* JADX INFO: renamed from: u */
    private final C1999vt f11816u;

    /* JADX INFO: renamed from: v */
    private final C1999vt f11817v;

    /* JADX INFO: renamed from: w */
    private final C1999vt f11818w;

    public C1993vn(String str, InterfaceC1300d interfaceC1300d) {
        super(f11799d, interfaceC1300d, "MediaControlChannel", null, 1000L);
        this.f11804i = new C1999vt(this.f11668a, 86400000L);
        this.f11805j = new C1999vt(this.f11668a, 86400000L);
        this.f11806k = new C1999vt(this.f11668a, 86400000L);
        this.f11807l = new C1999vt(this.f11668a, 86400000L);
        this.f11808m = new C1999vt(this.f11668a, 86400000L);
        this.f11809n = new C1999vt(this.f11668a, 86400000L);
        this.f11810o = new C1999vt(this.f11668a, 86400000L);
        this.f11811p = new C1999vt(this.f11668a, 86400000L);
        this.f11812q = new C1999vt(this.f11668a, 86400000L);
        this.f11813r = new C1999vt(this.f11668a, 86400000L);
        this.f11814s = new C1999vt(this.f11668a, 86400000L);
        this.f11815t = new C1999vt(this.f11668a, 86400000L);
        this.f11816u = new C1999vt(this.f11668a, 86400000L);
        this.f11817v = new C1999vt(this.f11668a, 86400000L);
        this.f11818w = new C1999vt(this.f11668a, 86400000L);
        this.f11802g = new ArrayList();
        this.f11802g.add(this.f11804i);
        this.f11802g.add(this.f11805j);
        this.f11802g.add(this.f11806k);
        this.f11802g.add(this.f11807l);
        this.f11802g.add(this.f11808m);
        this.f11802g.add(this.f11809n);
        this.f11802g.add(this.f11810o);
        this.f11802g.add(this.f11811p);
        this.f11802g.add(this.f11812q);
        this.f11802g.add(this.f11813r);
        this.f11802g.add(this.f11814s);
        this.f11802g.add(this.f11815t);
        this.f11802g.add(this.f11816u);
        this.f11802g.add(this.f11817v);
        this.f11802g.add(this.f11818w);
        m12457m();
    }

    /* JADX INFO: renamed from: a */
    private final void m12451a(long j, JSONObject jSONObject) throws JSONException {
        int iM6568a;
        boolean z = true;
        boolean zM12471a = this.f11804i.m12471a(j);
        boolean z2 = this.f11808m.m12474b() && !this.f11808m.m12471a(j);
        if ((!this.f11809n.m12474b() || this.f11809n.m12471a(j)) && (!this.f11810o.m12474b() || this.f11810o.m12471a(j))) {
            z = false;
        }
        int i = z2 ? 2 : 0;
        if (z) {
            i |= 1;
        }
        if (zM12471a || this.f11801f == null) {
            this.f11801f = new C1054j(jSONObject);
            this.f11800e = this.f11668a.mo7253b();
            iM6568a = 127;
        } else {
            iM6568a = this.f11801f.m6568a(jSONObject, i);
        }
        if ((iM6568a & 1) != 0) {
            this.f11800e = this.f11668a.mo7253b();
            m12453i();
        }
        if ((iM6568a & 2) != 0) {
            this.f11800e = this.f11668a.mo7253b();
            m12453i();
        }
        if ((iM6568a & 4) != 0) {
            m12454j();
        }
        if ((iM6568a & 8) != 0) {
            m12455k();
        }
        if ((iM6568a & 16) != 0) {
            m12456l();
        }
        if ((iM6568a & 32) != 0) {
            this.f11800e = this.f11668a.mo7253b();
            if (this.f11803h != null) {
                this.f11803h.mo6524e();
            }
        }
        if ((iM6568a & 64) != 0) {
            this.f11800e = this.f11668a.mo7253b();
            m12453i();
        }
        Iterator<C1999vt> it = this.f11802g.iterator();
        while (it.hasNext()) {
            it.next().m12473a(j, 0, null);
        }
    }

    /* JADX INFO: renamed from: h */
    private final long m12452h() throws C1996vq {
        if (this.f11801f == null) {
            throw new C1996vq();
        }
        return this.f11801f.m6569a();
    }

    /* JADX INFO: renamed from: i */
    private final void m12453i() {
        if (this.f11803h != null) {
            this.f11803h.mo6520a();
        }
    }

    /* JADX INFO: renamed from: j */
    private final void m12454j() {
        if (this.f11803h != null) {
            this.f11803h.mo6521b();
        }
    }

    /* JADX INFO: renamed from: k */
    private final void m12455k() {
        if (this.f11803h != null) {
            this.f11803h.mo6522c();
        }
    }

    /* JADX INFO: renamed from: l */
    private final void m12456l() {
        if (this.f11803h != null) {
            this.f11803h.mo6523d();
        }
    }

    /* JADX INFO: renamed from: m */
    private final void m12457m() {
        this.f11800e = 0L;
        this.f11801f = null;
        Iterator<C1999vt> it = this.f11802g.iterator();
        while (it.hasNext()) {
            it.next().m12469a();
        }
    }

    /* JADX INFO: renamed from: a */
    public final long m12458a(InterfaceC1998vs interfaceC1998vs) {
        JSONObject jSONObject = new JSONObject();
        long jM12376c = m12376c();
        this.f11811p.m12470a(jM12376c, interfaceC1998vs);
        m12368a(true);
        try {
            jSONObject.put("requestId", jM12376c);
            jSONObject.put("type", "GET_STATUS");
            if (this.f11801f != null) {
                jSONObject.put("mediaSessionId", this.f11801f.m6569a());
            }
        } catch (JSONException e) {
        }
        m12373a(jSONObject.toString(), jM12376c, null);
        return jM12376c;
    }

    /* JADX INFO: renamed from: a */
    public final long m12459a(InterfaceC1998vs interfaceC1998vs, int i, long j, C1053i[] c1053iArr, int i2, Integer num, JSONObject jSONObject) {
        if (j != -1 && j < 0) {
            throw new IllegalArgumentException(new StringBuilder(53).append("playPosition cannot be negative: ").append(j).toString());
        }
        JSONObject jSONObject2 = new JSONObject();
        long jM12376c = m12376c();
        this.f11815t.m12470a(jM12376c, interfaceC1998vs);
        m12368a(true);
        try {
            jSONObject2.put("requestId", jM12376c);
            jSONObject2.put("type", "QUEUE_UPDATE");
            jSONObject2.put("mediaSessionId", m12452h());
            if (i != 0) {
                jSONObject2.put("currentItemId", i);
            }
            if (i2 != 0) {
                jSONObject2.put("jump", i2);
            }
            if (c1053iArr != null && c1053iArr.length > 0) {
                JSONArray jSONArray = new JSONArray();
                for (int i3 = 0; i3 < c1053iArr.length; i3++) {
                    jSONArray.put(i3, c1053iArr[i3].m6565i());
                }
                jSONObject2.put("items", jSONArray);
            }
            if (num != null) {
                switch (num.intValue()) {
                    case 0:
                        jSONObject2.put("repeatMode", "REPEAT_OFF");
                        break;
                    case 1:
                        jSONObject2.put("repeatMode", "REPEAT_ALL");
                        break;
                    case 2:
                        jSONObject2.put("repeatMode", "REPEAT_SINGLE");
                        break;
                    case 3:
                        jSONObject2.put("repeatMode", "REPEAT_ALL_AND_SHUFFLE");
                        break;
                }
            }
            if (j != -1) {
                jSONObject2.put("currentTime", j / 1000.0d);
            }
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException e) {
        }
        m12373a(jSONObject2.toString(), jM12376c, null);
        return jM12376c;
    }

    /* JADX INFO: renamed from: a */
    public final long m12460a(InterfaceC1998vs interfaceC1998vs, long j, int i, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        long jM12376c = m12376c();
        this.f11808m.m12470a(jM12376c, interfaceC1998vs);
        m12368a(true);
        try {
            jSONObject2.put("requestId", jM12376c);
            jSONObject2.put("type", "SEEK");
            jSONObject2.put("mediaSessionId", m12452h());
            jSONObject2.put("currentTime", j / 1000.0d);
            if (i == 1) {
                jSONObject2.put("resumeState", "PLAYBACK_START");
            } else if (i == 2) {
                jSONObject2.put("resumeState", "PLAYBACK_PAUSE");
            }
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException e) {
        }
        m12373a(jSONObject2.toString(), jM12376c, null);
        return jM12376c;
    }

    /* JADX INFO: renamed from: a */
    public final long m12461a(InterfaceC1998vs interfaceC1998vs, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        long jM12376c = m12376c();
        this.f11805j.m12470a(jM12376c, interfaceC1998vs);
        m12368a(true);
        try {
            jSONObject2.put("requestId", jM12376c);
            jSONObject2.put("type", "PAUSE");
            jSONObject2.put("mediaSessionId", m12452h());
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException e) {
        }
        m12373a(jSONObject2.toString(), jM12376c, null);
        return jM12376c;
    }

    @Override // com.google.android.gms.internal.AbstractC1965um, com.google.android.gms.internal.C1972ut
    /* JADX INFO: renamed from: a */
    public final void mo12367a() {
        super.mo12367a();
        m12457m();
    }

    @Override // com.google.android.gms.internal.C1972ut
    /* JADX INFO: renamed from: a */
    public final void mo12370a(long j, int i) {
        Iterator<C1999vt> it = this.f11802g.iterator();
        while (it.hasNext()) {
            it.next().m12473a(j, i, null);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m12462a(InterfaceC1995vp interfaceC1995vp) {
        this.f11803h = interfaceC1995vp;
    }

    @Override // com.google.android.gms.internal.AbstractC1965um
    /* JADX INFO: renamed from: a */
    protected final boolean mo12369a(long j) {
        boolean z;
        Iterator<C1999vt> it = this.f11802g.iterator();
        while (it.hasNext()) {
            it.next().m12472a(j, 2102);
        }
        synchronized (C1999vt.f11823a) {
            Iterator<C1999vt> it2 = this.f11802g.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z = false;
                    break;
                }
                if (it2.next().m12474b()) {
                    z = true;
                    break;
                }
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: b */
    public final long m12463b(InterfaceC1998vs interfaceC1998vs, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        long jM12376c = m12376c();
        this.f11806k.m12470a(jM12376c, interfaceC1998vs);
        m12368a(true);
        try {
            jSONObject2.put("requestId", jM12376c);
            jSONObject2.put("type", "PLAY");
            jSONObject2.put("mediaSessionId", m12452h());
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException e) {
        }
        m12373a(jSONObject2.toString(), jM12376c, null);
        return jM12376c;
    }

    @Override // com.google.android.gms.internal.C1972ut
    /* JADX INFO: renamed from: b */
    public final void mo12375b(String str) {
        JSONObject jSONObject;
        long jOptLong;
        this.f11684c.m12445a("message received: %s", str);
        try {
            jSONObject = new JSONObject(str);
            String string = jSONObject.getString("type");
            jOptLong = jSONObject.optLong("requestId", -1L);
            switch (string) {
                case "MEDIA_STATUS":
                    JSONArray jSONArray = jSONObject.getJSONArray("status");
                    if (jSONArray.length() <= 0) {
                        this.f11801f = null;
                        m12453i();
                        m12454j();
                        m12455k();
                        m12456l();
                        this.f11811p.m12473a(jOptLong, 0, null);
                        break;
                    } else {
                        m12451a(jOptLong, jSONArray.getJSONObject(0));
                        break;
                    }
                    break;
                case "INVALID_PLAYER_STATE":
                    this.f11684c.m12449c("received unexpected error: Invalid Player State.", new Object[0]);
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("customData");
                    Iterator<C1999vt> it = this.f11802g.iterator();
                    while (it.hasNext()) {
                        it.next().m12473a(jOptLong, 2100, jSONObjectOptJSONObject);
                    }
                    break;
                case "LOAD_FAILED":
                    this.f11804i.m12473a(jOptLong, 2100, jSONObject.optJSONObject("customData"));
                    break;
                case "LOAD_CANCELLED":
                    this.f11804i.m12473a(jOptLong, 2101, jSONObject.optJSONObject("customData"));
                    break;
                case "INVALID_REQUEST":
                    this.f11684c.m12449c("received unexpected error: Invalid Request.", new Object[0]);
                    JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("customData");
                    Iterator<C1999vt> it2 = this.f11802g.iterator();
                    while (it2.hasNext()) {
                        it2.next().m12473a(jOptLong, 2100, jSONObjectOptJSONObject2);
                    }
                    break;
            }
        } catch (JSONException e) {
            this.f11684c.m12449c("Message is malformed (%s); ignoring: %s", e.getMessage(), str);
        }
    }

    /* JADX INFO: renamed from: d */
    public final long m12464d() {
        MediaInfo mediaInfoM12467g = m12467g();
        if (mediaInfoM12467g == null || this.f11800e == 0) {
            return 0L;
        }
        double dM6576d = this.f11801f.m6576d();
        long jM6578f = this.f11801f.m6578f();
        int iM6572b = this.f11801f.m6572b();
        if (dM6576d == 0.0d || iM6572b != 2) {
            return jM6578f;
        }
        long jM6265e = mediaInfoM12467g.m6265e();
        long jMo7253b = this.f11668a.mo7253b() - this.f11800e;
        if (jMo7253b < 0) {
            jMo7253b = 0;
        }
        if (jMo7253b == 0) {
            return jM6578f;
        }
        long j = jM6578f + ((long) (jMo7253b * dM6576d));
        if (jM6265e <= 0 || j <= jM6265e) {
            jM6265e = j < 0 ? 0L : j;
        }
        return jM6265e;
    }

    /* JADX INFO: renamed from: e */
    public final long m12465e() {
        MediaInfo mediaInfoM12467g = m12467g();
        if (mediaInfoM12467g != null) {
            return mediaInfoM12467g.m6265e();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: f */
    public final C1054j m12466f() {
        return this.f11801f;
    }

    /* JADX INFO: renamed from: g */
    public final MediaInfo m12467g() {
        if (this.f11801f == null) {
            return null;
        }
        return this.f11801f.m6577e();
    }
}
