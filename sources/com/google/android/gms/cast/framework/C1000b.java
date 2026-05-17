package com.google.android.gms.cast.framework;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.cast.C1051g;
import com.google.android.gms.cast.framework.media.C1012a;
import com.google.android.gms.internal.AbstractC2011we;
import com.google.android.gms.internal.C2014wh;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.cast.framework.b */
/* JADX INFO: loaded from: classes.dex */
public class C1000b extends AbstractC2011we {
    public static final Parcelable.Creator<C1000b> CREATOR = new C1039o();

    /* JADX INFO: renamed from: a */
    private final String f5228a;

    /* JADX INFO: renamed from: b */
    private final List<String> f5229b;

    /* JADX INFO: renamed from: c */
    private final boolean f5230c;

    /* JADX INFO: renamed from: d */
    private final C1051g f5231d;

    /* JADX INFO: renamed from: e */
    private final boolean f5232e;

    /* JADX INFO: renamed from: f */
    private final C1012a f5233f;

    /* JADX INFO: renamed from: g */
    private final boolean f5234g;

    /* JADX INFO: renamed from: h */
    private final double f5235h;

    C1000b(String str, List<String> list, boolean z, C1051g c1051g, boolean z2, C1012a c1012a, boolean z3, double d) {
        this.f5228a = TextUtils.isEmpty(str) ? "" : str;
        int size = list == null ? 0 : list.size();
        this.f5229b = new ArrayList(size);
        if (size > 0) {
            this.f5229b.addAll(list);
        }
        this.f5230c = z;
        this.f5231d = c1051g == null ? new C1051g() : c1051g;
        this.f5232e = z2;
        this.f5233f = c1012a;
        this.f5234g = z3;
        this.f5235h = d;
    }

    /* JADX INFO: renamed from: a */
    public String m6354a() {
        return this.f5228a;
    }

    /* JADX INFO: renamed from: b */
    public List<String> m6355b() {
        return Collections.unmodifiableList(this.f5229b);
    }

    /* JADX INFO: renamed from: c */
    public boolean m6356c() {
        return this.f5230c;
    }

    /* JADX INFO: renamed from: d */
    public C1051g m6357d() {
        return this.f5231d;
    }

    /* JADX INFO: renamed from: e */
    public boolean m6358e() {
        return this.f5232e;
    }

    /* JADX INFO: renamed from: f */
    public C1012a m6359f() {
        return this.f5233f;
    }

    /* JADX INFO: renamed from: g */
    public boolean m6360g() {
        return this.f5234g;
    }

    /* JADX INFO: renamed from: h */
    public double m6361h() {
        return this.f5235h;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iM12512a = C2014wh.m12512a(parcel);
        C2014wh.m12524a(parcel, 2, m6354a(), false);
        C2014wh.m12535b(parcel, 3, m6355b(), false);
        C2014wh.m12526a(parcel, 4, m6356c());
        C2014wh.m12520a(parcel, 5, (Parcelable) m6357d(), i, false);
        C2014wh.m12526a(parcel, 6, m6358e());
        C2014wh.m12520a(parcel, 7, (Parcelable) m6359f(), i, false);
        C2014wh.m12526a(parcel, 8, m6360g());
        C2014wh.m12514a(parcel, 9, m6361h());
        C2014wh.m12513a(parcel, iM12512a);
    }
}
