package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Handler;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.C1071a;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.az */
/* JADX INFO: loaded from: classes.dex */
final class HandlerC1237az extends Handler {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ AbstractC1233av f5891a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC1237az(AbstractC1233av abstractC1233av, Looper looper) {
        super(looper);
        this.f5891a = abstractC1233av;
    }

    /* JADX INFO: renamed from: a */
    private static void m7139a(Message message) {
        ((AbstractC1239ba) message.obj).m7142c();
    }

    /* JADX INFO: renamed from: b */
    private static boolean m7140b(Message message) {
        return message.what == 2 || message.what == 1 || message.what == 7;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.f5891a.f5864c.get() != message.arg1) {
            if (m7140b(message)) {
                m7139a(message);
                return;
            }
            return;
        }
        if ((message.what == 1 || message.what == 7 || message.what == 4 || message.what == 5) && !this.f5891a.m7119h()) {
            m7139a(message);
            return;
        }
        if (message.what == 4) {
            this.f5891a.f5886y = new C1071a(message.arg2);
            if (this.f5891a.m7106y() && !this.f5891a.f5887z) {
                this.f5891a.m7092a(3, (IInterface) null);
                return;
            }
            C1071a c1071a = this.f5891a.f5886y != null ? this.f5891a.f5886y : new C1071a(8);
            this.f5891a.f5863b.mo6842a(c1071a);
            this.f5891a.mo7111a(c1071a);
            return;
        }
        if (message.what == 5) {
            C1071a c1071a2 = this.f5891a.f5886y != null ? this.f5891a.f5886y : new C1071a(8);
            this.f5891a.f5863b.mo6842a(c1071a2);
            this.f5891a.mo7111a(c1071a2);
            return;
        }
        if (message.what == 3) {
            C1071a c1071a3 = new C1071a(message.arg2, message.obj instanceof PendingIntent ? (PendingIntent) message.obj : null);
            this.f5891a.f5863b.mo6842a(c1071a3);
            this.f5891a.mo7111a(c1071a3);
            return;
        }
        if (message.what == 6) {
            this.f5891a.m7092a(5, (IInterface) null);
            if (this.f5891a.f5882u != null) {
                this.f5891a.f5882u.mo7136a(message.arg2);
            }
            this.f5891a.m7107a(message.arg2);
            this.f5891a.m7095a(5, 1, (IInterface) null);
            return;
        }
        if (message.what == 2 && !this.f5891a.m7118g()) {
            m7139a(message);
        } else if (m7140b(message)) {
            ((AbstractC1239ba) message.obj).m7141b();
        } else {
            Log.wtf("GmsClient", new StringBuilder(45).append("Don't know how to handle message: ").append(message.what).toString(), new Exception());
        }
    }
}
