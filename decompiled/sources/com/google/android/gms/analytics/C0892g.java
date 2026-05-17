package com.google.android.gms.analytics;

import android.content.Context;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

/* JADX INFO: renamed from: com.google.android.gms.analytics.g */
/* JADX INFO: loaded from: classes.dex */
public class C0892g implements InterfaceC0887b {

    /* JADX INFO: renamed from: a */
    private final TreeSet<String> f4930a = new TreeSet<>();

    public C0892g(Context context, Collection<String> collection) {
        m5997a(context, collection);
    }

    @Override // com.google.android.gms.analytics.InterfaceC0887b
    /* JADX INFO: renamed from: a */
    public String mo5962a(String str, Throwable th) {
        return m5995a(m5996a(th), m5998b(m5996a(th)), str);
    }

    /* JADX INFO: renamed from: a */
    protected String m5995a(Throwable th, StackTraceElement stackTraceElement, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(th.getClass().getSimpleName());
        if (stackTraceElement != null) {
            String[] strArrSplit = stackTraceElement.getClassName().split("\\.");
            String str2 = "unknown";
            if (strArrSplit != null && strArrSplit.length > 0) {
                str2 = strArrSplit[strArrSplit.length - 1];
            }
            sb.append(String.format(" (@%s:%s:%s)", str2, stackTraceElement.getMethodName(), Integer.valueOf(stackTraceElement.getLineNumber())));
        }
        if (str != null) {
            sb.append(String.format(" {%s}", str));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    protected Throwable m5996a(Throwable th) {
        while (th.getCause() != null) {
            th = th.getCause();
        }
        return th;
    }

    /* JADX INFO: renamed from: a */
    public void m5997a(Context context, Collection<String> collection) {
        boolean z;
        this.f4930a.clear();
        HashSet<String> hashSet = new HashSet();
        if (collection != null) {
            hashSet.addAll(collection);
        }
        if (context != null) {
            hashSet.add(context.getApplicationContext().getPackageName());
        }
        for (String str : hashSet) {
            boolean z2 = true;
            Iterator<String> it = this.f4930a.iterator();
            while (true) {
                z = z2;
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                if (str.startsWith(next)) {
                    z2 = false;
                } else if (next.startsWith(str)) {
                    this.f4930a.remove(next);
                }
            }
            if (z) {
                this.f4930a.add(str);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    protected StackTraceElement m5998b(Throwable th) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        if (stackTrace == null || stackTrace.length == 0) {
            return null;
        }
        for (StackTraceElement stackTraceElement : stackTrace) {
            String className = stackTraceElement.getClassName();
            Iterator<String> it = this.f4930a.iterator();
            while (it.hasNext()) {
                if (className.startsWith(it.next())) {
                    return stackTraceElement;
                }
            }
        }
        return stackTrace[0];
    }
}
