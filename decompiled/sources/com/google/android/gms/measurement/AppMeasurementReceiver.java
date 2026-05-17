package com.google.android.gms.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.p007b.AbstractC0179f;
import com.google.android.gms.internal.aau;
import com.google.android.gms.internal.aaw;

/* JADX INFO: loaded from: classes.dex */
public final class AppMeasurementReceiver extends AbstractC0179f implements aaw {

    /* JADX INFO: renamed from: a */
    private aau f12764a;

    @Override // com.google.android.gms.internal.aaw
    /* JADX INFO: renamed from: a */
    public final BroadcastReceiver.PendingResult mo7452a() {
        return goAsync();
    }

    @Override // com.google.android.gms.internal.aaw
    /* JADX INFO: renamed from: a */
    public final void mo7453a(Context context, Intent intent) {
        m1376a_(context, intent);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.f12764a == null) {
            this.f12764a = new aau(this);
        }
        this.f12764a.m7451a(context, intent);
    }
}
