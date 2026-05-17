package com.google.android.gms.internal;

import android.content.Context;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class bbd {

    /* JADX INFO: renamed from: a */
    public static final AbstractC2050xq<Boolean> f7710a = AbstractC2050xq.m12579a(0, "crash:enabled", (Boolean) true);

    /* JADX INFO: renamed from: b */
    private static AbstractC2050xq<String> f7711b = new C2055xv(0, "crash:gateway_url", "https://mobilecrashreporting.googleapis.com/v1/crashes:batchCreate?key=");

    /* JADX INFO: renamed from: c */
    private static AbstractC2050xq<Integer> f7712c = AbstractC2050xq.m12580a(0, "crash:log_buffer_capacity", 100);

    /* JADX INFO: renamed from: d */
    private static AbstractC2050xq<Integer> f7713d = AbstractC2050xq.m12580a(0, "crash:log_buffer_max_total_size", 32768);

    /* JADX INFO: renamed from: e */
    private static AbstractC2050xq<Integer> f7714e = AbstractC2050xq.m12580a(0, "crash:crash_backlog_capacity", 5);

    /* JADX INFO: renamed from: f */
    private static AbstractC2050xq<Long> f7715f = AbstractC2050xq.m12581a(0, "crash:crash_backlog_max_age", 604800000L);

    /* JADX INFO: renamed from: g */
    private static AbstractC2050xq<Long> f7716g = AbstractC2050xq.m12581a(0, "crash:starting_backoff", TimeUnit.SECONDS.toMillis(1));

    /* JADX INFO: renamed from: h */
    private static AbstractC2050xq<Long> f7717h = AbstractC2050xq.m12581a(0, "crash:backoff_limit", TimeUnit.MINUTES.toMillis(60));

    /* JADX INFO: renamed from: i */
    private static AbstractC2050xq<Integer> f7718i = AbstractC2050xq.m12580a(0, "crash:retry_num_attempts", 12);

    /* JADX INFO: renamed from: j */
    private static AbstractC2050xq<Integer> f7719j = AbstractC2050xq.m12580a(0, "crash:batch_size", 5);

    /* JADX INFO: renamed from: k */
    private static AbstractC2050xq<Long> f7720k = AbstractC2050xq.m12581a(0, "crash:batch_throttle", TimeUnit.MINUTES.toMillis(5));

    /* JADX INFO: renamed from: l */
    private static AbstractC2050xq<Integer> f7721l = AbstractC2050xq.m12580a(0, "crash:frame_depth", 60);

    /* JADX INFO: renamed from: m */
    private static AbstractC2050xq<Integer> f7722m = AbstractC2050xq.m12580a(0, "crash:receiver_delay", 100);

    /* JADX INFO: renamed from: n */
    private static AbstractC2050xq<Integer> f7723n = AbstractC2050xq.m12580a(0, "crash:thread_idle_timeout", 10);

    /* JADX INFO: renamed from: a */
    public static final void m8799a(Context context) {
        C2063yc.m12593a();
        C2063yc.m12594b().m12592a(context);
    }
}
