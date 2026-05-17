package com.google.android.gms.internal;

import android.os.Handler;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@cnb
final class cfn {

    /* JADX INFO: renamed from: a */
    private final List<cgm> f9928a = new LinkedList();

    cfn() {
    }

    /* JADX INFO: renamed from: a */
    final void m10796a(cgn cgnVar) {
        Handler handler = C1596gv.f10711a;
        Iterator<cgm> it = this.f9928a.iterator();
        while (it.hasNext()) {
            handler.post(new cgl(this, it.next(), cgnVar));
        }
        this.f9928a.clear();
    }
}
