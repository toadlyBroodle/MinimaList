package android.support.v4.p007b.p008a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.p007b.p008a.C0172a;
import android.support.v4.p009c.C0188c;
import android.util.Log;
import android.util.TypedValue;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: android.support.v4.b.a.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0173b {

    /* JADX INFO: renamed from: android.support.v4.b.a.b$a */
    public static abstract class a {
        /* JADX INFO: renamed from: a */
        public abstract void mo1324a(int i);

        /* JADX INFO: renamed from: a */
        public final void m1325a(final int i, Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new Runnable() { // from class: android.support.v4.b.a.b.a.2
                @Override // java.lang.Runnable
                public void run() {
                    a.this.mo1324a(i);
                }
            });
        }

        /* JADX INFO: renamed from: a */
        public abstract void mo1326a(Typeface typeface);

        /* JADX INFO: renamed from: a */
        public final void m1327a(final Typeface typeface, Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new Runnable() { // from class: android.support.v4.b.a.b.a.1
                @Override // java.lang.Runnable
                public void run() {
                    a.this.mo1326a(typeface);
                }
            });
        }
    }

    /* JADX INFO: renamed from: a */
    public static Typeface m1320a(Context context, int i, TypedValue typedValue, int i2, a aVar) {
        if (context.isRestricted()) {
            return null;
        }
        return m1321a(context, i, typedValue, i2, aVar, null, true);
    }

    /* JADX INFO: renamed from: a */
    private static Typeface m1321a(Context context, int i, TypedValue typedValue, int i2, a aVar, Handler handler, boolean z) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        Typeface typefaceM1322a = m1322a(context, resources, typedValue, i, i2, aVar, handler, z);
        if (typefaceM1322a == null && aVar == null) {
            throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
        }
        return typefaceM1322a;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00b4  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Typeface m1322a(Context context, Resources resources, TypedValue typedValue, int i, int i2, a aVar, Handler handler, boolean z) {
        if (typedValue.string == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue);
        }
        String string = typedValue.string.toString();
        if (!string.startsWith("res/")) {
            if (aVar != null) {
                aVar.m1325a(-3, handler);
            }
            return null;
        }
        Typeface typefaceM1429a = C0188c.m1429a(resources, i, i2);
        if (typefaceM1429a != null) {
            if (aVar == null) {
                return typefaceM1429a;
            }
            aVar.m1327a(typefaceM1429a, handler);
            return typefaceM1429a;
        }
        try {
            if (string.toLowerCase().endsWith(".xml")) {
                C0172a.a aVarM1305a = C0172a.m1305a(resources.getXml(i), resources);
                if (aVarM1305a != null) {
                    return C0188c.m1428a(context, aVarM1305a, resources, i, i2, aVar, handler, z);
                }
                Log.e("ResourcesCompat", "Failed to find font-family tag");
                if (aVar != null) {
                    aVar.m1325a(-3, handler);
                }
                return null;
            }
            Typeface typefaceM1426a = C0188c.m1426a(context, resources, i, string, i2);
            if (aVar == null) {
                return typefaceM1426a;
            }
            if (typefaceM1426a != null) {
                aVar.m1327a(typefaceM1426a, handler);
                return typefaceM1426a;
            }
            aVar.m1325a(-3, handler);
            return typefaceM1426a;
        } catch (IOException e) {
            Log.e("ResourcesCompat", "Failed to read xml resource " + string, e);
            if (aVar != null) {
                aVar.m1325a(-3, handler);
            }
            return null;
        } catch (XmlPullParserException e2) {
            Log.e("ResourcesCompat", "Failed to parse xml resource " + string, e2);
            if (aVar != null) {
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static Drawable m1323a(Resources resources, int i, Resources.Theme theme) {
        return Build.VERSION.SDK_INT >= 21 ? resources.getDrawable(i, theme) : resources.getDrawable(i);
    }
}
