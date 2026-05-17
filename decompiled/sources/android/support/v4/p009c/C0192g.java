package android.support.v4.p009c;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.support.v4.p007b.p008a.C0172a;
import android.support.v4.p009c.C0188c;
import android.support.v4.p017h.C0205b;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: android.support.v4.c.g */
/* JADX INFO: loaded from: classes.dex */
class C0192g implements C0188c.a {

    /* JADX INFO: renamed from: android.support.v4.c.g$a */
    private interface a<T> {
        /* JADX INFO: renamed from: a */
        boolean mo1450a(T t);

        /* JADX INFO: renamed from: b */
        int mo1451b(T t);
    }

    C0192g() {
    }

    /* JADX INFO: renamed from: a */
    private C0172a.c m1446a(C0172a.b bVar, int i) {
        return (C0172a.c) m1447a(bVar.m1312a(), i, new a<C0172a.c>() { // from class: android.support.v4.c.g.2
            @Override // android.support.v4.p009c.C0192g.a
            /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public int mo1451b(C0172a.c cVar) {
                return cVar.m1314b();
            }

            @Override // android.support.v4.p009c.C0192g.a
            /* JADX INFO: renamed from: b, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public boolean mo1450a(C0172a.c cVar) {
                return cVar.m1315c();
            }
        });
    }

    /* JADX INFO: renamed from: a */
    private static <T> T m1447a(T[] tArr, int i, a<T> aVar) {
        T t;
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        T t2 = null;
        int i3 = Integer.MAX_VALUE;
        int length = tArr.length;
        int i4 = 0;
        while (i4 < length) {
            T t3 = tArr[i4];
            int iAbs = (aVar.mo1450a(t3) == z ? 0 : 1) + (Math.abs(aVar.mo1451b(t3) - i2) * 2);
            if (t2 == null || i3 > iAbs) {
                i3 = iAbs;
                t = t3;
            } else {
                t = t2;
            }
            i4++;
            t2 = t;
        }
        return t2;
    }

    @Override // android.support.v4.p009c.C0188c.a
    /* JADX INFO: renamed from: a */
    public Typeface mo1431a(Context context, Resources resources, int i, String str, int i2) {
        Typeface typefaceCreateFromFile = null;
        File fileM1452a = C0193h.m1452a(context);
        if (fileM1452a != null) {
            try {
                if (C0193h.m1457a(fileM1452a, resources, i)) {
                    typefaceCreateFromFile = Typeface.createFromFile(fileM1452a.getPath());
                }
            } catch (RuntimeException e) {
            } finally {
                fileM1452a.delete();
            }
        }
        return typefaceCreateFromFile;
    }

    @Override // android.support.v4.p009c.C0188c.a
    /* JADX INFO: renamed from: a */
    public Typeface mo1432a(Context context, CancellationSignal cancellationSignal, C0205b.b[] bVarArr, int i) throws Throwable {
        InputStream inputStreamOpenInputStream;
        Throwable th;
        Typeface typefaceM1448a = null;
        if (bVarArr.length >= 1) {
            try {
                inputStreamOpenInputStream = context.getContentResolver().openInputStream(m1449a(bVarArr, i).m1497a());
            } catch (IOException e) {
                inputStreamOpenInputStream = null;
            } catch (Throwable th2) {
                inputStreamOpenInputStream = null;
                th = th2;
            }
            try {
                typefaceM1448a = m1448a(context, inputStreamOpenInputStream);
                C0193h.m1456a(inputStreamOpenInputStream);
            } catch (IOException e2) {
                C0193h.m1456a(inputStreamOpenInputStream);
            } catch (Throwable th3) {
                th = th3;
                C0193h.m1456a(inputStreamOpenInputStream);
                throw th;
            }
        }
        return typefaceM1448a;
    }

    @Override // android.support.v4.p009c.C0188c.a
    /* JADX INFO: renamed from: a */
    public Typeface mo1433a(Context context, C0172a.b bVar, Resources resources, int i) {
        C0172a.c cVarM1446a = m1446a(bVar, i);
        if (cVarM1446a == null) {
            return null;
        }
        return C0188c.m1426a(context, resources, cVarM1446a.m1316d(), cVarM1446a.m1313a(), i);
    }

    /* JADX INFO: renamed from: a */
    protected Typeface m1448a(Context context, InputStream inputStream) {
        Typeface typefaceCreateFromFile = null;
        File fileM1452a = C0193h.m1452a(context);
        if (fileM1452a != null) {
            try {
                if (C0193h.m1458a(fileM1452a, inputStream)) {
                    typefaceCreateFromFile = Typeface.createFromFile(fileM1452a.getPath());
                }
            } catch (RuntimeException e) {
            } finally {
                fileM1452a.delete();
            }
        }
        return typefaceCreateFromFile;
    }

    /* JADX INFO: renamed from: a */
    protected C0205b.b m1449a(C0205b.b[] bVarArr, int i) {
        return (C0205b.b) m1447a(bVarArr, i, new a<C0205b.b>() { // from class: android.support.v4.c.g.1
            @Override // android.support.v4.p009c.C0192g.a
            /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public int mo1451b(C0205b.b bVar) {
                return bVar.m1499c();
            }

            @Override // android.support.v4.p009c.C0192g.a
            /* JADX INFO: renamed from: b, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public boolean mo1450a(C0205b.b bVar) {
                return bVar.m1500d();
            }
        });
    }
}
