package com.google.android.gms.common.util;

import android.os.Process;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* JADX INFO: renamed from: com.google.android.gms.common.util.p */
/* JADX INFO: loaded from: classes.dex */
public final class C1312p {

    /* JADX INFO: renamed from: a */
    private static String f6046a = null;

    /* JADX INFO: renamed from: b */
    private static final int f6047b = Process.myPid();

    /* JADX INFO: renamed from: a */
    public static String m7287a() {
        if (f6046a == null) {
            f6046a = m7288a(f6047b);
        }
        return f6046a;
    }

    /* JADX INFO: renamed from: a */
    private static String m7288a(int i) throws Throwable {
        BufferedReader bufferedReader;
        Throwable th;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads;
        String strTrim = null;
        if (i > 0) {
            try {
                threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                try {
                    bufferedReader = new BufferedReader(new FileReader(new StringBuilder(25).append("/proc/").append(i).append("/cmdline").toString()));
                } finally {
                }
            } catch (IOException e) {
                bufferedReader = null;
            } catch (Throwable th2) {
                bufferedReader = null;
                th = th2;
            }
            try {
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                strTrim = bufferedReader.readLine().trim();
                C1308l.m7275a(bufferedReader);
            } catch (IOException e2) {
                C1308l.m7275a(bufferedReader);
            } catch (Throwable th3) {
                th = th3;
                C1308l.m7275a(bufferedReader);
                throw th;
            }
        }
        return strTrim;
    }
}
