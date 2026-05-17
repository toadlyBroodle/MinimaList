package com.google.android.gms.internal;

import android.net.SSLCertificateSocketFactory;
import android.net.SSLSessionCache;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.Thread;
import java.net.Socket;
import java.net.URI;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes.dex */
public final class bme {

    /* JADX INFO: renamed from: a */
    private static final AtomicInteger f8404a = new AtomicInteger(0);

    /* JADX INFO: renamed from: b */
    private static final Charset f8405b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: n */
    private static ThreadFactory f8406n = Executors.defaultThreadFactory();

    /* JADX INFO: renamed from: o */
    private static bmd f8407o = new bmf();

    /* JADX INFO: renamed from: f */
    private final URI f8411f;

    /* JADX INFO: renamed from: g */
    private final String f8412g;

    /* JADX INFO: renamed from: j */
    private final bmm f8415j;

    /* JADX INFO: renamed from: k */
    private final bkl f8416k;

    /* JADX INFO: renamed from: c */
    private volatile int f8408c = bmi.f8421a;

    /* JADX INFO: renamed from: d */
    private volatile Socket f8409d = null;

    /* JADX INFO: renamed from: e */
    private bmj f8410e = null;

    /* JADX INFO: renamed from: l */
    private final int f8417l = f8404a.incrementAndGet();

    /* JADX INFO: renamed from: m */
    private final Thread f8418m = f8406n.newThread(new bmg(this));

    /* JADX INFO: renamed from: h */
    private final bmo f8413h = new bmo(this);

    /* JADX INFO: renamed from: i */
    private final bmp f8414i = new bmp(this, "TubeSock", this.f8417l);

    public bme(bcz bczVar, URI uri, String str, Map<String, String> map) {
        this.f8411f = uri;
        this.f8412g = bczVar.m8948g();
        this.f8416k = new bkl(bczVar.m8942a(), "WebSocket", new StringBuilder(14).append("sk_").append(this.f8417l).toString());
        this.f8415j = new bmm(uri, null, map);
    }

    /* JADX INFO: renamed from: a */
    static ThreadFactory m9639a() {
        return f8406n;
    }

    /* JADX INFO: renamed from: a */
    private final synchronized void m9640a(byte b, byte[] bArr) {
        if (this.f8408c != bmi.f8423c) {
            this.f8410e.mo9071a(new bml("error while sending data: not connected"));
        } else {
            try {
                this.f8414i.m9669a(b, true, bArr);
            } catch (IOException e) {
                this.f8410e.mo9071a(new bml("Failed to send frame", e));
                m9652e();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    static bmd m9642b() {
        return f8407o;
    }

    /* JADX INFO: renamed from: h */
    private final synchronized void m9643h() {
        if (this.f8408c != bmi.f8425e) {
            this.f8413h.m9664b();
            this.f8414i.m9668a();
            if (this.f8409d != null) {
                try {
                    this.f8409d.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            this.f8408c = bmi.f8425e;
            this.f8410e.mo9074d();
        }
    }

    /* JADX INFO: renamed from: i */
    private final Socket m9644i() {
        String scheme = this.f8411f.getScheme();
        String host = this.f8411f.getHost();
        int port = this.f8411f.getPort();
        if (scheme != null && scheme.equals("ws")) {
            try {
                return new Socket(host, port == -1 ? 80 : port);
            } catch (UnknownHostException e) {
                String strValueOf = String.valueOf(host);
                throw new bml(strValueOf.length() != 0 ? "unknown host: ".concat(strValueOf) : new String("unknown host: "), e);
            } catch (IOException e2) {
                String strValueOf2 = String.valueOf(this.f8411f);
                throw new bml(new StringBuilder(String.valueOf(strValueOf2).length() + 31).append("error while creating socket to ").append(strValueOf2).toString(), e2);
            }
        }
        if (scheme == null || !scheme.equals("wss")) {
            String strValueOf3 = String.valueOf(scheme);
            throw new bml(strValueOf3.length() != 0 ? "unsupported protocol: ".concat(strValueOf3) : new String("unsupported protocol: "));
        }
        if (port == -1) {
            port = 443;
        }
        try {
        } catch (IOException e3) {
            this.f8416k.m9540a("Failed to initialize SSL session cache", e3, new Object[0]);
        }
        SSLSessionCache sSLSessionCache = this.f8412g != null ? new SSLSessionCache(new File(this.f8412g)) : null;
        try {
            SSLSocket sSLSocket = (SSLSocket) SSLCertificateSocketFactory.getDefault(60000, sSLSessionCache).createSocket(host, port);
            if (HttpsURLConnection.getDefaultHostnameVerifier().verify(host, sSLSocket.getSession())) {
                return sSLSocket;
            }
            String strValueOf4 = String.valueOf(this.f8411f);
            throw new bml(new StringBuilder(String.valueOf(strValueOf4).length() + 39).append("Error while verifying secure socket to ").append(strValueOf4).toString());
        } catch (UnknownHostException e4) {
            String strValueOf5 = String.valueOf(host);
            throw new bml(strValueOf5.length() != 0 ? "unknown host: ".concat(strValueOf5) : new String("unknown host: "), e4);
        } catch (IOException e5) {
            String strValueOf6 = String.valueOf(this.f8411f);
            throw new bml(new StringBuilder(String.valueOf(strValueOf6).length() + 38).append("error while creating secure socket to ").append(strValueOf6).toString(), e5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public final void m9645j() {
        int i = 0;
        try {
            Socket socketM9644i = m9644i();
            synchronized (this) {
                this.f8409d = socketM9644i;
                if (this.f8408c == bmi.f8425e) {
                    try {
                        this.f8409d.close();
                        this.f8409d = null;
                        return;
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
                DataInputStream dataInputStream = new DataInputStream(socketM9644i.getInputStream());
                OutputStream outputStream = socketM9644i.getOutputStream();
                outputStream.write(this.f8415j.m9658a());
                ArrayList arrayList = new ArrayList();
                int i2 = 0;
                byte[] bArr = new byte[1000];
                boolean z = false;
                while (!z) {
                    int i3 = dataInputStream.read();
                    if (i3 == -1) {
                        throw new bml("Connection closed before handshake was complete");
                    }
                    bArr[i2] = (byte) i3;
                    i2++;
                    if (bArr[i2 - 1] == 10 && bArr[i2 - 2] == 13) {
                        String str = new String(bArr, f8405b);
                        if (str.trim().equals("")) {
                            z = true;
                        } else {
                            arrayList.add(str.trim());
                        }
                        bArr = new byte[1000];
                        i2 = 0;
                    } else if (i2 == 1000) {
                        String strValueOf = String.valueOf(new String(bArr, f8405b));
                        throw new bml(strValueOf.length() != 0 ? "Unexpected long line in handshake: ".concat(strValueOf) : new String("Unexpected long line in handshake: "));
                    }
                }
                int iIntValue = Integer.valueOf(((String) arrayList.get(0)).substring(9, 12)).intValue();
                if (iIntValue == 407) {
                    throw new bml("connection failed: proxy authentication not supported");
                }
                if (iIntValue == 404) {
                    throw new bml("connection failed: 404 not found");
                }
                if (iIntValue != 101) {
                    throw new bml(new StringBuilder(50).append("connection failed: unknown status code ").append(iIntValue).toString());
                }
                arrayList.remove(0);
                HashMap map = new HashMap();
                ArrayList arrayList2 = arrayList;
                int size = arrayList2.size();
                while (i < size) {
                    Object obj = arrayList2.get(i);
                    i++;
                    String[] strArrSplit = ((String) obj).split(": ", 2);
                    map.put(strArrSplit[0], strArrSplit[1]);
                }
                if (!((String) map.get("Upgrade")).toLowerCase(Locale.US).equals("websocket")) {
                    throw new bml("connection failed: missing header field in server handshake: Upgrade");
                }
                if (!((String) map.get("Connection")).toLowerCase(Locale.US).equals("upgrade")) {
                    throw new bml("connection failed: missing header field in server handshake: Connection");
                }
                this.f8414i.m9670a(outputStream);
                this.f8413h.m9663a(dataInputStream);
                this.f8408c = bmi.f8423c;
                this.f8414i.m9671b().start();
                this.f8410e.mo9073c();
                this.f8413h.m9662a();
            }
        } catch (IOException e2) {
            bmj bmjVar = this.f8410e;
            String strValueOf2 = String.valueOf(e2.getMessage());
            bmjVar.mo9071a(new bml(strValueOf2.length() != 0 ? "error while connecting: ".concat(strValueOf2) : new String("error while connecting: "), e2));
        } catch (bml e3) {
            this.f8410e.mo9071a(e3);
        } finally {
            m9652e();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m9646a(bmj bmjVar) {
        this.f8410e = bmjVar;
    }

    /* JADX INFO: renamed from: a */
    final void m9647a(bml bmlVar) {
        this.f8410e.mo9071a(bmlVar);
        if (this.f8408c == bmi.f8423c) {
            m9652e();
        }
        m9643h();
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m9648a(String str) {
        m9640a((byte) 1, str.getBytes(f8405b));
    }

    /* JADX INFO: renamed from: a */
    final synchronized void m9649a(byte[] bArr) {
        m9640a((byte) 10, bArr);
    }

    /* JADX INFO: renamed from: c */
    final bmj m9650c() {
        return this.f8410e;
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m9651d() {
        if (this.f8408c != bmi.f8421a) {
            this.f8410e.mo9071a(new bml("connect() already called"));
            m9652e();
        } else {
            f8407o.mo9638a(this.f8418m, new StringBuilder(String.valueOf("TubeSockReader-").length() + 11).append("TubeSockReader-").append(this.f8417l).toString());
            this.f8408c = bmi.f8422b;
            this.f8418m.start();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: e */
    public final synchronized void m9652e() {
        switch (bmh.f8420a[this.f8408c - 1]) {
            case 1:
                this.f8408c = bmi.f8425e;
                break;
            case 2:
                m9643h();
                break;
            case 3:
                try {
                    this.f8408c = bmi.f8424d;
                    this.f8414i.m9668a();
                    this.f8414i.m9669a((byte) 8, true, new byte[0]);
                } catch (IOException e) {
                    this.f8410e.mo9071a(new bml("Failed to send close frame", e));
                }
                break;
        }
    }

    /* JADX INFO: renamed from: f */
    final void m9653f() {
        m9643h();
    }

    /* JADX INFO: renamed from: g */
    public final void m9654g() throws InterruptedException {
        if (this.f8414i.m9671b().getState() != Thread.State.NEW) {
            this.f8414i.m9671b().join();
        }
        this.f8418m.join();
    }
}
