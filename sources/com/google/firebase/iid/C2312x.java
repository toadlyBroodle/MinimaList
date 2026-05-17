package com.google.firebase.iid;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.v4.p018i.C0219m;
import android.util.Log;
import com.google.android.gms.iid.MessengerCompat;
import com.google.android.gms.p051b.AbstractC0964e;
import com.google.android.gms.p051b.C0965f;
import com.google.android.gms.p051b.C0967h;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.google.firebase.iid.x */
/* JADX INFO: loaded from: classes.dex */
final class C2312x {

    /* JADX INFO: renamed from: a */
    private static int f13047a = 0;

    /* JADX INFO: renamed from: b */
    private static PendingIntent f13048b;

    /* JADX INFO: renamed from: d */
    private final Context f13050d;

    /* JADX INFO: renamed from: e */
    private final C2311w f13051e;

    /* JADX INFO: renamed from: g */
    private Messenger f13053g;

    /* JADX INFO: renamed from: h */
    private MessengerCompat f13054h;

    /* JADX INFO: renamed from: c */
    private final C0219m<String, C0965f<Bundle>> f13049c = new C0219m<>();

    /* JADX INFO: renamed from: f */
    private Messenger f13052f = new Messenger(new HandlerC2313y(this, Looper.getMainLooper()));

    public C2312x(Context context, C2311w c2311w) {
        this.f13050d = context;
        this.f13051e = c2311w;
    }

    /* JADX INFO: renamed from: a */
    private static synchronized String m13110a() {
        int i;
        i = f13047a;
        f13047a = i + 1;
        return Integer.toString(i);
    }

    /* JADX INFO: renamed from: a */
    private static synchronized void m13111a(Context context, Intent intent) {
        if (f13048b == null) {
            Intent intent2 = new Intent();
            intent2.setPackage("com.google.example.invalidpackage");
            f13048b = PendingIntent.getBroadcast(context, 0, intent2, 0);
        }
        intent.putExtra("app", f13048b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m13112a(Message message) {
        String str;
        String strSubstring;
        if (message == null || !(message.obj instanceof Intent)) {
            Log.w("FirebaseInstanceId", "Dropping invalid message");
            return;
        }
        Intent intent = (Intent) message.obj;
        intent.setExtrasClassLoader(MessengerCompat.class.getClassLoader());
        if (intent.hasExtra("google.messenger")) {
            Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
            if (parcelableExtra instanceof MessengerCompat) {
                this.f13054h = (MessengerCompat) parcelableExtra;
            }
            if (parcelableExtra instanceof Messenger) {
                this.f13053g = (Messenger) parcelableExtra;
            }
        }
        Intent intent2 = (Intent) message.obj;
        String action = intent2.getAction();
        if (!"com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String strValueOf = String.valueOf(action);
                Log.d("FirebaseInstanceId", strValueOf.length() != 0 ? "Unexpected response action: ".concat(strValueOf) : new String("Unexpected response action: "));
                return;
            }
            return;
        }
        String stringExtra = intent2.getStringExtra("registration_id");
        if (stringExtra == null) {
            stringExtra = intent2.getStringExtra("unregistered");
        }
        if (stringExtra != null) {
            Matcher matcher = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)").matcher(stringExtra);
            if (!matcher.matches()) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String strValueOf2 = String.valueOf(stringExtra);
                    Log.d("FirebaseInstanceId", strValueOf2.length() != 0 ? "Unexpected response string: ".concat(strValueOf2) : new String("Unexpected response string: "));
                    return;
                }
                return;
            }
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            Bundle extras = intent2.getExtras();
            extras.putString("registration_id", strGroup2);
            synchronized (this.f13049c) {
                C0965f<Bundle> c0965fRemove = this.f13049c.remove(strGroup);
                if (c0965fRemove != null) {
                    c0965fRemove.m6219a(extras);
                    return;
                } else {
                    String strValueOf3 = String.valueOf(strGroup);
                    Log.w("FirebaseInstanceId", strValueOf3.length() != 0 ? "Missing callback for ".concat(strValueOf3) : new String("Missing callback for "));
                    return;
                }
            }
        }
        String stringExtra2 = intent2.getStringExtra("error");
        if (stringExtra2 == null) {
            String strValueOf4 = String.valueOf(intent2.getExtras());
            Log.w("FirebaseInstanceId", new StringBuilder(String.valueOf(strValueOf4).length() + 49).append("Unexpected response, no error or registration id ").append(strValueOf4).toString());
            return;
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String strValueOf5 = String.valueOf(stringExtra2);
            Log.d("FirebaseInstanceId", strValueOf5.length() != 0 ? "Received InstanceID error ".concat(strValueOf5) : new String("Received InstanceID error "));
        }
        if (stringExtra2.startsWith("|")) {
            String[] strArrSplit = stringExtra2.split("\\|");
            if (!"ID".equals(strArrSplit[1])) {
                String strValueOf6 = String.valueOf(stringExtra2);
                Log.w("FirebaseInstanceId", strValueOf6.length() != 0 ? "Unexpected structured response ".concat(strValueOf6) : new String("Unexpected structured response "));
            }
            if (strArrSplit.length > 2) {
                str = strArrSplit[2];
                strSubstring = strArrSplit[3];
                if (strSubstring.startsWith(":")) {
                    strSubstring = strSubstring.substring(1);
                }
            } else {
                strSubstring = "UNKNOWN";
                str = null;
            }
            intent2.putExtra("error", strSubstring);
        } else {
            str = null;
            strSubstring = stringExtra2;
        }
        m13114a(str, strSubstring);
    }

    /* JADX INFO: renamed from: a */
    private final void m13114a(String str, String str2) {
        synchronized (this.f13049c) {
            if (str == null) {
                for (int i = 0; i < this.f13049c.size(); i++) {
                    this.f13049c.m1584c(i).m6218a(new IOException(str2));
                }
                this.f13049c.clear();
            } else {
                C0965f<Bundle> c0965fRemove = this.f13049c.remove(str);
                if (c0965fRemove == null) {
                    String strValueOf = String.valueOf(str);
                    Log.w("FirebaseInstanceId", strValueOf.length() != 0 ? "Missing callback for ".concat(strValueOf) : new String("Missing callback for "));
                    return;
                }
                c0965fRemove.m6218a(new IOException(str2));
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private final Bundle m13115b(Bundle bundle) throws IOException {
        Bundle bundleM13116c = m13116c(bundle);
        if (bundleM13116c == null || !bundleM13116c.containsKey("google.messenger")) {
            return bundleM13116c;
        }
        Bundle bundleM13116c2 = m13116c(bundle);
        if (bundleM13116c2 == null || !bundleM13116c2.containsKey("google.messenger")) {
            return bundleM13116c2;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0101  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Bundle m13116c(Bundle bundle) throws IOException {
        String strM13110a = m13110a();
        C0965f<Bundle> c0965f = new C0965f<>();
        synchronized (this.f13049c) {
            this.f13049c.put(strM13110a, c0965f);
        }
        if (this.f13051e.m13106a() == 0) {
            throw new IOException("MISSING_INSTANCEID_SERVICE");
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f13051e.m13106a() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        m13111a(this.f13050d, intent);
        intent.putExtra("kid", new StringBuilder(String.valueOf(strM13110a).length() + 5).append("|ID|").append(strM13110a).append("|").toString());
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String strValueOf = String.valueOf(intent.getExtras());
            Log.d("FirebaseInstanceId", new StringBuilder(String.valueOf(strValueOf).length() + 8).append("Sending ").append(strValueOf).toString());
        }
        intent.putExtra("google.messenger", this.f13052f);
        if (this.f13053g != null || this.f13054h != null) {
            Message messageObtain = Message.obtain();
            messageObtain.obj = intent;
            try {
                if (this.f13053g != null) {
                    this.f13053g.send(messageObtain);
                } else {
                    this.f13054h.m7352a(messageObtain);
                }
            } catch (RemoteException e) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    Log.d("FirebaseInstanceId", "Messenger failed, fallback to startService");
                }
                if (this.f13051e.m13106a() != 2) {
                }
            }
        } else if (this.f13051e.m13106a() != 2) {
            this.f13050d.sendBroadcast(intent);
        } else {
            this.f13050d.startService(intent);
        }
        try {
            try {
                Bundle bundle2 = (Bundle) C0967h.m6226a(c0965f.m6217a(), 30000L, TimeUnit.MILLISECONDS);
                synchronized (this.f13049c) {
                    this.f13049c.remove(strM13110a);
                }
                return bundle2;
            } catch (InterruptedException e2) {
                Log.w("FirebaseInstanceId", "No response");
                throw new IOException("TIMEOUT");
            } catch (ExecutionException e3) {
                Throwable cause = e3.getCause();
                if (cause instanceof IOException) {
                    throw ((IOException) cause);
                }
                throw new IOException(cause);
            } catch (TimeoutException e4) {
                Log.w("FirebaseInstanceId", "No response");
                throw new IOException("TIMEOUT");
            }
        } catch (Throwable th) {
            synchronized (this.f13049c) {
                this.f13049c.remove(strM13110a);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    final Bundle m13117a(Bundle bundle) {
        if (this.f13051e.m13109d() < 12000000) {
            return m13115b(bundle);
        }
        try {
            return (Bundle) C0967h.m6225a((AbstractC0964e) C2299k.m13084a(this.f13050d).m13087b(1, bundle));
        } catch (InterruptedException | ExecutionException e) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String strValueOf = String.valueOf(e);
                Log.d("FirebaseInstanceId", new StringBuilder(String.valueOf(strValueOf).length() + 22).append("Error making request: ").append(strValueOf).toString());
            }
            if ((e.getCause() instanceof C2309u) && ((C2309u) e.getCause()).m13101a() == 4) {
                return m13115b(bundle);
            }
            return null;
        }
    }
}
