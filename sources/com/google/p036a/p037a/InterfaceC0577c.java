package com.google.p036a.p037a;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: renamed from: com.google.a.a.c */
/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.FIELD, ElementType.METHOD})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface InterfaceC0577c {
    /* JADX INFO: renamed from: a */
    String m5033a();

    /* JADX INFO: renamed from: b */
    String[] m5034b() default {};
}
