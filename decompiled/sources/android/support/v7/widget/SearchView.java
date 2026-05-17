package android.support.v7.widget;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.p019j.AbstractC0222a;
import android.support.v4.widget.AbstractC0320d;
import android.support.v7.p022a.C0333a;
import android.support.v7.view.InterfaceC0389c;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class SearchView extends C0477ao implements InterfaceC0389c {

    /* JADX INFO: renamed from: i */
    static final C0442a f2789i = new C0442a();

    /* JADX INFO: renamed from: A */
    private View.OnClickListener f2790A;

    /* JADX INFO: renamed from: B */
    private boolean f2791B;

    /* JADX INFO: renamed from: C */
    private boolean f2792C;

    /* JADX INFO: renamed from: D */
    private boolean f2793D;

    /* JADX INFO: renamed from: E */
    private CharSequence f2794E;

    /* JADX INFO: renamed from: F */
    private boolean f2795F;

    /* JADX INFO: renamed from: G */
    private boolean f2796G;

    /* JADX INFO: renamed from: H */
    private int f2797H;

    /* JADX INFO: renamed from: I */
    private boolean f2798I;

    /* JADX INFO: renamed from: J */
    private CharSequence f2799J;

    /* JADX INFO: renamed from: K */
    private boolean f2800K;

    /* JADX INFO: renamed from: L */
    private int f2801L;

    /* JADX INFO: renamed from: M */
    private Bundle f2802M;

    /* JADX INFO: renamed from: N */
    private final Runnable f2803N;

    /* JADX INFO: renamed from: O */
    private Runnable f2804O;

    /* JADX INFO: renamed from: P */
    private final WeakHashMap<String, Drawable.ConstantState> f2805P;

    /* JADX INFO: renamed from: a */
    final SearchAutoComplete f2806a;

    /* JADX INFO: renamed from: b */
    final ImageView f2807b;

    /* JADX INFO: renamed from: c */
    final ImageView f2808c;

    /* JADX INFO: renamed from: d */
    final ImageView f2809d;

    /* JADX INFO: renamed from: e */
    final ImageView f2810e;

    /* JADX INFO: renamed from: f */
    View.OnFocusChangeListener f2811f;

    /* JADX INFO: renamed from: g */
    AbstractC0320d f2812g;

    /* JADX INFO: renamed from: h */
    SearchableInfo f2813h;

    /* JADX INFO: renamed from: j */
    private final View f2814j;

    /* JADX INFO: renamed from: k */
    private final View f2815k;

    /* JADX INFO: renamed from: l */
    private C0447f f2816l;

    /* JADX INFO: renamed from: m */
    private Rect f2817m;

    /* JADX INFO: renamed from: n */
    private Rect f2818n;

    /* JADX INFO: renamed from: o */
    private int[] f2819o;

    /* JADX INFO: renamed from: p */
    private int[] f2820p;

    /* JADX INFO: renamed from: q */
    private final ImageView f2821q;

    /* JADX INFO: renamed from: r */
    private final Drawable f2822r;

    /* JADX INFO: renamed from: s */
    private final int f2823s;

    /* JADX INFO: renamed from: t */
    private final int f2824t;

    /* JADX INFO: renamed from: u */
    private final Intent f2825u;

    /* JADX INFO: renamed from: v */
    private final Intent f2826v;

    /* JADX INFO: renamed from: w */
    private final CharSequence f2827w;

    /* JADX INFO: renamed from: x */
    private InterfaceC0444c f2828x;

    /* JADX INFO: renamed from: y */
    private InterfaceC0443b f2829y;

    /* JADX INFO: renamed from: z */
    private InterfaceC0445d f2830z;

    public static class SearchAutoComplete extends C0511g {

        /* JADX INFO: renamed from: a */
        final Runnable f2831a;

        /* JADX INFO: renamed from: b */
        private int f2832b;

        /* JADX INFO: renamed from: c */
        private SearchView f2833c;

        /* JADX INFO: renamed from: d */
        private boolean f2834d;

        public SearchAutoComplete(Context context) {
            this(context, null);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, C0333a.a.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f2831a = new Runnable() { // from class: android.support.v7.widget.SearchView.SearchAutoComplete.1
                @Override // java.lang.Runnable
                public void run() {
                    SearchAutoComplete.this.m3570a();
                }
            };
            this.f2832b = getThreshold();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public void m3570a() {
            if (this.f2834d) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f2834d = false;
            }
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i < 960 || i2 < 720 || configuration.orientation != 2) {
                return (i >= 600 || (i >= 640 && i2 >= 480)) ? 192 : 160;
            }
            return 256;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.f2834d = false;
                removeCallbacks(this.f2831a);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f2834d = true;
                    return;
                }
                this.f2834d = false;
                removeCallbacks(this.f2831a);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f2832b <= 0 || super.enoughToFilter();
        }

        @Override // android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f2834d) {
                removeCallbacks(this.f2831a);
                post(this.f2831a);
            }
            return inputConnectionOnCreateInputConnection;
        }

        @Override // android.view.View
        protected void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        protected void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            this.f2833c.m3568g();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState == null) {
                        return true;
                    }
                    keyDispatcherState.startTracking(keyEvent, this);
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f2833c.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f2833c.hasFocus() && getVisibility() == 0) {
                this.f2834d = true;
                if (SearchView.m3549a(getContext())) {
                    SearchView.f2789i.m3574a(this, true);
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        protected void replaceText(CharSequence charSequence) {
        }

        void setSearchView(SearchView searchView) {
            this.f2833c = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i) {
            super.setThreshold(i);
            this.f2832b = i;
        }
    }

    /* JADX INFO: renamed from: android.support.v7.widget.SearchView$a */
    private static class C0442a {

        /* JADX INFO: renamed from: a */
        private Method f2836a;

        /* JADX INFO: renamed from: b */
        private Method f2837b;

        /* JADX INFO: renamed from: c */
        private Method f2838c;

        C0442a() {
            try {
                this.f2836a = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f2836a.setAccessible(true);
            } catch (NoSuchMethodException e) {
            }
            try {
                this.f2837b = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f2837b.setAccessible(true);
            } catch (NoSuchMethodException e2) {
            }
            try {
                this.f2838c = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f2838c.setAccessible(true);
            } catch (NoSuchMethodException e3) {
            }
        }

        /* JADX INFO: renamed from: a */
        void m3573a(AutoCompleteTextView autoCompleteTextView) {
            if (this.f2836a != null) {
                try {
                    this.f2836a.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception e) {
                }
            }
        }

        /* JADX INFO: renamed from: a */
        void m3574a(AutoCompleteTextView autoCompleteTextView, boolean z) {
            if (this.f2838c != null) {
                try {
                    this.f2838c.invoke(autoCompleteTextView, Boolean.valueOf(z));
                } catch (Exception e) {
                }
            }
        }

        /* JADX INFO: renamed from: b */
        void m3575b(AutoCompleteTextView autoCompleteTextView) {
            if (this.f2837b != null) {
                try {
                    this.f2837b.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception e) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: android.support.v7.widget.SearchView$b */
    public interface InterfaceC0443b {
        /* JADX INFO: renamed from: a */
        boolean m3576a();
    }

    /* JADX INFO: renamed from: android.support.v7.widget.SearchView$c */
    public interface InterfaceC0444c {
        /* JADX INFO: renamed from: a */
        boolean m3577a(String str);
    }

    /* JADX INFO: renamed from: android.support.v7.widget.SearchView$d */
    public interface InterfaceC0445d {
    }

    /* JADX INFO: renamed from: android.support.v7.widget.SearchView$e */
    static class C0446e extends AbstractC0222a {
        public static final Parcelable.Creator<C0446e> CREATOR = new Parcelable.ClassLoaderCreator<C0446e>() { // from class: android.support.v7.widget.SearchView.e.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public C0446e createFromParcel(Parcel parcel) {
                return new C0446e(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public C0446e createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0446e(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public C0446e[] newArray(int i) {
                return new C0446e[i];
            }
        };

        /* JADX INFO: renamed from: a */
        boolean f2839a;

        public C0446e(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f2839a = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        C0446e(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f2839a + "}";
        }

        @Override // android.support.v4.p019j.AbstractC0222a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Boolean.valueOf(this.f2839a));
        }
    }

    /* JADX INFO: renamed from: android.support.v7.widget.SearchView$f */
    private static class C0447f extends TouchDelegate {

        /* JADX INFO: renamed from: a */
        private final View f2840a;

        /* JADX INFO: renamed from: b */
        private final Rect f2841b;

        /* JADX INFO: renamed from: c */
        private final Rect f2842c;

        /* JADX INFO: renamed from: d */
        private final Rect f2843d;

        /* JADX INFO: renamed from: e */
        private final int f2844e;

        /* JADX INFO: renamed from: f */
        private boolean f2845f;

        public C0447f(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f2844e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f2841b = new Rect();
            this.f2843d = new Rect();
            this.f2842c = new Rect();
            m3581a(rect, rect2);
            this.f2840a = view;
        }

        /* JADX INFO: renamed from: a */
        public void m3581a(Rect rect, Rect rect2) {
            this.f2841b.set(rect);
            this.f2843d.set(rect);
            this.f2843d.inset(-this.f2844e, -this.f2844e);
            this.f2842c.set(rect2);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:4:0x0013  */
        @Override // android.view.TouchDelegate
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z;
            boolean z2 = true;
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            switch (motionEvent.getAction()) {
                case 0:
                    if (!this.f2841b.contains(x, y)) {
                        z = false;
                    } else {
                        this.f2845f = true;
                        z = true;
                    }
                    break;
                case 1:
                case 2:
                    z = this.f2845f;
                    if (z && !this.f2843d.contains(x, y)) {
                        z2 = false;
                    }
                    break;
                case 3:
                    z = this.f2845f;
                    this.f2845f = false;
                    break;
            }
            if (!z) {
                return false;
            }
            if (!z2 || this.f2842c.contains(x, y)) {
                motionEvent.setLocation(x - this.f2842c.left, y - this.f2842c.top);
            } else {
                motionEvent.setLocation(this.f2840a.getWidth() / 2, this.f2840a.getHeight() / 2);
            }
            return this.f2840a.dispatchTouchEvent(motionEvent);
        }
    }

    /* JADX INFO: renamed from: a */
    private Intent m3546a(String str, Uri uri, String str2, String str3, int i, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f2799J);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        if (this.f2802M != null) {
            intent.putExtra("app_data", this.f2802M);
        }
        if (i != 0) {
            intent.putExtra("action_key", i);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f2813h.getSearchActivity());
        return intent;
    }

    /* JADX INFO: renamed from: a */
    private void m3547a(View view, Rect rect) {
        view.getLocationInWindow(this.f2819o);
        getLocationInWindow(this.f2820p);
        int i = this.f2819o[1] - this.f2820p[1];
        int i2 = this.f2819o[0] - this.f2820p[0];
        rect.set(i2, i, view.getWidth() + i2, view.getHeight() + i);
    }

    /* JADX INFO: renamed from: a */
    private void m3548a(boolean z) {
        int i = 8;
        this.f2792C = z;
        int i2 = z ? 0 : 8;
        boolean z2 = !TextUtils.isEmpty(this.f2806a.getText());
        this.f2807b.setVisibility(i2);
        m3551b(z2);
        this.f2814j.setVisibility(z ? 8 : 0);
        if (this.f2821q.getDrawable() != null && !this.f2791B) {
            i = 0;
        }
        this.f2821q.setVisibility(i);
        m3556m();
        m3552c(z2 ? false : true);
        m3555l();
    }

    /* JADX INFO: renamed from: a */
    static boolean m3549a(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    /* JADX INFO: renamed from: b */
    private CharSequence m3550b(CharSequence charSequence) {
        if (!this.f2791B || this.f2822r == null) {
            return charSequence;
        }
        int textSize = (int) (((double) this.f2806a.getTextSize()) * 1.25d);
        this.f2822r.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.f2822r), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: b */
    private void m3551b(boolean z) {
        int i = 8;
        if (this.f2793D && m3554k() && hasFocus() && (z || !this.f2798I)) {
            i = 0;
        }
        this.f2808c.setVisibility(i);
    }

    /* JADX INFO: renamed from: c */
    private void m3552c(boolean z) {
        int i;
        if (this.f2798I && !m3564c() && z) {
            i = 0;
            this.f2808c.setVisibility(8);
        } else {
            i = 8;
        }
        this.f2810e.setVisibility(i);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(C0333a.d.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(C0333a.d.abc_search_view_preferred_width);
    }

    /* JADX INFO: renamed from: i */
    private boolean m3553i() {
        if (this.f2813h == null || !this.f2813h.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = null;
        if (this.f2813h.getVoiceSearchLaunchWebSearch()) {
            intent = this.f2825u;
        } else if (this.f2813h.getVoiceSearchLaunchRecognizer()) {
            intent = this.f2826v;
        }
        return (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
    }

    /* JADX INFO: renamed from: k */
    private boolean m3554k() {
        return (this.f2793D || this.f2798I) && !m3564c();
    }

    /* JADX INFO: renamed from: l */
    private void m3555l() {
        int i = 8;
        if (m3554k() && (this.f2808c.getVisibility() == 0 || this.f2810e.getVisibility() == 0)) {
            i = 0;
        }
        this.f2815k.setVisibility(i);
    }

    /* JADX INFO: renamed from: m */
    private void m3556m() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f2806a.getText());
        if (!z2 && (!this.f2791B || this.f2800K)) {
            z = false;
        }
        this.f2809d.setVisibility(z ? 0 : 8);
        Drawable drawable = this.f2809d.getDrawable();
        if (drawable != null) {
            drawable.setState(z2 ? ENABLED_STATE_SET : EMPTY_STATE_SET);
        }
    }

    /* JADX INFO: renamed from: n */
    private void m3557n() {
        post(this.f2803N);
    }

    /* JADX INFO: renamed from: o */
    private void m3558o() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f2806a;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(m3550b(queryHint));
    }

    /* JADX INFO: renamed from: p */
    private void m3559p() {
        this.f2806a.setThreshold(this.f2813h.getSuggestThreshold());
        this.f2806a.setImeOptions(this.f2813h.getImeOptions());
        int inputType = this.f2813h.getInputType();
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f2813h.getSuggestAuthority() != null) {
                inputType = inputType | 65536 | 524288;
            }
        }
        this.f2806a.setInputType(inputType);
        if (this.f2812g != null) {
            this.f2812g.mo2382a((Cursor) null);
        }
        if (this.f2813h.getSuggestAuthority() != null) {
            this.f2812g = new ViewOnClickListenerC0492bc(getContext(), this, this.f2813h, this.f2805P);
            this.f2806a.setAdapter(this.f2812g);
            ((ViewOnClickListenerC0492bc) this.f2812g).m4497a(this.f2795F ? 2 : 1);
        }
    }

    /* JADX INFO: renamed from: q */
    private void m3560q() {
        this.f2806a.dismissDropDown();
    }

    private void setQuery(CharSequence charSequence) {
        this.f2806a.setText(charSequence);
        this.f2806a.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    @Override // android.support.v7.view.InterfaceC0389c
    /* JADX INFO: renamed from: a */
    public void mo3134a() {
        if (this.f2800K) {
            return;
        }
        this.f2800K = true;
        this.f2801L = this.f2806a.getImeOptions();
        this.f2806a.setImeOptions(this.f2801L | 33554432);
        this.f2806a.setText("");
        setIconified(false);
    }

    /* JADX INFO: renamed from: a */
    void m3561a(int i, String str, String str2) {
        getContext().startActivity(m3546a("android.intent.action.SEARCH", (Uri) null, (String) null, str2, i, str));
    }

    /* JADX INFO: renamed from: a */
    void m3562a(CharSequence charSequence) {
        setQuery(charSequence);
    }

    /* JADX INFO: renamed from: a */
    public void m3563a(CharSequence charSequence, boolean z) {
        this.f2806a.setText(charSequence);
        if (charSequence != null) {
            this.f2806a.setSelection(this.f2806a.length());
            this.f2799J = charSequence;
        }
        if (!z || TextUtils.isEmpty(charSequence)) {
            return;
        }
        m3565d();
    }

    @Override // android.support.v7.view.InterfaceC0389c
    /* JADX INFO: renamed from: b */
    public void mo3135b() {
        m3563a("", false);
        clearFocus();
        m3548a(true);
        this.f2806a.setImeOptions(this.f2801L);
        this.f2800K = false;
    }

    /* JADX INFO: renamed from: c */
    public boolean m3564c() {
        return this.f2792C;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.f2796G = true;
        super.clearFocus();
        this.f2806a.clearFocus();
        this.f2806a.setImeVisibility(false);
        this.f2796G = false;
    }

    /* JADX INFO: renamed from: d */
    void m3565d() {
        Editable text = this.f2806a.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.f2828x == null || !this.f2828x.m3577a(text.toString())) {
            if (this.f2813h != null) {
                m3561a(0, null, text.toString());
            }
            this.f2806a.setImeVisibility(false);
            m3560q();
        }
    }

    /* JADX INFO: renamed from: e */
    void m3566e() {
        if (!TextUtils.isEmpty(this.f2806a.getText())) {
            this.f2806a.setText("");
            this.f2806a.requestFocus();
            this.f2806a.setImeVisibility(true);
        } else if (this.f2791B) {
            if (this.f2829y == null || !this.f2829y.m3576a()) {
                clearFocus();
                m3548a(true);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    void m3567f() {
        m3548a(false);
        this.f2806a.requestFocus();
        this.f2806a.setImeVisibility(true);
        if (this.f2790A != null) {
            this.f2790A.onClick(this);
        }
    }

    /* JADX INFO: renamed from: g */
    void m3568g() {
        m3548a(m3564c());
        m3557n();
        if (this.f2806a.hasFocus()) {
            m3569h();
        }
    }

    public int getImeOptions() {
        return this.f2806a.getImeOptions();
    }

    public int getInputType() {
        return this.f2806a.getInputType();
    }

    public int getMaxWidth() {
        return this.f2797H;
    }

    public CharSequence getQuery() {
        return this.f2806a.getText();
    }

    public CharSequence getQueryHint() {
        return this.f2794E != null ? this.f2794E : (this.f2813h == null || this.f2813h.getHintId() == 0) ? this.f2827w : getContext().getText(this.f2813h.getHintId());
    }

    int getSuggestionCommitIconResId() {
        return this.f2824t;
    }

    int getSuggestionRowLayout() {
        return this.f2823s;
    }

    public AbstractC0320d getSuggestionsAdapter() {
        return this.f2812g;
    }

    /* JADX INFO: renamed from: h */
    void m3569h() {
        f2789i.m3573a(this.f2806a);
        f2789i.m3575b(this.f2806a);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f2803N);
        post(this.f2804O);
        super.onDetachedFromWindow();
    }

    @Override // android.support.v7.widget.C0477ao, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m3547a(this.f2806a, this.f2817m);
            this.f2818n.set(this.f2817m.left, 0, this.f2817m.right, i4 - i2);
            if (this.f2816l != null) {
                this.f2816l.m3581a(this.f2818n, this.f2817m);
            } else {
                this.f2816l = new C0447f(this.f2818n, this.f2817m, this.f2806a);
                setTouchDelegate(this.f2816l);
            }
        }
    }

    @Override // android.support.v7.widget.C0477ao, android.view.View
    protected void onMeasure(int i, int i2) {
        if (m3564c()) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        switch (mode) {
            case Integer.MIN_VALUE:
                size = this.f2797H <= 0 ? Math.min(getPreferredWidth(), size) : Math.min(this.f2797H, size);
                break;
            case 0:
                size = this.f2797H <= 0 ? getPreferredWidth() : this.f2797H;
                break;
            case 1073741824:
                if (this.f2797H > 0) {
                    size = Math.min(this.f2797H, size);
                }
                break;
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        switch (mode2) {
            case Integer.MIN_VALUE:
                size2 = Math.min(getPreferredHeight(), size2);
                break;
            case 0:
                size2 = getPreferredHeight();
                break;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0446e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0446e c0446e = (C0446e) parcelable;
        super.onRestoreInstanceState(c0446e.m1605a());
        m3548a(c0446e.f2839a);
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        C0446e c0446e = new C0446e(super.onSaveInstanceState());
        c0446e.f2839a = m3564c();
        return c0446e;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        m3557n();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i, Rect rect) {
        if (this.f2796G || !isFocusable()) {
            return false;
        }
        if (m3564c()) {
            return super.requestFocus(i, rect);
        }
        boolean zRequestFocus = this.f2806a.requestFocus(i, rect);
        if (zRequestFocus) {
            m3548a(false);
        }
        return zRequestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f2802M = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            m3566e();
        } else {
            m3567f();
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.f2791B == z) {
            return;
        }
        this.f2791B = z;
        m3548a(z);
        m3558o();
    }

    public void setImeOptions(int i) {
        this.f2806a.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.f2806a.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.f2797H = i;
        requestLayout();
    }

    public void setOnCloseListener(InterfaceC0443b interfaceC0443b) {
        this.f2829y = interfaceC0443b;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f2811f = onFocusChangeListener;
    }

    public void setOnQueryTextListener(InterfaceC0444c interfaceC0444c) {
        this.f2828x = interfaceC0444c;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f2790A = onClickListener;
    }

    public void setOnSuggestionListener(InterfaceC0445d interfaceC0445d) {
        this.f2830z = interfaceC0445d;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f2794E = charSequence;
        m3558o();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.f2795F = z;
        if (this.f2812g instanceof ViewOnClickListenerC0492bc) {
            ((ViewOnClickListenerC0492bc) this.f2812g).m4497a(z ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f2813h = searchableInfo;
        if (this.f2813h != null) {
            m3559p();
            m3558o();
        }
        this.f2798I = m3553i();
        if (this.f2798I) {
            this.f2806a.setPrivateImeOptions("nm");
        }
        m3548a(m3564c());
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.f2793D = z;
        m3548a(m3564c());
    }

    public void setSuggestionsAdapter(AbstractC0320d abstractC0320d) {
        this.f2812g = abstractC0320d;
        this.f2806a.setAdapter(this.f2812g);
    }
}
