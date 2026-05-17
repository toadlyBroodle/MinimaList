package com.google.firebase.auth.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.p006a.ActivityC0155k;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.internal.C2016wj;
import com.google.android.gms.internal.bao;
import com.google.android.gms.p051b.AbstractC0964e;
import com.google.android.gms.p051b.C0967h;
import com.google.firebase.auth.C2210x;
import com.google.firebase.auth.FirebaseAuth;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
@KeepName
public class FederatedSignInActivity extends ActivityC0155k {

    /* JADX INFO: renamed from: m */
    private static boolean f12799m = false;

    /* JADX INFO: renamed from: com.google.firebase.auth.internal.FederatedSignInActivity$a */
    static class AsyncTaskC2177a extends AsyncTask<Void, Void, AbstractC0964e<Object>> {

        /* JADX INFO: renamed from: a */
        private final bao f12800a;

        /* JADX INFO: renamed from: b */
        private final WeakReference<FederatedSignInActivity> f12801b;

        public AsyncTaskC2177a(bao baoVar, FederatedSignInActivity federatedSignInActivity) {
            this.f12800a = baoVar;
            this.f12801b = new WeakReference<>(federatedSignInActivity);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractC0964e<Object> doInBackground(Void... voidArr) {
            AbstractC0964e<Object> abstractC0964eM12836a = FirebaseAuth.getInstance().m12836a(C2210x.m12915a(this.f12800a));
            try {
                C0967h.m6225a((AbstractC0964e) abstractC0964eM12836a);
            } catch (InterruptedException e) {
            } catch (ExecutionException e2) {
            }
            return abstractC0964eM12836a;
        }

        /* JADX INFO: renamed from: a */
        private final void m12854a(int i) {
            FederatedSignInActivity federatedSignInActivity = this.f12801b.get();
            if (federatedSignInActivity != null) {
                federatedSignInActivity.m12852c(i);
            }
        }

        @Override // android.os.AsyncTask
        protected final /* synthetic */ void onCancelled(AbstractC0964e<Object> abstractC0964e) {
            m12854a(0);
        }

        @Override // android.os.AsyncTask
        protected final /* synthetic */ void onPostExecute(AbstractC0964e<Object> abstractC0964e) {
            m12854a(-1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public final void m12852c(int i) {
        f12799m = false;
        setResult(i);
        finish();
    }

    @Override // android.support.v4.p006a.ActivityC0155k, android.support.v4.p006a.ActivityC0144aj, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if (!action.equals("com.google.firebase.auth.internal.SIGN_IN") && !action.equals("com.google.firebase.auth.internal.GET_CRED")) {
            String strValueOf = String.valueOf(action);
            Log.e("IdpSignInActivity", strValueOf.length() != 0 ? "Unknown action: ".concat(strValueOf) : new String("Unknown action: "));
            setResult(0);
            finish();
            return;
        }
        if (f12799m) {
            setResult(0);
            finish();
            return;
        }
        f12799m = true;
        if (bundle == null) {
            Intent intent = new Intent("com.google.firebase.auth.api.gms.ui.START_WEB_SIGN_IN");
            intent.setPackage("com.google.android.gms");
            intent.putExtras(getIntent().getExtras());
            try {
                startActivityForResult(intent, 40963);
            } catch (ActivityNotFoundException e) {
                Log.w("IdpSignInActivity", "Could not launch web sign-in Intent. Google Play service is unavailable");
                m12852c(0);
            }
        }
    }

    @Override // android.support.v4.p006a.ActivityC0155k, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (!"com.google.firebase.auth.internal.WEB_SIGN_IN_FAILED".equals(intent.getAction())) {
            new AsyncTaskC2177a((bao) C2016wj.m12538a(intent, "com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST", bao.CREATOR), this).execute(new Void[0]);
        } else {
            Log.e("IdpSignInActivity", "Web sign-in failed, finishing");
            m12852c(0);
        }
    }
}
