package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.C0846p;
import com.google.android.gms.ads.internal.gmsg.InterfaceC0762i;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.AbstractC2011we;
import com.google.android.gms.internal.C1670jo;
import com.google.android.gms.internal.C2014wh;
import com.google.android.gms.internal.InterfaceC1758mv;
import com.google.android.gms.internal.bws;
import com.google.android.gms.internal.cnb;
import com.google.android.gms.p043a.BinderC0654c;
import com.google.android.gms.p043a.InterfaceC0652a;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class AdOverlayInfoParcel extends AbstractC2011we implements ReflectedParcelable {
    public static final Parcelable.Creator<AdOverlayInfoParcel> CREATOR = new C0838m();

    /* JADX INFO: renamed from: a */
    public final C0828c f4779a;

    /* JADX INFO: renamed from: b */
    public final bws f4780b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0839n f4781c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC1758mv f4782d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC0762i f4783e;

    /* JADX INFO: renamed from: f */
    public final String f4784f;

    /* JADX INFO: renamed from: g */
    public final boolean f4785g;

    /* JADX INFO: renamed from: h */
    public final String f4786h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC0842q f4787i;

    /* JADX INFO: renamed from: j */
    public final int f4788j;

    /* JADX INFO: renamed from: k */
    public final int f4789k;

    /* JADX INFO: renamed from: l */
    public final String f4790l;

    /* JADX INFO: renamed from: m */
    public final C1670jo f4791m;

    /* JADX INFO: renamed from: n */
    public final String f4792n;

    /* JADX INFO: renamed from: o */
    public final C0846p f4793o;

    AdOverlayInfoParcel(C0828c c0828c, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4, String str, boolean z, String str2, IBinder iBinder5, int i, int i2, String str3, C1670jo c1670jo, String str4, C0846p c0846p) {
        this.f4779a = c0828c;
        this.f4780b = (bws) BinderC0654c.m5330a(InterfaceC0652a.a.m5328a(iBinder));
        this.f4781c = (InterfaceC0839n) BinderC0654c.m5330a(InterfaceC0652a.a.m5328a(iBinder2));
        this.f4782d = (InterfaceC1758mv) BinderC0654c.m5330a(InterfaceC0652a.a.m5328a(iBinder3));
        this.f4783e = (InterfaceC0762i) BinderC0654c.m5330a(InterfaceC0652a.a.m5328a(iBinder4));
        this.f4784f = str;
        this.f4785g = z;
        this.f4786h = str2;
        this.f4787i = (InterfaceC0842q) BinderC0654c.m5330a(InterfaceC0652a.a.m5328a(iBinder5));
        this.f4788j = i;
        this.f4789k = i2;
        this.f4790l = str3;
        this.f4791m = c1670jo;
        this.f4792n = str4;
        this.f4793o = c0846p;
    }

    public AdOverlayInfoParcel(C0828c c0828c, bws bwsVar, InterfaceC0839n interfaceC0839n, InterfaceC0842q interfaceC0842q, C1670jo c1670jo) {
        this.f4779a = c0828c;
        this.f4780b = bwsVar;
        this.f4781c = interfaceC0839n;
        this.f4782d = null;
        this.f4783e = null;
        this.f4784f = null;
        this.f4785g = false;
        this.f4786h = null;
        this.f4787i = interfaceC0842q;
        this.f4788j = -1;
        this.f4789k = 4;
        this.f4790l = null;
        this.f4791m = c1670jo;
        this.f4792n = null;
        this.f4793o = null;
    }

    public AdOverlayInfoParcel(bws bwsVar, InterfaceC0839n interfaceC0839n, InterfaceC0762i interfaceC0762i, InterfaceC0842q interfaceC0842q, InterfaceC1758mv interfaceC1758mv, boolean z, int i, String str, C1670jo c1670jo) {
        this.f4779a = null;
        this.f4780b = bwsVar;
        this.f4781c = interfaceC0839n;
        this.f4782d = interfaceC1758mv;
        this.f4783e = interfaceC0762i;
        this.f4784f = null;
        this.f4785g = z;
        this.f4786h = null;
        this.f4787i = interfaceC0842q;
        this.f4788j = i;
        this.f4789k = 3;
        this.f4790l = str;
        this.f4791m = c1670jo;
        this.f4792n = null;
        this.f4793o = null;
    }

    public AdOverlayInfoParcel(bws bwsVar, InterfaceC0839n interfaceC0839n, InterfaceC0762i interfaceC0762i, InterfaceC0842q interfaceC0842q, InterfaceC1758mv interfaceC1758mv, boolean z, int i, String str, String str2, C1670jo c1670jo) {
        this.f4779a = null;
        this.f4780b = bwsVar;
        this.f4781c = interfaceC0839n;
        this.f4782d = interfaceC1758mv;
        this.f4783e = interfaceC0762i;
        this.f4784f = str2;
        this.f4785g = z;
        this.f4786h = str;
        this.f4787i = interfaceC0842q;
        this.f4788j = i;
        this.f4789k = 3;
        this.f4790l = null;
        this.f4791m = c1670jo;
        this.f4792n = null;
        this.f4793o = null;
    }

    public AdOverlayInfoParcel(bws bwsVar, InterfaceC0839n interfaceC0839n, InterfaceC0842q interfaceC0842q, InterfaceC1758mv interfaceC1758mv, int i, C1670jo c1670jo, String str, C0846p c0846p) {
        this.f4779a = null;
        this.f4780b = bwsVar;
        this.f4781c = interfaceC0839n;
        this.f4782d = interfaceC1758mv;
        this.f4783e = null;
        this.f4784f = null;
        this.f4785g = false;
        this.f4786h = null;
        this.f4787i = interfaceC0842q;
        this.f4788j = i;
        this.f4789k = 1;
        this.f4790l = null;
        this.f4791m = c1670jo;
        this.f4792n = str;
        this.f4793o = c0846p;
    }

    public AdOverlayInfoParcel(bws bwsVar, InterfaceC0839n interfaceC0839n, InterfaceC0842q interfaceC0842q, InterfaceC1758mv interfaceC1758mv, boolean z, int i, C1670jo c1670jo) {
        this.f4779a = null;
        this.f4780b = bwsVar;
        this.f4781c = interfaceC0839n;
        this.f4782d = interfaceC1758mv;
        this.f4783e = null;
        this.f4784f = null;
        this.f4785g = z;
        this.f4786h = null;
        this.f4787i = interfaceC0842q;
        this.f4788j = i;
        this.f4789k = 2;
        this.f4790l = null;
        this.f4791m = c1670jo;
        this.f4792n = null;
        this.f4793o = null;
    }

    /* JADX INFO: renamed from: a */
    public static AdOverlayInfoParcel m5771a(Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception e) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m5772a(Intent intent, AdOverlayInfoParcel adOverlayInfoParcel) {
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM12512a = C2014wh.m12512a(parcel);
        C2014wh.m12520a(parcel, 2, (Parcelable) this.f4779a, i, false);
        C2014wh.m12519a(parcel, 3, BinderC0654c.m5329a(this.f4780b).asBinder(), false);
        C2014wh.m12519a(parcel, 4, BinderC0654c.m5329a(this.f4781c).asBinder(), false);
        C2014wh.m12519a(parcel, 5, BinderC0654c.m5329a(this.f4782d).asBinder(), false);
        C2014wh.m12519a(parcel, 6, BinderC0654c.m5329a(this.f4783e).asBinder(), false);
        C2014wh.m12524a(parcel, 7, this.f4784f, false);
        C2014wh.m12526a(parcel, 8, this.f4785g);
        C2014wh.m12524a(parcel, 9, this.f4786h, false);
        C2014wh.m12519a(parcel, 10, BinderC0654c.m5329a(this.f4787i).asBinder(), false);
        C2014wh.m12516a(parcel, 11, this.f4788j);
        C2014wh.m12516a(parcel, 12, this.f4789k);
        C2014wh.m12524a(parcel, 13, this.f4790l, false);
        C2014wh.m12520a(parcel, 14, (Parcelable) this.f4791m, i, false);
        C2014wh.m12524a(parcel, 16, this.f4792n, false);
        C2014wh.m12520a(parcel, 17, (Parcelable) this.f4793o, i, false);
        C2014wh.m12513a(parcel, iM12512a);
    }
}
