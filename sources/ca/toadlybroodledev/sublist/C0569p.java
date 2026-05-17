package ca.toadlybroodledev.sublist;

import android.graphics.Color;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import ca.toadlybroodledev.sublist.p031b.InterfaceC0552d;
import java.util.ArrayList;

/* JADX INFO: renamed from: ca.toadlybroodledev.sublist.p */
/* JADX INFO: loaded from: classes.dex */
public class C0569p {

    /* JADX INFO: renamed from: a */
    private InterfaceC0552d f3983a;

    C0569p(InterfaceC0552d interfaceC0552d) {
        this.f3983a = interfaceC0552d;
    }

    /* JADX INFO: renamed from: a */
    private void m4980a(C0563j c0563j, ArrayList<C0557d> arrayList) {
        int iM4893aj;
        int iM4894ak;
        int size;
        int iM5005i = 0;
        if (C0563j.m4893aj() == -1) {
            iM4894ak = arrayList.size();
            iM4893aj = 0;
        } else {
            iM4893aj = C0563j.m4893aj();
            iM4894ak = C0563j.m4894ak() + 1;
        }
        int size2 = arrayList.size();
        if (iM4894ak >= size2 || iM4893aj >= size2) {
            C0563j.m4897b(-1, -1);
            size = arrayList.size();
        } else {
            iM5005i = iM4893aj;
            size = iM4894ak;
        }
        while (iM5005i < size) {
            C0557d c0557d = arrayList.get(iM5005i);
            if (C0566m.m4929a() || !c0557d.f3823f) {
                m4981b(c0563j, c0557d);
            }
            iM5005i = (c0557d.f3824g ? this.f3983a.mo4849af().m5005i(c0557d) : iM5005i) + 1;
        }
    }

    /* JADX INFO: renamed from: b */
    private void m4981b(C0563j c0563j, C0557d c0557d) {
        this.f3983a.mo4849af().f3987b.add(c0557d);
        switch (C0566m.f3950m) {
            case 0:
                c0557d.f3822e.setImeOptions(1);
                break;
            case 1:
                c0557d.f3822e.setImeOptions(5);
                break;
            case 2:
                c0557d.f3822e.setImeOptions(2);
                break;
            case 3:
                c0557d.f3822e.setImeOptions(6);
                break;
        }
        if (C0572s.m5014c() > c0557d.f3825h) {
            c0557d.f3825h = 0L;
        }
        m4982c(c0563j, c0557d);
        if (c0557d.f3823f) {
            c0557d.f3822e.setTextColor(C0566m.m4944i());
        } else {
            c0557d.f3822e.setTextColor(C0566m.m4943h());
        }
        if (c0557d.f3826i) {
            c0557d.f3822e.setTextColor(Color.parseColor("#FAFAFA"));
            c0557d.f3822e.setEnabled(false);
        }
        m4984a(c0563j, c0557d);
    }

    /* JADX INFO: renamed from: c */
    private void m4982c(C0563j c0563j, C0557d c0557d) {
        String str = c0557d.f3825h != 0 ? "bullet_bell" : "bullet";
        String str2 = c0557d.f3824g ? str + "_full" : str + "_empty";
        if (!c0557d.f3826i) {
            switch (C0566m.m4942g()) {
                case "#FAFAFA":
                    str2 = str2 + "_white";
                    break;
                case "#616161":
                    str2 = str2 + "_grey";
                    break;
                case "#101010":
                    str2 = str2 + "_black";
                    break;
            }
        } else {
            str2 = str2 + "_white";
        }
        c0557d.f3821d.setImageResource(c0563j.m971l().getIdentifier(str2, "drawable", c0563j.m966j().getPackageName()));
    }

    /* JADX INFO: renamed from: a */
    void m4983a(C0563j c0563j) {
        this.f3983a.mo4850ah().removeAllViews();
        this.f3983a.mo4849af().f3987b.clear();
        m4980a(c0563j, this.f3983a.mo4849af().m4988a());
    }

    /* JADX INFO: renamed from: a */
    protected void m4984a(C0563j c0563j, C0557d c0557d) {
        LinearLayout.LayoutParams layoutParams;
        c0557d.f3820c.setPadding(this.f3983a.mo4853e(R.dimen.sublist_left_margin) + (this.f3983a.mo4853e(R.dimen.entry_indent) * c0557d.m4859a()), 0, 0, 0);
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
            c0557d.f3821d.setScaleX(1.0f);
            c0557d.f3821d.setScaleY(1.0f);
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
        this.f3983a.mo4850ah().addView(c0557d.f3820c);
    }
}
