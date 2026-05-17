package android.support.v4.p018i;

import android.os.Build;
import java.util.Objects;

/* JADX INFO: renamed from: android.support.v4.i.i */
/* JADX INFO: loaded from: classes.dex */
public class C0215i {
    /* JADX INFO: renamed from: a */
    public static boolean m1567a(Object obj, Object obj2) {
        return Build.VERSION.SDK_INT >= 19 ? Objects.equals(obj, obj2) : obj == obj2 || (obj != null && obj.equals(obj2));
    }
}
