package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.common.util.C1303g;
import com.google.android.gms.common.util.InterfaceC1300d;

/* JADX INFO: loaded from: classes.dex */
public abstract class aps {

    /* JADX INFO: renamed from: a */
    protected final aqc f7040a;

    /* JADX INFO: renamed from: b */
    protected final agv f7041b;

    /* JADX INFO: renamed from: c */
    private int f7042c;

    /* JADX INFO: renamed from: d */
    private apy f7043d;

    /* JADX INFO: renamed from: e */
    private InterfaceC1300d f7044e;

    public aps(int i, aqc aqcVar, apy apyVar, agv agvVar) {
        this(i, aqcVar, apyVar, agvVar, C1303g.m7263d());
    }

    private aps(int i, aqc aqcVar, apy apyVar, agv agvVar, InterfaceC1300d interfaceC1300d) {
        this.f7040a = (aqc) C1221aj.m7065a(aqcVar);
        C1221aj.m7065a(aqcVar.m8137a());
        this.f7042c = i;
        this.f7043d = (apy) C1221aj.m7065a(apyVar);
        this.f7044e = (InterfaceC1300d) C1221aj.m7065a(interfaceC1300d);
        this.f7041b = agvVar;
    }

    /* JADX INFO: renamed from: b */
    private final aqd m8124b(byte[] bArr) {
        aqd aqdVarMo8136a = null;
        try {
            aqdVarMo8136a = this.f7043d.mo8136a(bArr);
            if (aqdVarMo8136a == null) {
                ahs.m7946c("Parsed resource from is null");
            }
        } catch (apq e) {
            ahs.m7946c("Resource data is corrupted");
        }
        return aqdVarMo8136a;
    }

    /* JADX INFO: renamed from: a */
    public final void m8125a(int i, int i2) {
        String str;
        if (this.f7041b != null && i2 == 0 && i == 3) {
            this.f7041b.m7884e();
        }
        String strM8107a = this.f7040a.m8137a().m8107a();
        switch (i) {
            case 0:
                str = "Resource not available";
                break;
            case 1:
                str = "IOError";
                break;
            case 2:
                str = "Server error";
                break;
            default:
                str = "Unknown reason";
                break;
        }
        ahs.m7947d(new StringBuilder(String.valueOf(strM8107a).length() + 61 + String.valueOf(str).length()).append("Failed to fetch the container resource for the container \"").append(strM8107a).append("\": ").append(str).toString());
        mo8126a(new aqd(Status.f5453c, i2));
    }

    /* JADX INFO: renamed from: a */
    protected abstract void mo8126a(aqd aqdVar);

    /* JADX INFO: renamed from: a */
    public final void m8127a(byte[] bArr) {
        aqd aqdVar;
        aqd aqdVarM8124b = m8124b(bArr);
        if (this.f7041b != null && this.f7042c == 0) {
            this.f7041b.m7885f();
        }
        if (aqdVarM8124b == null || aqdVarM8124b.mo6094a() != Status.f5451a) {
            aqdVar = new aqd(Status.f5453c, this.f7042c);
        } else {
            aqdVar = new aqd(Status.f5451a, this.f7042c, new aqe(this.f7040a.m8137a(), bArr, aqdVarM8124b.m8140b().m8146c(), this.f7044e.mo7252a()), aqdVarM8124b.m8141c());
        }
        mo8126a(aqdVar);
    }
}
