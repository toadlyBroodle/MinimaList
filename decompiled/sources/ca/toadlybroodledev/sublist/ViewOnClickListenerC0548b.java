package ca.toadlybroodledev.sublist;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.p006a.DialogInterfaceOnCancelListenerC0153i;
import android.support.v7.app.DialogInterfaceC0347d;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import ca.toadlybroodledev.sublist.C0566m;
import ca.toadlybroodledev.sublist.p031b.InterfaceC0549a;

/* JADX INFO: renamed from: ca.toadlybroodledev.sublist.b */
/* JADX INFO: loaded from: classes.dex */
public class ViewOnClickListenerC0548b extends DialogInterfaceOnCancelListenerC0153i implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: ae */
    CheckBox f3800ae;

    /* JADX INFO: renamed from: af */
    CheckBox f3801af;

    /* JADX INFO: renamed from: ag */
    CheckBox f3802ag;

    /* JADX INFO: renamed from: ah */
    RadioButton f3803ah;

    /* JADX INFO: renamed from: ai */
    RadioButton f3804ai;

    /* JADX INFO: renamed from: aj */
    RadioButton f3805aj;

    /* JADX INFO: renamed from: ak */
    RadioButton f3806ak;

    /* JADX INFO: renamed from: al */
    RadioButton f3807al;

    /* JADX INFO: renamed from: am */
    RadioButton f3808am;

    /* JADX INFO: renamed from: an */
    RadioButton f3809an;

    /* JADX INFO: renamed from: ao */
    RadioButton f3810ao;

    /* JADX INFO: renamed from: ap */
    RadioButton f3811ap;

    /* JADX INFO: renamed from: aq */
    RadioButton f3812aq;

    /* JADX INFO: renamed from: ar */
    CheckBox f3813ar;

    /* JADX INFO: renamed from: as */
    CheckBox f3814as;

    /* JADX INFO: renamed from: at */
    private InterfaceC0549a f3815at;

    /* JADX INFO: renamed from: ac */
    static ViewOnClickListenerC0548b m4843ac() {
        return new ViewOnClickListenerC0548b();
    }

    /* JADX INFO: renamed from: ad */
    void m4844ad() {
        if (m971l().getBoolean(R.bool.is_tablet)) {
            return;
        }
        this.f3801af.setChecked(true);
        this.f3801af.setEnabled(false);
    }

    /* JADX INFO: renamed from: ae */
    void m4845ae() {
        C0566m.f3944g = this.f3800ae.isChecked();
        C0566m.f3946i = this.f3801af.isChecked();
        C0566m.f3945h = this.f3804ai.isChecked();
        C0566m.f3947j = this.f3802ag.isChecked();
        C0566m.f3948k = this.f3806ak.isChecked();
        C0566m.f3949l = this.f3807al.isChecked();
        int i = -1;
        if (this.f3809an.isChecked()) {
            i = 0;
        } else if (this.f3810ao.isChecked()) {
            i = 1;
        } else if (this.f3811ap.isChecked()) {
            i = 2;
        } else if (this.f3812aq.isChecked()) {
            i = 3;
        }
        C0566m.f3950m = i;
        C0566m.f3951n = this.f3813ar.isChecked();
        C0566m.f3952o = this.f3814as.isChecked();
        C0566m.m4947l();
        this.f3815at.mo4759F();
    }

    @Override // android.support.v4.p006a.DialogInterfaceOnCancelListenerC0153i
    /* JADX INFO: renamed from: c */
    public Dialog mo875c(Bundle bundle) {
        View viewInflate = m969k().getLayoutInflater().inflate(R.layout.fragment_dialog_settings_prefs, (ViewGroup) null);
        this.f3815at = (InterfaceC0549a) m969k();
        this.f3800ae = (CheckBox) viewInflate.findViewById(R.id.def_persist_tskbr_icon);
        this.f3801af = (CheckBox) viewInflate.findViewById(R.id.def_compl_overflow);
        this.f3802ag = (CheckBox) viewInflate.findViewById(R.id.def_open_keyboard);
        this.f3803ah = (RadioButton) viewInflate.findViewById(R.id.def_add_butt_loc_menu);
        this.f3804ai = (RadioButton) viewInflate.findViewById(R.id.def_add_butt_loc_fab);
        this.f3805aj = (RadioButton) viewInflate.findViewById(R.id.def_ent_add_new_top);
        this.f3806ak = (RadioButton) viewInflate.findViewById(R.id.def_ent_add_new_bottom);
        this.f3807al = (RadioButton) viewInflate.findViewById(R.id.def_ent_sing_line);
        this.f3808am = (RadioButton) viewInflate.findViewById(R.id.def_ent_multi_line);
        this.f3809an = (RadioButton) viewInflate.findViewById(R.id.def_enter_newline);
        this.f3810ao = (RadioButton) viewInflate.findViewById(R.id.def_enter_newentry);
        this.f3811ap = (RadioButton) viewInflate.findViewById(R.id.def_enter_nextentry);
        this.f3812aq = (RadioButton) viewInflate.findViewById(R.id.def_enter_closekeyboard);
        this.f3813ar = (CheckBox) viewInflate.findViewById(R.id.def_compl_children);
        this.f3814as = (CheckBox) viewInflate.findViewById(R.id.def_del_children);
        this.f3800ae.setOnCheckedChangeListener(this);
        this.f3801af.setOnCheckedChangeListener(this);
        this.f3802ag.setOnCheckedChangeListener(this);
        this.f3803ah.setOnClickListener(this);
        this.f3804ai.setOnClickListener(this);
        this.f3805aj.setOnClickListener(this);
        this.f3806ak.setOnClickListener(this);
        this.f3807al.setOnClickListener(this);
        this.f3808am.setOnClickListener(this);
        this.f3809an.setOnClickListener(this);
        this.f3810ao.setOnClickListener(this);
        this.f3811ap.setOnClickListener(this);
        this.f3812aq.setOnClickListener(this);
        this.f3813ar.setOnCheckedChangeListener(this);
        this.f3814as.setOnCheckedChangeListener(this);
        this.f3800ae.setChecked(C0566m.f3944g);
        this.f3801af.setChecked(C0566m.f3946i);
        this.f3802ag.setChecked(C0566m.f3947j);
        if (C0566m.f3945h) {
            this.f3804ai.setChecked(true);
        } else {
            this.f3803ah.setChecked(true);
            m4844ad();
        }
        if (C0566m.f3948k) {
            this.f3806ak.setChecked(true);
        } else {
            this.f3805aj.setChecked(true);
        }
        if (C0566m.f3949l) {
            this.f3809an.setEnabled(false);
            this.f3807al.setChecked(true);
        } else {
            this.f3808am.setChecked(true);
            this.f3810ao.setEnabled(false);
            this.f3811ap.setEnabled(false);
            this.f3812aq.setEnabled(false);
        }
        switch (C0566m.f3950m) {
            case 0:
                this.f3809an.setChecked(true);
                break;
            case 1:
                this.f3810ao.setChecked(true);
                break;
            case 2:
                this.f3811ap.setChecked(true);
                break;
            case 3:
                this.f3812aq.setChecked(true);
                break;
        }
        this.f3813ar.setChecked(C0566m.f3951n);
        this.f3814as.setChecked(C0566m.f3952o);
        return new DialogInterfaceC0347d.a(m969k()).m2600b(viewInflate).m2591a(R.string.settings_customize_behaviors).m2592a(R.string.ok, new DialogInterface.OnClickListener() { // from class: ca.toadlybroodledev.sublist.b.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                ViewOnClickListenerC0548b.this.m4845ae();
            }
        }).m2602b();
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        String str;
        String strValueOf = null;
        switch (compoundButton.getId()) {
            case R.id.def_compl_children /* 2131296357 */:
                str = "pref_inher_compl_child";
                strValueOf = String.valueOf(compoundButton.isChecked());
                break;
            case R.id.def_compl_overflow /* 2131296358 */:
                str = "pref_compl_overflow";
                strValueOf = String.valueOf(this.f3801af.isChecked());
                break;
            case R.id.def_del_children /* 2131296359 */:
                str = "pref_inher_del_child";
                strValueOf = String.valueOf(compoundButton.isChecked());
                break;
            case R.id.def_open_keyboard /* 2131296368 */:
                str = "pref_auto_open_keybrd";
                strValueOf = String.valueOf(this.f3802ag.isChecked());
                break;
            case R.id.def_persist_tskbr_icon /* 2131296369 */:
                str = "pref_persist_tskbr_icon";
                strValueOf = String.valueOf(this.f3800ae.isChecked());
                break;
            default:
                str = null;
                break;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        String str;
        String strValueOf = null;
        switch (view.getId()) {
            case R.id.def_add_butt_loc_fab /* 2131296355 */:
                ((RadioButton) view).setChecked(true);
                this.f3801af.setEnabled(true);
                str = "pref_add_butt_loc";
                strValueOf = "1";
                break;
            case R.id.def_add_butt_loc_menu /* 2131296356 */:
                ((RadioButton) view).setChecked(true);
                m4844ad();
                str = "pref_add_butt_loc";
                strValueOf = "0";
                break;
            case R.id.def_compl_children /* 2131296357 */:
            case R.id.def_compl_overflow /* 2131296358 */:
            case R.id.def_del_children /* 2131296359 */:
            default:
                str = null;
                break;
            case R.id.def_ent_add_new_bottom /* 2131296360 */:
                ((RadioButton) view).setChecked(true);
                str = "pref_add_new_loc";
                strValueOf = "1";
                break;
            case R.id.def_ent_add_new_top /* 2131296361 */:
                ((RadioButton) view).setChecked(true);
                str = "pref_add_new_loc";
                strValueOf = "0";
                break;
            case R.id.def_ent_multi_line /* 2131296362 */:
                ((RadioButton) view).setChecked(true);
                this.f3809an.setChecked(true);
                this.f3809an.setEnabled(true);
                this.f3810ao.setEnabled(false);
                this.f3811ap.setEnabled(false);
                this.f3812aq.setEnabled(false);
                str = "pref_single_line_ents";
                strValueOf = "false";
                break;
            case R.id.def_ent_sing_line /* 2131296363 */:
                ((RadioButton) view).setChecked(true);
                if (this.f3809an.isChecked()) {
                    this.f3810ao.setChecked(true);
                }
                this.f3809an.setEnabled(false);
                this.f3810ao.setEnabled(true);
                this.f3811ap.setEnabled(true);
                this.f3812aq.setEnabled(true);
                str = "pref_single_line_ents";
                strValueOf = "true";
                break;
            case R.id.def_enter_closekeyboard /* 2131296364 */:
                ((RadioButton) view).setChecked(true);
                str = "pref_entkey";
                strValueOf = String.valueOf(C0566m.a.CLOSE_KEYS.m4960a());
                break;
            case R.id.def_enter_newentry /* 2131296365 */:
                ((RadioButton) view).setChecked(true);
                str = "pref_entkey";
                strValueOf = String.valueOf(C0566m.a.NEW_ENTRY.m4960a());
                break;
            case R.id.def_enter_newline /* 2131296366 */:
                ((RadioButton) view).setChecked(true);
                str = "pref_entkey";
                strValueOf = String.valueOf(C0566m.a.NEW_LINE.m4960a());
                break;
            case R.id.def_enter_nextentry /* 2131296367 */:
                ((RadioButton) view).setChecked(true);
                str = "pref_entkey";
                strValueOf = String.valueOf(C0566m.a.NEXT_ENTRY.m4960a());
                break;
        }
    }
}
