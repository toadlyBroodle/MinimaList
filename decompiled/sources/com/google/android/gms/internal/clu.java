package com.google.android.gms.internal;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class clu implements InterfaceC1674js<List<cbp>, cbn> {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ String f10315a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ Integer f10316b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ Integer f10317c;

    /* JADX INFO: renamed from: d */
    private /* synthetic */ int f10318d;

    /* JADX INFO: renamed from: e */
    private /* synthetic */ int f10319e;

    /* JADX INFO: renamed from: f */
    private /* synthetic */ int f10320f;

    /* JADX INFO: renamed from: g */
    private /* synthetic */ int f10321g;

    /* JADX INFO: renamed from: h */
    private /* synthetic */ boolean f10322h;

    clu(clr clrVar, String str, Integer num, Integer num2, int i, int i2, int i3, int i4, boolean z) {
        this.f10315a = str;
        this.f10316b = num;
        this.f10317c = num2;
        this.f10318d = i;
        this.f10319e = i2;
        this.f10320f = i3;
        this.f10321g = i4;
        this.f10322h = z;
    }

    @Override // com.google.android.gms.internal.InterfaceC1674js
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ cbn mo10413a(List<cbp> list) {
        List<cbp> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return null;
        }
        return new cbn(this.f10315a, list2, this.f10316b, this.f10317c, this.f10318d > 0 ? Integer.valueOf(this.f10318d) : null, this.f10319e + this.f10320f, this.f10321g, this.f10322h);
    }
}
