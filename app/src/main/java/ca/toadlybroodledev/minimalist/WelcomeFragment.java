package ca.toadlybroodledev.minimalist;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import ca.toadlybroodledev.minimalist.iface.HostContract;
import ca.toadlybroodledev.minimalist.model.OutlineRow;
import java.util.ArrayList;

// Ported from decompiled C0560g. Static welcome/intro sublist fragment (read-only rows).
public class WelcomeFragment extends OutlineFragment {

    private final String f3862b = "Fuckn" + getClass().getSimpleName();
    private HostContract f3863c;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedState) {
        this.f3863c = (HostContract) getActivity();
        m4902a(new OutlineTree(this.f3863c, this, m4880b()));
        return inflater.inflate(R.layout.fragment_sublist, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedState) {
        m4900a((LinearLayout) ((ScrollView) view).getChildAt(0));
        this.f3908a = new IndentManager(this);
        this.f3908a.m4983a(this);
    }

    ArrayList<OutlineRow> m4880b() {
        ArrayList<OutlineRow> rows = new ArrayList<>();
        rows.add(new OutlineRow(0, getString(R.string.info_usage_insructions), false, true, 0L, true));
        rows.add(new OutlineRow(1, getString(R.string.info_tap_bullet_pts), false, false, 0L, true));
        rows.add(new OutlineRow(1, getString(R.string.info_tap_plus), false, false, 0L, true));
        rows.add(new OutlineRow(1, getString(R.string.info_tap_checkmark), false, false, 0L, true));
        rows.add(new OutlineRow(1, getString(R.string.info_tap_arrows), false, false, 0L, true));
        rows.add(new OutlineRow(1, getString(R.string.info_longpress_focus), false, false, 0L, true));
        rows.add(new OutlineRow(1, getString(R.string.info_longpress_copypaste), false, false, 0L, true));
        rows.add(new OutlineRow(1, getString(R.string.info_longpress_titles), false, false, 0L, true));
        rows.add(new OutlineRow(1, getString(R.string.info_freq_backup), false, false, 0L, true));
        rows.add(new OutlineRow(0, getString(R.string.info_basic_features), false, true, 0L, true));
        rows.add(new OutlineRow(1, getString(R.string.info_entries), false, true, 0L, true));
        rows.add(new OutlineRow(2, getString(R.string.info_add_remove), false, false, 0L, true));
        rows.add(new OutlineRow(2, getString(R.string.info_move), false, true, 0L, true));
        rows.add(new OutlineRow(3, getString(R.string.info_up_down), false, false, 0L, true));
        rows.add(new OutlineRow(3, getString(R.string.info_indent_outdent), false, false, 0L, true));
        rows.add(new OutlineRow(2, getString(R.string.info_temp_focus_ent), false, false, 0L, true));
        rows.add(new OutlineRow(2, getString(R.string.info_complete), false, true, 0L, true));
        rows.add(new OutlineRow(3, getString(R.string.info_mark_complete), true, false, 0L, true));
        rows.add(new OutlineRow(3, getString(R.string.info_show_hide_compl), false, false, 0L, true));
        rows.add(new OutlineRow(1, getString(R.string.info_nested_structure), false, true, 0L, true));
        rows.add(new OutlineRow(2, getString(R.string.info_children_collapse), false, false, 0L, true));
        rows.add(new OutlineRow(2, getString(R.string.info_children_move_parents), false, false, 0L, true));
        rows.add(new OutlineRow(2, getString(R.string.info_children_compldel_parents), false, false, 0L, true));
        rows.add(new OutlineRow(1, getString(R.string.info_design), false, true, 0L, true));
        rows.add(new OutlineRow(2, getString(R.string.info_style_cust), false, false, 0L, true));
        rows.add(new OutlineRow(3, getString(R.string.info_bg_color), false, false, 0L, true));
        rows.add(new OutlineRow(3, getString(R.string.info_accent_color), false, false, 0L, true));
        rows.add(new OutlineRow(3, getString(R.string.info_text_color), false, false, 0L, true));
        rows.add(new OutlineRow(3, getString(R.string.info_text_size), false, false, 0L, true));
        rows.add(new OutlineRow(1, getString(R.string.info_data), false, true, 0L, true));
        rows.add(new OutlineRow(2, getString(R.string.info_search_ents_keywords), false, false, 0L, true));
        rows.add(new OutlineRow(2, getString(R.string.info_backup), false, true, 0L, true));
        rows.add(new OutlineRow(3, getString(R.string.info_saveload_local), false, false, 0L, true));
        // Phase 10.4/10.5: dropped Personal Stats, Premium Features, and invite-promo
        // rows (cloud profile + premium-upgrade UX retired).
        rows.add(new OutlineRow(1, getString(R.string.info_live_widget), false, true, 0L, true));
        rows.add(new OutlineRow(2, getString(R.string.info_widget_homescreen_displays), false, false, 0L, true));
        rows.add(new OutlineRow(2, getString(R.string.info_longpress_widget_resize), false, false, 0L, true));
        rows.add(new OutlineRow(1, getString(R.string.info_reminder_notifs), false, true, 0L, true));
        rows.add(new OutlineRow(2, getString(R.string.info_indiv_reminders_notifs), false, false, 0L, true));
        rows.add(new OutlineRow(2, getString(R.string.info_view_upcoming_rem_persist_notif), false, false, 0L, true));
        rows.add(new OutlineRow(1, getString(R.string.info_copypaste_btw_lists), false, false, 0L, true));
        rows.add(new OutlineRow(1, getString(R.string.info_data_bkup_sync), false, true, 0L, true));
        // Phase 10.4: dropped firebase-cloud sync row.
        rows.add(new OutlineRow(2, getString(R.string.info_saveload_extern), false, true, 0L, true));
        rows.add(new OutlineRow(3, getString(R.string.info_save_loc), false, false, 0L, true));
        rows.add(new OutlineRow(2, getString(R.string.info_export_to), false, true, 0L, true));
        rows.add(new OutlineRow(3, getString(R.string.info_ext_save_loc), false, false, 0L, true));
        rows.add(new OutlineRow(3, getString(R.string.info_curr_vis_ents_exp_txt), false, false, 0L, true));
        rows.add(new OutlineRow(3, getString(R.string.info_txt_exp_compl_x), false, false, 0L, true));
        rows.add(new OutlineRow(0, getString(R.string.info_about), false, true, 0L, true));
        rows.add(new OutlineRow(1, getString(R.string.info_regular_updated_improved), false, false, 0L, true));
        rows.add(new OutlineRow(1, getString(R.string.info_build_vers) + 106, false, false, 0L, true));
        rows.add(new OutlineRow(1, getString(R.string.info_contact_me), false, true, 0L, true));
        rows.add(new OutlineRow(2, getString(R.string.info_contact_personally_comments), false, false, 0L, true));
        rows.add(new OutlineRow(3, getString(R.string.info_my_email), false, false, 0L, true));
        rows.add(new OutlineRow(3, getString(R.string.info_my_website), false, false, 0L, true));
        return rows;
    }
}
