package android.support.v7.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.support.v4.p019j.C0246q;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.p022a.C0333a;
import android.support.v7.widget.C0477ao;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
class AlertController {

    /* JADX INFO: renamed from: B */
    private CharSequence f1768B;

    /* JADX INFO: renamed from: C */
    private CharSequence f1769C;

    /* JADX INFO: renamed from: D */
    private CharSequence f1770D;

    /* JADX INFO: renamed from: F */
    private Drawable f1772F;

    /* JADX INFO: renamed from: G */
    private ImageView f1773G;

    /* JADX INFO: renamed from: H */
    private TextView f1774H;

    /* JADX INFO: renamed from: I */
    private TextView f1775I;

    /* JADX INFO: renamed from: J */
    private View f1776J;

    /* JADX INFO: renamed from: K */
    private int f1777K;

    /* JADX INFO: renamed from: L */
    private int f1778L;

    /* JADX INFO: renamed from: M */
    private boolean f1779M;

    /* JADX INFO: renamed from: a */
    final DialogC0357n f1782a;

    /* JADX INFO: renamed from: b */
    ListView f1783b;

    /* JADX INFO: renamed from: c */
    Button f1784c;

    /* JADX INFO: renamed from: d */
    Message f1785d;

    /* JADX INFO: renamed from: e */
    Button f1786e;

    /* JADX INFO: renamed from: f */
    Message f1787f;

    /* JADX INFO: renamed from: g */
    Button f1788g;

    /* JADX INFO: renamed from: h */
    Message f1789h;

    /* JADX INFO: renamed from: i */
    NestedScrollView f1790i;

    /* JADX INFO: renamed from: j */
    ListAdapter f1791j;

    /* JADX INFO: renamed from: l */
    int f1793l;

    /* JADX INFO: renamed from: m */
    int f1794m;

    /* JADX INFO: renamed from: n */
    int f1795n;

    /* JADX INFO: renamed from: o */
    int f1796o;

    /* JADX INFO: renamed from: p */
    Handler f1797p;

    /* JADX INFO: renamed from: q */
    private final Context f1798q;

    /* JADX INFO: renamed from: r */
    private final Window f1799r;

    /* JADX INFO: renamed from: s */
    private CharSequence f1800s;

    /* JADX INFO: renamed from: t */
    private CharSequence f1801t;

    /* JADX INFO: renamed from: u */
    private View f1802u;

    /* JADX INFO: renamed from: v */
    private int f1803v;

    /* JADX INFO: renamed from: w */
    private int f1804w;

    /* JADX INFO: renamed from: x */
    private int f1805x;

    /* JADX INFO: renamed from: y */
    private int f1806y;

    /* JADX INFO: renamed from: z */
    private int f1807z;

    /* JADX INFO: renamed from: A */
    private boolean f1767A = false;

    /* JADX INFO: renamed from: E */
    private int f1771E = 0;

    /* JADX INFO: renamed from: k */
    int f1792k = -1;

    /* JADX INFO: renamed from: N */
    private int f1780N = 0;

    /* JADX INFO: renamed from: O */
    private final View.OnClickListener f1781O = new View.OnClickListener() { // from class: android.support.v7.app.AlertController.1
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message messageObtain = (view != AlertController.this.f1784c || AlertController.this.f1785d == null) ? (view != AlertController.this.f1786e || AlertController.this.f1787f == null) ? (view != AlertController.this.f1788g || AlertController.this.f1789h == null) ? null : Message.obtain(AlertController.this.f1789h) : Message.obtain(AlertController.this.f1787f) : Message.obtain(AlertController.this.f1785d);
            if (messageObtain != null) {
                messageObtain.sendToTarget();
            }
            AlertController.this.f1797p.obtainMessage(1, AlertController.this.f1782a).sendToTarget();
        }
    };

    public static class RecycleListView extends ListView {

        /* JADX INFO: renamed from: a */
        private final int f1821a;

        /* JADX INFO: renamed from: b */
        private final int f1822b;

        public RecycleListView(Context context) {
            this(context, null);
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0333a.j.RecycleListView);
            this.f1822b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C0333a.j.RecycleListView_paddingBottomNoButtons, -1);
            this.f1821a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C0333a.j.RecycleListView_paddingTopNoTitle, -1);
        }

        /* JADX INFO: renamed from: a */
        public void m2539a(boolean z, boolean z2) {
            if (z2 && z) {
                return;
            }
            setPadding(getPaddingLeft(), z ? getPaddingTop() : this.f1821a, getPaddingRight(), z2 ? getPaddingBottom() : this.f1822b);
        }
    }

    /* JADX INFO: renamed from: android.support.v7.app.AlertController$a */
    public static class C0339a {

        /* JADX INFO: renamed from: A */
        public int f1823A;

        /* JADX INFO: renamed from: C */
        public boolean[] f1825C;

        /* JADX INFO: renamed from: D */
        public boolean f1826D;

        /* JADX INFO: renamed from: E */
        public boolean f1827E;

        /* JADX INFO: renamed from: G */
        public DialogInterface.OnMultiChoiceClickListener f1829G;

        /* JADX INFO: renamed from: H */
        public Cursor f1830H;

        /* JADX INFO: renamed from: I */
        public String f1831I;

        /* JADX INFO: renamed from: J */
        public String f1832J;

        /* JADX INFO: renamed from: K */
        public AdapterView.OnItemSelectedListener f1833K;

        /* JADX INFO: renamed from: L */
        public a f1834L;

        /* JADX INFO: renamed from: a */
        public final Context f1836a;

        /* JADX INFO: renamed from: b */
        public final LayoutInflater f1837b;

        /* JADX INFO: renamed from: d */
        public Drawable f1839d;

        /* JADX INFO: renamed from: f */
        public CharSequence f1841f;

        /* JADX INFO: renamed from: g */
        public View f1842g;

        /* JADX INFO: renamed from: h */
        public CharSequence f1843h;

        /* JADX INFO: renamed from: i */
        public CharSequence f1844i;

        /* JADX INFO: renamed from: j */
        public DialogInterface.OnClickListener f1845j;

        /* JADX INFO: renamed from: k */
        public CharSequence f1846k;

        /* JADX INFO: renamed from: l */
        public DialogInterface.OnClickListener f1847l;

        /* JADX INFO: renamed from: m */
        public CharSequence f1848m;

        /* JADX INFO: renamed from: n */
        public DialogInterface.OnClickListener f1849n;

        /* JADX INFO: renamed from: p */
        public DialogInterface.OnCancelListener f1851p;

        /* JADX INFO: renamed from: q */
        public DialogInterface.OnDismissListener f1852q;

        /* JADX INFO: renamed from: r */
        public DialogInterface.OnKeyListener f1853r;

        /* JADX INFO: renamed from: s */
        public CharSequence[] f1854s;

        /* JADX INFO: renamed from: t */
        public ListAdapter f1855t;

        /* JADX INFO: renamed from: u */
        public DialogInterface.OnClickListener f1856u;

        /* JADX INFO: renamed from: v */
        public int f1857v;

        /* JADX INFO: renamed from: w */
        public View f1858w;

        /* JADX INFO: renamed from: x */
        public int f1859x;

        /* JADX INFO: renamed from: y */
        public int f1860y;

        /* JADX INFO: renamed from: z */
        public int f1861z;

        /* JADX INFO: renamed from: c */
        public int f1838c = 0;

        /* JADX INFO: renamed from: e */
        public int f1840e = 0;

        /* JADX INFO: renamed from: B */
        public boolean f1824B = false;

        /* JADX INFO: renamed from: F */
        public int f1828F = -1;

        /* JADX INFO: renamed from: M */
        public boolean f1835M = true;

        /* JADX INFO: renamed from: o */
        public boolean f1850o = true;

        /* JADX INFO: renamed from: android.support.v7.app.AlertController$a$a */
        public interface a {
            /* JADX INFO: renamed from: a */
            void m2542a(ListView listView);
        }

        public C0339a(Context context) {
            this.f1836a = context;
            this.f1837b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* JADX INFO: renamed from: b */
        private void m2540b(final AlertController alertController) {
            ListAdapter simpleCursorAdapter;
            int i = R.id.text1;
            boolean z = false;
            final RecycleListView recycleListView = (RecycleListView) this.f1837b.inflate(alertController.f1793l, (ViewGroup) null);
            if (this.f1826D) {
                simpleCursorAdapter = this.f1830H == null ? new ArrayAdapter<CharSequence>(this.f1836a, alertController.f1794m, i, this.f1854s) { // from class: android.support.v7.app.AlertController.a.1
                    @Override // android.widget.ArrayAdapter, android.widget.Adapter
                    public View getView(int i2, View view, ViewGroup viewGroup) {
                        View view2 = super.getView(i2, view, viewGroup);
                        if (C0339a.this.f1825C != null && C0339a.this.f1825C[i2]) {
                            recycleListView.setItemChecked(i2, true);
                        }
                        return view2;
                    }
                } : new CursorAdapter(this.f1836a, this.f1830H, z) { // from class: android.support.v7.app.AlertController.a.2

                    /* JADX INFO: renamed from: d */
                    private final int f1867d;

                    /* JADX INFO: renamed from: e */
                    private final int f1868e;

                    {
                        Cursor cursor = getCursor();
                        this.f1867d = cursor.getColumnIndexOrThrow(C0339a.this.f1831I);
                        this.f1868e = cursor.getColumnIndexOrThrow(C0339a.this.f1832J);
                    }

                    @Override // android.widget.CursorAdapter
                    public void bindView(View view, Context context, Cursor cursor) {
                        ((CheckedTextView) view.findViewById(R.id.text1)).setText(cursor.getString(this.f1867d));
                        recycleListView.setItemChecked(cursor.getPosition(), cursor.getInt(this.f1868e) == 1);
                    }

                    @Override // android.widget.CursorAdapter
                    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                        return C0339a.this.f1837b.inflate(alertController.f1794m, viewGroup, false);
                    }
                };
            } else {
                int i2 = this.f1827E ? alertController.f1795n : alertController.f1796o;
                simpleCursorAdapter = this.f1830H != null ? new SimpleCursorAdapter(this.f1836a, i2, this.f1830H, new String[]{this.f1831I}, new int[]{R.id.text1}) : this.f1855t != null ? this.f1855t : new C0341c(this.f1836a, i2, R.id.text1, this.f1854s);
            }
            if (this.f1834L != null) {
                this.f1834L.m2542a(recycleListView);
            }
            alertController.f1791j = simpleCursorAdapter;
            alertController.f1792k = this.f1828F;
            if (this.f1856u != null) {
                recycleListView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: android.support.v7.app.AlertController.a.3
                    @Override // android.widget.AdapterView.OnItemClickListener
                    public void onItemClick(AdapterView<?> adapterView, View view, int i3, long j) {
                        C0339a.this.f1856u.onClick(alertController.f1782a, i3);
                        if (C0339a.this.f1827E) {
                            return;
                        }
                        alertController.f1782a.dismiss();
                    }
                });
            } else if (this.f1829G != null) {
                recycleListView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: android.support.v7.app.AlertController.a.4
                    @Override // android.widget.AdapterView.OnItemClickListener
                    public void onItemClick(AdapterView<?> adapterView, View view, int i3, long j) {
                        if (C0339a.this.f1825C != null) {
                            C0339a.this.f1825C[i3] = recycleListView.isItemChecked(i3);
                        }
                        C0339a.this.f1829G.onClick(alertController.f1782a, i3, recycleListView.isItemChecked(i3));
                    }
                });
            }
            if (this.f1833K != null) {
                recycleListView.setOnItemSelectedListener(this.f1833K);
            }
            if (this.f1827E) {
                recycleListView.setChoiceMode(1);
            } else if (this.f1826D) {
                recycleListView.setChoiceMode(2);
            }
            alertController.f1783b = recycleListView;
        }

        /* JADX INFO: renamed from: a */
        public void m2541a(AlertController alertController) {
            if (this.f1842g != null) {
                alertController.m2534b(this.f1842g);
            } else {
                if (this.f1841f != null) {
                    alertController.m2531a(this.f1841f);
                }
                if (this.f1839d != null) {
                    alertController.m2529a(this.f1839d);
                }
                if (this.f1838c != 0) {
                    alertController.m2533b(this.f1838c);
                }
                if (this.f1840e != 0) {
                    alertController.m2533b(alertController.m2537c(this.f1840e));
                }
            }
            if (this.f1843h != null) {
                alertController.m2535b(this.f1843h);
            }
            if (this.f1844i != null) {
                alertController.m2528a(-1, this.f1844i, this.f1845j, (Message) null);
            }
            if (this.f1846k != null) {
                alertController.m2528a(-2, this.f1846k, this.f1847l, (Message) null);
            }
            if (this.f1848m != null) {
                alertController.m2528a(-3, this.f1848m, this.f1849n, (Message) null);
            }
            if (this.f1854s != null || this.f1830H != null || this.f1855t != null) {
                m2540b(alertController);
            }
            if (this.f1858w == null) {
                if (this.f1857v != 0) {
                    alertController.m2527a(this.f1857v);
                }
            } else if (this.f1824B) {
                alertController.m2530a(this.f1858w, this.f1859x, this.f1860y, this.f1861z, this.f1823A);
            } else {
                alertController.m2538c(this.f1858w);
            }
        }
    }

    /* JADX INFO: renamed from: android.support.v7.app.AlertController$b */
    private static final class HandlerC0340b extends Handler {

        /* JADX INFO: renamed from: a */
        private WeakReference<DialogInterface> f1874a;

        public HandlerC0340b(DialogInterface dialogInterface) {
            this.f1874a = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case -3:
                case -2:
                case -1:
                    ((DialogInterface.OnClickListener) message.obj).onClick(this.f1874a.get(), message.what);
                    break;
                case 1:
                    ((DialogInterface) message.obj).dismiss();
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: android.support.v7.app.AlertController$c */
    private static class C0341c extends ArrayAdapter<CharSequence> {
        public C0341c(Context context, int i, int i2, CharSequence[] charSequenceArr) {
            super(context, i, i2, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, DialogC0357n dialogC0357n, Window window) {
        this.f1798q = context;
        this.f1782a = dialogC0357n;
        this.f1799r = window;
        this.f1797p = new HandlerC0340b(dialogC0357n);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, C0333a.j.AlertDialog, C0333a.a.alertDialogStyle, 0);
        this.f1777K = typedArrayObtainStyledAttributes.getResourceId(C0333a.j.AlertDialog_android_layout, 0);
        this.f1778L = typedArrayObtainStyledAttributes.getResourceId(C0333a.j.AlertDialog_buttonPanelSideLayout, 0);
        this.f1793l = typedArrayObtainStyledAttributes.getResourceId(C0333a.j.AlertDialog_listLayout, 0);
        this.f1794m = typedArrayObtainStyledAttributes.getResourceId(C0333a.j.AlertDialog_multiChoiceItemLayout, 0);
        this.f1795n = typedArrayObtainStyledAttributes.getResourceId(C0333a.j.AlertDialog_singleChoiceItemLayout, 0);
        this.f1796o = typedArrayObtainStyledAttributes.getResourceId(C0333a.j.AlertDialog_listItemLayout, 0);
        this.f1779M = typedArrayObtainStyledAttributes.getBoolean(C0333a.j.AlertDialog_showTitle, true);
        typedArrayObtainStyledAttributes.recycle();
        dialogC0357n.m2719a(1);
    }

    /* JADX INFO: renamed from: a */
    private ViewGroup m2514a(View view, View view2) {
        if (view == null) {
            return (ViewGroup) (view2 instanceof ViewStub ? ((ViewStub) view2).inflate() : view2);
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        return (ViewGroup) (view instanceof ViewStub ? ((ViewStub) view).inflate() : view);
    }

    /* JADX INFO: renamed from: a */
    static void m2515a(View view, View view2, View view3) {
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            view3.setVisibility(view.canScrollVertically(1) ? 0 : 4);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m2516a(ViewGroup viewGroup) {
        View viewInflate = this.f1802u != null ? this.f1802u : this.f1803v != 0 ? LayoutInflater.from(this.f1798q).inflate(this.f1803v, viewGroup, false) : null;
        boolean z = viewInflate != null;
        if (!z || !m2520a(viewInflate)) {
            this.f1799r.setFlags(131072, 131072);
        }
        if (!z) {
            viewGroup.setVisibility(8);
            return;
        }
        FrameLayout frameLayout = (FrameLayout) this.f1799r.findViewById(C0333a.f.custom);
        frameLayout.addView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
        if (this.f1767A) {
            frameLayout.setPadding(this.f1804w, this.f1805x, this.f1806y, this.f1807z);
        }
        if (this.f1783b != null) {
            ((C0477ao.a) viewGroup.getLayoutParams()).f3133g = 0.0f;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m2517a(ViewGroup viewGroup, View view, int i, int i2) {
        final View view2 = null;
        final View viewFindViewById = this.f1799r.findViewById(C0333a.f.scrollIndicatorUp);
        View viewFindViewById2 = this.f1799r.findViewById(C0333a.f.scrollIndicatorDown);
        if (Build.VERSION.SDK_INT >= 23) {
            C0246q.m1739a(view, i, i2);
            if (viewFindViewById != null) {
                viewGroup.removeView(viewFindViewById);
            }
            if (viewFindViewById2 != null) {
                viewGroup.removeView(viewFindViewById2);
                return;
            }
            return;
        }
        if (viewFindViewById != null && (i & 1) == 0) {
            viewGroup.removeView(viewFindViewById);
            viewFindViewById = null;
        }
        if (viewFindViewById2 == null || (i & 2) != 0) {
            view2 = viewFindViewById2;
        } else {
            viewGroup.removeView(viewFindViewById2);
        }
        if (viewFindViewById == null && view2 == null) {
            return;
        }
        if (this.f1801t != null) {
            this.f1790i.setOnScrollChangeListener(new NestedScrollView.InterfaceC0315b() { // from class: android.support.v7.app.AlertController.2
                @Override // android.support.v4.widget.NestedScrollView.InterfaceC0315b
                /* JADX INFO: renamed from: a */
                public void mo2333a(NestedScrollView nestedScrollView, int i3, int i4, int i5, int i6) {
                    AlertController.m2515a(nestedScrollView, viewFindViewById, view2);
                }
            });
            this.f1790i.post(new Runnable() { // from class: android.support.v7.app.AlertController.3
                @Override // java.lang.Runnable
                public void run() {
                    AlertController.m2515a(AlertController.this.f1790i, viewFindViewById, view2);
                }
            });
        } else {
            if (this.f1783b != null) {
                this.f1783b.setOnScrollListener(new AbsListView.OnScrollListener() { // from class: android.support.v7.app.AlertController.4
                    @Override // android.widget.AbsListView.OnScrollListener
                    public void onScroll(AbsListView absListView, int i3, int i4, int i5) {
                        AlertController.m2515a(absListView, viewFindViewById, view2);
                    }

                    @Override // android.widget.AbsListView.OnScrollListener
                    public void onScrollStateChanged(AbsListView absListView, int i3) {
                    }
                });
                this.f1783b.post(new Runnable() { // from class: android.support.v7.app.AlertController.5
                    @Override // java.lang.Runnable
                    public void run() {
                        AlertController.m2515a(AlertController.this.f1783b, viewFindViewById, view2);
                    }
                });
                return;
            }
            if (viewFindViewById != null) {
                viewGroup.removeView(viewFindViewById);
            }
            if (view2 != null) {
                viewGroup.removeView(view2);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m2518a(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: a */
    private static boolean m2519a(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0333a.a.alertDialogCenterButtons, typedValue, true);
        return typedValue.data != 0;
    }

    /* JADX INFO: renamed from: a */
    static boolean m2520a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (m2520a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    private int m2521b() {
        if (this.f1778L != 0 && this.f1780N == 1) {
            return this.f1778L;
        }
        return this.f1777K;
    }

    /* JADX INFO: renamed from: b */
    private void m2522b(ViewGroup viewGroup) {
        if (this.f1776J != null) {
            viewGroup.addView(this.f1776J, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f1799r.findViewById(C0333a.f.title_template).setVisibility(8);
            return;
        }
        this.f1773G = (ImageView) this.f1799r.findViewById(R.id.icon);
        if (!(!TextUtils.isEmpty(this.f1800s)) || !this.f1779M) {
            this.f1799r.findViewById(C0333a.f.title_template).setVisibility(8);
            this.f1773G.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        this.f1774H = (TextView) this.f1799r.findViewById(C0333a.f.alertTitle);
        this.f1774H.setText(this.f1800s);
        if (this.f1771E != 0) {
            this.f1773G.setImageResource(this.f1771E);
        } else if (this.f1772F != null) {
            this.f1773G.setImageDrawable(this.f1772F);
        } else {
            this.f1774H.setPadding(this.f1773G.getPaddingLeft(), this.f1773G.getPaddingTop(), this.f1773G.getPaddingRight(), this.f1773G.getPaddingBottom());
            this.f1773G.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: c */
    private void m2523c() {
        View viewFindViewById;
        View viewFindViewById2;
        View viewFindViewById3 = this.f1799r.findViewById(C0333a.f.parentPanel);
        View viewFindViewById4 = viewFindViewById3.findViewById(C0333a.f.topPanel);
        View viewFindViewById5 = viewFindViewById3.findViewById(C0333a.f.contentPanel);
        View viewFindViewById6 = viewFindViewById3.findViewById(C0333a.f.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById3.findViewById(C0333a.f.customPanel);
        m2516a(viewGroup);
        View viewFindViewById7 = viewGroup.findViewById(C0333a.f.topPanel);
        View viewFindViewById8 = viewGroup.findViewById(C0333a.f.contentPanel);
        View viewFindViewById9 = viewGroup.findViewById(C0333a.f.buttonPanel);
        ViewGroup viewGroupM2514a = m2514a(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupM2514a2 = m2514a(viewFindViewById8, viewFindViewById5);
        ViewGroup viewGroupM2514a3 = m2514a(viewFindViewById9, viewFindViewById6);
        m2524c(viewGroupM2514a2);
        m2525d(viewGroupM2514a3);
        m2522b(viewGroupM2514a);
        boolean z = (viewGroup == null || viewGroup.getVisibility() == 8) ? false : true;
        boolean z2 = (viewGroupM2514a == null || viewGroupM2514a.getVisibility() == 8) ? false : true;
        boolean z3 = (viewGroupM2514a3 == null || viewGroupM2514a3.getVisibility() == 8) ? false : true;
        if (!z3 && viewGroupM2514a2 != null && (viewFindViewById2 = viewGroupM2514a2.findViewById(C0333a.f.textSpacerNoButtons)) != null) {
            viewFindViewById2.setVisibility(0);
        }
        if (z2) {
            if (this.f1790i != null) {
                this.f1790i.setClipToPadding(true);
            }
            View viewFindViewById10 = (this.f1801t == null && this.f1783b == null) ? null : viewGroupM2514a.findViewById(C0333a.f.titleDividerNoCustom);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        } else if (viewGroupM2514a2 != null && (viewFindViewById = viewGroupM2514a2.findViewById(C0333a.f.textSpacerNoTitle)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (this.f1783b instanceof RecycleListView) {
            ((RecycleListView) this.f1783b).m2539a(z2, z3);
        }
        if (!z) {
            View view = this.f1783b != null ? this.f1783b : this.f1790i;
            if (view != null) {
                m2517a(viewGroupM2514a2, view, (z3 ? 2 : 0) | (z2 ? 1 : 0), 3);
            }
        }
        ListView listView = this.f1783b;
        if (listView == null || this.f1791j == null) {
            return;
        }
        listView.setAdapter(this.f1791j);
        int i = this.f1792k;
        if (i > -1) {
            listView.setItemChecked(i, true);
            listView.setSelection(i);
        }
    }

    /* JADX INFO: renamed from: c */
    private void m2524c(ViewGroup viewGroup) {
        this.f1790i = (NestedScrollView) this.f1799r.findViewById(C0333a.f.scrollView);
        this.f1790i.setFocusable(false);
        this.f1790i.setNestedScrollingEnabled(false);
        this.f1775I = (TextView) viewGroup.findViewById(R.id.message);
        if (this.f1775I == null) {
            return;
        }
        if (this.f1801t != null) {
            this.f1775I.setText(this.f1801t);
            return;
        }
        this.f1775I.setVisibility(8);
        this.f1790i.removeView(this.f1775I);
        if (this.f1783b == null) {
            viewGroup.setVisibility(8);
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.f1790i.getParent();
        int iIndexOfChild = viewGroup2.indexOfChild(this.f1790i);
        viewGroup2.removeViewAt(iIndexOfChild);
        viewGroup2.addView(this.f1783b, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
    }

    /* JADX INFO: renamed from: d */
    private void m2525d(ViewGroup viewGroup) {
        int i;
        this.f1784c = (Button) viewGroup.findViewById(R.id.button1);
        this.f1784c.setOnClickListener(this.f1781O);
        if (TextUtils.isEmpty(this.f1768B)) {
            this.f1784c.setVisibility(8);
            i = 0;
        } else {
            this.f1784c.setText(this.f1768B);
            this.f1784c.setVisibility(0);
            i = 1;
        }
        this.f1786e = (Button) viewGroup.findViewById(R.id.button2);
        this.f1786e.setOnClickListener(this.f1781O);
        if (TextUtils.isEmpty(this.f1769C)) {
            this.f1786e.setVisibility(8);
        } else {
            this.f1786e.setText(this.f1769C);
            this.f1786e.setVisibility(0);
            i |= 2;
        }
        this.f1788g = (Button) viewGroup.findViewById(R.id.button3);
        this.f1788g.setOnClickListener(this.f1781O);
        if (TextUtils.isEmpty(this.f1770D)) {
            this.f1788g.setVisibility(8);
        } else {
            this.f1788g.setText(this.f1770D);
            this.f1788g.setVisibility(0);
            i |= 4;
        }
        if (m2519a(this.f1798q)) {
            if (i == 1) {
                m2518a(this.f1784c);
            } else if (i == 2) {
                m2518a(this.f1786e);
            } else if (i == 4) {
                m2518a(this.f1788g);
            }
        }
        if (i != 0) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    /* JADX INFO: renamed from: a */
    public void m2526a() {
        this.f1782a.setContentView(m2521b());
        m2523c();
    }

    /* JADX INFO: renamed from: a */
    public void m2527a(int i) {
        this.f1802u = null;
        this.f1803v = i;
        this.f1767A = false;
    }

    /* JADX INFO: renamed from: a */
    public void m2528a(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message) {
        if (message == null && onClickListener != null) {
            message = this.f1797p.obtainMessage(i, onClickListener);
        }
        switch (i) {
            case -3:
                this.f1770D = charSequence;
                this.f1789h = message;
                return;
            case -2:
                this.f1769C = charSequence;
                this.f1787f = message;
                return;
            case -1:
                this.f1768B = charSequence;
                this.f1785d = message;
                return;
            default:
                throw new IllegalArgumentException("Button does not exist");
        }
    }

    /* JADX INFO: renamed from: a */
    public void m2529a(Drawable drawable) {
        this.f1772F = drawable;
        this.f1771E = 0;
        if (this.f1773G != null) {
            if (drawable == null) {
                this.f1773G.setVisibility(8);
            } else {
                this.f1773G.setVisibility(0);
                this.f1773G.setImageDrawable(drawable);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m2530a(View view, int i, int i2, int i3, int i4) {
        this.f1802u = view;
        this.f1803v = 0;
        this.f1767A = true;
        this.f1804w = i;
        this.f1805x = i2;
        this.f1806y = i3;
        this.f1807z = i4;
    }

    /* JADX INFO: renamed from: a */
    public void m2531a(CharSequence charSequence) {
        this.f1800s = charSequence;
        if (this.f1774H != null) {
            this.f1774H.setText(charSequence);
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m2532a(int i, KeyEvent keyEvent) {
        return this.f1790i != null && this.f1790i.m2325a(keyEvent);
    }

    /* JADX INFO: renamed from: b */
    public void m2533b(int i) {
        this.f1772F = null;
        this.f1771E = i;
        if (this.f1773G != null) {
            if (i == 0) {
                this.f1773G.setVisibility(8);
            } else {
                this.f1773G.setVisibility(0);
                this.f1773G.setImageResource(this.f1771E);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m2534b(View view) {
        this.f1776J = view;
    }

    /* JADX INFO: renamed from: b */
    public void m2535b(CharSequence charSequence) {
        this.f1801t = charSequence;
        if (this.f1775I != null) {
            this.f1775I.setText(charSequence);
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m2536b(int i, KeyEvent keyEvent) {
        return this.f1790i != null && this.f1790i.m2325a(keyEvent);
    }

    /* JADX INFO: renamed from: c */
    public int m2537c(int i) {
        TypedValue typedValue = new TypedValue();
        this.f1798q.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId;
    }

    /* JADX INFO: renamed from: c */
    public void m2538c(View view) {
        this.f1802u = view;
        this.f1803v = 0;
        this.f1767A = false;
    }
}
