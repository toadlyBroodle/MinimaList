package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1218ag;
import com.google.android.gms.internal.AbstractC2011we;
import com.google.android.gms.internal.C2014wh;
import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.common.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1071a extends AbstractC2011we {

    /* JADX INFO: renamed from: b */
    private int f5440b;

    /* JADX INFO: renamed from: c */
    private final int f5441c;

    /* JADX INFO: renamed from: d */
    private final PendingIntent f5442d;

    /* JADX INFO: renamed from: e */
    private final String f5443e;

    /* JADX INFO: renamed from: a */
    public static final C1071a f5439a = new C1071a(0);
    public static final Parcelable.Creator<C1071a> CREATOR = new C1280j();

    public C1071a(int i) {
        this(i, null, null);
    }

    C1071a(int i, int i2, PendingIntent pendingIntent, String str) {
        this.f5440b = i;
        this.f5441c = i2;
        this.f5442d = pendingIntent;
        this.f5443e = str;
    }

    public C1071a(int i, PendingIntent pendingIntent) {
        this(i, pendingIntent, null);
    }

    public C1071a(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str);
    }

    /* JADX INFO: renamed from: a */
    static String m6610a(int i) {
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            case 13:
                return "CANCELED";
            case 14:
                return "TIMEOUT";
            case 15:
                return "INTERRUPTED";
            case 16:
                return "API_UNAVAILABLE";
            case 17:
                return "SIGN_IN_FAILED";
            case 18:
                return "SERVICE_UPDATING";
            case 19:
                return "SERVICE_MISSING_PERMISSION";
            case 20:
                return "RESTRICTED_PROFILE";
            case 21:
                return "API_VERSION_UPDATE_REQUIRED";
            case 99:
                return "UNFINISHED";
            case 1500:
                return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
            default:
                return new StringBuilder(31).append("UNKNOWN_ERROR_CODE(").append(i).append(")").toString();
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m6611a() {
        return (this.f5441c == 0 || this.f5442d == null) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m6612b() {
        return this.f5441c == 0;
    }

    /* JADX INFO: renamed from: c */
    public final int m6613c() {
        return this.f5441c;
    }

    /* JADX INFO: renamed from: d */
    public final PendingIntent m6614d() {
        return this.f5442d;
    }

    /* JADX INFO: renamed from: e */
    public final String m6615e() {
        return this.f5443e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1071a)) {
            return false;
        }
        C1071a c1071a = (C1071a) obj;
        return this.f5441c == c1071a.f5441c && C1218ag.m7063a(this.f5442d, c1071a.f5442d) && C1218ag.m7063a(this.f5443e, c1071a.f5443e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f5441c), this.f5442d, this.f5443e});
    }

    public final String toString() {
        return C1218ag.m7062a(this).m7064a("statusCode", m6610a(this.f5441c)).m7064a("resolution", this.f5442d).m7064a("message", this.f5443e).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM12512a = C2014wh.m12512a(parcel);
        C2014wh.m12516a(parcel, 1, this.f5440b);
        C2014wh.m12516a(parcel, 2, m6613c());
        C2014wh.m12520a(parcel, 3, (Parcelable) m6614d(), i, false);
        C2014wh.m12524a(parcel, 4, m6615e(), false);
        C2014wh.m12513a(parcel, iM12512a);
    }
}
