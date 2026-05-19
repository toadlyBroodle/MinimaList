package ca.toadlybroodledev.minimalist;

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
        String item = this.f3985b.get(i);
        textView.setText(item);
        // Phase 10.8: dispatch by item content (not slot index) so plain-label arrays
        // (Location, Format) render identically to the color-picker label rows.
        if (item.startsWith("#")) {
            // Color swatch: a colored bar with no visible text.
            textView.setText("      ");
            textView.setBackgroundColor(Color.parseColor(item));
        } else if (item.contentEquals("16f")) {
            textView.setTextSize(16.0f);
            int bg = AppSettings.m4936d();
            textView.setBackgroundColor(bg);
            textView.setTextColor(contrastingTextColor(bg));
        } else if (item.contentEquals("20f")) {
            textView.setTextSize(20.0f);
            int bg = AppSettings.m4936d();
            textView.setBackgroundColor(bg);
            textView.setTextColor(contrastingTextColor(bg));
        } else if (item.contentEquals("24f")) {
            textView.setTextSize(24.0f);
            int bg = AppSettings.m4936d();
            textView.setBackgroundColor(bg);
            textView.setTextColor(contrastingTextColor(bg));
        } else {
            // Plain label: full text on the accent/highlight background.
            int bg = AppSettings.m4939e();
            textView.setBackgroundColor(bg);
            textView.setTextColor(contrastingTextColor(bg));
        }
        return v;
    }

    // WCAG perceived luminance: dark text on light bgs, light text on dark bgs.
    static int contrastingTextColor(int bg) {
        int r = (bg >> 16) & 0xFF;
        int g = (bg >> 8) & 0xFF;
        int b = bg & 0xFF;
        int luma = (299 * r + 587 * g + 114 * b) / 1000;
        return luma > 140 ? 0xFF1A1C1F : 0xFFF4F4F2;
    }
}
