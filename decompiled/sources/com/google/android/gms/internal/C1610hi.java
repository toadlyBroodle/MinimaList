package com.google.android.gms.internal;

import android.os.SystemClock;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* JADX INFO: renamed from: com.google.android.gms.internal.hi */
/* JADX INFO: loaded from: classes.dex */
public class C1610hi implements bzk {

    /* JADX INFO: renamed from: a */
    private static boolean f10730a = C1498de.f10438a;

    /* JADX INFO: renamed from: b */
    @Deprecated
    private InterfaceC1831pn f10731b;

    /* JADX INFO: renamed from: c */
    private final AbstractC1582gh f10732c;

    /* JADX INFO: renamed from: d */
    private C1638ij f10733d;

    public C1610hi(AbstractC1582gh abstractC1582gh) {
        this(abstractC1582gh, new C1638ij(4096));
    }

    private C1610hi(AbstractC1582gh abstractC1582gh, C1638ij c1638ij) {
        this.f10732c = abstractC1582gh;
        this.f10731b = abstractC1582gh;
        this.f10733d = c1638ij;
    }

    @Deprecated
    public C1610hi(InterfaceC1831pn interfaceC1831pn) {
        this(interfaceC1831pn, new C1638ij(4096));
    }

    @Deprecated
    private C1610hi(InterfaceC1831pn interfaceC1831pn, C1638ij c1638ij) {
        this.f10731b = interfaceC1831pn;
        this.f10732c = new C1554fg(interfaceC1831pn);
        this.f10733d = c1638ij;
    }

    /* JADX INFO: renamed from: a */
    private static List<byl> m11481a(List<byl> list, C2048xo c2048xo) {
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        if (!list.isEmpty()) {
            Iterator<byl> it = list.iterator();
            while (it.hasNext()) {
                treeSet.add(it.next().m10418a());
            }
        }
        ArrayList arrayList = new ArrayList(list);
        if (c2048xo.f12312h != null) {
            if (!c2048xo.f12312h.isEmpty()) {
                for (byl bylVar : c2048xo.f12312h) {
                    if (!treeSet.contains(bylVar.m10418a())) {
                        arrayList.add(bylVar);
                    }
                }
            }
        } else if (!c2048xo.f12311g.isEmpty()) {
            for (Map.Entry<String, String> entry : c2048xo.f12311g.entrySet()) {
                if (!treeSet.contains(entry.getKey())) {
                    arrayList.add(new byl(entry.getKey(), entry.getValue()));
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    private static void m11482a(String str, cej<?> cejVar, C1471ce c1471ce) throws C1471ce {
        InterfaceC1422b interfaceC1422bM10773i = cejVar.m10773i();
        int iM10772h = cejVar.m10772h();
        try {
            interfaceC1422bM10773i.mo8753a(c1471ce);
            cejVar.m10765b(String.format("%s-retry [timeout=%s]", str, Integer.valueOf(iM10772h)));
        } catch (C1471ce e) {
            cejVar.m10765b(String.format("%s-timeout-giveup [timeout=%s]", str, Integer.valueOf(iM10772h)));
            throw e;
        }
    }

    /* JADX INFO: renamed from: a */
    private final byte[] m11483a(InputStream inputStream, int i) throws IOException {
        C1900sb c1900sb = new C1900sb(this.f10733d, i);
        try {
            if (inputStream == null) {
                throw new C1357ac();
            }
            byte[] bArrM11534a = this.f10733d.m11534a(1024);
            while (true) {
                int i2 = inputStream.read(bArrM11534a);
                if (i2 == -1) {
                    break;
                }
                c1900sb.write(bArrM11534a, 0, i2);
            }
            byte[] byteArray = c1900sb.toByteArray();
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    C1498de.m11168a("Error occurred when closing InputStream", new Object[0]);
                }
            }
            this.f10733d.m11533a(bArrM11534a);
            c1900sb.close();
            return byteArray;
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e2) {
                    C1498de.m11168a("Error occurred when closing InputStream", new Object[0]);
                }
            }
            this.f10733d.m11533a((byte[]) null);
            c1900sb.close();
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.bzk
    /* JADX INFO: renamed from: a */
    public cch mo10516a(cej<?> cejVar) throws C1471ce {
        byte[] bArrM11483a;
        Map<String, String> map;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            C1806op c1806op = null;
            List<byl> listEmptyList = Collections.emptyList();
            try {
                try {
                    C2048xo c2048xoM10770f = cejVar.m10770f();
                    if (c2048xoM10770f == null) {
                        map = Collections.emptyMap();
                    } else {
                        map = new HashMap<>();
                        if (c2048xoM10770f.f12306b != null) {
                            map.put("If-None-Match", c2048xoM10770f.f12306b);
                        }
                        if (c2048xoM10770f.f12308d > 0) {
                            map.put("If-Modified-Since", C1778no.m11902a(c2048xoM10770f.f12308d));
                        }
                    }
                    C1806op c1806opMo11337a = this.f10732c.mo11337a(cejVar, map);
                    try {
                        int iM11921a = c1806opMo11337a.m11921a();
                        listEmptyList = c1806opMo11337a.m11922b();
                        if (iM11921a == 304) {
                            C2048xo c2048xoM10770f2 = cejVar.m10770f();
                            return c2048xoM10770f2 == null ? new cch(304, (byte[]) null, true, SystemClock.elapsedRealtime() - jElapsedRealtime, listEmptyList) : new cch(304, c2048xoM10770f2.f12305a, true, SystemClock.elapsedRealtime() - jElapsedRealtime, m11481a(listEmptyList, c2048xoM10770f2));
                        }
                        InputStream inputStreamM11924d = c1806opMo11337a.m11924d();
                        bArrM11483a = inputStreamM11924d != null ? m11483a(inputStreamM11924d, c1806opMo11337a.m11923c()) : new byte[0];
                        try {
                            long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                            if (f10730a || jElapsedRealtime2 > 3000) {
                                Object[] objArr = new Object[5];
                                objArr[0] = cejVar;
                                objArr[1] = Long.valueOf(jElapsedRealtime2);
                                objArr[2] = bArrM11483a != null ? Integer.valueOf(bArrM11483a.length) : "null";
                                objArr[3] = Integer.valueOf(iM11921a);
                                objArr[4] = Integer.valueOf(cejVar.m10773i().mo8754b());
                                C1498de.m11170b("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", objArr);
                            }
                            if (iM11921a < 200 || iM11921a > 299) {
                                throw new IOException();
                            }
                            return new cch(iM11921a, bArrM11483a, false, SystemClock.elapsedRealtime() - jElapsedRealtime, listEmptyList);
                        } catch (IOException e) {
                            e = e;
                            c1806op = c1806opMo11337a;
                            if (c1806op == null) {
                                throw new cdi(e);
                            }
                            int iM11921a2 = c1806op.m11921a();
                            C1498de.m11171c("Unexpected response code %d for %s", Integer.valueOf(iM11921a2), cejVar.m10769e());
                            if (bArrM11483a != null) {
                                cch cchVar = new cch(iM11921a2, bArrM11483a, false, SystemClock.elapsedRealtime() - jElapsedRealtime, listEmptyList);
                                if (iM11921a2 != 401 && iM11921a2 != 403) {
                                    if (iM11921a2 >= 400 && iM11921a2 <= 499) {
                                        throw new btk(cchVar);
                                    }
                                    if (iM11921a2 < 500 || iM11921a2 > 599) {
                                        throw new C1357ac(cchVar);
                                    }
                                    throw new C1357ac(cchVar);
                                }
                                m11482a("auth", cejVar, new C1353a(cchVar));
                            } else {
                                m11482a("network", cejVar, new cbg());
                            }
                        }
                    } catch (IOException e2) {
                        e = e2;
                        bArrM11483a = null;
                        c1806op = c1806opMo11337a;
                    }
                } catch (IOException e3) {
                    e = e3;
                    bArrM11483a = null;
                }
            } catch (MalformedURLException e4) {
                String strValueOf = String.valueOf(cejVar.m10769e());
                throw new RuntimeException(strValueOf.length() != 0 ? "Bad URL ".concat(strValueOf) : new String("Bad URL "), e4);
            } catch (SocketTimeoutException e5) {
                m11482a("socket", cejVar, new C1426bd());
            }
        }
    }
}
