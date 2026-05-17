package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.provider.CalendarContract;
import android.text.TextUtils;
import com.google.android.gms.C0651a;
import com.google.android.gms.ads.internal.C0710au;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class cjr extends ckf {

    /* JADX INFO: renamed from: a */
    private final Map<String, String> f10184a;

    /* JADX INFO: renamed from: b */
    private final Context f10185b;

    /* JADX INFO: renamed from: c */
    private String f10186c;

    /* JADX INFO: renamed from: d */
    private long f10187d;

    /* JADX INFO: renamed from: e */
    private long f10188e;

    /* JADX INFO: renamed from: f */
    private String f10189f;

    /* JADX INFO: renamed from: g */
    private String f10190g;

    public cjr(InterfaceC1758mv interfaceC1758mv, Map<String, String> map) {
        super(interfaceC1758mv, "createCalendarEvent");
        this.f10184a = map;
        this.f10185b = interfaceC1758mv.mo11755d();
        this.f10186c = m11032d("description");
        this.f10189f = m11032d("summary");
        this.f10187d = m11033e("start_ticks");
        this.f10188e = m11033e("end_ticks");
        this.f10190g = m11032d("location");
    }

    /* JADX INFO: renamed from: d */
    private final String m11032d(String str) {
        return TextUtils.isEmpty(this.f10184a.get(str)) ? "" : this.f10184a.get(str);
    }

    /* JADX INFO: renamed from: e */
    private final long m11033e(String str) {
        String str2 = this.f10184a.get(str);
        if (str2 == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str2);
        } catch (NumberFormatException e) {
            return -1L;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m11034a() {
        if (this.f10185b == null) {
            m11061a("Activity context is not available.");
            return;
        }
        C0710au.m5569e();
        if (!C1596gv.m11424f(this.f10185b).m10523d()) {
            m11061a("This feature is not available on the device.");
            return;
        }
        C0710au.m5569e();
        AlertDialog.Builder builderM11420e = C1596gv.m11420e(this.f10185b);
        Resources resourcesM11320v = C0710au.m5573i().m11320v();
        builderM11420e.setTitle(resourcesM11320v != null ? resourcesM11320v.getString(C0651a.d.f4332s5) : "Create calendar event");
        builderM11420e.setMessage(resourcesM11320v != null ? resourcesM11320v.getString(C0651a.d.f4333s6) : "Allow Ad to create a calendar event?");
        builderM11420e.setPositiveButton(resourcesM11320v != null ? resourcesM11320v.getString(C0651a.d.f4330s3) : "Accept", new cjs(this));
        builderM11420e.setNegativeButton(resourcesM11320v != null ? resourcesM11320v.getString(C0651a.d.f4331s4) : "Decline", new cjt(this));
        builderM11420e.create().show();
    }

    @TargetApi(14)
    /* JADX INFO: renamed from: b */
    final Intent m11035b() {
        Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
        data.putExtra("title", this.f10186c);
        data.putExtra("eventLocation", this.f10190g);
        data.putExtra("description", this.f10189f);
        if (this.f10187d > -1) {
            data.putExtra("beginTime", this.f10187d);
        }
        if (this.f10188e > -1) {
            data.putExtra("endTime", this.f10188e);
        }
        data.setFlags(268435456);
        return data;
    }
}
