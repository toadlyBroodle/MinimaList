package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.google.android.gms.internal.kh */
/* JADX INFO: loaded from: classes.dex */
@cnb
final class C1690kh {

    /* JADX INFO: renamed from: a */
    private final Object f10883a = new Object();

    /* JADX INFO: renamed from: b */
    private final List<Runnable> f10884b = new ArrayList();

    /* JADX INFO: renamed from: c */
    private boolean f10885c = false;

    /* JADX INFO: renamed from: a */
    public final void m11632a() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f10883a) {
            if (this.f10885c) {
                return;
            }
            arrayList.addAll(this.f10884b);
            this.f10884b.clear();
            this.f10885c = true;
            ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                ((Runnable) obj).run();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m11633a(final Runnable runnable, final Executor executor) {
        synchronized (this.f10883a) {
            if (this.f10885c) {
                executor.execute(runnable);
            } else {
                this.f10884b.add(new Runnable(executor, runnable) { // from class: com.google.android.gms.internal.ki

                    /* JADX INFO: renamed from: a */
                    private final Executor f10886a;

                    /* JADX INFO: renamed from: b */
                    private final Runnable f10887b;

                    {
                        this.f10886a = executor;
                        this.f10887b = runnable;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f10886a.execute(this.f10887b);
                    }
                });
            }
        }
    }
}
