package android.support.v7.app;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.p022a.C0333a;
import android.support.v7.view.AbstractC0388b;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: android.support.v7.app.n */
/* JADX INFO: loaded from: classes.dex */
public class DialogC0357n extends Dialog implements InterfaceC0349f {

    /* JADX INFO: renamed from: a */
    private AbstractC0350g f2024a;

    public DialogC0357n(Context context, int i) {
        super(context, m2717a(context, i));
        m2718a().mo2625a((Bundle) null);
        m2718a().mo2643j();
    }

    /* JADX INFO: renamed from: a */
    private static int m2717a(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0333a.a.dialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* JADX INFO: renamed from: a */
    public AbstractC0350g m2718a() {
        if (this.f2024a == null) {
            this.f2024a = AbstractC0350g.m2618a(this, this);
        }
        return this.f2024a;
    }

    @Override // android.support.v7.app.InterfaceC0349f
    /* JADX INFO: renamed from: a */
    public AbstractC0388b mo2605a(AbstractC0388b.a aVar) {
        return null;
    }

    @Override // android.support.v7.app.InterfaceC0349f
    /* JADX INFO: renamed from: a */
    public void mo2607a(AbstractC0388b abstractC0388b) {
    }

    /* JADX INFO: renamed from: a */
    public boolean m2719a(int i) {
        return m2718a().mo2636c(i);
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m2718a().mo2633b(view, layoutParams);
    }

    @Override // android.support.v7.app.InterfaceC0349f
    /* JADX INFO: renamed from: b */
    public void mo2612b(AbstractC0388b abstractC0388b) {
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i) {
        return (T) m2718a().mo2623a(i);
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        m2718a().mo2639f();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        m2718a().mo2642i();
        super.onCreate(bundle);
        m2718a().mo2625a(bundle);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        super.onStop();
        m2718a().mo2637d();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        m2718a().mo2631b(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        m2718a().mo2627a(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m2718a().mo2628a(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        m2718a().mo2629a(getContext().getString(i));
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        m2718a().mo2629a(charSequence);
    }
}
