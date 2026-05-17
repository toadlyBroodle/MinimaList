package android.support.v4.media.session;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.view.KeyEvent;
import java.util.List;

/* JADX INFO: renamed from: android.support.v4.media.session.d */
/* JADX INFO: loaded from: classes.dex */
class C0308d {

    /* JADX INFO: renamed from: android.support.v4.media.session.d$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo2041a();

        /* JADX INFO: renamed from: a */
        void mo2042a(int i, int i2, int i3, int i4, int i5);

        /* JADX INFO: renamed from: a */
        void mo2043a(Bundle bundle);

        /* JADX INFO: renamed from: a */
        void mo2044a(CharSequence charSequence);

        /* JADX INFO: renamed from: a */
        void mo2045a(Object obj);

        /* JADX INFO: renamed from: a */
        void mo2046a(String str, Bundle bundle);

        /* JADX INFO: renamed from: a */
        void mo2047a(List<?> list);

        /* JADX INFO: renamed from: b */
        void mo2048b(Object obj);
    }

    /* JADX INFO: renamed from: android.support.v4.media.session.d$b */
    static class b<T extends a> extends MediaController.Callback {

        /* JADX INFO: renamed from: a */
        protected final T f1598a;

        public b(T t) {
            this.f1598a = t;
        }

        @Override // android.media.session.MediaController.Callback
        public void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
            this.f1598a.mo2042a(playbackInfo.getPlaybackType(), c.m2263b(playbackInfo), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume());
        }

        @Override // android.media.session.MediaController.Callback
        public void onExtrasChanged(Bundle bundle) {
            this.f1598a.mo2043a(bundle);
        }

        @Override // android.media.session.MediaController.Callback
        public void onMetadataChanged(MediaMetadata mediaMetadata) {
            this.f1598a.mo2048b(mediaMetadata);
        }

        @Override // android.media.session.MediaController.Callback
        public void onPlaybackStateChanged(PlaybackState playbackState) {
            this.f1598a.mo2045a(playbackState);
        }

        @Override // android.media.session.MediaController.Callback
        public void onQueueChanged(List<MediaSession.QueueItem> list) {
            this.f1598a.mo2047a(list);
        }

        @Override // android.media.session.MediaController.Callback
        public void onQueueTitleChanged(CharSequence charSequence) {
            this.f1598a.mo2044a(charSequence);
        }

        @Override // android.media.session.MediaController.Callback
        public void onSessionDestroyed() {
            this.f1598a.mo2041a();
        }

        @Override // android.media.session.MediaController.Callback
        public void onSessionEvent(String str, Bundle bundle) {
            this.f1598a.mo2046a(str, bundle);
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.session.d$c */
    public static class c {
        /* JADX INFO: renamed from: a */
        private static int m2261a(AudioAttributes audioAttributes) {
            if ((audioAttributes.getFlags() & 1) == 1) {
                return 7;
            }
            if ((audioAttributes.getFlags() & 4) == 4) {
                return 6;
            }
            switch (audioAttributes.getUsage()) {
                case 1:
                case 11:
                case 12:
                case 14:
                default:
                    return 3;
                case 2:
                    return 0;
                case 3:
                    return 8;
                case 4:
                    return 4;
                case 5:
                case 7:
                case 8:
                case 9:
                case 10:
                    return 5;
                case 6:
                    return 2;
                case 13:
                    return 1;
            }
        }

        /* JADX INFO: renamed from: a */
        public static AudioAttributes m2262a(Object obj) {
            return ((MediaController.PlaybackInfo) obj).getAudioAttributes();
        }

        /* JADX INFO: renamed from: b */
        public static int m2263b(Object obj) {
            return m2261a(m2262a(obj));
        }
    }

    /* JADX INFO: renamed from: a */
    public static Object m2256a(Context context, Object obj) {
        return new MediaController(context, (MediaSession.Token) obj);
    }

    /* JADX INFO: renamed from: a */
    public static Object m2257a(a aVar) {
        return new b(aVar);
    }

    /* JADX INFO: renamed from: a */
    public static Object m2258a(Object obj) {
        return ((MediaController) obj).getMetadata();
    }

    /* JADX INFO: renamed from: a */
    public static void m2259a(Object obj, String str, Bundle bundle, ResultReceiver resultReceiver) {
        ((MediaController) obj).sendCommand(str, bundle, resultReceiver);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m2260a(Object obj, KeyEvent keyEvent) {
        return ((MediaController) obj).dispatchMediaButtonEvent(keyEvent);
    }
}
