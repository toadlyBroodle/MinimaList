package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.util.C1303g;
import com.google.android.gms.common.util.InterfaceC1300d;
import com.google.android.gms.internal.AbstractC2011we;
import com.google.android.gms.internal.C2014wh;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class GoogleSignInAccount extends AbstractC2011we implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new C0931d();

    /* JADX INFO: renamed from: a */
    private static InterfaceC1300d f5033a = C1303g.m7263d();

    /* JADX INFO: renamed from: b */
    private int f5034b;

    /* JADX INFO: renamed from: c */
    private String f5035c;

    /* JADX INFO: renamed from: d */
    private String f5036d;

    /* JADX INFO: renamed from: e */
    private String f5037e;

    /* JADX INFO: renamed from: f */
    private String f5038f;

    /* JADX INFO: renamed from: g */
    private Uri f5039g;

    /* JADX INFO: renamed from: h */
    private String f5040h;

    /* JADX INFO: renamed from: i */
    private long f5041i;

    /* JADX INFO: renamed from: j */
    private String f5042j;

    /* JADX INFO: renamed from: k */
    private List<Scope> f5043k;

    /* JADX INFO: renamed from: l */
    private String f5044l;

    /* JADX INFO: renamed from: m */
    private String f5045m;

    /* JADX INFO: renamed from: n */
    private Set<Scope> f5046n = new HashSet();

    GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, List<Scope> list, String str7, String str8) {
        this.f5034b = i;
        this.f5035c = str;
        this.f5036d = str2;
        this.f5037e = str3;
        this.f5038f = str4;
        this.f5039g = uri;
        this.f5040h = str5;
        this.f5041i = j;
        this.f5042j = str6;
        this.f5043k = list;
        this.f5044l = str7;
        this.f5045m = str8;
    }

    /* JADX INFO: renamed from: a */
    public static GoogleSignInAccount m6112a(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl", null);
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        GoogleSignInAccount googleSignInAccountM6113a = m6113a(jSONObject.optString("id"), jSONObject.optString("tokenId", null), jSONObject.optString("email", null), jSONObject.optString("displayName", null), jSONObject.optString("givenName", null), jSONObject.optString("familyName", null), uri, Long.valueOf(j), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        googleSignInAccountM6113a.f5040h = jSONObject.optString("serverAuthCode", null);
        return googleSignInAccountM6113a;
    }

    /* JADX INFO: renamed from: a */
    private static GoogleSignInAccount m6113a(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l, String str7, Set<Scope> set) {
        if (l == null) {
            l = Long.valueOf(f5033a.mo7252a() / 1000);
        }
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, l.longValue(), C1221aj.m7067a(str7), new ArrayList((Collection) C1221aj.m7065a(set)), str5, str6);
    }

    /* JADX INFO: renamed from: m */
    private final JSONObject m6114m() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (m6115a() != null) {
                jSONObject.put("id", m6115a());
            }
            if (m6116b() != null) {
                jSONObject.put("tokenId", m6116b());
            }
            if (m6117c() != null) {
                jSONObject.put("email", m6117c());
            }
            if (m6119e() != null) {
                jSONObject.put("displayName", m6119e());
            }
            if (m6120f() != null) {
                jSONObject.put("givenName", m6120f());
            }
            if (m6121g() != null) {
                jSONObject.put("familyName", m6121g());
            }
            if (m6122h() != null) {
                jSONObject.put("photoUrl", m6122h().toString());
            }
            if (m6123i() != null) {
                jSONObject.put("serverAuthCode", m6123i());
            }
            jSONObject.put("expirationTime", this.f5041i);
            jSONObject.put("obfuscatedIdentifier", this.f5042j);
            JSONArray jSONArray = new JSONArray();
            Scope[] scopeArr = (Scope[]) this.f5043k.toArray(new Scope[this.f5043k.size()]);
            Arrays.sort(scopeArr, C0930c.f5078a);
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.m6623a());
            }
            jSONObject.put("grantedScopes", jSONArray);
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: a */
    public String m6115a() {
        return this.f5035c;
    }

    /* JADX INFO: renamed from: b */
    public String m6116b() {
        return this.f5036d;
    }

    /* JADX INFO: renamed from: c */
    public String m6117c() {
        return this.f5037e;
    }

    /* JADX INFO: renamed from: d */
    public Account m6118d() {
        if (this.f5037e == null) {
            return null;
        }
        return new Account(this.f5037e, "com.google");
    }

    /* JADX INFO: renamed from: e */
    public String m6119e() {
        return this.f5038f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.f5042j.equals(this.f5042j) && googleSignInAccount.m6125k().equals(m6125k());
    }

    /* JADX INFO: renamed from: f */
    public String m6120f() {
        return this.f5044l;
    }

    /* JADX INFO: renamed from: g */
    public String m6121g() {
        return this.f5045m;
    }

    /* JADX INFO: renamed from: h */
    public Uri m6122h() {
        return this.f5039g;
    }

    public int hashCode() {
        return ((this.f5042j.hashCode() + 527) * 31) + m6125k().hashCode();
    }

    /* JADX INFO: renamed from: i */
    public String m6123i() {
        return this.f5040h;
    }

    /* JADX INFO: renamed from: j */
    public final String m6124j() {
        return this.f5042j;
    }

    /* JADX INFO: renamed from: k */
    public final Set<Scope> m6125k() {
        HashSet hashSet = new HashSet(this.f5043k);
        hashSet.addAll(this.f5046n);
        return hashSet;
    }

    /* JADX INFO: renamed from: l */
    public final String m6126l() {
        JSONObject jSONObjectM6114m = m6114m();
        jSONObjectM6114m.remove("serverAuthCode");
        return jSONObjectM6114m.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iM12512a = C2014wh.m12512a(parcel);
        C2014wh.m12516a(parcel, 1, this.f5034b);
        C2014wh.m12524a(parcel, 2, m6115a(), false);
        C2014wh.m12524a(parcel, 3, m6116b(), false);
        C2014wh.m12524a(parcel, 4, m6117c(), false);
        C2014wh.m12524a(parcel, 5, m6119e(), false);
        C2014wh.m12520a(parcel, 6, (Parcelable) m6122h(), i, false);
        C2014wh.m12524a(parcel, 7, m6123i(), false);
        C2014wh.m12517a(parcel, 8, this.f5041i);
        C2014wh.m12524a(parcel, 9, this.f5042j, false);
        C2014wh.m12537c(parcel, 10, this.f5043k, false);
        C2014wh.m12524a(parcel, 11, m6120f(), false);
        C2014wh.m12524a(parcel, 12, m6121g(), false);
        C2014wh.m12513a(parcel, iM12512a);
    }
}
