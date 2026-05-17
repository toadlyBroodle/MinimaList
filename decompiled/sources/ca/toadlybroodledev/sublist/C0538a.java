package ca.toadlybroodledev.sublist;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.p006a.DialogInterfaceOnCancelListenerC0153i;
import android.support.v7.app.DialogInterfaceC0347d;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;
import ca.toadlybroodledev.sublist.p031b.InterfaceC0550b;
import ca.toadlybroodledev.sublist.p032c.C0554a;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: ca.toadlybroodledev.sublist.a */
/* JADX INFO: loaded from: classes.dex */
public class C0538a extends DialogInterfaceOnCancelListenerC0153i {

    /* JADX INFO: renamed from: ae */
    protected static InterfaceC0550b f3745ae;

    /* JADX INFO: renamed from: af */
    EditText f3746af;

    /* JADX INFO: renamed from: b */
    boolean m4801b(String str) {
        if (!m4803d(str)) {
            return false;
        }
        C0563j c0563jM4899a = new C0563j().m4899a(f3745ae.mo4774l(), str, (ArrayList<C0554a>) null);
        ArrayList<C0563j> arrayList = new ArrayList<>();
        arrayList.add(c0563jM4899a);
        f3745ae.mo4767a(arrayList);
        f3745ae.mo4764a(c0563jM4899a);
        return true;
    }

    @Override // android.support.v4.p006a.DialogInterfaceOnCancelListenerC0153i
    /* JADX INFO: renamed from: c */
    public Dialog mo875c(Bundle bundle) {
        View viewInflate = m969k().getLayoutInflater().inflate(R.layout.fragment_dialog_create_new_sub, (ViewGroup) null);
        String strH = m961h();
        f3745ae = (InterfaceC0550b) m969k();
        this.f3746af = (EditText) viewInflate.findViewById(R.id.new_sublist_name_input);
        if (strH.equals("dialog_create_sublist")) {
            return new DialogInterfaceC0347d.a(m969k()).m2600b(viewInflate).m2591a(R.string.new_minimalist).m2598b(R.string.prompt_new_sublist_name).m2592a(R.string.ok, new DialogInterface.OnClickListener() { // from class: ca.toadlybroodledev.sublist.a.1
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    C0538a.this.m4801b(C0538a.this.f3746af.getText().toString());
                }
            }).m2599b(R.string.cancel, null).m2602b();
        }
        if (strH.equals("dialog_rename_sublist")) {
            return new DialogInterfaceC0347d.a(m969k()).m2600b(viewInflate).m2591a(R.string.dialog_rename_title).m2592a(R.string.ok, new DialogInterface.OnClickListener() { // from class: ca.toadlybroodledev.sublist.a.2
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    C0538a.this.m4802c(C0538a.this.f3746af.getText().toString());
                }
            }).m2599b(R.string.cancel, null).m2602b();
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    boolean m4802c(String str) {
        if (!m4803d(str)) {
            return false;
        }
        DrawerCustomLayout drawerCustomLayoutMo4782t = f3745ae.mo4774l().mo4782t();
        C0563j c0563jMo4787y = f3745ae.mo4787y();
        drawerCustomLayoutMo4782t.m4799b(c0563jMo4787y);
        c0563jMo4787y.m4907b(str);
        drawerCustomLayoutMo4782t.m4798a(c0563jMo4787y);
        return true;
    }

    /* JADX INFO: renamed from: d */
    boolean m4803d(String str) {
        if (str.equals("")) {
            Toast.makeText(m969k(), R.string.toast_new_sublist_name_not_blank, 0).show();
            return false;
        }
        Iterator<C0563j> it = f3745ae.mo4786x().iterator();
        while (it.hasNext()) {
            if (it.next().mo4848ae().toLowerCase().equals(str.toLowerCase())) {
                Toast.makeText(m969k(), R.string.toast_choose_new_name_for_sublist, 0).show();
                return false;
            }
        }
        return true;
    }
}
