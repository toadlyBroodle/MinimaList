package ca.toadlybroodle.minimalist;

import android.util.Log;
import ca.toadlybroodle.minimalist.iface.HostContract;
import ca.toadlybroodle.minimalist.model.OutlineRow;
import java.util.ArrayList;
import java.util.Iterator;

// Ported from decompiled AbstractC0565l. Static-only cut/copy/paste buffer for outline rows.
public abstract class Clipboard {

    private static final String f3925a = "fuckn" + Clipboard.class.getSimpleName();

    private static ArrayList<OutlineRow> f3926b;
    private static String f3927c;
    private static int f3928d;
    private static ArrayList<OutlineRowView> f3929e;

    public static ArrayList<OutlineRow> m4917a() {
        return f3926b;
    }

    static void m4918a(HostContract host, OutlineTree tree, int i) {
        if (f3926b == null || f3926b.isEmpty()) {
            return;
        }
        OutlineRowView current = host.mo4788z();
        if (current != null) {
            m4922a(f3926b, current.m4859a());
        } else {
            m4922a(f3926b, 0);
        }
        ArrayList<OutlineRowView> arrayList = new ArrayList<>();
        Iterator<OutlineRow> it = f3926b.iterator();
        while (it.hasNext()) {
            arrayList.add(new OutlineRowView(host, tree.f3986a, it.next()));
        }
        tree.m4990a(i, arrayList);
        Log.d(f3925a, "Entries pasted");
    }

    static void m4919a(OutlineTree tree, OutlineRowView row) {
        if (row == null) {
            return;
        }
        ArrayList<OutlineRowView> arrayList = new ArrayList<>();
        arrayList.add(row);
        arrayList.addAll(tree.m5004h(row));
        f3926b = OutlineRow.getListOfEntSers(arrayList);
        Log.d(f3925a, "Entries copied");
    }

    static void m4920a(String str, ArrayList<OutlineRowView> arrayList, OutlineRowView row) {
        f3927c = str;
        f3928d = arrayList.indexOf(row);
        f3929e = new ArrayList<>();
        f3929e.add(row);
    }

    static void m4921a(ArrayList<OutlineRowView> arrayList) {
        f3929e.addAll(arrayList);
    }

    private static void m4922a(ArrayList<OutlineRow> arrayList, int i) {
        int delta = i - arrayList.get(0).indent;
        Iterator<OutlineRow> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().indent += delta;
        }
    }

    static boolean m4923a(OutlineTree tree) {
        if (f3929e == null || f3929e.isEmpty()) {
            return false;
        }
        tree.m4990a(f3928d, f3929e);
        f3929e = null;
        return true;
    }

    public static String m4924b() {
        return f3927c;
    }

    public static ArrayList<OutlineRowView> m4925c() {
        return f3929e;
    }
}
