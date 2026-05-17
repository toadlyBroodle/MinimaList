package android.support.v7.view.menu;

import android.content.Context;
import android.support.v7.view.menu.InterfaceC0412o;
import android.support.v7.view.menu.InterfaceC0413p;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: renamed from: android.support.v7.view.menu.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0399b implements InterfaceC0412o {

    /* JADX INFO: renamed from: a */
    protected Context f2447a;

    /* JADX INFO: renamed from: b */
    protected Context f2448b;

    /* JADX INFO: renamed from: c */
    protected C0405h f2449c;

    /* JADX INFO: renamed from: d */
    protected LayoutInflater f2450d;

    /* JADX INFO: renamed from: e */
    protected LayoutInflater f2451e;

    /* JADX INFO: renamed from: f */
    protected InterfaceC0413p f2452f;

    /* JADX INFO: renamed from: g */
    private InterfaceC0412o.a f2453g;

    /* JADX INFO: renamed from: h */
    private int f2454h;

    /* JADX INFO: renamed from: i */
    private int f2455i;

    /* JADX INFO: renamed from: j */
    private int f2456j;

    public AbstractC0399b(Context context, int i, int i2) {
        this.f2447a = context;
        this.f2450d = LayoutInflater.from(context);
        this.f2454h = i;
        this.f2455i = i2;
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC0413p mo3180a(ViewGroup viewGroup) {
        if (this.f2452f == null) {
            this.f2452f = (InterfaceC0413p) this.f2450d.inflate(this.f2454h, viewGroup, false);
            this.f2452f.mo158a(this.f2449c);
            mo174a(true);
        }
        return this.f2452f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public View mo3181a(C0407j c0407j, View view, ViewGroup viewGroup) {
        InterfaceC0413p.a aVarM3187b = view instanceof InterfaceC0413p.a ? (InterfaceC0413p.a) view : m3187b(viewGroup);
        mo3183a(c0407j, aVarM3187b);
        return (View) aVarM3187b;
    }

    /* JADX INFO: renamed from: a */
    public void m3182a(int i) {
        this.f2456j = i;
    }

    @Override // android.support.v7.view.menu.InterfaceC0412o
    /* JADX INFO: renamed from: a */
    public void mo165a(Context context, C0405h c0405h) {
        this.f2448b = context;
        this.f2451e = LayoutInflater.from(this.f2448b);
        this.f2449c = c0405h;
    }

    @Override // android.support.v7.view.menu.InterfaceC0412o
    /* JADX INFO: renamed from: a */
    public void mo170a(C0405h c0405h, boolean z) {
        if (this.f2453g != null) {
            this.f2453g.mo2706a(c0405h, z);
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo3183a(C0407j c0407j, InterfaceC0413p.a aVar);

    @Override // android.support.v7.view.menu.InterfaceC0412o
    /* JADX INFO: renamed from: a */
    public void mo172a(InterfaceC0412o.a aVar) {
        this.f2453g = aVar;
    }

    /* JADX INFO: renamed from: a */
    protected void m3184a(View view, int i) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f2452f).addView(view, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.support.v7.view.menu.InterfaceC0412o
    /* JADX INFO: renamed from: a */
    public void mo174a(boolean z) {
        int i;
        int i2;
        ViewGroup viewGroup = (ViewGroup) this.f2452f;
        if (viewGroup == null) {
            return;
        }
        if (this.f2449c != null) {
            this.f2449c.m3279j();
            ArrayList<C0407j> arrayListM3278i = this.f2449c.m3278i();
            int size = arrayListM3278i.size();
            int i3 = 0;
            i = 0;
            while (i3 < size) {
                C0407j c0407j = arrayListM3278i.get(i3);
                if (mo3185a(i, c0407j)) {
                    View childAt = viewGroup.getChildAt(i);
                    C0407j itemData = childAt instanceof InterfaceC0413p.a ? ((InterfaceC0413p.a) childAt).getItemData() : null;
                    View viewMo3181a = mo3181a(c0407j, childAt, viewGroup);
                    if (c0407j != itemData) {
                        viewMo3181a.setPressed(false);
                        viewMo3181a.jumpDrawablesToCurrentState();
                    }
                    if (viewMo3181a != childAt) {
                        m3184a(viewMo3181a, i);
                    }
                    i2 = i + 1;
                } else {
                    i2 = i;
                }
                i3++;
                i = i2;
            }
        } else {
            i = 0;
        }
        while (i < viewGroup.getChildCount()) {
            if (!mo3186a(viewGroup, i)) {
                i++;
            }
        }
    }

    @Override // android.support.v7.view.menu.InterfaceC0412o
    /* JADX INFO: renamed from: a */
    public boolean mo175a() {
        return false;
    }

    /* JADX INFO: renamed from: a */
    public boolean mo3185a(int i, C0407j c0407j) {
        return true;
    }

    @Override // android.support.v7.view.menu.InterfaceC0412o
    /* JADX INFO: renamed from: a */
    public boolean mo176a(C0405h c0405h, C0407j c0407j) {
        return false;
    }

    @Override // android.support.v7.view.menu.InterfaceC0412o
    /* JADX INFO: renamed from: a */
    public boolean mo177a(SubMenuC0418u subMenuC0418u) {
        if (this.f2453g != null) {
            return this.f2453g.mo2707a(subMenuC0418u);
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    protected boolean mo3186a(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    @Override // android.support.v7.view.menu.InterfaceC0412o
    /* JADX INFO: renamed from: b */
    public int mo178b() {
        return this.f2456j;
    }

    /* JADX INFO: renamed from: b */
    public InterfaceC0413p.a m3187b(ViewGroup viewGroup) {
        return (InterfaceC0413p.a) this.f2450d.inflate(this.f2455i, viewGroup, false);
    }

    @Override // android.support.v7.view.menu.InterfaceC0412o
    /* JADX INFO: renamed from: b */
    public boolean mo182b(C0405h c0405h, C0407j c0407j) {
        return false;
    }

    /* JADX INFO: renamed from: d */
    public InterfaceC0412o.a m3188d() {
        return this.f2453g;
    }
}
