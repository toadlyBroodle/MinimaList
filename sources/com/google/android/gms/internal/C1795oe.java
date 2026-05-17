package com.google.android.gms.internal;

import android.webkit.ConsoleMessage;

/* JADX INFO: renamed from: com.google.android.gms.internal.oe */
/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class C1795oe {

    /* JADX INFO: renamed from: a */
    static final /* synthetic */ int[] f11212a = new int[ConsoleMessage.MessageLevel.values().length];

    static {
        try {
            f11212a[ConsoleMessage.MessageLevel.ERROR.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            f11212a[ConsoleMessage.MessageLevel.WARNING.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            f11212a[ConsoleMessage.MessageLevel.LOG.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            f11212a[ConsoleMessage.MessageLevel.TIP.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
        }
        try {
            f11212a[ConsoleMessage.MessageLevel.DEBUG.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
        }
    }
}
