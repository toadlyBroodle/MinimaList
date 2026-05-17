package com.google.android.gms.internal;

import com.google.android.gms.internal.awa;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes.dex */
public final class ass<P> {

    /* JADX INFO: renamed from: a */
    private static final Charset f7221a = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: b */
    private ConcurrentMap<String, List<ast<P>>> f7222b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c */
    private ast<P> f7223c;

    /* JADX INFO: renamed from: a */
    public final ast<P> m8282a() {
        return this.f7223c;
    }

    /* JADX INFO: renamed from: a */
    protected final ast<P> m8283a(P p, awa.C1410b c1410b) throws GeneralSecurityException {
        byte[] bArrArray;
        switch (c1410b.m8572f()) {
            case LEGACY:
            case CRUNCHY:
                bArrArray = ByteBuffer.allocate(5).put((byte) 0).putInt(c1410b.m8571e()).array();
                break;
            case TINK:
                bArrArray = ByteBuffer.allocate(5).put((byte) 1).putInt(c1410b.m8571e()).array();
                break;
            case RAW:
                bArrArray = ash.f7204a;
                break;
            default:
                throw new GeneralSecurityException("unknown output prefix type");
        }
        ast<P> astVar = new ast<>(p, bArrArray, c1410b.m8570c(), c1410b.m8572f());
        ArrayList arrayList = new ArrayList();
        arrayList.add(astVar);
        String str = new String(astVar.m8286b(), f7221a);
        List<ast<P>> listPut = this.f7222b.put(str, Collections.unmodifiableList(arrayList));
        if (listPut != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(listPut);
            arrayList2.add(astVar);
            this.f7222b.put(str, Collections.unmodifiableList(arrayList2));
        }
        return astVar;
    }

    /* JADX INFO: renamed from: a */
    protected final void m8284a(ast<P> astVar) {
        this.f7223c = astVar;
    }
}
