package android.support.v4.p006a;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: renamed from: android.support.v4.a.f */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractActivityC0150f extends ActivityC0144aj {

    /* JADX INFO: renamed from: a */
    boolean f787a;

    AbstractActivityC0150f() {
    }

    /* JADX INFO: renamed from: b */
    static void m860b(int i) {
        if (((-65536) & i) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    /* JADX INFO: renamed from: a */
    abstract View mo861a(View view, String str, Context context, AttributeSet attributeSet);

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewMo861a = mo861a(view, str, context, attributeSet);
        return viewMo861a == null ? super.onCreateView(view, str, context, attributeSet) : viewMo861a;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewMo861a = mo861a(null, str, context, attributeSet);
        return viewMo861a == null ? super.onCreateView(str, context, attributeSet) : viewMo861a;
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        if (!this.f787a && i != -1) {
            m860b(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }
}
