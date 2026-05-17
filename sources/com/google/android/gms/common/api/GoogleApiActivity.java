package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.C1071a;
import com.google.android.gms.common.C1204c;
import com.google.android.gms.common.api.internal.C1098am;

/* JADX INFO: loaded from: classes.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: a */
    private int f5448a = 0;

    /* JADX INFO: renamed from: a */
    public static PendingIntent m6621a(Context context, PendingIntent pendingIntent, int i) {
        return PendingIntent.getActivity(context, 0, m6622a(context, pendingIntent, i, true), 134217728);
    }

    /* JADX INFO: renamed from: a */
    public static Intent m6622a(Context context, PendingIntent pendingIntent, int i, boolean z) {
        Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
        intent.putExtra("pending_intent", pendingIntent);
        intent.putExtra("failing_client_id", i);
        intent.putExtra("notify_manager", z);
        return intent;
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f5448a = 0;
            setResult(i2, intent);
            if (booleanExtra) {
                C1098am c1098amM6782a = C1098am.m6782a(this);
                switch (i2) {
                    case -1:
                        c1098amM6782a.m6807d();
                        break;
                    case 0:
                        c1098amM6782a.m6804b(new C1071a(13, null), getIntent().getIntExtra("failing_client_id", -1));
                        break;
                }
            }
        } else if (i == 2) {
            this.f5448a = 0;
            setResult(i2, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        this.f5448a = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f5448a = bundle.getInt("resolution");
        }
        if (this.f5448a != 1) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                Log.e("GoogleApiActivity", "Activity started without extras");
                finish();
                return;
            }
            PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
            Integer num = (Integer) extras.get("error_code");
            if (pendingIntent == null && num == null) {
                Log.e("GoogleApiActivity", "Activity started without resolution");
                finish();
            } else {
                if (pendingIntent == null) {
                    C1204c.m7035a().m7050b(this, num.intValue(), 2, this);
                    this.f5448a = 1;
                    return;
                }
                try {
                    startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                    this.f5448a = 1;
                } catch (IntentSender.SendIntentException e) {
                    Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e);
                    finish();
                }
            }
        }
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.f5448a);
        super.onSaveInstanceState(bundle);
    }
}
