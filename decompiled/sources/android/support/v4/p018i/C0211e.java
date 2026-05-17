package android.support.v4.p018i;

import android.util.Log;
import java.io.Writer;

/* JADX INFO: renamed from: android.support.v4.i.e */
/* JADX INFO: loaded from: classes.dex */
public class C0211e extends Writer {

    /* JADX INFO: renamed from: a */
    private final String f1232a;

    /* JADX INFO: renamed from: b */
    private StringBuilder f1233b = new StringBuilder(128);

    public C0211e(String str) {
        this.f1232a = str;
    }

    /* JADX INFO: renamed from: a */
    private void m1536a() {
        if (this.f1233b.length() > 0) {
            Log.d(this.f1232a, this.f1233b.toString());
            this.f1233b.delete(0, this.f1233b.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m1536a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        m1536a();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                m1536a();
            } else {
                this.f1233b.append(c);
            }
        }
    }
}
