package com.google.firebase.messaging;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.iid.AbstractServiceC2292d;
import com.google.firebase.iid.C2299k;
import com.google.firebase.iid.C2314z;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseMessagingService extends AbstractServiceC2292d {

    /* JADX INFO: renamed from: b */
    private static final Queue<String> f13061b = new ArrayDeque(10);

    /* JADX INFO: renamed from: a */
    static void m13123a(Bundle bundle) {
        Iterator<String> it = bundle.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (next != null && next.startsWith("google.c.")) {
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    static boolean m13124b(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        return "1".equals(bundle.getString("google.c.a.e"));
    }

    @Override // com.google.firebase.iid.AbstractServiceC2292d
    /* JADX INFO: renamed from: a */
    protected final Intent mo13047a(Intent intent) {
        return C2314z.m13120a().m13122b();
    }

    /* JADX INFO: renamed from: a */
    public void m13125a() {
    }

    /* JADX INFO: renamed from: a */
    public void m13126a(C2315a c2315a) {
    }

    /* JADX INFO: renamed from: a */
    public void m13127a(String str) {
    }

    /* JADX INFO: renamed from: a */
    public void m13128a(String str, Exception exc) {
    }

    @Override // com.google.firebase.iid.AbstractServiceC2292d
    /* JADX INFO: renamed from: b */
    public final void mo13049b(Intent intent) {
        boolean z;
        String stringExtra;
        String action = intent.getAction();
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "com.google.android.c2dm.intent.RECEIVE":
                String stringExtra2 = intent.getStringExtra("google.message_id");
                if (TextUtils.isEmpty(stringExtra2)) {
                    z = false;
                } else if (f13061b.contains(stringExtra2)) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        String strValueOf = String.valueOf(stringExtra2);
                        Log.d("FirebaseMessaging", strValueOf.length() != 0 ? "Received duplicate message: ".concat(strValueOf) : new String("Received duplicate message: "));
                    }
                    z = true;
                } else {
                    if (f13061b.size() >= 10) {
                        f13061b.remove();
                    }
                    f13061b.add(stringExtra2);
                    z = false;
                }
                if (!z) {
                    stringExtra = intent.getStringExtra("message_type");
                    if (stringExtra == null) {
                        stringExtra = "gcm";
                    }
                    switch (stringExtra) {
                        case "gcm":
                            if (m13124b(intent.getExtras())) {
                                C2320f.m13164a(this, intent);
                            }
                            Bundle extras = intent.getExtras();
                            if (extras == null) {
                                extras = new Bundle();
                            }
                            extras.remove("android.support.content.wakelockid");
                            if (C2317c.m13136a(extras)) {
                                if (!C2317c.m13131a(this).m13145c(extras)) {
                                    if (m13124b(extras)) {
                                        C2320f.m13168d(this, intent);
                                    }
                                    m13126a(new C2315a(extras));
                                }
                                break;
                            } else {
                                m13126a(new C2315a(extras));
                                break;
                            }
                            break;
                        case "deleted_messages":
                            m13125a();
                            break;
                        case "send_event":
                            m13127a(intent.getStringExtra("google.message_id"));
                            break;
                        case "send_error":
                            String stringExtra3 = intent.getStringExtra("google.message_id");
                            if (stringExtra3 == null) {
                                stringExtra3 = intent.getStringExtra("message_id");
                            }
                            m13128a(stringExtra3, new C2316b(intent.getStringExtra("error")));
                            break;
                        default:
                            String strValueOf2 = String.valueOf(stringExtra);
                            Log.w("FirebaseMessaging", strValueOf2.length() != 0 ? "Received message with unknown type: ".concat(strValueOf2) : new String("Received message with unknown type: "));
                            break;
                    }
                }
                if (!TextUtils.isEmpty(stringExtra2)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("google.message_id", stringExtra2);
                    C2299k.m13084a(this).m13086a(2, bundle);
                    break;
                }
                break;
            case "com.google.firebase.messaging.NOTIFICATION_DISMISS":
                if (m13124b(intent.getExtras())) {
                    C2320f.m13167c(this, intent);
                    break;
                }
                break;
            default:
                String strValueOf3 = String.valueOf(intent.getAction());
                Log.d("FirebaseMessaging", strValueOf3.length() != 0 ? "Unknown intent action: ".concat(strValueOf3) : new String("Unknown intent action: "));
                break;
        }
    }

    @Override // com.google.firebase.iid.AbstractServiceC2292d
    /* JADX INFO: renamed from: c */
    public final boolean mo13075c(Intent intent) {
        if (!"com.google.firebase.messaging.NOTIFICATION_OPEN".equals(intent.getAction())) {
            return false;
        }
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException e) {
                Log.e("FirebaseMessaging", "Notification pending intent canceled");
            }
        }
        if (m13124b(intent.getExtras())) {
            C2320f.m13166b(this, intent);
        }
        return true;
    }
}
