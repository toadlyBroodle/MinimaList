package com.google.android.gms.internal;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class ayk extends ayh {

    /* JADX INFO: renamed from: a */
    private final ayi f7577a = new ayi();

    ayk() {
    }

    @Override // com.google.android.gms.internal.ayh
    /* JADX INFO: renamed from: a */
    public final void mo8689a(Throwable th, PrintStream printStream) {
        th.printStackTrace(printStream);
        List<Throwable> listM8691a = this.f7577a.m8691a(th, false);
        if (listM8691a == null) {
            return;
        }
        synchronized (listM8691a) {
            for (Throwable th2 : listM8691a) {
                printStream.print("Suppressed: ");
                th2.printStackTrace(printStream);
            }
        }
    }

    @Override // com.google.android.gms.internal.ayh
    /* JADX INFO: renamed from: a */
    public final void mo8690a(Throwable th, PrintWriter printWriter) {
        th.printStackTrace(printWriter);
        List<Throwable> listM8691a = this.f7577a.m8691a(th, false);
        if (listM8691a == null) {
            return;
        }
        synchronized (listM8691a) {
            for (Throwable th2 : listM8691a) {
                printWriter.print("Suppressed: ");
                th2.printStackTrace(printWriter);
            }
        }
    }
}
