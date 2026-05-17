package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.AbstractBinderC2059xz;
import com.google.android.gms.p043a.BinderC0654c;
import com.google.android.gms.p043a.InterfaceC0652a;

/* JADX INFO: loaded from: classes.dex */
@DynamiteApi
public class FlagProviderImpl extends AbstractBinderC2059xz {

    /* JADX INFO: renamed from: a */
    private boolean f6082a = false;

    /* JADX INFO: renamed from: b */
    private SharedPreferences f6083b;

    @Override // com.google.android.gms.internal.InterfaceC2058xy
    public boolean getBooleanFlagValue(String str, boolean z, int i) {
        return !this.f6082a ? z : C1340b.m7346a(this.f6083b, str, Boolean.valueOf(z)).booleanValue();
    }

    @Override // com.google.android.gms.internal.InterfaceC2058xy
    public int getIntFlagValue(String str, int i, int i2) {
        return !this.f6082a ? i : C1342d.m7347a(this.f6083b, str, Integer.valueOf(i)).intValue();
    }

    @Override // com.google.android.gms.internal.InterfaceC2058xy
    public long getLongFlagValue(String str, long j, int i) {
        return !this.f6082a ? j : C1344f.m7348a(this.f6083b, str, Long.valueOf(j)).longValue();
    }

    @Override // com.google.android.gms.internal.InterfaceC2058xy
    public String getStringFlagValue(String str, String str2, int i) {
        return !this.f6082a ? str2 : C1346h.m7349a(this.f6083b, str, str2);
    }

    @Override // com.google.android.gms.internal.InterfaceC2058xy
    public void init(InterfaceC0652a interfaceC0652a) {
        Context context = (Context) BinderC0654c.m5330a(interfaceC0652a);
        if (this.f6082a) {
            return;
        }
        try {
            this.f6083b = C1348j.m7350a(context.createPackageContext("com.google.android.gms", 0));
            this.f6082a = true;
        } catch (PackageManager.NameNotFoundException e) {
        } catch (Exception e2) {
            String strValueOf = String.valueOf(e2.getMessage());
            Log.w("FlagProviderImpl", strValueOf.length() != 0 ? "Could not retrieve sdk flags, continuing with defaults: ".concat(strValueOf) : new String("Could not retrieve sdk flags, continuing with defaults: "));
        }
    }
}
