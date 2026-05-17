package android.support.v4.media;

import android.media.MediaDescription;
import android.net.Uri;
import android.support.v4.media.C0278d;

/* JADX INFO: renamed from: android.support.v4.media.e */
/* JADX INFO: loaded from: classes.dex */
class C0279e extends C0278d {

    /* JADX INFO: renamed from: android.support.v4.media.e$a */
    static class a extends C0278d.a {
        /* JADX INFO: renamed from: b */
        public static void m1997b(Object obj, Uri uri) {
            ((MediaDescription.Builder) obj).setMediaUri(uri);
        }
    }

    /* JADX INFO: renamed from: h */
    public static Uri m1996h(Object obj) {
        return ((MediaDescription) obj).getMediaUri();
    }
}
