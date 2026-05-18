package ca.toadlybroodledev.sublist;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
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
import ca.toadlybroodledev.sublist.iface.RowActionListener;
import ca.toadlybroodledev.sublist.model.OutlineRow;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

// Ported from decompiled ViewOnClickListenerC0562i. Settings page with spinners, switches, buttons.
// Premium gate on export-txt removed (Phase 3.5). Cloud sync methods removed (Phase 3.1/3.3).
// Phase 9.3: JSON export (SAF ACTION_CREATE_DOCUMENT) + JSON import (ACTION_OPEN_DOCUMENT)
//            with replace-vs-merge dialog.
public class SettingsFragment extends Fragment
        implements View.OnClickListener, AdapterView.OnItemSelectedListener {

    static final int REQUEST_EXPORT_JSON = 1001;
    static final int REQUEST_IMPORT_JSON = 1002;

    // Phase 10.5: replace donate/premium-upgrade items with a single "Contribute on GitHub" link.
    static final String GITHUB_CONTRIBUTE_URL = "https://github.com/toadlyBroodle/MinimaList";

    LinearLayout f3871a;
    Button f3872ae;
    Button f3873af;
    Button f3874ag;
    Button f3875ah;
    Button f3876ai;
    Button f3880am; // Export JSON (SAF)
    Button f3880ao; // Import JSON (SAF)
    Button f3880ap; // Contribute on GitHub (Phase 10.5)
    private HostContract f3881an;
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
        this.f3884d = (Switch) this.f3881an.mo4760a(Integer.valueOf(R.id.settings_show_completed));
        this.f3889i = (Switch) this.f3881an.mo4760a(
                Integer.valueOf(R.id.settings_backup_location_switch));
        this.f3872ae = (Button) this.f3881an.mo4760a(
                Integer.valueOf(R.id.settings_delete_completed));
        this.f3873af = (Button) this.f3881an.mo4760a(Integer.valueOf(R.id.settings_default_menu));
        this.f3874ag = (Button) this.f3881an.mo4760a(Integer.valueOf(R.id.settings_backup_data));
        this.f3875ah = (Button) this.f3881an.mo4760a(Integer.valueOf(R.id.settings_load_backup));
        this.f3876ai = (Button) this.f3881an.mo4760a(Integer.valueOf(R.id.settings_export_txt));
        this.f3880am = (Button) this.f3881an.mo4760a(Integer.valueOf(R.id.settings_export_json));
        this.f3880ao = (Button) this.f3881an.mo4760a(Integer.valueOf(R.id.settings_import_json));
        this.f3880ap = (Button) this.f3881an.mo4760a(
                Integer.valueOf(R.id.settings_contribute_github));
        this.f3885e = (Spinner) this.f3881an.mo4760a(Integer.valueOf(R.id.settings_bg_color));
        this.f3886f = (Spinner) this.f3881an.mo4760a(Integer.valueOf(R.id.settings_text_color));
        this.f3887g = (Spinner) this.f3881an.mo4760a(Integer.valueOf(R.id.settings_accent_color));
        this.f3888h = (Spinner) this.f3881an.mo4760a(Integer.valueOf(R.id.settings_text_size));
        this.f3884d.setOnClickListener(this);
        this.f3889i.setOnClickListener(this);
        this.f3872ae.setOnClickListener(this);
        this.f3873af.setOnClickListener(this);
        this.f3874ag.setOnClickListener(this);
        this.f3875ah.setOnClickListener(this);
        this.f3876ai.setOnClickListener(this);
        this.f3880am.setOnClickListener(this);
        this.f3880ao.setOnClickListener(this);
        this.f3880ap.setOnClickListener(this);
        this.f3885e.setOnItemSelectedListener(this);
        this.f3886f.setOnItemSelectedListener(this);
        this.f3887g.setOnItemSelectedListener(this);
        this.f3888h.setOnItemSelectedListener(this);
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
                                R.string.toast_done, Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton(R.string.cancel, null)
                .show();
    }

    // Phase 10.5: open the MinimaList GitHub repo so users can contribute via PRs.
    // resolveActivity() check mirrors the ACTION_VIEW pattern (Phase 6.3) so missing
    // browsers don't crash; manifest <queries> now declares the https scheme.
    void openGithubContribute() {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(GITHUB_CONTRIBUTE_URL));
        if (intent.resolveActivity(this.f3881an.mo4775m().getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    // Phase 9.3: launch SAF file-creation picker; result handled in onActivityResult.
    void m4891ag() {
        Intent intent = new Intent(Intent.ACTION_CREATE_DOCUMENT);
        intent.addCategory(Intent.CATEGORY_OPENABLE);
        intent.setType("application/json");
        intent.putExtra(Intent.EXTRA_TITLE, "sublist_export.json");
        startActivityForResult(intent, REQUEST_EXPORT_JSON);
    }

    // Phase 9.3: launch SAF file-open picker; result handled in onActivityResult.
    void m4892ah() {
        Intent intent = new Intent(Intent.ACTION_OPEN_DOCUMENT);
        intent.addCategory(Intent.CATEGORY_OPENABLE);
        intent.setType("*/*");
        startActivityForResult(intent, REQUEST_IMPORT_JSON);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode != Activity.RESULT_OK || data == null) return;
        Uri uri = data.getData();
        if (uri == null) return;

        if (requestCode == REQUEST_EXPORT_JSON) {
            this.f3881an.mo4779q().exportToUri(uri);
        } else if (requestCode == REQUEST_IMPORT_JSON) {
            android.content.Context ctx = this.f3881an.mo4775m();
            new AlertDialog.Builder(ctx)
                    .setTitle(R.string.dialog_title_import_json)
                    .setMessage(R.string.dialog_message_import_json)
                    .setPositiveButton(R.string.dialog_import_replace,
                            (dialog, which) -> doImportReplace(ctx, uri))
                    .setNeutralButton(R.string.dialog_import_merge,
                            (dialog, which) -> doImportMerge(ctx, uri))
                    .setNegativeButton(R.string.cancel, null)
                    .show();
        }
    }

    private void doImportReplace(android.content.Context ctx, Uri uri) {
        Handler main = new Handler(Looper.getMainLooper());
        AppMain.io().execute(() -> {
            HashMap<String, ArrayList<OutlineRow>> map = OutlineStore.importFromUri(ctx, uri);
            if (map == null) {
                main.post(() -> Toast.makeText(ctx, R.string.toast_json_import_fail,
                        Toast.LENGTH_SHORT).show());
                return;
            }
            main.post(() -> {
                if (!isAdded() || getActivity() == null) return;
                this.f3881an.mo4769a(map);
                this.f3881an.mo4779q().saveAllToRepo();
                Toast.makeText(ctx, R.string.toast_json_imported, Toast.LENGTH_SHORT).show();
            });
        });
    }

    private void doImportMerge(android.content.Context ctx, Uri uri) {
        Handler main = new Handler(Looper.getMainLooper());
        AppMain.io().execute(() -> {
            HashMap<String, ArrayList<OutlineRow>> map = OutlineStore.importFromUri(ctx, uri);
            if (map == null) {
                main.post(() -> Toast.makeText(ctx, R.string.toast_json_import_fail,
                        Toast.LENGTH_SHORT).show());
                return;
            }
            main.post(() -> {
                if (!isAdded() || getActivity() == null) return;
                HashSet<String> existingNames = new HashSet<>();
                for (SublistFragment sf : this.f3881an.mo4786x()) {
                    existingNames.add(sf.mo4848ae());
                }
                HashMap<String, ArrayList<OutlineRow>> toAdd = new HashMap<>();
                for (String key : map.keySet()) {
                    if (!existingNames.contains(key)) toAdd.put(key, map.get(key));
                }
                if (!toAdd.isEmpty()) {
                    ((RowActionListener) this.f3881an).mo4767a(
                            SublistFragment.m4891a(this.f3881an, toAdd));
                    this.f3881an.mo4779q().saveAllToRepo();
                }
                Toast.makeText(ctx, R.string.toast_json_imported, Toast.LENGTH_SHORT).show();
            });
        });
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
        } else if (id == R.id.settings_export_json) {
            m4891ag();
        } else if (id == R.id.settings_export_txt) {
            // Premium gate removed: export always allowed.
            OutlineStore.m4967r();
        } else if (id == R.id.settings_import_json) {
            m4892ah();
        } else if (id == R.id.settings_contribute_github) {
            openGithubContribute();
        } else if (id == R.id.settings_load_backup) {
            m4887ad();
        } else if (id == R.id.settings_show_completed) {
            AppSettings.m4928a(((Switch) view).isChecked());
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
