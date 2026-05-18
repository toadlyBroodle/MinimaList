package ca.toadlybroodledev.sublist;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

// Ported from decompiled Fab. Floating action button; visibility gated on AppSettings.f3945h.
public class OutlineFab extends FloatingActionButton {

    public OutlineFab(Context context) {
        super(context);
    }

    public OutlineFab(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public OutlineFab(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    void m4800a(boolean visible, boolean animated) {
        if (!AppSettings.f3945h) {
            setVisibility(GONE);
            return;
        }
        if (visible && animated) {
            show();
        } else if (visible) {
            setVisibility(VISIBLE);
        } else {
            setVisibility(GONE);
        }
    }
}
