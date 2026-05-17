package com.google.android.gms.internal;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.PowerManager;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.C0710au;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class bta implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {

    /* JADX INFO: renamed from: a */
    protected final bsy f8936a;

    /* JADX INFO: renamed from: c */
    private final WeakReference<C1541eu> f8938c;

    /* JADX INFO: renamed from: e */
    private final bup f8940e;

    /* JADX INFO: renamed from: f */
    private final Context f8941f;

    /* JADX INFO: renamed from: g */
    private final WindowManager f8942g;

    /* JADX INFO: renamed from: h */
    private final PowerManager f8943h;

    /* JADX INFO: renamed from: i */
    private final KeyguardManager f8944i;

    /* JADX INFO: renamed from: j */
    private final DisplayMetrics f8945j;

    /* JADX INFO: renamed from: k */
    private btl f8946k;

    /* JADX INFO: renamed from: l */
    private boolean f8947l;

    /* JADX INFO: renamed from: p */
    private boolean f8951p;

    /* JADX INFO: renamed from: r */
    private BroadcastReceiver f8953r;

    /* JADX INFO: renamed from: x */
    private float f8959x;

    /* JADX INFO: renamed from: b */
    private Object f8937b = new Object();

    /* JADX INFO: renamed from: m */
    private boolean f8948m = false;

    /* JADX INFO: renamed from: n */
    private boolean f8949n = false;

    /* JADX INFO: renamed from: s */
    private final HashSet<Object> f8954s = new HashSet<>();

    /* JADX INFO: renamed from: u */
    private final HashSet<btz> f8956u = new HashSet<>();

    /* JADX INFO: renamed from: v */
    private final Rect f8957v = new Rect();

    /* JADX INFO: renamed from: d */
    private WeakReference<ViewTreeObserver> f8939d = new WeakReference<>(null);

    /* JADX INFO: renamed from: o */
    private boolean f8950o = true;

    /* JADX INFO: renamed from: q */
    private boolean f8952q = false;

    /* JADX INFO: renamed from: t */
    private C1647is f8955t = new C1647is(200);

    /* JADX INFO: renamed from: w */
    private final btg f8958w = new btg(this, new Handler());

    public bta(Context context, bxb bxbVar, C1541eu c1541eu, C1670jo c1670jo, bup bupVar) {
        this.f8938c = new WeakReference<>(c1541eu);
        this.f8940e = bupVar;
        this.f8936a = new bsy(UUID.randomUUID().toString(), c1670jo, bxbVar.f9247a, c1541eu.f10543j, c1541eu.m11256a(), bxbVar.f9254h);
        this.f8942g = (WindowManager) context.getSystemService("window");
        this.f8943h = (PowerManager) context.getApplicationContext().getSystemService("power");
        this.f8944i = (KeyguardManager) context.getSystemService("keyguard");
        this.f8941f = context;
        this.f8941f.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this.f8958w);
        this.f8945j = context.getResources().getDisplayMetrics();
        Display defaultDisplay = this.f8942g.getDefaultDisplay();
        this.f8957v.right = defaultDisplay.getWidth();
        this.f8957v.bottom = defaultDisplay.getHeight();
        m10223a();
    }

    /* JADX INFO: renamed from: a */
    private static int m10215a(int i, DisplayMetrics displayMetrics) {
        return (int) (i / displayMetrics.density);
    }

    /* JADX INFO: renamed from: a */
    private final JSONObject m10216a(View view, Boolean bool) throws JSONException {
        if (view == null) {
            return m10221i().put("isAttachedToWindow", false).put("isScreenOn", m10222j()).put("isVisible", false);
        }
        boolean zMo11470a = C0710au.m5571g().mo11470a(view);
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        try {
            view.getLocationOnScreen(iArr);
            view.getLocationInWindow(iArr2);
        } catch (Exception e) {
            C1560fm.m11611b("Failure getting view location.", e);
        }
        Rect rect = new Rect();
        rect.left = iArr[0];
        rect.top = iArr[1];
        rect.right = rect.left + view.getWidth();
        rect.bottom = rect.top + view.getHeight();
        Rect rect2 = new Rect();
        boolean globalVisibleRect = view.getGlobalVisibleRect(rect2, null);
        Rect rect3 = new Rect();
        boolean localVisibleRect = view.getLocalVisibleRect(rect3);
        Rect rect4 = new Rect();
        view.getHitRect(rect4);
        JSONObject jSONObjectM10221i = m10221i();
        jSONObjectM10221i.put("windowVisibility", view.getWindowVisibility()).put("isAttachedToWindow", zMo11470a).put("viewBox", new JSONObject().put("top", m10215a(this.f8957v.top, this.f8945j)).put("bottom", m10215a(this.f8957v.bottom, this.f8945j)).put("left", m10215a(this.f8957v.left, this.f8945j)).put("right", m10215a(this.f8957v.right, this.f8945j))).put("adBox", new JSONObject().put("top", m10215a(rect.top, this.f8945j)).put("bottom", m10215a(rect.bottom, this.f8945j)).put("left", m10215a(rect.left, this.f8945j)).put("right", m10215a(rect.right, this.f8945j))).put("globalVisibleBox", new JSONObject().put("top", m10215a(rect2.top, this.f8945j)).put("bottom", m10215a(rect2.bottom, this.f8945j)).put("left", m10215a(rect2.left, this.f8945j)).put("right", m10215a(rect2.right, this.f8945j))).put("globalVisibleBoxVisible", globalVisibleRect).put("localVisibleBox", new JSONObject().put("top", m10215a(rect3.top, this.f8945j)).put("bottom", m10215a(rect3.bottom, this.f8945j)).put("left", m10215a(rect3.left, this.f8945j)).put("right", m10215a(rect3.right, this.f8945j))).put("localVisibleBoxVisible", localVisibleRect).put("hitBox", new JSONObject().put("top", m10215a(rect4.top, this.f8945j)).put("bottom", m10215a(rect4.bottom, this.f8945j)).put("left", m10215a(rect4.left, this.f8945j)).put("right", m10215a(rect4.right, this.f8945j))).put("screenDensity", this.f8945j.density);
        if (bool == null) {
            bool = Boolean.valueOf(C0710au.m5569e().m11447a(view, this.f8943h, this.f8944i));
        }
        jSONObjectM10221i.put("isVisible", bool.booleanValue());
        return jSONObjectM10221i;
    }

    /* JADX INFO: renamed from: a */
    private static JSONObject m10217a(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }

    /* JADX INFO: renamed from: a */
    private final void m10218a(JSONObject jSONObject, boolean z) {
        try {
            JSONObject jSONObjectM10217a = m10217a(jSONObject);
            ArrayList arrayList = new ArrayList(this.f8956u);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((btz) obj).mo10243a(jSONObjectM10217a, z);
            }
        } catch (Throwable th) {
            C1560fm.m11611b("Skipping active view message.", th);
        }
    }

    /* JADX INFO: renamed from: g */
    private final void m10219g() {
        if (this.f8946k != null) {
            this.f8946k.mo10199a(this);
        }
    }

    /* JADX INFO: renamed from: h */
    private final void m10220h() {
        ViewTreeObserver viewTreeObserver = this.f8939d.get();
        if (viewTreeObserver == null || !viewTreeObserver.isAlive()) {
            return;
        }
        viewTreeObserver.removeOnScrollChangedListener(this);
        viewTreeObserver.removeGlobalOnLayoutListener(this);
    }

    /* JADX INFO: renamed from: i */
    private final JSONObject m10221i() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObjectPut = jSONObject.put("afmaVersion", this.f8936a.m10193b()).put("activeViewJSON", this.f8936a.m10194c()).put("timestamp", C0710au.m5575k().mo7253b()).put("adFormat", this.f8936a.m10192a()).put("hashCode", this.f8936a.m10195d()).put("isMraid", this.f8936a.m10196e()).put("isStopped", this.f8949n).put("isPaused", this.f8948m).put("isNative", this.f8936a.m10197f()).put("isScreenOn", m10222j());
        C0710au.m5569e();
        JSONObject jSONObjectPut2 = jSONObjectPut.put("appMuted", C1596gv.m11419d());
        C0710au.m5569e();
        jSONObjectPut2.put("appVolume", C1596gv.m11413c()).put("deviceVolume", this.f8959x);
        return jSONObject;
    }

    /* JADX INFO: renamed from: j */
    private final boolean m10222j() {
        return Build.VERSION.SDK_INT >= 20 ? this.f8943h.isInteractive() : this.f8943h.isScreenOn();
    }

    /* JADX INFO: renamed from: a */
    public final void m10223a() {
        C0710au.m5569e();
        this.f8959x = C1596gv.m11432j(this.f8941f);
    }

    /* JADX INFO: renamed from: a */
    protected final void m10224a(int i) {
        boolean z;
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2;
        synchronized (this.f8937b) {
            Iterator<btz> it = this.f8956u.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                } else if (it.next().mo10244a()) {
                    z = true;
                    break;
                }
            }
            if (z && this.f8950o) {
                View viewMo10239a = this.f8940e.mo10239a();
                boolean z2 = viewMo10239a != null && C0710au.m5569e().m11447a(viewMo10239a, this.f8943h, this.f8944i);
                boolean z3 = viewMo10239a != null && z2 && viewMo10239a.getGlobalVisibleRect(new Rect(), null);
                if (this.f8940e.mo10240b()) {
                    m10229b();
                    return;
                }
                if (i == 1 && !this.f8955t.m11540a() && z3 == this.f8952q) {
                    return;
                }
                if (z3 || this.f8952q || i != 1) {
                    try {
                        m10218a(m10216a(viewMo10239a, Boolean.valueOf(z2)), false);
                        this.f8952q = z3;
                    } catch (RuntimeException | JSONException e) {
                        C1560fm.m11608a("Active view update failed.", e);
                    }
                    View viewMo10239a2 = this.f8940e.mo10241c().mo10239a();
                    if (viewMo10239a2 != null && (viewTreeObserver2 = viewMo10239a2.getViewTreeObserver()) != (viewTreeObserver = this.f8939d.get())) {
                        m10220h();
                        if (!this.f8947l || (viewTreeObserver != null && viewTreeObserver.isAlive())) {
                            this.f8947l = true;
                            viewTreeObserver2.addOnScrollChangedListener(this);
                            viewTreeObserver2.addOnGlobalLayoutListener(this);
                        }
                        this.f8939d = new WeakReference<>(viewTreeObserver2);
                    }
                    m10219g();
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m10225a(btl btlVar) {
        synchronized (this.f8937b) {
            this.f8946k = btlVar;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m10226a(btz btzVar) {
        if (this.f8956u.isEmpty()) {
            synchronized (this.f8937b) {
                if (this.f8953r == null) {
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.intent.action.SCREEN_ON");
                    intentFilter.addAction("android.intent.action.SCREEN_OFF");
                    this.f8953r = new bte(this);
                    C0710au.m5563C().m11550a(this.f8941f, this.f8953r, intentFilter);
                }
            }
            m10224a(3);
        }
        this.f8956u.add(btzVar);
        try {
            btzVar.mo10243a(m10217a(m10216a(this.f8940e.mo10239a(), (Boolean) null)), false);
        } catch (JSONException e) {
            C1560fm.m11611b("Skipping measurement update for new client.", e);
        }
    }

    /* JADX INFO: renamed from: a */
    final void m10227a(btz btzVar, Map<String, String> map) {
        String strValueOf = String.valueOf(this.f8936a.m10195d());
        C1560fm.m11610b(strValueOf.length() != 0 ? "Received request to untrack: ".concat(strValueOf) : new String("Received request to untrack: "));
        m10230b(btzVar);
    }

    /* JADX INFO: renamed from: a */
    final boolean m10228a(Map<String, String> map) {
        if (map == null) {
            return false;
        }
        String str = map.get("hashCode");
        return !TextUtils.isEmpty(str) && str.equals(this.f8936a.m10195d());
    }

    /* JADX INFO: renamed from: b */
    public final void m10229b() {
        synchronized (this.f8937b) {
            if (this.f8950o) {
                this.f8951p = true;
                try {
                    JSONObject jSONObjectM10221i = m10221i();
                    jSONObjectM10221i.put("doneReasonCode", "u");
                    m10218a(jSONObjectM10221i, true);
                } catch (RuntimeException e) {
                    C1560fm.m11611b("Failure while processing active view data.", e);
                } catch (JSONException e2) {
                    C1560fm.m11611b("JSON failure while processing active view data.", e2);
                }
                String strValueOf = String.valueOf(this.f8936a.m10195d());
                C1560fm.m11610b(strValueOf.length() != 0 ? "Untracking ad unit: ".concat(strValueOf) : new String("Untracking ad unit: "));
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m10230b(btz btzVar) {
        this.f8956u.remove(btzVar);
        btzVar.mo10245b();
        if (this.f8956u.isEmpty()) {
            synchronized (this.f8937b) {
                m10220h();
                synchronized (this.f8937b) {
                    if (this.f8953r != null) {
                        try {
                            try {
                                C0710au.m5563C().m11549a(this.f8941f, this.f8953r);
                            } catch (Exception e) {
                                C0710au.m5573i().m11292a(e, "ActiveViewUnit.stopScreenStatusMonitoring");
                            }
                        } catch (IllegalStateException e2) {
                            C1560fm.m11611b("Failed trying to unregister the receiver", e2);
                        }
                        this.f8953r = null;
                    }
                }
                this.f8941f.getContentResolver().unregisterContentObserver(this.f8958w);
                this.f8950o = false;
                m10219g();
                ArrayList arrayList = new ArrayList(this.f8956u);
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    m10230b((btz) obj);
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    final void m10231b(Map<String, String> map) {
        m10224a(3);
    }

    /* JADX INFO: renamed from: c */
    final void m10232c(Map<String, String> map) {
        if (map.containsKey("isVisible")) {
            if (!"1".equals(map.get("isVisible"))) {
                "true".equals(map.get("isVisible"));
            }
            Iterator<Object> it = this.f8954s.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m10233c() {
        boolean z;
        synchronized (this.f8937b) {
            z = this.f8950o;
        }
        return z;
    }

    /* JADX INFO: renamed from: d */
    public final void m10234d() {
        synchronized (this.f8937b) {
            this.f8949n = true;
            m10224a(3);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m10235e() {
        synchronized (this.f8937b) {
            this.f8948m = true;
            m10224a(3);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m10236f() {
        synchronized (this.f8937b) {
            this.f8948m = false;
            m10224a(3);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        m10224a(2);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        m10224a(1);
    }
}
