package android.support.v4.media;

import android.media.VolumeProvider;

/* JADX INFO: renamed from: android.support.v4.media.h */
/* JADX INFO: loaded from: classes.dex */
class C0282h {

    /* JADX INFO: renamed from: android.support.v4.media.h$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo2008a(int i);

        /* JADX INFO: renamed from: b */
        void mo2009b(int i);
    }

    /* JADX INFO: renamed from: a */
    public static Object m2011a(int i, int i2, int i3, final a aVar) {
        return new VolumeProvider(i, i2, i3) { // from class: android.support.v4.media.h.1
            @Override // android.media.VolumeProvider
            public void onAdjustVolume(int i4) {
                aVar.mo2009b(i4);
            }

            @Override // android.media.VolumeProvider
            public void onSetVolumeTo(int i4) {
                aVar.mo2008a(i4);
            }
        };
    }

    /* JADX INFO: renamed from: a */
    public static void m2012a(Object obj, int i) {
        ((VolumeProvider) obj).setCurrentVolume(i);
    }
}
