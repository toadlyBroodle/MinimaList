package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.p018i.C0207a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.bf */
/* JADX INFO: loaded from: classes.dex */
public final class FragmentC1118bf extends Fragment implements InterfaceC1117be {

    /* JADX INFO: renamed from: a */
    private static WeakHashMap<Activity, WeakReference<FragmentC1118bf>> f5648a = new WeakHashMap<>();

    /* JADX INFO: renamed from: b */
    private Map<String, LifecycleCallback> f5649b = new C0207a();

    /* JADX INFO: renamed from: c */
    private int f5650c = 0;

    /* JADX INFO: renamed from: d */
    private Bundle f5651d;

    /* JADX INFO: renamed from: a */
    public static FragmentC1118bf m6886a(Activity activity) {
        FragmentC1118bf fragmentC1118bf;
        WeakReference<FragmentC1118bf> weakReference = f5648a.get(activity);
        if (weakReference == null || (fragmentC1118bf = weakReference.get()) == null) {
            try {
                fragmentC1118bf = (FragmentC1118bf) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                if (fragmentC1118bf == null || fragmentC1118bf.isRemoving()) {
                    fragmentC1118bf = new FragmentC1118bf();
                    activity.getFragmentManager().beginTransaction().add(fragmentC1118bf, "LifecycleFragmentImpl").commitAllowingStateLoss();
                }
                f5648a.put(activity, new WeakReference<>(fragmentC1118bf));
            } catch (ClassCastException e) {
                throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e);
            }
        }
        return fragmentC1118bf;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1117be
    /* JADX INFO: renamed from: a */
    public final <T extends LifecycleCallback> T mo6882a(String str, Class<T> cls) {
        return cls.cast(this.f5649b.get(str));
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1117be
    /* JADX INFO: renamed from: a */
    public final void mo6883a(String str, LifecycleCallback lifecycleCallback) {
        if (this.f5649b.containsKey(str)) {
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(str).length() + 59).append("LifecycleCallback with tag ").append(str).append(" already added to this fragment.").toString());
        }
        this.f5649b.put(str, lifecycleCallback);
        if (this.f5650c > 0) {
            new Handler(Looper.getMainLooper()).post(new RunnableC1119bg(this, lifecycleCallback, str));
        }
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator<LifecycleCallback> it = this.f5649b.values().iterator();
        while (it.hasNext()) {
            it.next().mo6719a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1117be
    /* JADX INFO: renamed from: k_ */
    public final Activity mo6884k_() {
        return getActivity();
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Iterator<LifecycleCallback> it = this.f5649b.values().iterator();
        while (it.hasNext()) {
            it.next().mo6717a(i, i2, intent);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f5650c = 1;
        this.f5651d = bundle;
        for (Map.Entry<String, LifecycleCallback> entry : this.f5649b.entrySet()) {
            entry.getValue().mo6718a(bundle != null ? bundle.getBundle(entry.getKey()) : null);
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f5650c = 5;
        Iterator<LifecycleCallback> it = this.f5649b.values().iterator();
        while (it.hasNext()) {
            it.next().m6723e();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f5650c = 3;
        Iterator<LifecycleCallback> it = this.f5649b.values().iterator();
        while (it.hasNext()) {
            it.next().mo6722c();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry<String, LifecycleCallback> entry : this.f5649b.entrySet()) {
            Bundle bundle2 = new Bundle();
            entry.getValue().mo6721b(bundle2);
            bundle.putBundle(entry.getKey(), bundle2);
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f5650c = 2;
        Iterator<LifecycleCallback> it = this.f5649b.values().iterator();
        while (it.hasNext()) {
            it.next().mo6720b();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f5650c = 4;
        Iterator<LifecycleCallback> it = this.f5649b.values().iterator();
        while (it.hasNext()) {
            it.next().mo6250d();
        }
    }
}
