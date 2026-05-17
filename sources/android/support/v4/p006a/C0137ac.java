package android.support.v4.p006a;

import android.app.Notification;
import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.p006a.C0136ab;
import android.util.SparseArray;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: android.support.v4.a.ac */
/* JADX INFO: loaded from: classes.dex */
class C0137ac implements InterfaceC0135aa {

    /* JADX INFO: renamed from: a */
    private final Notification.Builder f721a;

    /* JADX INFO: renamed from: b */
    private final C0136ab.c f722b;

    /* JADX INFO: renamed from: c */
    private RemoteViews f723c;

    /* JADX INFO: renamed from: d */
    private RemoteViews f724d;

    /* JADX INFO: renamed from: e */
    private final List<Bundle> f725e = new ArrayList();

    /* JADX INFO: renamed from: f */
    private final Bundle f726f = new Bundle();

    /* JADX INFO: renamed from: g */
    private int f727g;

    /* JADX INFO: renamed from: h */
    private RemoteViews f728h;

    C0137ac(C0136ab.c cVar) {
        this.f722b = cVar;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f721a = new Notification.Builder(cVar.f691a, cVar.f684H);
        } else {
            this.f721a = new Notification.Builder(cVar.f691a);
        }
        Notification notification = cVar.f689M;
        this.f721a.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, cVar.f697g).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(cVar.f693c).setContentText(cVar.f694d).setContentInfo(cVar.f699i).setContentIntent(cVar.f695e).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(cVar.f696f, (notification.flags & 128) != 0).setLargeIcon(cVar.f698h).setNumber(cVar.f700j).setProgress(cVar.f707q, cVar.f708r, cVar.f709s);
        if (Build.VERSION.SDK_INT >= 16) {
            this.f721a.setSubText(cVar.f705o).setUsesChronometer(cVar.f703m).setPriority(cVar.f701k);
            Iterator<C0136ab.a> it = cVar.f692b.iterator();
            while (it.hasNext()) {
                m797a(it.next());
            }
            if (cVar.f677A != null) {
                this.f726f.putAll(cVar.f677A);
            }
            if (Build.VERSION.SDK_INT < 20) {
                if (cVar.f713w) {
                    this.f726f.putBoolean("android.support.localOnly", true);
                }
                if (cVar.f710t != null) {
                    this.f726f.putString("android.support.groupKey", cVar.f710t);
                    if (cVar.f711u) {
                        this.f726f.putBoolean("android.support.isGroupSummary", true);
                    } else {
                        this.f726f.putBoolean("android.support.useSideChannel", true);
                    }
                }
                if (cVar.f712v != null) {
                    this.f726f.putString("android.support.sortKey", cVar.f712v);
                }
            }
            this.f723c = cVar.f681E;
            this.f724d = cVar.f682F;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            this.f721a.setShowWhen(cVar.f702l);
            if (Build.VERSION.SDK_INT < 21 && cVar.f690N != null && !cVar.f690N.isEmpty()) {
                this.f726f.putStringArray("android.people", (String[]) cVar.f690N.toArray(new String[cVar.f690N.size()]));
            }
        }
        if (Build.VERSION.SDK_INT >= 20) {
            this.f721a.setLocalOnly(cVar.f713w).setGroup(cVar.f710t).setGroupSummary(cVar.f711u).setSortKey(cVar.f712v);
            this.f727g = cVar.f688L;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            this.f721a.setCategory(cVar.f716z).setColor(cVar.f678B).setVisibility(cVar.f679C).setPublicVersion(cVar.f680D);
            Iterator<String> it2 = cVar.f690N.iterator();
            while (it2.hasNext()) {
                this.f721a.addPerson(it2.next());
            }
            this.f728h = cVar.f683G;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            this.f721a.setExtras(cVar.f677A).setRemoteInputHistory(cVar.f706p);
            if (cVar.f681E != null) {
                this.f721a.setCustomContentView(cVar.f681E);
            }
            if (cVar.f682F != null) {
                this.f721a.setCustomBigContentView(cVar.f682F);
            }
            if (cVar.f683G != null) {
                this.f721a.setCustomHeadsUpContentView(cVar.f683G);
            }
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.f721a.setBadgeIconType(cVar.f685I).setShortcutId(cVar.f686J).setTimeoutAfter(cVar.f687K).setGroupAlertBehavior(cVar.f688L);
            if (cVar.f715y) {
                this.f721a.setColorized(cVar.f714x);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m796a(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -2;
        notification.defaults &= -3;
    }

    /* JADX INFO: renamed from: a */
    private void m797a(C0136ab.a aVar) {
        if (Build.VERSION.SDK_INT < 20) {
            if (Build.VERSION.SDK_INT >= 16) {
                this.f725e.add(C0138ad.m800a(this.f721a, aVar));
                return;
            }
            return;
        }
        Notification.Action.Builder builder = new Notification.Action.Builder(aVar.m766a(), aVar.m767b(), aVar.m768c());
        if (aVar.m771f() != null) {
            for (RemoteInput remoteInput : C0140af.m808a(aVar.m771f())) {
                builder.addRemoteInput(remoteInput);
            }
        }
        Bundle bundle = aVar.m769d() != null ? new Bundle(aVar.m769d()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.m770e());
        if (Build.VERSION.SDK_INT >= 24) {
            builder.setAllowGeneratedReplies(aVar.m770e());
        }
        builder.addExtras(bundle);
        this.f721a.addAction(builder.build());
    }

    @Override // android.support.v4.p006a.InterfaceC0135aa
    /* JADX INFO: renamed from: a */
    public Notification.Builder mo764a() {
        return this.f721a;
    }

    /* JADX INFO: renamed from: b */
    public Notification m798b() {
        Bundle bundleM765a;
        RemoteViews remoteViewsM795d;
        RemoteViews remoteViewsM794c;
        C0136ab.d dVar = this.f722b.f704n;
        if (dVar != null) {
            dVar.mo774a(this);
        }
        RemoteViews remoteViewsM793b = dVar != null ? dVar.m793b(this) : null;
        Notification notificationM799c = m799c();
        if (remoteViewsM793b != null) {
            notificationM799c.contentView = remoteViewsM793b;
        } else if (this.f722b.f681E != null) {
            notificationM799c.contentView = this.f722b.f681E;
        }
        if (Build.VERSION.SDK_INT >= 16 && dVar != null && (remoteViewsM794c = dVar.m794c(this)) != null) {
            notificationM799c.bigContentView = remoteViewsM794c;
        }
        if (Build.VERSION.SDK_INT >= 21 && dVar != null && (remoteViewsM795d = this.f722b.f704n.m795d(this)) != null) {
            notificationM799c.headsUpContentView = remoteViewsM795d;
        }
        if (Build.VERSION.SDK_INT >= 16 && dVar != null && (bundleM765a = C0136ab.m765a(notificationM799c)) != null) {
            dVar.m791a(bundleM765a);
        }
        return notificationM799c;
    }

    /* JADX INFO: renamed from: c */
    protected Notification m799c() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f721a.build();
        }
        if (Build.VERSION.SDK_INT >= 24) {
            Notification notificationBuild = this.f721a.build();
            if (this.f727g == 0) {
                return notificationBuild;
            }
            if (notificationBuild.getGroup() != null && (notificationBuild.flags & 512) != 0 && this.f727g == 2) {
                m796a(notificationBuild);
            }
            if (notificationBuild.getGroup() == null || (notificationBuild.flags & 512) != 0 || this.f727g != 1) {
                return notificationBuild;
            }
            m796a(notificationBuild);
            return notificationBuild;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            this.f721a.setExtras(this.f726f);
            Notification notificationBuild2 = this.f721a.build();
            if (this.f723c != null) {
                notificationBuild2.contentView = this.f723c;
            }
            if (this.f724d != null) {
                notificationBuild2.bigContentView = this.f724d;
            }
            if (this.f728h != null) {
                notificationBuild2.headsUpContentView = this.f728h;
            }
            if (this.f727g == 0) {
                return notificationBuild2;
            }
            if (notificationBuild2.getGroup() != null && (notificationBuild2.flags & 512) != 0 && this.f727g == 2) {
                m796a(notificationBuild2);
            }
            if (notificationBuild2.getGroup() == null || (notificationBuild2.flags & 512) != 0 || this.f727g != 1) {
                return notificationBuild2;
            }
            m796a(notificationBuild2);
            return notificationBuild2;
        }
        if (Build.VERSION.SDK_INT >= 20) {
            this.f721a.setExtras(this.f726f);
            Notification notificationBuild3 = this.f721a.build();
            if (this.f723c != null) {
                notificationBuild3.contentView = this.f723c;
            }
            if (this.f724d != null) {
                notificationBuild3.bigContentView = this.f724d;
            }
            if (this.f727g == 0) {
                return notificationBuild3;
            }
            if (notificationBuild3.getGroup() != null && (notificationBuild3.flags & 512) != 0 && this.f727g == 2) {
                m796a(notificationBuild3);
            }
            if (notificationBuild3.getGroup() == null || (notificationBuild3.flags & 512) != 0 || this.f727g != 1) {
                return notificationBuild3;
            }
            m796a(notificationBuild3);
            return notificationBuild3;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            SparseArray<Bundle> sparseArrayM803a = C0138ad.m803a(this.f725e);
            if (sparseArrayM803a != null) {
                this.f726f.putSparseParcelableArray("android.support.actionExtras", sparseArrayM803a);
            }
            this.f721a.setExtras(this.f726f);
            Notification notificationBuild4 = this.f721a.build();
            if (this.f723c != null) {
                notificationBuild4.contentView = this.f723c;
            }
            if (this.f724d == null) {
                return notificationBuild4;
            }
            notificationBuild4.bigContentView = this.f724d;
            return notificationBuild4;
        }
        if (Build.VERSION.SDK_INT < 16) {
            return this.f721a.getNotification();
        }
        Notification notificationBuild5 = this.f721a.build();
        Bundle bundleM765a = C0136ab.m765a(notificationBuild5);
        Bundle bundle = new Bundle(this.f726f);
        for (String str : this.f726f.keySet()) {
            if (bundleM765a.containsKey(str)) {
                bundle.remove(str);
            }
        }
        bundleM765a.putAll(bundle);
        SparseArray<Bundle> sparseArrayM803a2 = C0138ad.m803a(this.f725e);
        if (sparseArrayM803a2 != null) {
            C0136ab.m765a(notificationBuild5).putSparseParcelableArray("android.support.actionExtras", sparseArrayM803a2);
        }
        if (this.f723c != null) {
            notificationBuild5.contentView = this.f723c;
        }
        if (this.f724d != null) {
            notificationBuild5.bigContentView = this.f724d;
        }
        return notificationBuild5;
    }
}
