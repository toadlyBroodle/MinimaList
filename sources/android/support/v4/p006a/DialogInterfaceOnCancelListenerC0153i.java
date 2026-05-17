package android.support.v4.p006a;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

/* JADX INFO: renamed from: android.support.v4.a.i */
/* JADX INFO: loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC0153i extends ComponentCallbacksC0154j implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: a */
    int f793a = 0;

    /* JADX INFO: renamed from: b */
    int f794b = 0;

    /* JADX INFO: renamed from: c */
    boolean f795c = true;

    /* JADX INFO: renamed from: d */
    boolean f796d = true;

    /* JADX INFO: renamed from: e */
    int f797e = -1;

    /* JADX INFO: renamed from: f */
    Dialog f798f;

    /* JADX INFO: renamed from: g */
    boolean f799g;

    /* JADX INFO: renamed from: h */
    boolean f800h;

    /* JADX INFO: renamed from: i */
    boolean f801i;

    /* JADX INFO: renamed from: a */
    public int m866a(AbstractC0164t abstractC0164t, String str) {
        this.f800h = false;
        this.f801i = true;
        abstractC0164t.mo838a(this, str);
        this.f799g = false;
        this.f797e = abstractC0164t.mo847b();
        return this.f797e;
    }

    /* JADX INFO: renamed from: a */
    public void m867a(Dialog dialog, int i) {
        switch (i) {
            case 1:
            case 2:
                break;
            case 3:
                dialog.getWindow().addFlags(24);
                break;
            default:
                return;
        }
        dialog.requestWindowFeature(1);
    }

    @Override // android.support.v4.p006a.ComponentCallbacksC0154j
    /* JADX INFO: renamed from: a */
    public void mo868a(Context context) {
        super.mo868a(context);
        if (this.f801i) {
            return;
        }
        this.f800h = false;
    }

    @Override // android.support.v4.p006a.ComponentCallbacksC0154j
    /* JADX INFO: renamed from: a */
    public void mo869a(Bundle bundle) {
        super.mo869a(bundle);
        this.f796d = this.f810G == 0;
        if (bundle != null) {
            this.f793a = bundle.getInt("android:style", 0);
            this.f794b = bundle.getInt("android:theme", 0);
            this.f795c = bundle.getBoolean("android:cancelable", true);
            this.f796d = bundle.getBoolean("android:showsDialog", this.f796d);
            this.f797e = bundle.getInt("android:backStackId", -1);
        }
    }

    /* JADX INFO: renamed from: a */
    public void mo870a(AbstractC0159o abstractC0159o, String str) {
        this.f800h = false;
        this.f801i = true;
        AbstractC0164t abstractC0164tMo1073a = abstractC0159o.mo1073a();
        abstractC0164tMo1073a.mo838a(this, str);
        abstractC0164tMo1073a.mo847b();
    }

    /* JADX INFO: renamed from: a */
    void m871a(boolean z) {
        if (this.f800h) {
            return;
        }
        this.f800h = true;
        this.f801i = false;
        if (this.f798f != null) {
            this.f798f.dismiss();
            this.f798f = null;
        }
        this.f799g = true;
        if (this.f797e >= 0) {
            m973m().mo1074a(this.f797e, 1);
            this.f797e = -1;
            return;
        }
        AbstractC0164t abstractC0164tMo1073a = m973m().mo1073a();
        abstractC0164tMo1073a.mo837a(this);
        if (z) {
            abstractC0164tMo1073a.mo852c();
        } else {
            abstractC0164tMo1073a.mo847b();
        }
    }

    /* JADX INFO: renamed from: b */
    public int m872b() {
        return this.f794b;
    }

    @Override // android.support.v4.p006a.ComponentCallbacksC0154j
    /* JADX INFO: renamed from: b */
    public LayoutInflater mo873b(Bundle bundle) {
        if (!this.f796d) {
            return super.mo873b(bundle);
        }
        this.f798f = mo875c(bundle);
        if (this.f798f == null) {
            return (LayoutInflater) this.f805B.m1063g().getSystemService("layout_inflater");
        }
        m867a(this.f798f, this.f793a);
        return (LayoutInflater) this.f798f.getContext().getSystemService("layout_inflater");
    }

    /* JADX INFO: renamed from: b */
    public void m874b(boolean z) {
        this.f796d = z;
    }

    /* JADX INFO: renamed from: c */
    public Dialog mo875c(Bundle bundle) {
        return new Dialog(m969k(), m872b());
    }

    @Override // android.support.v4.p006a.ComponentCallbacksC0154j
    /* JADX INFO: renamed from: c */
    public void mo876c() {
        super.mo876c();
        if (this.f801i || this.f800h) {
            return;
        }
        this.f800h = true;
    }

    @Override // android.support.v4.p006a.ComponentCallbacksC0154j
    /* JADX INFO: renamed from: d */
    public void mo877d() {
        super.mo877d();
        if (this.f798f != null) {
            this.f799g = false;
            this.f798f.show();
        }
    }

    @Override // android.support.v4.p006a.ComponentCallbacksC0154j
    /* JADX INFO: renamed from: d */
    public void mo878d(Bundle bundle) {
        Bundle bundle2;
        super.mo878d(bundle);
        if (this.f796d) {
            View viewS = m981s();
            if (viewS != null) {
                if (viewS.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
                this.f798f.setContentView(viewS);
            }
            ActivityC0155k activityC0155kK = m969k();
            if (activityC0155kK != null) {
                this.f798f.setOwnerActivity(activityC0155kK);
            }
            this.f798f.setCancelable(this.f795c);
            this.f798f.setOnCancelListener(this);
            this.f798f.setOnDismissListener(this);
            if (bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
                return;
            }
            this.f798f.onRestoreInstanceState(bundle2);
        }
    }

    @Override // android.support.v4.p006a.ComponentCallbacksC0154j
    /* JADX INFO: renamed from: e */
    public void mo879e() {
        super.mo879e();
        if (this.f798f != null) {
            this.f798f.hide();
        }
    }

    @Override // android.support.v4.p006a.ComponentCallbacksC0154j
    /* JADX INFO: renamed from: e */
    public void mo880e(Bundle bundle) {
        Bundle bundleOnSaveInstanceState;
        super.mo880e(bundle);
        if (this.f798f != null && (bundleOnSaveInstanceState = this.f798f.onSaveInstanceState()) != null) {
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        if (this.f793a != 0) {
            bundle.putInt("android:style", this.f793a);
        }
        if (this.f794b != 0) {
            bundle.putInt("android:theme", this.f794b);
        }
        if (!this.f795c) {
            bundle.putBoolean("android:cancelable", this.f795c);
        }
        if (!this.f796d) {
            bundle.putBoolean("android:showsDialog", this.f796d);
        }
        if (this.f797e != -1) {
            bundle.putInt("android:backStackId", this.f797e);
        }
    }

    @Override // android.support.v4.p006a.ComponentCallbacksC0154j
    /* JADX INFO: renamed from: f */
    public void mo881f() {
        super.mo881f();
        if (this.f798f != null) {
            this.f799g = true;
            this.f798f.dismiss();
            this.f798f = null;
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f799g) {
            return;
        }
        m871a(true);
    }
}
