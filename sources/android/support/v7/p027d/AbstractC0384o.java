package android.support.v7.p027d;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.media.AudioManager;
import android.os.Build;
import android.support.v7.p027d.AbstractC0372c;
import android.support.v7.p027d.C0370a;
import android.support.v7.p027d.C0373d;
import android.support.v7.p027d.C0376g;
import android.support.v7.p027d.C0377h;
import android.support.v7.p027d.C0378i;
import android.support.v7.p027d.C0379j;
import android.support.v7.p027d.C0380k;
import android.support.v7.p028e.C0385a;
import android.view.Display;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: android.support.v7.d.o */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0384o extends AbstractC0372c {

    /* JADX INFO: renamed from: android.support.v7.d.o$a */
    private static class a extends d {
        public a(Context context, f fVar) {
            super(context, fVar);
        }

        @Override // android.support.v7.p027d.AbstractC0384o.d, android.support.v7.p027d.AbstractC0384o.c, android.support.v7.p027d.AbstractC0384o.b
        /* JADX INFO: renamed from: a */
        protected void mo3105a(b.C2328b c2328b, C0370a.a aVar) {
            super.mo3105a(c2328b, aVar);
            aVar.m2840c(C0377h.a.m2999a(c2328b.f2310a));
        }
    }

    /* JADX INFO: renamed from: android.support.v7.d.o$b */
    static class b extends AbstractC0384o implements C0378i.a, C0378i.g {

        /* JADX INFO: renamed from: j */
        private static final ArrayList<IntentFilter> f2294j;

        /* JADX INFO: renamed from: k */
        private static final ArrayList<IntentFilter> f2295k;

        /* JADX INFO: renamed from: a */
        protected final Object f2296a;

        /* JADX INFO: renamed from: b */
        protected final Object f2297b;

        /* JADX INFO: renamed from: c */
        protected final Object f2298c;

        /* JADX INFO: renamed from: d */
        protected final Object f2299d;

        /* JADX INFO: renamed from: e */
        protected int f2300e;

        /* JADX INFO: renamed from: f */
        protected boolean f2301f;

        /* JADX INFO: renamed from: g */
        protected boolean f2302g;

        /* JADX INFO: renamed from: h */
        protected final ArrayList<C2328b> f2303h;

        /* JADX INFO: renamed from: i */
        protected final ArrayList<c> f2304i;

        /* JADX INFO: renamed from: l */
        private final f f2305l;

        /* JADX INFO: renamed from: m */
        private C0378i.e f2306m;

        /* JADX INFO: renamed from: n */
        private C0378i.c f2307n;

        /* JADX INFO: renamed from: android.support.v7.d.o$b$a */
        protected final class a extends AbstractC0372c.d {

            /* JADX INFO: renamed from: b */
            private final Object f2309b;

            public a(Object obj) {
                this.f2309b = obj;
            }

            @Override // android.support.v7.p027d.AbstractC0372c.d
            /* JADX INFO: renamed from: b */
            public void mo2870b(int i) {
                C0378i.d.m3023a(this.f2309b, i);
            }

            @Override // android.support.v7.p027d.AbstractC0372c.d
            /* JADX INFO: renamed from: c */
            public void mo2872c(int i) {
                C0378i.d.m3026b(this.f2309b, i);
            }
        }

        /* JADX INFO: renamed from: android.support.v7.d.o$b$b, reason: collision with other inner class name */
        protected static final class C2328b {

            /* JADX INFO: renamed from: a */
            public final Object f2310a;

            /* JADX INFO: renamed from: b */
            public final String f2311b;

            /* JADX INFO: renamed from: c */
            public C0370a f2312c;

            public C2328b(Object obj, String str) {
                this.f2310a = obj;
                this.f2311b = str;
            }
        }

        /* JADX INFO: renamed from: android.support.v7.d.o$b$c */
        protected static final class c {

            /* JADX INFO: renamed from: a */
            public final C0376g.g f2313a;

            /* JADX INFO: renamed from: b */
            public final Object f2314b;

            public c(C0376g.g gVar, Object obj) {
                this.f2313a = gVar;
                this.f2314b = obj;
            }
        }

        static {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addCategory("android.media.intent.category.LIVE_AUDIO");
            f2294j = new ArrayList<>();
            f2294j.add(intentFilter);
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addCategory("android.media.intent.category.LIVE_VIDEO");
            f2295k = new ArrayList<>();
            f2295k.add(intentFilter2);
        }

        public b(Context context, f fVar) {
            super(context);
            this.f2303h = new ArrayList<>();
            this.f2304i = new ArrayList<>();
            this.f2305l = fVar;
            this.f2296a = C0378i.m3000a(context);
            this.f2297b = mo3119k();
            this.f2298c = m3120l();
            this.f2299d = C0378i.m3004a(this.f2296a, context.getResources().getString(C0385a.b.mr_user_route_category_name), false);
            m3108m();
        }

        /* JADX INFO: renamed from: e */
        private boolean m3106e(Object obj) {
            if (m3114g(obj) != null || m3113f(obj) >= 0) {
                return false;
            }
            C2328b c2328b = new C2328b(obj, m3107j(obj));
            m3109a(c2328b);
            this.f2303h.add(c2328b);
            return true;
        }

        /* JADX INFO: renamed from: j */
        private String m3107j(Object obj) {
            String str = mo3104h() == obj ? "DEFAULT_ROUTE" : String.format(Locale.US, "ROUTE_%08x", Integer.valueOf(m3115h(obj).hashCode()));
            if (m3111b(str) < 0) {
                return str;
            }
            int i = 2;
            while (true) {
                String str2 = String.format(Locale.US, "%s_%d", str, Integer.valueOf(i));
                if (m3111b(str2) < 0) {
                    return str2;
                }
                i++;
            }
        }

        /* JADX INFO: renamed from: m */
        private void m3108m() {
            mo3118j();
            boolean zM3106e = false;
            Iterator it = C0378i.m3005a(this.f2296a).iterator();
            while (it.hasNext()) {
                zM3106e |= m3106e(it.next());
            }
            if (zM3106e) {
                m3116i();
            }
        }

        @Override // android.support.v7.p027d.AbstractC0372c
        /* JADX INFO: renamed from: a */
        public AbstractC0372c.d mo2852a(String str) {
            int iM3111b = m3111b(str);
            if (iM3111b >= 0) {
                return new a(this.f2303h.get(iM3111b).f2310a);
            }
            return null;
        }

        @Override // android.support.v7.p027d.C0378i.a
        /* JADX INFO: renamed from: a */
        public void mo3012a(int i, Object obj) {
            if (obj != C0378i.m3003a(this.f2296a, 8388611)) {
                return;
            }
            c cVarM3114g = m3114g(obj);
            if (cVarM3114g != null) {
                cVarM3114g.f2313a.m2996o();
                return;
            }
            int iM3113f = m3113f(obj);
            if (iM3113f >= 0) {
                C0376g.g gVarMo2944b = this.f2305l.mo2944b(this.f2303h.get(iM3113f).f2311b);
                if (gVarMo2944b != null) {
                    gVarMo2944b.m2996o();
                }
            }
        }

        @Override // android.support.v7.p027d.AbstractC0384o
        /* JADX INFO: renamed from: a */
        public void mo3100a(C0376g.g gVar) {
            if (gVar.m2998q() == this) {
                int iM3113f = m3113f(C0378i.m3003a(this.f2296a, 8388611));
                if (iM3113f < 0 || !this.f2303h.get(iM3113f).f2311b.equals(gVar.m2997p())) {
                    return;
                }
                gVar.m2996o();
                return;
            }
            Object objM3008b = C0378i.m3008b(this.f2296a, this.f2299d);
            c cVar = new c(gVar, objM3008b);
            C0378i.d.m3024a(objM3008b, cVar);
            C0378i.f.m3035a(objM3008b, this.f2298c);
            mo3110a(cVar);
            this.f2304i.add(cVar);
            C0378i.m3010c(this.f2296a, objM3008b);
        }

        /* JADX INFO: renamed from: a */
        protected void m3109a(C2328b c2328b) {
            C0370a.a aVar = new C0370a.a(c2328b.f2311b, m3115h(c2328b.f2310a));
            mo3105a(c2328b, aVar);
            c2328b.f2312c = aVar.m2836a();
        }

        /* JADX INFO: renamed from: a */
        protected void mo3105a(C2328b c2328b, C0370a.a aVar) {
            int iM3021a = C0378i.d.m3021a(c2328b.f2310a);
            if ((iM3021a & 1) != 0) {
                aVar.m2834a(f2294j);
            }
            if ((iM3021a & 2) != 0) {
                aVar.m2834a(f2295k);
            }
            aVar.m2831a(C0378i.d.m3025b(c2328b.f2310a));
            aVar.m2837b(C0378i.d.m3027c(c2328b.f2310a));
            aVar.m2842d(C0378i.d.m3028d(c2328b.f2310a));
            aVar.m2843e(C0378i.d.m3029e(c2328b.f2310a));
            aVar.m2844f(C0378i.d.m3030f(c2328b.f2310a));
        }

        /* JADX INFO: renamed from: a */
        protected void mo3110a(c cVar) {
            C0378i.f.m3034a(cVar.f2314b, (CharSequence) cVar.f2313a.m2985d());
            C0378i.f.m3033a(cVar.f2314b, cVar.f2313a.m2989h());
            C0378i.f.m3036b(cVar.f2314b, cVar.f2313a.m2990i());
            C0378i.f.m3038c(cVar.f2314b, cVar.f2313a.m2993l());
            C0378i.f.m3039d(cVar.f2314b, cVar.f2313a.m2994m());
            C0378i.f.m3040e(cVar.f2314b, cVar.f2313a.m2992k());
        }

        @Override // android.support.v7.p027d.C0378i.a
        /* JADX INFO: renamed from: a */
        public void mo3013a(Object obj) {
            if (m3106e(obj)) {
                m3116i();
            }
        }

        @Override // android.support.v7.p027d.C0378i.g
        /* JADX INFO: renamed from: a */
        public void mo3041a(Object obj, int i) {
            c cVarM3114g = m3114g(obj);
            if (cVarM3114g != null) {
                cVarM3114g.f2313a.m2978a(i);
            }
        }

        @Override // android.support.v7.p027d.C0378i.a
        /* JADX INFO: renamed from: a */
        public void mo3014a(Object obj, Object obj2) {
        }

        @Override // android.support.v7.p027d.C0378i.a
        /* JADX INFO: renamed from: a */
        public void mo3015a(Object obj, Object obj2, int i) {
        }

        /* JADX INFO: renamed from: b */
        protected int m3111b(String str) {
            int size = this.f2303h.size();
            for (int i = 0; i < size; i++) {
                if (this.f2303h.get(i).f2311b.equals(str)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // android.support.v7.p027d.C0378i.a
        /* JADX INFO: renamed from: b */
        public void mo3016b(int i, Object obj) {
        }

        @Override // android.support.v7.p027d.AbstractC0372c
        /* JADX INFO: renamed from: b */
        public void mo2858b(C0371b c0371b) {
            int i;
            boolean zM2848b = false;
            if (c0371b != null) {
                List<String> listM2881a = c0371b.m2847a().m2881a();
                int size = listM2881a.size();
                int i2 = 0;
                i = 0;
                while (i2 < size) {
                    String str = listM2881a.get(i2);
                    i2++;
                    i = str.equals("android.media.intent.category.LIVE_AUDIO") ? i | 1 : str.equals("android.media.intent.category.LIVE_VIDEO") ? i | 2 : 8388608 | i;
                }
                zM2848b = c0371b.m2848b();
            } else {
                i = 0;
            }
            if (this.f2300e == i && this.f2301f == zM2848b) {
                return;
            }
            this.f2300e = i;
            this.f2301f = zM2848b;
            m3108m();
        }

        @Override // android.support.v7.p027d.AbstractC0384o
        /* JADX INFO: renamed from: b */
        public void mo3101b(C0376g.g gVar) {
            int iM3112e;
            if (gVar.m2998q() == this || (iM3112e = m3112e(gVar)) < 0) {
                return;
            }
            c cVarRemove = this.f2304i.remove(iM3112e);
            C0378i.d.m3024a(cVarRemove.f2314b, (Object) null);
            C0378i.f.m3035a(cVarRemove.f2314b, (Object) null);
            C0378i.m3011d(this.f2296a, cVarRemove.f2314b);
        }

        @Override // android.support.v7.p027d.C0378i.a
        /* JADX INFO: renamed from: b */
        public void mo3017b(Object obj) {
            int iM3113f;
            if (m3114g(obj) != null || (iM3113f = m3113f(obj)) < 0) {
                return;
            }
            this.f2303h.remove(iM3113f);
            m3116i();
        }

        @Override // android.support.v7.p027d.C0378i.g
        /* JADX INFO: renamed from: b */
        public void mo3042b(Object obj, int i) {
            c cVarM3114g = m3114g(obj);
            if (cVarM3114g != null) {
                cVarM3114g.f2313a.m2983b(i);
            }
        }

        @Override // android.support.v7.p027d.AbstractC0384o
        /* JADX INFO: renamed from: c */
        public void mo3102c(C0376g.g gVar) {
            int iM3112e;
            if (gVar.m2998q() == this || (iM3112e = m3112e(gVar)) < 0) {
                return;
            }
            mo3110a(this.f2304i.get(iM3112e));
        }

        @Override // android.support.v7.p027d.C0378i.a
        /* JADX INFO: renamed from: c */
        public void mo3018c(Object obj) {
            int iM3113f;
            if (m3114g(obj) != null || (iM3113f = m3113f(obj)) < 0) {
                return;
            }
            m3109a(this.f2303h.get(iM3113f));
            m3116i();
        }

        @Override // android.support.v7.p027d.AbstractC0384o
        /* JADX INFO: renamed from: d */
        public void mo3103d(C0376g.g gVar) {
            if (gVar.m2987f()) {
                if (gVar.m2998q() != this) {
                    int iM3112e = m3112e(gVar);
                    if (iM3112e >= 0) {
                        mo3117i(this.f2304i.get(iM3112e).f2314b);
                        return;
                    }
                    return;
                }
                int iM3111b = m3111b(gVar.m2997p());
                if (iM3111b >= 0) {
                    mo3117i(this.f2303h.get(iM3111b).f2310a);
                }
            }
        }

        @Override // android.support.v7.p027d.C0378i.a
        /* JADX INFO: renamed from: d */
        public void mo3019d(Object obj) {
            int iM3113f;
            if (m3114g(obj) != null || (iM3113f = m3113f(obj)) < 0) {
                return;
            }
            C2328b c2328b = this.f2303h.get(iM3113f);
            int iM3028d = C0378i.d.m3028d(obj);
            if (iM3028d != c2328b.f2312c.m2822p()) {
                c2328b.f2312c = new C0370a.a(c2328b.f2312c).m2842d(iM3028d).m2836a();
                m3116i();
            }
        }

        /* JADX INFO: renamed from: e */
        protected int m3112e(C0376g.g gVar) {
            int size = this.f2304i.size();
            for (int i = 0; i < size; i++) {
                if (this.f2304i.get(i).f2313a == gVar) {
                    return i;
                }
            }
            return -1;
        }

        /* JADX INFO: renamed from: f */
        protected int m3113f(Object obj) {
            int size = this.f2303h.size();
            for (int i = 0; i < size; i++) {
                if (this.f2303h.get(i).f2310a == obj) {
                    return i;
                }
            }
            return -1;
        }

        /* JADX INFO: renamed from: g */
        protected c m3114g(Object obj) {
            Object objM3031g = C0378i.d.m3031g(obj);
            if (objM3031g instanceof c) {
                return (c) objM3031g;
            }
            return null;
        }

        @Override // android.support.v7.p027d.AbstractC0384o
        /* JADX INFO: renamed from: h */
        protected Object mo3104h() {
            if (this.f2307n == null) {
                this.f2307n = new C0378i.c();
            }
            return this.f2307n.m3020a(this.f2296a);
        }

        /* JADX INFO: renamed from: h */
        protected String m3115h(Object obj) {
            CharSequence charSequenceM3022a = C0378i.d.m3022a(obj, m2851a());
            return charSequenceM3022a != null ? charSequenceM3022a.toString() : "";
        }

        /* JADX INFO: renamed from: i */
        protected void m3116i() {
            C0373d.a aVar = new C0373d.a();
            int size = this.f2303h.size();
            for (int i = 0; i < size; i++) {
                aVar.m2877a(this.f2303h.get(i).f2312c);
            }
            m2856a(aVar.m2878a());
        }

        /* JADX INFO: renamed from: i */
        protected void mo3117i(Object obj) {
            if (this.f2306m == null) {
                this.f2306m = new C0378i.e();
            }
            this.f2306m.m3032a(this.f2296a, 8388611, obj);
        }

        /* JADX INFO: renamed from: j */
        protected void mo3118j() {
            if (this.f2302g) {
                this.f2302g = false;
                C0378i.m3007a(this.f2296a, this.f2297b);
            }
            if (this.f2300e != 0) {
                this.f2302g = true;
                C0378i.m3009b(this.f2296a, this.f2300e, this.f2297b);
            }
        }

        /* JADX INFO: renamed from: k */
        protected Object mo3119k() {
            return C0378i.m3001a((C0378i.a) this);
        }

        /* JADX INFO: renamed from: l */
        protected Object m3120l() {
            return C0378i.m3002a((C0378i.g) this);
        }
    }

    /* JADX INFO: renamed from: android.support.v7.d.o$c */
    private static class c extends b implements C0379j.b {

        /* JADX INFO: renamed from: j */
        private C0379j.a f2315j;

        /* JADX INFO: renamed from: k */
        private C0379j.d f2316k;

        public c(Context context, f fVar) {
            super(context, fVar);
        }

        @Override // android.support.v7.p027d.AbstractC0384o.b
        /* JADX INFO: renamed from: a */
        protected void mo3105a(b.C2328b c2328b, C0370a.a aVar) {
            super.mo3105a(c2328b, aVar);
            if (!C0379j.e.m3047a(c2328b.f2310a)) {
                aVar.m2835a(false);
            }
            if (mo3121b(c2328b)) {
                aVar.m2839b(true);
            }
            Display displayM3048b = C0379j.e.m3048b(c2328b.f2310a);
            if (displayM3048b != null) {
                aVar.m2845g(displayM3048b.getDisplayId());
            }
        }

        /* JADX INFO: renamed from: b */
        protected boolean mo3121b(b.C2328b c2328b) {
            if (this.f2316k == null) {
                this.f2316k = new C0379j.d();
            }
            return this.f2316k.m3046a(c2328b.f2310a);
        }

        @Override // android.support.v7.p027d.C0379j.b
        /* JADX INFO: renamed from: e */
        public void mo3045e(Object obj) {
            int iF = m3113f(obj);
            if (iF >= 0) {
                b.C2328b c2328b = this.f2303h.get(iF);
                Display displayM3048b = C0379j.e.m3048b(obj);
                int displayId = displayM3048b != null ? displayM3048b.getDisplayId() : -1;
                if (displayId != c2328b.f2312c.m2825s()) {
                    c2328b.f2312c = new C0370a.a(c2328b.f2312c).m2845g(displayId).m2836a();
                    m3116i();
                }
            }
        }

        @Override // android.support.v7.p027d.AbstractC0384o.b
        /* JADX INFO: renamed from: j */
        protected void mo3118j() {
            super.mo3118j();
            if (this.f2315j == null) {
                this.f2315j = new C0379j.a(m2851a(), m2857b());
            }
            this.f2315j.m3044a(this.f2301f ? this.f2300e : 0);
        }

        @Override // android.support.v7.p027d.AbstractC0384o.b
        /* JADX INFO: renamed from: k */
        protected Object mo3119k() {
            return C0379j.m3043a(this);
        }
    }

    /* JADX INFO: renamed from: android.support.v7.d.o$d */
    private static class d extends c {
        public d(Context context, f fVar) {
            super(context, fVar);
        }

        @Override // android.support.v7.p027d.AbstractC0384o.c, android.support.v7.p027d.AbstractC0384o.b
        /* JADX INFO: renamed from: a */
        protected void mo3105a(b.C2328b c2328b, C0370a.a aVar) {
            super.mo3105a(c2328b, aVar);
            CharSequence charSequenceM3051a = C0380k.a.m3051a(c2328b.f2310a);
            if (charSequenceM3051a != null) {
                aVar.m2841c(charSequenceM3051a.toString());
            }
        }

        @Override // android.support.v7.p027d.AbstractC0384o.b
        /* JADX INFO: renamed from: a */
        protected void mo3110a(b.c cVar) {
            super.mo3110a(cVar);
            C0380k.b.m3053a(cVar.f2314b, cVar.f2313a.m2986e());
        }

        @Override // android.support.v7.p027d.AbstractC0384o.c
        /* JADX INFO: renamed from: b */
        protected boolean mo3121b(b.C2328b c2328b) {
            return C0380k.a.m3052b(c2328b.f2310a);
        }

        @Override // android.support.v7.p027d.AbstractC0384o.b, android.support.v7.p027d.AbstractC0384o
        /* JADX INFO: renamed from: h */
        protected Object mo3104h() {
            return C0380k.m3049a(this.f2296a);
        }

        @Override // android.support.v7.p027d.AbstractC0384o.b
        /* JADX INFO: renamed from: i */
        protected void mo3117i(Object obj) {
            C0378i.m3006a(this.f2296a, 8388611, obj);
        }

        @Override // android.support.v7.p027d.AbstractC0384o.c, android.support.v7.p027d.AbstractC0384o.b
        /* JADX INFO: renamed from: j */
        protected void mo3118j() {
            if (this.f2302g) {
                C0378i.m3007a(this.f2296a, this.f2297b);
            }
            this.f2302g = true;
            C0380k.m3050a(this.f2296a, this.f2300e, this.f2297b, (this.f2301f ? 1 : 0) | 2);
        }
    }

    /* JADX INFO: renamed from: android.support.v7.d.o$e */
    static class e extends AbstractC0384o {

        /* JADX INFO: renamed from: c */
        private static final ArrayList<IntentFilter> f2317c;

        /* JADX INFO: renamed from: a */
        final AudioManager f2318a;

        /* JADX INFO: renamed from: b */
        int f2319b;

        /* JADX INFO: renamed from: d */
        private final b f2320d;

        /* JADX INFO: renamed from: android.support.v7.d.o$e$a */
        final class a extends AbstractC0372c.d {
            a() {
            }

            @Override // android.support.v7.p027d.AbstractC0372c.d
            /* JADX INFO: renamed from: b */
            public void mo2870b(int i) {
                e.this.f2318a.setStreamVolume(3, i, 0);
                e.this.m3122i();
            }

            @Override // android.support.v7.p027d.AbstractC0372c.d
            /* JADX INFO: renamed from: c */
            public void mo2872c(int i) {
                int streamVolume = e.this.f2318a.getStreamVolume(3);
                if (Math.min(e.this.f2318a.getStreamMaxVolume(3), Math.max(0, streamVolume + i)) != streamVolume) {
                    e.this.f2318a.setStreamVolume(3, streamVolume, 0);
                }
                e.this.m3122i();
            }
        }

        /* JADX INFO: renamed from: android.support.v7.d.o$e$b */
        final class b extends BroadcastReceiver {
            b() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                int intExtra;
                if (!intent.getAction().equals("android.media.VOLUME_CHANGED_ACTION") || intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) != 3 || (intExtra = intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_VALUE", -1)) < 0 || intExtra == e.this.f2319b) {
                    return;
                }
                e.this.m3122i();
            }
        }

        static {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addCategory("android.media.intent.category.LIVE_AUDIO");
            intentFilter.addCategory("android.media.intent.category.LIVE_VIDEO");
            f2317c = new ArrayList<>();
            f2317c.add(intentFilter);
        }

        public e(Context context) {
            super(context);
            this.f2319b = -1;
            this.f2318a = (AudioManager) context.getSystemService("audio");
            this.f2320d = new b();
            context.registerReceiver(this.f2320d, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            m3122i();
        }

        @Override // android.support.v7.p027d.AbstractC0372c
        /* JADX INFO: renamed from: a */
        public AbstractC0372c.d mo2852a(String str) {
            if (str.equals("DEFAULT_ROUTE")) {
                return new a();
            }
            return null;
        }

        /* JADX INFO: renamed from: i */
        void m3122i() {
            Resources resources = m2851a().getResources();
            int streamMaxVolume = this.f2318a.getStreamMaxVolume(3);
            this.f2319b = this.f2318a.getStreamVolume(3);
            m2856a(new C0373d.a().m2877a(new C0370a.a("DEFAULT_ROUTE", resources.getString(C0385a.b.mr_system_route_name)).m2834a(f2317c).m2837b(3).m2831a(0).m2844f(1).m2843e(streamMaxVolume).m2842d(this.f2319b).m2836a()).m2878a());
        }
    }

    /* JADX INFO: renamed from: android.support.v7.d.o$f */
    public interface f {
        /* JADX INFO: renamed from: b */
        C0376g.g mo2944b(String str);
    }

    protected AbstractC0384o(Context context) {
        super(context, new AbstractC0372c.c(new ComponentName("android", AbstractC0384o.class.getName())));
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC0384o m3099a(Context context, f fVar) {
        return Build.VERSION.SDK_INT >= 24 ? new a(context, fVar) : Build.VERSION.SDK_INT >= 18 ? new d(context, fVar) : Build.VERSION.SDK_INT >= 17 ? new c(context, fVar) : Build.VERSION.SDK_INT >= 16 ? new b(context, fVar) : new e(context);
    }

    /* JADX INFO: renamed from: a */
    public void mo3100a(C0376g.g gVar) {
    }

    /* JADX INFO: renamed from: b */
    public void mo3101b(C0376g.g gVar) {
    }

    /* JADX INFO: renamed from: c */
    public void mo3102c(C0376g.g gVar) {
    }

    /* JADX INFO: renamed from: d */
    public void mo3103d(C0376g.g gVar) {
    }

    /* JADX INFO: renamed from: h */
    protected Object mo3104h() {
        return null;
    }
}
