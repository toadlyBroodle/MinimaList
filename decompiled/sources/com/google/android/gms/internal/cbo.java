package com.google.android.gms.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.C0710au;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.p043a.BinderC0654c;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class cbo extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    private static final float[] f9726a = {5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f};

    /* JADX INFO: renamed from: b */
    private AnimationDrawable f9727b;

    public cbo(Context context, cbn cbnVar, RelativeLayout.LayoutParams layoutParams) {
        super(context);
        C1221aj.m7065a(cbnVar);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(f9726a, null, null));
        shapeDrawable.getPaint().setColor(cbnVar.m10598d());
        setLayoutParams(layoutParams);
        C0710au.m5571g().mo11466a(this, shapeDrawable);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        if (!TextUtils.isEmpty(cbnVar.mo10595a())) {
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            TextView textView = new TextView(context);
            textView.setLayoutParams(layoutParams3);
            textView.setId(1195835393);
            textView.setTypeface(Typeface.DEFAULT);
            textView.setText(cbnVar.mo10595a());
            textView.setTextColor(cbnVar.m10599e());
            textView.setTextSize(cbnVar.m10600f());
            bxm.m10404a();
            int iM11560a = C1657jb.m11560a(context, 4);
            bxm.m10404a();
            textView.setPadding(iM11560a, 0, C1657jb.m11560a(context, 4), 0);
            addView(textView);
            layoutParams2.addRule(1, textView.getId());
        }
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(layoutParams2);
        imageView.setId(1195835394);
        List<cbp> listM10597c = cbnVar.m10597c();
        if (listM10597c != null && listM10597c.size() > 1) {
            this.f9727b = new AnimationDrawable();
            Iterator<cbp> it = listM10597c.iterator();
            while (it.hasNext()) {
                try {
                    this.f9727b.addFrame((Drawable) BinderC0654c.m5330a(it.next().mo10604a()), cbnVar.m10601g());
                } catch (Exception e) {
                    C1560fm.m11611b("Error while getting drawable.", e);
                }
            }
            C0710au.m5571g().mo11466a(imageView, this.f9727b);
        } else if (listM10597c.size() == 1) {
            try {
                imageView.setImageDrawable((Drawable) BinderC0654c.m5330a(listM10597c.get(0).mo10604a()));
            } catch (Exception e2) {
                C1560fm.m11611b("Error while getting drawable.", e2);
            }
        }
        addView(imageView);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        if (this.f9727b != null) {
            this.f9727b.start();
        }
        super.onAttachedToWindow();
    }
}
