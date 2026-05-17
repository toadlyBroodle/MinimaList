package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.util.C1310n;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1085a {

    /* JADX INFO: renamed from: a */
    private int f5520a;

    public AbstractC1085a(int i) {
        this.f5520a = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static Status m6725b(RemoteException remoteException) {
        StringBuilder sb = new StringBuilder();
        if (C1310n.m7278a() && (remoteException instanceof TransactionTooLargeException)) {
            sb.append("TransactionTooLargeException: ");
        }
        sb.append(remoteException.getLocalizedMessage());
        return new Status(8, sb.toString());
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo6726a(Status status);

    /* JADX INFO: renamed from: a */
    public abstract void mo6727a(C1100ao<?> c1100ao);

    /* JADX INFO: renamed from: a */
    public abstract void mo6728a(C1171f c1171f, boolean z);
}
