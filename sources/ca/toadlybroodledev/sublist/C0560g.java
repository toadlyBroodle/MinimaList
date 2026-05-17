package ca.toadlybroodledev.sublist;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import ca.toadlybroodledev.sublist.p031b.InterfaceC0549a;
import ca.toadlybroodledev.sublist.p032c.C0554a;
import java.util.ArrayList;

/* JADX INFO: renamed from: ca.toadlybroodledev.sublist.g */
/* JADX INFO: loaded from: classes.dex */
public class C0560g extends C0563j {

    /* JADX INFO: renamed from: b */
    private final String f3862b = "Fuckn" + getClass().getSimpleName();

    /* JADX INFO: renamed from: c */
    private InterfaceC0549a f3863c;

    @Override // ca.toadlybroodledev.sublist.C0563j, android.support.v4.p006a.ComponentCallbacksC0154j
    /* JADX INFO: renamed from: a */
    public View mo914a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f3863c = (InterfaceC0549a) m966j();
        m4902a(new C0571r(this.f3863c, this, m4880b()));
        return layoutInflater.inflate(R.layout.fragment_sublist, viewGroup, false);
    }

    @Override // ca.toadlybroodledev.sublist.C0563j, android.support.v4.p006a.ComponentCallbacksC0154j
    /* JADX INFO: renamed from: a */
    public void mo935a(View view, Bundle bundle) {
        m4900a((LinearLayout) ((ScrollView) view).getChildAt(0));
        this.f3908a = new C0569p(this);
        this.f3908a.m4983a(this);
    }

    /* JADX INFO: renamed from: b */
    ArrayList<C0554a> m4880b() {
        ArrayList<C0554a> arrayList = new ArrayList<>();
        arrayList.add(new C0554a(0, m916a(R.string.info_usage_insructions), false, true, 0L, true));
        arrayList.add(new C0554a(1, m916a(R.string.info_tap_bullet_pts), false, false, 0L, true));
        arrayList.add(new C0554a(1, m916a(R.string.info_tap_plus), false, false, 0L, true));
        arrayList.add(new C0554a(1, m916a(R.string.info_tap_checkmark), false, false, 0L, true));
        arrayList.add(new C0554a(1, m916a(R.string.info_tap_arrows), false, false, 0L, true));
        arrayList.add(new C0554a(1, m916a(R.string.info_longpress_focus), false, false, 0L, true));
        arrayList.add(new C0554a(1, m916a(R.string.info_longpress_copypaste), false, false, 0L, true));
        arrayList.add(new C0554a(1, m916a(R.string.info_longpress_titles), false, false, 0L, true));
        arrayList.add(new C0554a(1, m916a(R.string.info_freq_backup), false, false, 0L, true));
        arrayList.add(new C0554a(0, m916a(R.string.info_basic_features), false, true, 0L, true));
        arrayList.add(new C0554a(1, m916a(R.string.info_entries), false, true, 0L, true));
        arrayList.add(new C0554a(2, m916a(R.string.info_add_remove), false, false, 0L, true));
        arrayList.add(new C0554a(2, m916a(R.string.info_move), false, true, 0L, true));
        arrayList.add(new C0554a(3, m916a(R.string.info_up_down), false, false, 0L, true));
        arrayList.add(new C0554a(3, m916a(R.string.info_indent_outdent), false, false, 0L, true));
        arrayList.add(new C0554a(2, m916a(R.string.info_temp_focus_ent), false, false, 0L, true));
        arrayList.add(new C0554a(2, m916a(R.string.info_complete), false, true, 0L, true));
        arrayList.add(new C0554a(3, m916a(R.string.info_mark_complete), true, false, 0L, true));
        arrayList.add(new C0554a(3, m916a(R.string.info_show_hide_compl), false, false, 0L, true));
        arrayList.add(new C0554a(1, m916a(R.string.info_nested_structure), false, true, 0L, true));
        arrayList.add(new C0554a(2, m916a(R.string.info_children_collapse), false, false, 0L, true));
        arrayList.add(new C0554a(2, m916a(R.string.info_children_move_parents), false, false, 0L, true));
        arrayList.add(new C0554a(2, m916a(R.string.info_children_compldel_parents), false, false, 0L, true));
        arrayList.add(new C0554a(1, m916a(R.string.info_design), false, true, 0L, true));
        arrayList.add(new C0554a(2, m916a(R.string.info_style_cust), false, false, 0L, true));
        arrayList.add(new C0554a(3, m916a(R.string.info_bg_color), false, false, 0L, true));
        arrayList.add(new C0554a(3, m916a(R.string.info_accent_color), false, false, 0L, true));
        arrayList.add(new C0554a(3, m916a(R.string.info_text_color), false, false, 0L, true));
        arrayList.add(new C0554a(3, m916a(R.string.info_text_size), false, false, 0L, true));
        arrayList.add(new C0554a(1, m916a(R.string.info_data), false, true, 0L, true));
        arrayList.add(new C0554a(2, m916a(R.string.info_search_ents_keywords), false, false, 0L, true));
        arrayList.add(new C0554a(2, m916a(R.string.info_backup), false, true, 0L, true));
        arrayList.add(new C0554a(3, m916a(R.string.info_saveload_local), false, false, 0L, true));
        arrayList.add(new C0554a(2, m916a(R.string.info_personal_stats), false, true, 0L, true));
        arrayList.add(new C0554a(3, m916a(R.string.info_track_personal_stats), false, false, 0L, true));
        arrayList.add(new C0554a(0, m916a(R.string.info_prem_features), false, true, 0L, true));
        arrayList.add(new C0554a(1, m916a(R.string.info_unlock_prem_features_forever), false, true, 0L, true));
        arrayList.add(new C0554a(2, m916a(R.string.info_signed_in_enable_prem_features), false, false, 0L, true));
        arrayList.add(new C0554a(1, m916a(R.string.info_remove_ads), false, false, 0L, true));
        arrayList.add(new C0554a(1, m916a(R.string.info_try_prem_invites), false, true, 0L, true));
        arrayList.add(new C0554a(2, m916a(R.string.info_10_days_per_invite), false, false, 0L, true));
        arrayList.add(new C0554a(1, m916a(R.string.info_live_widget), false, true, 0L, true));
        arrayList.add(new C0554a(2, m916a(R.string.info_widget_homescreen_displays), false, false, 0L, true));
        arrayList.add(new C0554a(2, m916a(R.string.info_longpress_widget_resize), false, false, 0L, true));
        arrayList.add(new C0554a(1, m916a(R.string.info_reminder_notifs), false, true, 0L, true));
        arrayList.add(new C0554a(2, m916a(R.string.info_indiv_reminders_notifs), false, false, 0L, true));
        arrayList.add(new C0554a(2, m916a(R.string.info_view_upcoming_rem_persist_notif), false, false, 0L, true));
        arrayList.add(new C0554a(1, m916a(R.string.info_copypaste_btw_lists), false, false, 0L, true));
        arrayList.add(new C0554a(1, m916a(R.string.info_data_bkup_sync), false, true, 0L, true));
        arrayList.add(new C0554a(2, m916a(R.string.info_sync_lists_btw_devices_fb), false, false, 0L, true));
        arrayList.add(new C0554a(2, m916a(R.string.info_saveload_extern), false, true, 0L, true));
        arrayList.add(new C0554a(3, m916a(R.string.info_save_loc), false, false, 0L, true));
        arrayList.add(new C0554a(2, m916a(R.string.info_export_to), false, true, 0L, true));
        arrayList.add(new C0554a(3, m916a(R.string.info_ext_save_loc), false, false, 0L, true));
        arrayList.add(new C0554a(3, m916a(R.string.info_curr_vis_ents_exp_txt), false, false, 0L, true));
        arrayList.add(new C0554a(3, m916a(R.string.info_txt_exp_compl_x), false, false, 0L, true));
        arrayList.add(new C0554a(0, m916a(R.string.info_about), false, true, 0L, true));
        arrayList.add(new C0554a(1, m916a(R.string.info_regular_updated_improved), false, false, 0L, true));
        arrayList.add(new C0554a(1, m916a(R.string.info_build_vers) + 106, false, false, 0L, true));
        arrayList.add(new C0554a(1, m916a(R.string.info_contact_me), false, true, 0L, true));
        arrayList.add(new C0554a(2, m916a(R.string.info_contact_personally_comments), false, false, 0L, true));
        arrayList.add(new C0554a(3, m916a(R.string.info_my_email), false, false, 0L, true));
        arrayList.add(new C0554a(3, m916a(R.string.info_my_website), false, false, 0L, true));
        return arrayList;
    }
}
