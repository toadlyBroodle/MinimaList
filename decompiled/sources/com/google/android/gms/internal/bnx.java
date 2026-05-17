package com.google.android.gms.internal;

import com.google.android.gms.internal.bnw;
import com.google.android.gms.internal.bnx;

/* JADX INFO: loaded from: classes.dex */
public abstract class bnx<MessageType extends bnw<MessageType, BuilderType>, BuilderType extends bnx<MessageType, BuilderType>> implements bqb {
    @Override // 
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public abstract BuilderType clone();

    /* JADX INFO: renamed from: a */
    protected abstract BuilderType mo9750a(MessageType messagetype);

    @Override // com.google.android.gms.internal.bqb
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ bqb mo9751a(bqa bqaVar) {
        if (mo9907n().getClass().isInstance(bqaVar)) {
            return mo9750a((bnw) bqaVar);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
