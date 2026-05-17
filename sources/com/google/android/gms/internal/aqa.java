package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
final class aqa implements apy {
    aqa() {
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
            aqs aqsVarM8115a = apr.m8115a(new String(bArr));
            if (aqsVarM8115a != null) {
                ahs.m7947d("The container was successfully parsed from the resource");
            }
            return new aqd(Status.f5451a, 0, new aqe(aqsVarM8115a), apz.f7060b.mo8136a(bArr).m8141c());
        } catch (apq e) {
            throw new apq("The resource data is invalid. The container cannot be extracted from the JSON data");
        } catch (JSONException e2) {
            throw new apq("The resource data is corrupted. The container cannot be extracted from the JSON data");
        }
    }
}
