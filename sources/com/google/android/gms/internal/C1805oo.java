package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;

/* JADX INFO: renamed from: com.google.android.gms.internal.oo */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C1805oo extends MutableContextWrapper {

    /* JADX INFO: renamed from: a */
    private Activity f11213a;

    /* JADX INFO: renamed from: b */
    private Context f11214b;

    /* JADX INFO: renamed from: c */
    private Context f11215c;

    public C1805oo(Context context) {
        super(context);
        setBaseContext(context);
    }

    /* JADX INFO: renamed from: a */
    public final Activity m11919a() {
        return this.f11213a;
    }

    /* JADX INFO: renamed from: b */
    public final Context m11920b() {
        return this.f11215c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        return this.f11215c.getSystemService(str);
    }

    @Override // android.content.MutableContextWrapper
    public final void setBaseContext(Context context) {
        this.f11214b = context.getApplicationContext();
        this.f11213a = context instanceof Activity ? (Activity) context : null;
        this.f11215c = context;
        super.setBaseContext(this.f11214b);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        if (this.f11213a != null) {
            this.f11213a.startActivity(intent);
        } else {
            intent.setFlags(268435456);
            this.f11214b.startActivity(intent);
        }
    }
}
