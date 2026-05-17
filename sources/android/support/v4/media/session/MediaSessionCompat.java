package android.support.v4.media.session;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.media.Rating;
import android.media.RemoteControlClient;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.support.design.C0025a;
import android.support.v4.media.AbstractC0281g;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.C0309e;
import android.support.v4.media.session.C0310f;
import android.support.v4.media.session.C0311g;
import android.support.v4.media.session.InterfaceC0306b;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.p006a.C0152h;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class MediaSessionCompat {

    /* JADX INFO: renamed from: a */
    static int f1487a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC0295b f1488b;

    /* JADX INFO: renamed from: c */
    private final MediaControllerCompat f1489c;

    /* JADX INFO: renamed from: d */
    private final ArrayList<InterfaceC0300g> f1490d = new ArrayList<>();

    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new Parcelable.Creator<QueueItem>() { // from class: android.support.v4.media.session.MediaSessionCompat.QueueItem.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public QueueItem[] newArray(int i) {
                return new QueueItem[i];
            }
        };

        /* JADX INFO: renamed from: a */
        private final MediaDescriptionCompat f1492a;

        /* JADX INFO: renamed from: b */
        private final long f1493b;

        /* JADX INFO: renamed from: c */
        private Object f1494c;

        QueueItem(Parcel parcel) {
            this.f1492a = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.f1493b = parcel.readLong();
        }

        private QueueItem(Object obj, MediaDescriptionCompat mediaDescriptionCompat, long j) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null.");
            }
            if (j == -1) {
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            }
            this.f1492a = mediaDescriptionCompat;
            this.f1493b = j;
            this.f1494c = obj;
        }

        /* JADX INFO: renamed from: a */
        public static QueueItem m2074a(Object obj) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            return new QueueItem(obj, MediaDescriptionCompat.m1933a(C0309e.c.m2279a(obj)), C0309e.c.m2280b(obj));
        }

        /* JADX INFO: renamed from: a */
        public static List<QueueItem> m2075a(List<?> list) {
            if (list == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<?> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(m2074a(it.next()));
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: a */
        public MediaDescriptionCompat m2076a() {
            return this.f1492a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "MediaSession.QueueItem {Description=" + this.f1492a + ", Id=" + this.f1493b + " }";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            this.f1492a.writeToParcel(parcel, i);
            parcel.writeLong(this.f1493b);
        }
    }

    static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new Parcelable.Creator<ResultReceiverWrapper>() { // from class: android.support.v4.media.session.MediaSessionCompat.ResultReceiverWrapper.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public ResultReceiverWrapper createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public ResultReceiverWrapper[] newArray(int i) {
                return new ResultReceiverWrapper[i];
            }
        };

        /* JADX INFO: renamed from: a */
        private ResultReceiver f1495a;

        ResultReceiverWrapper(Parcel parcel) {
            this.f1495a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            this.f1495a.writeToParcel(parcel, i);
        }
    }

    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new Parcelable.Creator<Token>() { // from class: android.support.v4.media.session.MediaSessionCompat.Token.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Token createFromParcel(Parcel parcel) {
                return new Token(Build.VERSION.SDK_INT >= 21 ? parcel.readParcelable(null) : parcel.readStrongBinder());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Token[] newArray(int i) {
                return new Token[i];
            }
        };

        /* JADX INFO: renamed from: a */
        private final Object f1496a;

        /* JADX INFO: renamed from: b */
        private final InterfaceC0306b f1497b;

        Token(Object obj) {
            this(obj, null);
        }

        Token(Object obj, InterfaceC0306b interfaceC0306b) {
            this.f1496a = obj;
            this.f1497b = interfaceC0306b;
        }

        /* JADX INFO: renamed from: a */
        public static Token m2082a(Object obj) {
            return m2083a(obj, null);
        }

        /* JADX INFO: renamed from: a */
        public static Token m2083a(Object obj, InterfaceC0306b interfaceC0306b) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            return new Token(C0309e.m2266a(obj), interfaceC0306b);
        }

        /* JADX INFO: renamed from: a */
        public Object m2084a() {
            return this.f1496a;
        }

        /* JADX INFO: renamed from: b */
        public InterfaceC0306b m2085b() {
            return this.f1497b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            if (this.f1496a == null) {
                return token.f1496a == null;
            }
            if (token.f1496a == null) {
                return false;
            }
            return this.f1496a.equals(token.f1496a);
        }

        public int hashCode() {
            if (this.f1496a == null) {
                return 0;
            }
            return this.f1496a.hashCode();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            if (Build.VERSION.SDK_INT >= 21) {
                parcel.writeParcelable((Parcelable) this.f1496a, i);
            } else {
                parcel.writeStrongBinder((IBinder) this.f1496a);
            }
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.session.MediaSessionCompat$a */
    public static abstract class AbstractC0294a {

        /* JADX INFO: renamed from: a */
        private WeakReference<InterfaceC0295b> f1498a;

        /* JADX INFO: renamed from: b */
        final Object f1499b;

        /* JADX INFO: renamed from: c */
        private a f1500c = null;

        /* JADX INFO: renamed from: d */
        private boolean f1501d;

        /* JADX INFO: renamed from: android.support.v4.media.session.MediaSessionCompat$a$a */
        private class a extends Handler {
            a(Looper looper) {
                super(looper);
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (message.what == 1) {
                    AbstractC0294a.this.m2092i();
                }
            }
        }

        /* JADX INFO: renamed from: android.support.v4.media.session.MediaSessionCompat$a$b */
        private class b implements C0309e.a {
            b() {
            }

            @Override // android.support.v4.media.session.C0309e.a
            /* JADX INFO: renamed from: a */
            public void mo2120a() {
                AbstractC0294a.this.mo2105b();
            }

            @Override // android.support.v4.media.session.C0309e.a
            /* JADX INFO: renamed from: a */
            public void mo2121a(long j) {
                AbstractC0294a.this.m2095a(j);
            }

            @Override // android.support.v4.media.session.C0309e.a
            /* JADX INFO: renamed from: a */
            public void mo2122a(Object obj) {
                AbstractC0294a.this.m2099a(RatingCompat.m1962a(obj));
            }

            @Override // android.support.v4.media.session.C0309e.a
            /* JADX INFO: renamed from: a */
            public void mo2123a(String str, Bundle bundle) {
                AbstractC0294a.this.m2112c(str, bundle);
            }

            @Override // android.support.v4.media.session.C0309e.a
            /* JADX INFO: renamed from: a */
            public void mo2124a(String str, Bundle bundle, ResultReceiver resultReceiver) {
                try {
                    if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                        C0298e c0298e = (C0298e) AbstractC0294a.this.f1498a.get();
                        if (c0298e != null) {
                            Bundle bundle2 = new Bundle();
                            InterfaceC0306b interfaceC0306bM2085b = c0298e.mo2151c().m2085b();
                            C0152h.m863a(bundle2, "android.support.v4.media.session.EXTRA_BINDER", interfaceC0306bM2085b != null ? interfaceC0306bM2085b.asBinder() : null);
                            resultReceiver.send(0, bundle2);
                            return;
                        }
                        return;
                    }
                    if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
                        bundle.setClassLoader(MediaDescriptionCompat.class.getClassLoader());
                        AbstractC0294a.this.m2097a((MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"));
                        return;
                    }
                    if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                        bundle.setClassLoader(MediaDescriptionCompat.class.getClassLoader());
                        AbstractC0294a.this.m2098a((MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX"));
                        return;
                    }
                    if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
                        bundle.setClassLoader(MediaDescriptionCompat.class.getClassLoader());
                        AbstractC0294a.this.m2109b((MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"));
                        return;
                    }
                    if (!str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT")) {
                        AbstractC0294a.this.m2102a(str, bundle, resultReceiver);
                        return;
                    }
                    C0298e c0298e2 = (C0298e) AbstractC0294a.this.f1498a.get();
                    if (c0298e2 == null || c0298e2.f1518j == null) {
                        return;
                    }
                    int i = bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX", -1);
                    QueueItem queueItem = (i < 0 || i >= c0298e2.f1518j.size()) ? null : (QueueItem) c0298e2.f1518j.get(i);
                    if (queueItem != null) {
                        AbstractC0294a.this.m2109b(queueItem.m2076a());
                    }
                } catch (BadParcelableException e) {
                    Log.e("MediaSessionCompat", "Could not unparcel the extra data.");
                }
            }

            @Override // android.support.v4.media.session.C0309e.a
            /* JADX INFO: renamed from: a */
            public boolean mo2125a(Intent intent) {
                return AbstractC0294a.this.mo2104a(intent);
            }

            @Override // android.support.v4.media.session.C0309e.a
            /* JADX INFO: renamed from: b */
            public void mo2126b() {
                AbstractC0294a.this.mo2111c();
            }

            @Override // android.support.v4.media.session.C0309e.a
            /* JADX INFO: renamed from: b */
            public void mo2127b(long j) {
                AbstractC0294a.this.m2107b(j);
            }

            @Override // android.support.v4.media.session.C0309e.a
            /* JADX INFO: renamed from: b */
            public void mo2128b(String str, Bundle bundle) {
                AbstractC0294a.this.m2114d(str, bundle);
            }

            @Override // android.support.v4.media.session.C0309e.a
            /* JADX INFO: renamed from: c */
            public void mo2129c() {
                AbstractC0294a.this.m2113d();
            }

            @Override // android.support.v4.media.session.C0309e.a
            /* JADX INFO: renamed from: c */
            public void mo2130c(String str, Bundle bundle) {
                if (str.equals("android.support.v4.media.session.action.PLAY_FROM_URI")) {
                    AbstractC0294a.this.m2108b((Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI"), (Bundle) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                    return;
                }
                if (str.equals("android.support.v4.media.session.action.PREPARE")) {
                    AbstractC0294a.this.m2093a();
                    return;
                }
                if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                    AbstractC0294a.this.m2101a(bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID"), bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                    return;
                }
                if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                    AbstractC0294a.this.m2110b(bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY"), bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                    return;
                }
                if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                    AbstractC0294a.this.m2096a((Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI"), bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                    return;
                }
                if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                    AbstractC0294a.this.m2103a(bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED"));
                    return;
                }
                if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                    AbstractC0294a.this.m2094a(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE"));
                    return;
                }
                if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                    AbstractC0294a.this.m2106b(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE"));
                } else {
                    if (!str.equals("android.support.v4.media.session.action.SET_RATING")) {
                        AbstractC0294a.this.m2116e(str, bundle);
                        return;
                    }
                    bundle.setClassLoader(RatingCompat.class.getClassLoader());
                    AbstractC0294a.this.m2100a((RatingCompat) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING"), bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                }
            }

            @Override // android.support.v4.media.session.C0309e.a
            /* JADX INFO: renamed from: d */
            public void mo2131d() {
                AbstractC0294a.this.m2115e();
            }

            @Override // android.support.v4.media.session.C0309e.a
            /* JADX INFO: renamed from: e */
            public void mo2132e() {
                AbstractC0294a.this.m2117f();
            }

            @Override // android.support.v4.media.session.C0309e.a
            /* JADX INFO: renamed from: f */
            public void mo2133f() {
                AbstractC0294a.this.m2118g();
            }

            @Override // android.support.v4.media.session.C0309e.a
            /* JADX INFO: renamed from: g */
            public void mo2134g() {
                AbstractC0294a.this.mo2119h();
            }
        }

        /* JADX INFO: renamed from: android.support.v4.media.session.MediaSessionCompat$a$c */
        private class c extends b implements C0310f.a {
            c() {
                super();
            }

            @Override // android.support.v4.media.session.C0310f.a
            /* JADX INFO: renamed from: a */
            public void mo2135a(Uri uri, Bundle bundle) {
                AbstractC0294a.this.m2108b(uri, bundle);
            }
        }

        /* JADX INFO: renamed from: android.support.v4.media.session.MediaSessionCompat$a$d */
        private class d extends c implements C0311g.a {
            d() {
                super();
            }

            @Override // android.support.v4.media.session.C0311g.a
            /* JADX INFO: renamed from: b */
            public void mo2136b(Uri uri, Bundle bundle) {
                AbstractC0294a.this.m2096a(uri, bundle);
            }

            @Override // android.support.v4.media.session.C0311g.a
            /* JADX INFO: renamed from: d */
            public void mo2137d(String str, Bundle bundle) {
                AbstractC0294a.this.m2101a(str, bundle);
            }

            @Override // android.support.v4.media.session.C0311g.a
            /* JADX INFO: renamed from: e */
            public void mo2138e(String str, Bundle bundle) {
                AbstractC0294a.this.m2110b(str, bundle);
            }

            @Override // android.support.v4.media.session.C0311g.a
            /* JADX INFO: renamed from: h */
            public void mo2139h() {
                AbstractC0294a.this.m2093a();
            }
        }

        public AbstractC0294a() {
            if (Build.VERSION.SDK_INT >= 24) {
                this.f1499b = C0311g.m2282a(new d());
                return;
            }
            if (Build.VERSION.SDK_INT >= 23) {
                this.f1499b = C0310f.m2281a(new c());
            } else if (Build.VERSION.SDK_INT >= 21) {
                this.f1499b = C0309e.m2265a((C0309e.a) new b());
            } else {
                this.f1499b = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public void m2090a(InterfaceC0295b interfaceC0295b, Handler handler) {
            this.f1498a = new WeakReference<>(interfaceC0295b);
            if (this.f1500c != null) {
                this.f1500c.removeCallbacksAndMessages(null);
            }
            this.f1500c = new a(handler.getLooper());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: i */
        public void m2092i() {
            if (this.f1501d) {
                this.f1501d = false;
                this.f1500c.removeMessages(1);
                InterfaceC0295b interfaceC0295b = this.f1498a.get();
                if (interfaceC0295b != null) {
                    PlaybackStateCompat playbackStateCompatMo2152d = interfaceC0295b.mo2152d();
                    long jM2236d = playbackStateCompatMo2152d == null ? 0L : playbackStateCompatMo2152d.m2236d();
                    boolean z = playbackStateCompatMo2152d != null && playbackStateCompatMo2152d.m2233a() == 3;
                    boolean z2 = (516 & jM2236d) != 0;
                    boolean z3 = (jM2236d & 514) != 0;
                    if (z && z3) {
                        mo2111c();
                    } else {
                        if (z || !z2) {
                            return;
                        }
                        mo2105b();
                    }
                }
            }
        }

        /* JADX INFO: renamed from: a */
        public void m2093a() {
        }

        /* JADX INFO: renamed from: a */
        public void m2094a(int i) {
        }

        /* JADX INFO: renamed from: a */
        public void m2095a(long j) {
        }

        /* JADX INFO: renamed from: a */
        public void m2096a(Uri uri, Bundle bundle) {
        }

        /* JADX INFO: renamed from: a */
        public void m2097a(MediaDescriptionCompat mediaDescriptionCompat) {
        }

        /* JADX INFO: renamed from: a */
        public void m2098a(MediaDescriptionCompat mediaDescriptionCompat, int i) {
        }

        /* JADX INFO: renamed from: a */
        public void m2099a(RatingCompat ratingCompat) {
        }

        /* JADX INFO: renamed from: a */
        public void m2100a(RatingCompat ratingCompat, Bundle bundle) {
        }

        /* JADX INFO: renamed from: a */
        public void m2101a(String str, Bundle bundle) {
        }

        /* JADX INFO: renamed from: a */
        public void m2102a(String str, Bundle bundle, ResultReceiver resultReceiver) {
        }

        /* JADX INFO: renamed from: a */
        public void m2103a(boolean z) {
        }

        /* JADX INFO: renamed from: a */
        public boolean mo2104a(Intent intent) {
            InterfaceC0295b interfaceC0295b = this.f1498a.get();
            if (interfaceC0295b == null || this.f1500c == null) {
                return false;
            }
            KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
            if (keyEvent == null || keyEvent.getAction() != 0) {
                return false;
            }
            switch (keyEvent.getKeyCode()) {
                case C0025a.j.AppCompatTheme_panelBackground /* 79 */:
                case 85:
                    if (keyEvent.getRepeatCount() > 0) {
                        m2092i();
                    } else if (this.f1501d) {
                        this.f1500c.removeMessages(1);
                        this.f1501d = false;
                        PlaybackStateCompat playbackStateCompatMo2152d = interfaceC0295b.mo2152d();
                        if (((playbackStateCompatMo2152d == null ? 0L : playbackStateCompatMo2152d.m2236d()) & 32) != 0) {
                            m2113d();
                        }
                    } else {
                        this.f1501d = true;
                        this.f1500c.sendEmptyMessageDelayed(1, ViewConfiguration.getDoubleTapTimeout());
                    }
                    break;
                default:
                    m2092i();
                    break;
            }
            return false;
        }

        /* JADX INFO: renamed from: b */
        public void mo2105b() {
        }

        /* JADX INFO: renamed from: b */
        public void m2106b(int i) {
        }

        /* JADX INFO: renamed from: b */
        public void m2107b(long j) {
        }

        /* JADX INFO: renamed from: b */
        public void m2108b(Uri uri, Bundle bundle) {
        }

        /* JADX INFO: renamed from: b */
        public void m2109b(MediaDescriptionCompat mediaDescriptionCompat) {
        }

        /* JADX INFO: renamed from: b */
        public void m2110b(String str, Bundle bundle) {
        }

        /* JADX INFO: renamed from: c */
        public void mo2111c() {
        }

        /* JADX INFO: renamed from: c */
        public void m2112c(String str, Bundle bundle) {
        }

        /* JADX INFO: renamed from: d */
        public void m2113d() {
        }

        /* JADX INFO: renamed from: d */
        public void m2114d(String str, Bundle bundle) {
        }

        /* JADX INFO: renamed from: e */
        public void m2115e() {
        }

        /* JADX INFO: renamed from: e */
        public void m2116e(String str, Bundle bundle) {
        }

        /* JADX INFO: renamed from: f */
        public void m2117f() {
        }

        /* JADX INFO: renamed from: g */
        public void m2118g() {
        }

        /* JADX INFO: renamed from: h */
        public void mo2119h() {
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.session.MediaSessionCompat$b */
    interface InterfaceC0295b {
        /* JADX INFO: renamed from: a */
        void mo2140a(int i);

        /* JADX INFO: renamed from: a */
        void mo2141a(PendingIntent pendingIntent);

        /* JADX INFO: renamed from: a */
        void mo2142a(MediaMetadataCompat mediaMetadataCompat);

        /* JADX INFO: renamed from: a */
        void mo2143a(AbstractC0281g abstractC0281g);

        /* JADX INFO: renamed from: a */
        void mo2144a(AbstractC0294a abstractC0294a, Handler handler);

        /* JADX INFO: renamed from: a */
        void mo2145a(PlaybackStateCompat playbackStateCompat);

        /* JADX INFO: renamed from: a */
        void mo2146a(boolean z);

        /* JADX INFO: renamed from: a */
        boolean mo2147a();

        /* JADX INFO: renamed from: b */
        void mo2148b();

        /* JADX INFO: renamed from: b */
        void mo2149b(int i);

        /* JADX INFO: renamed from: b */
        void mo2150b(PendingIntent pendingIntent);

        /* JADX INFO: renamed from: c */
        Token mo2151c();

        /* JADX INFO: renamed from: d */
        PlaybackStateCompat mo2152d();

        /* JADX INFO: renamed from: e */
        Object mo2153e();
    }

    /* JADX INFO: renamed from: android.support.v4.media.session.MediaSessionCompat$c */
    static class C0296c extends C0299f {

        /* JADX INFO: renamed from: x */
        private static boolean f1506x = true;

        C0296c(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
            super(context, str, componentName, pendingIntent);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.C0299f
        /* JADX INFO: renamed from: a */
        int mo2154a(long j) {
            int iMo2154a = super.mo2154a(j);
            return (256 & j) != 0 ? iMo2154a | 256 : iMo2154a;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.C0299f
        /* JADX INFO: renamed from: a */
        void mo2155a(PendingIntent pendingIntent, ComponentName componentName) {
            if (f1506x) {
                try {
                    this.f1529c.registerMediaButtonEventReceiver(pendingIntent);
                } catch (NullPointerException e) {
                    Log.w("MediaSessionCompat", "Unable to register media button event receiver with PendingIntent, falling back to ComponentName.");
                    f1506x = false;
                }
            }
            if (f1506x) {
                return;
            }
            super.mo2155a(pendingIntent, componentName);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.C0299f, android.support.v4.media.session.MediaSessionCompat.InterfaceC0295b
        /* JADX INFO: renamed from: a */
        public void mo2144a(AbstractC0294a abstractC0294a, Handler handler) {
            super.mo2144a(abstractC0294a, handler);
            if (abstractC0294a == null) {
                this.f1530d.setPlaybackPositionUpdateListener(null);
            } else {
                this.f1530d.setPlaybackPositionUpdateListener(new RemoteControlClient.OnPlaybackPositionUpdateListener() { // from class: android.support.v4.media.session.MediaSessionCompat.c.1
                    @Override // android.media.RemoteControlClient.OnPlaybackPositionUpdateListener
                    public void onPlaybackPositionUpdate(long j) {
                        C0296c.this.m2217a(18, Long.valueOf(j));
                    }
                });
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.C0299f
        /* JADX INFO: renamed from: b */
        void mo2156b(PendingIntent pendingIntent, ComponentName componentName) {
            if (f1506x) {
                this.f1529c.unregisterMediaButtonEventReceiver(pendingIntent);
            } else {
                super.mo2156b(pendingIntent, componentName);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.C0299f
        /* JADX INFO: renamed from: b */
        void mo2157b(PlaybackStateCompat playbackStateCompat) {
            long j;
            long j2 = 0;
            long jM2234b = playbackStateCompat.m2234b();
            float fM2235c = playbackStateCompat.m2235c();
            long jM2237e = playbackStateCompat.m2237e();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (playbackStateCompat.m2233a() != 3 || jM2234b <= 0) {
                j = jM2234b;
            } else {
                if (jM2237e > 0) {
                    j2 = jElapsedRealtime - jM2237e;
                    if (fM2235c > 0.0f && fM2235c != 1.0f) {
                        j2 = (long) (j2 * fM2235c);
                    }
                }
                j = j2 + jM2234b;
            }
            this.f1530d.setPlaybackState(m2224d(playbackStateCompat.m2233a()), j, fM2235c);
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.session.MediaSessionCompat$d */
    static class C0297d extends C0296c {
        C0297d(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
            super(context, str, componentName, pendingIntent);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.C0296c, android.support.v4.media.session.MediaSessionCompat.C0299f
        /* JADX INFO: renamed from: a */
        int mo2154a(long j) {
            int iMo2154a = super.mo2154a(j);
            return (128 & j) != 0 ? iMo2154a | 512 : iMo2154a;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.C0299f
        /* JADX INFO: renamed from: a */
        RemoteControlClient.MetadataEditor mo2158a(Bundle bundle) {
            RemoteControlClient.MetadataEditor metadataEditorA = super.mo2158a(bundle);
            if (((this.f1538l == null ? 0L : this.f1538l.m2236d()) & 128) != 0) {
                metadataEditorA.addEditableKey(268435457);
            }
            if (bundle != null) {
                if (bundle.containsKey("android.media.metadata.YEAR")) {
                    metadataEditorA.putLong(8, bundle.getLong("android.media.metadata.YEAR"));
                }
                if (bundle.containsKey("android.media.metadata.RATING")) {
                    metadataEditorA.putObject(101, (Object) bundle.getParcelable("android.media.metadata.RATING"));
                }
                if (bundle.containsKey("android.media.metadata.USER_RATING")) {
                    metadataEditorA.putObject(268435457, (Object) bundle.getParcelable("android.media.metadata.USER_RATING"));
                }
            }
            return metadataEditorA;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.C0296c, android.support.v4.media.session.MediaSessionCompat.C0299f, android.support.v4.media.session.MediaSessionCompat.InterfaceC0295b
        /* JADX INFO: renamed from: a */
        public void mo2144a(AbstractC0294a abstractC0294a, Handler handler) {
            super.mo2144a(abstractC0294a, handler);
            if (abstractC0294a == null) {
                this.f1530d.setMetadataUpdateListener(null);
            } else {
                this.f1530d.setMetadataUpdateListener(new RemoteControlClient.OnMetadataUpdateListener() { // from class: android.support.v4.media.session.MediaSessionCompat.d.1
                    @Override // android.media.RemoteControlClient.OnMetadataUpdateListener
                    public void onMetadataUpdate(int i, Object obj) {
                        if (i == 268435457 && (obj instanceof Rating)) {
                            C0297d.this.m2217a(19, RatingCompat.m1962a(obj));
                        }
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.session.MediaSessionCompat$e */
    static class C0298e implements InterfaceC0295b {

        /* JADX INFO: renamed from: a */
        int f1509a;

        /* JADX INFO: renamed from: b */
        boolean f1510b;

        /* JADX INFO: renamed from: c */
        int f1511c;

        /* JADX INFO: renamed from: d */
        int f1512d;

        /* JADX INFO: renamed from: e */
        private final Object f1513e;

        /* JADX INFO: renamed from: f */
        private final Token f1514f;

        /* JADX INFO: renamed from: g */
        private boolean f1515g = false;

        /* JADX INFO: renamed from: h */
        private final RemoteCallbackList<InterfaceC0305a> f1516h = new RemoteCallbackList<>();

        /* JADX INFO: renamed from: i */
        private PlaybackStateCompat f1517i;

        /* JADX INFO: renamed from: j */
        private List<QueueItem> f1518j;

        /* JADX INFO: renamed from: k */
        private MediaMetadataCompat f1519k;

        /* JADX INFO: renamed from: android.support.v4.media.session.MediaSessionCompat$e$a */
        class a extends InterfaceC0306b.a {
            a() {
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: a */
            public void mo2164a(int i) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: a */
            public void mo2165a(int i, int i2, String str) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: a */
            public void mo2166a(long j) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: a */
            public void mo2167a(Uri uri, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: a */
            public void mo2168a(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: a */
            public void mo2169a(MediaDescriptionCompat mediaDescriptionCompat, int i) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: a */
            public void mo2170a(RatingCompat ratingCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: a */
            public void mo2171a(RatingCompat ratingCompat, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: a */
            public void mo2172a(InterfaceC0305a interfaceC0305a) {
                if (C0298e.this.f1515g) {
                    return;
                }
                C0298e.this.f1516h.register(interfaceC0305a);
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: a */
            public void mo2173a(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: a */
            public void mo2174a(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: a */
            public void mo2175a(boolean z) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: a */
            public boolean mo2176a() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: a */
            public boolean mo2177a(KeyEvent keyEvent) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: b */
            public String mo2178b() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: b */
            public void mo2179b(int i) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: b */
            public void mo2180b(int i, int i2, String str) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: b */
            public void mo2181b(long j) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: b */
            public void mo2182b(Uri uri, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: b */
            public void mo2183b(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: b */
            public void mo2184b(InterfaceC0305a interfaceC0305a) {
                C0298e.this.f1516h.unregister(interfaceC0305a);
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: b */
            public void mo2185b(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: b */
            public void mo2186b(boolean z) {
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: c */
            public String mo2187c() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: c */
            public void mo2188c(int i) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: c */
            public void mo2189c(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: d */
            public PendingIntent mo2190d() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: d */
            public void mo2191d(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: e */
            public long mo2192e() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: e */
            public void mo2193e(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: f */
            public ParcelableVolumeInfo mo2194f() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: g */
            public MediaMetadataCompat mo2195g() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: h */
            public PlaybackStateCompat mo2196h() {
                return MediaSessionCompat.m2057b(C0298e.this.f1517i, C0298e.this.f1519k);
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: i */
            public List<QueueItem> mo2197i() {
                return null;
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: j */
            public CharSequence mo2198j() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: k */
            public Bundle mo2199k() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: l */
            public int mo2200l() {
                return C0298e.this.f1509a;
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: m */
            public boolean mo2201m() {
                return C0298e.this.f1510b;
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: n */
            public int mo2202n() {
                return C0298e.this.f1511c;
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: o */
            public boolean mo2203o() {
                return false;
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: p */
            public int mo2204p() {
                return C0298e.this.f1512d;
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: q */
            public void mo2205q() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: r */
            public void mo2206r() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: s */
            public void mo2207s() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: t */
            public void mo2208t() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: u */
            public void mo2209u() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: v */
            public void mo2210v() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: w */
            public void mo2211w() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: x */
            public void mo2212x() {
                throw new AssertionError();
            }
        }

        public C0298e(Context context, String str) {
            this.f1513e = C0309e.m2264a(context, str);
            this.f1514f = new Token(C0309e.m2278d(this.f1513e), new a());
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.InterfaceC0295b
        /* JADX INFO: renamed from: a */
        public void mo2140a(int i) {
            C0309e.m2267a(this.f1513e, i);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.InterfaceC0295b
        /* JADX INFO: renamed from: a */
        public void mo2141a(PendingIntent pendingIntent) {
            C0309e.m2268a(this.f1513e, pendingIntent);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.InterfaceC0295b
        /* JADX INFO: renamed from: a */
        public void mo2142a(MediaMetadataCompat mediaMetadataCompat) {
            this.f1519k = mediaMetadataCompat;
            C0309e.m2277c(this.f1513e, mediaMetadataCompat == null ? null : mediaMetadataCompat.m1951b());
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.InterfaceC0295b
        /* JADX INFO: renamed from: a */
        public void mo2143a(AbstractC0281g abstractC0281g) {
            C0309e.m2269a(this.f1513e, abstractC0281g.m2007d());
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.InterfaceC0295b
        /* JADX INFO: renamed from: a */
        public void mo2144a(AbstractC0294a abstractC0294a, Handler handler) {
            C0309e.m2270a(this.f1513e, abstractC0294a == null ? null : abstractC0294a.f1499b, handler);
            if (abstractC0294a != null) {
                abstractC0294a.m2090a(this, handler);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.InterfaceC0295b
        /* JADX INFO: renamed from: a */
        public void mo2145a(PlaybackStateCompat playbackStateCompat) {
            this.f1517i = playbackStateCompat;
            for (int iBeginBroadcast = this.f1516h.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                try {
                    ((InterfaceC0305a) this.f1516h.getBroadcastItem(iBeginBroadcast)).mo2050a(playbackStateCompat);
                } catch (RemoteException e) {
                }
            }
            this.f1516h.finishBroadcast();
            C0309e.m2274b(this.f1513e, playbackStateCompat == null ? null : playbackStateCompat.m2238f());
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.InterfaceC0295b
        /* JADX INFO: renamed from: a */
        public void mo2146a(boolean z) {
            C0309e.m2271a(this.f1513e, z);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.InterfaceC0295b
        /* JADX INFO: renamed from: a */
        public boolean mo2147a() {
            return C0309e.m2275b(this.f1513e);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.InterfaceC0295b
        /* JADX INFO: renamed from: b */
        public void mo2148b() {
            this.f1515g = true;
            C0309e.m2276c(this.f1513e);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.InterfaceC0295b
        /* JADX INFO: renamed from: b */
        public void mo2149b(int i) {
            C0309e.m2272b(this.f1513e, i);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.InterfaceC0295b
        /* JADX INFO: renamed from: b */
        public void mo2150b(PendingIntent pendingIntent) {
            C0309e.m2273b(this.f1513e, pendingIntent);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.InterfaceC0295b
        /* JADX INFO: renamed from: c */
        public Token mo2151c() {
            return this.f1514f;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.InterfaceC0295b
        /* JADX INFO: renamed from: d */
        public PlaybackStateCompat mo2152d() {
            return this.f1517i;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.InterfaceC0295b
        /* JADX INFO: renamed from: e */
        public Object mo2153e() {
            return null;
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.session.MediaSessionCompat$f */
    static class C0299f implements InterfaceC0295b {

        /* JADX INFO: renamed from: A */
        private final b f1521A;

        /* JADX INFO: renamed from: B */
        private final Token f1522B;

        /* JADX INFO: renamed from: C */
        private c f1523C;

        /* JADX INFO: renamed from: a */
        final String f1527a;

        /* JADX INFO: renamed from: b */
        final String f1528b;

        /* JADX INFO: renamed from: c */
        final AudioManager f1529c;

        /* JADX INFO: renamed from: d */
        final RemoteControlClient f1530d;

        /* JADX INFO: renamed from: i */
        volatile AbstractC0294a f1535i;

        /* JADX INFO: renamed from: j */
        int f1536j;

        /* JADX INFO: renamed from: k */
        MediaMetadataCompat f1537k;

        /* JADX INFO: renamed from: l */
        PlaybackStateCompat f1538l;

        /* JADX INFO: renamed from: m */
        PendingIntent f1539m;

        /* JADX INFO: renamed from: n */
        List<QueueItem> f1540n;

        /* JADX INFO: renamed from: o */
        CharSequence f1541o;

        /* JADX INFO: renamed from: p */
        int f1542p;

        /* JADX INFO: renamed from: q */
        boolean f1543q;

        /* JADX INFO: renamed from: r */
        int f1544r;

        /* JADX INFO: renamed from: s */
        int f1545s;

        /* JADX INFO: renamed from: t */
        Bundle f1546t;

        /* JADX INFO: renamed from: u */
        int f1547u;

        /* JADX INFO: renamed from: v */
        int f1548v;

        /* JADX INFO: renamed from: w */
        AbstractC0281g f1549w;

        /* JADX INFO: renamed from: x */
        private final Context f1550x;

        /* JADX INFO: renamed from: y */
        private final ComponentName f1551y;

        /* JADX INFO: renamed from: z */
        private final PendingIntent f1552z;

        /* JADX INFO: renamed from: e */
        final Object f1531e = new Object();

        /* JADX INFO: renamed from: f */
        final RemoteCallbackList<InterfaceC0305a> f1532f = new RemoteCallbackList<>();

        /* JADX INFO: renamed from: g */
        boolean f1533g = false;

        /* JADX INFO: renamed from: h */
        boolean f1534h = false;

        /* JADX INFO: renamed from: D */
        private boolean f1524D = false;

        /* JADX INFO: renamed from: E */
        private boolean f1525E = false;

        /* JADX INFO: renamed from: F */
        private AbstractC0281g.a f1526F = new AbstractC0281g.a() { // from class: android.support.v4.media.session.MediaSessionCompat.f.1
            @Override // android.support.v4.media.AbstractC0281g.a
            /* JADX INFO: renamed from: a */
            public void mo2010a(AbstractC0281g abstractC0281g) {
                if (C0299f.this.f1549w != abstractC0281g) {
                    return;
                }
                C0299f.this.m2220a(new ParcelableVolumeInfo(C0299f.this.f1547u, C0299f.this.f1548v, abstractC0281g.m2003b(), abstractC0281g.m2005c(), abstractC0281g.m2000a()));
            }
        };

        /* JADX INFO: renamed from: android.support.v4.media.session.MediaSessionCompat$f$a */
        private static final class a {

            /* JADX INFO: renamed from: a */
            public final String f1554a;

            /* JADX INFO: renamed from: b */
            public final Bundle f1555b;

            /* JADX INFO: renamed from: c */
            public final ResultReceiver f1556c;

            public a(String str, Bundle bundle, ResultReceiver resultReceiver) {
                this.f1554a = str;
                this.f1555b = bundle;
                this.f1556c = resultReceiver;
            }
        }

        /* JADX INFO: renamed from: android.support.v4.media.session.MediaSessionCompat$f$b */
        class b extends InterfaceC0306b.a {
            b() {
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: a */
            public void mo2164a(int i) {
                C0299f.this.m2216a(28, i);
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: a */
            public void mo2165a(int i, int i2, String str) {
                C0299f.this.m2221b(i, i2);
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: a */
            public void mo2166a(long j) {
                C0299f.this.m2217a(11, Long.valueOf(j));
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: a */
            public void mo2167a(Uri uri, Bundle bundle) {
                C0299f.this.m2219a(6, uri, bundle);
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: a */
            public void mo2168a(MediaDescriptionCompat mediaDescriptionCompat) {
                C0299f.this.m2217a(25, mediaDescriptionCompat);
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: a */
            public void mo2169a(MediaDescriptionCompat mediaDescriptionCompat, int i) {
                C0299f.this.m2218a(26, mediaDescriptionCompat, i);
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: a */
            public void mo2170a(RatingCompat ratingCompat) {
                C0299f.this.m2217a(19, ratingCompat);
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: a */
            public void mo2171a(RatingCompat ratingCompat, Bundle bundle) {
                C0299f.this.m2219a(31, ratingCompat, bundle);
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: a */
            public void mo2172a(InterfaceC0305a interfaceC0305a) {
                if (!C0299f.this.f1533g) {
                    C0299f.this.f1532f.register(interfaceC0305a);
                } else {
                    try {
                        interfaceC0305a.mo2022a();
                    } catch (Exception e) {
                    }
                }
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: a */
            public void mo2173a(String str, Bundle bundle) {
                C0299f.this.m2219a(4, str, bundle);
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: a */
            public void mo2174a(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) {
                C0299f.this.m2217a(1, new a(str, bundle, resultReceiverWrapper.f1495a));
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: a */
            public void mo2175a(boolean z) {
                C0299f.this.m2217a(29, Boolean.valueOf(z));
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: a */
            public boolean mo2176a() {
                return (C0299f.this.f1536j & 2) != 0;
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: a */
            public boolean mo2177a(KeyEvent keyEvent) {
                boolean z = (C0299f.this.f1536j & 1) != 0;
                if (z) {
                    C0299f.this.m2217a(21, keyEvent);
                }
                return z;
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: b */
            public String mo2178b() {
                return C0299f.this.f1527a;
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: b */
            public void mo2179b(int i) {
                C0299f.this.m2216a(23, i);
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: b */
            public void mo2180b(int i, int i2, String str) {
                C0299f.this.m2223c(i, i2);
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: b */
            public void mo2181b(long j) {
                C0299f.this.m2217a(18, Long.valueOf(j));
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: b */
            public void mo2182b(Uri uri, Bundle bundle) {
                C0299f.this.m2219a(10, uri, bundle);
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: b */
            public void mo2183b(MediaDescriptionCompat mediaDescriptionCompat) {
                C0299f.this.m2217a(27, mediaDescriptionCompat);
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: b */
            public void mo2184b(InterfaceC0305a interfaceC0305a) {
                C0299f.this.f1532f.unregister(interfaceC0305a);
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: b */
            public void mo2185b(String str, Bundle bundle) {
                C0299f.this.m2219a(5, str, bundle);
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: b */
            public void mo2186b(boolean z) {
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: c */
            public String mo2187c() {
                return C0299f.this.f1528b;
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: c */
            public void mo2188c(int i) {
                C0299f.this.m2216a(30, i);
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: c */
            public void mo2189c(String str, Bundle bundle) {
                C0299f.this.m2219a(8, str, bundle);
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: d */
            public PendingIntent mo2190d() {
                PendingIntent pendingIntent;
                synchronized (C0299f.this.f1531e) {
                    pendingIntent = C0299f.this.f1539m;
                }
                return pendingIntent;
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: d */
            public void mo2191d(String str, Bundle bundle) {
                C0299f.this.m2219a(9, str, bundle);
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: e */
            public long mo2192e() {
                long j;
                synchronized (C0299f.this.f1531e) {
                    j = C0299f.this.f1536j;
                }
                return j;
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: e */
            public void mo2193e(String str, Bundle bundle) {
                C0299f.this.m2219a(20, str, bundle);
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: f */
            public ParcelableVolumeInfo mo2194f() {
                int i;
                int i2;
                int streamMaxVolume;
                int streamVolume;
                int iM2003b = 2;
                synchronized (C0299f.this.f1531e) {
                    i = C0299f.this.f1547u;
                    i2 = C0299f.this.f1548v;
                    AbstractC0281g abstractC0281g = C0299f.this.f1549w;
                    if (i == 2) {
                        iM2003b = abstractC0281g.m2003b();
                        streamMaxVolume = abstractC0281g.m2005c();
                        streamVolume = abstractC0281g.m2000a();
                    } else {
                        streamMaxVolume = C0299f.this.f1529c.getStreamMaxVolume(i2);
                        streamVolume = C0299f.this.f1529c.getStreamVolume(i2);
                    }
                }
                return new ParcelableVolumeInfo(i, i2, iM2003b, streamMaxVolume, streamVolume);
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: g */
            public MediaMetadataCompat mo2195g() {
                return C0299f.this.f1537k;
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: h */
            public PlaybackStateCompat mo2196h() {
                PlaybackStateCompat playbackStateCompat;
                MediaMetadataCompat mediaMetadataCompat;
                synchronized (C0299f.this.f1531e) {
                    playbackStateCompat = C0299f.this.f1538l;
                    mediaMetadataCompat = C0299f.this.f1537k;
                }
                return MediaSessionCompat.m2057b(playbackStateCompat, mediaMetadataCompat);
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: i */
            public List<QueueItem> mo2197i() {
                List<QueueItem> list;
                synchronized (C0299f.this.f1531e) {
                    list = C0299f.this.f1540n;
                }
                return list;
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: j */
            public CharSequence mo2198j() {
                return C0299f.this.f1541o;
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: k */
            public Bundle mo2199k() {
                Bundle bundle;
                synchronized (C0299f.this.f1531e) {
                    bundle = C0299f.this.f1546t;
                }
                return bundle;
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: l */
            public int mo2200l() {
                return C0299f.this.f1542p;
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: m */
            public boolean mo2201m() {
                return C0299f.this.f1543q;
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: n */
            public int mo2202n() {
                return C0299f.this.f1544r;
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: o */
            public boolean mo2203o() {
                return false;
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: p */
            public int mo2204p() {
                return C0299f.this.f1545s;
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: q */
            public void mo2205q() {
                C0299f.this.m2222c(3);
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: r */
            public void mo2206r() {
                C0299f.this.m2222c(7);
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: s */
            public void mo2207s() {
                C0299f.this.m2222c(12);
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: t */
            public void mo2208t() {
                C0299f.this.m2222c(13);
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: u */
            public void mo2209u() {
                C0299f.this.m2222c(14);
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: v */
            public void mo2210v() {
                C0299f.this.m2222c(15);
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: w */
            public void mo2211w() {
                C0299f.this.m2222c(16);
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: x */
            public void mo2212x() {
                C0299f.this.m2222c(17);
            }
        }

        /* JADX INFO: renamed from: android.support.v4.media.session.MediaSessionCompat$f$c */
        class c extends Handler {
            public c(Looper looper) {
                super(looper);
            }

            /* JADX INFO: renamed from: a */
            private void m2226a(KeyEvent keyEvent, AbstractC0294a abstractC0294a) {
                if (keyEvent == null || keyEvent.getAction() != 0) {
                    return;
                }
                long jM2236d = C0299f.this.f1538l == null ? 0L : C0299f.this.f1538l.m2236d();
                switch (keyEvent.getKeyCode()) {
                    case C0025a.j.AppCompatTheme_panelBackground /* 79 */:
                    case 85:
                        Log.w("MediaSessionCompat", "KEYCODE_MEDIA_PLAY_PAUSE and KEYCODE_HEADSETHOOK are handled already");
                        break;
                    case 86:
                        if ((jM2236d & 1) != 0) {
                            abstractC0294a.mo2119h();
                        }
                        break;
                    case 87:
                        if ((jM2236d & 32) != 0) {
                            abstractC0294a.m2113d();
                        }
                        break;
                    case 88:
                        if ((jM2236d & 16) != 0) {
                            abstractC0294a.m2115e();
                        }
                        break;
                    case 89:
                        if ((jM2236d & 8) != 0) {
                            abstractC0294a.m2118g();
                        }
                        break;
                    case 90:
                        if ((jM2236d & 64) != 0) {
                            abstractC0294a.m2117f();
                        }
                        break;
                    case 126:
                        if ((jM2236d & 4) != 0) {
                            abstractC0294a.mo2105b();
                        }
                        break;
                    case 127:
                        if ((jM2236d & 2) != 0) {
                            abstractC0294a.mo2111c();
                        }
                        break;
                }
            }

            /* JADX INFO: renamed from: a */
            public void m2227a(int i, Object obj, int i2) {
                obtainMessage(i, i2, 0, obj).sendToTarget();
            }

            /* JADX INFO: renamed from: a */
            public void m2228a(int i, Object obj, Bundle bundle) {
                Message messageObtainMessage = obtainMessage(i, obj);
                messageObtainMessage.setData(bundle);
                messageObtainMessage.sendToTarget();
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                AbstractC0294a abstractC0294a = C0299f.this.f1535i;
                if (abstractC0294a == null) {
                }
                switch (message.what) {
                    case 1:
                        a aVar = (a) message.obj;
                        abstractC0294a.m2102a(aVar.f1554a, aVar.f1555b, aVar.f1556c);
                        break;
                    case 2:
                        C0299f.this.m2221b(message.arg1, 0);
                        break;
                    case 3:
                        abstractC0294a.m2093a();
                        break;
                    case 4:
                        abstractC0294a.m2101a((String) message.obj, message.getData());
                        break;
                    case 5:
                        abstractC0294a.m2110b((String) message.obj, message.getData());
                        break;
                    case 6:
                        abstractC0294a.m2096a((Uri) message.obj, message.getData());
                        break;
                    case 7:
                        abstractC0294a.mo2105b();
                        break;
                    case 8:
                        abstractC0294a.m2112c((String) message.obj, message.getData());
                        break;
                    case 9:
                        abstractC0294a.m2114d((String) message.obj, message.getData());
                        break;
                    case 10:
                        abstractC0294a.m2108b((Uri) message.obj, message.getData());
                        break;
                    case 11:
                        abstractC0294a.m2095a(((Long) message.obj).longValue());
                        break;
                    case 12:
                        abstractC0294a.mo2111c();
                        break;
                    case 13:
                        abstractC0294a.mo2119h();
                        break;
                    case 14:
                        abstractC0294a.m2113d();
                        break;
                    case 15:
                        abstractC0294a.m2115e();
                        break;
                    case 16:
                        abstractC0294a.m2117f();
                        break;
                    case 17:
                        abstractC0294a.m2118g();
                        break;
                    case 18:
                        abstractC0294a.m2107b(((Long) message.obj).longValue());
                        break;
                    case 19:
                        abstractC0294a.m2099a((RatingCompat) message.obj);
                        break;
                    case 20:
                        abstractC0294a.m2116e((String) message.obj, message.getData());
                        break;
                    case 21:
                        KeyEvent keyEvent = (KeyEvent) message.obj;
                        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                        intent.putExtra("android.intent.extra.KEY_EVENT", keyEvent);
                        if (!abstractC0294a.mo2104a(intent)) {
                            m2226a(keyEvent, abstractC0294a);
                        }
                        break;
                    case 22:
                        C0299f.this.m2223c(message.arg1, 0);
                        break;
                    case 23:
                        abstractC0294a.m2094a(message.arg1);
                        break;
                    case 25:
                        abstractC0294a.m2097a((MediaDescriptionCompat) message.obj);
                        break;
                    case 26:
                        abstractC0294a.m2098a((MediaDescriptionCompat) message.obj, message.arg1);
                        break;
                    case 27:
                        abstractC0294a.m2109b((MediaDescriptionCompat) message.obj);
                        break;
                    case 28:
                        if (C0299f.this.f1540n != null) {
                            QueueItem queueItem = (message.arg1 < 0 || message.arg1 >= C0299f.this.f1540n.size()) ? null : C0299f.this.f1540n.get(message.arg1);
                            if (queueItem != null) {
                                abstractC0294a.m2109b(queueItem.m2076a());
                            }
                        }
                        break;
                    case 29:
                        abstractC0294a.m2103a(((Boolean) message.obj).booleanValue());
                        break;
                    case 30:
                        abstractC0294a.m2106b(message.arg1);
                        break;
                    case 31:
                        abstractC0294a.m2100a((RatingCompat) message.obj, message.getData());
                        break;
                }
            }
        }

        public C0299f(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
            if (componentName == null) {
                throw new IllegalArgumentException("MediaButtonReceiver component may not be null.");
            }
            this.f1550x = context;
            this.f1527a = context.getPackageName();
            this.f1529c = (AudioManager) context.getSystemService("audio");
            this.f1528b = str;
            this.f1551y = componentName;
            this.f1552z = pendingIntent;
            this.f1521A = new b();
            this.f1522B = new Token(this.f1521A);
            this.f1542p = 0;
            this.f1547u = 1;
            this.f1548v = 3;
            this.f1530d = new RemoteControlClient(pendingIntent);
        }

        /* JADX INFO: renamed from: b */
        private void m2213b(MediaMetadataCompat mediaMetadataCompat) {
            for (int iBeginBroadcast = this.f1532f.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                try {
                    ((InterfaceC0305a) this.f1532f.getBroadcastItem(iBeginBroadcast)).mo2024a(mediaMetadataCompat);
                } catch (RemoteException e) {
                }
            }
            this.f1532f.finishBroadcast();
        }

        /* JADX INFO: renamed from: c */
        private void m2214c(PlaybackStateCompat playbackStateCompat) {
            for (int iBeginBroadcast = this.f1532f.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                try {
                    ((InterfaceC0305a) this.f1532f.getBroadcastItem(iBeginBroadcast)).mo2050a(playbackStateCompat);
                } catch (RemoteException e) {
                }
            }
            this.f1532f.finishBroadcast();
        }

        /* JADX INFO: renamed from: g */
        private void m2215g() {
            for (int iBeginBroadcast = this.f1532f.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                try {
                    ((InterfaceC0305a) this.f1532f.getBroadcastItem(iBeginBroadcast)).mo2022a();
                } catch (RemoteException e) {
                }
            }
            this.f1532f.finishBroadcast();
            this.f1532f.kill();
        }

        /* JADX INFO: renamed from: a */
        int mo2154a(long j) {
            int i = (1 & j) != 0 ? 32 : 0;
            if ((2 & j) != 0) {
                i |= 16;
            }
            if ((4 & j) != 0) {
                i |= 4;
            }
            if ((8 & j) != 0) {
                i |= 2;
            }
            if ((16 & j) != 0) {
                i |= 1;
            }
            if ((32 & j) != 0) {
                i |= 128;
            }
            if ((64 & j) != 0) {
                i |= 64;
            }
            return (512 & j) != 0 ? i | 8 : i;
        }

        /* JADX INFO: renamed from: a */
        RemoteControlClient.MetadataEditor mo2158a(Bundle bundle) {
            RemoteControlClient.MetadataEditor metadataEditorEditMetadata = this.f1530d.editMetadata(true);
            if (bundle == null) {
                return metadataEditorEditMetadata;
            }
            if (bundle.containsKey("android.media.metadata.ART")) {
                Bitmap bitmapCopy = (Bitmap) bundle.getParcelable("android.media.metadata.ART");
                if (bitmapCopy != null) {
                    bitmapCopy = bitmapCopy.copy(bitmapCopy.getConfig(), false);
                }
                metadataEditorEditMetadata.putBitmap(100, bitmapCopy);
            } else if (bundle.containsKey("android.media.metadata.ALBUM_ART")) {
                Bitmap bitmapCopy2 = (Bitmap) bundle.getParcelable("android.media.metadata.ALBUM_ART");
                if (bitmapCopy2 != null) {
                    bitmapCopy2 = bitmapCopy2.copy(bitmapCopy2.getConfig(), false);
                }
                metadataEditorEditMetadata.putBitmap(100, bitmapCopy2);
            }
            if (bundle.containsKey("android.media.metadata.ALBUM")) {
                metadataEditorEditMetadata.putString(1, bundle.getString("android.media.metadata.ALBUM"));
            }
            if (bundle.containsKey("android.media.metadata.ALBUM_ARTIST")) {
                metadataEditorEditMetadata.putString(13, bundle.getString("android.media.metadata.ALBUM_ARTIST"));
            }
            if (bundle.containsKey("android.media.metadata.ARTIST")) {
                metadataEditorEditMetadata.putString(2, bundle.getString("android.media.metadata.ARTIST"));
            }
            if (bundle.containsKey("android.media.metadata.AUTHOR")) {
                metadataEditorEditMetadata.putString(3, bundle.getString("android.media.metadata.AUTHOR"));
            }
            if (bundle.containsKey("android.media.metadata.COMPILATION")) {
                metadataEditorEditMetadata.putString(15, bundle.getString("android.media.metadata.COMPILATION"));
            }
            if (bundle.containsKey("android.media.metadata.COMPOSER")) {
                metadataEditorEditMetadata.putString(4, bundle.getString("android.media.metadata.COMPOSER"));
            }
            if (bundle.containsKey("android.media.metadata.DATE")) {
                metadataEditorEditMetadata.putString(5, bundle.getString("android.media.metadata.DATE"));
            }
            if (bundle.containsKey("android.media.metadata.DISC_NUMBER")) {
                metadataEditorEditMetadata.putLong(14, bundle.getLong("android.media.metadata.DISC_NUMBER"));
            }
            if (bundle.containsKey("android.media.metadata.DURATION")) {
                metadataEditorEditMetadata.putLong(9, bundle.getLong("android.media.metadata.DURATION"));
            }
            if (bundle.containsKey("android.media.metadata.GENRE")) {
                metadataEditorEditMetadata.putString(6, bundle.getString("android.media.metadata.GENRE"));
            }
            if (bundle.containsKey("android.media.metadata.TITLE")) {
                metadataEditorEditMetadata.putString(7, bundle.getString("android.media.metadata.TITLE"));
            }
            if (bundle.containsKey("android.media.metadata.TRACK_NUMBER")) {
                metadataEditorEditMetadata.putLong(0, bundle.getLong("android.media.metadata.TRACK_NUMBER"));
            }
            if (bundle.containsKey("android.media.metadata.WRITER")) {
                metadataEditorEditMetadata.putString(11, bundle.getString("android.media.metadata.WRITER"));
            }
            return metadataEditorEditMetadata;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.InterfaceC0295b
        /* JADX INFO: renamed from: a */
        public void mo2140a(int i) {
            synchronized (this.f1531e) {
                this.f1536j = i;
            }
            m2225f();
        }

        /* JADX INFO: renamed from: a */
        void m2216a(int i, int i2) {
            m2218a(i, (Object) null, i2);
        }

        /* JADX INFO: renamed from: a */
        void m2217a(int i, Object obj) {
            m2219a(i, obj, (Bundle) null);
        }

        /* JADX INFO: renamed from: a */
        void m2218a(int i, Object obj, int i2) {
            synchronized (this.f1531e) {
                if (this.f1523C != null) {
                    this.f1523C.m2227a(i, obj, i2);
                }
            }
        }

        /* JADX INFO: renamed from: a */
        void m2219a(int i, Object obj, Bundle bundle) {
            synchronized (this.f1531e) {
                if (this.f1523C != null) {
                    this.f1523C.m2228a(i, obj, bundle);
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.InterfaceC0295b
        /* JADX INFO: renamed from: a */
        public void mo2141a(PendingIntent pendingIntent) {
            synchronized (this.f1531e) {
                this.f1539m = pendingIntent;
            }
        }

        /* JADX INFO: renamed from: a */
        void mo2155a(PendingIntent pendingIntent, ComponentName componentName) {
            this.f1529c.registerMediaButtonEventReceiver(componentName);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.InterfaceC0295b
        /* JADX INFO: renamed from: a */
        public void mo2142a(MediaMetadataCompat mediaMetadataCompat) {
            if (mediaMetadataCompat != null) {
                mediaMetadataCompat = new MediaMetadataCompat.C0273a(mediaMetadataCompat, MediaSessionCompat.f1487a).m1958a();
            }
            synchronized (this.f1531e) {
                this.f1537k = mediaMetadataCompat;
            }
            m2213b(mediaMetadataCompat);
            if (this.f1534h) {
                mo2158a(mediaMetadataCompat == null ? null : mediaMetadataCompat.m1948a()).apply();
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.InterfaceC0295b
        /* JADX INFO: renamed from: a */
        public void mo2143a(AbstractC0281g abstractC0281g) {
            if (abstractC0281g == null) {
                throw new IllegalArgumentException("volumeProvider may not be null");
            }
            if (this.f1549w != null) {
                this.f1549w.m2002a((AbstractC0281g.a) null);
            }
            this.f1547u = 2;
            this.f1549w = abstractC0281g;
            m2220a(new ParcelableVolumeInfo(this.f1547u, this.f1548v, this.f1549w.m2003b(), this.f1549w.m2005c(), this.f1549w.m2000a()));
            abstractC0281g.m2002a(this.f1526F);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.InterfaceC0295b
        /* JADX INFO: renamed from: a */
        public void mo2144a(AbstractC0294a abstractC0294a, Handler handler) {
            this.f1535i = abstractC0294a;
            if (abstractC0294a != null) {
                if (handler == null) {
                    handler = new Handler();
                }
                synchronized (this.f1531e) {
                    if (this.f1523C != null) {
                        this.f1523C.removeCallbacksAndMessages(null);
                    }
                    this.f1523C = new c(handler.getLooper());
                    this.f1535i.m2090a(this, handler);
                }
            }
        }

        /* JADX INFO: renamed from: a */
        void m2220a(ParcelableVolumeInfo parcelableVolumeInfo) {
            for (int iBeginBroadcast = this.f1532f.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                try {
                    ((InterfaceC0305a) this.f1532f.getBroadcastItem(iBeginBroadcast)).mo2025a(parcelableVolumeInfo);
                } catch (RemoteException e) {
                }
            }
            this.f1532f.finishBroadcast();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.InterfaceC0295b
        /* JADX INFO: renamed from: a */
        public void mo2145a(PlaybackStateCompat playbackStateCompat) {
            synchronized (this.f1531e) {
                this.f1538l = playbackStateCompat;
            }
            m2214c(playbackStateCompat);
            if (this.f1534h) {
                if (playbackStateCompat == null) {
                    this.f1530d.setPlaybackState(0);
                    this.f1530d.setTransportControlFlags(0);
                } else {
                    mo2157b(playbackStateCompat);
                    this.f1530d.setTransportControlFlags(mo2154a(playbackStateCompat.m2236d()));
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.InterfaceC0295b
        /* JADX INFO: renamed from: a */
        public void mo2146a(boolean z) {
            if (z == this.f1534h) {
                return;
            }
            this.f1534h = z;
            if (m2225f()) {
                mo2142a(this.f1537k);
                mo2145a(this.f1538l);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.InterfaceC0295b
        /* JADX INFO: renamed from: a */
        public boolean mo2147a() {
            return this.f1534h;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.InterfaceC0295b
        /* JADX INFO: renamed from: b */
        public void mo2148b() {
            this.f1534h = false;
            this.f1533g = true;
            m2225f();
            m2215g();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.InterfaceC0295b
        /* JADX INFO: renamed from: b */
        public void mo2149b(int i) {
            if (this.f1549w != null) {
                this.f1549w.m2002a((AbstractC0281g.a) null);
            }
            this.f1547u = 1;
            m2220a(new ParcelableVolumeInfo(this.f1547u, this.f1548v, 2, this.f1529c.getStreamMaxVolume(this.f1548v), this.f1529c.getStreamVolume(this.f1548v)));
        }

        /* JADX INFO: renamed from: b */
        void m2221b(int i, int i2) {
            if (this.f1547u != 2) {
                this.f1529c.adjustStreamVolume(this.f1548v, i, i2);
            } else if (this.f1549w != null) {
                this.f1549w.mo2006c(i);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.InterfaceC0295b
        /* JADX INFO: renamed from: b */
        public void mo2150b(PendingIntent pendingIntent) {
        }

        /* JADX INFO: renamed from: b */
        void mo2156b(PendingIntent pendingIntent, ComponentName componentName) {
            this.f1529c.unregisterMediaButtonEventReceiver(componentName);
        }

        /* JADX INFO: renamed from: b */
        void mo2157b(PlaybackStateCompat playbackStateCompat) {
            this.f1530d.setPlaybackState(m2224d(playbackStateCompat.m2233a()));
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.InterfaceC0295b
        /* JADX INFO: renamed from: c */
        public Token mo2151c() {
            return this.f1522B;
        }

        /* JADX INFO: renamed from: c */
        void m2222c(int i) {
            m2217a(i, (Object) null);
        }

        /* JADX INFO: renamed from: c */
        void m2223c(int i, int i2) {
            if (this.f1547u != 2) {
                this.f1529c.setStreamVolume(this.f1548v, i, i2);
            } else if (this.f1549w != null) {
                this.f1549w.mo2004b(i);
            }
        }

        /* JADX INFO: renamed from: d */
        int m2224d(int i) {
            switch (i) {
                case 0:
                    return 0;
                case 1:
                    return 1;
                case 2:
                    return 2;
                case 3:
                    return 3;
                case 4:
                    return 4;
                case 5:
                    return 5;
                case 6:
                case 8:
                    return 8;
                case 7:
                    return 9;
                case 9:
                    return 7;
                case 10:
                case 11:
                    return 6;
                default:
                    return -1;
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.InterfaceC0295b
        /* JADX INFO: renamed from: d */
        public PlaybackStateCompat mo2152d() {
            PlaybackStateCompat playbackStateCompat;
            synchronized (this.f1531e) {
                playbackStateCompat = this.f1538l;
            }
            return playbackStateCompat;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.InterfaceC0295b
        /* JADX INFO: renamed from: e */
        public Object mo2153e() {
            return null;
        }

        /* JADX INFO: renamed from: f */
        boolean m2225f() {
            if (this.f1534h) {
                if (!this.f1524D && (this.f1536j & 1) != 0) {
                    mo2155a(this.f1552z, this.f1551y);
                    this.f1524D = true;
                } else if (this.f1524D && (this.f1536j & 1) == 0) {
                    mo2156b(this.f1552z, this.f1551y);
                    this.f1524D = false;
                }
                if (!this.f1525E && (this.f1536j & 2) != 0) {
                    this.f1529c.registerRemoteControlClient(this.f1530d);
                    this.f1525E = true;
                    return true;
                }
                if (this.f1525E && (this.f1536j & 2) == 0) {
                    this.f1530d.setPlaybackState(0);
                    this.f1529c.unregisterRemoteControlClient(this.f1530d);
                    this.f1525E = false;
                    return false;
                }
            } else {
                if (this.f1524D) {
                    mo2156b(this.f1552z, this.f1551y);
                    this.f1524D = false;
                }
                if (this.f1525E) {
                    this.f1530d.setPlaybackState(0);
                    this.f1529c.unregisterRemoteControlClient(this.f1530d);
                    this.f1525E = false;
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.session.MediaSessionCompat$g */
    public interface InterfaceC0300g {
        /* JADX INFO: renamed from: a */
        void mo2229a();
    }

    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("tag must not be null or empty");
        }
        if (componentName == null && (componentName = C0307c.m2251a(context)) == null) {
            Log.w("MediaSessionCompat", "Couldn't find a unique registered media button receiver in the given context.");
        }
        if (componentName != null && pendingIntent == null) {
            Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
            intent.setComponent(componentName);
            pendingIntent = PendingIntent.getBroadcast(context, 0, intent, 0);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            this.f1488b = new C0298e(context, str);
            m2062a(new AbstractC0294a() { // from class: android.support.v4.media.session.MediaSessionCompat.1
            });
            this.f1488b.mo2150b(pendingIntent);
        } else if (Build.VERSION.SDK_INT >= 19) {
            this.f1488b = new C0297d(context, str, componentName, pendingIntent);
        } else if (Build.VERSION.SDK_INT >= 18) {
            this.f1488b = new C0296c(context, str, componentName, pendingIntent);
        } else {
            this.f1488b = new C0299f(context, str, componentName, pendingIntent);
        }
        this.f1489c = new MediaControllerCompat(context, this);
        if (f1487a == 0) {
            f1487a = (int) TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static PlaybackStateCompat m2057b(PlaybackStateCompat playbackStateCompat, MediaMetadataCompat mediaMetadataCompat) {
        long jM1950b = -1;
        if (playbackStateCompat == null || playbackStateCompat.m2234b() == -1) {
            return playbackStateCompat;
        }
        if (playbackStateCompat.m2233a() != 3 && playbackStateCompat.m2233a() != 4 && playbackStateCompat.m2233a() != 5) {
            return playbackStateCompat;
        }
        if (playbackStateCompat.m2237e() <= 0) {
            return playbackStateCompat;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jM2235c = ((long) (playbackStateCompat.m2235c() * (jElapsedRealtime - r8))) + playbackStateCompat.m2234b();
        if (mediaMetadataCompat != null && mediaMetadataCompat.m1949a("android.media.metadata.DURATION")) {
            jM1950b = mediaMetadataCompat.m1950b("android.media.metadata.DURATION");
        }
        if (jM1950b < 0 || jM2235c <= jM1950b) {
            jM1950b = jM2235c < 0 ? 0L : jM2235c;
        }
        return new PlaybackStateCompat.C0304a(playbackStateCompat).m2246a(playbackStateCompat.m2233a(), jM1950b, playbackStateCompat.m2235c(), jElapsedRealtime).m2248a();
    }

    /* JADX INFO: renamed from: a */
    public void m2058a(int i) {
        this.f1488b.mo2140a(i);
    }

    /* JADX INFO: renamed from: a */
    public void m2059a(PendingIntent pendingIntent) {
        this.f1488b.mo2141a(pendingIntent);
    }

    /* JADX INFO: renamed from: a */
    public void m2060a(MediaMetadataCompat mediaMetadataCompat) {
        this.f1488b.mo2142a(mediaMetadataCompat);
    }

    /* JADX INFO: renamed from: a */
    public void m2061a(AbstractC0281g abstractC0281g) {
        if (abstractC0281g == null) {
            throw new IllegalArgumentException("volumeProvider may not be null!");
        }
        this.f1488b.mo2143a(abstractC0281g);
    }

    /* JADX INFO: renamed from: a */
    public void m2062a(AbstractC0294a abstractC0294a) {
        m2063a(abstractC0294a, (Handler) null);
    }

    /* JADX INFO: renamed from: a */
    public void m2063a(AbstractC0294a abstractC0294a, Handler handler) {
        InterfaceC0295b interfaceC0295b = this.f1488b;
        if (handler == null) {
            handler = new Handler();
        }
        interfaceC0295b.mo2144a(abstractC0294a, handler);
    }

    /* JADX INFO: renamed from: a */
    public void m2064a(InterfaceC0300g interfaceC0300g) {
        if (interfaceC0300g == null) {
            throw new IllegalArgumentException("Listener may not be null");
        }
        this.f1490d.add(interfaceC0300g);
    }

    /* JADX INFO: renamed from: a */
    public void m2065a(PlaybackStateCompat playbackStateCompat) {
        this.f1488b.mo2145a(playbackStateCompat);
    }

    /* JADX INFO: renamed from: a */
    public void m2066a(boolean z) {
        this.f1488b.mo2146a(z);
        Iterator<InterfaceC0300g> it = this.f1490d.iterator();
        while (it.hasNext()) {
            it.next().mo2229a();
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m2067a() {
        return this.f1488b.mo2147a();
    }

    /* JADX INFO: renamed from: b */
    public void m2068b() {
        this.f1488b.mo2148b();
    }

    /* JADX INFO: renamed from: b */
    public void m2069b(int i) {
        this.f1488b.mo2149b(i);
    }

    /* JADX INFO: renamed from: b */
    public void m2070b(InterfaceC0300g interfaceC0300g) {
        if (interfaceC0300g == null) {
            throw new IllegalArgumentException("Listener may not be null");
        }
        this.f1490d.remove(interfaceC0300g);
    }

    /* JADX INFO: renamed from: c */
    public Token m2071c() {
        return this.f1488b.mo2151c();
    }

    /* JADX INFO: renamed from: d */
    public MediaControllerCompat m2072d() {
        return this.f1489c;
    }

    /* JADX INFO: renamed from: e */
    public Object m2073e() {
        return this.f1488b.mo2153e();
    }
}
