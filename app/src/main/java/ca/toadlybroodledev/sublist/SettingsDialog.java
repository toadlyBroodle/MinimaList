package ca.toadlybroodledev.sublist;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;
import ca.toadlybroodledev.sublist.iface.HostContract;

// Ported from decompiled ViewOnClickListenerC0548b. Preferences modal dialog.
public class SettingsDialog extends DialogFragment
        implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {

    CheckBox f3800ae;
    CheckBox f3801af;
    CheckBox f3802ag;
    RadioButton f3803ah;
    RadioButton f3804ai;
    RadioButton f3805aj;
    RadioButton f3806ak;
    RadioButton f3807al;
    RadioButton f3808am;
    RadioButton f3809an;
    RadioButton f3810ao;
    RadioButton f3811ap;
    RadioButton f3812aq;
    CheckBox f3813ar;
    CheckBox f3814as;
    private HostContract f3815at;

    static SettingsDialog m4843ac() {
        return new SettingsDialog();
    }

    void m4844ad() {
        if (getResources().getBoolean(R.bool.is_tablet)) {
            return;
        }
        this.f3801af.setChecked(true);
        this.f3801af.setEnabled(false);
    }

    void m4845ae() {
        AppSettings.f3944g = this.f3800ae.isChecked();
        AppSettings.f3946i = this.f3801af.isChecked();
        AppSettings.f3945h = this.f3804ai.isChecked();
        AppSettings.f3947j = this.f3802ag.isChecked();
        AppSettings.f3948k = this.f3806ak.isChecked();
        AppSettings.f3949l = this.f3807al.isChecked();
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
        AppSettings.f3950m = i;
        AppSettings.f3951n = this.f3813ar.isChecked();
        AppSettings.f3952o = this.f3814as.isChecked();
        AppSettings.m4947l();
        this.f3815at.mo4759F();
    }

    @Override
    public Dialog onCreateDialog(Bundle savedState) {
        View view = getActivity().getLayoutInflater().inflate(
                R.layout.fragment_dialog_settings_prefs, (ViewGroup) null);
        this.f3815at = (HostContract) getActivity();
        this.f3800ae = (CheckBox) view.findViewById(R.id.def_persist_tskbr_icon);
        this.f3801af = (CheckBox) view.findViewById(R.id.def_compl_overflow);
        this.f3802ag = (CheckBox) view.findViewById(R.id.def_open_keyboard);
        this.f3803ah = (RadioButton) view.findViewById(R.id.def_add_butt_loc_menu);
        this.f3804ai = (RadioButton) view.findViewById(R.id.def_add_butt_loc_fab);
        this.f3805aj = (RadioButton) view.findViewById(R.id.def_ent_add_new_top);
        this.f3806ak = (RadioButton) view.findViewById(R.id.def_ent_add_new_bottom);
        this.f3807al = (RadioButton) view.findViewById(R.id.def_ent_sing_line);
        this.f3808am = (RadioButton) view.findViewById(R.id.def_ent_multi_line);
        this.f3809an = (RadioButton) view.findViewById(R.id.def_enter_newline);
        this.f3810ao = (RadioButton) view.findViewById(R.id.def_enter_newentry);
        this.f3811ap = (RadioButton) view.findViewById(R.id.def_enter_nextentry);
        this.f3812aq = (RadioButton) view.findViewById(R.id.def_enter_closekeyboard);
        this.f3813ar = (CheckBox) view.findViewById(R.id.def_compl_children);
        this.f3814as = (CheckBox) view.findViewById(R.id.def_del_children);
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
        this.f3800ae.setChecked(AppSettings.f3944g);
        this.f3801af.setChecked(AppSettings.f3946i);
        this.f3802ag.setChecked(AppSettings.f3947j);
        if (AppSettings.f3945h) {
            this.f3804ai.setChecked(true);
        } else {
            this.f3803ah.setChecked(true);
            m4844ad();
        }
        if (AppSettings.f3948k) {
            this.f3806ak.setChecked(true);
        } else {
            this.f3805aj.setChecked(true);
        }
        if (AppSettings.f3949l) {
            this.f3809an.setEnabled(false);
            this.f3807al.setChecked(true);
        } else {
            this.f3808am.setChecked(true);
            this.f3810ao.setEnabled(false);
            this.f3811ap.setEnabled(false);
            this.f3812aq.setEnabled(false);
        }
        if (AppSettings.f3950m == 0) {
            this.f3809an.setChecked(true);
        } else if (AppSettings.f3950m == 1) {
            this.f3810ao.setChecked(true);
        } else if (AppSettings.f3950m == 2) {
            this.f3811ap.setChecked(true);
        } else if (AppSettings.f3950m == 3) {
            this.f3812aq.setChecked(true);
        }
        this.f3813ar.setChecked(AppSettings.f3951n);
        this.f3814as.setChecked(AppSettings.f3952o);
        return new AlertDialog.Builder(getActivity())
                .setView(view)
                .setTitle(R.string.settings_customize_behaviors)
                .setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        SettingsDialog.this.m4845ae();
                    }
                })
                .create();
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        // State is read on OK press via m4845ae(); no per-change action needed.
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.def_add_butt_loc_fab) {
            ((RadioButton) view).setChecked(true);
            this.f3801af.setEnabled(true);
        } else if (id == R.id.def_add_butt_loc_menu) {
            ((RadioButton) view).setChecked(true);
            m4844ad();
        } else if (id == R.id.def_ent_add_new_bottom) {
            ((RadioButton) view).setChecked(true);
        } else if (id == R.id.def_ent_add_new_top) {
            ((RadioButton) view).setChecked(true);
        } else if (id == R.id.def_ent_multi_line) {
            ((RadioButton) view).setChecked(true);
            this.f3809an.setChecked(true);
            this.f3809an.setEnabled(true);
            this.f3810ao.setEnabled(false);
            this.f3811ap.setEnabled(false);
            this.f3812aq.setEnabled(false);
        } else if (id == R.id.def_ent_sing_line) {
            ((RadioButton) view).setChecked(true);
            if (this.f3809an.isChecked()) {
                this.f3810ao.setChecked(true);
            }
            this.f3809an.setEnabled(false);
            this.f3810ao.setEnabled(true);
            this.f3811ap.setEnabled(true);
            this.f3812aq.setEnabled(true);
        } else if (id == R.id.def_enter_closekeyboard) {
            ((RadioButton) view).setChecked(true);
        } else if (id == R.id.def_enter_newentry) {
            ((RadioButton) view).setChecked(true);
        } else if (id == R.id.def_enter_newline) {
            ((RadioButton) view).setChecked(true);
        } else if (id == R.id.def_enter_nextentry) {
            ((RadioButton) view).setChecked(true);
        }
    }
}
