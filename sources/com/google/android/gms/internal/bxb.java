package com.google.android.gms.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.C0681d;
import com.google.android.gms.ads.C0859l;

/* JADX INFO: loaded from: classes.dex */
@cnb
public class bxb extends AbstractC2011we {
    public static final Parcelable.Creator<bxb> CREATOR = new bxc();

    /* JADX INFO: renamed from: a */
    public final String f9247a;

    /* JADX INFO: renamed from: b */
    public final int f9248b;

    /* JADX INFO: renamed from: c */
    public final int f9249c;

    /* JADX INFO: renamed from: d */
    public final boolean f9250d;

    /* JADX INFO: renamed from: e */
    public final int f9251e;

    /* JADX INFO: renamed from: f */
    public final int f9252f;

    /* JADX INFO: renamed from: g */
    public final bxb[] f9253g;

    /* JADX INFO: renamed from: h */
    public final boolean f9254h;

    /* JADX INFO: renamed from: i */
    public final boolean f9255i;

    /* JADX INFO: renamed from: j */
    public boolean f9256j;

    public bxb() {
        this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false);
    }

    public bxb(Context context, C0681d c0681d) {
        this(context, new C0681d[]{c0681d});
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public bxb(Context context, C0681d[] c0681dArr) {
        int i;
        C0681d c0681d = c0681dArr[0];
        this.f9250d = false;
        this.f9255i = c0681d.m5418c();
        if (this.f9255i) {
            this.f9251e = C0681d.f4380a.m5416b();
            this.f9248b = C0681d.f4380a.m5414a();
        } else {
            this.f9251e = c0681d.m5416b();
            this.f9248b = c0681d.m5414a();
        }
        boolean z = this.f9251e == -1;
        boolean z2 = this.f9248b == -2;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (z) {
            bxm.m10404a();
            if (C1657jb.m11580g(context)) {
                bxm.m10404a();
                if (C1657jb.m11581h(context)) {
                    int i2 = displayMetrics.widthPixels;
                    bxm.m10404a();
                    this.f9252f = i2 - C1657jb.m11582i(context);
                } else {
                    this.f9252f = displayMetrics.widthPixels;
                }
                double d = this.f9252f / displayMetrics.density;
                int i3 = (int) d;
                i = d - ((double) ((int) d)) >= 0.01d ? i3 + 1 : i3;
            }
        } else {
            int i4 = this.f9251e;
            bxm.m10404a();
            this.f9252f = C1657jb.m11561a(displayMetrics, this.f9251e);
            i = i4;
        }
        int iM10383c = z2 ? m10383c(displayMetrics) : this.f9248b;
        bxm.m10404a();
        this.f9249c = C1657jb.m11561a(displayMetrics, iM10383c);
        if (z || z2) {
            this.f9247a = new StringBuilder(26).append(i).append("x").append(iM10383c).append("_as").toString();
        } else if (this.f9255i) {
            this.f9247a = "320x50_mb";
        } else {
            this.f9247a = c0681d.toString();
        }
        if (c0681dArr.length > 1) {
            this.f9253g = new bxb[c0681dArr.length];
            for (int i5 = 0; i5 < c0681dArr.length; i5++) {
                this.f9253g[i5] = new bxb(context, c0681dArr[i5]);
            }
        } else {
            this.f9253g = null;
        }
        this.f9254h = false;
        this.f9256j = false;
    }

    public bxb(bxb bxbVar, bxb[] bxbVarArr) {
        this(bxbVar.f9247a, bxbVar.f9248b, bxbVar.f9249c, bxbVar.f9250d, bxbVar.f9251e, bxbVar.f9252f, bxbVarArr, bxbVar.f9254h, bxbVar.f9255i, bxbVar.f9256j);
    }

    bxb(String str, int i, int i2, boolean z, int i3, int i4, bxb[] bxbVarArr, boolean z2, boolean z3, boolean z4) {
        this.f9247a = str;
        this.f9248b = i;
        this.f9249c = i2;
        this.f9250d = z;
        this.f9251e = i3;
        this.f9252f = i4;
        this.f9253g = bxbVarArr;
        this.f9254h = z2;
        this.f9255i = z3;
        this.f9256j = z4;
    }

    /* JADX INFO: renamed from: a */
    public static int m10379a(DisplayMetrics displayMetrics) {
        return displayMetrics.widthPixels;
    }

    /* JADX INFO: renamed from: a */
    public static bxb m10380a() {
        return new bxb("reward_mb", 0, 0, true, 0, 0, null, false, false, false);
    }

    /* JADX INFO: renamed from: a */
    public static bxb m10381a(Context context) {
        return new bxb("320x50_mb", 0, 0, false, 0, 0, null, true, false, false);
    }

    /* JADX INFO: renamed from: b */
    public static int m10382b(DisplayMetrics displayMetrics) {
        return (int) (m10383c(displayMetrics) * displayMetrics.density);
    }

    /* JADX INFO: renamed from: c */
    private static int m10383c(DisplayMetrics displayMetrics) {
        int i = (int) (displayMetrics.heightPixels / displayMetrics.density);
        if (i <= 400) {
            return 32;
        }
        return i <= 720 ? 50 : 90;
    }

    /* JADX INFO: renamed from: b */
    public final C0681d m10384b() {
        return C0859l.m5832a(this.f9251e, this.f9248b, this.f9247a);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iM12512a = C2014wh.m12512a(parcel);
        C2014wh.m12524a(parcel, 2, this.f9247a, false);
        C2014wh.m12516a(parcel, 3, this.f9248b);
        C2014wh.m12516a(parcel, 4, this.f9249c);
        C2014wh.m12526a(parcel, 5, this.f9250d);
        C2014wh.m12516a(parcel, 6, this.f9251e);
        C2014wh.m12516a(parcel, 7, this.f9252f);
        C2014wh.m12530a(parcel, 8, (Parcelable[]) this.f9253g, i, false);
        C2014wh.m12526a(parcel, 9, this.f9254h);
        C2014wh.m12526a(parcel, 10, this.f9255i);
        C2014wh.m12526a(parcel, 11, this.f9256j);
        C2014wh.m12513a(parcel, iM12512a);
    }
}
