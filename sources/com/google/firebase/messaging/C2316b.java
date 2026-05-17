package com.google.firebase.messaging;

import java.util.Locale;

/* JADX INFO: renamed from: com.google.firebase.messaging.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2316b extends Exception {

    /* JADX INFO: renamed from: a */
    private final int f13063a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    C2316b(String str) {
        super(str);
        int i = 1;
        if (str != null) {
            switch (str.toLowerCase(Locale.US)) {
                case "invalid_parameters":
                case "missing_to":
                    break;
                case "messagetoobig":
                    i = 2;
                    break;
                case "service_not_available":
                    i = 3;
                    break;
                case "toomanymessages":
                    i = 4;
                    break;
                default:
                    i = 0;
                    break;
            }
        }
        this.f13063a = i;
    }
}
