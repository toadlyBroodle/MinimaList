package android.support.v4.media.session;

import android.media.session.PlaybackState;
import android.os.Bundle;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: android.support.v4.media.session.h */
/* JADX INFO: loaded from: classes.dex */
class C0312h {

    /* JADX INFO: renamed from: android.support.v4.media.session.h$a */
    static final class a {
        /* JADX INFO: renamed from: a */
        public static Object m2293a(String str, CharSequence charSequence, int i, Bundle bundle) {
            PlaybackState.CustomAction.Builder builder = new PlaybackState.CustomAction.Builder(str, charSequence, i);
            builder.setExtras(bundle);
            return builder.build();
        }

        /* JADX INFO: renamed from: a */
        public static String m2294a(Object obj) {
            return ((PlaybackState.CustomAction) obj).getAction();
        }

        /* JADX INFO: renamed from: b */
        public static CharSequence m2295b(Object obj) {
            return ((PlaybackState.CustomAction) obj).getName();
        }

        /* JADX INFO: renamed from: c */
        public static int m2296c(Object obj) {
            return ((PlaybackState.CustomAction) obj).getIcon();
        }

        /* JADX INFO: renamed from: d */
        public static Bundle m2297d(Object obj) {
            return ((PlaybackState.CustomAction) obj).getExtras();
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m2283a(Object obj) {
        return ((PlaybackState) obj).getState();
    }

    /* JADX INFO: renamed from: a */
    public static Object m2284a(int i, long j, long j2, float f, long j3, CharSequence charSequence, long j4, List<Object> list, long j5) {
        PlaybackState.Builder builder = new PlaybackState.Builder();
        builder.setState(i, j, f, j4);
        builder.setBufferedPosition(j2);
        builder.setActions(j3);
        builder.setErrorMessage(charSequence);
        Iterator<Object> it = list.iterator();
        while (it.hasNext()) {
            builder.addCustomAction((PlaybackState.CustomAction) it.next());
        }
        builder.setActiveQueueItemId(j5);
        return builder.build();
    }

    /* JADX INFO: renamed from: b */
    public static long m2285b(Object obj) {
        return ((PlaybackState) obj).getPosition();
    }

    /* JADX INFO: renamed from: c */
    public static long m2286c(Object obj) {
        return ((PlaybackState) obj).getBufferedPosition();
    }

    /* JADX INFO: renamed from: d */
    public static float m2287d(Object obj) {
        return ((PlaybackState) obj).getPlaybackSpeed();
    }

    /* JADX INFO: renamed from: e */
    public static long m2288e(Object obj) {
        return ((PlaybackState) obj).getActions();
    }

    /* JADX INFO: renamed from: f */
    public static CharSequence m2289f(Object obj) {
        return ((PlaybackState) obj).getErrorMessage();
    }

    /* JADX INFO: renamed from: g */
    public static long m2290g(Object obj) {
        return ((PlaybackState) obj).getLastPositionUpdateTime();
    }

    /* JADX INFO: renamed from: h */
    public static List<Object> m2291h(Object obj) {
        return ((PlaybackState) obj).getCustomActions();
    }

    /* JADX INFO: renamed from: i */
    public static long m2292i(Object obj) {
        return ((PlaybackState) obj).getActiveQueueItemId();
    }
}
