package android.support.v4.p019j;

import android.os.Build;
import android.os.Bundle;
import android.support.v4.p019j.p020a.C0224b;
import android.support.v4.p019j.p020a.C0225c;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;

/* JADX INFO: renamed from: android.support.v4.j.b */
/* JADX INFO: loaded from: classes.dex */
public class C0227b {

    /* JADX INFO: renamed from: a */
    private static final b f1321a;

    /* JADX INFO: renamed from: c */
    private static final View.AccessibilityDelegate f1322c;

    /* JADX INFO: renamed from: b */
    final View.AccessibilityDelegate f1323b = f1321a.mo1677a(this);

    /* JADX INFO: renamed from: android.support.v4.j.b$a */
    static class a extends b {
        a() {
        }

        @Override // android.support.v4.p019j.C0227b.b
        /* JADX INFO: renamed from: a */
        public C0225c mo1676a(View.AccessibilityDelegate accessibilityDelegate, View view) {
            AccessibilityNodeProvider accessibilityNodeProvider = accessibilityDelegate.getAccessibilityNodeProvider(view);
            if (accessibilityNodeProvider != null) {
                return new C0225c(accessibilityNodeProvider);
            }
            return null;
        }

        @Override // android.support.v4.p019j.C0227b.b
        /* JADX INFO: renamed from: a */
        public View.AccessibilityDelegate mo1677a(final C0227b c0227b) {
            return new View.AccessibilityDelegate() { // from class: android.support.v4.j.b.a.1
                @Override // android.view.View.AccessibilityDelegate
                public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                    return c0227b.mo1674c(view, accessibilityEvent);
                }

                @Override // android.view.View.AccessibilityDelegate
                public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
                    C0225c c0225cM1668a = c0227b.m1668a(view);
                    if (c0225cM1668a != null) {
                        return (AccessibilityNodeProvider) c0225cM1668a.m1662a();
                    }
                    return null;
                }

                @Override // android.view.View.AccessibilityDelegate
                public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                    c0227b.mo311a(view, accessibilityEvent);
                }

                @Override // android.view.View.AccessibilityDelegate
                public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                    c0227b.mo157a(view, C0224b.m1612a(accessibilityNodeInfo));
                }

                @Override // android.view.View.AccessibilityDelegate
                public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                    c0227b.m1675d(view, accessibilityEvent);
                }

                @Override // android.view.View.AccessibilityDelegate
                public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
                    return c0227b.mo1672a(viewGroup, view, accessibilityEvent);
                }

                @Override // android.view.View.AccessibilityDelegate
                public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
                    return c0227b.mo1671a(view, i, bundle);
                }

                @Override // android.view.View.AccessibilityDelegate
                public void sendAccessibilityEvent(View view, int i) {
                    c0227b.m1670a(view, i);
                }

                @Override // android.view.View.AccessibilityDelegate
                public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
                    c0227b.m1673b(view, accessibilityEvent);
                }
            };
        }

        @Override // android.support.v4.p019j.C0227b.b
        /* JADX INFO: renamed from: a */
        public boolean mo1678a(View.AccessibilityDelegate accessibilityDelegate, View view, int i, Bundle bundle) {
            return accessibilityDelegate.performAccessibilityAction(view, i, bundle);
        }
    }

    /* JADX INFO: renamed from: android.support.v4.j.b$b */
    static class b {
        b() {
        }

        /* JADX INFO: renamed from: a */
        public C0225c mo1676a(View.AccessibilityDelegate accessibilityDelegate, View view) {
            return null;
        }

        /* JADX INFO: renamed from: a */
        public View.AccessibilityDelegate mo1677a(final C0227b c0227b) {
            return new View.AccessibilityDelegate() { // from class: android.support.v4.j.b.b.1
                @Override // android.view.View.AccessibilityDelegate
                public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                    return c0227b.mo1674c(view, accessibilityEvent);
                }

                @Override // android.view.View.AccessibilityDelegate
                public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                    c0227b.mo311a(view, accessibilityEvent);
                }

                @Override // android.view.View.AccessibilityDelegate
                public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                    c0227b.mo157a(view, C0224b.m1612a(accessibilityNodeInfo));
                }

                @Override // android.view.View.AccessibilityDelegate
                public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                    c0227b.m1675d(view, accessibilityEvent);
                }

                @Override // android.view.View.AccessibilityDelegate
                public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
                    return c0227b.mo1672a(viewGroup, view, accessibilityEvent);
                }

                @Override // android.view.View.AccessibilityDelegate
                public void sendAccessibilityEvent(View view, int i) {
                    c0227b.m1670a(view, i);
                }

                @Override // android.view.View.AccessibilityDelegate
                public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
                    c0227b.m1673b(view, accessibilityEvent);
                }
            };
        }

        /* JADX INFO: renamed from: a */
        public boolean mo1678a(View.AccessibilityDelegate accessibilityDelegate, View view, int i, Bundle bundle) {
            return false;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 16) {
            f1321a = new a();
        } else {
            f1321a = new b();
        }
        f1322c = new View.AccessibilityDelegate();
    }

    /* JADX INFO: renamed from: a */
    public C0225c m1668a(View view) {
        return f1321a.mo1676a(f1322c, view);
    }

    /* JADX INFO: renamed from: a */
    View.AccessibilityDelegate m1669a() {
        return this.f1323b;
    }

    /* JADX INFO: renamed from: a */
    public void m1670a(View view, int i) {
        f1322c.sendAccessibilityEvent(view, i);
    }

    /* JADX INFO: renamed from: a */
    public void mo157a(View view, C0224b c0224b) {
        f1322c.onInitializeAccessibilityNodeInfo(view, c0224b.m1614a());
    }

    /* JADX INFO: renamed from: a */
    public void mo311a(View view, AccessibilityEvent accessibilityEvent) {
        f1322c.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: a */
    public boolean mo1671a(View view, int i, Bundle bundle) {
        return f1321a.mo1678a(f1322c, view, i, bundle);
    }

    /* JADX INFO: renamed from: a */
    public boolean mo1672a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return f1322c.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: b */
    public void m1673b(View view, AccessibilityEvent accessibilityEvent) {
        f1322c.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: c */
    public boolean mo1674c(View view, AccessibilityEvent accessibilityEvent) {
        return f1322c.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: d */
    public void m1675d(View view, AccessibilityEvent accessibilityEvent) {
        f1322c.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }
}
