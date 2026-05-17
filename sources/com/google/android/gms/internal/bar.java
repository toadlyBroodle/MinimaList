package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.util.C1302f;
import com.google.firebase.crash.FirebaseCrash;

/* JADX INFO: loaded from: classes.dex */
abstract class bar implements Runnable {

    /* JADX INFO: renamed from: a */
    protected final FirebaseCrash.InterfaceC2215a f7695a;

    /* JADX INFO: renamed from: b */
    protected final Context f7696b;

    bar(Context context, FirebaseCrash.InterfaceC2215a interfaceC2215a) {
        this.f7695a = interfaceC2215a;
        this.f7696b = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: a */
    protected abstract String mo8785a();

    /* JADX INFO: renamed from: a */
    protected abstract void mo8786a(baw bawVar);

    @Override // java.lang.Runnable
    public void run() {
        try {
            baw bawVarMo12947a = this.f7695a.mo12947a();
            if (bawVarMo12947a != null && bawVarMo12947a.mo8791a()) {
                mo8786a(bawVarMo12947a);
            } else if (bawVarMo12947a != null) {
                Log.e("FirebaseCrash", "Firebase Crash Reporting not enabled");
            } else {
                Log.e("FirebaseCrash", "Crash api not available");
            }
        } catch (RemoteException | RuntimeException e) {
            C1302f.m7261a(this.f7696b, e);
            Log.e("FirebaseCrash", mo8785a(), e);
        }
    }
}
