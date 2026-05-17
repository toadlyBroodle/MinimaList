package com.google.android.gms.common;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.p006a.AbstractC0159o;
import android.support.v4.p006a.DialogInterfaceOnCancelListenerC0153i;
import com.google.android.gms.common.internal.C1221aj;

/* JADX INFO: renamed from: com.google.android.gms.common.g */
/* JADX INFO: loaded from: classes.dex */
public class C1208g extends DialogInterfaceOnCancelListenerC0153i {

    /* JADX INFO: renamed from: ae */
    private Dialog f5834ae = null;

    /* JADX INFO: renamed from: af */
    private DialogInterface.OnCancelListener f5835af = null;

    /* JADX INFO: renamed from: a */
    public static C1208g m7052a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        C1208g c1208g = new C1208g();
        Dialog dialog2 = (Dialog) C1221aj.m7066a(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        c1208g.f5834ae = dialog2;
        if (onCancelListener != null) {
            c1208g.f5835af = onCancelListener;
        }
        return c1208g;
    }

    @Override // android.support.v4.p006a.DialogInterfaceOnCancelListenerC0153i
    /* JADX INFO: renamed from: a */
    public void mo870a(AbstractC0159o abstractC0159o, String str) {
        super.mo870a(abstractC0159o, str);
    }

    @Override // android.support.v4.p006a.DialogInterfaceOnCancelListenerC0153i
    /* JADX INFO: renamed from: c */
    public Dialog mo875c(Bundle bundle) {
        if (this.f5834ae == null) {
            m874b(false);
        }
        return this.f5834ae;
    }

    @Override // android.support.v4.p006a.DialogInterfaceOnCancelListenerC0153i, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        if (this.f5835af != null) {
            this.f5835af.onCancel(dialogInterface);
        }
    }
}
