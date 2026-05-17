package com.google.android.gms.internal;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.p047d.C0682a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class bxa {

    /* JADX INFO: renamed from: a */
    public static final bxa f9246a = new bxa();

    protected bxa() {
    }

    /* JADX INFO: renamed from: a */
    public static bwx m10378a(Context context, bzf bzfVar) {
        Date dateM10439a = bzfVar.m10439a();
        long time = dateM10439a != null ? dateM10439a.getTime() : -1L;
        String strM10441b = bzfVar.m10441b();
        int iM10442c = bzfVar.m10442c();
        Set<String> setM10443d = bzfVar.m10443d();
        List listUnmodifiableList = !setM10443d.isEmpty() ? Collections.unmodifiableList(new ArrayList(setM10443d)) : null;
        boolean zM10440a = bzfVar.m10440a(context);
        int iM10451l = bzfVar.m10451l();
        Location locationM10444e = bzfVar.m10444e();
        Bundle bundleM10438a = bzfVar.m10438a(AdMobAdapter.class);
        boolean zM10445f = bzfVar.m10445f();
        String strM10446g = bzfVar.m10446g();
        C0682a c0682aM10448i = bzfVar.m10448i();
        bzs bzsVar = c0682aM10448i != null ? new bzs(c0682aM10448i) : null;
        String strM11564a = null;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            String packageName = applicationContext.getPackageName();
            bxm.m10404a();
            strM11564a = C1657jb.m11564a(Thread.currentThread().getStackTrace(), packageName);
        }
        return new bwx(7, time, bundleM10438a, iM10442c, listUnmodifiableList, zM10440a, iM10451l, zM10445f, strM10446g, bzsVar, locationM10444e, strM10441b, bzfVar.m10450k(), bzfVar.m10452m(), Collections.unmodifiableList(new ArrayList(bzfVar.m10453n())), bzfVar.m10447h(), strM11564a, bzfVar.m10454o());
    }
}
