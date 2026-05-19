package ca.toadlybroodle.minimalist;

import android.util.Log;
import ca.toadlybroodle.minimalist.iface.HostContract;
import ca.toadlybroodle.minimalist.iface.OutlineHost;
import ca.toadlybroodle.minimalist.model.OutlineRow;
import java.util.ArrayList;
import java.util.Iterator;

// Ported from decompiled C0571r. Per-sublist data container and tree-manipulation operations.
public class OutlineTree {

    OutlineHost f3986a;                          // the outline host (OutlineFragment)
    protected ArrayList<OutlineRowView> f3987b;  // visible (rendered) row list
    private HostContract hostContract;

    private final String f3988c = "fuckn" + getClass().getSimpleName();
    private ArrayList<OutlineRowView> f3990e = new ArrayList<>();  // full row list

    public OutlineTree(HostContract host, OutlineHost outlineHost, ArrayList<OutlineRow> rows) {
        this.hostContract = host;
        this.f3986a = outlineHost;
        if (rows != null) {
            Iterator<OutlineRow> it = rows.iterator();
            while (it.hasNext()) {
                m4991a(it.next());
            }
        }
        this.f3987b = new ArrayList<>();
    }

    private OutlineRowView m4985j(OutlineRowView row) {
        int indent = row.m4859a();
        for (int i = this.f3987b.indexOf(row) - 1; i >= 0; i--) {
            OutlineRowView r = this.f3987b.get(i);
            if (r.m4859a() == indent || r.m4859a() == indent - 1) {
                return r;
            }
        }
        return null;
    }

    private OutlineRowView m4986k(OutlineRowView row) {
        int indent = row.m4859a();
        int i = this.f3987b.indexOf(row) + 1;
        while (true) {
            if (i >= this.f3987b.size()) {
                return null;
            }
            OutlineRowView r = this.f3987b.get(i);
            if (r.m4859a() == indent) {
                return r;
            }
            if (r.m4859a() == indent - 1) {
                return null;
            }
            i++;
        }
    }

    private OutlineRowView m4987l(OutlineRowView row) {
        try {
            return this.f3987b.get(this.f3987b.indexOf(row) - 1);
        } catch (IndexOutOfBoundsException e) {
            return null;
        }
    }

    public ArrayList<OutlineRowView> m4988a() {
        return this.f3990e;
    }

    void m4989a(int i, OutlineRowView row) {
        this.f3990e.add(i, row);
        this.hostContract.mo4763a(row);
        if (OutlineFragment.m4893aj() != -1) {
            OutlineFragment.m4898d(1);
        }
    }

    protected void m4990a(int i, ArrayList<OutlineRowView> rows) {
        for (int j = 0; j < rows.size(); j++) {
            this.f3990e.add(i + j, rows.get(j));
            if (OutlineFragment.m4893aj() != -1) {
                OutlineFragment.m4898d(1);
            }
        }
    }

    void m4991a(OutlineRow row) {
        if (row != null) {
            this.f3990e.add(new OutlineRowView(this.hostContract, this.f3986a, row));
        } else {
            OutlineRowView rv = new OutlineRowView(this.hostContract, this.f3986a,
                    new OutlineRow(0, "", false, false, 0L, false));
            this.f3990e.add(rv);
            try {
                this.hostContract.mo4763a(rv);
            } catch (Exception e) {
            }
        }
    }

    void m4992a(OutlineRowView row) {
        if (this.f3990e.contains(row)) {
            Clipboard.m4920a(this.f3986a.mo4848ae(), this.f3990e, row);
            if (AppSettings.f3952o) {
                ArrayList<OutlineRowView> children = m5004h(row);
                Clipboard.m4921a(children);
                Iterator<OutlineRowView> it = children.iterator();
                while (it.hasNext()) {
                    this.f3990e.remove(it.next());
                    if (OutlineFragment.m4893aj() != -1) {
                        OutlineFragment.m4898d(-1);
                    }
                }
            }
            this.f3990e.remove(row);
            if (OutlineFragment.m4893aj() != -1) {
                OutlineFragment.m4898d(-1);
            }
            this.hostContract.mo4763a((OutlineRowView) null);
        }
    }

    void m4993a(OutlineRowView row, int i) {
        int newIndent = row.m4859a() + i;
        for (OutlineRowView child : m5004h(row)) {
            child.m4860a(child.m4859a() + i);
        }
        row.m4860a(newIndent);
    }

    void m4994a(OutlineRowView row, boolean z) {
        ArrayList<OutlineRowView> children = m5004h(row);
        if (children == null || children.size() == 0) {
            return;
        }
        row.f3824g = z;
        this.f3986a.mo4852am();
    }

    void m4995b() {
        // Search-mode add-new: f3898ao != -1 but visible rows can still be empty when the
        // search has filtered everything out. Fall back to the root-level add path so the
        // user gets a row appended instead of a crash. Same IOOBE shape as bd4b8ac.
        if (this.f3987b.isEmpty()) {
            m4991a((OutlineRow) null);
            return;
        }
        OutlineRowView rv = new OutlineRowView(this.hostContract, this.f3986a,
                new OutlineRow(this.f3987b.get(0).m4859a(), "", false, false, 0L, false));
        m4989a(this.f3990e.indexOf(this.f3987b.get(this.f3987b.size() - 1)) + 1, rv);
        this.f3987b.add(rv);
    }

    void m4996b(OutlineRowView row, boolean z) {
        row.f3823f = z;
        // Phase 10.4: removed ProfileFragment completion-counter call (was a no-op since
        // Phase 3.3 cloud-profile strip).
        if (AppSettings.f3951n) {
            Iterator<OutlineRowView> it = m5004h(row).iterator();
            while (it.hasNext()) {
                it.next().f3823f = z;
            }
        }
    }

    boolean m4997b(OutlineRowView row) {
        OutlineRowView prev = m4987l(row);
        if (OutlineFragment.m4893aj() != -1
                && (prev == null || row.m4859a() <= this.f3987b.get(0).m4859a())) {
            return false;
        }
        if (prev != null || row.m4859a() > 0) {
            return row.m4859a() + (-1) >= 0;
        }
        return false;
    }

    void m4998c() {
        ArrayList<OutlineRowView> completed = new ArrayList<>();
        for (OutlineRowView rv : this.f3990e) {
            if (rv.f3823f) {
                completed.add(rv);
            }
        }
        int before = this.f3990e.size();
        this.f3990e.removeAll(completed);
        Log.d(this.f3988c, "Completed entries deleted: " + (before - this.f3990e.size()));
    }

    boolean m4999c(OutlineRowView row) {
        OutlineRowView prev = m4987l(row);
        return prev != null && row.m4859a() <= prev.m4859a();
    }

    boolean m5000d(OutlineRowView row) {
        OutlineRowView sibling = m4985j(row);
        return sibling != null && sibling.m4859a() >= row.m4859a()
                && this.f3987b.indexOf(row) > this.f3987b.indexOf(sibling);
    }

    boolean m5001e(OutlineRowView row) {
        return m4986k(row) != null;
    }

    boolean m5002f(OutlineRowView row) {
        OutlineRowView sibling = m4985j(row);
        int target = sibling == null
                ? this.f3990e.indexOf(row) : this.f3990e.indexOf(sibling);
        ArrayList<OutlineRowView> children = m5004h(row);
        m4992a(row);
        for (int i = children.size() - 1; i >= 0; i--) {
            m4989a(target, children.get(i));
        }
        m4989a(target, row);
        return true;
    }

    boolean m5003g(OutlineRowView row) {
        OutlineRowView next = m4986k(row);
        ArrayList<OutlineRowView> children = m5004h(row);
        m4992a(row);
        int target = m5004h(next).size() + this.f3990e.indexOf(next) + 1;
        for (int i = children.size() - 1; i >= 0; i--) {
            m4989a(target, children.get(i));
        }
        m4989a(target, row);
        return true;
    }

    ArrayList<OutlineRowView> m5004h(OutlineRowView row) {
        ArrayList<OutlineRowView> result = new ArrayList<>();
        if (row == null) {
            return result;
        }
        int i = this.f3990e.indexOf(row) + 1;
        while (true) {
            if (i >= this.f3990e.size()) {
                break;
            }
            OutlineRowView r = this.f3990e.get(i);
            if (r.m4859a() <= row.m4859a()) {
                break;
            }
            result.add(r);
            i++;
        }
        return result;
    }

    int m5005i(OutlineRowView row) {
        ArrayList<OutlineRowView> children = m5004h(row);
        return (children == null || children.size() == 0)
                ? this.f3990e.indexOf(row)
                : this.f3990e.indexOf(row) + m5004h(row).size();
    }
}
