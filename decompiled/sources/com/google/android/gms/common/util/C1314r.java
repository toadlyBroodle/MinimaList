package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.Log;
import java.io.File;

/* JADX INFO: renamed from: com.google.android.gms.common.util.r */
/* JADX INFO: loaded from: classes.dex */
public final class C1314r {
    @TargetApi(21)
    /* JADX INFO: renamed from: a */
    public static File m7290a(Context context) {
        return C1310n.m7284g() ? context.getNoBackupFilesDir() : m7291a(new File(context.getApplicationInfo().dataDir, "no_backup"));
    }

    /* JADX INFO: renamed from: a */
    private static synchronized File m7291a(File file) {
        if (!file.exists() && !file.mkdirs() && !file.exists()) {
            String strValueOf = String.valueOf(file.getPath());
            Log.w("SupportV4Utils", strValueOf.length() != 0 ? "Unable to create no-backup dir ".concat(strValueOf) : new String("Unable to create no-backup dir "));
            file = null;
        }
        return file;
    }
}
