package android.support.v4.p017h;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import android.support.v4.p007b.p008a.C0172a;
import android.support.v4.p007b.p008a.C0173b;
import android.support.v4.p009c.C0188c;
import android.support.v4.p009c.C0193h;
import android.support.v4.p017h.C0206c;
import android.support.v4.p018i.C0213g;
import android.support.v4.p018i.C0218l;
import android.support.v4.p018i.C0219m;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: android.support.v4.h.b */
/* JADX INFO: loaded from: classes.dex */
public class C0205b {

    /* JADX INFO: renamed from: a */
    private static final C0213g<String, Typeface> f1173a = new C0213g<>(16);

    /* JADX INFO: renamed from: b */
    private static final C0206c f1174b = new C0206c("fonts", 10, 10000);

    /* JADX INFO: renamed from: c */
    private static final Object f1175c = new Object();

    /* JADX INFO: renamed from: d */
    private static final C0219m<String, ArrayList<C0206c.a<c>>> f1176d = new C0219m<>();

    /* JADX INFO: renamed from: e */
    private static final Comparator<byte[]> f1177e = new Comparator<byte[]>() { // from class: android.support.v4.h.b.4
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(byte[] bArr, byte[] bArr2) {
            if (bArr.length != bArr2.length) {
                return bArr.length - bArr2.length;
            }
            for (int i = 0; i < bArr.length; i++) {
                if (bArr[i] != bArr2[i]) {
                    return bArr[i] - bArr2[i];
                }
            }
            return 0;
        }
    };

    /* JADX INFO: renamed from: android.support.v4.h.b$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private final int f1185a;

        /* JADX INFO: renamed from: b */
        private final b[] f1186b;

        public a(int i, b[] bVarArr) {
            this.f1185a = i;
            this.f1186b = bVarArr;
        }

        /* JADX INFO: renamed from: a */
        public int m1495a() {
            return this.f1185a;
        }

        /* JADX INFO: renamed from: b */
        public b[] m1496b() {
            return this.f1186b;
        }
    }

    /* JADX INFO: renamed from: android.support.v4.h.b$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        private final Uri f1187a;

        /* JADX INFO: renamed from: b */
        private final int f1188b;

        /* JADX INFO: renamed from: c */
        private final int f1189c;

        /* JADX INFO: renamed from: d */
        private final boolean f1190d;

        /* JADX INFO: renamed from: e */
        private final int f1191e;

        public b(Uri uri, int i, int i2, boolean z, int i3) {
            this.f1187a = (Uri) C0218l.m1572a(uri);
            this.f1188b = i;
            this.f1189c = i2;
            this.f1190d = z;
            this.f1191e = i3;
        }

        /* JADX INFO: renamed from: a */
        public Uri m1497a() {
            return this.f1187a;
        }

        /* JADX INFO: renamed from: b */
        public int m1498b() {
            return this.f1188b;
        }

        /* JADX INFO: renamed from: c */
        public int m1499c() {
            return this.f1189c;
        }

        /* JADX INFO: renamed from: d */
        public boolean m1500d() {
            return this.f1190d;
        }

        /* JADX INFO: renamed from: e */
        public int m1501e() {
            return this.f1191e;
        }
    }

    /* JADX INFO: renamed from: android.support.v4.h.b$c */
    private static final class c {

        /* JADX INFO: renamed from: a */
        final Typeface f1192a;

        /* JADX INFO: renamed from: b */
        final int f1193b;

        c(Typeface typeface, int i) {
            this.f1192a = typeface;
            this.f1193b = i;
        }
    }

    /* JADX INFO: renamed from: a */
    public static ProviderInfo m1479a(PackageManager packageManager, C0204a c0204a, Resources resources) throws PackageManager.NameNotFoundException {
        int i = 0;
        String strM1473a = c0204a.m1473a();
        ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(strM1473a, 0);
        if (providerInfoResolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + strM1473a);
        }
        if (!providerInfoResolveContentProvider.packageName.equals(c0204a.m1474b())) {
            throw new PackageManager.NameNotFoundException("Found content provider " + strM1473a + ", but package was not " + c0204a.m1474b());
        }
        List<byte[]> listM1485a = m1485a(packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures);
        Collections.sort(listM1485a, f1177e);
        List<List<byte[]>> listM1484a = m1484a(c0204a, resources);
        while (true) {
            int i2 = i;
            if (i2 >= listM1484a.size()) {
                return null;
            }
            ArrayList arrayList = new ArrayList(listM1484a.get(i2));
            Collections.sort(arrayList, f1177e);
            if (m1487a(listM1485a, arrayList)) {
                return providerInfoResolveContentProvider;
            }
            i = i2 + 1;
        }
    }

    /* JADX INFO: renamed from: a */
    public static Typeface m1480a(final Context context, final C0204a c0204a, final C0173b.a aVar, final Handler handler, boolean z, int i, final int i2) {
        final String str = c0204a.m1478f() + "-" + i2;
        Typeface typefaceM1550a = f1173a.m1550a(str);
        if (typefaceM1550a != null) {
            if (aVar != null) {
                aVar.mo1326a(typefaceM1550a);
            }
            return typefaceM1550a;
        }
        if (z && i == -1) {
            c cVarM1489b = m1489b(context, c0204a, i2);
            if (aVar != null) {
                if (cVarM1489b.f1193b == 0) {
                    aVar.m1327a(cVarM1489b.f1192a, handler);
                } else {
                    aVar.m1325a(cVarM1489b.f1193b, handler);
                }
            }
            return cVarM1489b.f1192a;
        }
        Callable<c> callable = new Callable<c>() { // from class: android.support.v4.h.b.1
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public c call() {
                c cVarM1489b2 = C0205b.m1489b(context, c0204a, i2);
                if (cVarM1489b2.f1192a != null) {
                    C0205b.f1173a.m1551a(str, cVarM1489b2.f1192a);
                }
                return cVarM1489b2;
            }
        };
        if (z) {
            try {
                return ((c) f1174b.m1507a(callable, i)).f1192a;
            } catch (InterruptedException e) {
                return null;
            }
        }
        C0206c.a<c> aVar2 = aVar == null ? null : new C0206c.a<c>() { // from class: android.support.v4.h.b.2
            @Override // android.support.v4.p017h.C0206c.a
            /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public void mo1493a(c cVar) {
                if (cVar.f1193b == 0) {
                    aVar.m1327a(cVar.f1192a, handler);
                } else {
                    aVar.m1325a(cVar.f1193b, handler);
                }
            }
        };
        synchronized (f1175c) {
            if (f1176d.containsKey(str)) {
                if (aVar2 != null) {
                    f1176d.get(str).add(aVar2);
                }
                return null;
            }
            if (aVar2 != null) {
                ArrayList<C0206c.a<c>> arrayList = new ArrayList<>();
                arrayList.add(aVar2);
                f1176d.put(str, arrayList);
            }
            f1174b.m1508a(callable, new C0206c.a<c>() { // from class: android.support.v4.h.b.3
                @Override // android.support.v4.p017h.C0206c.a
                /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                public void mo1493a(c cVar) {
                    synchronized (C0205b.f1175c) {
                        ArrayList arrayList2 = (ArrayList) C0205b.f1176d.get(str);
                        if (arrayList2 == null) {
                            return;
                        }
                        C0205b.f1176d.remove(str);
                        int i3 = 0;
                        while (true) {
                            int i4 = i3;
                            if (i4 >= arrayList2.size()) {
                                return;
                            }
                            ((C0206c.a) arrayList2.get(i4)).mo1493a(cVar);
                            i3 = i4 + 1;
                        }
                    }
                }
            });
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static a m1481a(Context context, CancellationSignal cancellationSignal, C0204a c0204a) throws PackageManager.NameNotFoundException {
        ProviderInfo providerInfoM1479a = m1479a(context.getPackageManager(), c0204a, context.getResources());
        return providerInfoM1479a == null ? new a(1, null) : new a(0, m1488a(context, c0204a, providerInfoM1479a.authority, cancellationSignal));
    }

    /* JADX INFO: renamed from: a */
    private static List<List<byte[]>> m1484a(C0204a c0204a, Resources resources) {
        return c0204a.m1476d() != null ? c0204a.m1476d() : C0172a.m1306a(resources, c0204a.m1477e());
    }

    /* JADX INFO: renamed from: a */
    private static List<byte[]> m1485a(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public static Map<Uri, ByteBuffer> m1486a(Context context, b[] bVarArr, CancellationSignal cancellationSignal) {
        HashMap map = new HashMap();
        for (b bVar : bVarArr) {
            if (bVar.m1501e() == 0) {
                Uri uriM1497a = bVar.m1497a();
                if (!map.containsKey(uriM1497a)) {
                    map.put(uriM1497a, C0193h.m1454a(context, cancellationSignal, uriM1497a));
                }
            }
        }
        return Collections.unmodifiableMap(map);
    }

    /* JADX INFO: renamed from: a */
    private static boolean m1487a(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0143  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static b[] m1488a(Context context, C0204a c0204a, String str, CancellationSignal cancellationSignal) throws Throwable {
        Cursor cursor;
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList();
        Uri uriBuild = new Uri.Builder().scheme("content").authority(str).build();
        Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
        try {
            Cursor cursorQuery = Build.VERSION.SDK_INT > 16 ? context.getContentResolver().query(uriBuild, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{c0204a.m1475c()}, null, cancellationSignal) : context.getContentResolver().query(uriBuild, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{c0204a.m1475c()}, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.getCount() > 0) {
                        int columnIndex = cursorQuery.getColumnIndex("result_code");
                        arrayList = new ArrayList();
                        int columnIndex2 = cursorQuery.getColumnIndex("_id");
                        int columnIndex3 = cursorQuery.getColumnIndex("file_id");
                        int columnIndex4 = cursorQuery.getColumnIndex("font_ttc_index");
                        int columnIndex5 = cursorQuery.getColumnIndex("font_weight");
                        int columnIndex6 = cursorQuery.getColumnIndex("font_italic");
                        while (cursorQuery.moveToNext()) {
                            arrayList.add(new b(columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorQuery.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorQuery.getLong(columnIndex3)), columnIndex4 != -1 ? cursorQuery.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursorQuery.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursorQuery.getInt(columnIndex6) == 1, columnIndex != -1 ? cursorQuery.getInt(columnIndex) : 0));
                        }
                    } else {
                        arrayList = arrayList2;
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return (b[]) arrayList.toArray(new b[0]);
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static c m1489b(Context context, C0204a c0204a, int i) {
        try {
            a aVarM1481a = m1481a(context, (CancellationSignal) null, c0204a);
            if (aVarM1481a.m1495a() != 0) {
                return new c(null, aVarM1481a.m1495a() == 1 ? -2 : -3);
            }
            Typeface typefaceM1427a = C0188c.m1427a(context, null, aVarM1481a.m1496b(), i);
            return new c(typefaceM1427a, typefaceM1427a != null ? 0 : -3);
        } catch (PackageManager.NameNotFoundException e) {
            return new c(null, -1);
        }
    }
}
