package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.C0710au;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class bur {

    /* JADX INFO: renamed from: b */
    private int f9059b;

    /* JADX INFO: renamed from: a */
    private final Object f9058a = new Object();

    /* JADX INFO: renamed from: c */
    private List<buq> f9060c = new LinkedList();

    /* JADX INFO: renamed from: a */
    public final buq m10282a() {
        int i;
        buq buqVar;
        int i2;
        buq buqVar2 = null;
        int i3 = 0;
        synchronized (this.f9058a) {
            if (this.f9060c.size() == 0) {
                C1560fm.m11610b("Queue empty");
                return null;
            }
            if (this.f9060c.size() < 2) {
                buq buqVar3 = this.f9060c.get(0);
                buqVar3.m10276e();
                return buqVar3;
            }
            int i4 = Integer.MIN_VALUE;
            int i5 = 0;
            for (buq buqVar4 : this.f9060c) {
                int iM10280i = buqVar4.m10280i();
                if (iM10280i > i4) {
                    i2 = iM10280i;
                    buqVar = buqVar4;
                    i = i5;
                } else {
                    i = i3;
                    buqVar = buqVar2;
                    i2 = i4;
                }
                i5++;
                i4 = i2;
                buqVar2 = buqVar;
                i3 = i;
            }
            this.f9060c.remove(i3);
            return buqVar2;
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m10283a(buq buqVar) {
        boolean z;
        synchronized (this.f9058a) {
            z = this.f9060c.contains(buqVar);
        }
        return z;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m10284b(buq buqVar) {
        synchronized (this.f9058a) {
            Iterator<buq> it = this.f9060c.iterator();
            while (it.hasNext()) {
                buq next = it.next();
                if (!((Boolean) bxm.m10409f().m10546a(can.f9417Q)).booleanValue() || C0710au.m5573i().m11295a()) {
                    if (((Boolean) bxm.m10409f().m10546a(can.f9419S)).booleanValue() && !C0710au.m5573i().m11299b() && buqVar != next && next.m10275d().equals(buqVar.m10275d())) {
                        it.remove();
                        return true;
                    }
                } else if (buqVar != next && next.m10272b().equals(buqVar.m10272b())) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m10285c(buq buqVar) {
        synchronized (this.f9058a) {
            if (this.f9060c.size() >= 10) {
                C1560fm.m11610b(new StringBuilder(41).append("Queue is full, current size = ").append(this.f9060c.size()).toString());
                this.f9060c.remove(0);
            }
            int i = this.f9059b;
            this.f9059b = i + 1;
            buqVar.m10269a(i);
            this.f9060c.add(buqVar);
        }
    }
}
