package com.google.android.gms.internal;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
/* JADX INFO: loaded from: classes.dex */
final class bqp<FieldDescriptorType> extends bqo<FieldDescriptorType, Object> {
    bqp(int i) {
        super(i, null);
    }

    @Override // com.google.android.gms.internal.bqo
    /* JADX INFO: renamed from: a */
    public final void mo9994a() {
        if (!m9996b()) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= m9997c()) {
                    break;
                }
                Map.Entry<FieldDescriptorType, Object> entryM9995b = m9995b(i2);
                if (((box) entryM9995b.getKey()).m9893d()) {
                    entryM9995b.setValue(Collections.unmodifiableList((List) entryM9995b.getValue()));
                }
                i = i2 + 1;
            }
            for (Map.Entry<FieldDescriptorType, Object> entry : m9998d()) {
                if (((box) entry.getKey()).m9893d()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo9994a();
    }
}
