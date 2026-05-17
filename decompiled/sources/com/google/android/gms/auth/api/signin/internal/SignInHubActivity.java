package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.p006a.AbstractC0168x;
import android.support.v4.p006a.ActivityC0155k;
import android.support.v4.p007b.C0176c;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.AbstractC1079f;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
@KeepName
public class SignInHubActivity extends ActivityC0155k {

    /* JADX INFO: renamed from: m */
    private static boolean f5081m = false;

    /* JADX INFO: renamed from: n */
    private boolean f5082n = false;

    /* JADX INFO: renamed from: o */
    private SignInConfiguration f5083o;

    /* JADX INFO: renamed from: p */
    private boolean f5084p;

    /* JADX INFO: renamed from: q */
    private int f5085q;

    /* JADX INFO: renamed from: r */
    private Intent f5086r;

    /* JADX INFO: renamed from: com.google.android.gms.auth.api.signin.internal.SignInHubActivity$a */
    class C0935a implements AbstractC0168x.a<Void> {
        private C0935a() {
        }

        @Override // android.support.v4.p006a.AbstractC0168x.a
        /* JADX INFO: renamed from: a */
        public final C0176c<Void> mo1261a(int i, Bundle bundle) {
            return new C0937b(SignInHubActivity.this, AbstractC1079f.m6664a());
        }

        @Override // android.support.v4.p006a.AbstractC0168x.a
        /* JADX INFO: renamed from: a */
        public final void mo1262a(C0176c<Void> c0176c) {
        }

        @Override // android.support.v4.p006a.AbstractC0168x.a
        /* JADX INFO: renamed from: a */
        public final /* synthetic */ void mo1263a(C0176c<Void> c0176c, Void r5) {
            SignInHubActivity.this.setResult(SignInHubActivity.this.f5085q, SignInHubActivity.this.f5086r);
            SignInHubActivity.this.finish();
        }
    }

    /* JADX INFO: renamed from: c */
    private final void m6158c(int i) {
        Status status = new Status(i);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        f5081m = false;
    }

    /* JADX INFO: renamed from: h */
    private final void m6159h() {
        m1013g().mo1259a(0, null, new C0935a());
        f5081m = false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    @Override // android.support.v4.p006a.ActivityC0155k, android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        if (this.f5082n) {
        }
        setResult(0);
        switch (i) {
            case 40962:
                if (intent != null) {
                    SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
                    if (signInAccount != null && signInAccount.m6148a() != null) {
                        GoogleSignInAccount googleSignInAccountM6148a = signInAccount.m6148a();
                        C0948m.m6181a(this).m6184a(this.f5083o.m6155a(), googleSignInAccountM6148a);
                        intent.removeExtra("signInAccount");
                        intent.putExtra("googleSignInAccount", googleSignInAccountM6148a);
                        this.f5084p = true;
                        this.f5085q = i2;
                        this.f5086r = intent;
                        m6159h();
                    } else if (intent.hasExtra("errorCode")) {
                        m6158c(intent.getIntExtra("errorCode", 8));
                    }
                }
                m6158c(8);
                break;
        }
    }

    @Override // android.support.v4.p006a.ActivityC0155k, android.support.v4.p006a.ActivityC0144aj, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        if ("com.google.android.gms.auth.NO_IMPL".equals(action)) {
            m6158c(12500);
            return;
        }
        if (f5081m) {
            setResult(0);
            m6158c(12502);
            return;
        }
        f5081m = true;
        if (!action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            String strValueOf = String.valueOf(intent.getAction());
            Log.e("AuthSignInClient", strValueOf.length() != 0 ? "Unknown action: ".concat(strValueOf) : new String("Unknown action: "));
            finish();
            return;
        }
        this.f5083o = (SignInConfiguration) intent.getBundleExtra("config").getParcelable("config");
        if (this.f5083o == null) {
            Log.e("AuthSignInClient", "Activity started with invalid configuration.");
            setResult(0);
            finish();
            return;
        }
        if (bundle != null) {
            this.f5084p = bundle.getBoolean("signingInGoogleApiClients");
            if (this.f5084p) {
                this.f5085q = bundle.getInt("signInResultCode");
                this.f5086r = (Intent) bundle.getParcelable("signInResultData");
                m6159h();
                return;
            }
            return;
        }
        Intent intent2 = new Intent(action);
        if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
            intent2.setPackage("com.google.android.gms");
        } else {
            intent2.setPackage(getPackageName());
        }
        intent2.putExtra("config", this.f5083o);
        try {
            startActivityForResult(intent2, 40962);
        } catch (ActivityNotFoundException e) {
            this.f5082n = true;
            Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
            m6158c(17);
        }
    }

    @Override // android.support.v4.p006a.ActivityC0155k, android.support.v4.p006a.ActivityC0144aj, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.f5084p);
        if (this.f5084p) {
            bundle.putInt("signInResultCode", this.f5085q);
            bundle.putParcelable("signInResultData", this.f5086r);
        }
    }
}
