package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class bjw {

    /* JADX INFO: renamed from: b */
    private static bkf f8298b = new bjx();

    /* JADX INFO: renamed from: a */
    private final bke f8299a;

    public bjw(bke bkeVar) {
        this.f8299a = bkeVar;
    }

    /* JADX INFO: renamed from: a */
    private final bjv m9503a(bjv bjvVar, bfa bfaVar, beo beoVar, bhp bhpVar, bln blnVar, boolean z, bkb bkbVar) {
        if (bjvVar.m9501c().m9440c().mo9568b() && !bjvVar.m9501c().m9436a()) {
            return bjvVar;
        }
        if (!bfaVar.m9162h()) {
            beoVar = beo.m9094a().m9099a(bfaVar, beoVar);
        }
        bln blnVarM9440c = bjvVar.m9501c().m9440c();
        Map<bkp, beo> mapM9109d = beoVar.m9109d();
        bjv bjvVarM9506a = bjvVar;
        for (Map.Entry<bkp, beo> entry : mapM9109d.entrySet()) {
            bkp key = entry.getKey();
            if (blnVarM9440c.mo9565a(key)) {
                bjvVarM9506a = m9506a(bjvVarM9506a, new bfa(key), entry.getValue().m9102a(blnVarM9440c.mo9570c(key)), bhpVar, blnVar, z, bkbVar);
            }
        }
        for (Map.Entry<bkp, beo> entry2 : mapM9109d.entrySet()) {
            bkp key2 = entry2.getKey();
            boolean z2 = !bjvVar.m9501c().m9438a(key2) && entry2.getValue().m9104b() == null;
            if (!blnVarM9440c.mo9565a(key2) && !z2) {
                bjvVarM9506a = m9506a(bjvVarM9506a, new bfa(key2), entry2.getValue().m9102a(blnVarM9440c.mo9570c(key2)), bhpVar, blnVar, z, bkbVar);
            }
        }
        return bjvVarM9506a;
    }

    /* JADX INFO: renamed from: a */
    private final bjv m9504a(bjv bjvVar, bfa bfaVar, bhp bhpVar, bkf bkfVar, bkb bkbVar) {
        bln blnVarM9338a;
        blf blfVarMo9521a;
        bln blnVarM9339a;
        bje bjeVarM9497a = bjvVar.m9497a();
        if (bhpVar.m9336a(bfaVar) != null) {
            return bjvVar;
        }
        if (bfaVar.m9162h()) {
            if (bjvVar.m9501c().m9439b()) {
                bln blnVarM9502d = bjvVar.m9502d();
                if (!(blnVarM9502d instanceof bkr)) {
                    blnVarM9502d = bld.m9605j();
                }
                blnVarM9339a = bhpVar.m9340b(blnVarM9502d);
            } else {
                blnVarM9339a = bhpVar.m9339a(bjvVar.m9502d());
            }
            blfVarMo9521a = this.f8299a.mo9522a(bjvVar.m9497a().m9441d(), blf.m9612a(blnVarM9339a, this.f8299a.mo9524b()), bkbVar);
        } else {
            bkp bkpVarM9158d = bfaVar.m9158d();
            if (bkpVarM9158d.m9555e()) {
                bln blnVarM9337a = bhpVar.m9337a(bfaVar, bjeVarM9497a.m9440c(), bjvVar.m9501c().m9440c());
                blfVarMo9521a = blnVarM9337a != null ? this.f8299a.mo9523a(bjeVarM9497a.m9441d(), blnVarM9337a) : bjeVarM9497a.m9441d();
            } else {
                bfa bfaVarM9159e = bfaVar.m9159e();
                if (bjeVarM9497a.m9438a(bkpVarM9158d)) {
                    bln blnVarM9337a2 = bhpVar.m9337a(bfaVar, bjeVarM9497a.m9440c(), bjvVar.m9501c().m9440c());
                    blnVarM9338a = blnVarM9337a2 != null ? bjeVarM9497a.m9440c().mo9570c(bkpVarM9158d).mo9561a(bfaVarM9159e, blnVarM9337a2) : bjeVarM9497a.m9440c().mo9570c(bkpVarM9158d);
                } else {
                    blnVarM9338a = bhpVar.m9338a(bkpVarM9158d, bjvVar.m9501c());
                }
                blfVarMo9521a = blnVarM9338a != null ? this.f8299a.mo9521a(bjeVarM9497a.m9441d(), bkpVarM9158d, blnVarM9338a, bfaVarM9159e, bkfVar, bkbVar) : bjeVarM9497a.m9441d();
            }
        }
        return bjvVar.m9498a(blfVarMo9521a, bjeVarM9497a.m9436a() || bfaVar.m9162h(), this.f8299a.mo9525c());
    }

    /* JADX INFO: renamed from: a */
    private final bjv m9505a(bjv bjvVar, bfa bfaVar, bln blnVar, bhp bhpVar, bln blnVar2, bkb bkbVar) {
        bln blnVarMo9510a;
        bje bjeVarM9497a = bjvVar.m9497a();
        bka bkaVar = new bka(bhpVar, bjvVar, blnVar2);
        if (bfaVar.m9162h()) {
            return bjvVar.m9498a(this.f8299a.mo9522a(bjvVar.m9497a().m9441d(), blf.m9612a(blnVar, this.f8299a.mo9524b()), bkbVar), true, this.f8299a.mo9525c());
        }
        bkp bkpVarM9158d = bfaVar.m9158d();
        if (bkpVarM9158d.m9555e()) {
            return bjvVar.m9498a(this.f8299a.mo9523a(bjvVar.m9497a().m9441d(), blnVar), bjeVarM9497a.m9436a(), bjeVarM9497a.m9439b());
        }
        bfa bfaVarM9159e = bfaVar.m9159e();
        bln blnVarMo9570c = bjeVarM9497a.m9440c().mo9570c(bkpVarM9158d);
        if (bfaVarM9159e.m9162h()) {
            blnVarMo9510a = blnVar;
        } else {
            blnVarMo9510a = bkaVar.mo9510a(bkpVarM9158d);
            if (blnVarMo9510a == null) {
                blnVarMo9510a = bld.m9605j();
            } else if (!bfaVarM9159e.m9161g().m9555e() || !blnVarMo9510a.mo9560a(bfaVarM9159e.m9160f()).mo9568b()) {
                blnVarMo9510a = blnVarMo9510a.mo9561a(bfaVarM9159e, blnVar);
            }
        }
        return !blnVarMo9570c.equals(blnVarMo9510a) ? bjvVar.m9498a(this.f8299a.mo9521a(bjeVarM9497a.m9441d(), bkpVarM9158d, blnVarMo9510a, bfaVarM9159e, bkaVar, bkbVar), bjeVarM9497a.m9436a(), this.f8299a.mo9525c()) : bjvVar;
    }

    /* JADX INFO: renamed from: a */
    private final bjv m9506a(bjv bjvVar, bfa bfaVar, bln blnVar, bhp bhpVar, bln blnVar2, boolean z, bkb bkbVar) {
        blf blfVarMo9523a;
        bje bjeVarM9501c = bjvVar.m9501c();
        bke bkeVarMo9520a = z ? this.f8299a : this.f8299a.mo9520a();
        if (bfaVar.m9162h()) {
            blfVarMo9523a = bkeVarMo9520a.mo9522a(bjeVarM9501c.m9441d(), blf.m9612a(blnVar, bkeVarMo9520a.mo9524b()), null);
        } else if (!bkeVarMo9520a.mo9525c() || bjeVarM9501c.m9439b()) {
            bkp bkpVarM9158d = bfaVar.m9158d();
            if (!bjeVarM9501c.m9437a(bfaVar) && bfaVar.m9163i() > 1) {
                return bjvVar;
            }
            bfa bfaVarM9159e = bfaVar.m9159e();
            bln blnVarMo9561a = bjeVarM9501c.m9440c().mo9570c(bkpVarM9158d).mo9561a(bfaVarM9159e, blnVar);
            blfVarMo9523a = bkpVarM9158d.m9555e() ? bkeVarMo9520a.mo9523a(bjeVarM9501c.m9441d(), blnVarMo9561a) : bkeVarMo9520a.mo9521a(bjeVarM9501c.m9441d(), bkpVarM9158d, blnVarMo9561a, bfaVarM9159e, f8298b, null);
        } else {
            bkp bkpVarM9158d2 = bfaVar.m9158d();
            blfVarMo9523a = bkeVarMo9520a.mo9522a(bjeVarM9501c.m9441d(), bjeVarM9501c.m9441d().m9615a(bkpVarM9158d2, bjeVarM9501c.m9440c().mo9570c(bkpVarM9158d2).mo9561a(bfaVar.m9159e(), blnVar)), null);
        }
        bjv bjvVarM9499b = bjvVar.m9499b(blfVarMo9523a, bjeVarM9501c.m9436a() || bfaVar.m9162h(), bkeVarMo9520a.mo9525c());
        return m9504a(bjvVarM9499b, bfaVar, bhpVar, new bka(bhpVar, bjvVarM9499b, blnVar2), bkbVar);
    }

    /* JADX INFO: renamed from: a */
    private static boolean m9507a(bjv bjvVar, bkp bkpVar) {
        return bjvVar.m9497a().m9438a(bkpVar);
    }

    /* JADX INFO: renamed from: a */
    public final bjz m9508a(bjv bjvVar, bhu bhuVar, bhp bhpVar, bln blnVar) {
        bjv bjvVarM9504a;
        bkb bkbVar = new bkb();
        switch (bjy.f8300a[bhuVar.m9350e().ordinal()]) {
            case 1:
                bhy bhyVar = (bhy) bhuVar;
                bjvVarM9504a = bhyVar.m9349d().m9352a() ? m9505a(bjvVar, bhyVar.m9348c(), bhyVar.m9355a(), bhpVar, blnVar, bkbVar) : m9506a(bjvVar, bhyVar.m9348c(), bhyVar.m9355a(), bhpVar, blnVar, bhyVar.m9349d().m9353b() || (bjvVar.m9501c().m9439b() && !bhyVar.m9348c().m9162h()), bkbVar);
                break;
            case 2:
                bht bhtVar = (bht) bhuVar;
                if (bhtVar.m9349d().m9352a()) {
                    bfa bfaVarM9348c = bhtVar.m9348c();
                    beo beoVarM9347a = bhtVar.m9347a();
                    bjv bjvVarM9505a = bjvVar;
                    for (Map.Entry<bfa, bln> entry : beoVarM9347a) {
                        bfa bfaVarM9152a = bfaVarM9348c.m9152a(entry.getKey());
                        if (m9507a(bjvVar, bfaVarM9152a.m9158d())) {
                            bjvVarM9505a = m9505a(bjvVarM9505a, bfaVarM9152a, entry.getValue(), bhpVar, blnVar, bkbVar);
                        }
                    }
                    for (Map.Entry<bfa, bln> entry2 : beoVarM9347a) {
                        bfa bfaVarM9152a2 = bfaVarM9348c.m9152a(entry2.getKey());
                        if (!m9507a(bjvVar, bfaVarM9152a2.m9158d())) {
                            bjvVarM9505a = m9505a(bjvVarM9505a, bfaVarM9152a2, entry2.getValue(), bhpVar, blnVar, bkbVar);
                        }
                    }
                    bjvVarM9504a = bjvVarM9505a;
                } else {
                    bjvVarM9504a = m9503a(bjvVar, bhtVar.m9348c(), bhtVar.m9347a(), bhpVar, blnVar, bhtVar.m9349d().m9353b() || bjvVar.m9501c().m9439b(), bkbVar);
                }
                break;
            case 3:
                bhr bhrVar = (bhr) bhuVar;
                if (bhrVar.m9346b()) {
                    bfa bfaVarM9348c2 = bhrVar.m9348c();
                    if (bhpVar.m9336a(bfaVarM9348c2) != null) {
                        bjvVarM9504a = bjvVar;
                    } else {
                        bka bkaVar = new bka(bhpVar, bjvVar, blnVar);
                        blf blfVarM9441d = bjvVar.m9497a().m9441d();
                        if (bfaVarM9348c2.m9162h() || bfaVarM9348c2.m9158d().m9555e()) {
                            blfVarM9441d = this.f8299a.mo9522a(blfVarM9441d, blf.m9612a(bjvVar.m9501c().m9436a() ? bhpVar.m9339a(bjvVar.m9502d()) : bhpVar.m9340b(bjvVar.m9501c().m9440c()), this.f8299a.mo9524b()), bkbVar);
                        } else {
                            bkp bkpVarM9158d = bfaVarM9348c2.m9158d();
                            bln blnVarM9338a = bhpVar.m9338a(bkpVarM9158d, bjvVar.m9501c());
                            if (blnVarM9338a == null && bjvVar.m9501c().m9438a(bkpVarM9158d)) {
                                blnVarM9338a = blfVarM9441d.m9616a().mo9570c(bkpVarM9158d);
                            }
                            if (blnVarM9338a != null) {
                                blfVarM9441d = this.f8299a.mo9521a(blfVarM9441d, bkpVarM9158d, blnVarM9338a, bfaVarM9348c2.m9159e(), bkaVar, bkbVar);
                            } else if (blnVarM9338a == null && bjvVar.m9497a().m9440c().mo9565a(bkpVarM9158d)) {
                                blfVarM9441d = this.f8299a.mo9521a(blfVarM9441d, bkpVarM9158d, bld.m9605j(), bfaVarM9348c2.m9159e(), bkaVar, bkbVar);
                            }
                            if (blfVarM9441d.m9616a().mo9568b() && bjvVar.m9501c().m9436a()) {
                                bln blnVarM9339a = bhpVar.m9339a(bjvVar.m9502d());
                                if (blnVarM9339a.mo9572e()) {
                                    blfVarM9441d = this.f8299a.mo9522a(blfVarM9441d, blf.m9612a(blnVarM9339a, this.f8299a.mo9524b()), bkbVar);
                                }
                            }
                        }
                        bjvVarM9504a = bjvVar.m9498a(blfVarM9441d, bjvVar.m9501c().m9436a() || bhpVar.m9336a(bfa.m9147a()) != null, this.f8299a.mo9525c());
                    }
                } else {
                    bfa bfaVarM9348c3 = bhrVar.m9348c();
                    bit<Boolean> bitVarM9345a = bhrVar.m9345a();
                    if (bhpVar.m9336a(bfaVarM9348c3) != null) {
                        bjvVarM9504a = bjvVar;
                    } else {
                        boolean zM9439b = bjvVar.m9501c().m9439b();
                        bje bjeVarM9501c = bjvVar.m9501c();
                        if (bitVarM9345a.m9415b() == null) {
                            beo beoVarM9094a = beo.m9094a();
                            Iterator<Map.Entry<bfa, Boolean>> it = bitVarM9345a.iterator();
                            while (it.hasNext()) {
                                bfa key = it.next().getKey();
                                bfa bfaVarM9152a3 = bfaVarM9348c3.m9152a(key);
                                if (bjeVarM9501c.m9437a(bfaVarM9152a3)) {
                                    beoVarM9094a = beoVarM9094a.m9100a(key, bjeVarM9501c.m9440c().mo9560a(bfaVarM9152a3));
                                }
                            }
                            bjvVarM9504a = m9503a(bjvVar, bfaVarM9348c3, beoVarM9094a, bhpVar, blnVar, zM9439b, bkbVar);
                        } else if ((bfaVarM9348c3.m9162h() && bjeVarM9501c.m9436a()) || bjeVarM9501c.m9437a(bfaVarM9348c3)) {
                            bjvVarM9504a = m9506a(bjvVar, bfaVarM9348c3, bjeVarM9501c.m9440c().mo9560a(bfaVarM9348c3), bhpVar, blnVar, zM9439b, bkbVar);
                        } else if (bfaVarM9348c3.m9162h()) {
                            beo beoVarM9094a2 = beo.m9094a();
                            for (blm blmVar : bjeVarM9501c.m9440c()) {
                                beoVarM9094a2 = beoVarM9094a2.m9101a(blmVar.m9626c(), blmVar.m9627d());
                            }
                            bjvVarM9504a = m9503a(bjvVar, bfaVarM9348c3, beoVarM9094a2, bhpVar, blnVar, zM9439b, bkbVar);
                        } else {
                            bjvVarM9504a = bjvVar;
                        }
                    }
                }
                break;
            case 4:
                bfa bfaVarM9348c4 = bhuVar.m9348c();
                bje bjeVarM9501c2 = bjvVar.m9501c();
                bjvVarM9504a = m9504a(bjvVar.m9499b(bjeVarM9501c2.m9441d(), bjeVarM9501c2.m9436a() || bfaVarM9348c4.m9162h(), bjeVarM9501c2.m9439b()), bfaVarM9348c4, bhpVar, f8298b, bkbVar);
                break;
            default:
                String strValueOf = String.valueOf(bhuVar.m9350e());
                throw new AssertionError(new StringBuilder(String.valueOf(strValueOf).length() + 19).append("Unknown operation: ").append(strValueOf).toString());
        }
        ArrayList arrayList = new ArrayList(bkbVar.m9518a());
        bje bjeVarM9497a = bjvVarM9504a.m9497a();
        if (bjeVarM9497a.m9436a()) {
            boolean z = bjeVarM9497a.m9440c().mo9572e() || bjeVarM9497a.m9440c().mo9568b();
            if (!arrayList.isEmpty() || !bjvVar.m9497a().m9436a() || ((z && !bjeVarM9497a.m9440c().equals(bjvVar.m9500b())) || !bjeVarM9497a.m9440c().mo9573f().equals(bjvVar.m9500b().mo9573f()))) {
                arrayList.add(bjg.m9447a(bjeVarM9497a.m9441d()));
            }
        }
        return new bjz(bjvVarM9504a, arrayList);
    }
}
