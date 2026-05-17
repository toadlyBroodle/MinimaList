package com.google.android.gms.internal;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class afj extends afi {
    private afj(Context context, String str, boolean z) {
        super(context, str, z);
    }

    /* JADX INFO: renamed from: a */
    public static afj m7805a(String str, Context context, boolean z) {
        m7801a(context, z);
        return new afj(context, str, z);
    }

    @Override // com.google.android.gms.internal.afi
    /* JADX INFO: renamed from: a */
    protected final List<Callable<Void>> mo7804a(arz arzVar, C1937tl c1937tl, C1921sw c1921sw) {
        if (arzVar.m8253c() == null || !this.f6643q) {
            return super.mo7804a(arzVar, c1937tl, c1921sw);
        }
        int iM8264n = arzVar.m8264n();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(super.mo7804a(arzVar, c1937tl, c1921sw));
        arrayList.add(new beq(arzVar, "VywbbfxE2QuRqZ5xcIwapO7AdSzfVaSWnmJxmUg+0adJ3QBAH5P7EgXr1uzyY+u6", "JgKAyQW0PWqOrZHk4ZNT0IJH02FdSWTXOOjBnF9RRok=", c1937tl, iM8264n, 24));
        return arrayList;
    }
}
