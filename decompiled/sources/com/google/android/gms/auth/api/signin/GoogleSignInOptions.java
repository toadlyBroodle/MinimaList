package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.internal.C0947l;
import com.google.android.gms.auth.api.signin.internal.C0949n;
import com.google.android.gms.common.api.C1074a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.AbstractC2011we;
import com.google.android.gms.internal.C2014wh;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class GoogleSignInOptions extends AbstractC2011we implements C1074a.a.e, ReflectedParcelable {

    /* JADX INFO: renamed from: h */
    private int f5055h;

    /* JADX INFO: renamed from: i */
    private final ArrayList<Scope> f5056i;

    /* JADX INFO: renamed from: j */
    private Account f5057j;

    /* JADX INFO: renamed from: k */
    private boolean f5058k;

    /* JADX INFO: renamed from: l */
    private final boolean f5059l;

    /* JADX INFO: renamed from: m */
    private final boolean f5060m;

    /* JADX INFO: renamed from: n */
    private String f5061n;

    /* JADX INFO: renamed from: o */
    private String f5062o;

    /* JADX INFO: renamed from: p */
    private ArrayList<C0947l> f5063p;

    /* JADX INFO: renamed from: q */
    private Map<Integer, C0947l> f5064q;

    /* JADX INFO: renamed from: a */
    public static final Scope f5047a = new Scope("profile");

    /* JADX INFO: renamed from: b */
    public static final Scope f5048b = new Scope("email");

    /* JADX INFO: renamed from: c */
    public static final Scope f5049c = new Scope("openid");

    /* JADX INFO: renamed from: d */
    public static final Scope f5050d = new Scope("https://www.googleapis.com/auth/games_lite");

    /* JADX INFO: renamed from: e */
    public static final Scope f5051e = new Scope("https://www.googleapis.com/auth/games");

    /* JADX INFO: renamed from: f */
    public static final GoogleSignInOptions f5052f = new C0927a().m6142a().m6146c().m6147d();

    /* JADX INFO: renamed from: g */
    public static final GoogleSignInOptions f5053g = new C0927a().m6143a(f5050d, new Scope[0]).m6147d();
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR = new C0933f();

    /* JADX INFO: renamed from: r */
    private static Comparator<Scope> f5054r = new C0932e();

    /* JADX INFO: renamed from: com.google.android.gms.auth.api.signin.GoogleSignInOptions$a */
    public static final class C0927a {

        /* JADX INFO: renamed from: a */
        private Set<Scope> f5065a;

        /* JADX INFO: renamed from: b */
        private boolean f5066b;

        /* JADX INFO: renamed from: c */
        private boolean f5067c;

        /* JADX INFO: renamed from: d */
        private boolean f5068d;

        /* JADX INFO: renamed from: e */
        private String f5069e;

        /* JADX INFO: renamed from: f */
        private Account f5070f;

        /* JADX INFO: renamed from: g */
        private String f5071g;

        /* JADX INFO: renamed from: h */
        private Map<Integer, C0947l> f5072h;

        public C0927a() {
            this.f5065a = new HashSet();
            this.f5072h = new HashMap();
        }

        public C0927a(GoogleSignInOptions googleSignInOptions) {
            this.f5065a = new HashSet();
            this.f5072h = new HashMap();
            C1221aj.m7065a(googleSignInOptions);
            this.f5065a = new HashSet(googleSignInOptions.f5056i);
            this.f5066b = googleSignInOptions.f5059l;
            this.f5067c = googleSignInOptions.f5060m;
            this.f5068d = googleSignInOptions.f5058k;
            this.f5069e = googleSignInOptions.f5061n;
            this.f5070f = googleSignInOptions.f5057j;
            this.f5071g = googleSignInOptions.f5062o;
            this.f5072h = GoogleSignInOptions.m6130b(googleSignInOptions.f5063p);
        }

        /* JADX INFO: renamed from: b */
        private final String m6141b(String str) {
            C1221aj.m7067a(str);
            C1221aj.m7075b(this.f5069e == null || this.f5069e.equals(str), "two different server client ids provided");
            return str;
        }

        /* JADX INFO: renamed from: a */
        public final C0927a m6142a() {
            this.f5065a.add(GoogleSignInOptions.f5049c);
            return this;
        }

        /* JADX INFO: renamed from: a */
        public final C0927a m6143a(Scope scope, Scope... scopeArr) {
            this.f5065a.add(scope);
            this.f5065a.addAll(Arrays.asList(scopeArr));
            return this;
        }

        /* JADX INFO: renamed from: a */
        public final C0927a m6144a(String str) {
            this.f5068d = true;
            this.f5069e = m6141b(str);
            return this;
        }

        /* JADX INFO: renamed from: b */
        public final C0927a m6145b() {
            this.f5065a.add(GoogleSignInOptions.f5048b);
            return this;
        }

        /* JADX INFO: renamed from: c */
        public final C0927a m6146c() {
            this.f5065a.add(GoogleSignInOptions.f5047a);
            return this;
        }

        /* JADX INFO: renamed from: d */
        public final GoogleSignInOptions m6147d() {
            if (this.f5065a.contains(GoogleSignInOptions.f5051e) && this.f5065a.contains(GoogleSignInOptions.f5050d)) {
                this.f5065a.remove(GoogleSignInOptions.f5050d);
            }
            if (this.f5068d && (this.f5070f == null || !this.f5065a.isEmpty())) {
                m6142a();
            }
            return new GoogleSignInOptions(3, new ArrayList(this.f5065a), this.f5070f, this.f5068d, this.f5066b, this.f5067c, this.f5069e, this.f5071g, this.f5072h, null);
        }
    }

    GoogleSignInOptions(int i, ArrayList<Scope> arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, ArrayList<C0947l> arrayList2) {
        this(i, arrayList, account, z, z2, z3, str, str2, m6130b(arrayList2));
    }

    private GoogleSignInOptions(int i, ArrayList<Scope> arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map<Integer, C0947l> map) {
        this.f5055h = i;
        this.f5056i = arrayList;
        this.f5057j = account;
        this.f5058k = z;
        this.f5059l = z2;
        this.f5060m = z3;
        this.f5061n = str;
        this.f5062o = str2;
        this.f5063p = new ArrayList<>(map.values());
        this.f5064q = map;
    }

    /* synthetic */ GoogleSignInOptions(int i, ArrayList arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map map, C0932e c0932e) {
        this(3, (ArrayList<Scope>) arrayList, account, z, z2, z3, str, str2, (Map<Integer, C0947l>) map);
    }

    /* JADX INFO: renamed from: a */
    public static GoogleSignInOptions m6127a(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        String strOptString = jSONObject.optString("accountName", null);
        return new GoogleSignInOptions(3, (ArrayList<Scope>) new ArrayList(hashSet), !TextUtils.isEmpty(strOptString) ? new Account(strOptString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.optString("serverClientId", null), jSONObject.optString("hostedDomain", null), new HashMap());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static Map<Integer, C0947l> m6130b(List<C0947l> list) {
        HashMap map = new HashMap();
        if (list == null) {
            return map;
        }
        for (C0947l c0947l : list) {
            map.put(Integer.valueOf(c0947l.m6180a()), c0947l);
        }
        return map;
    }

    /* JADX INFO: renamed from: c */
    private final JSONObject m6132c() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Collections.sort(this.f5056i, f5054r);
            ArrayList<Scope> arrayList = this.f5056i;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Scope scope = arrayList.get(i);
                i++;
                jSONArray.put(scope.m6623a());
            }
            jSONObject.put("scopes", jSONArray);
            if (this.f5057j != null) {
                jSONObject.put("accountName", this.f5057j.name);
            }
            jSONObject.put("idTokenRequested", this.f5058k);
            jSONObject.put("forceCodeForRefreshToken", this.f5060m);
            jSONObject.put("serverAuthRequested", this.f5059l);
            if (!TextUtils.isEmpty(this.f5061n)) {
                jSONObject.put("serverClientId", this.f5061n);
            }
            if (!TextUtils.isEmpty(this.f5062o)) {
                jSONObject.put("hostedDomain", this.f5062o);
            }
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: a */
    public final ArrayList<Scope> m6139a() {
        return new ArrayList<>(this.f5056i);
    }

    /* JADX INFO: renamed from: b */
    public final String m6140b() {
        return m6132c().toString();
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
            if (this.f5063p.size() > 0 || googleSignInOptions.f5063p.size() > 0 || this.f5056i.size() != googleSignInOptions.m6139a().size() || !this.f5056i.containsAll(googleSignInOptions.m6139a())) {
                return false;
            }
            if (this.f5057j == null) {
                if (googleSignInOptions.f5057j != null) {
                    return false;
                }
            } else if (!this.f5057j.equals(googleSignInOptions.f5057j)) {
                return false;
            }
            if (TextUtils.isEmpty(this.f5061n)) {
                if (!TextUtils.isEmpty(googleSignInOptions.f5061n)) {
                    return false;
                }
            } else if (!this.f5061n.equals(googleSignInOptions.f5061n)) {
                return false;
            }
            if (this.f5060m == googleSignInOptions.f5060m && this.f5058k == googleSignInOptions.f5058k) {
                return this.f5059l == googleSignInOptions.f5059l;
            }
            return false;
        } catch (ClassCastException e) {
            return false;
        }
    }

    public int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList<Scope> arrayList2 = this.f5056i;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Scope scope = arrayList2.get(i);
            i++;
            arrayList.add(scope.m6623a());
        }
        Collections.sort(arrayList);
        return new C0949n().m6186a(arrayList).m6186a(this.f5057j).m6186a(this.f5061n).m6187a(this.f5060m).m6187a(this.f5058k).m6187a(this.f5059l).m6185a();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iM12512a = C2014wh.m12512a(parcel);
        C2014wh.m12516a(parcel, 1, this.f5055h);
        C2014wh.m12537c(parcel, 2, m6139a(), false);
        C2014wh.m12520a(parcel, 3, (Parcelable) this.f5057j, i, false);
        C2014wh.m12526a(parcel, 4, this.f5058k);
        C2014wh.m12526a(parcel, 5, this.f5059l);
        C2014wh.m12526a(parcel, 6, this.f5060m);
        C2014wh.m12524a(parcel, 7, this.f5061n, false);
        C2014wh.m12524a(parcel, 8, this.f5062o, false);
        C2014wh.m12537c(parcel, 9, this.f5063p, false);
        C2014wh.m12513a(parcel, iM12512a);
    }
}
