package android.support.v4.widget;

import android.os.Build;
import android.view.View;
import android.widget.ListView;

/* JADX INFO: renamed from: android.support.v4.widget.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0326j {
    /* JADX INFO: renamed from: a */
    public static void m2460a(ListView listView, int i) {
        View childAt;
        if (Build.VERSION.SDK_INT >= 19) {
            listView.scrollListBy(i);
            return;
        }
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        if (firstVisiblePosition == -1 || (childAt = listView.getChildAt(0)) == null) {
            return;
        }
        listView.setSelectionFromTop(firstVisiblePosition, childAt.getTop() - i);
    }
}
