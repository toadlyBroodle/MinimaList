package com.google.firebase.iid;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.iid.MessengerCompat;

/* JADX INFO: renamed from: com.google.firebase.iid.r */
/* JADX INFO: loaded from: classes.dex */
final class C2306r {

    /* JADX INFO: renamed from: a */
    private final Messenger f13035a;

    /* JADX INFO: renamed from: b */
    private final MessengerCompat f13036b;

    C2306r(IBinder iBinder) throws RemoteException {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.f13035a = new Messenger(iBinder);
            this.f13036b = null;
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.f13036b = new MessengerCompat(iBinder);
            this.f13035a = null;
        } else {
            String strValueOf = String.valueOf(interfaceDescriptor);
            Log.w("MessengerIpcClient", strValueOf.length() != 0 ? "Invalid interface descriptor: ".concat(strValueOf) : new String("Invalid interface descriptor: "));
            throw new RemoteException();
        }
    }

    /* JADX INFO: renamed from: a */
    final void m13096a(Message message) throws RemoteException {
        if (this.f13035a != null) {
            this.f13035a.send(message);
        } else {
            if (this.f13036b == null) {
                throw new IllegalStateException("Both messengers are null");
            }
            this.f13036b.m7352a(message);
        }
    }
}
