package android.support.v7.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.support.v7.p022a.C0333a;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* JADX INFO: renamed from: a */
    private int f2952a;

    /* JADX INFO: renamed from: b */
    private int f2953b;

    /* JADX INFO: renamed from: c */
    private WeakReference<View> f2954c;

    /* JADX INFO: renamed from: d */
    private LayoutInflater f2955d;

    /* JADX INFO: renamed from: e */
    private InterfaceC0461a f2956e;

    /* JADX INFO: renamed from: android.support.v7.widget.ViewStubCompat$a */
    public interface InterfaceC0461a {
        /* JADX INFO: renamed from: a */
        void m3738a(ViewStubCompat viewStubCompat, View view);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2952a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0333a.j.ViewStubCompat, i, 0);
        this.f2953b = typedArrayObtainStyledAttributes.getResourceId(C0333a.j.ViewStubCompat_android_inflatedId, -1);
        this.f2952a = typedArrayObtainStyledAttributes.getResourceId(C0333a.j.ViewStubCompat_android_layout, 0);
        setId(typedArrayObtainStyledAttributes.getResourceId(C0333a.j.ViewStubCompat_android_id, -1));
        typedArrayObtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    /* JADX INFO: renamed from: a */
    public View m3737a() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        }
        if (this.f2952a == 0) {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        View viewInflate = (this.f2955d != null ? this.f2955d : LayoutInflater.from(getContext())).inflate(this.f2952a, viewGroup, false);
        if (this.f2953b != -1) {
            viewInflate.setId(this.f2953b);
        }
        int iIndexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(viewInflate, iIndexOfChild, layoutParams);
        } else {
            viewGroup.addView(viewInflate, iIndexOfChild);
        }
        this.f2954c = new WeakReference<>(viewInflate);
        if (this.f2956e != null) {
            this.f2956e.m3738a(this, viewInflate);
        }
        return viewInflate;
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f2953b;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f2955d;
    }

    public int getLayoutResource() {
        return this.f2952a;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i) {
        this.f2953b = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f2955d = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.f2952a = i;
    }

    public void setOnInflateListener(InterfaceC0461a interfaceC0461a) {
        this.f2956e = interfaceC0461a;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (this.f2954c != null) {
            View view = this.f2954c.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i);
            return;
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            m3737a();
        }
    }
}
