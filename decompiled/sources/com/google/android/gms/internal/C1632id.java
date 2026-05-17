package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.id */
/* JADX INFO: loaded from: classes.dex */
public final class C1632id {

    /* JADX INFO: renamed from: a */
    private final List<String> f10776a = new ArrayList();

    /* JADX INFO: renamed from: b */
    private final List<Double> f10777b = new ArrayList();

    /* JADX INFO: renamed from: c */
    private final List<Double> f10778c = new ArrayList();

    /* JADX INFO: renamed from: a */
    public final C1629ia m11526a() {
        return new C1629ia(this);
    }

    /* JADX INFO: renamed from: a */
    public final C1632id m11527a(String str, double d, double d2) {
        int i;
        int i2 = 0;
        while (true) {
            i = i2;
            if (i >= this.f10776a.size()) {
                break;
            }
            double dDoubleValue = this.f10778c.get(i).doubleValue();
            double dDoubleValue2 = this.f10777b.get(i).doubleValue();
            if (d < dDoubleValue || (dDoubleValue == d && d2 < dDoubleValue2)) {
                break;
            }
            i2 = i + 1;
        }
        this.f10776a.add(i, str);
        this.f10778c.add(i, Double.valueOf(d));
        this.f10777b.add(i, Double.valueOf(d2));
        return this;
    }
}
