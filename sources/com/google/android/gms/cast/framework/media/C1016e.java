package com.google.android.gms.cast.framework.media;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.cast.C0988b;
import com.google.android.gms.cast.C0991e;
import com.google.android.gms.cast.C1053i;
import com.google.android.gms.cast.C1054j;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.AbstractC1079f;
import com.google.android.gms.common.api.AbstractC1080g;
import com.google.android.gms.common.api.C1074a;
import com.google.android.gms.common.api.InterfaceC1193k;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.internal.AbstractC1964ul;
import com.google.android.gms.internal.C1973uu;
import com.google.android.gms.internal.C1993vn;
import com.google.android.gms.internal.InterfaceC1997vr;
import com.google.android.gms.internal.InterfaceC1998vs;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.cast.framework.media.e */
/* JADX INFO: loaded from: classes.dex */
public class C1016e implements C0991e.e {

    /* JADX INFO: renamed from: a */
    public static final String f5331a = C1993vn.f11799d;

    /* JADX INFO: renamed from: d */
    private final C1993vn f5334d;

    /* JADX INFO: renamed from: f */
    private final C0991e.b f5336f;

    /* JADX INFO: renamed from: g */
    private AbstractC1079f f5337g;

    /* JADX INFO: renamed from: k */
    private c f5341k;

    /* JADX INFO: renamed from: h */
    private final List<a> f5338h = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: i */
    private final Map<d, i> f5339i = new ConcurrentHashMap();

    /* JADX INFO: renamed from: j */
    private final Map<Long, i> f5340j = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b */
    private final Object f5332b = new Object();

    /* JADX INFO: renamed from: c */
    private final Handler f5333c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: e */
    private final e f5335e = new e();

    /* JADX INFO: renamed from: com.google.android.gms.cast.framework.media.e$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo6494a();

        /* JADX INFO: renamed from: b */
        void mo6495b();

        /* JADX INFO: renamed from: c */
        void mo6496c();

        /* JADX INFO: renamed from: d */
        void mo6497d();

        /* JADX INFO: renamed from: e */
        void mo6498e();

        /* JADX INFO: renamed from: f */
        void mo6499f();
    }

    /* JADX INFO: renamed from: com.google.android.gms.cast.framework.media.e$b */
    public interface b extends InterfaceC1193k {
    }

    /* JADX INFO: renamed from: com.google.android.gms.cast.framework.media.e$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        boolean m6500a(C1054j c1054j);

        /* JADX INFO: renamed from: b */
        List<C0988b> m6501b(C1054j c1054j);
    }

    /* JADX INFO: renamed from: com.google.android.gms.cast.framework.media.e$d */
    public interface d {
        /* JADX INFO: renamed from: a */
        void m6502a(long j, long j2);
    }

    /* JADX INFO: renamed from: com.google.android.gms.cast.framework.media.e$e */
    class e implements InterfaceC1997vr {

        /* JADX INFO: renamed from: b */
        private AbstractC1079f f5343b;

        /* JADX INFO: renamed from: c */
        private long f5344c = 0;

        public e() {
        }

        @Override // com.google.android.gms.internal.InterfaceC1997vr
        /* JADX INFO: renamed from: a */
        public final long mo6503a() {
            long j = this.f5344c + 1;
            this.f5344c = j;
            return j;
        }

        /* JADX INFO: renamed from: a */
        public final void m6504a(AbstractC1079f abstractC1079f) {
            this.f5343b = abstractC1079f;
        }

        @Override // com.google.android.gms.internal.InterfaceC1997vr
        /* JADX INFO: renamed from: a */
        public final void mo6505a(String str, String str2, long j, String str3) throws IOException {
            if (this.f5343b == null) {
                throw new IOException("No GoogleApiClient available");
            }
            C1016e.this.f5336f.mo6311a(this.f5343b, str, str2).mo6696a(new C1021j(this, j));
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.cast.framework.media.e$f */
    abstract class f extends AbstractC1964ul<b> {

        /* JADX INFO: renamed from: a */
        InterfaceC1998vs f5345a;

        /* JADX INFO: renamed from: c */
        private final boolean f5346c;

        f(C1016e c1016e, AbstractC1079f abstractC1079f) {
            this(abstractC1079f, false);
        }

        f(AbstractC1079f abstractC1079f, boolean z) {
            super(abstractC1079f);
            this.f5346c = z;
            this.f5345a = new C1022k(this, C1016e.this);
        }

        @Override // com.google.android.gms.common.api.internal.BasePendingResult
        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC1193k mo6177a(Status status) {
            return new C1023l(this, status);
        }

        @Override // com.google.android.gms.common.api.internal.AbstractC1155cp
        /* JADX INFO: renamed from: a */
        protected final /* synthetic */ void mo6178a(C1074a.c cVar) {
            C1973uu c1973uu = (C1973uu) cVar;
            if (!this.f5346c) {
                Iterator it = C1016e.this.f5338h.iterator();
                while (it.hasNext()) {
                    ((a) it.next()).mo6498e();
                }
            }
            mo6506a(c1973uu);
        }

        /* JADX INFO: renamed from: a */
        abstract void mo6506a(C1973uu c1973uu);

        @Override // com.google.android.gms.internal.AbstractC1964ul, com.google.android.gms.common.api.internal.AbstractC1155cp, com.google.android.gms.common.api.internal.InterfaceC1156cq
        /* JADX INFO: renamed from: a */
        public final /* bridge */ /* synthetic */ void mo6179a(Object obj) {
            super.m6708a((b) obj);
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.cast.framework.media.e$g */
    static final class g implements b {

        /* JADX INFO: renamed from: a */
        private final Status f5348a;

        /* JADX INFO: renamed from: b */
        private final JSONObject f5349b;

        g(Status status, JSONObject jSONObject) {
            this.f5348a = status;
            this.f5349b = jSONObject;
        }

        @Override // com.google.android.gms.common.api.InterfaceC1193k
        /* JADX INFO: renamed from: a */
        public final Status mo6094a() {
            return this.f5348a;
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.cast.framework.media.e$h */
    static class h extends BasePendingResult<b> {
        h() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.common.api.internal.BasePendingResult
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final b mo6177a(Status status) {
            return new C1024m(this, status);
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.cast.framework.media.e$i */
    class i {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C1016e f5350a;

        /* JADX INFO: renamed from: b */
        private final Set<d> f5351b;

        /* JADX INFO: renamed from: c */
        private final long f5352c;

        /* JADX INFO: renamed from: d */
        private final Runnable f5353d;

        /* JADX INFO: renamed from: e */
        private boolean f5354e;

        /* JADX INFO: renamed from: a */
        public final void m6509a() {
            this.f5350a.f5333c.removeCallbacks(this.f5353d);
            this.f5354e = true;
            this.f5350a.f5333c.postDelayed(this.f5353d, this.f5352c);
        }

        /* JADX INFO: renamed from: b */
        public final void m6510b() {
            this.f5350a.f5333c.removeCallbacks(this.f5353d);
            this.f5354e = false;
        }

        /* JADX INFO: renamed from: c */
        public final boolean m6511c() {
            return this.f5354e;
        }
    }

    public C1016e(C1993vn c1993vn, C0991e.b bVar) {
        this.f5336f = bVar;
        this.f5334d = (C1993vn) C1221aj.m7065a(c1993vn);
        this.f5334d.m12462a(new C1034w(this));
        this.f5334d.m12371a(this.f5335e);
    }

    /* JADX INFO: renamed from: a */
    private final f m6453a(f fVar) {
        try {
            try {
                this.f5337g.mo6674b(fVar);
            } catch (IllegalStateException e2) {
                fVar.m6708a((b) fVar.mo6177a(new Status(2100)));
            }
        } catch (Throwable th) {
        }
        return fVar;
    }

    /* JADX INFO: renamed from: a */
    private final void m6455a(Set<d> set) {
        if (m6487n() || m6486m()) {
            return;
        }
        HashSet hashSet = new HashSet(set);
        if (m6485l()) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((d) it.next()).m6502a(m6478e(), m6479f());
            }
        } else {
            if (!m6488o()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((d) it2.next()).m6502a(0L, 0L);
                }
                return;
            }
            C1053i c1053iM6489p = m6489p();
            if (c1053iM6489p == null || c1053iM6489p.m6556a() == null) {
                return;
            }
            Iterator it3 = hashSet.iterator();
            while (it3.hasNext()) {
                ((d) it3.next()).m6502a(0L, c1053iM6489p.m6556a().m6265e());
            }
        }
    }

    /* JADX INFO: renamed from: u */
    private final boolean m6462u() {
        return this.f5337g != null;
    }

    /* JADX INFO: renamed from: v */
    private static AbstractC1080g<b> m6463v() {
        h hVar = new h();
        hVar.m6708a(hVar.mo6177a(new Status(17)));
        return hVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public final void m6464w() {
        for (i iVar : this.f5340j.values()) {
            if (m6491r() && !iVar.m6511c()) {
                iVar.m6509a();
            } else if (!m6491r() && iVar.m6511c()) {
                iVar.m6510b();
            }
            if (iVar.m6511c() && (m6487n() || m6486m() || m6488o())) {
                m6455a(iVar.f5351b);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public AbstractC1080g<b> m6465a(long j) {
        return m6466a(j, 0, (JSONObject) null);
    }

    /* JADX INFO: renamed from: a */
    public AbstractC1080g<b> m6466a(long j, int i2, JSONObject jSONObject) {
        C1221aj.m7073b("Must be called from the main thread.");
        return !m6462u() ? m6463v() : m6453a(new C1020i(this, this.f5337g, j, i2, jSONObject));
    }

    /* JADX INFO: renamed from: a */
    public AbstractC1080g<b> m6467a(JSONObject jSONObject) {
        C1221aj.m7073b("Must be called from the main thread.");
        return !m6462u() ? m6463v() : m6453a(new C1018g(this, this.f5337g, jSONObject));
    }

    /* JADX INFO: renamed from: a */
    public final void m6468a() {
        if (this.f5337g != null) {
            this.f5336f.mo6312a(this.f5337g, m6493t(), this);
        }
    }

    @Override // com.google.android.gms.cast.C0991e.e
    /* JADX INFO: renamed from: a */
    public void mo6327a(CastDevice castDevice, String str, String str2) {
        this.f5334d.mo12375b(str2);
    }

    /* JADX INFO: renamed from: a */
    public void m6469a(a aVar) {
        C1221aj.m7073b("Must be called from the main thread.");
        if (aVar != null) {
            this.f5338h.add(aVar);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m6470a(AbstractC1079f abstractC1079f) {
        if (this.f5337g == abstractC1079f) {
            return;
        }
        if (this.f5337g != null) {
            this.f5334d.mo12367a();
            try {
                this.f5336f.mo6314b(this.f5337g, m6493t());
            } catch (IOException e2) {
            }
            this.f5335e.m6504a(null);
            this.f5333c.removeCallbacksAndMessages(null);
        }
        this.f5337g = abstractC1079f;
        if (this.f5337g != null) {
            this.f5335e.m6504a(this.f5337g);
        }
    }

    /* JADX INFO: renamed from: b */
    public AbstractC1080g<b> m6471b() {
        return m6467a((JSONObject) null);
    }

    /* JADX INFO: renamed from: b */
    public AbstractC1080g<b> m6472b(JSONObject jSONObject) {
        C1221aj.m7073b("Must be called from the main thread.");
        return !m6462u() ? m6463v() : m6453a(new C1019h(this, this.f5337g, jSONObject));
    }

    /* JADX INFO: renamed from: b */
    public void m6473b(a aVar) {
        C1221aj.m7073b("Must be called from the main thread.");
        if (aVar != null) {
            this.f5338h.remove(aVar);
        }
    }

    /* JADX INFO: renamed from: c */
    public AbstractC1080g<b> m6474c() {
        return m6472b((JSONObject) null);
    }

    /* JADX INFO: renamed from: c */
    public AbstractC1080g<b> m6475c(JSONObject jSONObject) {
        C1221aj.m7073b("Must be called from the main thread.");
        return !m6462u() ? m6463v() : m6453a(new C1036y(this, this.f5337g, jSONObject));
    }

    /* JADX INFO: renamed from: d */
    public AbstractC1080g<b> m6476d() {
        C1221aj.m7073b("Must be called from the main thread.");
        return !m6462u() ? m6463v() : m6453a(new C1035x(this, this.f5337g));
    }

    /* JADX INFO: renamed from: d */
    public AbstractC1080g<b> m6477d(JSONObject jSONObject) {
        C1221aj.m7073b("Must be called from the main thread.");
        return !m6462u() ? m6463v() : m6453a(new C1037z(this, this.f5337g, jSONObject));
    }

    /* JADX INFO: renamed from: e */
    public long m6478e() {
        long jM12464d;
        synchronized (this.f5332b) {
            C1221aj.m7073b("Must be called from the main thread.");
            jM12464d = this.f5334d.m12464d();
        }
        return jM12464d;
    }

    /* JADX INFO: renamed from: f */
    public long m6479f() {
        long jM12465e;
        synchronized (this.f5332b) {
            C1221aj.m7073b("Must be called from the main thread.");
            jM12465e = this.f5334d.m12465e();
        }
        return jM12465e;
    }

    /* JADX INFO: renamed from: g */
    public C1054j m6480g() {
        C1054j c1054jM12466f;
        synchronized (this.f5332b) {
            C1221aj.m7073b("Must be called from the main thread.");
            c1054jM12466f = this.f5334d.m12466f();
        }
        return c1054jM12466f;
    }

    /* JADX INFO: renamed from: h */
    public MediaInfo m6481h() {
        MediaInfo mediaInfoM12467g;
        synchronized (this.f5332b) {
            C1221aj.m7073b("Must be called from the main thread.");
            mediaInfoM12467g = this.f5334d.m12467g();
        }
        return mediaInfoM12467g;
    }

    /* JADX INFO: renamed from: i */
    public int m6482i() {
        int iM6572b;
        synchronized (this.f5332b) {
            C1221aj.m7073b("Must be called from the main thread.");
            C1054j c1054jM6480g = m6480g();
            iM6572b = c1054jM6480g != null ? c1054jM6480g.m6572b() : 1;
        }
        return iM6572b;
    }

    /* JADX INFO: renamed from: j */
    public int m6483j() {
        int iM6574c;
        synchronized (this.f5332b) {
            C1221aj.m7073b("Must be called from the main thread.");
            C1054j c1054jM6480g = m6480g();
            iM6574c = c1054jM6480g != null ? c1054jM6480g.m6574c() : 0;
        }
        return iM6574c;
    }

    /* JADX INFO: renamed from: k */
    public boolean m6484k() {
        C1221aj.m7073b("Must be called from the main thread.");
        MediaInfo mediaInfoM6481h = m6481h();
        return mediaInfoM6481h != null && mediaInfoM6481h.m6262b() == 2;
    }

    /* JADX INFO: renamed from: l */
    public boolean m6485l() {
        C1221aj.m7073b("Must be called from the main thread.");
        C1054j c1054jM6480g = m6480g();
        return c1054jM6480g != null && c1054jM6480g.m6572b() == 2;
    }

    /* JADX INFO: renamed from: m */
    public boolean m6486m() {
        C1221aj.m7073b("Must be called from the main thread.");
        C1054j c1054jM6480g = m6480g();
        return c1054jM6480g != null && (c1054jM6480g.m6572b() == 3 || (m6484k() && m6483j() == 2));
    }

    /* JADX INFO: renamed from: n */
    public boolean m6487n() {
        C1221aj.m7073b("Must be called from the main thread.");
        C1054j c1054jM6480g = m6480g();
        return c1054jM6480g != null && c1054jM6480g.m6572b() == 4;
    }

    /* JADX INFO: renamed from: o */
    public boolean m6488o() {
        C1221aj.m7073b("Must be called from the main thread.");
        C1054j c1054jM6480g = m6480g();
        return (c1054jM6480g == null || c1054jM6480g.m6583k() == 0) ? false : true;
    }

    /* JADX INFO: renamed from: p */
    public C1053i m6489p() {
        C1221aj.m7073b("Must be called from the main thread.");
        C1054j c1054jM6480g = m6480g();
        if (c1054jM6480g == null) {
            return null;
        }
        return c1054jM6480g.m6570a(c1054jM6480g.m6583k());
    }

    /* JADX INFO: renamed from: q */
    public void m6490q() {
        C1221aj.m7073b("Must be called from the main thread.");
        int iM6482i = m6482i();
        if (iM6482i == 4 || iM6482i == 2) {
            m6471b();
        } else {
            m6474c();
        }
    }

    /* JADX INFO: renamed from: r */
    public boolean m6491r() {
        C1221aj.m7073b("Must be called from the main thread.");
        return m6487n() || m6485l() || m6486m() || m6488o();
    }

    /* JADX INFO: renamed from: s */
    public boolean m6492s() {
        C1221aj.m7073b("Must be called from the main thread.");
        C1054j c1054jM6480g = m6480g();
        return c1054jM6480g != null && c1054jM6480g.m6587o();
    }

    /* JADX INFO: renamed from: t */
    public String m6493t() {
        C1221aj.m7073b("Must be called from the main thread.");
        return this.f5334d.m12374b();
    }
}
