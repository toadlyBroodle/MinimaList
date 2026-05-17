package com.google.android.gms.internal;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.internal.C1221aj;

/* JADX INFO: loaded from: classes.dex */
public final class aau {

    /* JADX INFO: renamed from: a */
    private final aaw f6183a;

    public aau(aaw aawVar) {
        C1221aj.m7065a(aawVar);
        this.f6183a = aawVar;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m7450a(Context context) {
        ActivityInfo receiverInfo;
        C1221aj.m7065a(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 2)) == null) {
                return false;
            }
            return receiverInfo.enabled;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m7451a(Context context, Intent intent) {
        abd abdVarM7497a = abd.m7497a(context);
        aac aacVarM7540f = abdVarM7497a.m7540f();
        if (intent == null) {
            aacVarM7540f.m7401A().m7412a("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        aacVarM7540f.m7405E().m7413a("Local receiver got", action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            aacVarM7540f.m7405E().m7412a("Starting wakeful intent.");
            this.f6183a.mo7453a(context, className);
            return;
        }
        if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
            BroadcastReceiver.PendingResult pendingResultMo7452a = this.f6183a.mo7452a();
            String stringExtra = intent.getStringExtra("referrer");
            if (stringExtra == null) {
                aacVarM7540f.m7405E().m7412a("Install referrer extras are null");
                if (pendingResultMo7452a != null) {
                    pendingResultMo7452a.finish();
                    return;
                }
                return;
            }
            aacVarM7540f.m7403C().m7413a("Install referrer extras are", stringExtra);
            if (!stringExtra.contains("?")) {
                String strValueOf = String.valueOf(stringExtra);
                stringExtra = strValueOf.length() != 0 ? "?".concat(strValueOf) : new String("?");
            }
            Bundle bundleM7745a = abdVarM7497a.m7549o().m7745a(Uri.parse(stringExtra));
            if (bundleM7745a == null) {
                aacVarM7540f.m7405E().m7412a("No campaign defined in install referrer broadcast");
                if (pendingResultMo7452a != null) {
                    pendingResultMo7452a.finish();
                    return;
                }
                return;
            }
            long longExtra = 1000 * intent.getLongExtra("referrer_timestamp_seconds", 0L);
            if (longExtra == 0) {
                aacVarM7540f.m7401A().m7412a("Install referrer is missing timestamp");
            }
            abdVarM7497a.m7542h().m7479a(new aav(this, abdVarM7497a, longExtra, bundleM7745a, context, aacVarM7540f, pendingResultMo7452a));
        }
    }
}
