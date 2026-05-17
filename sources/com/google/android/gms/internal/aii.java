package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C1221aj;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class aii {

    /* JADX INFO: renamed from: a */
    private aii f6842a;

    /* JADX INFO: renamed from: b */
    private Map<String, arh> f6843b;

    public aii() {
        this(null);
    }

    private aii(aii aiiVar) {
        this.f6843b = null;
        this.f6842a = aiiVar;
    }

    /* JADX INFO: renamed from: a */
    public final aii m8000a() {
        return new aii(this);
    }

    /* JADX INFO: renamed from: a */
    public final void m8001a(String str, arh<?> arhVar) {
        if (this.f6843b == null) {
            this.f6843b = new HashMap();
        }
        this.f6843b.put(str, arhVar);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m8002a(String str) {
        while (true) {
            if (this.f6843b != null && this.f6843b.containsKey(str)) {
                return true;
            }
            if (this.f6842a == null) {
                return false;
            }
            this = this.f6842a;
        }
    }

    /* JADX INFO: renamed from: b */
    public final arh<?> m8003b(String str) {
        while (true) {
            if (this.f6843b != null && this.f6843b.containsKey(str)) {
                return this.f6843b.get(str);
            }
            if (this.f6842a == null) {
                String strValueOf = String.valueOf(str);
                throw new IllegalStateException(strValueOf.length() != 0 ? "Trying to get a non existent symbol: ".concat(strValueOf) : new String("Trying to get a non existent symbol: "));
            }
            this = this.f6842a;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m8004b(String str, arh<?> arhVar) {
        while (true) {
            if (this.f6843b != null && this.f6843b.containsKey(str)) {
                this.f6843b.put(str, arhVar);
                return;
            } else {
                if (this.f6842a == null) {
                    String strValueOf = String.valueOf(str);
                    throw new IllegalStateException(strValueOf.length() != 0 ? "Trying to modify a non existent symbol: ".concat(strValueOf) : new String("Trying to modify a non existent symbol: "));
                }
                this = this.f6842a;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m8005c(String str) {
        while (true) {
            C1221aj.m7070a(this.m8002a(str));
            if (this.f6843b != null && this.f6843b.containsKey(str)) {
                this.f6843b.remove(str);
                return;
            }
            this = this.f6842a;
        }
    }
}
