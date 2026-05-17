package com.google.android.gms.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.internal.C1221aj;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public final class agv {

    /* JADX INFO: renamed from: a */
    private final Context f6747a;

    /* JADX INFO: renamed from: b */
    private final Random f6748b;

    /* JADX INFO: renamed from: c */
    private final String f6749c;

    public agv(Context context, String str) {
        this(context, str, new Random());
    }

    private agv(Context context, String str, Random random) {
        this.f6747a = (Context) C1221aj.m7065a(context);
        this.f6749c = (String) C1221aj.m7065a(str);
        this.f6748b = random;
    }

    /* JADX INFO: renamed from: a */
    private final long m7878a(long j, long j2) {
        long jMax = Math.max(0L, m7879g().getLong("FORBIDDEN_COUNT", 0L));
        return (long) ((((long) ((jMax / ((Math.max(0L, r0.getLong("SUCCESSFUL_COUNT", 0L)) + jMax) + 1)) * (j2 - j))) + j) * this.f6748b.nextFloat());
    }

    /* JADX INFO: renamed from: g */
    private final SharedPreferences m7879g() {
        Context context = this.f6747a;
        String strValueOf = String.valueOf("v5_gtmContainerRefreshPolicy_");
        String strValueOf2 = String.valueOf(this.f6749c);
        return context.getSharedPreferences(strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf), 0);
    }

    /* JADX INFO: renamed from: a */
    public final long m7880a() {
        return 43200000 + m7878a(7200000L, 259200000L);
    }

    /* JADX INFO: renamed from: b */
    public final long m7881b() {
        return 3600000 + m7878a(600000L, 86400000L);
    }

    /* JADX INFO: renamed from: c */
    public final long m7882c() {
        if (Math.max(0L, m7879g().getLong("FORBIDDEN_COUNT", 0L)) == 0) {
            return 0L;
        }
        return m7878a(10000L, 600000L) + 10000;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m7883d() {
        return Math.max(0L, m7879g().getLong("FORBIDDEN_COUNT", 0L)) > 0;
    }

    @SuppressLint({"CommitPrefEdits"})
    /* JADX INFO: renamed from: e */
    public final void m7884e() {
        SharedPreferences sharedPreferencesM7879g = m7879g();
        long j = sharedPreferencesM7879g.getLong("FORBIDDEN_COUNT", 0L);
        long j2 = sharedPreferencesM7879g.getLong("SUCCESSFUL_COUNT", 0L);
        SharedPreferences.Editor editorEdit = sharedPreferencesM7879g.edit();
        long jMin = j == 0 ? 3L : Math.min(10L, 1 + j);
        long jMax = Math.max(0L, Math.min(j2, 10 - jMin));
        editorEdit.putLong("FORBIDDEN_COUNT", jMin);
        editorEdit.putLong("SUCCESSFUL_COUNT", jMax);
        editorEdit.apply();
    }

    @SuppressLint({"CommitPrefEdits"})
    /* JADX INFO: renamed from: f */
    public final void m7885f() {
        SharedPreferences sharedPreferencesM7879g = m7879g();
        long j = sharedPreferencesM7879g.getLong("SUCCESSFUL_COUNT", 0L);
        long j2 = sharedPreferencesM7879g.getLong("FORBIDDEN_COUNT", 0L);
        long jMin = Math.min(10L, j + 1);
        long jMax = Math.max(0L, Math.min(j2, 10 - jMin));
        SharedPreferences.Editor editorEdit = sharedPreferencesM7879g.edit();
        editorEdit.putLong("SUCCESSFUL_COUNT", jMin);
        editorEdit.putLong("FORBIDDEN_COUNT", jMax);
        editorEdit.apply();
    }
}
