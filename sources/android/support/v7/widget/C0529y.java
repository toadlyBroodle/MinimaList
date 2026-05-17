package android.support.v7.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.p019j.C0246q;
import android.support.v4.p019j.InterfaceC0245p;
import android.support.v7.p022a.C0333a;
import android.support.v7.p023b.p024a.C0366b;
import android.support.v7.view.C0390d;
import android.support.v7.view.menu.InterfaceC0416s;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

/* JADX INFO: renamed from: android.support.v7.widget.y */
/* JADX INFO: loaded from: classes.dex */
public class C0529y extends Spinner implements InterfaceC0245p {

    /* JADX INFO: renamed from: a */
    private static final int[] f3661a = {R.attr.spinnerMode};

    /* JADX INFO: renamed from: b */
    private final C0512h f3662b;

    /* JADX INFO: renamed from: c */
    private final Context f3663c;

    /* JADX INFO: renamed from: d */
    private AbstractViewOnAttachStateChangeListenerC0474al f3664d;

    /* JADX INFO: renamed from: e */
    private SpinnerAdapter f3665e;

    /* JADX INFO: renamed from: f */
    private final boolean f3666f;

    /* JADX INFO: renamed from: g */
    private b f3667g;

    /* JADX INFO: renamed from: h */
    private int f3668h;

    /* JADX INFO: renamed from: i */
    private final Rect f3669i;

    /* JADX INFO: renamed from: android.support.v7.widget.y$a */
    private static class a implements ListAdapter, SpinnerAdapter {

        /* JADX INFO: renamed from: a */
        private SpinnerAdapter f3672a;

        /* JADX INFO: renamed from: b */
        private ListAdapter f3673b;

        public a(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f3672a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f3673b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                    ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                    if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                        themedSpinnerAdapter.setDropDownViewTheme(theme);
                        return;
                    }
                    return;
                }
                if (spinnerAdapter instanceof InterfaceC0494be) {
                    InterfaceC0494be interfaceC0494be = (InterfaceC0494be) spinnerAdapter;
                    if (interfaceC0494be.m4503a() == null) {
                        interfaceC0494be.m4504a(theme);
                    }
                }
            }
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f3673b;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            if (this.f3672a == null) {
                return 0;
            }
            return this.f3672a.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            if (this.f3672a == null) {
                return null;
            }
            return this.f3672a.getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            if (this.f3672a == null) {
                return null;
            }
            return this.f3672a.getItem(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            if (this.f3672a == null) {
                return -1L;
            }
            return this.f3672a.getItemId(i);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            return this.f3672a != null && this.f3672a.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.f3673b;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            if (this.f3672a != null) {
                this.f3672a.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            if (this.f3672a != null) {
                this.f3672a.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* JADX INFO: renamed from: android.support.v7.widget.y$b */
    private class b extends C0478ap {

        /* JADX INFO: renamed from: a */
        ListAdapter f3674a;

        /* JADX INFO: renamed from: h */
        private CharSequence f3676h;

        /* JADX INFO: renamed from: i */
        private final Rect f3677i;

        public b(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f3677i = new Rect();
            m3961b(C0529y.this);
            m3959a(true);
            m3953a(0);
            m3956a(new AdapterView.OnItemClickListener() { // from class: android.support.v7.widget.y.b.1
                @Override // android.widget.AdapterView.OnItemClickListener
                public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j) {
                    C0529y.this.setSelection(i2);
                    if (C0529y.this.getOnItemClickListener() != null) {
                        C0529y.this.performItemClick(view, i2, b.this.f3674a.getItemId(i2));
                    }
                    b.this.mo3213e();
                }
            });
        }

        /* JADX INFO: renamed from: a */
        public CharSequence m4724a() {
            return this.f3676h;
        }

        @Override // android.support.v7.widget.C0478ap
        /* JADX INFO: renamed from: a */
        public void mo3957a(ListAdapter listAdapter) {
            super.mo3957a(listAdapter);
            this.f3674a = listAdapter;
        }

        /* JADX INFO: renamed from: a */
        public void m4725a(CharSequence charSequence) {
            this.f3676h = charSequence;
        }

        /* JADX INFO: renamed from: a */
        boolean m4726a(View view) {
            return C0246q.m1780z(view) && view.getGlobalVisibleRect(this.f3677i);
        }

        /* JADX INFO: renamed from: b */
        void m4727b() {
            int i;
            Drawable drawableH = m3969h();
            if (drawableH != null) {
                drawableH.getPadding(C0529y.this.f3669i);
                i = C0506bq.m4582a(C0529y.this) ? C0529y.this.f3669i.right : -C0529y.this.f3669i.left;
            } else {
                Rect rect = C0529y.this.f3669i;
                C0529y.this.f3669i.right = 0;
                rect.left = 0;
                i = 0;
            }
            int paddingLeft = C0529y.this.getPaddingLeft();
            int paddingRight = C0529y.this.getPaddingRight();
            int width = C0529y.this.getWidth();
            if (C0529y.this.f3668h == -2) {
                int iM4722a = C0529y.this.m4722a((SpinnerAdapter) this.f3674a, m3969h());
                int i2 = (C0529y.this.getContext().getResources().getDisplayMetrics().widthPixels - C0529y.this.f3669i.left) - C0529y.this.f3669i.right;
                if (iM4722a <= i2) {
                    i2 = iM4722a;
                }
                m3968g(Math.max(i2, (width - paddingLeft) - paddingRight));
            } else if (C0529y.this.f3668h == -1) {
                m3968g((width - paddingLeft) - paddingRight);
            } else {
                m3968g(C0529y.this.f3668h);
            }
            m3963c(C0506bq.m4582a(C0529y.this) ? ((width - paddingRight) - m3975l()) + i : i + paddingLeft);
        }

        @Override // android.support.v7.widget.C0478ap, android.support.v7.view.menu.InterfaceC0416s
        /* JADX INFO: renamed from: d */
        public void mo3212d() {
            ViewTreeObserver viewTreeObserver;
            boolean zF = mo3214f();
            m4727b();
            m3970h(2);
            super.mo3212d();
            mo3215g().setChoiceMode(1);
            m3972i(C0529y.this.getSelectedItemPosition());
            if (zF || (viewTreeObserver = C0529y.this.getViewTreeObserver()) == null) {
                return;
            }
            final ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: android.support.v7.widget.y.b.2
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    if (!b.this.m4726a(C0529y.this)) {
                        b.this.mo3213e();
                    } else {
                        b.this.m4727b();
                        b.super.mo3212d();
                    }
                }
            };
            viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
            m3958a(new PopupWindow.OnDismissListener() { // from class: android.support.v7.widget.y.b.3
                @Override // android.widget.PopupWindow.OnDismissListener
                public void onDismiss() {
                    ViewTreeObserver viewTreeObserver2 = C0529y.this.getViewTreeObserver();
                    if (viewTreeObserver2 != null) {
                        viewTreeObserver2.removeGlobalOnLayoutListener(onGlobalLayoutListener);
                    }
                }
            });
        }
    }

    public C0529y(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0333a.a.spinnerStyle);
    }

    public C0529y(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    public C0529y(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0529y(Context context, AttributeSet attributeSet, int i, int i2, Resources.Theme theme) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes;
        super(context, attributeSet, i);
        this.f3669i = new Rect();
        C0498bi c0498biM4510a = C0498bi.m4510a(context, attributeSet, C0333a.j.Spinner, i, 0);
        this.f3662b = new C0512h(this);
        if (theme != null) {
            this.f3663c = new C0390d(context, theme);
        } else {
            int iM4527g = c0498biM4510a.m4527g(C0333a.j.Spinner_popupTheme, 0);
            if (iM4527g != 0) {
                this.f3663c = new C0390d(context, iM4527g);
            } else {
                this.f3663c = Build.VERSION.SDK_INT < 23 ? context : null;
            }
        }
        if (this.f3663c != null) {
            if (i2 == -1) {
                try {
                    typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f3661a, i, 0);
                    try {
                        try {
                            i2 = typedArrayObtainStyledAttributes.hasValue(0) ? typedArrayObtainStyledAttributes.getInt(0, 0) : i2;
                            if (typedArrayObtainStyledAttributes != null) {
                                typedArrayObtainStyledAttributes.recycle();
                            }
                        } catch (Exception e) {
                            e = e;
                            Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e);
                            if (typedArrayObtainStyledAttributes != null) {
                                typedArrayObtainStyledAttributes.recycle();
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (typedArrayObtainStyledAttributes != null) {
                            typedArrayObtainStyledAttributes.recycle();
                        }
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                    typedArrayObtainStyledAttributes = null;
                } catch (Throwable th2) {
                    th = th2;
                    typedArrayObtainStyledAttributes = null;
                    if (typedArrayObtainStyledAttributes != null) {
                    }
                    throw th;
                }
            }
            if (i2 == 1) {
                final b bVar = new b(this.f3663c, attributeSet, i);
                C0498bi c0498biM4510a2 = C0498bi.m4510a(this.f3663c, attributeSet, C0333a.j.Spinner, i, 0);
                this.f3668h = c0498biM4510a2.m4525f(C0333a.j.Spinner_android_dropDownWidth, -2);
                bVar.m3955a(c0498biM4510a2.m4514a(C0333a.j.Spinner_android_popupBackground));
                bVar.m4725a(c0498biM4510a.m4522d(C0333a.j.Spinner_android_prompt));
                c0498biM4510a2.m4515a();
                this.f3667g = bVar;
                this.f3664d = new AbstractViewOnAttachStateChangeListenerC0474al(this) { // from class: android.support.v7.widget.y.1
                    @Override // android.support.v7.widget.AbstractViewOnAttachStateChangeListenerC0474al
                    /* JADX INFO: renamed from: a */
                    public InterfaceC0416s mo3168a() {
                        return bVar;
                    }

                    @Override // android.support.v7.widget.AbstractViewOnAttachStateChangeListenerC0474al
                    /* JADX INFO: renamed from: b */
                    public boolean mo3169b() {
                        if (C0529y.this.f3667g.mo3214f()) {
                            return true;
                        }
                        C0529y.this.f3667g.mo3212d();
                        return true;
                    }
                };
            }
        }
        CharSequence[] charSequenceArrM4526f = c0498biM4510a.m4526f(C0333a.j.Spinner_android_entries);
        if (charSequenceArrM4526f != null) {
            ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, charSequenceArrM4526f);
            arrayAdapter.setDropDownViewResource(C0333a.g.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter);
        }
        c0498biM4510a.m4515a();
        this.f3666f = true;
        if (this.f3665e != null) {
            setAdapter(this.f3665e);
            this.f3665e = null;
        }
        this.f3662b.m4651a(attributeSet, i);
    }

    /* JADX INFO: renamed from: a */
    int m4722a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        View view;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        int iMax2 = Math.max(0, iMax - (15 - (iMin - iMax)));
        View view2 = null;
        int iMax3 = 0;
        int i = 0;
        while (iMax2 < iMin) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax2);
            if (itemViewType != i) {
                view = null;
            } else {
                itemViewType = i;
                view = view2;
            }
            view2 = spinnerAdapter.getView(iMax2, view, this);
            if (view2.getLayoutParams() == null) {
                view2.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view2.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax3 = Math.max(iMax3, view2.getMeasuredWidth());
            iMax2++;
            i = itemViewType;
        }
        if (drawable == null) {
            return iMax3;
        }
        drawable.getPadding(this.f3669i);
        return this.f3669i.left + this.f3669i.right + iMax3;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f3662b != null) {
            this.f3662b.m4654c();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        if (this.f3667g != null) {
            return this.f3667g.m3973j();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownHorizontalOffset();
        }
        return 0;
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        if (this.f3667g != null) {
            return this.f3667g.m3974k();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownVerticalOffset();
        }
        return 0;
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        if (this.f3667g != null) {
            return this.f3668h;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownWidth();
        }
        return 0;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        if (this.f3667g != null) {
            return this.f3667g.m3969h();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getPopupBackground();
        }
        return null;
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        if (this.f3667g != null) {
            return this.f3663c;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return super.getPopupContext();
        }
        return null;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        return this.f3667g != null ? this.f3667g.m4724a() : super.getPrompt();
    }

    @Override // android.support.v4.p019j.InterfaceC0245p
    public ColorStateList getSupportBackgroundTintList() {
        if (this.f3662b != null) {
            return this.f3662b.m4646a();
        }
        return null;
    }

    @Override // android.support.v4.p019j.InterfaceC0245p
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (this.f3662b != null) {
            return this.f3662b.m4652b();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f3667g == null || !this.f3667g.mo3214f()) {
            return;
        }
        this.f3667g.mo3213e();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f3667g == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m4722a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f3664d == null || !this.f3664d.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        if (this.f3667g == null) {
            return super.performClick();
        }
        if (!this.f3667g.mo3214f()) {
            this.f3667g.mo3212d();
        }
        return true;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f3666f) {
            this.f3665e = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f3667g != null) {
            this.f3667g.mo3957a(new a(spinnerAdapter, (this.f3663c == null ? getContext() : this.f3663c).getTheme()));
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f3662b != null) {
            this.f3662b.m4650a(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f3662b != null) {
            this.f3662b.m4647a(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        if (this.f3667g != null) {
            this.f3667g.m3963c(i);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownHorizontalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        if (this.f3667g != null) {
            this.f3667g.m3965d(i);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.f3667g != null) {
            this.f3668h = i;
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        if (this.f3667g != null) {
            this.f3667g.m3955a(drawable);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(C0366b.m2790b(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        if (this.f3667g != null) {
            this.f3667g.m4725a(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    @Override // android.support.v4.p019j.InterfaceC0245p
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f3662b != null) {
            this.f3662b.m4648a(colorStateList);
        }
    }

    @Override // android.support.v4.p019j.InterfaceC0245p
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f3662b != null) {
            this.f3662b.m4649a(mode);
        }
    }
}
