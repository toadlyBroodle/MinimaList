package com.google.android.gms.ads.internal;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import com.google.android.gms.ads.internal.gmsg.InterfaceC0748aa;
import com.google.android.gms.internal.C1541eu;
import com.google.android.gms.internal.C1560fm;
import com.google.android.gms.internal.InterfaceC1758mv;
import com.google.android.gms.internal.cbq;
import com.google.android.gms.internal.cbs;
import com.google.android.gms.internal.ccy;
import com.google.android.gms.internal.ccz;
import com.google.android.gms.internal.chz;
import com.google.android.gms.internal.civ;
import com.google.android.gms.internal.ciy;
import com.google.android.gms.internal.cnb;
import com.google.android.gms.p043a.BinderC0654c;
import com.google.android.gms.p043a.InterfaceC0652a;
import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.r */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C0848r {
    /* JADX INFO: renamed from: a */
    public static View m5806a(C1541eu c1541eu) {
        if (c1541eu == null) {
            C1560fm.m11612c("AdState is null");
            return null;
        }
        if (m5818b(c1541eu) && c1541eu.f10535b != null) {
            Object obj = c1541eu.f10535b;
            if (obj == null) {
                throw null;
            }
            return (View) obj;
        }
        try {
            InterfaceC0652a interfaceC0652aMo10941a = c1541eu.f10548o != null ? c1541eu.f10548o.mo10941a() : null;
            if (interfaceC0652aMo10941a != null) {
                return (View) BinderC0654c.m5330a(interfaceC0652aMo10941a);
            }
            C1560fm.m11615e("View in mediation adapter is null.");
            return null;
        } catch (RemoteException e) {
            C1560fm.m11613c("Could not get View from mediation adapter.", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    static InterfaceC0748aa<InterfaceC1758mv> m5807a(civ civVar, ciy ciyVar, C0738c c0738c) {
        return new C0853w(civVar, c0738c, ciyVar);
    }

    /* JADX INFO: renamed from: a */
    private static String m5809a(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (bitmap == null) {
            C1560fm.m11615e("Bitmap is null. Returning empty string");
            return "";
        }
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        String strValueOf = String.valueOf("data:image/png;base64,");
        String strValueOf2 = String.valueOf(strEncodeToString);
        return strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
    }

    /* JADX INFO: renamed from: a */
    static String m5810a(ccy ccyVar) {
        if (ccyVar == null) {
            C1560fm.m11615e("Image is null. Returning empty string");
            return "";
        }
        try {
            Uri uriMo10605b = ccyVar.mo10605b();
            if (uriMo10605b != null) {
                return uriMo10605b.toString();
            }
        } catch (RemoteException e) {
            C1560fm.m11615e("Unable to get image uri. Trying data uri next");
        }
        return m5815b(ccyVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static boolean m5813a(InterfaceC1758mv interfaceC1758mv, chz chzVar, CountDownLatch countDownLatch) {
        boolean z;
        try {
        } catch (RemoteException e) {
            C1560fm.m11613c("Unable to invoke load assets", e);
            z = false;
        } catch (RuntimeException e2) {
            countDownLatch.countDown();
            throw e2;
        }
        if (interfaceC1758mv == 0) {
            throw null;
        }
        View view = (View) interfaceC1758mv;
        if (view == null) {
            C1560fm.m11615e("AdWebView is null");
            z = false;
        } else {
            view.setVisibility(4);
            List<String> list = chzVar.f10080b.f10030p;
            if (list == null || list.isEmpty()) {
                C1560fm.m11615e("No template ids present in mediation response");
                z = false;
            } else {
                interfaceC1758mv.mo11833w().m11857a("/nativeExpressAssetsLoaded", new C0851u(countDownLatch));
                interfaceC1758mv.mo11833w().m11857a("/nativeExpressAssetsLoadingFailed", new C0852v(countDownLatch));
                civ civVarMo10959h = chzVar.f10081c.mo10959h();
                ciy ciyVarMo10960i = chzVar.f10081c.mo10960i();
                if (list.contains("2") && civVarMo10959h != null) {
                    interfaceC1758mv.mo11833w().m11853a(new C0849s(new cbq(civVarMo10959h.mo10967a(), civVarMo10959h.mo10969b(), civVarMo10959h.mo10971c(), civVarMo10959h.mo10973d(), civVarMo10959h.mo10974e(), civVarMo10959h.mo10975f(), civVarMo10959h.mo10976g(), civVarMo10959h.mo10977h(), null, civVarMo10959h.mo10981l(), null, civVarMo10959h.mo10985p() != null ? (View) BinderC0654c.m5330a(civVarMo10959h.mo10985p()) : null, civVarMo10959h.mo10986q(), null), chzVar.f10080b.f10029o, interfaceC1758mv));
                } else if (!list.contains("1") || ciyVarMo10960i == null) {
                    C1560fm.m11615e("No matching template id and mapper");
                    z = false;
                } else {
                    interfaceC1758mv.mo11833w().m11853a(new C0850t(new cbs(ciyVarMo10960i.mo10987a(), ciyVarMo10960i.mo10989b(), ciyVarMo10960i.mo10991c(), ciyVarMo10960i.mo10993d(), ciyVarMo10960i.mo10994e(), ciyVarMo10960i.mo10995f(), null, ciyVarMo10960i.mo10999j(), null, ciyVarMo10960i.mo11003n() != null ? (View) BinderC0654c.m5330a(ciyVarMo10960i.mo11003n()) : null, ciyVarMo10960i.mo11004o(), null), chzVar.f10080b.f10029o, interfaceC1758mv));
                }
                String str = chzVar.f10080b.f10027m;
                String str2 = chzVar.f10080b.f10028n;
                if (str2 != null) {
                    interfaceC1758mv.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                } else {
                    interfaceC1758mv.loadData(str, "text/html", "UTF-8");
                }
                z = true;
            }
        }
        if (!z) {
            countDownLatch.countDown();
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static ccy m5814b(Object obj) {
        if (obj instanceof IBinder) {
            return ccz.m10738a((IBinder) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    private static String m5815b(ccy ccyVar) {
        String strM5809a;
        try {
            InterfaceC0652a interfaceC0652aMo10604a = ccyVar.mo10604a();
            if (interfaceC0652aMo10604a == null) {
                C1560fm.m11615e("Drawable is null. Returning empty string");
                strM5809a = "";
            } else {
                Drawable drawable = (Drawable) BinderC0654c.m5330a(interfaceC0652aMo10604a);
                if (drawable instanceof BitmapDrawable) {
                    strM5809a = m5809a(((BitmapDrawable) drawable).getBitmap());
                } else {
                    C1560fm.m11615e("Drawable is not an instance of BitmapDrawable. Returning empty string");
                    strM5809a = "";
                }
            }
            return strM5809a;
        } catch (RemoteException e) {
            C1560fm.m11615e("Unable to get drawable. Returning empty string");
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static JSONObject m5816b(Bundle bundle, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (bundle == null || TextUtils.isEmpty(str)) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject(str);
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (bundle.containsKey(next)) {
                if ("image".equals(jSONObject2.getString(next))) {
                    Object obj = bundle.get(next);
                    if (obj instanceof Bitmap) {
                        jSONObject.put(next, m5809a((Bitmap) obj));
                    } else {
                        C1560fm.m11615e("Invalid type. An image type extra should return a bitmap");
                    }
                } else if (bundle.get(next) instanceof Bitmap) {
                    C1560fm.m11615e("Invalid asset type. Bitmap should be returned only for image type");
                } else {
                    jSONObject.put(next, String.valueOf(bundle.get(next)));
                }
            }
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static void m5817b(InterfaceC1758mv interfaceC1758mv) {
        View.OnClickListener onClickListenerMo11805I = interfaceC1758mv.mo11805I();
        if (onClickListenerMo11805I != null) {
            if (interfaceC1758mv == 0) {
                throw null;
            }
            onClickListenerMo11805I.onClick((View) interfaceC1758mv);
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m5818b(C1541eu c1541eu) {
        return (c1541eu == null || !c1541eu.f10546m || c1541eu.f10547n == null || c1541eu.f10547n.f10027m == null) ? false : true;
    }
}
