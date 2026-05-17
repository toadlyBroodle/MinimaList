package android.support.v4.p006a;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;

/* JADX INFO: renamed from: android.support.v4.a.g */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractActivityC0151g extends AbstractActivityC0150f {

    /* JADX INFO: renamed from: b */
    boolean f788b;

    AbstractActivityC0151g() {
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        if (!this.f788b && i != -1) {
            m860b(i);
        }
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (!this.f787a && i != -1) {
            m860b(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}
