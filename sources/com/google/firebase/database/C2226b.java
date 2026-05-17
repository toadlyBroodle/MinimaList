package com.google.firebase.database;

import com.google.android.gms.internal.ayg;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.google.firebase.database.b */
/* JADX INFO: loaded from: classes.dex */
public class C2226b {

    /* JADX INFO: renamed from: a */
    private static final Map<Integer, String> f12912a;

    /* JADX INFO: renamed from: b */
    private static final Map<String, Integer> f12913b;

    /* JADX INFO: renamed from: c */
    private final int f12914c;

    /* JADX INFO: renamed from: d */
    private final String f12915d;

    /* JADX INFO: renamed from: e */
    private final String f12916e;

    static {
        HashMap map = new HashMap();
        f12912a = map;
        map.put(-1, "The transaction needs to be run again with current data");
        f12912a.put(-2, "The server indicated that this operation failed");
        f12912a.put(-3, "This client does not have permission to perform this operation");
        f12912a.put(-4, "The operation had to be aborted due to a network disconnect");
        f12912a.put(-6, "The supplied auth token has expired");
        f12912a.put(-7, "The supplied auth token was invalid");
        f12912a.put(-8, "The transaction had too many retries");
        f12912a.put(-9, "The transaction was overridden by a subsequent set");
        f12912a.put(-10, "The service is unavailable");
        f12912a.put(-11, "User code called from the Firebase Database runloop threw an exception:\n");
        f12912a.put(-24, "The operation could not be performed due to a network error");
        f12912a.put(-25, "The write was canceled by the user.");
        f12912a.put(-999, "An unknown error occurred");
        HashMap map2 = new HashMap();
        f12913b = map2;
        map2.put("datastale", -1);
        f12913b.put("failure", -2);
        f12913b.put("permission_denied", -3);
        f12913b.put("disconnected", -4);
        f12913b.put("expired_token", -6);
        f12913b.put("invalid_token", -7);
        f12913b.put("maxretries", -8);
        f12913b.put("overriddenbyset", -9);
        f12913b.put("unavailable", -10);
        f12913b.put("network_error", -24);
        f12913b.put("write_canceled", -25);
    }

    private C2226b(int i, String str) {
        this(-11, str, null);
    }

    private C2226b(int i, String str, String str2) {
        this.f12914c = i;
        this.f12915d = str;
        this.f12916e = "";
    }

    /* JADX INFO: renamed from: a */
    public static C2226b m12963a(int i) {
        if (f12912a.containsKey(-25)) {
            return new C2226b(-25, f12912a.get(-25), null);
        }
        throw new IllegalArgumentException(new StringBuilder(49).append("Invalid Firebase Database error code: -25").toString());
    }

    /* JADX INFO: renamed from: a */
    public static C2226b m12964a(String str) {
        Integer num = f12913b.get(str.toLowerCase());
        Integer num2 = num == null ? -999 : num;
        return new C2226b(num2.intValue(), f12912a.get(num2), null);
    }

    /* JADX INFO: renamed from: a */
    public static C2226b m12965a(String str, String str2) {
        Integer num = f12913b.get(str.toLowerCase());
        Integer num2 = num == null ? -999 : num;
        return new C2226b(num2.intValue(), str2 == null ? f12912a.get(num2) : str2, null);
    }

    /* JADX INFO: renamed from: a */
    public static C2226b m12966a(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        ayg.m8688a(th, new PrintWriter(stringWriter));
        String strValueOf = String.valueOf(f12912a.get(-11));
        String strValueOf2 = String.valueOf(stringWriter.toString());
        return new C2226b(-11, strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf));
    }

    /* JADX INFO: renamed from: a */
    public int m12967a() {
        return this.f12914c;
    }

    /* JADX INFO: renamed from: b */
    public C2227c m12968b() {
        String strValueOf = String.valueOf(this.f12915d);
        return new C2227c(strValueOf.length() != 0 ? "Firebase Database error: ".concat(strValueOf) : new String("Firebase Database error: "));
    }

    public String toString() {
        String strValueOf = String.valueOf(this.f12915d);
        return strValueOf.length() != 0 ? "DatabaseError: ".concat(strValueOf) : new String("DatabaseError: ");
    }
}
