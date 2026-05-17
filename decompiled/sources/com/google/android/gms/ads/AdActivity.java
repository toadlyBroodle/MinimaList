package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.C1668jm;
import com.google.android.gms.internal.bxm;
import com.google.android.gms.internal.cki;
import com.google.android.gms.p043a.BinderC0654c;

/* JADX INFO: loaded from: classes.dex */
public class AdActivity extends Activity {

    /* JADX INFO: renamed from: a */
    private cki f4338a;

    /* JADX INFO: renamed from: a */
    private final void m5333a() {
        if (this.f4338a != null) {
            try {
                this.f4338a.mo5798l();
            } catch (RemoteException e) {
                C1668jm.m11613c("Could not forward setContentViewSet to ad overlay:", e);
            }
        }
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        try {
            this.f4338a.mo5782a(i, i2, intent);
        } catch (Exception e) {
            C1668jm.m11613c("Could not forward onActivityResult to ad overlay:", e);
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        boolean zMo5791e = true;
        try {
            if (this.f4338a != null) {
                zMo5791e = this.f4338a.mo5791e();
            }
        } catch (RemoteException e) {
            C1668jm.m11613c("Could not forward onBackPressed to ad overlay:", e);
        }
        if (zMo5791e) {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            this.f4338a.mo5785a(BinderC0654c.m5329a(configuration));
        } catch (RemoteException e) {
            C1668jm.m11613c("Failed to wrap configuration.", e);
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f4338a = bxm.m10405b().m10399a(this);
        if (this.f4338a == null) {
            C1668jm.m11615e("Could not create ad overlay.");
            finish();
            return;
        }
        try {
            this.f4338a.mo5783a(bundle);
        } catch (RemoteException e) {
            C1668jm.m11613c("Could not forward onCreate to ad overlay:", e);
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        try {
            if (this.f4338a != null) {
                this.f4338a.mo5797k();
            }
        } catch (RemoteException e) {
            C1668jm.m11613c("Could not forward onDestroy to ad overlay:", e);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    protected void onPause() {
        try {
            if (this.f4338a != null) {
                this.f4338a.mo5795i();
            }
        } catch (RemoteException e) {
            C1668jm.m11613c("Could not forward onPause to ad overlay:", e);
            finish();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    protected void onRestart() {
        super.onRestart();
        try {
            if (this.f4338a != null) {
                this.f4338a.mo5792f();
            }
        } catch (RemoteException e) {
            C1668jm.m11613c("Could not forward onRestart to ad overlay:", e);
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        try {
            if (this.f4338a != null) {
                this.f4338a.mo5794h();
            }
        } catch (RemoteException e) {
            C1668jm.m11613c("Could not forward onResume to ad overlay:", e);
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        try {
            if (this.f4338a != null) {
                this.f4338a.mo5788b(bundle);
            }
        } catch (RemoteException e) {
            C1668jm.m11613c("Could not forward onSaveInstanceState to ad overlay:", e);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        try {
            if (this.f4338a != null) {
                this.f4338a.mo5793g();
            }
        } catch (RemoteException e) {
            C1668jm.m11613c("Could not forward onStart to ad overlay:", e);
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onStop() {
        try {
            if (this.f4338a != null) {
                this.f4338a.mo5796j();
            }
        } catch (RemoteException e) {
            C1668jm.m11613c("Could not forward onStop to ad overlay:", e);
            finish();
        }
        super.onStop();
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        super.setContentView(i);
        m5333a();
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        m5333a();
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        m5333a();
    }
}
