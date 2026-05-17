package com.google.android.gms.tagmanager;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.bnr;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.tagmanager.j */
/* JADX INFO: loaded from: classes.dex */
public final class C2130j extends bnr implements InterfaceC2128h {
    C2130j(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.tagmanager.ICustomEvaluatorProxy");
    }

    @Override // com.google.android.gms.tagmanager.InterfaceC2128h
    /* JADX INFO: renamed from: a */
    public final void mo12819a(String str, Map map) {
        Parcel parcelM9733o_ = m9733o_();
        parcelM9733o_.writeString(str);
        parcelM9733o_.writeMap(map);
        m9731b(1, parcelM9733o_);
    }

    @Override // com.google.android.gms.tagmanager.InterfaceC2128h
    /* JADX INFO: renamed from: b */
    public final String mo12820b(String str, Map map) {
        Parcel parcelM9733o_ = m9733o_();
        parcelM9733o_.writeString(str);
        parcelM9733o_.writeMap(map);
        Parcel parcelM9730a = m9730a(2, parcelM9733o_);
        String string = parcelM9730a.readString();
        parcelM9730a.recycle();
        return string;
    }
}
