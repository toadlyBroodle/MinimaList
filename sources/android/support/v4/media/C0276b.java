package android.support.v4.media;

import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.support.v4.media.C0275a;
import java.util.List;

/* JADX INFO: renamed from: android.support.v4.media.b */
/* JADX INFO: loaded from: classes.dex */
class C0276b {

    /* JADX INFO: renamed from: android.support.v4.media.b$a */
    interface a extends C0275a.d {
        /* JADX INFO: renamed from: a */
        void mo1931a(String str, Bundle bundle);

        /* JADX INFO: renamed from: a */
        void mo1932a(String str, List<?> list, Bundle bundle);
    }

    /* JADX INFO: renamed from: android.support.v4.media.b$b */
    static class b<T extends a> extends C0275a.e<T> {
        b(T t) {
            super(t);
        }

        @Override // android.media.browse.MediaBrowser.SubscriptionCallback
        public void onChildrenLoaded(String str, List<MediaBrowser.MediaItem> list, Bundle bundle) {
            ((a) this.f1458a).mo1932a(str, list, bundle);
        }

        @Override // android.media.browse.MediaBrowser.SubscriptionCallback
        public void onError(String str, Bundle bundle) {
            ((a) this.f1458a).mo1931a(str, bundle);
        }
    }

    /* JADX INFO: renamed from: a */
    static Object m1976a(a aVar) {
        return new b(aVar);
    }
}
