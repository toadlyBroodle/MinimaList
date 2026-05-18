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

// Ported from decompiled C0570q. BaseAdapter wrapping a string-array resource for Spinners.
class StringArraySpinnerAdapter extends BaseAdapter {

    Context f3984a;
    private ArrayList<String> f3985b = new ArrayList<>();

    StringArraySpinnerAdapter(Context context, int arrayResId) {
        this.f3984a = context;
        Collections.addAll(this.f3985b, AppSettings.m4940e(arrayResId));
    }

    @Override
    public int getCount() {
        return this.f3985b.size();
    }

    @Override
    public Object getItem(int i) {
        return this.f3985b.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = LayoutInflater.from(this.f3984a)
                .inflate(android.R.layout.simple_spinner_dropdown_item, (ViewGroup) null);
        TextView textView = (TextView) v.findViewById(android.R.id.text1);
        textView.setTextSize(20.0f);
        textView.setText(this.f3985b.get(i));
        if (i == 0) {
            textView.setBackgroundColor(AppSettings.m4939e());
        } else if (this.f3985b.get(i).contentEquals("16f")) {
            textView.setTextSize(16.0f);
            textView.setBackgroundColor(AppSettings.m4936d());
        } else if (this.f3985b.get(i).contentEquals("20f")) {
            textView.setTextSize(20.0f);
            textView.setBackgroundColor(AppSettings.m4936d());
        } else if (this.f3985b.get(i).contentEquals("24f")) {
            textView.setTextSize(24.0f);
            textView.setBackgroundColor(AppSettings.m4936d());
        } else {
            textView.setText("      ");
            textView.setBackgroundColor(Color.parseColor(this.f3985b.get(i)));
        }
        return v;
    }
}
