package com.google.android.gms.internal;

import java.io.PrintStream;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public final class ayg {

    /* JADX INFO: renamed from: a */
    private static ayh f7571a;

    /* JADX INFO: renamed from: b */
    private static int f7572b;

    /* JADX INFO: renamed from: com.google.android.gms.internal.ayg$a */
    static final class C1420a extends ayh {
        C1420a() {
        }

        @Override // com.google.android.gms.internal.ayh
        /* JADX INFO: renamed from: a */
        public final void mo8689a(Throwable th, PrintStream printStream) {
            th.printStackTrace(printStream);
        }

        @Override // com.google.android.gms.internal.ayh
        /* JADX INFO: renamed from: a */
        public final void mo8690a(Throwable th, PrintWriter printWriter) {
            th.printStackTrace(printWriter);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001d A[Catch: Throwable -> 0x002e, TRY_ENTER, TryCatch #0 {Throwable -> 0x002e, blocks: (B:5:0x0008, B:7:0x0010, B:13:0x001d, B:17:0x0028, B:22:0x006a), top: B:28:0x0008 }] */
    static {
        Integer numM8686a;
        Throwable th;
        ayh c1420a;
        try {
            numM8686a = m8686a();
            if (numM8686a != null) {
                try {
                    if (numM8686a.intValue() >= 19) {
                        c1420a = new ayl();
                    } else {
                        c1420a = !Boolean.getBoolean("com.google.devtools.build.android.desugar.runtime.twr_disable_mimic") ? new ayk() : new C1420a();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    PrintStream printStream = System.err;
                    String name = C1420a.class.getName();
                    printStream.println(new StringBuilder(String.valueOf(name).length() + 132).append("An error has occured when initializing the try-with-resources desuguring strategy. The default strategy ").append(name).append("will be used. The error is: ").toString());
                    th.printStackTrace(System.err);
                    c1420a = new C1420a();
                }
            }
        } catch (Throwable th3) {
            numM8686a = null;
            th = th3;
        }
        f7571a = c1420a;
        f7572b = numM8686a == null ? 1 : numM8686a.intValue();
    }

    /* JADX INFO: renamed from: a */
    private static Integer m8686a() {
        try {
            return (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
        } catch (Exception e) {
            System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
            e.printStackTrace(System.err);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m8687a(Throwable th, PrintStream printStream) {
        f7571a.mo8689a(th, printStream);
    }

    /* JADX INFO: renamed from: a */
    public static void m8688a(Throwable th, PrintWriter printWriter) {
        f7571a.mo8690a(th, printWriter);
    }
}
