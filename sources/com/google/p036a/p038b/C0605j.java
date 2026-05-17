package com.google.p036a.p038b;

import com.google.p036a.AbstractC0619j;
import com.google.p036a.C0620k;
import com.google.p036a.C0621l;
import com.google.p036a.C0627r;
import com.google.p036a.p038b.p039a.C0596n;
import com.google.p036a.p042d.C0610a;
import com.google.p036a.p042d.C0612c;
import com.google.p036a.p042d.C0613d;
import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;

/* JADX INFO: renamed from: com.google.a.b.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0605j {

    /* JADX INFO: renamed from: com.google.a.b.j$a */
    private static final class a extends Writer {

        /* JADX INFO: renamed from: a */
        private final Appendable f4203a;

        /* JADX INFO: renamed from: b */
        private final C2330a f4204b = new C2330a();

        /* JADX INFO: renamed from: com.google.a.b.j$a$a, reason: collision with other inner class name */
        static class C2330a implements CharSequence {

            /* JADX INFO: renamed from: a */
            char[] f4205a;

            C2330a() {
            }

            @Override // java.lang.CharSequence
            public char charAt(int i) {
                return this.f4205a[i];
            }

            @Override // java.lang.CharSequence
            public int length() {
                return this.f4205a.length;
            }

            @Override // java.lang.CharSequence
            public CharSequence subSequence(int i, int i2) {
                return new String(this.f4205a, i, i2 - i);
            }
        }

        a(Appendable appendable) {
            this.f4203a = appendable;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }

        @Override // java.io.Writer
        public void write(int i) throws IOException {
            this.f4203a.append((char) i);
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i, int i2) throws IOException {
            this.f4204b.f4205a = cArr;
            this.f4203a.append(this.f4204b, i, i + i2);
        }
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC0619j m5190a(C0610a c0610a) {
        boolean z = true;
        try {
            c0610a.mo5061f();
            z = false;
            return C0596n.f4084X.mo5040b(c0610a);
        } catch (C0613d e) {
            throw new C0627r(e);
        } catch (EOFException e2) {
            if (z) {
                return C0621l.f4277a;
            }
            throw new C0627r(e2);
        } catch (IOException e3) {
            throw new C0620k(e3);
        } catch (NumberFormatException e4) {
            throw new C0627r(e4);
        }
    }

    /* JADX INFO: renamed from: a */
    public static Writer m5191a(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new a(appendable);
    }

    /* JADX INFO: renamed from: a */
    public static void m5192a(AbstractC0619j abstractC0619j, C0612c c0612c) {
        C0596n.f4084X.mo5039a(c0612c, abstractC0619j);
    }
}
