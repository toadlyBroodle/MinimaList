package com.google.android.gms.internal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class bvd {

    /* JADX INFO: renamed from: b */
    private final int f9111b;

    /* JADX INFO: renamed from: d */
    private final bvc f9113d = new bvh();

    /* JADX INFO: renamed from: a */
    private final int f9110a = 6;

    /* JADX INFO: renamed from: c */
    private final int f9112c = 0;

    public bvd(int i) {
        this.f9111b = i;
    }

    /* JADX INFO: renamed from: a */
    private final String m10317a(String str) {
        String[] strArrSplit = str.split("\n");
        if (strArrSplit.length == 0) {
            return "";
        }
        bvf bvfVar = new bvf();
        PriorityQueue priorityQueue = new PriorityQueue(this.f9111b, new bve(this));
        for (String str2 : strArrSplit) {
            String[] strArrM10321a = bvg.m10321a(str2, false);
            if (strArrM10321a.length != 0) {
                bvj.m10326a(strArrM10321a, this.f9111b, this.f9110a, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                bvfVar.m10319a(this.f9113d.mo10316a(((bvk) it.next()).f9118b));
            } catch (IOException e) {
                C1560fm.m11611b("Error while writing hash to byteStream", e);
            }
        }
        return bvfVar.toString();
    }

    /* JADX INFO: renamed from: a */
    public final String m10318a(ArrayList<String> arrayList) {
        StringBuffer stringBuffer = new StringBuffer();
        ArrayList<String> arrayList2 = arrayList;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            String str = arrayList2.get(i);
            i++;
            stringBuffer.append(str.toLowerCase(Locale.US));
            stringBuffer.append('\n');
        }
        return m10317a(stringBuffer.toString());
    }
}
