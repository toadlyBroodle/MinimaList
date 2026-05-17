package com.google.android.gms.internal;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class caj {

    /* JADX INFO: renamed from: a */
    private final Collection<cac<?>> f9391a = new ArrayList();

    /* JADX INFO: renamed from: b */
    private final Collection<cac<String>> f9392b = new ArrayList();

    /* JADX INFO: renamed from: c */
    private final Collection<cac<String>> f9393c = new ArrayList();

    /* JADX INFO: renamed from: a */
    public final List<String> m10539a() {
        ArrayList arrayList = new ArrayList();
        Iterator<cac<String>> it = this.f9392b.iterator();
        while (it.hasNext()) {
            String str = (String) bxm.m10409f().m10546a(it.next());
            if (str != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public final void m10540a(SharedPreferences.Editor editor, int i, JSONObject jSONObject) {
        for (cac<?> cacVar : this.f9391a) {
            if (cacVar.m10537c() == 1) {
                cacVar.mo10535a(editor, cacVar.mo10533a(jSONObject));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m10541a(cac cacVar) {
        this.f9391a.add(cacVar);
    }

    /* JADX INFO: renamed from: b */
    public final List<String> m10542b() {
        List<String> listM10539a = m10539a();
        Iterator<cac<String>> it = this.f9393c.iterator();
        while (it.hasNext()) {
            String str = (String) bxm.m10409f().m10546a(it.next());
            if (str != null) {
                listM10539a.add(str);
            }
        }
        return listM10539a;
    }

    /* JADX INFO: renamed from: b */
    public final void m10543b(cac<String> cacVar) {
        this.f9392b.add(cacVar);
    }

    /* JADX INFO: renamed from: c */
    public final void m10544c(cac<String> cacVar) {
        this.f9393c.add(cacVar);
    }
}
