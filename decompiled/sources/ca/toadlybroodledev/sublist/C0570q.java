package ca.toadlybroodledev.sublist;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: ca.toadlybroodledev.sublist.q */
/* JADX INFO: loaded from: classes.dex */
class C0570q extends BaseAdapter {

    /* JADX INFO: renamed from: a */
    Context f3984a;

    /* JADX INFO: renamed from: b */
    private ArrayList<String> f3985b = new ArrayList<>();

    C0570q(Context context, int i) {
        this.f3984a = context;
        Collections.addAll(this.f3985b, C0566m.m4940e(i));
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f3985b.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        return this.f3985b.get(i);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        View viewInflate = LayoutInflater.from(this.f3984a).inflate(android.R.layout.simple_spinner_dropdown_item, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(android.R.id.text1);
        textView.setTextSize(20.0f);
        textView.setText(this.f3985b.get(i));
        if (i == 0) {
            textView.setBackgroundColor(C0566m.m4939e());
        } else if (this.f3985b.get(i).contentEquals("16f")) {
            textView.setTextSize(16.0f);
            textView.setBackgroundColor(C0566m.m4936d());
        } else if (this.f3985b.get(i).contentEquals("20f")) {
            textView.setTextSize(20.0f);
            textView.setBackgroundColor(C0566m.m4936d());
        } else if (this.f3985b.get(i).contentEquals("24f")) {
            textView.setTextSize(24.0f);
            textView.setBackgroundColor(C0566m.m4936d());
        } else {
            textView.setText("      ");
            textView.setBackgroundColor(Color.parseColor(this.f3985b.get(i)));
        }
        return viewInflate;
    }
}
