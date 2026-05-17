package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.net.Uri;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import com.google.android.gms.C0651a;
import com.google.android.gms.cast.C1052h;
import com.google.android.gms.cast.C1053i;
import com.google.android.gms.cast.C1054j;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.framework.C1000b;
import com.google.android.gms.cast.framework.ReconnectionService;
import com.google.android.gms.cast.framework.media.C1016e;
import com.google.android.gms.cast.framework.media.MediaNotificationService;
import com.google.android.gms.common.p052a.C1072a;
import com.google.android.gms.common.util.C1310n;

/* JADX INFO: renamed from: com.google.android.gms.internal.uc */
/* JADX INFO: loaded from: classes.dex */
public final class C1955uc implements C1016e.a {

    /* JADX INFO: renamed from: a */
    private final Context f11626a;

    /* JADX INFO: renamed from: b */
    private final C1000b f11627b;

    /* JADX INFO: renamed from: c */
    private final BinderC1942tq f11628c;

    /* JADX INFO: renamed from: d */
    private final ComponentName f11629d;

    /* JADX INFO: renamed from: e */
    private final C1943tr f11630e;

    /* JADX INFO: renamed from: f */
    private final C1943tr f11631f;

    /* JADX INFO: renamed from: g */
    private C1016e f11632g;

    /* JADX INFO: renamed from: h */
    private CastDevice f11633h;

    /* JADX INFO: renamed from: i */
    private MediaSessionCompat f11634i;

    /* JADX INFO: renamed from: j */
    private MediaSessionCompat.AbstractC0294a f11635j;

    /* JADX INFO: renamed from: k */
    private boolean f11636k;

    public C1955uc(Context context, C1000b c1000b, BinderC1942tq binderC1942tq) {
        this.f11626a = context;
        this.f11627b = c1000b;
        this.f11628c = binderC1942tq;
        if (this.f11627b.m6359f() == null || TextUtils.isEmpty(this.f11627b.m6359f().m6423c())) {
            this.f11629d = null;
        } else {
            this.f11629d = new ComponentName(this.f11626a, this.f11627b.m6359f().m6423c());
        }
        this.f11630e = new C1943tr(this.f11626a);
        this.f11630e.m12343a(new C1956ud(this));
        this.f11631f = new C1943tr(this.f11626a);
        this.f11631f.m12343a(new C1959ug(this));
    }

    /* JADX INFO: renamed from: a */
    private final Uri m12352a(C1052h c1052h, int i) {
        C1072a c1072aM6428a = this.f11627b.m6359f().m6424d() != null ? this.f11627b.m6359f().m6424d().m6428a(c1052h, i) : c1052h.m6551e() ? c1052h.m6550d().get(0) : null;
        if (c1072aM6428a == null) {
            return null;
        }
        return c1072aM6428a.m6617a();
    }

    /* JADX INFO: renamed from: a */
    private final void m12354a(int i, MediaInfo mediaInfo) {
        PendingIntent activity;
        if (i == 0) {
            this.f11634i.m2065a(new PlaybackStateCompat.C0304a().m2245a(0, 0L, 1.0f).m2248a());
            this.f11634i.m2060a(new MediaMetadataCompat.C0273a().m1958a());
            return;
        }
        this.f11634i.m2065a(new PlaybackStateCompat.C0304a().m2245a(i, 0L, 1.0f).m2247a(mediaInfo.m6262b() == 2 ? 5L : 512L).m2248a());
        MediaSessionCompat mediaSessionCompat = this.f11634i;
        if (this.f11629d == null) {
            activity = null;
        } else {
            Intent intent = new Intent();
            intent.setComponent(this.f11629d);
            activity = PendingIntent.getActivity(this.f11626a, 0, intent, 134217728);
        }
        mediaSessionCompat.m2059a(activity);
        C1052h c1052hM6264d = mediaInfo.m6264d();
        this.f11634i.m2060a(m12357g().m1957a("android.media.metadata.TITLE", c1052hM6264d.m6546a("com.google.android.gms.cast.metadata.TITLE")).m1957a("android.media.metadata.DISPLAY_TITLE", c1052hM6264d.m6546a("com.google.android.gms.cast.metadata.TITLE")).m1957a("android.media.metadata.DISPLAY_SUBTITLE", c1052hM6264d.m6546a("com.google.android.gms.cast.metadata.SUBTITLE")).m1955a("android.media.metadata.DURATION", mediaInfo.m6265e()).m1958a());
        Uri uriM12352a = m12352a(c1052hM6264d, 0);
        if (uriM12352a != null) {
            this.f11630e.m12344a(uriM12352a);
        } else {
            m12355a((Bitmap) null, 0);
        }
        Uri uriM12352a2 = m12352a(c1052hM6264d, 3);
        if (uriM12352a2 != null) {
            this.f11631f.m12344a(uriM12352a2);
        } else {
            m12355a((Bitmap) null, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m12355a(Bitmap bitmap, int i) {
        if (i != 0) {
            if (i == 3) {
                this.f11634i.m2060a(m12357g().m1956a("android.media.metadata.ALBUM_ART", bitmap).m1958a());
            }
        } else {
            if (bitmap != null) {
                this.f11634i.m2060a(m12357g().m1956a("android.media.metadata.DISPLAY_ICON", bitmap).m1958a());
                return;
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.eraseColor(0);
            this.f11634i.m2060a(m12357g().m1956a("android.media.metadata.DISPLAY_ICON", bitmapCreateBitmap).m1958a());
        }
    }

    /* JADX INFO: renamed from: g */
    private final MediaMetadataCompat.C0273a m12357g() {
        MediaMetadataCompat mediaMetadataCompatM2013a = this.f11634i.m2072d().m2013a();
        return mediaMetadataCompatM2013a == null ? new MediaMetadataCompat.C0273a() : new MediaMetadataCompat.C0273a(mediaMetadataCompatM2013a);
    }

    /* JADX INFO: renamed from: h */
    private final void m12358h() {
        if (this.f11627b.m6359f().m6422b() == null) {
            return;
        }
        Intent intent = new Intent(this.f11626a, (Class<?>) MediaNotificationService.class);
        intent.setPackage(this.f11626a.getPackageName());
        intent.setAction("com.google.android.gms.cast.framework.action.UPDATE_NOTIFICATION");
        this.f11626a.stopService(intent);
    }

    /* JADX INFO: renamed from: i */
    private final void m12359i() {
        if (this.f11627b.m6360g()) {
            Intent intent = new Intent(this.f11626a, (Class<?>) ReconnectionService.class);
            intent.setPackage(this.f11626a.getPackageName());
            this.f11626a.stopService(intent);
        }
    }

    @Override // com.google.android.gms.cast.framework.media.C1016e.a
    /* JADX INFO: renamed from: a */
    public final void mo6494a() {
        m12362a(false);
    }

    /* JADX INFO: renamed from: a */
    public final void m12360a(int i) {
        if (this.f11636k) {
            this.f11636k = false;
            if (this.f11632g != null) {
                this.f11632g.m6473b(this);
            }
            if (!C1310n.m7284g()) {
                ((AudioManager) this.f11626a.getSystemService("audio")).abandonAudioFocus(null);
            }
            this.f11628c.m12339a((MediaSessionCompat) null);
            if (this.f11630e != null) {
                this.f11630e.m12341a();
            }
            if (this.f11631f != null) {
                this.f11631f.m12341a();
            }
            if (this.f11634i != null) {
                this.f11634i.m2059a((PendingIntent) null);
                this.f11634i.m2062a((MediaSessionCompat.AbstractC0294a) null);
                this.f11634i.m2060a(new MediaMetadataCompat.C0273a().m1958a());
                m12354a(0, (MediaInfo) null);
                this.f11634i.m2066a(false);
                this.f11634i.m2068b();
                this.f11634i = null;
            }
            this.f11632g = null;
            this.f11633h = null;
            this.f11635j = null;
            m12358h();
            if (i == 0) {
                m12359i();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m12361a(C1016e c1016e, CastDevice castDevice) {
        if (this.f11636k || this.f11627b == null || this.f11627b.m6359f() == null || c1016e == null || castDevice == null) {
            return;
        }
        this.f11632g = c1016e;
        this.f11632g.m6469a(this);
        this.f11633h = castDevice;
        if (!C1310n.m7284g()) {
            ((AudioManager) this.f11626a.getSystemService("audio")).requestAudioFocus(null, 3, 3);
        }
        ComponentName componentName = new ComponentName(this.f11626a, this.f11627b.m6359f().m6421a());
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setComponent(componentName);
        this.f11634i = new MediaSessionCompat(this.f11626a, "CastMediaSession", componentName, PendingIntent.getBroadcast(this.f11626a, 0, intent, 0));
        this.f11634i.m2058a(3);
        m12354a(0, (MediaInfo) null);
        if (this.f11633h != null && !TextUtils.isEmpty(this.f11633h.m6253a())) {
            this.f11634i.m2060a(new MediaMetadataCompat.C0273a().m1957a("android.media.metadata.ALBUM_ARTIST", this.f11626a.getResources().getString(C0651a.d.cast_casting_to_device, this.f11633h.m6253a())).m1958a());
        }
        this.f11635j = new C1960uh(this);
        this.f11634i.m2062a(this.f11635j);
        this.f11634i.m2066a(true);
        this.f11628c.m12339a(this.f11634i);
        this.f11636k = true;
        m12362a(false);
    }

    /* JADX INFO: renamed from: a */
    public final void m12362a(boolean z) {
        boolean z2;
        MediaInfo mediaInfoM6556a;
        boolean z3;
        int i = 3;
        boolean z4 = true;
        if (this.f11632g == null) {
            return;
        }
        C1054j c1054jM6480g = this.f11632g.m6480g();
        MediaInfo mediaInfoM6577e = c1054jM6480g == null ? null : c1054jM6480g.m6577e();
        C1052h c1052hM6264d = mediaInfoM6577e == null ? null : mediaInfoM6577e.m6264d();
        if (c1054jM6480g != null && mediaInfoM6577e != null && c1052hM6264d != null) {
            switch (this.f11632g.m6482i()) {
                case 1:
                    int iM6574c = c1054jM6480g.m6574c();
                    boolean z5 = this.f11632g.m6484k() && iM6574c == 2;
                    int iM6583k = c1054jM6480g.m6583k();
                    boolean z6 = iM6583k != 0 && (iM6574c == 1 || iM6574c == 3);
                    if (!z5) {
                        C1053i c1053iM6570a = c1054jM6480g.m6570a(iM6583k);
                        if (c1053iM6570a == null) {
                            z2 = z6;
                            mediaInfoM6556a = mediaInfoM6577e;
                            i = 0;
                        } else {
                            mediaInfoM6556a = c1053iM6570a.m6556a();
                            boolean z7 = z6;
                            i = 6;
                            z2 = z7;
                        }
                    } else {
                        z2 = z6;
                        i = 2;
                        mediaInfoM6556a = mediaInfoM6577e;
                    }
                    break;
                case 2:
                    z2 = false;
                    mediaInfoM6556a = mediaInfoM6577e;
                    break;
                case 3:
                    z2 = false;
                    i = 2;
                    mediaInfoM6556a = mediaInfoM6577e;
                    break;
                case 4:
                    i = 6;
                    mediaInfoM6556a = mediaInfoM6577e;
                    z2 = false;
                    break;
                default:
                    z2 = false;
                    i = 0;
                    mediaInfoM6556a = mediaInfoM6577e;
                    break;
            }
        } else {
            z2 = false;
            i = 0;
            mediaInfoM6556a = mediaInfoM6577e;
        }
        m12354a(i, mediaInfoM6556a);
        if (i == 0) {
            m12358h();
            m12359i();
            return;
        }
        if (this.f11627b.m6359f().m6422b() != null && this.f11632g != null) {
            Intent intent = new Intent(this.f11626a, (Class<?>) MediaNotificationService.class);
            intent.putExtra("extra_media_notification_force_update", z);
            intent.setPackage(this.f11626a.getPackageName());
            intent.setAction("com.google.android.gms.cast.framework.action.UPDATE_NOTIFICATION");
            intent.putExtra("extra_media_info", this.f11632g.m6481h());
            intent.putExtra("extra_remote_media_client_player_state", this.f11632g.m6482i());
            intent.putExtra("extra_cast_device", this.f11633h);
            intent.putExtra("extra_media_session_token", this.f11634i == null ? null : this.f11634i.m2071c());
            C1054j c1054jM6480g2 = this.f11632g.m6480g();
            if (c1054jM6480g2 != null) {
                switch (c1054jM6480g2.m6585m()) {
                    case 1:
                    case 2:
                    case 3:
                        z3 = true;
                        break;
                    default:
                        Integer numM6575c = c1054jM6480g2.m6575c(c1054jM6480g2.m6582j());
                        if (numM6575c == null) {
                            z3 = false;
                            z4 = false;
                        } else {
                            z3 = numM6575c.intValue() > 0;
                            if (numM6575c.intValue() >= c1054jM6480g2.m6586n() - 1) {
                                z4 = false;
                            }
                        }
                        break;
                }
                intent.putExtra("extra_can_skip_next", z4);
                intent.putExtra("extra_can_skip_prev", z3);
            }
            this.f11626a.startService(intent);
        }
        if (z2 || !this.f11627b.m6360g()) {
            return;
        }
        Intent intent2 = new Intent(this.f11626a, (Class<?>) ReconnectionService.class);
        intent2.setPackage(this.f11626a.getPackageName());
        this.f11626a.startService(intent2);
    }

    @Override // com.google.android.gms.cast.framework.media.C1016e.a
    /* JADX INFO: renamed from: b */
    public final void mo6495b() {
        m12362a(false);
    }

    @Override // com.google.android.gms.cast.framework.media.C1016e.a
    /* JADX INFO: renamed from: c */
    public final void mo6496c() {
        m12362a(false);
    }

    @Override // com.google.android.gms.cast.framework.media.C1016e.a
    /* JADX INFO: renamed from: d */
    public final void mo6497d() {
        m12362a(false);
    }

    @Override // com.google.android.gms.cast.framework.media.C1016e.a
    /* JADX INFO: renamed from: e */
    public final void mo6498e() {
    }

    @Override // com.google.android.gms.cast.framework.media.C1016e.a
    /* JADX INFO: renamed from: f */
    public final void mo6499f() {
        m12362a(false);
    }
}
