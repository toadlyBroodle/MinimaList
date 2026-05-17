package com.google.android.gms.internal;

import android.provider.Settings;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final class ayz extends bnq {
    public ayz(arz arzVar, String str, String str2, C1937tl c1937tl, int i, int i2) {
        super(arzVar, str, str2, c1937tl, i, 49);
    }

    @Override // com.google.android.gms.internal.bnq
    /* JADX INFO: renamed from: a */
    protected final void mo8698a() throws InvocationTargetException {
        this.f8492b.f11549F = 2;
        try {
            this.f8492b.f11549F = Integer.valueOf(((Boolean) this.f8493c.invoke(null, this.f8491a.m8247a())).booleanValue() ? 1 : 0);
        } catch (InvocationTargetException e) {
            if (!(e.getTargetException() instanceof Settings.SettingNotFoundException)) {
                throw e;
            }
        }
    }
}
