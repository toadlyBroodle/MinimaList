package android.support.p003b.p004a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.p007b.p008a.C0174c;
import android.support.v4.p009c.p010a.C0181a;
import android.support.v4.p018i.C0207a;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: android.support.b.a.c */
/* JADX INFO: loaded from: classes.dex */
public class C0014c extends AbstractC0019h implements InterfaceC0013b {

    /* JADX INFO: renamed from: a */
    final Drawable.Callback f51a;

    /* JADX INFO: renamed from: c */
    private a f52c;

    /* JADX INFO: renamed from: d */
    private Context f53d;

    /* JADX INFO: renamed from: e */
    private ArgbEvaluator f54e;

    /* JADX INFO: renamed from: f */
    private Animator.AnimatorListener f55f;

    /* JADX INFO: renamed from: g */
    private ArrayList<Object> f56g;

    /* JADX INFO: renamed from: android.support.b.a.c$a */
    private static class a extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a */
        int f58a;

        /* JADX INFO: renamed from: b */
        C0020i f59b;

        /* JADX INFO: renamed from: c */
        AnimatorSet f60c;

        /* JADX INFO: renamed from: d */
        C0207a<Animator, String> f61d;

        /* JADX INFO: renamed from: e */
        private ArrayList<Animator> f62e;

        public a(Context context, a aVar, Drawable.Callback callback, Resources resources) {
            if (aVar != null) {
                this.f58a = aVar.f58a;
                if (aVar.f59b != null) {
                    Drawable.ConstantState constantState = aVar.f59b.getConstantState();
                    if (resources != null) {
                        this.f59b = (C0020i) constantState.newDrawable(resources);
                    } else {
                        this.f59b = (C0020i) constantState.newDrawable();
                    }
                    this.f59b = (C0020i) this.f59b.mutate();
                    this.f59b.setCallback(callback);
                    this.f59b.setBounds(aVar.f59b.getBounds());
                    this.f59b.m84a(false);
                }
                if (aVar.f62e != null) {
                    int size = aVar.f62e.size();
                    this.f62e = new ArrayList<>(size);
                    this.f61d = new C0207a<>(size);
                    for (int i = 0; i < size; i++) {
                        Animator animator = aVar.f62e.get(i);
                        Animator animatorClone = animator.clone();
                        String str = aVar.f61d.get(animator);
                        animatorClone.setTarget(this.f59b.m83a(str));
                        this.f62e.add(animatorClone);
                        this.f61d.put(animatorClone, str);
                    }
                    m47a();
                }
            }
        }

        /* JADX INFO: renamed from: a */
        public void m47a() {
            if (this.f60c == null) {
                this.f60c = new AnimatorSet();
            }
            this.f60c.playTogether(this.f62e);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f58a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    /* JADX INFO: renamed from: android.support.b.a.c$b */
    private static class b extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a */
        private final Drawable.ConstantState f63a;

        public b(Drawable.ConstantState constantState) {
            this.f63a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f63a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f63a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            C0014c c0014c = new C0014c();
            c0014c.f68b = this.f63a.newDrawable();
            c0014c.f68b.setCallback(c0014c.f51a);
            return c0014c;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            C0014c c0014c = new C0014c();
            c0014c.f68b = this.f63a.newDrawable(resources);
            c0014c.f68b.setCallback(c0014c.f51a);
            return c0014c;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C0014c c0014c = new C0014c();
            c0014c.f68b = this.f63a.newDrawable(resources, theme);
            c0014c.f68b.setCallback(c0014c.f51a);
            return c0014c;
        }
    }

    C0014c() {
        this(null, null, null);
    }

    private C0014c(Context context) {
        this(context, null, null);
    }

    private C0014c(Context context, a aVar, Resources resources) {
        this.f54e = null;
        this.f55f = null;
        this.f56g = null;
        this.f51a = new Drawable.Callback() { // from class: android.support.b.a.c.1
            @Override // android.graphics.drawable.Drawable.Callback
            public void invalidateDrawable(Drawable drawable) {
                C0014c.this.invalidateSelf();
            }

            @Override // android.graphics.drawable.Drawable.Callback
            public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
                C0014c.this.scheduleSelf(runnable, j);
            }

            @Override // android.graphics.drawable.Drawable.Callback
            public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
                C0014c.this.unscheduleSelf(runnable);
            }
        };
        this.f53d = context;
        if (aVar != null) {
            this.f52c = aVar;
        } else {
            this.f52c = new a(context, aVar, this.f51a, resources);
        }
    }

    /* JADX INFO: renamed from: a */
    public static C0014c m42a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        C0014c c0014c = new C0014c(context);
        c0014c.inflate(resources, xmlPullParser, attributeSet, theme);
        return c0014c;
    }

    /* JADX INFO: renamed from: a */
    private void m43a(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= childAnimations.size()) {
                    break;
                }
                m43a(childAnimations.get(i2));
                i = i2 + 1;
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f54e == null) {
                    this.f54e = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f54e);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m44a(String str, Animator animator) {
        animator.setTarget(this.f52c.f59b.m83a(str));
        if (Build.VERSION.SDK_INT < 21) {
            m43a(animator);
        }
        if (this.f52c.f62e == null) {
            this.f52c.f62e = new ArrayList();
            this.f52c.f61d = new C0207a<>();
        }
        this.f52c.f62e.add(animator);
        this.f52c.f61d.put(animator, str);
    }

    @Override // android.support.p003b.p004a.AbstractC0019h, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        if (this.f68b != null) {
            C0181a.m1391a(this.f68b, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        if (this.f68b != null) {
            return C0181a.m1398d(this.f68b);
        }
        return false;
    }

    @Override // android.support.p003b.p004a.AbstractC0019h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f68b != null) {
            this.f68b.draw(canvas);
            return;
        }
        this.f52c.f59b.draw(canvas);
        if (this.f52c.f60c.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f68b != null ? C0181a.m1397c(this.f68b) : this.f52c.f59b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return this.f68b != null ? this.f68b.getChangingConfigurations() : super.getChangingConfigurations() | this.f52c.f58a;
    }

    @Override // android.support.p003b.p004a.AbstractC0019h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ ColorFilter getColorFilter() {
        return super.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f68b == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new b(this.f68b.getConstantState());
    }

    @Override // android.support.p003b.p004a.AbstractC0019h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f68b != null ? this.f68b.getIntrinsicHeight() : this.f52c.f59b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f68b != null ? this.f68b.getIntrinsicWidth() : this.f52c.f59b.getIntrinsicWidth();
    }

    @Override // android.support.p003b.p004a.AbstractC0019h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // android.support.p003b.p004a.AbstractC0019h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f68b != null ? this.f68b.getOpacity() : this.f52c.f59b.getOpacity();
    }

    @Override // android.support.p003b.p004a.AbstractC0019h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // android.support.p003b.p004a.AbstractC0019h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // android.support.p003b.p004a.AbstractC0019h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        if (this.f68b != null) {
            C0181a.m1392a(this.f68b, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray typedArrayM1330a = C0174c.m1330a(resources, theme, attributeSet, C0012a.f43e);
                    int resourceId = typedArrayM1330a.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C0020i c0020iM77a = C0020i.m77a(resources, resourceId, theme);
                        c0020iM77a.m84a(false);
                        c0020iM77a.setCallback(this.f51a);
                        if (this.f52c.f59b != null) {
                            this.f52c.f59b.setCallback(null);
                        }
                        this.f52c.f59b = c0020iM77a;
                    }
                    typedArrayM1330a.recycle();
                } else if ("target".equals(name)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, C0012a.f44f);
                    String string = typedArrayObtainAttributes.getString(0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        if (this.f53d == null) {
                            typedArrayObtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        m44a(string, C0016e.m52a(this.f53d, resourceId2));
                    }
                    typedArrayObtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.f52c.m47a();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f68b != null ? C0181a.m1395b(this.f68b) : this.f52c.f59b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f68b != null ? ((AnimatedVectorDrawable) this.f68b).isRunning() : this.f52c.f60c.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.f68b != null ? this.f68b.isStateful() : this.f52c.f59b.isStateful();
    }

    @Override // android.support.p003b.p004a.AbstractC0019h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (this.f68b != null) {
            this.f68b.mutate();
        }
        return this;
    }

    @Override // android.support.p003b.p004a.AbstractC0019h, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        if (this.f68b != null) {
            this.f68b.setBounds(rect);
        } else {
            this.f52c.f59b.setBounds(rect);
        }
    }

    @Override // android.support.p003b.p004a.AbstractC0019h, android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        return this.f68b != null ? this.f68b.setLevel(i) : this.f52c.f59b.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        return this.f68b != null ? this.f68b.setState(iArr) : this.f52c.f59b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.f68b != null) {
            this.f68b.setAlpha(i);
        } else {
            this.f52c.f59b.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        if (this.f68b != null) {
            C0181a.m1394a(this.f68b, z);
        } else {
            this.f52c.f59b.setAutoMirrored(z);
        }
    }

    @Override // android.support.p003b.p004a.AbstractC0019h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    @Override // android.support.p003b.p004a.AbstractC0019h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i, PorterDuff.Mode mode) {
        super.setColorFilter(i, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f68b != null) {
            this.f68b.setColorFilter(colorFilter);
        } else {
            this.f52c.f59b.setColorFilter(colorFilter);
        }
    }

    @Override // android.support.p003b.p004a.AbstractC0019h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    @Override // android.support.p003b.p004a.AbstractC0019h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    @Override // android.support.p003b.p004a.AbstractC0019h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // android.support.p003b.p004a.AbstractC0019h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, android.support.v4.p009c.p010a.InterfaceC0186f
    public void setTint(int i) {
        if (this.f68b != null) {
            C0181a.m1388a(this.f68b, i);
        } else {
            this.f52c.f59b.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable, android.support.v4.p009c.p010a.InterfaceC0186f
    public void setTintList(ColorStateList colorStateList) {
        if (this.f68b != null) {
            C0181a.m1390a(this.f68b, colorStateList);
        } else {
            this.f52c.f59b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable, android.support.v4.p009c.p010a.InterfaceC0186f
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.f68b != null) {
            C0181a.m1393a(this.f68b, mode);
        } else {
            this.f52c.f59b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        if (this.f68b != null) {
            return this.f68b.setVisible(z, z2);
        }
        this.f52c.f59b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        if (this.f68b != null) {
            ((AnimatedVectorDrawable) this.f68b).start();
        } else {
            if (this.f52c.f60c.isStarted()) {
                return;
            }
            this.f52c.f60c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        if (this.f68b != null) {
            ((AnimatedVectorDrawable) this.f68b).stop();
        } else {
            this.f52c.f60c.end();
        }
    }
}
