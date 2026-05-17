package android.support.v4.p019j.p020a;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: renamed from: android.support.v4.j.a.b */
/* JADX INFO: loaded from: classes.dex */
public class C0224b {

    /* JADX INFO: renamed from: a */
    public int f1283a = -1;

    /* JADX INFO: renamed from: b */
    private final AccessibilityNodeInfo f1284b;

    /* JADX INFO: renamed from: android.support.v4.j.a.b$a */
    public static class a {

        /* JADX INFO: renamed from: A */
        public static final a f1285A;

        /* JADX INFO: renamed from: B */
        public static final a f1286B;

        /* JADX INFO: renamed from: C */
        public static final a f1287C;

        /* JADX INFO: renamed from: D */
        public static final a f1288D;

        /* JADX INFO: renamed from: a */
        public static final a f1289a = new a(1, null);

        /* JADX INFO: renamed from: b */
        public static final a f1290b = new a(2, null);

        /* JADX INFO: renamed from: c */
        public static final a f1291c = new a(4, null);

        /* JADX INFO: renamed from: d */
        public static final a f1292d = new a(8, null);

        /* JADX INFO: renamed from: e */
        public static final a f1293e = new a(16, null);

        /* JADX INFO: renamed from: f */
        public static final a f1294f = new a(32, null);

        /* JADX INFO: renamed from: g */
        public static final a f1295g = new a(64, null);

        /* JADX INFO: renamed from: h */
        public static final a f1296h = new a(128, null);

        /* JADX INFO: renamed from: i */
        public static final a f1297i = new a(256, null);

        /* JADX INFO: renamed from: j */
        public static final a f1298j = new a(512, null);

        /* JADX INFO: renamed from: k */
        public static final a f1299k = new a(1024, null);

        /* JADX INFO: renamed from: l */
        public static final a f1300l = new a(2048, null);

        /* JADX INFO: renamed from: m */
        public static final a f1301m = new a(4096, null);

        /* JADX INFO: renamed from: n */
        public static final a f1302n = new a(8192, null);

        /* JADX INFO: renamed from: o */
        public static final a f1303o = new a(16384, null);

        /* JADX INFO: renamed from: p */
        public static final a f1304p = new a(32768, null);

        /* JADX INFO: renamed from: q */
        public static final a f1305q = new a(65536, null);

        /* JADX INFO: renamed from: r */
        public static final a f1306r = new a(131072, null);

        /* JADX INFO: renamed from: s */
        public static final a f1307s = new a(262144, null);

        /* JADX INFO: renamed from: t */
        public static final a f1308t = new a(524288, null);

        /* JADX INFO: renamed from: u */
        public static final a f1309u = new a(1048576, null);

        /* JADX INFO: renamed from: v */
        public static final a f1310v = new a(2097152, null);

        /* JADX INFO: renamed from: w */
        public static final a f1311w;

        /* JADX INFO: renamed from: x */
        public static final a f1312x;

        /* JADX INFO: renamed from: y */
        public static final a f1313y;

        /* JADX INFO: renamed from: z */
        public static final a f1314z;

        /* JADX INFO: renamed from: E */
        final Object f1315E;

        static {
            f1311w = new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null);
            f1312x = new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null);
            f1313y = new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null);
            f1314z = new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null);
            f1285A = new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null);
            f1286B = new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null);
            f1287C = new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null);
            f1288D = new a(Build.VERSION.SDK_INT >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null);
        }

        public a(int i, CharSequence charSequence) {
            this(Build.VERSION.SDK_INT >= 21 ? new AccessibilityNodeInfo.AccessibilityAction(i, charSequence) : null);
        }

        a(Object obj) {
            this.f1315E = obj;
        }
    }

    /* JADX INFO: renamed from: android.support.v4.j.a.b$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        final Object f1316a;

        b(Object obj) {
            this.f1316a = obj;
        }

        /* JADX INFO: renamed from: a */
        public static b m1659a(int i, int i2, boolean z, int i3) {
            return Build.VERSION.SDK_INT >= 21 ? new b(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z, i3)) : Build.VERSION.SDK_INT >= 19 ? new b(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z)) : new b(null);
        }
    }

    /* JADX INFO: renamed from: android.support.v4.j.a.b$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        final Object f1317a;

        c(Object obj) {
            this.f1317a = obj;
        }

        /* JADX INFO: renamed from: a */
        public static c m1660a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            return Build.VERSION.SDK_INT >= 21 ? new c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2)) : Build.VERSION.SDK_INT >= 19 ? new c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z)) : new c(null);
        }
    }

    private C0224b(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f1284b = accessibilityNodeInfo;
    }

    /* JADX INFO: renamed from: a */
    public static C0224b m1611a(C0224b c0224b) {
        return m1612a(AccessibilityNodeInfo.obtain(c0224b.f1284b));
    }

    /* JADX INFO: renamed from: a */
    public static C0224b m1612a(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new C0224b(accessibilityNodeInfo);
    }

    /* JADX INFO: renamed from: b */
    private static String m1613b(int i) {
        switch (i) {
            case 1:
                return "ACTION_FOCUS";
            case 2:
                return "ACTION_CLEAR_FOCUS";
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            default:
                return "ACTION_UNKNOWN";
        }
    }

    /* JADX INFO: renamed from: a */
    public AccessibilityNodeInfo m1614a() {
        return this.f1284b;
    }

    /* JADX INFO: renamed from: a */
    public void m1615a(int i) {
        this.f1284b.addAction(i);
    }

    /* JADX INFO: renamed from: a */
    public void m1616a(Rect rect) {
        this.f1284b.getBoundsInParent(rect);
    }

    /* JADX INFO: renamed from: a */
    public void m1617a(View view) {
        this.f1284b.setSource(view);
    }

    /* JADX INFO: renamed from: a */
    public void m1618a(CharSequence charSequence) {
        this.f1284b.setPackageName(charSequence);
    }

    /* JADX INFO: renamed from: a */
    public void m1619a(Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f1284b.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) ((b) obj).f1316a);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m1620a(boolean z) {
        this.f1284b.setCheckable(z);
    }

    /* JADX INFO: renamed from: a */
    public boolean m1621a(a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            return this.f1284b.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f1315E);
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public int m1622b() {
        return this.f1284b.getActions();
    }

    /* JADX INFO: renamed from: b */
    public void m1623b(Rect rect) {
        this.f1284b.setBoundsInParent(rect);
    }

    /* JADX INFO: renamed from: b */
    public void m1624b(View view) {
        this.f1284b.addChild(view);
    }

    /* JADX INFO: renamed from: b */
    public void m1625b(CharSequence charSequence) {
        this.f1284b.setClassName(charSequence);
    }

    /* JADX INFO: renamed from: b */
    public void m1626b(Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f1284b.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) ((c) obj).f1317a);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m1627b(boolean z) {
        this.f1284b.setChecked(z);
    }

    /* JADX INFO: renamed from: c */
    public void m1628c(Rect rect) {
        this.f1284b.getBoundsInScreen(rect);
    }

    /* JADX INFO: renamed from: c */
    public void m1629c(View view) {
        this.f1284b.setParent(view);
    }

    /* JADX INFO: renamed from: c */
    public void m1630c(CharSequence charSequence) {
        this.f1284b.setContentDescription(charSequence);
    }

    /* JADX INFO: renamed from: c */
    public void m1631c(boolean z) {
        this.f1284b.setFocusable(z);
    }

    /* JADX INFO: renamed from: c */
    public boolean m1632c() {
        return this.f1284b.isCheckable();
    }

    /* JADX INFO: renamed from: d */
    public void m1633d(Rect rect) {
        this.f1284b.setBoundsInScreen(rect);
    }

    /* JADX INFO: renamed from: d */
    public void m1634d(boolean z) {
        this.f1284b.setFocused(z);
    }

    /* JADX INFO: renamed from: d */
    public boolean m1635d() {
        return this.f1284b.isChecked();
    }

    /* JADX INFO: renamed from: e */
    public void m1636e(boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f1284b.setVisibleToUser(z);
        }
    }

    /* JADX INFO: renamed from: e */
    public boolean m1637e() {
        return this.f1284b.isFocusable();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C0224b c0224b = (C0224b) obj;
            return this.f1284b == null ? c0224b.f1284b == null : this.f1284b.equals(c0224b.f1284b);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public void m1638f(boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f1284b.setAccessibilityFocused(z);
        }
    }

    /* JADX INFO: renamed from: f */
    public boolean m1639f() {
        return this.f1284b.isFocused();
    }

    /* JADX INFO: renamed from: g */
    public void m1640g(boolean z) {
        this.f1284b.setSelected(z);
    }

    /* JADX INFO: renamed from: g */
    public boolean m1641g() {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f1284b.isVisibleToUser();
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public void m1642h(boolean z) {
        this.f1284b.setClickable(z);
    }

    /* JADX INFO: renamed from: h */
    public boolean m1643h() {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f1284b.isAccessibilityFocused();
        }
        return false;
    }

    public int hashCode() {
        if (this.f1284b == null) {
            return 0;
        }
        return this.f1284b.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public void m1644i(boolean z) {
        this.f1284b.setLongClickable(z);
    }

    /* JADX INFO: renamed from: i */
    public boolean m1645i() {
        return this.f1284b.isSelected();
    }

    /* JADX INFO: renamed from: j */
    public void m1646j(boolean z) {
        this.f1284b.setEnabled(z);
    }

    /* JADX INFO: renamed from: j */
    public boolean m1647j() {
        return this.f1284b.isClickable();
    }

    /* JADX INFO: renamed from: k */
    public void m1648k(boolean z) {
        this.f1284b.setScrollable(z);
    }

    /* JADX INFO: renamed from: k */
    public boolean m1649k() {
        return this.f1284b.isLongClickable();
    }

    /* JADX INFO: renamed from: l */
    public boolean m1650l() {
        return this.f1284b.isEnabled();
    }

    /* JADX INFO: renamed from: m */
    public boolean m1651m() {
        return this.f1284b.isPassword();
    }

    /* JADX INFO: renamed from: n */
    public boolean m1652n() {
        return this.f1284b.isScrollable();
    }

    /* JADX INFO: renamed from: o */
    public CharSequence m1653o() {
        return this.f1284b.getPackageName();
    }

    /* JADX INFO: renamed from: p */
    public CharSequence m1654p() {
        return this.f1284b.getClassName();
    }

    /* JADX INFO: renamed from: q */
    public CharSequence m1655q() {
        return this.f1284b.getText();
    }

    /* JADX INFO: renamed from: r */
    public CharSequence m1656r() {
        return this.f1284b.getContentDescription();
    }

    /* JADX INFO: renamed from: s */
    public void m1657s() {
        this.f1284b.recycle();
    }

    /* JADX INFO: renamed from: t */
    public String m1658t() {
        if (Build.VERSION.SDK_INT >= 18) {
            return this.f1284b.getViewIdResourceName();
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        m1616a(rect);
        sb.append("; boundsInParent: " + rect);
        m1628c(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ").append(m1653o());
        sb.append("; className: ").append(m1654p());
        sb.append("; text: ").append(m1655q());
        sb.append("; contentDescription: ").append(m1656r());
        sb.append("; viewId: ").append(m1658t());
        sb.append("; checkable: ").append(m1632c());
        sb.append("; checked: ").append(m1635d());
        sb.append("; focusable: ").append(m1637e());
        sb.append("; focused: ").append(m1639f());
        sb.append("; selected: ").append(m1645i());
        sb.append("; clickable: ").append(m1647j());
        sb.append("; longClickable: ").append(m1649k());
        sb.append("; enabled: ").append(m1650l());
        sb.append("; password: ").append(m1651m());
        sb.append("; scrollable: " + m1652n());
        sb.append("; [");
        int iM1622b = m1622b();
        while (iM1622b != 0) {
            int iNumberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(iM1622b);
            iM1622b &= iNumberOfTrailingZeros ^ (-1);
            sb.append(m1613b(iNumberOfTrailingZeros));
            if (iM1622b != 0) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
