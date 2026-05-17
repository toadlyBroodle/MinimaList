package android.support.p003b.p004a;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.support.v4.p019j.p021b.C0228a;
import android.support.v4.p019j.p021b.C0229b;
import android.support.v4.p019j.p021b.C0230c;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.AnticipateOvershootInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.CycleInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: android.support.b.a.d */
/* JADX INFO: loaded from: classes.dex */
public class C0015d {
    /* JADX INFO: renamed from: a */
    public static Interpolator m48a(Context context, int i) {
        Interpolator interpolatorM49a;
        if (Build.VERSION.SDK_INT >= 21) {
            return AnimationUtils.loadInterpolator(context, i);
        }
        XmlResourceParser animation = null;
        try {
            try {
                try {
                    if (i == 17563663) {
                        interpolatorM49a = new C0228a();
                    } else if (i == 17563661) {
                        interpolatorM49a = new C0229b();
                        if (0 != 0) {
                            animation.close();
                        }
                    } else if (i == 17563662) {
                        interpolatorM49a = new C0230c();
                        if (0 != 0) {
                            animation.close();
                        }
                    } else {
                        animation = context.getResources().getAnimation(i);
                        interpolatorM49a = m49a(context, context.getResources(), context.getTheme(), animation);
                        if (animation != null) {
                            animation.close();
                        }
                    }
                    return interpolatorM49a;
                } catch (XmlPullParserException e) {
                    Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
                    notFoundException.initCause(e);
                    throw notFoundException;
                }
            } catch (IOException e2) {
                Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
                notFoundException2.initCause(e2);
                throw notFoundException2;
            }
        } finally {
            if (animation != null) {
                animation.close();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00cc, code lost:
    
        return r0;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Interpolator m49a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        Interpolator linearInterpolator = null;
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if ((next == 3 && xmlPullParser.getDepth() <= depth) || next == 1) {
                break;
            }
            if (next == 2) {
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
                String name = xmlPullParser.getName();
                if (name.equals("linearInterpolator")) {
                    linearInterpolator = new LinearInterpolator();
                } else if (name.equals("accelerateInterpolator")) {
                    linearInterpolator = new AccelerateInterpolator(context, attributeSetAsAttributeSet);
                } else if (name.equals("decelerateInterpolator")) {
                    linearInterpolator = new DecelerateInterpolator(context, attributeSetAsAttributeSet);
                } else if (name.equals("accelerateDecelerateInterpolator")) {
                    linearInterpolator = new AccelerateDecelerateInterpolator();
                } else if (name.equals("cycleInterpolator")) {
                    linearInterpolator = new CycleInterpolator(context, attributeSetAsAttributeSet);
                } else if (name.equals("anticipateInterpolator")) {
                    linearInterpolator = new AnticipateInterpolator(context, attributeSetAsAttributeSet);
                } else if (name.equals("overshootInterpolator")) {
                    linearInterpolator = new OvershootInterpolator(context, attributeSetAsAttributeSet);
                } else if (name.equals("anticipateOvershootInterpolator")) {
                    linearInterpolator = new AnticipateOvershootInterpolator(context, attributeSetAsAttributeSet);
                } else if (name.equals("bounceInterpolator")) {
                    linearInterpolator = new BounceInterpolator();
                } else {
                    if (!name.equals("pathInterpolator")) {
                        throw new RuntimeException("Unknown interpolator name: " + xmlPullParser.getName());
                    }
                    linearInterpolator = new InterpolatorC0018g(context, attributeSetAsAttributeSet, xmlPullParser);
                }
            }
        }
    }
}
