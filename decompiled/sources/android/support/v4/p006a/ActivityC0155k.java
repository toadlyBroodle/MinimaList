package android.support.v4.p006a;

import android.arch.lifecycle.AbstractC0005b;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.support.v4.p006a.C0134a;
import android.support.v4.p018i.C0219m;
import android.support.v4.p018i.C0220n;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: renamed from: android.support.v4.a.k */
/* JADX INFO: loaded from: classes.dex */
public class ActivityC0155k extends AbstractActivityC0151g implements C0134a.a, C0134a.c {

    /* JADX INFO: renamed from: e */
    boolean f873e;

    /* JADX INFO: renamed from: f */
    boolean f874f;

    /* JADX INFO: renamed from: i */
    boolean f877i;

    /* JADX INFO: renamed from: j */
    boolean f878j;

    /* JADX INFO: renamed from: k */
    int f879k;

    /* JADX INFO: renamed from: l */
    C0220n<String> f880l;

    /* JADX INFO: renamed from: c */
    final Handler f871c = new Handler() { // from class: android.support.v4.a.k.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    if (ActivityC0155k.this.f875g) {
                        ActivityC0155k.this.m1006a(false);
                    }
                    break;
                case 2:
                    ActivityC0155k.this.m1008b_();
                    ActivityC0155k.this.f872d.m1052o();
                    break;
                default:
                    super.handleMessage(message);
                    break;
            }
        }
    };

    /* JADX INFO: renamed from: d */
    final C0157m f872d = C0157m.m1022a(new a());

    /* JADX INFO: renamed from: g */
    boolean f875g = true;

    /* JADX INFO: renamed from: h */
    boolean f876h = true;

    /* JADX INFO: renamed from: android.support.v4.a.k$a */
    class a extends AbstractC0158n<ActivityC0155k> {
        public a() {
            super(ActivityC0155k.this);
        }

        @Override // android.support.v4.p006a.AbstractC0158n, android.support.v4.p006a.AbstractC0156l
        /* JADX INFO: renamed from: a */
        public View mo990a(int i) {
            return ActivityC0155k.this.findViewById(i);
        }

        @Override // android.support.v4.p006a.AbstractC0158n
        /* JADX INFO: renamed from: a */
        public void mo1014a(ComponentCallbacksC0154j componentCallbacksC0154j, Intent intent, int i, Bundle bundle) {
            ActivityC0155k.this.m1005a(componentCallbacksC0154j, intent, i, bundle);
        }

        @Override // android.support.v4.p006a.AbstractC0158n
        /* JADX INFO: renamed from: a */
        public void mo1015a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            ActivityC0155k.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // android.support.v4.p006a.AbstractC0158n, android.support.v4.p006a.AbstractC0156l
        /* JADX INFO: renamed from: a */
        public boolean mo991a() {
            Window window = ActivityC0155k.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // android.support.v4.p006a.AbstractC0158n
        /* JADX INFO: renamed from: a */
        public boolean mo1016a(ComponentCallbacksC0154j componentCallbacksC0154j) {
            return !ActivityC0155k.this.isFinishing();
        }

        @Override // android.support.v4.p006a.AbstractC0158n
        /* JADX INFO: renamed from: b */
        public LayoutInflater mo1017b() {
            return ActivityC0155k.this.getLayoutInflater().cloneInContext(ActivityC0155k.this);
        }

        @Override // android.support.v4.p006a.AbstractC0158n
        /* JADX INFO: renamed from: b */
        public void mo1018b(ComponentCallbacksC0154j componentCallbacksC0154j) {
            ActivityC0155k.this.m1004a(componentCallbacksC0154j);
        }

        @Override // android.support.v4.p006a.AbstractC0158n
        /* JADX INFO: renamed from: c */
        public void mo1019c() {
            ActivityC0155k.this.mo1010d();
        }

        @Override // android.support.v4.p006a.AbstractC0158n
        /* JADX INFO: renamed from: d */
        public boolean mo1020d() {
            return ActivityC0155k.this.getWindow() != null;
        }

        @Override // android.support.v4.p006a.AbstractC0158n
        /* JADX INFO: renamed from: e */
        public int mo1021e() {
            Window window = ActivityC0155k.this.getWindow();
            if (window == null) {
                return 0;
            }
            return window.getAttributes().windowAnimations;
        }
    }

    /* JADX INFO: renamed from: android.support.v4.a.k$b */
    static final class b {

        /* JADX INFO: renamed from: a */
        Object f883a;

        /* JADX INFO: renamed from: b */
        C0161q f884b;

        /* JADX INFO: renamed from: c */
        C0219m<String, AbstractC0168x> f885c;

        b() {
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m1002a(AbstractC0159o abstractC0159o, AbstractC0005b.b bVar) {
        for (ComponentCallbacksC0154j componentCallbacksC0154j : abstractC0159o.mo1077c()) {
            if (componentCallbacksC0154j != null) {
                componentCallbacksC0154j.f833ad.m30a(bVar);
                AbstractC0159o abstractC0159oM977o = componentCallbacksC0154j.m977o();
                if (abstractC0159oM977o != null) {
                    m1002a(abstractC0159oM977o, bVar);
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private int m1003b(ComponentCallbacksC0154j componentCallbacksC0154j) {
        if (this.f880l.m1590b() >= 65534) {
            throw new IllegalStateException("Too many pending Fragment activity results.");
        }
        while (this.f880l.m1598f(this.f879k) >= 0) {
            this.f879k = (this.f879k + 1) % 65534;
        }
        int i = this.f879k;
        this.f880l.m1592b(i, componentCallbacksC0154j.f838o);
        this.f879k = (this.f879k + 1) % 65534;
        return i;
    }

    @Override // android.support.v4.p006a.ActivityC0144aj, android.arch.lifecycle.InterfaceC0006c
    /* JADX INFO: renamed from: a */
    public AbstractC0005b mo18a() {
        return super.mo18a();
    }

    @Override // android.support.v4.p006a.AbstractActivityC0150f
    /* JADX INFO: renamed from: a */
    final View mo861a(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f872d.m1025a(view, str, context, attributeSet);
    }

    @Override // android.support.v4.p006a.C0134a.c
    /* JADX INFO: renamed from: a */
    public final void mo763a(int i) {
        if (this.f878j || i == -1) {
            return;
        }
        m860b(i);
    }

    /* JADX INFO: renamed from: a */
    public void m1004a(ComponentCallbacksC0154j componentCallbacksC0154j) {
    }

    /* JADX INFO: renamed from: a */
    public void m1005a(ComponentCallbacksC0154j componentCallbacksC0154j, Intent intent, int i, Bundle bundle) {
        this.f788b = true;
        try {
            if (i == -1) {
                C0134a.m759a(this, intent, -1, bundle);
            } else {
                m860b(i);
                C0134a.m759a(this, intent, ((m1003b(componentCallbacksC0154j) + 1) << 16) + (65535 & i), bundle);
                this.f788b = false;
            }
        } finally {
            this.f788b = false;
        }
    }

    /* JADX INFO: renamed from: a */
    void m1006a(boolean z) {
        if (this.f876h) {
            if (z) {
                this.f872d.m1053p();
                this.f872d.m1040c(true);
                return;
            }
            return;
        }
        this.f876h = true;
        this.f877i = z;
        this.f871c.removeMessages(1);
        m1011e();
    }

    /* JADX INFO: renamed from: a */
    protected boolean m1007a(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    /* JADX INFO: renamed from: b_ */
    protected void m1008b_() {
        this.f872d.m1046i();
    }

    /* JADX INFO: renamed from: c */
    public Object m1009c() {
        return null;
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public void mo1010d() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.f873e);
        printWriter.print("mResumed=");
        printWriter.print(this.f874f);
        printWriter.print(" mStopped=");
        printWriter.print(this.f875g);
        printWriter.print(" mReallyStopped=");
        printWriter.println(this.f876h);
        this.f872d.m1030a(str2, fileDescriptor, printWriter, strArr);
        this.f872d.m1024a().mo1075a(str, fileDescriptor, printWriter, strArr);
    }

    /* JADX INFO: renamed from: e */
    void m1011e() {
        this.f872d.m1040c(this.f877i);
        this.f872d.m1049l();
    }

    /* JADX INFO: renamed from: f */
    public AbstractC0159o m1012f() {
        return this.f872d.m1024a();
    }

    /* JADX INFO: renamed from: g */
    public AbstractC0168x m1013g() {
        return this.f872d.m1035b();
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        this.f872d.m1039c();
        int i3 = i >> 16;
        if (i3 == 0) {
            C0134a.b bVarM757a = C0134a.m757a();
            if (bVarM757a == null || !bVarM757a.m761a(this, i, i2, intent)) {
                super.onActivityResult(i, i2, intent);
                return;
            }
            return;
        }
        int i4 = i3 - 1;
        String strM1588a = this.f880l.m1588a(i4);
        this.f880l.m1594c(i4);
        if (strM1588a == null) {
            Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
            return;
        }
        ComponentCallbacksC0154j componentCallbacksC0154jM1023a = this.f872d.m1023a(strM1588a);
        if (componentCallbacksC0154jM1023a == null) {
            Log.w("FragmentActivity", "Activity result no fragment exists for who: " + strM1588a);
        } else {
            componentCallbacksC0154jM1023a.mo919a(65535 & i, i2, intent);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        AbstractC0159o abstractC0159oM1024a = this.f872d.m1024a();
        boolean zMo1078d = abstractC0159oM1024a.mo1078d();
        if (!zMo1078d || Build.VERSION.SDK_INT > 25) {
            if (zMo1078d || !abstractC0159oM1024a.mo1076b()) {
                super.onBackPressed();
            }
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f872d.m1026a(configuration);
    }

    @Override // android.support.v4.p006a.ActivityC0144aj, android.app.Activity
    protected void onCreate(Bundle bundle) {
        this.f872d.m1028a((ComponentCallbacksC0154j) null);
        super.onCreate(bundle);
        b bVar = (b) getLastNonConfigurationInstance();
        if (bVar != null) {
            this.f872d.m1029a(bVar.f885c);
        }
        if (bundle != null) {
            this.f872d.m1027a(bundle.getParcelable("android:support:fragments"), bVar != null ? bVar.f884b : null);
            if (bundle.containsKey("android:support:next_request_index")) {
                this.f879k = bundle.getInt("android:support:next_request_index");
                int[] intArray = bundle.getIntArray("android:support:request_indicies");
                String[] stringArray = bundle.getStringArray("android:support:request_fragment_who");
                if (intArray == null || stringArray == null || intArray.length != stringArray.length) {
                    Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
                } else {
                    this.f880l = new C0220n<>(intArray.length);
                    for (int i = 0; i < intArray.length; i++) {
                        this.f880l.m1592b(intArray[i], stringArray[i]);
                    }
                }
            }
        }
        if (this.f880l == null) {
            this.f880l = new C0220n<>();
            this.f879k = 0;
        }
        this.f872d.m1043f();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        return i == 0 ? super.onCreatePanelMenu(i, menu) | this.f872d.m1033a(menu, getMenuInflater()) : super.onCreatePanelMenu(i, menu);
    }

    @Override // android.support.v4.p006a.AbstractActivityC0150f, android.app.Activity, android.view.LayoutInflater.Factory2
    public /* bridge */ /* synthetic */ View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return super.onCreateView(view, str, context, attributeSet);
    }

    @Override // android.support.v4.p006a.AbstractActivityC0150f, android.app.Activity, android.view.LayoutInflater.Factory
    public /* bridge */ /* synthetic */ View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return super.onCreateView(str, context, attributeSet);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        m1006a(false);
        this.f872d.m1050m();
        this.f872d.m1054q();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.f872d.m1051n();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        switch (i) {
            case 0:
                return this.f872d.m1034a(menuItem);
            case 6:
                return this.f872d.m1038b(menuItem);
            default:
                return false;
        }
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        this.f872d.m1031a(z);
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f872d.m1039c();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        switch (i) {
            case 0:
                this.f872d.m1036b(menu);
                break;
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.f874f = false;
        if (this.f871c.hasMessages(2)) {
            this.f871c.removeMessages(2);
            m1008b_();
        }
        this.f872d.m1047j();
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z) {
        this.f872d.m1037b(z);
    }

    @Override // android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        this.f871c.removeMessages(2);
        m1008b_();
        this.f872d.m1052o();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        return (i != 0 || menu == null) ? super.onPreparePanel(i, view, menu) : m1007a(view, menu) | this.f872d.m1032a(menu);
    }

    @Override // android.app.Activity, android.support.v4.p006a.C0134a.a
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f872d.m1039c();
        int i2 = (i >> 16) & 65535;
        if (i2 != 0) {
            int i3 = i2 - 1;
            String strM1588a = this.f880l.m1588a(i3);
            this.f880l.m1594c(i3);
            if (strM1588a == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            ComponentCallbacksC0154j componentCallbacksC0154jM1023a = this.f872d.m1023a(strM1588a);
            if (componentCallbacksC0154jM1023a == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for who: " + strM1588a);
            } else {
                componentCallbacksC0154jM1023a.m921a(i & 65535, strArr, iArr);
            }
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        this.f871c.sendEmptyMessage(2);
        this.f874f = true;
        this.f872d.m1052o();
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        if (this.f875g) {
            m1006a(true);
        }
        Object objM1009c = m1009c();
        C0161q c0161qM1042e = this.f872d.m1042e();
        C0219m<String, AbstractC0168x> c0219mM1056s = this.f872d.m1056s();
        if (c0161qM1042e == null && c0219mM1056s == null && objM1009c == null) {
            return null;
        }
        b bVar = new b();
        bVar.f883a = objM1009c;
        bVar.f884b = c0161qM1042e;
        bVar.f885c = c0219mM1056s;
        return bVar;
    }

    @Override // android.support.v4.p006a.ActivityC0144aj, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        m1002a(m1012f(), AbstractC0005b.b.CREATED);
        Parcelable parcelableM1041d = this.f872d.m1041d();
        if (parcelableM1041d != null) {
            bundle.putParcelable("android:support:fragments", parcelableM1041d);
        }
        if (this.f880l.m1590b() <= 0) {
            return;
        }
        bundle.putInt("android:support:next_request_index", this.f879k);
        int[] iArr = new int[this.f880l.m1590b()];
        String[] strArr = new String[this.f880l.m1590b()];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.f880l.m1590b()) {
                bundle.putIntArray("android:support:request_indicies", iArr);
                bundle.putStringArray("android:support:request_fragment_who", strArr);
                return;
            } else {
                iArr[i2] = this.f880l.m1596d(i2);
                strArr[i2] = this.f880l.m1597e(i2);
                i = i2 + 1;
            }
        }
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        this.f875g = false;
        this.f876h = false;
        this.f871c.removeMessages(1);
        if (!this.f873e) {
            this.f873e = true;
            this.f872d.m1044g();
        }
        this.f872d.m1039c();
        this.f872d.m1052o();
        this.f872d.m1053p();
        this.f872d.m1045h();
        this.f872d.m1055r();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.f872d.m1039c();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        this.f875g = true;
        m1002a(m1012f(), AbstractC0005b.b.CREATED);
        this.f871c.sendEmptyMessage(1);
        this.f872d.m1048k();
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i) {
        if (!this.f788b && i != -1) {
            m860b(i);
        }
        super.startActivityForResult(intent, i);
    }

    @Override // android.support.v4.p006a.AbstractActivityC0151g, android.app.Activity
    public /* bridge */ /* synthetic */ void startActivityForResult(Intent intent, int i, Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.support.v4.p006a.AbstractActivityC0150f, android.app.Activity
    public /* bridge */ /* synthetic */ void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.support.v4.p006a.AbstractActivityC0151g, android.app.Activity
    public /* bridge */ /* synthetic */ void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}
