package com.google.android.gms.internal;

import com.google.firebase.database.C2226b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class bjt {

    /* JADX INFO: renamed from: a */
    private final bjs f8289a;

    /* JADX INFO: renamed from: b */
    private final bjw f8290b;

    /* JADX INFO: renamed from: c */
    private bjv f8291c;

    /* JADX INFO: renamed from: d */
    private final List<bex> f8292d;

    /* JADX INFO: renamed from: e */
    private final bjl f8293e;

    public bjt(bjs bjsVar, bjv bjvVar) {
        this.f8289a = bjsVar;
        bkc bkcVar = new bkc(bjsVar.m9484c());
        bke bkeVarM9479o = bjsVar.m9483b().m9479o();
        this.f8290b = new bjw(bkeVarM9479o);
        bje bjeVarM9501c = bjvVar.m9501c();
        bje bjeVarM9497a = bjvVar.m9497a();
        blf blfVarM9612a = blf.m9612a(bld.m9605j(), bjsVar.m9484c());
        blf blfVarMo9522a = bkcVar.mo9522a(blfVarM9612a, bjeVarM9501c.m9441d(), null);
        blf blfVarMo9522a2 = bkeVarM9479o.mo9522a(blfVarM9612a, bjeVarM9497a.m9441d(), null);
        this.f8291c = new bjv(new bje(blfVarMo9522a2, bjeVarM9497a.m9436a(), bkeVarM9479o.mo9525c()), new bje(blfVarMo9522a, bjeVarM9501c.m9436a(), false));
        this.f8292d = new ArrayList();
        this.f8293e = new bjl(bjsVar);
    }

    /* JADX INFO: renamed from: a */
    private final List<bji> m9487a(List<bjg> list, blf blfVar, bex bexVar) {
        return this.f8293e.m9460a(list, blfVar, bexVar == null ? this.f8292d : Arrays.asList(bexVar));
    }

    /* JADX INFO: renamed from: a */
    public final bjs m9488a() {
        return this.f8289a;
    }

    /* JADX INFO: renamed from: a */
    public final bju m9489a(bhu bhuVar, bhp bhpVar, bln blnVar) {
        if (bhuVar.m9350e() == bhv.Merge) {
            bhuVar.m9349d().m9354c();
        }
        bjz bjzVarM9508a = this.f8290b.m9508a(this.f8291c, bhuVar, bhpVar, blnVar);
        this.f8291c = bjzVarM9508a.f8301a;
        return new bju(m9487a(bjzVarM9508a.f8302b, bjzVarM9508a.f8301a.m9497a().m9441d(), (bex) null), bjzVarM9508a.f8302b);
    }

    /* JADX INFO: renamed from: a */
    public final bln m9490a(bfa bfaVar) {
        bln blnVarM9502d = this.f8291c.m9502d();
        if (blnVarM9502d == null || (!this.f8289a.m9486e() && (bfaVar.m9162h() || blnVarM9502d.mo9570c(bfaVar.m9158d()).mo9568b()))) {
            return null;
        }
        return blnVarM9502d.mo9560a(bfaVar);
    }

    /* JADX INFO: renamed from: a */
    public final List<bjj> m9491a(bex bexVar, C2226b c2226b) {
        List<bjj> listEmptyList;
        if (c2226b != null) {
            ArrayList arrayList = new ArrayList();
            bfa bfaVarM9482a = this.f8289a.m9482a();
            Iterator<bex> it = this.f8292d.iterator();
            while (it.hasNext()) {
                arrayList.add(new bjf(it.next(), c2226b, bfaVarM9482a));
            }
            listEmptyList = arrayList;
        } else {
            listEmptyList = Collections.emptyList();
        }
        if (bexVar != null) {
            int i = 0;
            int i2 = -1;
            while (true) {
                if (i >= this.f8292d.size()) {
                    i = i2;
                    break;
                }
                bex bexVar2 = this.f8292d.get(i);
                if (bexVar2.mo9137a(bexVar)) {
                    if (bexVar2.m9140c()) {
                        break;
                    }
                    i2 = i;
                }
                i++;
            }
            if (i != -1) {
                bex bexVar3 = this.f8292d.get(i);
                this.f8292d.remove(i);
                bexVar3.m9139b();
            }
        } else {
            Iterator<bex> it2 = this.f8292d.iterator();
            while (it2.hasNext()) {
                it2.next().m9139b();
            }
            this.f8292d.clear();
        }
        return listEmptyList;
    }

    /* JADX INFO: renamed from: a */
    public final void m9492a(bex bexVar) {
        this.f8292d.add(bexVar);
    }

    /* JADX INFO: renamed from: b */
    public final bln m9493b() {
        return this.f8291c.m9501c().m9440c();
    }

    /* JADX INFO: renamed from: b */
    public final List<bji> m9494b(bex bexVar) {
        bje bjeVarM9497a = this.f8291c.m9497a();
        ArrayList arrayList = new ArrayList();
        for (blm blmVar : bjeVarM9497a.m9440c()) {
            arrayList.add(bjg.m9445a(blmVar.m9626c(), blmVar.m9627d()));
        }
        if (bjeVarM9497a.m9436a()) {
            arrayList.add(bjg.m9447a(bjeVarM9497a.m9441d()));
        }
        return m9487a(arrayList, bjeVarM9497a.m9441d(), bexVar);
    }

    /* JADX INFO: renamed from: c */
    public final bln m9495c() {
        return this.f8291c.m9497a().m9440c();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m9496d() {
        return this.f8292d.isEmpty();
    }
}
