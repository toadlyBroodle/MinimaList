package android.support.v7.p027d;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.media.AbstractC0281g;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.p006a.C0146b;
import android.support.v4.p011d.p012a.AbstractC0194a;
import android.support.v4.p018i.C0216j;
import android.support.v7.p027d.AbstractC0372c;
import android.support.v7.p027d.AbstractC0383n;
import android.support.v7.p027d.AbstractC0384o;
import android.support.v7.p027d.C0375f;
import android.support.v7.p027d.C0382m;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: android.support.v7.d.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0376g {

    /* JADX INFO: renamed from: a */
    static final boolean f2157a = Log.isLoggable("MediaRouter", 3);

    /* JADX INFO: renamed from: b */
    static d f2158b;

    /* JADX INFO: renamed from: c */
    final Context f2159c;

    /* JADX INFO: renamed from: d */
    final ArrayList<b> f2160d = new ArrayList<>();

    /* JADX INFO: renamed from: android.support.v7.d.g$a */
    public static abstract class a {
        /* JADX INFO: renamed from: a */
        public void m2904a(C0376g c0376g, e eVar) {
        }

        /* JADX INFO: renamed from: a */
        public void mo2905a(C0376g c0376g, g gVar) {
        }

        /* JADX INFO: renamed from: a */
        public void mo2906a(C0376g c0376g, g gVar, int i) {
            m2908b(c0376g, gVar);
        }

        /* JADX INFO: renamed from: b */
        public void m2907b(C0376g c0376g, e eVar) {
        }

        /* JADX INFO: renamed from: b */
        public void m2908b(C0376g c0376g, g gVar) {
        }

        /* JADX INFO: renamed from: c */
        public void m2909c(C0376g c0376g, e eVar) {
        }

        /* JADX INFO: renamed from: c */
        public void mo2910c(C0376g c0376g, g gVar) {
        }

        /* JADX INFO: renamed from: d */
        public void mo2911d(C0376g c0376g, g gVar) {
        }

        /* JADX INFO: renamed from: e */
        public void mo2912e(C0376g c0376g, g gVar) {
        }

        /* JADX INFO: renamed from: f */
        public void m2913f(C0376g c0376g, g gVar) {
        }

        /* JADX INFO: renamed from: g */
        public void m2914g(C0376g c0376g, g gVar) {
        }
    }

    /* JADX INFO: renamed from: android.support.v7.d.g$b */
    private static final class b {

        /* JADX INFO: renamed from: a */
        public final C0376g f2161a;

        /* JADX INFO: renamed from: b */
        public final a f2162b;

        /* JADX INFO: renamed from: c */
        public C0375f f2163c = C0375f.f2153b;

        /* JADX INFO: renamed from: d */
        public int f2164d;

        public b(C0376g c0376g, a aVar) {
            this.f2161a = c0376g;
            this.f2162b = aVar;
        }

        /* JADX INFO: renamed from: a */
        public boolean m2915a(g gVar) {
            return (this.f2164d & 2) != 0 || gVar.m2979a(this.f2163c);
        }
    }

    /* JADX INFO: renamed from: android.support.v7.d.g$c */
    public static abstract class c {
        /* JADX INFO: renamed from: a */
        public void m2916a(Bundle bundle) {
        }

        /* JADX INFO: renamed from: a */
        public void m2917a(String str, Bundle bundle) {
        }
    }

    /* JADX INFO: renamed from: android.support.v7.d.g$d */
    private static final class d implements C0382m.a, AbstractC0384o.f {

        /* JADX INFO: renamed from: a */
        final Context f2165a;

        /* JADX INFO: renamed from: e */
        final AbstractC0384o f2169e;

        /* JADX INFO: renamed from: f */
        g f2170f;

        /* JADX INFO: renamed from: g */
        MediaSessionCompat f2171g;

        /* JADX INFO: renamed from: m */
        private final AbstractC0194a f2177m;

        /* JADX INFO: renamed from: n */
        private final boolean f2178n;

        /* JADX INFO: renamed from: o */
        private C0382m f2179o;

        /* JADX INFO: renamed from: p */
        private g f2180p;

        /* JADX INFO: renamed from: q */
        private g f2181q;

        /* JADX INFO: renamed from: r */
        private AbstractC0372c.d f2182r;

        /* JADX INFO: renamed from: t */
        private C0371b f2184t;

        /* JADX INFO: renamed from: u */
        private b f2185u;

        /* JADX INFO: renamed from: v */
        private MediaSessionCompat f2186v;

        /* JADX INFO: renamed from: b */
        final ArrayList<WeakReference<C0376g>> f2166b = new ArrayList<>();

        /* JADX INFO: renamed from: h */
        private final ArrayList<g> f2172h = new ArrayList<>();

        /* JADX INFO: renamed from: i */
        private final Map<C0216j<String, String>, String> f2173i = new HashMap();

        /* JADX INFO: renamed from: j */
        private final ArrayList<e> f2174j = new ArrayList<>();

        /* JADX INFO: renamed from: k */
        private final ArrayList<C2326d> f2175k = new ArrayList<>();

        /* JADX INFO: renamed from: c */
        final AbstractC0383n.c f2167c = new AbstractC0383n.c();

        /* JADX INFO: renamed from: l */
        private final c f2176l = new c();

        /* JADX INFO: renamed from: d */
        final a f2168d = new a();

        /* JADX INFO: renamed from: s */
        private final Map<String, AbstractC0372c.d> f2183s = new HashMap();

        /* JADX INFO: renamed from: w */
        private MediaSessionCompat.InterfaceC0300g f2187w = new MediaSessionCompat.InterfaceC0300g() { // from class: android.support.v7.d.g.d.1
            @Override // android.support.v4.media.session.MediaSessionCompat.InterfaceC0300g
            /* JADX INFO: renamed from: a */
            public void mo2229a() {
                if (d.this.f2171g != null) {
                    if (d.this.f2171g.m2067a()) {
                        d.this.m2942a(d.this.f2171g.m2073e());
                    } else {
                        d.this.m2948b(d.this.f2171g.m2073e());
                    }
                }
            }
        };

        /* JADX INFO: renamed from: android.support.v7.d.g$d$a */
        private final class a extends Handler {

            /* JADX INFO: renamed from: b */
            private final ArrayList<b> f2190b = new ArrayList<>();

            a() {
            }

            /* JADX INFO: renamed from: a */
            private void m2954a(b bVar, int i, Object obj, int i2) {
                C0376g c0376g = bVar.f2161a;
                a aVar = bVar.f2162b;
                switch (65280 & i) {
                    case 256:
                        g gVar = (g) obj;
                        if (bVar.m2915a(gVar)) {
                            switch (i) {
                                case 257:
                                    aVar.mo2910c(c0376g, gVar);
                                    break;
                                case 258:
                                    aVar.mo2911d(c0376g, gVar);
                                    break;
                                case 259:
                                    aVar.mo2912e(c0376g, gVar);
                                    break;
                                case 260:
                                    aVar.m2913f(c0376g, gVar);
                                    break;
                                case 261:
                                    aVar.m2914g(c0376g, gVar);
                                    break;
                                case 262:
                                    aVar.mo2905a(c0376g, gVar);
                                    break;
                                case 263:
                                    aVar.mo2906a(c0376g, gVar, i2);
                                    break;
                            }
                        }
                        break;
                    case 512:
                        e eVar = (e) obj;
                        switch (i) {
                            case 513:
                                aVar.m2904a(c0376g, eVar);
                                break;
                            case 514:
                                aVar.m2907b(c0376g, eVar);
                                break;
                            case 515:
                                aVar.m2909c(c0376g, eVar);
                                break;
                        }
                        break;
                }
            }

            /* JADX INFO: renamed from: b */
            private void m2955b(int i, Object obj) {
                switch (i) {
                    case 257:
                        d.this.f2169e.mo3100a((g) obj);
                        break;
                    case 258:
                        d.this.f2169e.mo3101b((g) obj);
                        break;
                    case 259:
                        d.this.f2169e.mo3102c((g) obj);
                        break;
                    case 262:
                        d.this.f2169e.mo3103d((g) obj);
                        break;
                }
            }

            /* JADX INFO: renamed from: a */
            public void m2956a(int i, Object obj) {
                obtainMessage(i, obj).sendToTarget();
            }

            /* JADX INFO: renamed from: a */
            public void m2957a(int i, Object obj, int i2) {
                Message messageObtainMessage = obtainMessage(i, obj);
                messageObtainMessage.arg1 = i2;
                messageObtainMessage.sendToTarget();
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int i = message.what;
                Object obj = message.obj;
                int i2 = message.arg1;
                if (i == 259 && d.this.m2951d().m2984c().equals(((g) obj).m2984c())) {
                    d.this.m2924a(true);
                }
                m2955b(i, obj);
                try {
                    int size = d.this.f2166b.size();
                    while (true) {
                        int i3 = size - 1;
                        if (i3 < 0) {
                            break;
                        }
                        C0376g c0376g = d.this.f2166b.get(i3).get();
                        if (c0376g == null) {
                            d.this.f2166b.remove(i3);
                        } else {
                            this.f2190b.addAll(c0376g.f2160d);
                        }
                        size = i3;
                    }
                    int size2 = this.f2190b.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        m2954a(this.f2190b.get(i4), i, obj, i2);
                    }
                } finally {
                    this.f2190b.clear();
                }
            }
        }

        /* JADX INFO: renamed from: android.support.v7.d.g$d$b */
        private final class b {

            /* JADX INFO: renamed from: b */
            private final MediaSessionCompat f2192b;

            /* JADX INFO: renamed from: c */
            private int f2193c;

            /* JADX INFO: renamed from: d */
            private int f2194d;

            /* JADX INFO: renamed from: e */
            private AbstractC0281g f2195e;

            public b(MediaSessionCompat mediaSessionCompat) {
                this.f2192b = mediaSessionCompat;
            }

            /* JADX INFO: renamed from: a */
            public void m2958a() {
                this.f2192b.m2069b(d.this.f2167c.f2292d);
                this.f2195e = null;
            }

            /* JADX INFO: renamed from: a */
            public void m2959a(int i, int i2, int i3) {
                if (this.f2195e != null && i == this.f2193c && i2 == this.f2194d) {
                    this.f2195e.m2001a(i3);
                } else {
                    this.f2195e = new AbstractC0281g(i, i2, i3) { // from class: android.support.v7.d.g.d.b.1
                        @Override // android.support.v4.media.AbstractC0281g
                        /* JADX INFO: renamed from: b */
                        public void mo2004b(final int i4) {
                            d.this.f2168d.post(new Runnable() { // from class: android.support.v7.d.g.d.b.1.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    if (d.this.f2170f != null) {
                                        d.this.f2170f.m2978a(i4);
                                    }
                                }
                            });
                        }

                        @Override // android.support.v4.media.AbstractC0281g
                        /* JADX INFO: renamed from: c */
                        public void mo2006c(final int i4) {
                            d.this.f2168d.post(new Runnable() { // from class: android.support.v7.d.g.d.b.1.2
                                @Override // java.lang.Runnable
                                public void run() {
                                    if (d.this.f2170f != null) {
                                        d.this.f2170f.m2983b(i4);
                                    }
                                }
                            });
                        }
                    };
                    this.f2192b.m2061a(this.f2195e);
                }
            }
        }

        /* JADX INFO: renamed from: android.support.v7.d.g$d$c */
        private final class c extends AbstractC0372c.a {
            c() {
            }

            @Override // android.support.v7.p027d.AbstractC0372c.a
            /* JADX INFO: renamed from: a */
            public void mo2864a(AbstractC0372c abstractC0372c, C0373d c0373d) {
                d.this.m2939a(abstractC0372c, c0373d);
            }
        }

        /* JADX INFO: renamed from: android.support.v7.d.g$d$d, reason: collision with other inner class name */
        private final class C2326d implements AbstractC0383n.d {

            /* JADX INFO: renamed from: b */
            private final AbstractC0383n f2203b;

            /* JADX INFO: renamed from: c */
            private boolean f2204c;

            public C2326d(Object obj) {
                this.f2203b = AbstractC0383n.m3095a(d.this.f2165a, obj);
                this.f2203b.m3098a(this);
                m2964c();
            }

            /* JADX INFO: renamed from: a */
            public Object m2960a() {
                return this.f2203b.m3096a();
            }

            @Override // android.support.v7.p027d.AbstractC0383n.d
            /* JADX INFO: renamed from: a */
            public void mo2961a(int i) {
                if (this.f2204c || d.this.f2170f == null) {
                    return;
                }
                d.this.f2170f.m2978a(i);
            }

            /* JADX INFO: renamed from: b */
            public void m2962b() {
                this.f2204c = true;
                this.f2203b.m3098a((AbstractC0383n.d) null);
            }

            @Override // android.support.v7.p027d.AbstractC0383n.d
            /* JADX INFO: renamed from: b */
            public void mo2963b(int i) {
                if (this.f2204c || d.this.f2170f == null) {
                    return;
                }
                d.this.f2170f.m2983b(i);
            }

            /* JADX INFO: renamed from: c */
            public void m2964c() {
                this.f2203b.mo3097a(d.this.f2167c);
            }
        }

        d(Context context) {
            this.f2165a = context;
            this.f2177m = AbstractC0194a.m1459a(context);
            this.f2178n = C0146b.m829a((ActivityManager) context.getSystemService("activity"));
            this.f2169e = AbstractC0384o.m3099a(context, this);
            mo2938a((AbstractC0372c) this.f2169e);
        }

        /* JADX INFO: renamed from: a */
        private int m2918a(g gVar, C0370a c0370a) {
            int iMo2972a = gVar.mo2972a(c0370a);
            if (iMo2972a != 0) {
                if ((iMo2972a & 1) != 0) {
                    if (C0376g.f2157a) {
                        Log.d("MediaRouter", "Route changed: " + gVar);
                    }
                    this.f2168d.m2956a(259, gVar);
                }
                if ((iMo2972a & 2) != 0) {
                    if (C0376g.f2157a) {
                        Log.d("MediaRouter", "Route volume changed: " + gVar);
                    }
                    this.f2168d.m2956a(260, gVar);
                }
                if ((iMo2972a & 4) != 0) {
                    if (C0376g.f2157a) {
                        Log.d("MediaRouter", "Route presentation display changed: " + gVar);
                    }
                    this.f2168d.m2956a(261, gVar);
                }
            }
            return iMo2972a;
        }

        /* JADX INFO: renamed from: a */
        private String m2920a(e eVar, String str) {
            String strFlattenToShortString = eVar.m2971c().flattenToShortString();
            String str2 = strFlattenToShortString + ":" + str;
            if (m2929c(str2) < 0) {
                this.f2173i.put(new C0216j<>(strFlattenToShortString, str), str2);
                return str2;
            }
            Log.w("MediaRouter", "Either " + str + " isn't unique in " + strFlattenToShortString + " or we're trying to assign a unique ID for an already added route");
            int i = 2;
            while (true) {
                String str3 = String.format(Locale.US, "%s_%d", str2, Integer.valueOf(i));
                if (m2929c(str3) < 0) {
                    this.f2173i.put(new C0216j<>(strFlattenToShortString, str), str3);
                    return str3;
                }
                i++;
            }
        }

        /* JADX INFO: renamed from: a */
        private void m2921a(b bVar) {
            if (this.f2185u != null) {
                this.f2185u.m2958a();
            }
            this.f2185u = bVar;
            if (bVar != null) {
                m2933g();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: a */
        private void m2923a(e eVar, C0373d c0373d) {
            boolean z;
            int i;
            if (eVar.m2969a(c0373d)) {
                int i2 = 0;
                boolean z2 = false;
                if (c0373d != null) {
                    if (c0373d.m2876c()) {
                        List<C0370a> listM2874a = c0373d.m2874a();
                        int size = listM2874a.size();
                        ArrayList<C0216j> arrayList = new ArrayList();
                        ArrayList<C0216j> arrayList2 = new ArrayList();
                        int i3 = 0;
                        while (i3 < size) {
                            C0370a c0370a = listM2874a.get(i3);
                            String strM2807a = c0370a.m2807a();
                            int iM2967a = eVar.m2967a(strM2807a);
                            if (iM2967a < 0) {
                                String strM2920a = m2920a(eVar, strM2807a);
                                boolean z3 = c0370a.m2808b() != null;
                                g fVar = z3 ? new f(eVar, strM2807a, strM2920a) : new g(eVar, strM2807a, strM2920a);
                                int i4 = i2 + 1;
                                eVar.f2206b.add(i2, fVar);
                                this.f2172h.add(fVar);
                                if (z3) {
                                    arrayList.add(new C0216j(fVar, c0370a));
                                } else {
                                    fVar.mo2972a(c0370a);
                                    if (C0376g.f2157a) {
                                        Log.d("MediaRouter", "Route added: " + fVar);
                                    }
                                    this.f2168d.m2956a(257, fVar);
                                }
                                z = z2;
                                i = i4;
                            } else if (iM2967a < i2) {
                                Log.w("MediaRouter", "Ignoring route descriptor with duplicate id: " + c0370a);
                                z = z2;
                                i = i2;
                            } else {
                                g gVar = (g) eVar.f2206b.get(iM2967a);
                                int i5 = i2 + 1;
                                Collections.swap(eVar.f2206b, iM2967a, i2);
                                if (gVar instanceof f) {
                                    arrayList2.add(new C0216j(gVar, c0370a));
                                    z = z2;
                                    i = i5;
                                } else if (m2918a(gVar, c0370a) == 0 || gVar != this.f2170f) {
                                    z = z2;
                                    i = i5;
                                } else {
                                    z = true;
                                    i = i5;
                                }
                            }
                            i3++;
                            i2 = i;
                            z2 = z;
                        }
                        for (C0216j c0216j : arrayList) {
                            g gVar2 = (g) c0216j.f1262a;
                            gVar2.mo2972a((C0370a) c0216j.f1263b);
                            if (C0376g.f2157a) {
                                Log.d("MediaRouter", "Route added: " + gVar2);
                            }
                            this.f2168d.m2956a(257, gVar2);
                        }
                        for (C0216j c0216j2 : arrayList2) {
                            g gVar3 = (g) c0216j2.f1262a;
                            if (m2918a(gVar3, (C0370a) c0216j2.f1263b) != 0 && gVar3 == this.f2170f) {
                                z2 = true;
                            }
                        }
                    } else {
                        Log.w("MediaRouter", "Ignoring invalid provider descriptor: " + c0373d);
                    }
                }
                for (int size2 = eVar.f2206b.size() - 1; size2 >= i2; size2--) {
                    g gVar4 = (g) eVar.f2206b.get(size2);
                    gVar4.mo2972a((C0370a) null);
                    this.f2172h.remove(gVar4);
                }
                m2924a(z2);
                for (int size3 = eVar.f2206b.size() - 1; size3 >= i2; size3--) {
                    g gVar5 = (g) eVar.f2206b.remove(size3);
                    if (C0376g.f2157a) {
                        Log.d("MediaRouter", "Route removed: " + gVar5);
                    }
                    this.f2168d.m2956a(258, gVar5);
                }
                if (C0376g.f2157a) {
                    Log.d("MediaRouter", "Provider changed: " + eVar);
                }
                this.f2168d.m2956a(515, eVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public void m2924a(boolean z) {
            if (this.f2180p != null && !m2930c(this.f2180p)) {
                Log.i("MediaRouter", "Clearing the default route because it is no longer selectable: " + this.f2180p);
                this.f2180p = null;
            }
            if (this.f2180p == null && !this.f2172h.isEmpty()) {
                Iterator<g> it = this.f2172h.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    g next = it.next();
                    if (m2932d(next) && m2930c(next)) {
                        this.f2180p = next;
                        Log.i("MediaRouter", "Found default route: " + this.f2180p);
                        break;
                    }
                }
            }
            if (this.f2181q != null && !m2930c(this.f2181q)) {
                Log.i("MediaRouter", "Clearing the bluetooth route because it is no longer selectable: " + this.f2181q);
                this.f2181q = null;
            }
            if (this.f2181q == null && !this.f2172h.isEmpty()) {
                Iterator<g> it2 = this.f2172h.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    g next2 = it2.next();
                    if (m2926b(next2) && m2930c(next2)) {
                        this.f2181q = next2;
                        Log.i("MediaRouter", "Found bluetooth route: " + this.f2181q);
                        break;
                    }
                }
            }
            if (this.f2170f != null && !m2930c(this.f2170f)) {
                Log.i("MediaRouter", "Unselecting the current route because it is no longer selectable: " + this.f2170f);
                m2931d(null, 0);
            }
            if (this.f2170f == null) {
                m2931d(m2953f(), 0);
                return;
            }
            if (z) {
                if (this.f2170f instanceof f) {
                    List<g> listM2973a = ((f) this.f2170f).m2973a();
                    HashSet hashSet = new HashSet();
                    Iterator<g> it3 = listM2973a.iterator();
                    while (it3.hasNext()) {
                        hashSet.add(it3.next().f2212c);
                    }
                    Iterator<Map.Entry<String, AbstractC0372c.d>> it4 = this.f2183s.entrySet().iterator();
                    while (it4.hasNext()) {
                        Map.Entry<String, AbstractC0372c.d> next3 = it4.next();
                        if (!hashSet.contains(next3.getKey())) {
                            AbstractC0372c.d value = next3.getValue();
                            value.mo2871c();
                            value.mo2867a();
                            it4.remove();
                        }
                    }
                    for (g gVar : listM2973a) {
                        if (!this.f2183s.containsKey(gVar.f2212c)) {
                            AbstractC0372c.d dVarMo2853a = gVar.m2998q().mo2853a(gVar.f2212c, this.f2170f.f2212c);
                            dVarMo2853a.mo2869b();
                            this.f2183s.put(gVar.f2212c, dVarMo2853a);
                        }
                    }
                }
                m2933g();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public String m2925b(e eVar, String str) {
            return this.f2173i.get(new C0216j(eVar.m2971c().flattenToShortString(), str));
        }

        /* JADX INFO: renamed from: b */
        private boolean m2926b(g gVar) {
            return gVar.m2998q() == this.f2169e && gVar.m2980a("android.media.intent.category.LIVE_AUDIO") && !gVar.m2980a("android.media.intent.category.LIVE_VIDEO");
        }

        /* JADX INFO: renamed from: c */
        private int m2927c(AbstractC0372c abstractC0372c) {
            int size = this.f2174j.size();
            for (int i = 0; i < size; i++) {
                if (this.f2174j.get(i).f2205a == abstractC0372c) {
                    return i;
                }
            }
            return -1;
        }

        /* JADX INFO: renamed from: c */
        private int m2928c(Object obj) {
            int size = this.f2175k.size();
            for (int i = 0; i < size; i++) {
                if (this.f2175k.get(i).m2960a() == obj) {
                    return i;
                }
            }
            return -1;
        }

        /* JADX INFO: renamed from: c */
        private int m2929c(String str) {
            int size = this.f2172h.size();
            for (int i = 0; i < size; i++) {
                if (this.f2172h.get(i).f2213d.equals(str)) {
                    return i;
                }
            }
            return -1;
        }

        /* JADX INFO: renamed from: c */
        private boolean m2930c(g gVar) {
            return gVar.f2210a != null && gVar.f2217h;
        }

        /* JADX INFO: renamed from: d */
        private void m2931d(g gVar, int i) {
            if (this.f2170f != gVar) {
                if (this.f2170f != null) {
                    if (C0376g.f2157a) {
                        Log.d("MediaRouter", "Route unselected: " + this.f2170f + " reason: " + i);
                    }
                    this.f2168d.m2957a(263, this.f2170f, i);
                    if (this.f2182r != null) {
                        this.f2182r.mo2868a(i);
                        this.f2182r.mo2867a();
                        this.f2182r = null;
                    }
                    if (!this.f2183s.isEmpty()) {
                        for (AbstractC0372c.d dVar : this.f2183s.values()) {
                            dVar.mo2868a(i);
                            dVar.mo2867a();
                        }
                        this.f2183s.clear();
                    }
                }
                this.f2170f = gVar;
                if (this.f2170f != null) {
                    this.f2182r = gVar.m2998q().mo2852a(gVar.f2212c);
                    if (this.f2182r != null) {
                        this.f2182r.mo2869b();
                    }
                    if (C0376g.f2157a) {
                        Log.d("MediaRouter", "Route selected: " + this.f2170f);
                    }
                    this.f2168d.m2956a(262, this.f2170f);
                    if (this.f2170f instanceof f) {
                        List<g> listM2973a = ((f) this.f2170f).m2973a();
                        this.f2183s.clear();
                        for (g gVar2 : listM2973a) {
                            AbstractC0372c.d dVarMo2853a = gVar2.m2998q().mo2853a(gVar2.f2212c, this.f2170f.f2212c);
                            dVarMo2853a.mo2869b();
                            this.f2183s.put(gVar2.f2212c, dVarMo2853a);
                        }
                    }
                }
                m2933g();
            }
        }

        /* JADX INFO: renamed from: d */
        private boolean m2932d(g gVar) {
            return gVar.m2998q() == this.f2169e && gVar.f2212c.equals("DEFAULT_ROUTE");
        }

        /* JADX INFO: renamed from: g */
        private void m2933g() {
            if (this.f2170f == null) {
                if (this.f2185u != null) {
                    this.f2185u.m2958a();
                    return;
                }
                return;
            }
            this.f2167c.f2289a = this.f2170f.m2993l();
            this.f2167c.f2290b = this.f2170f.m2994m();
            this.f2167c.f2291c = this.f2170f.m2992k();
            this.f2167c.f2292d = this.f2170f.m2990i();
            this.f2167c.f2293e = this.f2170f.m2989h();
            int size = this.f2175k.size();
            for (int i = 0; i < size; i++) {
                this.f2175k.get(i).m2964c();
            }
            if (this.f2185u != null) {
                if (this.f2170f == m2949c()) {
                    this.f2185u.m2958a();
                } else {
                    this.f2185u.m2959a(this.f2167c.f2291c == 1 ? 2 : 0, this.f2167c.f2290b, this.f2167c.f2289a);
                }
            }
        }

        /* JADX INFO: renamed from: a */
        public g m2934a(String str) {
            for (g gVar : this.f2172h) {
                if (gVar.f2213d.equals(str)) {
                    return gVar;
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: a */
        public C0376g m2935a(Context context) {
            int size = this.f2166b.size();
            while (true) {
                int i = size - 1;
                if (i < 0) {
                    C0376g c0376g = new C0376g(context);
                    this.f2166b.add(new WeakReference<>(c0376g));
                    return c0376g;
                }
                C0376g c0376g2 = this.f2166b.get(i).get();
                if (c0376g2 == null) {
                    this.f2166b.remove(i);
                    size = i;
                } else {
                    if (c0376g2.f2159c == context) {
                        return c0376g2;
                    }
                    size = i;
                }
            }
        }

        /* JADX INFO: renamed from: a */
        public void m2936a() {
            this.f2179o = new C0382m(this.f2165a, this);
            this.f2179o.m3093a();
        }

        /* JADX INFO: renamed from: a */
        public void m2937a(MediaSessionCompat mediaSessionCompat) {
            this.f2186v = mediaSessionCompat;
            if (Build.VERSION.SDK_INT >= 21) {
                m2921a(mediaSessionCompat != null ? new b(mediaSessionCompat) : null);
                return;
            }
            if (Build.VERSION.SDK_INT >= 14) {
                if (this.f2171g != null) {
                    m2948b(this.f2171g.m2073e());
                    this.f2171g.m2070b(this.f2187w);
                }
                this.f2171g = mediaSessionCompat;
                if (mediaSessionCompat != null) {
                    mediaSessionCompat.m2064a(this.f2187w);
                    if (mediaSessionCompat.m2067a()) {
                        m2942a(mediaSessionCompat.m2073e());
                    }
                }
            }
        }

        @Override // android.support.v7.p027d.C0382m.a
        /* JADX INFO: renamed from: a */
        public void mo2938a(AbstractC0372c abstractC0372c) {
            if (m2927c(abstractC0372c) < 0) {
                e eVar = new e(abstractC0372c);
                this.f2174j.add(eVar);
                if (C0376g.f2157a) {
                    Log.d("MediaRouter", "Provider added: " + eVar);
                }
                this.f2168d.m2956a(513, eVar);
                m2923a(eVar, abstractC0372c.m2862f());
                abstractC0372c.m2855a(this.f2176l);
                abstractC0372c.m2854a(this.f2184t);
            }
        }

        /* JADX INFO: renamed from: a */
        void m2939a(AbstractC0372c abstractC0372c, C0373d c0373d) {
            int iM2927c = m2927c(abstractC0372c);
            if (iM2927c >= 0) {
                m2923a(this.f2174j.get(iM2927c), c0373d);
            }
        }

        /* JADX INFO: renamed from: a */
        public void m2940a(g gVar) {
            m2950c(gVar, 3);
        }

        /* JADX INFO: renamed from: a */
        public void m2941a(g gVar, int i) {
            AbstractC0372c.d dVar;
            if (gVar == this.f2170f && this.f2182r != null) {
                this.f2182r.mo2870b(i);
            } else {
                if (this.f2183s.isEmpty() || (dVar = this.f2183s.get(gVar.f2212c)) == null) {
                    return;
                }
                dVar.mo2870b(i);
            }
        }

        /* JADX INFO: renamed from: a */
        public void m2942a(Object obj) {
            if (m2928c(obj) < 0) {
                this.f2175k.add(new C2326d(obj));
            }
        }

        /* JADX INFO: renamed from: a */
        public boolean m2943a(C0375f c0375f, int i) {
            if (c0375f.m2885c()) {
                return false;
            }
            if ((i & 2) == 0 && this.f2178n) {
                return true;
            }
            int size = this.f2172h.size();
            for (int i2 = 0; i2 < size; i2++) {
                g gVar = this.f2172h.get(i2);
                if (((i & 1) == 0 || !gVar.m2991j()) && gVar.m2979a(c0375f)) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.support.v7.p027d.AbstractC0384o.f
        /* JADX INFO: renamed from: b */
        public g mo2944b(String str) {
            e eVar;
            int iM2967a;
            int iM2927c = m2927c((AbstractC0372c) this.f2169e);
            if (iM2927c < 0 || (iM2967a = (eVar = this.f2174j.get(iM2927c)).m2967a(str)) < 0) {
                return null;
            }
            return (g) eVar.f2206b.get(iM2967a);
        }

        /* JADX INFO: renamed from: b */
        public List<g> m2945b() {
            return this.f2172h;
        }

        @Override // android.support.v7.p027d.C0382m.a
        /* JADX INFO: renamed from: b */
        public void mo2946b(AbstractC0372c abstractC0372c) {
            int iM2927c = m2927c(abstractC0372c);
            if (iM2927c >= 0) {
                abstractC0372c.m2855a((AbstractC0372c.a) null);
                abstractC0372c.m2854a((C0371b) null);
                e eVar = this.f2174j.get(iM2927c);
                m2923a(eVar, (C0373d) null);
                if (C0376g.f2157a) {
                    Log.d("MediaRouter", "Provider removed: " + eVar);
                }
                this.f2168d.m2956a(514, eVar);
                this.f2174j.remove(iM2927c);
            }
        }

        /* JADX INFO: renamed from: b */
        public void m2947b(g gVar, int i) {
            if (gVar != this.f2170f || this.f2182r == null) {
                return;
            }
            this.f2182r.mo2872c(i);
        }

        /* JADX INFO: renamed from: b */
        public void m2948b(Object obj) {
            int iM2928c = m2928c(obj);
            if (iM2928c >= 0) {
                this.f2175k.remove(iM2928c).m2962b();
            }
        }

        /* JADX INFO: renamed from: c */
        public g m2949c() {
            if (this.f2180p == null) {
                throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
            }
            return this.f2180p;
        }

        /* JADX INFO: renamed from: c */
        public void m2950c(g gVar, int i) {
            if (!this.f2172h.contains(gVar)) {
                Log.w("MediaRouter", "Ignoring attempt to select removed route: " + gVar);
            } else if (gVar.f2217h) {
                m2931d(gVar, i);
            } else {
                Log.w("MediaRouter", "Ignoring attempt to select disabled route: " + gVar);
            }
        }

        /* JADX INFO: renamed from: d */
        public g m2951d() {
            if (this.f2170f == null) {
                throw new IllegalStateException("There is no currently selected route.  The media router has not yet been fully initialized.");
            }
            return this.f2170f;
        }

        /* JADX INFO: renamed from: e */
        public void m2952e() {
            C0375f.a aVar = new C0375f.a();
            int size = this.f2166b.size();
            boolean z = false;
            boolean z2 = false;
            while (true) {
                int i = size - 1;
                if (i < 0) {
                    break;
                }
                C0376g c0376g = this.f2166b.get(i).get();
                if (c0376g == null) {
                    this.f2166b.remove(i);
                } else {
                    int size2 = c0376g.f2160d.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        b bVar = c0376g.f2160d.get(i2);
                        aVar.m2888a(bVar.f2163c);
                        if ((bVar.f2164d & 1) != 0) {
                            z = true;
                            z2 = true;
                        }
                        if ((bVar.f2164d & 4) != 0 && !this.f2178n) {
                            z2 = true;
                        }
                        if ((bVar.f2164d & 8) != 0) {
                            z2 = true;
                        }
                    }
                }
                size = i;
            }
            C0375f c0375fM2891a = z2 ? aVar.m2891a() : C0375f.f2153b;
            if (this.f2184t != null && this.f2184t.m2847a().equals(c0375fM2891a) && this.f2184t.m2848b() == z) {
                return;
            }
            if (!c0375fM2891a.m2885c() || z) {
                this.f2184t = new C0371b(c0375fM2891a, z);
            } else if (this.f2184t == null) {
                return;
            } else {
                this.f2184t = null;
            }
            if (C0376g.f2157a) {
                Log.d("MediaRouter", "Updated discovery request: " + this.f2184t);
            }
            if (z2 && !z && this.f2178n) {
                Log.i("MediaRouter", "Forcing passive route discovery on a low-RAM device, system performance may be affected.  Please consider using CALLBACK_FLAG_REQUEST_DISCOVERY instead of CALLBACK_FLAG_FORCE_DISCOVERY.");
            }
            int size3 = this.f2174j.size();
            for (int i3 = 0; i3 < size3; i3++) {
                this.f2174j.get(i3).f2205a.m2854a(this.f2184t);
            }
        }

        /* JADX INFO: renamed from: f */
        g m2953f() {
            for (g gVar : this.f2172h) {
                if (gVar != this.f2180p && m2926b(gVar) && m2930c(gVar)) {
                    return gVar;
                }
            }
            return this.f2180p;
        }
    }

    /* JADX INFO: renamed from: android.support.v7.d.g$e */
    public static final class e {

        /* JADX INFO: renamed from: a */
        private final AbstractC0372c f2205a;

        /* JADX INFO: renamed from: b */
        private final List<g> f2206b = new ArrayList();

        /* JADX INFO: renamed from: c */
        private final AbstractC0372c.c f2207c;

        /* JADX INFO: renamed from: d */
        private C0373d f2208d;

        e(AbstractC0372c abstractC0372c) {
            this.f2205a = abstractC0372c;
            this.f2207c = abstractC0372c.m2859c();
        }

        /* JADX INFO: renamed from: a */
        int m2967a(String str) {
            int size = this.f2206b.size();
            for (int i = 0; i < size; i++) {
                if (this.f2206b.get(i).f2212c.equals(str)) {
                    return i;
                }
            }
            return -1;
        }

        /* JADX INFO: renamed from: a */
        public AbstractC0372c m2968a() {
            C0376g.m2895d();
            return this.f2205a;
        }

        /* JADX INFO: renamed from: a */
        boolean m2969a(C0373d c0373d) {
            if (this.f2208d == c0373d) {
                return false;
            }
            this.f2208d = c0373d;
            return true;
        }

        /* JADX INFO: renamed from: b */
        public String m2970b() {
            return this.f2207c.m2865a();
        }

        /* JADX INFO: renamed from: c */
        public ComponentName m2971c() {
            return this.f2207c.m2866b();
        }

        public String toString() {
            return "MediaRouter.RouteProviderInfo{ packageName=" + m2970b() + " }";
        }
    }

    /* JADX INFO: renamed from: android.support.v7.d.g$f */
    public static class f extends g {

        /* JADX INFO: renamed from: b */
        private List<g> f2209b;

        f(e eVar, String str, String str2) {
            super(eVar, str, str2);
            this.f2209b = new ArrayList();
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0065  */
        @Override // android.support.v7.p027d.C0376g.g
        /* JADX INFO: renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        int mo2972a(C0370a c0370a) {
            boolean z;
            if (this.f2210a != c0370a) {
                this.f2210a = c0370a;
                if (c0370a != null) {
                    List<String> listM2808b = c0370a.m2808b();
                    ArrayList arrayList = new ArrayList();
                    boolean z2 = listM2808b.size() != this.f2209b.size();
                    Iterator<String> it = listM2808b.iterator();
                    while (true) {
                        z = z2;
                        if (!it.hasNext()) {
                            break;
                        }
                        g gVarM2934a = C0376g.f2158b.m2934a(C0376g.f2158b.m2925b(m2982b(), it.next()));
                        if (gVarM2934a != null) {
                            arrayList.add(gVarM2934a);
                            z2 = (z || this.f2209b.contains(gVarM2934a)) ? z : true;
                        }
                    }
                    if (z) {
                        this.f2209b = arrayList;
                    }
                } else {
                    z = false;
                }
            }
            return super.m2981b(c0370a) | (z ? 1 : 0);
        }

        /* JADX INFO: renamed from: a */
        public List<g> m2973a() {
            return this.f2209b;
        }

        @Override // android.support.v7.p027d.C0376g.g
        public String toString() {
            StringBuilder sb = new StringBuilder(super.toString());
            sb.append('[');
            int size = this.f2209b.size();
            for (int i = 0; i < size; i++) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(this.f2209b.get(i));
            }
            sb.append(']');
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: android.support.v7.d.g$g */
    public static class g {

        /* JADX INFO: renamed from: a */
        C0370a f2210a;

        /* JADX INFO: renamed from: b */
        private final e f2211b;

        /* JADX INFO: renamed from: c */
        private final String f2212c;

        /* JADX INFO: renamed from: d */
        private final String f2213d;

        /* JADX INFO: renamed from: e */
        private String f2214e;

        /* JADX INFO: renamed from: f */
        private String f2215f;

        /* JADX INFO: renamed from: g */
        private Uri f2216g;

        /* JADX INFO: renamed from: h */
        private boolean f2217h;

        /* JADX INFO: renamed from: i */
        private boolean f2218i;

        /* JADX INFO: renamed from: j */
        private int f2219j;

        /* JADX INFO: renamed from: k */
        private boolean f2220k;

        /* JADX INFO: renamed from: m */
        private int f2222m;

        /* JADX INFO: renamed from: n */
        private int f2223n;

        /* JADX INFO: renamed from: o */
        private int f2224o;

        /* JADX INFO: renamed from: p */
        private int f2225p;

        /* JADX INFO: renamed from: q */
        private int f2226q;

        /* JADX INFO: renamed from: r */
        private int f2227r;

        /* JADX INFO: renamed from: s */
        private Display f2228s;

        /* JADX INFO: renamed from: u */
        private Bundle f2230u;

        /* JADX INFO: renamed from: v */
        private IntentSender f2231v;

        /* JADX INFO: renamed from: l */
        private final ArrayList<IntentFilter> f2221l = new ArrayList<>();

        /* JADX INFO: renamed from: t */
        private int f2229t = -1;

        g(e eVar, String str, String str2) {
            this.f2211b = eVar;
            this.f2212c = str;
            this.f2213d = str2;
        }

        /* JADX INFO: renamed from: d */
        private static boolean m2977d(g gVar) {
            return TextUtils.equals(gVar.m2998q().m2859c().m2865a(), "android");
        }

        /* JADX INFO: renamed from: a */
        int mo2972a(C0370a c0370a) {
            if (this.f2210a != c0370a) {
                return m2981b(c0370a);
            }
            return 0;
        }

        /* JADX INFO: renamed from: a */
        public void m2978a(int i) {
            C0376g.m2895d();
            C0376g.f2158b.m2941a(this, Math.min(this.f2227r, Math.max(0, i)));
        }

        /* JADX INFO: renamed from: a */
        public boolean m2979a(C0375f c0375f) {
            if (c0375f == null) {
                throw new IllegalArgumentException("selector must not be null");
            }
            C0376g.m2895d();
            return c0375f.m2883a(this.f2221l);
        }

        /* JADX INFO: renamed from: a */
        public boolean m2980a(String str) {
            if (str == null) {
                throw new IllegalArgumentException("category must not be null");
            }
            C0376g.m2895d();
            int size = this.f2221l.size();
            for (int i = 0; i < size; i++) {
                if (this.f2221l.get(i).hasCategory(str)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: b */
        int m2981b(C0370a c0370a) {
            int i = 0;
            this.f2210a = c0370a;
            if (c0370a == null) {
                return 0;
            }
            if (!C0376g.m2893a(this.f2214e, c0370a.m2809c())) {
                this.f2214e = c0370a.m2809c();
                i = 1;
            }
            if (!C0376g.m2893a(this.f2215f, c0370a.m2810d())) {
                this.f2215f = c0370a.m2810d();
                i |= 1;
            }
            if (!C0376g.m2893a(this.f2216g, c0370a.m2811e())) {
                this.f2216g = c0370a.m2811e();
                i |= 1;
            }
            if (this.f2217h != c0370a.m2812f()) {
                this.f2217h = c0370a.m2812f();
                i |= 1;
            }
            if (this.f2218i != c0370a.m2813g()) {
                this.f2218i = c0370a.m2813g();
                i |= 1;
            }
            if (this.f2219j != c0370a.m2814h()) {
                this.f2219j = c0370a.m2814h();
                i |= 1;
            }
            if (!this.f2221l.equals(c0370a.m2817k())) {
                this.f2221l.clear();
                this.f2221l.addAll(c0370a.m2817k());
                i |= 1;
            }
            if (this.f2222m != c0370a.m2819m()) {
                this.f2222m = c0370a.m2819m();
                i |= 1;
            }
            if (this.f2223n != c0370a.m2820n()) {
                this.f2223n = c0370a.m2820n();
                i |= 1;
            }
            if (this.f2224o != c0370a.m2821o()) {
                this.f2224o = c0370a.m2821o();
                i |= 1;
            }
            if (this.f2225p != c0370a.m2824r()) {
                this.f2225p = c0370a.m2824r();
                i |= 3;
            }
            if (this.f2226q != c0370a.m2822p()) {
                this.f2226q = c0370a.m2822p();
                i |= 3;
            }
            if (this.f2227r != c0370a.m2823q()) {
                this.f2227r = c0370a.m2823q();
                i |= 3;
            }
            if (this.f2229t != c0370a.m2825s()) {
                this.f2229t = c0370a.m2825s();
                this.f2228s = null;
                i |= 5;
            }
            if (!C0376g.m2893a(this.f2230u, c0370a.m2826t())) {
                this.f2230u = c0370a.m2826t();
                i |= 1;
            }
            if (!C0376g.m2893a(this.f2231v, c0370a.m2816j())) {
                this.f2231v = c0370a.m2816j();
                i |= 1;
            }
            if (this.f2220k == c0370a.m2815i()) {
                return i;
            }
            this.f2220k = c0370a.m2815i();
            return i | 5;
        }

        /* JADX INFO: renamed from: b */
        public e m2982b() {
            return this.f2211b;
        }

        /* JADX INFO: renamed from: b */
        public void m2983b(int i) {
            C0376g.m2895d();
            if (i != 0) {
                C0376g.f2158b.m2947b(this, i);
            }
        }

        /* JADX INFO: renamed from: c */
        public String m2984c() {
            return this.f2213d;
        }

        /* JADX INFO: renamed from: d */
        public String m2985d() {
            return this.f2214e;
        }

        /* JADX INFO: renamed from: e */
        public String m2986e() {
            return this.f2215f;
        }

        /* JADX INFO: renamed from: f */
        public boolean m2987f() {
            C0376g.m2895d();
            return C0376g.f2158b.m2951d() == this;
        }

        /* JADX INFO: renamed from: g */
        public boolean m2988g() {
            C0376g.m2895d();
            return C0376g.f2158b.m2949c() == this;
        }

        /* JADX INFO: renamed from: h */
        public int m2989h() {
            return this.f2222m;
        }

        /* JADX INFO: renamed from: i */
        public int m2990i() {
            return this.f2223n;
        }

        /* JADX INFO: renamed from: j */
        public boolean m2991j() {
            if (m2988g() || this.f2224o == 3) {
                return true;
            }
            return m2977d(this) && m2980a("android.media.intent.category.LIVE_AUDIO") && !m2980a("android.media.intent.category.LIVE_VIDEO");
        }

        /* JADX INFO: renamed from: k */
        public int m2992k() {
            return this.f2225p;
        }

        /* JADX INFO: renamed from: l */
        public int m2993l() {
            return this.f2226q;
        }

        /* JADX INFO: renamed from: m */
        public int m2994m() {
            return this.f2227r;
        }

        /* JADX INFO: renamed from: n */
        public Bundle m2995n() {
            return this.f2230u;
        }

        /* JADX INFO: renamed from: o */
        public void m2996o() {
            C0376g.m2895d();
            C0376g.f2158b.m2940a(this);
        }

        /* JADX INFO: renamed from: p */
        String m2997p() {
            return this.f2212c;
        }

        /* JADX INFO: renamed from: q */
        public AbstractC0372c m2998q() {
            return this.f2211b.m2968a();
        }

        public String toString() {
            return "MediaRouter.RouteInfo{ uniqueId=" + this.f2213d + ", name=" + this.f2214e + ", description=" + this.f2215f + ", iconUri=" + this.f2216g + ", enabled=" + this.f2217h + ", connecting=" + this.f2218i + ", connectionState=" + this.f2219j + ", canDisconnect=" + this.f2220k + ", playbackType=" + this.f2222m + ", playbackStream=" + this.f2223n + ", deviceType=" + this.f2224o + ", volumeHandling=" + this.f2225p + ", volume=" + this.f2226q + ", volumeMax=" + this.f2227r + ", presentationDisplayId=" + this.f2229t + ", extras=" + this.f2230u + ", settingsIntent=" + this.f2231v + ", providerPackageName=" + this.f2211b.m2970b() + " }";
        }
    }

    C0376g(Context context) {
        this.f2159c = context;
    }

    /* JADX INFO: renamed from: a */
    public static C0376g m2892a(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        }
        m2895d();
        if (f2158b == null) {
            f2158b = new d(context.getApplicationContext());
            f2158b.m2936a();
        }
        return f2158b.m2935a(context);
    }

    /* JADX INFO: renamed from: a */
    static <T> boolean m2893a(T t, T t2) {
        return t == t2 || !(t == null || t2 == null || !t.equals(t2));
    }

    /* JADX INFO: renamed from: b */
    private int m2894b(a aVar) {
        int size = this.f2160d.size();
        for (int i = 0; i < size; i++) {
            if (this.f2160d.get(i).f2162b == aVar) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: d */
    static void m2895d() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("The media router service must only be accessed on the application's main thread.");
        }
    }

    /* JADX INFO: renamed from: a */
    public List<g> m2896a() {
        m2895d();
        return f2158b.m2945b();
    }

    /* JADX INFO: renamed from: a */
    public void m2897a(MediaSessionCompat mediaSessionCompat) {
        if (f2157a) {
            Log.d("MediaRouter", "addMediaSessionCompat: " + mediaSessionCompat);
        }
        f2158b.m2937a(mediaSessionCompat);
    }

    /* JADX INFO: renamed from: a */
    public void m2898a(C0375f c0375f, a aVar, int i) {
        b bVar;
        boolean z = true;
        if (c0375f == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (aVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        m2895d();
        if (f2157a) {
            Log.d("MediaRouter", "addCallback: selector=" + c0375f + ", callback=" + aVar + ", flags=" + Integer.toHexString(i));
        }
        int iM2894b = m2894b(aVar);
        if (iM2894b < 0) {
            bVar = new b(this, aVar);
            this.f2160d.add(bVar);
        } else {
            bVar = this.f2160d.get(iM2894b);
        }
        boolean z2 = false;
        if (((bVar.f2164d ^ (-1)) & i) != 0) {
            bVar.f2164d |= i;
            z2 = true;
        }
        if (bVar.f2163c.m2882a(c0375f)) {
            z = z2;
        } else {
            bVar.f2163c = new C0375f.a(bVar.f2163c).m2888a(c0375f).m2891a();
        }
        if (z) {
            f2158b.m2952e();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m2899a(a aVar) {
        if (aVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        m2895d();
        if (f2157a) {
            Log.d("MediaRouter", "removeCallback: callback=" + aVar);
        }
        int iM2894b = m2894b(aVar);
        if (iM2894b >= 0) {
            this.f2160d.remove(iM2894b);
            f2158b.m2952e();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m2900a(g gVar) {
        if (gVar == null) {
            throw new IllegalArgumentException("route must not be null");
        }
        m2895d();
        if (f2157a) {
            Log.d("MediaRouter", "selectRoute: " + gVar);
        }
        f2158b.m2940a(gVar);
    }

    /* JADX INFO: renamed from: a */
    public boolean m2901a(C0375f c0375f, int i) {
        if (c0375f == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        m2895d();
        return f2158b.m2943a(c0375f, i);
    }

    /* JADX INFO: renamed from: b */
    public g m2902b() {
        m2895d();
        return f2158b.m2949c();
    }

    /* JADX INFO: renamed from: c */
    public g m2903c() {
        m2895d();
        return f2158b.m2951d();
    }
}
