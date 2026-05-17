package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.AbstractC2011we;
import com.google.android.gms.internal.C2014wh;
import com.google.android.gms.internal.C2032wz;
import com.google.firebase.C2214c;

/* JADX INFO: renamed from: com.google.firebase.auth.s */
/* JADX INFO: loaded from: classes.dex */
public class C2205s {

    /* JADX INFO: renamed from: com.google.firebase.auth.s$a */
    public static class a extends AbstractC2011we {
        public static final Parcelable.Creator<a> CREATOR = new C2209w();

        a() {
        }

        /* JADX INFO: renamed from: a */
        public static a m12907a() {
            return new a();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            C2014wh.m12513a(parcel, C2014wh.m12512a(parcel));
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.auth.s$b */
    public static abstract class b {

        /* JADX INFO: renamed from: a */
        private static final C2032wz f12862a = new C2032wz("PhoneAuthProvider", new String[0]);

        /* JADX INFO: renamed from: a */
        public abstract void m12908a(C2204r c2204r);

        /* JADX INFO: renamed from: a */
        public abstract void m12909a(C2214c c2214c);

        /* JADX INFO: renamed from: a */
        public void m12910a(String str) {
            f12862a.m12551c("Sms auto retrieval timed-out.", new Object[0]);
        }

        /* JADX INFO: renamed from: a */
        public void m12911a(String str, a aVar) {
        }
    }
}
