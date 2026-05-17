package com.google.android.gms.cast;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.p052a.C1072a;
import com.google.android.gms.internal.AbstractC2011we;
import com.google.android.gms.internal.C1981vb;
import com.google.android.gms.internal.C2014wh;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.cast.d */
/* JADX INFO: loaded from: classes.dex */
public class C0990d extends AbstractC2011we {
    public static final Parcelable.Creator<C0990d> CREATOR = new C0980aa();

    /* JADX INFO: renamed from: a */
    private String f5199a;

    /* JADX INFO: renamed from: b */
    private String f5200b;

    /* JADX INFO: renamed from: c */
    private List<C1072a> f5201c;

    /* JADX INFO: renamed from: d */
    private List<String> f5202d;

    /* JADX INFO: renamed from: e */
    private String f5203e;

    /* JADX INFO: renamed from: f */
    private Uri f5204f;

    private C0990d() {
        this.f5201c = new ArrayList();
        this.f5202d = new ArrayList();
    }

    C0990d(String str, String str2, List<C1072a> list, List<String> list2, String str3, Uri uri) {
        this.f5199a = str;
        this.f5200b = str2;
        this.f5201c = list;
        this.f5202d = list2;
        this.f5203e = str3;
        this.f5204f = uri;
    }

    /* JADX INFO: renamed from: a */
    public String m6304a() {
        return this.f5199a;
    }

    /* JADX INFO: renamed from: b */
    public String m6305b() {
        return this.f5200b;
    }

    /* JADX INFO: renamed from: c */
    public List<String> m6306c() {
        return Collections.unmodifiableList(this.f5202d);
    }

    /* JADX INFO: renamed from: d */
    public String m6307d() {
        return this.f5203e;
    }

    /* JADX INFO: renamed from: e */
    public List<C1072a> m6308e() {
        return this.f5201c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0990d)) {
            return false;
        }
        C0990d c0990d = (C0990d) obj;
        return C1981vb.m12427a(this.f5199a, c0990d.f5199a) && C1981vb.m12427a(this.f5201c, c0990d.f5201c) && C1981vb.m12427a(this.f5200b, c0990d.f5200b) && C1981vb.m12427a(this.f5202d, c0990d.f5202d) && C1981vb.m12427a(this.f5203e, c0990d.f5203e) && C1981vb.m12427a(this.f5204f, c0990d.f5204f);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5199a, this.f5200b, this.f5201c, this.f5202d, this.f5203e, this.f5204f});
    }

    public String toString() {
        return "applicationId: " + this.f5199a + ", name: " + this.f5200b + ", images.count: " + (this.f5201c == null ? 0 : this.f5201c.size()) + ", namespaces.count: " + (this.f5202d != null ? this.f5202d.size() : 0) + ", senderAppIdentifier: " + this.f5203e + ", senderAppLaunchUrl: " + this.f5204f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iM12512a = C2014wh.m12512a(parcel);
        C2014wh.m12524a(parcel, 2, m6304a(), false);
        C2014wh.m12524a(parcel, 3, m6305b(), false);
        C2014wh.m12537c(parcel, 4, m6308e(), false);
        C2014wh.m12535b(parcel, 5, m6306c(), false);
        C2014wh.m12524a(parcel, 6, m6307d(), false);
        C2014wh.m12520a(parcel, 7, (Parcelable) this.f5204f, i, false);
        C2014wh.m12513a(parcel, iM12512a);
    }
}
