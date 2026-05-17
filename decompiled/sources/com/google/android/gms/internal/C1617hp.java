package com.google.android.gms.internal;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.google.android.gms.ads.internal.C0710au;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.hp */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C1617hp {

    /* JADX INFO: renamed from: a */
    private final Context f10736a;

    /* JADX INFO: renamed from: b */
    private String f10737b;

    /* JADX INFO: renamed from: c */
    private String f10738c;

    /* JADX INFO: renamed from: d */
    private String f10739d;

    /* JADX INFO: renamed from: e */
    private String f10740e;

    /* JADX INFO: renamed from: f */
    private final float f10741f;

    /* JADX INFO: renamed from: g */
    private float f10742g;

    /* JADX INFO: renamed from: h */
    private float f10743h;

    /* JADX INFO: renamed from: i */
    private float f10744i;

    /* JADX INFO: renamed from: j */
    private int f10745j;

    public C1617hp(Context context) {
        this.f10745j = 0;
        this.f10736a = context;
        this.f10741f = context.getResources().getDisplayMetrics().density;
    }

    public C1617hp(Context context, String str) {
        this(context);
        this.f10737b = str;
    }

    /* JADX INFO: renamed from: a */
    private static int m11489a(List<String> list, String str, boolean z) {
        if (!z) {
            return -1;
        }
        list.add(str);
        return list.size() - 1;
    }

    /* JADX INFO: renamed from: a */
    private final void m11490a(int i, float f, float f2) {
        if (i == 0) {
            this.f10745j = 0;
            this.f10742g = f;
            this.f10743h = f2;
            this.f10744i = f2;
            return;
        }
        if (this.f10745j != -1) {
            if (i != 2) {
                if (i == 1 && this.f10745j == 4) {
                    m11501a();
                    return;
                }
                return;
            }
            if (f2 > this.f10743h) {
                this.f10743h = f2;
            } else if (f2 < this.f10744i) {
                this.f10744i = f2;
            }
            if (this.f10743h - this.f10744i > 30.0f * this.f10741f) {
                this.f10745j = -1;
                return;
            }
            if (this.f10745j == 0 || this.f10745j == 2) {
                if (f - this.f10742g >= 50.0f * this.f10741f) {
                    this.f10742g = f;
                    this.f10745j++;
                }
            } else if ((this.f10745j == 1 || this.f10745j == 3) && f - this.f10742g <= (-50.0f) * this.f10741f) {
                this.f10742g = f;
                this.f10745j++;
            }
            if (this.f10745j == 1 || this.f10745j == 3) {
                if (f > this.f10742g) {
                    this.f10742g = f;
                }
            } else {
                if (this.f10745j != 2 || f >= this.f10742g) {
                    return;
                }
                this.f10742g = f;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x009d  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m11492b() {
        String strTrim;
        if (!(this.f10736a instanceof Activity)) {
            C1560fm.m11614d("Can not create dialog without Activity Context");
            return;
        }
        String str = this.f10737b;
        if (!TextUtils.isEmpty(str)) {
            Uri uriBuild = new Uri.Builder().encodedQuery(str.replaceAll("\\+", "%20")).build();
            StringBuilder sb = new StringBuilder();
            C0710au.m5569e();
            Map<String, String> mapM11385a = C1596gv.m11385a(uriBuild);
            for (String str2 : mapM11385a.keySet()) {
                sb.append(str2).append(" = ").append(mapM11385a.get(str2)).append("\n\n");
            }
            strTrim = sb.toString().trim();
            if (TextUtils.isEmpty(strTrim)) {
                strTrim = "No debug information";
            }
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f10736a);
        builder.setMessage(strTrim);
        builder.setTitle("Ad Information");
        builder.setPositiveButton("Share", new DialogInterfaceOnClickListenerC1619hr(this, strTrim));
        builder.setNegativeButton("Close", new DialogInterfaceOnClickListenerC1620hs(this));
        builder.create().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public final void m11494c() {
        C1560fm.m11610b("Debug mode [Creative Preview] selected.");
        C1590gp.m11370a(new RunnableC1621ht(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public final void m11497d() {
        C1560fm.m11610b("Debug mode [Troubleshooting] selected.");
        C1590gp.m11370a(new RunnableC1622hu(this));
    }

    /* JADX INFO: renamed from: a */
    public final void m11501a() {
        if (!((Boolean) bxm.m10409f().m10546a(can.f9585cz)).booleanValue()) {
            if (!((Boolean) bxm.m10409f().m10546a(can.f9584cy)).booleanValue()) {
                m11492b();
                return;
            }
        }
        if (!(this.f10736a instanceof Activity)) {
            C1560fm.m11614d("Can not create dialog without Activity Context");
            return;
        }
        String str = !TextUtils.isEmpty(C0710au.m5578n().m11514a()) ? "Creative Preview (Enabled)" : "Creative Preview";
        String str2 = C0710au.m5578n().m11518b() ? "Troubleshooting (Enabled)" : "Troubleshooting";
        ArrayList arrayList = new ArrayList();
        int iM11489a = m11489a((List<String>) arrayList, "Ad Information", true);
        int iM11489a2 = m11489a(arrayList, str, ((Boolean) bxm.m10409f().m10546a(can.f9584cy)).booleanValue());
        int iM11489a3 = m11489a(arrayList, str2, ((Boolean) bxm.m10409f().m10546a(can.f9585cz)).booleanValue());
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f10736a, C0710au.m5571g().mo11480f());
        builder.setTitle("Select a Debug Mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new DialogInterfaceOnClickListenerC1618hq(this, iM11489a, iM11489a2, iM11489a3));
        builder.create().show();
    }

    /* JADX INFO: renamed from: a */
    public final void m11502a(MotionEvent motionEvent) {
        int historySize = motionEvent.getHistorySize();
        for (int i = 0; i < historySize; i++) {
            m11490a(motionEvent.getActionMasked(), motionEvent.getHistoricalX(0, i), motionEvent.getHistoricalY(0, i));
        }
        m11490a(motionEvent.getActionMasked(), motionEvent.getX(), motionEvent.getY());
    }

    /* JADX INFO: renamed from: a */
    public final void m11503a(String str) {
        this.f10738c = str;
    }

    /* JADX INFO: renamed from: b */
    public final void m11504b(String str) {
        this.f10739d = str;
    }

    /* JADX INFO: renamed from: c */
    public final void m11505c(String str) {
        this.f10737b = str;
    }

    /* JADX INFO: renamed from: d */
    public final void m11506d(String str) {
        this.f10740e = str;
    }
}
