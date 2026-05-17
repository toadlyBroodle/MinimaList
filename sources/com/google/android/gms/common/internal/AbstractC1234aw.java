package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.common.C1071a;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.aw */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1234aw extends AbstractC1239ba<Boolean> {

    /* JADX INFO: renamed from: a */
    private int f5888a;

    /* JADX INFO: renamed from: b */
    private Bundle f5889b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ AbstractC1233av f5890c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected AbstractC1234aw(AbstractC1233av abstractC1233av, int i, Bundle bundle) {
        super(abstractC1233av, true);
        this.f5890c = abstractC1233av;
        this.f5888a = i;
        this.f5889b = bundle;
    }

    /* JADX INFO: renamed from: a */
    protected abstract void mo7133a(C1071a c1071a);

    @Override // com.google.android.gms.common.internal.AbstractC1239ba
    /* JADX INFO: renamed from: a */
    protected final /* synthetic */ void mo7134a(Boolean bool) {
        if (bool == null) {
            this.f5890c.m7092a(1, (IInterface) null);
            return;
        }
        switch (this.f5888a) {
            case 0:
                if (mo7135a()) {
                    return;
                }
                this.f5890c.m7092a(1, (IInterface) null);
                mo7133a(new C1071a(8, null));
                return;
            case 10:
                this.f5890c.m7092a(1, (IInterface) null);
                throw new IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
            default:
                this.f5890c.m7092a(1, (IInterface) null);
                mo7133a(new C1071a(this.f5888a, this.f5889b != null ? (PendingIntent) this.f5889b.getParcelable("pendingIntent") : null));
                return;
        }
    }

    /* JADX INFO: renamed from: a */
    protected abstract boolean mo7135a();
}
