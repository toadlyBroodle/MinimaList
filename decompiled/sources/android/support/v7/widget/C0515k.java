package android.support.v7.widget;

import android.R;
import android.content.Context;
import android.support.v7.p023b.p024a.C0366b;
import android.util.AttributeSet;
import android.widget.CheckedTextView;

/* JADX INFO: renamed from: android.support.v7.widget.k */
/* JADX INFO: loaded from: classes.dex */
public class C0515k extends CheckedTextView {

    /* JADX INFO: renamed from: a */
    private static final int[] f3609a = {R.attr.checkMark};

    /* JADX INFO: renamed from: b */
    private final C0530z f3610b;

    public C0515k(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkedTextViewStyle);
    }

    public C0515k(Context context, AttributeSet attributeSet, int i) {
        super(C0495bf.m4505a(context), attributeSet, i);
        this.f3610b = C0530z.m4729a(this);
        this.f3610b.mo3746a(attributeSet, i);
        this.f3610b.mo3745a();
        C0498bi c0498biM4510a = C0498bi.m4510a(getContext(), attributeSet, f3609a, i, 0);
        setCheckMarkDrawable(c0498biM4510a.m4514a(0));
        c0498biM4510a.m4515a();
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f3610b != null) {
            this.f3610b.mo3745a();
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(C0366b.m2790b(getContext(), i));
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.f3610b != null) {
            this.f3610b.m4737a(context, i);
        }
    }
}
