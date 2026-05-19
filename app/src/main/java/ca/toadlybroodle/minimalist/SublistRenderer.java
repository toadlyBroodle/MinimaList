package ca.toadlybroodle.minimalist;

import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import ca.toadlybroodle.minimalist.iface.FragmentHost;
import java.util.ArrayList;

// Ported from decompiled C0568o. Renders search results into the search fragment's LinearLayout.
class SublistRenderer {

    private FragmentHost f3982a;

    SublistRenderer(FragmentHost host) {
        this.f3982a = host;
    }

    void m4979a(ArrayList<OutlineRowView> rows) {
        LinearLayout.LayoutParams lp;
        this.f3982a.mo4846ac().removeAllViews();
        for (OutlineRowView rv : rows) {
            if (AppSettings.m4929a() || !rv.f3823f) {
                rv.f3821d.setImageResource(R.drawable.ic_search_white_24dp);
                rv.f3821d.setScaleX(0.6f);
                rv.f3821d.setScaleY(0.6f);
                Resources res = this.f3982a.mo4847b().getResources();
                if (rv.f3823f) {
                    rv.f3822e.setTextColor(res.getColor(R.color.colorTextWhiteCompleted));
                } else {
                    rv.f3822e.setTextColor(res.getColor(R.color.colorTextWhite));
                }
                rv.f3822e.setEnabled(false);
                rv.f3820c.setPadding((rv.m4859a() * 40) + 20, 0, 0, 0);
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
                this.f3982a.mo4846ac().addView(rv.f3820c);
            }
        }
    }
}
