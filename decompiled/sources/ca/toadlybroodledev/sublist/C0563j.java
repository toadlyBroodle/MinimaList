package ca.toadlybroodledev.sublist;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.p006a.ComponentCallbacksC0154j;
import android.support.v7.app.DialogInterfaceC0347d;
import android.util.Log;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import ca.toadlybroodledev.sublist.C0572s;
import ca.toadlybroodledev.sublist.p031b.InterfaceC0549a;
import ca.toadlybroodledev.sublist.p031b.InterfaceC0552d;
import ca.toadlybroodledev.sublist.p032c.C0554a;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: ca.toadlybroodledev.sublist.j */
/* JADX INFO: loaded from: classes.dex */
public class C0563j extends ComponentCallbacksC0154j implements InterfaceC0552d {

    /* JADX INFO: renamed from: ae */
    private static MenuItem f3893ae;

    /* JADX INFO: renamed from: af */
    private static MenuItem f3894af;

    /* JADX INFO: renamed from: ag */
    private static MenuItem f3895ag;

    /* JADX INFO: renamed from: ah */
    private static MenuItem f3896ah;

    /* JADX INFO: renamed from: ai */
    private static MenuItem f3897ai;

    /* JADX INFO: renamed from: c */
    private static InterfaceC0549a f3901c;

    /* JADX INFO: renamed from: d */
    private static MenuItem f3902d;

    /* JADX INFO: renamed from: e */
    private static MenuItem f3903e;

    /* JADX INFO: renamed from: f */
    private static MenuItem f3904f;

    /* JADX INFO: renamed from: g */
    private static MenuItem f3905g;

    /* JADX INFO: renamed from: h */
    private static MenuItem f3906h;

    /* JADX INFO: renamed from: i */
    private static MenuItem f3907i;

    /* JADX INFO: renamed from: a */
    C0569p f3908a;

    /* JADX INFO: renamed from: aj */
    private String f3909aj;

    /* JADX INFO: renamed from: ak */
    private C0571r f3910ak;

    /* JADX INFO: renamed from: al */
    private ScrollView f3911al;

    /* JADX INFO: renamed from: am */
    private LinearLayout f3912am;

    /* JADX INFO: renamed from: an */
    private TextView f3913an;

    /* JADX INFO: renamed from: b */
    private static final String f3900b = "fuckn" + C0563j.class.getSimpleName();

    /* JADX INFO: renamed from: ao */
    private static int f3898ao = -1;

    /* JADX INFO: renamed from: ap */
    private static int f3899ap = -1;

    /* JADX INFO: renamed from: a */
    public static ArrayList<C0563j> m4891a(InterfaceC0549a interfaceC0549a, HashMap<String, ArrayList<C0554a>> map) {
        ArrayList<C0563j> arrayList = new ArrayList<>();
        for (String str : map.keySet()) {
            arrayList.add(new C0563j().m4899a(interfaceC0549a, str, map.get(str)));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public static HashMap<String, ArrayList<C0554a>> m4892a(ArrayList<C0563j> arrayList) {
        HashMap<String, ArrayList<C0554a>> map = new HashMap<>();
        for (C0563j c0563j : arrayList) {
            if (c0563j != null) {
                map.put(c0563j.f3909aj, C0554a.getListOfEntSers(c0563j.mo4849af().m4988a()));
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: aj */
    static int m4893aj() {
        return f3898ao;
    }

    /* JADX INFO: renamed from: ak */
    static int m4894ak() {
        return f3899ap;
    }

    /* JADX INFO: renamed from: b */
    private String m4896b() {
        if (AbstractC0565l.m4923a(this.f3910ak)) {
            Toast.makeText(m969k(), R.string.toast_done, 0).show();
            return "Sub_deleteEntryUndo";
        }
        Toast.makeText(m969k(), R.string.toast_no_prev_del_entries, 0).show();
        return "Sub_deleteEntryUndo";
    }

    /* JADX INFO: renamed from: b */
    static void m4897b(int i, int i2) {
        f3898ao = i;
        f3899ap = i2;
        C0566m.f3939b = i;
        C0566m.f3940c = i2;
        C0566m.m4947l();
    }

    /* JADX INFO: renamed from: d */
    static void m4898d(int i) {
        m4897b(f3898ao, f3899ap + i);
    }

    @Override // android.support.v4.p006a.ComponentCallbacksC0154j
    /* JADX INFO: renamed from: a */
    public View mo914a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.mo914a(layoutInflater, viewGroup, bundle);
        m954e(true);
        return layoutInflater.inflate(R.layout.fragment_sublist, viewGroup, false);
    }

    /* JADX INFO: renamed from: a */
    public C0563j m4899a(InterfaceC0549a interfaceC0549a, String str, ArrayList<C0554a> arrayList) {
        f3901c = interfaceC0549a;
        if (str == null) {
            this.f3909aj = f3901c.mo4770b(Integer.valueOf(R.string.app_name));
        } else {
            this.f3909aj = str;
        }
        this.f3910ak = new C0571r(f3901c, this, arrayList);
        f3898ao = C0566m.f3939b;
        f3899ap = C0566m.f3940c;
        return this;
    }

    @Override // android.support.v4.p006a.ComponentCallbacksC0154j
    /* JADX INFO: renamed from: a */
    public void mo868a(Context context) {
        super.mo868a(context);
        m952d(true);
    }

    @Override // android.support.v4.p006a.ComponentCallbacksC0154j
    /* JADX INFO: renamed from: a */
    public void mo933a(Menu menu, MenuInflater menuInflater) {
        super.mo933a(menu, menuInflater);
        menu.clear();
        menuInflater.inflate(R.menu.sublist_menu, menu);
        f3902d = menu.findItem(R.id.menu_add_new);
        f3903e = menu.findItem(R.id.menu_move_left);
        f3904f = menu.findItem(R.id.menu_move_right);
        f3905g = menu.findItem(R.id.menu_move_up);
        f3906h = menu.findItem(R.id.menu_move_down);
        f3907i = menu.findItem(R.id.menu_mark_complete);
        f3893ae = menu.findItem(R.id.menu_set_reminder);
        f3894af = menu.findItem(R.id.menu_copy);
        f3895ag = menu.findItem(R.id.menu_paste);
        f3896ah = menu.findItem(R.id.menu_delete);
        f3897ai = menu.findItem(R.id.menu_undo_delete);
        f3907i.setShowAsAction(C0566m.f3946i ? 0 : 2);
        if (f3898ao == -1) {
            m4901a((C0557d) null);
        } else {
            try {
                m4901a(this.f3910ak.m4988a().get(f3898ao));
            } catch (Error e) {
                Log.e(f3900b, "Index out of bounds: " + e.getMessage());
                m4901a((C0557d) null);
            }
        }
        mo4852am();
        f3901c.mo4772b(false);
    }

    @Override // android.support.v4.p006a.ComponentCallbacksC0154j
    /* JADX INFO: renamed from: a */
    public void mo935a(View view, Bundle bundle) {
        super.mo935a(view, bundle);
        this.f3911al = (ScrollView) view;
        LinearLayout linearLayout = (LinearLayout) this.f3911al.getChildAt(0);
        this.f3913an = (TextView) linearLayout.getChildAt(0);
        this.f3913an.setText(this.f3909aj);
        m934a(this.f3913an);
        this.f3912am = (LinearLayout) linearLayout.getChildAt(1);
        this.f3911al.setOnTouchListener(new View.OnTouchListener() { // from class: ca.toadlybroodledev.sublist.j.1
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view2, MotionEvent motionEvent) {
                C0563j.f3901c.mo4763a((C0557d) null);
                return false;
            }
        });
        if (f3898ao == -1) {
            mo4852am();
            return;
        }
        try {
            m4901a(this.f3910ak.m4988a().get(f3898ao));
        } catch (Exception e) {
            e.printStackTrace();
            Log.e(f3900b, "Temp Root Index out of bounds: " + e.getMessage());
            m4901a((C0557d) null);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m4900a(LinearLayout linearLayout) {
        this.f3912am = linearLayout;
    }

    /* JADX INFO: renamed from: a */
    void m4901a(C0557d c0557d) {
        if (c0557d == null) {
            m4897b(-1, -1);
            this.f3913an.setVisibility(0);
            f3901c.mo4783u().setVisibility(0);
            f3901c.mo4784v().setVisibility(4);
        } else {
            this.f3913an.setVisibility(8);
            m4897b(this.f3910ak.m4988a().indexOf(c0557d), this.f3910ak.m5005i(c0557d));
            f3901c.mo4783u().setVisibility(8);
            f3901c.mo4784v().setVisibility(0);
        }
        m4905an();
        mo4852am();
    }

    /* JADX INFO: renamed from: a */
    public void m4902a(C0571r c0571r) {
        this.f3910ak = c0571r;
    }

    @Override // android.support.v4.p006a.ComponentCallbacksC0154j
    /* JADX INFO: renamed from: a */
    public boolean mo937a(MenuItem menuItem) {
        String strM4896b;
        C0557d c0557dMo4788z = f3901c.mo4788z();
        if (c0557dMo4788z != null) {
            switch (menuItem.getItemId()) {
                case R.id.menu_add_new /* 2131296453 */:
                    strM4896b = mo4851al();
                    break;
                case R.id.menu_back_to_root /* 2131296454 */:
                case R.id.menu_context_delete_list /* 2131296455 */:
                case R.id.menu_context_move_down /* 2131296456 */:
                case R.id.menu_context_move_up /* 2131296457 */:
                case R.id.menu_context_rename /* 2131296458 */:
                case R.id.menu_drawer_toggle /* 2131296461 */:
                case R.id.menu_fragment_title /* 2131296462 */:
                case R.id.menu_instructions /* 2131296463 */:
                case R.id.menu_invite /* 2131296464 */:
                case R.id.menu_profile /* 2131296471 */:
                case R.id.menu_settings /* 2131296473 */:
                default:
                    strM4896b = null;
                    break;
                case R.id.menu_copy /* 2131296459 */:
                    if (!f3901c.mo4778p().m4914b()) {
                        strM4896b = null;
                    } else {
                        AbstractC0565l.m4919a(this.f3910ak, c0557dMo4788z);
                        strM4896b = "Sub_editCopy";
                    }
                    break;
                case R.id.menu_delete /* 2131296460 */:
                    if (c0557dMo4788z.f3825h != 0) {
                        c0557dMo4788z.m4862c();
                    }
                    this.f3910ak.m4992a(c0557dMo4788z);
                    strM4896b = "Sub_deleteEntry";
                    break;
                case R.id.menu_mark_complete /* 2131296465 */:
                    if (c0557dMo4788z.f3825h != 0) {
                        c0557dMo4788z.m4862c();
                    }
                    this.f3910ak.m4996b(c0557dMo4788z, c0557dMo4788z.f3823f ? false : true);
                    f3901c.mo4763a((C0557d) null);
                    strM4896b = "Sub_markEntryComplete";
                    break;
                case R.id.menu_move_down /* 2131296466 */:
                    this.f3910ak.m5003g(c0557dMo4788z);
                    strM4896b = "Sub_moveEntryDown";
                    break;
                case R.id.menu_move_left /* 2131296467 */:
                    this.f3910ak.m4993a(c0557dMo4788z, -1);
                    strM4896b = "Sub_moveEntryLeft";
                    break;
                case R.id.menu_move_right /* 2131296468 */:
                    this.f3910ak.m4993a(c0557dMo4788z, 1);
                    strM4896b = "Sub_moveEntryRight";
                    break;
                case R.id.menu_move_up /* 2131296469 */:
                    this.f3910ak.m5002f(c0557dMo4788z);
                    strM4896b = "Sub_moveEntryUp";
                    break;
                case R.id.menu_paste /* 2131296470 */:
                    AbstractC0565l.m4918a(f3901c, this.f3910ak, this.f3910ak.m5005i(c0557dMo4788z) + 1);
                    strM4896b = "Sub_editPaste";
                    break;
                case R.id.menu_set_reminder /* 2131296472 */:
                    if (c0557dMo4788z.f3825h != 0) {
                        c0557dMo4788z.m4862c();
                        strM4896b = "Sub_cancelReminder";
                    } else if (!f3901c.mo4778p().m4914b()) {
                        strM4896b = null;
                    } else {
                        new C0572s.a().m866a(f3901c.mo4785w(), "datePicker");
                        strM4896b = "Sub_setReminder";
                    }
                    break;
                case R.id.menu_undo_delete /* 2131296474 */:
                    strM4896b = m4896b();
                    break;
            }
        } else {
            switch (menuItem.getItemId()) {
                case R.id.menu_add_new /* 2131296453 */:
                    strM4896b = mo4851al();
                    break;
                case R.id.menu_paste /* 2131296470 */:
                    AbstractC0565l.m4918a(f3901c, this.f3910ak, this.f3910ak.m4988a().size());
                    strM4896b = "Sub_editPaste";
                    break;
                case R.id.menu_undo_delete /* 2131296474 */:
                    strM4896b = m4896b();
                    break;
                default:
                    strM4896b = null;
                    break;
            }
        }
        if (strM4896b != null) {
        }
        mo4852am();
        C0557d c0557dMo4788z2 = f3901c.mo4788z();
        if (c0557dMo4788z2 != null) {
            c0557dMo4788z2.f3822e.requestFocus();
        }
        return super.mo937a(menuItem);
    }

    @Override // ca.toadlybroodledev.sublist.p031b.InterfaceC0552d
    /* JADX INFO: renamed from: ae */
    public String mo4848ae() {
        return this.f3909aj;
    }

    @Override // ca.toadlybroodledev.sublist.p031b.InterfaceC0552d
    /* JADX INFO: renamed from: af */
    public C0571r mo4849af() {
        return this.f3910ak;
    }

    /* JADX INFO: renamed from: ag */
    ScrollView m4903ag() {
        return this.f3911al;
    }

    @Override // ca.toadlybroodledev.sublist.p031b.InterfaceC0552d
    /* JADX INFO: renamed from: ah */
    public LinearLayout mo4850ah() {
        return this.f3912am;
    }

    /* JADX INFO: renamed from: ai */
    public TextView m4904ai() {
        return this.f3913an;
    }

    @Override // ca.toadlybroodledev.sublist.p031b.InterfaceC0552d
    /* JADX INFO: renamed from: al */
    public String mo4851al() {
        String str;
        if (f3901c.mo4788z() == null) {
            if (f3898ao != -1) {
                this.f3910ak.m4995b();
            } else {
                this.f3910ak.m4991a((C0554a) null);
            }
            str = "Sub_createRootEntry";
        } else {
            C0557d c0557dMo4788z = f3901c.mo4788z();
            this.f3910ak.m4989a(C0566m.f3948k ? this.f3910ak.m5005i(c0557dMo4788z) + 1 : this.f3910ak.m4988a().indexOf(c0557dMo4788z), new C0557d(f3901c, this, new C0554a(c0557dMo4788z.m4859a(), "", false, false, 0L, false)));
            str = "Sub_createSibEntry";
        }
        if (C0566m.f3947j) {
            try {
                f3901c.mo4761a((View) f3901c.mo4788z().f3822e, true);
            } catch (Exception e) {
                e.printStackTrace();
                Log.e(f3900b, "Error showing soft keyboard");
            }
        }
        f3901c.mo4756C();
        return str;
    }

    @Override // ca.toadlybroodledev.sublist.p031b.InterfaceC0552d
    /* JADX INFO: renamed from: am */
    public void mo4852am() {
        try {
            this.f3908a = new C0569p(this);
            this.f3908a.m4983a(this);
        } catch (Exception e) {
        }
        m4905an();
    }

    /* JADX INFO: renamed from: an */
    public void m4905an() {
        if (this.f3910ak == null) {
            return;
        }
        try {
            if (C0566m.f3945h) {
                f3902d.setVisible(false);
            } else {
                f3902d.setVisible(true);
            }
        } catch (Exception e) {
        }
        C0557d c0557dMo4788z = f3901c.mo4788z();
        boolean z = c0557dMo4788z != null;
        try {
            f3905g.setEnabled(z && this.f3910ak.m5000d(c0557dMo4788z));
            f3906h.setEnabled(z && this.f3910ak.m5001e(c0557dMo4788z));
            f3903e.setEnabled(z && this.f3910ak.m4997b(c0557dMo4788z));
            f3904f.setEnabled(z && this.f3910ak.m4999c(c0557dMo4788z));
        } catch (Exception e2) {
        }
        try {
            f3907i.setEnabled(z);
            f3893ae.setEnabled(z);
            if (c0557dMo4788z == null || c0557dMo4788z.f3825h == 0) {
                f3893ae.setTitle(R.string.menu_set_reminder);
            } else {
                f3893ae.setTitle(R.string.menu_cancel_reminder);
            }
            f3894af.setEnabled(z);
            ArrayList<C0554a> arrayListM4917a = AbstractC0565l.m4917a();
            f3895ag.setEnabled((arrayListM4917a == null || arrayListM4917a.isEmpty()) ? false : true);
            f3896ah.setEnabled(z);
            ArrayList<C0557d> arrayListM4925c = AbstractC0565l.m4925c();
            f3897ai.setEnabled((arrayListM4925c == null || arrayListM4925c.isEmpty() || !AbstractC0565l.m4924b().equals(this.f3909aj)) ? false : true);
        } catch (Exception e3) {
        }
        int integer = m969k().getResources().getInteger(R.integer.alphaDisabledIcon);
        int integer2 = m969k().getResources().getInteger(R.integer.alphaEnabledIcon);
        try {
            f3905g.getIcon().setAlpha(f3905g.isEnabled() ? integer2 : integer);
            f3906h.getIcon().setAlpha(f3906h.isEnabled() ? integer2 : integer);
            f3903e.getIcon().setAlpha(f3903e.isEnabled() ? integer2 : integer);
            f3904f.getIcon().setAlpha(f3904f.isEnabled() ? integer2 : integer);
        } catch (Exception e4) {
        }
        try {
            f3907i.getIcon().setAlpha(f3907i.isEnabled() ? integer2 : integer);
            f3894af.getIcon().setAlpha(f3894af.isEnabled() ? integer2 : integer);
            f3895ag.getIcon().setAlpha(f3895ag.isEnabled() ? integer2 : integer);
            f3896ah.getIcon().setAlpha(f3896ah.isEnabled() ? integer2 : integer);
            Drawable icon = f3897ai.getIcon();
            if (!f3897ai.isEnabled()) {
                integer2 = integer;
            }
            icon.setAlpha(integer2);
        } catch (Exception e5) {
        }
    }

    /* JADX INFO: renamed from: ao */
    void m4906ao() {
        DialogInterfaceC0347d.a aVar = new DialogInterfaceC0347d.a(f3901c.mo4775m());
        aVar.m2591a(R.string.menu_delete_list);
        aVar.m2601b("Are you positive you want to permanently delete entire list?");
        aVar.m2592a(R.string.ok, new DialogInterface.OnClickListener() { // from class: ca.toadlybroodledev.sublist.j.2
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                ArrayList<C0563j> arrayList = new ArrayList<>();
                arrayList.add(C0563j.this);
                C0563j.f3901c.mo4768a(arrayList, true);
            }
        });
        aVar.m2599b(R.string.cancel, null);
        aVar.m2603c();
    }

    /* JADX INFO: renamed from: b */
    public void m4907b(String str) {
        this.f3909aj = str;
        this.f3913an.setText(str);
    }

    @Override // android.support.v4.p006a.ComponentCallbacksC0154j
    /* JADX INFO: renamed from: b */
    public boolean mo946b(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.menu_context_delete_list /* 2131296455 */:
                m4906ao();
                return true;
            case R.id.menu_context_move_down /* 2131296456 */:
                f3901c.mo4765a(this, true);
                return true;
            case R.id.menu_context_move_up /* 2131296457 */:
                f3901c.mo4765a(this, false);
                return true;
            case R.id.menu_context_rename /* 2131296458 */:
                new C0538a().m866a(f3901c.mo4785w(), "dialog_rename_sublist");
                return true;
            default:
                return false;
        }
    }

    @Override // android.support.v4.p006a.ComponentCallbacksC0154j
    /* JADX INFO: renamed from: d */
    public void mo877d() {
        super.mo877d();
        if (C0566m.m4946k()) {
        }
    }

    @Override // ca.toadlybroodledev.sublist.p031b.InterfaceC0552d
    /* JADX INFO: renamed from: e */
    public int mo4853e(int i) {
        return m971l().getDimensionPixelSize(i);
    }

    @Override // android.support.v4.p006a.ComponentCallbacksC0154j, android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        m969k().getMenuInflater().inflate(R.menu.sublist_title_context_menu, contextMenu);
    }
}
