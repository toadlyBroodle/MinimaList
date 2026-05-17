package android.support.v7.p027d;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.media.MediaRouter;
import android.os.Build;
import android.os.Handler;
import android.support.v7.p027d.C0378i;
import android.util.Log;
import android.view.Display;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: android.support.v7.d.j */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(17)
final class C0379j {

    /* JADX INFO: renamed from: android.support.v7.d.j$a */
    public static final class a implements Runnable {

        /* JADX INFO: renamed from: a */
        private final DisplayManager f2236a;

        /* JADX INFO: renamed from: b */
        private final Handler f2237b;

        /* JADX INFO: renamed from: c */
        private Method f2238c;

        /* JADX INFO: renamed from: d */
        private boolean f2239d;

        public a(Context context, Handler handler) {
            if (Build.VERSION.SDK_INT != 17) {
                throw new UnsupportedOperationException();
            }
            this.f2236a = (DisplayManager) context.getSystemService("display");
            this.f2237b = handler;
            try {
                this.f2238c = DisplayManager.class.getMethod("scanWifiDisplays", new Class[0]);
            } catch (NoSuchMethodException e) {
            }
        }

        /* JADX INFO: renamed from: a */
        public void m3044a(int i) {
            if ((i & 2) == 0) {
                if (this.f2239d) {
                    this.f2239d = false;
                    this.f2237b.removeCallbacks(this);
                    return;
                }
                return;
            }
            if (this.f2239d) {
                return;
            }
            if (this.f2238c == null) {
                Log.w("MediaRouterJellybeanMr1", "Cannot scan for wifi displays because the DisplayManager.scanWifiDisplays() method is not available on this device.");
            } else {
                this.f2239d = true;
                this.f2237b.post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f2239d) {
                try {
                    this.f2238c.invoke(this.f2236a, new Object[0]);
                } catch (IllegalAccessException e) {
                    Log.w("MediaRouterJellybeanMr1", "Cannot scan for wifi displays.", e);
                } catch (InvocationTargetException e2) {
                    Log.w("MediaRouterJellybeanMr1", "Cannot scan for wifi displays.", e2);
                }
                this.f2237b.postDelayed(this, 15000L);
            }
        }
    }

    /* JADX INFO: renamed from: android.support.v7.d.j$b */
    public interface b extends C0378i.a {
        /* JADX INFO: renamed from: e */
        void mo3045e(Object obj);
    }

    /* JADX INFO: renamed from: android.support.v7.d.j$c */
    static class c<T extends b> extends C0378i.b<T> {
        public c(T t) {
            super(t);
        }

        @Override // android.media.MediaRouter.Callback
        public void onRoutePresentationDisplayChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            ((b) this.f2232a).mo3045e(routeInfo);
        }
    }

    /* JADX INFO: renamed from: android.support.v7.d.j$d */
    public static final class d {

        /* JADX INFO: renamed from: a */
        private Method f2240a;

        /* JADX INFO: renamed from: b */
        private int f2241b;

        public d() {
            if (Build.VERSION.SDK_INT != 17) {
                throw new UnsupportedOperationException();
            }
            try {
                this.f2241b = MediaRouter.RouteInfo.class.getField("STATUS_CONNECTING").getInt(null);
                this.f2240a = MediaRouter.RouteInfo.class.getMethod("getStatusCode", new Class[0]);
            } catch (IllegalAccessException e) {
            } catch (NoSuchFieldException e2) {
            } catch (NoSuchMethodException e3) {
            }
        }

        /* JADX INFO: renamed from: a */
        public boolean m3046a(Object obj) {
            MediaRouter.RouteInfo routeInfo = (MediaRouter.RouteInfo) obj;
            if (this.f2240a != null) {
                try {
                    return ((Integer) this.f2240a.invoke(routeInfo, new Object[0])).intValue() == this.f2241b;
                } catch (IllegalAccessException e) {
                } catch (InvocationTargetException e2) {
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: android.support.v7.d.j$e */
    public static final class e {
        /* JADX INFO: renamed from: a */
        public static boolean m3047a(Object obj) {
            return ((MediaRouter.RouteInfo) obj).isEnabled();
        }

        /* JADX INFO: renamed from: b */
        public static Display m3048b(Object obj) {
            try {
                return ((MediaRouter.RouteInfo) obj).getPresentationDisplay();
            } catch (NoSuchMethodError e) {
                Log.w("MediaRouterJellybeanMr1", "Cannot get presentation display for the route.", e);
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static Object m3043a(b bVar) {
        return new c(bVar);
    }
}
