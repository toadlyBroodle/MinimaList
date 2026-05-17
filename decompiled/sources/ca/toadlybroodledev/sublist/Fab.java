package ca.toadlybroodledev.sublist;

import android.content.Context;
import android.support.design.widget.FloatingActionButton;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes.dex */
public class Fab extends FloatingActionButton {
    public Fab(Context context) {
        super(context);
    }

    public Fab(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Fab(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* JADX INFO: renamed from: a */
    void m4800a(boolean z, boolean z2) {
        if (!C0566m.f3945h) {
            setVisibility(4);
            return;
        }
        if (z && z2) {
            setVisibility(4);
        } else if (z) {
            setVisibility(0);
        } else {
            setVisibility(4);
        }
    }
}
