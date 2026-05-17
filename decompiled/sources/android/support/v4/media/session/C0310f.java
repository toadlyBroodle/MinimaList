package android.support.v4.media.session;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.session.C0309e;

/* JADX INFO: renamed from: android.support.v4.media.session.f */
/* JADX INFO: loaded from: classes.dex */
class C0310f {

    /* JADX INFO: renamed from: android.support.v4.media.session.f$a */
    public interface a extends C0309e.a {
        /* JADX INFO: renamed from: a */
        void mo2135a(Uri uri, Bundle bundle);
    }

    /* JADX INFO: renamed from: android.support.v4.media.session.f$b */
    static class b<T extends a> extends C0309e.b<T> {
        public b(T t) {
            super(t);
        }

        @Override // android.media.session.MediaSession.Callback
        public void onPlayFromUri(Uri uri, Bundle bundle) {
            ((a) this.f1599a).mo2135a(uri, bundle);
        }
    }

    /* JADX INFO: renamed from: a */
    public static Object m2281a(a aVar) {
        return new b(aVar);
    }
}
