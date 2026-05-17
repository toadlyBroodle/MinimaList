package android.support.transition;

import android.os.Build;
import android.view.ViewGroup;

/* JADX INFO: renamed from: android.support.transition.af */
/* JADX INFO: loaded from: classes.dex */
class C0091af {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC0094ai f505a;

    static {
        if (Build.VERSION.SDK_INT >= 18) {
            f505a = new C0093ah();
        } else {
            f505a = new C0092ag();
        }
    }

    /* JADX INFO: renamed from: a */
    static InterfaceC0090ae m595a(ViewGroup viewGroup) {
        return f505a.mo598a(viewGroup);
    }

    /* JADX INFO: renamed from: a */
    static void m596a(ViewGroup viewGroup, boolean z) {
        f505a.mo599a(viewGroup, z);
    }
}
