package android.support.v4.media.session;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.C0308d;
import android.support.v4.media.session.InterfaceC0305a;
import android.support.v4.media.session.InterfaceC0306b;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.p006a.C0152h;
import android.util.Log;
import android.view.KeyEvent;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class MediaControllerCompat {

    /* JADX INFO: renamed from: a */
    private final InterfaceC0285b f1466a;

    /* JADX INFO: renamed from: b */
    private final MediaSessionCompat.Token f1467b;

    /* JADX INFO: renamed from: c */
    private final HashSet<AbstractC0284a> f1468c = new HashSet<>();

    static class MediaControllerImplApi21 implements InterfaceC0285b {

        /* JADX INFO: renamed from: a */
        protected final Object f1469a;

        /* JADX INFO: renamed from: c */
        private InterfaceC0306b f1471c;

        /* JADX INFO: renamed from: b */
        private final List<AbstractC0284a> f1470b = new ArrayList();

        /* JADX INFO: renamed from: d */
        private HashMap<AbstractC0284a, BinderC0283a> f1472d = new HashMap<>();

        private static class ExtraBinderRequestResultReceiver extends ResultReceiver {

            /* JADX INFO: renamed from: a */
            private WeakReference<MediaControllerImplApi21> f1473a;

            public ExtraBinderRequestResultReceiver(MediaControllerImplApi21 mediaControllerImplApi21, Handler handler) {
                super(handler);
                this.f1473a = new WeakReference<>(mediaControllerImplApi21);
            }

            @Override // android.os.ResultReceiver
            protected void onReceiveResult(int i, Bundle bundle) {
                MediaControllerImplApi21 mediaControllerImplApi21 = this.f1473a.get();
                if (mediaControllerImplApi21 == null || bundle == null) {
                    return;
                }
                mediaControllerImplApi21.f1471c = InterfaceC0306b.a.m2250a(C0152h.m862a(bundle, "android.support.v4.media.session.EXTRA_BINDER"));
                mediaControllerImplApi21.m2018c();
            }
        }

        /* JADX INFO: renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$a */
        private static class BinderC0283a extends AbstractC0284a.c {
            BinderC0283a(AbstractC0284a abstractC0284a) {
                super(abstractC0284a);
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.AbstractC0284a.c, android.support.v4.media.session.InterfaceC0305a
            /* JADX INFO: renamed from: a */
            public void mo2022a() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.AbstractC0284a.c, android.support.v4.media.session.InterfaceC0305a
            /* JADX INFO: renamed from: a */
            public void mo2023a(Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.AbstractC0284a.c, android.support.v4.media.session.InterfaceC0305a
            /* JADX INFO: renamed from: a */
            public void mo2024a(MediaMetadataCompat mediaMetadataCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.AbstractC0284a.c, android.support.v4.media.session.InterfaceC0305a
            /* JADX INFO: renamed from: a */
            public void mo2025a(ParcelableVolumeInfo parcelableVolumeInfo) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.AbstractC0284a.c, android.support.v4.media.session.InterfaceC0305a
            /* JADX INFO: renamed from: a */
            public void mo2026a(CharSequence charSequence) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.AbstractC0284a.c, android.support.v4.media.session.InterfaceC0305a
            /* JADX INFO: renamed from: a */
            public void mo2027a(List<MediaSessionCompat.QueueItem> list) {
                throw new AssertionError();
            }
        }

        public MediaControllerImplApi21(Context context, MediaSessionCompat.Token token) throws RemoteException {
            this.f1469a = C0308d.m2256a(context, token.m2084a());
            if (this.f1469a == null) {
                throw new RemoteException();
            }
            this.f1471c = token.m2085b();
            if (this.f1471c == null) {
                m2017b();
            }
        }

        public MediaControllerImplApi21(Context context, MediaSessionCompat mediaSessionCompat) {
            this.f1469a = C0308d.m2256a(context, mediaSessionCompat.m2071c().m2084a());
            this.f1471c = mediaSessionCompat.m2071c().m2085b();
            if (this.f1471c == null) {
                m2017b();
            }
        }

        /* JADX INFO: renamed from: b */
        private void m2017b() {
            m2020a("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new ExtraBinderRequestResultReceiver(this, new Handler()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: c */
        public void m2018c() {
            if (this.f1471c == null) {
                return;
            }
            synchronized (this.f1470b) {
                for (AbstractC0284a abstractC0284a : this.f1470b) {
                    BinderC0283a binderC0283a = new BinderC0283a(abstractC0284a);
                    this.f1472d.put(abstractC0284a, binderC0283a);
                    abstractC0284a.f1475b = true;
                    try {
                        this.f1471c.mo2172a(binderC0283a);
                        abstractC0284a.m2028a();
                    } catch (RemoteException e) {
                        Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
                        this.f1470b.clear();
                    }
                }
                this.f1470b.clear();
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.InterfaceC0285b
        /* JADX INFO: renamed from: a */
        public MediaMetadataCompat mo2019a() {
            Object objM2258a = C0308d.m2258a(this.f1469a);
            if (objM2258a != null) {
                return MediaMetadataCompat.m1947a(objM2258a);
            }
            return null;
        }

        /* JADX INFO: renamed from: a */
        public void m2020a(String str, Bundle bundle, ResultReceiver resultReceiver) {
            C0308d.m2259a(this.f1469a, str, bundle, resultReceiver);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.InterfaceC0285b
        /* JADX INFO: renamed from: a */
        public boolean mo2021a(KeyEvent keyEvent) {
            return C0308d.m2260a(this.f1469a, keyEvent);
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.session.MediaControllerCompat$a */
    public static abstract class AbstractC0284a implements IBinder.DeathRecipient {

        /* JADX INFO: renamed from: a */
        a f1474a;

        /* JADX INFO: renamed from: b */
        boolean f1475b;

        /* JADX INFO: renamed from: c */
        private final Object f1476c;

        /* JADX INFO: renamed from: android.support.v4.media.session.MediaControllerCompat$a$a */
        private class a extends Handler {

            /* JADX INFO: renamed from: a */
            boolean f1477a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ AbstractC0284a f1478b;

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (this.f1477a) {
                    switch (message.what) {
                        case 1:
                            this.f1478b.m2036a((String) message.obj, message.getData());
                            break;
                        case 2:
                            this.f1478b.m2034a((PlaybackStateCompat) message.obj);
                            break;
                        case 3:
                            this.f1478b.m2032a((MediaMetadataCompat) message.obj);
                            break;
                        case 4:
                            this.f1478b.m2033a((C0289f) message.obj);
                            break;
                        case 5:
                            this.f1478b.m2037a((List<MediaSessionCompat.QueueItem>) message.obj);
                            break;
                        case 6:
                            this.f1478b.m2035a((CharSequence) message.obj);
                            break;
                        case 7:
                            this.f1478b.m2031a((Bundle) message.obj);
                            break;
                        case 8:
                            this.f1478b.m2039b();
                            break;
                        case 9:
                            this.f1478b.m2029a(((Integer) message.obj).intValue());
                            break;
                        case 11:
                            this.f1478b.m2038a(((Boolean) message.obj).booleanValue());
                            break;
                        case 12:
                            this.f1478b.m2040b(((Integer) message.obj).intValue());
                            break;
                        case 13:
                            this.f1478b.m2028a();
                            break;
                    }
                }
            }
        }

        /* JADX INFO: renamed from: android.support.v4.media.session.MediaControllerCompat$a$b */
        private static class b implements C0308d.a {

            /* JADX INFO: renamed from: a */
            private final WeakReference<AbstractC0284a> f1479a;

            b(AbstractC0284a abstractC0284a) {
                this.f1479a = new WeakReference<>(abstractC0284a);
            }

            @Override // android.support.v4.media.session.C0308d.a
            /* JADX INFO: renamed from: a */
            public void mo2041a() {
                AbstractC0284a abstractC0284a = this.f1479a.get();
                if (abstractC0284a != null) {
                    abstractC0284a.m2039b();
                }
            }

            @Override // android.support.v4.media.session.C0308d.a
            /* JADX INFO: renamed from: a */
            public void mo2042a(int i, int i2, int i3, int i4, int i5) {
                AbstractC0284a abstractC0284a = this.f1479a.get();
                if (abstractC0284a != null) {
                    abstractC0284a.m2033a(new C0289f(i, i2, i3, i4, i5));
                }
            }

            @Override // android.support.v4.media.session.C0308d.a
            /* JADX INFO: renamed from: a */
            public void mo2043a(Bundle bundle) {
                AbstractC0284a abstractC0284a = this.f1479a.get();
                if (abstractC0284a != null) {
                    abstractC0284a.m2031a(bundle);
                }
            }

            @Override // android.support.v4.media.session.C0308d.a
            /* JADX INFO: renamed from: a */
            public void mo2044a(CharSequence charSequence) {
                AbstractC0284a abstractC0284a = this.f1479a.get();
                if (abstractC0284a != null) {
                    abstractC0284a.m2035a(charSequence);
                }
            }

            @Override // android.support.v4.media.session.C0308d.a
            /* JADX INFO: renamed from: a */
            public void mo2045a(Object obj) {
                AbstractC0284a abstractC0284a = this.f1479a.get();
                if (abstractC0284a == null || abstractC0284a.f1475b) {
                    return;
                }
                abstractC0284a.m2034a(PlaybackStateCompat.m2232a(obj));
            }

            @Override // android.support.v4.media.session.C0308d.a
            /* JADX INFO: renamed from: a */
            public void mo2046a(String str, Bundle bundle) {
                AbstractC0284a abstractC0284a = this.f1479a.get();
                if (abstractC0284a != null) {
                    if (!abstractC0284a.f1475b || Build.VERSION.SDK_INT >= 23) {
                        abstractC0284a.m2036a(str, bundle);
                    }
                }
            }

            @Override // android.support.v4.media.session.C0308d.a
            /* JADX INFO: renamed from: a */
            public void mo2047a(List<?> list) {
                AbstractC0284a abstractC0284a = this.f1479a.get();
                if (abstractC0284a != null) {
                    abstractC0284a.m2037a(MediaSessionCompat.QueueItem.m2075a(list));
                }
            }

            @Override // android.support.v4.media.session.C0308d.a
            /* JADX INFO: renamed from: b */
            public void mo2048b(Object obj) {
                AbstractC0284a abstractC0284a = this.f1479a.get();
                if (abstractC0284a != null) {
                    abstractC0284a.m2032a(MediaMetadataCompat.m1947a(obj));
                }
            }
        }

        /* JADX INFO: renamed from: android.support.v4.media.session.MediaControllerCompat$a$c */
        private static class c extends InterfaceC0305a.a {

            /* JADX INFO: renamed from: a */
            private final WeakReference<AbstractC0284a> f1480a;

            c(AbstractC0284a abstractC0284a) {
                this.f1480a = new WeakReference<>(abstractC0284a);
            }

            /* JADX INFO: renamed from: a */
            public void mo2022a() {
                AbstractC0284a abstractC0284a = this.f1480a.get();
                if (abstractC0284a != null) {
                    abstractC0284a.m2030a(8, null, null);
                }
            }

            @Override // android.support.v4.media.session.InterfaceC0305a
            /* JADX INFO: renamed from: a */
            public void mo2049a(int i) {
                AbstractC0284a abstractC0284a = this.f1480a.get();
                if (abstractC0284a != null) {
                    abstractC0284a.m2030a(9, Integer.valueOf(i), null);
                }
            }

            /* JADX INFO: renamed from: a */
            public void mo2023a(Bundle bundle) {
                AbstractC0284a abstractC0284a = this.f1480a.get();
                if (abstractC0284a != null) {
                    abstractC0284a.m2030a(7, bundle, null);
                }
            }

            /* JADX INFO: renamed from: a */
            public void mo2024a(MediaMetadataCompat mediaMetadataCompat) {
                AbstractC0284a abstractC0284a = this.f1480a.get();
                if (abstractC0284a != null) {
                    abstractC0284a.m2030a(3, mediaMetadataCompat, null);
                }
            }

            /* JADX INFO: renamed from: a */
            public void mo2025a(ParcelableVolumeInfo parcelableVolumeInfo) {
                AbstractC0284a abstractC0284a = this.f1480a.get();
                if (abstractC0284a != null) {
                    abstractC0284a.m2030a(4, parcelableVolumeInfo != null ? new C0289f(parcelableVolumeInfo.f1559a, parcelableVolumeInfo.f1560b, parcelableVolumeInfo.f1561c, parcelableVolumeInfo.f1562d, parcelableVolumeInfo.f1563e) : null, null);
                }
            }

            @Override // android.support.v4.media.session.InterfaceC0305a
            /* JADX INFO: renamed from: a */
            public void mo2050a(PlaybackStateCompat playbackStateCompat) {
                AbstractC0284a abstractC0284a = this.f1480a.get();
                if (abstractC0284a != null) {
                    abstractC0284a.m2030a(2, playbackStateCompat, null);
                }
            }

            /* JADX INFO: renamed from: a */
            public void mo2026a(CharSequence charSequence) {
                AbstractC0284a abstractC0284a = this.f1480a.get();
                if (abstractC0284a != null) {
                    abstractC0284a.m2030a(6, charSequence, null);
                }
            }

            @Override // android.support.v4.media.session.InterfaceC0305a
            /* JADX INFO: renamed from: a */
            public void mo2051a(String str, Bundle bundle) {
                AbstractC0284a abstractC0284a = this.f1480a.get();
                if (abstractC0284a != null) {
                    abstractC0284a.m2030a(1, str, bundle);
                }
            }

            /* JADX INFO: renamed from: a */
            public void mo2027a(List<MediaSessionCompat.QueueItem> list) {
                AbstractC0284a abstractC0284a = this.f1480a.get();
                if (abstractC0284a != null) {
                    abstractC0284a.m2030a(5, list, null);
                }
            }

            @Override // android.support.v4.media.session.InterfaceC0305a
            /* JADX INFO: renamed from: a */
            public void mo2052a(boolean z) {
            }

            @Override // android.support.v4.media.session.InterfaceC0305a
            /* JADX INFO: renamed from: b */
            public void mo2053b() {
                AbstractC0284a abstractC0284a = this.f1480a.get();
                if (abstractC0284a != null) {
                    abstractC0284a.m2030a(13, null, null);
                }
            }

            @Override // android.support.v4.media.session.InterfaceC0305a
            /* JADX INFO: renamed from: b */
            public void mo2054b(int i) {
                AbstractC0284a abstractC0284a = this.f1480a.get();
                if (abstractC0284a != null) {
                    abstractC0284a.m2030a(12, Integer.valueOf(i), null);
                }
            }

            @Override // android.support.v4.media.session.InterfaceC0305a
            /* JADX INFO: renamed from: b */
            public void mo2055b(boolean z) {
                AbstractC0284a abstractC0284a = this.f1480a.get();
                if (abstractC0284a != null) {
                    abstractC0284a.m2030a(11, Boolean.valueOf(z), null);
                }
            }
        }

        public AbstractC0284a() {
            if (Build.VERSION.SDK_INT >= 21) {
                this.f1476c = C0308d.m2257a((C0308d.a) new b(this));
            } else {
                this.f1476c = new c(this);
            }
        }

        /* JADX INFO: renamed from: a */
        public void m2028a() {
        }

        /* JADX INFO: renamed from: a */
        public void m2029a(int i) {
        }

        /* JADX INFO: renamed from: a */
        void m2030a(int i, Object obj, Bundle bundle) {
            if (this.f1474a != null) {
                Message messageObtainMessage = this.f1474a.obtainMessage(i, obj);
                messageObtainMessage.setData(bundle);
                messageObtainMessage.sendToTarget();
            }
        }

        /* JADX INFO: renamed from: a */
        public void m2031a(Bundle bundle) {
        }

        /* JADX INFO: renamed from: a */
        public void m2032a(MediaMetadataCompat mediaMetadataCompat) {
        }

        /* JADX INFO: renamed from: a */
        public void m2033a(C0289f c0289f) {
        }

        /* JADX INFO: renamed from: a */
        public void m2034a(PlaybackStateCompat playbackStateCompat) {
        }

        /* JADX INFO: renamed from: a */
        public void m2035a(CharSequence charSequence) {
        }

        /* JADX INFO: renamed from: a */
        public void m2036a(String str, Bundle bundle) {
        }

        /* JADX INFO: renamed from: a */
        public void m2037a(List<MediaSessionCompat.QueueItem> list) {
        }

        /* JADX INFO: renamed from: a */
        public void m2038a(boolean z) {
        }

        /* JADX INFO: renamed from: b */
        public void m2039b() {
        }

        /* JADX INFO: renamed from: b */
        public void m2040b(int i) {
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            m2039b();
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.session.MediaControllerCompat$b */
    interface InterfaceC0285b {
        /* JADX INFO: renamed from: a */
        MediaMetadataCompat mo2019a();

        /* JADX INFO: renamed from: a */
        boolean mo2021a(KeyEvent keyEvent);
    }

    /* JADX INFO: renamed from: android.support.v4.media.session.MediaControllerCompat$c */
    static class C0286c extends MediaControllerImplApi21 {
        public C0286c(Context context, MediaSessionCompat.Token token) {
            super(context, token);
        }

        public C0286c(Context context, MediaSessionCompat mediaSessionCompat) {
            super(context, mediaSessionCompat);
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.session.MediaControllerCompat$d */
    static class C0287d extends C0286c {
        public C0287d(Context context, MediaSessionCompat.Token token) {
            super(context, token);
        }

        public C0287d(Context context, MediaSessionCompat mediaSessionCompat) {
            super(context, mediaSessionCompat);
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.session.MediaControllerCompat$e */
    static class C0288e implements InterfaceC0285b {

        /* JADX INFO: renamed from: a */
        private InterfaceC0306b f1481a;

        public C0288e(MediaSessionCompat.Token token) {
            this.f1481a = InterfaceC0306b.a.m2250a((IBinder) token.m2084a());
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.InterfaceC0285b
        /* JADX INFO: renamed from: a */
        public MediaMetadataCompat mo2019a() {
            try {
                return this.f1481a.mo2195g();
            } catch (RemoteException e) {
                Log.e("MediaControllerCompat", "Dead object in getMetadata.", e);
                return null;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.InterfaceC0285b
        /* JADX INFO: renamed from: a */
        public boolean mo2021a(KeyEvent keyEvent) {
            if (keyEvent == null) {
                throw new IllegalArgumentException("event may not be null.");
            }
            try {
                this.f1481a.mo2177a(keyEvent);
                return false;
            } catch (RemoteException e) {
                Log.e("MediaControllerCompat", "Dead object in dispatchMediaButtonEvent.", e);
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.session.MediaControllerCompat$f */
    public static final class C0289f {

        /* JADX INFO: renamed from: a */
        private final int f1482a;

        /* JADX INFO: renamed from: b */
        private final int f1483b;

        /* JADX INFO: renamed from: c */
        private final int f1484c;

        /* JADX INFO: renamed from: d */
        private final int f1485d;

        /* JADX INFO: renamed from: e */
        private final int f1486e;

        C0289f(int i, int i2, int i3, int i4, int i5) {
            this.f1482a = i;
            this.f1483b = i2;
            this.f1484c = i3;
            this.f1485d = i4;
            this.f1486e = i5;
        }
    }

    public MediaControllerCompat(Context context, MediaSessionCompat.Token token) {
        if (token == null) {
            throw new IllegalArgumentException("sessionToken must not be null");
        }
        this.f1467b = token;
        if (Build.VERSION.SDK_INT >= 24) {
            this.f1466a = new C0287d(context, token);
            return;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            this.f1466a = new C0286c(context, token);
        } else if (Build.VERSION.SDK_INT >= 21) {
            this.f1466a = new MediaControllerImplApi21(context, token);
        } else {
            this.f1466a = new C0288e(this.f1467b);
        }
    }

    public MediaControllerCompat(Context context, MediaSessionCompat mediaSessionCompat) {
        if (mediaSessionCompat == null) {
            throw new IllegalArgumentException("session must not be null");
        }
        this.f1467b = mediaSessionCompat.m2071c();
        if (Build.VERSION.SDK_INT >= 24) {
            this.f1466a = new C0287d(context, mediaSessionCompat);
            return;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            this.f1466a = new C0286c(context, mediaSessionCompat);
        } else if (Build.VERSION.SDK_INT >= 21) {
            this.f1466a = new MediaControllerImplApi21(context, mediaSessionCompat);
        } else {
            this.f1466a = new C0288e(this.f1467b);
        }
    }

    /* JADX INFO: renamed from: a */
    public MediaMetadataCompat m2013a() {
        return this.f1466a.mo2019a();
    }

    /* JADX INFO: renamed from: a */
    public boolean m2014a(KeyEvent keyEvent) {
        if (keyEvent == null) {
            throw new IllegalArgumentException("KeyEvent may not be null");
        }
        return this.f1466a.mo2021a(keyEvent);
    }
}
