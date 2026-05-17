package com.google.android.gms.internal;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class bid implements bie {

    /* JADX INFO: renamed from: a */
    private boolean f8208a = false;

    /* JADX INFO: renamed from: b */
    private final void m9376b() {
        bne.m9697a(this.f8208a, "Transaction expected to already be in progress.");
    }

    @Override // com.google.android.gms.internal.bie
    /* JADX INFO: renamed from: a */
    public final bje mo9361a(bjs bjsVar) {
        return new bje(blf.m9612a(bld.m9605j(), bjsVar.m9484c()), false, false);
    }

    @Override // com.google.android.gms.internal.bie
    /* JADX INFO: renamed from: a */
    public final <T> T mo9362a(Callable<T> callable) {
        RuntimeException runtimeException;
        bne.m9697a(!this.f8208a, "runInTransaction called when an existing transaction is already in progress.");
        this.f8208a = true;
        try {
            try {
                return callable.call();
            } finally {
            }
        } finally {
            this.f8208a = false;
        }
    }

    @Override // com.google.android.gms.internal.bie
    /* JADX INFO: renamed from: a */
    public final List<bhj> mo9363a() {
        return Collections.emptyList();
    }

    @Override // com.google.android.gms.internal.bie
    /* JADX INFO: renamed from: a */
    public final void mo9364a(long j) {
        m9376b();
    }

    @Override // com.google.android.gms.internal.bie
    /* JADX INFO: renamed from: a */
    public final void mo9365a(bfa bfaVar, beo beoVar) {
        m9376b();
    }

    @Override // com.google.android.gms.internal.bie
    /* JADX INFO: renamed from: a */
    public final void mo9366a(bfa bfaVar, beo beoVar, long j) {
        m9376b();
    }

    @Override // com.google.android.gms.internal.bie
    /* JADX INFO: renamed from: a */
    public final void mo9367a(bfa bfaVar, bln blnVar) {
        m9376b();
    }

    @Override // com.google.android.gms.internal.bie
    /* JADX INFO: renamed from: a */
    public final void mo9368a(bfa bfaVar, bln blnVar, long j) {
        m9376b();
    }

    @Override // com.google.android.gms.internal.bie
    /* JADX INFO: renamed from: a */
    public final void mo9369a(bjs bjsVar, bln blnVar) {
        m9376b();
    }

    @Override // com.google.android.gms.internal.bie
    /* JADX INFO: renamed from: a */
    public final void mo9370a(bjs bjsVar, Set<bkp> set) {
        m9376b();
    }

    @Override // com.google.android.gms.internal.bie
    /* JADX INFO: renamed from: a */
    public final void mo9371a(bjs bjsVar, Set<bkp> set, Set<bkp> set2) {
        m9376b();
    }

    @Override // com.google.android.gms.internal.bie
    /* JADX INFO: renamed from: b */
    public final void mo9372b(bfa bfaVar, beo beoVar) {
        m9376b();
    }

    @Override // com.google.android.gms.internal.bie
    /* JADX INFO: renamed from: b */
    public final void mo9373b(bjs bjsVar) {
        m9376b();
    }

    @Override // com.google.android.gms.internal.bie
    /* JADX INFO: renamed from: c */
    public final void mo9374c(bjs bjsVar) {
        m9376b();
    }

    @Override // com.google.android.gms.internal.bie
    /* JADX INFO: renamed from: d */
    public final void mo9375d(bjs bjsVar) {
        m9376b();
    }
}
