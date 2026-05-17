package android.support.v4.p009c.p010a;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.p009c.p010a.C0183c;

/* JADX INFO: renamed from: android.support.v4.c.a.d */
/* JADX INFO: loaded from: classes.dex */
class C0184d extends C0183c {

    /* JADX INFO: renamed from: android.support.v4.c.a.d$a */
    private static class a extends C0183c.a {
        a(C0183c.a aVar, Resources resources) {
            super(aVar, resources);
        }

        @Override // android.support.v4.p009c.p010a.C0183c.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C0184d(this, resources);
        }
    }

    C0184d(Drawable drawable) {
        super(drawable);
    }

    C0184d(C0183c.a aVar, Resources resources) {
        super(aVar, resources);
    }

    @Override // android.support.v4.p009c.p010a.C0183c
    /* JADX INFO: renamed from: b */
    C0183c.a mo1407b() {
        return new a(this.f1126b, null);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f1127c.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        this.f1127c.setAutoMirrored(z);
    }
}
