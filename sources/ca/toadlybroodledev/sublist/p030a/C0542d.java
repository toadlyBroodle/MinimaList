package ca.toadlybroodledev.sublist.p030a;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.p033a.p034a.p035a.InterfaceC0573a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;

/* JADX INFO: renamed from: ca.toadlybroodledev.sublist.a.d */
/* JADX INFO: loaded from: classes.dex */
public class C0542d {

    /* JADX INFO: renamed from: a */
    boolean f3755a = false;

    /* JADX INFO: renamed from: b */
    String f3756b = "IabHelper";

    /* JADX INFO: renamed from: c */
    boolean f3757c = false;

    /* JADX INFO: renamed from: d */
    boolean f3758d = false;

    /* JADX INFO: renamed from: e */
    boolean f3759e = false;

    /* JADX INFO: renamed from: f */
    boolean f3760f = false;

    /* JADX INFO: renamed from: g */
    String f3761g = "";

    /* JADX INFO: renamed from: h */
    Context f3762h;

    /* JADX INFO: renamed from: i */
    InterfaceC0573a f3763i;

    /* JADX INFO: renamed from: j */
    ServiceConnection f3764j;

    /* JADX INFO: renamed from: k */
    int f3765k;

    /* JADX INFO: renamed from: l */
    String f3766l;

    /* JADX INFO: renamed from: m */
    String f3767m;

    /* JADX INFO: renamed from: n */
    a f3768n;

    /* JADX INFO: renamed from: ca.toadlybroodledev.sublist.a.d$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo4826a(C0543e c0543e, C0545g c0545g);
    }

    /* JADX INFO: renamed from: ca.toadlybroodledev.sublist.a.d$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo4827a(C0543e c0543e);
    }

    /* JADX INFO: renamed from: ca.toadlybroodledev.sublist.a.d$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        void mo4828a(C0543e c0543e, C0544f c0544f);
    }

    public C0542d(Context context, String str) {
        this.f3767m = null;
        this.f3762h = context.getApplicationContext();
        this.f3767m = str + "EltzsWTwOo8LTAwT19aeZ9SaooHSJ9SpMhxM0V6bJrQIDAQAB";
        m4823c("IAB helper created.");
    }

    /* JADX INFO: renamed from: a */
    public static String m4809a(int i) {
        String[] strArrSplit = "0:OK/1:User Canceled/2:Unknown/3:Billing Unavailable/4:Item unavailable/5:Developer Error/6:Error/7:Item Already Owned/8:Item not owned".split("/");
        String[] strArrSplit2 = "0:OK/-1001:Remote exception during initialization/-1002:Bad response received/-1003:Purchase signature verification failed/-1004:Send intent failed/-1005:User cancelled/-1006:Unknown purchase response/-1007:Missing token/-1008:Unknown error/-1009:Subscriptions not available/-1010:Invalid consumption attempt".split("/");
        if (i > -1000) {
            return (i < 0 || i >= strArrSplit.length) ? String.valueOf(i) + ":Unknown" : strArrSplit[i];
        }
        int i2 = (-1000) - i;
        return (i2 < 0 || i2 >= strArrSplit2.length) ? String.valueOf(i) + ":Unknown IAB Helper Error" : strArrSplit2[i2];
    }

    /* JADX INFO: renamed from: b */
    private void m4810b() {
        if (this.f3758d) {
            throw new IllegalStateException("IabHelper was disposed of, so it cannot be used.");
        }
    }

    /* JADX INFO: renamed from: a */
    int m4811a(Bundle bundle) {
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            m4823c("Bundle with null response code, assuming OK (known issue)");
            return 0;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj instanceof Long) {
            return (int) ((Long) obj).longValue();
        }
        m4824d("Unexpected type for bundle response code.");
        m4824d(obj.getClass().getName());
        throw new RuntimeException("Unexpected type for bundle response code: " + obj.getClass().getName());
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00ac, code lost:
    
        m4824d("Bundle returned from getPurchases() doesn't contain required fields.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
    
        return -1002;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    int m4812a(C0544f c0544f, String str) {
        m4823c("Querying owned items, item type: " + str);
        m4823c("Package name: " + this.f3762h.getPackageName());
        String string = null;
        boolean z = false;
        while (true) {
            m4823c("Calling getPurchases with continuation token: " + string);
            Bundle bundleMo5023a = this.f3763i.mo5023a(3, this.f3762h.getPackageName(), str, string);
            int iM4811a = m4811a(bundleMo5023a);
            m4823c("Owned items response: " + String.valueOf(iM4811a));
            if (iM4811a != 0) {
                m4823c("getPurchases() failed: " + m4809a(iM4811a));
                return iM4811a;
            }
            if (!bundleMo5023a.containsKey("INAPP_PURCHASE_ITEM_LIST") || !bundleMo5023a.containsKey("INAPP_PURCHASE_DATA_LIST") || !bundleMo5023a.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
                break;
            }
            ArrayList<String> stringArrayList = bundleMo5023a.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
            ArrayList<String> stringArrayList2 = bundleMo5023a.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
            ArrayList<String> stringArrayList3 = bundleMo5023a.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
            boolean z2 = z;
            for (int i = 0; i < stringArrayList2.size(); i++) {
                String str2 = stringArrayList2.get(i);
                String str3 = stringArrayList3.get(i);
                String str4 = stringArrayList.get(i);
                if (C0546h.m4840a(this.f3767m, str2, str3)) {
                    m4823c("Sku is owned: " + str4);
                    C0545g c0545g = new C0545g(str, str2, str3);
                    if (TextUtils.isEmpty(c0545g.m4838c())) {
                        m4825e("BUG: empty/null token!");
                        m4823c("Purchase data: " + str2);
                    }
                    c0544f.m4832a(c0545g);
                } else {
                    m4825e("Purchase signature verification **FAILED**. Not adding item.");
                    m4823c("   Purchase data: " + str2);
                    m4823c("   Signature: " + str3);
                    z2 = true;
                }
            }
            string = bundleMo5023a.getString("INAPP_CONTINUATION_TOKEN");
            m4823c("Continuation token: " + string);
            if (TextUtils.isEmpty(string)) {
                return z2 ? -1003 : 0;
            }
            z = z2;
        }
    }

    /* JADX INFO: renamed from: a */
    int m4813a(String str, C0544f c0544f, List<String> list) {
        m4823c("Querying SKU details.");
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.addAll(c0544f.m4835b(str));
        if (list != null) {
            for (String str2 : list) {
                if (!arrayList.contains(str2)) {
                    arrayList.add(str2);
                }
            }
        }
        if (arrayList.size() == 0) {
            m4823c("queryPrices: nothing to do because there are no SKUs.");
            return 0;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("ITEM_ID_LIST", arrayList);
        Bundle bundleMo5022a = this.f3763i.mo5022a(3, this.f3762h.getPackageName(), str, bundle);
        if (bundleMo5022a.containsKey("DETAILS_LIST")) {
            Iterator<String> it = bundleMo5022a.getStringArrayList("DETAILS_LIST").iterator();
            while (it.hasNext()) {
                C0547i c0547i = new C0547i(str, it.next());
                m4823c("Got sku details: " + c0547i);
                c0544f.m4833a(c0547i);
            }
            return 0;
        }
        int iM4811a = m4811a(bundleMo5022a);
        if (iM4811a != 0) {
            m4823c("getSkuDetails() failed: " + m4809a(iM4811a));
            return iM4811a;
        }
        m4824d("getSkuDetails() returned a bundle with neither an error nor a detail list.");
        return -1002;
    }

    /* JADX INFO: renamed from: a */
    public C0544f m4814a(boolean z, List<String> list) {
        return m4815a(z, list, (List<String>) null);
    }

    /* JADX INFO: renamed from: a */
    public C0544f m4815a(boolean z, List<String> list, List<String> list2) throws C0541c {
        int iM4813a;
        int iM4813a2;
        m4810b();
        m4820a("queryInventory");
        try {
            C0544f c0544f = new C0544f();
            int iM4812a = m4812a(c0544f, "inapp");
            if (iM4812a != 0) {
                throw new C0541c(iM4812a, "Error refreshing inventory (querying owned items).");
            }
            if (z && (iM4813a2 = m4813a("inapp", c0544f, list)) != 0) {
                throw new C0541c(iM4813a2, "Error refreshing inventory (querying prices of items).");
            }
            if (this.f3759e) {
                int iM4812a2 = m4812a(c0544f, "subs");
                if (iM4812a2 != 0) {
                    throw new C0541c(iM4812a2, "Error refreshing inventory (querying owned subscriptions).");
                }
                if (z && (iM4813a = m4813a("subs", c0544f, list)) != 0) {
                    throw new C0541c(iM4813a, "Error refreshing inventory (querying prices of subscriptions).");
                }
            }
            return c0544f;
        } catch (RemoteException e) {
            throw new C0541c(-1001, "Remote exception while refreshing inventory.", e);
        } catch (JSONException e2) {
            throw new C0541c(-1002, "Error parsing JSON response while refreshing inventory.", e2);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m4816a() {
        m4823c("Ending async operation: " + this.f3761g);
        this.f3761g = "";
        this.f3760f = false;
    }

    /* JADX INFO: renamed from: a */
    public void m4817a(Activity activity, String str, int i, a aVar, String str2) {
        m4818a(activity, str, "inapp", i, aVar, str2);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00b3 -> B:26:0x002b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x00b5 -> B:26:0x002b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0139 -> B:26:0x002b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x013b -> B:26:0x002b). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: a */
    public void m4818a(Activity activity, String str, String str2, int i, a aVar, String str3) {
        m4810b();
        m4820a("launchPurchaseFlow");
        m4822b("launchPurchaseFlow");
        if (str2.equals("subs") && !this.f3759e) {
            C0543e c0543e = new C0543e(-1009, "Subscriptions are not available.");
            m4816a();
            if (aVar != null) {
                aVar.mo4826a(c0543e, null);
                return;
            }
            return;
        }
        try {
            m4823c("Constructing buy intent for " + str + ", item type: " + str2);
            Bundle bundleMo5024a = this.f3763i.mo5024a(3, this.f3762h.getPackageName(), str, str2, str3);
            int iM4811a = m4811a(bundleMo5024a);
            if (iM4811a != 0) {
                m4824d("Unable to buy item, Error response: " + m4809a(iM4811a));
                m4816a();
                C0543e c0543e2 = new C0543e(iM4811a, "Unable to buy item");
                if (aVar != null) {
                    aVar.mo4826a(c0543e2, null);
                }
            } else {
                PendingIntent pendingIntent = (PendingIntent) bundleMo5024a.getParcelable("BUY_INTENT");
                m4823c("Launching buy intent for " + str + ". Request code: " + i);
                this.f3765k = i;
                this.f3768n = aVar;
                this.f3766l = str2;
                IntentSender intentSender = pendingIntent.getIntentSender();
                Intent intent = new Intent();
                Integer num = 0;
                int iIntValue = num.intValue();
                Integer num2 = 0;
                int iIntValue2 = num2.intValue();
                Integer num3 = 0;
                activity.startIntentSenderForResult(intentSender, i, intent, iIntValue, iIntValue2, num3.intValue());
            }
        } catch (IntentSender.SendIntentException e) {
            m4824d("SendIntentException while launching purchase flow for sku " + str);
            e.printStackTrace();
            m4816a();
            C0543e c0543e3 = new C0543e(-1004, "Failed to send intent.");
            if (aVar != null) {
                aVar.mo4826a(c0543e3, null);
            }
        } catch (RemoteException e2) {
            m4824d("RemoteException while launching purchase flow for sku " + str);
            e2.printStackTrace();
            m4816a();
            C0543e c0543e4 = new C0543e(-1001, "Remote exception while starting purchase flow");
            if (aVar != null) {
                aVar.mo4826a(c0543e4, null);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m4819a(final b bVar) {
        m4810b();
        if (this.f3757c) {
            throw new IllegalStateException("IAB helper is already set up.");
        }
        m4823c("Starting in-app billing setup.");
        this.f3764j = new ServiceConnection() { // from class: ca.toadlybroodledev.sublist.a.d.1
            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                if (C0542d.this.f3758d) {
                    return;
                }
                C0542d.this.m4823c("Billing service connected.");
                C0542d.this.f3763i = InterfaceC0573a.a.m5026a(iBinder);
                String packageName = C0542d.this.f3762h.getPackageName();
                try {
                    C0542d.this.m4823c("Checking for in-app billing 3 support.");
                    int iMo5021a = C0542d.this.f3763i.mo5021a(3, packageName, "inapp");
                    if (iMo5021a != 0) {
                        if (bVar != null) {
                            bVar.mo4827a(new C0543e(iMo5021a, "Error checking for billing v3 support."));
                        }
                        C0542d.this.f3759e = false;
                        return;
                    }
                    C0542d.this.m4823c("In-app billing version 3 supported for " + packageName);
                    int iMo5021a2 = C0542d.this.f3763i.mo5021a(3, packageName, "subs");
                    if (iMo5021a2 == 0) {
                        C0542d.this.m4823c("Subscriptions AVAILABLE.");
                        C0542d.this.f3759e = true;
                    } else {
                        C0542d.this.m4823c("Subscriptions NOT AVAILABLE. Response: " + iMo5021a2);
                    }
                    C0542d.this.f3757c = true;
                    if (bVar != null) {
                        bVar.mo4827a(new C0543e(0, "Setup successful."));
                    }
                } catch (RemoteException e) {
                    if (bVar != null) {
                        bVar.mo4827a(new C0543e(-1001, "RemoteException while setting up in-app billing."));
                    }
                    e.printStackTrace();
                }
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
                C0542d.this.m4823c("Billing service disconnected.");
                C0542d.this.f3763i = null;
            }
        };
        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
        intent.setPackage("com.android.vending");
        List<ResolveInfo> listQueryIntentServices = this.f3762h.getPackageManager().queryIntentServices(intent, 0);
        if (listQueryIntentServices != null && !listQueryIntentServices.isEmpty()) {
            this.f3762h.bindService(intent, this.f3764j, 1);
        } else if (bVar != null) {
            bVar.mo4827a(new C0543e(3, "Billing service unavailable on device."));
        }
    }

    /* JADX INFO: renamed from: a */
    void m4820a(String str) {
        if (this.f3757c) {
            return;
        }
        m4824d("Illegal state for operation (" + str + "): IAB helper is not set up.");
        throw new IllegalStateException("IAB helper is not set up. Can't perform operation: " + str);
    }

    /* JADX INFO: renamed from: a */
    public void m4821a(final boolean z, final List<String> list, final c cVar) {
        final Handler handler = new Handler();
        m4810b();
        m4820a("queryInventory");
        m4822b("refresh inventory");
        new Thread(new Runnable() { // from class: ca.toadlybroodledev.sublist.a.d.2
            @Override // java.lang.Runnable
            public void run() {
                final C0543e c0543e = new C0543e(0, "Inventory refresh successful.");
                final C0544f c0544fM4814a = null;
                try {
                    c0544fM4814a = C0542d.this.m4814a(z, list);
                } catch (C0541c e) {
                    c0543e = e.m4808a();
                }
                C0542d.this.m4816a();
                if (C0542d.this.f3758d || cVar == null) {
                    return;
                }
                handler.post(new Runnable() { // from class: ca.toadlybroodledev.sublist.a.d.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        cVar.mo4828a(c0543e, c0544fM4814a);
                    }
                });
            }
        }).start();
    }

    /* JADX INFO: renamed from: b */
    void m4822b(String str) {
        if (this.f3760f) {
            throw new IllegalStateException("Can't start async operation (" + str + ") because another async operation(" + this.f3761g + ") is in progress.");
        }
        this.f3761g = str;
        this.f3760f = true;
        m4823c("Starting async operation: " + str);
    }

    /* JADX INFO: renamed from: c */
    void m4823c(String str) {
        if (this.f3755a) {
            Log.d(this.f3756b, str);
        }
    }

    /* JADX INFO: renamed from: d */
    void m4824d(String str) {
        Log.e(this.f3756b, "In-app billing error: " + str);
    }

    /* JADX INFO: renamed from: e */
    void m4825e(String str) {
        Log.w(this.f3756b, "In-app billing warning: " + str);
    }
}
