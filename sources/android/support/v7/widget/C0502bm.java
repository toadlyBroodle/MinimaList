package android.support.v7.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.support.v7.p022a.C0333a;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;

/* JADX INFO: renamed from: android.support.v7.widget.bm */
/* JADX INFO: loaded from: classes.dex */
class C0502bm {

    /* JADX INFO: renamed from: a */
    private final Context f3509a;

    /* JADX INFO: renamed from: b */
    private final View f3510b;

    /* JADX INFO: renamed from: c */
    private final TextView f3511c;

    /* JADX INFO: renamed from: d */
    private final WindowManager.LayoutParams f3512d = new WindowManager.LayoutParams();

    /* JADX INFO: renamed from: e */
    private final Rect f3513e = new Rect();

    /* JADX INFO: renamed from: f */
    private final int[] f3514f = new int[2];

    /* JADX INFO: renamed from: g */
    private final int[] f3515g = new int[2];

    C0502bm(Context context) {
        this.f3509a = context;
        this.f3510b = LayoutInflater.from(this.f3509a).inflate(C0333a.g.tooltip, (ViewGroup) null);
        this.f3511c = (TextView) this.f3510b.findViewById(C0333a.f.message);
        this.f3512d.setTitle(getClass().getSimpleName());
        this.f3512d.packageName = this.f3509a.getPackageName();
        this.f3512d.type = 1002;
        this.f3512d.width = -2;
        this.f3512d.height = -2;
        this.f3512d.format = -3;
        this.f3512d.windowAnimations = C0333a.i.Animation_AppCompat_Tooltip;
        this.f3512d.flags = 24;
    }

    /* JADX INFO: renamed from: a */
    private static View m4547a(View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return view.getRootView();
    }

    /* JADX INFO: renamed from: a */
    private void m4548a(View view, int i, int i2, boolean z, WindowManager.LayoutParams layoutParams) {
        int height;
        int i3;
        int dimensionPixelOffset = this.f3509a.getResources().getDimensionPixelOffset(C0333a.d.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            i = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f3509a.getResources().getDimensionPixelOffset(C0333a.d.tooltip_precise_anchor_extra_offset);
            height = i2 + dimensionPixelOffset2;
            i3 = i2 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i3 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f3509a.getResources().getDimensionPixelOffset(z ? C0333a.d.tooltip_y_offset_touch : C0333a.d.tooltip_y_offset_non_touch);
        View viewM4547a = m4547a(view);
        if (viewM4547a == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        viewM4547a.getWindowVisibleDisplayFrame(this.f3513e);
        if (this.f3513e.left < 0 && this.f3513e.top < 0) {
            Resources resources = this.f3509a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f3513e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        viewM4547a.getLocationOnScreen(this.f3515g);
        view.getLocationOnScreen(this.f3514f);
        int[] iArr = this.f3514f;
        iArr[0] = iArr[0] - this.f3515g[0];
        int[] iArr2 = this.f3514f;
        iArr2[1] = iArr2[1] - this.f3515g[1];
        layoutParams.x = (this.f3514f[0] + i) - (this.f3513e.width() / 2);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f3510b.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        int measuredHeight = this.f3510b.getMeasuredHeight();
        int i4 = ((i3 + this.f3514f[1]) - dimensionPixelOffset3) - measuredHeight;
        int i5 = height + this.f3514f[1] + dimensionPixelOffset3;
        if (z) {
            if (i4 >= 0) {
                layoutParams.y = i4;
                return;
            } else {
                layoutParams.y = i5;
                return;
            }
        }
        if (measuredHeight + i5 <= this.f3513e.height()) {
            layoutParams.y = i5;
        } else {
            layoutParams.y = i4;
        }
    }

    /* JADX INFO: renamed from: a */
    void m4549a() {
        if (m4551b()) {
            ((WindowManager) this.f3509a.getSystemService("window")).removeView(this.f3510b);
        }
    }

    /* JADX INFO: renamed from: a */
    void m4550a(View view, int i, int i2, boolean z, CharSequence charSequence) {
        if (m4551b()) {
            m4549a();
        }
        this.f3511c.setText(charSequence);
        m4548a(view, i, i2, z, this.f3512d);
        ((WindowManager) this.f3509a.getSystemService("window")).addView(this.f3510b, this.f3512d);
    }

    /* JADX INFO: renamed from: b */
    boolean m4551b() {
        return this.f3510b.getParent() != null;
    }
}
