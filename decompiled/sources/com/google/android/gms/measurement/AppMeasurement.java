package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Keep;
import android.support.v4.p018i.C0207a;
import com.google.android.gms.common.api.internal.C1111az;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.internal.abd;
import com.google.android.gms.internal.aeh;
import com.google.android.gms.internal.aek;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Deprecated
public class AppMeasurement {
    public static final String CRASH_ORIGIN = "crash";
    public static final String FCM_ORIGIN = "fcm";
    private final abd zziwf;

    public static class ConditionalUserProperty {

        @Keep
        public boolean mActive;

        @Keep
        public String mAppId;

        @Keep
        public long mCreationTimestamp;

        @Keep
        public String mExpiredEventName;

        @Keep
        public Bundle mExpiredEventParams;

        @Keep
        public String mName;

        @Keep
        public String mOrigin;

        @Keep
        public long mTimeToLive;

        @Keep
        public String mTimedOutEventName;

        @Keep
        public Bundle mTimedOutEventParams;

        @Keep
        public String mTriggerEventName;

        @Keep
        public long mTriggerTimeout;

        @Keep
        public String mTriggeredEventName;

        @Keep
        public Bundle mTriggeredEventParams;

        @Keep
        public long mTriggeredTimestamp;

        @Keep
        public Object mValue;

        public ConditionalUserProperty() {
        }

        public ConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
            C1221aj.m7065a(conditionalUserProperty);
            this.mAppId = conditionalUserProperty.mAppId;
            this.mOrigin = conditionalUserProperty.mOrigin;
            this.mCreationTimestamp = conditionalUserProperty.mCreationTimestamp;
            this.mName = conditionalUserProperty.mName;
            if (conditionalUserProperty.mValue != null) {
                this.mValue = aek.m7733b(conditionalUserProperty.mValue);
                if (this.mValue == null) {
                    this.mValue = conditionalUserProperty.mValue;
                }
            }
            this.mValue = conditionalUserProperty.mValue;
            this.mActive = conditionalUserProperty.mActive;
            this.mTriggerEventName = conditionalUserProperty.mTriggerEventName;
            this.mTriggerTimeout = conditionalUserProperty.mTriggerTimeout;
            this.mTimedOutEventName = conditionalUserProperty.mTimedOutEventName;
            if (conditionalUserProperty.mTimedOutEventParams != null) {
                this.mTimedOutEventParams = new Bundle(conditionalUserProperty.mTimedOutEventParams);
            }
            this.mTriggeredEventName = conditionalUserProperty.mTriggeredEventName;
            if (conditionalUserProperty.mTriggeredEventParams != null) {
                this.mTriggeredEventParams = new Bundle(conditionalUserProperty.mTriggeredEventParams);
            }
            this.mTriggeredTimestamp = conditionalUserProperty.mTriggeredTimestamp;
            this.mTimeToLive = conditionalUserProperty.mTimeToLive;
            this.mExpiredEventName = conditionalUserProperty.mExpiredEventName;
            if (conditionalUserProperty.mExpiredEventParams != null) {
                this.mExpiredEventParams = new Bundle(conditionalUserProperty.mExpiredEventParams);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.measurement.AppMeasurement$a */
    public static final class C2114a extends FirebaseAnalytics.C2152a {

        /* JADX INFO: renamed from: a */
        public static final String[] f12753a = {"app_clear_data", "app_exception", "app_remove", "app_upgrade", "app_install", "app_update", "firebase_campaign", "error", "first_open", "first_visit", "in_app_purchase", "notification_dismiss", "notification_foreground", "notification_open", "notification_receive", "os_update", "session_start", "user_engagement", "ad_exposure", "adunit_exposure", "ad_query", "ad_activeview", "ad_impression", "ad_click", "screen_view", "firebase_extra_parameter"};

        /* JADX INFO: renamed from: b */
        public static final String[] f12754b = {"_cd", "_ae", "_ui", "_ug", "_in", "_au", "_cmp", "_err", "_f", "_v", "_iap", "_nd", "_nf", "_no", "_nr", "_ou", "_s", "_e", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "_vs", "_ep"};

        /* JADX INFO: renamed from: a */
        public static String m12796a(String str) {
            return aek.m7717a(str, f12753a, f12754b);
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.measurement.AppMeasurement$b */
    public interface InterfaceC2115b {
        /* JADX INFO: renamed from: a */
        void mo12797a(String str, String str2, Bundle bundle, long j);
    }

    /* JADX INFO: renamed from: com.google.android.gms.measurement.AppMeasurement$c */
    public interface InterfaceC2116c {
        /* JADX INFO: renamed from: a */
        void mo8795a(String str, String str2, Bundle bundle, long j);
    }

    /* JADX INFO: renamed from: com.google.android.gms.measurement.AppMeasurement$d */
    public static final class C2117d extends FirebaseAnalytics.C2153b {

        /* JADX INFO: renamed from: a */
        public static final String[] f12755a = {"firebase_conversion", "engagement_time_msec", "exposure_time", "ad_event_id", "ad_unit_id", "firebase_error", "firebase_error_value", "firebase_error_length", "firebase_event_origin", "firebase_screen", "firebase_screen_class", "firebase_screen_id", "firebase_previous_screen", "firebase_previous_class", "firebase_previous_id", "message_device_time", "message_id", "message_name", "message_time", "previous_app_version", "previous_os_version", "topic", "update_with_analytics", "previous_first_open_count", "system_app", "system_app_update", "previous_install_count", "firebase_event_id", "firebase_extra_params_ct", "firebase_group_name", "firebase_list_length", "firebase_index", "firebase_event_name"};

        /* JADX INFO: renamed from: b */
        public static final String[] f12756b = {"_c", "_et", "_xt", "_aeid", "_ai", "_err", "_ev", "_el", "_o", "_sn", "_sc", "_si", "_pn", "_pc", "_pi", "_ndt", "_nmid", "_nmn", "_nmt", "_pv", "_po", "_nt", "_uwa", "_pfo", "_sys", "_sysu", "_pin", "_eid", "_epc", "_gn", "_ll", "_i", "_en"};

        /* JADX INFO: renamed from: a */
        public static String m12798a(String str) {
            return aek.m7717a(str, f12755a, f12756b);
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.measurement.AppMeasurement$e */
    public static final class C2118e extends FirebaseAnalytics.C2154c {

        /* JADX INFO: renamed from: a */
        public static final String[] f12757a = {"firebase_last_notification", "first_open_time", "first_visit_time", "last_deep_link_referrer", "user_id", "first_open_after_install"};

        /* JADX INFO: renamed from: b */
        public static final String[] f12758b = {"_ln", "_fot", "_fvt", "_ldl", "_id", "_fi"};

        /* JADX INFO: renamed from: a */
        public static String m12799a(String str) {
            return aek.m7717a(str, f12757a, f12758b);
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.measurement.AppMeasurement$f */
    public interface InterfaceC2119f {
        /* JADX INFO: renamed from: a */
        boolean m12800a(C2120g c2120g, C2120g c2120g2);
    }

    /* JADX INFO: renamed from: com.google.android.gms.measurement.AppMeasurement$g */
    public static class C2120g {

        /* JADX INFO: renamed from: b */
        public String f12759b;

        /* JADX INFO: renamed from: c */
        public String f12760c;

        /* JADX INFO: renamed from: d */
        public long f12761d;

        public C2120g() {
        }

        public C2120g(C2120g c2120g) {
            this.f12759b = c2120g.f12759b;
            this.f12760c = c2120g.f12760c;
            this.f12761d = c2120g.f12761d;
        }
    }

    public AppMeasurement(abd abdVar) {
        C1221aj.m7065a(abdVar);
        this.zziwf = abdVar;
    }

    @Keep
    @Deprecated
    public static AppMeasurement getInstance(Context context) {
        return abd.m7497a(context).m7547m();
    }

    @Keep
    public void beginAdUnitExposure(String str) {
        this.zziwf.m7511A().m12615a(str);
    }

    @Keep
    protected void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.zziwf.m7546l().m7624b(str, str2, bundle);
    }

    @Keep
    protected void clearConditionalUserPropertyAs(String str, String str2, String str3, Bundle bundle) {
        this.zziwf.m7546l().m7618a(str, str2, str3, bundle);
    }

    @Keep
    public void endAdUnitExposure(String str) {
        this.zziwf.m7511A().m12616b(str);
    }

    @Keep
    public long generateEventId() {
        return this.zziwf.m7549o().m7772y();
    }

    @Keep
    public String getAppInstanceId() {
        return this.zziwf.m7546l().m7627z();
    }

    @Keep
    protected List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        return this.zziwf.m7546l().m7605a(str, str2);
    }

    @Keep
    protected List<ConditionalUserProperty> getConditionalUserPropertiesAs(String str, String str2, String str3) {
        return this.zziwf.m7546l().m7606a(str, str2, str3);
    }

    @Keep
    public String getCurrentScreenClass() {
        C2120g c2120gM7643z = this.zziwf.m7556v().m7643z();
        if (c2120gM7643z != null) {
            return c2120gM7643z.f12760c;
        }
        return null;
    }

    @Keep
    public String getCurrentScreenName() {
        C2120g c2120gM7643z = this.zziwf.m7556v().m7643z();
        if (c2120gM7643z != null) {
            return c2120gM7643z.f12759b;
        }
        return null;
    }

    @Keep
    public String getGmpAppId() {
        try {
            return C1111az.m6849a();
        } catch (IllegalStateException e) {
            this.zziwf.m7540f().m7410y().m7413a("getGoogleAppId failed with exception", e);
            return null;
        }
    }

    @Keep
    protected int getMaxUserProperties(String str) {
        this.zziwf.m7546l();
        C1221aj.m7067a(str);
        return 25;
    }

    @Keep
    protected Map<String, Object> getUserProperties(String str, String str2, boolean z) {
        return this.zziwf.m7546l().m7608a(str, str2, z);
    }

    public Map<String, Object> getUserProperties(boolean z) {
        List<aeh> listM7620b = this.zziwf.m7546l().m7620b(z);
        C0207a c0207a = new C0207a(listM7620b.size());
        for (aeh aehVar : listM7620b) {
            c0207a.put(aehVar.f6488a, aehVar.m7712a());
        }
        return c0207a;
    }

    @Keep
    protected Map<String, Object> getUserPropertiesAs(String str, String str2, String str3, boolean z) {
        return this.zziwf.m7546l().m7607a(str, str2, str3, z);
    }

    public final void logEvent(String str, Bundle bundle) {
        int iM7759b;
        if (bundle == null) {
            bundle = new Bundle();
        }
        if ("_iap".equals(str) || (iM7759b = this.zziwf.m7549o().m7759b(str)) == 0) {
            this.zziwf.m7546l().m7616a("app", str, bundle, true);
        } else {
            this.zziwf.m7549o();
            this.zziwf.m7549o().m7751a(iM7759b, "_ev", aek.m7716a(str, 40, true), str != null ? str.length() : 0);
        }
    }

    @Keep
    public void logEventInternal(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.zziwf.m7546l().m7614a(str, str2, bundle);
    }

    public void logEventInternalNoInterceptor(String str, String str2, Bundle bundle, long j) {
        this.zziwf.m7546l().m7615a(str, str2, bundle == null ? new Bundle() : bundle, j);
    }

    public void registerOnMeasurementEventListener(InterfaceC2116c interfaceC2116c) {
        this.zziwf.m7546l().m7612a(interfaceC2116c);
    }

    @Keep
    public void registerOnScreenChangeCallback(InterfaceC2119f interfaceC2119f) {
        this.zziwf.m7556v().m7636a(interfaceC2119f);
    }

    @Keep
    protected void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        this.zziwf.m7546l().m7610a(conditionalUserProperty);
    }

    @Keep
    protected void setConditionalUserPropertyAs(ConditionalUserProperty conditionalUserProperty) {
        this.zziwf.m7546l().m7622b(conditionalUserProperty);
    }

    public void setEventInterceptor(InterfaceC2115b interfaceC2115b) {
        this.zziwf.m7546l().m7611a(interfaceC2115b);
    }

    @Deprecated
    public void setMeasurementEnabled(boolean z) {
        this.zziwf.m7546l().m7619a(z);
    }

    public final void setMinimumSessionDuration(long j) {
        this.zziwf.m7546l().m7609a(j);
    }

    public final void setSessionTimeoutDuration(long j) {
        this.zziwf.m7546l().m7621b(j);
    }

    public final void setUserProperty(String str, String str2) {
        int iM7765d = this.zziwf.m7549o().m7765d(str);
        if (iM7765d == 0) {
            setUserPropertyInternal("app", str, str2);
        } else {
            this.zziwf.m7549o();
            this.zziwf.m7549o().m7751a(iM7765d, "_ev", aek.m7716a(str, 24, true), str != null ? str.length() : 0);
        }
    }

    public void setUserPropertyInternal(String str, String str2, Object obj) {
        this.zziwf.m7546l().m7617a(str, str2, obj);
    }

    public void unregisterOnMeasurementEventListener(InterfaceC2116c interfaceC2116c) {
        this.zziwf.m7546l().m7623b(interfaceC2116c);
    }

    @Keep
    public void unregisterOnScreenChangeCallback(InterfaceC2119f interfaceC2119f) {
        this.zziwf.m7556v().m7639b(interfaceC2119f);
    }
}
