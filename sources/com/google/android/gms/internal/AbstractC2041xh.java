package com.google.android.gms.internal;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.xh */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2041xh<K, V> {

    /* JADX INFO: renamed from: a */
    private static final String f12293a = AbstractC2041xh.class.getSimpleName();

    /* JADX INFO: renamed from: b */
    protected static <K, V> HashMap<K, V> m12564b(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                return (HashMap) new ObjectInputStream(new ByteArrayInputStream(Base64.decode(str.getBytes(), 0))).readObject();
            }
        } catch (IOException | ClassNotFoundException e) {
            Log.d(f12293a, "decode object failure");
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    protected abstract HashMap<K, V> mo7931a();

    /* JADX INFO: renamed from: a */
    protected abstract void mo7932a(String str);

    public String toString() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(mo7931a());
            objectOutputStream.close();
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        } catch (IOException e) {
            return null;
        }
    }
}
