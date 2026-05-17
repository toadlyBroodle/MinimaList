package com.google.android.gms.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class bfm implements Callable {

    /* JADX INFO: renamed from: a */
    private final arz f8027a;

    /* JADX INFO: renamed from: b */
    private final C1937tl f8028b;

    public bfm(arz arzVar, C1937tl c1937tl) {
        this.f8027a = arzVar;
        this.f8028b = c1937tl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Void call() throws ExecutionException, InterruptedException {
        if (this.f8027a.m8262l() != null) {
            this.f8027a.m8262l().get();
        }
        C1937tl c1937tlM8261k = this.f8027a.m8261k();
        if (c1937tlM8261k == null) {
            return null;
        }
        try {
            synchronized (this.f8028b) {
                bsc.m10162a(this.f8028b, bsc.m10164a(c1937tlM8261k));
            }
            return null;
        } catch (bsb e) {
            return null;
        }
    }
}
