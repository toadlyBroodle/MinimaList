package com.google.android.gms.internal;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.lm */
/* JADX INFO: loaded from: classes.dex */
final class C1722lm {

    /* JADX INFO: renamed from: a */
    long f10943a;

    /* JADX INFO: renamed from: b */
    final String f10944b;

    /* JADX INFO: renamed from: c */
    final String f10945c;

    /* JADX INFO: renamed from: d */
    final long f10946d;

    /* JADX INFO: renamed from: e */
    final long f10947e;

    /* JADX INFO: renamed from: f */
    final long f10948f;

    /* JADX INFO: renamed from: g */
    final long f10949g;

    /* JADX INFO: renamed from: h */
    final List<byl> f10950h;

    C1722lm(String str, C2048xo c2048xo) {
        this(str, c2048xo.f12306b, c2048xo.f12307c, c2048xo.f12308d, c2048xo.f12309e, c2048xo.f12310f, c2048xo.f12312h != null ? c2048xo.f12312h : C1778no.m11906b(c2048xo.f12311g));
        this.f10943a = c2048xo.f12305a.length;
    }

    private C1722lm(String str, String str2, long j, long j2, long j3, long j4, List<byl> list) {
        this.f10944b = str;
        this.f10945c = "".equals(str2) ? null : str2;
        this.f10946d = j;
        this.f10947e = j2;
        this.f10948f = j3;
        this.f10949g = j4;
        this.f10950h = list;
    }

    /* JADX INFO: renamed from: a */
    static C1722lm m11687a(C1750mn c1750mn) throws IOException {
        if (C1694kl.m11634a((InputStream) c1750mn) != 538247942) {
            throw new IOException();
        }
        return new C1722lm(C1694kl.m11636a(c1750mn), C1694kl.m11636a(c1750mn), C1694kl.m11642b((InputStream) c1750mn), C1694kl.m11642b((InputStream) c1750mn), C1694kl.m11642b((InputStream) c1750mn), C1694kl.m11642b((InputStream) c1750mn), C1694kl.m11643b(c1750mn));
    }

    /* JADX INFO: renamed from: a */
    final boolean m11688a(OutputStream outputStream) {
        try {
            C1694kl.m11637a(outputStream, 538247942);
            C1694kl.m11639a(outputStream, this.f10944b);
            C1694kl.m11639a(outputStream, this.f10945c == null ? "" : this.f10945c);
            C1694kl.m11638a(outputStream, this.f10946d);
            C1694kl.m11638a(outputStream, this.f10947e);
            C1694kl.m11638a(outputStream, this.f10948f);
            C1694kl.m11638a(outputStream, this.f10949g);
            List<byl> list = this.f10950h;
            if (list != null) {
                C1694kl.m11637a(outputStream, list.size());
                for (byl bylVar : list) {
                    C1694kl.m11639a(outputStream, bylVar.m10418a());
                    C1694kl.m11639a(outputStream, bylVar.m10419b());
                }
            } else {
                C1694kl.m11637a(outputStream, 0);
            }
            outputStream.flush();
            return true;
        } catch (IOException e) {
            C1498de.m11170b("%s", e.toString());
            return false;
        }
    }
}
