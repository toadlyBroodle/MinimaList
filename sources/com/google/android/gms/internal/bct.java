package com.google.android.gms.internal;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class bct implements bea {

    /* JADX INFO: renamed from: a */
    private static long f7804a = 0;

    /* JADX INFO: renamed from: b */
    private bdb f7805b;

    /* JADX INFO: renamed from: c */
    private bdx f7806c;

    /* JADX INFO: renamed from: d */
    private bcu f7807d;

    /* JADX INFO: renamed from: e */
    private int f7808e;

    /* JADX INFO: renamed from: f */
    private final bkl f7809f;

    public bct(bcz bczVar, bdb bdbVar, String str, bcu bcuVar, String str2) {
        long j = f7804a;
        f7804a = 1 + j;
        this.f7805b = bdbVar;
        this.f7807d = bcuVar;
        this.f7809f = new bkl(bczVar.m8942a(), "Connection", new StringBuilder(25).append("conn_").append(j).toString());
        this.f7808e = bcw.f7813a;
        this.f7806c = new bdx(bczVar, bdbVar, str, this, str2);
    }

    /* JADX INFO: renamed from: a */
    private final void m8928a(bcv bcvVar) {
        if (this.f7808e != bcw.f7815c) {
            if (this.f7809f.m9541a()) {
                this.f7809f.m9540a("closing realtime connection", null, new Object[0]);
            }
            this.f7808e = bcw.f7815c;
            if (this.f7806c != null) {
                this.f7806c.m9066b();
                this.f7806c = null;
            }
            this.f7807d.mo8935a(bcvVar);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m8929a() {
        if (this.f7809f.m9541a()) {
            this.f7809f.m9540a("Opening a connection", null, new Object[0]);
        }
        this.f7806c.m9064a();
    }

    @Override // com.google.android.gms.internal.bea
    /* JADX INFO: renamed from: a */
    public final void mo8930a(Map<String, Object> map) {
        try {
            String str = (String) map.get("t");
            if (str == null) {
                if (this.f7809f.m9541a()) {
                    bkl bklVar = this.f7809f;
                    String strValueOf = String.valueOf(map.toString());
                    bklVar.m9540a(strValueOf.length() != 0 ? "Failed to parse server message: missing message type:".concat(strValueOf) : new String("Failed to parse server message: missing message type:"), null, new Object[0]);
                }
                m8928a(bcv.OTHER);
                return;
            }
            if (str.equals("d")) {
                Map<String, Object> map2 = (Map) map.get("d");
                if (this.f7809f.m9541a()) {
                    bkl bklVar2 = this.f7809f;
                    String strValueOf2 = String.valueOf(map2.toString());
                    bklVar2.m9540a(strValueOf2.length() != 0 ? "received data message: ".concat(strValueOf2) : new String("received data message: "), null, new Object[0]);
                }
                this.f7807d.mo8937a(map2);
                return;
            }
            if (!str.equals("c")) {
                if (this.f7809f.m9541a()) {
                    bkl bklVar3 = this.f7809f;
                    String strValueOf3 = String.valueOf(str);
                    bklVar3.m9540a(strValueOf3.length() != 0 ? "Ignoring unknown server message type: ".concat(strValueOf3) : new String("Ignoring unknown server message type: "), null, new Object[0]);
                    return;
                }
                return;
            }
            Map map3 = (Map) map.get("d");
            if (this.f7809f.m9541a()) {
                bkl bklVar4 = this.f7809f;
                String strValueOf4 = String.valueOf(map3.toString());
                bklVar4.m9540a(strValueOf4.length() != 0 ? "Got control message: ".concat(strValueOf4) : new String("Got control message: "), null, new Object[0]);
            }
            try {
                String str2 = (String) map3.get("t");
                if (str2 == null) {
                    if (this.f7809f.m9541a()) {
                        bkl bklVar5 = this.f7809f;
                        String strValueOf5 = String.valueOf(map3.toString());
                        bklVar5.m9540a(strValueOf5.length() != 0 ? "Got invalid control message: ".concat(strValueOf5) : new String("Got invalid control message: "), null, new Object[0]);
                    }
                    m8928a(bcv.OTHER);
                    return;
                }
                if (str2.equals("s")) {
                    String str3 = (String) map3.get("d");
                    if (this.f7809f.m9541a()) {
                        this.f7809f.m9540a("Connection shutdown command received. Shutting down...", null, new Object[0]);
                    }
                    this.f7807d.mo8938b(str3);
                    m8928a(bcv.OTHER);
                    return;
                }
                if (str2.equals("r")) {
                    String str4 = (String) map3.get("d");
                    if (this.f7809f.m9541a()) {
                        bkl bklVar6 = this.f7809f;
                        String strM8953a = this.f7805b.m8953a();
                        bklVar6.m9540a(new StringBuilder(String.valueOf(strM8953a).length() + 62 + String.valueOf(str4).length()).append("Got a reset; killing connection to ").append(strM8953a).append("; Updating internalHost to ").append(str4).toString(), null, new Object[0]);
                    }
                    this.f7807d.mo8936a(str4);
                    m8928a(bcv.SERVER_RESET);
                    return;
                }
                if (!str2.equals("h")) {
                    if (this.f7809f.m9541a()) {
                        bkl bklVar7 = this.f7809f;
                        String strValueOf6 = String.valueOf(str2);
                        bklVar7.m9540a(strValueOf6.length() != 0 ? "Ignoring unknown control message: ".concat(strValueOf6) : new String("Ignoring unknown control message: "), null, new Object[0]);
                        return;
                    }
                    return;
                }
                Map map4 = (Map) map3.get("d");
                long jLongValue = ((Long) map4.get("ts")).longValue();
                this.f7807d.mo8936a((String) map4.get("h"));
                String str5 = (String) map4.get("s");
                if (this.f7808e == bcw.f7813a) {
                    if (this.f7809f.m9541a()) {
                        this.f7809f.m9540a("realtime connection established", null, new Object[0]);
                    }
                    this.f7808e = bcw.f7814b;
                    this.f7807d.mo8934a(jLongValue, str5);
                }
            } catch (ClassCastException e) {
                if (this.f7809f.m9541a()) {
                    bkl bklVar8 = this.f7809f;
                    String strValueOf7 = String.valueOf(e.toString());
                    bklVar8.m9540a(strValueOf7.length() != 0 ? "Failed to parse control message: ".concat(strValueOf7) : new String("Failed to parse control message: "), null, new Object[0]);
                }
                m8928a(bcv.OTHER);
            }
        } catch (ClassCastException e2) {
            if (this.f7809f.m9541a()) {
                bkl bklVar9 = this.f7809f;
                String strValueOf8 = String.valueOf(e2.toString());
                bklVar9.m9540a(strValueOf8.length() != 0 ? "Failed to parse server message: ".concat(strValueOf8) : new String("Failed to parse server message: "), null, new Object[0]);
            }
            m8928a(bcv.OTHER);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m8931a(Map<String, Object> map, boolean z) {
        HashMap map2 = new HashMap();
        map2.put("t", "d");
        map2.put("d", map);
        if (this.f7808e != bcw.f7814b) {
            this.f7809f.m9540a("Tried to send on an unconnected connection", null, new Object[0]);
            return;
        }
        if (z) {
            this.f7809f.m9540a("Sending data (contents hidden)", null, new Object[0]);
        } else {
            this.f7809f.m9540a("Sending data: %s", null, map2);
        }
        this.f7806c.m9065a(map2);
    }

    @Override // com.google.android.gms.internal.bea
    /* JADX INFO: renamed from: a */
    public final void mo8932a(boolean z) {
        this.f7806c = null;
        if (z || this.f7808e != bcw.f7813a) {
            if (this.f7809f.m9541a()) {
                this.f7809f.m9540a("Realtime connection lost", null, new Object[0]);
            }
        } else if (this.f7809f.m9541a()) {
            this.f7809f.m9540a("Realtime connection failed", null, new Object[0]);
        }
        m8928a(bcv.OTHER);
    }

    /* JADX INFO: renamed from: b */
    public final void m8933b() {
        m8928a(bcv.OTHER);
    }
}
