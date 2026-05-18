package ca.toadlybroodledev.sublist;

import android.graphics.Color;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import ca.toadlybroodledev.sublist.iface.OutlineHost;
import java.util.ArrayList;

// Ported from decompiled C0569p. Renders the visible row list into the sublist LinearLayout.
public class IndentManager {

    private OutlineHost f3983a;

    IndentManager(OutlineHost outlineHost) {
        this.f3983a = outlineHost;
    }

    private void m4980a(SublistFragment fragment, ArrayList<OutlineRowView> rows) {
        int start;
        int end;
        int i = 0;
        if (SublistFragment.m4893aj() == -1) {
            end = rows.size();
            start = 0;
        } else {
            start = SublistFragment.m4893aj();
            end = SublistFragment.m4894ak() + 1;
        }
        int size = rows.size();
        if (end >= size || start >= size) {
            SublistFragment.m4897b(-1, -1);
            i = 0;
            end = rows.size();
        } else {
            i = start;
        }
        while (i < end) {
            OutlineRowView rv = rows.get(i);
            if (AppSettings.m4929a() || !rv.f3823f) {
                m4981b(fragment, rv);
            }
            i = (rv.f3824g ? this.f3983a.mo4849af().m5005i(rv) : i) + 1;
        }
    }

    private void m4981b(SublistFragment fragment, OutlineRowView rv) {
        this.f3983a.mo4849af().f3987b.add(rv);
        switch (AppSettings.f3950m) {
            case 0: rv.f3822e.setImeOptions(1); break;
            case 1: rv.f3822e.setImeOptions(5); break;
            case 2: rv.f3822e.setImeOptions(2); break;
            case 3: rv.f3822e.setImeOptions(6); break;
        }
        if (DateTimeUtil.m5014c() > rv.f3825h) {
            rv.f3825h = 0L;
        }
        m4982c(fragment, rv);
        if (rv.f3823f) {
            rv.f3822e.setTextColor(AppSettings.m4944i());
        } else {
            rv.f3822e.setTextColor(AppSettings.m4943h());
        }
        if (rv.f3826i) {
            rv.f3822e.setTextColor(Color.parseColor("#FAFAFA"));
            rv.f3822e.setEnabled(false);
        }
        m4984a(fragment, rv);
    }

    private void m4982c(SublistFragment fragment, OutlineRowView rv) {
        String base = rv.f3825h != 0 ? "bullet_bell" : "bullet";
        String name = rv.f3824g ? base + "_full" : base + "_empty";
        if (!rv.f3826i) {
            switch (AppSettings.m4942g()) {
                case "#FAFAFA": name = name + "_white"; break;
                case "#616161": name = name + "_grey"; break;
                case "#101010": name = name + "_black"; break;
            }
        } else {
            name = name + "_white";
        }
        rv.f3821d.setImageResource(fragment.getResources().getIdentifier(
                name, "drawable", fragment.getContext().getPackageName()));
    }

    void m4983a(SublistFragment fragment) {
        this.f3983a.mo4850ah().removeAllViews();
        this.f3983a.mo4849af().f3987b.clear();
        m4980a(fragment, this.f3983a.mo4849af().m4988a());
    }

    protected void m4984a(SublistFragment fragment, OutlineRowView rv) {
        LinearLayout.LayoutParams lp;
        rv.f3820c.setPadding(
                this.f3983a.mo4853e(R.dimen.sublist_left_margin)
                        + (this.f3983a.mo4853e(R.dimen.entry_indent) * rv.m4859a()),
                0, 0, 0);
        rv.f3822e.setTextSize(Float.parseFloat(AppSettings.m4941f()));
        if (AppSettings.f3949l) {
            rv.f3822e.setSingleLine();
        } else {
            rv.f3822e.setMaxLines(4);
            lp = new LinearLayout.LayoutParams(-2, -2);
            switch (AppSettings.m4941f()) {
                case "16f": lp.topMargin = 0; break;
                case "20f": lp.topMargin = 2; break;
                case "24f": lp.topMargin = 10; break;
            }
            rv.f3821d.setLayoutParams(lp);
            rv.f3821d.setScaleX(1.0f);
            rv.f3821d.setScaleY(1.0f);
        }
        if (rv.f3823f) {
            rv.f3822e.setPaintFlags(rv.f3822e.getPaintFlags() | 16);
        } else {
            rv.f3822e.setPaintFlags(rv.f3822e.getPaintFlags() & (-17));
        }
        ViewParent parent = rv.f3820c.getParent();
        if (parent != null) {
            ((ViewGroup) parent).removeView(rv.f3820c);
        }
        this.f3983a.mo4850ah().addView(rv.f3820c);
    }
}
