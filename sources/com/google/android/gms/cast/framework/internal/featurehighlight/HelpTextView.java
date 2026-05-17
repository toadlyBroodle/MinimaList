package com.google.android.gms.cast.framework.internal.featurehighlight;

import android.content.Context;
import android.support.annotation.Keep;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.C0651a;
import com.google.android.gms.internal.asa;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class HelpTextView extends LinearLayout {
    private TextView zzewv;
    private TextView zzeww;

    @Keep
    public HelpTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private static void zza(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        textView.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    @Keep
    public View asView() {
        return this;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.zzewv = (TextView) asa.m8265a((TextView) findViewById(C0651a.c.cast_featurehighlight_help_text_header_view));
        this.zzeww = (TextView) asa.m8265a((TextView) findViewById(C0651a.c.cast_featurehighlight_help_text_body_view));
    }

    @Keep
    public void setText(CharSequence charSequence, CharSequence charSequence2) {
        zza(this.zzewv, charSequence);
        zza(this.zzeww, charSequence2);
    }
}
