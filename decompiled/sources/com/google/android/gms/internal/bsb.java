package com.google.android.gms.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class bsb extends IOException {
    public bsb(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: a */
    static bsb m10158a() {
        return new bsb("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    /* JADX INFO: renamed from: b */
    static bsb m10159b() {
        return new bsb("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX INFO: renamed from: c */
    static bsb m10160c() {
        return new bsb("CodedInputStream encountered a malformed varint.");
    }

    /* JADX INFO: renamed from: d */
    static bsb m10161d() {
        return new bsb("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }
}
