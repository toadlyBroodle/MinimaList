package com.google.android.gms.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import com.google.android.gms.cast.framework.media.C1013b;

/* JADX INFO: renamed from: com.google.android.gms.internal.tr */
/* JADX INFO: loaded from: classes.dex */
public final class C1943tr implements InterfaceC1947tv {

    /* JADX INFO: renamed from: a */
    private final Context f11613a;

    /* JADX INFO: renamed from: b */
    private final C1013b f11614b;

    /* JADX INFO: renamed from: c */
    private Uri f11615c;

    /* JADX INFO: renamed from: d */
    private AsyncTaskC1945tt f11616d;

    /* JADX INFO: renamed from: e */
    private C1948tw f11617e;

    /* JADX INFO: renamed from: f */
    private Bitmap f11618f;

    /* JADX INFO: renamed from: g */
    private boolean f11619g;

    /* JADX INFO: renamed from: h */
    private InterfaceC1944ts f11620h;

    public C1943tr(Context context) {
        this(context, new C1013b(-1, 0, 0));
    }

    public C1943tr(Context context, C1013b c1013b) {
        this.f11613a = context;
        this.f11614b = c1013b;
        this.f11617e = new C1948tw();
        m12340b();
    }

    /* JADX INFO: renamed from: b */
    private final void m12340b() {
        if (this.f11616d != null) {
            this.f11616d.cancel(true);
            this.f11616d = null;
        }
        this.f11615c = null;
        this.f11618f = null;
        this.f11619g = false;
    }

    /* JADX INFO: renamed from: a */
    public final void m12341a() {
        m12340b();
        this.f11620h = null;
    }

    @Override // com.google.android.gms.internal.InterfaceC1947tv
    /* JADX INFO: renamed from: a */
    public final void mo12342a(Bitmap bitmap) {
        this.f11618f = bitmap;
        this.f11619g = true;
        if (this.f11620h != null) {
            this.f11620h.mo12345a(this.f11618f);
        }
        this.f11616d = null;
    }

    /* JADX INFO: renamed from: a */
    public final void m12343a(InterfaceC1944ts interfaceC1944ts) {
        this.f11620h = interfaceC1944ts;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m12344a(Uri uri) {
        if (uri == null) {
            m12340b();
            return true;
        }
        if (uri.equals(this.f11615c)) {
            return this.f11619g;
        }
        m12340b();
        this.f11615c = uri;
        if (this.f11614b.m6426b() == 0 || this.f11614b.m6427c() == 0) {
            this.f11616d = new AsyncTaskC1945tt(this.f11613a, this);
        } else {
            this.f11616d = new AsyncTaskC1945tt(this.f11613a, this.f11614b.m6426b(), this.f11614b.m6427c(), false, this);
        }
        this.f11616d.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, this.f11615c);
        return false;
    }
}
