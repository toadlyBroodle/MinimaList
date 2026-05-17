package android.support.v4.media.session;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.AudioAttributes;
import android.media.MediaMetadata;
import android.media.Rating;
import android.media.VolumeProvider;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.os.ResultReceiver;

/* JADX INFO: renamed from: android.support.v4.media.session.e */
/* JADX INFO: loaded from: classes.dex */
class C0309e {

    /* JADX INFO: renamed from: android.support.v4.media.session.e$a */
    interface a {
        /* JADX INFO: renamed from: a */
        void mo2120a();

        /* JADX INFO: renamed from: a */
        void mo2121a(long j);

        /* JADX INFO: renamed from: a */
        void mo2122a(Object obj);

        /* JADX INFO: renamed from: a */
        void mo2123a(String str, Bundle bundle);

        /* JADX INFO: renamed from: a */
        void mo2124a(String str, Bundle bundle, ResultReceiver resultReceiver);

        /* JADX INFO: renamed from: a */
        boolean mo2125a(Intent intent);

        /* JADX INFO: renamed from: b */
        void mo2126b();

        /* JADX INFO: renamed from: b */
        void mo2127b(long j);

        /* JADX INFO: renamed from: b */
        void mo2128b(String str, Bundle bundle);

        /* JADX INFO: renamed from: c */
        void mo2129c();

        /* JADX INFO: renamed from: c */
        void mo2130c(String str, Bundle bundle);

        /* JADX INFO: renamed from: d */
        void mo2131d();

        /* JADX INFO: renamed from: e */
        void mo2132e();

        /* JADX INFO: renamed from: f */
        void mo2133f();

        /* JADX INFO: renamed from: g */
        void mo2134g();
    }

    /* JADX INFO: renamed from: android.support.v4.media.session.e$b */
    static class b<T extends a> extends MediaSession.Callback {

        /* JADX INFO: renamed from: a */
        protected final T f1599a;

        public b(T t) {
            this.f1599a = t;
        }

        @Override // android.media.session.MediaSession.Callback
        public void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
            this.f1599a.mo2124a(str, bundle, resultReceiver);
        }

        @Override // android.media.session.MediaSession.Callback
        public void onCustomAction(String str, Bundle bundle) {
            this.f1599a.mo2130c(str, bundle);
        }

        @Override // android.media.session.MediaSession.Callback
        public void onFastForward() {
            this.f1599a.mo2132e();
        }

        @Override // android.media.session.MediaSession.Callback
        public boolean onMediaButtonEvent(Intent intent) {
            return this.f1599a.mo2125a(intent) || super.onMediaButtonEvent(intent);
        }

        @Override // android.media.session.MediaSession.Callback
        public void onPause() {
            this.f1599a.mo2126b();
        }

        @Override // android.media.session.MediaSession.Callback
        public void onPlay() {
            this.f1599a.mo2120a();
        }

        @Override // android.media.session.MediaSession.Callback
        public void onPlayFromMediaId(String str, Bundle bundle) {
            this.f1599a.mo2123a(str, bundle);
        }

        @Override // android.media.session.MediaSession.Callback
        public void onPlayFromSearch(String str, Bundle bundle) {
            this.f1599a.mo2128b(str, bundle);
        }

        @Override // android.media.session.MediaSession.Callback
        public void onRewind() {
            this.f1599a.mo2133f();
        }

        @Override // android.media.session.MediaSession.Callback
        public void onSeekTo(long j) {
            this.f1599a.mo2127b(j);
        }

        @Override // android.media.session.MediaSession.Callback
        public void onSetRating(Rating rating) {
            this.f1599a.mo2122a(rating);
        }

        @Override // android.media.session.MediaSession.Callback
        public void onSkipToNext() {
            this.f1599a.mo2129c();
        }

        @Override // android.media.session.MediaSession.Callback
        public void onSkipToPrevious() {
            this.f1599a.mo2131d();
        }

        @Override // android.media.session.MediaSession.Callback
        public void onSkipToQueueItem(long j) {
            this.f1599a.mo2121a(j);
        }

        @Override // android.media.session.MediaSession.Callback
        public void onStop() {
            this.f1599a.mo2134g();
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.session.e$c */
    static class c {
        /* JADX INFO: renamed from: a */
        public static Object m2279a(Object obj) {
            return ((MediaSession.QueueItem) obj).getDescription();
        }

        /* JADX INFO: renamed from: b */
        public static long m2280b(Object obj) {
            return ((MediaSession.QueueItem) obj).getQueueId();
        }
    }

    /* JADX INFO: renamed from: a */
    public static Object m2264a(Context context, String str) {
        return new MediaSession(context, str);
    }

    /* JADX INFO: renamed from: a */
    public static Object m2265a(a aVar) {
        return new b(aVar);
    }

    /* JADX INFO: renamed from: a */
    public static Object m2266a(Object obj) {
        if (obj instanceof MediaSession.Token) {
            return obj;
        }
        throw new IllegalArgumentException("token is not a valid MediaSession.Token object");
    }

    /* JADX INFO: renamed from: a */
    public static void m2267a(Object obj, int i) {
        ((MediaSession) obj).setFlags(i);
    }

    /* JADX INFO: renamed from: a */
    public static void m2268a(Object obj, PendingIntent pendingIntent) {
        ((MediaSession) obj).setSessionActivity(pendingIntent);
    }

    /* JADX INFO: renamed from: a */
    public static void m2269a(Object obj, Object obj2) {
        ((MediaSession) obj).setPlaybackToRemote((VolumeProvider) obj2);
    }

    /* JADX INFO: renamed from: a */
    public static void m2270a(Object obj, Object obj2, Handler handler) {
        ((MediaSession) obj).setCallback((MediaSession.Callback) obj2, handler);
    }

    /* JADX INFO: renamed from: a */
    public static void m2271a(Object obj, boolean z) {
        ((MediaSession) obj).setActive(z);
    }

    /* JADX INFO: renamed from: b */
    public static void m2272b(Object obj, int i) {
        AudioAttributes.Builder builder = new AudioAttributes.Builder();
        builder.setLegacyStreamType(i);
        ((MediaSession) obj).setPlaybackToLocal(builder.build());
    }

    /* JADX INFO: renamed from: b */
    public static void m2273b(Object obj, PendingIntent pendingIntent) {
        ((MediaSession) obj).setMediaButtonReceiver(pendingIntent);
    }

    /* JADX INFO: renamed from: b */
    public static void m2274b(Object obj, Object obj2) {
        ((MediaSession) obj).setPlaybackState((PlaybackState) obj2);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m2275b(Object obj) {
        return ((MediaSession) obj).isActive();
    }

    /* JADX INFO: renamed from: c */
    public static void m2276c(Object obj) {
        ((MediaSession) obj).release();
    }

    /* JADX INFO: renamed from: c */
    public static void m2277c(Object obj, Object obj2) {
        ((MediaSession) obj).setMetadata((MediaMetadata) obj2);
    }

    /* JADX INFO: renamed from: d */
    public static Parcelable m2278d(Object obj) {
        return ((MediaSession) obj).getSessionToken();
    }
}
