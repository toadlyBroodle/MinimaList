package android.support.v4.p011d.p012a;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.view.WindowManager;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: android.support.v4.d.a.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0194a {

    /* JADX INFO: renamed from: a */
    private static final WeakHashMap<Context, AbstractC0194a> f1156a = new WeakHashMap<>();

    /* JADX INFO: renamed from: android.support.v4.d.a.a$a */
    private static class a extends AbstractC0194a {

        /* JADX INFO: renamed from: a */
        private final WindowManager f1157a;

        a(Context context) {
            this.f1157a = (WindowManager) context.getSystemService("window");
        }
    }

    /* JADX INFO: renamed from: android.support.v4.d.a.a$b */
    private static class b extends AbstractC0194a {

        /* JADX INFO: renamed from: a */
        private final DisplayManager f1158a;

        b(Context context) {
            this.f1158a = (DisplayManager) context.getSystemService("display");
        }
    }

    AbstractC0194a() {
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC0194a m1459a(Context context) {
        AbstractC0194a bVar;
        synchronized (f1156a) {
            bVar = f1156a.get(context);
            if (bVar == null) {
                bVar = Build.VERSION.SDK_INT >= 17 ? new b(context) : new a(context);
                f1156a.put(context, bVar);
            }
        }
        return bVar;
    }
}
