package android.support.v4.p017h;

import android.support.v4.p018i.C0218l;
import android.util.Base64;
import java.util.List;

/* JADX INFO: renamed from: android.support.v4.h.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0204a {

    /* JADX INFO: renamed from: a */
    private final String f1167a;

    /* JADX INFO: renamed from: b */
    private final String f1168b;

    /* JADX INFO: renamed from: c */
    private final String f1169c;

    /* JADX INFO: renamed from: d */
    private final List<List<byte[]>> f1170d;

    /* JADX INFO: renamed from: e */
    private final int f1171e = 0;

    /* JADX INFO: renamed from: f */
    private final String f1172f;

    public C0204a(String str, String str2, String str3, List<List<byte[]>> list) {
        this.f1167a = (String) C0218l.m1572a(str);
        this.f1168b = (String) C0218l.m1572a(str2);
        this.f1169c = (String) C0218l.m1572a(str3);
        this.f1170d = (List) C0218l.m1572a(list);
        this.f1172f = this.f1167a + "-" + this.f1168b + "-" + this.f1169c;
    }

    /* JADX INFO: renamed from: a */
    public String m1473a() {
        return this.f1167a;
    }

    /* JADX INFO: renamed from: b */
    public String m1474b() {
        return this.f1168b;
    }

    /* JADX INFO: renamed from: c */
    public String m1475c() {
        return this.f1169c;
    }

    /* JADX INFO: renamed from: d */
    public List<List<byte[]>> m1476d() {
        return this.f1170d;
    }

    /* JADX INFO: renamed from: e */
    public int m1477e() {
        return this.f1171e;
    }

    /* JADX INFO: renamed from: f */
    public String m1478f() {
        return this.f1172f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f1167a + ", mProviderPackage: " + this.f1168b + ", mQuery: " + this.f1169c + ", mCertificates:");
        for (int i = 0; i < this.f1170d.size(); i++) {
            sb.append(" [");
            List<byte[]> list = this.f1170d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString(list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f1171e);
        return sb.toString();
    }
}
