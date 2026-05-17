package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.view.View;
import com.google.android.gms.p043a.AbstractC0655d;
import com.google.android.gms.p043a.BinderC0654c;
import com.google.android.gms.p043a.C0656e;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.aq */
/* JADX INFO: loaded from: classes.dex */
public final class C1228aq extends AbstractC0655d<InterfaceC1215ad> {

    /* JADX INFO: renamed from: a */
    private static final C1228aq f5858a = new C1228aq();

    private C1228aq() {
        super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
    }

    /* JADX INFO: renamed from: a */
    public static View m7082a(Context context, int i, int i2) {
        return f5858a.m7083b(context, i, i2);
    }

    /* JADX INFO: renamed from: b */
    private final View m7083b(Context context, int i, int i2) throws C0656e {
        try {
            C1226ao c1226ao = new C1226ao(i, i2, null);
            return (View) BinderC0654c.m5330a(m5331a(context).mo7058a(BinderC0654c.m5329a(context), c1226ao));
        } catch (Exception e) {
            throw new C0656e(new StringBuilder(64).append("Could not get button with size ").append(i).append(" and color ").append(i2).toString(), e);
        }
    }

    @Override // com.google.android.gms.p043a.AbstractC0655d
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC1215ad mo5332a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
        return iInterfaceQueryLocalInterface instanceof InterfaceC1215ad ? (InterfaceC1215ad) iInterfaceQueryLocalInterface : new C1216ae(iBinder);
    }
}
