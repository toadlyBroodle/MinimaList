package android.support.design.widget;

import android.R;
import android.content.Context;
import android.support.v4.p019j.C0227b;
import android.support.v4.p019j.C0246q;
import android.support.v4.p019j.p020a.C0224b;
import android.support.v7.p022a.C0333a;
import android.support.v7.widget.C0519o;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;

/* JADX INFO: loaded from: classes.dex */
public class CheckableImageButton extends C0519o implements Checkable {

    /* JADX INFO: renamed from: a */
    private static final int[] f248a = {R.attr.state_checked};

    /* JADX INFO: renamed from: b */
    private boolean f249b;

    public CheckableImageButton(Context context) {
        this(context, null);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0333a.a.imageButtonStyle);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0246q.m1745a(this, new C0227b() { // from class: android.support.design.widget.CheckableImageButton.1
            @Override // android.support.v4.p019j.C0227b
            /* JADX INFO: renamed from: a */
            public void mo157a(View view, C0224b c0224b) {
                super.mo157a(view, c0224b);
                c0224b.m1620a(true);
                c0224b.m1627b(CheckableImageButton.this.isChecked());
            }

            @Override // android.support.v4.p019j.C0227b
            /* JADX INFO: renamed from: a */
            public void mo311a(View view, AccessibilityEvent accessibilityEvent) {
                super.mo311a(view, accessibilityEvent);
                accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
            }
        });
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f249b;
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i) {
        return this.f249b ? mergeDrawableStates(super.onCreateDrawableState(f248a.length + i), f248a) : super.onCreateDrawableState(i);
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.f249b != z) {
            this.f249b = z;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f249b);
    }
}
