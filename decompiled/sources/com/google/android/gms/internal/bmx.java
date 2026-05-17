package com.google.android.gms.internal;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
final class bmx implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ bmv f8453a;

    private bmx(bmv bmvVar) {
        this.f8453a = bmvVar;
    }

    /* synthetic */ bmx(bmv bmvVar, bmw bmwVar) {
        this(bmvVar);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = Executors.defaultThreadFactory().newThread(runnable);
        bhh bhhVar = bhh.f8158a;
        bhhVar.mo9305a(threadNewThread, "FirebaseDatabaseWorker");
        bhhVar.mo9307a(threadNewThread, true);
        bhhVar.mo9306a(threadNewThread, new bmy(this));
        return threadNewThread;
    }
}
