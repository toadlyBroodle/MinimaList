package com.google.p036a;

import com.google.p036a.p038b.C0605j;
import com.google.p036a.p042d.C0612c;
import java.io.IOException;
import java.io.StringWriter;

/* JADX INFO: renamed from: com.google.a.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0619j {
    /* JADX INFO: renamed from: a */
    public Number mo5273a() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* JADX INFO: renamed from: b */
    public String mo5275b() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* JADX INFO: renamed from: c */
    public double mo5276c() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* JADX INFO: renamed from: d */
    public long mo5277d() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* JADX INFO: renamed from: e */
    public int mo5278e() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* JADX INFO: renamed from: f */
    public boolean mo5279f() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* JADX INFO: renamed from: g */
    public boolean m5281g() {
        return this instanceof C0616g;
    }

    /* JADX INFO: renamed from: h */
    public boolean m5282h() {
        return this instanceof C0622m;
    }

    /* JADX INFO: renamed from: i */
    public boolean m5283i() {
        return this instanceof C0624o;
    }

    /* JADX INFO: renamed from: j */
    public boolean m5284j() {
        return this instanceof C0621l;
    }

    /* JADX INFO: renamed from: k */
    public C0622m m5285k() {
        if (m5282h()) {
            return (C0622m) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    /* JADX INFO: renamed from: l */
    public C0616g m5286l() {
        if (m5281g()) {
            return (C0616g) this;
        }
        throw new IllegalStateException("This is not a JSON Array.");
    }

    /* JADX INFO: renamed from: m */
    public C0624o m5287m() {
        if (m5283i()) {
            return (C0624o) this;
        }
        throw new IllegalStateException("This is not a JSON Primitive.");
    }

    /* JADX INFO: renamed from: n */
    Boolean mo5288n() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            C0612c c0612c = new C0612c(stringWriter);
            c0612c.m5237b(true);
            C0605j.m5192a(this, c0612c);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
