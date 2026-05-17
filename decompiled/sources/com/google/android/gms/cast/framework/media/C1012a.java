package com.google.android.gms.cast.framework.media;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.internal.AbstractC2011we;
import com.google.android.gms.internal.C1992vm;
import com.google.android.gms.internal.C2014wh;
import com.google.android.gms.p043a.BinderC0654c;

/* JADX INFO: renamed from: com.google.android.gms.cast.framework.media.a */
/* JADX INFO: loaded from: classes.dex */
public class C1012a extends AbstractC2011we {

    /* JADX INFO: renamed from: b */
    private final String f5288b;

    /* JADX INFO: renamed from: c */
    private final String f5289c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC1025n f5290d;

    /* JADX INFO: renamed from: e */
    private final C1015d f5291e;

    /* JADX INFO: renamed from: a */
    private static final C1992vm f5287a = new C1992vm("CastMediaOptions");
    public static final Parcelable.Creator<C1012a> CREATOR = new C1017f();

    C1012a(String str, String str2, IBinder iBinder, C1015d c1015d) {
        InterfaceC1025n c1026o;
        this.f5288b = str;
        this.f5289c = str2;
        if (iBinder == null) {
            c1026o = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.IImagePicker");
            c1026o = iInterfaceQueryLocalInterface instanceof InterfaceC1025n ? (InterfaceC1025n) iInterfaceQueryLocalInterface : new C1026o(iBinder);
        }
        this.f5290d = c1026o;
        this.f5291e = c1015d;
    }

    /* JADX INFO: renamed from: a */
    public String m6421a() {
        return this.f5288b;
    }

    /* JADX INFO: renamed from: b */
    public C1015d m6422b() {
        return this.f5291e;
    }

    /* JADX INFO: renamed from: c */
    public String m6423c() {
        return this.f5289c;
    }

    /* JADX INFO: renamed from: d */
    public C1014c m6424d() {
        if (this.f5290d != null) {
            try {
                return (C1014c) BinderC0654c.m5330a(this.f5290d.mo6433b());
            } catch (RemoteException e) {
                f5287a.m12446a(e, "Unable to call %s on %s.", "getWrappedClientObject", InterfaceC1025n.class.getSimpleName());
            }
        }
        return null;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iM12512a = C2014wh.m12512a(parcel);
        C2014wh.m12524a(parcel, 2, m6421a(), false);
        C2014wh.m12524a(parcel, 3, m6423c(), false);
        C2014wh.m12519a(parcel, 4, this.f5290d == null ? null : this.f5290d.asBinder(), false);
        C2014wh.m12520a(parcel, 5, (Parcelable) m6422b(), i, false);
        C2014wh.m12513a(parcel, iM12512a);
    }
}
