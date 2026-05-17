package com.google.android.gms.internal;

import com.google.android.gms.internal.axp;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes.dex */
public final class axo<T_WRAPPER extends axp<T_ENGINE>, T_ENGINE> {

    /* JADX INFO: renamed from: a */
    public static final axo<axq, Cipher> f7550a;

    /* JADX INFO: renamed from: b */
    public static final axo<axv, Mac> f7551b;

    /* JADX INFO: renamed from: c */
    public static final axo<axr, KeyAgreement> f7552c;

    /* JADX INFO: renamed from: d */
    public static final axo<axt, KeyPairGenerator> f7553d;

    /* JADX INFO: renamed from: e */
    private static final Logger f7554e = Logger.getLogger(axo.class.getName());

    /* JADX INFO: renamed from: f */
    private static final List<Provider> f7555f;

    /* JADX INFO: renamed from: g */
    private static axo<axx, Signature> f7556g;

    /* JADX INFO: renamed from: h */
    private static axo<axw, MessageDigest> f7557h;

    /* JADX INFO: renamed from: i */
    private static axo<axs, KeyFactory> f7558i;

    /* JADX INFO: renamed from: j */
    private T_WRAPPER f7559j;

    /* JADX INFO: renamed from: k */
    private List<Provider> f7560k = f7555f;

    /* JADX INFO: renamed from: l */
    private boolean f7561l = true;

    static {
        if (aye.m8683a()) {
            String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < 2; i++) {
                String str = strArr[i];
                Provider provider = Security.getProvider(str);
                if (provider != null) {
                    arrayList.add(provider);
                } else {
                    f7554e.logp(Level.INFO, "com.google.crypto.tink.subtle.EngineFactory", "toProviderList", String.format("Provider %s not available", str));
                }
            }
            f7555f = arrayList;
        } else {
            f7555f = new ArrayList();
        }
        f7550a = new axo<>(new axq());
        f7551b = new axo<>(new axv());
        f7556g = new axo<>(new axx());
        f7557h = new axo<>(new axw());
        f7552c = new axo<>(new axr());
        f7553d = new axo<>(new axt());
        f7558i = new axo<>(new axs());
    }

    private axo(T_WRAPPER t_wrapper) {
        this.f7559j = t_wrapper;
    }

    /* JADX INFO: renamed from: a */
    private final boolean m8672a(String str, Provider provider) {
        try {
            this.f7559j.mo8674a(str, provider);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public final T_ENGINE m8673a(String str) throws GeneralSecurityException {
        for (Provider provider : this.f7560k) {
            if (m8672a(str, provider)) {
                return (T_ENGINE) this.f7559j.mo8674a(str, provider);
            }
        }
        if (this.f7561l) {
            return (T_ENGINE) this.f7559j.mo8674a(str, null);
        }
        throw new GeneralSecurityException("No good Provider found.");
    }
}
