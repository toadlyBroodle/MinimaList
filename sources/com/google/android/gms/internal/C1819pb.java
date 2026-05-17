package com.google.android.gms.internal;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.analytics.AbstractC0901p;
import java.util.HashMap;
import java.util.UUID;

/* JADX INFO: renamed from: com.google.android.gms.internal.pb */
/* JADX INFO: loaded from: classes.dex */
public final class C1819pb extends AbstractC0901p<C1819pb> {

    /* JADX INFO: renamed from: a */
    private String f11267a;

    /* JADX INFO: renamed from: b */
    private int f11268b;

    /* JADX INFO: renamed from: c */
    private int f11269c;

    /* JADX INFO: renamed from: d */
    private String f11270d;

    /* JADX INFO: renamed from: e */
    private String f11271e;

    /* JADX INFO: renamed from: f */
    private boolean f11272f;

    /* JADX INFO: renamed from: g */
    private boolean f11273g;

    public C1819pb() {
        this(false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private C1819pb(boolean z) {
        UUID uuidRandomUUID = UUID.randomUUID();
        int leastSignificantBits = (int) (uuidRandomUUID.getLeastSignificantBits() & 2147483647L);
        if (leastSignificantBits == 0 && (leastSignificantBits = (int) (uuidRandomUUID.getMostSignificantBits() & 2147483647L)) == 0) {
            Log.e("GAv4", "UUID.randomUUID() returned 0.");
            leastSignificantBits = Integer.MAX_VALUE;
        }
        this(false, leastSignificantBits);
    }

    private C1819pb(boolean z, int i) {
        if (i == 0) {
            throw new IllegalArgumentException("Given Integer is zero");
        }
        this.f11268b = i;
        this.f11273g = false;
    }

    /* JADX INFO: renamed from: a */
    public final String m11993a() {
        return this.f11267a;
    }

    @Override // com.google.android.gms.analytics.AbstractC0901p
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo6068a(AbstractC0901p abstractC0901p) {
        C1819pb c1819pb = (C1819pb) abstractC0901p;
        if (!TextUtils.isEmpty(this.f11267a)) {
            c1819pb.f11267a = this.f11267a;
        }
        if (this.f11268b != 0) {
            c1819pb.f11268b = this.f11268b;
        }
        if (this.f11269c != 0) {
            c1819pb.f11269c = this.f11269c;
        }
        if (!TextUtils.isEmpty(this.f11270d)) {
            c1819pb.f11270d = this.f11270d;
        }
        if (!TextUtils.isEmpty(this.f11271e)) {
            String str = this.f11271e;
            if (TextUtils.isEmpty(str)) {
                c1819pb.f11271e = null;
            } else {
                c1819pb.f11271e = str;
            }
        }
        if (this.f11272f) {
            c1819pb.f11272f = this.f11272f;
        }
        if (this.f11273g) {
            c1819pb.f11273g = this.f11273g;
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m11994b() {
        return this.f11268b;
    }

    /* JADX INFO: renamed from: c */
    public final String m11995c() {
        return this.f11271e;
    }

    public final String toString() {
        HashMap map = new HashMap();
        map.put("screenName", this.f11267a);
        map.put("interstitial", Boolean.valueOf(this.f11272f));
        map.put("automatic", Boolean.valueOf(this.f11273g));
        map.put("screenId", Integer.valueOf(this.f11268b));
        map.put("referrerScreenId", Integer.valueOf(this.f11269c));
        map.put("referrerScreenName", this.f11270d);
        map.put("referrerUri", this.f11271e);
        return m6065a((Object) map);
    }
}
