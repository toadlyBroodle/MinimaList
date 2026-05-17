package com.google.android.gms.internal;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: loaded from: classes.dex */
final class aqm implements aqn {

    /* JADX INFO: renamed from: a */
    private HttpURLConnection f7085a;

    /* JADX INFO: renamed from: b */
    private InputStream f7086b = null;

    aqm() {
    }

    @Override // com.google.android.gms.internal.aqn
    /* JADX INFO: renamed from: a */
    public final InputStream mo8161a(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setReadTimeout(20000);
        httpURLConnection.setConnectTimeout(20000);
        this.f7085a = httpURLConnection;
        HttpURLConnection httpURLConnection2 = this.f7085a;
        int responseCode = httpURLConnection2.getResponseCode();
        if (responseCode == 200) {
            this.f7086b = httpURLConnection2.getInputStream();
            return this.f7086b;
        }
        String string = new StringBuilder(25).append("Bad response: ").append(responseCode).toString();
        if (responseCode == 404) {
            throw new FileNotFoundException(string);
        }
        if (responseCode == 503) {
            throw new aqr(string);
        }
        throw new IOException(string);
    }

    @Override // com.google.android.gms.internal.aqn
    /* JADX INFO: renamed from: a */
    public final void mo8162a() {
        HttpURLConnection httpURLConnection = this.f7085a;
        try {
            if (this.f7086b != null) {
                this.f7086b.close();
            }
        } catch (IOException e) {
            String strValueOf = String.valueOf(e.getMessage());
            ahs.m7943a(strValueOf.length() != 0 ? "HttpUrlConnectionNetworkClient: Error when closing http input stream: ".concat(strValueOf) : new String("HttpUrlConnectionNetworkClient: Error when closing http input stream: "), e);
        }
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }
}
