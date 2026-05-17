package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v7.p022a.C0333a;
import android.support.v7.view.menu.C0405h;
import android.support.v7.view.menu.InterfaceC0413p;
import android.support.v7.widget.AbstractViewOnAttachStateChangeListenerC0474al;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.C0464ab;
import android.support.v7.widget.C0500bk;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends C0464ab implements InterfaceC0413p.a, ActionMenuView.InterfaceC0426a, View.OnClickListener {

    /* JADX INFO: renamed from: b */
    C0407j f2395b;

    /* JADX INFO: renamed from: c */
    C0405h.b f2396c;

    /* JADX INFO: renamed from: d */
    AbstractC0397b f2397d;

    /* JADX INFO: renamed from: e */
    private CharSequence f2398e;

    /* JADX INFO: renamed from: f */
    private Drawable f2399f;

    /* JADX INFO: renamed from: g */
    private AbstractViewOnAttachStateChangeListenerC0474al f2400g;

    /* JADX INFO: renamed from: h */
    private boolean f2401h;

    /* JADX INFO: renamed from: i */
    private boolean f2402i;

    /* JADX INFO: renamed from: j */
    private int f2403j;

    /* JADX INFO: renamed from: k */
    private int f2404k;

    /* JADX INFO: renamed from: l */
    private int f2405l;

    /* JADX INFO: renamed from: android.support.v7.view.menu.ActionMenuItemView$a */
    private class C0396a extends AbstractViewOnAttachStateChangeListenerC0474al {
        public C0396a() {
            super(ActionMenuItemView.this);
        }

        @Override // android.support.v7.widget.AbstractViewOnAttachStateChangeListenerC0474al
        /* JADX INFO: renamed from: a */
        public InterfaceC0416s mo3168a() {
            if (ActionMenuItemView.this.f2397d != null) {
                return ActionMenuItemView.this.f2397d.mo3170a();
            }
            return null;
        }

        @Override // android.support.v7.widget.AbstractViewOnAttachStateChangeListenerC0474al
        /* JADX INFO: renamed from: b */
        protected boolean mo3169b() {
            InterfaceC0416s interfaceC0416sMo3168a;
            return ActionMenuItemView.this.f2396c != null && ActionMenuItemView.this.f2396c.mo3171a(ActionMenuItemView.this.f2395b) && (interfaceC0416sMo3168a = mo3168a()) != null && interfaceC0416sMo3168a.mo3214f();
        }
    }

    /* JADX INFO: renamed from: android.support.v7.view.menu.ActionMenuItemView$b */
    public static abstract class AbstractC0397b {
        /* JADX INFO: renamed from: a */
        public abstract InterfaceC0416s mo3170a();
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.f2401h = m3163e();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0333a.j.ActionMenuItemView, i, 0);
        this.f2403j = typedArrayObtainStyledAttributes.getDimensionPixelSize(C0333a.j.ActionMenuItemView_android_minWidth, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f2405l = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f2404k = -1;
        setSaveEnabled(false);
    }

    /* JADX INFO: renamed from: e */
    private boolean m3163e() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    /* JADX INFO: renamed from: f */
    private void m3164f() {
        boolean z = false;
        boolean z2 = !TextUtils.isEmpty(this.f2398e);
        if (this.f2399f == null || (this.f2395b.m3313m() && (this.f2401h || this.f2402i))) {
            z = true;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.f2398e : null);
        CharSequence contentDescription = this.f2395b.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            setContentDescription(z3 ? null : this.f2395b.getTitle());
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f2395b.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            C0500bk.m4540a(this, z3 ? null : this.f2395b.getTitle());
        } else {
            C0500bk.m4540a(this, tooltipText);
        }
    }

    @Override // android.support.v7.view.menu.InterfaceC0413p.a
    /* JADX INFO: renamed from: a */
    public void mo155a(C0407j c0407j, int i) {
        this.f2395b = c0407j;
        setIcon(c0407j.getIcon());
        setTitle(c0407j.m3293a((InterfaceC0413p.a) this));
        setId(c0407j.getItemId());
        setVisibility(c0407j.isVisible() ? 0 : 8);
        setEnabled(c0407j.isEnabled());
        if (c0407j.hasSubMenu() && this.f2400g == null) {
            this.f2400g = new C0396a();
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m3165a() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // android.support.v7.view.menu.InterfaceC0413p.a
    /* JADX INFO: renamed from: b */
    public boolean mo156b() {
        return true;
    }

    @Override // android.support.v7.widget.ActionMenuView.InterfaceC0426a
    /* JADX INFO: renamed from: c */
    public boolean mo3166c() {
        return m3165a() && this.f2395b.getIcon() == null;
    }

    @Override // android.support.v7.widget.ActionMenuView.InterfaceC0426a
    /* JADX INFO: renamed from: d */
    public boolean mo3167d() {
        return m3165a();
    }

    @Override // android.support.v7.view.menu.InterfaceC0413p.a
    public C0407j getItemData() {
        return this.f2395b;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.f2396c != null) {
            this.f2396c.mo3171a(this.f2395b);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f2401h = m3163e();
        m3164f();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        boolean zM3165a = m3165a();
        if (zM3165a && this.f2404k >= 0) {
            super.setPadding(this.f2404k, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, this.f2403j) : this.f2403j;
        if (mode != 1073741824 && this.f2403j > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i2);
        }
        if (zM3165a || this.f2399f == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f2399f.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f2395b.hasSubMenu() && this.f2400g != null && this.f2400g.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.f2402i != z) {
            this.f2402i = z;
            if (this.f2395b != null) {
                this.f2395b.m3308h();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f2399f = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > this.f2405l) {
                float f = this.f2405l / intrinsicWidth;
                intrinsicWidth = this.f2405l;
                intrinsicHeight = (int) (intrinsicHeight * f);
            }
            if (intrinsicHeight > this.f2405l) {
                float f2 = this.f2405l / intrinsicHeight;
                intrinsicHeight = this.f2405l;
                intrinsicWidth = (int) (intrinsicWidth * f2);
            }
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        }
        setCompoundDrawables(drawable, null, null, null);
        m3164f();
    }

    public void setItemInvoker(C0405h.b bVar) {
        this.f2396c = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        this.f2404k = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(AbstractC0397b abstractC0397b) {
        this.f2397d = abstractC0397b;
    }

    public void setTitle(CharSequence charSequence) {
        this.f2398e = charSequence;
        m3164f();
    }
}
