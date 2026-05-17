package com.google.android.gms.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class ait implements agz {

    /* JADX INFO: renamed from: a */
    private final String f6879a;

    /* JADX INFO: renamed from: b */
    private final Context f6880b;

    /* JADX INFO: renamed from: c */
    private final aiw f6881c;

    /* JADX INFO: renamed from: d */
    private final aiv f6882d;

    ait(Context context, aiv aivVar) {
        this(new aiu(), context, aivVar);
    }

    private ait(aiw aiwVar, Context context, aiv aivVar) {
        String string = null;
        this.f6881c = aiwVar;
        this.f6880b = context.getApplicationContext();
        this.f6882d = aivVar;
        String str = Build.VERSION.RELEASE;
        Locale locale = Locale.getDefault();
        if (locale != null && locale.getLanguage() != null && locale.getLanguage().length() != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(locale.getLanguage().toLowerCase());
            if (locale.getCountry() != null && locale.getCountry().length() != 0) {
                sb.append("-").append(locale.getCountry().toLowerCase());
            }
            string = sb.toString();
        }
        this.f6879a = String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", "GoogleTagManager", "5.06", str, string, Build.MODEL, Build.ID);
    }

    /* JADX INFO: renamed from: a */
    private static URL m8029a(ahd ahdVar) {
        try {
            return new URL(ahdVar.m7916c());
        } catch (MalformedURLException e) {
            ahs.m7942a("Error trying to parse the GTM url.");
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0077 A[Catch: IOException -> 0x007e, TRY_ENTER, TryCatch #6 {IOException -> 0x007e, blocks: (B:31:0x00ed, B:42:0x0127, B:86:0x0221, B:87:0x0224, B:23:0x0077, B:24:0x007a, B:25:0x007d), top: B:116:0x00ed }] */
    @Override // com.google.android.gms.internal.agz
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo7901a(List<ahd> list) throws Throwable {
        boolean z;
        boolean z2;
        Throwable th;
        InputStream inputStream;
        BufferedReader bufferedReader;
        int iMin = Math.min(list.size(), 40);
        boolean z3 = true;
        int i = 0;
        while (i < iMin) {
            ahd ahdVar = list.get(i);
            URL urlM8029a = m8029a(ahdVar);
            String strM7918d = ahdVar.m7918d();
            Map<String, String> mapM7919e = ahdVar.m7919e();
            String strM7920f = ahdVar.m7920f();
            if (urlM8029a == null) {
                ahs.m7944b("No destination: discarding hit.");
                this.f6882d.mo7967b(ahdVar);
                z = z3;
            } else {
                InputStream inputStream2 = null;
                try {
                    HttpURLConnection httpURLConnectionMo8030a = this.f6881c.mo8030a(urlM8029a);
                    if (z3) {
                        try {
                            ahu.m7948a(this.f6880b);
                            z2 = false;
                        } catch (Throwable th2) {
                            z2 = z3;
                            th = th2;
                            inputStream = null;
                            if (inputStream != null) {
                            }
                            httpURLConnectionMo8030a.disconnect();
                            throw th;
                        }
                    } else {
                        z2 = z3;
                    }
                    try {
                        httpURLConnectionMo8030a.setRequestProperty("User-Agent", this.f6879a);
                        if (mapM7919e != null) {
                            for (Map.Entry<String, String> entry : mapM7919e.entrySet()) {
                                httpURLConnectionMo8030a.setRequestProperty(entry.getKey(), entry.getValue());
                            }
                        }
                        if (strM7918d == null) {
                            ahs.m7944b(String.format("Hit %d retrieved from the store has null HTTP method.", Long.valueOf(ahdVar.m7911a())));
                            this.f6882d.mo7967b(ahdVar);
                            try {
                                httpURLConnectionMo8030a.disconnect();
                                z = z2;
                            } catch (IOException e) {
                                e = e;
                                z3 = z2;
                                String strValueOf = String.valueOf(urlM8029a);
                                String simpleName = e.getClass().getSimpleName();
                                ahs.m7944b(new StringBuilder(String.valueOf(strValueOf).length() + 27 + String.valueOf(simpleName).length()).append("Exception sending hit to ").append(strValueOf).append(": ").append(simpleName).toString());
                                ahs.m7944b(e.getMessage());
                                this.f6882d.mo7968c(ahdVar);
                                z = z3;
                            }
                        } else if (strM7918d.equals("GET") || strM7918d.equals("HEAD") || strM7918d.equals("POST") || strM7918d.equals("PUT")) {
                            switch (strM7918d) {
                                case "GET":
                                case "HEAD":
                                    if (strM7920f != null) {
                                        ahs.m7944b(String.format("Body of %s hit is ignored: %s.", strM7918d, strM7920f));
                                    }
                                    httpURLConnectionMo8030a.setRequestMethod(strM7918d);
                                    break;
                                case "POST":
                                case "PUT":
                                    httpURLConnectionMo8030a.setRequestMethod(strM7918d);
                                    if (strM7920f != null) {
                                        httpURLConnectionMo8030a.setDoOutput(true);
                                        byte[] bytes = strM7920f.getBytes(Charset.forName("UTF-8"));
                                        httpURLConnectionMo8030a.setFixedLengthStreamingMode(bytes.length);
                                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnectionMo8030a.getOutputStream());
                                        bufferedOutputStream.write(bytes);
                                        bufferedOutputStream.flush();
                                        bufferedOutputStream.close();
                                        break;
                                    }
                                    break;
                            }
                            int responseCode = httpURLConnectionMo8030a.getResponseCode();
                            if (responseCode != 200) {
                                String strValueOf2 = String.valueOf(urlM8029a);
                                ahs.m7944b(new StringBuilder(String.valueOf(strValueOf2).length() + 39).append("Bad response received for ").append(strValueOf2).append(": ").append(responseCode).toString());
                                StringBuilder sb = new StringBuilder();
                                try {
                                    bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnectionMo8030a.getErrorStream()));
                                    while (true) {
                                        try {
                                            String line = bufferedReader.readLine();
                                            if (line != null) {
                                                sb.append(line);
                                            } else {
                                                String strValueOf3 = String.valueOf(sb.toString());
                                                ahs.m7944b(strValueOf3.length() != 0 ? "Error Message: ".concat(strValueOf3) : new String("Error Message: "));
                                                bufferedReader.close();
                                                this.f6882d.mo7968c(ahdVar);
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            if (bufferedReader != null) {
                                                bufferedReader.close();
                                            }
                                            throw th;
                                        }
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    bufferedReader = null;
                                }
                            } else {
                                inputStream = httpURLConnectionMo8030a.getInputStream();
                                try {
                                    String strValueOf4 = String.valueOf(urlM8029a);
                                    ahs.m7947d(new StringBuilder(String.valueOf(strValueOf4).length() + 23 + String.valueOf(strM7918d).length()).append("Hit sent to ").append(strValueOf4).append("(method = ").append(strM7918d).append(")").toString());
                                    this.f6882d.mo7966a(ahdVar);
                                    inputStream2 = inputStream;
                                } catch (Throwable th5) {
                                    th = th5;
                                    if (inputStream != null) {
                                        inputStream.close();
                                    }
                                    httpURLConnectionMo8030a.disconnect();
                                    throw th;
                                }
                            }
                            if (inputStream2 != null) {
                                inputStream2.close();
                            }
                            httpURLConnectionMo8030a.disconnect();
                            z = z2;
                        } else {
                            ahs.m7944b(String.format("Unrecongnized HTTP method %s. Supported methods are GET, HEAD, PUT and/or POST", strM7918d));
                            this.f6882d.mo7967b(ahdVar);
                            httpURLConnectionMo8030a.disconnect();
                            z = z2;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        inputStream = null;
                    }
                } catch (IOException e2) {
                    e = e2;
                }
            }
            i++;
            z3 = z;
        }
    }

    @Override // com.google.android.gms.internal.agz
    /* JADX INFO: renamed from: a */
    public final boolean mo7902a() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f6880b.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        ahs.m7947d("...no network connectivity");
        return false;
    }
}
