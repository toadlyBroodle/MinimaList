package ca.toadlybroodledev.sublist;

import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import ca.toadlybroodledev.sublist.p031b.InterfaceC0551c;
import java.util.ArrayList;

/* JADX INFO: renamed from: ca.toadlybroodledev.sublist.o */
/* JADX INFO: loaded from: classes.dex */
class C0568o {

    /* JADX INFO: renamed from: a */
    private InterfaceC0551c f3982a;

    C0568o(InterfaceC0551c interfaceC0551c) {
        this.f3982a = interfaceC0551c;
    }

    /* JADX INFO: renamed from: a */
    void m4979a(ArrayList<C0557d> arrayList) {
        LinearLayout.LayoutParams layoutParams;
        this.f3982a.mo4846ac().removeAllViews();
        for (C0557d c0557d : arrayList) {
            if (C0566m.m4929a() || !c0557d.f3823f) {
                c0557d.f3821d.setImageResource(R.drawable.ic_search_white_24dp);
                c0557d.f3821d.setScaleX(0.6f);
                c0557d.f3821d.setScaleY(0.6f);
                Resources resources = this.f3982a.mo4847b().getResources();
                if (c0557d.f3823f) {
                    c0557d.f3822e.setTextColor(resources.getColor(R.color.colorTextWhiteCompleted));
                } else {
                    c0557d.f3822e.setTextColor(resources.getColor(R.color.colorTextWhite));
                }
                c0557d.f3822e.setEnabled(false);
                c0557d.f3820c.setPadding((c0557d.m4859a() * 40) + 20, 0, 0, 0);
                c0557d.f3822e.setTextSize(Float.parseFloat(C0566m.m4941f()));
                if (C0566m.f3949l) {
                    c0557d.f3822e.setSingleLine();
                } else {
                    c0557d.f3822e.setMaxLines(4);
                    layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    switch (C0566m.m4941f()) {
                        case "16f":
                            layoutParams.topMargin = 0;
                            break;
                        case "20f":
                            layoutParams.topMargin = 2;
                            break;
                        case "24f":
                            layoutParams.topMargin = 10;
                            break;
                    }
                    c0557d.f3821d.setLayoutParams(layoutParams);
                }
                if (c0557d.f3823f) {
                    c0557d.f3822e.setPaintFlags(c0557d.f3822e.getPaintFlags() | 16);
                } else {
                    c0557d.f3822e.setPaintFlags(c0557d.f3822e.getPaintFlags() & (-17));
                }
                ViewParent parent = c0557d.f3820c.getParent();
                if (parent != null) {
                    ((ViewGroup) parent).removeView(c0557d.f3820c);
                }
                this.f3982a.mo4846ac().addView(c0557d.f3820c);
            }
        }
    }
}
