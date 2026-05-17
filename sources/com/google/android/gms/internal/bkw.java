package com.google.android.gms.internal;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class bkw {

    /* JADX INFO: renamed from: a */
    private final List<bfa> f8345a;

    /* JADX INFO: renamed from: b */
    private final List<String> f8346b;

    private bkw(List<bfa> list, List<String> list2) {
        if (list.size() != list2.size() - 1) {
            throw new IllegalArgumentException("Number of posts need to be n-1 for n hashes in CompoundHash");
        }
        this.f8345a = list;
        this.f8346b = list2;
    }

    /* JADX INFO: renamed from: a */
    public static bkw m9577a(bln blnVar) {
        bkz bkzVar = new bkz(blnVar);
        if (blnVar.mo9568b()) {
            return new bkw(Collections.emptyList(), Collections.singletonList(""));
        }
        bky bkyVar = new bky(bkzVar);
        m9579b(blnVar, bkyVar);
        bkyVar.m9595f();
        return new bkw(bkyVar.f8353f, bkyVar.f8354g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static void m9579b(bln blnVar, bky bkyVar) {
        if (blnVar.mo9572e()) {
            bkyVar.m9587a((blh<?>) blnVar);
        } else {
            if (blnVar.mo9568b()) {
                throw new IllegalArgumentException("Can't calculate hash on empty node!");
            }
            if (blnVar instanceof bkr) {
                ((bkr) blnVar).m9564a((bku) new bkx(bkyVar), true);
            } else {
                String strValueOf = String.valueOf(blnVar);
                throw new IllegalStateException(new StringBuilder(String.valueOf(strValueOf).length() + 33).append("Expected children node, but got: ").append(strValueOf).toString());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final List<bfa> m9580a() {
        return Collections.unmodifiableList(this.f8345a);
    }

    /* JADX INFO: renamed from: b */
    public final List<String> m9581b() {
        return Collections.unmodifiableList(this.f8346b);
    }
}
