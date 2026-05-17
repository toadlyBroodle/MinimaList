package android.arch.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.arch.lifecycle.AbstractC0005b;
import android.content.ComponentCallbacks2;
import android.os.Bundle;

/* JADX INFO: renamed from: android.arch.lifecycle.g */
/* JADX INFO: loaded from: classes.dex */
public class FragmentC0010g extends Fragment {

    /* JADX INFO: renamed from: a */
    private a f38a;

    /* JADX INFO: renamed from: android.arch.lifecycle.g$a */
    interface a {
        /* JADX INFO: renamed from: a */
        void m39a();

        /* JADX INFO: renamed from: b */
        void m40b();

        /* JADX INFO: renamed from: c */
        void m41c();
    }

    /* JADX INFO: renamed from: a */
    public static void m34a(Activity activity) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new FragmentC0010g(), "android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    /* JADX INFO: renamed from: a */
    private void m35a(AbstractC0005b.a aVar) {
        ComponentCallbacks2 activity = getActivity();
        if (activity instanceof InterfaceC0008e) {
            ((InterfaceC0008e) activity).m32b().m29a(aVar);
        } else if (activity instanceof InterfaceC0006c) {
            AbstractC0005b abstractC0005bMo18a = ((InterfaceC0006c) activity).mo18a();
            if (abstractC0005bMo18a instanceof C0007d) {
                ((C0007d) abstractC0005bMo18a).m29a(aVar);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m36a(a aVar) {
        if (aVar != null) {
            aVar.m39a();
        }
    }

    /* JADX INFO: renamed from: b */
    private void m37b(a aVar) {
        if (aVar != null) {
            aVar.m40b();
        }
    }

    /* JADX INFO: renamed from: c */
    private void m38c(a aVar) {
        if (aVar != null) {
            aVar.m41c();
        }
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m36a(this.f38a);
        m35a(AbstractC0005b.a.ON_CREATE);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        m35a(AbstractC0005b.a.ON_DESTROY);
        this.f38a = null;
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        m35a(AbstractC0005b.a.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        m38c(this.f38a);
        m35a(AbstractC0005b.a.ON_RESUME);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        m37b(this.f38a);
        m35a(AbstractC0005b.a.ON_START);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        m35a(AbstractC0005b.a.ON_STOP);
    }
}
