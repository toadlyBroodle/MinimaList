package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.common.util.C1310n;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
final class clv implements InterfaceC1640il<cbp> {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ boolean f10323a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ double f10324b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ boolean f10325c;

    /* JADX INFO: renamed from: d */
    private /* synthetic */ String f10326d;

    /* JADX INFO: renamed from: e */
    private /* synthetic */ clr f10327e;

    clv(clr clrVar, boolean z, double d, boolean z2, String str) {
        this.f10327e = clrVar;
        this.f10323a = z;
        this.f10324b = d;
        this.f10325c = z2;
        this.f10326d = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.InterfaceC1640il
    @TargetApi(19)
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final cbp mo11113a(InputStream inputStream) {
        Bitmap bitmapDecodeStream;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = (int) (160.0d * this.f10324b);
        if (!this.f10325c) {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        try {
            bitmapDecodeStream = BitmapFactory.decodeStream(inputStream, null, options);
        } catch (Exception e) {
            C1560fm.m11611b("Error grabbing image.", e);
            bitmapDecodeStream = null;
        }
        if (bitmapDecodeStream == null) {
            this.f10327e.m11110a(2, this.f10323a);
            return null;
        }
        long jUptimeMillis2 = SystemClock.uptimeMillis();
        if (C1310n.m7282e() && C1560fm.m11344a()) {
            int width = bitmapDecodeStream.getWidth();
            C1560fm.m11343a(new StringBuilder(108).append("Decoded image w: ").append(width).append(" h:").append(bitmapDecodeStream.getHeight()).append(" bytes: ").append(bitmapDecodeStream.getAllocationByteCount()).append(" time: ").append(jUptimeMillis2 - jUptimeMillis).append(" on ui thread: ").append(Looper.getMainLooper().getThread() == Thread.currentThread()).toString());
        }
        return new cbp(new BitmapDrawable(Resources.getSystem(), bitmapDecodeStream), Uri.parse(this.f10326d), this.f10324b);
    }

    @Override // com.google.android.gms.internal.InterfaceC1640il
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ cbp mo11112a() {
        this.f10327e.m11110a(2, this.f10323a);
        return null;
    }
}
