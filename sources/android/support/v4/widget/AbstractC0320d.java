package android.support.v4.widget;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.support.v4.widget.C0321e;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.FilterQueryProvider;
import android.widget.Filterable;

/* JADX INFO: renamed from: android.support.v4.widget.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0320d extends BaseAdapter implements C0321e.a, Filterable {

    /* JADX INFO: renamed from: a */
    protected boolean f1663a;

    /* JADX INFO: renamed from: b */
    protected boolean f1664b;

    /* JADX INFO: renamed from: c */
    protected Cursor f1665c;

    /* JADX INFO: renamed from: d */
    protected Context f1666d;

    /* JADX INFO: renamed from: e */
    protected int f1667e;

    /* JADX INFO: renamed from: f */
    protected a f1668f;

    /* JADX INFO: renamed from: g */
    protected DataSetObserver f1669g;

    /* JADX INFO: renamed from: h */
    protected C0321e f1670h;

    /* JADX INFO: renamed from: i */
    protected FilterQueryProvider f1671i;

    /* JADX INFO: renamed from: android.support.v4.widget.d$a */
    private class a extends ContentObserver {
        a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            AbstractC0320d.this.m2386b();
        }
    }

    /* JADX INFO: renamed from: android.support.v4.widget.d$b */
    private class b extends DataSetObserver {
        b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            AbstractC0320d.this.f1663a = true;
            AbstractC0320d.this.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            AbstractC0320d.this.f1663a = false;
            AbstractC0320d.this.notifyDataSetInvalidated();
        }
    }

    public AbstractC0320d(Context context, Cursor cursor, boolean z) {
        m2381a(context, cursor, z ? 1 : 2);
    }

    @Override // android.support.v4.widget.C0321e.a
    /* JADX INFO: renamed from: a */
    public Cursor mo2378a() {
        return this.f1665c;
    }

    @Override // android.support.v4.widget.C0321e.a
    /* JADX INFO: renamed from: a */
    public Cursor mo2379a(CharSequence charSequence) {
        return this.f1671i != null ? this.f1671i.runQuery(charSequence) : this.f1665c;
    }

    /* JADX INFO: renamed from: a */
    public abstract View mo2380a(Context context, Cursor cursor, ViewGroup viewGroup);

    /* JADX INFO: renamed from: a */
    void m2381a(Context context, Cursor cursor, int i) {
        if ((i & 1) == 1) {
            i |= 2;
            this.f1664b = true;
        } else {
            this.f1664b = false;
        }
        boolean z = cursor != null;
        this.f1665c = cursor;
        this.f1663a = z;
        this.f1666d = context;
        this.f1667e = z ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i & 2) == 2) {
            this.f1668f = new a();
            this.f1669g = new b();
        } else {
            this.f1668f = null;
            this.f1669g = null;
        }
        if (z) {
            if (this.f1668f != null) {
                cursor.registerContentObserver(this.f1668f);
            }
            if (this.f1669g != null) {
                cursor.registerDataSetObserver(this.f1669g);
            }
        }
    }

    @Override // android.support.v4.widget.C0321e.a
    /* JADX INFO: renamed from: a */
    public void mo2382a(Cursor cursor) {
        Cursor cursorM2384b = m2384b(cursor);
        if (cursorM2384b != null) {
            cursorM2384b.close();
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo2383a(View view, Context context, Cursor cursor);

    /* JADX INFO: renamed from: b */
    public Cursor m2384b(Cursor cursor) {
        if (cursor == this.f1665c) {
            return null;
        }
        Cursor cursor2 = this.f1665c;
        if (cursor2 != null) {
            if (this.f1668f != null) {
                cursor2.unregisterContentObserver(this.f1668f);
            }
            if (this.f1669g != null) {
                cursor2.unregisterDataSetObserver(this.f1669g);
            }
        }
        this.f1665c = cursor;
        if (cursor == null) {
            this.f1667e = -1;
            this.f1663a = false;
            notifyDataSetInvalidated();
            return cursor2;
        }
        if (this.f1668f != null) {
            cursor.registerContentObserver(this.f1668f);
        }
        if (this.f1669g != null) {
            cursor.registerDataSetObserver(this.f1669g);
        }
        this.f1667e = cursor.getColumnIndexOrThrow("_id");
        this.f1663a = true;
        notifyDataSetChanged();
        return cursor2;
    }

    /* JADX INFO: renamed from: b */
    public View mo2385b(Context context, Cursor cursor, ViewGroup viewGroup) {
        return mo2380a(context, cursor, viewGroup);
    }

    /* JADX INFO: renamed from: b */
    protected void m2386b() {
        if (!this.f1664b || this.f1665c == null || this.f1665c.isClosed()) {
            return;
        }
        this.f1663a = this.f1665c.requery();
    }

    @Override // android.support.v4.widget.C0321e.a
    /* JADX INFO: renamed from: c */
    public CharSequence mo2387c(Cursor cursor) {
        return cursor == null ? "" : cursor.toString();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        if (!this.f1663a || this.f1665c == null) {
            return 0;
        }
        return this.f1665c.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f1663a) {
            return null;
        }
        this.f1665c.moveToPosition(i);
        if (view == null) {
            view = mo2385b(this.f1666d, this.f1665c, viewGroup);
        }
        mo2383a(view, this.f1666d, this.f1665c);
        return view;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f1670h == null) {
            this.f1670h = new C0321e(this);
        }
        return this.f1670h;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        if (!this.f1663a || this.f1665c == null) {
            return null;
        }
        this.f1665c.moveToPosition(i);
        return this.f1665c;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        if (this.f1663a && this.f1665c != null && this.f1665c.moveToPosition(i)) {
            return this.f1665c.getLong(this.f1667e);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f1663a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.f1665c.moveToPosition(i)) {
            throw new IllegalStateException("couldn't move cursor to position " + i);
        }
        if (view == null) {
            view = mo2380a(this.f1666d, this.f1665c, viewGroup);
        }
        mo2383a(view, this.f1666d, this.f1665c);
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }
}
