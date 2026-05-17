package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class bus {

    /* JADX INFO: renamed from: a */
    private final Object f9061a = new Object();

    /* JADX INFO: renamed from: b */
    private but f9062b = null;

    /* JADX INFO: renamed from: c */
    private boolean f9063c = false;

    /* JADX INFO: renamed from: a */
    public final Activity m10286a() {
        Activity activityM10296a;
        synchronized (this.f9061a) {
            activityM10296a = this.f9062b != null ? this.f9062b.m10296a() : null;
        }
        return activityM10296a;
    }

    /* JADX INFO: renamed from: a */
    public final void m10287a(Context context) {
        synchronized (this.f9061a) {
            if (!this.f9063c) {
                if (!((Boolean) bxm.m10409f().m10546a(can.f9474au)).booleanValue()) {
                    return;
                }
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    applicationContext = context;
                }
                Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                if (application == null) {
                    C1560fm.m11615e("Can not cast Context to Application");
                    return;
                }
                if (this.f9062b == null) {
                    this.f9062b = new but();
                }
                this.f9062b.m10297a(application, context);
                this.f9063c = true;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m10288a(buv buvVar) {
        synchronized (this.f9061a) {
            if (((Boolean) bxm.m10409f().m10546a(can.f9474au)).booleanValue()) {
                if (this.f9062b == null) {
                    this.f9062b = new but();
                }
                this.f9062b.m10298a(buvVar);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final Context m10289b() {
        Context contextM10299b;
        synchronized (this.f9061a) {
            contextM10299b = this.f9062b != null ? this.f9062b.m10299b() : null;
        }
        return contextM10299b;
    }
}
