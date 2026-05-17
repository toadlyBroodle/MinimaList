package com.google.android.gms.common.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.v4.p009c.p010a.C0181a;
import android.util.AttributeSet;
import android.widget.Button;
import com.google.android.gms.C0651a;
import com.google.android.gms.common.util.C1304h;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.ar */
/* JADX INFO: loaded from: classes.dex */
public final class C1229ar extends Button {
    public C1229ar(Context context) {
        this(context, null);
    }

    private C1229ar(Context context, AttributeSet attributeSet) {
        super(context, null, R.attr.buttonStyle);
    }

    /* JADX INFO: renamed from: a */
    private static int m7084a(int i, int i2, int i3, int i4) {
        switch (i) {
            case 0:
                return i2;
            case 1:
                return i3;
            case 2:
                return i4;
            default:
                throw new IllegalStateException(new StringBuilder(33).append("Unknown color scheme: ").append(i).toString());
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m7085a(Resources resources, int i, int i2) {
        setTypeface(Typeface.DEFAULT_BOLD);
        setTextSize(14.0f);
        float f = resources.getDisplayMetrics().density;
        setMinHeight((int) ((f * 48.0f) + 0.5f));
        setMinWidth((int) ((f * 48.0f) + 0.5f));
        int iM7084a = m7084a(i2, C0651a.b.common_google_signin_btn_icon_dark, C0651a.b.common_google_signin_btn_icon_light, C0651a.b.common_google_signin_btn_icon_light);
        int iM7084a2 = m7084a(i2, C0651a.b.common_google_signin_btn_text_dark, C0651a.b.common_google_signin_btn_text_light, C0651a.b.common_google_signin_btn_text_light);
        switch (i) {
            case 0:
            case 1:
                break;
            case 2:
                iM7084a2 = iM7084a;
                break;
            default:
                throw new IllegalStateException(new StringBuilder(32).append("Unknown button size: ").append(i).toString());
        }
        Drawable drawableM1400f = C0181a.m1400f(resources.getDrawable(iM7084a2));
        C0181a.m1390a(drawableM1400f, resources.getColorStateList(C0651a.a.common_google_signin_btn_tint));
        C0181a.m1393a(drawableM1400f, PorterDuff.Mode.SRC_ATOP);
        setBackgroundDrawable(drawableM1400f);
        setTextColor((ColorStateList) C1221aj.m7065a(resources.getColorStateList(m7084a(i2, C0651a.a.common_google_signin_btn_text_dark, C0651a.a.common_google_signin_btn_text_light, C0651a.a.common_google_signin_btn_text_light))));
        switch (i) {
            case 0:
                setText(resources.getString(C0651a.d.common_signin_button_text));
                break;
            case 1:
                setText(resources.getString(C0651a.d.common_signin_button_text_long));
                break;
            case 2:
                setText((CharSequence) null);
                break;
            default:
                throw new IllegalStateException(new StringBuilder(32).append("Unknown button size: ").append(i).toString());
        }
        setTransformationMethod(null);
        if (C1304h.m7264a(getContext())) {
            setGravity(19);
        }
    }
}
