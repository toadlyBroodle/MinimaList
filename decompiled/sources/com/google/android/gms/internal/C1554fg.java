package com.google.android.gms.internal;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.conn.ConnectTimeoutException;

/* JADX INFO: renamed from: com.google.android.gms.internal.fg */
/* JADX INFO: loaded from: classes.dex */
final class C1554fg extends AbstractC1582gh {

    /* JADX INFO: renamed from: a */
    private final InterfaceC1831pn f10646a;

    C1554fg(InterfaceC1831pn interfaceC1831pn) {
        this.f10646a = interfaceC1831pn;
    }

    @Override // com.google.android.gms.internal.AbstractC1582gh
    /* JADX INFO: renamed from: a */
    public final C1806op mo11337a(cej<?> cejVar, Map<String, String> map) throws IOException {
        try {
            HttpResponse httpResponseMo11368b = this.f10646a.mo11368b(cejVar, map);
            int statusCode = httpResponseMo11368b.getStatusLine().getStatusCode();
            Header[] allHeaders = httpResponseMo11368b.getAllHeaders();
            ArrayList arrayList = new ArrayList(allHeaders.length);
            for (Header header : allHeaders) {
                arrayList.add(new byl(header.getName(), header.getValue()));
            }
            if (httpResponseMo11368b.getEntity() == null) {
                return new C1806op(statusCode, arrayList);
            }
            long contentLength = httpResponseMo11368b.getEntity().getContentLength();
            if (((int) contentLength) != contentLength) {
                throw new IOException(new StringBuilder(40).append("Response too large: ").append(contentLength).toString());
            }
            return new C1806op(statusCode, arrayList, (int) httpResponseMo11368b.getEntity().getContentLength(), httpResponseMo11368b.getEntity().getContent());
        } catch (ConnectTimeoutException e) {
            throw new SocketTimeoutException(e.getMessage());
        }
    }
}
