package android.support.v4.p019j;

import android.view.View;

/* JADX INFO: renamed from: android.support.v4.j.l */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0241l {
    boolean onNestedFling(View view, float f, float f2, boolean z);

    boolean onNestedPreFling(View view, float f, float f2);

    void onNestedPreScroll(View view, int i, int i2, int[] iArr);

    void onNestedScroll(View view, int i, int i2, int i3, int i4);

    void onNestedScrollAccepted(View view, View view2, int i);

    boolean onStartNestedScroll(View view, View view2, int i);

    void onStopNestedScroll(View view);
}
