package android.support.v7.p027d;

import android.os.Messenger;

/* JADX INFO: renamed from: android.support.v7.d.e */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0374e {
    /* JADX INFO: renamed from: a */
    public static boolean m2879a(Messenger messenger) {
        if (messenger == null) {
            return false;
        }
        try {
            return messenger.getBinder() != null;
        } catch (NullPointerException e) {
            return false;
        }
    }
}
