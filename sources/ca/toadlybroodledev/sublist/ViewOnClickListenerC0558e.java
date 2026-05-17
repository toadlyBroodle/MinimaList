package ca.toadlybroodledev.sublist;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.p006a.ComponentCallbacksC0154j;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import ca.toadlybroodledev.sublist.p031b.InterfaceC0549a;
import ca.toadlybroodledev.sublist.p032c.C0556c;

/* JADX INFO: renamed from: ca.toadlybroodledev.sublist.e */
/* JADX INFO: loaded from: classes.dex */
public class ViewOnClickListenerC0558e extends ComponentCallbacksC0154j implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    static InterfaceC0549a f3836a;

    /* JADX INFO: renamed from: c */
    private static C0556c f3837c;

    /* JADX INFO: renamed from: ae */
    private Button f3838ae;

    /* JADX INFO: renamed from: af */
    private Button f3839af;

    /* JADX INFO: renamed from: ag */
    private Button f3840ag;

    /* JADX INFO: renamed from: ah */
    private Button f3841ah;

    /* JADX INFO: renamed from: ai */
    private TextView f3842ai;

    /* JADX INFO: renamed from: aj */
    private TextView f3843aj;

    /* JADX INFO: renamed from: ak */
    private TextView f3844ak;

    /* JADX INFO: renamed from: al */
    private TextView f3845al;

    /* JADX INFO: renamed from: am */
    private TextView f3846am;

    /* JADX INFO: renamed from: an */
    private TextView f3847an;

    /* JADX INFO: renamed from: ao */
    private TextView f3848ao;

    /* JADX INFO: renamed from: ap */
    private TextView f3849ap;

    /* JADX INFO: renamed from: b */
    private final String f3850b = "fuckn" + getClass().getSimpleName();

    /* JADX INFO: renamed from: d */
    private ProgressDialog f3851d;

    /* JADX INFO: renamed from: e */
    private LinearLayout f3852e;

    /* JADX INFO: renamed from: f */
    private LinearLayout f3853f;

    /* JADX INFO: renamed from: g */
    private LinearLayout f3854g;

    /* JADX INFO: renamed from: h */
    private Button f3855h;

    /* JADX INFO: renamed from: i */
    private Button f3856i;

    /* JADX INFO: renamed from: b */
    static C0556c m4863b() {
        return f3837c;
    }

    @Override // android.support.v4.p006a.ComponentCallbacksC0154j
    /* JADX INFO: renamed from: a */
    public View mo914a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.mo914a(layoutInflater, viewGroup, bundle);
        m954e(true);
        return layoutInflater.inflate(R.layout.fragment_base_profile, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.support.v4.p006a.ComponentCallbacksC0154j
    /* JADX INFO: renamed from: a */
    public void mo868a(Context context) {
        super.mo868a(context);
        m952d(true);
        f3836a = (InterfaceC0549a) context;
    }

    @Override // android.support.v4.p006a.ComponentCallbacksC0154j
    /* JADX INFO: renamed from: a */
    public void mo933a(Menu menu, MenuInflater menuInflater) {
        super.mo933a(menu, menuInflater);
        menu.clear();
        menuInflater.inflate(R.menu.profile_menu, menu);
    }

    @Override // android.support.v4.p006a.ComponentCallbacksC0154j
    /* JADX INFO: renamed from: a */
    public void mo935a(View view, Bundle bundle) {
        super.mo935a(view, bundle);
        this.f3852e = (LinearLayout) f3836a.mo4760a(Integer.valueOf(R.id.profile_main_layout));
        this.f3853f = (LinearLayout) f3836a.mo4760a(Integer.valueOf(R.id.profile_sync_layout));
        this.f3854g = (LinearLayout) f3836a.mo4760a(Integer.valueOf(R.id.profile_premium_layout));
        this.f3855h = (Button) f3836a.mo4760a(Integer.valueOf(R.id.profile_share_button));
        this.f3856i = (Button) f3836a.mo4760a(Integer.valueOf(R.id.profile_purchase_premium_button));
        this.f3838ae = (Button) f3836a.mo4760a(Integer.valueOf(R.id.base_google_sign_in_button));
        this.f3839af = (Button) f3836a.mo4760a(Integer.valueOf(R.id.base_profile_sign_out_button));
        this.f3840ag = (Button) f3836a.mo4760a(Integer.valueOf(R.id.write_database_button));
        this.f3841ah = (Button) f3836a.mo4760a(Integer.valueOf(R.id.read_database_button));
        this.f3842ai = (TextView) f3836a.mo4760a(Integer.valueOf(R.id.profile_name_text));
        this.f3843aj = (TextView) f3836a.mo4760a(Integer.valueOf(R.id.profile_email_text));
        this.f3844ak = (TextView) f3836a.mo4760a(Integer.valueOf(R.id.profile_premium_member_text));
        this.f3845al = (TextView) f3836a.mo4760a(Integer.valueOf(R.id.profile_premium_expiration));
        this.f3846am = (TextView) f3836a.mo4760a(Integer.valueOf(R.id.profile_completed_text));
        this.f3847an = (TextView) f3836a.mo4760a(Integer.valueOf(R.id.profile_converted_text));
        this.f3848ao = (TextView) f3836a.mo4760a(Integer.valueOf(R.id.profile_premium_title));
        this.f3849ap = (TextView) f3836a.mo4760a(Integer.valueOf(R.id.profile_premium_trial_promo));
        mo4868af();
        this.f3855h.setOnClickListener(this);
        this.f3856i.setOnClickListener(this);
        this.f3838ae.setOnClickListener(this);
        this.f3839af.setOnClickListener(this);
        this.f3840ag.setOnClickListener(this);
        this.f3841ah.setOnClickListener(this);
    }

    /* JADX INFO: renamed from: a */
    void m4864a(C0556c c0556c) {
        f3837c = c0556c;
        try {
            mo4868af();
        } catch (Exception e) {
            Log.d(this.f3850b, e.getMessage());
        }
    }

    /* JADX INFO: renamed from: ac */
    public void m4865ac() {
        if (f3837c != null) {
            f3837c.completed++;
            mo4868af();
            C0567n.m4972w();
        }
    }

    /* JADX INFO: renamed from: ad */
    public void m4866ad() {
        if (f3837c != null) {
            f3837c.uploads++;
            mo4868af();
            C0567n.m4972w();
        }
    }

    /* JADX INFO: renamed from: ae */
    public void m4867ae() {
        if (f3837c != null) {
            f3837c.invites++;
            m4871d(10);
        }
    }

    /* JADX INFO: renamed from: af */
    void mo4868af() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6 = "-";
        boolean z = f3837c != null;
        if (z) {
            str5 = f3837c.displayname;
            str4 = f3837c.email;
            String strValueOf = String.valueOf(f3837c.completed);
            String strValueOf2 = String.valueOf(f3837c.invites);
            int i = f3837c.trialHoursRemaining;
            String strA = i > 0 ? m916a(R.string.profile_premium_trial) : m916a(R.string.profile_prem_not_yet);
            str = strValueOf;
            str2 = String.valueOf(C0572s.m5010b(i)) + " " + m916a(R.string.profile_premium_days);
            str3 = strA;
            str6 = strValueOf2;
        } else {
            str = "-";
            str2 = "-";
            str3 = "-";
            str4 = "-";
            str5 = "-";
        }
        this.f3842ai.setText(m917a(R.string.name_fmt, str5));
        this.f3843aj.setText(m917a(R.string.email_fmt, str4));
        this.f3846am.setText(m917a(R.string.profile_completed_fmt, str));
        this.f3847an.setText(m917a(R.string.profile_minimalists_converted, str6));
        this.f3838ae.setVisibility(!z ? 0 : 8);
        this.f3839af.setVisibility(z ? 0 : 8);
        this.f3840ag.setEnabled(z);
        this.f3840ag.setAlpha(z ? 1.0f : 0.4f);
        this.f3841ah.setEnabled(z);
        this.f3841ah.setAlpha(z ? 1.0f : 0.4f);
        if (!C0564k.m4911a()) {
            this.f3848ao.setText(R.string.profile_unlock_premium_features_title);
            this.f3856i.setVisibility(0);
            this.f3844ak.setText(m917a(R.string.profile_premium_member, str3));
            this.f3845al.setText(m917a(R.string.profile_premium_expires_text, str2));
            return;
        }
        this.f3848ao.setText(R.string.profile_premium_share_title);
        this.f3856i.setVisibility(8);
        this.f3849ap.setVisibility(8);
        this.f3844ak.setText(m917a(R.string.profile_premium_member, m916a(R.string.yes)));
        this.f3845al.setText(m917a(R.string.profile_premium_expires_text, m971l().getString(R.string.profile_expires_never)));
    }

    /* JADX INFO: renamed from: ag */
    protected void m4869ag() {
        if (this.f3851d == null) {
            this.f3851d = new ProgressDialog(f3836a.mo4775m());
            this.f3851d.setMessage(m916a(R.string.loading));
            this.f3851d.setIndeterminate(true);
        }
        this.f3851d.show();
    }

    /* JADX INFO: renamed from: ah */
    protected void m4870ah() {
        if (this.f3851d == null || !this.f3851d.isShowing()) {
            return;
        }
        this.f3851d.hide();
    }

    @Override // android.support.v4.p006a.ComponentCallbacksC0154j
    /* JADX INFO: renamed from: d */
    public void mo877d() {
        super.mo877d();
        if (C0566m.m4946k()) {
            AppMain.m4792a("ScreenView_" + this.f3850b, "ScreenView");
        }
    }

    /* JADX INFO: renamed from: d */
    public void m4871d(int i) {
        if (f3837c != null) {
            f3837c.trialHoursRemaining += C0572s.m5006a(i);
            mo4868af();
            C0567n.m4972w();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.read_database_button /* 2131296551 */:
                if (f3836a.mo4778p().m4914b()) {
                    C0567n.m4965p();
                    AppMain.m4792a("Profile_dbRead", "Action");
                }
                break;
            case R.id.write_database_button /* 2131296666 */:
                if (f3836a.mo4778p().m4914b()) {
                    C0567n.m4966q();
                    AppMain.m4792a("Profile_dbWrite", "Action");
                }
                break;
        }
        f3836a.onFragmentInput(view);
    }

    @Override // android.support.v4.p006a.ComponentCallbacksC0154j
    /* JADX INFO: renamed from: v */
    public void mo984v() {
        super.mo984v();
        m4870ah();
    }
}
