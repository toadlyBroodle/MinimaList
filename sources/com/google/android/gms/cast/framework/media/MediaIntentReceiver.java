package com.google.android.gms.cast.framework.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import com.google.android.gms.cast.framework.AbstractC1005g;
import com.google.android.gms.cast.framework.C0993a;
import com.google.android.gms.cast.framework.C1001c;
import com.google.android.gms.cast.framework.C1006h;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class MediaIntentReceiver extends BroadcastReceiver {
    /* JADX INFO: renamed from: a */
    private static void m6411a(C1001c c1001c) {
        C1016e c1016eM6413b = m6413b(c1001c);
        if (c1016eM6413b == null) {
            return;
        }
        c1016eM6413b.m6490q();
    }

    /* JADX INFO: renamed from: a */
    private static void m6412a(C1001c c1001c, long j) {
        C1016e c1016eM6413b;
        if (j == 0 || (c1016eM6413b = m6413b(c1001c)) == null || c1016eM6413b.m6484k() || c1016eM6413b.m6492s()) {
            return;
        }
        c1016eM6413b.m6465a(c1016eM6413b.m6478e() + j);
    }

    /* JADX INFO: renamed from: b */
    private static C1016e m6413b(C1001c c1001c) {
        if (c1001c == null || !c1001c.m6393e()) {
            return null;
        }
        return c1001c.m6374a();
    }

    /* JADX INFO: renamed from: a */
    protected void m6414a(Context context, String str, Intent intent) {
    }

    /* JADX INFO: renamed from: a */
    protected void m6415a(AbstractC1005g abstractC1005g) {
        if (abstractC1005g instanceof C1001c) {
            m6411a((C1001c) abstractC1005g);
        }
    }

    /* JADX INFO: renamed from: a */
    protected void m6416a(AbstractC1005g abstractC1005g, long j) {
        if (abstractC1005g instanceof C1001c) {
            m6412a((C1001c) abstractC1005g, j);
        }
    }

    /* JADX INFO: renamed from: a */
    protected void m6417a(AbstractC1005g abstractC1005g, Intent intent) {
        KeyEvent keyEvent;
        if ((abstractC1005g instanceof C1001c) && intent.hasExtra("android.intent.extra.KEY_EVENT") && (keyEvent = (KeyEvent) intent.getExtras().get("android.intent.extra.KEY_EVENT")) != null && keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 85) {
            m6411a((C1001c) abstractC1005g);
        }
    }

    /* JADX INFO: renamed from: b */
    protected void m6418b(AbstractC1005g abstractC1005g) {
        C1016e c1016eM6413b;
        if (!(abstractC1005g instanceof C1001c) || (c1016eM6413b = m6413b((C1001c) abstractC1005g)) == null || c1016eM6413b.m6492s()) {
            return;
        }
        c1016eM6413b.m6477d((JSONObject) null);
    }

    /* JADX INFO: renamed from: b */
    protected void m6419b(AbstractC1005g abstractC1005g, long j) {
        if (abstractC1005g instanceof C1001c) {
            m6412a((C1001c) abstractC1005g, -j);
        }
    }

    /* JADX INFO: renamed from: c */
    protected void m6420c(AbstractC1005g abstractC1005g) {
        C1016e c1016eM6413b;
        if (!(abstractC1005g instanceof C1001c) || (c1016eM6413b = m6413b((C1001c) abstractC1005g)) == null || c1016eM6413b.m6492s()) {
            return;
        }
        c1016eM6413b.m6475c((JSONObject) null);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        C1006h c1006hM6334b;
        String action = intent.getAction();
        if (action == null) {
        }
        c1006hM6334b = C0993a.m6331a(context).m6334b();
        switch (action) {
            case "com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK":
                m6415a(c1006hM6334b.m6403a());
                break;
            case "com.google.android.gms.cast.framework.action.SKIP_NEXT":
                m6418b(c1006hM6334b.m6403a());
                break;
            case "com.google.android.gms.cast.framework.action.SKIP_PREV":
                m6420c(c1006hM6334b.m6403a());
                break;
            case "com.google.android.gms.cast.framework.action.FORWARD":
                m6416a(c1006hM6334b.m6403a(), intent.getLongExtra("googlecast-extra_skip_step_ms", 0L));
                break;
            case "com.google.android.gms.cast.framework.action.REWIND":
                m6419b(c1006hM6334b.m6403a(), intent.getLongExtra("googlecast-extra_skip_step_ms", 0L));
                break;
            case "com.google.android.gms.cast.framework.action.STOP_CASTING":
                c1006hM6334b.m6404a(true);
                break;
            case "com.google.android.gms.cast.framework.action.DISCONNECT":
                c1006hM6334b.m6404a(false);
                break;
            case "android.intent.action.MEDIA_BUTTON":
                m6417a(c1006hM6334b.m6403a(), intent);
                break;
            default:
                m6414a(context, action, intent);
                break;
        }
    }
}
