package android.support.v7.p027d;

import android.annotation.TargetApi;
import android.media.MediaRouter;

/* JADX INFO: renamed from: android.support.v7.d.k */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(18)
final class C0380k {

    /* JADX INFO: renamed from: android.support.v7.d.k$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static CharSequence m3051a(Object obj) {
            return ((MediaRouter.RouteInfo) obj).getDescription();
        }

        /* JADX INFO: renamed from: b */
        public static boolean m3052b(Object obj) {
            return ((MediaRouter.RouteInfo) obj).isConnecting();
        }
    }

    /* JADX INFO: renamed from: android.support.v7.d.k$b */
    public static final class b {
        /* JADX INFO: renamed from: a */
        public static void m3053a(Object obj, CharSequence charSequence) {
            ((MediaRouter.UserRouteInfo) obj).setDescription(charSequence);
        }
    }

    /* JADX INFO: renamed from: a */
    public static Object m3049a(Object obj) {
        return ((MediaRouter) obj).getDefaultRoute();
    }

    /* JADX INFO: renamed from: a */
    public static void m3050a(Object obj, int i, Object obj2, int i2) {
        ((MediaRouter) obj).addCallback(i, (MediaRouter.Callback) obj2, i2);
    }
}
