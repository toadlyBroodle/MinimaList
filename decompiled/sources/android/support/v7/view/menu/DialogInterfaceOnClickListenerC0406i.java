package android.support.v7.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.support.v7.app.DialogInterfaceC0347d;
import android.support.v7.p022a.C0333a;
import android.support.v7.view.menu.InterfaceC0412o;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

/* JADX INFO: renamed from: android.support.v7.view.menu.i */
/* JADX INFO: loaded from: classes.dex */
class DialogInterfaceOnClickListenerC0406i implements DialogInterface.OnClickListener, DialogInterface.OnDismissListener, DialogInterface.OnKeyListener, InterfaceC0412o.a {

    /* JADX INFO: renamed from: a */
    C0403f f2541a;

    /* JADX INFO: renamed from: b */
    private C0405h f2542b;

    /* JADX INFO: renamed from: c */
    private DialogInterfaceC0347d f2543c;

    /* JADX INFO: renamed from: d */
    private InterfaceC0412o.a f2544d;

    public DialogInterfaceOnClickListenerC0406i(C0405h c0405h) {
        this.f2542b = c0405h;
    }

    /* JADX INFO: renamed from: a */
    public void m3288a() {
        if (this.f2543c != null) {
            this.f2543c.dismiss();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m3289a(IBinder iBinder) {
        C0405h c0405h = this.f2542b;
        DialogInterfaceC0347d.a aVar = new DialogInterfaceC0347d.a(c0405h.m3273e());
        this.f2541a = new C0403f(aVar.m2590a(), C0333a.g.abc_list_menu_item_layout);
        this.f2541a.mo172a(this);
        this.f2542b.m3251a(this.f2541a);
        aVar.m2596a(this.f2541a.m3223d(), this);
        View viewM3284o = c0405h.m3284o();
        if (viewM3284o != null) {
            aVar.m2595a(viewM3284o);
        } else {
            aVar.m2594a(c0405h.m3283n()).m2597a(c0405h.m3282m());
        }
        aVar.m2593a(this);
        this.f2543c = aVar.m2602b();
        this.f2543c.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f2543c.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f2543c.show();
    }

    @Override // android.support.v7.view.menu.InterfaceC0412o.a
    /* JADX INFO: renamed from: a */
    public void mo2706a(C0405h c0405h, boolean z) {
        if (z || c0405h == this.f2542b) {
            m3288a();
        }
        if (this.f2544d != null) {
            this.f2544d.mo2706a(c0405h, z);
        }
    }

    @Override // android.support.v7.view.menu.InterfaceC0412o.a
    /* JADX INFO: renamed from: a */
    public boolean mo2707a(C0405h c0405h) {
        if (this.f2544d != null) {
            return this.f2544d.mo2707a(c0405h);
        }
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.f2542b.m3256a((C0407j) this.f2541a.m3223d().getItem(i), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f2541a.mo170a(this.f2542b, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f2543c.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f2543c.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f2542b.m3262b(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f2542b.performShortcut(i, keyEvent, 0);
    }
}
