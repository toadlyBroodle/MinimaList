package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.C0710au;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: renamed from: com.google.android.gms.internal.ew */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C1543ew {

    /* JADX INFO: renamed from: a */
    private final C1546ez f10570a;

    /* JADX INFO: renamed from: b */
    private final LinkedList<C1544ex> f10571b;

    /* JADX INFO: renamed from: c */
    private final Object f10572c;

    /* JADX INFO: renamed from: d */
    private final String f10573d;

    /* JADX INFO: renamed from: e */
    private final String f10574e;

    /* JADX INFO: renamed from: f */
    private long f10575f;

    /* JADX INFO: renamed from: g */
    private long f10576g;

    /* JADX INFO: renamed from: h */
    private boolean f10577h;

    /* JADX INFO: renamed from: i */
    private long f10578i;

    /* JADX INFO: renamed from: j */
    private long f10579j;

    /* JADX INFO: renamed from: k */
    private long f10580k;

    /* JADX INFO: renamed from: l */
    private long f10581l;

    private C1543ew(C1546ez c1546ez, String str, String str2) {
        this.f10572c = new Object();
        this.f10575f = -1L;
        this.f10576g = -1L;
        this.f10577h = false;
        this.f10578i = -1L;
        this.f10579j = 0L;
        this.f10580k = -1L;
        this.f10581l = -1L;
        this.f10570a = c1546ez;
        this.f10573d = str;
        this.f10574e = str2;
        this.f10571b = new LinkedList<>();
    }

    public C1543ew(String str, String str2) {
        this(C0710au.m5573i(), str, str2);
    }

    /* JADX INFO: renamed from: a */
    public final void m11257a() {
        synchronized (this.f10572c) {
            if (this.f10581l != -1 && this.f10576g == -1) {
                this.f10576g = SystemClock.elapsedRealtime();
                this.f10570a.m11289a(this);
            }
            this.f10570a.m11302d().m11334b();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m11258a(long j) {
        synchronized (this.f10572c) {
            this.f10581l = j;
            if (this.f10581l != -1) {
                this.f10570a.m11289a(this);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m11259a(bwx bwxVar) {
        synchronized (this.f10572c) {
            this.f10580k = SystemClock.elapsedRealtime();
            this.f10570a.m11302d().m11333a(bwxVar, this.f10580k);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m11260a(boolean z) {
        synchronized (this.f10572c) {
            if (this.f10581l != -1) {
                this.f10578i = SystemClock.elapsedRealtime();
                if (!z) {
                    this.f10576g = this.f10578i;
                    this.f10570a.m11289a(this);
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m11261b() {
        synchronized (this.f10572c) {
            if (this.f10581l != -1) {
                C1544ex c1544ex = new C1544ex();
                c1544ex.m11268c();
                this.f10571b.add(c1544ex);
                this.f10579j++;
                this.f10570a.m11302d().m11332a();
                this.f10570a.m11289a(this);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m11262b(long j) {
        synchronized (this.f10572c) {
            if (this.f10581l != -1) {
                this.f10575f = j;
                this.f10570a.m11289a(this);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m11263b(boolean z) {
        synchronized (this.f10572c) {
            if (this.f10581l != -1) {
                this.f10577h = z;
                this.f10570a.m11289a(this);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m11264c() {
        synchronized (this.f10572c) {
            if (this.f10581l != -1 && !this.f10571b.isEmpty()) {
                C1544ex last = this.f10571b.getLast();
                if (last.m11266a() == -1) {
                    last.m11267b();
                    this.f10570a.m11289a(this);
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final Bundle m11265d() {
        Bundle bundle;
        synchronized (this.f10572c) {
            bundle = new Bundle();
            bundle.putString("seq_num", this.f10573d);
            bundle.putString("slotid", this.f10574e);
            bundle.putBoolean("ismediation", this.f10577h);
            bundle.putLong("treq", this.f10580k);
            bundle.putLong("tresponse", this.f10581l);
            bundle.putLong("timp", this.f10576g);
            bundle.putLong("tload", this.f10578i);
            bundle.putLong("pcc", this.f10579j);
            bundle.putLong("tfetch", this.f10575f);
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            Iterator<C1544ex> it = this.f10571b.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().m11269d());
            }
            bundle.putParcelableArrayList("tclick", arrayList);
        }
        return bundle;
    }
}
