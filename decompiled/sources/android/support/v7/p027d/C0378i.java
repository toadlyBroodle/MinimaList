package android.support.v7.p027d;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.MediaRouter;
import android.media.RemoteControlClient;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: android.support.v7.d.i */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(16)
final class C0378i {

    /* JADX INFO: renamed from: android.support.v7.d.i$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo3012a(int i, Object obj);

        /* JADX INFO: renamed from: a */
        void mo3013a(Object obj);

        /* JADX INFO: renamed from: a */
        void mo3014a(Object obj, Object obj2);

        /* JADX INFO: renamed from: a */
        void mo3015a(Object obj, Object obj2, int i);

        /* JADX INFO: renamed from: b */
        void mo3016b(int i, Object obj);

        /* JADX INFO: renamed from: b */
        void mo3017b(Object obj);

        /* JADX INFO: renamed from: c */
        void mo3018c(Object obj);

        /* JADX INFO: renamed from: d */
        void mo3019d(Object obj);
    }

    /* JADX INFO: renamed from: android.support.v7.d.i$b */
    static class b<T extends a> extends MediaRouter.Callback {

        /* JADX INFO: renamed from: a */
        protected final T f2232a;

        public b(T t) {
            this.f2232a = t;
        }

        @Override // android.media.MediaRouter.Callback
        public void onRouteAdded(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            this.f2232a.mo3013a(routeInfo);
        }

        @Override // android.media.MediaRouter.Callback
        public void onRouteChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            this.f2232a.mo3018c(routeInfo);
        }

        @Override // android.media.MediaRouter.Callback
        public void onRouteGrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup, int i) {
            this.f2232a.mo3015a(routeInfo, routeGroup, i);
        }

        @Override // android.media.MediaRouter.Callback
        public void onRouteRemoved(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            this.f2232a.mo3017b(routeInfo);
        }

        @Override // android.media.MediaRouter.Callback
        public void onRouteSelected(MediaRouter mediaRouter, int i, MediaRouter.RouteInfo routeInfo) {
            this.f2232a.mo3012a(i, routeInfo);
        }

        @Override // android.media.MediaRouter.Callback
        public void onRouteUngrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup) {
            this.f2232a.mo3014a(routeInfo, routeGroup);
        }

        @Override // android.media.MediaRouter.Callback
        public void onRouteUnselected(MediaRouter mediaRouter, int i, MediaRouter.RouteInfo routeInfo) {
            this.f2232a.mo3016b(i, routeInfo);
        }

        @Override // android.media.MediaRouter.Callback
        public void onRouteVolumeChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            this.f2232a.mo3019d(routeInfo);
        }
    }

    /* JADX INFO: renamed from: android.support.v7.d.i$c */
    public static final class c {

        /* JADX INFO: renamed from: a */
        private Method f2233a;

        public c() {
            if (Build.VERSION.SDK_INT < 16 || Build.VERSION.SDK_INT > 17) {
                throw new UnsupportedOperationException();
            }
            try {
                this.f2233a = MediaRouter.class.getMethod("getSystemAudioRoute", new Class[0]);
            } catch (NoSuchMethodException e) {
            }
        }

        /* JADX INFO: renamed from: a */
        public Object m3020a(Object obj) {
            MediaRouter mediaRouter = (MediaRouter) obj;
            if (this.f2233a != null) {
                try {
                    return this.f2233a.invoke(mediaRouter, new Object[0]);
                } catch (IllegalAccessException e) {
                } catch (InvocationTargetException e2) {
                }
            }
            return mediaRouter.getRouteAt(0);
        }
    }

    /* JADX INFO: renamed from: android.support.v7.d.i$d */
    public static final class d {
        /* JADX INFO: renamed from: a */
        public static int m3021a(Object obj) {
            return ((MediaRouter.RouteInfo) obj).getSupportedTypes();
        }

        /* JADX INFO: renamed from: a */
        public static CharSequence m3022a(Object obj, Context context) {
            return ((MediaRouter.RouteInfo) obj).getName(context);
        }

        /* JADX INFO: renamed from: a */
        public static void m3023a(Object obj, int i) {
            ((MediaRouter.RouteInfo) obj).requestSetVolume(i);
        }

        /* JADX INFO: renamed from: a */
        public static void m3024a(Object obj, Object obj2) {
            ((MediaRouter.RouteInfo) obj).setTag(obj2);
        }

        /* JADX INFO: renamed from: b */
        public static int m3025b(Object obj) {
            return ((MediaRouter.RouteInfo) obj).getPlaybackType();
        }

        /* JADX INFO: renamed from: b */
        public static void m3026b(Object obj, int i) {
            ((MediaRouter.RouteInfo) obj).requestUpdateVolume(i);
        }

        /* JADX INFO: renamed from: c */
        public static int m3027c(Object obj) {
            return ((MediaRouter.RouteInfo) obj).getPlaybackStream();
        }

        /* JADX INFO: renamed from: d */
        public static int m3028d(Object obj) {
            return ((MediaRouter.RouteInfo) obj).getVolume();
        }

        /* JADX INFO: renamed from: e */
        public static int m3029e(Object obj) {
            return ((MediaRouter.RouteInfo) obj).getVolumeMax();
        }

        /* JADX INFO: renamed from: f */
        public static int m3030f(Object obj) {
            return ((MediaRouter.RouteInfo) obj).getVolumeHandling();
        }

        /* JADX INFO: renamed from: g */
        public static Object m3031g(Object obj) {
            return ((MediaRouter.RouteInfo) obj).getTag();
        }
    }

    /* JADX INFO: renamed from: android.support.v7.d.i$e */
    public static final class e {

        /* JADX INFO: renamed from: a */
        private Method f2234a;

        public e() {
            if (Build.VERSION.SDK_INT < 16 || Build.VERSION.SDK_INT > 17) {
                throw new UnsupportedOperationException();
            }
            try {
                this.f2234a = MediaRouter.class.getMethod("selectRouteInt", Integer.TYPE, MediaRouter.RouteInfo.class);
            } catch (NoSuchMethodException e) {
            }
        }

        /* JADX INFO: renamed from: a */
        public void m3032a(Object obj, int i, Object obj2) {
            MediaRouter mediaRouter = (MediaRouter) obj;
            MediaRouter.RouteInfo routeInfo = (MediaRouter.RouteInfo) obj2;
            if ((routeInfo.getSupportedTypes() & 8388608) == 0) {
                if (this.f2234a != null) {
                    try {
                        this.f2234a.invoke(mediaRouter, Integer.valueOf(i), routeInfo);
                        return;
                    } catch (IllegalAccessException e) {
                        Log.w("MediaRouterJellybean", "Cannot programmatically select non-user route.  Media routing may not work.", e);
                    } catch (InvocationTargetException e2) {
                        Log.w("MediaRouterJellybean", "Cannot programmatically select non-user route.  Media routing may not work.", e2);
                    }
                } else {
                    Log.w("MediaRouterJellybean", "Cannot programmatically select non-user route because the platform is missing the selectRouteInt() method.  Media routing may not work.");
                }
            }
            mediaRouter.selectRoute(i, routeInfo);
        }
    }

    /* JADX INFO: renamed from: android.support.v7.d.i$f */
    public static final class f {
        /* JADX INFO: renamed from: a */
        public static void m3033a(Object obj, int i) {
            ((MediaRouter.UserRouteInfo) obj).setPlaybackType(i);
        }

        /* JADX INFO: renamed from: a */
        public static void m3034a(Object obj, CharSequence charSequence) {
            ((MediaRouter.UserRouteInfo) obj).setName(charSequence);
        }

        /* JADX INFO: renamed from: a */
        public static void m3035a(Object obj, Object obj2) {
            ((MediaRouter.UserRouteInfo) obj).setVolumeCallback((MediaRouter.VolumeCallback) obj2);
        }

        /* JADX INFO: renamed from: b */
        public static void m3036b(Object obj, int i) {
            ((MediaRouter.UserRouteInfo) obj).setPlaybackStream(i);
        }

        /* JADX INFO: renamed from: b */
        public static void m3037b(Object obj, Object obj2) {
            ((MediaRouter.UserRouteInfo) obj).setRemoteControlClient((RemoteControlClient) obj2);
        }

        /* JADX INFO: renamed from: c */
        public static void m3038c(Object obj, int i) {
            ((MediaRouter.UserRouteInfo) obj).setVolume(i);
        }

        /* JADX INFO: renamed from: d */
        public static void m3039d(Object obj, int i) {
            ((MediaRouter.UserRouteInfo) obj).setVolumeMax(i);
        }

        /* JADX INFO: renamed from: e */
        public static void m3040e(Object obj, int i) {
            ((MediaRouter.UserRouteInfo) obj).setVolumeHandling(i);
        }
    }

    /* JADX INFO: renamed from: android.support.v7.d.i$g */
    public interface g {
        /* JADX INFO: renamed from: a */
        void mo3041a(Object obj, int i);

        /* JADX INFO: renamed from: b */
        void mo3042b(Object obj, int i);
    }

    /* JADX INFO: renamed from: android.support.v7.d.i$h */
    static class h<T extends g> extends MediaRouter.VolumeCallback {

        /* JADX INFO: renamed from: a */
        protected final T f2235a;

        public h(T t) {
            this.f2235a = t;
        }

        @Override // android.media.MediaRouter.VolumeCallback
        public void onVolumeSetRequest(MediaRouter.RouteInfo routeInfo, int i) {
            this.f2235a.mo3041a(routeInfo, i);
        }

        @Override // android.media.MediaRouter.VolumeCallback
        public void onVolumeUpdateRequest(MediaRouter.RouteInfo routeInfo, int i) {
            this.f2235a.mo3042b(routeInfo, i);
        }
    }

    /* JADX INFO: renamed from: a */
    public static Object m3000a(Context context) {
        return context.getSystemService("media_router");
    }

    /* JADX INFO: renamed from: a */
    public static Object m3001a(a aVar) {
        return new b(aVar);
    }

    /* JADX INFO: renamed from: a */
    public static Object m3002a(g gVar) {
        return new h(gVar);
    }

    /* JADX INFO: renamed from: a */
    public static Object m3003a(Object obj, int i) {
        return ((MediaRouter) obj).getSelectedRoute(i);
    }

    /* JADX INFO: renamed from: a */
    public static Object m3004a(Object obj, String str, boolean z) {
        return ((MediaRouter) obj).createRouteCategory(str, z);
    }

    /* JADX INFO: renamed from: a */
    public static List m3005a(Object obj) {
        MediaRouter mediaRouter = (MediaRouter) obj;
        int routeCount = mediaRouter.getRouteCount();
        ArrayList arrayList = new ArrayList(routeCount);
        for (int i = 0; i < routeCount; i++) {
            arrayList.add(mediaRouter.getRouteAt(i));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public static void m3006a(Object obj, int i, Object obj2) {
        ((MediaRouter) obj).selectRoute(i, (MediaRouter.RouteInfo) obj2);
    }

    /* JADX INFO: renamed from: a */
    public static void m3007a(Object obj, Object obj2) {
        ((MediaRouter) obj).removeCallback((MediaRouter.Callback) obj2);
    }

    /* JADX INFO: renamed from: b */
    public static Object m3008b(Object obj, Object obj2) {
        return ((MediaRouter) obj).createUserRoute((MediaRouter.RouteCategory) obj2);
    }

    /* JADX INFO: renamed from: b */
    public static void m3009b(Object obj, int i, Object obj2) {
        ((MediaRouter) obj).addCallback(i, (MediaRouter.Callback) obj2);
    }

    /* JADX INFO: renamed from: c */
    public static void m3010c(Object obj, Object obj2) {
        ((MediaRouter) obj).addUserRoute((MediaRouter.UserRouteInfo) obj2);
    }

    /* JADX INFO: renamed from: d */
    public static void m3011d(Object obj, Object obj2) {
        ((MediaRouter) obj).removeUserRoute((MediaRouter.UserRouteInfo) obj2);
    }
}
