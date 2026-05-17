package com.google.android.gms.internal;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.C0710au;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.p043a.BinderC0654c;
import com.google.android.gms.p043a.InterfaceC0652a;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@cnb
public class ccd implements cbz {

    /* JADX INFO: renamed from: a */
    boolean f9782a;

    /* JADX INFO: renamed from: c */
    private final cca f9784c;

    /* JADX INFO: renamed from: d */
    private final Context f9785d;

    /* JADX INFO: renamed from: e */
    private final JSONObject f9786e;

    /* JADX INFO: renamed from: f */
    private final cmh f9787f;

    /* JADX INFO: renamed from: g */
    private final ccb f9788g;

    /* JADX INFO: renamed from: h */
    private final afk f9789h;

    /* JADX INFO: renamed from: i */
    private final C1670jo f9790i;

    /* JADX INFO: renamed from: j */
    private String f9791j;

    /* JADX INFO: renamed from: k */
    private C1531ek f9792k;

    /* JADX INFO: renamed from: b */
    private final Object f9783b = new Object();

    /* JADX INFO: renamed from: l */
    private WeakReference<View> f9793l = null;

    public ccd(Context context, cca ccaVar, cmh cmhVar, afk afkVar, JSONObject jSONObject, ccb ccbVar, C1670jo c1670jo, String str) {
        this.f9785d = context;
        this.f9784c = ccaVar;
        this.f9787f = cmhVar;
        this.f9789h = afkVar;
        this.f9786e = jSONObject;
        this.f9788g = ccbVar;
        this.f9790i = c1670jo;
        this.f9791j = str;
    }

    /* JADX INFO: renamed from: a */
    private final int m10693a(int i) {
        bxm.m10404a();
        return C1657jb.m11570b(this.f9785d, i);
    }

    /* JADX INFO: renamed from: a */
    private final JSONObject m10694a(Rect rect) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", m10693a(rect.right - rect.left));
        jSONObject.put("height", m10693a(rect.bottom - rect.top));
        jSONObject.put("x", m10693a(rect.left));
        jSONObject.put("y", m10693a(rect.top));
        jSONObject.put("relative_to", "self");
        return jSONObject;
    }

    /* JADX INFO: renamed from: a */
    private final JSONObject m10695a(Map<String, WeakReference<View>> map, View view) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        if (map == null || view == null) {
            return jSONObject2;
        }
        int[] iArrM10700d = m10700d(view);
        synchronized (map) {
            for (Map.Entry<String, WeakReference<View>> entry : map.entrySet()) {
                View view2 = entry.getValue().get();
                if (view2 != null) {
                    int[] iArrM10700d2 = m10700d(view2);
                    JSONObject jSONObject3 = new JSONObject();
                    JSONObject jSONObject4 = new JSONObject();
                    try {
                        jSONObject4.put("width", m10693a(view2.getMeasuredWidth()));
                        jSONObject4.put("height", m10693a(view2.getMeasuredHeight()));
                        jSONObject4.put("x", m10693a(iArrM10700d2[0] - iArrM10700d[0]));
                        jSONObject4.put("y", m10693a(iArrM10700d2[1] - iArrM10700d[1]));
                        jSONObject4.put("relative_to", "ad_view");
                        jSONObject3.put("frame", jSONObject4);
                        Rect rect = new Rect();
                        if (view2.getLocalVisibleRect(rect)) {
                            jSONObject = m10694a(rect);
                        } else {
                            jSONObject = new JSONObject();
                            jSONObject.put("width", 0);
                            jSONObject.put("height", 0);
                            jSONObject.put("x", m10693a(iArrM10700d2[0] - iArrM10700d[0]));
                            jSONObject.put("y", m10693a(iArrM10700d2[1] - iArrM10700d[1]));
                            jSONObject.put("relative_to", "ad_view");
                        }
                        jSONObject3.put("visible_bounds", jSONObject);
                        if (view2 instanceof TextView) {
                            TextView textView = (TextView) view2;
                            jSONObject3.put("text_color", textView.getCurrentTextColor());
                            jSONObject3.put("font_size", textView.getTextSize());
                            jSONObject3.put("text", textView.getText());
                        }
                        jSONObject2.put(entry.getKey(), jSONObject3);
                    } catch (JSONException e) {
                        C1560fm.m11615e("Unable to get asset views information");
                    }
                }
            }
        }
        return jSONObject2;
    }

    /* JADX INFO: renamed from: a */
    private final void m10696a(View view, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, JSONObject jSONObject6) {
        C1221aj.m7073b("performClick must be called on the main UI thread.");
        try {
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("ad", this.f9786e);
            if (jSONObject2 != null) {
                jSONObject7.put("asset_view_signal", jSONObject2);
            }
            if (jSONObject != null) {
                jSONObject7.put("ad_view_signal", jSONObject);
            }
            if (jSONObject5 != null) {
                jSONObject7.put("click_signal", jSONObject5);
            }
            if (jSONObject3 != null) {
                jSONObject7.put("scroll_view_signal", jSONObject3);
            }
            if (jSONObject4 != null) {
                jSONObject7.put("lock_screen_signal", jSONObject4);
            }
            JSONObject jSONObject8 = new JSONObject();
            jSONObject8.put("asset_id", str);
            jSONObject8.put("template", this.f9788g.mo10623k());
            C0710au.m5571g();
            jSONObject8.put("is_privileged_process", C1603hb.m11458e());
            jSONObject8.put("has_custom_click_handler", this.f9784c.mo5521b(this.f9788g.mo10624l()) != null);
            jSONObject7.put("has_custom_click_handler", this.f9784c.mo5521b(this.f9788g.mo10624l()) != null);
            try {
                JSONObject jSONObjectOptJSONObject = this.f9786e.optJSONObject("tracking_urls_and_actions");
                if (jSONObjectOptJSONObject == null) {
                    jSONObjectOptJSONObject = new JSONObject();
                }
                jSONObject8.put("click_signals", this.f9789h.m7810a().mo5657a(this.f9785d, jSONObjectOptJSONObject.optString("click_string"), view));
            } catch (Exception e) {
                C1560fm.m11611b("Exception obtaining click signals", e);
            }
            jSONObject7.put("click", jSONObject8);
            if (jSONObject6 != null) {
                jSONObject7.put("provided_signals", jSONObject6);
            }
            jSONObject7.put("ads_id", this.f9791j);
            C1676ju.m11617a(this.f9787f.mo11129b(jSONObject7), "NativeAdEngineImpl.performClick");
        } catch (JSONException e2) {
            C1560fm.m11611b("Unable to create click JSON.", e2);
        }
    }

    /* JADX INFO: renamed from: a */
    private final boolean m10697a(String str) {
        JSONObject jSONObjectOptJSONObject = this.f9786e == null ? null : this.f9786e.optJSONObject("allow_pub_event_reporting");
        if (jSONObjectOptJSONObject == null) {
            return false;
        }
        return jSONObjectOptJSONObject.optBoolean(str, false);
    }

    /* JADX INFO: renamed from: a */
    private final boolean m10698a(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, JSONObject jSONObject5) {
        C1221aj.m7073b("recordImpression must be called on the main UI thread.");
        if (this.f9782a) {
            return true;
        }
        this.f9782a = true;
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.f9786e);
            jSONObject6.put("ads_id", this.f9791j);
            if (jSONObject2 != null) {
                jSONObject6.put("asset_view_signal", jSONObject2);
            }
            if (jSONObject != null) {
                jSONObject6.put("ad_view_signal", jSONObject);
            }
            if (jSONObject3 != null) {
                jSONObject6.put("scroll_view_signal", jSONObject3);
            }
            if (jSONObject4 != null) {
                jSONObject6.put("lock_screen_signal", jSONObject4);
            }
            if (jSONObject5 != null) {
                jSONObject6.put("provided_signals", jSONObject5);
            }
            C1676ju.m11617a(this.f9787f.mo11130c(jSONObject6), "NativeAdEngineImpl.recordImpression");
            this.f9784c.mo5518a(this);
            this.f9784c.m10692z();
            return true;
        } catch (JSONException e) {
            C1560fm.m11611b("Unable to create impression JSON.", e);
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    private static boolean m10699c(View view) {
        return view.isShown() && view.getGlobalVisibleRect(new Rect(), null);
    }

    /* JADX INFO: renamed from: d */
    private static int[] m10700d(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr;
    }

    /* JADX INFO: renamed from: e */
    private final JSONObject m10701e(View view) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        if (view != null) {
            try {
                int[] iArrM10700d = m10700d(view);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("width", m10693a(view.getMeasuredWidth()));
                jSONObject3.put("height", m10693a(view.getMeasuredHeight()));
                jSONObject3.put("x", m10693a(iArrM10700d[0]));
                jSONObject3.put("y", m10693a(iArrM10700d[1]));
                jSONObject3.put("relative_to", "window");
                jSONObject2.put("frame", jSONObject3);
                Rect rect = new Rect();
                if (view.getGlobalVisibleRect(rect)) {
                    jSONObject = m10694a(rect);
                } else {
                    jSONObject = new JSONObject();
                    jSONObject.put("width", 0);
                    jSONObject.put("height", 0);
                    jSONObject.put("x", m10693a(iArrM10700d[0]));
                    jSONObject.put("y", m10693a(iArrM10700d[1]));
                    jSONObject.put("relative_to", "window");
                }
                jSONObject2.put("visible_bounds", jSONObject);
            } catch (Exception e) {
                C1560fm.m11615e("Unable to get native ad view bounding box");
            }
        }
        return jSONObject2;
    }

    /* JADX INFO: renamed from: f */
    private static JSONObject m10702f(View view) {
        JSONObject jSONObject = new JSONObject();
        if (view != null) {
            try {
                C0710au.m5569e();
                jSONObject.put("contained_in_scroll_view", C1596gv.m11417d(view) != -1);
            } catch (Exception e) {
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: g */
    private final JSONObject m10703g(View view) {
        JSONObject jSONObject = new JSONObject();
        if (view != null) {
            try {
                C0710au.m5569e();
                jSONObject.put("can_show_on_lock_screen", C1596gv.m11415c(view));
                C0710au.m5569e();
                jSONObject.put("is_keyguard_locked", C1596gv.m11434l(this.f9785d));
            } catch (JSONException e) {
                C1560fm.m11615e("Unable to get lock screen information");
            }
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.cbz
    /* JADX INFO: renamed from: a */
    public View mo10663a(View.OnClickListener onClickListener, boolean z) {
        cbn cbnVarMo10625m = this.f9788g.mo10625m();
        if (cbnVarMo10625m == null) {
            return null;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        if (!z) {
            switch (cbnVarMo10625m.m10602h()) {
                case 0:
                    layoutParams.addRule(10);
                    layoutParams.addRule(9);
                    break;
                case 1:
                default:
                    layoutParams.addRule(10);
                    layoutParams.addRule(11);
                    break;
                case 2:
                    layoutParams.addRule(12);
                    layoutParams.addRule(11);
                    break;
                case 3:
                    layoutParams.addRule(12);
                    layoutParams.addRule(9);
                    break;
            }
        }
        cbo cboVar = new cbo(this.f9785d, cbnVarMo10625m, layoutParams);
        cboVar.setOnClickListener(onClickListener);
        cboVar.setContentDescription((CharSequence) bxm.m10409f().m10546a(can.f9497bQ));
        return cboVar;
    }

    @Override // com.google.android.gms.internal.cbz
    /* JADX INFO: renamed from: a */
    public final void mo10676a(MotionEvent motionEvent) {
        this.f9789h.m7811a(motionEvent);
    }

    @Override // com.google.android.gms.internal.cbz
    /* JADX INFO: renamed from: a */
    public final void mo10677a(View view) {
        afg afgVarM7810a;
        if (!((Boolean) bxm.m10409f().m10546a(can.f9526bt)).booleanValue() || this.f9789h == null || (afgVarM7810a = this.f9789h.m7810a()) == null) {
            return;
        }
        afgVarM7810a.mo5661a(view);
    }

    @Override // com.google.android.gms.internal.cbz
    /* JADX INFO: renamed from: a */
    public final void mo10678a(View view, cbx cbxVar) {
        if (m10705b(view, cbxVar)) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        ((FrameLayout) view).removeAllViews();
        if (this.f9788g instanceof ccc) {
            ccc cccVar = (ccc) this.f9788g;
            if (cccVar.mo10612b() == null || cccVar.mo10612b().size() <= 0) {
                return;
            }
            Object obj = cccVar.mo10612b().get(0);
            ccy ccyVarM10738a = obj instanceof IBinder ? ccz.m10738a((IBinder) obj) : null;
            if (ccyVarM10738a != null) {
                try {
                    InterfaceC0652a interfaceC0652aMo10604a = ccyVarM10738a.mo10604a();
                    if (interfaceC0652aMo10604a != null) {
                        Drawable drawable = (Drawable) BinderC0654c.m5330a(interfaceC0652aMo10604a);
                        ImageView imageView = new ImageView(this.f9785d);
                        imageView.setImageDrawable(drawable);
                        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                        ((FrameLayout) view).addView(imageView, layoutParams);
                    }
                } catch (RemoteException e) {
                    C1560fm.m11615e("Could not get drawable from image");
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.cbz
    /* JADX INFO: renamed from: a */
    public final void mo10679a(View view, String str, Bundle bundle, Map<String, WeakReference<View>> map, View view2) {
        JSONObject jSONObject;
        JSONObject jSONObjectM11441a;
        JSONObject jSONObjectM10695a = m10695a(map, view2);
        JSONObject jSONObjectM10701e = m10701e(view2);
        JSONObject jSONObjectM10702f = m10702f(view2);
        JSONObject jSONObjectM10703g = m10703g(view2);
        try {
            jSONObjectM11441a = C0710au.m5569e().m11441a(bundle, (JSONObject) null);
            jSONObject = new JSONObject();
        } catch (Exception e) {
            e = e;
            jSONObject = null;
        }
        try {
            jSONObject.put("click_point", jSONObjectM11441a);
            jSONObject.put("asset_id", str);
        } catch (Exception e2) {
            e = e2;
            C1560fm.m11611b("Error occurred while grabbing click signals.", e);
        }
        m10696a(view, jSONObjectM10701e, jSONObjectM10695a, jSONObjectM10702f, jSONObjectM10703g, str, jSONObject, null);
    }

    @Override // com.google.android.gms.internal.cbz
    /* JADX INFO: renamed from: a */
    public void mo10664a(View view, Map<String, WeakReference<View>> map) {
        m10698a(m10701e(view), m10695a(map, view), m10702f(view), m10703g(view), (JSONObject) null);
    }

    @Override // com.google.android.gms.internal.cbz
    /* JADX INFO: renamed from: a */
    public void mo10665a(View view, Map<String, WeakReference<View>> map, Bundle bundle, View view2) {
        C1221aj.m7073b("performClick must be called on the main UI thread.");
        if (map != null) {
            synchronized (map) {
                for (Map.Entry<String, WeakReference<View>> entry : map.entrySet()) {
                    if (view.equals(entry.getValue().get())) {
                        mo10679a(view, entry.getKey(), bundle, map, view2);
                        return;
                    }
                }
            }
        }
        if ("2".equals(this.f9788g.mo10623k())) {
            mo10679a(view, "2099", bundle, map, view2);
        } else if ("1".equals(this.f9788g.mo10623k())) {
            mo10679a(view, "1099", bundle, map, view2);
        }
    }

    /* JADX INFO: renamed from: a */
    public void mo10666a(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        if (((Boolean) bxm.m10409f().m10546a(can.f9495bO)).booleanValue()) {
            view.setOnTouchListener(onTouchListener);
            view.setClickable(true);
            view.setOnClickListener(onClickListener);
            if (map != null) {
                synchronized (map) {
                    Iterator<Map.Entry<String, WeakReference<View>>> it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        View view2 = it.next().getValue().get();
                        if (view2 != null) {
                            view2.setOnTouchListener(onTouchListener);
                            view2.setClickable(true);
                            view2.setOnClickListener(onClickListener);
                        }
                    }
                }
            }
            if (map2 != null) {
                synchronized (map2) {
                    Iterator<Map.Entry<String, WeakReference<View>>> it2 = map2.entrySet().iterator();
                    while (it2.hasNext()) {
                        View view3 = it2.next().getValue().get();
                        if (view3 != null) {
                            view3.setOnTouchListener(onTouchListener);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m10704a(Map<String, WeakReference<View>> map) {
        if (this.f9788g.mo10627o() != null) {
            if ("2".equals(this.f9788g.mo10623k())) {
                C0710au.m5573i().m11284a(this.f9785d, this.f9784c.m10687A(), this.f9788g.mo10623k(), map.containsKey("2011"));
            } else if ("1".equals(this.f9788g.mo10623k())) {
                C0710au.m5573i().m11284a(this.f9785d, this.f9784c.m10687A(), this.f9788g.mo10623k(), map.containsKey("1009"));
            }
        }
    }

    @Override // com.google.android.gms.internal.cbz
    /* JADX INFO: renamed from: a */
    public boolean mo10668a() {
        cbn cbnVarMo10625m = this.f9788g.mo10625m();
        return cbnVarMo10625m != null && cbnVarMo10625m.m10603i();
    }

    @Override // com.google.android.gms.internal.cbz
    /* JADX INFO: renamed from: a */
    public final boolean mo10680a(Bundle bundle) {
        if (m10697a("impression_reporting")) {
            return m10698a((JSONObject) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, C0710au.m5569e().m11441a(bundle, (JSONObject) null));
        }
        C1560fm.m11612c("The ad slot cannot handle external impression events. You must be whitelisted to whitelisted to be able to report your impression events.");
        return false;
    }

    @Override // com.google.android.gms.internal.cbz
    /* JADX INFO: renamed from: b */
    public final void mo10681b(Bundle bundle) {
        if (bundle == null) {
            C1560fm.m11610b("Click data is null. No click is reported.");
        } else if (m10697a("click_reporting")) {
            m10696a(null, null, null, null, null, bundle.getBundle("click_signal").getString("asset_id"), null, C0710au.m5569e().m11441a(bundle, (JSONObject) null));
        } else {
            C1560fm.m11612c("The ad slot cannot handle external click events. You must be whitelisted to be able to report your click events.");
        }
    }

    @Override // com.google.android.gms.internal.cbz
    /* JADX INFO: renamed from: b */
    public final void mo10682b(View view) {
        this.f9793l = new WeakReference<>(view);
    }

    @Override // com.google.android.gms.internal.cbz
    /* JADX INFO: renamed from: b */
    public void mo10669b(View view, Map<String, WeakReference<View>> map) {
        if (((Boolean) bxm.m10409f().m10546a(can.f9494bN)).booleanValue()) {
            return;
        }
        view.setOnTouchListener(null);
        view.setClickable(false);
        view.setOnClickListener(null);
        if (map != null) {
            synchronized (map) {
                Iterator<Map.Entry<String, WeakReference<View>>> it = map.entrySet().iterator();
                while (it.hasNext()) {
                    View view2 = it.next().getValue().get();
                    if (view2 != null) {
                        view2.setOnTouchListener(null);
                        view2.setClickable(false);
                        view2.setOnClickListener(null);
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.cbz
    /* JADX INFO: renamed from: b */
    public boolean mo10670b() {
        return this.f9786e != null && this.f9786e.optBoolean("allow_pub_owned_ad_view", false);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m10705b(View view, cbx cbxVar) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        View viewMo10627o = this.f9788g.mo10627o();
        if (viewMo10627o == null) {
            return false;
        }
        ViewParent parent = viewMo10627o.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(viewMo10627o);
        }
        ((FrameLayout) view).removeAllViews();
        ((FrameLayout) view).addView(viewMo10627o, layoutParams);
        this.f9784c.mo5517a(cbxVar);
        return true;
    }

    @Override // com.google.android.gms.internal.cbz
    /* JADX INFO: renamed from: c */
    public final void mo10683c(Bundle bundle) {
        if (bundle == null) {
            C1560fm.m11610b("Touch event data is null. No touch event is reported.");
            return;
        }
        if (!m10697a("touch_reporting")) {
            C1560fm.m11612c("The ad slot cannot handle external touch events. You must be whitelisted to be able to report your touch events.");
            return;
        }
        this.f9789h.m7810a().mo5659a((int) bundle.getFloat("x"), (int) bundle.getFloat("y"), bundle.getInt("duration_ms"));
    }

    @Override // com.google.android.gms.internal.cbz
    /* JADX INFO: renamed from: c */
    public final void mo10684c(View view, Map<String, WeakReference<View>> map) {
        synchronized (this.f9783b) {
            if (this.f9782a) {
                return;
            }
            if (m10699c(view)) {
                mo10664a(view, map);
                return;
            }
            if (((Boolean) bxm.m10409f().m10546a(can.f9502bV)).booleanValue() && map != null) {
                synchronized (map) {
                    Iterator<Map.Entry<String, WeakReference<View>>> it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        View view2 = it.next().getValue().get();
                        if (view2 != null && m10699c(view2)) {
                            mo10664a(view, map);
                            return;
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public InterfaceC1758mv mo10673e() {
        if (this.f9786e == null || this.f9786e.optJSONObject("overlay") == null) {
            return null;
        }
        C1769nf c1769nfM5570f = C0710au.m5570f();
        Context context = this.f9785d;
        bxb bxbVarM10381a = bxb.m10381a(this.f9785d);
        InterfaceC1758mv interfaceC1758mvM11878a = c1769nfM5570f.m11878a(context, C1807oq.m11927a(bxbVarM10381a), bxbVarM10381a.f9247a, false, false, this.f9789h, this.f9790i, null, null, null, bwf.m10352a());
        if (interfaceC1758mvM11878a == 0) {
            return interfaceC1758mvM11878a;
        }
        if (interfaceC1758mvM11878a == 0) {
            throw null;
        }
        ((View) interfaceC1758mvM11878a).setVisibility(8);
        new ccf(interfaceC1758mvM11878a).m10710a(this.f9787f);
        return interfaceC1758mvM11878a;
    }

    @Override // com.google.android.gms.internal.cbz
    /* JADX INFO: renamed from: f */
    public void mo10674f() {
        this.f9787f.mo11127a();
    }

    @Override // com.google.android.gms.internal.cbz
    /* JADX INFO: renamed from: g */
    public void mo10675g() {
        this.f9784c.mo5510K();
    }

    @Override // com.google.android.gms.internal.cbz
    /* JADX INFO: renamed from: h */
    public final View mo10685h() {
        if (this.f9793l != null) {
            return this.f9793l.get();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.cbz
    /* JADX INFO: renamed from: i */
    public final Context mo10686i() {
        return this.f9785d;
    }

    /* JADX INFO: renamed from: j */
    public final C1531ek m10706j() {
        if (!C0710au.m5590z().m11240c(this.f9785d)) {
            return null;
        }
        if (this.f9792k == null) {
            this.f9792k = new C1531ek(this.f9785d, this.f9784c.m10687A());
        }
        return this.f9792k;
    }
}
