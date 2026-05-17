package ca.toadlybroodledev.sublist.p030a;

import android.text.TextUtils;
import android.util.Log;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

/* JADX INFO: renamed from: ca.toadlybroodledev.sublist.a.h */
/* JADX INFO: loaded from: classes.dex */
public class C0546h {
    /* JADX INFO: renamed from: a */
    public static PublicKey m4839a(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(C0539a.m4805a(str)));
        } catch (C0540b e) {
            Log.e("IABUtil/Security", "Base64 decoding failed.");
            throw new IllegalArgumentException(e);
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2);
        } catch (InvalidKeySpecException e3) {
            Log.e("IABUtil/Security", "Invalid key specification.");
            throw new IllegalArgumentException(e3);
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m4840a(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str3)) {
            return m4841a(m4839a(str), str2, str3);
        }
        Log.e("IABUtil/Security", "Purchase verification failed: missing data.");
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m4841a(PublicKey publicKey, String str, String str2) {
        try {
            Signature signature = Signature.getInstance("SHA1withRSA");
            signature.initVerify(publicKey);
            signature.update(str.getBytes());
            if (signature.verify(C0539a.m4805a(str2))) {
                return true;
            }
            Log.e("IABUtil/Security", "Signature verification failed.");
            return false;
        } catch (C0540b e) {
            Log.e("IABUtil/Security", "Base64 decoding failed.");
            return false;
        } catch (InvalidKeyException e2) {
            Log.e("IABUtil/Security", "Invalid key specification.");
            return false;
        } catch (NoSuchAlgorithmException e3) {
            Log.e("IABUtil/Security", "NoSuchAlgorithmException.");
            return false;
        } catch (SignatureException e4) {
            Log.e("IABUtil/Security", "Signature exception.");
            return false;
        }
    }
}
