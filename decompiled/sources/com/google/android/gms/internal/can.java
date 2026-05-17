package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class can {

    /* JADX INFO: renamed from: en */
    private static byte[] f9653en;

    /* JADX INFO: renamed from: cR */
    private static cac<String> f9551cR = cac.m10525a(0, "gads:sdk_core_experiment_id");

    /* JADX INFO: renamed from: a */
    public static final cac<String> f9427a = cac.m10530a(0, "gads:sdk_core_location", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/sdk-core-v40.html");

    /* JADX INFO: renamed from: cS */
    private static cac<String> f9552cS = cac.m10530a(0, "gads:sdk_core_js_location", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/sdk-core-v40-impl.js");

    /* JADX INFO: renamed from: cT */
    private static cac<Boolean> f9553cT = cac.m10529a(0, "gads:request_builder:singleton_webview", (Boolean) false);

    /* JADX INFO: renamed from: cU */
    private static cac<String> f9554cU = cac.m10525a(0, "gads:request_builder:singleton_webview_experiment_id");

    /* JADX INFO: renamed from: cV */
    private static cac<Boolean> f9555cV = cac.m10529a(0, "gads:sdk_use_dynamic_module", (Boolean) true);

    /* JADX INFO: renamed from: cW */
    private static cac<String> f9556cW = cac.m10525a(0, "gads:sdk_use_dynamic_module_experiment_id");

    /* JADX INFO: renamed from: b */
    public static final cac<Boolean> f9480b = cac.m10529a(0, "gads:sdk_crash_report_enabled", (Boolean) false);

    /* JADX INFO: renamed from: c */
    public static final cac<Boolean> f9533c = cac.m10529a(0, "gads:sdk_crash_report_full_stacktrace", (Boolean) false);

    /* JADX INFO: renamed from: d */
    public static final cac<String> f9586d = cac.m10530a(0, "gads:sdk_crash_report_class_prefix", "com.google.");

    /* JADX INFO: renamed from: e */
    public static final cac<Boolean> f9639e = cac.m10529a(0, "gads:block_autoclicks", (Boolean) false);

    /* JADX INFO: renamed from: cX */
    private static cac<String> f9557cX = cac.m10525a(0, "gads:block_autoclicks_experiment_id");

    /* JADX INFO: renamed from: cY */
    private static cac<String> f9558cY = cac.m10525a(0, "gads:spam_app_context:experiment_id");

    /* JADX INFO: renamed from: cZ */
    private static cac<Integer> f9559cZ = cac.m10527a(1, "gads:http_url_connection_factory:timeout_millis", 10000);

    /* JADX INFO: renamed from: f */
    public static final cac<String> f9654f = cac.m10530a(1, "gads:video_exo_player:version", "1");

    /* JADX INFO: renamed from: g */
    public static final cac<Integer> f9655g = cac.m10527a(1, "gads:video_exo_player:connect_timeout", 8000);

    /* JADX INFO: renamed from: h */
    public static final cac<Integer> f9656h = cac.m10527a(1, "gads:video_exo_player:read_timeout", 8000);

    /* JADX INFO: renamed from: i */
    public static final cac<Integer> f9657i = cac.m10527a(1, "gads:video_exo_player:loading_check_interval", 1048576);

    /* JADX INFO: renamed from: da */
    private static cac<String> f9613da = cac.m10525a(0, "gads:video_stream_cache:experiment_id");

    /* JADX INFO: renamed from: j */
    public static final cac<Integer> f9658j = cac.m10527a(1, "gads:video_stream_cache:limit_count", 5);

    /* JADX INFO: renamed from: k */
    public static final cac<Integer> f9659k = cac.m10527a(1, "gads:video_stream_cache:limit_space", 8388608);

    /* JADX INFO: renamed from: l */
    public static final cac<Integer> f9660l = cac.m10527a(1, "gads:video_stream_exo_cache:buffer_size", 8388608);

    /* JADX INFO: renamed from: m */
    public static final cac<Long> f9661m = cac.m10528a(1, "gads:video_stream_cache:limit_time_sec", 300L);

    /* JADX INFO: renamed from: n */
    public static final cac<Long> f9662n = cac.m10528a(1, "gads:video_stream_cache:notify_interval_millis", 125L);

    /* JADX INFO: renamed from: o */
    public static final cac<Integer> f9663o = cac.m10527a(1, "gads:video_stream_cache:connect_timeout_millis", 10000);

    /* JADX INFO: renamed from: p */
    public static final cac<Boolean> f9664p = cac.m10529a(0, "gads:video:metric_reporting_enabled", (Boolean) false);

    /* JADX INFO: renamed from: q */
    public static final cac<String> f9665q = cac.m10530a(1, "gads:video:metric_frame_hash_times", "");

    /* JADX INFO: renamed from: r */
    public static final cac<Long> f9666r = cac.m10528a(1, "gads:video:metric_frame_hash_time_leniency", 500L);

    /* JADX INFO: renamed from: s */
    public static final cac<Boolean> f9667s = cac.m10529a(1, "gads:video:force_watermark", (Boolean) false);

    /* JADX INFO: renamed from: t */
    public static final cac<Long> f9668t = cac.m10528a(1, "gads:video:surface_update_min_spacing_ms", 1000L);

    /* JADX INFO: renamed from: u */
    public static final cac<Boolean> f9669u = cac.m10529a(1, "gads:video:spinner:enabled", (Boolean) false);

    /* JADX INFO: renamed from: v */
    public static final cac<Integer> f9670v = cac.m10527a(1, "gads:video:spinner:scale", 4);

    /* JADX INFO: renamed from: w */
    public static final cac<Long> f9671w = cac.m10528a(1, "gads:video:spinner:jank_threshold_ms", 50L);

    /* JADX INFO: renamed from: x */
    public static final cac<Boolean> f9672x = cac.m10529a(1, "gads:video:aggressive_media_codec_release", (Boolean) false);

    /* JADX INFO: renamed from: y */
    public static final cac<Boolean> f9673y = cac.m10529a(1, "gads:memory_bundle:debug_info", (Boolean) false);

    /* JADX INFO: renamed from: z */
    public static final cac<Boolean> f9674z = cac.m10529a(1, "gads:memory_bundle:runtime_info", (Boolean) true);

    /* JADX INFO: renamed from: A */
    public static final cac<String> f9401A = cac.m10530a(1, "gads:video:codec_query_mime_types", "");

    /* JADX INFO: renamed from: B */
    public static final cac<Integer> f9402B = cac.m10527a(1, "gads:video:codec_query_minimum_version", 16);

    /* JADX INFO: renamed from: db */
    private static cac<Boolean> f9614db = cac.m10529a(0, "gads:ad_id_app_context:enabled", (Boolean) false);

    /* JADX INFO: renamed from: dc */
    private static cac<Float> f9615dc = cac.m10526a(0, "gads:ad_id_app_context:ping_ratio", 0.0f);

    /* JADX INFO: renamed from: dd */
    private static cac<String> f9616dd = cac.m10525a(0, "gads:ad_id_app_context:experiment_id");

    /* JADX INFO: renamed from: de */
    private static cac<String> f9617de = cac.m10525a(0, "gads:ad_id_use_shared_preference:experiment_id");

    /* JADX INFO: renamed from: df */
    private static cac<Boolean> f9618df = cac.m10529a(0, "gads:ad_id_use_shared_preference:enabled", (Boolean) false);

    /* JADX INFO: renamed from: dg */
    private static cac<Float> f9619dg = cac.m10526a(0, "gads:ad_id_use_shared_preference:ping_ratio", 0.0f);

    /* JADX INFO: renamed from: dh */
    private static cac<Boolean> f9620dh = cac.m10529a(0, "gads:ad_id_use_persistent_service:enabled", (Boolean) false);

    /* JADX INFO: renamed from: di */
    private static cac<String> f9621di = cac.m10531b(0, "gads:looper_for_gms_client:experiment_id");

    /* JADX INFO: renamed from: C */
    public static final cac<Boolean> f9403C = cac.m10529a(0, "gads:looper_for_gms_client:enabled", (Boolean) true);

    /* JADX INFO: renamed from: D */
    public static final cac<Boolean> f9404D = cac.m10529a(0, "gads:sw_ad_request_service:enabled", (Boolean) true);

    /* JADX INFO: renamed from: dj */
    private static cac<Boolean> f9622dj = cac.m10529a(0, "gads:sw_dynamite:enabled", (Boolean) true);

    /* JADX INFO: renamed from: E */
    public static final cac<String> f9405E = cac.m10530a(1, "gad:mraid:url_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_banner.js");

    /* JADX INFO: renamed from: F */
    public static final cac<String> f9406F = cac.m10530a(1, "gad:mraid:url_expanded_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_expanded_banner.js");

    /* JADX INFO: renamed from: G */
    public static final cac<String> f9407G = cac.m10530a(1, "gad:mraid:url_interstitial", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_interstitial.js");

    /* JADX INFO: renamed from: H */
    public static final cac<Boolean> f9408H = cac.m10529a(0, "gads:enabled_sdk_csi", (Boolean) false);

    /* JADX INFO: renamed from: I */
    public static final cac<String> f9409I = cac.m10530a(0, "gads:sdk_csi_server", "https://csi.gstatic.com/csi");

    /* JADX INFO: renamed from: J */
    public static final cac<Boolean> f9410J = cac.m10529a(0, "gads:sdk_csi_write_to_file", (Boolean) false);

    /* JADX INFO: renamed from: K */
    public static final cac<Boolean> f9411K = cac.m10529a(0, "gads:enable_content_fetching", (Boolean) true);

    /* JADX INFO: renamed from: L */
    public static final cac<Integer> f9412L = cac.m10527a(0, "gads:content_length_weight", 1);

    /* JADX INFO: renamed from: M */
    public static final cac<Integer> f9413M = cac.m10527a(0, "gads:content_age_weight", 1);

    /* JADX INFO: renamed from: N */
    public static final cac<Integer> f9414N = cac.m10527a(0, "gads:min_content_len", 11);

    /* JADX INFO: renamed from: O */
    public static final cac<Integer> f9415O = cac.m10527a(0, "gads:fingerprint_number", 10);

    /* JADX INFO: renamed from: P */
    public static final cac<Integer> f9416P = cac.m10527a(0, "gads:sleep_sec", 10);

    /* JADX INFO: renamed from: Q */
    public static final cac<Boolean> f9417Q = cac.m10529a(1, "gads:enable_content_url_hash", (Boolean) true);

    /* JADX INFO: renamed from: R */
    public static final cac<Integer> f9418R = cac.m10527a(1, "gads:content_vertical_fingerprint_number", 100);

    /* JADX INFO: renamed from: S */
    public static final cac<Boolean> f9419S = cac.m10529a(1, "gads:enable_content_vertical_hash", (Boolean) true);

    /* JADX INFO: renamed from: T */
    public static final cac<Integer> f9420T = cac.m10527a(1, "gads:content_vertical_fingerprint_bits", 23);

    /* JADX INFO: renamed from: U */
    public static final cac<Integer> f9421U = cac.m10527a(1, "gads:content_vertical_fingerprint_ngram", 3);

    /* JADX INFO: renamed from: V */
    public static final cac<String> f9422V = cac.m10530a(1, "gads:content_fetch_view_tag_id", "googlebot");

    /* JADX INFO: renamed from: W */
    public static final cac<String> f9423W = cac.m10530a(1, "gads:content_fetch_exclude_view_tag", "none");

    /* JADX INFO: renamed from: X */
    public static final cac<Boolean> f9424X = cac.m10529a(0, "gad:app_index_enabled", (Boolean) true);

    /* JADX INFO: renamed from: Y */
    public static final cac<Boolean> f9425Y = cac.m10529a(1, "gads:content_fetch_disable_get_title_from_webview", (Boolean) false);

    /* JADX INFO: renamed from: Z */
    public static final cac<Boolean> f9426Z = cac.m10529a(0, "gads:app_index:without_content_info_present:enabled", (Boolean) true);

    /* JADX INFO: renamed from: aa */
    public static final cac<Long> f9454aa = cac.m10528a(0, "gads:app_index:timeout_ms", 1000L);

    /* JADX INFO: renamed from: dk */
    private static cac<String> f9623dk = cac.m10525a(0, "gads:app_index:experiment_id");

    /* JADX INFO: renamed from: dl */
    private static cac<String> f9624dl = cac.m10525a(0, "gads:kitkat_interstitial_workaround:experiment_id");

    /* JADX INFO: renamed from: ab */
    public static final cac<Boolean> f9455ab = cac.m10529a(0, "gads:kitkat_interstitial_workaround:enabled", (Boolean) true);

    /* JADX INFO: renamed from: ac */
    public static final cac<Boolean> f9456ac = cac.m10529a(0, "gads:interstitial_follow_url", (Boolean) true);

    /* JADX INFO: renamed from: ad */
    public static final cac<Boolean> f9457ad = cac.m10529a(0, "gads:interstitial_follow_url:register_click", (Boolean) true);

    /* JADX INFO: renamed from: dm */
    private static cac<String> f9625dm = cac.m10525a(0, "gads:interstitial_follow_url:experiment_id");

    /* JADX INFO: renamed from: dn */
    private static cac<Boolean> f9626dn = cac.m10529a(0, "gads:analytics_enabled", (Boolean) true);

    /* JADX INFO: renamed from: ae */
    public static final cac<Boolean> f9458ae = cac.m10529a(0, "gads:ad_key_enabled", (Boolean) false);

    /* JADX INFO: renamed from: af */
    public static final cac<Boolean> f9459af = cac.m10529a(1, "gads:sai:enabled", (Boolean) true);

    /* JADX INFO: renamed from: ag */
    public static final cac<Boolean> f9460ag = cac.m10529a(1, "gads:sai:banner_ad_enabled", (Boolean) true);

    /* JADX INFO: renamed from: ah */
    public static final cac<Boolean> f9461ah = cac.m10529a(1, "gads:sai:native_ad_enabled", (Boolean) true);

    /* JADX INFO: renamed from: ai */
    public static final cac<Boolean> f9462ai = cac.m10529a(1, "gads:sai:interstitial_ad_enabled", (Boolean) true);

    /* JADX INFO: renamed from: aj */
    public static final cac<Boolean> f9463aj = cac.m10529a(1, "gads:sai:rewardedvideo_ad_enabled", (Boolean) true);

    /* JADX INFO: renamed from: ak */
    public static final cac<String> f9464ak = cac.m10530a(1, "gads:sai:click_ping_schema_v2", "^[^?]*(/aclk\\?|/pcs/click\\?).*");

    /* JADX INFO: renamed from: al */
    public static final cac<String> f9465al = cac.m10530a(1, "gads:sai:impression_ping_schema_v2", "^[^?]*/adview.*");

    /* JADX INFO: renamed from: am */
    public static final cac<Boolean> f9466am = cac.m10529a(1, "gads:sai:click_gmsg_enabled", (Boolean) true);

    /* JADX INFO: renamed from: an */
    public static final cac<Boolean> f9467an = cac.m10529a(1, "gads:sai:using_macro:enabled", (Boolean) false);

    /* JADX INFO: renamed from: ao */
    public static final cac<String> f9468ao = cac.m10530a(1, "gads:sai:ad_event_id_macro_name", "[gw_fbsaeid]");

    /* JADX INFO: renamed from: ap */
    public static final cac<Long> f9469ap = cac.m10528a(1, "gads:sai:timeout_ms", -1L);

    /* JADX INFO: renamed from: aq */
    public static final cac<Integer> f9470aq = cac.m10527a(1, "gads:sai:scion_thread_pool_size", 5);

    /* JADX INFO: renamed from: do */
    private static cac<Integer> f9627do = cac.m10527a(0, "gads:webview_cache_version", 0);

    /* JADX INFO: renamed from: ar */
    public static final cac<Boolean> f9471ar = cac.m10529a(1, "gads:webview:ignore_over_scroll", (Boolean) true);

    /* JADX INFO: renamed from: dp */
    private static cac<String> f9628dp = cac.m10531b(0, "gads:pan:experiment_id");

    /* JADX INFO: renamed from: as */
    public static final cac<Boolean> f9472as = cac.m10529a(1, "gads:rewarded:adapter_initialization_enabled", (Boolean) false);

    /* JADX INFO: renamed from: at */
    public static final cac<Long> f9473at = cac.m10528a(1, "gads:rewarded:adapter_timeout_ms", 20000L);

    /* JADX INFO: renamed from: au */
    public static final cac<Boolean> f9474au = cac.m10529a(1, "gads:app_activity_tracker:enabled", (Boolean) true);

    /* JADX INFO: renamed from: av */
    public static final cac<Long> f9475av = cac.m10528a(1, "gads:app_activity_tracker:notify_background_listeners_delay_ms", 500L);

    /* JADX INFO: renamed from: aw */
    public static final cac<Long> f9476aw = cac.m10528a(1, "gads:app_activity_tracker:app_session_timeout_ms", TimeUnit.MINUTES.toMillis(5));

    /* JADX INFO: renamed from: ax */
    public static final cac<Boolean> f9477ax = cac.m10529a(1, "gads:adid_values_in_adrequest:enabled", (Boolean) false);

    /* JADX INFO: renamed from: ay */
    public static final cac<Long> f9478ay = cac.m10528a(1, "gads:adid_values_in_adrequest:timeout", 2000L);

    /* JADX INFO: renamed from: az */
    public static final cac<Boolean> f9479az = cac.m10529a(1, "gads:disable_adid_values_in_ms", (Boolean) false);

    /* JADX INFO: renamed from: aA */
    public static final cac<Boolean> f9428aA = cac.m10529a(1, "gads:enable_ad_loader_manager", (Boolean) true);

    /* JADX INFO: renamed from: dq */
    private static cac<Boolean> f9629dq = cac.m10529a(0, "gads:ad_serving:enabled", (Boolean) true);

    /* JADX INFO: renamed from: aB */
    public static final cac<Boolean> f9429aB = cac.m10529a(1, "gads:ad_manager_enforce_arp_invariant:enabled", (Boolean) false);

    /* JADX INFO: renamed from: aC */
    public static final cac<Long> f9430aC = cac.m10528a(1, "gads:ad_overlay:delay_page_close_timeout_ms", 5000L);

    /* JADX INFO: renamed from: aD */
    public static final cac<Boolean> f9431aD = cac.m10529a(1, "gads:interstitial_ad_immersive_mode", (Boolean) true);

    /* JADX INFO: renamed from: aE */
    public static final cac<Boolean> f9432aE = cac.m10529a(1, "gads:custom_close_blocking:enabled", (Boolean) false);

    /* JADX INFO: renamed from: dr */
    private static cac<Boolean> f9630dr = cac.m10529a(1, "gads:impression_optimization_enabled", (Boolean) false);

    /* JADX INFO: renamed from: ds */
    private static cac<String> f9631ds = cac.m10530a(1, "gads:banner_ad_pool:schema", "customTargeting");

    /* JADX INFO: renamed from: dt */
    private static cac<Integer> f9632dt = cac.m10527a(1, "gads:banner_ad_pool:max_queues", 3);

    /* JADX INFO: renamed from: du */
    private static cac<Integer> f9633du = cac.m10527a(1, "gads:banner_ad_pool:max_pools", 3);

    /* JADX INFO: renamed from: aF */
    public static final cac<Boolean> f9433aF = cac.m10529a(1, "gads:interstitial_ad_pool:enabled", (Boolean) false);

    /* JADX INFO: renamed from: aG */
    public static final cac<Boolean> f9434aG = cac.m10529a(1, "gads:interstitial_ad_pool:enabled_for_rewarded", (Boolean) false);

    /* JADX INFO: renamed from: aH */
    public static final cac<String> f9435aH = cac.m10530a(1, "gads:interstitial_ad_pool:schema", "customTargeting");

    /* JADX INFO: renamed from: aI */
    public static final cac<String> f9436aI = cac.m10530a(1, "gads:interstitial_ad_pool:request_exclusions", "com.google.ads.mediation.admob.AdMobAdapter/_ad");

    /* JADX INFO: renamed from: aJ */
    public static final cac<Integer> f9437aJ = cac.m10527a(1, "gads:interstitial_ad_pool:max_pools", 3);

    /* JADX INFO: renamed from: aK */
    public static final cac<Integer> f9438aK = cac.m10527a(1, "gads:interstitial_ad_pool:max_pool_depth", 2);

    /* JADX INFO: renamed from: aL */
    public static final cac<Integer> f9439aL = cac.m10527a(1, "gads:interstitial_ad_pool:time_limit_sec", 1200);

    /* JADX INFO: renamed from: aM */
    public static final cac<String> f9440aM = cac.m10530a(1, "gads:interstitial_ad_pool:ad_unit_exclusions", "(?!)");

    /* JADX INFO: renamed from: aN */
    public static final cac<Integer> f9441aN = cac.m10527a(1, "gads:interstitial_ad_pool:top_off_latency_min_millis", 0);

    /* JADX INFO: renamed from: aO */
    public static final cac<Integer> f9442aO = cac.m10527a(1, "gads:interstitial_ad_pool:top_off_latency_range_millis", 0);

    /* JADX INFO: renamed from: aP */
    public static final cac<Long> f9443aP = cac.m10528a(1, "gads:interstitial_ad_pool:discard_thresholds", 0L);

    /* JADX INFO: renamed from: aQ */
    public static final cac<Long> f9444aQ = cac.m10528a(1, "gads:interstitial_ad_pool:miss_thresholds", 0L);

    /* JADX INFO: renamed from: aR */
    public static final cac<Float> f9445aR = cac.m10526a(1, "gads:interstitial_ad_pool:discard_asymptote", 0.0f);

    /* JADX INFO: renamed from: aS */
    public static final cac<Float> f9446aS = cac.m10526a(1, "gads:interstitial_ad_pool:miss_asymptote", 0.0f);

    /* JADX INFO: renamed from: aT */
    public static final cac<Boolean> f9447aT = cac.m10529a(0, "gads:debug_logging_feature:enable", (Boolean) false);

    /* JADX INFO: renamed from: aU */
    public static final cac<Boolean> f9448aU = cac.m10529a(0, "gads:debug_logging_feature:intercept_web_view", (Boolean) false);

    /* JADX INFO: renamed from: dv */
    private static cac<Integer> f9634dv = cac.m10527a(1, "gads:heap_wastage:bytes", 0);

    /* JADX INFO: renamed from: aV */
    public static final cac<String> f9449aV = cac.m10530a(1, "gads:spherical_video:vertex_shader", "");

    /* JADX INFO: renamed from: aW */
    public static final cac<String> f9450aW = cac.m10530a(1, "gads:spherical_video:fragment_shader", "");

    /* JADX INFO: renamed from: aX */
    public static final cac<Boolean> f9451aX = cac.m10529a(0, "gads:log:verbose_enabled", (Boolean) false);

    /* JADX INFO: renamed from: aY */
    public static final cac<Boolean> f9452aY = cac.m10529a(1, "gads:include_local_global_rectangles", (Boolean) false);

    /* JADX INFO: renamed from: aZ */
    public static final cac<Long> f9453aZ = cac.m10528a(1, "gads:position_watcher:throttle_ms", 200L);

    /* JADX INFO: renamed from: ba */
    public static final cac<Boolean> f9507ba = cac.m10529a(1, "gads:include_lock_screen_apps_for_visibility", (Boolean) true);

    /* JADX INFO: renamed from: bb */
    public static final cac<Boolean> f9508bb = cac.m10529a(0, "gads:device_info_caching:enabled", (Boolean) true);

    /* JADX INFO: renamed from: bc */
    public static final cac<Long> f9509bc = cac.m10528a(0, "gads:device_info_caching_expiry_ms:expiry", 300000L);

    /* JADX INFO: renamed from: bd */
    public static final cac<Boolean> f9510bd = cac.m10529a(0, "gads:gen204_signals:enabled", (Boolean) false);

    /* JADX INFO: renamed from: be */
    public static final cac<Boolean> f9511be = cac.m10529a(0, "gads:webview:error_reporting_enabled", (Boolean) false);

    /* JADX INFO: renamed from: dw */
    private static cac<Boolean> f9635dw = cac.m10529a(0, "gads:adid_reporting:enabled", (Boolean) false);

    /* JADX INFO: renamed from: dx */
    private static cac<Boolean> f9636dx = cac.m10529a(0, "gads:ad_settings_page_reporting:enabled", (Boolean) false);

    /* JADX INFO: renamed from: dy */
    private static cac<Boolean> f9637dy = cac.m10529a(0, "gads:adid_info_gmscore_upgrade_reporting:enabled", (Boolean) false);

    /* JADX INFO: renamed from: dz */
    private static cac<Boolean> f9638dz = cac.m10529a(0, "gads:request_pkg:enabled", (Boolean) true);

    /* JADX INFO: renamed from: bf */
    public static final cac<Boolean> f9512bf = cac.m10529a(1, "gads:gmsg:disable_back_button:enabled", (Boolean) true);

    /* JADX INFO: renamed from: bg */
    public static final cac<Boolean> f9513bg = cac.m10529a(0, "gads:gmsg:video_meta:enabled", (Boolean) true);

    /* JADX INFO: renamed from: dA */
    private static cac<String> f9587dA = cac.m10525a(0, "gads:gmsg:video_meta:experiment_id");

    /* JADX INFO: renamed from: dB */
    private static cac<Long> f9588dB = cac.m10528a(1, "gads:network:cache_prediction_duration_s", 300L);

    /* JADX INFO: renamed from: bh */
    public static final cac<Long> f9514bh = cac.m10528a(1, "gads:network:network_prediction_timeout_ms", 2000L);

    /* JADX INFO: renamed from: bi */
    public static final cac<Boolean> f9515bi = cac.m10529a(0, "gads:mediation:dynamite_first:admobadapter", (Boolean) true);

    /* JADX INFO: renamed from: bj */
    public static final cac<Boolean> f9516bj = cac.m10529a(0, "gads:mediation:dynamite_first:adurladapter", (Boolean) true);

    /* JADX INFO: renamed from: bk */
    public static final cac<Boolean> f9517bk = cac.m10529a(1, "gads:bypass_adrequest_service_for_inlined_mediation", (Boolean) true);

    /* JADX INFO: renamed from: bl */
    public static final cac<Long> f9518bl = cac.m10528a(0, "gads:resolve_future:default_timeout_ms", 30000L);

    /* JADX INFO: renamed from: bm */
    public static final cac<Long> f9519bm = cac.m10528a(0, "gads:ad_loader:timeout_ms", 60000L);

    /* JADX INFO: renamed from: bn */
    public static final cac<Long> f9520bn = cac.m10528a(0, "gads:rendering:timeout_ms", 60000L);

    /* JADX INFO: renamed from: bo */
    public static final cac<Boolean> f9521bo = cac.m10529a(0, "gads:adshield:enable_adshield_instrumentation", (Boolean) false);

    /* JADX INFO: renamed from: bp */
    public static final cac<Long> f9522bp = cac.m10528a(1, "gads:gestures:task_timeout", 2000L);

    /* JADX INFO: renamed from: bq */
    public static final cac<Boolean> f9523bq = cac.m10529a(1, "gads:gestures:btt:enabled", (Boolean) false);

    /* JADX INFO: renamed from: br */
    public static final cac<Boolean> f9524br = cac.m10529a(1, "gads:gestures:sss:enabled", (Boolean) false);

    /* JADX INFO: renamed from: bs */
    public static final cac<Boolean> f9525bs = cac.m10529a(1, "gads:gestures:asig:enabled", (Boolean) false);

    /* JADX INFO: renamed from: bt */
    public static final cac<Boolean> f9526bt = cac.m10529a(1, "gads:gestures:tos:enabled", (Boolean) false);

    /* JADX INFO: renamed from: bu */
    public static final cac<Integer> f9527bu = cac.m10527a(1, "gads:gestures:ts", 1);

    /* JADX INFO: renamed from: bv */
    public static final cac<Boolean> f9528bv = cac.m10529a(1, "gads:gestures:tdvs:enabled", (Boolean) false);

    /* JADX INFO: renamed from: bw */
    public static final cac<Boolean> f9529bw = cac.m10529a(1, "gads:gestures:tvvs:enabled", (Boolean) false);

    /* JADX INFO: renamed from: bx */
    public static final cac<String> f9530bx = cac.m10530a(1, "gads:gestures:pk", "");

    /* JADX INFO: renamed from: by */
    public static final cac<Boolean> f9531by = cac.m10529a(1, "gads:gestures:bs:enabled", (Boolean) true);

    /* JADX INFO: renamed from: bz */
    public static final cac<Boolean> f9532bz = cac.m10529a(1, "gads:gestures:check_initialization_thread:enabled", (Boolean) false);

    /* JADX INFO: renamed from: bA */
    public static final cac<Boolean> f9481bA = cac.m10529a(1, "gads:gestures:get_query_in_non_ui_thread:enabled", (Boolean) true);

    /* JADX INFO: renamed from: bB */
    public static final cac<Boolean> f9482bB = cac.m10529a(0, "gass:enabled", (Boolean) true);

    /* JADX INFO: renamed from: bC */
    public static final cac<Boolean> f9483bC = cac.m10529a(0, "gass:enable_int_signal", (Boolean) true);

    /* JADX INFO: renamed from: bD */
    public static final cac<Boolean> f9484bD = cac.m10529a(0, "gass:enable_ad_attestation_signal", (Boolean) true);

    /* JADX INFO: renamed from: dC */
    private static cac<Boolean> f9589dC = cac.m10529a(0, "gads:adid_notification:first_party_check:enabled", (Boolean) true);

    /* JADX INFO: renamed from: dD */
    private static cac<Boolean> f9590dD = cac.m10529a(0, "gads:edu_device_helper:enabled", (Boolean) true);

    /* JADX INFO: renamed from: bE */
    public static final cac<Boolean> f9485bE = cac.m10529a(0, "gads:support_screen_shot", (Boolean) true);

    /* JADX INFO: renamed from: bF */
    public static final cac<Boolean> f9486bF = cac.m10529a(0, "gads:use_get_drawing_cache_for_screenshot:enabled", (Boolean) true);

    /* JADX INFO: renamed from: dE */
    private static cac<String> f9591dE = cac.m10525a(0, "gads:use_get_drawing_cache_for_screenshot:experiment_id");

    /* JADX INFO: renamed from: dF */
    private static cac<String> f9592dF = cac.m10525a(1, "gads:sdk_core_constants:experiment_id");

    /* JADX INFO: renamed from: bG */
    public static final cac<String> f9487bG = cac.m10530a(1, "gads:sdk_core_constants:caps", "");

    /* JADX INFO: renamed from: bH */
    public static final cac<Long> f9488bH = cac.m10528a(0, "gads:js_flags:update_interval", TimeUnit.HOURS.toMillis(12));

    /* JADX INFO: renamed from: bI */
    public static final cac<Boolean> f9489bI = cac.m10529a(0, "gads:js_flags:mf", (Boolean) false);

    /* JADX INFO: renamed from: dG */
    private static cac<Boolean> f9593dG = cac.m10529a(1, "gads:js_flags:disable_phenotype", (Boolean) false);

    /* JADX INFO: renamed from: bJ */
    public static final cac<Boolean> f9490bJ = cac.m10529a(0, "gads:custom_render:ping_on_ad_rendered", (Boolean) false);

    /* JADX INFO: renamed from: bK */
    public static final cac<String> f9491bK = cac.m10530a(1, "gads:native:engine_url_with_protocol", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/native_ads.html");

    /* JADX INFO: renamed from: dH */
    private static cac<String> f9594dH = cac.m10530a(0, "gads:native:engine_js_url_with_protocol", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/native_ads.js");

    /* JADX INFO: renamed from: dI */
    private static cac<String> f9595dI = cac.m10530a(1, "gads:native:video_url", "//imasdk.googleapis.com/admob/sdkloader/native_video.html");

    /* JADX INFO: renamed from: bL */
    public static final cac<String> f9492bL = cac.m10530a(1, "gads:native:video_url_with_protocol", "https://imasdk.googleapis.com/admob/sdkloader/native_video.html");

    /* JADX INFO: renamed from: dJ */
    private static cac<String> f9596dJ = cac.m10525a(1, "gads:singleton_webview_native:experiment_id");

    /* JADX INFO: renamed from: bM */
    public static final cac<Boolean> f9493bM = cac.m10529a(1, "gads:enable_untrack_view_native", (Boolean) true);

    /* JADX INFO: renamed from: bN */
    public static final cac<Boolean> f9494bN = cac.m10529a(1, "gads:ignore_untrack_view_google_native", (Boolean) true);

    /* JADX INFO: renamed from: bO */
    public static final cac<Boolean> f9495bO = cac.m10529a(1, "gads:reset_listeners_preparead_native", (Boolean) true);

    /* JADX INFO: renamed from: bP */
    public static final cac<Integer> f9496bP = cac.m10527a(1, "gads:native_video_load_timeout", 10);

    /* JADX INFO: renamed from: bQ */
    public static final cac<String> f9497bQ = cac.m10530a(1, "gads:ad_choices_content_description", "Ad Choices Icon");

    /* JADX INFO: renamed from: bR */
    public static final cac<Boolean> f9498bR = cac.m10529a(1, "gads:clamp_native_video_player_dimensions", (Boolean) true);

    /* JADX INFO: renamed from: bS */
    public static final cac<Boolean> f9499bS = cac.m10529a(1, "gads:enable_store_active_view_state", (Boolean) false);

    /* JADX INFO: renamed from: bT */
    public static final cac<Boolean> f9500bT = cac.m10529a(1, "gads:enable_singleton_broadcast_receiver", (Boolean) false);

    /* JADX INFO: renamed from: bU */
    public static final cac<Boolean> f9501bU = cac.m10529a(1, "gads:native:overlay_new_fix:enabled", (Boolean) false);

    /* JADX INFO: renamed from: bV */
    public static final cac<Boolean> f9502bV = cac.m10529a(1, "gads:native:count_impression_for_assets", (Boolean) false);

    /* JADX INFO: renamed from: bW */
    public static final cac<Boolean> f9503bW = cac.m10529a(1, "gads:fluid_ad:use_wrap_content_height", (Boolean) false);

    /* JADX INFO: renamed from: bX */
    public static final cac<Boolean> f9504bX = cac.m10529a(0, "gads:method_tracing:enabled", (Boolean) false);

    /* JADX INFO: renamed from: bY */
    public static final cac<Long> f9505bY = cac.m10528a(0, "gads:method_tracing:duration_ms", 30000L);

    /* JADX INFO: renamed from: bZ */
    public static final cac<Integer> f9506bZ = cac.m10527a(0, "gads:method_tracing:count", 5);

    /* JADX INFO: renamed from: ca */
    public static final cac<Integer> f9560ca = cac.m10527a(0, "gads:method_tracing:filesize", 134217728);

    /* JADX INFO: renamed from: dK */
    private static cac<Boolean> f9597dK = cac.m10529a(1, "gads:auto_location_for_coarse_permission", (Boolean) false);

    /* JADX INFO: renamed from: dL */
    private static cac<String> f9598dL = cac.m10531b(1, "gads:auto_location_for_coarse_permission:experiment_id");

    /* JADX INFO: renamed from: cb */
    public static final cac<Long> f9561cb = cac.m10528a(1, "gads:auto_location_timeout", 2000L);

    /* JADX INFO: renamed from: dM */
    private static cac<String> f9599dM = cac.m10531b(1, "gads:auto_location_timeout:experiment_id");

    /* JADX INFO: renamed from: dN */
    private static cac<Long> f9600dN = cac.m10528a(1, "gads:auto_location_interval", -1L);

    /* JADX INFO: renamed from: dO */
    private static cac<String> f9601dO = cac.m10531b(1, "gads:auto_location_interval:experiment_id");

    /* JADX INFO: renamed from: cc */
    public static final cac<Boolean> f9562cc = cac.m10529a(1, "gads:fetch_app_settings_using_cld:enabled", (Boolean) false);

    /* JADX INFO: renamed from: dP */
    private static cac<String> f9602dP = cac.m10525a(1, "gads:fetch_app_settings_using_cld:enabled:experiment_id");

    /* JADX INFO: renamed from: cd */
    public static final cac<Long> f9563cd = cac.m10528a(1, "gads:fetch_app_settings_using_cld:refresh_interval_ms", 7200000L);

    /* JADX INFO: renamed from: dQ */
    private static cac<String> f9603dQ = cac.m10525a(0, "gads:afs:csa:experiment_id");

    /* JADX INFO: renamed from: ce */
    public static final cac<String> f9564ce = cac.m10530a(0, "gads:afs:csa_webview_gmsg_ad_failed", "gmsg://noAdLoaded");

    /* JADX INFO: renamed from: cf */
    public static final cac<String> f9565cf = cac.m10530a(0, "gads:afs:csa_webview_gmsg_script_load_failed", "gmsg://scriptLoadFailed");

    /* JADX INFO: renamed from: cg */
    public static final cac<String> f9566cg = cac.m10530a(0, "gads:afs:csa_webview_gmsg_ad_loaded", "gmsg://adResized");

    /* JADX INFO: renamed from: ch */
    public static final cac<String> f9567ch = cac.m10530a(0, "gads:afs:csa_webview_static_file_path", "/afs/ads/i/webview.html");

    /* JADX INFO: renamed from: ci */
    public static final cac<String> f9568ci = cac.m10530a(0, "gads:afs:csa_webview_custom_domain_param_key", "csa_customDomain");

    /* JADX INFO: renamed from: cj */
    public static final cac<Long> f9569cj = cac.m10528a(0, "gads:afs:csa_webview_adshield_timeout_ms", 1000L);

    /* JADX INFO: renamed from: dR */
    private static cac<Boolean> f9604dR = cac.m10529a(0, "gads:afs:csa_ad_manager_enabled", (Boolean) true);

    /* JADX INFO: renamed from: dS */
    private static cac<Boolean> f9605dS = cac.m10529a(1, "gads:parental_controls:send_from_client", (Boolean) true);

    /* JADX INFO: renamed from: dT */
    private static cac<Boolean> f9606dT = cac.m10529a(1, "gads:parental_controls:cache_results", (Boolean) true);

    /* JADX INFO: renamed from: ck */
    public static final cac<Long> f9570ck = cac.m10528a(1, "gads:parental_controls:timeout", 2000L);

    /* JADX INFO: renamed from: dU */
    private static cac<String> f9607dU = cac.m10530a(0, "gads:safe_browsing:api_key", "AIzaSyDRKQ9d6kfsoZT2lUnZcZnBYvH69HExNPE");

    /* JADX INFO: renamed from: dV */
    private static cac<Long> f9608dV = cac.m10528a(0, "gads:safe_browsing:safety_net:delay_ms", 2000L);

    /* JADX INFO: renamed from: cl */
    public static final cac<Boolean> f9571cl = cac.m10529a(0, "gads:safe_browsing:debug", (Boolean) false);

    /* JADX INFO: renamed from: cm */
    public static final cac<Boolean> f9572cm = cac.m10529a(0, "gads:webview_cookie:enabled", (Boolean) true);

    /* JADX INFO: renamed from: dW */
    private static cac<Integer> f9609dW = cac.m10527a(1, "gads:cache:ad_request_timeout_millis", 250);

    /* JADX INFO: renamed from: dX */
    private static cac<Integer> f9610dX = cac.m10527a(1, "gads:cache:max_concurrent_downloads", 10);

    /* JADX INFO: renamed from: dY */
    private static cac<Long> f9611dY = cac.m10528a(1, "gads:cache:javascript_timeout_millis", 5000L);

    /* JADX INFO: renamed from: cn */
    public static final cac<Boolean> f9573cn = cac.m10529a(1, "gads:cache:bind_on_foreground", (Boolean) false);

    /* JADX INFO: renamed from: co */
    public static final cac<Boolean> f9574co = cac.m10529a(1, "gads:cache:bind_on_init", (Boolean) false);

    /* JADX INFO: renamed from: cp */
    public static final cac<Boolean> f9575cp = cac.m10529a(1, "gads:cache:bind_on_request", (Boolean) false);

    /* JADX INFO: renamed from: cq */
    public static final cac<Long> f9576cq = cac.m10528a(1, "gads:cache:bind_on_request_keep_alive", TimeUnit.SECONDS.toMillis(30));

    /* JADX INFO: renamed from: cr */
    public static final cac<Boolean> f9577cr = cac.m10529a(1, "gads:cache:use_cache_data_source", (Boolean) false);

    /* JADX INFO: renamed from: dZ */
    private static cac<Boolean> f9612dZ = cac.m10529a(1, "gads:cache:connection_per_read", (Boolean) false);

    /* JADX INFO: renamed from: ea */
    private static cac<Long> f9640ea = cac.m10528a(1, "gads:cache:connection_timeout", 5000L);

    /* JADX INFO: renamed from: eb */
    private static cac<Long> f9641eb = cac.m10528a(1, "gads:cache:read_only_connection_timeout", 5000L);

    /* JADX INFO: renamed from: cs */
    public static final cac<Boolean> f9578cs = cac.m10529a(1, "gads:http_assets_cache:enabled", (Boolean) false);

    /* JADX INFO: renamed from: ct */
    public static final cac<String> f9579ct = cac.m10530a(1, "gads:http_assets_cache:regex", "(?i)https:\\/\\/(tpc\\.googlesyndication\\.com\\/(.*)|lh\\d+\\.googleusercontent\\.com\\/(.*))");

    /* JADX INFO: renamed from: cu */
    public static final cac<Integer> f9580cu = cac.m10527a(1, "gads:http_assets_cache:time_out", 100);

    /* JADX INFO: renamed from: cv */
    public static final cac<Boolean> f9581cv = cac.m10529a(1, "gads:chrome_custom_tabs:enabled", (Boolean) true);

    /* JADX INFO: renamed from: cw */
    public static final cac<Boolean> f9582cw = cac.m10529a(1, "gads:chrome_custom_tabs_browser:enabled", (Boolean) false);

    /* JADX INFO: renamed from: cx */
    public static final cac<Boolean> f9583cx = cac.m10529a(1, "gads:chrome_custom_tabs:disabled", (Boolean) false);

    /* JADX INFO: renamed from: cy */
    public static final cac<Boolean> f9584cy = cac.m10529a(1, "gads:drx_in_app_preview:enabled", (Boolean) true);

    /* JADX INFO: renamed from: cz */
    public static final cac<Boolean> f9585cz = cac.m10529a(1, "gads:drx_debug_signals:enabled", (Boolean) true);

    /* JADX INFO: renamed from: cA */
    public static final cac<String> f9534cA = cac.m10530a(1, "gads:drx_debug:debug_device_linking_url", "https://www.google.com/dfp/linkDevice");

    /* JADX INFO: renamed from: cB */
    public static final cac<String> f9535cB = cac.m10530a(1, "gads:drx_debug:in_app_preview_status_url", "https://www.google.com/dfp/inAppPreview");

    /* JADX INFO: renamed from: cC */
    public static final cac<String> f9536cC = cac.m10530a(1, "gads:drx_debug:debug_signal_status_url", "https://www.google.com/dfp/debugSignals");

    /* JADX INFO: renamed from: cD */
    public static final cac<String> f9537cD = cac.m10530a(1, "gads:drx_debug:send_debug_data_url", "https://www.google.com/dfp/sendDebugData");

    /* JADX INFO: renamed from: cE */
    public static final cac<Integer> f9538cE = cac.m10527a(1, "gads:drx_debug:timeout_ms", 5000);

    /* JADX INFO: renamed from: cF */
    public static final cac<Integer> f9539cF = cac.m10527a(1, "gad:pixel_dp_comparision_multiplier", 1);

    /* JADX INFO: renamed from: cG */
    public static final cac<Boolean> f9540cG = cac.m10529a(1, "gad:interstitial_for_multi_window", (Boolean) false);

    /* JADX INFO: renamed from: cH */
    public static final cac<Boolean> f9541cH = cac.m10529a(1, "gad:interstitial_ad_stay_active_in_multi_window", (Boolean) false);

    /* JADX INFO: renamed from: cI */
    public static final cac<Integer> f9542cI = cac.m10527a(1, "gad:interstitial:close_button_padding_dip", 0);

    /* JADX INFO: renamed from: cJ */
    public static final cac<Boolean> f9543cJ = cac.m10529a(1, "gads:clearcut_logging:enabled", (Boolean) false);

    /* JADX INFO: renamed from: cK */
    public static final cac<Boolean> f9544cK = cac.m10529a(0, "gad:force_local_ad_request_service:enabled", (Boolean) false);

    /* JADX INFO: renamed from: cL */
    public static final cac<Integer> f9545cL = cac.m10527a(1, "gad:http_redirect_max_count:times", 8);

    /* JADX INFO: renamed from: ec */
    private static cac<Boolean> f9642ec = cac.m10529a(0, "gads:nonagon:red_button", (Boolean) false);

    /* JADX INFO: renamed from: ed */
    private static cac<Boolean> f9643ed = cac.m10529a(1, "gads:nonagon:banner:enabled", (Boolean) false);

    /* JADX INFO: renamed from: ee */
    private static cac<String> f9644ee = cac.m10530a(1, "gads:nonagon:banner:ad_unit_exclusions", "(?!)");

    /* JADX INFO: renamed from: ef */
    private static cac<Boolean> f9645ef = cac.m10529a(1, "gads:nonagon:interstitial:enabled", (Boolean) false);

    /* JADX INFO: renamed from: eg */
    private static cac<String> f9646eg = cac.m10530a(1, "gads:nonagon:interstitial:ad_unit_exclusions", "(?!)");

    /* JADX INFO: renamed from: eh */
    private static cac<Boolean> f9647eh = cac.m10529a(1, "gads:nonagon:rewardedvideo:enabled", (Boolean) false);

    /* JADX INFO: renamed from: ei */
    private static cac<Boolean> f9648ei = cac.m10529a(1, "gads:nonagon:mobile_ads_setting_manager:enabled", (Boolean) false);

    /* JADX INFO: renamed from: ej */
    private static cac<String> f9649ej = cac.m10530a(1, "gads:nonagon:rewardedvideo:ad_unit_exclusions", "(?!)");

    /* JADX INFO: renamed from: ek */
    private static cac<Boolean> f9650ek = cac.m10529a(1, "gads:nonagon:nativead:enabled", (Boolean) false);

    /* JADX INFO: renamed from: el */
    private static cac<String> f9651el = cac.m10530a(1, "gads:nonagon:nativead:ad_unit_exclusions", "(?!)");

    /* JADX INFO: renamed from: em */
    private static cac<Boolean> f9652em = cac.m10529a(1, "gads:nonagon:service:enabled", (Boolean) false);

    /* JADX INFO: renamed from: cM */
    public static final cac<Long> f9546cM = cac.m10528a(1, "gads:mobius_linking:sdk_side_cooldown_time_threshold:ms", 3600000L);

    /* JADX INFO: renamed from: cN */
    public static final cac<String> f9547cN = cac.m10530a(0, "gads:public_beta:traffic_multiplier", "1.0");

    /* JADX INFO: renamed from: cO */
    public static final cac<Boolean> f9548cO = cac.m10529a(1, "gads:real_test_request:enabled", (Boolean) true);

    /* JADX INFO: renamed from: cP */
    public static final cac<Boolean> f9549cP = cac.m10529a(1, "gads:real_test_request:render_webview_label", (Boolean) true);

    /* JADX INFO: renamed from: cQ */
    public static final cac<Boolean> f9550cQ = cac.m10529a(1, "gads:real_test_request:render_native_label", (Boolean) true);

    /* JADX INFO: renamed from: a */
    public static List<String> m10548a() {
        return bxm.m10408e().m10539a();
    }

    /* JADX INFO: renamed from: a */
    public static void m10549a(Context context) {
        C1649iu.m11543a(context, new cao(context));
        int iIntValue = ((Integer) bxm.m10409f().m10546a(f9634dv)).intValue();
        if (iIntValue <= 0 || f9653en != null) {
            return;
        }
        f9653en = new byte[iIntValue];
    }

    /* JADX INFO: renamed from: a */
    public static void m10550a(Context context, int i, JSONObject jSONObject) {
        bxm.m10407d();
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("google_ads_flags", 0).edit();
        bxm.m10408e().m10540a(editorEdit, 1, jSONObject);
        bxm.m10407d();
        editorEdit.commit();
    }

    /* JADX INFO: renamed from: b */
    public static List<String> m10551b() {
        return bxm.m10408e().m10542b();
    }
}
