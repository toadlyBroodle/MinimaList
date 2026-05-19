package ca.toadlybroodledev.minimalist;

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
import ca.toadlybroodledev.minimalist.iface.HostContract;
import ca.toadlybroodledev.minimalist.iface.RowActionListener;
import ca.toadlybroodledev.minimalist.model.OutlineRow;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

// Ported from decompiled ViewOnClickListenerC0562i. Settings page with spinners, switches, buttons.
// Premium gate on export-txt removed (Phase 3.5). Cloud sync methods removed (Phase 3.1/3.3).
// Phase 9.3: JSON export (SAF ACTION_CREATE_DOCUMENT) + JSON import (ACTION_OPEN_DOCUMENT)
//            with replace-vs-merge dialog.
public class SettingsFragment extends Fragment
        implements View.OnClickListener, AdapterView.OnItemSelectedListener {


    // Phase 10.5: replace donate/premium-upgrade items with a single "Contribute on GitHub" link.
    static final String GITHUB_CONTRIBUTE_URL = "https://github.com/toadlyBroodle/MinimaList";

    // Phase 10.8: SAF fallback for Import when the chosen Location has no matching files.
    static final int REQUEST_IMPORT_SAF = 1004;

    LinearLayout f3871a;
    Button f3872ae;
    Button f3873af;
    Button f3880ap; // Contribute on GitHub (Phase 10.5)
    // Phase 10.8: unified Export / Import buttons + Location / Format spinners.
    Button btnExport;
    Button btnImport;
    Spinner spinnerBackupLocation;
    Spinner spinnerBackupFormat;
    private HostContract f3881an;
    Switch f3884d;
    Spinner f3885e;
    Spinner f3886f;
    Spinner f3887g;
    Spinner f3888h;

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
        this.f3872ae = (Button) this.f3881an.mo4760a(
                Integer.valueOf(R.id.settings_delete_completed));
        this.f3873af = (Button) this.f3881an.mo4760a(Integer.valueOf(R.id.settings_default_menu));
        this.btnExport = (Button) this.f3881an.mo4760a(Integer.valueOf(R.id.settings_export));
        this.btnImport = (Button) this.f3881an.mo4760a(Integer.valueOf(R.id.settings_import));
        this.spinnerBackupLocation = (Spinner) this.f3881an.mo4760a(
                Integer.valueOf(R.id.settings_backup_location));
        this.spinnerBackupFormat = (Spinner) this.f3881an.mo4760a(
                Integer.valueOf(R.id.settings_backup_format));
        this.f3880ap = (Button) this.f3881an.mo4760a(
                Integer.valueOf(R.id.settings_contribute_github));
        this.f3885e = (Spinner) this.f3881an.mo4760a(Integer.valueOf(R.id.settings_bg_color));
        this.f3886f = (Spinner) this.f3881an.mo4760a(Integer.valueOf(R.id.settings_text_color));
        this.f3887g = (Spinner) this.f3881an.mo4760a(Integer.valueOf(R.id.settings_accent_color));
        this.f3888h = (Spinner) this.f3881an.mo4760a(Integer.valueOf(R.id.settings_text_size));
        this.f3884d.setOnClickListener(this);
        this.f3872ae.setOnClickListener(this);
        this.f3873af.setOnClickListener(this);
        this.btnExport.setOnClickListener(this);
        this.btnImport.setOnClickListener(this);
        this.f3880ap.setOnClickListener(this);
        this.spinnerBackupLocation.setOnItemSelectedListener(this);
        this.spinnerBackupFormat.setOnItemSelectedListener(this);
        this.f3885e.setOnItemSelectedListener(this);
        this.f3886f.setOnItemSelectedListener(this);
        this.f3887g.setOnItemSelectedListener(this);
        this.f3888h.setOnItemSelectedListener(this);
        this.f3884d.setChecked(AppSettings.m4929a());
        this.spinnerBackupLocation.setAdapter((SpinnerAdapter) new StringArraySpinnerAdapter(
                this.f3881an.mo4775m(), R.array.backup_locations_array));
        this.spinnerBackupFormat.setAdapter((SpinnerAdapter) new StringArraySpinnerAdapter(
                this.f3881an.mo4775m(), R.array.backup_formats_array));
        this.spinnerBackupLocation.setSelection(AppSettings.getBackupLocationIndex());
        this.spinnerBackupFormat.setSelection(AppSettings.getBackupFormatIndex());
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

    void m4889af() {
        new AlertDialog.Builder(this.f3881an.mo4775m())
                .setTitle(R.string.settings_delete_completed)
                .setMessage(R.string.settings_del_comp_confirm)
                .setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        for (OutlineFragment frag : SettingsFragment.this.f3881an.mo4786x()) {
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

    // Phase 10.8: SAF launchers + onActivityResult removed; the unified Export /
    // Import flow uses deterministic app-scoped paths via doExport / doImport.

    private void doImportReplace(android.content.Context ctx, Uri uri) {
        // See doImportTxt for the rationale on capturing host instead of relying
        // on isAdded() — same SAF-round-trip detach race applies to JSON too.
        final HostContract host = this.f3881an;
        Handler main = new Handler(Looper.getMainLooper());
        AppMain.io().execute(() -> {
            HashMap<String, ArrayList<OutlineRow>> map = OutlineStore.importFromUri(ctx, uri);
            if (map == null) {
                main.post(() -> Toast.makeText(ctx, R.string.toast_json_import_fail,
                        Toast.LENGTH_SHORT).show());
                return;
            }
            main.post(() -> {
                if (host == null) return;
                try {
                    host.mo4769a(map);
                    host.mo4779q().saveAllToRepo();
                    Toast.makeText(ctx, R.string.toast_json_imported, Toast.LENGTH_SHORT).show();
                } catch (Exception e) {
                    android.util.Log.e("MinImport", "doImportReplace failed: " + e, e);
                    Toast.makeText(ctx, R.string.toast_json_import_fail,
                            Toast.LENGTH_SHORT).show();
                }
            });
        });
    }

    private void doImportMerge(android.content.Context ctx, Uri uri) {
        final HostContract host = this.f3881an;
        Handler main = new Handler(Looper.getMainLooper());
        AppMain.io().execute(() -> {
            HashMap<String, ArrayList<OutlineRow>> map = OutlineStore.importFromUri(ctx, uri);
            if (map == null) {
                main.post(() -> Toast.makeText(ctx, R.string.toast_json_import_fail,
                        Toast.LENGTH_SHORT).show());
                return;
            }
            main.post(() -> {
                if (host == null) return;
                try {
                    HashSet<String> existingNames = new HashSet<>();
                    for (OutlineFragment sf : host.mo4786x()) {
                        existingNames.add(sf.mo4848ae());
                    }
                    HashMap<String, ArrayList<OutlineRow>> toAdd = new HashMap<>();
                    for (String key : map.keySet()) {
                        if (!existingNames.contains(key)) toAdd.put(key, map.get(key));
                    }
                    if (!toAdd.isEmpty()) {
                        ((RowActionListener) host).mo4767a(
                                OutlineFragment.m4891a(host, toAdd));
                        host.mo4779q().saveAllToRepo();
                    }
                    Toast.makeText(ctx, R.string.toast_json_imported, Toast.LENGTH_SHORT).show();
                } catch (Exception e) {
                    android.util.Log.e("MinImport", "doImportMerge failed: " + e, e);
                    Toast.makeText(ctx, R.string.toast_json_import_fail,
                            Toast.LENGTH_SHORT).show();
                }
            });
        });
    }

    // Phase 10.7: TXT import always merges. A .txt is one sublist; we name it from
    // the file's display name (m4967r exporter stamped a 13-digit epoch on the end,
    // stripped by sublistNameFromUri). On name collision with an existing sublist,
    // we suffix " (2)", " (3)", ... so we never silently drop the import.
    private void doImportTxt(android.content.Context ctx, Uri uri) {
        // Capture the host BEFORE going async. MainActivity.onStop (triggered by
        // the SAF picker opening) calls mo4764a → mo4771b which detaches every
        // current fragment, then onStart re-attaches the active OutlineFragment
        // instead of SettingsFragment — so by the time main.post fires,
        // isAdded() is false. The captured host reference (the MainActivity)
        // outlives that swap; use it directly so the import lands either way.
        final HostContract host = this.f3881an;
        Handler main = new Handler(Looper.getMainLooper());
        AppMain.io().execute(() -> {
            HashMap<String, ArrayList<OutlineRow>> map = OutlineStore.importTxtFromUri(ctx, uri);
            if (map == null || map.isEmpty()) {
                main.post(() -> Toast.makeText(ctx, R.string.toast_txt_import_fail,
                        Toast.LENGTH_SHORT).show());
                return;
            }
            main.post(() -> {
                if (host == null) return;
                try {
                    HashSet<String> existingNames = new HashSet<>();
                    for (OutlineFragment sf : host.mo4786x()) {
                        existingNames.add(sf.mo4848ae());
                    }
                    HashMap<String, ArrayList<OutlineRow>> toAdd = new HashMap<>();
                    for (String key : map.keySet()) {
                        String name = key;
                        int suffix = 2;
                        while (existingNames.contains(name)) {
                            name = key + " (" + suffix + ")";
                            suffix++;
                        }
                        toAdd.put(name, map.get(key));
                        existingNames.add(name);
                    }
                    ((RowActionListener) host).mo4767a(
                            OutlineFragment.m4891a(host, toAdd));
                    host.mo4779q().saveAllToRepo();
                    Toast.makeText(ctx, R.string.toast_txt_imported, Toast.LENGTH_SHORT).show();
                } catch (Exception e) {
                    android.util.Log.e("MinImport", "doImportTxt add failed: " + e, e);
                    Toast.makeText(ctx, R.string.toast_txt_import_fail,
                            Toast.LENGTH_SHORT).show();
                }
            });
        });
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.settings_default_menu) {
            this.f3882b.show(this.f3881an.mo4785w(), "dialog_prefs");
        } else if (id == R.id.settings_delete_completed) {
            m4889af();
        } else if (id == R.id.settings_export) {
            doExport();
        } else if (id == R.id.settings_import) {
            doImport();
        } else if (id == R.id.settings_contribute_github) {
            openGithubContribute();
        } else if (id == R.id.settings_show_completed) {
            AppSettings.m4928a(((Switch) view).isChecked());
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        int adapterId = adapterView.getId();
        // Phase 10.8: backup spinners persist their index immediately on selection;
        // no zero-slot label like the color spinners, so we act on every position.
        if (adapterId == R.id.settings_backup_location) {
            AppSettings.setBackupLocationIndex(i);
            return;
        }
        if (adapterId == R.id.settings_backup_format) {
            AppSettings.setBackupFormatIndex(i);
            return;
        }
        if (i != 0) {
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

    // Phase 10.8: unified Export — write all open sublists to the chosen
    // Location in the chosen Format. No SAF; deterministic file paths so the
    // user knows where to find the file (toast confirms the path).
    private void doExport() {
        android.content.Context ctx = this.f3881an.mo4775m();
        int locIdx = AppSettings.getBackupLocationIndex();
        int fmtIdx = AppSettings.getBackupFormatIndex();
        java.io.File dir = locIdx == 1
                ? ctx.getExternalFilesDir(null)
                : ctx.getFilesDir();
        Handler main = new Handler(Looper.getMainLooper());
        AppMain.io().execute(() -> {
            String path = fmtIdx == 1
                    ? OutlineStore.exportTxtToDir(dir)
                    : OutlineStore.exportJsonToDir(dir);
            main.post(() -> {
                if (!isAdded() || getActivity() == null) return;
                if (path == null) {
                    Toast.makeText(ctx, R.string.toast_json_export_fail,
                            Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(ctx,
                            getString(R.string.toast_export_done_fmt, path),
                            Toast.LENGTH_LONG).show();
                }
            });
        });
    }

    // Phase 10.8: unified Import — scan the chosen Location for files with the
    // chosen Format's extension. 0 found = toast; 1 found = import directly;
    // multiple = AlertDialog chooser.
    private void doImport() {
        android.content.Context ctx = this.f3881an.mo4775m();
        int locIdx = AppSettings.getBackupLocationIndex();
        int fmtIdx = AppSettings.getBackupFormatIndex();
        java.io.File dir = locIdx == 1
                ? ctx.getExternalFilesDir(null)
                : ctx.getFilesDir();
        final String ext = fmtIdx == 1 ? ".txt" : ".json";
        java.io.File[] all = dir == null ? null : dir.listFiles();
        java.util.ArrayList<java.io.File> matches = new java.util.ArrayList<>();
        if (all != null) {
            for (java.io.File f : all) {
                if (f.isFile() && f.getName().toLowerCase().endsWith(ext)) matches.add(f);
            }
        }
        android.util.Log.d("MinImport", "doImport loc=" + locIdx + " fmt=" + fmtIdx
                + " dir=" + dir + " all=" + (all == null ? -1 : all.length)
                + " matches=" + matches.size());
        if (matches.isEmpty()) {
            // No app-scoped files at the chosen Location — fall through to SAF so the
            // user can browse to wherever the file actually lives (Downloads, etc.).
            launchSafImport(fmtIdx);
            return;
        }
        if (matches.size() == 1) {
            importByUri(ctx, Uri.fromFile(matches.get(0)), fmtIdx);
            return;
        }
        String[] names = new String[matches.size()];
        for (int i = 0; i < matches.size(); i++) names[i] = matches.get(i).getName();
        new AlertDialog.Builder(ctx)
                .setTitle(R.string.dialog_title_import_pick_file)
                .setItems(names, (dialog, which) ->
                        importByUri(ctx, Uri.fromFile(matches.get(which)), fmtIdx))
                .setNeutralButton(R.string.settings_browse, (d, w) -> launchSafImport(fmtIdx))
                .setNegativeButton(R.string.cancel, null)
                .show();
    }

    private void launchSafImport(int fmtIdx) {
        android.util.Log.d("MinImport", "launchSafImport fmt=" + fmtIdx);
        Intent intent = new Intent(Intent.ACTION_OPEN_DOCUMENT);
        intent.addCategory(Intent.CATEGORY_OPENABLE);
        // text/plain for TXT, */* for JSON since not all pickers recognize the
        // application/json mime and we don't want to hide the user's file.
        intent.setType(fmtIdx == 1 ? "text/plain" : "*/*");
        startActivityForResult(intent, REQUEST_IMPORT_SAF);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        android.util.Log.d("MinImport", "onActivityResult req=" + requestCode
                + " res=" + resultCode + " data=" + (data == null ? "null" : data.getData()));
        if (resultCode != Activity.RESULT_OK || data == null) return;
        Uri uri = data.getData();
        if (uri == null) return;
        if (requestCode == REQUEST_IMPORT_SAF) {
            importByUri(this.f3881an.mo4775m(), uri, AppSettings.getBackupFormatIndex());
        }
    }

    private void importByUri(android.content.Context ctx, Uri uri, int fmtIdx) {
        android.util.Log.d("MinImport", "importByUri uri=" + uri + " fmt=" + fmtIdx);
        if (fmtIdx == 1) {
            doImportTxt(ctx, uri);
        } else {
            // For JSON, keep the legacy replace-vs-merge dialog.
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

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
