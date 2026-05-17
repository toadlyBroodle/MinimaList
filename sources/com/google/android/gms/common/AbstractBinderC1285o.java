package com.google.android.gms.common;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractBinderC1273t;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.common.internal.InterfaceC1272s;
import com.google.android.gms.common.util.C1306j;
import com.google.android.gms.p043a.BinderC0654c;
import com.google.android.gms.p043a.InterfaceC0652a;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.common.o */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractBinderC1285o extends AbstractBinderC1273t {

    /* JADX INFO: renamed from: a */
    private int f5987a;

    protected AbstractBinderC1285o(byte[] bArr) {
        if (bArr.length != 25) {
            int length = bArr.length;
            String strM7270a = C1306j.m7270a(bArr, 0, bArr.length, false);
            Log.wtf("GoogleCertificates", new StringBuilder(String.valueOf(strM7270a).length() + 51).append("Cert hash data has incorrect length (").append(length).append("):\n").append(strM7270a).toString(), new Exception());
            bArr = Arrays.copyOfRange(bArr, 0, 25);
            C1221aj.m7075b(bArr.length == 25, new StringBuilder(55).append("cert hash data has incorrect length. length=").append(bArr.length).toString());
        }
        this.f5987a = Arrays.hashCode(bArr);
    }

    /* JADX INFO: renamed from: a */
    protected static byte[] m7233a(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    @Override // com.google.android.gms.common.internal.InterfaceC1272s
    /* JADX INFO: renamed from: a */
    public final InterfaceC0652a mo7215a() {
        return BinderC0654c.m5329a(mo7234c());
    }

    @Override // com.google.android.gms.common.internal.InterfaceC1272s
    /* JADX INFO: renamed from: b */
    public final int mo7216b() {
        return hashCode();
    }

    /* JADX INFO: renamed from: c */
    abstract byte[] mo7234c();

    public boolean equals(Object obj) {
        InterfaceC0652a interfaceC0652aMo7215a;
        if (obj == null || !(obj instanceof InterfaceC1272s)) {
            return false;
        }
        try {
            InterfaceC1272s interfaceC1272s = (InterfaceC1272s) obj;
            if (interfaceC1272s.mo7216b() == hashCode() && (interfaceC0652aMo7215a = interfaceC1272s.mo7215a()) != null) {
                return Arrays.equals(mo7234c(), (byte[]) BinderC0654c.m5330a(interfaceC0652aMo7215a));
            }
            return false;
        } catch (RemoteException e) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            return false;
        }
    }

    public int hashCode() {
        return this.f5987a;
    }
}
