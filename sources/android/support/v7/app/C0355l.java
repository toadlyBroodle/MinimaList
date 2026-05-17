package android.support.v7.app;

import android.app.UiModeManager;
import android.content.Context;
import android.support.v7.app.C0354k;
import android.view.ActionMode;
import android.view.Window;

/* JADX INFO: renamed from: android.support.v7.app.l */
/* JADX INFO: loaded from: classes.dex */
class C0355l extends C0354k {

    /* JADX INFO: renamed from: t */
    private final UiModeManager f1964t;

    /* JADX INFO: renamed from: android.support.v7.app.l$a */
    class a extends C0354k.a {
        a(Window.Callback callback) {
            super(callback);
        }

        @Override // android.support.v7.app.C0354k.a, android.support.v7.view.WindowCallbackC0395i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        @Override // android.support.v7.view.WindowCallbackC0395i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            if (C0355l.this.mo2654p()) {
                switch (i) {
                    case 0:
                        return m2665a(callback);
                }
            }
            return super.onWindowStartingActionMode(callback, i);
        }
    }

    C0355l(Context context, Window window, InterfaceC0349f interfaceC0349f) {
        super(context, window, interfaceC0349f);
        this.f1964t = (UiModeManager) context.getSystemService("uimode");
    }

    @Override // android.support.v7.app.C0354k, android.support.v7.app.AbstractC0351h
    /* JADX INFO: renamed from: a */
    Window.Callback mo2645a(Window.Callback callback) {
        return new a(callback);
    }

    @Override // android.support.v7.app.C0354k
    /* JADX INFO: renamed from: d */
    int mo2664d(int i) {
        if (i == 0 && this.f1964t.getNightMode() == 0) {
            return -1;
        }
        return super.mo2664d(i);
    }
}
