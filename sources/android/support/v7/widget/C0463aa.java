package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.p022a.C0333a;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: renamed from: android.support.v7.widget.aa */
/* JADX INFO: loaded from: classes.dex */
class C0463aa extends C0530z {

    /* JADX INFO: renamed from: b */
    private C0496bg f2968b;

    /* JADX INFO: renamed from: c */
    private C0496bg f2969c;

    C0463aa(TextView textView) {
        super(textView);
    }

    @Override // android.support.v7.widget.C0530z
    /* JADX INFO: renamed from: a */
    void mo3745a() {
        super.mo3745a();
        if (this.f2968b == null && this.f2969c == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.f3683a.getCompoundDrawablesRelative();
        m4738a(compoundDrawablesRelative[0], this.f2968b);
        m4738a(compoundDrawablesRelative[2], this.f2969c);
    }

    @Override // android.support.v7.widget.C0530z
    /* JADX INFO: renamed from: a */
    void mo3746a(AttributeSet attributeSet, int i) {
        super.mo3746a(attributeSet, i);
        Context context = this.f3683a.getContext();
        C0517m c0517mM4669a = C0517m.m4669a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0333a.j.AppCompatTextHelper, i, 0);
        if (typedArrayObtainStyledAttributes.hasValue(C0333a.j.AppCompatTextHelper_android_drawableStart)) {
            this.f2968b = m4728a(context, c0517mM4669a, typedArrayObtainStyledAttributes.getResourceId(C0333a.j.AppCompatTextHelper_android_drawableStart, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(C0333a.j.AppCompatTextHelper_android_drawableEnd)) {
            this.f2969c = m4728a(context, c0517mM4669a, typedArrayObtainStyledAttributes.getResourceId(C0333a.j.AppCompatTextHelper_android_drawableEnd, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
