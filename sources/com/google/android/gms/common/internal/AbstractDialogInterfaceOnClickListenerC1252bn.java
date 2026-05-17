package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.common.api.internal.InterfaceC1117be;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.bn */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractDialogInterfaceOnClickListenerC1252bn implements DialogInterface.OnClickListener {
    /* JADX INFO: renamed from: a */
    public static AbstractDialogInterfaceOnClickListenerC1252bn m7172a(Activity activity, Intent intent, int i) {
        return new C1253bo(intent, activity, i);
    }

    /* JADX INFO: renamed from: a */
    public static AbstractDialogInterfaceOnClickListenerC1252bn m7173a(InterfaceC1117be interfaceC1117be, Intent intent, int i) {
        return new C1254bp(intent, interfaceC1117be, 2);
    }

    /* JADX INFO: renamed from: a */
    protected abstract void mo7174a();

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            mo7174a();
        } catch (ActivityNotFoundException e) {
            Log.e("DialogRedirect", "Failed to start resolution intent", e);
        } finally {
            dialogInterface.dismiss();
        }
    }
}
