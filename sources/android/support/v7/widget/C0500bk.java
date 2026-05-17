package android.support.v7.widget;

import android.annotation.TargetApi;
import android.os.Build;
import android.view.View;

/* JADX INFO: renamed from: android.support.v7.widget.bk */
/* JADX INFO: loaded from: classes.dex */
public class C0500bk {

    /* JADX INFO: renamed from: a */
    private static final c f3497a;

    /* JADX INFO: renamed from: android.support.v7.widget.bk$a */
    @TargetApi(26)
    private static class a implements c {
        private a() {
        }

        @Override // android.support.v7.widget.C0500bk.c
        /* JADX INFO: renamed from: a */
        public void mo4541a(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    /* JADX INFO: renamed from: android.support.v7.widget.bk$b */
    private static class b implements c {
        private b() {
        }

        @Override // android.support.v7.widget.C0500bk.c
        /* JADX INFO: renamed from: a */
        public void mo4541a(View view, CharSequence charSequence) {
            ViewOnAttachStateChangeListenerC0501bl.m4545a(view, charSequence);
        }
    }

    /* JADX INFO: renamed from: android.support.v7.widget.bk$c */
    private interface c {
        /* JADX INFO: renamed from: a */
        void mo4541a(View view, CharSequence charSequence);
    }

    static {
        if (Build.VERSION.SDK_INT >= 26) {
            f3497a = new a();
        } else {
            f3497a = new b();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m4540a(View view, CharSequence charSequence) {
        f3497a.mo4541a(view, charSequence);
    }
}
