package ca.toadlybroodledev.sublist;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.p006a.ComponentCallbacksC0154j;
import android.support.v7.app.DialogInterfaceC0347d;
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
import ca.toadlybroodledev.sublist.p031b.InterfaceC0549a;
import ca.toadlybroodledev.sublist.p032c.C0554a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: ca.toadlybroodledev.sublist.i */
/* JADX INFO: loaded from: classes.dex */
public class ViewOnClickListenerC0562i extends ComponentCallbacksC0154j implements View.OnClickListener, AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: a */
    LinearLayout f3871a;

    /* JADX INFO: renamed from: ae */
    Button f3872ae;

    /* JADX INFO: renamed from: af */
    Button f3873af;

    /* JADX INFO: renamed from: ag */
    Button f3874ag;

    /* JADX INFO: renamed from: ah */
    Button f3875ah;

    /* JADX INFO: renamed from: ai */
    Button f3876ai;

    /* JADX INFO: renamed from: aj */
    Button f3877aj;

    /* JADX INFO: renamed from: ak */
    Button f3878ak;

    /* JADX INFO: renamed from: al */
    Button f3879al;

    /* JADX INFO: renamed from: an */
    private InterfaceC0549a f3881an;

    /* JADX INFO: renamed from: c */
    Switch f3883c;

    /* JADX INFO: renamed from: d */
    Switch f3884d;

    /* JADX INFO: renamed from: e */
    Spinner f3885e;

    /* JADX INFO: renamed from: f */
    Spinner f3886f;

    /* JADX INFO: renamed from: g */
    Spinner f3887g;

    /* JADX INFO: renamed from: h */
    Spinner f3888h;

    /* JADX INFO: renamed from: i */
    Switch f3889i;

    /* JADX INFO: renamed from: am */
    private final String f3880am = "fuckn" + getClass().getSimpleName();

    /* JADX INFO: renamed from: b */
    ViewOnClickListenerC0548b f3882b = ViewOnClickListenerC0548b.m4843ac();

    @Override // android.support.v4.p006a.ComponentCallbacksC0154j
    /* JADX INFO: renamed from: a */
    public View mo914a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.mo914a(layoutInflater, viewGroup, bundle);
        return layoutInflater.inflate(R.layout.fragment_settings, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.support.v4.p006a.ComponentCallbacksC0154j
    /* JADX INFO: renamed from: a */
    public void mo868a(Context context) {
        super.mo868a(context);
        m952d(true);
        this.f3881an = (InterfaceC0549a) context;
    }

    @Override // android.support.v4.p006a.ComponentCallbacksC0154j
    /* JADX INFO: renamed from: a */
    public void mo935a(View view, Bundle bundle) {
        super.mo935a(view, bundle);
        this.f3871a = (LinearLayout) this.f3881an.mo4760a(Integer.valueOf(R.id.fragment_settings_linear_layout));
        this.f3883c = (Switch) this.f3881an.mo4760a(Integer.valueOf(R.id.settings_send_anon_data));
        this.f3884d = (Switch) this.f3881an.mo4760a(Integer.valueOf(R.id.settings_show_completed));
        this.f3889i = (Switch) this.f3881an.mo4760a(Integer.valueOf(R.id.settings_backup_location_switch));
        this.f3872ae = (Button) this.f3881an.mo4760a(Integer.valueOf(R.id.settings_delete_completed));
        this.f3873af = (Button) this.f3881an.mo4760a(Integer.valueOf(R.id.settings_default_menu));
        this.f3877aj = (Button) this.f3881an.mo4760a(Integer.valueOf(R.id.settings_rate));
        this.f3878ak = (Button) this.f3881an.mo4760a(Integer.valueOf(R.id.settings_support));
        this.f3879al = (Button) this.f3881an.mo4760a(Integer.valueOf(R.id.settings_privacy_policy));
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
        this.f3883c.setChecked(C0566m.m4946k());
        this.f3884d.setChecked(C0566m.m4929a());
        this.f3889i.setChecked(C0566m.m4932b());
        this.f3885e.setAdapter((SpinnerAdapter) new C0570q(this.f3881an.mo4775m(), R.array.colors_500_array));
        this.f3886f.setAdapter((SpinnerAdapter) new C0570q(this.f3881an.mo4775m(), R.array.colors_text_array));
        this.f3887g.setAdapter((SpinnerAdapter) new C0570q(this.f3881an.mo4775m(), R.array.colors_a400_array));
        this.f3888h.setAdapter((SpinnerAdapter) new C0570q(this.f3881an.mo4775m(), R.array.size_text_array));
        this.f3881an.mo4772b(false);
    }

    /* JADX INFO: renamed from: a */
    public void m4885a(String[] strArr, String str) {
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra("android.intent.extra.EMAIL", strArr);
        intent.putExtra("android.intent.extra.SUBJECT", str);
        if (intent.resolveActivity(this.f3881an.mo4775m().getPackageManager()) != null) {
            m926a(intent);
        }
    }

    /* JADX INFO: renamed from: ac */
    void m4886ac() {
        DialogInterfaceC0347d.a aVar = new DialogInterfaceC0347d.a(this.f3881an.mo4775m());
        aVar.m2591a(R.string.settings_backup_data);
        aVar.m2598b(R.string.dialog_message_save_backup);
        aVar.m2592a(R.string.ok, new DialogInterface.OnClickListener() { // from class: ca.toadlybroodledev.sublist.i.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                ViewOnClickListenerC0562i.this.f3881an.mo4779q().m4976a(true, ViewOnClickListenerC0562i.this.f3889i.isChecked());
            }
        });
        aVar.m2599b(R.string.cancel, null);
        aVar.m2603c();
    }

    /* JADX INFO: renamed from: ad */
    void m4887ad() {
        DialogInterfaceC0347d.a aVar = new DialogInterfaceC0347d.a(this.f3881an.mo4775m());
        aVar.m2591a(R.string.settings_load_backup);
        aVar.m2598b(R.string.dialog_message_load_backup);
        aVar.m2592a(R.string.ok, new DialogInterface.OnClickListener() { // from class: ca.toadlybroodledev.sublist.i.2
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                HashMap<String, ArrayList<C0554a>> mapM4977b = ViewOnClickListenerC0562i.this.f3881an.mo4779q().m4977b(true, ViewOnClickListenerC0562i.this.f3889i.isChecked());
                if (mapM4977b != null) {
                    ViewOnClickListenerC0562i.this.f3881an.mo4769a(mapM4977b);
                }
            }
        });
        aVar.m2599b(R.string.cancel, null);
        aVar.m2603c();
    }

    /* JADX INFO: renamed from: ae */
    void m4888ae() {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + this.f3881an.mo4775m().getPackageName()));
        intent.addFlags(1208483840);
        try {
            m926a(intent);
        } catch (ActivityNotFoundException e) {
            m926a(new Intent("android.intent.action.VIEW", Uri.parse("http://play.google.com/store/apps/details?id=" + this.f3881an.mo4775m().getPackageName())));
        }
    }

    /* JADX INFO: renamed from: af */
    void m4889af() {
        DialogInterfaceC0347d.a aVar = new DialogInterfaceC0347d.a(this.f3881an.mo4775m());
        aVar.m2591a(R.string.settings_delete_completed);
        aVar.m2598b(R.string.settings_del_comp_confirm);
        aVar.m2592a(R.string.ok, new DialogInterface.OnClickListener() { // from class: ca.toadlybroodledev.sublist.i.3
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                Iterator<C0563j> it = ViewOnClickListenerC0562i.this.f3881an.mo4786x().iterator();
                while (it.hasNext()) {
                    it.next().mo4849af().m4998c();
                }
                Toast.makeText(ViewOnClickListenerC0562i.this.m966j(), R.string.toast_done, 0).show();
            }
        });
        aVar.m2599b(R.string.cancel, null);
        aVar.m2603c();
    }

    /* JADX INFO: renamed from: b */
    public void m4890b() {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("http://toadlybroodle.ca/portfolio/apps/apps-privacy-policy/"));
        m926a(intent);
    }

    @Override // android.support.v4.p006a.ComponentCallbacksC0154j
    /* JADX INFO: renamed from: d */
    public void mo877d() {
        super.mo877d();
        if (C0566m.m4946k()) {
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        String str = null;
        switch (view.getId()) {
            case R.id.settings_backup_data /* 2131296583 */:
                m4886ac();
                str = "Setting_backupSave";
                break;
            case R.id.settings_backup_location_switch /* 2131296584 */:
                boolean zIsChecked = ((Switch) view).isChecked();
                C0566m.m4931b(zIsChecked);
                str = "Setting_saveExtern_" + zIsChecked;
                break;
            case R.id.settings_default_menu /* 2131296586 */:
                this.f3882b.m866a(this.f3881an.mo4785w(), "dialog_prefs");
                str = "Setting_setPrefs";
                break;
            case R.id.settings_delete_completed /* 2131296587 */:
                m4889af();
                str = "Setting_delCompl";
                break;
            case R.id.settings_export_txt /* 2131296588 */:
                if (this.f3881an.mo4778p().m4914b()) {
                    C0567n.m4967r();
                    str = "Setting_exportTxt";
                }
                break;
            case R.id.settings_load_backup /* 2131296589 */:
                m4887ad();
                str = "Setting_backupLoad";
                break;
            case R.id.settings_privacy_policy /* 2131296590 */:
                m4890b();
                str = "Setting_viewPrivPol";
                break;
            case R.id.settings_rate /* 2131296591 */:
                m4888ae();
                str = "Setting_rate";
                break;
            case R.id.settings_send_anon_data /* 2131296592 */:
                boolean zIsChecked2 = ((Switch) view).isChecked();
                C0566m.m4935c(zIsChecked2);
                str = "Setting_sendAnonAnal_" + zIsChecked2;
                break;
            case R.id.settings_show_completed /* 2131296593 */:
                boolean zIsChecked3 = ((Switch) view).isChecked();
                C0566m.m4928a(zIsChecked3);
                str = "Setting_showCompl_" + zIsChecked3;
                break;
            case R.id.settings_support /* 2131296594 */:
                m4885a(new String[]{"toadlybroodledev@gmail.com"}, m916a(R.string.email_support_subject));
                str = "Setting_sendDevEmail";
                break;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        String str = null;
        if (i != 0) {
            switch (adapterView.getId()) {
                case R.id.settings_accent_color /* 2131296582 */:
                    C0566m.m4938d(i);
                    str = "Accent Color";
                    break;
                case R.id.settings_bg_color /* 2131296585 */:
                    C0566m.m4927a(i);
                    str = "Background Color";
                    break;
                case R.id.settings_text_color /* 2131296595 */:
                    C0566m.m4934c(i);
                    str = "Text Color";
                    break;
                case R.id.settings_text_size /* 2131296596 */:
                    C0566m.m4930b(i);
                    str = "Text Size";
                    break;
            }
            adapterView.setSelection(0);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
