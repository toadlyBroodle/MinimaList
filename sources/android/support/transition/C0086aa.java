package android.support.transition;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: android.support.transition.aa */
/* JADX INFO: loaded from: classes.dex */
public class C0086aa {

    /* JADX INFO: renamed from: b */
    public View f498b;

    /* JADX INFO: renamed from: a */
    public final Map<String, Object> f497a = new HashMap();

    /* JADX INFO: renamed from: c */
    final ArrayList<AbstractC0128u> f499c = new ArrayList<>();

    public boolean equals(Object obj) {
        return (obj instanceof C0086aa) && this.f498b == ((C0086aa) obj).f498b && this.f497a.equals(((C0086aa) obj).f497a);
    }

    public int hashCode() {
        return (this.f498b.hashCode() * 31) + this.f497a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f498b + "\n") + "    values:";
        Iterator<String> it = this.f497a.keySet().iterator();
        while (true) {
            String str2 = str;
            if (!it.hasNext()) {
                return str2;
            }
            String next = it.next();
            str = str2 + "    " + next + ": " + this.f497a.get(next) + "\n";
        }
    }
}
