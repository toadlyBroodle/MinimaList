package com.google.firebase.iid;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.p051b.C0965f;

/* JADX INFO: renamed from: com.google.firebase.iid.t */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC2308t<T> {

    /* JADX INFO: renamed from: a */
    final int f13037a;

    /* JADX INFO: renamed from: b */
    final C0965f<T> f13038b = new C0965f<>();

    /* JADX INFO: renamed from: c */
    final int f13039c;

    /* JADX INFO: renamed from: d */
    final Bundle f13040d;

    AbstractC2308t(int i, int i2, Bundle bundle) {
        this.f13037a = i;
        this.f13039c = i2;
        this.f13040d = bundle;
    }

    /* JADX INFO: renamed from: a */
    abstract void mo13097a(Bundle bundle);

    /* JADX INFO: renamed from: a */
    final void m13099a(C2309u c2309u) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String strValueOf = String.valueOf(this);
            String strValueOf2 = String.valueOf(c2309u);
            Log.d("MessengerIpcClient", new StringBuilder(String.valueOf(strValueOf).length() + 14 + String.valueOf(strValueOf2).length()).append("Failing ").append(strValueOf).append(" with ").append(strValueOf2).toString());
        }
        this.f13038b.m6218a(c2309u);
    }

    /* JADX INFO: renamed from: a */
    final void m13100a(T t) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String strValueOf = String.valueOf(this);
            String strValueOf2 = String.valueOf(t);
            Log.d("MessengerIpcClient", new StringBuilder(String.valueOf(strValueOf).length() + 16 + String.valueOf(strValueOf2).length()).append("Finishing ").append(strValueOf).append(" with ").append(strValueOf2).toString());
        }
        this.f13038b.m6219a(t);
    }

    /* JADX INFO: renamed from: a */
    abstract boolean mo13098a();

    public String toString() {
        int i = this.f13039c;
        int i2 = this.f13037a;
        return new StringBuilder(55).append("Request { what=").append(i).append(" id=").append(i2).append(" oneWay=").append(mo13098a()).append("}").toString();
    }
}
