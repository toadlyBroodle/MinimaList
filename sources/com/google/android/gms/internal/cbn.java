package com.google.android.gms.internal;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class cbn extends ccv {

    /* JADX INFO: renamed from: a */
    private static final int f9713a = Color.rgb(12, 174, 206);

    /* JADX INFO: renamed from: b */
    private static final int f9714b;

    /* JADX INFO: renamed from: c */
    private static int f9715c;

    /* JADX INFO: renamed from: d */
    private static int f9716d;

    /* JADX INFO: renamed from: e */
    private final String f9717e;

    /* JADX INFO: renamed from: f */
    private final List<cbp> f9718f = new ArrayList();

    /* JADX INFO: renamed from: g */
    private final List<ccy> f9719g = new ArrayList();

    /* JADX INFO: renamed from: h */
    private final int f9720h;

    /* JADX INFO: renamed from: i */
    private final int f9721i;

    /* JADX INFO: renamed from: j */
    private final int f9722j;

    /* JADX INFO: renamed from: k */
    private final int f9723k;

    /* JADX INFO: renamed from: l */
    private final int f9724l;

    /* JADX INFO: renamed from: m */
    private final boolean f9725m;

    static {
        int iRgb = Color.rgb(204, 204, 204);
        f9714b = iRgb;
        f9715c = iRgb;
        f9716d = f9713a;
    }

    public cbn(String str, List<cbp> list, Integer num, Integer num2, Integer num3, int i, int i2, boolean z) {
        this.f9717e = str;
        if (list != null) {
            int i3 = 0;
            while (true) {
                int i4 = i3;
                if (i4 >= list.size()) {
                    break;
                }
                cbp cbpVar = list.get(i4);
                this.f9718f.add(cbpVar);
                this.f9719g.add(cbpVar);
                i3 = i4 + 1;
            }
        }
        this.f9720h = num != null ? num.intValue() : f9715c;
        this.f9721i = num2 != null ? num2.intValue() : f9716d;
        this.f9722j = num3 != null ? num3.intValue() : 12;
        this.f9723k = i;
        this.f9724l = i2;
        this.f9725m = z;
    }

    @Override // com.google.android.gms.internal.ccu
    /* JADX INFO: renamed from: a */
    public final String mo10595a() {
        return this.f9717e;
    }

    @Override // com.google.android.gms.internal.ccu
    /* JADX INFO: renamed from: b */
    public final List<ccy> mo10596b() {
        return this.f9719g;
    }

    /* JADX INFO: renamed from: c */
    public final List<cbp> m10597c() {
        return this.f9718f;
    }

    /* JADX INFO: renamed from: d */
    public final int m10598d() {
        return this.f9720h;
    }

    /* JADX INFO: renamed from: e */
    public final int m10599e() {
        return this.f9721i;
    }

    /* JADX INFO: renamed from: f */
    public final int m10600f() {
        return this.f9722j;
    }

    /* JADX INFO: renamed from: g */
    public final int m10601g() {
        return this.f9723k;
    }

    /* JADX INFO: renamed from: h */
    public final int m10602h() {
        return this.f9724l;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m10603i() {
        return this.f9725m;
    }
}
