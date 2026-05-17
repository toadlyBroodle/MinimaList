package com.google.android.gms.common;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.gms.common.internal.C1221aj;

/* JADX INFO: renamed from: com.google.android.gms.common.b */
/* JADX INFO: loaded from: classes.dex */
public class DialogFragmentC1203b extends DialogFragment {

    /* JADX INFO: renamed from: a */
    private Dialog f5824a = null;

    /* JADX INFO: renamed from: b */
    private DialogInterface.OnCancelListener f5825b = null;

    /* JADX INFO: renamed from: a */
    public static DialogFragmentC1203b m7031a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        DialogFragmentC1203b dialogFragmentC1203b = new DialogFragmentC1203b();
        Dialog dialog2 = (Dialog) C1221aj.m7066a(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        dialogFragmentC1203b.f5824a = dialog2;
        if (onCancelListener != null) {
            dialogFragmentC1203b.f5825b = onCancelListener;
        }
        return dialogFragmentC1203b;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        if (this.f5825b != null) {
            this.f5825b.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        if (this.f5824a == null) {
            setShowsDialog(false);
        }
        return this.f5824a;
    }

    @Override // android.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
