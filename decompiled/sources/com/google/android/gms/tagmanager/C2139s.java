package com.google.android.gms.tagmanager;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.bnr;
import com.google.android.gms.internal.bnt;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.tagmanager.s */
/* JADX INFO: loaded from: classes.dex */
public final class C2139s extends bnr implements InterfaceC2137q {
    C2139s(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.tagmanager.IMeasurementProxy");
    }

    @Override // com.google.android.gms.tagmanager.InterfaceC2137q
    /* JADX INFO: renamed from: a */
    public final Map mo12815a() {
        Parcel parcelM9730a = m9730a(11, m9733o_());
        HashMap mapM9741c = bnt.m9741c(parcelM9730a);
        parcelM9730a.recycle();
        return mapM9741c;
    }

    @Override // com.google.android.gms.tagmanager.InterfaceC2137q
    /* JADX INFO: renamed from: a */
    public final void mo12816a(InterfaceC2131k interfaceC2131k) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9735a(parcelM9733o_, interfaceC2131k);
        m9731b(22, parcelM9733o_);
    }

    @Override // com.google.android.gms.tagmanager.InterfaceC2137q
    /* JADX INFO: renamed from: a */
    public final void mo12817a(InterfaceC2134n interfaceC2134n) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9735a(parcelM9733o_, interfaceC2134n);
        m9731b(21, parcelM9733o_);
    }

    @Override // com.google.android.gms.tagmanager.InterfaceC2137q
    /* JADX INFO: renamed from: a */
    public final void mo12818a(String str, String str2, Bundle bundle, long j) {
        Parcel parcelM9733o_ = m9733o_();
        parcelM9733o_.writeString(str);
        parcelM9733o_.writeString(str2);
        bnt.m9736a(parcelM9733o_, bundle);
        parcelM9733o_.writeLong(j);
        m9731b(2, parcelM9733o_);
    }
}
