package com.google.android.gms.ads.internal;

import android.os.Bundle;
import com.google.android.gms.internal.bwx;
import com.google.android.gms.internal.bxb;
import com.google.android.gms.internal.cnb;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.bk */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C0727bk {
    /* JADX INFO: renamed from: a */
    private static String m5632a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        while (it.hasNext()) {
            Object obj = bundle.get((String) it.next());
            sb.append(obj == null ? "null" : obj instanceof Bundle ? m5632a((Bundle) obj) : obj.toString());
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public static Object[] m5633a(String str, bwx bwxVar, String str2, int i, bxb bxbVar) {
        HashSet hashSet = new HashSet(Arrays.asList(str.split(",")));
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        arrayList.add(str2);
        if (hashSet.contains("formatString")) {
            arrayList.add(null);
        }
        if (hashSet.contains("networkType")) {
            arrayList.add(Integer.valueOf(i));
        }
        if (hashSet.contains("birthday")) {
            arrayList.add(Long.valueOf(bwxVar.f9208b));
        }
        if (hashSet.contains("extras")) {
            arrayList.add(m5632a(bwxVar.f9209c));
        }
        if (hashSet.contains("gender")) {
            arrayList.add(Integer.valueOf(bwxVar.f9210d));
        }
        if (hashSet.contains("keywords")) {
            if (bwxVar.f9211e != null) {
                arrayList.add(bwxVar.f9211e.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("isTestDevice")) {
            arrayList.add(Boolean.valueOf(bwxVar.f9212f));
        }
        if (hashSet.contains("tagForChildDirectedTreatment")) {
            arrayList.add(Integer.valueOf(bwxVar.f9213g));
        }
        if (hashSet.contains("manualImpressionsEnabled")) {
            arrayList.add(Boolean.valueOf(bwxVar.f9214h));
        }
        if (hashSet.contains("publisherProvidedId")) {
            arrayList.add(bwxVar.f9215i);
        }
        if (hashSet.contains("location")) {
            if (bwxVar.f9217k != null) {
                arrayList.add(bwxVar.f9217k.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("contentUrl")) {
            arrayList.add(bwxVar.f9218l);
        }
        if (hashSet.contains("networkExtras")) {
            arrayList.add(m5632a(bwxVar.f9219m));
        }
        if (hashSet.contains("customTargeting")) {
            arrayList.add(m5632a(bwxVar.f9220n));
        }
        if (hashSet.contains("categoryExclusions")) {
            if (bwxVar.f9221o != null) {
                arrayList.add(bwxVar.f9221o.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("requestAgent")) {
            arrayList.add(bwxVar.f9222p);
        }
        if (hashSet.contains("requestPackage")) {
            arrayList.add(bwxVar.f9223q);
        }
        if (hashSet.contains("isDesignedForFamilies")) {
            arrayList.add(Boolean.valueOf(bwxVar.f9224r));
        }
        return arrayList.toArray();
    }
}
