package android.support.v4.p006a;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.support.v4.p018i.C0219m;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: renamed from: android.support.v4.a.m */
/* JADX INFO: loaded from: classes.dex */
public class C0157m {

    /* JADX INFO: renamed from: a */
    private final AbstractC0158n<?> f886a;

    private C0157m(AbstractC0158n<?> abstractC0158n) {
        this.f886a = abstractC0158n;
    }

    /* JADX INFO: renamed from: a */
    public static final C0157m m1022a(AbstractC0158n<?> abstractC0158n) {
        return new C0157m(abstractC0158n);
    }

    /* JADX INFO: renamed from: a */
    public ComponentCallbacksC0154j m1023a(String str) {
        return this.f886a.f890d.m1150b(str);
    }

    /* JADX INFO: renamed from: a */
    public AbstractC0159o m1024a() {
        return this.f886a.m1065i();
    }

    /* JADX INFO: renamed from: a */
    public View m1025a(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f886a.f890d.onCreateView(view, str, context, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    public void m1026a(Configuration configuration) {
        this.f886a.f890d.m1132a(configuration);
    }

    /* JADX INFO: renamed from: a */
    public void m1027a(Parcelable parcelable, C0161q c0161q) {
        this.f886a.f890d.m1134a(parcelable, c0161q);
    }

    /* JADX INFO: renamed from: a */
    public void m1028a(ComponentCallbacksC0154j componentCallbacksC0154j) {
        this.f886a.f890d.m1141a(this.f886a, this.f886a, componentCallbacksC0154j);
    }

    /* JADX INFO: renamed from: a */
    public void m1029a(C0219m<String, AbstractC0168x> c0219m) {
        this.f886a.m1058a(c0219m);
    }

    /* JADX INFO: renamed from: a */
    public void m1030a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f886a.m1061b(str, fileDescriptor, printWriter, strArr);
    }

    /* JADX INFO: renamed from: a */
    public void m1031a(boolean z) {
        this.f886a.f890d.m1143a(z);
    }

    /* JADX INFO: renamed from: a */
    public boolean m1032a(Menu menu) {
        return this.f886a.f890d.m1145a(menu);
    }

    /* JADX INFO: renamed from: a */
    public boolean m1033a(Menu menu, MenuInflater menuInflater) {
        return this.f886a.f890d.m1146a(menu, menuInflater);
    }

    /* JADX INFO: renamed from: a */
    public boolean m1034a(MenuItem menuItem) {
        return this.f886a.f890d.m1147a(menuItem);
    }

    /* JADX INFO: renamed from: b */
    public AbstractC0168x m1035b() {
        return this.f886a.m1066j();
    }

    /* JADX INFO: renamed from: b */
    public void m1036b(Menu menu) {
        this.f886a.f890d.m1156b(menu);
    }

    /* JADX INFO: renamed from: b */
    public void m1037b(boolean z) {
        this.f886a.f890d.m1157b(z);
    }

    /* JADX INFO: renamed from: b */
    public boolean m1038b(MenuItem menuItem) {
        return this.f886a.f890d.m1158b(menuItem);
    }

    /* JADX INFO: renamed from: c */
    public void m1039c() {
        this.f886a.f890d.m1184l();
    }

    /* JADX INFO: renamed from: c */
    public void m1040c(boolean z) {
        this.f886a.m1060a(z);
    }

    /* JADX INFO: renamed from: d */
    public Parcelable m1041d() {
        return this.f886a.f890d.m1182k();
    }

    /* JADX INFO: renamed from: e */
    public C0161q m1042e() {
        return this.f886a.f890d.m1178i();
    }

    /* JADX INFO: renamed from: f */
    public void m1043f() {
        this.f886a.f890d.m1186m();
    }

    /* JADX INFO: renamed from: g */
    public void m1044g() {
        this.f886a.f890d.m1189n();
    }

    /* JADX INFO: renamed from: h */
    public void m1045h() {
        this.f886a.f890d.m1190o();
    }

    /* JADX INFO: renamed from: i */
    public void m1046i() {
        this.f886a.f890d.m1192p();
    }

    /* JADX INFO: renamed from: j */
    public void m1047j() {
        this.f886a.f890d.m1193q();
    }

    /* JADX INFO: renamed from: k */
    public void m1048k() {
        this.f886a.f890d.m1194r();
    }

    /* JADX INFO: renamed from: l */
    public void m1049l() {
        this.f886a.f890d.m1195s();
    }

    /* JADX INFO: renamed from: m */
    public void m1050m() {
        this.f886a.f890d.m1197u();
    }

    /* JADX INFO: renamed from: n */
    public void m1051n() {
        this.f886a.f890d.m1198v();
    }

    /* JADX INFO: renamed from: o */
    public boolean m1052o() {
        return this.f886a.f890d.m1171f();
    }

    /* JADX INFO: renamed from: p */
    public void m1053p() {
        this.f886a.m1068l();
    }

    /* JADX INFO: renamed from: q */
    public void m1054q() {
        this.f886a.m1069m();
    }

    /* JADX INFO: renamed from: r */
    public void m1055r() {
        this.f886a.m1070n();
    }

    /* JADX INFO: renamed from: s */
    public C0219m<String, AbstractC0168x> m1056s() {
        return this.f886a.m1071o();
    }
}
