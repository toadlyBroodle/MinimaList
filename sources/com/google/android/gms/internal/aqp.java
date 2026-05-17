package com.google.android.gms.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.common.util.C1308l;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class aqp implements Runnable {

    /* JADX INFO: renamed from: a */
    private final Context f7087a;

    /* JADX INFO: renamed from: b */
    private final aps f7088b;

    /* JADX INFO: renamed from: c */
    private final aqo f7089c;

    /* JADX INFO: renamed from: d */
    private final aqc f7090d;

    /* JADX INFO: renamed from: e */
    private final aql f7091e;

    public aqp(Context context, aqc aqcVar, aps apsVar) {
        this(context, aqcVar, apsVar, new aqo(), new aql());
    }

    private aqp(Context context, aqc aqcVar, aps apsVar, aqo aqoVar, aql aqlVar) {
        this.f7087a = (Context) C1221aj.m7065a(context);
        this.f7088b = (aps) C1221aj.m7065a(apsVar);
        this.f7090d = aqcVar;
        this.f7089c = aqoVar;
        this.f7091e = aqlVar;
    }

    /* JADX INFO: renamed from: a */
    private final boolean m8163a(String str) {
        return this.f7087a.getPackageManager().checkPermission(str, this.f7087a.getPackageName()) == 0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        if (!m8163a("android.permission.INTERNET")) {
            ahs.m7942a("Missing android.permission.INTERNET. Please add the following declaration to your AndroidManifest.xml: <uses-permission android:name=\"android.permission.INTERNET\" />");
            z = false;
        } else if (m8163a("android.permission.ACCESS_NETWORK_STATE")) {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f7087a.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                ahs.m7944b("No network connectivity - Offline");
                z = false;
            } else {
                z = true;
            }
        } else {
            ahs.m7942a("Missing android.permission.ACCESS_NETWORK_STATE. Please add the following declaration to your AndroidManifest.xml: <uses-permission android:name=\"android.permission.ACCESS_NETWORK_STATE\" />");
            z = false;
        }
        if (!z) {
            this.f7088b.m8125a(0, 0);
            return;
        }
        ahs.m7947d("Starting to load resource from Network.");
        aqm aqmVar = new aqm();
        InputStream inputStreamMo8161a = null;
        try {
            String strM8160a = this.f7091e.m8160a(this.f7090d.m8137a());
            String strValueOf = String.valueOf(strM8160a);
            ahs.m7947d(strValueOf.length() != 0 ? "Loading resource from ".concat(strValueOf) : new String("Loading resource from "));
            try {
                try {
                    try {
                        inputStreamMo8161a = aqmVar.mo8161a(strM8160a);
                    } catch (FileNotFoundException e) {
                        String strValueOf2 = String.valueOf(strM8160a);
                        ahs.m7942a(strValueOf2.length() != 0 ? "NetworkLoader: No data was retrieved from the given url: ".concat(strValueOf2) : new String("NetworkLoader: No data was retrieved from the given url: "));
                        this.f7088b.m8125a(2, 0);
                        aqmVar.mo8162a();
                        return;
                    }
                } catch (aqr e2) {
                    String strValueOf3 = String.valueOf(strM8160a);
                    ahs.m7942a(strValueOf3.length() != 0 ? "NetworkLoader: Error when loading resource for url: ".concat(strValueOf3) : new String("NetworkLoader: Error when loading resource for url: "));
                    this.f7088b.m8125a(3, 0);
                }
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    C1308l.m7273a(inputStreamMo8161a, byteArrayOutputStream, false);
                    this.f7088b.m8127a(byteArrayOutputStream.toByteArray());
                    aqmVar.mo8162a();
                } catch (IOException e3) {
                    String message = e3.getMessage();
                    ahs.m7943a(new StringBuilder(String.valueOf(strM8160a).length() + 66 + String.valueOf(message).length()).append("NetworkLoader: Error when parsing downloaded resources from url: ").append(strM8160a).append(" ").append(message).toString(), e3);
                    this.f7088b.m8125a(2, 0);
                    aqmVar.mo8162a();
                }
            } catch (IOException e4) {
                String message2 = e4.getMessage();
                ahs.m7943a(new StringBuilder(String.valueOf(strM8160a).length() + 54 + String.valueOf(message2).length()).append("NetworkLoader: Error when loading resource from url: ").append(strM8160a).append(" ").append(message2).toString(), e4);
                this.f7088b.m8125a(1, 0);
                aqmVar.mo8162a();
            }
        } catch (Throwable th) {
            aqmVar.mo8162a();
            throw th;
        }
    }
}
