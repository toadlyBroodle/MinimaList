package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.common.util.InterfaceC1300d;
import com.google.android.gms.measurement.AppMeasurement;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: loaded from: classes.dex */
public final class aek extends acd {

    /* JADX INFO: renamed from: a */
    private static String[] f6501a = {"firebase_"};

    /* JADX INFO: renamed from: b */
    private SecureRandom f6502b;

    /* JADX INFO: renamed from: c */
    private final AtomicLong f6503c;

    /* JADX INFO: renamed from: d */
    private int f6504d;

    aek(abd abdVar) {
        super(abdVar);
        this.f6503c = new AtomicLong(0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026 A[ORIG_RETURN, RETURN] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int m7713a(String str, Object obj, boolean z) {
        boolean z2;
        int size;
        if (z) {
            if (obj instanceof Parcelable[]) {
                size = ((Parcelable[]) obj).length;
            } else if (obj instanceof ArrayList) {
                size = ((ArrayList) obj).size();
            } else {
                z2 = true;
                if (!z2) {
                    return 17;
                }
            }
            if (size > 1000) {
                mo7393t().m7401A().m7415a("Parameter array is too long; discarded. Value kind, name, array length", "param", str, Integer.valueOf(size));
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z2) {
            }
        }
        return m7739i(str) ? m7726a("param", str, 256, obj, z) : m7726a("param", str, 100, obj, z) ? 0 : 4;
    }

    /* JADX INFO: renamed from: a */
    private static Object m7714a(int i, Object obj, boolean z) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(((Boolean) obj).booleanValue() ? 1L : 0L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            return m7716a(String.valueOf(obj), i, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static Object m7715a(aew aewVar, String str) {
        for (aex aexVar : aewVar.f6554a) {
            if (aexVar.f6560a.equals(str)) {
                if (aexVar.f6561b != null) {
                    return aexVar.f6561b;
                }
                if (aexVar.f6562c != null) {
                    return aexVar.f6562c;
                }
                if (aexVar.f6563d != null) {
                    return aexVar.f6563d;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static String m7716a(String str, int i, boolean z) {
        if (str.codePointCount(0, str.length()) <= i) {
            return str;
        }
        if (z) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i))).concat("...");
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static String m7717a(String str, String[] strArr, String[] strArr2) {
        C1221aj.m7065a(strArr);
        C1221aj.m7065a(strArr2);
        int iMin = Math.min(strArr.length, strArr2.length);
        for (int i = 0; i < iMin; i++) {
            if (m7725a(str, strArr[i])) {
                return strArr2[i];
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private static void m7718a(Bundle bundle, Object obj) {
        C1221aj.m7065a(bundle);
        if (obj != null) {
            if ((obj instanceof String) || (obj instanceof CharSequence)) {
                bundle.putLong("_el", String.valueOf(obj).length());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m7719a(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 4)) == null) {
                return false;
            }
            return serviceInfo.enabled;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m7720a(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        return "android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra);
    }

    /* JADX INFO: renamed from: a */
    private static boolean m7721a(Bundle bundle, int i) {
        if (bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i);
        return true;
    }

    /* JADX INFO: renamed from: a */
    static boolean m7722a(C2104zq c2104zq, C2084yx c2084yx) {
        C1221aj.m7065a(c2104zq);
        C1221aj.m7065a(c2084yx);
        return !TextUtils.isEmpty(c2084yx.f12575b);
    }

    /* JADX INFO: renamed from: a */
    static boolean m7723a(String str) {
        C1221aj.m7067a(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    /* JADX INFO: renamed from: a */
    private final boolean m7724a(String str, int i, String str2) {
        if (str2 == null) {
            mo7393t().m7410y().m7413a("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        }
        mo7393t().m7410y().m7415a("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m7725a(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null) {
            return false;
        }
        return str.equals(str2);
    }

    /* JADX INFO: renamed from: a */
    private final boolean m7726a(String str, String str2, int i, Object obj, boolean z) {
        if (obj == null || (obj instanceof Long) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Boolean) || (obj instanceof Double)) {
            return true;
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            String strValueOf = String.valueOf(obj);
            if (strValueOf.codePointCount(0, strValueOf.length()) <= i) {
                return true;
            }
            mo7393t().m7401A().m7415a("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(strValueOf.length()));
            return false;
        }
        if ((obj instanceof Bundle) && z) {
            return true;
        }
        if ((obj instanceof Parcelable[]) && z) {
            for (Parcelable parcelable : (Parcelable[]) obj) {
                if (!(parcelable instanceof Bundle)) {
                    mo7393t().m7401A().m7414a("All Parcelable[] elements must be of type Bundle. Value type, name", parcelable.getClass(), str2);
                    return false;
                }
            }
            return true;
        }
        if (!(obj instanceof ArrayList) || !z) {
            return false;
        }
        ArrayList arrayList = (ArrayList) obj;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj2 = arrayList.get(i2);
            i2++;
            if (!(obj2 instanceof Bundle)) {
                mo7393t().m7401A().m7414a("All ArrayList elements must be of type Bundle. Value type, name", obj2.getClass(), str2);
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    private final boolean m7727a(String str, String[] strArr, String str2) {
        boolean z;
        boolean z2;
        if (str2 == null) {
            mo7393t().m7410y().m7413a("Name is required and can't be null. Type", str);
            return false;
        }
        C1221aj.m7065a(str2);
        int i = 0;
        while (true) {
            if (i >= f6501a.length) {
                z = false;
                break;
            }
            if (str2.startsWith(f6501a[i])) {
                z = true;
                break;
            }
            i++;
        }
        if (z) {
            mo7393t().m7410y().m7414a("Name starts with reserved prefix. Type, name", str, str2);
            return false;
        }
        if (strArr != null) {
            C1221aj.m7065a(strArr);
            int i2 = 0;
            while (true) {
                if (i2 >= strArr.length) {
                    z2 = false;
                    break;
                }
                if (m7725a(str2, strArr[i2])) {
                    z2 = true;
                    break;
                }
                i2++;
            }
            if (z2) {
                mo7393t().m7410y().m7414a("Name is reserved. Type, name", str, str2);
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m7728a(long[] jArr, int i) {
        return i < (jArr.length << 6) && (jArr[i / 64] & (1 << (i % 64))) != 0;
    }

    /* JADX INFO: renamed from: a */
    static byte[] m7729a(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(parcelObtain, 0);
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    /* JADX INFO: renamed from: a */
    public static long[] m7730a(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        long[] jArr = new long[length];
        for (int i = 0; i < length; i++) {
            jArr[i] = 0;
            for (int i2 = 0; i2 < 64 && (i << 6) + i2 < bitSet.length(); i2++) {
                if (bitSet.get((i << 6) + i2)) {
                    jArr[i] = jArr[i] | (1 << i2);
                }
            }
        }
        return jArr;
    }

    /* JADX INFO: renamed from: a */
    public static Bundle[] m7731a(Object obj) {
        if (obj instanceof Bundle) {
            return new Bundle[]{(Bundle) obj};
        }
        if (obj instanceof Parcelable[]) {
            return (Bundle[]) Arrays.copyOf((Parcelable[]) obj, ((Parcelable[]) obj).length, Bundle[].class);
        }
        if (!(obj instanceof ArrayList)) {
            return null;
        }
        ArrayList arrayList = (ArrayList) obj;
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    /* JADX INFO: renamed from: a */
    static aex[] m7732a(aex[] aexVarArr, String str, Object obj) {
        for (aex aexVar : aexVarArr) {
            if (Objects.equals(aexVar.f6560a, str)) {
                aexVar.f6562c = null;
                aexVar.f6561b = null;
                aexVar.f6563d = null;
                if (obj instanceof Long) {
                    aexVar.f6562c = (Long) obj;
                    return aexVarArr;
                }
                if (obj instanceof String) {
                    aexVar.f6561b = (String) obj;
                    return aexVarArr;
                }
                if (!(obj instanceof Double)) {
                    return aexVarArr;
                }
                aexVar.f6563d = (Double) obj;
                return aexVarArr;
            }
        }
        aex[] aexVarArr2 = new aex[aexVarArr.length + 1];
        System.arraycopy(aexVarArr, 0, aexVarArr2, 0, aexVarArr.length);
        aex aexVar2 = new aex();
        aexVar2.f6560a = str;
        if (obj instanceof Long) {
            aexVar2.f6562c = (Long) obj;
        } else if (obj instanceof String) {
            aexVar2.f6561b = (String) obj;
        } else if (obj instanceof Double) {
            aexVar2.f6563d = (Double) obj;
        }
        aexVarArr2[aexVarArr.length] = aexVar2;
        return aexVarArr2;
    }

    /* JADX INFO: renamed from: b */
    public static Object m7733b(Object obj) throws Throwable {
        ObjectInputStream objectInputStream;
        ObjectOutputStream objectOutputStream;
        try {
            if (obj == null) {
                return null;
            }
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                try {
                    objectOutputStream.writeObject(obj);
                    objectOutputStream.flush();
                    objectInputStream = new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
                } catch (Throwable th) {
                    th = th;
                    objectInputStream = null;
                }
                try {
                    Object object = objectInputStream.readObject();
                    objectOutputStream.close();
                    objectInputStream.close();
                    return object;
                } catch (Throwable th2) {
                    th = th2;
                    if (objectOutputStream != null) {
                        objectOutputStream.close();
                    }
                    if (objectInputStream != null) {
                        objectInputStream.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                objectInputStream = null;
                objectOutputStream = null;
            }
        } catch (IOException e) {
            return null;
        } catch (ClassNotFoundException e2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    private final boolean m7734b(String str, String str2) {
        if (str2 == null) {
            mo7393t().m7410y().m7413a("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            mo7393t().m7410y().m7413a("Name is required and can't be empty. Type", str);
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            mo7393t().m7410y().m7414a("Name must start with a letter. Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                mo7393t().m7410y().m7414a("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    static long m7735c(byte[] bArr) {
        int i = 0;
        C1221aj.m7065a(bArr);
        C1221aj.m7070a(bArr.length > 0);
        long j = 0;
        for (int length = bArr.length - 1; length >= 0 && length >= bArr.length - 8; length--) {
            j += (((long) bArr[length]) & 255) << i;
            i += 8;
        }
        return j;
    }

    /* JADX INFO: renamed from: c */
    private final boolean m7736c(Context context, String str) {
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfoM12560b = C2040xg.m12562a(context).m12560b(str, 64);
            if (packageInfoM12560b != null && packageInfoM12560b.signatures != null && packageInfoM12560b.signatures.length > 0) {
                return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(packageInfoM12560b.signatures[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
            }
        } catch (PackageManager.NameNotFoundException e) {
            mo7393t().m7410y().m7413a("Package name not found", e);
        } catch (CertificateException e2) {
            mo7393t().m7410y().m7413a("Error obtaining certificate", e2);
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    private final boolean m7737c(String str, String str2) {
        if (str2 == null) {
            mo7393t().m7410y().m7413a("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            mo7393t().m7410y().m7413a("Name is required and can't be empty. Type", str);
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt) && iCodePointAt != 95) {
            mo7393t().m7410y().m7414a("Name must start with a letter or _ (underscore). Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                mo7393t().m7410y().m7414a("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    static MessageDigest m7738g(String str) {
        MessageDigest messageDigest;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= 2) {
                return null;
            }
            try {
                messageDigest = MessageDigest.getInstance(str);
            } catch (NoSuchAlgorithmException e) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
            i = i2 + 1;
        }
    }

    /* JADX INFO: renamed from: i */
    public static boolean m7739i(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    /* JADX INFO: renamed from: k */
    static boolean m7740k(String str) {
        return str != null && str.matches("(\\+|-)?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    /* JADX INFO: renamed from: n */
    static boolean m7741n(String str) {
        C1221aj.m7067a(str);
        switch (str) {
            case "_in":
            case "_ui":
            case "_ug":
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: o */
    private final int m7742o(String str) {
        if (!m7734b("event param", str)) {
            return 3;
        }
        if (m7727a("event param", (String[]) null, str)) {
            return m7724a("event param", 40, str) ? 0 : 3;
        }
        return 14;
    }

    /* JADX INFO: renamed from: p */
    private final int m7743p(String str) {
        if (!m7737c("event param", str)) {
            return 3;
        }
        if (m7727a("event param", (String[]) null, str)) {
            return m7724a("event param", 40, str) ? 0 : 3;
        }
        return 14;
    }

    /* JADX INFO: renamed from: q */
    private static int m7744q(String str) {
        return "_ldl".equals(str) ? 2048 : 36;
    }

    /* JADX INFO: renamed from: a */
    public final Bundle m7745a(Uri uri) {
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        String queryParameter4;
        Bundle bundle = null;
        if (uri != null) {
            try {
                if (uri.isHierarchical()) {
                    queryParameter4 = uri.getQueryParameter("utm_campaign");
                    queryParameter3 = uri.getQueryParameter("utm_source");
                    queryParameter2 = uri.getQueryParameter("utm_medium");
                    queryParameter = uri.getQueryParameter("gclid");
                } else {
                    queryParameter = null;
                    queryParameter2 = null;
                    queryParameter3 = null;
                    queryParameter4 = null;
                }
                if (!TextUtils.isEmpty(queryParameter4) || !TextUtils.isEmpty(queryParameter3) || !TextUtils.isEmpty(queryParameter2) || !TextUtils.isEmpty(queryParameter)) {
                    bundle = new Bundle();
                    if (!TextUtils.isEmpty(queryParameter4)) {
                        bundle.putString("campaign", queryParameter4);
                    }
                    if (!TextUtils.isEmpty(queryParameter3)) {
                        bundle.putString("source", queryParameter3);
                    }
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        bundle.putString("medium", queryParameter2);
                    }
                    if (!TextUtils.isEmpty(queryParameter)) {
                        bundle.putString("gclid", queryParameter);
                    }
                    String queryParameter5 = uri.getQueryParameter("utm_term");
                    if (!TextUtils.isEmpty(queryParameter5)) {
                        bundle.putString("term", queryParameter5);
                    }
                    String queryParameter6 = uri.getQueryParameter("utm_content");
                    if (!TextUtils.isEmpty(queryParameter6)) {
                        bundle.putString("content", queryParameter6);
                    }
                    String queryParameter7 = uri.getQueryParameter("aclid");
                    if (!TextUtils.isEmpty(queryParameter7)) {
                        bundle.putString("aclid", queryParameter7);
                    }
                    String queryParameter8 = uri.getQueryParameter("cp1");
                    if (!TextUtils.isEmpty(queryParameter8)) {
                        bundle.putString("cp1", queryParameter8);
                    }
                    String queryParameter9 = uri.getQueryParameter("anid");
                    if (!TextUtils.isEmpty(queryParameter9)) {
                        bundle.putString("anid", queryParameter9);
                    }
                }
            } catch (UnsupportedOperationException e) {
                mo7393t().m7401A().m7413a("Install referrer url isn't a hierarchical URI", e);
            }
        }
        return bundle;
    }

    /* JADX INFO: renamed from: a */
    final Bundle m7746a(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object objM7750a = m7750a(str, bundle.get(str));
                if (objM7750a == null) {
                    mo7393t().m7401A().m7413a("Param value can't be null", mo7388o().m7373b(str));
                } else {
                    m7752a(bundle2, str, objM7750a);
                }
            }
        }
        return bundle2;
    }

    /* JADX INFO: renamed from: a */
    public final Bundle m7747a(String str, Bundle bundle, List<String> list, boolean z, boolean z2) {
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        int i = 0;
        for (String str2 : bundle.keySet()) {
            if (list == null || !list.contains(str2)) {
                iM7742o = z ? m7742o(str2) : 0;
                if (iM7742o == 0) {
                    iM7742o = m7743p(str2);
                }
            }
            if (iM7742o != 0) {
                if (m7721a(bundle2, iM7742o)) {
                    bundle2.putString("_ev", m7716a(str2, 40, true));
                    if (iM7742o == 3) {
                        m7718a(bundle2, str2);
                    }
                }
                bundle2.remove(str2);
            } else {
                int iM7713a = m7713a(str2, bundle.get(str2), z2);
                if (iM7713a != 0 && !"_ev".equals(str2)) {
                    if (m7721a(bundle2, iM7713a)) {
                        bundle2.putString("_ev", m7716a(str2, 40, true));
                        m7718a(bundle2, bundle.get(str2));
                    }
                    bundle2.remove(str2);
                } else if (!m7723a(str2) || (i = i + 1) <= 25) {
                    i = i;
                } else {
                    mo7393t().m7410y().m7414a(new StringBuilder(48).append("Event can't contain more then 25 params").toString(), mo7388o().m7371a(str), mo7388o().m7365a(bundle));
                    m7721a(bundle2, 5);
                    bundle2.remove(str2);
                }
            }
        }
        return bundle2;
    }

    /* JADX INFO: renamed from: a */
    final <T extends Parcelable> T m7748a(byte[] bArr, Parcelable.Creator<T> creator) {
        if (bArr == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.unmarshall(bArr, 0, bArr.length);
            parcelObtain.setDataPosition(0);
            return creator.createFromParcel(parcelObtain);
        } catch (C2013wg e) {
            mo7393t().m7410y().m7412a("Failed to load parcelable from buffer");
            return null;
        } finally {
            parcelObtain.recycle();
        }
    }

    /* JADX INFO: renamed from: a */
    final C2104zq m7749a(String str, Bundle bundle, String str2, long j, boolean z, boolean z2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (m7763c(str) != 0) {
            mo7393t().m7410y().m7413a("Invalid conditional property event name", mo7388o().m7375c(str));
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str2);
        return new C2104zq(str, new C2100zm(m7746a(m7747a(str, bundle2, Collections.singletonList("_o"), false, false))), str2, j);
    }

    /* JADX INFO: renamed from: a */
    public final Object m7750a(String str, Object obj) {
        if ("_ev".equals(str)) {
            return m7714a(256, obj, true);
        }
        return m7714a(m7739i(str) ? 256 : 100, obj, false);
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo7372a() {
        super.mo7372a();
    }

    /* JADX INFO: renamed from: a */
    public final void m7751a(int i, String str, String str2, int i2) {
        m7755a((String) null, i, str, str2, i2);
    }

    /* JADX INFO: renamed from: a */
    public final void m7752a(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
        } else if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        } else if (str != null) {
            mo7393t().m7402B().m7414a("Not putting event parameter. Invalid value type. name, type", mo7388o().m7373b(str), obj != null ? obj.getClass().getSimpleName() : null);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m7753a(aex aexVar, Object obj) {
        C1221aj.m7065a(obj);
        aexVar.f6561b = null;
        aexVar.f6562c = null;
        aexVar.f6563d = null;
        if (obj instanceof String) {
            aexVar.f6561b = (String) obj;
            return;
        }
        if (obj instanceof Long) {
            aexVar.f6562c = (Long) obj;
        } else if (obj instanceof Double) {
            aexVar.f6563d = (Double) obj;
        } else {
            mo7393t().m7410y().m7413a("Ignoring invalid (type) event param value", obj);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m7754a(afb afbVar, Object obj) {
        C1221aj.m7065a(obj);
        afbVar.f6607c = null;
        afbVar.f6608d = null;
        afbVar.f6609e = null;
        if (obj instanceof String) {
            afbVar.f6607c = (String) obj;
            return;
        }
        if (obj instanceof Long) {
            afbVar.f6608d = (Long) obj;
        } else if (obj instanceof Double) {
            afbVar.f6609e = (Double) obj;
        } else {
            mo7393t().m7410y().m7413a("Ignoring invalid (type) user attribute value", obj);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m7755a(String str, int i, String str2, String str3, int i2) {
        Bundle bundle = new Bundle();
        m7721a(bundle, i);
        if (!TextUtils.isEmpty(str2)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", i2);
        }
        this.f6329p.m7546l().m7614a("auto", "_err", bundle);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m7756a(long j, long j2) {
        return j == 0 || j2 <= 0 || Math.abs(mo7384k().mo7252a() - j) > j2;
    }

    /* JADX INFO: renamed from: a */
    public final byte[] m7757a(aey aeyVar) {
        try {
            byte[] bArr = new byte[aeyVar.m10166f()];
            bru bruVarM10108a = bru.m10108a(bArr, 0, bArr.length);
            aeyVar.mo7777a(bruVarM10108a);
            bruVarM10108a.m10122a();
            return bArr;
        } catch (IOException e) {
            mo7393t().m7410y().m7413a("Data loss. Failed to serialize batch", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final byte[] m7758a(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            mo7393t().m7410y().m7413a("Failed to gzip content", e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m7759b(String str) {
        if (!m7734b("event", str)) {
            return 2;
        }
        if (m7727a("event", AppMeasurement.C2114a.f12753a, str)) {
            return m7724a("event", 40, str) ? 0 : 2;
        }
        return 13;
    }

    /* JADX INFO: renamed from: b */
    public final int m7760b(String str, Object obj) {
        return "_ldl".equals(str) ? m7726a("user property referrer", str, m7744q(str), obj, false) : m7726a("user property", str, m7744q(str), obj, false) ? 0 : 7;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0078  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x006b -> B:18:0x0078). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final long m7761b(Context context, String str) {
        long jM7735c = -1;
        mo7376c();
        C1221aj.m7065a(context);
        C1221aj.m7067a(str);
        PackageManager packageManager = context.getPackageManager();
        MessageDigest messageDigestM7738g = m7738g("MD5");
        if (messageDigestM7738g == null) {
            mo7393t().m7410y().m7412a("Could not get MD5 instance");
        } else if (packageManager != null) {
            try {
            } catch (PackageManager.NameNotFoundException e) {
                mo7393t().m7410y().m7413a("Package name not found", e);
            }
            if (m7736c(context, str)) {
                jM7735c = 0;
            } else {
                PackageInfo packageInfoM12560b = C2040xg.m12562a(context).m12560b(mo7385l().getPackageName(), 64);
                if (packageInfoM12560b.signatures == null || packageInfoM12560b.signatures.length <= 0) {
                    mo7393t().m7401A().m7412a("Could not get signatures");
                } else {
                    jM7735c = m7735c(messageDigestM7738g.digest(packageInfoM12560b.signatures[0].toByteArray()));
                }
            }
        }
        return jM7735c;
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ void mo7374b() {
        super.mo7374b();
    }

    /* JADX INFO: renamed from: b */
    public final byte[] m7762b(byte[] bArr) throws IOException {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[1024];
            while (true) {
                int i = gZIPInputStream.read(bArr2);
                if (i <= 0) {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr2, 0, i);
            }
        } catch (IOException e) {
            mo7393t().m7410y().m7413a("Failed to ungzip content", e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m7763c(String str) {
        if (!m7737c("event", str)) {
            return 2;
        }
        if (m7727a("event", AppMeasurement.C2114a.f12753a, str)) {
            return m7724a("event", 40, str) ? 0 : 2;
        }
        return 13;
    }

    /* JADX INFO: renamed from: c */
    public final Object m7764c(String str, Object obj) {
        return "_ldl".equals(str) ? m7714a(m7744q(str), obj, true) : m7714a(m7744q(str), obj, false);
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ void mo7376c() {
        super.mo7376c();
    }

    /* JADX INFO: renamed from: d */
    public final int m7765d(String str) {
        if (!m7734b("user property", str)) {
            return 6;
        }
        if (m7727a("user property", AppMeasurement.C2118e.f12757a, str)) {
            return m7724a("user property", 24, str) ? 0 : 6;
        }
        return 15;
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ C2079ys mo7377d() {
        return super.mo7377d();
    }

    /* JADX INFO: renamed from: e */
    public final int m7766e(String str) {
        if (!m7737c("user property", str)) {
            return 6;
        }
        if (m7727a("user property", AppMeasurement.C2118e.f12757a, str)) {
            return m7724a("user property", 24, str) ? 0 : 6;
        }
        return 15;
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: e */
    public final /* bridge */ /* synthetic */ C2086yz mo7378e() {
        return super.mo7378e();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ acf mo7379f() {
        return super.mo7379f();
    }

    /* JADX INFO: renamed from: f */
    public final boolean m7767f(String str) {
        if (TextUtils.isEmpty(str)) {
            mo7393t().m7410y().m7412a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            return false;
        }
        C1221aj.m7065a(str);
        if (str.matches("^1:\\d+:android:[a-f0-9]+$")) {
            return true;
        }
        mo7393t().m7410y().m7413a("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", str);
        return false;
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: g */
    public final /* bridge */ /* synthetic */ C2111zx mo7380g() {
        return super.mo7380g();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: h */
    public final /* bridge */ /* synthetic */ C2097zj mo7381h() {
        return super.mo7381h();
    }

    /* JADX INFO: renamed from: h */
    public final boolean m7768h(String str) {
        mo7376c();
        if (C2040xg.m12562a(mo7385l()).m12554a(str) == 0) {
            return true;
        }
        mo7393t().m7404D().m7413a("Permission not granted", str);
        return false;
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: i */
    public final /* bridge */ /* synthetic */ acz mo7382i() {
        return super.mo7382i();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: j */
    public final /* bridge */ /* synthetic */ acv mo7383j() {
        return super.mo7383j();
    }

    /* JADX INFO: renamed from: j */
    public final boolean m7769j(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return mo7395v().m12681A().equals(str);
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: k */
    public final /* bridge */ /* synthetic */ InterfaceC1300d mo7384k() {
        return super.mo7384k();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: l */
    public final /* bridge */ /* synthetic */ Context mo7385l() {
        return super.mo7385l();
    }

    /* JADX INFO: renamed from: l */
    final boolean m7770l(String str) {
        return "1".equals(mo7390q().m7459a(str, "measurement.upload.blacklist_internal"));
    }

    @Override // com.google.android.gms.internal.acd
    /* JADX INFO: renamed from: l_ */
    protected final void mo7436l_() {
        mo7376c();
        SecureRandom secureRandom = new SecureRandom();
        long jNextLong = secureRandom.nextLong();
        if (jNextLong == 0) {
            jNextLong = secureRandom.nextLong();
            if (jNextLong == 0) {
                mo7393t().m7401A().m7412a("Utils falling back to Random for random id");
            }
        }
        this.f6503c.set(jNextLong);
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: m */
    public final /* bridge */ /* synthetic */ C2112zy mo7386m() {
        return super.mo7386m();
    }

    /* JADX INFO: renamed from: m */
    final boolean m7771m(String str) {
        return "1".equals(mo7390q().m7459a(str, "measurement.upload.blacklist_public"));
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: n */
    public final /* bridge */ /* synthetic */ C2091zd mo7387n() {
        return super.mo7387n();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: o */
    public final /* bridge */ /* synthetic */ aaa mo7388o() {
        return super.mo7388o();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: p */
    public final /* bridge */ /* synthetic */ aek mo7389p() {
        return super.mo7389p();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: q */
    public final /* bridge */ /* synthetic */ aax mo7390q() {
        return super.mo7390q();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: r */
    public final /* bridge */ /* synthetic */ adz mo7391r() {
        return super.mo7391r();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: s */
    public final /* bridge */ /* synthetic */ aay mo7392s() {
        return super.mo7392s();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: t */
    public final /* bridge */ /* synthetic */ aac mo7393t() {
        return super.mo7393t();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: u */
    public final /* bridge */ /* synthetic */ aan mo7394u() {
        return super.mo7394u();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: v */
    public final /* bridge */ /* synthetic */ C2090zc mo7395v() {
        return super.mo7395v();
    }

    @Override // com.google.android.gms.internal.acd
    /* JADX INFO: renamed from: w */
    protected final boolean mo7396w() {
        return true;
    }

    /* JADX INFO: renamed from: y */
    public final long m7772y() {
        long andIncrement;
        if (this.f6503c.get() == 0) {
            synchronized (this.f6503c) {
                long jNextLong = new Random(System.nanoTime() ^ mo7384k().mo7252a()).nextLong();
                int i = this.f6504d + 1;
                this.f6504d = i;
                andIncrement = jNextLong + ((long) i);
            }
        } else {
            synchronized (this.f6503c) {
                this.f6503c.compareAndSet(-1L, 1L);
                andIncrement = this.f6503c.getAndIncrement();
            }
        }
        return andIncrement;
    }

    /* JADX INFO: renamed from: z */
    final SecureRandom m7773z() {
        mo7376c();
        if (this.f6502b == null) {
            this.f6502b = new SecureRandom();
        }
        return this.f6502b;
    }
}
