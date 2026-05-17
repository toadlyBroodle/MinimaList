package android.support.v4.p019j.p020a;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: android.support.v4.j.a.c */
/* JADX INFO: loaded from: classes.dex */
public class C0225c {

    /* JADX INFO: renamed from: a */
    private final Object f1318a;

    /* JADX INFO: renamed from: android.support.v4.j.a.c$a */
    static class a extends AccessibilityNodeProvider {

        /* JADX INFO: renamed from: a */
        final C0225c f1319a;

        a(C0225c c0225c) {
            this.f1319a = c0225c;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            C0224b c0224bM1661a = this.f1319a.m1661a(i);
            if (c0224bM1661a == null) {
                return null;
            }
            return c0224bM1661a.m1614a();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            List<C0224b> listM1663a = this.f1319a.m1663a(str, i);
            if (listM1663a == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = listM1663a.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(listM1663a.get(i2).m1614a());
            }
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i, int i2, Bundle bundle) {
            return this.f1319a.m1664a(i, i2, bundle);
        }
    }

    /* JADX INFO: renamed from: android.support.v4.j.a.c$b */
    static class b extends a {
        b(C0225c c0225c) {
            super(c0225c);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i) {
            C0224b c0224bM1665b = this.f1319a.m1665b(i);
            if (c0224bM1665b == null) {
                return null;
            }
            return c0224bM1665b.m1614a();
        }
    }

    public C0225c() {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f1318a = new b(this);
        } else if (Build.VERSION.SDK_INT >= 16) {
            this.f1318a = new a(this);
        } else {
            this.f1318a = null;
        }
    }

    public C0225c(Object obj) {
        this.f1318a = obj;
    }

    /* JADX INFO: renamed from: a */
    public C0224b m1661a(int i) {
        return null;
    }

    /* JADX INFO: renamed from: a */
    public Object m1662a() {
        return this.f1318a;
    }

    /* JADX INFO: renamed from: a */
    public List<C0224b> m1663a(String str, int i) {
        return null;
    }

    /* JADX INFO: renamed from: a */
    public boolean m1664a(int i, int i2, Bundle bundle) {
        return false;
    }

    /* JADX INFO: renamed from: b */
    public C0224b m1665b(int i) {
        return null;
    }
}
