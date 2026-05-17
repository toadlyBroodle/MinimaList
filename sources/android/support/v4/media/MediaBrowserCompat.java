package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.v4.media.C0275a;
import android.support.v4.media.C0276b;
import android.support.v4.media.session.InterfaceC0306b;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.p006a.C0152h;
import android.support.v4.p016g.C0202d;
import android.support.v4.p018i.C0207a;
import android.text.TextUtils;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class MediaBrowserCompat {

    /* JADX INFO: renamed from: a */
    static final boolean f1375a = Log.isLoggable("MediaBrowserCompat", 3);

    /* JADX INFO: renamed from: b */
    private final InterfaceC0260e f1376b;

    private static class CustomActionResultReceiver extends C0202d {

        /* JADX INFO: renamed from: d */
        private final String f1377d;

        /* JADX INFO: renamed from: e */
        private final Bundle f1378e;

        /* JADX INFO: renamed from: f */
        private final AbstractC0258c f1379f;

        @Override // android.support.v4.p016g.C0202d
        /* JADX INFO: renamed from: a */
        protected void mo1468a(int i, Bundle bundle) {
            if (this.f1379f == null) {
            }
            switch (i) {
                case -1:
                    this.f1379f.m1896c(this.f1377d, this.f1378e, bundle);
                    break;
                case 0:
                    this.f1379f.m1895b(this.f1377d, this.f1378e, bundle);
                    break;
                case 1:
                    this.f1379f.m1894a(this.f1377d, this.f1378e, bundle);
                    break;
                default:
                    Log.w("MediaBrowserCompat", "Unknown result code: " + i + " (extras=" + this.f1378e + ", resultData=" + bundle + ")");
                    break;
            }
        }
    }

    private static class ItemReceiver extends C0202d {

        /* JADX INFO: renamed from: d */
        private final String f1380d;

        /* JADX INFO: renamed from: e */
        private final AbstractC0259d f1381e;

        @Override // android.support.v4.p016g.C0202d
        /* JADX INFO: renamed from: a */
        protected void mo1468a(int i, Bundle bundle) {
            if (bundle != null) {
                bundle.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            }
            if (i != 0 || bundle == null || !bundle.containsKey("media_item")) {
                this.f1381e.m1898a(this.f1380d);
                return;
            }
            Parcelable parcelable = bundle.getParcelable("media_item");
            if (parcelable == null || (parcelable instanceof MediaItem)) {
                this.f1381e.m1897a((MediaItem) parcelable);
            } else {
                this.f1381e.m1898a(this.f1380d);
            }
        }
    }

    public static class MediaItem implements Parcelable {
        public static final Parcelable.Creator<MediaItem> CREATOR = new Parcelable.Creator<MediaItem>() { // from class: android.support.v4.media.MediaBrowserCompat.MediaItem.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public MediaItem createFromParcel(Parcel parcel) {
                return new MediaItem(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public MediaItem[] newArray(int i) {
                return new MediaItem[i];
            }
        };

        /* JADX INFO: renamed from: a */
        private final int f1382a;

        /* JADX INFO: renamed from: b */
        private final MediaDescriptionCompat f1383b;

        MediaItem(Parcel parcel) {
            this.f1382a = parcel.readInt();
            this.f1383b = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }

        public MediaItem(MediaDescriptionCompat mediaDescriptionCompat, int i) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("description cannot be null");
            }
            if (TextUtils.isEmpty(mediaDescriptionCompat.m1934a())) {
                throw new IllegalArgumentException("description must have a non-empty media id");
            }
            this.f1382a = i;
            this.f1383b = mediaDescriptionCompat;
        }

        /* JADX INFO: renamed from: a */
        public static MediaItem m1879a(Object obj) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            return new MediaItem(MediaDescriptionCompat.m1933a(C0275a.c.m1975b(obj)), C0275a.c.m1974a(obj));
        }

        /* JADX INFO: renamed from: a */
        public static List<MediaItem> m1880a(List<?> list) {
            if (list == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator<?> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(m1879a(it.next()));
            }
            return arrayList;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("MediaItem{");
            sb.append("mFlags=").append(this.f1382a);
            sb.append(", mDescription=").append(this.f1383b);
            sb.append('}');
            return sb.toString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f1382a);
            this.f1383b.writeToParcel(parcel, i);
        }
    }

    private static class SearchResultReceiver extends C0202d {

        /* JADX INFO: renamed from: d */
        private final String f1384d;

        /* JADX INFO: renamed from: e */
        private final Bundle f1385e;

        /* JADX INFO: renamed from: f */
        private final AbstractC0266k f1386f;

        @Override // android.support.v4.p016g.C0202d
        /* JADX INFO: renamed from: a */
        protected void mo1468a(int i, Bundle bundle) {
            if (bundle != null) {
                bundle.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            }
            if (i != 0 || bundle == null || !bundle.containsKey("search_results")) {
                this.f1386f.m1912a(this.f1384d, this.f1385e);
                return;
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
            ArrayList arrayList = null;
            if (parcelableArray != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Parcelable parcelable : parcelableArray) {
                    arrayList2.add((MediaItem) parcelable);
                }
                arrayList = arrayList2;
            }
            this.f1386f.m1913a(this.f1384d, this.f1385e, arrayList);
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.MediaBrowserCompat$a */
    private static class HandlerC0256a extends Handler {

        /* JADX INFO: renamed from: a */
        private final WeakReference<InterfaceC0265j> f1387a;

        /* JADX INFO: renamed from: b */
        private WeakReference<Messenger> f1388b;

        HandlerC0256a(InterfaceC0265j interfaceC0265j) {
            this.f1387a = new WeakReference<>(interfaceC0265j);
        }

        /* JADX INFO: renamed from: a */
        void m1883a(Messenger messenger) {
            this.f1388b = new WeakReference<>(messenger);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (this.f1388b == null || this.f1388b.get() == null || this.f1387a.get() == null) {
                return;
            }
            Bundle data = message.getData();
            data.setClassLoader(MediaSessionCompat.class.getClassLoader());
            InterfaceC0265j interfaceC0265j = this.f1387a.get();
            Messenger messenger = this.f1388b.get();
            try {
                switch (message.what) {
                    case 1:
                        interfaceC0265j.mo1903a(messenger, data.getString("data_media_item_id"), (MediaSessionCompat.Token) data.getParcelable("data_media_session_token"), data.getBundle("data_root_hints"));
                        break;
                    case 2:
                        interfaceC0265j.mo1902a(messenger);
                        break;
                    case 3:
                        interfaceC0265j.mo1904a(messenger, data.getString("data_media_item_id"), data.getParcelableArrayList("data_media_item_list"), data.getBundle("data_options"));
                        break;
                    default:
                        Log.w("MediaBrowserCompat", "Unhandled message: " + message + "\n  Client version: 1\n  Service version: " + message.arg1);
                        break;
                }
            } catch (BadParcelableException e) {
                Log.e("MediaBrowserCompat", "Could not unparcel the data.");
                if (message.what == 1) {
                    interfaceC0265j.mo1902a(messenger);
                }
            }
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.MediaBrowserCompat$b */
    public static class C0257b {

        /* JADX INFO: renamed from: a */
        final Object f1389a;

        /* JADX INFO: renamed from: b */
        a f1390b;

        /* JADX INFO: renamed from: android.support.v4.media.MediaBrowserCompat$b$a */
        interface a {
            /* JADX INFO: renamed from: a */
            void mo1888a();

            /* JADX INFO: renamed from: b */
            void mo1889b();

            /* JADX INFO: renamed from: c */
            void mo1890c();
        }

        /* JADX INFO: renamed from: android.support.v4.media.MediaBrowserCompat$b$b */
        private class b implements C0275a.a {
            b() {
            }

            @Override // android.support.v4.media.C0275a.a
            /* JADX INFO: renamed from: a */
            public void mo1891a() {
                if (C0257b.this.f1390b != null) {
                    C0257b.this.f1390b.mo1888a();
                }
                C0257b.this.mo1884a();
            }

            @Override // android.support.v4.media.C0275a.a
            /* JADX INFO: renamed from: b */
            public void mo1892b() {
                if (C0257b.this.f1390b != null) {
                    C0257b.this.f1390b.mo1889b();
                }
                C0257b.this.mo1886b();
            }

            @Override // android.support.v4.media.C0275a.a
            /* JADX INFO: renamed from: c */
            public void mo1893c() {
                if (C0257b.this.f1390b != null) {
                    C0257b.this.f1390b.mo1890c();
                }
                C0257b.this.mo1887c();
            }
        }

        public C0257b() {
            if (Build.VERSION.SDK_INT >= 21) {
                this.f1389a = C0275a.m1968a((C0275a.a) new b());
            } else {
                this.f1389a = null;
            }
        }

        /* JADX INFO: renamed from: a */
        public void mo1884a() {
        }

        /* JADX INFO: renamed from: a */
        void m1885a(a aVar) {
            this.f1390b = aVar;
        }

        /* JADX INFO: renamed from: b */
        public void mo1886b() {
        }

        /* JADX INFO: renamed from: c */
        public void mo1887c() {
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.MediaBrowserCompat$c */
    public static abstract class AbstractC0258c {
        /* JADX INFO: renamed from: a */
        public void m1894a(String str, Bundle bundle, Bundle bundle2) {
        }

        /* JADX INFO: renamed from: b */
        public void m1895b(String str, Bundle bundle, Bundle bundle2) {
        }

        /* JADX INFO: renamed from: c */
        public void m1896c(String str, Bundle bundle, Bundle bundle2) {
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.MediaBrowserCompat$d */
    public static abstract class AbstractC0259d {
        /* JADX INFO: renamed from: a */
        public void m1897a(MediaItem mediaItem) {
        }

        /* JADX INFO: renamed from: a */
        public void m1898a(String str) {
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.MediaBrowserCompat$e */
    interface InterfaceC0260e {
        /* JADX INFO: renamed from: d */
        void mo1899d();

        /* JADX INFO: renamed from: e */
        void mo1900e();

        /* JADX INFO: renamed from: f */
        MediaSessionCompat.Token mo1901f();
    }

    /* JADX INFO: renamed from: android.support.v4.media.MediaBrowserCompat$f */
    static class C0261f implements C0257b.a, InterfaceC0260e, InterfaceC0265j {

        /* JADX INFO: renamed from: a */
        final Context f1392a;

        /* JADX INFO: renamed from: b */
        protected final Object f1393b;

        /* JADX INFO: renamed from: c */
        protected final Bundle f1394c;

        /* JADX INFO: renamed from: e */
        protected C0267l f1396e;

        /* JADX INFO: renamed from: f */
        protected Messenger f1397f;

        /* JADX INFO: renamed from: h */
        private MediaSessionCompat.Token f1399h;

        /* JADX INFO: renamed from: d */
        protected final HandlerC0256a f1395d = new HandlerC0256a(this);

        /* JADX INFO: renamed from: g */
        private final C0207a<String, C0268m> f1398g = new C0207a<>();

        C0261f(Context context, ComponentName componentName, C0257b c0257b, Bundle bundle) {
            this.f1392a = context;
            bundle = bundle == null ? new Bundle() : bundle;
            bundle.putInt("extra_client_version", 1);
            this.f1394c = new Bundle(bundle);
            c0257b.m1885a(this);
            this.f1393b = C0275a.m1967a(context, componentName, c0257b.f1389a, this.f1394c);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.C0257b.a
        /* JADX INFO: renamed from: a */
        public void mo1888a() {
            Bundle bundleM1972c = C0275a.m1972c(this.f1393b);
            if (bundleM1972c == null) {
                return;
            }
            IBinder iBinderM862a = C0152h.m862a(bundleM1972c, "extra_messenger");
            if (iBinderM862a != null) {
                this.f1396e = new C0267l(iBinderM862a, this.f1394c);
                this.f1397f = new Messenger(this.f1395d);
                this.f1395d.m1883a(this.f1397f);
                try {
                    this.f1396e.m1918b(this.f1397f);
                } catch (RemoteException e) {
                    Log.i("MediaBrowserCompat", "Remote error registering client messenger.");
                }
            }
            InterfaceC0306b interfaceC0306bM2250a = InterfaceC0306b.a.m2250a(C0152h.m862a(bundleM1972c, "extra_session_binder"));
            if (interfaceC0306bM2250a != null) {
                this.f1399h = MediaSessionCompat.Token.m2083a(C0275a.m1973d(this.f1393b), interfaceC0306bM2250a);
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.InterfaceC0265j
        /* JADX INFO: renamed from: a */
        public void mo1902a(Messenger messenger) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.InterfaceC0265j
        /* JADX INFO: renamed from: a */
        public void mo1903a(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.InterfaceC0265j
        /* JADX INFO: renamed from: a */
        public void mo1904a(Messenger messenger, String str, List list, Bundle bundle) {
            if (this.f1397f != messenger) {
                return;
            }
            C0268m c0268m = this.f1398g.get(str);
            if (c0268m == null) {
                if (MediaBrowserCompat.f1375a) {
                    Log.d("MediaBrowserCompat", "onLoadChildren for id that isn't subscribed id=" + str);
                    return;
                }
                return;
            }
            AbstractC0269n abstractC0269nM1920a = c0268m.m1920a(this.f1392a, bundle);
            if (abstractC0269nM1920a != null) {
                if (bundle == null) {
                    if (list == null) {
                        abstractC0269nM1920a.m1924a(str);
                        return;
                    } else {
                        abstractC0269nM1920a.m1926a(str, (List<MediaItem>) list);
                        return;
                    }
                }
                if (list == null) {
                    abstractC0269nM1920a.m1925a(str, bundle);
                } else {
                    abstractC0269nM1920a.m1927a(str, list, bundle);
                }
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.C0257b.a
        /* JADX INFO: renamed from: b */
        public void mo1889b() {
            this.f1396e = null;
            this.f1397f = null;
            this.f1399h = null;
            this.f1395d.m1883a(null);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.C0257b.a
        /* JADX INFO: renamed from: c */
        public void mo1890c() {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.InterfaceC0260e
        /* JADX INFO: renamed from: d */
        public void mo1899d() {
            C0275a.m1970a(this.f1393b);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.InterfaceC0260e
        /* JADX INFO: renamed from: e */
        public void mo1900e() {
            if (this.f1396e != null && this.f1397f != null) {
                try {
                    this.f1396e.m1919c(this.f1397f);
                } catch (RemoteException e) {
                    Log.i("MediaBrowserCompat", "Remote error unregistering client messenger.");
                }
            }
            C0275a.m1971b(this.f1393b);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.InterfaceC0260e
        /* JADX INFO: renamed from: f */
        public MediaSessionCompat.Token mo1901f() {
            if (this.f1399h == null) {
                this.f1399h = MediaSessionCompat.Token.m2082a(C0275a.m1973d(this.f1393b));
            }
            return this.f1399h;
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.MediaBrowserCompat$g */
    static class C0262g extends C0261f {
        C0262g(Context context, ComponentName componentName, C0257b c0257b, Bundle bundle) {
            super(context, componentName, c0257b, bundle);
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.MediaBrowserCompat$h */
    static class C0263h extends C0262g {
        C0263h(Context context, ComponentName componentName, C0257b c0257b, Bundle bundle) {
            super(context, componentName, c0257b, bundle);
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.MediaBrowserCompat$i */
    static class C0264i implements InterfaceC0260e, InterfaceC0265j {

        /* JADX INFO: renamed from: a */
        final Context f1400a;

        /* JADX INFO: renamed from: b */
        final ComponentName f1401b;

        /* JADX INFO: renamed from: c */
        final C0257b f1402c;

        /* JADX INFO: renamed from: d */
        final Bundle f1403d;

        /* JADX INFO: renamed from: g */
        a f1406g;

        /* JADX INFO: renamed from: h */
        C0267l f1407h;

        /* JADX INFO: renamed from: i */
        Messenger f1408i;

        /* JADX INFO: renamed from: k */
        private String f1410k;

        /* JADX INFO: renamed from: l */
        private MediaSessionCompat.Token f1411l;

        /* JADX INFO: renamed from: m */
        private Bundle f1412m;

        /* JADX INFO: renamed from: e */
        final HandlerC0256a f1404e = new HandlerC0256a(this);

        /* JADX INFO: renamed from: j */
        private final C0207a<String, C0268m> f1409j = new C0207a<>();

        /* JADX INFO: renamed from: f */
        int f1405f = 1;

        /* JADX INFO: renamed from: android.support.v4.media.MediaBrowserCompat$i$a */
        private class a implements ServiceConnection {
            a() {
            }

            /* JADX INFO: renamed from: a */
            private void m1910a(Runnable runnable) {
                if (Thread.currentThread() == C0264i.this.f1404e.getLooper().getThread()) {
                    runnable.run();
                } else {
                    C0264i.this.f1404e.post(runnable);
                }
            }

            /* JADX INFO: renamed from: a */
            boolean m1911a(String str) {
                if (C0264i.this.f1406g == this && C0264i.this.f1405f != 0 && C0264i.this.f1405f != 1) {
                    return true;
                }
                if (C0264i.this.f1405f != 0 && C0264i.this.f1405f != 1) {
                    Log.i("MediaBrowserCompat", str + " for " + C0264i.this.f1401b + " with mServiceConnection=" + C0264i.this.f1406g + " this=" + this);
                }
                return false;
            }

            @Override // android.content.ServiceConnection
            public void onServiceConnected(final ComponentName componentName, final IBinder iBinder) {
                m1910a(new Runnable() { // from class: android.support.v4.media.MediaBrowserCompat.i.a.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (MediaBrowserCompat.f1375a) {
                            Log.d("MediaBrowserCompat", "MediaServiceConnection.onServiceConnected name=" + componentName + " binder=" + iBinder);
                            C0264i.this.m1909c();
                        }
                        if (a.this.m1911a("onServiceConnected")) {
                            C0264i.this.f1407h = new C0267l(iBinder, C0264i.this.f1403d);
                            C0264i.this.f1408i = new Messenger(C0264i.this.f1404e);
                            C0264i.this.f1404e.m1883a(C0264i.this.f1408i);
                            C0264i.this.f1405f = 2;
                            try {
                                if (MediaBrowserCompat.f1375a) {
                                    Log.d("MediaBrowserCompat", "ServiceCallbacks.onConnect...");
                                    C0264i.this.m1909c();
                                }
                                C0264i.this.f1407h.m1915a(C0264i.this.f1400a, C0264i.this.f1408i);
                            } catch (RemoteException e) {
                                Log.w("MediaBrowserCompat", "RemoteException during connect for " + C0264i.this.f1401b);
                                if (MediaBrowserCompat.f1375a) {
                                    Log.d("MediaBrowserCompat", "ServiceCallbacks.onConnect...");
                                    C0264i.this.m1909c();
                                }
                            }
                        }
                    }
                });
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(final ComponentName componentName) {
                m1910a(new Runnable() { // from class: android.support.v4.media.MediaBrowserCompat.i.a.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (MediaBrowserCompat.f1375a) {
                            Log.d("MediaBrowserCompat", "MediaServiceConnection.onServiceDisconnected name=" + componentName + " this=" + this + " mServiceConnection=" + C0264i.this.f1406g);
                            C0264i.this.m1909c();
                        }
                        if (a.this.m1911a("onServiceDisconnected")) {
                            C0264i.this.f1407h = null;
                            C0264i.this.f1408i = null;
                            C0264i.this.f1404e.m1883a(null);
                            C0264i.this.f1405f = 4;
                            C0264i.this.f1402c.mo1886b();
                        }
                    }
                });
            }
        }

        public C0264i(Context context, ComponentName componentName, C0257b c0257b, Bundle bundle) {
            if (context == null) {
                throw new IllegalArgumentException("context must not be null");
            }
            if (componentName == null) {
                throw new IllegalArgumentException("service component must not be null");
            }
            if (c0257b == null) {
                throw new IllegalArgumentException("connection callback must not be null");
            }
            this.f1400a = context;
            this.f1401b = componentName;
            this.f1402c = c0257b;
            this.f1403d = bundle == null ? null : new Bundle(bundle);
        }

        /* JADX INFO: renamed from: a */
        private static String m1905a(int i) {
            switch (i) {
                case 0:
                    return "CONNECT_STATE_DISCONNECTING";
                case 1:
                    return "CONNECT_STATE_DISCONNECTED";
                case 2:
                    return "CONNECT_STATE_CONNECTING";
                case 3:
                    return "CONNECT_STATE_CONNECTED";
                case 4:
                    return "CONNECT_STATE_SUSPENDED";
                default:
                    return "UNKNOWN/" + i;
            }
        }

        /* JADX INFO: renamed from: a */
        private boolean m1906a(Messenger messenger, String str) {
            if (this.f1408i == messenger && this.f1405f != 0 && this.f1405f != 1) {
                return true;
            }
            if (this.f1405f != 0 && this.f1405f != 1) {
                Log.i("MediaBrowserCompat", str + " for " + this.f1401b + " with mCallbacksMessenger=" + this.f1408i + " this=" + this);
            }
            return false;
        }

        /* JADX INFO: renamed from: a */
        void m1907a() {
            if (this.f1406g != null) {
                this.f1400a.unbindService(this.f1406g);
            }
            this.f1405f = 1;
            this.f1406g = null;
            this.f1407h = null;
            this.f1408i = null;
            this.f1404e.m1883a(null);
            this.f1410k = null;
            this.f1411l = null;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.InterfaceC0265j
        /* JADX INFO: renamed from: a */
        public void mo1902a(Messenger messenger) {
            Log.e("MediaBrowserCompat", "onConnectFailed for " + this.f1401b);
            if (m1906a(messenger, "onConnectFailed")) {
                if (this.f1405f != 2) {
                    Log.w("MediaBrowserCompat", "onConnect from service while mState=" + m1905a(this.f1405f) + "... ignoring");
                } else {
                    m1907a();
                    this.f1402c.mo1887c();
                }
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.InterfaceC0265j
        /* JADX INFO: renamed from: a */
        public void mo1903a(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {
            if (m1906a(messenger, "onConnect")) {
                if (this.f1405f != 2) {
                    Log.w("MediaBrowserCompat", "onConnect from service while mState=" + m1905a(this.f1405f) + "... ignoring");
                    return;
                }
                this.f1410k = str;
                this.f1411l = token;
                this.f1412m = bundle;
                this.f1405f = 3;
                if (MediaBrowserCompat.f1375a) {
                    Log.d("MediaBrowserCompat", "ServiceCallbacks.onConnect...");
                    m1909c();
                }
                this.f1402c.mo1884a();
                try {
                    for (Map.Entry<String, C0268m> entry : this.f1409j.entrySet()) {
                        String key = entry.getKey();
                        C0268m value = entry.getValue();
                        List<AbstractC0269n> listM1922b = value.m1922b();
                        List<Bundle> listM1921a = value.m1921a();
                        int i = 0;
                        while (true) {
                            int i2 = i;
                            if (i2 < listM1922b.size()) {
                                this.f1407h.m1917a(key, listM1922b.get(i2).f1427c, listM1921a.get(i2), this.f1408i);
                                i = i2 + 1;
                            }
                        }
                    }
                } catch (RemoteException e) {
                    Log.d("MediaBrowserCompat", "addSubscription failed with RemoteException.");
                }
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.InterfaceC0265j
        /* JADX INFO: renamed from: a */
        public void mo1904a(Messenger messenger, String str, List list, Bundle bundle) {
            if (m1906a(messenger, "onLoadChildren")) {
                if (MediaBrowserCompat.f1375a) {
                    Log.d("MediaBrowserCompat", "onLoadChildren for " + this.f1401b + " id=" + str);
                }
                C0268m c0268m = this.f1409j.get(str);
                if (c0268m == null) {
                    if (MediaBrowserCompat.f1375a) {
                        Log.d("MediaBrowserCompat", "onLoadChildren for id that isn't subscribed id=" + str);
                        return;
                    }
                    return;
                }
                AbstractC0269n abstractC0269nM1920a = c0268m.m1920a(this.f1400a, bundle);
                if (abstractC0269nM1920a != null) {
                    if (bundle == null) {
                        if (list == null) {
                            abstractC0269nM1920a.m1924a(str);
                            return;
                        } else {
                            abstractC0269nM1920a.m1926a(str, (List<MediaItem>) list);
                            return;
                        }
                    }
                    if (list == null) {
                        abstractC0269nM1920a.m1925a(str, bundle);
                    } else {
                        abstractC0269nM1920a.m1927a(str, list, bundle);
                    }
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public boolean m1908b() {
            return this.f1405f == 3;
        }

        /* JADX INFO: renamed from: c */
        void m1909c() {
            Log.d("MediaBrowserCompat", "MediaBrowserCompat...");
            Log.d("MediaBrowserCompat", "  mServiceComponent=" + this.f1401b);
            Log.d("MediaBrowserCompat", "  mCallback=" + this.f1402c);
            Log.d("MediaBrowserCompat", "  mRootHints=" + this.f1403d);
            Log.d("MediaBrowserCompat", "  mState=" + m1905a(this.f1405f));
            Log.d("MediaBrowserCompat", "  mServiceConnection=" + this.f1406g);
            Log.d("MediaBrowserCompat", "  mServiceBinderWrapper=" + this.f1407h);
            Log.d("MediaBrowserCompat", "  mCallbacksMessenger=" + this.f1408i);
            Log.d("MediaBrowserCompat", "  mRootId=" + this.f1410k);
            Log.d("MediaBrowserCompat", "  mMediaSessionToken=" + this.f1411l);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.InterfaceC0260e
        /* JADX INFO: renamed from: d */
        public void mo1899d() {
            if (this.f1405f != 0 && this.f1405f != 1) {
                throw new IllegalStateException("connect() called while neigther disconnecting nor disconnected (state=" + m1905a(this.f1405f) + ")");
            }
            this.f1405f = 2;
            this.f1404e.post(new Runnable() { // from class: android.support.v4.media.MediaBrowserCompat.i.1
                @Override // java.lang.Runnable
                public void run() {
                    if (C0264i.this.f1405f == 0) {
                        return;
                    }
                    C0264i.this.f1405f = 2;
                    if (MediaBrowserCompat.f1375a && C0264i.this.f1406g != null) {
                        throw new RuntimeException("mServiceConnection should be null. Instead it is " + C0264i.this.f1406g);
                    }
                    if (C0264i.this.f1407h != null) {
                        throw new RuntimeException("mServiceBinderWrapper should be null. Instead it is " + C0264i.this.f1407h);
                    }
                    if (C0264i.this.f1408i != null) {
                        throw new RuntimeException("mCallbacksMessenger should be null. Instead it is " + C0264i.this.f1408i);
                    }
                    Intent intent = new Intent("android.media.browse.MediaBrowserService");
                    intent.setComponent(C0264i.this.f1401b);
                    C0264i.this.f1406g = C0264i.this.new a();
                    boolean zBindService = false;
                    try {
                        zBindService = C0264i.this.f1400a.bindService(intent, C0264i.this.f1406g, 1);
                    } catch (Exception e) {
                        Log.e("MediaBrowserCompat", "Failed binding to service " + C0264i.this.f1401b);
                    }
                    if (!zBindService) {
                        C0264i.this.m1907a();
                        C0264i.this.f1402c.mo1887c();
                    }
                    if (MediaBrowserCompat.f1375a) {
                        Log.d("MediaBrowserCompat", "connect...");
                        C0264i.this.m1909c();
                    }
                }
            });
        }

        @Override // android.support.v4.media.MediaBrowserCompat.InterfaceC0260e
        /* JADX INFO: renamed from: e */
        public void mo1900e() {
            this.f1405f = 0;
            this.f1404e.post(new Runnable() { // from class: android.support.v4.media.MediaBrowserCompat.i.2
                @Override // java.lang.Runnable
                public void run() {
                    if (C0264i.this.f1408i != null) {
                        try {
                            C0264i.this.f1407h.m1916a(C0264i.this.f1408i);
                        } catch (RemoteException e) {
                            Log.w("MediaBrowserCompat", "RemoteException during connect for " + C0264i.this.f1401b);
                        }
                    }
                    int i = C0264i.this.f1405f;
                    C0264i.this.m1907a();
                    if (i != 0) {
                        C0264i.this.f1405f = i;
                    }
                    if (MediaBrowserCompat.f1375a) {
                        Log.d("MediaBrowserCompat", "disconnect...");
                        C0264i.this.m1909c();
                    }
                }
            });
        }

        @Override // android.support.v4.media.MediaBrowserCompat.InterfaceC0260e
        /* JADX INFO: renamed from: f */
        public MediaSessionCompat.Token mo1901f() {
            if (m1908b()) {
                return this.f1411l;
            }
            throw new IllegalStateException("getSessionToken() called while not connected(state=" + this.f1405f + ")");
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.MediaBrowserCompat$j */
    interface InterfaceC0265j {
        /* JADX INFO: renamed from: a */
        void mo1902a(Messenger messenger);

        /* JADX INFO: renamed from: a */
        void mo1903a(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle);

        /* JADX INFO: renamed from: a */
        void mo1904a(Messenger messenger, String str, List list, Bundle bundle);
    }

    /* JADX INFO: renamed from: android.support.v4.media.MediaBrowserCompat$k */
    public static abstract class AbstractC0266k {
        /* JADX INFO: renamed from: a */
        public void m1912a(String str, Bundle bundle) {
        }

        /* JADX INFO: renamed from: a */
        public void m1913a(String str, Bundle bundle, List<MediaItem> list) {
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.MediaBrowserCompat$l */
    private static class C0267l {

        /* JADX INFO: renamed from: a */
        private Messenger f1421a;

        /* JADX INFO: renamed from: b */
        private Bundle f1422b;

        public C0267l(IBinder iBinder, Bundle bundle) {
            this.f1421a = new Messenger(iBinder);
            this.f1422b = bundle;
        }

        /* JADX INFO: renamed from: a */
        private void m1914a(int i, Bundle bundle, Messenger messenger) throws RemoteException {
            Message messageObtain = Message.obtain();
            messageObtain.what = i;
            messageObtain.arg1 = 1;
            messageObtain.setData(bundle);
            messageObtain.replyTo = messenger;
            this.f1421a.send(messageObtain);
        }

        /* JADX INFO: renamed from: a */
        void m1915a(Context context, Messenger messenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString("data_package_name", context.getPackageName());
            bundle.putBundle("data_root_hints", this.f1422b);
            m1914a(1, bundle, messenger);
        }

        /* JADX INFO: renamed from: a */
        void m1916a(Messenger messenger) throws RemoteException {
            m1914a(2, null, messenger);
        }

        /* JADX INFO: renamed from: a */
        void m1917a(String str, IBinder iBinder, Bundle bundle, Messenger messenger) throws RemoteException {
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_media_item_id", str);
            C0152h.m863a(bundle2, "data_callback_token", iBinder);
            bundle2.putBundle("data_options", bundle);
            m1914a(3, bundle2, messenger);
        }

        /* JADX INFO: renamed from: b */
        void m1918b(Messenger messenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putBundle("data_root_hints", this.f1422b);
            m1914a(6, bundle, messenger);
        }

        /* JADX INFO: renamed from: c */
        void m1919c(Messenger messenger) throws RemoteException {
            m1914a(7, null, messenger);
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.MediaBrowserCompat$m */
    private static class C0268m {

        /* JADX INFO: renamed from: a */
        private final List<AbstractC0269n> f1423a = new ArrayList();

        /* JADX INFO: renamed from: b */
        private final List<Bundle> f1424b = new ArrayList();

        /* JADX INFO: renamed from: a */
        public AbstractC0269n m1920a(Context context, Bundle bundle) {
            if (bundle != null) {
                bundle.setClassLoader(context.getClassLoader());
            }
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= this.f1424b.size()) {
                    return null;
                }
                if (C0277c.m1977a(this.f1424b.get(i2), bundle)) {
                    return this.f1423a.get(i2);
                }
                i = i2 + 1;
            }
        }

        /* JADX INFO: renamed from: a */
        public List<Bundle> m1921a() {
            return this.f1424b;
        }

        /* JADX INFO: renamed from: b */
        public List<AbstractC0269n> m1922b() {
            return this.f1423a;
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.MediaBrowserCompat$n */
    public static abstract class AbstractC0269n {

        /* JADX INFO: renamed from: a */
        WeakReference<C0268m> f1425a;

        /* JADX INFO: renamed from: b */
        private final Object f1426b;

        /* JADX INFO: renamed from: c */
        private final IBinder f1427c;

        /* JADX INFO: renamed from: android.support.v4.media.MediaBrowserCompat$n$a */
        private class a implements C0275a.d {
            a() {
            }

            /* JADX INFO: renamed from: a */
            List<MediaItem> m1928a(List<MediaItem> list, Bundle bundle) {
                if (list == null) {
                    return null;
                }
                int i = bundle.getInt("android.media.browse.extra.PAGE", -1);
                int i2 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
                if (i == -1 && i2 == -1) {
                    return list;
                }
                int i3 = i2 * i;
                int size = i3 + i2;
                if (i < 0 || i2 < 1 || i3 >= list.size()) {
                    return Collections.EMPTY_LIST;
                }
                if (size > list.size()) {
                    size = list.size();
                }
                return list.subList(i3, size);
            }

            @Override // android.support.v4.media.C0275a.d
            /* JADX INFO: renamed from: a */
            public void mo1929a(String str) {
                AbstractC0269n.this.m1924a(str);
            }

            @Override // android.support.v4.media.C0275a.d
            /* JADX INFO: renamed from: a */
            public void mo1930a(String str, List<?> list) {
                C0268m c0268m = AbstractC0269n.this.f1425a == null ? null : AbstractC0269n.this.f1425a.get();
                if (c0268m == null) {
                    AbstractC0269n.this.m1926a(str, MediaItem.m1880a(list));
                    return;
                }
                List<MediaItem> listM1880a = MediaItem.m1880a(list);
                List<AbstractC0269n> listM1922b = c0268m.m1922b();
                List<Bundle> listM1921a = c0268m.m1921a();
                int i = 0;
                while (true) {
                    int i2 = i;
                    if (i2 >= listM1922b.size()) {
                        return;
                    }
                    Bundle bundle = listM1921a.get(i2);
                    if (bundle == null) {
                        AbstractC0269n.this.m1926a(str, listM1880a);
                    } else {
                        AbstractC0269n.this.m1927a(str, m1928a(listM1880a, bundle), bundle);
                    }
                    i = i2 + 1;
                }
            }
        }

        /* JADX INFO: renamed from: android.support.v4.media.MediaBrowserCompat$n$b */
        private class b extends a implements C0276b.a {
            b() {
                super();
            }

            @Override // android.support.v4.media.C0276b.a
            /* JADX INFO: renamed from: a */
            public void mo1931a(String str, Bundle bundle) {
                AbstractC0269n.this.m1925a(str, bundle);
            }

            @Override // android.support.v4.media.C0276b.a
            /* JADX INFO: renamed from: a */
            public void mo1932a(String str, List<?> list, Bundle bundle) {
                AbstractC0269n.this.m1927a(str, MediaItem.m1880a(list), bundle);
            }
        }

        public AbstractC0269n() {
            if (Build.VERSION.SDK_INT >= 26) {
                this.f1426b = C0276b.m1976a(new b());
                this.f1427c = null;
            } else if (Build.VERSION.SDK_INT >= 21) {
                this.f1426b = C0275a.m1969a((C0275a.d) new a());
                this.f1427c = new Binder();
            } else {
                this.f1426b = null;
                this.f1427c = new Binder();
            }
        }

        /* JADX INFO: renamed from: a */
        public void m1924a(String str) {
        }

        /* JADX INFO: renamed from: a */
        public void m1925a(String str, Bundle bundle) {
        }

        /* JADX INFO: renamed from: a */
        public void m1926a(String str, List<MediaItem> list) {
        }

        /* JADX INFO: renamed from: a */
        public void m1927a(String str, List<MediaItem> list, Bundle bundle) {
        }
    }

    public MediaBrowserCompat(Context context, ComponentName componentName, C0257b c0257b, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f1376b = new C0263h(context, componentName, c0257b, bundle);
            return;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            this.f1376b = new C0262g(context, componentName, c0257b, bundle);
        } else if (Build.VERSION.SDK_INT >= 21) {
            this.f1376b = new C0261f(context, componentName, c0257b, bundle);
        } else {
            this.f1376b = new C0264i(context, componentName, c0257b, bundle);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m1876a() {
        this.f1376b.mo1899d();
    }

    /* JADX INFO: renamed from: b */
    public void m1877b() {
        this.f1376b.mo1900e();
    }

    /* JADX INFO: renamed from: c */
    public MediaSessionCompat.Token m1878c() {
        return this.f1376b.mo1901f();
    }
}
