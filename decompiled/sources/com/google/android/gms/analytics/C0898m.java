package com.google.android.gms.analytics;

import android.net.Uri;
import android.text.TextUtils;
import android.util.LogPrinter;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: com.google.android.gms.analytics.m */
/* JADX INFO: loaded from: classes.dex */
public final class C0898m implements InterfaceC0906u {

    /* JADX INFO: renamed from: a */
    private static final Uri f4951a;

    /* JADX INFO: renamed from: b */
    private final LogPrinter f4952b = new LogPrinter(4, "GA/LogCatTransport");

    static {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("uri");
        builder.authority("local");
        f4951a = builder.build();
    }

    @Override // com.google.android.gms.analytics.InterfaceC0906u
    /* JADX INFO: renamed from: a */
    public final Uri mo6036a() {
        return f4951a;
    }

    @Override // com.google.android.gms.analytics.InterfaceC0906u
    /* JADX INFO: renamed from: a */
    public final void mo6037a(C0900o c0900o) {
        ArrayList arrayList = new ArrayList(c0900o.m6056b());
        Collections.sort(arrayList, new C0899n(this));
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            String string = ((AbstractC0901p) obj).toString();
            if (!TextUtils.isEmpty(string)) {
                if (sb.length() != 0) {
                    sb.append(", ");
                }
                sb.append(string);
            }
        }
        this.f4952b.println(sb.toString());
    }
}
