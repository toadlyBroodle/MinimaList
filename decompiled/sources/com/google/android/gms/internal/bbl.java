package com.google.android.gms.internal;

import android.os.Handler;
import com.google.firebase.database.C2227c;
import com.google.firebase.database.C2268f;

/* JADX INFO: loaded from: classes.dex */
final class bbl extends bmv {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ bkl f7736a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ bbk f7737b;

    bbl(bbk bbkVar, bkl bklVar) {
        this.f7737b = bbkVar;
        this.f7736a = bklVar;
    }

    @Override // com.google.android.gms.internal.bmv
    /* JADX INFO: renamed from: a */
    public final void mo8814a(Throwable th) {
        String string;
        if (th instanceof OutOfMemoryError) {
            string = "Firebase Database encountered an OutOfMemoryError. You may need to reduce the amount of data you are syncing to the client (e.g. by using queries or syncing a deeper path). See https://firebase.google.com/docs/database/ios/structure-data#best_practices_for_data_structure and https://firebase.google.com/docs/database/android/retrieve-data#filtering_data";
        } else if (th instanceof C2227c) {
            string = "";
        } else {
            String strM13002c = C2268f.m13002c();
            string = new StringBuilder(String.valueOf(strM13002c).length() + 104).append("Uncaught exception in Firebase Database runloop (").append(strM13002c).append("). Please report to firebase-database-client@google.com").toString();
        }
        this.f7736a.m9539a(string, th);
        new Handler(this.f7737b.f7733a.getMainLooper()).post(new bbm(this, string, th));
        m9682b().shutdownNow();
    }
}
