package ca.toadlybroodledev.sublist;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.auth.api.C0915a;
import com.google.android.gms.auth.api.signin.C0929b;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.InterfaceC1194l;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.p051b.AbstractC0964e;
import com.google.android.gms.p051b.InterfaceC0960a;
import com.google.firebase.auth.AbstractC2198l;
import com.google.firebase.auth.C2203q;
import com.google.firebase.auth.FirebaseAuth;

/* JADX INFO: renamed from: ca.toadlybroodledev.sublist.f */
/* JADX INFO: loaded from: classes.dex */
public class ViewOnClickListenerC0559f extends ViewOnClickListenerC0558e implements View.OnClickListener {

    /* JADX INFO: renamed from: b */
    private final String f3857b = "fuckn" + getClass().getSimpleName();

    /* JADX INFO: renamed from: c */
    private TextView f3858c;

    /* JADX INFO: renamed from: ai */
    private void m4873ai() {
        startActivityForResult(C0915a.f5003h.mo6149a(ActMain.f3695n), 9001);
    }

    /* JADX INFO: renamed from: aj */
    private void m4874aj() {
        C0567n.f3972p.m12843c();
        C0915a.f5003h.mo6151b(ActMain.f3695n).mo6696a(new InterfaceC1194l<Status>() { // from class: ca.toadlybroodledev.sublist.f.2
            @Override // com.google.android.gms.common.api.InterfaceC1194l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void mo4791a(Status status) {
                ViewOnClickListenerC0559f.this.mo4868af();
            }
        });
    }

    /* JADX INFO: renamed from: ak */
    private void m4875ak() {
        C0567n.f3972p.m12843c();
        C0915a.f5003h.mo6152c(ActMain.f3695n).mo6696a(new InterfaceC1194l<Status>() { // from class: ca.toadlybroodledev.sublist.f.3
            @Override // com.google.android.gms.common.api.InterfaceC1194l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void mo4791a(Status status) {
                ViewOnClickListenerC0559f.this.mo4868af();
            }
        });
    }

    @Override // ca.toadlybroodledev.sublist.ViewOnClickListenerC0558e, android.support.v4.p006a.ComponentCallbacksC0154j
    /* JADX INFO: renamed from: a */
    public View mo914a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.mo914a(layoutInflater, viewGroup, bundle);
        m952d(true);
        return layoutInflater.inflate(R.layout.fragment_google_signin, viewGroup, false);
    }

    @Override // android.support.v4.p006a.ComponentCallbacksC0154j
    /* JADX INFO: renamed from: a */
    public void mo919a(int i, int i2, Intent intent) {
        super.mo919a(i, i2, intent);
        if (i == 9001) {
            C0929b c0929bMo6150a = C0915a.f5003h.mo6150a(intent);
            if (c0929bMo6150a.m6154c()) {
                m4876a(c0929bMo6150a.m6153b());
            } else {
                Log.d(this.f3857b, "Google sign in failed");
                mo4868af();
            }
        }
    }

    @Override // ca.toadlybroodledev.sublist.ViewOnClickListenerC0558e, android.support.v4.p006a.ComponentCallbacksC0154j
    /* JADX INFO: renamed from: a */
    public void mo935a(View view, Bundle bundle) {
        this.f3858c = (TextView) f3836a.mo4760a(Integer.valueOf(R.id.google_status));
        f3836a.mo4760a(Integer.valueOf(R.id.google_sign_in_button)).setOnClickListener(this);
        f3836a.mo4760a(Integer.valueOf(R.id.google_sign_out_button)).setOnClickListener(this);
        f3836a.mo4760a(Integer.valueOf(R.id.google_disconnect_button)).setOnClickListener(this);
    }

    /* JADX INFO: renamed from: a */
    void m4876a(GoogleSignInAccount googleSignInAccount) {
        Log.d(this.f3857b, "firebaseAuthWithGoogle:" + googleSignInAccount.m6115a());
        m4869ag();
        C0567n.f3972p.m12836a(C2203q.m12905a(googleSignInAccount.m6116b(), null)).mo6207a(f3836a.mo4776n().m969k(), new InterfaceC0960a<Object>() { // from class: ca.toadlybroodledev.sublist.f.1
            @Override // com.google.android.gms.p051b.InterfaceC0960a
            /* JADX INFO: renamed from: a */
            public void mo4877a(AbstractC0964e<Object> abstractC0964e) {
                Log.d(ViewOnClickListenerC0559f.this.f3857b, "signInWithCredential:onComplete:" + abstractC0964e.mo6214b());
                if (abstractC0964e.mo6214b()) {
                    AppMain.m4792a("GooAuthent_true", "goo_auth_succ");
                } else {
                    Log.w(ViewOnClickListenerC0559f.this.f3857b, "signInWithCredential", abstractC0964e.mo6216d());
                    Toast.makeText(ViewOnClickListenerC0558e.f3836a.mo4775m(), R.string.goo_auth_fail, 0).show();
                    AppMain.m4792a("GooAuthent_false", "goo_auth_fail");
                }
                ViewOnClickListenerC0559f.this.m4870ah();
                ViewOnClickListenerC0558e.f3836a.mo4758E();
            }
        });
    }

    @Override // ca.toadlybroodledev.sublist.ViewOnClickListenerC0558e
    /* JADX INFO: renamed from: af */
    public void mo4868af() {
        try {
            AbstractC2198l abstractC2198lM12838a = FirebaseAuth.getInstance().m12838a();
            m4870ah();
            if (abstractC2198lM12838a != null) {
                this.f3858c.setText(abstractC2198lM12838a.mo12874f());
                f3836a.mo4760a(Integer.valueOf(R.id.google_sign_in_button)).setVisibility(8);
                f3836a.mo4760a(Integer.valueOf(R.id.google_sign_out_and_disconnect)).setVisibility(0);
            } else {
                this.f3858c.setText(R.string.signed_out);
                f3836a.mo4760a(Integer.valueOf(R.id.google_sign_in_button)).setVisibility(0);
                f3836a.mo4760a(Integer.valueOf(R.id.google_sign_out_and_disconnect)).setVisibility(8);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // ca.toadlybroodledev.sublist.ViewOnClickListenerC0558e, android.support.v4.p006a.ComponentCallbacksC0154j
    /* JADX INFO: renamed from: d */
    public void mo877d() {
        super.mo877d();
        AppMain.m4792a("ScreenView_" + this.f3857b, "ScreenView");
    }

    @Override // ca.toadlybroodledev.sublist.ViewOnClickListenerC0558e, android.view.View.OnClickListener
    public void onClick(View view) {
        String str = null;
        switch (view.getId()) {
            case R.id.google_disconnect_button /* 2131296403 */:
                str = "Profile_gooDisconn";
                m4875ak();
                break;
            case R.id.google_sign_in_button /* 2131296405 */:
                str = "Profile_gooSignIn";
                m4873ai();
                break;
            case R.id.google_sign_out_button /* 2131296407 */:
                str = "Profile_gooSignOut";
                m4874aj();
                break;
        }
        AppMain.m4792a(str, "Action");
    }

    @Override // android.support.v4.p006a.ComponentCallbacksC0154j
    /* JADX INFO: renamed from: t */
    public void mo982t() {
        super.mo982t();
        mo4868af();
    }
}
