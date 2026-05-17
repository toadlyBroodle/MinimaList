package com.google.android.gms.internal;

/* JADX INFO: renamed from: com.google.android.gms.internal.ra */
/* JADX INFO: loaded from: classes.dex */
public final class C1872ra {

    /* JADX INFO: renamed from: A */
    public static C1873rb<Long> f11400A;

    /* JADX INFO: renamed from: B */
    public static C1873rb<Long> f11401B;

    /* JADX INFO: renamed from: C */
    public static C1873rb<Long> f11402C;

    /* JADX INFO: renamed from: D */
    public static C1873rb<Long> f11403D;

    /* JADX INFO: renamed from: E */
    public static C1873rb<Long> f11404E;

    /* JADX INFO: renamed from: L */
    private static C1873rb<Integer> f11411L;

    /* JADX INFO: renamed from: M */
    private static C1873rb<Long> f11412M;

    /* JADX INFO: renamed from: N */
    private static C1873rb<String> f11413N;

    /* JADX INFO: renamed from: O */
    private static C1873rb<Integer> f11414O;

    /* JADX INFO: renamed from: P */
    private static C1873rb<Long> f11415P;

    /* JADX INFO: renamed from: Q */
    private static C1873rb<Long> f11416Q;

    /* JADX INFO: renamed from: q */
    public static C1873rb<String> f11433q;

    /* JADX INFO: renamed from: r */
    public static C1873rb<Integer> f11434r;

    /* JADX INFO: renamed from: s */
    public static C1873rb<Integer> f11435s;

    /* JADX INFO: renamed from: t */
    public static C1873rb<Integer> f11436t;

    /* JADX INFO: renamed from: u */
    public static C1873rb<String> f11437u;

    /* JADX INFO: renamed from: v */
    public static C1873rb<Integer> f11438v;

    /* JADX INFO: renamed from: w */
    public static C1873rb<Integer> f11439w;

    /* JADX INFO: renamed from: x */
    public static C1873rb<Integer> f11440x;

    /* JADX INFO: renamed from: y */
    public static C1873rb<Long> f11441y;

    /* JADX INFO: renamed from: z */
    public static C1873rb<Boolean> f11442z;

    /* JADX INFO: renamed from: F */
    private static C1873rb<Boolean> f11405F = C1873rb.m12203a("analytics.service_enabled", false, false);

    /* JADX INFO: renamed from: a */
    public static C1873rb<Boolean> f11417a = C1873rb.m12203a("analytics.service_client_enabled", true, true);

    /* JADX INFO: renamed from: b */
    public static C1873rb<String> f11418b = C1873rb.m12202a("analytics.log_tag", "GAv4", "GAv4-SVC");

    /* JADX INFO: renamed from: G */
    private static C1873rb<Long> f11406G = C1873rb.m12201a("analytics.max_tokens", 60L, 60L);

    /* JADX INFO: renamed from: H */
    private static C1873rb<Float> f11407H = C1873rb.m12199a("analytics.tokens_per_sec", 0.5f, 0.5f);

    /* JADX INFO: renamed from: c */
    public static C1873rb<Integer> f11419c = C1873rb.m12200a("analytics.max_stored_hits", 2000, 20000);

    /* JADX INFO: renamed from: I */
    private static C1873rb<Integer> f11408I = C1873rb.m12200a("analytics.max_stored_hits_per_app", 2000, 2000);

    /* JADX INFO: renamed from: d */
    public static C1873rb<Integer> f11420d = C1873rb.m12200a("analytics.max_stored_properties_per_app", 100, 100);

    /* JADX INFO: renamed from: e */
    public static C1873rb<Long> f11421e = C1873rb.m12201a("analytics.local_dispatch_millis", 1800000L, 120000L);

    /* JADX INFO: renamed from: f */
    public static C1873rb<Long> f11422f = C1873rb.m12201a("analytics.initial_local_dispatch_millis", 5000L, 5000L);

    /* JADX INFO: renamed from: J */
    private static C1873rb<Long> f11409J = C1873rb.m12201a("analytics.min_local_dispatch_millis", 120000L, 120000L);

    /* JADX INFO: renamed from: K */
    private static C1873rb<Long> f11410K = C1873rb.m12201a("analytics.max_local_dispatch_millis", 7200000L, 7200000L);

    /* JADX INFO: renamed from: g */
    public static C1873rb<Long> f11423g = C1873rb.m12201a("analytics.dispatch_alarm_millis", 7200000L, 7200000L);

    /* JADX INFO: renamed from: h */
    public static C1873rb<Long> f11424h = C1873rb.m12201a("analytics.max_dispatch_alarm_millis", 32400000L, 32400000L);

    /* JADX INFO: renamed from: i */
    public static C1873rb<Integer> f11425i = C1873rb.m12200a("analytics.max_hits_per_dispatch", 20, 20);

    /* JADX INFO: renamed from: j */
    public static C1873rb<Integer> f11426j = C1873rb.m12200a("analytics.max_hits_per_batch", 20, 20);

    /* JADX INFO: renamed from: k */
    public static C1873rb<String> f11427k = C1873rb.m12202a("analytics.insecure_host", "http://www.google-analytics.com", "http://www.google-analytics.com");

    /* JADX INFO: renamed from: l */
    public static C1873rb<String> f11428l = C1873rb.m12202a("analytics.secure_host", "https://ssl.google-analytics.com", "https://ssl.google-analytics.com");

    /* JADX INFO: renamed from: m */
    public static C1873rb<String> f11429m = C1873rb.m12202a("analytics.simple_endpoint", "/collect", "/collect");

    /* JADX INFO: renamed from: n */
    public static C1873rb<String> f11430n = C1873rb.m12202a("analytics.batching_endpoint", "/batch", "/batch");

    /* JADX INFO: renamed from: o */
    public static C1873rb<Integer> f11431o = C1873rb.m12200a("analytics.max_get_length", 2036, 2036);

    /* JADX INFO: renamed from: p */
    public static C1873rb<String> f11432p = C1873rb.m12202a("analytics.batching_strategy.k", EnumC1852qh.BATCH_BY_COUNT.name(), EnumC1852qh.BATCH_BY_COUNT.name());

    static {
        String strName = EnumC1858qn.GZIP.name();
        f11433q = C1873rb.m12202a("analytics.compression_strategy.k", strName, strName);
        f11411L = C1873rb.m12200a("analytics.max_hits_per_request.k", 20, 20);
        f11434r = C1873rb.m12200a("analytics.max_hit_length.k", 8192, 8192);
        f11435s = C1873rb.m12200a("analytics.max_post_length.k", 8192, 8192);
        f11436t = C1873rb.m12200a("analytics.max_batch_post_length", 8192, 8192);
        f11437u = C1873rb.m12202a("analytics.fallback_responses.k", "404,502", "404,502");
        f11438v = C1873rb.m12200a("analytics.batch_retry_interval.seconds.k", 3600, 3600);
        f11412M = C1873rb.m12201a("analytics.service_monitor_interval", 86400000L, 86400000L);
        f11439w = C1873rb.m12200a("analytics.http_connection.connect_timeout_millis", 60000, 60000);
        f11440x = C1873rb.m12200a("analytics.http_connection.read_timeout_millis", 61000, 61000);
        f11441y = C1873rb.m12201a("analytics.campaigns.time_limit", 86400000L, 86400000L);
        f11413N = C1873rb.m12202a("analytics.first_party_experiment_id", "", "");
        f11414O = C1873rb.m12200a("analytics.first_party_experiment_variant", 0, 0);
        f11442z = C1873rb.m12203a("analytics.test.disable_receiver", false, false);
        f11400A = C1873rb.m12201a("analytics.service_client.idle_disconnect_millis", 10000L, 10000L);
        f11401B = C1873rb.m12201a("analytics.service_client.connect_timeout_millis", 5000L, 5000L);
        f11415P = C1873rb.m12201a("analytics.service_client.second_connect_delay_millis", 5000L, 5000L);
        f11416Q = C1873rb.m12201a("analytics.service_client.unexpected_reconnect_millis", 60000L, 60000L);
        f11402C = C1873rb.m12201a("analytics.service_client.reconnect_throttle_millis", 1800000L, 1800000L);
        f11403D = C1873rb.m12201a("analytics.monitoring.sample_period_millis", 86400000L, 86400000L);
        f11404E = C1873rb.m12201a("analytics.initialization_warning_threshold", 5000L, 5000L);
    }
}
