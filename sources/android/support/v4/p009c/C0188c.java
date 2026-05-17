package android.support.v4.p009c;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import android.support.v4.p007b.p008a.C0172a;
import android.support.v4.p007b.p008a.C0173b;
import android.support.v4.p017h.C0205b;
import android.support.v4.p018i.C0213g;

/* JADX INFO: renamed from: android.support.v4.c.c */
/* JADX INFO: loaded from: classes.dex */
public class C0188c {

    /* JADX INFO: renamed from: a */
    private static final a f1141a;

    /* JADX INFO: renamed from: b */
    private static final C0213g<String, Typeface> f1142b;

    /* JADX INFO: renamed from: android.support.v4.c.c$a */
    interface a {
        /* JADX INFO: renamed from: a */
        Typeface mo1431a(Context context, Resources resources, int i, String str, int i2);

        /* JADX INFO: renamed from: a */
        Typeface mo1432a(Context context, CancellationSignal cancellationSignal, C0205b.b[] bVarArr, int i);

        /* JADX INFO: renamed from: a */
        Typeface mo1433a(Context context, C0172a.b bVar, Resources resources, int i);
    }

    static {
        if (Build.VERSION.SDK_INT >= 26) {
            f1141a = new C0191f();
        } else if (Build.VERSION.SDK_INT >= 24 && C0190e.m1436a()) {
            f1141a = new C0190e();
        } else if (Build.VERSION.SDK_INT >= 21) {
            f1141a = new C0189d();
        } else {
            f1141a = new C0192g();
        }
        f1142b = new C0213g<>(16);
    }

    /* JADX INFO: renamed from: a */
    public static Typeface m1426a(Context context, Resources resources, int i, String str, int i2) {
        Typeface typefaceMo1431a = f1141a.mo1431a(context, resources, i, str, i2);
        if (typefaceMo1431a != null) {
            f1142b.m1551a(m1430b(resources, i, i2), typefaceMo1431a);
        }
        return typefaceMo1431a;
    }

    /* JADX INFO: renamed from: a */
    public static Typeface m1427a(Context context, CancellationSignal cancellationSignal, C0205b.b[] bVarArr, int i) {
        return f1141a.mo1432a(context, cancellationSignal, bVarArr, i);
    }

    /* JADX INFO: renamed from: a */
    public static Typeface m1428a(Context context, C0172a.a aVar, Resources resources, int i, int i2, C0173b.a aVar2, Handler handler, boolean z) {
        Typeface typefaceMo1433a;
        boolean z2 = true;
        if (aVar instanceof C0172a.d) {
            C0172a.d dVar = (C0172a.d) aVar;
            if (z) {
                if (dVar.m1318b() != 0) {
                    z2 = false;
                }
            } else if (aVar2 != null) {
                z2 = false;
            }
            typefaceMo1433a = C0205b.m1480a(context, dVar.m1317a(), aVar2, handler, z2, z ? dVar.m1319c() : -1, i2);
        } else {
            typefaceMo1433a = f1141a.mo1433a(context, (C0172a.b) aVar, resources, i2);
            if (aVar2 != null) {
                if (typefaceMo1433a != null) {
                    aVar2.m1327a(typefaceMo1433a, handler);
                } else {
                    aVar2.m1325a(-3, handler);
                }
            }
        }
        if (typefaceMo1433a != null) {
            f1142b.m1551a(m1430b(resources, i, i2), typefaceMo1433a);
        }
        return typefaceMo1433a;
    }

    /* JADX INFO: renamed from: a */
    public static Typeface m1429a(Resources resources, int i, int i2) {
        return f1142b.m1550a(m1430b(resources, i, i2));
    }

    /* JADX INFO: renamed from: b */
    private static String m1430b(Resources resources, int i, int i2) {
        return resources.getResourcePackageName(i) + "-" + i + "-" + i2;
    }
}
