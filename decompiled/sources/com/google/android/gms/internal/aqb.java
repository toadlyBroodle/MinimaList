package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
final class aqb implements apy {
    aqb() {
    }

    @Override // com.google.android.gms.internal.apy
    /* JADX INFO: renamed from: a */
    public final aqd mo8136a(byte[] bArr) throws apq {
        if (bArr == null) {
            throw new apq("Cannot parse a null byte[]");
        }
        if (bArr.length == 0) {
            throw new apq("Cannot parse a 0 length byte[]");
        }
        try {
            arb arbVarM8121b = apr.m8121b(new String(bArr));
            if (arbVarM8121b != null) {
                ahs.m7947d("The runtime configuration was successfully parsed from the resource");
            }
            return new aqd(Status.f5451a, 0, null, arbVarM8121b);
        } catch (apq e) {
            throw new apq("The resource data is invalid. The runtime  configuration cannot be extracted from the JSON data");
        } catch (JSONException e2) {
            throw new apq("The resource data is corrupted. The runtime configuration cannot be extracted from the JSON data");
        }
    }
}
