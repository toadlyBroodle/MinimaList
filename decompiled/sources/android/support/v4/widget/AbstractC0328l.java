package android.support.v4.widget;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: android.support.v4.widget.l */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0328l extends AbstractC0320d {

    /* JADX INFO: renamed from: j */
    private int f1738j;

    /* JADX INFO: renamed from: k */
    private int f1739k;

    /* JADX INFO: renamed from: l */
    private LayoutInflater f1740l;

    @Deprecated
    public AbstractC0328l(Context context, int i, Cursor cursor, boolean z) {
        super(context, cursor, z);
        this.f1739k = i;
        this.f1738j = i;
        this.f1740l = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // android.support.v4.widget.AbstractC0320d
    /* JADX INFO: renamed from: a */
    public View mo2380a(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f1740l.inflate(this.f1738j, viewGroup, false);
    }

    @Override // android.support.v4.widget.AbstractC0320d
    /* JADX INFO: renamed from: b */
    public View mo2385b(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f1740l.inflate(this.f1739k, viewGroup, false);
    }
}
