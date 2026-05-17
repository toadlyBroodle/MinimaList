package ca.toadlybroodledev.sublist;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import ca.toadlybroodledev.sublist.p031b.InterfaceC0549a;
import ca.toadlybroodledev.sublist.p031b.InterfaceC0551c;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: ca.toadlybroodledev.sublist.h */
/* JADX INFO: loaded from: classes.dex */
public class ViewOnClickListenerC0561h extends C0563j implements View.OnClickListener, InterfaceC0551c {

    /* JADX INFO: renamed from: b */
    private final String f3864b = "Fuckn" + getClass().getSimpleName();

    /* JADX INFO: renamed from: c */
    private InterfaceC0549a f3865c;

    /* JADX INFO: renamed from: d */
    private C0568o f3866d;

    /* JADX INFO: renamed from: e */
    private LinearLayout f3867e;

    /* JADX INFO: renamed from: f */
    private Button f3868f;

    /* JADX INFO: renamed from: g */
    private EditText f3869g;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public void m4882c(View view) {
        ArrayList<C0557d> arrayList = new ArrayList<>();
        for (C0557d c0557d : m4883ad()) {
            if (c0557d.f3822e.getText().toString().contains(this.f3869g.getText().toString().toLowerCase())) {
                arrayList.add(c0557d);
            }
        }
        this.f3866d.m4979a(arrayList);
        this.f3865c.mo4761a(view, false);
        AppMain.m4792a("Search_doSearch", "Action");
    }

    @Override // ca.toadlybroodledev.sublist.C0563j, android.support.v4.p006a.ComponentCallbacksC0154j
    /* JADX INFO: renamed from: a */
    public View mo914a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_search, viewGroup, false);
    }

    @Override // ca.toadlybroodledev.sublist.C0563j, android.support.v4.p006a.ComponentCallbacksC0154j
    /* JADX INFO: renamed from: a */
    public void mo935a(View view, Bundle bundle) {
        this.f3865c = (InterfaceC0549a) m966j();
        this.f3867e = (LinearLayout) this.f3865c.mo4760a(Integer.valueOf(R.id.search_lin_lay));
        this.f3868f = (Button) this.f3865c.mo4760a(Integer.valueOf(R.id.sublist_search_button));
        this.f3869g = (EditText) this.f3865c.mo4760a(Integer.valueOf(R.id.sublist_search_text));
        this.f3869g.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: ca.toadlybroodledev.sublist.h.1
            @Override // android.widget.TextView.OnEditorActionListener
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (i == 6) {
                    try {
                        ViewOnClickListenerC0561h.this.m4882c(textView);
                        return true;
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                return false;
            }
        });
        this.f3869g.setSingleLine();
        this.f3869g.setImeOptions(6);
        this.f3868f.setOnClickListener(this);
        this.f3866d = new C0568o(this);
    }

    @Override // ca.toadlybroodledev.sublist.p031b.InterfaceC0551c
    /* JADX INFO: renamed from: ac */
    public LinearLayout mo4846ac() {
        return this.f3867e;
    }

    /* JADX INFO: renamed from: ad */
    public ArrayList<C0557d> m4883ad() {
        ArrayList<C0557d> arrayList = new ArrayList<>();
        Iterator<C0563j> it = this.f3865c.mo4786x().iterator();
        while (it.hasNext()) {
            Iterator<C0557d> it2 = it.next().mo4849af().m4988a().iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
        }
        return arrayList;
    }

    @Override // ca.toadlybroodledev.sublist.p031b.InterfaceC0551c
    /* JADX INFO: renamed from: b */
    public ActMain mo4847b() {
        return (ActMain) m969k();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.sublist_search_button /* 2131296617 */:
                m4882c(view);
                break;
        }
    }
}
