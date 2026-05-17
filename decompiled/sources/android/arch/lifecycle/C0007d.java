package android.arch.lifecycle;

import android.arch.lifecycle.AbstractC0005b;
import android.arch.p000a.p001a.C0000a;
import android.arch.p000a.p001a.C0001b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: android.arch.lifecycle.d */
/* JADX INFO: loaded from: classes.dex */
public class C0007d extends AbstractC0005b {

    /* JADX INFO: renamed from: c */
    private final InterfaceC0006c f29c;

    /* JADX INFO: renamed from: a */
    private C0000a<Object, a> f27a = new C0000a<>();

    /* JADX INFO: renamed from: d */
    private int f30d = 0;

    /* JADX INFO: renamed from: e */
    private boolean f31e = false;

    /* JADX INFO: renamed from: f */
    private boolean f32f = false;

    /* JADX INFO: renamed from: g */
    private ArrayList<AbstractC0005b.b> f33g = new ArrayList<>();

    /* JADX INFO: renamed from: b */
    private AbstractC0005b.b f28b = AbstractC0005b.b.INITIALIZED;

    /* JADX INFO: renamed from: android.arch.lifecycle.d$a */
    static class a {

        /* JADX INFO: renamed from: a */
        AbstractC0005b.b f36a;

        /* JADX INFO: renamed from: b */
        InterfaceC0004a f37b;

        /* JADX INFO: renamed from: a */
        void m31a(InterfaceC0006c interfaceC0006c, AbstractC0005b.a aVar) {
            AbstractC0005b.b bVarM21b = C0007d.m21b(aVar);
            this.f36a = C0007d.m19a(this.f36a, bVarM21b);
            this.f37b.mo17a(interfaceC0006c, aVar);
            this.f36a = bVarM21b;
        }
    }

    public C0007d(InterfaceC0006c interfaceC0006c) {
        this.f29c = interfaceC0006c;
    }

    /* JADX INFO: renamed from: a */
    static AbstractC0005b.b m19a(AbstractC0005b.b bVar, AbstractC0005b.b bVar2) {
        return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
    }

    /* JADX INFO: renamed from: a */
    private boolean m20a() {
        if (this.f27a.m2a() == 0) {
            return true;
        }
        AbstractC0005b.b bVar = this.f27a.m5d().getValue().f36a;
        AbstractC0005b.b bVar2 = this.f27a.m6e().getValue().f36a;
        return bVar == bVar2 && this.f28b == bVar2;
    }

    /* JADX INFO: renamed from: b */
    static AbstractC0005b.b m21b(AbstractC0005b.a aVar) {
        switch (aVar) {
            case ON_CREATE:
            case ON_STOP:
                return AbstractC0005b.b.CREATED;
            case ON_START:
            case ON_PAUSE:
                return AbstractC0005b.b.STARTED;
            case ON_RESUME:
                return AbstractC0005b.b.RESUMED;
            case ON_DESTROY:
                return AbstractC0005b.b.DESTROYED;
            default:
                throw new IllegalArgumentException("Unexpected event value " + aVar);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m22b() {
        this.f33g.remove(this.f33g.size() - 1);
    }

    /* JADX INFO: renamed from: b */
    private void m23b(AbstractC0005b.b bVar) {
        this.f33g.add(bVar);
    }

    /* JADX INFO: renamed from: c */
    private static AbstractC0005b.a m24c(AbstractC0005b.b bVar) {
        switch (bVar) {
            case INITIALIZED:
                throw new IllegalArgumentException();
            case CREATED:
                return AbstractC0005b.a.ON_DESTROY;
            case STARTED:
                return AbstractC0005b.a.ON_STOP;
            case RESUMED:
                return AbstractC0005b.a.ON_PAUSE;
            case DESTROYED:
                throw new IllegalArgumentException();
            default:
                throw new IllegalArgumentException("Unexpected state value " + bVar);
        }
    }

    /* JADX INFO: renamed from: c */
    private void m25c() {
        C0001b<Object, a>.d dVarC = this.f27a.m4c();
        while (dVarC.hasNext() && !this.f32f) {
            Map.Entry next = dVarC.next();
            a aVar = (a) next.getValue();
            while (aVar.f36a.compareTo(this.f28b) < 0 && !this.f32f && this.f27a.m0a(next.getKey())) {
                m23b(aVar.f36a);
                aVar.m31a(this.f29c, m26d(aVar.f36a));
                m22b();
            }
        }
    }

    /* JADX INFO: renamed from: d */
    private static AbstractC0005b.a m26d(AbstractC0005b.b bVar) {
        switch (bVar) {
            case INITIALIZED:
            case DESTROYED:
                return AbstractC0005b.a.ON_CREATE;
            case CREATED:
                return AbstractC0005b.a.ON_START;
            case STARTED:
                return AbstractC0005b.a.ON_RESUME;
            case RESUMED:
                throw new IllegalArgumentException();
            default:
                throw new IllegalArgumentException("Unexpected state value " + bVar);
        }
    }

    /* JADX INFO: renamed from: d */
    private void m27d() {
        Iterator<Map.Entry<Object, a>> itB = this.f27a.m3b();
        while (itB.hasNext() && !this.f32f) {
            Map.Entry<Object, a> next = itB.next();
            a value = next.getValue();
            while (value.f36a.compareTo(this.f28b) > 0 && !this.f32f && this.f27a.m0a(next.getKey())) {
                AbstractC0005b.a aVarM24c = m24c(value.f36a);
                m23b(m21b(aVarM24c));
                value.m31a(this.f29c, aVarM24c);
                m22b();
            }
        }
    }

    /* JADX INFO: renamed from: e */
    private void m28e() {
        while (!m20a()) {
            this.f32f = false;
            if (this.f28b.compareTo(this.f27a.m5d().getValue().f36a) < 0) {
                m27d();
            }
            Map.Entry<Object, a> entryE = this.f27a.m6e();
            if (!this.f32f && entryE != null && this.f28b.compareTo(entryE.getValue().f36a) > 0) {
                m25c();
            }
        }
        this.f32f = false;
    }

    /* JADX INFO: renamed from: a */
    public void m29a(AbstractC0005b.a aVar) {
        this.f28b = m21b(aVar);
        if (this.f31e || this.f30d != 0) {
            this.f32f = true;
            return;
        }
        this.f31e = true;
        m28e();
        this.f31e = false;
    }

    /* JADX INFO: renamed from: a */
    public void m30a(AbstractC0005b.b bVar) {
        this.f28b = bVar;
    }
}
