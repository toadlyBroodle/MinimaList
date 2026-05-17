package ca.toadlybroodledev.sublist;

import android.content.Context;
import android.support.p005c.ApplicationC0022b;
import android.support.p005c.C0021a;

// Phase 3.2: removed imports com.google.android.gms.analytics.{C0889d,C0890e,C0893h}
//            and com.google.firebase.analytics.FirebaseAnalytics.

/* JADX INFO: loaded from: classes.dex */
public class AppMain extends ApplicationC0022b {

    // Phase 3.2: removed static fields f3724a (GoogleAnalytics tracker),
    //            f3725b (Tracker), f3726c (FirebaseAnalytics).

    // Phase 3.2: removed public static void m4792a(String item, String type)
    //   Analytics-log wrapper. Called from 44 sites across 10 files; all sites also
    //   removed in this phase. Event-name catalog preserved in
    //   docs/REMOVED-CLOUD-SURFACE.md.

    // Phase 3.5 (deferred): static String m4793b() returned a base64 fragment of a
    //   Google Play licensing/billing public key. Will be removed with the rest of
    //   the billing surface.
    /* JADX INFO: renamed from: b */
    static String m4793b() {
        return "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAjKy4VG7hyLiVVxRS7y6vnBAEPmma+KUSbfkH/gK0MrLlwvc8O+bTnD89uTV1iNioibLfmTjY7CIq2qkiOXumLUi8ZJYsqkC4QKLVJ1tIvGbCtk//nNoeSVyfqglNfWYTgoIPHMczmMYc1LXlxUoLZV795tgCnizC6MhcC1yqzngMzNlftqAnT0tbxzikyYPKaQeRFJrJJxeXwq6d5zRb84+YLd1FRNv11i7EWqboy4N11btN";
    }

    // Phase 3.2: removed public static void m4794b(String name, String value)
    //   Firebase user-property setter; delegated to m4792a. 4 call sites also removed.

    // Phase 3.2: removed public void m4795a()
    //   Initialized GoogleAnalytics (tracker UA-85711908-1) + FirebaseAnalytics
    //   instance. Sole caller: ActMain.java:591 — also removed.

    @Override // android.support.p005c.ApplicationC0022b, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        C0021a.m118a(this);
    }
}
