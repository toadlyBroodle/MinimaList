package com.google.android.gms.internal;

import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class bmr {

    /* JADX INFO: renamed from: a */
    private final String f8449a;

    /* JADX INFO: renamed from: b */
    private final Map<String, Object> f8450b;

    private bmr(String str, Map<String, Object> map) {
        this.f8449a = str;
        this.f8450b = map;
    }

    /* JADX INFO: renamed from: a */
    public static bmr m9672a(String str) {
        if (!str.startsWith("gauth|")) {
            return null;
        }
        try {
            Map<String, Object> mapM9676a = bms.m9676a(str.substring(6));
            return new bmr((String) mapM9676a.get("token"), (Map) mapM9676a.get("auth"));
        } catch (IOException e) {
            throw new RuntimeException("Failed to parse gauth token", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m9673a() {
        return this.f8449a;
    }

    /* JADX INFO: renamed from: b */
    public final Map<String, Object> m9674b() {
        return this.f8450b;
    }
}
