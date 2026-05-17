package ca.toadlybroodledev.sublist;

import android.content.DialogInterface;
import android.support.v7.app.DialogInterfaceC0347d;
import android.util.Log;
import android.widget.Toast;
import ca.toadlybroodledev.sublist.p030a.C0542d;
import ca.toadlybroodledev.sublist.p030a.C0543e;
import ca.toadlybroodledev.sublist.p030a.C0544f;
import ca.toadlybroodledev.sublist.p030a.C0545g;
import ca.toadlybroodledev.sublist.p031b.InterfaceC0549a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: ca.toadlybroodledev.sublist.k */
/* JADX INFO: loaded from: classes.dex */
public class C0564k {

    /* JADX INFO: renamed from: b */
    private static final String f3916b = "fuckn" + C0564k.class.getSimpleName();

    /* JADX INFO: renamed from: c */
    private static InterfaceC0549a f3917c;

    /* JADX INFO: renamed from: d */
    private C0542d f3919d;

    /* JADX INFO: renamed from: a */
    C0542d.c f3918a = new C0542d.c() { // from class: ca.toadlybroodledev.sublist.k.1
        @Override // ca.toadlybroodledev.sublist.p030a.C0542d.c
        /* JADX INFO: renamed from: a */
        public void mo4828a(C0543e c0543e, C0544f c0544f) {
            if (c0543e.m4831c()) {
                Log.d(C0564k.f3916b, "Failed to query inventory.");
                return;
            }
            C0564k.this.m4910a(c0544f.m4834a("purchase_premium"));
            if (C0567n.f3942e) {
                Log.d(C0564k.f3916b, "User is premium!");
            }
        }
    };

    /* JADX INFO: renamed from: e */
    private C0542d.a f3920e = new C0542d.a() { // from class: ca.toadlybroodledev.sublist.k.2
        @Override // ca.toadlybroodledev.sublist.p030a.C0542d.a
        /* JADX INFO: renamed from: a */
        public void mo4826a(C0543e c0543e, C0545g c0545g) {
            if (c0543e.m4831c()) {
                Log.d(C0564k.f3916b, "Error purchasing: " + c0543e);
            } else if (c0545g.m4837b().equals("purchase_premium")) {
                Toast.makeText(C0564k.f3917c.mo4775m(), R.string.toast_purchase_premium_thanks, 1).show();
                C0564k.this.m4910a(true);
            }
        }
    };

    C0564k(InterfaceC0549a interfaceC0549a) {
        f3917c = interfaceC0549a;
        this.f3919d = new C0542d(f3917c.mo4775m(), AppMain.m4793b() + "6/0GgPrRJwqgbuRe2i1eEJEscqb7TFaeogfIK1bjxS0HRa4YAQVcJX+ebH8");
        this.f3919d.m4819a(new C0542d.b() { // from class: ca.toadlybroodledev.sublist.k.3
            @Override // ca.toadlybroodledev.sublist.p030a.C0542d.b
            /* JADX INFO: renamed from: a */
            public void mo4827a(C0543e c0543e) {
                if (!c0543e.m4830b()) {
                    Log.d(C0564k.f3916b, "Problem setting up In-app Billing: " + c0543e);
                }
                Log.d(C0564k.f3916b, "Hooray, IAB is fully set up!");
                try {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add("purchase_premium");
                    C0564k.this.f3919d.m4821a(true, (List<String>) arrayList, C0564k.this.f3918a);
                } catch (Exception e) {
                    Log.d(C0564k.f3916b, e.getMessage());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m4910a(boolean z) {
        C0567n.f3942e = z;
        ViewOnClickListenerC0558e viewOnClickListenerC0558eMo4776n = f3917c.mo4776n();
        if (viewOnClickListenerC0558eMo4776n.m978p()) {
            viewOnClickListenerC0558eMo4776n.mo4868af();
        }
    }

    /* JADX INFO: renamed from: a */
    static boolean m4911a() {
        return C0567n.f3942e;
    }

    /* JADX INFO: renamed from: b */
    boolean m4914b() {
        if (C0567n.f3942e) {
            return true;
        }
        if (ViewOnClickListenerC0558e.m4863b() == null) {
            Toast.makeText(f3917c.mo4775m(), R.string.billing_please_sign_in, 0).show();
            return false;
        }
        if (ViewOnClickListenerC0558e.m4863b().trialHoursRemaining > 0) {
            return true;
        }
        m4915c();
        return false;
    }

    /* JADX INFO: renamed from: c */
    void m4915c() {
        DialogInterfaceC0347d.a aVar = new DialogInterfaceC0347d.a(f3917c.mo4775m());
        aVar.m2591a(R.string.dialog_purchase_premium);
        aVar.m2598b(R.string.dialog_premium_feature_purchase);
        aVar.m2592a(R.string.yes, new DialogInterface.OnClickListener() { // from class: ca.toadlybroodledev.sublist.k.4
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                C0564k.this.m4916d();
            }
        });
        aVar.m2599b(R.string.later, null);
        aVar.m2603c();
    }

    /* JADX INFO: renamed from: d */
    void m4916d() {
        try {
            if (this.f3919d != null) {
                this.f3919d.m4816a();
            }
            this.f3919d.m4817a(f3917c.mo4776n().m969k(), "purchase_premium", 10001, this.f3920e, "android_id");
        } catch (IllegalStateException e) {
            e.printStackTrace();
            Toast.makeText(f3917c.mo4775m(), R.string.error_conn_play, 0).show();
        }
    }
}
