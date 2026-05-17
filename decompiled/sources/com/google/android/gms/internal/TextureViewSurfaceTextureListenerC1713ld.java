package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import com.google.android.gms.ads.internal.C0710au;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.ld */
/* JADX INFO: loaded from: classes.dex */
@cnb
@TargetApi(14)
public final class TextureViewSurfaceTextureListenerC1713ld extends AbstractC1724lo implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener, TextureView.SurfaceTextureListener {

    /* JADX INFO: renamed from: c */
    private static final Map<Integer, String> f10915c = new HashMap();

    /* JADX INFO: renamed from: d */
    private final C1740md f10916d;

    /* JADX INFO: renamed from: e */
    private final boolean f10917e;

    /* JADX INFO: renamed from: f */
    private int f10918f;

    /* JADX INFO: renamed from: g */
    private int f10919g;

    /* JADX INFO: renamed from: h */
    private MediaPlayer f10920h;

    /* JADX INFO: renamed from: i */
    private Uri f10921i;

    /* JADX INFO: renamed from: j */
    private int f10922j;

    /* JADX INFO: renamed from: k */
    private int f10923k;

    /* JADX INFO: renamed from: l */
    private int f10924l;

    /* JADX INFO: renamed from: m */
    private int f10925m;

    /* JADX INFO: renamed from: n */
    private int f10926n;

    /* JADX INFO: renamed from: o */
    private C1737ma f10927o;

    /* JADX INFO: renamed from: p */
    private boolean f10928p;

    /* JADX INFO: renamed from: q */
    private int f10929q;

    /* JADX INFO: renamed from: r */
    private InterfaceC1723ln f10930r;

    static {
        if (Build.VERSION.SDK_INT >= 17) {
            f10915c.put(-1004, "MEDIA_ERROR_IO");
            f10915c.put(-1007, "MEDIA_ERROR_MALFORMED");
            f10915c.put(-1010, "MEDIA_ERROR_UNSUPPORTED");
            f10915c.put(-110, "MEDIA_ERROR_TIMED_OUT");
            f10915c.put(3, "MEDIA_INFO_VIDEO_RENDERING_START");
        }
        f10915c.put(100, "MEDIA_ERROR_SERVER_DIED");
        f10915c.put(1, "MEDIA_ERROR_UNKNOWN");
        f10915c.put(1, "MEDIA_INFO_UNKNOWN");
        f10915c.put(700, "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        f10915c.put(701, "MEDIA_INFO_BUFFERING_START");
        f10915c.put(702, "MEDIA_INFO_BUFFERING_END");
        f10915c.put(800, "MEDIA_INFO_BAD_INTERLEAVING");
        f10915c.put(801, "MEDIA_INFO_NOT_SEEKABLE");
        f10915c.put(802, "MEDIA_INFO_METADATA_UPDATE");
        if (Build.VERSION.SDK_INT >= 19) {
            f10915c.put(901, "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
            f10915c.put(902, "MEDIA_INFO_SUBTITLE_TIMED_OUT");
        }
    }

    public TextureViewSurfaceTextureListenerC1713ld(Context context, boolean z, boolean z2, C1738mb c1738mb, C1740md c1740md) {
        super(context);
        this.f10918f = 0;
        this.f10919g = 0;
        setSurfaceTextureListener(this);
        this.f10916d = c1740md;
        this.f10928p = z;
        this.f10917e = z2;
        this.f10916d.m11764a(this);
    }

    /* JADX INFO: renamed from: a */
    private final void m11673a(float f) {
        if (this.f10920h == null) {
            C1560fm.m11615e("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
        } else {
            try {
                this.f10920h.setVolume(f, f);
            } catch (IllegalStateException e) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m11674a(boolean z) {
        C1560fm.m11343a("AdMediaPlayerView release");
        if (this.f10927o != null) {
            this.f10927o.m11744b();
            this.f10927o = null;
        }
        if (this.f10920h != null) {
            this.f10920h.reset();
            this.f10920h.release();
            this.f10920h = null;
            m11675b(0);
            if (z) {
                this.f10919g = 0;
                this.f10919g = 0;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private final void m11675b(int i) {
        if (i == 3) {
            this.f10916d.m11767c();
            this.f10952b.m11776b();
        } else if (this.f10918f == 3) {
            this.f10916d.m11768d();
            this.f10952b.m11777c();
        }
        this.f10918f = i;
    }

    /* JADX INFO: renamed from: f */
    private final void m11676f() {
        SurfaceTexture surfaceTextureM11745c;
        C1560fm.m11343a("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (this.f10921i == null || surfaceTexture == null) {
            return;
        }
        m11674a(false);
        try {
            C0710au.m5584t();
            this.f10920h = new MediaPlayer();
            this.f10920h.setOnBufferingUpdateListener(this);
            this.f10920h.setOnCompletionListener(this);
            this.f10920h.setOnErrorListener(this);
            this.f10920h.setOnInfoListener(this);
            this.f10920h.setOnPreparedListener(this);
            this.f10920h.setOnVideoSizeChangedListener(this);
            this.f10924l = 0;
            if (this.f10928p) {
                this.f10927o = new C1737ma(getContext());
                this.f10927o.m11743a(surfaceTexture, getWidth(), getHeight());
                this.f10927o.start();
                surfaceTextureM11745c = this.f10927o.m11745c();
                if (surfaceTextureM11745c == null) {
                    this.f10927o.m11744b();
                    this.f10927o = null;
                    surfaceTextureM11745c = surfaceTexture;
                }
            } else {
                surfaceTextureM11745c = surfaceTexture;
            }
            this.f10920h.setDataSource(getContext(), this.f10921i);
            C0710au.m5585u();
            this.f10920h.setSurface(new Surface(surfaceTextureM11745c));
            this.f10920h.setAudioStreamType(3);
            this.f10920h.setScreenOnWhilePlaying(true);
            this.f10920h.prepareAsync();
            m11675b(1);
        } catch (IOException | IllegalArgumentException | IllegalStateException e) {
            String strValueOf = String.valueOf(this.f10921i);
            C1560fm.m11613c(new StringBuilder(String.valueOf(strValueOf).length() + 36).append("Failed to initialize MediaPlayer at ").append(strValueOf).toString(), e);
            onError(this.f10920h, 1, 0);
        }
    }

    /* JADX INFO: renamed from: g */
    private final void m11677g() {
        if (this.f10917e && m11678h() && this.f10920h.getCurrentPosition() > 0 && this.f10919g != 3) {
            C1560fm.m11343a("AdMediaPlayerView nudging MediaPlayer");
            m11673a(0.0f);
            this.f10920h.start();
            int currentPosition = this.f10920h.getCurrentPosition();
            long jMo7252a = C0710au.m5575k().mo7252a();
            while (m11678h() && this.f10920h.getCurrentPosition() == currentPosition && C0710au.m5575k().mo7252a() - jMo7252a <= 250) {
            }
            this.f10920h.pause();
            mo11686e();
        }
    }

    /* JADX INFO: renamed from: h */
    private final boolean m11678h() {
        return (this.f10920h == null || this.f10918f == -1 || this.f10918f == 0 || this.f10918f == 1) ? false : true;
    }

    @Override // com.google.android.gms.internal.AbstractC1724lo
    /* JADX INFO: renamed from: a */
    public final String mo11679a() {
        String strValueOf = String.valueOf(this.f10928p ? " spherical" : "");
        return strValueOf.length() != 0 ? "MediaPlayer".concat(strValueOf) : new String("MediaPlayer");
    }

    @Override // com.google.android.gms.internal.AbstractC1724lo
    /* JADX INFO: renamed from: a */
    public final void mo11680a(float f, float f2) {
        if (this.f10927o != null) {
            this.f10927o.m11741a(f, f2);
        }
    }

    @Override // com.google.android.gms.internal.AbstractC1724lo
    /* JADX INFO: renamed from: a */
    public final void mo11681a(int i) {
        C1560fm.m11343a(new StringBuilder(34).append("AdMediaPlayerView seek ").append(i).toString());
        if (!m11678h()) {
            this.f10929q = i;
        } else {
            this.f10920h.seekTo(i);
            this.f10929q = 0;
        }
    }

    @Override // com.google.android.gms.internal.AbstractC1724lo
    /* JADX INFO: renamed from: a */
    public final void mo11682a(InterfaceC1723ln interfaceC1723ln) {
        this.f10930r = interfaceC1723ln;
    }

    @Override // com.google.android.gms.internal.AbstractC1724lo
    /* JADX INFO: renamed from: b */
    public final void mo11683b() {
        C1560fm.m11343a("AdMediaPlayerView stop");
        if (this.f10920h != null) {
            this.f10920h.stop();
            this.f10920h.release();
            this.f10920h = null;
            m11675b(0);
            this.f10919g = 0;
        }
        this.f10916d.m11765b();
    }

    @Override // com.google.android.gms.internal.AbstractC1724lo
    /* JADX INFO: renamed from: c */
    public final void mo11684c() {
        C1560fm.m11343a("AdMediaPlayerView play");
        if (m11678h()) {
            this.f10920h.start();
            m11675b(3);
            this.f10951a.m11725a();
            C1596gv.f10711a.post(new RunnableC1720lk(this));
        }
        this.f10919g = 3;
    }

    @Override // com.google.android.gms.internal.AbstractC1724lo
    /* JADX INFO: renamed from: d */
    public final void mo11685d() {
        C1560fm.m11343a("AdMediaPlayerView pause");
        if (m11678h() && this.f10920h.isPlaying()) {
            this.f10920h.pause();
            m11675b(4);
            C1596gv.f10711a.post(new RunnableC1721ll(this));
        }
        this.f10919g = 4;
    }

    @Override // com.google.android.gms.internal.AbstractC1724lo, com.google.android.gms.internal.InterfaceC1743mg
    /* JADX INFO: renamed from: e */
    public final void mo11686e() {
        m11673a(this.f10952b.m11773a());
    }

    @Override // com.google.android.gms.internal.AbstractC1724lo
    public final int getCurrentPosition() {
        if (m11678h()) {
            return this.f10920h.getCurrentPosition();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.AbstractC1724lo
    public final int getDuration() {
        if (m11678h()) {
            return this.f10920h.getDuration();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.AbstractC1724lo
    public final int getVideoHeight() {
        if (this.f10920h != null) {
            return this.f10920h.getVideoHeight();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.AbstractC1724lo
    public final int getVideoWidth() {
        if (this.f10920h != null) {
            return this.f10920h.getVideoWidth();
        }
        return 0;
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        this.f10924l = i;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        C1560fm.m11343a("AdMediaPlayerView completion");
        m11675b(5);
        this.f10919g = 5;
        C1596gv.f10711a.post(new RunnableC1715lf(this));
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        String str = f10915c.get(Integer.valueOf(i));
        String str2 = f10915c.get(Integer.valueOf(i2));
        C1560fm.m11615e(new StringBuilder(String.valueOf(str).length() + 38 + String.valueOf(str2).length()).append("AdMediaPlayerView MediaPlayer error: ").append(str).append(":").append(str2).toString());
        m11675b(-1);
        this.f10919g = -1;
        C1596gv.f10711a.post(new RunnableC1716lg(this, str, str2));
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        String str = f10915c.get(Integer.valueOf(i));
        String str2 = f10915c.get(Integer.valueOf(i2));
        C1560fm.m11343a(new StringBuilder(String.valueOf(str).length() + 37 + String.valueOf(str2).length()).append("AdMediaPlayerView MediaPlayer info: ").append(str).append(":").append(str2).toString());
        return true;
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int defaultSize = getDefaultSize(this.f10922j, i);
        int defaultSize2 = getDefaultSize(this.f10923k, i2);
        if (this.f10922j > 0 && this.f10923k > 0 && this.f10927o == null) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            defaultSize2 = View.MeasureSpec.getSize(i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                if (this.f10922j * defaultSize2 < this.f10923k * size) {
                    defaultSize = (this.f10922j * defaultSize2) / this.f10923k;
                } else if (this.f10922j * defaultSize2 > this.f10923k * size) {
                    defaultSize2 = (this.f10923k * size) / this.f10922j;
                    defaultSize = size;
                } else {
                    defaultSize = size;
                }
            } else if (mode == 1073741824) {
                int i3 = (this.f10923k * size) / this.f10922j;
                if (mode2 != Integer.MIN_VALUE || i3 <= defaultSize2) {
                    defaultSize2 = i3;
                    defaultSize = size;
                } else {
                    defaultSize = size;
                }
            } else if (mode2 == 1073741824) {
                defaultSize = (this.f10922j * defaultSize2) / this.f10923k;
                if (mode == Integer.MIN_VALUE && defaultSize > size) {
                    defaultSize = size;
                }
            } else {
                int i4 = this.f10922j;
                int i5 = this.f10923k;
                if (mode2 != Integer.MIN_VALUE || i5 <= defaultSize2) {
                    defaultSize2 = i5;
                    defaultSize = i4;
                } else {
                    defaultSize = (this.f10922j * defaultSize2) / this.f10923k;
                }
                if (mode == Integer.MIN_VALUE && defaultSize > size) {
                    defaultSize2 = (this.f10923k * size) / this.f10922j;
                    defaultSize = size;
                }
            }
        }
        setMeasuredDimension(defaultSize, defaultSize2);
        if (this.f10927o != null) {
            this.f10927o.m11742a(defaultSize, defaultSize2);
        }
        if (Build.VERSION.SDK_INT == 16) {
            if ((this.f10925m > 0 && this.f10925m != defaultSize) || (this.f10926n > 0 && this.f10926n != defaultSize2)) {
                m11677g();
            }
            this.f10925m = defaultSize;
            this.f10926n = defaultSize2;
        }
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        C1560fm.m11343a("AdMediaPlayerView prepared");
        m11675b(2);
        this.f10916d.m11763a();
        C1596gv.f10711a.post(new RunnableC1714le(this));
        this.f10922j = mediaPlayer.getVideoWidth();
        this.f10923k = mediaPlayer.getVideoHeight();
        if (this.f10929q != 0) {
            mo11681a(this.f10929q);
        }
        m11677g();
        int i = this.f10922j;
        C1560fm.m11614d(new StringBuilder(62).append("AdMediaPlayerView stream dimensions: ").append(i).append(" x ").append(this.f10923k).toString());
        if (this.f10919g == 3) {
            mo11684c();
        }
        mo11686e();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C1560fm.m11343a("AdMediaPlayerView surface created");
        m11676f();
        C1596gv.f10711a.post(new RunnableC1717lh(this));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C1560fm.m11343a("AdMediaPlayerView surface destroyed");
        if (this.f10920h != null && this.f10929q == 0) {
            this.f10929q = this.f10920h.getCurrentPosition();
        }
        if (this.f10927o != null) {
            this.f10927o.m11744b();
        }
        C1596gv.f10711a.post(new RunnableC1719lj(this));
        m11674a(true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        C1560fm.m11343a("AdMediaPlayerView surface changed");
        boolean z = this.f10919g == 3;
        boolean z2 = this.f10922j == i && this.f10923k == i2;
        if (this.f10920h != null && z && z2) {
            if (this.f10929q != 0) {
                mo11681a(this.f10929q);
            }
            mo11684c();
        }
        if (this.f10927o != null) {
            this.f10927o.m11742a(i, i2);
        }
        C1596gv.f10711a.post(new RunnableC1718li(this, i, i2));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f10916d.m11766b(this);
        this.f10951a.m11726a(surfaceTexture, this.f10930r);
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        C1560fm.m11343a(new StringBuilder(57).append("AdMediaPlayerView size changed: ").append(i).append(" x ").append(i2).toString());
        this.f10922j = mediaPlayer.getVideoWidth();
        this.f10923k = mediaPlayer.getVideoHeight();
        if (this.f10922j == 0 || this.f10923k == 0) {
            return;
        }
        requestLayout();
    }

    @Override // com.google.android.gms.internal.AbstractC1724lo
    public final void setVideoPath(String str) {
        Uri uri = Uri.parse(str);
        bvy bvyVarM10348a = bvy.m10348a(uri);
        if (bvyVarM10348a != null) {
            uri = Uri.parse(bvyVarM10348a.f9143a);
        }
        this.f10921i = uri;
        this.f10929q = 0;
        m11676f();
        requestLayout();
        invalidate();
    }

    @Override // android.view.View
    public final String toString() {
        String name = getClass().getName();
        String hexString = Integer.toHexString(hashCode());
        return new StringBuilder(String.valueOf(name).length() + 1 + String.valueOf(hexString).length()).append(name).append("@").append(hexString).toString();
    }
}
