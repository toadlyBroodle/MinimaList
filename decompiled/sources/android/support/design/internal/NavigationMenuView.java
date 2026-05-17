package android.support.design.internal;

import android.content.Context;
import android.support.v7.view.menu.C0405h;
import android.support.v7.view.menu.InterfaceC0413p;
import android.support.v7.widget.C0484av;
import android.support.v7.widget.LinearLayoutManager;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes.dex */
public class NavigationMenuView extends C0484av implements InterfaceC0413p {
    public NavigationMenuView(Context context) {
        this(context, null);
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setLayoutManager(new LinearLayoutManager(context, 1, false));
    }

    @Override // android.support.v7.view.menu.InterfaceC0413p
    /* JADX INFO: renamed from: a */
    public void mo158a(C0405h c0405h) {
    }

    public int getWindowAnimations() {
        return 0;
    }
}
