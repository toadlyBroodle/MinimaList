package android.support.v4.p006a;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.util.ArrayList;

/* JADX INFO: renamed from: android.support.v4.a.ab */
/* JADX INFO: loaded from: classes.dex */
public class C0136ab {

    /* JADX INFO: renamed from: android.support.v4.a.ab$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        final Bundle f669a;

        /* JADX INFO: renamed from: b */
        public int f670b;

        /* JADX INFO: renamed from: c */
        public CharSequence f671c;

        /* JADX INFO: renamed from: d */
        public PendingIntent f672d;

        /* JADX INFO: renamed from: e */
        private final C0140af[] f673e;

        /* JADX INFO: renamed from: f */
        private final C0140af[] f674f;

        /* JADX INFO: renamed from: g */
        private boolean f675g;

        /* JADX INFO: renamed from: a */
        public int m766a() {
            return this.f670b;
        }

        /* JADX INFO: renamed from: b */
        public CharSequence m767b() {
            return this.f671c;
        }

        /* JADX INFO: renamed from: c */
        public PendingIntent m768c() {
            return this.f672d;
        }

        /* JADX INFO: renamed from: d */
        public Bundle m769d() {
            return this.f669a;
        }

        /* JADX INFO: renamed from: e */
        public boolean m770e() {
            return this.f675g;
        }

        /* JADX INFO: renamed from: f */
        public C0140af[] m771f() {
            return this.f673e;
        }

        /* JADX INFO: renamed from: g */
        public C0140af[] m772g() {
            return this.f674f;
        }
    }

    /* JADX INFO: renamed from: android.support.v4.a.ab$b */
    public static class b extends d {

        /* JADX INFO: renamed from: e */
        private CharSequence f676e;

        /* JADX INFO: renamed from: a */
        public b m773a(CharSequence charSequence) {
            this.f676e = c.m776d(charSequence);
            return this;
        }

        @Override // android.support.v4.p006a.C0136ab.d
        /* JADX INFO: renamed from: a */
        public void mo774a(InterfaceC0135aa interfaceC0135aa) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle(interfaceC0135aa.mo764a()).setBigContentTitle(this.f718b).bigText(this.f676e);
                if (this.f720d) {
                    bigTextStyleBigText.setSummaryText(this.f719c);
                }
            }
        }
    }

    /* JADX INFO: renamed from: android.support.v4.a.ab$c */
    public static class c {

        /* JADX INFO: renamed from: A */
        Bundle f677A;

        /* JADX INFO: renamed from: B */
        int f678B;

        /* JADX INFO: renamed from: C */
        int f679C;

        /* JADX INFO: renamed from: D */
        Notification f680D;

        /* JADX INFO: renamed from: E */
        RemoteViews f681E;

        /* JADX INFO: renamed from: F */
        RemoteViews f682F;

        /* JADX INFO: renamed from: G */
        RemoteViews f683G;

        /* JADX INFO: renamed from: H */
        String f684H;

        /* JADX INFO: renamed from: I */
        int f685I;

        /* JADX INFO: renamed from: J */
        String f686J;

        /* JADX INFO: renamed from: K */
        long f687K;

        /* JADX INFO: renamed from: L */
        int f688L;

        /* JADX INFO: renamed from: M */
        Notification f689M;

        /* JADX INFO: renamed from: N */
        @Deprecated
        public ArrayList<String> f690N;

        /* JADX INFO: renamed from: a */
        public Context f691a;

        /* JADX INFO: renamed from: b */
        public ArrayList<a> f692b;

        /* JADX INFO: renamed from: c */
        CharSequence f693c;

        /* JADX INFO: renamed from: d */
        CharSequence f694d;

        /* JADX INFO: renamed from: e */
        PendingIntent f695e;

        /* JADX INFO: renamed from: f */
        PendingIntent f696f;

        /* JADX INFO: renamed from: g */
        RemoteViews f697g;

        /* JADX INFO: renamed from: h */
        Bitmap f698h;

        /* JADX INFO: renamed from: i */
        CharSequence f699i;

        /* JADX INFO: renamed from: j */
        int f700j;

        /* JADX INFO: renamed from: k */
        int f701k;

        /* JADX INFO: renamed from: l */
        boolean f702l;

        /* JADX INFO: renamed from: m */
        boolean f703m;

        /* JADX INFO: renamed from: n */
        d f704n;

        /* JADX INFO: renamed from: o */
        CharSequence f705o;

        /* JADX INFO: renamed from: p */
        CharSequence[] f706p;

        /* JADX INFO: renamed from: q */
        int f707q;

        /* JADX INFO: renamed from: r */
        int f708r;

        /* JADX INFO: renamed from: s */
        boolean f709s;

        /* JADX INFO: renamed from: t */
        String f710t;

        /* JADX INFO: renamed from: u */
        boolean f711u;

        /* JADX INFO: renamed from: v */
        String f712v;

        /* JADX INFO: renamed from: w */
        boolean f713w;

        /* JADX INFO: renamed from: x */
        boolean f714x;

        /* JADX INFO: renamed from: y */
        boolean f715y;

        /* JADX INFO: renamed from: z */
        String f716z;

        @Deprecated
        public c(Context context) {
            this(context, null);
        }

        public c(Context context, String str) {
            this.f692b = new ArrayList<>();
            this.f702l = true;
            this.f713w = false;
            this.f678B = 0;
            this.f679C = 0;
            this.f685I = 0;
            this.f688L = 0;
            this.f689M = new Notification();
            this.f691a = context;
            this.f684H = str;
            this.f689M.when = System.currentTimeMillis();
            this.f689M.audioStreamType = -1;
            this.f701k = 0;
            this.f690N = new ArrayList<>();
        }

        /* JADX INFO: renamed from: a */
        private void m775a(int i, boolean z) {
            if (z) {
                this.f689M.flags |= i;
            } else {
                this.f689M.flags &= i ^ (-1);
            }
        }

        /* JADX INFO: renamed from: d */
        protected static CharSequence m776d(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        /* JADX INFO: renamed from: a */
        public Notification m777a() {
            return new C0137ac(this).m798b();
        }

        /* JADX INFO: renamed from: a */
        public c m778a(int i) {
            this.f689M.icon = i;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public c m779a(long j) {
            this.f689M.when = j;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public c m780a(PendingIntent pendingIntent) {
            this.f695e = pendingIntent;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public c m781a(Uri uri) {
            this.f689M.sound = uri;
            this.f689M.audioStreamType = -1;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public c m782a(d dVar) {
            if (this.f704n != dVar) {
                this.f704n = dVar;
                if (this.f704n != null) {
                    this.f704n.m792a(this);
                }
            }
            return this;
        }

        /* JADX INFO: renamed from: a */
        public c m783a(CharSequence charSequence) {
            this.f693c = m776d(charSequence);
            return this;
        }

        /* JADX INFO: renamed from: a */
        public c m784a(String str) {
            this.f684H = str;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public c m785a(boolean z) {
            m775a(16, z);
            return this;
        }

        /* JADX INFO: renamed from: b */
        public c m786b(int i) {
            this.f678B = i;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public c m787b(PendingIntent pendingIntent) {
            this.f689M.deleteIntent = pendingIntent;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public c m788b(CharSequence charSequence) {
            this.f694d = m776d(charSequence);
            return this;
        }

        /* JADX INFO: renamed from: b */
        public c m789b(boolean z) {
            this.f713w = z;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public c m790c(CharSequence charSequence) {
            this.f689M.tickerText = m776d(charSequence);
            return this;
        }
    }

    /* JADX INFO: renamed from: android.support.v4.a.ab$d */
    public static abstract class d {

        /* JADX INFO: renamed from: a */
        protected c f717a;

        /* JADX INFO: renamed from: b */
        CharSequence f718b;

        /* JADX INFO: renamed from: c */
        CharSequence f719c;

        /* JADX INFO: renamed from: d */
        boolean f720d = false;

        /* JADX INFO: renamed from: a */
        public void m791a(Bundle bundle) {
        }

        /* JADX INFO: renamed from: a */
        public void mo774a(InterfaceC0135aa interfaceC0135aa) {
        }

        /* JADX INFO: renamed from: a */
        public void m792a(c cVar) {
            if (this.f717a != cVar) {
                this.f717a = cVar;
                if (this.f717a != null) {
                    this.f717a.m782a(this);
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public RemoteViews m793b(InterfaceC0135aa interfaceC0135aa) {
            return null;
        }

        /* JADX INFO: renamed from: c */
        public RemoteViews m794c(InterfaceC0135aa interfaceC0135aa) {
            return null;
        }

        /* JADX INFO: renamed from: d */
        public RemoteViews m795d(InterfaceC0135aa interfaceC0135aa) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static Bundle m765a(Notification notification) {
        if (Build.VERSION.SDK_INT >= 19) {
            return notification.extras;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return C0138ad.m801a(notification);
        }
        return null;
    }
}
