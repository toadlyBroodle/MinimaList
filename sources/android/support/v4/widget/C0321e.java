package android.support.v4.widget;

import android.database.Cursor;
import android.widget.Filter;

/* JADX INFO: renamed from: android.support.v4.widget.e */
/* JADX INFO: loaded from: classes.dex */
class C0321e extends Filter {

    /* JADX INFO: renamed from: a */
    a f1674a;

    /* JADX INFO: renamed from: android.support.v4.widget.e$a */
    interface a {
        /* JADX INFO: renamed from: a */
        Cursor mo2378a();

        /* JADX INFO: renamed from: a */
        Cursor mo2379a(CharSequence charSequence);

        /* JADX INFO: renamed from: a */
        void mo2382a(Cursor cursor);

        /* JADX INFO: renamed from: c */
        CharSequence mo2387c(Cursor cursor);
    }

    C0321e(a aVar) {
        this.f1674a = aVar;
    }

    @Override // android.widget.Filter
    public CharSequence convertResultToString(Object obj) {
        return this.f1674a.mo2387c((Cursor) obj);
    }

    @Override // android.widget.Filter
    protected Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor cursorMo2379a = this.f1674a.mo2379a(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (cursorMo2379a != null) {
            filterResults.count = cursorMo2379a.getCount();
            filterResults.values = cursorMo2379a;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    @Override // android.widget.Filter
    protected void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor cursorMo2378a = this.f1674a.mo2378a();
        if (filterResults.values == null || filterResults.values == cursorMo2378a) {
            return;
        }
        this.f1674a.mo2382a((Cursor) filterResults.values);
    }
}
