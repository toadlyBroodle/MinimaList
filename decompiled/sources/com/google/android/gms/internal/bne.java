package com.google.android.gms.internal;

import android.util.Base64;
import com.google.android.gms.p051b.AbstractC0964e;
import com.google.android.gms.p051b.C0965f;
import com.google.firebase.database.C2227c;
import com.google.firebase.database.C2266d;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes.dex */
public final class bne {

    /* JADX INFO: renamed from: a */
    private static final char[] f8465a = "0123456789abcdef".toCharArray();

    /* JADX INFO: renamed from: a */
    public static int m9691a(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    /* JADX INFO: renamed from: a */
    public static int m9692a(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    /* JADX INFO: renamed from: a */
    public static bnb<AbstractC0964e<Void>, C2266d.a> m9693a(C2266d.a aVar) {
        if (aVar != null) {
            return new bnb<>(null, aVar);
        }
        C0965f c0965f = new C0965f();
        return new bnb<>(c0965f.m6217a(), new bnf(c0965f));
    }

    /* JADX INFO: renamed from: a */
    public static bnc m9694a(String str) {
        String strConcat;
        try {
            int iIndexOf = str.indexOf("//");
            if (iIndexOf == -1) {
                throw new URISyntaxException(str, "Invalid scheme specified");
            }
            int iIndexOf2 = str.substring(iIndexOf + 2).indexOf("/");
            if (iIndexOf2 != -1) {
                int i = iIndexOf + 2 + iIndexOf2;
                String[] strArrSplit = str.substring(i).split("/");
                StringBuilder sb = new StringBuilder();
                for (int i2 = 0; i2 < strArrSplit.length; i2++) {
                    if (!strArrSplit[i2].equals("")) {
                        sb.append("/");
                        sb.append(URLEncoder.encode(strArrSplit[i2], "UTF-8"));
                    }
                }
                String strValueOf = String.valueOf(str.substring(0, i));
                String strValueOf2 = String.valueOf(sb.toString());
                strConcat = strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
            } else {
                strConcat = str;
            }
            URI uri = new URI(strConcat);
            String strReplace = uri.getPath().replace("+", " ");
            bng.m9705b(strReplace);
            bfa bfaVar = new bfa(strReplace);
            String scheme = uri.getScheme();
            bgb bgbVar = new bgb();
            bgbVar.f8074a = uri.getHost().toLowerCase();
            int port = uri.getPort();
            if (port != -1) {
                bgbVar.f8075b = scheme.equals("https");
                String strValueOf3 = String.valueOf(bgbVar.f8074a);
                bgbVar.f8074a = new StringBuilder(String.valueOf(strValueOf3).length() + 12).append(strValueOf3).append(":").append(port).toString();
            } else {
                bgbVar.f8075b = true;
            }
            bgbVar.f8076c = bgbVar.f8074a.split("\\.")[0].toLowerCase();
            bgbVar.f8077d = bgbVar.f8074a;
            bnc bncVar = new bnc();
            bncVar.f8461b = bfaVar;
            bncVar.f8460a = bgbVar;
            return bncVar;
        } catch (UnsupportedEncodingException e) {
            throw new C2227c("Failed to URLEncode the path", e);
        } catch (URISyntaxException e2) {
            throw new C2227c("Invalid Firebase Database url specified", e2);
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m9695a(double d) {
        StringBuilder sb = new StringBuilder(16);
        long jDoubleToLongBits = Double.doubleToLongBits(d);
        for (int i = 7; i >= 0; i--) {
            int i2 = (int) ((jDoubleToLongBits >>> (i << 3)) & 255);
            sb.append(f8465a[(i2 >> 4) & 15]);
            sb.append(f8465a[i2 & 15]);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public static void m9696a(boolean z) {
        m9697a(z, "");
    }

    /* JADX INFO: renamed from: a */
    public static void m9697a(boolean z, String str) {
        if (z) {
            return;
        }
        String strValueOf = String.valueOf(str);
        throw new AssertionError(strValueOf.length() != 0 ? "hardAssert failed: ".concat(strValueOf) : new String("hardAssert failed: "));
    }

    /* JADX INFO: renamed from: b */
    public static String m9698b(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(str.getBytes("UTF-8"));
            return Base64.encodeToString(messageDigest.digest(), 2);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 encoding is required for Firebase Database to run!");
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException("Missing SHA-1 MessageDigest provider.", e2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m9699c(String str) {
        String strReplace = str.indexOf(92) != -1 ? str.replace("\\", "\\\\") : str;
        if (str.indexOf(34) != -1) {
            strReplace = strReplace.replace("\"", "\\\"");
        }
        return new StringBuilder(String.valueOf(strReplace).length() + 2).append("\"").append(strReplace).append("\"").toString();
    }

    /* JADX INFO: renamed from: d */
    public static Integer m9700d(String str) {
        boolean z = true;
        int i = 0;
        if (str.length() > 11 || str.length() == 0) {
            return null;
        }
        if (str.charAt(0) != '-') {
            z = false;
        } else {
            if (str.length() == 1) {
                return null;
            }
            i = 1;
        }
        long j = 0;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt < '0' || cCharAt > '9') {
                return null;
            }
            j = (j * 10) + ((long) (cCharAt - '0'));
            i++;
        }
        if (z) {
            if ((-j) < -2147483648L) {
                return null;
            }
            return Integer.valueOf((int) (-j));
        }
        if (j > 2147483647L) {
            return null;
        }
        return Integer.valueOf((int) j);
    }
}
