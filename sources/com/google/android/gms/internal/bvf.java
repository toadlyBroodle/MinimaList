package com.google.android.gms.internal;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
final class bvf {

    /* JADX INFO: renamed from: a */
    private ByteArrayOutputStream f9114a = new ByteArrayOutputStream(4096);

    /* JADX INFO: renamed from: b */
    private Base64OutputStream f9115b = new Base64OutputStream(this.f9114a, 10);

    /* JADX INFO: renamed from: a */
    public final void m10319a(byte[] bArr) {
        this.f9115b.write(bArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String string;
        try {
            this.f9115b.close();
        } catch (IOException e) {
            C1560fm.m11611b("HashManager: Unable to convert to Base64.", e);
        }
        try {
            this.f9114a.close();
            string = this.f9114a.toString();
        } catch (IOException e2) {
            C1560fm.m11611b("HashManager: Unable to convert to Base64.", e2);
            string = "";
        } finally {
            this.f9114a = null;
            this.f9115b = null;
        }
        return string;
    }
}
