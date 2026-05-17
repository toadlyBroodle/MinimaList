package android.support.v7.p027d;

import android.content.IntentFilter;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: android.support.v7.d.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0370a {

    /* JADX INFO: renamed from: a */
    final Bundle f2132a;

    /* JADX INFO: renamed from: b */
    List<IntentFilter> f2133b;

    /* JADX INFO: renamed from: android.support.v7.d.a$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private final Bundle f2134a;

        /* JADX INFO: renamed from: b */
        private ArrayList<String> f2135b;

        /* JADX INFO: renamed from: c */
        private ArrayList<IntentFilter> f2136c;

        public a(C0370a c0370a) {
            if (c0370a == null) {
                throw new IllegalArgumentException("descriptor must not be null");
            }
            this.f2134a = new Bundle(c0370a.f2132a);
            c0370a.m2818l();
            if (c0370a.f2133b.isEmpty()) {
                return;
            }
            this.f2136c = new ArrayList<>(c0370a.f2133b);
        }

        public a(String str, String str2) {
            this.f2134a = new Bundle();
            m2833a(str);
            m2838b(str2);
        }

        /* JADX INFO: renamed from: a */
        public a m2831a(int i) {
            this.f2134a.putInt("playbackType", i);
            return this;
        }

        /* JADX INFO: renamed from: a */
        public a m2832a(IntentFilter intentFilter) {
            if (intentFilter == null) {
                throw new IllegalArgumentException("filter must not be null");
            }
            if (this.f2136c == null) {
                this.f2136c = new ArrayList<>();
            }
            if (!this.f2136c.contains(intentFilter)) {
                this.f2136c.add(intentFilter);
            }
            return this;
        }

        /* JADX INFO: renamed from: a */
        public a m2833a(String str) {
            this.f2134a.putString("id", str);
            return this;
        }

        /* JADX INFO: renamed from: a */
        public a m2834a(Collection<IntentFilter> collection) {
            if (collection == null) {
                throw new IllegalArgumentException("filters must not be null");
            }
            if (!collection.isEmpty()) {
                Iterator<IntentFilter> it = collection.iterator();
                while (it.hasNext()) {
                    m2832a(it.next());
                }
            }
            return this;
        }

        /* JADX INFO: renamed from: a */
        public a m2835a(boolean z) {
            this.f2134a.putBoolean("enabled", z);
            return this;
        }

        /* JADX INFO: renamed from: a */
        public C0370a m2836a() {
            if (this.f2136c != null) {
                this.f2134a.putParcelableArrayList("controlFilters", this.f2136c);
            }
            if (this.f2135b != null) {
                this.f2134a.putStringArrayList("groupMemberIds", this.f2135b);
            }
            return new C0370a(this.f2134a, this.f2136c);
        }

        /* JADX INFO: renamed from: b */
        public a m2837b(int i) {
            this.f2134a.putInt("playbackStream", i);
            return this;
        }

        /* JADX INFO: renamed from: b */
        public a m2838b(String str) {
            this.f2134a.putString("name", str);
            return this;
        }

        @Deprecated
        /* JADX INFO: renamed from: b */
        public a m2839b(boolean z) {
            this.f2134a.putBoolean("connecting", z);
            return this;
        }

        /* JADX INFO: renamed from: c */
        public a m2840c(int i) {
            this.f2134a.putInt("deviceType", i);
            return this;
        }

        /* JADX INFO: renamed from: c */
        public a m2841c(String str) {
            this.f2134a.putString("status", str);
            return this;
        }

        /* JADX INFO: renamed from: d */
        public a m2842d(int i) {
            this.f2134a.putInt("volume", i);
            return this;
        }

        /* JADX INFO: renamed from: e */
        public a m2843e(int i) {
            this.f2134a.putInt("volumeMax", i);
            return this;
        }

        /* JADX INFO: renamed from: f */
        public a m2844f(int i) {
            this.f2134a.putInt("volumeHandling", i);
            return this;
        }

        /* JADX INFO: renamed from: g */
        public a m2845g(int i) {
            this.f2134a.putInt("presentationDisplayId", i);
            return this;
        }
    }

    C0370a(Bundle bundle, List<IntentFilter> list) {
        this.f2132a = bundle;
        this.f2133b = list;
    }

    /* JADX INFO: renamed from: a */
    public static C0370a m2806a(Bundle bundle) {
        if (bundle != null) {
            return new C0370a(bundle, null);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public String m2807a() {
        return this.f2132a.getString("id");
    }

    /* JADX INFO: renamed from: b */
    public List<String> m2808b() {
        return this.f2132a.getStringArrayList("groupMemberIds");
    }

    /* JADX INFO: renamed from: c */
    public String m2809c() {
        return this.f2132a.getString("name");
    }

    /* JADX INFO: renamed from: d */
    public String m2810d() {
        return this.f2132a.getString("status");
    }

    /* JADX INFO: renamed from: e */
    public Uri m2811e() {
        String string = this.f2132a.getString("iconUri");
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    /* JADX INFO: renamed from: f */
    public boolean m2812f() {
        return this.f2132a.getBoolean("enabled", true);
    }

    @Deprecated
    /* JADX INFO: renamed from: g */
    public boolean m2813g() {
        return this.f2132a.getBoolean("connecting", false);
    }

    /* JADX INFO: renamed from: h */
    public int m2814h() {
        return this.f2132a.getInt("connectionState", 0);
    }

    /* JADX INFO: renamed from: i */
    public boolean m2815i() {
        return this.f2132a.getBoolean("canDisconnect", false);
    }

    /* JADX INFO: renamed from: j */
    public IntentSender m2816j() {
        return (IntentSender) this.f2132a.getParcelable("settingsIntent");
    }

    /* JADX INFO: renamed from: k */
    public List<IntentFilter> m2817k() {
        m2818l();
        return this.f2133b;
    }

    /* JADX INFO: renamed from: l */
    void m2818l() {
        if (this.f2133b == null) {
            this.f2133b = this.f2132a.getParcelableArrayList("controlFilters");
            if (this.f2133b == null) {
                this.f2133b = Collections.emptyList();
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public int m2819m() {
        return this.f2132a.getInt("playbackType", 1);
    }

    /* JADX INFO: renamed from: n */
    public int m2820n() {
        return this.f2132a.getInt("playbackStream", -1);
    }

    /* JADX INFO: renamed from: o */
    public int m2821o() {
        return this.f2132a.getInt("deviceType");
    }

    /* JADX INFO: renamed from: p */
    public int m2822p() {
        return this.f2132a.getInt("volume");
    }

    /* JADX INFO: renamed from: q */
    public int m2823q() {
        return this.f2132a.getInt("volumeMax");
    }

    /* JADX INFO: renamed from: r */
    public int m2824r() {
        return this.f2132a.getInt("volumeHandling", 0);
    }

    /* JADX INFO: renamed from: s */
    public int m2825s() {
        return this.f2132a.getInt("presentationDisplayId", -1);
    }

    /* JADX INFO: renamed from: t */
    public Bundle m2826t() {
        return this.f2132a.getBundle("extras");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MediaRouteDescriptor{ ");
        sb.append("id=").append(m2807a());
        sb.append(", groupMemberIds=").append(m2808b());
        sb.append(", name=").append(m2809c());
        sb.append(", description=").append(m2810d());
        sb.append(", iconUri=").append(m2811e());
        sb.append(", isEnabled=").append(m2812f());
        sb.append(", isConnecting=").append(m2813g());
        sb.append(", connectionState=").append(m2814h());
        sb.append(", controlFilters=").append(Arrays.toString(m2817k().toArray()));
        sb.append(", playbackType=").append(m2819m());
        sb.append(", playbackStream=").append(m2820n());
        sb.append(", deviceType=").append(m2821o());
        sb.append(", volume=").append(m2822p());
        sb.append(", volumeMax=").append(m2823q());
        sb.append(", volumeHandling=").append(m2824r());
        sb.append(", presentationDisplayId=").append(m2825s());
        sb.append(", extras=").append(m2826t());
        sb.append(", isValid=").append(m2829w());
        sb.append(", minClientVersion=").append(m2827u());
        sb.append(", maxClientVersion=").append(m2828v());
        sb.append(" }");
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public int m2827u() {
        return this.f2132a.getInt("minClientVersion", 1);
    }

    /* JADX INFO: renamed from: v */
    public int m2828v() {
        return this.f2132a.getInt("maxClientVersion", Integer.MAX_VALUE);
    }

    /* JADX INFO: renamed from: w */
    public boolean m2829w() {
        m2818l();
        return (TextUtils.isEmpty(m2807a()) || TextUtils.isEmpty(m2809c()) || this.f2133b.contains(null)) ? false : true;
    }

    /* JADX INFO: renamed from: x */
    public Bundle m2830x() {
        return this.f2132a;
    }
}
