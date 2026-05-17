package com.google.p036a.p037a;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: renamed from: com.google.a.a.b */
/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface InterfaceC0576b {
    /* JADX INFO: renamed from: a */
    Class<?> m5031a();

    /* JADX INFO: renamed from: b */
    boolean m5032b() default true;
}
