package com.google.android.gms.internal;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: renamed from: com.google.android.gms.internal.jn */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C1669jn implements InterfaceC1660je {

    /* JADX INFO: renamed from: a */
    private final String f10854a;

    public C1669jn() {
        this(null);
    }

    public C1669jn(String str) {
        this.f10854a = str;
    }

    @Override // com.google.android.gms.internal.InterfaceC1660je
    /* JADX INFO: renamed from: a */
    public final void mo11455a(String str) {
        try {
            String strValueOf = String.valueOf(str);
            C1668jm.m11610b(strValueOf.length() != 0 ? "Pinging URL: ".concat(strValueOf) : new String("Pinging URL: "));
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                bxm.m10404a();
                C1657jb.m11568a(true, httpURLConnection, this.f10854a);
                C1661jf c1661jf = new C1661jf();
                c1661jf.m11604a(httpURLConnection, (byte[]) null);
                int responseCode = httpURLConnection.getResponseCode();
                c1661jf.m11603a(httpURLConnection, responseCode);
                if (responseCode < 200 || responseCode >= 300) {
                    C1668jm.m11615e(new StringBuilder(String.valueOf(str).length() + 65).append("Received non-success response code ").append(responseCode).append(" from pinging URL: ").append(str).toString());
                }
            } finally {
                httpURLConnection.disconnect();
            }
        } catch (IOException e) {
            String message = e.getMessage();
            C1668jm.m11615e(new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(message).length()).append("Error while pinging URL: ").append(str).append(". ").append(message).toString());
        } catch (IndexOutOfBoundsException e2) {
            String message2 = e2.getMessage();
            C1668jm.m11615e(new StringBuilder(String.valueOf(str).length() + 32 + String.valueOf(message2).length()).append("Error while parsing ping URL: ").append(str).append(". ").append(message2).toString());
        } catch (RuntimeException e3) {
            String message3 = e3.getMessage();
            C1668jm.m11615e(new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(message3).length()).append("Error while pinging URL: ").append(str).append(". ").append(message3).toString());
        }
    }
}
