package com.google.android.gms.internal;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.C0651a;
import com.google.android.gms.ads.internal.C0710au;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class cjx extends ckf {

    /* JADX INFO: renamed from: a */
    private final Map<String, String> f10216a;

    /* JADX INFO: renamed from: b */
    private final Context f10217b;

    public cjx(InterfaceC1758mv interfaceC1758mv, Map<String, String> map) {
        super(interfaceC1758mv, "storePicture");
        this.f10216a = map;
        this.f10217b = interfaceC1758mv.mo11755d();
    }

    /* JADX INFO: renamed from: a */
    public final void m11045a() {
        if (this.f10217b == null) {
            m11061a("Activity context is not available");
            return;
        }
        C0710au.m5569e();
        if (!C1596gv.m11424f(this.f10217b).m10522c()) {
            m11061a("Feature is not supported by the device.");
            return;
        }
        String str = this.f10216a.get("iurl");
        if (TextUtils.isEmpty(str)) {
            m11061a("Image url cannot be empty.");
            return;
        }
        if (!URLUtil.isValidUrl(str)) {
            String strValueOf = String.valueOf(str);
            m11061a(strValueOf.length() != 0 ? "Invalid image url: ".concat(strValueOf) : new String("Invalid image url: "));
            return;
        }
        String lastPathSegment = Uri.parse(str).getLastPathSegment();
        C0710au.m5569e();
        if (!C1596gv.m11416c(lastPathSegment)) {
            String strValueOf2 = String.valueOf(lastPathSegment);
            m11061a(strValueOf2.length() != 0 ? "Image type not recognized: ".concat(strValueOf2) : new String("Image type not recognized: "));
            return;
        }
        Resources resourcesM11320v = C0710au.m5573i().m11320v();
        C0710au.m5569e();
        AlertDialog.Builder builderM11420e = C1596gv.m11420e(this.f10217b);
        builderM11420e.setTitle(resourcesM11320v != null ? resourcesM11320v.getString(C0651a.d.f4328s1) : "Save image");
        builderM11420e.setMessage(resourcesM11320v != null ? resourcesM11320v.getString(C0651a.d.f4329s2) : "Allow Ad to store image in Picture gallery?");
        builderM11420e.setPositiveButton(resourcesM11320v != null ? resourcesM11320v.getString(C0651a.d.f4330s3) : "Accept", new cjy(this, str, lastPathSegment));
        builderM11420e.setNegativeButton(resourcesM11320v != null ? resourcesM11320v.getString(C0651a.d.f4331s4) : "Decline", new cjz(this));
        builderM11420e.create().show();
    }
}
