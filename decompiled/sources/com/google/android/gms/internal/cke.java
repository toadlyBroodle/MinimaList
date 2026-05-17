package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.C0710au;
import com.google.android.gms.ads.internal.gmsg.InterfaceC0748aa;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class cke extends ckf implements InterfaceC0748aa<InterfaceC1758mv> {

    /* JADX INFO: renamed from: a */
    private final InterfaceC1758mv f10233a;

    /* JADX INFO: renamed from: b */
    private final Context f10234b;

    /* JADX INFO: renamed from: c */
    private final WindowManager f10235c;

    /* JADX INFO: renamed from: d */
    private final bzy f10236d;

    /* JADX INFO: renamed from: e */
    private DisplayMetrics f10237e;

    /* JADX INFO: renamed from: f */
    private float f10238f;

    /* JADX INFO: renamed from: g */
    private int f10239g;

    /* JADX INFO: renamed from: h */
    private int f10240h;

    /* JADX INFO: renamed from: i */
    private int f10241i;

    /* JADX INFO: renamed from: j */
    private int f10242j;

    /* JADX INFO: renamed from: k */
    private int f10243k;

    /* JADX INFO: renamed from: l */
    private int f10244l;

    /* JADX INFO: renamed from: m */
    private int f10245m;

    public cke(InterfaceC1758mv interfaceC1758mv, Context context, bzy bzyVar) {
        super(interfaceC1758mv);
        this.f10239g = -1;
        this.f10240h = -1;
        this.f10242j = -1;
        this.f10243k = -1;
        this.f10244l = -1;
        this.f10245m = -1;
        this.f10233a = interfaceC1758mv;
        this.f10234b = context;
        this.f10236d = bzyVar;
        this.f10235c = (WindowManager) context.getSystemService("window");
    }

    /* JADX INFO: renamed from: a */
    public final void m11058a(int i, int i2) {
        int i3 = this.f10234b instanceof Activity ? C0710au.m5569e().m11452c((Activity) this.f10234b)[0] : 0;
        if (this.f10233a.mo11831u() == null || !this.f10233a.mo11831u().m11930d()) {
            bxm.m10404a();
            this.f10244l = C1657jb.m11570b(this.f10234b, this.f10233a.getWidth());
            bxm.m10404a();
            this.f10245m = C1657jb.m11570b(this.f10234b, this.f10233a.getHeight());
        }
        m11062b(i, i2 - i3, this.f10244l, this.f10245m);
        this.f10233a.mo11833w().m11848a(i, i2);
    }

    @Override // com.google.android.gms.ads.internal.gmsg.InterfaceC0748aa
    public final /* synthetic */ void zza(InterfaceC1758mv interfaceC1758mv, Map map) {
        this.f10237e = new DisplayMetrics();
        Display defaultDisplay = this.f10235c.getDefaultDisplay();
        defaultDisplay.getMetrics(this.f10237e);
        this.f10238f = this.f10237e.density;
        this.f10241i = defaultDisplay.getRotation();
        bxm.m10404a();
        this.f10239g = C1657jb.m11571b(this.f10237e, this.f10237e.widthPixels);
        bxm.m10404a();
        this.f10240h = C1657jb.m11571b(this.f10237e, this.f10237e.heightPixels);
        Activity activityMo11755d = this.f10233a.mo11755d();
        if (activityMo11755d == null || activityMo11755d.getWindow() == null) {
            this.f10242j = this.f10239g;
            this.f10243k = this.f10240h;
        } else {
            C0710au.m5569e();
            int[] iArrM11404a = C1596gv.m11404a(activityMo11755d);
            bxm.m10404a();
            this.f10242j = C1657jb.m11571b(this.f10237e, iArrM11404a[0]);
            bxm.m10404a();
            this.f10243k = C1657jb.m11571b(this.f10237e, iArrM11404a[1]);
        }
        if (this.f10233a.mo11831u().m11930d()) {
            this.f10244l = this.f10239g;
            this.f10245m = this.f10240h;
        } else {
            this.f10233a.measure(0, 0);
        }
        m11060a(this.f10239g, this.f10240h, this.f10242j, this.f10243k, this.f10238f, this.f10241i);
        this.f10233a.mo5713a("onDeviceFeaturesReceived", new cka(new ckc().m11053b(this.f10236d.m10520a()).m11052a(this.f10236d.m10521b()).m11054c(this.f10236d.m10523d()).m11055d(this.f10236d.m10522c()).m11056e(true)).m11046a());
        int[] iArr = new int[2];
        this.f10233a.getLocationOnScreen(iArr);
        bxm.m10404a();
        int iM11570b = C1657jb.m11570b(this.f10234b, iArr[0]);
        bxm.m10404a();
        m11058a(iM11570b, C1657jb.m11570b(this.f10234b, iArr[1]));
        if (C1560fm.m11609a(2)) {
            C1560fm.m11614d("Dispatching Ready Event.");
        }
        m11063b(this.f10233a.mo11760k().f10855a);
    }
}
