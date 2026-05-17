package android.support.design.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.design.C0025a;
import android.support.design.internal.C0028b;
import android.support.design.internal.C0029c;
import android.support.design.internal.C0032f;
import android.support.v4.p007b.C0175b;
import android.support.v4.p019j.AbstractC0222a;
import android.support.v4.p019j.C0246q;
import android.support.v4.p019j.C0254y;
import android.support.v7.p022a.C0333a;
import android.support.v7.p023b.p024a.C0366b;
import android.support.v7.view.C0393g;
import android.support.v7.view.menu.C0405h;
import android.support.v7.view.menu.C0407j;
import android.support.v7.widget.C0498bi;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public class NavigationView extends C0032f {

    /* JADX INFO: renamed from: d */
    private static final int[] f315d = {R.attr.state_checked};

    /* JADX INFO: renamed from: e */
    private static final int[] f316e = {-16842910};

    /* JADX INFO: renamed from: c */
    InterfaceC0056a f317c;

    /* JADX INFO: renamed from: f */
    private final C0028b f318f;

    /* JADX INFO: renamed from: g */
    private final C0029c f319g;

    /* JADX INFO: renamed from: h */
    private int f320h;

    /* JADX INFO: renamed from: i */
    private MenuInflater f321i;

    /* JADX INFO: renamed from: android.support.design.widget.NavigationView$a */
    public interface InterfaceC0056a {
        /* JADX INFO: renamed from: a */
        boolean mo426a(MenuItem menuItem);
    }

    /* JADX INFO: renamed from: android.support.design.widget.NavigationView$b */
    public static class C0057b extends AbstractC0222a {
        public static final Parcelable.Creator<C0057b> CREATOR = new Parcelable.ClassLoaderCreator<C0057b>() { // from class: android.support.design.widget.NavigationView.b.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public C0057b createFromParcel(Parcel parcel) {
                return new C0057b(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public C0057b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0057b(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public C0057b[] newArray(int i) {
                return new C0057b[i];
            }
        };

        /* JADX INFO: renamed from: a */
        public Bundle f323a;

        public C0057b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f323a = parcel.readBundle(classLoader);
        }

        public C0057b(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.support.v4.p019j.AbstractC0222a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.f323a);
        }
    }

    public NavigationView(Context context) {
        this(context, null);
    }

    public NavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationView(Context context, AttributeSet attributeSet, int i) {
        int iM4527g;
        boolean z;
        super(context, attributeSet, i);
        this.f319g = new C0029c();
        C0074n.m552a(context);
        this.f318f = new C0028b(context);
        C0498bi c0498biM4510a = C0498bi.m4510a(context, attributeSet, C0025a.j.NavigationView, i, C0025a.i.Widget_Design_NavigationView);
        C0246q.m1744a(this, c0498biM4510a.m4514a(C0025a.j.NavigationView_android_background));
        if (c0498biM4510a.m4528g(C0025a.j.NavigationView_elevation)) {
            C0246q.m1737a(this, c0498biM4510a.m4523e(C0025a.j.NavigationView_elevation, 0));
        }
        C0246q.m1754b(this, c0498biM4510a.m4516a(C0025a.j.NavigationView_android_fitsSystemWindows, false));
        this.f320h = c0498biM4510a.m4523e(C0025a.j.NavigationView_android_maxWidth, 0);
        ColorStateList colorStateListM4524e = c0498biM4510a.m4528g(C0025a.j.NavigationView_itemIconTint) ? c0498biM4510a.m4524e(C0025a.j.NavigationView_itemIconTint) : m421c(R.attr.textColorSecondary);
        if (c0498biM4510a.m4528g(C0025a.j.NavigationView_itemTextAppearance)) {
            iM4527g = c0498biM4510a.m4527g(C0025a.j.NavigationView_itemTextAppearance, 0);
            z = true;
        } else {
            iM4527g = 0;
            z = false;
        }
        ColorStateList colorStateListM4524e2 = c0498biM4510a.m4528g(C0025a.j.NavigationView_itemTextColor) ? c0498biM4510a.m4524e(C0025a.j.NavigationView_itemTextColor) : null;
        if (!z && colorStateListM4524e2 == null) {
            colorStateListM4524e2 = m421c(R.attr.textColorPrimary);
        }
        Drawable drawableM4514a = c0498biM4510a.m4514a(C0025a.j.NavigationView_itemBackground);
        this.f318f.mo3249a(new C0405h.a() { // from class: android.support.design.widget.NavigationView.1
            @Override // android.support.v7.view.menu.C0405h.a
            /* JADX INFO: renamed from: a */
            public void mo424a(C0405h c0405h) {
            }

            @Override // android.support.v7.view.menu.C0405h.a
            /* JADX INFO: renamed from: a */
            public boolean mo425a(C0405h c0405h, MenuItem menuItem) {
                return NavigationView.this.f317c != null && NavigationView.this.f317c.mo426a(menuItem);
            }
        });
        this.f319g.m164a(1);
        this.f319g.mo165a(context, this.f318f);
        this.f319g.m166a(colorStateListM4524e);
        if (z) {
            this.f319g.m184c(iM4527g);
        }
        this.f319g.m180b(colorStateListM4524e2);
        this.f319g.m167a(drawableM4514a);
        this.f318f.m3251a(this.f319g);
        addView((View) this.f319g.m163a((ViewGroup) this));
        if (c0498biM4510a.m4528g(C0025a.j.NavigationView_menu)) {
            m422a(c0498biM4510a.m4527g(C0025a.j.NavigationView_menu, 0));
        }
        if (c0498biM4510a.m4528g(C0025a.j.NavigationView_headerLayout)) {
            m423b(c0498biM4510a.m4527g(C0025a.j.NavigationView_headerLayout, 0));
        }
        c0498biM4510a.m4515a();
    }

    /* JADX INFO: renamed from: c */
    private ColorStateList m421c(int i) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateListM2787a = C0366b.m2787a(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(C0333a.a.colorPrimary, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.data;
        int defaultColor = colorStateListM2787a.getDefaultColor();
        return new ColorStateList(new int[][]{f316e, f315d, EMPTY_STATE_SET}, new int[]{colorStateListM2787a.getColorForState(f316e, defaultColor), i2, defaultColor});
    }

    private MenuInflater getMenuInflater() {
        if (this.f321i == null) {
            this.f321i = new C0393g(getContext());
        }
        return this.f321i;
    }

    /* JADX INFO: renamed from: a */
    public void m422a(int i) {
        this.f319g.m181b(true);
        getMenuInflater().inflate(i, this.f318f);
        this.f319g.m181b(false);
        this.f319g.mo174a(false);
    }

    @Override // android.support.design.internal.C0032f
    /* JADX INFO: renamed from: a */
    protected void mo212a(C0254y c0254y) {
        this.f319g.m169a(c0254y);
    }

    /* JADX INFO: renamed from: b */
    public View m423b(int i) {
        return this.f319g.m179b(i);
    }

    public int getHeaderCount() {
        return this.f319g.m185d();
    }

    public Drawable getItemBackground() {
        return this.f319g.m188g();
    }

    public ColorStateList getItemIconTintList() {
        return this.f319g.m186e();
    }

    public ColorStateList getItemTextColor() {
        return this.f319g.m187f();
    }

    public Menu getMenu() {
        return this.f318f;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        switch (View.MeasureSpec.getMode(i)) {
            case Integer.MIN_VALUE:
                i = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), this.f320h), 1073741824);
                break;
            case 0:
                i = View.MeasureSpec.makeMeasureSpec(this.f320h, 1073741824);
                break;
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0057b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0057b c0057b = (C0057b) parcelable;
        super.onRestoreInstanceState(c0057b.m1605a());
        this.f318f.m3259b(c0057b.f323a);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        C0057b c0057b = new C0057b(super.onSaveInstanceState());
        c0057b.f323a = new Bundle();
        this.f318f.m3248a(c0057b.f323a);
        return c0057b;
    }

    public void setCheckedItem(int i) {
        MenuItem menuItemFindItem = this.f318f.findItem(i);
        if (menuItemFindItem != null) {
            this.f319g.m171a((C0407j) menuItemFindItem);
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.f319g.m167a(drawable);
    }

    public void setItemBackgroundResource(int i) {
        setItemBackground(C0175b.m1337a(getContext(), i));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f319g.m166a(colorStateList);
    }

    public void setItemTextAppearance(int i) {
        this.f319g.m184c(i);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f319g.m180b(colorStateList);
    }

    public void setNavigationItemSelectedListener(InterfaceC0056a interfaceC0056a) {
        this.f317c = interfaceC0056a;
    }
}
