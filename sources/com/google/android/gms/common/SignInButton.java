package com.google.android.gms.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.C0651a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C1228aq;
import com.google.android.gms.common.internal.C1229ar;
import com.google.android.gms.p043a.C0656e;

/* JADX INFO: loaded from: classes.dex */
public final class SignInButton extends FrameLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    private int f5435a;

    /* JADX INFO: renamed from: b */
    private int f5436b;

    /* JADX INFO: renamed from: c */
    private View f5437c;

    /* JADX INFO: renamed from: d */
    private View.OnClickListener f5438d;

    public SignInButton(Context context) {
        this(context, null);
    }

    public SignInButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SignInButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5438d = null;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C0651a.e.SignInButton, 0, 0);
        try {
            this.f5435a = typedArrayObtainStyledAttributes.getInt(C0651a.e.SignInButton_buttonSize, 0);
            this.f5436b = typedArrayObtainStyledAttributes.getInt(C0651a.e.SignInButton_colorScheme, 2);
            typedArrayObtainStyledAttributes.recycle();
            m6609a(this.f5435a, this.f5436b);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m6609a(int i, int i2) {
        this.f5435a = i;
        this.f5436b = i2;
        Context context = getContext();
        if (this.f5437c != null) {
            removeView(this.f5437c);
        }
        try {
            this.f5437c = C1228aq.m7082a(context, this.f5435a, this.f5436b);
        } catch (C0656e e) {
            Log.w("SignInButton", "Sign in button not found, using placeholder instead");
            int i3 = this.f5435a;
            int i4 = this.f5436b;
            C1229ar c1229ar = new C1229ar(context);
            c1229ar.m7085a(context.getResources(), i3, i4);
            this.f5437c = c1229ar;
        }
        addView(this.f5437c);
        this.f5437c.setEnabled(isEnabled());
        this.f5437c.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.f5438d == null || view != this.f5437c) {
            return;
        }
        this.f5438d.onClick(this);
    }

    public final void setColorScheme(int i) {
        m6609a(this.f5435a, i);
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f5437c.setEnabled(z);
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f5438d = onClickListener;
        if (this.f5437c != null) {
            this.f5437c.setOnClickListener(this);
        }
    }

    @Deprecated
    public final void setScopes(Scope[] scopeArr) {
        m6609a(this.f5435a, this.f5436b);
    }

    public final void setSize(int i) {
        m6609a(i, this.f5436b);
    }
}
