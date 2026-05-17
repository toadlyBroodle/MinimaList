package com.google.android.gms.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class bpf extends IOException {

    /* JADX INFO: renamed from: a */
    private bqa f8626a;

    public bpf(String str) {
        super(str);
        this.f8626a = null;
    }

    /* JADX INFO: renamed from: a */
    static bpf m9935a() {
        return new bpf("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* JADX INFO: renamed from: b */
    static bpf m9936b() {
        return new bpf("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX INFO: renamed from: c */
    static bpf m9937c() {
        return new bpf("CodedInputStream encountered a malformed varint.");
    }

    /* JADX INFO: renamed from: d */
    static bpf m9938d() {
        return new bpf("Protocol message contained an invalid tag (zero).");
    }

    /* JADX INFO: renamed from: e */
    static bpf m9939e() {
        return new bpf("Protocol message end-group tag did not match expected tag.");
    }

    /* JADX INFO: renamed from: f */
    static bpg m9940f() {
        return new bpg("Protocol message tag had invalid wire type.");
    }

    /* JADX INFO: renamed from: g */
    static bpf m9941g() {
        return new bpf("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* JADX INFO: renamed from: h */
    static bpf m9942h() {
        return new bpf("Protocol message had invalid UTF-8.");
    }

    /* JADX INFO: renamed from: a */
    public final bpf m9943a(bqa bqaVar) {
        this.f8626a = bqaVar;
        return this;
    }
}
