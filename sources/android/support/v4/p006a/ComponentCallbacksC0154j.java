package android.support.v4.p006a;

import android.animation.Animator;
import android.app.Activity;
import android.arch.lifecycle.AbstractC0005b;
import android.arch.lifecycle.C0007d;
import android.arch.lifecycle.InterfaceC0006c;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.support.v4.p018i.C0210d;
import android.support.v4.p018i.C0219m;
import android.support.v4.p019j.C0234e;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: android.support.v4.a.j */
/* JADX INFO: loaded from: classes.dex */
public class ComponentCallbacksC0154j implements InterfaceC0006c, ComponentCallbacks, View.OnCreateContextMenuListener {

    /* JADX INFO: renamed from: a */
    private static final C0219m<String, Class<?>> f802a = new C0219m<>();

    /* JADX INFO: renamed from: j */
    static final Object f803j = new Object();

    /* JADX INFO: renamed from: A */
    LayoutInflaterFactory2C0160p f804A;

    /* JADX INFO: renamed from: B */
    AbstractC0158n f805B;

    /* JADX INFO: renamed from: C */
    LayoutInflaterFactory2C0160p f806C;

    /* JADX INFO: renamed from: D */
    C0161q f807D;

    /* JADX INFO: renamed from: E */
    ComponentCallbacksC0154j f808E;

    /* JADX INFO: renamed from: F */
    int f809F;

    /* JADX INFO: renamed from: G */
    int f810G;

    /* JADX INFO: renamed from: H */
    String f811H;

    /* JADX INFO: renamed from: I */
    boolean f812I;

    /* JADX INFO: renamed from: J */
    boolean f813J;

    /* JADX INFO: renamed from: K */
    boolean f814K;

    /* JADX INFO: renamed from: L */
    boolean f815L;

    /* JADX INFO: renamed from: M */
    boolean f816M;

    /* JADX INFO: renamed from: O */
    boolean f818O;

    /* JADX INFO: renamed from: P */
    ViewGroup f819P;

    /* JADX INFO: renamed from: Q */
    View f820Q;

    /* JADX INFO: renamed from: R */
    View f821R;

    /* JADX INFO: renamed from: S */
    boolean f822S;

    /* JADX INFO: renamed from: U */
    C0169y f824U;

    /* JADX INFO: renamed from: V */
    boolean f825V;

    /* JADX INFO: renamed from: W */
    boolean f826W;

    /* JADX INFO: renamed from: X */
    a f827X;

    /* JADX INFO: renamed from: Y */
    boolean f828Y;

    /* JADX INFO: renamed from: Z */
    boolean f829Z;

    /* JADX INFO: renamed from: aa */
    float f830aa;

    /* JADX INFO: renamed from: ab */
    LayoutInflater f831ab;

    /* JADX INFO: renamed from: ac */
    boolean f832ac;

    /* JADX INFO: renamed from: l */
    Bundle f835l;

    /* JADX INFO: renamed from: m */
    SparseArray<Parcelable> f836m;

    /* JADX INFO: renamed from: o */
    String f838o;

    /* JADX INFO: renamed from: p */
    Bundle f839p;

    /* JADX INFO: renamed from: q */
    ComponentCallbacksC0154j f840q;

    /* JADX INFO: renamed from: s */
    int f842s;

    /* JADX INFO: renamed from: t */
    boolean f843t;

    /* JADX INFO: renamed from: u */
    boolean f844u;

    /* JADX INFO: renamed from: v */
    boolean f845v;

    /* JADX INFO: renamed from: w */
    boolean f846w;

    /* JADX INFO: renamed from: x */
    boolean f847x;

    /* JADX INFO: renamed from: y */
    boolean f848y;

    /* JADX INFO: renamed from: z */
    int f849z;

    /* JADX INFO: renamed from: k */
    int f834k = 0;

    /* JADX INFO: renamed from: n */
    int f837n = -1;

    /* JADX INFO: renamed from: r */
    int f841r = -1;

    /* JADX INFO: renamed from: N */
    boolean f817N = true;

    /* JADX INFO: renamed from: T */
    boolean f823T = true;

    /* JADX INFO: renamed from: ad */
    C0007d f833ad = new C0007d(this);

    /* JADX INFO: renamed from: android.support.v4.a.j$a */
    static class a {

        /* JADX INFO: renamed from: a */
        View f852a;

        /* JADX INFO: renamed from: b */
        Animator f853b;

        /* JADX INFO: renamed from: c */
        int f854c;

        /* JADX INFO: renamed from: d */
        int f855d;

        /* JADX INFO: renamed from: e */
        int f856e;

        /* JADX INFO: renamed from: f */
        int f857f;

        /* JADX INFO: renamed from: i */
        boolean f860i;

        /* JADX INFO: renamed from: j */
        c f861j;

        /* JADX INFO: renamed from: k */
        boolean f862k;

        /* JADX INFO: renamed from: r */
        private Boolean f869r;

        /* JADX INFO: renamed from: s */
        private Boolean f870s;

        /* JADX INFO: renamed from: l */
        private Object f863l = null;

        /* JADX INFO: renamed from: m */
        private Object f864m = ComponentCallbacksC0154j.f803j;

        /* JADX INFO: renamed from: n */
        private Object f865n = null;

        /* JADX INFO: renamed from: o */
        private Object f866o = ComponentCallbacksC0154j.f803j;

        /* JADX INFO: renamed from: p */
        private Object f867p = null;

        /* JADX INFO: renamed from: q */
        private Object f868q = ComponentCallbacksC0154j.f803j;

        /* JADX INFO: renamed from: g */
        AbstractC0142ah f858g = null;

        /* JADX INFO: renamed from: h */
        AbstractC0142ah f859h = null;

        a() {
        }
    }

    /* JADX INFO: renamed from: android.support.v4.a.j$b */
    public static class b extends RuntimeException {
        public b(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* JADX INFO: renamed from: android.support.v4.a.j$c */
    interface c {
        /* JADX INFO: renamed from: a */
        void mo1000a();

        /* JADX INFO: renamed from: b */
        void mo1001b();
    }

    /* JADX INFO: renamed from: a */
    public static ComponentCallbacksC0154j m882a(Context context, String str, Bundle bundle) {
        try {
            Class<?> clsLoadClass = f802a.get(str);
            if (clsLoadClass == null) {
                clsLoadClass = context.getClassLoader().loadClass(str);
                f802a.put(str, clsLoadClass);
            }
            ComponentCallbacksC0154j componentCallbacksC0154j = (ComponentCallbacksC0154j) clsLoadClass.getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(componentCallbacksC0154j.getClass().getClassLoader());
                componentCallbacksC0154j.m957g(bundle);
            }
            return componentCallbacksC0154j;
        } catch (ClassNotFoundException e) {
            throw new b("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e);
        } catch (IllegalAccessException e2) {
            throw new b("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (InstantiationException e3) {
            throw new b("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e3);
        } catch (NoSuchMethodException e4) {
            throw new b("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e4);
        } catch (InvocationTargetException e5) {
            throw new b("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e5);
        }
    }

    /* JADX INFO: renamed from: a */
    static boolean m883a(Context context, String str) {
        try {
            Class<?> clsLoadClass = f802a.get(str);
            if (clsLoadClass == null) {
                clsLoadClass = context.getClassLoader().loadClass(str);
                f802a.put(str, clsLoadClass);
            }
            return ComponentCallbacksC0154j.class.isAssignableFrom(clsLoadClass);
        } catch (ClassNotFoundException e) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ac */
    private a m884ac() {
        if (this.f827X == null) {
            this.f827X = new a();
        }
        return this.f827X;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m885b() {
        c cVar = null;
        if (this.f827X != null) {
            this.f827X.f860i = false;
            c cVar2 = this.f827X.f861j;
            this.f827X.f861j = null;
            cVar = cVar2;
        }
        if (cVar != null) {
            cVar.mo1000a();
        }
    }

    /* JADX INFO: renamed from: A */
    public Object m887A() {
        if (this.f827X == null) {
            return null;
        }
        return this.f827X.f865n;
    }

    /* JADX INFO: renamed from: B */
    public Object m888B() {
        if (this.f827X == null) {
            return null;
        }
        return this.f827X.f866o == f803j ? m887A() : this.f827X.f866o;
    }

    /* JADX INFO: renamed from: C */
    public Object m889C() {
        if (this.f827X == null) {
            return null;
        }
        return this.f827X.f867p;
    }

    /* JADX INFO: renamed from: D */
    public Object m890D() {
        if (this.f827X == null) {
            return null;
        }
        return this.f827X.f868q == f803j ? m889C() : this.f827X.f868q;
    }

    /* JADX INFO: renamed from: E */
    public boolean m891E() {
        if (this.f827X == null || this.f827X.f870s == null) {
            return true;
        }
        return this.f827X.f870s.booleanValue();
    }

    /* JADX INFO: renamed from: F */
    public boolean m892F() {
        if (this.f827X == null || this.f827X.f869r == null) {
            return true;
        }
        return this.f827X.f869r.booleanValue();
    }

    /* JADX INFO: renamed from: G */
    public void m893G() {
        if (this.f804A == null || this.f804A.f919m == null) {
            m884ac().f860i = false;
        } else if (Looper.myLooper() != this.f804A.f919m.m1064h().getLooper()) {
            this.f804A.f919m.m1064h().postAtFrontOfQueue(new Runnable() { // from class: android.support.v4.a.j.1
                @Override // java.lang.Runnable
                public void run() {
                    ComponentCallbacksC0154j.this.m885b();
                }
            });
        } else {
            m885b();
        }
    }

    /* JADX INFO: renamed from: H */
    void m894H() {
        if (this.f805B == null) {
            throw new IllegalStateException("Fragment has not been attached yet.");
        }
        this.f806C = new LayoutInflaterFactory2C0160p();
        this.f806C.m1141a(this.f805B, new AbstractC0156l() { // from class: android.support.v4.a.j.2
            @Override // android.support.v4.p006a.AbstractC0156l
            /* JADX INFO: renamed from: a */
            public ComponentCallbacksC0154j mo989a(Context context, String str, Bundle bundle) {
                return ComponentCallbacksC0154j.this.f805B.mo989a(context, str, bundle);
            }

            @Override // android.support.v4.p006a.AbstractC0156l
            /* JADX INFO: renamed from: a */
            public View mo990a(int i) {
                if (ComponentCallbacksC0154j.this.f820Q == null) {
                    throw new IllegalStateException("Fragment does not have a view");
                }
                return ComponentCallbacksC0154j.this.f820Q.findViewById(i);
            }

            @Override // android.support.v4.p006a.AbstractC0156l
            /* JADX INFO: renamed from: a */
            public boolean mo991a() {
                return ComponentCallbacksC0154j.this.f820Q != null;
            }
        }, this);
    }

    /* JADX INFO: renamed from: I */
    void m895I() {
        if (this.f806C != null) {
            this.f806C.m1184l();
            this.f806C.m1171f();
        }
        this.f834k = 4;
        this.f818O = false;
        mo877d();
        if (!this.f818O) {
            throw new C0143ai("Fragment " + this + " did not call through to super.onStart()");
        }
        if (this.f806C != null) {
            this.f806C.m1190o();
        }
        if (this.f824U != null) {
            this.f824U.m1274g();
        }
        this.f833ad.m29a(AbstractC0005b.a.ON_START);
    }

    /* JADX INFO: renamed from: J */
    void m896J() {
        if (this.f806C != null) {
            this.f806C.m1184l();
            this.f806C.m1171f();
        }
        this.f834k = 5;
        this.f818O = false;
        mo982t();
        if (!this.f818O) {
            throw new C0143ai("Fragment " + this + " did not call through to super.onResume()");
        }
        if (this.f806C != null) {
            this.f806C.m1192p();
            this.f806C.m1171f();
        }
        this.f833ad.m29a(AbstractC0005b.a.ON_RESUME);
    }

    /* JADX INFO: renamed from: K */
    void m897K() {
        if (this.f806C != null) {
            this.f806C.m1184l();
        }
    }

    /* JADX INFO: renamed from: L */
    void m898L() {
        onLowMemory();
        if (this.f806C != null) {
            this.f806C.m1198v();
        }
    }

    /* JADX INFO: renamed from: M */
    void m899M() {
        this.f833ad.m29a(AbstractC0005b.a.ON_PAUSE);
        if (this.f806C != null) {
            this.f806C.m1193q();
        }
        this.f834k = 4;
        this.f818O = false;
        m983u();
        if (!this.f818O) {
            throw new C0143ai("Fragment " + this + " did not call through to super.onPause()");
        }
    }

    /* JADX INFO: renamed from: N */
    void m900N() {
        this.f833ad.m29a(AbstractC0005b.a.ON_STOP);
        if (this.f806C != null) {
            this.f806C.m1194r();
        }
        this.f834k = 3;
        this.f818O = false;
        mo879e();
        if (!this.f818O) {
            throw new C0143ai("Fragment " + this + " did not call through to super.onStop()");
        }
    }

    /* JADX INFO: renamed from: O */
    void m901O() {
        if (this.f806C != null) {
            this.f806C.m1195s();
        }
        this.f834k = 2;
        if (this.f825V) {
            this.f825V = false;
            if (!this.f826W) {
                this.f826W = true;
                this.f824U = this.f805B.m1057a(this.f838o, this.f825V, false);
            }
            if (this.f824U != null) {
                if (this.f805B.m1067k()) {
                    this.f824U.m1271d();
                } else {
                    this.f824U.m1270c();
                }
            }
        }
    }

    /* JADX INFO: renamed from: P */
    void m902P() {
        if (this.f806C != null) {
            this.f806C.m1196t();
        }
        this.f834k = 1;
        this.f818O = false;
        mo881f();
        if (!this.f818O) {
            throw new C0143ai("Fragment " + this + " did not call through to super.onDestroyView()");
        }
        if (this.f824U != null) {
            this.f824U.m1273f();
        }
        this.f848y = false;
    }

    /* JADX INFO: renamed from: Q */
    void m903Q() {
        this.f833ad.m29a(AbstractC0005b.a.ON_DESTROY);
        if (this.f806C != null) {
            this.f806C.m1197u();
        }
        this.f834k = 0;
        this.f818O = false;
        this.f832ac = false;
        mo984v();
        if (!this.f818O) {
            throw new C0143ai("Fragment " + this + " did not call through to super.onDestroy()");
        }
        this.f806C = null;
    }

    /* JADX INFO: renamed from: R */
    void m904R() {
        this.f818O = false;
        mo876c();
        this.f831ab = null;
        if (!this.f818O) {
            throw new C0143ai("Fragment " + this + " did not call through to super.onDetach()");
        }
        if (this.f806C != null) {
            if (!this.f815L) {
                throw new IllegalStateException("Child FragmentManager of " + this + " was not  destroyed and this fragment is not retaining instance");
            }
            this.f806C.m1197u();
            this.f806C = null;
        }
    }

    /* JADX INFO: renamed from: S */
    int m905S() {
        if (this.f827X == null) {
            return 0;
        }
        return this.f827X.f855d;
    }

    /* JADX INFO: renamed from: T */
    int m906T() {
        if (this.f827X == null) {
            return 0;
        }
        return this.f827X.f856e;
    }

    /* JADX INFO: renamed from: U */
    int m907U() {
        if (this.f827X == null) {
            return 0;
        }
        return this.f827X.f857f;
    }

    /* JADX INFO: renamed from: V */
    AbstractC0142ah m908V() {
        if (this.f827X == null) {
            return null;
        }
        return this.f827X.f858g;
    }

    /* JADX INFO: renamed from: W */
    AbstractC0142ah m909W() {
        if (this.f827X == null) {
            return null;
        }
        return this.f827X.f859h;
    }

    /* JADX INFO: renamed from: X */
    View m910X() {
        if (this.f827X == null) {
            return null;
        }
        return this.f827X.f852a;
    }

    /* JADX INFO: renamed from: Y */
    Animator m911Y() {
        if (this.f827X == null) {
            return null;
        }
        return this.f827X.f853b;
    }

    /* JADX INFO: renamed from: Z */
    int m912Z() {
        if (this.f827X == null) {
            return 0;
        }
        return this.f827X.f854c;
    }

    @Override // android.arch.lifecycle.InterfaceC0006c
    /* JADX INFO: renamed from: a */
    public AbstractC0005b mo18a() {
        return this.f833ad;
    }

    /* JADX INFO: renamed from: a */
    ComponentCallbacksC0154j m913a(String str) {
        if (str.equals(this.f838o)) {
            return this;
        }
        if (this.f806C != null) {
            return this.f806C.m1150b(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public View mo914a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    /* JADX INFO: renamed from: a */
    public Animation m915a(int i, boolean z, int i2) {
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final String m916a(int i) {
        return m971l().getString(i);
    }

    /* JADX INFO: renamed from: a */
    public final String m917a(int i, Object... objArr) {
        return m971l().getString(i, objArr);
    }

    /* JADX INFO: renamed from: a */
    void m918a(int i, int i2) {
        if (this.f827X == null && i == 0 && i2 == 0) {
            return;
        }
        m884ac();
        this.f827X.f856e = i;
        this.f827X.f857f = i2;
    }

    /* JADX INFO: renamed from: a */
    public void mo919a(int i, int i2, Intent intent) {
    }

    /* JADX INFO: renamed from: a */
    final void m920a(int i, ComponentCallbacksC0154j componentCallbacksC0154j) {
        this.f837n = i;
        if (componentCallbacksC0154j != null) {
            this.f838o = componentCallbacksC0154j.f838o + ":" + this.f837n;
        } else {
            this.f838o = "android:fragment:" + this.f837n;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m921a(int i, String[] strArr, int[] iArr) {
    }

    /* JADX INFO: renamed from: a */
    void m922a(Animator animator) {
        m884ac().f853b = animator;
    }

    @Deprecated
    /* JADX INFO: renamed from: a */
    public void m923a(Activity activity) {
        this.f818O = true;
    }

    @Deprecated
    /* JADX INFO: renamed from: a */
    public void m924a(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.f818O = true;
    }

    /* JADX INFO: renamed from: a */
    public void mo868a(Context context) {
        this.f818O = true;
        Activity activityM1062f = this.f805B == null ? null : this.f805B.m1062f();
        if (activityM1062f != null) {
            this.f818O = false;
            m923a(activityM1062f);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m925a(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.f818O = true;
        Activity activityM1062f = this.f805B == null ? null : this.f805B.m1062f();
        if (activityM1062f != null) {
            this.f818O = false;
            m924a(activityM1062f, attributeSet, bundle);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m926a(Intent intent) {
        m928a(intent, (Bundle) null);
    }

    /* JADX INFO: renamed from: a */
    public void m927a(Intent intent, int i, Bundle bundle) {
        if (this.f805B == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        this.f805B.mo1014a(this, intent, i, bundle);
    }

    /* JADX INFO: renamed from: a */
    public void m928a(Intent intent, Bundle bundle) {
        if (this.f805B == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        this.f805B.mo1014a(this, intent, -1, bundle);
    }

    /* JADX INFO: renamed from: a */
    void m929a(Configuration configuration) {
        onConfigurationChanged(configuration);
        if (this.f806C != null) {
            this.f806C.m1132a(configuration);
        }
    }

    /* JADX INFO: renamed from: a */
    public void mo869a(Bundle bundle) {
        this.f818O = true;
        m967j(bundle);
        if (this.f806C == null || this.f806C.m1144a(1)) {
            return;
        }
        this.f806C.m1186m();
    }

    /* JADX INFO: renamed from: a */
    void m930a(c cVar) {
        m884ac();
        if (cVar == this.f827X.f861j) {
            return;
        }
        if (cVar != null && this.f827X.f861j != null) {
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
        if (this.f827X.f860i) {
            this.f827X.f861j = cVar;
        }
        if (cVar != null) {
            cVar.mo1001b();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m931a(ComponentCallbacksC0154j componentCallbacksC0154j) {
    }

    /* JADX INFO: renamed from: a */
    public void m932a(Menu menu) {
    }

    /* JADX INFO: renamed from: a */
    public void mo933a(Menu menu, MenuInflater menuInflater) {
    }

    /* JADX INFO: renamed from: a */
    public void m934a(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    /* JADX INFO: renamed from: a */
    public void mo935a(View view, Bundle bundle) {
    }

    /* JADX INFO: renamed from: a */
    public void mo936a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.f809F));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.f810G));
        printWriter.print(" mTag=");
        printWriter.println(this.f811H);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f834k);
        printWriter.print(" mIndex=");
        printWriter.print(this.f837n);
        printWriter.print(" mWho=");
        printWriter.print(this.f838o);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f849z);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f843t);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f844u);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f845v);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f846w);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.f812I);
        printWriter.print(" mDetached=");
        printWriter.print(this.f813J);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.f817N);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.f816M);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.f814K);
        printWriter.print(" mRetaining=");
        printWriter.print(this.f815L);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.f823T);
        if (this.f804A != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f804A);
        }
        if (this.f805B != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f805B);
        }
        if (this.f808E != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f808E);
        }
        if (this.f839p != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f839p);
        }
        if (this.f835l != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f835l);
        }
        if (this.f836m != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f836m);
        }
        if (this.f840q != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(this.f840q);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f842s);
        }
        if (m905S() != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(m905S());
        }
        if (this.f819P != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.f819P);
        }
        if (this.f820Q != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.f820Q);
        }
        if (this.f821R != null) {
            printWriter.print(str);
            printWriter.print("mInnerView=");
            printWriter.println(this.f820Q);
        }
        if (m910X() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(m910X());
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(m912Z());
        }
        if (this.f824U != null) {
            printWriter.print(str);
            printWriter.println("Loader Manager:");
            this.f824U.m1268a(str + "  ", fileDescriptor, printWriter, strArr);
        }
        if (this.f806C != null) {
            printWriter.print(str);
            printWriter.println("Child " + this.f806C + ":");
            this.f806C.mo1075a(str + "  ", fileDescriptor, printWriter, strArr);
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean mo937a(MenuItem menuItem) {
        return false;
    }

    /* JADX INFO: renamed from: aa */
    boolean m938aa() {
        if (this.f827X == null) {
            return false;
        }
        return this.f827X.f860i;
    }

    /* JADX INFO: renamed from: ab */
    boolean m939ab() {
        if (this.f827X == null) {
            return false;
        }
        return this.f827X.f862k;
    }

    /* JADX INFO: renamed from: b */
    public Animator m940b(int i, boolean z, int i2) {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public LayoutInflater mo873b(Bundle bundle) {
        return m963i(bundle);
    }

    /* JADX INFO: renamed from: b */
    View m941b(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (this.f806C != null) {
            this.f806C.m1184l();
        }
        this.f848y = true;
        return mo914a(layoutInflater, viewGroup, bundle);
    }

    /* JADX INFO: renamed from: b */
    void m942b(int i) {
        if (this.f827X == null && i == 0) {
            return;
        }
        m884ac().f855d = i;
    }

    /* JADX INFO: renamed from: b */
    public void m943b(Menu menu) {
    }

    /* JADX INFO: renamed from: b */
    void m944b(View view) {
        m884ac().f852a = view;
    }

    /* JADX INFO: renamed from: b */
    boolean m945b(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.f812I) {
            return false;
        }
        if (this.f816M && this.f817N) {
            z = true;
            mo933a(menu, menuInflater);
        }
        return this.f806C != null ? z | this.f806C.m1146a(menu, menuInflater) : z;
    }

    /* JADX INFO: renamed from: b */
    public boolean mo946b(MenuItem menuItem) {
        return false;
    }

    /* JADX INFO: renamed from: c */
    public void mo876c() {
        this.f818O = true;
    }

    /* JADX INFO: renamed from: c */
    void m947c(int i) {
        m884ac().f854c = i;
    }

    /* JADX INFO: renamed from: c */
    public void m948c(boolean z) {
    }

    /* JADX INFO: renamed from: c */
    boolean m949c(Menu menu) {
        boolean z = false;
        if (this.f812I) {
            return false;
        }
        if (this.f816M && this.f817N) {
            z = true;
            m932a(menu);
        }
        return this.f806C != null ? z | this.f806C.m1145a(menu) : z;
    }

    /* JADX INFO: renamed from: c */
    boolean m950c(MenuItem menuItem) {
        if (!this.f812I) {
            if (this.f816M && this.f817N && mo937a(menuItem)) {
                return true;
            }
            if (this.f806C != null && this.f806C.m1147a(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public void mo877d() {
        this.f818O = true;
        if (this.f825V) {
            return;
        }
        this.f825V = true;
        if (!this.f826W) {
            this.f826W = true;
            this.f824U = this.f805B.m1057a(this.f838o, this.f825V, false);
        } else if (this.f824U != null) {
            this.f824U.m1269b();
        }
    }

    /* JADX INFO: renamed from: d */
    public void mo878d(Bundle bundle) {
        this.f818O = true;
    }

    /* JADX INFO: renamed from: d */
    void m951d(Menu menu) {
        if (this.f812I) {
            return;
        }
        if (this.f816M && this.f817N) {
            m943b(menu);
        }
        if (this.f806C != null) {
            this.f806C.m1156b(menu);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m952d(boolean z) {
        this.f814K = z;
    }

    /* JADX INFO: renamed from: d */
    boolean m953d(MenuItem menuItem) {
        if (!this.f812I) {
            if (mo946b(menuItem)) {
                return true;
            }
            if (this.f806C != null && this.f806C.m1158b(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public void mo879e() {
        this.f818O = true;
    }

    /* JADX INFO: renamed from: e */
    public void mo880e(Bundle bundle) {
    }

    /* JADX INFO: renamed from: e */
    public void m954e(boolean z) {
        if (this.f816M != z) {
            this.f816M = z;
            if (!m978p() || m980r()) {
                return;
            }
            this.f805B.mo1019c();
        }
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* JADX INFO: renamed from: f */
    public void mo881f() {
        this.f818O = true;
    }

    /* JADX INFO: renamed from: f */
    final void m955f(Bundle bundle) {
        if (this.f836m != null) {
            this.f821R.restoreHierarchyState(this.f836m);
            this.f836m = null;
        }
        this.f818O = false;
        m970k(bundle);
        if (!this.f818O) {
            throw new C0143ai("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
    }

    /* JADX INFO: renamed from: f */
    public void m956f(boolean z) {
    }

    /* JADX INFO: renamed from: g */
    public void m957g(Bundle bundle) {
        if (this.f837n >= 0 && m965i()) {
            throw new IllegalStateException("Fragment already active and state has been saved");
        }
        this.f839p = bundle;
    }

    /* JADX INFO: renamed from: g */
    public void m958g(boolean z) {
    }

    /* JADX INFO: renamed from: g */
    final boolean m959g() {
        return this.f849z > 0;
    }

    /* JADX INFO: renamed from: h */
    LayoutInflater m960h(Bundle bundle) {
        this.f831ab = mo873b(bundle);
        return this.f831ab;
    }

    /* JADX INFO: renamed from: h */
    public final String m961h() {
        return this.f811H;
    }

    /* JADX INFO: renamed from: h */
    void m962h(boolean z) {
        m956f(z);
        if (this.f806C != null) {
            this.f806C.m1143a(z);
        }
    }

    public final int hashCode() {
        return super.hashCode();
    }

    @Deprecated
    /* JADX INFO: renamed from: i */
    public LayoutInflater m963i(Bundle bundle) {
        if (this.f805B == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        LayoutInflater layoutInflaterMo1017b = this.f805B.mo1017b();
        m975n();
        C0234e.m1695b(layoutInflaterMo1017b, this.f806C.m1200x());
        return layoutInflaterMo1017b;
    }

    /* JADX INFO: renamed from: i */
    void m964i(boolean z) {
        m958g(z);
        if (this.f806C != null) {
            this.f806C.m1157b(z);
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m965i() {
        if (this.f804A == null) {
            return false;
        }
        return this.f804A.mo1078d();
    }

    /* JADX INFO: renamed from: j */
    public Context m966j() {
        if (this.f805B == null) {
            return null;
        }
        return this.f805B.m1063g();
    }

    /* JADX INFO: renamed from: j */
    void m967j(Bundle bundle) {
        Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        if (this.f806C == null) {
            m894H();
        }
        this.f806C.m1134a(parcelable, this.f807D);
        this.f807D = null;
        this.f806C.m1186m();
    }

    /* JADX INFO: renamed from: j */
    void m968j(boolean z) {
        m884ac().f862k = z;
    }

    /* JADX INFO: renamed from: k */
    public final ActivityC0155k m969k() {
        if (this.f805B == null) {
            return null;
        }
        return (ActivityC0155k) this.f805B.m1062f();
    }

    /* JADX INFO: renamed from: k */
    public void m970k(Bundle bundle) {
        this.f818O = true;
    }

    /* JADX INFO: renamed from: l */
    public final Resources m971l() {
        if (this.f805B == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        return this.f805B.m1063g().getResources();
    }

    /* JADX INFO: renamed from: l */
    void m972l(Bundle bundle) {
        if (this.f806C != null) {
            this.f806C.m1184l();
        }
        this.f834k = 1;
        this.f818O = false;
        mo869a(bundle);
        this.f832ac = true;
        if (!this.f818O) {
            throw new C0143ai("Fragment " + this + " did not call through to super.onCreate()");
        }
        this.f833ad.m29a(AbstractC0005b.a.ON_CREATE);
    }

    /* JADX INFO: renamed from: m */
    public final AbstractC0159o m973m() {
        return this.f804A;
    }

    /* JADX INFO: renamed from: m */
    void m974m(Bundle bundle) {
        if (this.f806C != null) {
            this.f806C.m1184l();
        }
        this.f834k = 2;
        this.f818O = false;
        mo878d(bundle);
        if (!this.f818O) {
            throw new C0143ai("Fragment " + this + " did not call through to super.onActivityCreated()");
        }
        if (this.f806C != null) {
            this.f806C.m1189n();
        }
    }

    /* JADX INFO: renamed from: n */
    public final AbstractC0159o m975n() {
        if (this.f806C == null) {
            m894H();
            if (this.f834k >= 5) {
                this.f806C.m1192p();
            } else if (this.f834k >= 4) {
                this.f806C.m1190o();
            } else if (this.f834k >= 2) {
                this.f806C.m1189n();
            } else if (this.f834k >= 1) {
                this.f806C.m1186m();
            }
        }
        return this.f806C;
    }

    /* JADX INFO: renamed from: n */
    void m976n(Bundle bundle) {
        Parcelable parcelableM1182k;
        mo880e(bundle);
        if (this.f806C == null || (parcelableM1182k = this.f806C.m1182k()) == null) {
            return;
        }
        bundle.putParcelable("android:support:fragments", parcelableM1182k);
    }

    /* JADX INFO: renamed from: o */
    AbstractC0159o m977o() {
        return this.f806C;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.f818O = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        m969k().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.f818O = true;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m978p() {
        return this.f805B != null && this.f843t;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m979q() {
        return this.f844u;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m980r() {
        return this.f812I;
    }

    /* JADX INFO: renamed from: s */
    public View m981s() {
        return this.f820Q;
    }

    public void startActivityForResult(Intent intent, int i) {
        m927a(intent, i, (Bundle) null);
    }

    /* JADX INFO: renamed from: t */
    public void mo982t() {
        this.f818O = true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        C0210d.m1535a(this, sb);
        if (this.f837n >= 0) {
            sb.append(" #");
            sb.append(this.f837n);
        }
        if (this.f809F != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f809F));
        }
        if (this.f811H != null) {
            sb.append(" ");
            sb.append(this.f811H);
        }
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public void m983u() {
        this.f818O = true;
    }

    /* JADX INFO: renamed from: v */
    public void mo984v() {
        this.f818O = true;
        if (!this.f826W) {
            this.f826W = true;
            this.f824U = this.f805B.m1057a(this.f838o, this.f825V, false);
        }
        if (this.f824U != null) {
            this.f824U.m1275h();
        }
    }

    /* JADX INFO: renamed from: w */
    void m985w() {
        this.f837n = -1;
        this.f838o = null;
        this.f843t = false;
        this.f844u = false;
        this.f845v = false;
        this.f846w = false;
        this.f847x = false;
        this.f849z = 0;
        this.f804A = null;
        this.f806C = null;
        this.f805B = null;
        this.f809F = 0;
        this.f810G = 0;
        this.f811H = null;
        this.f812I = false;
        this.f813J = false;
        this.f815L = false;
        this.f824U = null;
        this.f825V = false;
        this.f826W = false;
    }

    /* JADX INFO: renamed from: x */
    public void m986x() {
    }

    /* JADX INFO: renamed from: y */
    public Object m987y() {
        if (this.f827X == null) {
            return null;
        }
        return this.f827X.f863l;
    }

    /* JADX INFO: renamed from: z */
    public Object m988z() {
        if (this.f827X == null) {
            return null;
        }
        return this.f827X.f864m == f803j ? m987y() : this.f827X.f864m;
    }
}
