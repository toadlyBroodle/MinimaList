package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* JADX INFO: renamed from: com.google.android.gms.dynamite.b */
/* JADX INFO: loaded from: classes.dex */
final class C1326b implements DynamiteModule.InterfaceC1324d {
    C1326b() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.InterfaceC1324d
    /* JADX INFO: renamed from: a */
    public final C1334j mo7342a(Context context, String str, InterfaceC1333i interfaceC1333i) {
        C1334j c1334j = new C1334j();
        c1334j.f6080b = interfaceC1333i.mo7341a(context, str, true);
        if (c1334j.f6080b != 0) {
            c1334j.f6081c = 1;
        } else {
            c1334j.f6079a = interfaceC1333i.mo7340a(context, str);
            if (c1334j.f6079a != 0) {
                c1334j.f6081c = -1;
            }
        }
        return c1334j;
    }
}
