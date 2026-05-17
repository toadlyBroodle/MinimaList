package ca.toadlybroodledev.sublist;

import android.util.Log;
import ca.toadlybroodledev.sublist.p031b.InterfaceC0549a;
import ca.toadlybroodledev.sublist.p032c.C0554a;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: ca.toadlybroodledev.sublist.l */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0565l {

    /* JADX INFO: renamed from: a */
    private static final String f3925a = "fuckn" + AbstractC0565l.class.getSimpleName();

    /* JADX INFO: renamed from: b */
    private static ArrayList<C0554a> f3926b;

    /* JADX INFO: renamed from: c */
    private static String f3927c;

    /* JADX INFO: renamed from: d */
    private static int f3928d;

    /* JADX INFO: renamed from: e */
    private static ArrayList<C0557d> f3929e;

    /* JADX INFO: renamed from: a */
    public static ArrayList<C0554a> m4917a() {
        return f3926b;
    }

    /* JADX INFO: renamed from: a */
    static void m4918a(InterfaceC0549a interfaceC0549a, C0571r c0571r, int i) {
        if (f3926b == null || f3926b.isEmpty()) {
            return;
        }
        C0557d c0557dMo4788z = interfaceC0549a.mo4788z();
        if (c0557dMo4788z != null) {
            m4922a(f3926b, c0557dMo4788z.m4859a());
        } else {
            m4922a(f3926b, 0);
        }
        ArrayList<C0557d> arrayList = new ArrayList<>();
        Iterator<C0554a> it = f3926b.iterator();
        while (it.hasNext()) {
            arrayList.add(new C0557d(interfaceC0549a, c0571r.f3986a, it.next()));
        }
        c0571r.m4990a(i, arrayList);
        Log.d(f3925a, "Entries pasted");
    }

    /* JADX INFO: renamed from: a */
    static void m4919a(C0571r c0571r, C0557d c0557d) {
        if (c0557d == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(c0557d);
        arrayList.addAll(c0571r.m5004h(c0557d));
        f3926b = C0554a.getListOfEntSers(arrayList);
        Log.d(f3925a, "Entries copied");
    }

    /* JADX INFO: renamed from: a */
    static void m4920a(String str, ArrayList<C0557d> arrayList, C0557d c0557d) {
        f3927c = str;
        f3928d = arrayList.indexOf(c0557d);
        f3929e = new ArrayList<>();
        f3929e.add(c0557d);
    }

    /* JADX INFO: renamed from: a */
    static void m4921a(ArrayList<C0557d> arrayList) {
        f3929e.addAll(arrayList);
    }

    /* JADX INFO: renamed from: a */
    private static void m4922a(ArrayList<C0554a> arrayList, int i) {
        int i2 = i - arrayList.get(0).indent;
        Iterator<C0554a> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().indent += i2;
        }
    }

    /* JADX INFO: renamed from: a */
    static boolean m4923a(C0571r c0571r) {
        if (f3929e == null || f3929e.isEmpty()) {
            return false;
        }
        c0571r.m4990a(f3928d, f3929e);
        f3929e = null;
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static String m4924b() {
        return f3927c;
    }

    /* JADX INFO: renamed from: c */
    public static ArrayList<C0557d> m4925c() {
        return f3929e;
    }
}
