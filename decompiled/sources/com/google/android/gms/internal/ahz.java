package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
final class ahz implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ ahy f6814a;

    ahz(ahy ahyVar) {
        this.f6814a = ahyVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        String packageName = this.f6814a.f6810a.getPackageName();
        Intent launchIntentForPackage = this.f6814a.f6810a.getPackageManager().getLaunchIntentForPackage(packageName);
        if (launchIntentForPackage == null) {
            String strValueOf = String.valueOf(packageName);
            ahs.m7944b(strValueOf.length() != 0 ? "No launch activity found for package name: ".concat(strValueOf) : new String("No launch activity found for package name: "));
        } else {
            String strValueOf2 = String.valueOf(packageName);
            ahs.m7946c(strValueOf2.length() != 0 ? "Invoke the launch activity for package name: ".concat(strValueOf2) : new String("Invoke the launch activity for package name: "));
            this.f6814a.f6810a.startActivity(launchIntentForPackage);
        }
    }
}
