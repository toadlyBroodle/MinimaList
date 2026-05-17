package android.support.v7.widget;

/* JADX INFO: renamed from: android.support.v7.widget.ay */
/* JADX INFO: loaded from: classes.dex */
class C0487ay {

    /* JADX INFO: renamed from: a */
    private int f3403a = 0;

    /* JADX INFO: renamed from: b */
    private int f3404b = 0;

    /* JADX INFO: renamed from: c */
    private int f3405c = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: d */
    private int f3406d = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: e */
    private int f3407e = 0;

    /* JADX INFO: renamed from: f */
    private int f3408f = 0;

    /* JADX INFO: renamed from: g */
    private boolean f3409g = false;

    /* JADX INFO: renamed from: h */
    private boolean f3410h = false;

    C0487ay() {
    }

    /* JADX INFO: renamed from: a */
    public int m4445a() {
        return this.f3403a;
    }

    /* JADX INFO: renamed from: a */
    public void m4446a(int i, int i2) {
        this.f3405c = i;
        this.f3406d = i2;
        this.f3410h = true;
        if (this.f3409g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f3403a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f3404b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f3403a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f3404b = i2;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m4447a(boolean z) {
        if (z == this.f3409g) {
            return;
        }
        this.f3409g = z;
        if (!this.f3410h) {
            this.f3403a = this.f3407e;
            this.f3404b = this.f3408f;
        } else if (z) {
            this.f3403a = this.f3406d != Integer.MIN_VALUE ? this.f3406d : this.f3407e;
            this.f3404b = this.f3405c != Integer.MIN_VALUE ? this.f3405c : this.f3408f;
        } else {
            this.f3403a = this.f3405c != Integer.MIN_VALUE ? this.f3405c : this.f3407e;
            this.f3404b = this.f3406d != Integer.MIN_VALUE ? this.f3406d : this.f3408f;
        }
    }

    /* JADX INFO: renamed from: b */
    public int m4448b() {
        return this.f3404b;
    }

    /* JADX INFO: renamed from: b */
    public void m4449b(int i, int i2) {
        this.f3410h = false;
        if (i != Integer.MIN_VALUE) {
            this.f3407e = i;
            this.f3403a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f3408f = i2;
            this.f3404b = i2;
        }
    }

    /* JADX INFO: renamed from: c */
    public int m4450c() {
        return this.f3409g ? this.f3404b : this.f3403a;
    }

    /* JADX INFO: renamed from: d */
    public int m4451d() {
        return this.f3409g ? this.f3403a : this.f3404b;
    }
}
