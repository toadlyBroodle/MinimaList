package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C1221aj;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes.dex */
final class abb<V> extends FutureTask<V> implements Comparable<abb> {

    /* JADX INFO: renamed from: a */
    final boolean f6213a;

    /* JADX INFO: renamed from: b */
    private final long f6214b;

    /* JADX INFO: renamed from: c */
    private final String f6215c;

    /* JADX INFO: renamed from: d */
    private /* synthetic */ aay f6216d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    abb(aay aayVar, Runnable runnable, boolean z, String str) {
        super(runnable, null);
        this.f6216d = aayVar;
        C1221aj.m7065a(str);
        this.f6214b = aay.f6198k.getAndIncrement();
        this.f6215c = str;
        this.f6213a = false;
        if (this.f6214b == Long.MAX_VALUE) {
            aayVar.mo7393t().m7410y().m7412a("Tasks index overflow");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    abb(aay aayVar, Callable<V> callable, boolean z, String str) {
        super(callable);
        this.f6216d = aayVar;
        C1221aj.m7065a(str);
        this.f6214b = aay.f6198k.getAndIncrement();
        this.f6215c = str;
        this.f6213a = z;
        if (this.f6214b == Long.MAX_VALUE) {
            aayVar.mo7393t().m7410y().m7412a("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(abb abbVar) {
        abb abbVar2 = abbVar;
        if (this.f6213a != abbVar2.f6213a) {
            return this.f6213a ? -1 : 1;
        }
        if (this.f6214b < abbVar2.f6214b) {
            return -1;
        }
        if (this.f6214b > abbVar2.f6214b) {
            return 1;
        }
        this.f6216d.mo7393t().m7411z().m7413a("Two tasks share the same index. index", Long.valueOf(this.f6214b));
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    protected final void setException(Throwable th) {
        this.f6216d.mo7393t().m7410y().m7413a(this.f6215c, th);
        if (th instanceof aaz) {
            Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
        }
        super.setException(th);
    }
}
