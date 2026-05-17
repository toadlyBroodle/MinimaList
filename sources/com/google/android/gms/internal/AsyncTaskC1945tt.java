package com.google.android.gms.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.RemoteException;

/* JADX INFO: renamed from: com.google.android.gms.internal.tt */
/* JADX INFO: loaded from: classes.dex */
public final class AsyncTaskC1945tt extends AsyncTask<Uri, Long, Bitmap> {

    /* JADX INFO: renamed from: a */
    private static final C1992vm f11621a = new C1992vm("FetchBitmapTask");

    /* JADX INFO: renamed from: b */
    private final InterfaceC1950ty f11622b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC1947tv f11623c;

    private AsyncTaskC1945tt(Context context, int i, int i2, boolean z, long j, int i3, int i4, int i5, InterfaceC1947tv interfaceC1947tv) {
        this.f11622b = C1931tf.m12317a(context.getApplicationContext(), this, new BinderC1949tx(this), i, i2, z, 2097152L, 5, 333, 10000);
        this.f11623c = interfaceC1947tv;
    }

    public AsyncTaskC1945tt(Context context, int i, int i2, boolean z, InterfaceC1947tv interfaceC1947tv) {
        this(context, i, i2, false, 2097152L, 5, 333, 10000, interfaceC1947tv);
    }

    public AsyncTaskC1945tt(Context context, InterfaceC1947tv interfaceC1947tv) {
        this(context, 0, 0, false, 2097152L, 5, 333, 10000, interfaceC1947tv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Bitmap doInBackground(Uri... uriArr) {
        if (uriArr.length != 1 || uriArr[0] == null) {
            return null;
        }
        try {
            return this.f11622b.mo12349a(uriArr[0]);
        } catch (RemoteException e) {
            f11621a.m12446a(e, "Unable to call %s on %s.", "doFetch", InterfaceC1950ty.class.getSimpleName());
            return null;
        }
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        if (this.f11623c != null) {
            this.f11623c.mo12342a(bitmap2);
        }
    }
}
