package android.support.v4.p006a;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.p007b.C0175b;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: android.support.v4.a.ak */
/* JADX INFO: loaded from: classes.dex */
public final class C0145ak implements Iterable<Intent> {

    /* JADX INFO: renamed from: a */
    private static final c f745a;

    /* JADX INFO: renamed from: b */
    private final ArrayList<Intent> f746b = new ArrayList<>();

    /* JADX INFO: renamed from: c */
    private final Context f747c;

    /* JADX INFO: renamed from: android.support.v4.a.ak$a */
    public interface a {
        /* JADX INFO: renamed from: a_ */
        Intent mo827a_();
    }

    /* JADX INFO: renamed from: android.support.v4.a.ak$b */
    static class b extends c {
        b() {
        }

        @Override // android.support.v4.p006a.C0145ak.c
        /* JADX INFO: renamed from: a */
        public PendingIntent mo828a(Context context, Intent[] intentArr, int i, int i2, Bundle bundle) {
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            return PendingIntent.getActivities(context, i, intentArr, i2, bundle);
        }
    }

    /* JADX INFO: renamed from: android.support.v4.a.ak$c */
    static class c {
        c() {
        }

        /* JADX INFO: renamed from: a */
        public PendingIntent mo828a(Context context, Intent[] intentArr, int i, int i2, Bundle bundle) {
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            return PendingIntent.getActivities(context, i, intentArr, i2);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 16) {
            f745a = new b();
        } else {
            f745a = new c();
        }
    }

    private C0145ak(Context context) {
        this.f747c = context;
    }

    /* JADX INFO: renamed from: a */
    public static C0145ak m818a(Context context) {
        return new C0145ak(context);
    }

    /* JADX INFO: renamed from: a */
    public PendingIntent m819a(int i, int i2) {
        return m820a(i, i2, null);
    }

    /* JADX INFO: renamed from: a */
    public PendingIntent m820a(int i, int i2, Bundle bundle) {
        if (this.f746b.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
        }
        Intent[] intentArr = (Intent[]) this.f746b.toArray(new Intent[this.f746b.size()]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        return f745a.mo828a(this.f747c, intentArr, i, i2, bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public C0145ak m821a(Activity activity) {
        Intent intentMo827a_ = activity instanceof a ? ((a) activity).mo827a_() : null;
        Intent intentM1286a = intentMo827a_ == null ? C0170z.m1286a(activity) : intentMo827a_;
        if (intentM1286a != null) {
            ComponentName component = intentM1286a.getComponent();
            if (component == null) {
                component = intentM1286a.resolveActivity(this.f747c.getPackageManager());
            }
            m822a(component);
            m823a(intentM1286a);
        }
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C0145ak m822a(ComponentName componentName) {
        int size = this.f746b.size();
        try {
            Intent intentM1287a = C0170z.m1287a(this.f747c, componentName);
            while (intentM1287a != null) {
                this.f746b.add(size, intentM1287a);
                intentM1287a = C0170z.m1287a(this.f747c, intentM1287a.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    /* JADX INFO: renamed from: a */
    public C0145ak m823a(Intent intent) {
        this.f746b.add(intent);
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C0145ak m824a(Class<?> cls) {
        return m822a(new ComponentName(this.f747c, cls));
    }

    /* JADX INFO: renamed from: a */
    public void m825a() {
        m826a((Bundle) null);
    }

    /* JADX INFO: renamed from: a */
    public void m826a(Bundle bundle) {
        if (this.f746b.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) this.f746b.toArray(new Intent[this.f746b.size()]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (C0175b.m1339a(this.f747c, intentArr, bundle)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        this.f747c.startActivity(intent);
    }

    @Override // java.lang.Iterable
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f746b.iterator();
    }
}
