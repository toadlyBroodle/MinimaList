package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.C0710au;

/* JADX INFO: renamed from: com.google.android.gms.internal.l */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C1709l {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static boolean m11666b(Context context, boolean z) {
        if (!z) {
            return true;
        }
        C0710au.m5569e();
        int iM11436n = C1596gv.m11436n(context);
        if (iM11436n == 0) {
            return false;
        }
        C0710au.m5569e();
        return iM11436n <= C1596gv.m11437o(context);
    }
}
