package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.C0710au;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class buq {

    /* JADX INFO: renamed from: a */
    private final int f9042a;

    /* JADX INFO: renamed from: b */
    private final int f9043b;

    /* JADX INFO: renamed from: c */
    private final int f9044c;

    /* JADX INFO: renamed from: d */
    private final bvd f9045d;

    /* JADX INFO: renamed from: e */
    private final bvn f9046e;

    /* JADX INFO: renamed from: m */
    private int f9054m;

    /* JADX INFO: renamed from: f */
    private final Object f9047f = new Object();

    /* JADX INFO: renamed from: g */
    private ArrayList<String> f9048g = new ArrayList<>();

    /* JADX INFO: renamed from: h */
    private ArrayList<String> f9049h = new ArrayList<>();

    /* JADX INFO: renamed from: i */
    private ArrayList<bvb> f9050i = new ArrayList<>();

    /* JADX INFO: renamed from: j */
    private int f9051j = 0;

    /* JADX INFO: renamed from: k */
    private int f9052k = 0;

    /* JADX INFO: renamed from: l */
    private int f9053l = 0;

    /* JADX INFO: renamed from: n */
    private String f9055n = "";

    /* JADX INFO: renamed from: o */
    private String f9056o = "";

    /* JADX INFO: renamed from: p */
    private String f9057p = "";

    public buq(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f9042a = i;
        this.f9043b = i2;
        this.f9044c = i3;
        this.f9045d = new bvd(i4);
        this.f9046e = new bvn(i5, i6, i7);
    }

    /* JADX INFO: renamed from: a */
    private static String m10267a(ArrayList<String> arrayList, int i) {
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        ArrayList<String> arrayList2 = arrayList;
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            String str = arrayList2.get(i2);
            i2++;
            stringBuffer.append(str);
            stringBuffer.append(' ');
            if (stringBuffer.length() > 100) {
                break;
            }
        }
        stringBuffer.deleteCharAt(stringBuffer.length() - 1);
        String string = stringBuffer.toString();
        return string.length() >= 100 ? string.substring(0, 100) : string;
    }

    /* JADX INFO: renamed from: c */
    private final void m10268c(String str, boolean z, float f, float f2, float f3, float f4) {
        if (str == null || str.length() < this.f9044c) {
            return;
        }
        synchronized (this.f9047f) {
            this.f9048g.add(str);
            this.f9051j += str.length();
            if (z) {
                this.f9049h.add(str);
                this.f9050i.add(new bvb(f, f2, f3, f4, this.f9049h.size() - 1));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m10269a(int i) {
        this.f9052k = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m10270a(String str, boolean z, float f, float f2, float f3, float f4) {
        m10268c(str, z, f, f2, f3, f4);
        synchronized (this.f9047f) {
            if (this.f9053l < 0) {
                C1560fm.m11610b("ActivityContent: negative number of WebViews.");
            }
            m10279h();
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m10271a() {
        boolean z;
        synchronized (this.f9047f) {
            z = this.f9053l == 0;
        }
        return z;
    }

    /* JADX INFO: renamed from: b */
    public final String m10272b() {
        return this.f9055n;
    }

    /* JADX INFO: renamed from: b */
    public final void m10273b(String str, boolean z, float f, float f2, float f3, float f4) {
        m10268c(str, z, f, f2, f3, f4);
    }

    /* JADX INFO: renamed from: c */
    public final String m10274c() {
        return this.f9056o;
    }

    /* JADX INFO: renamed from: d */
    public final String m10275d() {
        return this.f9057p;
    }

    /* JADX INFO: renamed from: e */
    public final void m10276e() {
        synchronized (this.f9047f) {
            this.f9054m -= 100;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof buq)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        buq buqVar = (buq) obj;
        return buqVar.f9055n != null && buqVar.f9055n.equals(this.f9055n);
    }

    /* JADX INFO: renamed from: f */
    public final void m10277f() {
        synchronized (this.f9047f) {
            this.f9053l--;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m10278g() {
        synchronized (this.f9047f) {
            this.f9053l++;
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m10279h() {
        synchronized (this.f9047f) {
            int i = (this.f9051j * this.f9042a) + (this.f9052k * this.f9043b);
            if (i > this.f9054m) {
                this.f9054m = i;
                if (((Boolean) bxm.m10409f().m10546a(can.f9417Q)).booleanValue() && !C0710au.m5573i().m11295a()) {
                    this.f9055n = this.f9045d.m10318a(this.f9048g);
                    this.f9056o = this.f9045d.m10318a(this.f9049h);
                }
                if (((Boolean) bxm.m10409f().m10546a(can.f9419S)).booleanValue() && !C0710au.m5573i().m11299b()) {
                    this.f9057p = this.f9046e.m10332a(this.f9049h, this.f9050i);
                }
            }
        }
    }

    public final int hashCode() {
        return this.f9055n.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public final int m10280i() {
        return this.f9054m;
    }

    /* JADX INFO: renamed from: j */
    final int m10281j() {
        return this.f9051j;
    }

    public final String toString() {
        int i = this.f9052k;
        int i2 = this.f9054m;
        int i3 = this.f9051j;
        String strM10267a = m10267a(this.f9048g, 100);
        String strM10267a2 = m10267a(this.f9049h, 100);
        String str = this.f9055n;
        String str2 = this.f9056o;
        String str3 = this.f9057p;
        return new StringBuilder(String.valueOf(strM10267a).length() + 165 + String.valueOf(strM10267a2).length() + String.valueOf(str).length() + String.valueOf(str2).length() + String.valueOf(str3).length()).append("ActivityContent fetchId: ").append(i).append(" score:").append(i2).append(" total_length:").append(i3).append("\n text: ").append(strM10267a).append("\n viewableText").append(strM10267a2).append("\n signture: ").append(str).append("\n viewableSignture: ").append(str2).append("\n viewableSignatureForVertical: ").append(str3).toString();
    }
}
