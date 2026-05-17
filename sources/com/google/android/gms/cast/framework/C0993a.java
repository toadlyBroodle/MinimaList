package com.google.android.gms.cast.framework;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v7.p027d.C0376g;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.internal.BinderC1942tq;
import com.google.android.gms.internal.C1931tf;
import com.google.android.gms.internal.C1932tg;
import com.google.android.gms.internal.C1968up;
import com.google.android.gms.internal.C1992vm;
import com.google.android.gms.internal.C2040xg;
import com.google.android.gms.p043a.InterfaceC0652a;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.cast.framework.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0993a {

    /* JADX INFO: renamed from: a */
    private static final C1992vm f5218a = new C1992vm("CastContext");

    /* JADX INFO: renamed from: b */
    private static C0993a f5219b;

    /* JADX INFO: renamed from: c */
    private final Context f5220c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC1044t f5221d;

    /* JADX INFO: renamed from: e */
    private final C1006h f5222e;

    /* JADX INFO: renamed from: f */
    private final C1041q f5223f;

    /* JADX INFO: renamed from: g */
    private final C1004f f5224g;

    /* JADX INFO: renamed from: h */
    private final C1002d f5225h;

    /* JADX INFO: renamed from: i */
    private final C1000b f5226i;

    /* JADX INFO: renamed from: j */
    private BinderC1942tq f5227j;

    private C0993a(Context context, C1000b c1000b, List<AbstractC1007i> list) {
        InterfaceC1048x interfaceC1048xMo6527b;
        InterfaceC0997ad interfaceC0997adMo6526a;
        this.f5220c = context.getApplicationContext();
        this.f5226i = c1000b;
        this.f5227j = new BinderC1942tq(C0376g.m2892a(this.f5220c));
        HashMap map = new HashMap();
        C1932tg c1932tg = new C1932tg(this.f5220c, c1000b, this.f5227j);
        map.put(c1932tg.m6408b(), c1932tg.m6410d());
        if (list != null) {
            for (AbstractC1007i abstractC1007i : list) {
                C1221aj.m7066a(abstractC1007i, "Additional SessionProvider must not be null.");
                String strM7068a = C1221aj.m7068a(abstractC1007i.m6408b(), (Object) "Category for SessionProvider must not be null or empty string.");
                C1221aj.m7075b(!map.containsKey(strM7068a), String.format("SessionProvider for category %s already added", strM7068a));
                map.put(strM7068a, abstractC1007i.m6410d());
            }
        }
        this.f5221d = C1931tf.m12313a(this.f5220c, c1000b, this.f5227j, map);
        try {
            interfaceC1048xMo6527b = this.f5221d.mo6527b();
        } catch (RemoteException e) {
            f5218a.m12446a(e, "Unable to call %s on %s.", "getDiscoveryManagerImpl", InterfaceC1044t.class.getSimpleName());
            interfaceC1048xMo6527b = null;
        }
        this.f5223f = interfaceC1048xMo6527b == null ? null : new C1041q(interfaceC1048xMo6527b);
        try {
            interfaceC0997adMo6526a = this.f5221d.mo6526a();
        } catch (RemoteException e2) {
            f5218a.m12446a(e2, "Unable to call %s on %s.", "getSessionManagerImpl", InterfaceC1044t.class.getSimpleName());
            interfaceC0997adMo6526a = null;
        }
        this.f5222e = interfaceC0997adMo6526a == null ? null : new C1006h(interfaceC0997adMo6526a, this.f5220c);
        this.f5225h = new C1002d(this.f5222e);
        this.f5224g = this.f5222e != null ? new C1004f(this.f5226i, this.f5222e, new C1968up(this.f5220c)) : null;
    }

    /* JADX INFO: renamed from: a */
    public static C0993a m6331a(Context context) {
        C1221aj.m7073b("Must be called from the main thread.");
        if (f5219b == null) {
            InterfaceC1003e interfaceC1003eM6332b = m6332b(context.getApplicationContext());
            f5219b = new C0993a(context, interfaceC1003eM6332b.m6388a(context.getApplicationContext()), interfaceC1003eM6332b.m6389b(context.getApplicationContext()));
        }
        return f5219b;
    }

    /* JADX INFO: renamed from: b */
    private static InterfaceC1003e m6332b(Context context) {
        try {
            Bundle bundle = C2040xg.m12562a(context).m12556a(context.getPackageName(), 128).metaData;
            if (bundle == null) {
                f5218a.m12450d("Bundle is null", new Object[0]);
            }
            String string = bundle.getString("com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME");
            if (string == null) {
                throw new IllegalStateException("The fully qualified name of the implementation of OptionsProvider must be provided as a metadata in the AndroidManifest.xml with key com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME.");
            }
            return (InterfaceC1003e) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException e) {
            throw new IllegalStateException("Failed to initialize CastContext.", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public final C1000b m6333a() {
        C1221aj.m7073b("Must be called from the main thread.");
        return this.f5226i;
    }

    /* JADX INFO: renamed from: b */
    public final C1006h m6334b() {
        C1221aj.m7073b("Must be called from the main thread.");
        return this.f5222e;
    }

    /* JADX INFO: renamed from: c */
    public final C1041q m6335c() {
        C1221aj.m7073b("Must be called from the main thread.");
        return this.f5223f;
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC0652a m6336d() {
        try {
            return this.f5221d.mo6528c();
        } catch (RemoteException e) {
            f5218a.m12446a(e, "Unable to call %s on %s.", "getWrappedThis", InterfaceC1044t.class.getSimpleName());
            return null;
        }
    }
}
