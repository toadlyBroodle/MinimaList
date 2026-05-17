package android.support.v7.widget;

import android.content.Context;
import android.os.Build;
import android.support.v4.widget.C0327k;
import android.support.v7.p022a.C0333a;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;

/* JADX INFO: renamed from: android.support.v7.widget.s */
/* JADX INFO: loaded from: classes.dex */
class C0523s extends PopupWindow {

    /* JADX INFO: renamed from: a */
    private static final boolean f3646a;

    /* JADX INFO: renamed from: b */
    private boolean f3647b;

    static {
        f3646a = Build.VERSION.SDK_INT < 21;
    }

    public C0523s(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m4707a(context, attributeSet, i, i2);
    }

    /* JADX INFO: renamed from: a */
    private void m4707a(Context context, AttributeSet attributeSet, int i, int i2) {
        C0498bi c0498biM4510a = C0498bi.m4510a(context, attributeSet, C0333a.j.PopupWindow, i, i2);
        if (c0498biM4510a.m4528g(C0333a.j.PopupWindow_overlapAnchor)) {
            m4708a(c0498biM4510a.m4516a(C0333a.j.PopupWindow_overlapAnchor, false));
        }
        setBackgroundDrawable(c0498biM4510a.m4514a(C0333a.j.PopupWindow_android_popupBackground));
        c0498biM4510a.m4515a();
    }

    /* JADX INFO: renamed from: a */
    private void m4708a(boolean z) {
        if (f3646a) {
            this.f3647b = z;
        } else {
            C0327k.m2463a(this, z);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2) {
        if (f3646a && this.f3647b) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (f3646a && this.f3647b) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i, int i2, int i3, int i4) {
        super.update(view, i, (f3646a && this.f3647b) ? i2 - view.getHeight() : i2, i3, i4);
    }
}
