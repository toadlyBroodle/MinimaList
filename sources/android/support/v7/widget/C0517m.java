package android.support.v7.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.support.p003b.p004a.C0014c;
import android.support.p003b.p004a.C0020i;
import android.support.v4.p007b.C0175b;
import android.support.v4.p009c.C0180a;
import android.support.v4.p009c.p010a.C0181a;
import android.support.v4.p018i.C0207a;
import android.support.v4.p018i.C0212f;
import android.support.v4.p018i.C0213g;
import android.support.v4.p018i.C0220n;
import android.support.v7.p022a.C0333a;
import android.support.v7.p023b.p024a.C0366b;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: android.support.v7.widget.m */
/* JADX INFO: loaded from: classes.dex */
public final class C0517m {

    /* JADX INFO: renamed from: b */
    private static C0517m f3618b;

    /* JADX INFO: renamed from: j */
    private WeakHashMap<Context, C0220n<ColorStateList>> f3626j;

    /* JADX INFO: renamed from: k */
    private C0207a<String, c> f3627k;

    /* JADX INFO: renamed from: l */
    private C0220n<String> f3628l;

    /* JADX INFO: renamed from: m */
    private final Object f3629m = new Object();

    /* JADX INFO: renamed from: n */
    private final WeakHashMap<Context, C0212f<WeakReference<Drawable.ConstantState>>> f3630n = new WeakHashMap<>(0);

    /* JADX INFO: renamed from: o */
    private TypedValue f3631o;

    /* JADX INFO: renamed from: p */
    private boolean f3632p;

    /* JADX INFO: renamed from: a */
    private static final PorterDuff.Mode f3617a = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: c */
    private static final b f3619c = new b(6);

    /* JADX INFO: renamed from: d */
    private static final int[] f3620d = {C0333a.e.abc_textfield_search_default_mtrl_alpha, C0333a.e.abc_textfield_default_mtrl_alpha, C0333a.e.abc_ab_share_pack_mtrl_alpha};

    /* JADX INFO: renamed from: e */
    private static final int[] f3621e = {C0333a.e.abc_ic_commit_search_api_mtrl_alpha, C0333a.e.abc_seekbar_tick_mark_material, C0333a.e.abc_ic_menu_share_mtrl_alpha, C0333a.e.abc_ic_menu_copy_mtrl_am_alpha, C0333a.e.abc_ic_menu_cut_mtrl_alpha, C0333a.e.abc_ic_menu_selectall_mtrl_alpha, C0333a.e.abc_ic_menu_paste_mtrl_am_alpha};

    /* JADX INFO: renamed from: f */
    private static final int[] f3622f = {C0333a.e.abc_textfield_activated_mtrl_alpha, C0333a.e.abc_textfield_search_activated_mtrl_alpha, C0333a.e.abc_cab_background_top_mtrl_alpha, C0333a.e.abc_text_cursor_material, C0333a.e.abc_text_select_handle_left_mtrl_dark, C0333a.e.abc_text_select_handle_middle_mtrl_dark, C0333a.e.abc_text_select_handle_right_mtrl_dark, C0333a.e.abc_text_select_handle_left_mtrl_light, C0333a.e.abc_text_select_handle_middle_mtrl_light, C0333a.e.abc_text_select_handle_right_mtrl_light};

    /* JADX INFO: renamed from: g */
    private static final int[] f3623g = {C0333a.e.abc_popup_background_mtrl_mult, C0333a.e.abc_cab_background_internal_bg, C0333a.e.abc_menu_hardkey_panel_mtrl_mult};

    /* JADX INFO: renamed from: h */
    private static final int[] f3624h = {C0333a.e.abc_tab_indicator_material, C0333a.e.abc_textfield_search_material};

    /* JADX INFO: renamed from: i */
    private static final int[] f3625i = {C0333a.e.abc_btn_check_material, C0333a.e.abc_btn_radio_material};

    /* JADX INFO: renamed from: android.support.v7.widget.m$a */
    private static class a implements c {
        a() {
        }

        @Override // android.support.v7.widget.C0517m.c
        /* JADX INFO: renamed from: a */
        public Drawable mo4693a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C0014c.m42a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e);
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: android.support.v7.widget.m$b */
    private static class b extends C0213g<Integer, PorterDuffColorFilter> {
        public b(int i) {
            super(i);
        }

        /* JADX INFO: renamed from: b */
        private static int m4694b(int i, PorterDuff.Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }

        /* JADX INFO: renamed from: a */
        PorterDuffColorFilter m4695a(int i, PorterDuff.Mode mode) {
            return m1550a(Integer.valueOf(m4694b(i, mode)));
        }

        /* JADX INFO: renamed from: a */
        PorterDuffColorFilter m4696a(int i, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return m1551a(Integer.valueOf(m4694b(i, mode)), porterDuffColorFilter);
        }
    }

    /* JADX INFO: renamed from: android.support.v7.widget.m$c */
    private interface c {
        /* JADX INFO: renamed from: a */
        Drawable mo4693a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* JADX INFO: renamed from: android.support.v7.widget.m$d */
    private static class d implements c {
        d() {
        }

        @Override // android.support.v7.widget.C0517m.c
        /* JADX INFO: renamed from: a */
        public Drawable mo4693a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C0020i.m78a(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e);
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static long m4663a(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    /* JADX INFO: renamed from: a */
    static PorterDuff.Mode m4664a(int i) {
        if (i == C0333a.e.abc_switch_thumb_material) {
            return PorterDuff.Mode.MULTIPLY;
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static PorterDuffColorFilter m4665a(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterM4695a = f3619c.m4695a(i, mode);
        if (porterDuffColorFilterM4695a != null) {
            return porterDuffColorFilterM4695a;
        }
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
        f3619c.m4696a(i, mode, porterDuffColorFilter);
        return porterDuffColorFilter;
    }

    /* JADX INFO: renamed from: a */
    private static PorterDuffColorFilter m4666a(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return m4665a(colorStateList.getColorForState(iArr, 0), mode);
    }

    /* JADX INFO: renamed from: a */
    private Drawable m4667a(Context context, int i, boolean z, Drawable drawable) {
        ColorStateList colorStateListM4692b = m4692b(context, i);
        if (colorStateListM4692b != null) {
            if (C0470ah.m3865b(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable drawableM1400f = C0181a.m1400f(drawable);
            C0181a.m1390a(drawableM1400f, colorStateListM4692b);
            PorterDuff.Mode modeM4664a = m4664a(i);
            if (modeM4664a == null) {
                return drawableM1400f;
            }
            C0181a.m1393a(drawableM1400f, modeM4664a);
            return drawableM1400f;
        }
        if (i == C0333a.e.abc_seekbar_track_material) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            m4671a(layerDrawable.findDrawableByLayerId(R.id.background), C0493bd.m4498a(context, C0333a.a.colorControlNormal), f3617a);
            m4671a(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), C0493bd.m4498a(context, C0333a.a.colorControlNormal), f3617a);
            m4671a(layerDrawable.findDrawableByLayerId(R.id.progress), C0493bd.m4498a(context, C0333a.a.colorControlActivated), f3617a);
            return drawable;
        }
        if (i != C0333a.e.abc_ratingbar_material && i != C0333a.e.abc_ratingbar_indicator_material && i != C0333a.e.abc_ratingbar_small_material) {
            if (m4675a(context, i, drawable) || !z) {
                return drawable;
            }
            return null;
        }
        LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
        m4671a(layerDrawable2.findDrawableByLayerId(R.id.background), C0493bd.m4502c(context, C0333a.a.colorControlNormal), f3617a);
        m4671a(layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress), C0493bd.m4498a(context, C0333a.a.colorControlActivated), f3617a);
        m4671a(layerDrawable2.findDrawableByLayerId(R.id.progress), C0493bd.m4498a(context, C0333a.a.colorControlActivated), f3617a);
        return drawable;
    }

    /* JADX INFO: renamed from: a */
    private Drawable m4668a(Context context, long j) {
        synchronized (this.f3629m) {
            C0212f<WeakReference<Drawable.ConstantState>> c0212f = this.f3630n.get(context);
            if (c0212f == null) {
                return null;
            }
            WeakReference<Drawable.ConstantState> weakReferenceM1539a = c0212f.m1539a(j);
            if (weakReferenceM1539a != null) {
                Drawable.ConstantState constantState = weakReferenceM1539a.get();
                if (constantState != null) {
                    return constantState.newDrawable(context.getResources());
                }
                c0212f.m1544b(j);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C0517m m4669a() {
        if (f3618b == null) {
            f3618b = new C0517m();
            m4673a(f3618b);
        }
        return f3618b;
    }

    /* JADX INFO: renamed from: a */
    private void m4670a(Context context, int i, ColorStateList colorStateList) {
        if (this.f3626j == null) {
            this.f3626j = new WeakHashMap<>();
        }
        C0220n<ColorStateList> c0220n = this.f3626j.get(context);
        if (c0220n == null) {
            c0220n = new C0220n<>();
            this.f3626j.put(context, c0220n);
        }
        c0220n.m1595c(i, colorStateList);
    }

    /* JADX INFO: renamed from: a */
    private static void m4671a(Drawable drawable, int i, PorterDuff.Mode mode) {
        if (C0470ah.m3865b(drawable)) {
            drawable = drawable.mutate();
        }
        if (mode == null) {
            mode = f3617a;
        }
        drawable.setColorFilter(m4665a(i, mode));
    }

    /* JADX INFO: renamed from: a */
    static void m4672a(Drawable drawable, C0496bg c0496bg, int[] iArr) {
        if (C0470ah.m3865b(drawable) && drawable.mutate() != drawable) {
            Log.d("AppCompatDrawableManag", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if (c0496bg.f3470d || c0496bg.f3469c) {
            drawable.setColorFilter(m4666a(c0496bg.f3470d ? c0496bg.f3467a : null, c0496bg.f3469c ? c0496bg.f3468b : f3617a, iArr));
        } else {
            drawable.clearColorFilter();
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m4673a(C0517m c0517m) {
        if (Build.VERSION.SDK_INT < 24) {
            c0517m.m4674a("vector", new d());
            c0517m.m4674a("animated-vector", new a());
        }
    }

    /* JADX INFO: renamed from: a */
    private void m4674a(String str, c cVar) {
        if (this.f3627k == null) {
            this.f3627k = new C0207a<>();
        }
        this.f3627k.put(str, cVar);
    }

    /* JADX INFO: renamed from: a */
    static boolean m4675a(Context context, int i, Drawable drawable) {
        int iRound;
        int i2;
        PorterDuff.Mode mode;
        boolean z;
        PorterDuff.Mode mode2 = f3617a;
        if (m4678a(f3620d, i)) {
            i2 = C0333a.a.colorControlNormal;
            mode = mode2;
            z = true;
            iRound = -1;
        } else if (m4678a(f3622f, i)) {
            i2 = C0333a.a.colorControlActivated;
            mode = mode2;
            z = true;
            iRound = -1;
        } else if (m4678a(f3623g, i)) {
            z = true;
            mode = PorterDuff.Mode.MULTIPLY;
            i2 = 16842801;
            iRound = -1;
        } else if (i == C0333a.e.abc_list_divider_mtrl_alpha) {
            i2 = R.attr.colorForeground;
            iRound = Math.round(40.8f);
            mode = mode2;
            z = true;
        } else if (i == C0333a.e.abc_dialog_material_background) {
            i2 = 16842801;
            mode = mode2;
            z = true;
            iRound = -1;
        } else {
            iRound = -1;
            i2 = 0;
            mode = mode2;
            z = false;
        }
        if (!z) {
            return false;
        }
        if (C0470ah.m3865b(drawable)) {
            drawable = drawable.mutate();
        }
        drawable.setColorFilter(m4665a(C0493bd.m4498a(context, i2), mode));
        if (iRound == -1) {
            return true;
        }
        drawable.setAlpha(iRound);
        return true;
    }

    /* JADX INFO: renamed from: a */
    private boolean m4676a(Context context, long j, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            return false;
        }
        synchronized (this.f3629m) {
            C0212f<WeakReference<Drawable.ConstantState>> c0212f = this.f3630n.get(context);
            if (c0212f == null) {
                c0212f = new C0212f<>();
                this.f3630n.put(context, c0212f);
            }
            c0212f.m1545b(j, new WeakReference<>(constantState));
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m4677a(Drawable drawable) {
        return (drawable instanceof C0020i) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    /* JADX INFO: renamed from: a */
    private static boolean m4678a(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    private ColorStateList m4679b(Context context) {
        return m4686f(context, C0493bd.m4498a(context, C0333a.a.colorButtonNormal));
    }

    /* JADX INFO: renamed from: c */
    private ColorStateList m4680c(Context context) {
        return m4686f(context, 0);
    }

    /* JADX INFO: renamed from: c */
    private Drawable m4681c(Context context, int i) {
        if (this.f3631o == null) {
            this.f3631o = new TypedValue();
        }
        TypedValue typedValue = this.f3631o;
        context.getResources().getValue(i, typedValue, true);
        long jM4663a = m4663a(typedValue);
        Drawable drawableM4668a = m4668a(context, jM4663a);
        if (drawableM4668a == null) {
            if (i == C0333a.e.abc_cab_background_top_material) {
                drawableM4668a = new LayerDrawable(new Drawable[]{m4688a(context, C0333a.e.abc_cab_background_internal_bg), m4688a(context, C0333a.e.abc_cab_background_top_mtrl_alpha)});
            }
            if (drawableM4668a != null) {
                drawableM4668a.setChangingConfigurations(typedValue.changingConfigurations);
                m4676a(context, jM4663a, drawableM4668a);
            }
        }
        return drawableM4668a;
    }

    /* JADX INFO: renamed from: d */
    private ColorStateList m4682d(Context context) {
        return m4686f(context, C0493bd.m4498a(context, C0333a.a.colorAccent));
    }

    /* JADX INFO: renamed from: d */
    private Drawable m4683d(Context context, int i) {
        Drawable drawable;
        int next;
        if (this.f3627k == null || this.f3627k.isEmpty()) {
            return null;
        }
        if (this.f3628l != null) {
            String strM1588a = this.f3628l.m1588a(i);
            if ("appcompat_skip_skip".equals(strM1588a) || (strM1588a != null && this.f3627k.get(strM1588a) == null)) {
                return null;
            }
        } else {
            this.f3628l = new C0220n<>();
        }
        if (this.f3631o == null) {
            this.f3631o = new TypedValue();
        }
        TypedValue typedValue = this.f3631o;
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        long jM4663a = m4663a(typedValue);
        Drawable drawableM4668a = m4668a(context, jM4663a);
        if (drawableM4668a != null) {
            return drawableM4668a;
        }
        if (typedValue.string == null || !typedValue.string.toString().endsWith(".xml")) {
            drawable = drawableM4668a;
        } else {
            try {
                XmlResourceParser xml = resources.getXml(i);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f3628l.m1595c(i, name);
                c cVar = this.f3627k.get(name);
                if (cVar != null) {
                    drawableM4668a = cVar.mo4693a(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                if (drawableM4668a != null) {
                    drawableM4668a.setChangingConfigurations(typedValue.changingConfigurations);
                    if (m4676a(context, jM4663a, drawableM4668a)) {
                    }
                }
                drawable = drawableM4668a;
            } catch (Exception e) {
                Log.e("AppCompatDrawableManag", "Exception while inflating drawable", e);
                drawable = drawableM4668a;
            }
        }
        if (drawable != null) {
            return drawable;
        }
        this.f3628l.m1595c(i, "appcompat_skip_skip");
        return drawable;
    }

    /* JADX INFO: renamed from: e */
    private ColorStateList m4684e(Context context) {
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListM4501b = C0493bd.m4501b(context, C0333a.a.colorSwitchThumbNormal);
        if (colorStateListM4501b == null || !colorStateListM4501b.isStateful()) {
            iArr[0] = C0493bd.f3453a;
            iArr2[0] = C0493bd.m4502c(context, C0333a.a.colorSwitchThumbNormal);
            iArr[1] = C0493bd.f3457e;
            iArr2[1] = C0493bd.m4498a(context, C0333a.a.colorControlActivated);
            iArr[2] = C0493bd.f3460h;
            iArr2[2] = C0493bd.m4498a(context, C0333a.a.colorSwitchThumbNormal);
        } else {
            iArr[0] = C0493bd.f3453a;
            iArr2[0] = colorStateListM4501b.getColorForState(iArr[0], 0);
            iArr[1] = C0493bd.f3457e;
            iArr2[1] = C0493bd.m4498a(context, C0333a.a.colorControlActivated);
            iArr[2] = C0493bd.f3460h;
            iArr2[2] = colorStateListM4501b.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    /* JADX INFO: renamed from: e */
    private ColorStateList m4685e(Context context, int i) {
        C0220n<ColorStateList> c0220n;
        if (this.f3626j != null && (c0220n = this.f3626j.get(context)) != null) {
            return c0220n.m1588a(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    private ColorStateList m4686f(Context context, int i) {
        int iM4498a = C0493bd.m4498a(context, C0333a.a.colorControlHighlight);
        return new ColorStateList(new int[][]{C0493bd.f3453a, C0493bd.f3456d, C0493bd.f3454b, C0493bd.f3460h}, new int[]{C0493bd.m4502c(context, C0333a.a.colorButtonNormal), C0180a.m1378a(iM4498a, i), C0180a.m1378a(iM4498a, i), i});
    }

    /* JADX INFO: renamed from: f */
    private void m4687f(Context context) {
        if (this.f3632p) {
            return;
        }
        this.f3632p = true;
        Drawable drawableM4688a = m4688a(context, C0333a.e.abc_vector_test);
        if (drawableM4688a == null || !m4677a(drawableM4688a)) {
            this.f3632p = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    /* JADX INFO: renamed from: a */
    public Drawable m4688a(Context context, int i) {
        return m4689a(context, i, false);
    }

    /* JADX INFO: renamed from: a */
    Drawable m4689a(Context context, int i, boolean z) {
        m4687f(context);
        Drawable drawableM4683d = m4683d(context, i);
        if (drawableM4683d == null) {
            drawableM4683d = m4681c(context, i);
        }
        if (drawableM4683d == null) {
            drawableM4683d = C0175b.m1337a(context, i);
        }
        if (drawableM4683d != null) {
            drawableM4683d = m4667a(context, i, z, drawableM4683d);
        }
        if (drawableM4683d != null) {
            C0470ah.m3864a(drawableM4683d);
        }
        return drawableM4683d;
    }

    /* JADX INFO: renamed from: a */
    Drawable m4690a(Context context, C0503bn c0503bn, int i) {
        Drawable drawableM4683d = m4683d(context, i);
        if (drawableM4683d == null) {
            drawableM4683d = c0503bn.m4553a(i);
        }
        if (drawableM4683d != null) {
            return m4667a(context, i, false, drawableM4683d);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public void m4691a(Context context) {
        synchronized (this.f3629m) {
            C0212f<WeakReference<Drawable.ConstantState>> c0212f = this.f3630n.get(context);
            if (c0212f != null) {
                c0212f.m1548c();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    ColorStateList m4692b(Context context, int i) {
        ColorStateList colorStateListM4685e = m4685e(context, i);
        if (colorStateListM4685e == null) {
            if (i == C0333a.e.abc_edit_text_material) {
                colorStateListM4685e = C0366b.m2787a(context, C0333a.c.abc_tint_edittext);
            } else if (i == C0333a.e.abc_switch_track_mtrl_alpha) {
                colorStateListM4685e = C0366b.m2787a(context, C0333a.c.abc_tint_switch_track);
            } else if (i == C0333a.e.abc_switch_thumb_material) {
                colorStateListM4685e = m4684e(context);
            } else if (i == C0333a.e.abc_btn_default_mtrl_shape) {
                colorStateListM4685e = m4679b(context);
            } else if (i == C0333a.e.abc_btn_borderless_material) {
                colorStateListM4685e = m4680c(context);
            } else if (i == C0333a.e.abc_btn_colored_material) {
                colorStateListM4685e = m4682d(context);
            } else if (i == C0333a.e.abc_spinner_mtrl_am_alpha || i == C0333a.e.abc_spinner_textfield_background_material) {
                colorStateListM4685e = C0366b.m2787a(context, C0333a.c.abc_tint_spinner);
            } else if (m4678a(f3621e, i)) {
                colorStateListM4685e = C0493bd.m4501b(context, C0333a.a.colorControlNormal);
            } else if (m4678a(f3624h, i)) {
                colorStateListM4685e = C0366b.m2787a(context, C0333a.c.abc_tint_default);
            } else if (m4678a(f3625i, i)) {
                colorStateListM4685e = C0366b.m2787a(context, C0333a.c.abc_tint_btn_checkable);
            } else if (i == C0333a.e.abc_seekbar_thumb_material) {
                colorStateListM4685e = C0366b.m2787a(context, C0333a.c.abc_tint_seek_thumb);
            }
            if (colorStateListM4685e != null) {
                m4670a(context, i, colorStateListM4685e);
            }
        }
        return colorStateListM4685e;
    }
}
