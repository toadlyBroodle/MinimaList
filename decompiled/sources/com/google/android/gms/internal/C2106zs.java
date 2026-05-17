package com.google.android.gms.internal;

/* JADX INFO: renamed from: com.google.android.gms.internal.zs */
/* JADX INFO: loaded from: classes.dex */
public final class C2106zs {

    /* JADX INFO: renamed from: J */
    private static C2107zt<Boolean> f12703J = C2107zt.m12776a("measurement.service_enabled", true, true);

    /* JADX INFO: renamed from: K */
    private static C2107zt<Boolean> f12704K = C2107zt.m12776a("measurement.service_client_enabled", true, true);

    /* JADX INFO: renamed from: L */
    private static C2107zt<Boolean> f12705L = C2107zt.m12776a("measurement.log_third_party_store_events_enabled", false, false);

    /* JADX INFO: renamed from: M */
    private static C2107zt<Boolean> f12706M = C2107zt.m12776a("measurement.log_installs_enabled", false, false);

    /* JADX INFO: renamed from: N */
    private static C2107zt<Boolean> f12707N = C2107zt.m12776a("measurement.log_upgrades_enabled", false, false);

    /* JADX INFO: renamed from: O */
    private static C2107zt<Boolean> f12708O = C2107zt.m12776a("measurement.log_androidId_enabled", false, false);

    /* JADX INFO: renamed from: a */
    public static C2107zt<Boolean> f12709a = C2107zt.m12776a("measurement.upload_dsid_enabled", false, false);

    /* JADX INFO: renamed from: b */
    public static C2107zt<Boolean> f12710b = C2107zt.m12776a("measurement.event_sampling_enabled", false, false);

    /* JADX INFO: renamed from: c */
    public static C2107zt<String> f12711c = C2107zt.m12775a("measurement.log_tag", "FA", "FA-SVC");

    /* JADX INFO: renamed from: d */
    public static C2107zt<Long> f12712d = C2107zt.m12774a("measurement.ad_id_cache_time", 10000L, 10000L);

    /* JADX INFO: renamed from: e */
    public static C2107zt<Long> f12713e = C2107zt.m12774a("measurement.monitoring.sample_period_millis", 86400000L, 86400000L);

    /* JADX INFO: renamed from: f */
    public static C2107zt<Long> f12714f = C2107zt.m12774a("measurement.config.cache_time", 86400000L, 3600000L);

    /* JADX INFO: renamed from: g */
    public static C2107zt<String> f12715g = C2107zt.m12775a("measurement.config.url_scheme", "https", "https");

    /* JADX INFO: renamed from: h */
    public static C2107zt<String> f12716h = C2107zt.m12775a("measurement.config.url_authority", "app-measurement.com", "app-measurement.com");

    /* JADX INFO: renamed from: i */
    public static C2107zt<Integer> f12717i = C2107zt.m12773a("measurement.upload.max_bundles", 100, 100);

    /* JADX INFO: renamed from: j */
    public static C2107zt<Integer> f12718j = C2107zt.m12773a("measurement.upload.max_batch_size", 65536, 65536);

    /* JADX INFO: renamed from: k */
    public static C2107zt<Integer> f12719k = C2107zt.m12773a("measurement.upload.max_bundle_size", 65536, 65536);

    /* JADX INFO: renamed from: l */
    public static C2107zt<Integer> f12720l = C2107zt.m12773a("measurement.upload.max_events_per_bundle", 1000, 1000);

    /* JADX INFO: renamed from: m */
    public static C2107zt<Integer> f12721m = C2107zt.m12773a("measurement.upload.max_events_per_day", 100000, 100000);

    /* JADX INFO: renamed from: n */
    public static C2107zt<Integer> f12722n = C2107zt.m12773a("measurement.upload.max_error_events_per_day", 1000, 1000);

    /* JADX INFO: renamed from: o */
    public static C2107zt<Integer> f12723o = C2107zt.m12773a("measurement.upload.max_public_events_per_day", 50000, 50000);

    /* JADX INFO: renamed from: p */
    public static C2107zt<Integer> f12724p = C2107zt.m12773a("measurement.upload.max_conversions_per_day", 500, 500);

    /* JADX INFO: renamed from: q */
    public static C2107zt<Integer> f12725q = C2107zt.m12773a("measurement.upload.max_realtime_events_per_day", 10, 10);

    /* JADX INFO: renamed from: r */
    public static C2107zt<Integer> f12726r = C2107zt.m12773a("measurement.store.max_stored_events_per_app", 100000, 100000);

    /* JADX INFO: renamed from: s */
    public static C2107zt<String> f12727s = C2107zt.m12775a("measurement.upload.url", "https://app-measurement.com/a", "https://app-measurement.com/a");

    /* JADX INFO: renamed from: t */
    public static C2107zt<Long> f12728t = C2107zt.m12774a("measurement.upload.backoff_period", 43200000L, 43200000L);

    /* JADX INFO: renamed from: u */
    public static C2107zt<Long> f12729u = C2107zt.m12774a("measurement.upload.window_interval", 3600000L, 3600000L);

    /* JADX INFO: renamed from: v */
    public static C2107zt<Long> f12730v = C2107zt.m12774a("measurement.upload.interval", 3600000L, 3600000L);

    /* JADX INFO: renamed from: w */
    public static C2107zt<Long> f12731w = C2107zt.m12774a("measurement.upload.realtime_upload_interval", 10000L, 10000L);

    /* JADX INFO: renamed from: x */
    public static C2107zt<Long> f12732x = C2107zt.m12774a("measurement.upload.debug_upload_interval", 1000L, 1000L);

    /* JADX INFO: renamed from: y */
    public static C2107zt<Long> f12733y = C2107zt.m12774a("measurement.upload.minimum_delay", 500L, 500L);

    /* JADX INFO: renamed from: z */
    public static C2107zt<Long> f12734z = C2107zt.m12774a("measurement.alarm_manager.minimum_interval", 60000L, 60000L);

    /* JADX INFO: renamed from: A */
    public static C2107zt<Long> f12694A = C2107zt.m12774a("measurement.upload.stale_data_deletion_interval", 86400000L, 86400000L);

    /* JADX INFO: renamed from: B */
    public static C2107zt<Long> f12695B = C2107zt.m12774a("measurement.upload.refresh_blacklisted_config_interval", 604800000L, 604800000L);

    /* JADX INFO: renamed from: C */
    public static C2107zt<Long> f12696C = C2107zt.m12774a("measurement.upload.initial_upload_delay_time", 15000L, 15000L);

    /* JADX INFO: renamed from: D */
    public static C2107zt<Long> f12697D = C2107zt.m12774a("measurement.upload.retry_time", 1800000L, 1800000L);

    /* JADX INFO: renamed from: E */
    public static C2107zt<Integer> f12698E = C2107zt.m12773a("measurement.upload.retry_count", 6, 6);

    /* JADX INFO: renamed from: F */
    public static C2107zt<Long> f12699F = C2107zt.m12774a("measurement.upload.max_queue_time", 2419200000L, 2419200000L);

    /* JADX INFO: renamed from: G */
    public static C2107zt<Integer> f12700G = C2107zt.m12773a("measurement.lifetimevalue.max_currency_tracked", 4, 4);

    /* JADX INFO: renamed from: H */
    public static C2107zt<Integer> f12701H = C2107zt.m12773a("measurement.audience.filter_result_max_count", 200, 200);

    /* JADX INFO: renamed from: I */
    public static C2107zt<Long> f12702I = C2107zt.m12774a("measurement.service_client.idle_disconnect_millis", 5000L, 5000L);
}
