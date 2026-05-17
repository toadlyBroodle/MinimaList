package android.support.v4.media.session;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.RemoteException;
import android.support.v4.media.MediaBrowserCompat;
import android.util.Log;
import android.view.KeyEvent;
import java.util.List;

/* JADX INFO: renamed from: android.support.v4.media.session.c */
/* JADX INFO: loaded from: classes.dex */
public class C0307c extends BroadcastReceiver {

    /* JADX INFO: renamed from: android.support.v4.media.session.c$a */
    private static class a extends MediaBrowserCompat.C0257b {

        /* JADX INFO: renamed from: c */
        private final Context f1594c;

        /* JADX INFO: renamed from: d */
        private final Intent f1595d;

        /* JADX INFO: renamed from: e */
        private final BroadcastReceiver.PendingResult f1596e;

        /* JADX INFO: renamed from: f */
        private MediaBrowserCompat f1597f;

        a(Context context, Intent intent, BroadcastReceiver.PendingResult pendingResult) {
            this.f1594c = context;
            this.f1595d = intent;
            this.f1596e = pendingResult;
        }

        /* JADX INFO: renamed from: d */
        private void m2254d() {
            this.f1597f.m1877b();
            this.f1596e.finish();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.C0257b
        /* JADX INFO: renamed from: a */
        public void mo1884a() {
            try {
                new MediaControllerCompat(this.f1594c, this.f1597f.m1878c()).m2014a((KeyEvent) this.f1595d.getParcelableExtra("android.intent.extra.KEY_EVENT"));
            } catch (RemoteException e) {
                Log.e("MediaButtonReceiver", "Failed to create a media controller", e);
            }
            m2254d();
        }

        /* JADX INFO: renamed from: a */
        void m2255a(MediaBrowserCompat mediaBrowserCompat) {
            this.f1597f = mediaBrowserCompat;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.C0257b
        /* JADX INFO: renamed from: b */
        public void mo1886b() {
            m2254d();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.C0257b
        /* JADX INFO: renamed from: c */
        public void mo1887c() {
            m2254d();
        }
    }

    /* JADX INFO: renamed from: a */
    static ComponentName m2251a(Context context) {
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> listQueryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        if (listQueryBroadcastReceivers.size() == 1) {
            ResolveInfo resolveInfo = listQueryBroadcastReceivers.get(0);
            return new ComponentName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name);
        }
        if (listQueryBroadcastReceivers.size() > 1) {
            Log.w("MediaButtonReceiver", "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private static ComponentName m2252a(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (listQueryIntentServices.size() == 1) {
            ResolveInfo resolveInfo = listQueryIntentServices.get(0);
            return new ComponentName(resolveInfo.serviceInfo.packageName, resolveInfo.serviceInfo.name);
        }
        if (listQueryIntentServices.isEmpty()) {
            return null;
        }
        throw new IllegalStateException("Expected 1 service that handles " + str + ", found " + listQueryIntentServices.size());
    }

    /* JADX INFO: renamed from: a */
    private static void m2253a(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            context.startForegroundService(intent);
        } else {
            context.startService(intent);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            Log.d("MediaButtonReceiver", "Ignore unsupported intent: " + intent);
            return;
        }
        ComponentName componentNameM2252a = m2252a(context, "android.intent.action.MEDIA_BUTTON");
        if (componentNameM2252a != null) {
            intent.setComponent(componentNameM2252a);
            m2253a(context, intent);
            return;
        }
        ComponentName componentNameM2252a2 = m2252a(context, "android.media.browse.MediaBrowserService");
        if (componentNameM2252a2 == null) {
            throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
        }
        BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
        Context applicationContext = context.getApplicationContext();
        a aVar = new a(applicationContext, intent, pendingResultGoAsync);
        MediaBrowserCompat mediaBrowserCompat = new MediaBrowserCompat(applicationContext, componentNameM2252a2, aVar, null);
        aVar.m2255a(mediaBrowserCompat);
        mediaBrowserCompat.m1876a();
    }
}
