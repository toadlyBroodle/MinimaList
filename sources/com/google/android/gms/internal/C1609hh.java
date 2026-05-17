package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.text.TextUtils;
import android.webkit.WebSettings;
import com.google.android.gms.ads.internal.C0710au;
import com.google.android.gms.common.C1319w;
import java.io.File;

/* JADX INFO: renamed from: com.google.android.gms.internal.hh */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(17)
public class C1609hh extends C1612hk {
    @Override // com.google.android.gms.internal.C1603hb
    /* JADX INFO: renamed from: a */
    public final Drawable mo11460a(Context context, Bitmap bitmap, boolean z, float f) {
        if (!z || f <= 0.0f || f > 25.0f) {
            return new BitmapDrawable(context.getResources(), bitmap);
        }
        try {
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, bitmap.getWidth(), bitmap.getHeight(), false);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateScaledBitmap);
            RenderScript renderScriptCreate = RenderScript.create(context);
            ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
            Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateScaledBitmap);
            Allocation allocationCreateFromBitmap2 = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap);
            scriptIntrinsicBlurCreate.setRadius(f);
            scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
            scriptIntrinsicBlurCreate.forEach(allocationCreateFromBitmap2);
            allocationCreateFromBitmap2.copyTo(bitmapCreateBitmap);
            return new BitmapDrawable(context.getResources(), bitmapCreateBitmap);
        } catch (RuntimeException e) {
            return new BitmapDrawable(context.getResources(), bitmap);
        }
    }

    @Override // com.google.android.gms.internal.C1603hb
    /* JADX INFO: renamed from: a */
    public final String mo11462a(Context context) {
        C1650iv c1650ivM11545a = C1650iv.m11545a();
        if (TextUtils.isEmpty(c1650ivM11545a.f10811a)) {
            c1650ivM11545a.f10811a = (String) C1649iu.m11543a(context, new CallableC1651iw(c1650ivM11545a, C1319w.m7316f(context), context));
        }
        return c1650ivM11545a.f10811a;
    }

    @Override // com.google.android.gms.internal.C1612hk, com.google.android.gms.internal.C1606he, com.google.android.gms.internal.C1603hb
    /* JADX INFO: renamed from: a */
    public final boolean mo11469a(Context context, WebSettings webSettings) {
        super.mo11469a(context, webSettings);
        webSettings.setMediaPlaybackRequiresUserGesture(false);
        return true;
    }

    @Override // com.google.android.gms.internal.C1603hb
    /* JADX INFO: renamed from: b */
    public final void mo11473b(Context context) {
        C1650iv c1650ivM11545a = C1650iv.m11545a();
        C1560fm.m11343a("Updating user agent.");
        String defaultUserAgent = WebSettings.getDefaultUserAgent(context);
        if (!defaultUserAgent.equals(c1650ivM11545a.f10811a)) {
            Context contextM7316f = C1319w.m7316f(context);
            if (contextM7316f == null) {
                SharedPreferences.Editor editorPutString = context.getSharedPreferences("admob_user_agent", 0).edit().putString("user_agent", WebSettings.getDefaultUserAgent(context));
                if (contextM7316f == null) {
                    editorPutString.apply();
                } else {
                    File file = new File(context.getApplicationInfo().dataDir, "shared_prefs");
                    File parentFile = file.getParentFile();
                    if (parentFile != null) {
                        parentFile.setExecutable(true, false);
                    }
                    file.setExecutable(true, false);
                    editorPutString.commit();
                    new File(file, String.valueOf("admob_user_agent").concat(".xml")).setReadable(true, false);
                }
            }
            c1650ivM11545a.f10811a = defaultUserAgent;
        }
        C1560fm.m11343a("User agent is updated.");
        C0710au.m5573i().m11321w();
    }
}
