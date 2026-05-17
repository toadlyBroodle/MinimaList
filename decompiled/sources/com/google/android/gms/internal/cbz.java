package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface cbz {
    /* JADX INFO: renamed from: a */
    View mo10663a(View.OnClickListener onClickListener, boolean z);

    /* JADX INFO: renamed from: a */
    void mo10676a(MotionEvent motionEvent);

    /* JADX INFO: renamed from: a */
    void mo10677a(View view);

    /* JADX INFO: renamed from: a */
    void mo10678a(View view, cbx cbxVar);

    /* JADX INFO: renamed from: a */
    void mo10679a(View view, String str, Bundle bundle, Map<String, WeakReference<View>> map, View view2);

    /* JADX INFO: renamed from: a */
    void mo10664a(View view, Map<String, WeakReference<View>> map);

    /* JADX INFO: renamed from: a */
    void mo10665a(View view, Map<String, WeakReference<View>> map, Bundle bundle, View view2);

    /* JADX INFO: renamed from: a */
    boolean mo10668a();

    /* JADX INFO: renamed from: a */
    boolean mo10680a(Bundle bundle);

    /* JADX INFO: renamed from: b */
    void mo10681b(Bundle bundle);

    /* JADX INFO: renamed from: b */
    void mo10682b(View view);

    /* JADX INFO: renamed from: b */
    void mo10669b(View view, Map<String, WeakReference<View>> map);

    /* JADX INFO: renamed from: b */
    boolean mo10670b();

    /* JADX INFO: renamed from: c */
    void mo10683c(Bundle bundle);

    /* JADX INFO: renamed from: c */
    void mo10684c(View view, Map<String, WeakReference<View>> map);

    /* JADX INFO: renamed from: f */
    void mo10674f();

    /* JADX INFO: renamed from: g */
    void mo10675g();

    /* JADX INFO: renamed from: h */
    View mo10685h();

    /* JADX INFO: renamed from: i */
    Context mo10686i();
}
