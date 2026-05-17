package com.google.firebase.messaging;

import android.content.Context;
import android.os.Bundle;
import android.support.design.C0025a;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.bsb;
import com.google.android.gms.internal.bsq;
import com.google.android.gms.internal.bsr;
import com.google.android.gms.measurement.AppMeasurement;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.google.firebase.messaging.e */
/* JADX INFO: loaded from: classes.dex */
public final class C2319e {
    /* JADX INFO: renamed from: a */
    private static Bundle m13150a(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString(str, str2);
        return bundle;
    }

    /* JADX INFO: renamed from: a */
    private static bsr m13151a(byte[] bArr) {
        try {
            return bsr.m10179a(bArr);
        } catch (bsb e) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private static AppMeasurement m13152a(Context context) {
        try {
            return AppMeasurement.getInstance(context);
        } catch (NoClassDefFoundError e) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private static Object m13153a(bsr bsrVar, String str, C2318d c2318d) {
        Object objNewInstance;
        Exception e;
        try {
            Class<?> cls = Class.forName("com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty");
            Bundle bundleM13150a = m13150a(bsrVar.f8883a, bsrVar.f8884b);
            objNewInstance = cls.getConstructor(new Class[0]).newInstance(new Object[0]);
            try {
                cls.getField("mOrigin").set(objNewInstance, str);
                cls.getField("mCreationTimestamp").set(objNewInstance, Long.valueOf(bsrVar.f8885c));
                cls.getField("mName").set(objNewInstance, bsrVar.f8883a);
                cls.getField("mValue").set(objNewInstance, bsrVar.f8884b);
                cls.getField("mTriggerEventName").set(objNewInstance, TextUtils.isEmpty(bsrVar.f8886d) ? null : bsrVar.f8886d);
                cls.getField("mTimedOutEventName").set(objNewInstance, !TextUtils.isEmpty(bsrVar.f8892j) ? bsrVar.f8892j : c2318d.m13147b());
                cls.getField("mTimedOutEventParams").set(objNewInstance, bundleM13150a);
                cls.getField("mTriggerTimeout").set(objNewInstance, Long.valueOf(bsrVar.f8887e));
                cls.getField("mTriggeredEventName").set(objNewInstance, !TextUtils.isEmpty(bsrVar.f8890h) ? bsrVar.f8890h : c2318d.m13146a());
                cls.getField("mTriggeredEventParams").set(objNewInstance, bundleM13150a);
                cls.getField("mTimeToLive").set(objNewInstance, Long.valueOf(bsrVar.f8888f));
                cls.getField("mExpiredEventName").set(objNewInstance, !TextUtils.isEmpty(bsrVar.f8893k) ? bsrVar.f8893k : c2318d.m13148c());
                cls.getField("mExpiredEventParams").set(objNewInstance, bundleM13150a);
            } catch (Exception e2) {
                e = e2;
                Log.e("FirebaseAbtUtil", "Could not complete the operation due to an internal error.", e);
            }
        } catch (Exception e3) {
            objNewInstance = null;
            e = e3;
        }
        return objNewInstance;
    }

    /* JADX INFO: renamed from: a */
    private static String m13154a(bsr bsrVar, C2318d c2318d) {
        return (bsrVar == null || TextUtils.isEmpty(bsrVar.f8891i)) ? c2318d.m13149d() : bsrVar.f8891i;
    }

    /* JADX INFO: renamed from: a */
    private static String m13155a(Object obj) {
        return (String) Class.forName("com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty").getField("mName").get(obj);
    }

    /* JADX INFO: renamed from: a */
    private static List<Object> m13156a(AppMeasurement appMeasurement, String str) {
        List<Object> list;
        ArrayList arrayList = new ArrayList();
        try {
            Method declaredMethod = AppMeasurement.class.getDeclaredMethod("getConditionalUserProperties", String.class, String.class);
            declaredMethod.setAccessible(true);
            list = (List) declaredMethod.invoke(appMeasurement, str, "");
        } catch (Exception e) {
            Log.e("FirebaseAbtUtil", "Could not complete the operation due to an internal error.", e);
            list = arrayList;
        }
        if (Log.isLoggable("FirebaseAbtUtil", 2)) {
            Log.v("FirebaseAbtUtil", new StringBuilder(String.valueOf(str).length() + 55).append("Number of currently set _Es for origin: ").append(str).append(" is ").append(list.size()).toString());
        }
        return list;
    }

    /* JADX INFO: renamed from: a */
    private static void m13157a(Context context, String str, String str2, String str3, String str4) {
        if (Log.isLoggable("FirebaseAbtUtil", 2)) {
            String strValueOf = String.valueOf(str);
            Log.v("FirebaseAbtUtil", strValueOf.length() != 0 ? "_CE(experimentId) called by ".concat(strValueOf) : new String("_CE(experimentId) called by "));
        }
        if (m13162b(context)) {
            AppMeasurement appMeasurementM13152a = m13152a(context);
            try {
                Method declaredMethod = AppMeasurement.class.getDeclaredMethod("clearConditionalUserProperty", String.class, String.class, Bundle.class);
                declaredMethod.setAccessible(true);
                if (Log.isLoggable("FirebaseAbtUtil", 2)) {
                    Log.v("FirebaseAbtUtil", new StringBuilder(String.valueOf(str2).length() + 17 + String.valueOf(str3).length()).append("Clearing _E: [").append(str2).append(", ").append(str3).append("]").toString());
                }
                declaredMethod.invoke(appMeasurementM13152a, str2, str4, m13150a(str2, str3));
            } catch (Exception e) {
                Log.e("FirebaseAbtUtil", "Could not complete the operation due to an internal error.", e);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m13158a(Context context, String str, byte[] bArr, C2318d c2318d, int i) {
        if (Log.isLoggable("FirebaseAbtUtil", 2)) {
            String strValueOf = String.valueOf(str);
            Log.v("FirebaseAbtUtil", strValueOf.length() != 0 ? "_SE called by ".concat(strValueOf) : new String("_SE called by "));
        }
        if (m13162b(context)) {
            AppMeasurement appMeasurementM13152a = m13152a(context);
            bsr bsrVarM13151a = m13151a(bArr);
            if (bsrVarM13151a == null) {
                if (Log.isLoggable("FirebaseAbtUtil", 2)) {
                    Log.v("FirebaseAbtUtil", "_SE failed; either _P was not set, or we couldn't deserialize the _P.");
                    return;
                }
                return;
            }
            try {
                Class.forName("com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty");
                boolean z = false;
                for (Object obj : m13156a(appMeasurementM13152a, str)) {
                    String strM13155a = m13155a(obj);
                    String strM13161b = m13161b(obj);
                    long jLongValue = ((Long) Class.forName("com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty").getField("mCreationTimestamp").get(obj)).longValue();
                    if (bsrVarM13151a.f8883a.equals(strM13155a) && bsrVarM13151a.f8884b.equals(strM13161b)) {
                        if (Log.isLoggable("FirebaseAbtUtil", 2)) {
                            Log.v("FirebaseAbtUtil", new StringBuilder(String.valueOf(strM13155a).length() + 23 + String.valueOf(strM13161b).length()).append("_E is already set. [").append(strM13155a).append(", ").append(strM13161b).append("]").toString());
                        }
                        z = true;
                    } else {
                        boolean z2 = false;
                        bsq[] bsqVarArr = bsrVarM13151a.f8895m;
                        int length = bsqVarArr.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                break;
                            }
                            if (bsqVarArr[i2].f8882a.equals(strM13155a)) {
                                if (Log.isLoggable("FirebaseAbtUtil", 2)) {
                                    Log.v("FirebaseAbtUtil", new StringBuilder(String.valueOf(strM13155a).length() + 33 + String.valueOf(strM13161b).length()).append("_E is found in the _OE list. [").append(strM13155a).append(", ").append(strM13161b).append("]").toString());
                                }
                                z2 = true;
                            } else {
                                i2++;
                            }
                        }
                        if (!z2) {
                            if (bsrVarM13151a.f8885c > jLongValue) {
                                if (Log.isLoggable("FirebaseAbtUtil", 2)) {
                                    Log.v("FirebaseAbtUtil", new StringBuilder(String.valueOf(strM13155a).length() + C0025a.j.AppCompatTheme_windowFixedWidthMinor + String.valueOf(strM13161b).length()).append("Clearing _E as it was not in the _OE list, andits start time is older than the start time of the _E to be set. [").append(strM13155a).append(", ").append(strM13161b).append("]").toString());
                                }
                                m13157a(context, str, strM13155a, strM13161b, m13154a(bsrVarM13151a, c2318d));
                            } else if (Log.isLoggable("FirebaseAbtUtil", 2)) {
                                Log.v("FirebaseAbtUtil", new StringBuilder(String.valueOf(strM13155a).length() + C0025a.j.AppCompatTheme_windowActionBar + String.valueOf(strM13161b).length()).append("_E was not found in the _OE list, but not clearing it as it has a new start time than the _E to be set.  [").append(strM13155a).append(", ").append(strM13161b).append("]").toString());
                            }
                        }
                    }
                }
                if (!z) {
                    m13159a(appMeasurementM13152a, context, str, bsrVarM13151a, c2318d, 1);
                } else if (Log.isLoggable("FirebaseAbtUtil", 2)) {
                    String str2 = bsrVarM13151a.f8883a;
                    String str3 = bsrVarM13151a.f8884b;
                    Log.v("FirebaseAbtUtil", new StringBuilder(String.valueOf(str2).length() + 44 + String.valueOf(str3).length()).append("_E is already set. Not setting it again [").append(str2).append(", ").append(str3).append("]").toString());
                }
            } catch (Exception e) {
                Log.e("FirebaseAbtUtil", "Could not complete the operation due to an internal error.", e);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m13159a(AppMeasurement appMeasurement, Context context, String str, bsr bsrVar, C2318d c2318d, int i) {
        if (Log.isLoggable("FirebaseAbtUtil", 2)) {
            String str2 = bsrVar.f8883a;
            String str3 = bsrVar.f8884b;
            Log.v("FirebaseAbtUtil", new StringBuilder(String.valueOf(str2).length() + 7 + String.valueOf(str3).length()).append("_SEI: ").append(str2).append(" ").append(str3).toString());
        }
        try {
            Class.forName("com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty");
            List<Object> listM13156a = m13156a(appMeasurement, str);
            if (m13156a(appMeasurement, str).size() >= m13160b(appMeasurement, str)) {
                if ((bsrVar.f8894l != 0 ? bsrVar.f8894l : 1) != 1) {
                    if (Log.isLoggable("FirebaseAbtUtil", 2)) {
                        String str4 = bsrVar.f8883a;
                        String str5 = bsrVar.f8884b;
                        Log.v("FirebaseAbtUtil", new StringBuilder(String.valueOf(str4).length() + 44 + String.valueOf(str5).length()).append("_E won't be set due to overflow policy. [").append(str4).append(", ").append(str5).append("]").toString());
                        return;
                    }
                    return;
                }
                Object obj = listM13156a.get(0);
                String strM13155a = m13155a(obj);
                String strM13161b = m13161b(obj);
                if (Log.isLoggable("FirebaseAbtUtil", 2)) {
                    Log.v("FirebaseAbtUtil", new StringBuilder(String.valueOf(strM13155a).length() + 38).append("Clearing _E due to overflow policy: [").append(strM13155a).append("]").toString());
                }
                m13157a(context, str, strM13155a, strM13161b, m13154a(bsrVar, c2318d));
            }
            for (Object obj2 : listM13156a) {
                String strM13155a2 = m13155a(obj2);
                String strM13161b2 = m13161b(obj2);
                if (strM13155a2.equals(bsrVar.f8883a) && !strM13161b2.equals(bsrVar.f8884b) && Log.isLoggable("FirebaseAbtUtil", 2)) {
                    Log.v("FirebaseAbtUtil", new StringBuilder(String.valueOf(strM13155a2).length() + 77 + String.valueOf(strM13161b2).length()).append("Clearing _E, as only one _V of the same _E can be set atany given time: [").append(strM13155a2).append(", ").append(strM13161b2).append("].").toString());
                    m13157a(context, str, strM13155a2, strM13161b2, m13154a(bsrVar, c2318d));
                }
            }
            Object objM13153a = m13153a(bsrVar, str, c2318d);
            if (objM13153a == null) {
                if (Log.isLoggable("FirebaseAbtUtil", 2)) {
                    String str6 = bsrVar.f8883a;
                    String str7 = bsrVar.f8884b;
                    Log.v("FirebaseAbtUtil", new StringBuilder(String.valueOf(str6).length() + 42 + String.valueOf(str7).length()).append("Could not create _CUP for: [").append(str6).append(", ").append(str7).append("]. Skipping.").toString());
                    return;
                }
                return;
            }
            try {
                Method declaredMethod = AppMeasurement.class.getDeclaredMethod("setConditionalUserProperty", Class.forName("com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty"));
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(appMeasurement, objM13153a);
            } catch (Exception e) {
                Log.e("FirebaseAbtUtil", "Could not complete the operation due to an internal error.", e);
            }
        } catch (Exception e2) {
            Log.e("FirebaseAbtUtil", "Could not complete the operation due to an internal error.", e2);
        }
    }

    /* JADX INFO: renamed from: b */
    private static int m13160b(AppMeasurement appMeasurement, String str) {
        try {
            Method declaredMethod = AppMeasurement.class.getDeclaredMethod("getMaxUserProperties", String.class);
            declaredMethod.setAccessible(true);
            return ((Integer) declaredMethod.invoke(appMeasurement, str)).intValue();
        } catch (Exception e) {
            Log.e("FirebaseAbtUtil", "Could not complete the operation due to an internal error.", e);
            return 20;
        }
    }

    /* JADX INFO: renamed from: b */
    private static String m13161b(Object obj) {
        return (String) Class.forName("com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty").getField("mValue").get(obj);
    }

    /* JADX INFO: renamed from: b */
    private static boolean m13162b(Context context) {
        if (m13152a(context) == null) {
            if (!Log.isLoggable("FirebaseAbtUtil", 2)) {
                return false;
            }
            Log.v("FirebaseAbtUtil", "Firebase Analytics not available");
            return false;
        }
        try {
            Class.forName("com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty");
            return true;
        } catch (ClassNotFoundException e) {
            if (!Log.isLoggable("FirebaseAbtUtil", 2)) {
                return false;
            }
            Log.v("FirebaseAbtUtil", "Firebase Analytics library is missing support for abt. Please update to a more recent version.");
            return false;
        }
    }
}
