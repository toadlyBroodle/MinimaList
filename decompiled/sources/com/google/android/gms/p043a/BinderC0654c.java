package com.google.android.gms.p043a;

import android.os.IBinder;
import com.google.android.gms.p043a.InterfaceC0652a;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: com.google.android.gms.a.c */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC0654c<T> extends InterfaceC0652a.a {

    /* JADX INFO: renamed from: a */
    private final T f4335a;

    private BinderC0654c(T t) {
        this.f4335a = t;
    }

    /* JADX INFO: renamed from: a */
    public static <T> InterfaceC0652a m5329a(T t) {
        return new BinderC0654c(t);
    }

    /* JADX INFO: renamed from: a */
    public static <T> T m5330a(InterfaceC0652a interfaceC0652a) {
        int i = 0;
        if (interfaceC0652a instanceof BinderC0654c) {
            return ((BinderC0654c) interfaceC0652a).f4335a;
        }
        IBinder iBinderAsBinder = interfaceC0652a.asBinder();
        Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        Field field = null;
        int length = declaredFields.length;
        int i2 = 0;
        while (i2 < length) {
            Field field2 = declaredFields[i2];
            if (field2.isSynthetic()) {
                field2 = field;
            } else {
                i++;
            }
            i2++;
            field = field2;
        }
        if (i != 1) {
            throw new IllegalArgumentException(new StringBuilder(64).append("Unexpected number of IObjectWrapper declared fields: ").append(declaredFields.length).toString());
        }
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return (T) field.get(iBinderAsBinder);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
        } catch (NullPointerException e2) {
            throw new IllegalArgumentException("Binder object is null.", e2);
        }
    }
}
