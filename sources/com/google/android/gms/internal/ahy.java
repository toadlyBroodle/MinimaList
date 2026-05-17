package com.google.android.gms.internal;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.C0651a;

/* JADX INFO: loaded from: classes.dex */
public final class ahy {

    /* JADX INFO: renamed from: a */
    private final Context f6810a;

    /* JADX INFO: renamed from: b */
    private final Context f6811b;

    /* JADX INFO: renamed from: c */
    private final Intent f6812c;

    /* JADX INFO: renamed from: d */
    private final aix f6813d;

    public ahy(Intent intent, Context context, Context context2, aix aixVar) {
        this.f6810a = context;
        this.f6811b = context2;
        this.f6812c = intent;
        this.f6813d = aixVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m7972a() {
        try {
            this.f6813d.m8047a(this.f6812c.getData());
            String string = this.f6811b.getResources().getString(C0651a.d.tagmanager_preview_dialog_title);
            String string2 = this.f6811b.getResources().getString(C0651a.d.tagmanager_preview_dialog_message);
            String string3 = this.f6811b.getResources().getString(C0651a.d.tagmanager_preview_dialog_button);
            AlertDialog alertDialogCreate = new AlertDialog.Builder(this.f6810a).create();
            alertDialogCreate.setTitle(string);
            alertDialogCreate.setMessage(string2);
            alertDialogCreate.setButton(-1, string3, new ahz(this));
            alertDialogCreate.show();
        } catch (Exception e) {
            String strValueOf = String.valueOf(e.getMessage());
            ahs.m7942a(strValueOf.length() != 0 ? "Calling preview threw an exception: ".concat(strValueOf) : new String("Calling preview threw an exception: "));
        }
    }
}
