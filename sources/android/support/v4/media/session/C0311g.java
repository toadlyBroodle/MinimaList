package android.support.v4.media.session;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.session.C0310f;

/* JADX INFO: renamed from: android.support.v4.media.session.g */
/* JADX INFO: loaded from: classes.dex */
class C0311g {

    /* JADX INFO: renamed from: android.support.v4.media.session.g$a */
    public interface a extends C0310f.a {
        /* JADX INFO: renamed from: b */
        void mo2136b(Uri uri, Bundle bundle);

        /* JADX INFO: renamed from: d */
        void mo2137d(String str, Bundle bundle);

        /* JADX INFO: renamed from: e */
        void mo2138e(String str, Bundle bundle);

        /* JADX INFO: renamed from: h */
        void mo2139h();
    }

    /* JADX INFO: renamed from: android.support.v4.media.session.g$b */
    static class b<T extends a> extends C0310f.b<T> {
        public b(T t) {
            super(t);
        }

        @Override // android.media.session.MediaSession.Callback
        public void onPrepare() {
            ((a) this.f1599a).mo2139h();
        }

        @Override // android.media.session.MediaSession.Callback
        public void onPrepareFromMediaId(String str, Bundle bundle) {
            ((a) this.f1599a).mo2137d(str, bundle);
        }

        @Override // android.media.session.MediaSession.Callback
        public void onPrepareFromSearch(String str, Bundle bundle) {
            ((a) this.f1599a).mo2138e(str, bundle);
        }

        @Override // android.media.session.MediaSession.Callback
        public void onPrepareFromUri(Uri uri, Bundle bundle) {
            ((a) this.f1599a).mo2136b(uri, bundle);
        }
    }

    /* JADX INFO: renamed from: a */
    public static Object m2282a(a aVar) {
        return new b(aVar);
    }
}
