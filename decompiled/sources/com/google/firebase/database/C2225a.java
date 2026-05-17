package com.google.firebase.database;

import com.google.android.gms.internal.bfa;
import com.google.android.gms.internal.blf;
import com.google.android.gms.internal.bnh;

/* JADX INFO: renamed from: com.google.firebase.database.a */
/* JADX INFO: loaded from: classes.dex */
public class C2225a {

    /* JADX INFO: renamed from: a */
    private final blf f12910a;

    /* JADX INFO: renamed from: b */
    private final C2266d f12911b;

    C2225a(C2266d c2266d, blf blfVar) {
        this.f12910a = blfVar;
        this.f12911b = c2266d;
    }

    /* JADX INFO: renamed from: a */
    public C2225a m12957a(String str) {
        return new C2225a(this.f12911b.m12996a(str), blf.m9611a(this.f12910a.m9616a().mo9560a(new bfa(str))));
    }

    /* JADX INFO: renamed from: a */
    public C2266d m12958a() {
        return this.f12911b;
    }

    /* JADX INFO: renamed from: a */
    public <T> T m12959a(C2269g<T> c2269g) {
        return (T) bnh.m9708a(this.f12910a.m9616a().mo9545a(), c2269g);
    }

    /* JADX INFO: renamed from: a */
    public <T> T m12960a(Class<T> cls) {
        return (T) bnh.m9709a(this.f12910a.m9616a().mo9545a(), (Class) cls);
    }

    /* JADX INFO: renamed from: a */
    public Object m12961a(boolean z) {
        return this.f12910a.m9616a().mo9563a(z);
    }

    /* JADX INFO: renamed from: b */
    public String m12962b() {
        return this.f12911b.m12999d();
    }

    public String toString() {
        String strM12999d = this.f12911b.m12999d();
        String strValueOf = String.valueOf(this.f12910a.m9616a().mo9563a(true));
        return new StringBuilder(String.valueOf(strM12999d).length() + 33 + String.valueOf(strValueOf).length()).append("DataSnapshot { key = ").append(strM12999d).append(", value = ").append(strValueOf).append(" }").toString();
    }
}
