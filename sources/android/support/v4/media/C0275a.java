package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import java.util.List;

/* JADX INFO: renamed from: android.support.v4.media.a */
/* JADX INFO: loaded from: classes.dex */
class C0275a {

    /* JADX INFO: renamed from: android.support.v4.media.a$a */
    interface a {
        /* JADX INFO: renamed from: a */
        void mo1891a();

        /* JADX INFO: renamed from: b */
        void mo1892b();

        /* JADX INFO: renamed from: c */
        void mo1893c();
    }

    /* JADX INFO: renamed from: android.support.v4.media.a$b */
    static class b<T extends a> extends MediaBrowser.ConnectionCallback {

        /* JADX INFO: renamed from: a */
        protected final T f1457a;

        public b(T t) {
            this.f1457a = t;
        }

        @Override // android.media.browse.MediaBrowser.ConnectionCallback
        public void onConnected() {
            this.f1457a.mo1891a();
        }

        @Override // android.media.browse.MediaBrowser.ConnectionCallback
        public void onConnectionFailed() {
            this.f1457a.mo1893c();
        }

        @Override // android.media.browse.MediaBrowser.ConnectionCallback
        public void onConnectionSuspended() {
            this.f1457a.mo1892b();
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.a$c */
    static class c {
        /* JADX INFO: renamed from: a */
        public static int m1974a(Object obj) {
            return ((MediaBrowser.MediaItem) obj).getFlags();
        }

        /* JADX INFO: renamed from: b */
        public static Object m1975b(Object obj) {
            return ((MediaBrowser.MediaItem) obj).getDescription();
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.a$d */
    interface d {
        /* JADX INFO: renamed from: a */
        void mo1929a(String str);

        /* JADX INFO: renamed from: a */
        void mo1930a(String str, List<?> list);
    }

    /* JADX INFO: renamed from: android.support.v4.media.a$e */
    static class e<T extends d> extends MediaBrowser.SubscriptionCallback {

        /* JADX INFO: renamed from: a */
        protected final T f1458a;

        public e(T t) {
            this.f1458a = t;
        }

        @Override // android.media.browse.MediaBrowser.SubscriptionCallback
        public void onChildrenLoaded(String str, List<MediaBrowser.MediaItem> list) {
            this.f1458a.mo1930a(str, list);
        }

        @Override // android.media.browse.MediaBrowser.SubscriptionCallback
        public void onError(String str) {
            this.f1458a.mo1929a(str);
        }
    }

    /* JADX INFO: renamed from: a */
    public static Object m1967a(Context context, ComponentName componentName, Object obj, Bundle bundle) {
        return new MediaBrowser(context, componentName, (MediaBrowser.ConnectionCallback) obj, bundle);
    }

    /* JADX INFO: renamed from: a */
    public static Object m1968a(a aVar) {
        return new b(aVar);
    }

    /* JADX INFO: renamed from: a */
    public static Object m1969a(d dVar) {
        return new e(dVar);
    }

    /* JADX INFO: renamed from: a */
    public static void m1970a(Object obj) {
        ((MediaBrowser) obj).connect();
    }

    /* JADX INFO: renamed from: b */
    public static void m1971b(Object obj) {
        ((MediaBrowser) obj).disconnect();
    }

    /* JADX INFO: renamed from: c */
    public static Bundle m1972c(Object obj) {
        return ((MediaBrowser) obj).getExtras();
    }

    /* JADX INFO: renamed from: d */
    public static Object m1973d(Object obj) {
        return ((MediaBrowser) obj).getSessionToken();
    }
}
