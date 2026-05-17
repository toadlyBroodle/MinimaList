package android.support.v4.p006a;

import android.app.Activity;
import android.arch.lifecycle.AbstractC0005b;
import android.arch.lifecycle.C0007d;
import android.arch.lifecycle.FragmentC0010g;
import android.arch.lifecycle.InterfaceC0006c;
import android.os.Bundle;
import android.support.v4.p018i.C0219m;

/* JADX INFO: renamed from: android.support.v4.a.aj */
/* JADX INFO: loaded from: classes.dex */
public class ActivityC0144aj extends Activity implements InterfaceC0006c {

    /* JADX INFO: renamed from: a */
    private C0219m<Class<? extends Object>, Object> f743a = new C0219m<>();

    /* JADX INFO: renamed from: b */
    private C0007d f744b = new C0007d(this);

    @Override // android.arch.lifecycle.InterfaceC0006c
    /* JADX INFO: renamed from: a */
    public AbstractC0005b mo18a() {
        return this.f744b;
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentC0010g.m34a(this);
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        this.f744b.m30a(AbstractC0005b.b.CREATED);
        super.onSaveInstanceState(bundle);
    }
}
