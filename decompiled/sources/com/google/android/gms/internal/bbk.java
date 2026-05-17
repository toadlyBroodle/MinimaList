package com.google.android.gms.internal;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.google.firebase.C2213b;
import com.google.firebase.database.C2227c;
import com.google.firebase.database.C2268f;
import com.google.firebase.database.connection.idl.C2254o;
import com.google.firebase.database.connection.idl.C2257r;
import java.io.File;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class bbk implements bfc {

    /* JADX INFO: renamed from: a */
    private final Context f7733a;

    /* JADX INFO: renamed from: b */
    private final Set<String> f7734b = new HashSet();

    /* JADX INFO: renamed from: c */
    private final C2213b f7735c;

    public bbk(C2213b c2213b) {
        this.f7735c = c2213b;
        if (this.f7735c != null) {
            this.f7733a = this.f7735c.m12929a();
            return;
        }
        Log.e("FirebaseDatabase", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        Log.e("FirebaseDatabase", "ERROR: You must call FirebaseApp.initializeApp() before using Firebase Database.");
        Log.e("FirebaseDatabase", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        throw new RuntimeException("You need to call FirebaseApp.initializeApp() before using Firebase Database.");
    }

    @Override // com.google.android.gms.internal.bfc
    /* JADX INFO: renamed from: a */
    public final bdd mo8806a(bet betVar, bcz bczVar, bdb bdbVar, bde bdeVar) {
        C2257r c2257rM12991a = C2257r.m12991a(this.f7733a, new C2254o(bdbVar, betVar.m9122d(), (List<String>) null, betVar.m9123e(), C2268f.m13002c(), betVar.m9126h(), mo8811a()), bczVar, bdeVar);
        this.f7735c.m12933a(new bbn(this, c2257rM12991a));
        return c2257rM12991a;
    }

    @Override // com.google.android.gms.internal.bfc
    /* JADX INFO: renamed from: a */
    public final bel mo8807a(ScheduledExecutorService scheduledExecutorService) {
        return new bbe(this.f7735c, scheduledExecutorService);
    }

    @Override // com.google.android.gms.internal.bfc
    /* JADX INFO: renamed from: a */
    public final bez mo8808a(bet betVar) {
        return new bbj();
    }

    @Override // com.google.android.gms.internal.bfc
    /* JADX INFO: renamed from: a */
    public final bie mo8809a(bet betVar, String str) {
        String strM9127i = betVar.m9127i();
        String string = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(strM9127i).length()).append(str).append("_").append(strM9127i).toString();
        if (this.f7734b.contains(string)) {
            throw new C2227c(new StringBuilder(String.valueOf(strM9127i).length() + 47).append("SessionPersistenceKey '").append(strM9127i).append("' has already been used.").toString());
        }
        this.f7734b.add(string);
        return new bib(betVar, new bbq(this.f7733a, betVar, string), new bic(betVar.m9124f()));
    }

    @Override // com.google.android.gms.internal.bfc
    /* JADX INFO: renamed from: a */
    public final bkm mo8810a(bet betVar, bkn bknVar, List<String> list) {
        return new bkh(bknVar, null);
    }

    @Override // com.google.android.gms.internal.bfc
    /* JADX INFO: renamed from: a */
    public final File mo8811a() {
        return this.f7733a.getApplicationContext().getDir("sslcache", 0);
    }

    @Override // com.google.android.gms.internal.bfc
    /* JADX INFO: renamed from: b */
    public final bgd mo8812b(bet betVar) {
        return new bbl(this, betVar.m9117a("RunLoop"));
    }

    @Override // com.google.android.gms.internal.bfc
    /* JADX INFO: renamed from: c */
    public final String mo8813c(bet betVar) {
        return new StringBuilder(19).append(Build.VERSION.SDK_INT).append("/Android").toString();
    }
}
