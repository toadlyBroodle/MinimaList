package android.support.v7.app;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.support.v4.p018i.C0207a;
import android.support.v4.p019j.C0246q;
import android.support.v7.p022a.C0333a;
import android.support.v7.view.C0390d;
import android.support.v7.widget.C0464ab;
import android.support.v7.widget.C0495bf;
import android.support.v7.widget.C0511g;
import android.support.v7.widget.C0513i;
import android.support.v7.widget.C0514j;
import android.support.v7.widget.C0515k;
import android.support.v7.widget.C0518n;
import android.support.v7.widget.C0519o;
import android.support.v7.widget.C0521q;
import android.support.v7.widget.C0522r;
import android.support.v7.widget.C0525u;
import android.support.v7.widget.C0526v;
import android.support.v7.widget.C0527w;
import android.support.v7.widget.C0529y;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: renamed from: android.support.v7.app.o */
/* JADX INFO: loaded from: classes.dex */
class C0358o {

    /* JADX INFO: renamed from: a */
    private static final Class<?>[] f2025a = {Context.class, AttributeSet.class};

    /* JADX INFO: renamed from: b */
    private static final int[] f2026b = {R.attr.onClick};

    /* JADX INFO: renamed from: c */
    private static final String[] f2027c = {"android.widget.", "android.view.", "android.webkit."};

    /* JADX INFO: renamed from: d */
    private static final Map<String, Constructor<? extends View>> f2028d = new C0207a();

    /* JADX INFO: renamed from: e */
    private final Object[] f2029e = new Object[2];

    /* JADX INFO: renamed from: android.support.v7.app.o$a */
    private static class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        private final View f2030a;

        /* JADX INFO: renamed from: b */
        private final String f2031b;

        /* JADX INFO: renamed from: c */
        private Method f2032c;

        /* JADX INFO: renamed from: d */
        private Context f2033d;

        public a(View view, String str) {
            this.f2030a = view;
            this.f2031b = str;
        }

        /* JADX INFO: renamed from: a */
        private void m2725a(Context context, String str) {
            Method method;
            Context baseContext = context;
            while (baseContext != null) {
                try {
                    if (!baseContext.isRestricted() && (method = baseContext.getClass().getMethod(this.f2031b, View.class)) != null) {
                        this.f2032c = method;
                        this.f2033d = baseContext;
                        return;
                    }
                } catch (NoSuchMethodException e) {
                }
                baseContext = baseContext instanceof ContextWrapper ? ((ContextWrapper) baseContext).getBaseContext() : null;
            }
            int id = this.f2030a.getId();
            throw new IllegalStateException("Could not find method " + this.f2031b + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f2030a.getClass() + (id == -1 ? "" : " with id '" + this.f2030a.getContext().getResources().getResourceEntryName(id) + "'"));
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f2032c == null) {
                m2725a(this.f2030a.getContext(), this.f2031b);
            }
            try {
                this.f2032c.invoke(this.f2033d, view);
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
            } catch (InvocationTargetException e2) {
                throw new IllegalStateException("Could not execute method for android:onClick", e2);
            }
        }
    }

    C0358o() {
    }

    /* JADX INFO: renamed from: a */
    private static Context m2720a(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0333a.j.View, 0, 0);
        int resourceId = z ? typedArrayObtainStyledAttributes.getResourceId(C0333a.j.View_android_theme, 0) : 0;
        if (z2 && resourceId == 0 && (resourceId = typedArrayObtainStyledAttributes.getResourceId(C0333a.j.View_theme, 0)) != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        int i = resourceId;
        typedArrayObtainStyledAttributes.recycle();
        return i != 0 ? ((context instanceof C0390d) && ((C0390d) context).m3138a() == i) ? context : new C0390d(context, i) : context;
    }

    /* JADX INFO: renamed from: a */
    private View m2721a(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            this.f2029e[0] = context;
            this.f2029e[1] = attributeSet;
            if (-1 != str.indexOf(46)) {
                return m2722a(context, str, (String) null);
            }
            for (int i = 0; i < f2027c.length; i++) {
                View viewM2722a = m2722a(context, str, f2027c[i]);
                if (viewM2722a != null) {
                    return viewM2722a;
                }
            }
            return null;
        } catch (Exception e) {
            return null;
        } finally {
            this.f2029e[0] = null;
            this.f2029e[1] = null;
        }
    }

    /* JADX INFO: renamed from: a */
    private View m2722a(Context context, String str, String str2) {
        Constructor<? extends View> constructor = f2028d.get(str);
        if (constructor == null) {
            try {
                constructor = context.getClassLoader().loadClass(str2 != null ? str2 + str : str).asSubclass(View.class).getConstructor(f2025a);
                f2028d.put(str, constructor);
            } catch (Exception e) {
                return null;
            }
        }
        constructor.setAccessible(true);
        return constructor.newInstance(this.f2029e);
    }

    /* JADX INFO: renamed from: a */
    private void m2723a(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if (context instanceof ContextWrapper) {
            if (Build.VERSION.SDK_INT < 15 || C0246q.m1734A(view)) {
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2026b);
                String string = typedArrayObtainStyledAttributes.getString(0);
                if (string != null) {
                    view.setOnClickListener(new a(view, string));
                }
                typedArrayObtainStyledAttributes.recycle();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final View m2724a(View view, String str, Context context, AttributeSet attributeSet, boolean z, boolean z2, boolean z3, boolean z4) {
        Context context2;
        View c0527w;
        context2 = (!z || view == null) ? context : view.getContext();
        if (z2 || z3) {
            context2 = m2720a(context2, attributeSet, z2, z3);
        }
        if (z4) {
            context2 = C0495bf.m4505a(context2);
        }
        c0527w = null;
        switch (str) {
            case "TextView":
                c0527w = new C0464ab(context2, attributeSet);
                break;
            case "ImageView":
                c0527w = new C0521q(context2, attributeSet);
                break;
            case "Button":
                c0527w = new C0513i(context2, attributeSet);
                break;
            case "EditText":
                c0527w = new C0518n(context2, attributeSet);
                break;
            case "Spinner":
                c0527w = new C0529y(context2, attributeSet);
                break;
            case "ImageButton":
                c0527w = new C0519o(context2, attributeSet);
                break;
            case "CheckBox":
                c0527w = new C0514j(context2, attributeSet);
                break;
            case "RadioButton":
                c0527w = new C0525u(context2, attributeSet);
                break;
            case "CheckedTextView":
                c0527w = new C0515k(context2, attributeSet);
                break;
            case "AutoCompleteTextView":
                c0527w = new C0511g(context2, attributeSet);
                break;
            case "MultiAutoCompleteTextView":
                c0527w = new C0522r(context2, attributeSet);
                break;
            case "RatingBar":
                c0527w = new C0526v(context2, attributeSet);
                break;
            case "SeekBar":
                c0527w = new C0527w(context2, attributeSet);
                break;
        }
        View viewM2721a = (c0527w != null || context == context2) ? c0527w : m2721a(context2, str, attributeSet);
        if (viewM2721a != null) {
            m2723a(viewM2721a, attributeSet);
        }
        return viewM2721a;
    }
}
