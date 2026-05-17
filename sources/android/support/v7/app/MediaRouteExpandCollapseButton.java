package android.support.v7.app;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.AnimationDrawable;
import android.support.v4.p007b.C0175b;
import android.support.v7.p028e.C0385a;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;

/* JADX INFO: loaded from: classes.dex */
class MediaRouteExpandCollapseButton extends ImageButton {

    /* JADX INFO: renamed from: a */
    final AnimationDrawable f1875a;

    /* JADX INFO: renamed from: b */
    final AnimationDrawable f1876b;

    /* JADX INFO: renamed from: c */
    final String f1877c;

    /* JADX INFO: renamed from: d */
    final String f1878d;

    /* JADX INFO: renamed from: e */
    boolean f1879e;

    /* JADX INFO: renamed from: f */
    View.OnClickListener f1880f;

    public MediaRouteExpandCollapseButton(Context context) {
        this(context, null);
    }

    public MediaRouteExpandCollapseButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MediaRouteExpandCollapseButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1875a = (AnimationDrawable) C0175b.m1337a(context, C0385a.a.mr_group_expand);
        this.f1876b = (AnimationDrawable) C0175b.m1337a(context, C0385a.a.mr_group_collapse);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(C0359p.m2727a(context, i), PorterDuff.Mode.SRC_IN);
        this.f1875a.setColorFilter(porterDuffColorFilter);
        this.f1876b.setColorFilter(porterDuffColorFilter);
        this.f1877c = context.getString(C0385a.b.mr_controller_expand_group);
        this.f1878d = context.getString(C0385a.b.mr_controller_collapse_group);
        setImageDrawable(this.f1875a.getFrame(0));
        setContentDescription(this.f1877c);
        super.setOnClickListener(new View.OnClickListener() { // from class: android.support.v7.app.MediaRouteExpandCollapseButton.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MediaRouteExpandCollapseButton.this.f1879e = !MediaRouteExpandCollapseButton.this.f1879e;
                if (MediaRouteExpandCollapseButton.this.f1879e) {
                    MediaRouteExpandCollapseButton.this.setImageDrawable(MediaRouteExpandCollapseButton.this.f1875a);
                    MediaRouteExpandCollapseButton.this.f1875a.start();
                    MediaRouteExpandCollapseButton.this.setContentDescription(MediaRouteExpandCollapseButton.this.f1878d);
                } else {
                    MediaRouteExpandCollapseButton.this.setImageDrawable(MediaRouteExpandCollapseButton.this.f1876b);
                    MediaRouteExpandCollapseButton.this.f1876b.start();
                    MediaRouteExpandCollapseButton.this.setContentDescription(MediaRouteExpandCollapseButton.this.f1877c);
                }
                if (MediaRouteExpandCollapseButton.this.f1880f != null) {
                    MediaRouteExpandCollapseButton.this.f1880f.onClick(view);
                }
            }
        });
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f1880f = onClickListener;
    }
}
