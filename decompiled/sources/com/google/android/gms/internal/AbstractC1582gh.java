package com.google.android.gms.internal;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolVersion;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;

/* JADX INFO: renamed from: com.google.android.gms.internal.gh */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1582gh implements InterfaceC1831pn {
    /* JADX INFO: renamed from: a */
    public abstract C1806op mo11337a(cej<?> cejVar, Map<String, String> map);

    @Override // com.google.android.gms.internal.InterfaceC1831pn
    @Deprecated
    /* JADX INFO: renamed from: b */
    public final HttpResponse mo11368b(cej<?> cejVar, Map<String, String> map) {
        C1806op c1806opMo11337a = mo11337a(cejVar, map);
        BasicHttpResponse basicHttpResponse = new BasicHttpResponse(new BasicStatusLine(new ProtocolVersion("HTTP", 1, 1), c1806opMo11337a.m11921a(), ""));
        ArrayList arrayList = new ArrayList();
        for (byl bylVar : c1806opMo11337a.m11922b()) {
            arrayList.add(new BasicHeader(bylVar.m10418a(), bylVar.m10419b()));
        }
        basicHttpResponse.setHeaders((Header[]) arrayList.toArray(new Header[arrayList.size()]));
        InputStream inputStreamM11924d = c1806opMo11337a.m11924d();
        if (inputStreamM11924d != null) {
            BasicHttpEntity basicHttpEntity = new BasicHttpEntity();
            basicHttpEntity.setContent(inputStreamM11924d);
            basicHttpEntity.setContentLength(c1806opMo11337a.m11923c());
            basicHttpResponse.setEntity(basicHttpEntity);
        }
        return basicHttpResponse;
    }
}
