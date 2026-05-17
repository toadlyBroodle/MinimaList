package android.support.v7.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AlertController;
import android.support.v7.p022a.C0333a;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;

/* JADX INFO: renamed from: android.support.v7.app.d */
/* JADX INFO: loaded from: classes.dex */
public class DialogInterfaceC0347d extends DialogC0357n implements DialogInterface {

    /* JADX INFO: renamed from: a */
    final AlertController f1923a;

    /* JADX INFO: renamed from: android.support.v7.app.d$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private final AlertController.C0339a f1924a;

        /* JADX INFO: renamed from: b */
        private final int f1925b;

        public a(Context context) {
            this(context, DialogInterfaceC0347d.m2589a(context, 0));
        }

        public a(Context context, int i) {
            this.f1924a = new AlertController.C0339a(new ContextThemeWrapper(context, DialogInterfaceC0347d.m2589a(context, i)));
            this.f1925b = i;
        }

        /* JADX INFO: renamed from: a */
        public Context m2590a() {
            return this.f1924a.f1836a;
        }

        /* JADX INFO: renamed from: a */
        public a m2591a(int i) {
            this.f1924a.f1841f = this.f1924a.f1836a.getText(i);
            return this;
        }

        /* JADX INFO: renamed from: a */
        public a m2592a(int i, DialogInterface.OnClickListener onClickListener) {
            this.f1924a.f1844i = this.f1924a.f1836a.getText(i);
            this.f1924a.f1845j = onClickListener;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public a m2593a(DialogInterface.OnKeyListener onKeyListener) {
            this.f1924a.f1853r = onKeyListener;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public a m2594a(Drawable drawable) {
            this.f1924a.f1839d = drawable;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public a m2595a(View view) {
            this.f1924a.f1842g = view;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public a m2596a(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            this.f1924a.f1855t = listAdapter;
            this.f1924a.f1856u = onClickListener;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public a m2597a(CharSequence charSequence) {
            this.f1924a.f1841f = charSequence;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public a m2598b(int i) {
            this.f1924a.f1843h = this.f1924a.f1836a.getText(i);
            return this;
        }

        /* JADX INFO: renamed from: b */
        public a m2599b(int i, DialogInterface.OnClickListener onClickListener) {
            this.f1924a.f1846k = this.f1924a.f1836a.getText(i);
            this.f1924a.f1847l = onClickListener;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public a m2600b(View view) {
            this.f1924a.f1858w = view;
            this.f1924a.f1857v = 0;
            this.f1924a.f1824B = false;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public a m2601b(CharSequence charSequence) {
            this.f1924a.f1843h = charSequence;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public DialogInterfaceC0347d m2602b() {
            DialogInterfaceC0347d dialogInterfaceC0347d = new DialogInterfaceC0347d(this.f1924a.f1836a, this.f1925b);
            this.f1924a.m2541a(dialogInterfaceC0347d.f1923a);
            dialogInterfaceC0347d.setCancelable(this.f1924a.f1850o);
            if (this.f1924a.f1850o) {
                dialogInterfaceC0347d.setCanceledOnTouchOutside(true);
            }
            dialogInterfaceC0347d.setOnCancelListener(this.f1924a.f1851p);
            dialogInterfaceC0347d.setOnDismissListener(this.f1924a.f1852q);
            if (this.f1924a.f1853r != null) {
                dialogInterfaceC0347d.setOnKeyListener(this.f1924a.f1853r);
            }
            return dialogInterfaceC0347d;
        }

        /* JADX INFO: renamed from: c */
        public DialogInterfaceC0347d m2603c() {
            DialogInterfaceC0347d dialogInterfaceC0347dM2602b = m2602b();
            dialogInterfaceC0347dM2602b.show();
            return dialogInterfaceC0347dM2602b;
        }
    }

    protected DialogInterfaceC0347d(Context context, int i) {
        super(context, m2589a(context, i));
        this.f1923a = new AlertController(getContext(), this, getWindow());
    }

    /* JADX INFO: renamed from: a */
    static int m2589a(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0333a.a.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // android.support.v7.app.DialogC0357n, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f1923a.m2526a();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f1923a.m2532a(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.f1923a.m2536b(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.support.v7.app.DialogC0357n, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f1923a.m2531a(charSequence);
    }
}
