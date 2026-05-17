package com.google.android.gms.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import com.google.firebase.database.C2227c;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class bbq implements bif {

    /* JADX INFO: renamed from: a */
    private static final Charset f7743a = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: b */
    private final SQLiteDatabase f7744b;

    /* JADX INFO: renamed from: c */
    private final bkl f7745c;

    /* JADX INFO: renamed from: d */
    private boolean f7746d;

    /* JADX INFO: renamed from: e */
    private long f7747e = 0;

    public bbq(Context context, bet betVar, String str) {
        try {
            String strEncode = URLEncoder.encode(str, "utf-8");
            this.f7745c = betVar.m9117a("Persistence");
            this.f7744b = m8819a(context, strEncode);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: a */
    private static int m8816a(bfa bfaVar, List<String> list, int i) {
        int i2 = i + 1;
        String strM8832c = m8832c(bfaVar);
        if (!list.get(i).startsWith(strM8832c)) {
            throw new IllegalStateException("Extracting split nodes needs to start with path prefix");
        }
        while (i2 < list.size() && list.get(i2).equals(m8821a(bfaVar, i2 - i))) {
            i2++;
        }
        if (i2 < list.size()) {
            String str = list.get(i2);
            String strValueOf = String.valueOf(strM8832c);
            String strValueOf2 = String.valueOf(".part-");
            if (str.startsWith(strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf))) {
                throw new IllegalStateException("Run did not finish with all parts");
            }
        }
        return i2 - i;
    }

    /* JADX INFO: renamed from: a */
    private final int m8817a(String str, bfa bfaVar) {
        String strM8832c = m8832c(bfaVar);
        return this.f7744b.delete(str, "path >= ? AND path < ?", new String[]{strM8832c, m8822a(strM8832c)});
    }

    /* JADX INFO: renamed from: a */
    private final Cursor m8818a(bfa bfaVar, String[] strArr) {
        String strM8832c = m8832c(bfaVar);
        String strM8822a = m8822a(strM8832c);
        String[] strArr2 = new String[bfaVar.m9163i() + 3];
        int i = 0;
        StringBuilder sb = new StringBuilder("(");
        bfa bfaVarM9160f = bfaVar;
        while (!bfaVarM9160f.m9162h()) {
            sb.append("path");
            sb.append(" = ? OR ");
            strArr2[i] = m8832c(bfaVarM9160f);
            bfaVarM9160f = bfaVarM9160f.m9160f();
            i++;
        }
        sb.append("path");
        sb.append(" = ?)");
        strArr2[i] = m8832c(bfa.m9147a());
        String strValueOf = String.valueOf(sb.toString());
        String strValueOf2 = String.valueOf(" OR (path > ? AND path < ?)");
        String strConcat = strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
        strArr2[bfaVar.m9163i() + 1] = strM8832c;
        strArr2[bfaVar.m9163i() + 2] = strM8822a;
        return this.f7744b.query("serverCache", strArr, strConcat, strArr2, null, null, "path");
    }

    /* JADX INFO: renamed from: a */
    private static SQLiteDatabase m8819a(Context context, String str) {
        try {
            SQLiteDatabase writableDatabase = new bbt(context, str).getWritableDatabase();
            writableDatabase.rawQuery("PRAGMA locking_mode = EXCLUSIVE", null).close();
            writableDatabase.beginTransaction();
            writableDatabase.endTransaction();
            return writableDatabase;
        } catch (SQLiteException e) {
            if (e instanceof SQLiteDatabaseLockedException) {
                throw new C2227c("Failed to gain exclusive lock to Firebase Database's offline persistence. This generally means you are using Firebase Database from multiple processes in your app. Keep in mind that multi-process Android apps execute the code in your Application class in all processes, so you may need to avoid initializing FirebaseDatabase in your Application class. If you are intentionally using Firebase Database from multiple processes, you can only enable offline persistence (i.e. call setPersistenceEnabled(true)) in one of them.", e);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: a */
    private static bln m8820a(byte[] bArr) {
        try {
            return blq.m9628a(bms.m9680b(new String(bArr, f7743a)), bld.m9605j());
        } catch (IOException e) {
            String strValueOf = String.valueOf(new String(bArr, f7743a));
            throw new RuntimeException(strValueOf.length() != 0 ? "Could not deserialize node: ".concat(strValueOf) : new String("Could not deserialize node: "), e);
        }
    }

    /* JADX INFO: renamed from: a */
    private static String m8821a(bfa bfaVar, int i) {
        String strValueOf = String.valueOf(m8832c(bfaVar));
        String strValueOf2 = String.valueOf(String.format(".part-%04d", Integer.valueOf(i)));
        return strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
    }

    /* JADX INFO: renamed from: a */
    private static String m8822a(String str) {
        String strSubstring = str.substring(0, str.length() - 1);
        return new StringBuilder(String.valueOf(strSubstring).length() + 1).append(strSubstring).append('0').toString();
    }

    /* JADX INFO: renamed from: a */
    private static String m8823a(Collection<Long> collection) {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        Iterator<Long> it = collection.iterator();
        while (true) {
            boolean z2 = z;
            if (!it.hasNext()) {
                return sb.toString();
            }
            long jLongValue = it.next().longValue();
            if (!z2) {
                sb.append(",");
            }
            z = false;
            sb.append(jLongValue);
        }
    }

    /* JADX INFO: renamed from: a */
    private static List<byte[]> m8824a(byte[] bArr, int i) {
        int length = ((bArr.length - 1) / 262144) + 1;
        ArrayList arrayList = new ArrayList(length);
        for (int i2 = 0; i2 < length; i2++) {
            int iMin = Math.min(262144, bArr.length - (i2 * 262144));
            byte[] bArr2 = new byte[iMin];
            System.arraycopy(bArr, i2 * 262144, bArr2, 0, iMin);
            arrayList.add(bArr2);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    private final void m8825a(bfa bfaVar, long j, String str, byte[] bArr) {
        int i = 0;
        m8834g();
        this.f7744b.delete("writes", "id = ?", new String[]{String.valueOf(j)});
        if (bArr.length < 262144) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", Long.valueOf(j));
            contentValues.put("path", m8832c(bfaVar));
            contentValues.put("type", str);
            contentValues.put("part", (Integer) null);
            contentValues.put("node", bArr);
            this.f7744b.insertWithOnConflict("writes", null, contentValues, 5);
            return;
        }
        List<byte[]> listM8824a = m8824a(bArr, 262144);
        while (true) {
            int i2 = i;
            if (i2 >= listM8824a.size()) {
                return;
            }
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("id", Long.valueOf(j));
            contentValues2.put("path", m8832c(bfaVar));
            contentValues2.put("type", str);
            contentValues2.put("part", Integer.valueOf(i2));
            contentValues2.put("node", listM8824a.get(i2));
            this.f7744b.insertWithOnConflict("writes", null, contentValues2, 5);
            i = i2 + 1;
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m8826a(bfa bfaVar, bfa bfaVar2, bit<Long> bitVar, bit<Long> bitVar2, bih bihVar, List<bnb<bfa, bln>> list) {
        if (bitVar.m9415b() == null) {
            for (Map.Entry<bkp, bit<Long>> entry : bitVar.m9418c()) {
                bkp key = entry.getKey();
                m8826a(bfaVar, bfaVar2.m9153a(key), entry.getValue(), bitVar2.m9411a(key), bihVar.m9377a(entry.getKey()), list);
            }
            return;
        }
        int iIntValue = ((Integer) bihVar.m9378a(0, new bbr(this, bitVar2))).intValue();
        if (iIntValue > 0) {
            bfa bfaVarM9152a = bfaVar.m9152a(bfaVar2);
            if (this.f7745c.m9541a()) {
                this.f7745c.m9540a(String.format("Need to rewrite %d nodes below path %s", Integer.valueOf(iIntValue), bfaVarM9152a), null, new Object[0]);
            }
            bihVar.m9378a(null, new bbs(this, bitVar2, list, bfaVar2, m8830b(bfaVarM9152a)));
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m8827a(bfa bfaVar, bln blnVar, boolean z) {
        int iM8831c;
        int iM8817a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (z) {
            iM8831c = 0;
            iM8817a = 0;
            for (blm blmVar : blnVar) {
                iM8817a += m8817a("serverCache", bfaVar.m9153a(blmVar.m9626c()));
                iM8831c = m8831c(bfaVar.m9153a(blmVar.m9626c()), blmVar.m9627d()) + iM8831c;
            }
        } else {
            iM8817a = m8817a("serverCache", bfaVar);
            iM8831c = m8831c(bfaVar, blnVar);
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        if (this.f7745c.m9541a()) {
            this.f7745c.m9540a(String.format("Persisted a total of %d rows and deleted %d rows for a set at %s in %dms", Integer.valueOf(iM8831c), Integer.valueOf(iM8817a), bfaVar.toString(), Long.valueOf(jCurrentTimeMillis2)), null, new Object[0]);
        }
    }

    /* JADX INFO: renamed from: a */
    private static byte[] m8828a(Object obj) {
        try {
            return bms.m9675a(obj).getBytes(f7743a);
        } catch (IOException e) {
            throw new RuntimeException("Could not serialize leaf node", e);
        }
    }

    /* JADX INFO: renamed from: a */
    private static byte[] m8829a(List<byte[]> list) {
        Iterator<byte[]> it = list.iterator();
        int length = 0;
        while (it.hasNext()) {
            length = it.next().length + length;
        }
        byte[] bArr = new byte[length];
        int length2 = 0;
        for (byte[] bArr2 : list) {
            System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
            length2 = bArr2.length + length2;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: b */
    private final bln m8830b(bfa bfaVar) {
        bln blnVarM8820a;
        int i;
        bfa bfaVar2;
        boolean z;
        bln blnVarMo9561a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Cursor cursorM8818a = m8818a(bfaVar, new String[]{"path", "value"});
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        long jCurrentTimeMillis3 = System.currentTimeMillis();
        while (cursorM8818a.moveToNext()) {
            try {
                arrayList.add(cursorM8818a.getString(0));
                arrayList2.add(cursorM8818a.getBlob(1));
            } catch (Throwable th) {
                cursorM8818a.close();
                throw th;
            }
        }
        cursorM8818a.close();
        long jCurrentTimeMillis4 = System.currentTimeMillis() - jCurrentTimeMillis3;
        long jCurrentTimeMillis5 = System.currentTimeMillis();
        bln blnVarM9605j = bld.m9605j();
        boolean z2 = false;
        HashMap map = new HashMap();
        int i2 = 0;
        while (i2 < arrayList2.size()) {
            if (((String) arrayList.get(i2)).endsWith(".part-0000")) {
                bfa bfaVar3 = new bfa(((String) arrayList.get(i2)).substring(0, r4.length() - 10));
                int iM8816a = m8816a(bfaVar3, arrayList, i2);
                if (this.f7745c.m9541a()) {
                    this.f7745c.m9540a(new StringBuilder(42).append("Loading split node with ").append(iM8816a).append(" parts.").toString(), null, new Object[0]);
                }
                bln blnVarM8820a2 = m8820a(m8829a((List<byte[]>) arrayList2.subList(i2, i2 + iM8816a)));
                i = (i2 + iM8816a) - 1;
                bfaVar2 = bfaVar3;
                blnVarM8820a = blnVarM8820a2;
            } else {
                blnVarM8820a = m8820a((byte[]) arrayList2.get(i2));
                i = i2;
                bfaVar2 = new bfa((String) arrayList.get(i2));
            }
            if (bfaVar2.m9161g() != null && bfaVar2.m9161g().m9555e()) {
                map.put(bfaVar2, blnVarM8820a);
                z = z2;
                blnVarMo9561a = blnVarM9605j;
            } else if (bfaVar2.m9155b(bfaVar)) {
                bne.m9697a(!z2, "Descendants of path must come after ancestors.");
                boolean z3 = z2;
                blnVarMo9561a = blnVarM8820a.mo9560a(bfa.m9148a(bfaVar2, bfaVar));
                z = z3;
            } else {
                if (!bfaVar.m9155b(bfaVar2)) {
                    throw new IllegalStateException(String.format("Loading an unrelated row with path %s for %s", bfaVar2, bfaVar));
                }
                z = true;
                blnVarMo9561a = blnVarM9605j.mo9561a(bfa.m9148a(bfaVar, bfaVar2), blnVarM8820a);
            }
            i2 = i + 1;
            blnVarM9605j = blnVarMo9561a;
            z2 = z;
        }
        for (Map.Entry entry : map.entrySet()) {
            blnVarM9605j = blnVarM9605j.mo9561a(bfa.m9148a(bfaVar, (bfa) entry.getKey()), (bln) entry.getValue());
        }
        long jCurrentTimeMillis6 = System.currentTimeMillis() - jCurrentTimeMillis5;
        long jCurrentTimeMillis7 = System.currentTimeMillis() - jCurrentTimeMillis;
        if (this.f7745c.m9541a()) {
            this.f7745c.m9540a(String.format("Loaded a total of %d rows for a total of %d nodes at %s in %dms (Query: %dms, Loading: %dms, Serializing: %dms)", Integer.valueOf(arrayList2.size()), Integer.valueOf(bmz.m9685b(blnVarM9605j)), bfaVar, Long.valueOf(jCurrentTimeMillis7), Long.valueOf(jCurrentTimeMillis2), Long.valueOf(jCurrentTimeMillis4), Long.valueOf(jCurrentTimeMillis6)), null, new Object[0]);
        }
        return blnVarM9605j;
    }

    /* JADX INFO: renamed from: c */
    private final int m8831c(bfa bfaVar, bln blnVar) {
        int i;
        int iM8831c = 0;
        long jM9684a = bmz.m9684a(blnVar);
        if (!(blnVar instanceof bkr) || jM9684a <= 16384) {
            m8833d(bfaVar, blnVar);
            return 1;
        }
        if (this.f7745c.m9541a()) {
            this.f7745c.m9540a(String.format("Node estimated serialized size at path %s of %d bytes exceeds limit of %d bytes. Splitting up.", bfaVar, Long.valueOf(jM9684a), 16384), null, new Object[0]);
        }
        Iterator<blm> it = blnVar.iterator();
        while (true) {
            i = iM8831c;
            if (!it.hasNext()) {
                break;
            }
            blm next = it.next();
            iM8831c = m8831c(bfaVar.m9153a(next.m9626c()), next.m9627d()) + i;
        }
        if (!blnVar.mo9573f().mo9568b()) {
            m8833d(bfaVar.m9153a(bkp.m9552c()), blnVar.mo9573f());
            i++;
        }
        m8833d(bfaVar, bld.m9605j());
        return i + 1;
    }

    /* JADX INFO: renamed from: c */
    private static String m8832c(bfa bfaVar) {
        return bfaVar.m9162h() ? "/" : String.valueOf(bfaVar.toString()).concat("/");
    }

    /* JADX INFO: renamed from: d */
    private final void m8833d(bfa bfaVar, bln blnVar) {
        int i = 0;
        byte[] bArrM8828a = m8828a(blnVar.mo9563a(true));
        if (bArrM8828a.length < 262144) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("path", m8832c(bfaVar));
            contentValues.put("value", bArrM8828a);
            this.f7744b.insertWithOnConflict("serverCache", null, contentValues, 5);
            return;
        }
        List<byte[]> listM8824a = m8824a(bArrM8828a, 262144);
        if (this.f7745c.m9541a()) {
            this.f7745c.m9540a(new StringBuilder(45).append("Saving huge leaf node with ").append(listM8824a.size()).append(" parts.").toString(), null, new Object[0]);
        }
        while (true) {
            int i2 = i;
            if (i2 >= listM8824a.size()) {
                return;
            }
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("path", m8821a(bfaVar, i2));
            contentValues2.put("value", listM8824a.get(i2));
            this.f7744b.insertWithOnConflict("serverCache", null, contentValues2, 5);
            i = i2 + 1;
        }
    }

    /* JADX INFO: renamed from: g */
    private final void m8834g() {
        bne.m9697a(this.f7746d, "Transaction expected to already be in progress.");
    }

    @Override // com.google.android.gms.internal.bif
    /* JADX INFO: renamed from: a */
    public final bln mo8835a(bfa bfaVar) {
        return m8830b(bfaVar);
    }

    @Override // com.google.android.gms.internal.bif
    /* JADX INFO: renamed from: a */
    public final List<bhj> mo8836a() {
        byte[] bArrM8829a;
        bhj bhjVar;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Cursor cursorQuery = this.f7744b.query("writes", new String[]{"id", "path", "type", "part", "node"}, null, null, null, null, "id, part");
        ArrayList arrayList = new ArrayList();
        while (cursorQuery.moveToNext()) {
            try {
                try {
                    long j = cursorQuery.getLong(0);
                    bfa bfaVar = new bfa(cursorQuery.getString(1));
                    String string = cursorQuery.getString(2);
                    if (cursorQuery.isNull(3)) {
                        bArrM8829a = cursorQuery.getBlob(4);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        do {
                            arrayList2.add(cursorQuery.getBlob(4));
                            if (!cursorQuery.moveToNext()) {
                                break;
                            }
                        } while (cursorQuery.getLong(0) == j);
                        cursorQuery.moveToPrevious();
                        bArrM8829a = m8829a((List<byte[]>) arrayList2);
                    }
                    Object objM9680b = bms.m9680b(new String(bArrM8829a, f7743a));
                    if ("o".equals(string)) {
                        bhjVar = new bhj(j, bfaVar, blq.m9628a(objM9680b, bld.m9605j()), true);
                    } else {
                        if (!"m".equals(string)) {
                            String strValueOf = String.valueOf(string);
                            throw new IllegalStateException(strValueOf.length() != 0 ? "Got invalid write type: ".concat(strValueOf) : new String("Got invalid write type: "));
                        }
                        bhjVar = new bhj(j, bfaVar, beo.m9095a((Map<String, Object>) objM9680b));
                    }
                    arrayList.add(bhjVar);
                } catch (IOException e) {
                    throw new RuntimeException("Failed to load writes", e);
                }
            } finally {
                cursorQuery.close();
            }
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        if (this.f7745c.m9541a()) {
            this.f7745c.m9540a(String.format("Loaded %d writes in %dms", Integer.valueOf(arrayList.size()), Long.valueOf(jCurrentTimeMillis2)), null, new Object[0]);
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.bif
    /* JADX INFO: renamed from: a */
    public final Set<bkp> mo8837a(Set<Long> set) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strM8823a = m8823a((Collection<Long>) set);
        Cursor cursorQuery = this.f7744b.query(true, "trackedKeys", new String[]{"key"}, new StringBuilder(String.valueOf("id IN (").length() + 1 + String.valueOf(strM8823a).length()).append("id IN (").append(strM8823a).append(")").toString(), null, null, null, null, null);
        HashSet hashSet = new HashSet();
        while (cursorQuery.moveToNext()) {
            try {
                hashSet.add(bkp.m9549a(cursorQuery.getString(0)));
            } finally {
                cursorQuery.close();
            }
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        if (this.f7745c.m9541a()) {
            this.f7745c.m9540a(String.format("Loaded %d tracked queries keys for tracked queries %s in %dms", Integer.valueOf(hashSet.size()), set.toString(), Long.valueOf(jCurrentTimeMillis2)), null, new Object[0]);
        }
        return hashSet;
    }

    @Override // com.google.android.gms.internal.bif
    /* JADX INFO: renamed from: a */
    public final void mo8838a(long j) {
        m8834g();
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iDelete = this.f7744b.delete("writes", "id = ?", new String[]{String.valueOf(j)});
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        if (this.f7745c.m9541a()) {
            this.f7745c.m9540a(String.format("Deleted %d write(s) with writeId %d in %dms", Integer.valueOf(iDelete), Long.valueOf(j), Long.valueOf(jCurrentTimeMillis2)), null, new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.bif
    /* JADX INFO: renamed from: a */
    public final void mo8839a(long j, Set<bkp> set) {
        m8834g();
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f7744b.delete("trackedKeys", "id = ?", new String[]{String.valueOf(j)});
        for (bkp bkpVar : set) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", Long.valueOf(j));
            contentValues.put("key", bkpVar.m9554d());
            this.f7744b.insertWithOnConflict("trackedKeys", null, contentValues, 5);
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        if (this.f7745c.m9541a()) {
            this.f7745c.m9540a(String.format("Set %d tracked query keys for tracked query %d in %dms", Integer.valueOf(set.size()), Long.valueOf(j), Long.valueOf(jCurrentTimeMillis2)), null, new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.bif
    /* JADX INFO: renamed from: a */
    public final void mo8840a(long j, Set<bkp> set, Set<bkp> set2) {
        m8834g();
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strValueOf = String.valueOf(j);
        Iterator<bkp> it = set2.iterator();
        while (it.hasNext()) {
            this.f7744b.delete("trackedKeys", "id = ? AND key = ?", new String[]{strValueOf, it.next().m9554d()});
        }
        for (bkp bkpVar : set) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", Long.valueOf(j));
            contentValues.put("key", bkpVar.m9554d());
            this.f7744b.insertWithOnConflict("trackedKeys", null, contentValues, 5);
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        if (this.f7745c.m9541a()) {
            this.f7745c.m9540a(String.format("Updated tracked query keys (%d added, %d removed) for tracked query id %d in %dms", Integer.valueOf(set.size()), Integer.valueOf(set2.size()), Long.valueOf(j), Long.valueOf(jCurrentTimeMillis2)), null, new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.bif
    /* JADX INFO: renamed from: a */
    public final void mo8841a(bfa bfaVar, beo beoVar) {
        m8834g();
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iM8817a = 0;
        int iM8831c = 0;
        for (Map.Entry<bfa, bln> entry : beoVar) {
            iM8817a += m8817a("serverCache", bfaVar.m9152a(entry.getKey()));
            iM8831c = m8831c(bfaVar.m9152a(entry.getKey()), entry.getValue()) + iM8831c;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        if (this.f7745c.m9541a()) {
            this.f7745c.m9540a(String.format("Persisted a total of %d rows and deleted %d rows for a merge at %s in %dms", Integer.valueOf(iM8831c), Integer.valueOf(iM8817a), bfaVar.toString(), Long.valueOf(jCurrentTimeMillis2)), null, new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.bif
    /* JADX INFO: renamed from: a */
    public final void mo8842a(bfa bfaVar, beo beoVar, long j) {
        m8834g();
        long jCurrentTimeMillis = System.currentTimeMillis();
        m8825a(bfaVar, j, "m", m8828a(beoVar.m9103a(true)));
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        if (this.f7745c.m9541a()) {
            this.f7745c.m9540a(String.format("Persisted user merge in %dms", Long.valueOf(jCurrentTimeMillis2)), null, new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.bif
    /* JADX INFO: renamed from: a */
    public final void mo8843a(bfa bfaVar, bih bihVar) {
        if (bihVar.m9379a()) {
            m8834g();
            long jCurrentTimeMillis = System.currentTimeMillis();
            Cursor cursorM8818a = m8818a(bfaVar, new String[]{"rowid", "path"});
            bit<Long> bitVar = new bit<>(null);
            bit<Long> bitVar2 = new bit<>(null);
            while (cursorM8818a.moveToNext()) {
                long j = cursorM8818a.getLong(0);
                bfa bfaVar2 = new bfa(cursorM8818a.getString(1));
                if (bfaVar.m9155b(bfaVar2)) {
                    bfa bfaVarM9148a = bfa.m9148a(bfaVar, bfaVar2);
                    if (bihVar.m9380a(bfaVarM9148a)) {
                        bitVar = bitVar.m9410a(bfaVarM9148a, Long.valueOf(j));
                    } else if (bihVar.m9381b(bfaVarM9148a)) {
                        bitVar2 = bitVar2.m9410a(bfaVarM9148a, Long.valueOf(j));
                    } else {
                        bkl bklVar = this.f7745c;
                        String strValueOf = String.valueOf(bfaVar);
                        String strValueOf2 = String.valueOf(bfaVar2);
                        bklVar.m9542b(new StringBuilder(String.valueOf(strValueOf).length() + 88 + String.valueOf(strValueOf2).length()).append("We are pruning at ").append(strValueOf).append(" and have data at ").append(strValueOf2).append(" that isn't marked for pruning or keeping. Ignoring.").toString(), null);
                    }
                } else {
                    bkl bklVar2 = this.f7745c;
                    String strValueOf3 = String.valueOf(bfaVar);
                    String strValueOf4 = String.valueOf(bfaVar2);
                    bklVar2.m9542b(new StringBuilder(String.valueOf(strValueOf3).length() + 67 + String.valueOf(strValueOf4).length()).append("We are pruning at ").append(strValueOf3).append(" but we have data stored higher up at ").append(strValueOf4).append(". Ignoring.").toString(), null);
                }
            }
            int size = 0;
            int size2 = 0;
            if (!bitVar.m9421d()) {
                ArrayList arrayList = new ArrayList();
                m8826a(bfaVar, bfa.m9147a(), bitVar, bitVar2, bihVar, arrayList);
                Collection<Long> collectionM9423e = bitVar.m9423e();
                String strM8823a = m8823a(collectionM9423e);
                this.f7744b.delete("serverCache", new StringBuilder(String.valueOf(strM8823a).length() + 11).append("rowid IN (").append(strM8823a).append(")").toString(), null);
                ArrayList arrayList2 = arrayList;
                int size3 = arrayList2.size();
                for (int i = 0; i < size3; i++) {
                    bnb bnbVar = (bnb) arrayList2.get(i);
                    m8831c(bfaVar.m9152a((bfa) bnbVar.m9687a()), (bln) bnbVar.m9688b());
                }
                size = collectionM9423e.size();
                size2 = arrayList.size();
            }
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            if (this.f7745c.m9541a()) {
                this.f7745c.m9540a(String.format("Pruned %d rows with %d nodes resaved in %dms", Integer.valueOf(size), Integer.valueOf(size2), Long.valueOf(jCurrentTimeMillis2)), null, new Object[0]);
            }
        }
    }

    @Override // com.google.android.gms.internal.bif
    /* JADX INFO: renamed from: a */
    public final void mo8844a(bfa bfaVar, bln blnVar) {
        m8834g();
        m8827a(bfaVar, blnVar, false);
    }

    @Override // com.google.android.gms.internal.bif
    /* JADX INFO: renamed from: a */
    public final void mo8845a(bfa bfaVar, bln blnVar, long j) {
        m8834g();
        long jCurrentTimeMillis = System.currentTimeMillis();
        m8825a(bfaVar, j, "o", m8828a(blnVar.mo9563a(true)));
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        if (this.f7745c.m9541a()) {
            this.f7745c.m9540a(String.format("Persisted user overwrite in %dms", Long.valueOf(jCurrentTimeMillis2)), null, new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.bif
    /* JADX INFO: renamed from: a */
    public final void mo8846a(bil bilVar) {
        m8834g();
        long jCurrentTimeMillis = System.currentTimeMillis();
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Long.valueOf(bilVar.f8217a));
        contentValues.put("path", m8832c(bilVar.f8218b.m9482a()));
        contentValues.put("queryParams", bilVar.f8218b.m9483b().m9478n());
        contentValues.put("lastUse", Long.valueOf(bilVar.f8219c));
        contentValues.put("complete", Boolean.valueOf(bilVar.f8220d));
        contentValues.put("active", Boolean.valueOf(bilVar.f8221e));
        this.f7744b.insertWithOnConflict("trackedQueries", null, contentValues, 5);
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        if (this.f7745c.m9541a()) {
            this.f7745c.m9540a(String.format("Saved new tracked query in %dms", Long.valueOf(jCurrentTimeMillis2)), null, new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.bif
    /* JADX INFO: renamed from: b */
    public final long mo8847b() {
        Cursor cursorRawQuery = this.f7744b.rawQuery(String.format("SELECT sum(length(%s) + length(%s)) FROM %s", "value", "path", "serverCache"), null);
        try {
            if (cursorRawQuery.moveToFirst()) {
                return cursorRawQuery.getLong(0);
            }
            throw new IllegalStateException("Couldn't read database result!");
        } finally {
            cursorRawQuery.close();
        }
    }

    @Override // com.google.android.gms.internal.bif
    /* JADX INFO: renamed from: b */
    public final void mo8848b(long j) {
        m8834g();
        String strValueOf = String.valueOf(j);
        this.f7744b.delete("trackedQueries", "id = ?", new String[]{strValueOf});
        this.f7744b.delete("trackedKeys", "id = ?", new String[]{strValueOf});
    }

    @Override // com.google.android.gms.internal.bif
    /* JADX INFO: renamed from: b */
    public final void mo8849b(bfa bfaVar, bln blnVar) {
        m8834g();
        m8827a(bfaVar, blnVar, true);
    }

    @Override // com.google.android.gms.internal.bif
    /* JADX INFO: renamed from: c */
    public final List<bil> mo8850c() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Cursor cursorQuery = this.f7744b.query("trackedQueries", new String[]{"id", "path", "queryParams", "lastUse", "complete", "active"}, null, null, null, null, "id");
        ArrayList arrayList = new ArrayList();
        while (cursorQuery.moveToNext()) {
            try {
                try {
                    arrayList.add(new bil(cursorQuery.getLong(0), new bjs(new bfa(cursorQuery.getString(1)), bjp.m9463a(bms.m9676a(cursorQuery.getString(2)))), cursorQuery.getLong(3), cursorQuery.getInt(4) != 0, cursorQuery.getInt(5) != 0));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } finally {
                cursorQuery.close();
            }
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        if (this.f7745c.m9541a()) {
            this.f7745c.m9540a(String.format("Loaded %d tracked queries in %dms", Integer.valueOf(arrayList.size()), Long.valueOf(jCurrentTimeMillis2)), null, new Object[0]);
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.bif
    /* JADX INFO: renamed from: c */
    public final void mo8851c(long j) {
        m8834g();
        long jCurrentTimeMillis = System.currentTimeMillis();
        ContentValues contentValues = new ContentValues();
        contentValues.put("active", (Boolean) false);
        contentValues.put("lastUse", Long.valueOf(j));
        this.f7744b.updateWithOnConflict("trackedQueries", contentValues, "active = 1", new String[0], 5);
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        if (this.f7745c.m9541a()) {
            this.f7745c.m9540a(String.format("Reset active tracked queries in %dms", Long.valueOf(jCurrentTimeMillis2)), null, new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.bif
    /* JADX INFO: renamed from: d */
    public final Set<bkp> mo8852d(long j) {
        return mo8837a(Collections.singleton(Long.valueOf(j)));
    }

    @Override // com.google.android.gms.internal.bif
    /* JADX INFO: renamed from: d */
    public final void mo8853d() {
        bne.m9697a(!this.f7746d, "runInTransaction called when an existing transaction is already in progress.");
        if (this.f7745c.m9541a()) {
            this.f7745c.m9540a("Starting transaction.", null, new Object[0]);
        }
        this.f7744b.beginTransaction();
        this.f7746d = true;
        this.f7747e = System.currentTimeMillis();
    }

    @Override // com.google.android.gms.internal.bif
    /* JADX INFO: renamed from: e */
    public final void mo8854e() {
        this.f7744b.endTransaction();
        this.f7746d = false;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f7747e;
        if (this.f7745c.m9541a()) {
            this.f7745c.m9540a(String.format("Transaction completed. Elapsed: %dms", Long.valueOf(jCurrentTimeMillis)), null, new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.bif
    /* JADX INFO: renamed from: f */
    public final void mo8855f() {
        this.f7744b.setTransactionSuccessful();
    }
}
