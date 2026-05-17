package com.google.android.gms.internal;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: com.google.android.gms.internal.dy */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1518dy implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ Bitmap f10488a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ C1517dx f10489b;

    RunnableC1518dy(C1517dx c1517dx, Bitmap bitmap) {
        this.f10489b = c1517dx;
        this.f10488a = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.f10488a.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
        synchronized (this.f10489b.f10483g) {
            this.f10489b.f10478b.f8834g = new bsn();
            this.f10489b.f10478b.f8834g.f8867c = byteArrayOutputStream.toByteArray();
            this.f10489b.f10478b.f8834g.f8866b = "image/png";
            this.f10489b.f10478b.f8834g.f8865a = 1;
        }
    }
}
