package com.google.android.gms.cast;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.p052a.C1072a;
import com.google.android.gms.internal.AbstractC2011we;
import com.google.android.gms.internal.C1981vb;
import com.google.android.gms.internal.C2014wh;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class CastDevice extends AbstractC2011we implements ReflectedParcelable {
    public static final Parcelable.Creator<CastDevice> CREATOR = new C0987ah();

    /* JADX INFO: renamed from: a */
    private String f5139a;

    /* JADX INFO: renamed from: b */
    private String f5140b;

    /* JADX INFO: renamed from: c */
    private Inet4Address f5141c;

    /* JADX INFO: renamed from: d */
    private String f5142d;

    /* JADX INFO: renamed from: e */
    private String f5143e;

    /* JADX INFO: renamed from: f */
    private String f5144f;

    /* JADX INFO: renamed from: g */
    private int f5145g;

    /* JADX INFO: renamed from: h */
    private List<C1072a> f5146h;

    /* JADX INFO: renamed from: i */
    private int f5147i;

    /* JADX INFO: renamed from: j */
    private int f5148j;

    /* JADX INFO: renamed from: k */
    private String f5149k;

    /* JADX INFO: renamed from: l */
    private String f5150l;

    /* JADX INFO: renamed from: m */
    private int f5151m;

    CastDevice(String str, String str2, String str3, String str4, String str5, int i, List<C1072a> list, int i2, int i3, String str6, String str7, int i4) {
        this.f5139a = m6251a(str);
        this.f5140b = m6251a(str2);
        if (!TextUtils.isEmpty(this.f5140b)) {
            try {
                InetAddress byName = InetAddress.getByName(this.f5140b);
                if (byName instanceof Inet4Address) {
                    this.f5141c = (Inet4Address) byName;
                }
            } catch (UnknownHostException e) {
                String str8 = this.f5140b;
                String message = e.getMessage();
                Log.i("CastDevice", new StringBuilder(String.valueOf(str8).length() + 48 + String.valueOf(message).length()).append("Unable to convert host address (").append(str8).append(") to ipaddress: ").append(message).toString());
            }
        }
        this.f5142d = m6251a(str3);
        this.f5143e = m6251a(str4);
        this.f5144f = m6251a(str5);
        this.f5145g = i;
        this.f5146h = list == null ? new ArrayList<>() : list;
        this.f5147i = i2;
        this.f5148j = i3;
        this.f5149k = m6251a(str6);
        this.f5150l = str7;
        this.f5151m = i4;
    }

    /* JADX INFO: renamed from: a */
    private static String m6251a(String str) {
        return str == null ? "" : str;
    }

    /* JADX INFO: renamed from: b */
    public static CastDevice m6252b(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        bundle.setClassLoader(CastDevice.class.getClassLoader());
        return (CastDevice) bundle.getParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE");
    }

    /* JADX INFO: renamed from: a */
    public String m6253a() {
        return this.f5142d;
    }

    /* JADX INFO: renamed from: a */
    public void m6254a(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        bundle.putParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE", this);
    }

    /* JADX INFO: renamed from: b */
    public String m6255b() {
        return this.f5143e;
    }

    /* JADX INFO: renamed from: c */
    public String m6256c() {
        return this.f5144f;
    }

    /* JADX INFO: renamed from: d */
    public int m6257d() {
        return this.f5145g;
    }

    /* JADX INFO: renamed from: e */
    public List<C1072a> m6258e() {
        return Collections.unmodifiableList(this.f5146h);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CastDevice)) {
            return false;
        }
        CastDevice castDevice = (CastDevice) obj;
        return this.f5139a == null ? castDevice.f5139a == null : C1981vb.m12427a(this.f5139a, castDevice.f5139a) && C1981vb.m12427a(this.f5141c, castDevice.f5141c) && C1981vb.m12427a(this.f5143e, castDevice.f5143e) && C1981vb.m12427a(this.f5142d, castDevice.f5142d) && C1981vb.m12427a(this.f5144f, castDevice.f5144f) && this.f5145g == castDevice.f5145g && C1981vb.m12427a(this.f5146h, castDevice.f5146h) && this.f5147i == castDevice.f5147i && this.f5148j == castDevice.f5148j && C1981vb.m12427a(this.f5149k, castDevice.f5149k) && C1981vb.m12427a(Integer.valueOf(this.f5151m), Integer.valueOf(castDevice.f5151m));
    }

    public int hashCode() {
        if (this.f5139a == null) {
            return 0;
        }
        return this.f5139a.hashCode();
    }

    public String toString() {
        return String.format("\"%s\" (%s)", this.f5142d, this.f5139a);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iM12512a = C2014wh.m12512a(parcel);
        C2014wh.m12524a(parcel, 2, this.f5139a, false);
        C2014wh.m12524a(parcel, 3, this.f5140b, false);
        C2014wh.m12524a(parcel, 4, m6253a(), false);
        C2014wh.m12524a(parcel, 5, m6255b(), false);
        C2014wh.m12524a(parcel, 6, m6256c(), false);
        C2014wh.m12516a(parcel, 7, m6257d());
        C2014wh.m12537c(parcel, 8, m6258e(), false);
        C2014wh.m12516a(parcel, 9, this.f5147i);
        C2014wh.m12516a(parcel, 10, this.f5148j);
        C2014wh.m12524a(parcel, 11, this.f5149k, false);
        C2014wh.m12524a(parcel, 12, this.f5150l, false);
        C2014wh.m12516a(parcel, 13, this.f5151m);
        C2014wh.m12513a(parcel, iM12512a);
    }
}
