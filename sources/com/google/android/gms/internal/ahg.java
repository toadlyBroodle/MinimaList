package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.util.C1303g;
import com.google.android.gms.common.util.InterfaceC1300d;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes.dex */
final class ahg extends Thread implements ahf {

    /* JADX INFO: renamed from: d */
    private static ahg f6772d;

    /* JADX INFO: renamed from: a */
    private final LinkedBlockingQueue<Runnable> f6773a;

    /* JADX INFO: renamed from: b */
    private volatile boolean f6774b;

    /* JADX INFO: renamed from: c */
    private volatile boolean f6775c;

    /* JADX INFO: renamed from: e */
    private volatile ahi f6776e;

    /* JADX INFO: renamed from: f */
    private final Context f6777f;

    /* JADX INFO: renamed from: g */
    private final InterfaceC1300d f6778g;

    private ahg(Context context) {
        super("GAThread");
        this.f6773a = new LinkedBlockingQueue<>();
        this.f6774b = false;
        this.f6775c = false;
        this.f6778g = C1303g.m7263d();
        if (context != null) {
            this.f6777f = context.getApplicationContext();
        } else {
            this.f6777f = context;
        }
        start();
    }

    /* JADX INFO: renamed from: a */
    static ahg m7923a(Context context) {
        if (f6772d == null) {
            f6772d = new ahg(context);
        }
        return f6772d;
    }

    @Override // com.google.android.gms.internal.ahf
    /* JADX INFO: renamed from: a */
    public final void mo7921a(Runnable runnable) {
        this.f6773a.add(runnable);
    }

    @Override // com.google.android.gms.internal.ahf
    /* JADX INFO: renamed from: a */
    public final void mo7922a(String str, String str2, String str3, Map<String, String> map, String str4) {
        mo7921a(new ahh(this, this, this.f6778g.mo7252a(), str, str2, str3, map, str4));
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        while (true) {
            boolean z = this.f6775c;
            try {
                try {
                    Runnable runnableTake = this.f6773a.take();
                    if (!this.f6774b) {
                        runnableTake.run();
                    }
                } catch (InterruptedException e) {
                    ahs.m7946c(e.toString());
                }
            } catch (Throwable th) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                PrintStream printStream = new PrintStream(byteArrayOutputStream);
                ayg.m8687a(th, printStream);
                printStream.flush();
                String strValueOf = String.valueOf(new String(byteArrayOutputStream.toByteArray()));
                ahs.m7942a(strValueOf.length() != 0 ? "Error on Google TagManager Thread: ".concat(strValueOf) : new String("Error on Google TagManager Thread: "));
                ahs.m7942a("Google TagManager is shutting down.");
                this.f6774b = true;
            }
        }
    }
}
