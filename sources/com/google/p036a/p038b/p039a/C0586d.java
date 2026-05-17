package com.google.p036a.p038b.p039a;

import com.google.p036a.AbstractC0629t;
import com.google.p036a.C0614e;
import com.google.p036a.InterfaceC0618i;
import com.google.p036a.InterfaceC0626q;
import com.google.p036a.InterfaceC0630u;
import com.google.p036a.p037a.InterfaceC0576b;
import com.google.p036a.p038b.C0598c;
import com.google.p036a.p041c.C0608a;

/* JADX INFO: renamed from: com.google.a.b.a.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0586d implements InterfaceC0630u {

    /* JADX INFO: renamed from: a */
    private final C0598c f4009a;

    public C0586d(C0598c c0598c) {
        this.f4009a = c0598c;
    }

    /* JADX INFO: renamed from: a */
    AbstractC0629t<?> m5050a(C0598c c0598c, C0614e c0614e, C0608a<?> c0608a, InterfaceC0576b interfaceC0576b) {
        AbstractC0629t<?> c0594l;
        Object objMo5161a = c0598c.m5160a(C0608a.m5203b(interfaceC0576b.m5031a())).mo5161a();
        if (objMo5161a instanceof AbstractC0629t) {
            c0594l = (AbstractC0629t) objMo5161a;
        } else if (objMo5161a instanceof InterfaceC0630u) {
            c0594l = ((InterfaceC0630u) objMo5161a).mo5041a(c0614e, c0608a);
        } else {
            if (!(objMo5161a instanceof InterfaceC0626q) && !(objMo5161a instanceof InterfaceC0618i)) {
                throw new IllegalArgumentException("@JsonAdapter value must be TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer reference.");
            }
            c0594l = new C0594l<>(objMo5161a instanceof InterfaceC0626q ? (InterfaceC0626q) objMo5161a : null, objMo5161a instanceof InterfaceC0618i ? (InterfaceC0618i) objMo5161a : null, c0614e, c0608a, null);
        }
        return (c0594l == null || !interfaceC0576b.m5032b()) ? c0594l : c0594l.m5299a();
    }

    @Override // com.google.p036a.InterfaceC0630u
    /* JADX INFO: renamed from: a */
    public <T> AbstractC0629t<T> mo5041a(C0614e c0614e, C0608a<T> c0608a) {
        InterfaceC0576b interfaceC0576b = (InterfaceC0576b) c0608a.m5204a().getAnnotation(InterfaceC0576b.class);
        if (interfaceC0576b == null) {
            return null;
        }
        return (AbstractC0629t<T>) m5050a(this.f4009a, c0614e, c0608a, interfaceC0576b);
    }
}
