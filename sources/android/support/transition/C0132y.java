package android.support.transition;

import android.support.transition.AbstractC0128u;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: android.support.transition.y */
/* JADX INFO: loaded from: classes.dex */
public class C0132y extends AbstractC0128u {

    /* JADX INFO: renamed from: i */
    private int f660i;

    /* JADX INFO: renamed from: g */
    private ArrayList<AbstractC0128u> f658g = new ArrayList<>();

    /* JADX INFO: renamed from: h */
    private boolean f659h = true;

    /* JADX INFO: renamed from: j */
    private boolean f661j = false;

    /* JADX INFO: renamed from: android.support.transition.y$a */
    static class a extends C0129v {

        /* JADX INFO: renamed from: a */
        C0132y f664a;

        a(C0132y c0132y) {
            this.f664a = c0132y;
        }

        @Override // android.support.transition.C0129v, android.support.transition.AbstractC0128u.c
        /* JADX INFO: renamed from: a */
        public void mo583a(AbstractC0128u abstractC0128u) {
            C0132y.m741b(this.f664a);
            if (this.f664a.f660i == 0) {
                this.f664a.f661j = false;
                this.f664a.m726k();
            }
            abstractC0128u.mo712b(this);
        }

        @Override // android.support.transition.C0129v, android.support.transition.AbstractC0128u.c
        /* JADX INFO: renamed from: d */
        public void mo586d(AbstractC0128u abstractC0128u) {
            if (this.f664a.f661j) {
                return;
            }
            this.f664a.m725j();
            this.f664a.f661j = true;
        }
    }

    /* JADX INFO: renamed from: b */
    static /* synthetic */ int m741b(C0132y c0132y) {
        int i = c0132y.f660i - 1;
        c0132y.f660i = i;
        return i;
    }

    /* JADX INFO: renamed from: p */
    private void m743p() {
        a aVar = new a(this);
        Iterator<AbstractC0128u> it = this.f658g.iterator();
        while (it.hasNext()) {
            it.next().mo700a(aVar);
        }
        this.f660i = this.f658g.size();
    }

    /* JADX INFO: renamed from: a */
    public C0132y m744a(int i) {
        switch (i) {
            case 0:
                this.f659h = true;
                return this;
            case 1:
                this.f659h = false;
                return this;
            default:
                throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i);
        }
    }

    @Override // android.support.transition.AbstractC0128u
    /* JADX INFO: renamed from: a */
    String mo701a(String str) {
        String strMo701a = super.mo701a(str);
        int i = 0;
        while (i < this.f658g.size()) {
            String str2 = strMo701a + "\n" + this.f658g.get(i).mo701a(str + "  ");
            i++;
            strMo701a = str2;
        }
        return strMo701a;
    }

    @Override // android.support.transition.AbstractC0128u
    /* JADX INFO: renamed from: a */
    public void mo644a(C0086aa c0086aa) {
        if (m708a(c0086aa.f498b)) {
            for (AbstractC0128u abstractC0128u : this.f658g) {
                if (abstractC0128u.m708a(c0086aa.f498b)) {
                    abstractC0128u.mo644a(c0086aa);
                    c0086aa.f499c.add(abstractC0128u);
                }
            }
        }
    }

    @Override // android.support.transition.AbstractC0128u
    /* JADX INFO: renamed from: a */
    public void mo703a(AbstractC0128u.b bVar) {
        super.mo703a(bVar);
        int size = this.f658g.size();
        for (int i = 0; i < size; i++) {
            this.f658g.get(i).mo703a(bVar);
        }
    }

    @Override // android.support.transition.AbstractC0128u
    /* JADX INFO: renamed from: a */
    protected void mo705a(ViewGroup viewGroup, C0087ab c0087ab, C0087ab c0087ab2, ArrayList<C0086aa> arrayList, ArrayList<C0086aa> arrayList2) {
        long jC = m714c();
        int size = this.f658g.size();
        for (int i = 0; i < size; i++) {
            AbstractC0128u abstractC0128u = this.f658g.get(i);
            if (jC > 0 && (this.f659h || i == 0)) {
                long jM714c = abstractC0128u.m714c();
                if (jM714c > 0) {
                    abstractC0128u.mo711b(jM714c + jC);
                } else {
                    abstractC0128u.mo711b(jC);
                }
            }
            abstractC0128u.mo705a(viewGroup, c0087ab, c0087ab2, arrayList, arrayList2);
        }
    }

    /* JADX INFO: renamed from: b */
    public AbstractC0128u m745b(int i) {
        if (i < 0 || i >= this.f658g.size()) {
            return null;
        }
        return this.f658g.get(i);
    }

    /* JADX INFO: renamed from: b */
    public C0132y m746b(AbstractC0128u abstractC0128u) {
        this.f658g.add(abstractC0128u);
        abstractC0128u.f623d = this;
        if (this.f620a >= 0) {
            abstractC0128u.mo699a(this.f620a);
        }
        return this;
    }

    @Override // android.support.transition.AbstractC0128u
    /* JADX INFO: renamed from: b */
    public void mo649b(C0086aa c0086aa) {
        if (m708a(c0086aa.f498b)) {
            for (AbstractC0128u abstractC0128u : this.f658g) {
                if (abstractC0128u.m708a(c0086aa.f498b)) {
                    abstractC0128u.mo649b(c0086aa);
                    c0086aa.f499c.add(abstractC0128u);
                }
            }
        }
    }

    @Override // android.support.transition.AbstractC0128u
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public C0132y mo699a(long j) {
        super.mo699a(j);
        if (this.f620a >= 0) {
            int size = this.f658g.size();
            for (int i = 0; i < size; i++) {
                this.f658g.get(i).mo699a(j);
            }
        }
        return this;
    }

    @Override // android.support.transition.AbstractC0128u
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public C0132y mo700a(AbstractC0128u.c cVar) {
        return (C0132y) super.mo700a(cVar);
    }

    @Override // android.support.transition.AbstractC0128u
    /* JADX INFO: renamed from: c */
    void mo716c(C0086aa c0086aa) {
        super.mo716c(c0086aa);
        int size = this.f658g.size();
        for (int i = 0; i < size; i++) {
            this.f658g.get(i).mo716c(c0086aa);
        }
    }

    @Override // android.support.transition.AbstractC0128u
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public C0132y mo711b(long j) {
        return (C0132y) super.mo711b(j);
    }

    @Override // android.support.transition.AbstractC0128u
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public C0132y mo712b(AbstractC0128u.c cVar) {
        return (C0132y) super.mo712b(cVar);
    }

    @Override // android.support.transition.AbstractC0128u
    /* JADX INFO: renamed from: d */
    public void mo718d(View view) {
        super.mo718d(view);
        int size = this.f658g.size();
        for (int i = 0; i < size; i++) {
            this.f658g.get(i).mo718d(view);
        }
    }

    @Override // android.support.transition.AbstractC0128u
    /* JADX INFO: renamed from: e */
    protected void mo719e() {
        if (this.f658g.isEmpty()) {
            m725j();
            m726k();
            return;
        }
        m743p();
        if (this.f659h) {
            Iterator<AbstractC0128u> it = this.f658g.iterator();
            while (it.hasNext()) {
                it.next().mo719e();
            }
            return;
        }
        int i = 1;
        while (true) {
            int i2 = i;
            if (i2 >= this.f658g.size()) {
                break;
            }
            AbstractC0128u abstractC0128u = this.f658g.get(i2 - 1);
            final AbstractC0128u abstractC0128u2 = this.f658g.get(i2);
            abstractC0128u.mo700a(new C0129v() { // from class: android.support.transition.y.1
                @Override // android.support.transition.C0129v, android.support.transition.AbstractC0128u.c
                /* JADX INFO: renamed from: a */
                public void mo583a(AbstractC0128u abstractC0128u3) {
                    abstractC0128u2.mo719e();
                    abstractC0128u3.mo712b(this);
                }
            });
            i = i2 + 1;
        }
        AbstractC0128u abstractC0128u3 = this.f658g.get(0);
        if (abstractC0128u3 != null) {
            abstractC0128u3.mo719e();
        }
    }

    @Override // android.support.transition.AbstractC0128u
    /* JADX INFO: renamed from: e */
    public void mo720e(View view) {
        super.mo720e(view);
        int size = this.f658g.size();
        for (int i = 0; i < size; i++) {
            this.f658g.get(i).mo720e(view);
        }
    }

    @Override // android.support.transition.AbstractC0128u
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public C0132y mo713b(View view) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.f658g.size()) {
                return (C0132y) super.mo713b(view);
            }
            this.f658g.get(i2).mo713b(view);
            i = i2 + 1;
        }
    }

    @Override // android.support.transition.AbstractC0128u
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public C0132y mo715c(View view) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.f658g.size()) {
                return (C0132y) super.mo715c(view);
            }
            this.f658g.get(i2).mo715c(view);
            i = i2 + 1;
        }
    }

    @Override // android.support.transition.AbstractC0128u
    /* JADX INFO: renamed from: m */
    public AbstractC0128u clone() {
        C0132y c0132y = (C0132y) super.clone();
        c0132y.f658g = new ArrayList<>();
        int size = this.f658g.size();
        for (int i = 0; i < size; i++) {
            c0132y.m746b(this.f658g.get(i).clone());
        }
        return c0132y;
    }

    /* JADX INFO: renamed from: o */
    public int m753o() {
        return this.f658g.size();
    }
}
