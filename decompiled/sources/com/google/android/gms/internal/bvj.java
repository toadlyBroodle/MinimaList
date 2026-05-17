package com.google.android.gms.internal;

import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class bvj {
    /* JADX INFO: renamed from: a */
    private static long m10323a(long j, int i) {
        if (i == 0) {
            return 1L;
        }
        return i != 1 ? i % 2 == 0 ? m10323a((j * j) % 1073807359, i / 2) % 1073807359 : ((m10323a((j * j) % 1073807359, i / 2) % 1073807359) * j) % 1073807359 : j;
    }

    /* JADX INFO: renamed from: a */
    private static String m10324a(String[] strArr, int i, int i2) {
        if (strArr.length < i + i2) {
            C1560fm.m11612c("Unable to construct shingle");
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i3 = i; i3 < (i + i2) - 1; i3++) {
            stringBuffer.append(strArr[i3]);
            stringBuffer.append(' ');
        }
        stringBuffer.append(strArr[(i + i2) - 1]);
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: a */
    private static void m10325a(int i, long j, String str, int i2, PriorityQueue<bvk> priorityQueue) {
        bvk bvkVar = new bvk(j, str, i2);
        if ((priorityQueue.size() != i || (priorityQueue.peek().f9119c <= bvkVar.f9119c && priorityQueue.peek().f9117a <= bvkVar.f9117a)) && !priorityQueue.contains(bvkVar)) {
            priorityQueue.add(bvkVar);
            if (priorityQueue.size() > i) {
                priorityQueue.poll();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m10326a(String[] strArr, int i, int i2, PriorityQueue<bvk> priorityQueue) {
        if (strArr.length < i2) {
            m10325a(i, m10327b(strArr, 0, strArr.length), m10324a(strArr, 0, strArr.length), strArr.length, priorityQueue);
            return;
        }
        long jM10327b = m10327b(strArr, 0, i2);
        m10325a(i, jM10327b, m10324a(strArr, 0, i2), i2, priorityQueue);
        long jM10323a = m10323a(16785407L, i2 - 1);
        for (int i3 = 1; i3 < (strArr.length - i2) + 1; i3++) {
            jM10327b = ((((((jM10327b + 1073807359) - ((((((long) bvg.m10320a(strArr[i3 - 1])) + 2147483647L) % 1073807359) * jM10323a) % 1073807359)) % 1073807359) * 16785407) % 1073807359) + ((((long) bvg.m10320a(strArr[(i3 + i2) - 1])) + 2147483647L) % 1073807359)) % 1073807359;
            m10325a(i, jM10327b, m10324a(strArr, i3, i2), strArr.length, priorityQueue);
        }
    }

    /* JADX INFO: renamed from: b */
    private static long m10327b(String[] strArr, int i, int i2) {
        long jM10320a = (((long) bvg.m10320a(strArr[0])) + 2147483647L) % 1073807359;
        for (int i3 = 1; i3 < i2; i3++) {
            jM10320a = (((jM10320a * 16785407) % 1073807359) + ((((long) bvg.m10320a(strArr[i3])) + 2147483647L) % 1073807359)) % 1073807359;
        }
        return jM10320a;
    }
}
