package ca.toadlybroodledev.sublist;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.Switch;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import ca.toadlybroodledev.sublist.iface.HostContract;
import ca.toadlybroodledev.sublist.model.OutlineRow;
import java.util.ArrayList;
import java.util.HashMap;

// Ported from decompiled ViewOnClickListenerC0562i. Settings page with spinners, switches, buttons.
// Premium gate on export-txt removed (Phase 3.5). Cloud sync methods removed (Phase 3.1/3.3).
public class SettingsFragment extends Fragment
        implements View.OnClickListener, AdapterView.OnItemSelectedListener {

    LinearLayout f3871a;
    Button f3872ae;
    Button f3873af;
    Button f3874ag;
    Button f3875ah;
    Button f3876ai;
    Button f3877aj;
    Button f3878ak;
    Button f3879al;
    private HostContract f3881an;
    Switch f3883c;
    Switch f3884d;
    Spinner f3885e;
    Spinner f3886f;
    Spinner f3887g;
    Spinner f3888h;
    Switch f3889i;

    SettingsDialog f3882b = SettingsDialog.m4843ac();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedState) {
        super.onCreateView(inflater, container, savedState);
        return inflater.inflate(R.layout.fragment_settings, container, false);
    }

    @Override
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        setHasOptionsMenu(true);
        this.f3881an = (HostContract) context;
    }

    @Override
    public void onViewCreated(View view, Bundle savedState) {
        super.onViewCreated(view, savedState);
        this.f3871a = (LinearLayout) this.f3881an.mo4760a(
                Integer.valueOf(R.id.fragment_settings_linear_layout));
        this.f3883c = (Switch) this.f3881an.mo4760a(Integer.valueOf(R.id.settings_send_anon_data));
        this.f3884d = (Switch) this.f3881an.mo4760a(Integer.valueOf(R.id.settings_show_completed));
        this.f3889i = (Switch) this.f3881an.mo4760a(
                Integer.valueOf(R.id.settings_backup_location_switch));
        this.f3872ae = (Button) this.f3881an.mo4760a(
                Integer.valueOf(R.id.settings_delete_completed));
        this.f3873af = (Button) this.f3881an.mo4760a(Integer.valueOf(R.id.settings_default_menu));
        this.f3877aj = (Button) this.f3881an.mo4760a(Integer.valueOf(R.id.settings_rate));
        this.f3878ak = (Button) this.f3881an.mo4760a(Integer.valueOf(R.id.settings_support));
        this.f3879al = (Button) this.f3881an.mo4760a(
                Integer.valueOf(R.id.settings_privacy_policy));
        this.f3874ag = (Button) this.f3881an.mo4760a(Integer.valueOf(R.id.settings_backup_data));
        this.f3875ah = (Button) this.f3881an.mo4760a(Integer.valueOf(R.id.settings_load_backup));
        this.f3876ai = (Button) this.f3881an.mo4760a(Integer.valueOf(R.id.settings_export_txt));
        this.f3885e = (Spinner) this.f3881an.mo4760a(Integer.valueOf(R.id.settings_bg_color));
        this.f3886f = (Spinner) this.f3881an.mo4760a(Integer.valueOf(R.id.settings_text_color));
        this.f3887g = (Spinner) this.f3881an.mo4760a(Integer.valueOf(R.id.settings_accent_color));
        this.f3888h = (Spinner) this.f3881an.mo4760a(Integer.valueOf(R.id.settings_text_size));
        this.f3883c.setOnClickListener(this);
        this.f3884d.setOnClickListener(this);
        this.f3889i.setOnClickListener(this);
        this.f3872ae.setOnClickListener(this);
        this.f3873af.setOnClickListener(this);
        this.f3877aj.setOnClickListener(this);
        this.f3878ak.setOnClickListener(this);
        this.f3879al.setOnClickListener(this);
        this.f3874ag.setOnClickListener(this);
        this.f3875ah.setOnClickListener(this);
        this.f3876ai.setOnClickListener(this);
        this.f3885e.setOnItemSelectedListener(this);
        this.f3886f.setOnItemSelectedListener(this);
        this.f3887g.setOnItemSelectedListener(this);
        this.f3888h.setOnItemSelectedListener(this);
        this.f3883c.setChecked(AppSettings.m4946k());
        this.f3884d.setChecked(AppSettings.m4929a());
        this.f3889i.setChecked(AppSettings.m4932b());
        this.f3885e.setAdapter((SpinnerAdapter) new StringArraySpinnerAdapter(
                this.f3881an.mo4775m(), R.array.colors_500_array));
        this.f3886f.setAdapter((SpinnerAdapter) new StringArraySpinnerAdapter(
                this.f3881an.mo4775m(), R.array.colors_text_array));
        this.f3887g.setAdapter((SpinnerAdapter) new StringArraySpinnerAdapter(
                this.f3881an.mo4775m(), R.array.colors_a400_array));
        this.f3888h.setAdapter((SpinnerAdapter) new StringArraySpinnerAdapter(
                this.f3881an.mo4775m(), R.array.size_text_array));
        this.f3881an.mo4772b(false);
    }

    public void m4885a(String[] addresses, String subject) {
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra(Intent.EXTRA_EMAIL, addresses);
        intent.putExtra(Intent.EXTRA_SUBJECT, subject);
        if (intent.resolveActivity(this.f3881an.mo4775m().getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    void m4886ac() {
        new AlertDialog.Builder(this.f3881an.mo4775m())
                .setTitle(R.string.settings_backup_data)
                .setMessage(R.string.dialog_message_save_backup)
                .setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        SettingsFragment.this.f3881an.mo4779q()
                                .m4976a(true, SettingsFragment.this.f3889i.isChecked());
                    }
                })
                .setNegativeButton(R.string.cancel, null)
                .show();
    }

    void m4887ad() {
        new AlertDialog.Builder(this.f3881an.mo4775m())
                .setTitle(R.string.settings_load_backup)
                .setMessage(R.string.dialog_message_load_backup)
                .setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        HashMap<String, ArrayList<OutlineRow>> map =
                                SettingsFragment.this.f3881an.mo4779q()
                                        .m4977b(true, SettingsFragment.this.f3889i.isChecked());
                        if (map != null) {
                            SettingsFragment.this.f3881an.mo4769a(map);
                        }
                    }
                })
                .setNegativeButton(R.string.cancel, null)
                .show();
    }

    void m4888ae() {
        Intent intent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("market://details?id=" + this.f3881an.mo4775m().getPackageName()));
        intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY
                | Intent.FLAG_ACTIVITY_NEW_DOCUMENT
                | Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
        try {
            startActivity(intent);
        } catch (ActivityNotFoundException e) {
            startActivity(new Intent(Intent.ACTION_VIEW,
                    Uri.parse("http://play.google.com/store/apps/details?id="
                            + this.f3881an.mo4775m().getPackageName())));
        }
    }

    void m4889af() {
        new AlertDialog.Builder(this.f3881an.mo4775m())
                .setTitle(R.string.settings_delete_completed)
                .setMessage(R.string.settings_del_comp_confirm)
                .setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        for (SublistFragment frag : SettingsFragment.this.f3881an.mo4786x()) {
                            frag.mo4849af().m4998c();
                        }
                        Toast.makeText(SettingsFragment.this.getContext(),
                                R.string.toast_done, 0).show();
                    }
                })
                .setNegativeButton(R.string.cancel, null)
                .show();
    }

    public void m4890b() {
        startActivity(new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://toadlybroodle.ca/portfolio/apps/apps-privacy-policy/")));
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.settings_backup_data) {
            m4886ac();
        } else if (id == R.id.settings_backup_location_switch) {
            AppSettings.m4931b(((Switch) view).isChecked());
        } else if (id == R.id.settings_default_menu) {
            this.f3882b.show(this.f3881an.mo4785w(), "dialog_prefs");
        } else if (id == R.id.settings_delete_completed) {
            m4889af();
        } else if (id == R.id.settings_export_txt) {
            // Premium gate removed: export always allowed.
            OutlineStore.m4967r();
        } else if (id == R.id.settings_load_backup) {
            m4887ad();
        } else if (id == R.id.settings_privacy_policy) {
            m4890b();
        } else if (id == R.id.settings_rate) {
            m4888ae();
        } else if (id == R.id.settings_send_anon_data) {
            AppSettings.m4935c(((Switch) view).isChecked());
        } else if (id == R.id.settings_show_completed) {
            AppSettings.m4928a(((Switch) view).isChecked());
        } else if (id == R.id.settings_support) {
            m4885a(new String[]{"toadlybroodledev@gmail.com"},
                    getString(R.string.email_support_subject));
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        if (i != 0) {
            int adapterId = adapterView.getId();
            if (adapterId == R.id.settings_accent_color) {
                AppSettings.m4938d(i);
            } else if (adapterId == R.id.settings_bg_color) {
                AppSettings.m4927a(i);
            } else if (adapterId == R.id.settings_text_color) {
                AppSettings.m4934c(i);
            } else if (adapterId == R.id.settings_text_size) {
                AppSettings.m4930b(i);
            }
            adapterView.setSelection(0);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
