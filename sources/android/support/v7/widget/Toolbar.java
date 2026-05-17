package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.design.C0025a;
import android.support.v4.p019j.AbstractC0222a;
import android.support.v4.p019j.C0233d;
import android.support.v4.p019j.C0235f;
import android.support.v4.p019j.C0246q;
import android.support.v7.app.AbstractC0344a;
import android.support.v7.p022a.C0333a;
import android.support.v7.p023b.p024a.C0366b;
import android.support.v7.view.C0393g;
import android.support.v7.view.InterfaceC0389c;
import android.support.v7.view.menu.C0405h;
import android.support.v7.view.menu.C0407j;
import android.support.v7.view.menu.InterfaceC0412o;
import android.support.v7.view.menu.SubMenuC0418u;
import android.support.v7.widget.ActionMenuView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup {

    /* JADX INFO: renamed from: A */
    private int f2902A;

    /* JADX INFO: renamed from: B */
    private int f2903B;

    /* JADX INFO: renamed from: C */
    private boolean f2904C;

    /* JADX INFO: renamed from: D */
    private boolean f2905D;

    /* JADX INFO: renamed from: E */
    private final ArrayList<View> f2906E;

    /* JADX INFO: renamed from: F */
    private final ArrayList<View> f2907F;

    /* JADX INFO: renamed from: G */
    private final int[] f2908G;

    /* JADX INFO: renamed from: H */
    private final ActionMenuView.InterfaceC0430e f2909H;

    /* JADX INFO: renamed from: I */
    private C0499bj f2910I;

    /* JADX INFO: renamed from: J */
    private C0508d f2911J;

    /* JADX INFO: renamed from: K */
    private C0457a f2912K;

    /* JADX INFO: renamed from: L */
    private InterfaceC0412o.a f2913L;

    /* JADX INFO: renamed from: M */
    private C0405h.a f2914M;

    /* JADX INFO: renamed from: N */
    private boolean f2915N;

    /* JADX INFO: renamed from: O */
    private final Runnable f2916O;

    /* JADX INFO: renamed from: a */
    ImageButton f2917a;

    /* JADX INFO: renamed from: b */
    View f2918b;

    /* JADX INFO: renamed from: c */
    int f2919c;

    /* JADX INFO: renamed from: d */
    InterfaceC0459c f2920d;

    /* JADX INFO: renamed from: e */
    private ActionMenuView f2921e;

    /* JADX INFO: renamed from: f */
    private TextView f2922f;

    /* JADX INFO: renamed from: g */
    private TextView f2923g;

    /* JADX INFO: renamed from: h */
    private ImageButton f2924h;

    /* JADX INFO: renamed from: i */
    private ImageView f2925i;

    /* JADX INFO: renamed from: j */
    private Drawable f2926j;

    /* JADX INFO: renamed from: k */
    private CharSequence f2927k;

    /* JADX INFO: renamed from: l */
    private Context f2928l;

    /* JADX INFO: renamed from: m */
    private int f2929m;

    /* JADX INFO: renamed from: n */
    private int f2930n;

    /* JADX INFO: renamed from: o */
    private int f2931o;

    /* JADX INFO: renamed from: p */
    private int f2932p;

    /* JADX INFO: renamed from: q */
    private int f2933q;

    /* JADX INFO: renamed from: r */
    private int f2934r;

    /* JADX INFO: renamed from: s */
    private int f2935s;

    /* JADX INFO: renamed from: t */
    private int f2936t;

    /* JADX INFO: renamed from: u */
    private C0487ay f2937u;

    /* JADX INFO: renamed from: v */
    private int f2938v;

    /* JADX INFO: renamed from: w */
    private int f2939w;

    /* JADX INFO: renamed from: x */
    private int f2940x;

    /* JADX INFO: renamed from: y */
    private CharSequence f2941y;

    /* JADX INFO: renamed from: z */
    private CharSequence f2942z;

    /* JADX INFO: renamed from: android.support.v7.widget.Toolbar$a */
    private class C0457a implements InterfaceC0412o {

        /* JADX INFO: renamed from: a */
        C0405h f2946a;

        /* JADX INFO: renamed from: b */
        C0407j f2947b;

        C0457a() {
        }

        @Override // android.support.v7.view.menu.InterfaceC0412o
        /* JADX INFO: renamed from: a */
        public void mo165a(Context context, C0405h c0405h) {
            if (this.f2946a != null && this.f2947b != null) {
                this.f2946a.mo3272d(this.f2947b);
            }
            this.f2946a = c0405h;
        }

        @Override // android.support.v7.view.menu.InterfaceC0412o
        /* JADX INFO: renamed from: a */
        public void mo168a(Parcelable parcelable) {
        }

        @Override // android.support.v7.view.menu.InterfaceC0412o
        /* JADX INFO: renamed from: a */
        public void mo170a(C0405h c0405h, boolean z) {
        }

        @Override // android.support.v7.view.menu.InterfaceC0412o
        /* JADX INFO: renamed from: a */
        public void mo172a(InterfaceC0412o.a aVar) {
        }

        @Override // android.support.v7.view.menu.InterfaceC0412o
        /* JADX INFO: renamed from: a */
        public void mo174a(boolean z) {
            boolean z2 = false;
            if (this.f2947b != null) {
                if (this.f2946a != null) {
                    int size = this.f2946a.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        }
                        if (this.f2946a.getItem(i) == this.f2947b) {
                            z2 = true;
                            break;
                        }
                        i++;
                    }
                }
                if (z2) {
                    return;
                }
                mo182b(this.f2946a, this.f2947b);
            }
        }

        @Override // android.support.v7.view.menu.InterfaceC0412o
        /* JADX INFO: renamed from: a */
        public boolean mo175a() {
            return false;
        }

        @Override // android.support.v7.view.menu.InterfaceC0412o
        /* JADX INFO: renamed from: a */
        public boolean mo176a(C0405h c0405h, C0407j c0407j) {
            Toolbar.this.m3729i();
            if (Toolbar.this.f2917a.getParent() != Toolbar.this) {
                Toolbar.this.addView(Toolbar.this.f2917a);
            }
            Toolbar.this.f2918b = c0407j.getActionView();
            this.f2947b = c0407j;
            if (Toolbar.this.f2918b.getParent() != Toolbar.this) {
                C0458b c0458bGenerateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                c0458bGenerateDefaultLayoutParams.f1900a = 8388611 | (Toolbar.this.f2919c & C0025a.j.AppCompatTheme_windowFixedHeightMajor);
                c0458bGenerateDefaultLayoutParams.f2949b = 2;
                Toolbar.this.f2918b.setLayoutParams(c0458bGenerateDefaultLayoutParams);
                Toolbar.this.addView(Toolbar.this.f2918b);
            }
            Toolbar.this.m3731k();
            Toolbar.this.requestLayout();
            c0407j.m3305e(true);
            if (Toolbar.this.f2918b instanceof InterfaceC0389c) {
                ((InterfaceC0389c) Toolbar.this.f2918b).mo3134a();
            }
            return true;
        }

        @Override // android.support.v7.view.menu.InterfaceC0412o
        /* JADX INFO: renamed from: a */
        public boolean mo177a(SubMenuC0418u subMenuC0418u) {
            return false;
        }

        @Override // android.support.v7.view.menu.InterfaceC0412o
        /* JADX INFO: renamed from: b */
        public int mo178b() {
            return 0;
        }

        @Override // android.support.v7.view.menu.InterfaceC0412o
        /* JADX INFO: renamed from: b */
        public boolean mo182b(C0405h c0405h, C0407j c0407j) {
            if (Toolbar.this.f2918b instanceof InterfaceC0389c) {
                ((InterfaceC0389c) Toolbar.this.f2918b).mo3135b();
            }
            Toolbar.this.removeView(Toolbar.this.f2918b);
            Toolbar.this.removeView(Toolbar.this.f2917a);
            Toolbar.this.f2918b = null;
            Toolbar.this.m3732l();
            this.f2947b = null;
            Toolbar.this.requestLayout();
            c0407j.m3305e(false);
            return true;
        }

        @Override // android.support.v7.view.menu.InterfaceC0412o
        /* JADX INFO: renamed from: c */
        public Parcelable mo183c() {
            return null;
        }
    }

    /* JADX INFO: renamed from: android.support.v7.widget.Toolbar$b */
    public static class C0458b extends AbstractC0344a.a {

        /* JADX INFO: renamed from: b */
        int f2949b;

        public C0458b(int i, int i2) {
            super(i, i2);
            this.f2949b = 0;
            this.f1900a = 8388627;
        }

        public C0458b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2949b = 0;
        }

        public C0458b(AbstractC0344a.a aVar) {
            super(aVar);
            this.f2949b = 0;
        }

        public C0458b(C0458b c0458b) {
            super((AbstractC0344a.a) c0458b);
            this.f2949b = 0;
            this.f2949b = c0458b.f2949b;
        }

        public C0458b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2949b = 0;
        }

        public C0458b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f2949b = 0;
            m3733a(marginLayoutParams);
        }

        /* JADX INFO: renamed from: a */
        void m3733a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.leftMargin = marginLayoutParams.leftMargin;
            this.topMargin = marginLayoutParams.topMargin;
            this.rightMargin = marginLayoutParams.rightMargin;
            this.bottomMargin = marginLayoutParams.bottomMargin;
        }
    }

    /* JADX INFO: renamed from: android.support.v7.widget.Toolbar$c */
    public interface InterfaceC0459c {
        /* JADX INFO: renamed from: a */
        boolean mo2737a(MenuItem menuItem);
    }

    /* JADX INFO: renamed from: android.support.v7.widget.Toolbar$d */
    public static class C0460d extends AbstractC0222a {
        public static final Parcelable.Creator<C0460d> CREATOR = new Parcelable.ClassLoaderCreator<C0460d>() { // from class: android.support.v7.widget.Toolbar.d.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public C0460d createFromParcel(Parcel parcel) {
                return new C0460d(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public C0460d createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0460d(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public C0460d[] newArray(int i) {
                return new C0460d[i];
            }
        };

        /* JADX INFO: renamed from: a */
        int f2950a;

        /* JADX INFO: renamed from: b */
        boolean f2951b;

        public C0460d(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f2950a = parcel.readInt();
            this.f2951b = parcel.readInt() != 0;
        }

        public C0460d(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.support.v4.p019j.AbstractC0222a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f2950a);
            parcel.writeInt(this.f2951b ? 1 : 0);
        }
    }

    public Toolbar(Context context) {
        this(context, null);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0333a.a.toolbarStyle);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2940x = 8388627;
        this.f2906E = new ArrayList<>();
        this.f2907F = new ArrayList<>();
        this.f2908G = new int[2];
        this.f2909H = new ActionMenuView.InterfaceC0430e() { // from class: android.support.v7.widget.Toolbar.1
            @Override // android.support.v7.widget.ActionMenuView.InterfaceC0430e
            /* JADX INFO: renamed from: a */
            public boolean mo3395a(MenuItem menuItem) {
                if (Toolbar.this.f2920d != null) {
                    return Toolbar.this.f2920d.mo2737a(menuItem);
                }
                return false;
            }
        };
        this.f2916O = new Runnable() { // from class: android.support.v7.widget.Toolbar.2
            @Override // java.lang.Runnable
            public void run() {
                Toolbar.this.m3724d();
            }
        };
        C0498bi c0498biM4510a = C0498bi.m4510a(getContext(), attributeSet, C0333a.j.Toolbar, i, 0);
        this.f2930n = c0498biM4510a.m4527g(C0333a.j.Toolbar_titleTextAppearance, 0);
        this.f2931o = c0498biM4510a.m4527g(C0333a.j.Toolbar_subtitleTextAppearance, 0);
        this.f2940x = c0498biM4510a.m4519c(C0333a.j.Toolbar_android_gravity, this.f2940x);
        this.f2919c = c0498biM4510a.m4519c(C0333a.j.Toolbar_buttonGravity, 48);
        int iM4521d = c0498biM4510a.m4521d(C0333a.j.Toolbar_titleMargin, 0);
        iM4521d = c0498biM4510a.m4528g(C0333a.j.Toolbar_titleMargins) ? c0498biM4510a.m4521d(C0333a.j.Toolbar_titleMargins, iM4521d) : iM4521d;
        this.f2936t = iM4521d;
        this.f2935s = iM4521d;
        this.f2934r = iM4521d;
        this.f2933q = iM4521d;
        int iM4521d2 = c0498biM4510a.m4521d(C0333a.j.Toolbar_titleMarginStart, -1);
        if (iM4521d2 >= 0) {
            this.f2933q = iM4521d2;
        }
        int iM4521d3 = c0498biM4510a.m4521d(C0333a.j.Toolbar_titleMarginEnd, -1);
        if (iM4521d3 >= 0) {
            this.f2934r = iM4521d3;
        }
        int iM4521d4 = c0498biM4510a.m4521d(C0333a.j.Toolbar_titleMarginTop, -1);
        if (iM4521d4 >= 0) {
            this.f2935s = iM4521d4;
        }
        int iM4521d5 = c0498biM4510a.m4521d(C0333a.j.Toolbar_titleMarginBottom, -1);
        if (iM4521d5 >= 0) {
            this.f2936t = iM4521d5;
        }
        this.f2932p = c0498biM4510a.m4523e(C0333a.j.Toolbar_maxButtonHeight, -1);
        int iM4521d6 = c0498biM4510a.m4521d(C0333a.j.Toolbar_contentInsetStart, Integer.MIN_VALUE);
        int iM4521d7 = c0498biM4510a.m4521d(C0333a.j.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
        int iM4523e = c0498biM4510a.m4523e(C0333a.j.Toolbar_contentInsetLeft, 0);
        int iM4523e2 = c0498biM4510a.m4523e(C0333a.j.Toolbar_contentInsetRight, 0);
        m3713s();
        this.f2937u.m4449b(iM4523e, iM4523e2);
        if (iM4521d6 != Integer.MIN_VALUE || iM4521d7 != Integer.MIN_VALUE) {
            this.f2937u.m4446a(iM4521d6, iM4521d7);
        }
        this.f2938v = c0498biM4510a.m4521d(C0333a.j.Toolbar_contentInsetStartWithNavigation, Integer.MIN_VALUE);
        this.f2939w = c0498biM4510a.m4521d(C0333a.j.Toolbar_contentInsetEndWithActions, Integer.MIN_VALUE);
        this.f2926j = c0498biM4510a.m4514a(C0333a.j.Toolbar_collapseIcon);
        this.f2927k = c0498biM4510a.m4520c(C0333a.j.Toolbar_collapseContentDescription);
        CharSequence charSequenceM4520c = c0498biM4510a.m4520c(C0333a.j.Toolbar_title);
        if (!TextUtils.isEmpty(charSequenceM4520c)) {
            setTitle(charSequenceM4520c);
        }
        CharSequence charSequenceM4520c2 = c0498biM4510a.m4520c(C0333a.j.Toolbar_subtitle);
        if (!TextUtils.isEmpty(charSequenceM4520c2)) {
            setSubtitle(charSequenceM4520c2);
        }
        this.f2928l = getContext();
        setPopupTheme(c0498biM4510a.m4527g(C0333a.j.Toolbar_popupTheme, 0));
        Drawable drawableM4514a = c0498biM4510a.m4514a(C0333a.j.Toolbar_navigationIcon);
        if (drawableM4514a != null) {
            setNavigationIcon(drawableM4514a);
        }
        CharSequence charSequenceM4520c3 = c0498biM4510a.m4520c(C0333a.j.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(charSequenceM4520c3)) {
            setNavigationContentDescription(charSequenceM4520c3);
        }
        Drawable drawableM4514a2 = c0498biM4510a.m4514a(C0333a.j.Toolbar_logo);
        if (drawableM4514a2 != null) {
            setLogo(drawableM4514a2);
        }
        CharSequence charSequenceM4520c4 = c0498biM4510a.m4520c(C0333a.j.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(charSequenceM4520c4)) {
            setLogoDescription(charSequenceM4520c4);
        }
        if (c0498biM4510a.m4528g(C0333a.j.Toolbar_titleTextColor)) {
            setTitleTextColor(c0498biM4510a.m4517b(C0333a.j.Toolbar_titleTextColor, -1));
        }
        if (c0498biM4510a.m4528g(C0333a.j.Toolbar_subtitleTextColor)) {
            setSubtitleTextColor(c0498biM4510a.m4517b(C0333a.j.Toolbar_subtitleTextColor, -1));
        }
        c0498biM4510a.m4515a();
    }

    /* JADX INFO: renamed from: a */
    private int m3693a(int i) {
        int i2 = i & C0025a.j.AppCompatTheme_windowFixedHeightMajor;
        switch (i2) {
            case 16:
            case 48:
            case 80:
                return i2;
            default:
                return this.f2940x & C0025a.j.AppCompatTheme_windowFixedHeightMajor;
        }
    }

    /* JADX INFO: renamed from: a */
    private int m3694a(View view, int i) {
        int iMax;
        C0458b c0458b = (C0458b) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        switch (m3693a(c0458b.f1900a)) {
            case 48:
                return getPaddingTop() - i2;
            case 80:
                return (((getHeight() - getPaddingBottom()) - measuredHeight) - c0458b.bottomMargin) - i2;
            default:
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                int i3 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
                if (i3 < c0458b.topMargin) {
                    iMax = c0458b.topMargin;
                } else {
                    int i4 = (((height - paddingBottom) - measuredHeight) - i3) - paddingTop;
                    iMax = i4 < c0458b.bottomMargin ? Math.max(0, i3 - (c0458b.bottomMargin - i4)) : i3;
                }
                return iMax + paddingTop;
        }
    }

    /* JADX INFO: renamed from: a */
    private int m3695a(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + iMax + i2, marginLayoutParams.width), getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    /* JADX INFO: renamed from: a */
    private int m3696a(View view, int i, int[] iArr, int i2) {
        C0458b c0458b = (C0458b) view.getLayoutParams();
        int i3 = c0458b.leftMargin - iArr[0];
        int iMax = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int iM3694a = m3694a(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iM3694a, iMax + measuredWidth, view.getMeasuredHeight() + iM3694a);
        return c0458b.rightMargin + measuredWidth + iMax;
    }

    /* JADX INFO: renamed from: a */
    private int m3697a(List<View> list, int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int size = list.size();
        int i3 = 0;
        int measuredWidth = 0;
        int iMax = i2;
        int iMax2 = i;
        while (i3 < size) {
            View view = list.get(i3);
            C0458b c0458b = (C0458b) view.getLayoutParams();
            int i4 = c0458b.leftMargin - iMax2;
            int i5 = c0458b.rightMargin - iMax;
            int iMax3 = Math.max(0, i4);
            int iMax4 = Math.max(0, i5);
            iMax2 = Math.max(0, -i4);
            iMax = Math.max(0, -i5);
            i3++;
            measuredWidth += view.getMeasuredWidth() + iMax3 + iMax4;
        }
        return measuredWidth;
    }

    /* JADX INFO: renamed from: a */
    private void m3698a(View view, int i, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* JADX INFO: renamed from: a */
    private void m3699a(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C0458b c0458bGenerateDefaultLayoutParams = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (C0458b) layoutParams;
        c0458bGenerateDefaultLayoutParams.f2949b = 1;
        if (!z || this.f2918b == null) {
            addView(view, c0458bGenerateDefaultLayoutParams);
        } else {
            view.setLayoutParams(c0458bGenerateDefaultLayoutParams);
            this.f2907F.add(view);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m3700a(List<View> list, int i) {
        boolean z = C0246q.m1759e(this) == 1;
        int childCount = getChildCount();
        int iM1692a = C0233d.m1692a(i, C0246q.m1759e(this));
        list.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                C0458b c0458b = (C0458b) childAt.getLayoutParams();
                if (c0458b.f2949b == 0 && m3701a(childAt) && m3702b(c0458b.f1900a) == iM1692a) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            View childAt2 = getChildAt(i3);
            C0458b c0458b2 = (C0458b) childAt2.getLayoutParams();
            if (c0458b2.f2949b == 0 && m3701a(childAt2) && m3702b(c0458b2.f1900a) == iM1692a) {
                list.add(childAt2);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m3701a(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    private int m3702b(int i) {
        int iM1759e = C0246q.m1759e(this);
        int iM1692a = C0233d.m1692a(i, iM1759e) & 7;
        switch (iM1692a) {
            case 1:
            case 3:
            case 5:
                return iM1692a;
            case 2:
            case 4:
            default:
                return iM1759e == 1 ? 5 : 3;
        }
    }

    /* JADX INFO: renamed from: b */
    private int m3703b(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return C0235f.m1698b(marginLayoutParams) + C0235f.m1697a(marginLayoutParams);
    }

    /* JADX INFO: renamed from: b */
    private int m3704b(View view, int i, int[] iArr, int i2) {
        C0458b c0458b = (C0458b) view.getLayoutParams();
        int i3 = c0458b.rightMargin - iArr[1];
        int iMax = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int iM3694a = m3694a(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iM3694a, iMax, view.getMeasuredHeight() + iM3694a);
        return iMax - (c0458b.leftMargin + measuredWidth);
    }

    /* JADX INFO: renamed from: c */
    private int m3705c(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.bottomMargin + marginLayoutParams.topMargin;
    }

    /* JADX INFO: renamed from: d */
    private boolean m3706d(View view) {
        return view.getParent() == this || this.f2907F.contains(view);
    }

    private MenuInflater getMenuInflater() {
        return new C0393g(getContext());
    }

    /* JADX INFO: renamed from: m */
    private void m3707m() {
        if (this.f2925i == null) {
            this.f2925i = new C0521q(getContext());
        }
    }

    /* JADX INFO: renamed from: n */
    private void m3708n() {
        m3709o();
        if (this.f2921e.m3388d() == null) {
            C0405h c0405h = (C0405h) this.f2921e.getMenu();
            if (this.f2912K == null) {
                this.f2912K = new C0457a();
            }
            this.f2921e.setExpandedActionViewsExclusive(true);
            c0405h.m3252a(this.f2912K, this.f2928l);
        }
    }

    /* JADX INFO: renamed from: o */
    private void m3709o() {
        if (this.f2921e == null) {
            this.f2921e = new ActionMenuView(getContext());
            this.f2921e.setPopupTheme(this.f2929m);
            this.f2921e.setOnMenuItemClickListener(this.f2909H);
            this.f2921e.m3381a(this.f2913L, this.f2914M);
            C0458b c0458bGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            c0458bGenerateDefaultLayoutParams.f1900a = 8388613 | (this.f2919c & C0025a.j.AppCompatTheme_windowFixedHeightMajor);
            this.f2921e.setLayoutParams(c0458bGenerateDefaultLayoutParams);
            m3699a((View) this.f2921e, false);
        }
    }

    /* JADX INFO: renamed from: p */
    private void m3710p() {
        if (this.f2924h == null) {
            this.f2924h = new C0519o(getContext(), null, C0333a.a.toolbarNavigationButtonStyle);
            C0458b c0458bGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            c0458bGenerateDefaultLayoutParams.f1900a = 8388611 | (this.f2919c & C0025a.j.AppCompatTheme_windowFixedHeightMajor);
            this.f2924h.setLayoutParams(c0458bGenerateDefaultLayoutParams);
        }
    }

    /* JADX INFO: renamed from: q */
    private void m3711q() {
        removeCallbacks(this.f2916O);
        post(this.f2916O);
    }

    /* JADX INFO: renamed from: r */
    private boolean m3712r() {
        if (!this.f2915N) {
            return false;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (m3701a(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: s */
    private void m3713s() {
        if (this.f2937u == null) {
            this.f2937u = new C0487ay();
        }
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0458b generateLayoutParams(AttributeSet attributeSet) {
        return new C0458b(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0458b generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0458b ? new C0458b((C0458b) layoutParams) : layoutParams instanceof AbstractC0344a.a ? new C0458b((AbstractC0344a.a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0458b((ViewGroup.MarginLayoutParams) layoutParams) : new C0458b(layoutParams);
    }

    /* JADX INFO: renamed from: a */
    public void m3716a(int i, int i2) {
        m3713s();
        this.f2937u.m4446a(i, i2);
    }

    /* JADX INFO: renamed from: a */
    public void m3717a(Context context, int i) {
        this.f2930n = i;
        if (this.f2922f != null) {
            this.f2922f.setTextAppearance(context, i);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m3718a(C0405h c0405h, C0508d c0508d) {
        if (c0405h == null && this.f2921e == null) {
            return;
        }
        m3709o();
        C0405h c0405hM3388d = this.f2921e.m3388d();
        if (c0405hM3388d != c0405h) {
            if (c0405hM3388d != null) {
                c0405hM3388d.m3261b(this.f2911J);
                c0405hM3388d.m3261b(this.f2912K);
            }
            if (this.f2912K == null) {
                this.f2912K = new C0457a();
            }
            c0508d.m4595d(true);
            if (c0405h != null) {
                c0405h.m3252a(c0508d, this.f2928l);
                c0405h.m3252a(this.f2912K, this.f2928l);
            } else {
                c0508d.mo165a(this.f2928l, (C0405h) null);
                this.f2912K.mo165a(this.f2928l, (C0405h) null);
                c0508d.mo174a(true);
                this.f2912K.mo174a(true);
            }
            this.f2921e.setPopupTheme(this.f2929m);
            this.f2921e.setPresenter(c0508d);
            this.f2911J = c0508d;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m3719a(InterfaceC0412o.a aVar, C0405h.a aVar2) {
        this.f2913L = aVar;
        this.f2914M = aVar2;
        if (this.f2921e != null) {
            this.f2921e.m3381a(aVar, aVar2);
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m3720a() {
        return getVisibility() == 0 && this.f2921e != null && this.f2921e.m3382a();
    }

    /* JADX INFO: renamed from: b */
    public void m3721b(Context context, int i) {
        this.f2931o = i;
        if (this.f2923g != null) {
            this.f2923g.setTextAppearance(context, i);
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m3722b() {
        return this.f2921e != null && this.f2921e.m3391g();
    }

    /* JADX INFO: renamed from: c */
    public boolean m3723c() {
        return this.f2921e != null && this.f2921e.m3392h();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C0458b);
    }

    /* JADX INFO: renamed from: d */
    public boolean m3724d() {
        return this.f2921e != null && this.f2921e.m3389e();
    }

    /* JADX INFO: renamed from: e */
    public boolean m3725e() {
        return this.f2921e != null && this.f2921e.m3390f();
    }

    /* JADX INFO: renamed from: f */
    public void m3726f() {
        if (this.f2921e != null) {
            this.f2921e.m3393i();
        }
    }

    /* JADX INFO: renamed from: g */
    public boolean m3727g() {
        return (this.f2912K == null || this.f2912K.f2947b == null) ? false : true;
    }

    public int getContentInsetEnd() {
        if (this.f2937u != null) {
            return this.f2937u.m4451d();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        return this.f2939w != Integer.MIN_VALUE ? this.f2939w : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        if (this.f2937u != null) {
            return this.f2937u.m4445a();
        }
        return 0;
    }

    public int getContentInsetRight() {
        if (this.f2937u != null) {
            return this.f2937u.m4448b();
        }
        return 0;
    }

    public int getContentInsetStart() {
        if (this.f2937u != null) {
            return this.f2937u.m4450c();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        return this.f2938v != Integer.MIN_VALUE ? this.f2938v : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        C0405h c0405hM3388d;
        boolean z = (this.f2921e == null || (c0405hM3388d = this.f2921e.m3388d()) == null || !c0405hM3388d.hasVisibleItems()) ? false : true;
        return z ? Math.max(getContentInsetEnd(), Math.max(this.f2939w, 0)) : getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        return C0246q.m1759e(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return C0246q.m1759e(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f2938v, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        if (this.f2925i != null) {
            return this.f2925i.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        if (this.f2925i != null) {
            return this.f2925i.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        m3708n();
        return this.f2921e.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        if (this.f2924h != null) {
            return this.f2924h.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        if (this.f2924h != null) {
            return this.f2924h.getDrawable();
        }
        return null;
    }

    C0508d getOuterActionMenuPresenter() {
        return this.f2911J;
    }

    public Drawable getOverflowIcon() {
        m3708n();
        return this.f2921e.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.f2928l;
    }

    public int getPopupTheme() {
        return this.f2929m;
    }

    public CharSequence getSubtitle() {
        return this.f2942z;
    }

    public CharSequence getTitle() {
        return this.f2941y;
    }

    public int getTitleMarginBottom() {
        return this.f2936t;
    }

    public int getTitleMarginEnd() {
        return this.f2934r;
    }

    public int getTitleMarginStart() {
        return this.f2933q;
    }

    public int getTitleMarginTop() {
        return this.f2935s;
    }

    public InterfaceC0468af getWrapper() {
        if (this.f2910I == null) {
            this.f2910I = new C0499bj(this, true);
        }
        return this.f2910I;
    }

    /* JADX INFO: renamed from: h */
    public void m3728h() {
        C0407j c0407j = this.f2912K == null ? null : this.f2912K.f2947b;
        if (c0407j != null) {
            c0407j.collapseActionView();
        }
    }

    /* JADX INFO: renamed from: i */
    void m3729i() {
        if (this.f2917a == null) {
            this.f2917a = new C0519o(getContext(), null, C0333a.a.toolbarNavigationButtonStyle);
            this.f2917a.setImageDrawable(this.f2926j);
            this.f2917a.setContentDescription(this.f2927k);
            C0458b c0458bGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            c0458bGenerateDefaultLayoutParams.f1900a = 8388611 | (this.f2919c & C0025a.j.AppCompatTheme_windowFixedHeightMajor);
            c0458bGenerateDefaultLayoutParams.f2949b = 2;
            this.f2917a.setLayoutParams(c0458bGenerateDefaultLayoutParams);
            this.f2917a.setOnClickListener(new View.OnClickListener() { // from class: android.support.v7.widget.Toolbar.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Toolbar.this.m3728h();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public C0458b generateDefaultLayoutParams() {
        return new C0458b(-2, -2);
    }

    /* JADX INFO: renamed from: k */
    void m3731k() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((C0458b) childAt.getLayoutParams()).f2949b != 2 && childAt != this.f2921e) {
                removeViewAt(childCount);
                this.f2907F.add(childAt);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    void m3732l() {
        for (int size = this.f2907F.size() - 1; size >= 0; size--) {
            addView(this.f2907F.get(size));
        }
        this.f2907F.clear();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f2916O);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f2905D = false;
        }
        if (!this.f2905D) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f2905D = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f2905D = false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iM3704b;
        int iM3696a;
        int iMin;
        int iMax;
        int measuredHeight;
        int paddingTop;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int iMax2;
        boolean z2 = C0246q.m1759e(this) == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i10 = width - paddingRight;
        int[] iArr = this.f2908G;
        iArr[1] = 0;
        iArr[0] = 0;
        int iM1764j = C0246q.m1764j(this);
        int iMin2 = iM1764j >= 0 ? Math.min(iM1764j, i4 - i2) : 0;
        if (!m3701a(this.f2924h)) {
            iM3704b = i10;
            iM3696a = paddingLeft;
        } else if (z2) {
            iM3704b = m3704b(this.f2924h, i10, iArr, iMin2);
            iM3696a = paddingLeft;
        } else {
            iM3696a = m3696a(this.f2924h, paddingLeft, iArr, iMin2);
            iM3704b = i10;
        }
        if (m3701a(this.f2917a)) {
            if (z2) {
                iM3704b = m3704b(this.f2917a, iM3704b, iArr, iMin2);
            } else {
                iM3696a = m3696a(this.f2917a, iM3696a, iArr, iMin2);
            }
        }
        if (m3701a(this.f2921e)) {
            if (z2) {
                iM3696a = m3696a(this.f2921e, iM3696a, iArr, iMin2);
            } else {
                iM3704b = m3704b(this.f2921e, iM3704b, iArr, iMin2);
            }
        }
        int currentContentInsetLeft = getCurrentContentInsetLeft();
        int currentContentInsetRight = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft - iM3696a);
        iArr[1] = Math.max(0, currentContentInsetRight - ((width - paddingRight) - iM3704b));
        int iMax3 = Math.max(iM3696a, currentContentInsetLeft);
        int iMin3 = Math.min(iM3704b, (width - paddingRight) - currentContentInsetRight);
        if (m3701a(this.f2918b)) {
            if (z2) {
                iMin3 = m3704b(this.f2918b, iMin3, iArr, iMin2);
            } else {
                iMax3 = m3696a(this.f2918b, iMax3, iArr, iMin2);
            }
        }
        if (!m3701a(this.f2925i)) {
            iMin = iMin3;
            iMax = iMax3;
        } else if (z2) {
            iMin = m3704b(this.f2925i, iMin3, iArr, iMin2);
            iMax = iMax3;
        } else {
            iMin = iMin3;
            iMax = m3696a(this.f2925i, iMax3, iArr, iMin2);
        }
        boolean zM3701a = m3701a(this.f2922f);
        boolean zM3701a2 = m3701a(this.f2923g);
        int measuredHeight2 = 0;
        if (zM3701a) {
            C0458b c0458b = (C0458b) this.f2922f.getLayoutParams();
            measuredHeight2 = 0 + c0458b.bottomMargin + c0458b.topMargin + this.f2922f.getMeasuredHeight();
        }
        if (zM3701a2) {
            C0458b c0458b2 = (C0458b) this.f2923g.getLayoutParams();
            measuredHeight = c0458b2.bottomMargin + c0458b2.topMargin + this.f2923g.getMeasuredHeight() + measuredHeight2;
        } else {
            measuredHeight = measuredHeight2;
        }
        if (zM3701a || zM3701a2) {
            TextView textView = zM3701a ? this.f2922f : this.f2923g;
            TextView textView2 = zM3701a2 ? this.f2923g : this.f2922f;
            C0458b c0458b3 = (C0458b) textView.getLayoutParams();
            C0458b c0458b4 = (C0458b) textView2.getLayoutParams();
            boolean z3 = (zM3701a && this.f2922f.getMeasuredWidth() > 0) || (zM3701a2 && this.f2923g.getMeasuredWidth() > 0);
            switch (this.f2940x & C0025a.j.AppCompatTheme_windowFixedHeightMajor) {
                case 48:
                    paddingTop = c0458b3.topMargin + getPaddingTop() + this.f2935s;
                    break;
                case 80:
                    paddingTop = (((height - paddingBottom) - c0458b4.bottomMargin) - this.f2936t) - measuredHeight;
                    break;
                default:
                    int i11 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                    if (i11 < c0458b3.topMargin + this.f2935s) {
                        iMax2 = c0458b3.topMargin + this.f2935s;
                    } else {
                        int i12 = (((height - paddingBottom) - measuredHeight) - i11) - paddingTop2;
                        iMax2 = i12 < c0458b3.bottomMargin + this.f2936t ? Math.max(0, i11 - ((c0458b4.bottomMargin + this.f2936t) - i12)) : i11;
                    }
                    paddingTop = paddingTop2 + iMax2;
                    break;
            }
            if (z2) {
                int i13 = (z3 ? this.f2933q : 0) - iArr[1];
                int iMax4 = iMin - Math.max(0, i13);
                iArr[1] = Math.max(0, -i13);
                if (zM3701a) {
                    C0458b c0458b5 = (C0458b) this.f2922f.getLayoutParams();
                    int measuredWidth = iMax4 - this.f2922f.getMeasuredWidth();
                    int measuredHeight3 = this.f2922f.getMeasuredHeight() + paddingTop;
                    this.f2922f.layout(measuredWidth, paddingTop, iMax4, measuredHeight3);
                    int i14 = measuredWidth - this.f2934r;
                    paddingTop = measuredHeight3 + c0458b5.bottomMargin;
                    i8 = i14;
                } else {
                    i8 = iMax4;
                }
                if (zM3701a2) {
                    C0458b c0458b6 = (C0458b) this.f2923g.getLayoutParams();
                    int i15 = c0458b6.topMargin + paddingTop;
                    int measuredWidth2 = iMax4 - this.f2923g.getMeasuredWidth();
                    int measuredHeight4 = this.f2923g.getMeasuredHeight() + i15;
                    this.f2923g.layout(measuredWidth2, i15, iMax4, measuredHeight4);
                    int i16 = iMax4 - this.f2934r;
                    int i17 = c0458b6.bottomMargin + measuredHeight4;
                    i9 = i16;
                } else {
                    i9 = iMax4;
                }
                iMin = z3 ? Math.min(i8, i9) : iMax4;
            } else {
                int i18 = (z3 ? this.f2933q : 0) - iArr[0];
                iMax += Math.max(0, i18);
                iArr[0] = Math.max(0, -i18);
                if (zM3701a) {
                    C0458b c0458b7 = (C0458b) this.f2922f.getLayoutParams();
                    int measuredWidth3 = this.f2922f.getMeasuredWidth() + iMax;
                    int measuredHeight5 = this.f2922f.getMeasuredHeight() + paddingTop;
                    this.f2922f.layout(iMax, paddingTop, measuredWidth3, measuredHeight5);
                    int i19 = measuredWidth3 + this.f2934r;
                    int i20 = c0458b7.bottomMargin + measuredHeight5;
                    i5 = i19;
                    i6 = i20;
                } else {
                    i5 = iMax;
                    i6 = paddingTop;
                }
                if (zM3701a2) {
                    C0458b c0458b8 = (C0458b) this.f2923g.getLayoutParams();
                    int i21 = i6 + c0458b8.topMargin;
                    int measuredWidth4 = this.f2923g.getMeasuredWidth() + iMax;
                    int measuredHeight6 = this.f2923g.getMeasuredHeight() + i21;
                    this.f2923g.layout(iMax, i21, measuredWidth4, measuredHeight6);
                    int i22 = this.f2934r + measuredWidth4;
                    int i23 = c0458b8.bottomMargin + measuredHeight6;
                    i7 = i22;
                } else {
                    i7 = iMax;
                }
                if (z3) {
                    iMax = Math.max(i5, i7);
                }
            }
        }
        m3700a(this.f2906E, 3);
        int size = this.f2906E.size();
        int iM3696a2 = iMax;
        for (int i24 = 0; i24 < size; i24++) {
            iM3696a2 = m3696a(this.f2906E.get(i24), iM3696a2, iArr, iMin2);
        }
        m3700a(this.f2906E, 5);
        int size2 = this.f2906E.size();
        for (int i25 = 0; i25 < size2; i25++) {
            iMin = m3704b(this.f2906E.get(i25), iMin, iArr, iMin2);
        }
        m3700a(this.f2906E, 1);
        int iM3697a = m3697a(this.f2906E, iArr);
        int i26 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (iM3697a / 2);
        int i27 = iM3697a + i26;
        if (i26 < iM3696a2) {
            i26 = iM3696a2;
        } else if (i27 > iMin) {
            i26 -= i27 - iMin;
        }
        int size3 = this.f2906E.size();
        int iM3696a3 = i26;
        for (int i28 = 0; i28 < size3; i28++) {
            iM3696a3 = m3696a(this.f2906E.get(i28), iM3696a3, iArr, iMin2);
        }
        this.f2906E.clear();
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        char c;
        char c2;
        int iCombineMeasuredStates;
        int i3;
        int iMax = 0;
        int iCombineMeasuredStates2 = 0;
        int[] iArr = this.f2908G;
        if (C0506bq.m4582a(this)) {
            c = 0;
            c2 = 1;
        } else {
            c = 1;
            c2 = 0;
        }
        int measuredWidth = 0;
        if (m3701a(this.f2924h)) {
            m3698a(this.f2924h, i, 0, i2, 0, this.f2932p);
            measuredWidth = this.f2924h.getMeasuredWidth() + m3703b(this.f2924h);
            int iMax2 = Math.max(0, this.f2924h.getMeasuredHeight() + m3705c(this.f2924h));
            iCombineMeasuredStates2 = View.combineMeasuredStates(0, this.f2924h.getMeasuredState());
            iMax = iMax2;
        }
        if (m3701a(this.f2917a)) {
            m3698a(this.f2917a, i, 0, i2, 0, this.f2932p);
            measuredWidth = this.f2917a.getMeasuredWidth() + m3703b(this.f2917a);
            iMax = Math.max(iMax, this.f2917a.getMeasuredHeight() + m3705c(this.f2917a));
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f2917a.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = 0 + Math.max(currentContentInsetStart, measuredWidth);
        iArr[c2] = Math.max(0, currentContentInsetStart - measuredWidth);
        int measuredWidth2 = 0;
        if (m3701a(this.f2921e)) {
            m3698a(this.f2921e, i, iMax3, i2, 0, this.f2932p);
            measuredWidth2 = this.f2921e.getMeasuredWidth() + m3703b(this.f2921e);
            iMax = Math.max(iMax, this.f2921e.getMeasuredHeight() + m3705c(this.f2921e));
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f2921e.getMeasuredState());
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax4 = iMax3 + Math.max(currentContentInsetEnd, measuredWidth2);
        iArr[c] = Math.max(0, currentContentInsetEnd - measuredWidth2);
        if (m3701a(this.f2918b)) {
            iMax4 += m3695a(this.f2918b, i, iMax4, i2, 0, iArr);
            iMax = Math.max(iMax, this.f2918b.getMeasuredHeight() + m3705c(this.f2918b));
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f2918b.getMeasuredState());
        }
        if (m3701a(this.f2925i)) {
            iMax4 += m3695a(this.f2925i, i, iMax4, i2, 0, iArr);
            iMax = Math.max(iMax, this.f2925i.getMeasuredHeight() + m3705c(this.f2925i));
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f2925i.getMeasuredState());
        }
        int childCount = getChildCount();
        int i4 = 0;
        int i5 = iMax;
        int iCombineMeasuredStates3 = iCombineMeasuredStates2;
        while (i4 < childCount) {
            View childAt = getChildAt(i4);
            if (((C0458b) childAt.getLayoutParams()).f2949b != 0) {
                iCombineMeasuredStates = iCombineMeasuredStates3;
                i3 = i5;
            } else if (m3701a(childAt)) {
                iMax4 += m3695a(childAt, i, iMax4, i2, 0, iArr);
                int iMax5 = Math.max(i5, childAt.getMeasuredHeight() + m3705c(childAt));
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates3, childAt.getMeasuredState());
                i3 = iMax5;
            } else {
                iCombineMeasuredStates = iCombineMeasuredStates3;
                i3 = i5;
            }
            i4++;
            iCombineMeasuredStates3 = iCombineMeasuredStates;
            i5 = i3;
        }
        int iMax6 = 0;
        int measuredHeight = 0;
        int i6 = this.f2935s + this.f2936t;
        int i7 = this.f2933q + this.f2934r;
        if (m3701a(this.f2922f)) {
            m3695a(this.f2922f, i, iMax4 + i7, i2, i6, iArr);
            iMax6 = m3703b(this.f2922f) + this.f2922f.getMeasuredWidth();
            measuredHeight = this.f2922f.getMeasuredHeight() + m3705c(this.f2922f);
            iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, this.f2922f.getMeasuredState());
        }
        if (m3701a(this.f2923g)) {
            iMax6 = Math.max(iMax6, m3695a(this.f2923g, i, iMax4 + i7, i2, i6 + measuredHeight, iArr));
            measuredHeight += this.f2923g.getMeasuredHeight() + m3705c(this.f2923g);
            iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, this.f2923g.getMeasuredState());
        }
        int iMax7 = Math.max(i5, measuredHeight);
        int paddingLeft = iMax6 + iMax4 + getPaddingLeft() + getPaddingRight();
        int paddingTop = iMax7 + getPaddingTop() + getPaddingBottom();
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i, (-16777216) & iCombineMeasuredStates3);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates3 << 16);
        if (m3712r()) {
            iResolveSizeAndState2 = 0;
        }
        setMeasuredDimension(iResolveSizeAndState, iResolveSizeAndState2);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof C0460d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0460d c0460d = (C0460d) parcelable;
        super.onRestoreInstanceState(c0460d.m1605a());
        C0405h c0405hM3388d = this.f2921e != null ? this.f2921e.m3388d() : null;
        if (c0460d.f2950a != 0 && this.f2912K != null && c0405hM3388d != null && (menuItemFindItem = c0405hM3388d.findItem(c0460d.f2950a)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (c0460d.f2951b) {
            m3711q();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        if (Build.VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(i);
        }
        m3713s();
        this.f2937u.m4447a(i == 1);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        C0460d c0460d = new C0460d(super.onSaveInstanceState());
        if (this.f2912K != null && this.f2912K.f2947b != null) {
            c0460d.f2950a = this.f2912K.f2947b.getItemId();
        }
        c0460d.f2951b = m3722b();
        return c0460d;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f2904C = false;
        }
        if (!this.f2904C) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f2904C = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f2904C = false;
        }
        return true;
    }

    public void setCollapsible(boolean z) {
        this.f2915N = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f2939w) {
            this.f2939w = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f2938v) {
            this.f2938v = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(C0366b.m2790b(getContext(), i));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            m3707m();
            if (!m3706d(this.f2925i)) {
                m3699a((View) this.f2925i, true);
            }
        } else if (this.f2925i != null && m3706d(this.f2925i)) {
            removeView(this.f2925i);
            this.f2907F.remove(this.f2925i);
        }
        if (this.f2925i != null) {
            this.f2925i.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m3707m();
        }
        if (this.f2925i != null) {
            this.f2925i.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m3710p();
        }
        if (this.f2924h != null) {
            this.f2924h.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(C0366b.m2790b(getContext(), i));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m3710p();
            if (!m3706d(this.f2924h)) {
                m3699a((View) this.f2924h, true);
            }
        } else if (this.f2924h != null && m3706d(this.f2924h)) {
            removeView(this.f2924h);
            this.f2907F.remove(this.f2924h);
        }
        if (this.f2924h != null) {
            this.f2924h.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        m3710p();
        this.f2924h.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(InterfaceC0459c interfaceC0459c) {
        this.f2920d = interfaceC0459c;
    }

    public void setOverflowIcon(Drawable drawable) {
        m3708n();
        this.f2921e.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.f2929m != i) {
            this.f2929m = i;
            if (i == 0) {
                this.f2928l = getContext();
            } else {
                this.f2928l = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f2923g == null) {
                Context context = getContext();
                this.f2923g = new C0464ab(context);
                this.f2923g.setSingleLine();
                this.f2923g.setEllipsize(TextUtils.TruncateAt.END);
                if (this.f2931o != 0) {
                    this.f2923g.setTextAppearance(context, this.f2931o);
                }
                if (this.f2903B != 0) {
                    this.f2923g.setTextColor(this.f2903B);
                }
            }
            if (!m3706d(this.f2923g)) {
                m3699a((View) this.f2923g, true);
            }
        } else if (this.f2923g != null && m3706d(this.f2923g)) {
            removeView(this.f2923g);
            this.f2907F.remove(this.f2923g);
        }
        if (this.f2923g != null) {
            this.f2923g.setText(charSequence);
        }
        this.f2942z = charSequence;
    }

    public void setSubtitleTextColor(int i) {
        this.f2903B = i;
        if (this.f2923g != null) {
            this.f2923g.setTextColor(i);
        }
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f2922f == null) {
                Context context = getContext();
                this.f2922f = new C0464ab(context);
                this.f2922f.setSingleLine();
                this.f2922f.setEllipsize(TextUtils.TruncateAt.END);
                if (this.f2930n != 0) {
                    this.f2922f.setTextAppearance(context, this.f2930n);
                }
                if (this.f2902A != 0) {
                    this.f2922f.setTextColor(this.f2902A);
                }
            }
            if (!m3706d(this.f2922f)) {
                m3699a((View) this.f2922f, true);
            }
        } else if (this.f2922f != null && m3706d(this.f2922f)) {
            removeView(this.f2922f);
            this.f2907F.remove(this.f2922f);
        }
        if (this.f2922f != null) {
            this.f2922f.setText(charSequence);
        }
        this.f2941y = charSequence;
    }

    public void setTitleMarginBottom(int i) {
        this.f2936t = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f2934r = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f2933q = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f2935s = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        this.f2902A = i;
        if (this.f2922f != null) {
            this.f2922f.setTextColor(i);
        }
    }
}
