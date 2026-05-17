package android.support.v4.p006a;

import android.app.Notification;
import android.os.Bundle;
import android.support.v4.p006a.C0136ab;
import android.util.Log;
import android.util.SparseArray;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: android.support.v4.a.ad */
/* JADX INFO: loaded from: classes.dex */
class C0138ad {

    /* JADX INFO: renamed from: b */
    private static Field f730b;

    /* JADX INFO: renamed from: c */
    private static boolean f731c;

    /* JADX INFO: renamed from: a */
    private static final Object f729a = new Object();

    /* JADX INFO: renamed from: d */
    private static final Object f732d = new Object();

    /* JADX INFO: renamed from: a */
    public static Bundle m800a(Notification.Builder builder, C0136ab.a aVar) {
        builder.addAction(aVar.m766a(), aVar.m767b(), aVar.m768c());
        Bundle bundle = new Bundle(aVar.m769d());
        if (aVar.m771f() != null) {
            bundle.putParcelableArray("android.support.remoteInputs", m804a(aVar.m771f()));
        }
        if (aVar.m772g() != null) {
            bundle.putParcelableArray("android.support.dataRemoteInputs", m804a(aVar.m772g()));
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.m770e());
        return bundle;
    }

    /* JADX INFO: renamed from: a */
    public static Bundle m801a(Notification notification) {
        synchronized (f729a) {
            if (f731c) {
                return null;
            }
            try {
                if (f730b == null) {
                    Field declaredField = Notification.class.getDeclaredField("extras");
                    if (!Bundle.class.isAssignableFrom(declaredField.getType())) {
                        Log.e("NotificationCompat", "Notification.extras field is not of type Bundle");
                        f731c = true;
                        return null;
                    }
                    declaredField.setAccessible(true);
                    f730b = declaredField;
                }
                Bundle bundle = (Bundle) f730b.get(notification);
                if (bundle == null) {
                    bundle = new Bundle();
                    f730b.set(notification, bundle);
                }
                return bundle;
            } catch (IllegalAccessException e) {
                Log.e("NotificationCompat", "Unable to access notification extras", e);
                f731c = true;
                return null;
            } catch (NoSuchFieldException e2) {
                Log.e("NotificationCompat", "Unable to access notification extras", e2);
                f731c = true;
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static Bundle m802a(C0140af c0140af) {
        Bundle bundle = new Bundle();
        bundle.putString("resultKey", c0140af.m809a());
        bundle.putCharSequence("label", c0140af.m810b());
        bundle.putCharSequenceArray("choices", c0140af.m811c());
        bundle.putBoolean("allowFreeFormInput", c0140af.m813e());
        bundle.putBundle("extras", c0140af.m814f());
        Set<String> setM812d = c0140af.m812d();
        if (setM812d != null && !setM812d.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList<>(setM812d.size());
            Iterator<String> it = setM812d.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            bundle.putStringArrayList("allowedDataTypes", arrayList);
        }
        return bundle;
    }

    /* JADX INFO: renamed from: a */
    public static SparseArray<Bundle> m803a(List<Bundle> list) {
        SparseArray<Bundle> sparseArray = null;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Bundle bundle = list.get(i);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                sparseArray.put(i, bundle);
            }
        }
        return sparseArray;
    }

    /* JADX INFO: renamed from: a */
    private static Bundle[] m804a(C0140af[] c0140afArr) {
        if (c0140afArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[c0140afArr.length];
        for (int i = 0; i < c0140afArr.length; i++) {
            bundleArr[i] = m802a(c0140afArr[i]);
        }
        return bundleArr;
    }
}
