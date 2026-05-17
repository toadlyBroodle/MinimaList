package android.support.v7.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.p006a.ActivityC0155k;
import android.support.v4.p006a.C0134a;
import android.support.v4.p006a.C0145ak;
import android.support.v4.p006a.C0170z;
import android.support.v7.app.C0345b;
import android.support.v7.view.AbstractC0388b;
import android.support.v7.widget.C0503bn;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

/* JADX INFO: renamed from: android.support.v7.app.e */
/* JADX INFO: loaded from: classes.dex */
public class ActivityC0348e extends ActivityC0155k implements C0145ak.a, C0345b.b, InterfaceC0349f {

    /* JADX INFO: renamed from: m */
    private AbstractC0350g f1926m;

    /* JADX INFO: renamed from: n */
    private int f1927n = 0;

    /* JADX INFO: renamed from: o */
    private Resources f1928o;

    /* JADX INFO: renamed from: a */
    private boolean m2604a(int i, KeyEvent keyEvent) {
        Window window;
        return (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) ? false : true;
    }

    @Override // android.support.v7.app.InterfaceC0349f
    /* JADX INFO: renamed from: a */
    public AbstractC0388b mo2605a(AbstractC0388b.a aVar) {
        return null;
    }

    /* JADX INFO: renamed from: a */
    public void m2606a(C0145ak c0145ak) {
        c0145ak.m821a((Activity) this);
    }

    @Override // android.support.v7.app.InterfaceC0349f
    /* JADX INFO: renamed from: a */
    public void mo2607a(AbstractC0388b abstractC0388b) {
    }

    /* JADX INFO: renamed from: a */
    public void m2608a(Toolbar toolbar) {
        m2616k().mo2626a(toolbar);
    }

    /* JADX INFO: renamed from: a */
    public boolean m2609a(Intent intent) {
        return C0170z.m1288a(this, intent);
    }

    @Override // android.support.v4.p006a.C0145ak.a
    /* JADX INFO: renamed from: a_ */
    public Intent mo827a_() {
        return C0170z.m1286a(this);
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m2616k().mo2633b(view, layoutParams);
    }

    @Override // android.support.v7.app.C0345b.b
    /* JADX INFO: renamed from: b */
    public C0345b.a mo2585b() {
        return m2616k().mo2641h();
    }

    /* JADX INFO: renamed from: b */
    public void m2610b(Intent intent) {
        C0170z.m1291b(this, intent);
    }

    /* JADX INFO: renamed from: b */
    public void m2611b(C0145ak c0145ak) {
    }

    @Override // android.support.v7.app.InterfaceC0349f
    /* JADX INFO: renamed from: b */
    public void mo2612b(AbstractC0388b abstractC0388b) {
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        AbstractC0344a abstractC0344aM2613h = m2613h();
        if (getWindow().hasFeature(0)) {
            if (abstractC0344aM2613h == null || !abstractC0344aM2613h.mo2561d()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // android.support.v4.p006a.ActivityC0155k
    /* JADX INFO: renamed from: d */
    public void mo1010d() {
        m2616k().mo2639f();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        AbstractC0344a abstractC0344aM2613h = m2613h();
        if (keyCode == 82 && abstractC0344aM2613h != null && abstractC0344aM2613h.mo2555a(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i) {
        return (T) m2616k().mo2623a(i);
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return m2616k().mo2630b();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.f1928o == null && C0503bn.m4552a()) {
            this.f1928o = new C0503bn(this, super.getResources());
        }
        return this.f1928o == null ? super.getResources() : this.f1928o;
    }

    /* JADX INFO: renamed from: h */
    public AbstractC0344a m2613h() {
        return m2616k().mo2622a();
    }

    /* JADX INFO: renamed from: i */
    public boolean m2614i() {
        Intent intentMo827a_ = mo827a_();
        if (intentMo827a_ == null) {
            return false;
        }
        if (m2609a(intentMo827a_)) {
            C0145ak c0145akM818a = C0145ak.m818a((Context) this);
            m2606a(c0145akM818a);
            m2611b(c0145akM818a);
            c0145akM818a.m825a();
            try {
                C0134a.m758a((Activity) this);
            } catch (IllegalStateException e) {
                finish();
            }
        } else {
            m2610b(intentMo827a_);
        }
        return true;
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        m2616k().mo2639f();
    }

    @Deprecated
    /* JADX INFO: renamed from: j */
    public void m2615j() {
    }

    /* JADX INFO: renamed from: k */
    public AbstractC0350g m2616k() {
        if (this.f1926m == null) {
            this.f1926m = AbstractC0350g.m2617a(this, this);
        }
        return this.f1926m;
    }

    @Override // android.support.v4.p006a.ActivityC0155k, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m2616k().mo2624a(configuration);
        if (this.f1928o != null) {
            this.f1928o.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        m2615j();
    }

    @Override // android.support.v4.p006a.ActivityC0155k, android.support.v4.p006a.ActivityC0144aj, android.app.Activity
    protected void onCreate(Bundle bundle) {
        AbstractC0350g abstractC0350gM2616k = m2616k();
        abstractC0350gM2616k.mo2642i();
        abstractC0350gM2616k.mo2625a(bundle);
        if (abstractC0350gM2616k.mo2643j() && this.f1927n != 0) {
            if (Build.VERSION.SDK_INT >= 23) {
                onApplyThemeResource(getTheme(), this.f1927n, false);
            } else {
                setTheme(this.f1927n);
            }
        }
        super.onCreate(bundle);
    }

    @Override // android.support.v4.p006a.ActivityC0155k, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        m2616k().mo2640g();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (m2604a(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.support.v4.p006a.ActivityC0155k, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        AbstractC0344a abstractC0344aM2613h = m2613h();
        if (menuItem.getItemId() != 16908332 || abstractC0344aM2613h == null || (abstractC0344aM2613h.mo2546a() & 4) == 0) {
            return false;
        }
        return m2614i();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    @Override // android.support.v4.p006a.ActivityC0155k, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        m2616k().mo2632b(bundle);
    }

    @Override // android.support.v4.p006a.ActivityC0155k, android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        m2616k().mo2638e();
    }

    @Override // android.support.v4.p006a.ActivityC0155k, android.support.v4.p006a.ActivityC0144aj, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        m2616k().mo2635c(bundle);
    }

    @Override // android.support.v4.p006a.ActivityC0155k, android.app.Activity
    protected void onStart() {
        super.onStart();
        m2616k().mo2634c();
    }

    @Override // android.support.v4.p006a.ActivityC0155k, android.app.Activity
    protected void onStop() {
        super.onStop();
        m2616k().mo2637d();
    }

    @Override // android.app.Activity
    protected void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        m2616k().mo2629a(charSequence);
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        AbstractC0344a abstractC0344aM2613h = m2613h();
        if (getWindow().hasFeature(0)) {
            if (abstractC0344aM2613h == null || !abstractC0344aM2613h.mo2559c()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        m2616k().mo2631b(i);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        m2616k().mo2627a(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m2616k().mo2628a(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        super.setTheme(i);
        this.f1927n = i;
    }
}
