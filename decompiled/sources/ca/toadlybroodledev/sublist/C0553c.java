package ca.toadlybroodledev.sublist;

import android.app.Activity;
import android.content.Context;
import android.support.v4.widget.C0322f;
import android.support.v7.app.C0345b;
import android.support.v7.widget.Toolbar;
import android.view.View;
import ca.toadlybroodledev.sublist.p031b.InterfaceC0549a;

/* JADX INFO: renamed from: ca.toadlybroodledev.sublist.c */
/* JADX INFO: loaded from: classes.dex */
public class C0553c extends C0345b {

    /* JADX INFO: renamed from: c */
    private InterfaceC0549a f3817c;

    public C0553c(Activity activity, C0322f c0322f, Toolbar toolbar, int i, int i2) {
        super(activity, c0322f, toolbar, i, i2);
        m4854a(activity);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    private void m4854a(Context context) {
        this.f3817c = (InterfaceC0549a) context;
    }

    @Override // android.support.v7.app.C0345b, android.support.v4.widget.C0322f.c
    /* JADX INFO: renamed from: a */
    public void mo2438a(View view, float f) {
        if (f > 0.0f) {
            this.f3817c.mo4761a(view, false);
            this.f3817c.mo4781s().m4800a(false, false);
        } else if (this.f3817c.mo4787y() != null) {
            this.f3817c.mo4781s().m4800a(true, false);
            this.f3817c.mo4782t().setDrawerLockMode(1);
        }
        super.mo2438a(view, f);
    }
}
