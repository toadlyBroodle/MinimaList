package com.google.android.gms.internal;

import com.google.android.gms.internal.avq;
import com.google.android.gms.internal.awa;
import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class asu {

    /* JADX INFO: renamed from: a */
    private static final Logger f7228a = Logger.getLogger(asu.class.getName());

    /* JADX INFO: renamed from: b */
    private static final ConcurrentMap<String, asl> f7229b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c */
    private static final ConcurrentMap<String, Boolean> f7230c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: d */
    private static final ConcurrentMap<String, asf> f7231d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public static asf m8287a(String str) throws GeneralSecurityException {
        if (str == null) {
            throw new IllegalArgumentException("catalogueName must be non-null.");
        }
        asf asfVar = f7231d.get(str.toLowerCase());
        if (asfVar != null) {
            return asfVar;
        }
        String strConcat = String.format("no catalogue found for %s. ", str);
        if (str.toLowerCase().startsWith("tinkaead")) {
            strConcat = String.valueOf(strConcat).concat("Maybe call AeadConfig.init().");
        } else if (str.toLowerCase().startsWith("tinkhybrid")) {
            strConcat = String.valueOf(strConcat).concat("Maybe call HybridConfig.init().");
        } else if (str.toLowerCase().startsWith("tinkmac")) {
            strConcat = String.valueOf(strConcat).concat("Maybe call MacConfig.init().");
        } else if (str.toLowerCase().startsWith("tinksignature")) {
            strConcat = String.valueOf(strConcat).concat("Maybe call SignatureConfig.init().");
        } else if (str.toLowerCase().startsWith("tink")) {
            strConcat = String.valueOf(strConcat).concat("Maybe call TinkConfig.init().");
        }
        throw new GeneralSecurityException(strConcat);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static <P> ass<P> m8288a(asm asmVar, asl<P> aslVar) throws GeneralSecurityException {
        awa awaVarM8276a = asmVar.m8276a();
        if (awaVarM8276a.m8565c() == 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        int iM8563a = awaVarM8276a.m8563a();
        boolean z = true;
        boolean z2 = false;
        for (awa.C1410b c1410b : awaVarM8276a.m8564b()) {
            if (!c1410b.m8568a()) {
                throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(c1410b.m8571e())));
            }
            if (c1410b.m8572f() == awm.UNKNOWN_PREFIX) {
                throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(c1410b.m8571e())));
            }
            if (c1410b.m8570c() == avu.UNKNOWN_STATUS) {
                throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(c1410b.m8571e())));
            }
            if (c1410b.m8570c() == avu.ENABLED && c1410b.m8571e() == iM8563a) {
                if (z2) {
                    throw new GeneralSecurityException("keyset contains multiple primary keys");
                }
                z2 = true;
            }
            z = c1410b.m8569b().m8520c() != avq.EnumC1405b.ASYMMETRIC_PUBLIC ? false : z;
        }
        if (!z2 && !z) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
        ass<P> assVar = (ass<P>) new ass();
        for (awa.C1410b c1410b2 : asmVar.m8276a().m8564b()) {
            if (c1410b2.m8570c() == avu.ENABLED) {
                ast astVarM8283a = assVar.m8283a(m8291a(c1410b2.m8569b().m8518a(), c1410b2.m8569b().m8519b()), c1410b2);
                if (c1410b2.m8571e() == asmVar.m8276a().m8563a()) {
                    assVar.m8284a(astVarM8283a);
                }
            }
        }
        return assVar;
    }

    /* JADX INFO: renamed from: a */
    public static <P> avq m8289a(avw avwVar) throws GeneralSecurityException {
        asl aslVarM8296b = m8296b(avwVar.m8536a());
        if (f7230c.get(avwVar.m8536a()).booleanValue()) {
            return aslVarM8296b.mo8274c(avwVar.m8537b());
        }
        String strValueOf = String.valueOf(avwVar.m8536a());
        throw new GeneralSecurityException(strValueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(strValueOf) : new String("newKey-operation not permitted for key type "));
    }

    /* JADX INFO: renamed from: a */
    public static <P> bqa m8290a(String str, bqa bqaVar) throws GeneralSecurityException {
        asl aslVarM8296b = m8296b(str);
        if (f7230c.get(str).booleanValue()) {
            return aslVarM8296b.mo8273b(bqaVar);
        }
        String strValueOf = String.valueOf(str);
        throw new GeneralSecurityException(strValueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(strValueOf) : new String("newKey-operation not permitted for key type "));
    }

    /* JADX INFO: renamed from: a */
    private static <P> P m8291a(String str, bob bobVar) {
        return (P) m8296b(str).mo8270a(bobVar);
    }

    /* JADX INFO: renamed from: a */
    public static <P> P m8292a(String str, byte[] bArr) {
        return (P) m8291a(str, bob.m9757a(bArr));
    }

    /* JADX INFO: renamed from: a */
    public static synchronized void m8293a(String str, asf asfVar) {
        if (f7231d.containsKey(str.toLowerCase())) {
            if (!asfVar.getClass().equals(f7231d.get(str.toLowerCase()).getClass())) {
                Logger logger = f7228a;
                Level level = Level.WARNING;
                String strValueOf = String.valueOf(str);
                logger.logp(level, "com.google.crypto.tink.Registry", "addCatalogue", strValueOf.length() != 0 ? "Attempted overwrite of a catalogueName catalogue for name ".concat(strValueOf) : new String("Attempted overwrite of a catalogueName catalogue for name "));
                throw new GeneralSecurityException(new StringBuilder(String.valueOf(str).length() + 47).append("catalogue for name ").append(str).append(" has been already registered").toString());
            }
        }
        f7231d.put(str.toLowerCase(), asfVar);
    }

    /* JADX INFO: renamed from: a */
    public static <P> void m8294a(String str, asl<P> aslVar) {
        m8295a(str, aslVar, true);
    }

    /* JADX INFO: renamed from: a */
    public static synchronized <P> void m8295a(String str, asl<P> aslVar, boolean z) {
        if (aslVar == null) {
            throw new IllegalArgumentException("key manager must be non-null.");
        }
        if (f7229b.containsKey(str)) {
            asl aslVarM8296b = m8296b(str);
            boolean zBooleanValue = f7230c.get(str).booleanValue();
            if (!aslVar.getClass().equals(aslVarM8296b.getClass()) || (!zBooleanValue && z)) {
                Logger logger = f7228a;
                Level level = Level.WARNING;
                String strValueOf = String.valueOf(str);
                logger.logp(level, "com.google.crypto.tink.Registry", "registerKeyManager", strValueOf.length() != 0 ? "Attempted overwrite of a registered key manager for key type ".concat(strValueOf) : new String("Attempted overwrite of a registered key manager for key type "));
                throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", str, aslVarM8296b.getClass().getName(), aslVar.getClass().getName()));
            }
        }
        f7229b.put(str, aslVar);
        f7230c.put(str, Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: b */
    private static <P> asl<P> m8296b(String str) throws GeneralSecurityException {
        asl<P> aslVar = f7229b.get(str);
        if (aslVar == null) {
            throw new GeneralSecurityException(new StringBuilder(String.valueOf(str).length() + 78).append("No key manager found for key type: ").append(str).append(".  Check the configuration of the registry.").toString());
        }
        return aslVar;
    }

    /* JADX INFO: renamed from: b */
    public static <P> bqa m8297b(avw avwVar) throws GeneralSecurityException {
        asl aslVarM8296b = m8296b(avwVar.m8536a());
        if (f7230c.get(avwVar.m8536a()).booleanValue()) {
            return aslVarM8296b.mo8272b(avwVar.m8537b());
        }
        String strValueOf = String.valueOf(avwVar.m8536a());
        throw new GeneralSecurityException(strValueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(strValueOf) : new String("newKey-operation not permitted for key type "));
    }

    /* JADX INFO: renamed from: b */
    public static <P> P m8298b(String str, bqa bqaVar) {
        return (P) m8296b(str).mo8271a(bqaVar);
    }
}
