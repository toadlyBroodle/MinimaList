package ca.toadlybroodledev.sublist;

import android.content.Context;
import android.os.Bundle;
import android.support.p005c.ApplicationC0022b;
import android.support.p005c.C0021a;
import com.google.android.gms.analytics.C0889d;
import com.google.android.gms.analytics.C0890e;
import com.google.android.gms.analytics.C0893h;
import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes.dex */
public class AppMain extends ApplicationC0022b {

    /* JADX INFO: renamed from: a */
    public static C0889d f3724a;

    /* JADX INFO: renamed from: b */
    public static C0893h f3725b;

    /* JADX INFO: renamed from: c */
    static FirebaseAnalytics f3726c;

    /* JADX INFO: renamed from: a */
    public static void m4792a(String str, String str2) {
        String str3;
        switch (str2) {
            case "Action":
                str3 = "select_content";
                break;
            case "Style":
                str3 = "select_content";
                break;
            default:
                str3 = str2;
                break;
        }
        if (C0566m.m4946k()) {
            Bundle bundle = new Bundle();
            bundle.putString("content_type", str2);
            bundle.putString("item_id", str);
            f3726c.logEvent(str3, bundle);
            if (str2.equals("ScreenView")) {
                f3725b.m6015a(str);
                f3725b.m6017a(new C0890e.c().m5990a());
            }
        }
    }

    /* JADX INFO: renamed from: b */
    static String m4793b() {
        return "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAjKy4VG7hyLiVVxRS7y6vnBAEPmma+KUSbfkH/gK0MrLlwvc8O+bTnD89uTV1iNioibLfmTjY7CIq2qkiOXumLUi8ZJYsqkC4QKLVJ1tIvGbCtk//nNoeSVyfqglNfWYTgoIPHMczmMYc1LXlxUoLZV795tgCnizC6MhcC1yqzngMzNlftqAnT0tbxzikyYPKaQeRFJrJJxeXwq6d5zRb84+YLd1FRNv11i7EWqboy4N11btN";
    }

    /* JADX INFO: renamed from: b */
    public static void m4794b(String str, String str2) {
        try {
            f3726c.setUserProperty(str, str2);
            m4792a(str + ": " + str2, str);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m4795a() {
        f3724a = C0889d.m5964a((Context) this);
        f3724a.m5968a(1800);
        f3725b = f3724a.m5966a("UA-85711908-1");
        f3725b.m6018a(true);
        f3725b.m6020c(true);
        f3725b.m6019b(true);
        f3726c = FirebaseAnalytics.getInstance(this);
    }

    @Override // android.support.p005c.ApplicationC0022b, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        C0021a.m118a(this);
    }
}
