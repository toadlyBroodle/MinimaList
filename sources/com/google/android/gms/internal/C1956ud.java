package com.google.android.gms.internal;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* JADX INFO: renamed from: com.google.android.gms.internal.ud */
/* JADX INFO: loaded from: classes.dex */
final class C1956ud implements InterfaceC1944ts {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C1955uc f11637a;

    C1956ud(C1955uc c1955uc) {
        this.f11637a = c1955uc;
    }

    @Override // com.google.android.gms.internal.InterfaceC1944ts
    /* JADX INFO: renamed from: a */
    public final void mo12345a(Bitmap bitmap) {
        Bitmap bitmapCreateBitmap;
        if (bitmap == null) {
            bitmapCreateBitmap = null;
        } else {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i = (int) (((width * 9.0f) / 16.0f) + 0.5f);
            float f = (i - height) / 2;
            RectF rectF = new RectF(0.0f, f, width, height + f);
            Bitmap.Config config = bitmap.getConfig();
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            bitmapCreateBitmap = Bitmap.createBitmap(width, i, config);
            new Canvas(bitmapCreateBitmap).drawBitmap(bitmap, (Rect) null, rectF, (Paint) null);
        }
        this.f11637a.m12355a(bitmapCreateBitmap, 0);
    }
}
