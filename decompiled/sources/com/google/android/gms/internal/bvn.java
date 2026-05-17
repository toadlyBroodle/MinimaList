package com.google.android.gms.internal;

import java.io.IOException;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class bvn {

    /* JADX INFO: renamed from: a */
    private final bvc f9124a;

    /* JADX INFO: renamed from: b */
    private final int f9125b;

    /* JADX INFO: renamed from: c */
    private String f9126c;

    /* JADX INFO: renamed from: d */
    private String f9127d;

    /* JADX INFO: renamed from: e */
    private final boolean f9128e = false;

    /* JADX INFO: renamed from: f */
    private final int f9129f;

    /* JADX INFO: renamed from: g */
    private final int f9130g;

    public bvn(int i, int i2, int i3) {
        this.f9125b = i;
        if (i2 > 64 || i2 < 0) {
            this.f9129f = 64;
        } else {
            this.f9129f = i2;
        }
        if (i3 <= 0) {
            this.f9130g = 1;
        } else {
            this.f9130g = i3;
        }
        this.f9124a = new bvl(this.f9129f);
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00e2  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean m10331a(String str, HashSet<String> hashSet) {
        String string;
        boolean z;
        String[] strArrSplit = str.split("\n");
        if (strArrSplit.length == 0) {
            return true;
        }
        for (String str2 : strArrSplit) {
            if (str2.indexOf("'") != -1) {
                StringBuilder sb = new StringBuilder(str2);
                int i = 1;
                boolean z2 = false;
                while (i + 2 <= sb.length()) {
                    if (sb.charAt(i) == '\'') {
                        if (sb.charAt(i - 1) == ' ' || !((sb.charAt(i + 1) == 's' || sb.charAt(i + 1) == 'S') && (i + 2 == sb.length() || sb.charAt(i + 2) == ' '))) {
                            sb.setCharAt(i, ' ');
                        } else {
                            sb.insert(i, ' ');
                            i += 2;
                        }
                        z2 = true;
                    }
                    i++;
                }
                string = z2 ? sb.toString() : null;
                if (string != null) {
                    this.f9127d = string;
                } else {
                    string = str2;
                }
            }
            String[] strArrM10321a = bvg.m10321a(string, true);
            if (strArrM10321a.length >= this.f9130g) {
                for (int i2 = 0; i2 < strArrM10321a.length; i2++) {
                    String strConcat = "";
                    int i3 = 0;
                    while (true) {
                        if (i3 >= this.f9130g) {
                            z = true;
                            break;
                        }
                        if (i2 + i3 >= strArrM10321a.length) {
                            z = false;
                            break;
                        }
                        if (i3 > 0) {
                            strConcat = String.valueOf(strConcat).concat(" ");
                        }
                        String strValueOf = String.valueOf(strConcat);
                        String strValueOf2 = String.valueOf(strArrM10321a[i2 + i3]);
                        strConcat = strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
                        i3++;
                    }
                    if (!z) {
                        break;
                    }
                    hashSet.add(strConcat);
                    if (hashSet.size() >= this.f9125b) {
                        return false;
                    }
                }
                if (hashSet.size() >= this.f9125b) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public final String m10332a(ArrayList<String> arrayList, ArrayList<bvb> arrayList2) {
        Collections.sort(arrayList2, new bvo(this));
        HashSet<String> hashSet = new HashSet<>();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= arrayList2.size() || !m10331a(Normalizer.normalize(arrayList.get(arrayList2.get(i2).m10314e()), Normalizer.Form.NFKC).toLowerCase(Locale.US), hashSet)) {
                break;
            }
            i = i2 + 1;
        }
        bvf bvfVar = new bvf();
        this.f9126c = "";
        Iterator<String> it = hashSet.iterator();
        while (it.hasNext()) {
            try {
                bvfVar.m10319a(this.f9124a.mo10316a(it.next()));
            } catch (IOException e) {
                C1560fm.m11611b("Error while writing hash to byteStream", e);
            }
        }
        return bvfVar.toString();
    }
}
