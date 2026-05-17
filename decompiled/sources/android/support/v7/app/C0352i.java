package android.support.v7.app;

import android.content.Context;
import android.support.v7.app.C0355l;
import android.support.v7.app.LayoutInflaterFactory2C0356m;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.Window;
import java.util.List;

/* JADX INFO: renamed from: android.support.v7.app.i */
/* JADX INFO: loaded from: classes.dex */
class C0352i extends C0355l {

    /* JADX INFO: renamed from: android.support.v7.app.i$a */
    class a extends C0355l.a {
        a(Window.Callback callback) {
            super(callback);
        }

        @Override // android.support.v7.view.WindowCallbackC0395i, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            LayoutInflaterFactory2C0356m.d dVarA = C0352i.this.m2686a(0, true);
            if (dVarA == null || dVarA.f2013j == null) {
                super.onProvideKeyboardShortcuts(list, menu, i);
            } else {
                super.onProvideKeyboardShortcuts(list, dVarA.f2013j, i);
            }
        }
    }

    C0352i(Context context, Window window, InterfaceC0349f interfaceC0349f) {
        super(context, window, interfaceC0349f);
    }

    @Override // android.support.v7.app.C0355l, android.support.v7.app.C0354k, android.support.v7.app.AbstractC0351h
    /* JADX INFO: renamed from: a */
    Window.Callback mo2645a(Window.Callback callback) {
        return new a(callback);
    }
}
