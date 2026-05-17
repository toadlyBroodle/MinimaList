package android.support.design.internal;

import android.content.Context;
import android.support.v7.view.menu.C0405h;
import android.support.v7.view.menu.C0407j;
import android.view.SubMenu;

/* JADX INFO: renamed from: android.support.design.internal.b */
/* JADX INFO: loaded from: classes.dex */
public class C0028b extends C0405h {
    public C0028b(Context context) {
        super(context);
    }

    @Override // android.support.v7.view.menu.C0405h, android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C0407j c0407j = (C0407j) m3246a(i, i2, i3, charSequence);
        C0030d c0030d = new C0030d(m3273e(), this, c0407j);
        c0407j.m3294a(c0030d);
        return c0030d;
    }
}
