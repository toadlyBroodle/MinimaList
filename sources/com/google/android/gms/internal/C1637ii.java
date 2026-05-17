package com.google.android.gms.internal;

/* JADX INFO: renamed from: com.google.android.gms.internal.ii */
/* JADX INFO: loaded from: classes.dex */
final class C1637ii implements ckd {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ String f10784a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ C1641im f10785b;

    C1637ii(C1633ie c1633ie, String str, C1641im c1641im) {
        this.f10784a = str;
        this.f10785b = c1641im;
    }

    @Override // com.google.android.gms.internal.ckd
    /* JADX INFO: renamed from: a */
    public final void mo11057a(C1471ce c1471ce) {
        String str = this.f10784a;
        String string = c1471ce.toString();
        C1560fm.m11615e(new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(string).length()).append("Failed to load URL: ").append(str).append("\n").append(string).toString());
        this.f10785b.mo11080a((Object) null);
    }
}
