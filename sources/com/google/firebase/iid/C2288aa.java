package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.util.C1314r;
import java.io.File;
import java.io.IOException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

/* JADX INFO: renamed from: com.google.firebase.iid.aa */
/* JADX INFO: loaded from: classes.dex */
final class C2288aa {

    /* JADX INFO: renamed from: a */
    private SharedPreferences f12985a;

    /* JADX INFO: renamed from: b */
    private Context f12986b;

    public C2288aa(Context context) {
        this(context, "com.google.android.gms.appid");
    }

    private C2288aa(Context context, String str) {
        this.f12986b = context;
        this.f12985a = context.getSharedPreferences(str, 0);
        String strValueOf = String.valueOf(str);
        String strValueOf2 = String.valueOf("-no-backup");
        File file = new File(C1314r.m7290a(this.f12986b), strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf));
        if (file.exists()) {
            return;
        }
        try {
            if (!file.createNewFile() || m13053c()) {
                return;
            }
            Log.i("FirebaseInstanceId", "App restored, clearing state");
            m13060b();
            FirebaseInstanceId.m13027a().m13043h();
        } catch (IOException e) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String strValueOf3 = String.valueOf(e.getMessage());
                Log.d("FirebaseInstanceId", strValueOf3.length() != 0 ? "Error creating file in no backup dir: ".concat(strValueOf3) : new String("Error creating file in no backup dir: "));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static String m13051a(String str, String str2) {
        return new StringBuilder(String.valueOf(str).length() + String.valueOf("|S|").length() + String.valueOf(str2).length()).append(str).append("|S|").append(str2).toString();
    }

    /* JADX INFO: renamed from: b */
    private static String m13052b(String str, String str2, String str3) {
        return new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf("|T|").length() + String.valueOf(str2).length() + String.valueOf(str3).length()).append(str).append("|T|").append(str2).append("|").append(str3).toString();
    }

    /* JADX INFO: renamed from: c */
    private final synchronized boolean m13053c() {
        return this.f12985a.getAll().isEmpty();
    }

    /* JADX INFO: renamed from: f */
    private final void m13054f(String str) {
        SharedPreferences.Editor editorEdit = this.f12985a.edit();
        for (String str2 : this.f12985a.getAll().keySet()) {
            if (str2.startsWith(str)) {
                editorEdit.remove(str2);
            }
        }
        editorEdit.commit();
    }

    /* JADX INFO: renamed from: a */
    public final synchronized C2289ab m13055a(String str, String str2, String str3) {
        return C2289ab.m13064a(this.f12985a.getString(m13052b(str, str2, str3), null));
    }

    /* JADX INFO: renamed from: a */
    public final synchronized String m13056a() {
        String str = null;
        synchronized (this) {
            String string = this.f12985a.getString("topic_operaion_queue", null);
            if (string != null) {
                String[] strArrSplit = string.split(",");
                if (strArrSplit.length > 1 && !TextUtils.isEmpty(strArrSplit[1])) {
                    str = strArrSplit[1];
                }
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m13057a(String str, String str2, String str3, String str4, String str5) {
        String strM13065a = C2289ab.m13065a(str4, str5, System.currentTimeMillis());
        if (strM13065a != null) {
            SharedPreferences.Editor editorEdit = this.f12985a.edit();
            editorEdit.putString(m13052b(str, str2, str3), strM13065a);
            editorEdit.commit();
        }
    }

    /* JADX INFO: renamed from: a */
    public final synchronized boolean m13058a(String str) {
        boolean z;
        String string = this.f12985a.getString("topic_operaion_queue", "");
        String strValueOf = String.valueOf(",");
        String strValueOf2 = String.valueOf(str);
        if (string.startsWith(strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf))) {
            String strValueOf3 = String.valueOf(",");
            String strValueOf4 = String.valueOf(str);
            this.f12985a.edit().putString("topic_operaion_queue", string.substring((strValueOf4.length() != 0 ? strValueOf3.concat(strValueOf4) : new String(strValueOf3)).length())).apply();
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* JADX INFO: renamed from: b */
    final synchronized KeyPair m13059b(String str) {
        KeyPair keyPairM13050a;
        keyPairM13050a = C2287a.m13050a();
        long jCurrentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor editorEdit = this.f12985a.edit();
        editorEdit.putString(m13051a(str, "|P|"), Base64.encodeToString(keyPairM13050a.getPublic().getEncoded(), 11));
        editorEdit.putString(m13051a(str, "|K|"), Base64.encodeToString(keyPairM13050a.getPrivate().getEncoded(), 11));
        editorEdit.putString(m13051a(str, "cre"), Long.toString(jCurrentTimeMillis));
        editorEdit.commit();
        return keyPairM13050a;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m13060b() {
        this.f12985a.edit().clear().commit();
    }

    /* JADX INFO: renamed from: c */
    final synchronized void m13061c(String str) {
        m13054f(String.valueOf(str).concat("|"));
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m13062d(String str) {
        m13054f(String.valueOf(str).concat("|T|"));
    }

    /* JADX INFO: renamed from: e */
    public final synchronized KeyPair m13063e(String str) {
        KeyPair keyPair;
        String string = this.f12985a.getString(m13051a(str, "|P|"), null);
        String string2 = this.f12985a.getString(m13051a(str, "|K|"), null);
        if (string == null || string2 == null) {
            keyPair = null;
        } else {
            try {
                byte[] bArrDecode = Base64.decode(string, 8);
                byte[] bArrDecode2 = Base64.decode(string2, 8);
                KeyFactory keyFactory = KeyFactory.getInstance("RSA");
                keyPair = new KeyPair(keyFactory.generatePublic(new X509EncodedKeySpec(bArrDecode)), keyFactory.generatePrivate(new PKCS8EncodedKeySpec(bArrDecode2)));
            } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
                String strValueOf = String.valueOf(e);
                Log.w("FirebaseInstanceId", new StringBuilder(String.valueOf(strValueOf).length() + 19).append("Invalid key stored ").append(strValueOf).toString());
                FirebaseInstanceId.m13027a().m13043h();
                keyPair = null;
            }
        }
        return keyPair;
    }
}
