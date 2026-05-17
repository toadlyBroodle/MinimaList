package com.google.android.gms.internal;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.gms.common.internal.C1221aj;

/* JADX INFO: loaded from: classes.dex */
public final class aoz implements ajz {

    /* JADX INFO: renamed from: a */
    private Context f7008a;

    /* JADX INFO: renamed from: b */
    private DisplayMetrics f7009b = new DisplayMetrics();

    public aoz(Context context) {
        this.f7008a = context;
    }

    @Override // com.google.android.gms.internal.ajz
    /* JADX INFO: renamed from: b */
    public final arh<?> mo8076b(aii aiiVar, arh<?>... arhVarArr) {
        C1221aj.m7074b(arhVarArr != null);
        C1221aj.m7074b(arhVarArr.length == 0);
        ((WindowManager) this.f7008a.getSystemService("window")).getDefaultDisplay().getMetrics(this.f7009b);
        return new art(this.f7009b.widthPixels + "x" + this.f7009b.heightPixels);
    }
}
