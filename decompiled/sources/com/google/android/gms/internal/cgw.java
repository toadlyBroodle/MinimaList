package com.google.android.gms.internal;

import android.os.Parcel;
import android.util.Base64;
import com.google.android.gms.ads.internal.C0710au;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes.dex */
@cnb
final class cgw {

    /* JADX INFO: renamed from: a */
    final bwx f9978a;

    /* JADX INFO: renamed from: b */
    final String f9979b;

    /* JADX INFO: renamed from: c */
    final int f9980c;

    private cgw(bwx bwxVar, String str, int i) {
        this.f9978a = bwxVar;
        this.f9979b = str;
        this.f9980c = i;
    }

    cgw(cgs cgsVar) {
        this(cgsVar.m10822a(), cgsVar.m10827c(), cgsVar.m10826b());
    }

    /* JADX INFO: renamed from: a */
    static cgw m10846a(String str) {
        String[] strArrSplit = str.split("\u0000");
        if (strArrSplit.length != 3) {
            throw new IOException("Incorrect field count for QueueSeed.");
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                String str2 = new String(Base64.decode(strArrSplit[0], 0), "UTF-8");
                int i = Integer.parseInt(strArrSplit[1]);
                byte[] bArrDecode = Base64.decode(strArrSplit[2], 0);
                parcelObtain.unmarshall(bArrDecode, 0, bArrDecode.length);
                parcelObtain.setDataPosition(0);
                return new cgw(bwx.CREATOR.createFromParcel(parcelObtain), str2, i);
            } finally {
                parcelObtain.recycle();
            }
        } catch (C2013wg | IllegalArgumentException | IllegalStateException e) {
            C0710au.m5573i().m11292a(e, "QueueSeed.decode");
            throw new IOException("Malformed QueueSeed encoding.", e);
        }
    }

    /* JADX INFO: renamed from: a */
    final String m10847a() {
        String string;
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                String strEncodeToString = Base64.encodeToString(this.f9979b.getBytes("UTF-8"), 0);
                String string2 = Integer.toString(this.f9980c);
                this.f9978a.writeToParcel(parcelObtain, 0);
                String strEncodeToString2 = Base64.encodeToString(parcelObtain.marshall(), 0);
                string = new StringBuilder(String.valueOf(strEncodeToString).length() + 2 + String.valueOf(string2).length() + String.valueOf(strEncodeToString2).length()).append(strEncodeToString).append("\u0000").append(string2).append("\u0000").append(strEncodeToString2).toString();
            } catch (UnsupportedEncodingException e) {
                C1560fm.m11612c("QueueSeed encode failed because UTF-8 is not available.");
                parcelObtain.recycle();
                string = "";
            }
            return string;
        } finally {
            parcelObtain.recycle();
        }
    }
}
