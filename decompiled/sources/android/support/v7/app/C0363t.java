package android.support.v7.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.support.v4.p007b.C0178e;
import android.util.Log;
import java.util.Calendar;

/* JADX INFO: renamed from: android.support.v7.app.t */
/* JADX INFO: loaded from: classes.dex */
class C0363t {

    /* JADX INFO: renamed from: a */
    private static C0363t f2060a;

    /* JADX INFO: renamed from: b */
    private final Context f2061b;

    /* JADX INFO: renamed from: c */
    private final LocationManager f2062c;

    /* JADX INFO: renamed from: d */
    private final a f2063d = new a();

    /* JADX INFO: renamed from: android.support.v7.app.t$a */
    private static class a {

        /* JADX INFO: renamed from: a */
        boolean f2064a;

        /* JADX INFO: renamed from: b */
        long f2065b;

        /* JADX INFO: renamed from: c */
        long f2066c;

        /* JADX INFO: renamed from: d */
        long f2067d;

        /* JADX INFO: renamed from: e */
        long f2068e;

        /* JADX INFO: renamed from: f */
        long f2069f;

        a() {
        }
    }

    C0363t(Context context, LocationManager locationManager) {
        this.f2061b = context;
        this.f2062c = locationManager;
    }

    /* JADX INFO: renamed from: a */
    private Location m2740a(String str) {
        try {
            if (this.f2062c.isProviderEnabled(str)) {
                return this.f2062c.getLastKnownLocation(str);
            }
        } catch (Exception e) {
            Log.d("TwilightManager", "Failed to get last known location", e);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    static C0363t m2741a(Context context) {
        if (f2060a == null) {
            Context applicationContext = context.getApplicationContext();
            f2060a = new C0363t(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f2060a;
    }

    /* JADX INFO: renamed from: a */
    private void m2742a(Location location) {
        long j;
        a aVar = this.f2063d;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C0362s c0362sM2738a = C0362s.m2738a();
        c0362sM2738a.m2739a(jCurrentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j2 = c0362sM2738a.f2057a;
        c0362sM2738a.m2739a(jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = c0362sM2738a.f2059c == 1;
        long j3 = c0362sM2738a.f2058b;
        long j4 = c0362sM2738a.f2057a;
        c0362sM2738a.m2739a(86400000 + jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
        long j5 = c0362sM2738a.f2058b;
        if (j3 == -1 || j4 == -1) {
            j = 43200000 + jCurrentTimeMillis;
        } else {
            j = (jCurrentTimeMillis > j4 ? 0 + j5 : jCurrentTimeMillis > j3 ? 0 + j4 : 0 + j3) + 60000;
        }
        aVar.f2064a = z;
        aVar.f2065b = j2;
        aVar.f2066c = j3;
        aVar.f2067d = j4;
        aVar.f2068e = j5;
        aVar.f2069f = j;
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: b */
    private Location m2743b() {
        Location locationM2740a = C0178e.m1373a(this.f2061b, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? m2740a("network") : null;
        Location locationM2740a2 = C0178e.m1373a(this.f2061b, "android.permission.ACCESS_FINE_LOCATION") == 0 ? m2740a("gps") : null;
        if (locationM2740a2 != null && locationM2740a != null) {
            return locationM2740a2.getTime() > locationM2740a.getTime() ? locationM2740a2 : locationM2740a;
        }
        if (locationM2740a2 == null) {
            locationM2740a2 = locationM2740a;
        }
        return locationM2740a2;
    }

    /* JADX INFO: renamed from: c */
    private boolean m2744c() {
        return this.f2063d.f2069f > System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: a */
    boolean m2745a() {
        a aVar = this.f2063d;
        if (m2744c()) {
            return aVar.f2064a;
        }
        Location locationM2743b = m2743b();
        if (locationM2743b != null) {
            m2742a(locationM2743b);
            return aVar.f2064a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i = Calendar.getInstance().get(11);
        return i < 6 || i >= 22;
    }
}
