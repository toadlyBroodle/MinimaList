package ca.toadlybroodledev.sublist;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import ca.toadlybroodledev.sublist.iface.HostContract;
import ca.toadlybroodledev.sublist.iface.OutlineHost;
import ca.toadlybroodledev.sublist.model.OutlineRow;
import java.util.ArrayList;
import java.util.HashMap;

// Ported from decompiled C0563j. Core fragment showing one sublist (568 lines).
public class SublistFragment extends Fragment implements OutlineHost {

    private static MenuItem f3893ae;
    private static MenuItem f3894af;
    private static MenuItem f3895ag;
    private static MenuItem f3896ah;
    private static MenuItem f3897ai;
    private static HostContract f3901c;
    private static MenuItem f3902d;
    private static MenuItem f3903e;
    private static MenuItem f3904f;
    private static MenuItem f3905g;
    private static MenuItem f3906h;
    private static MenuItem f3907i;

    IndentManager f3908a;

    private String f3909aj;
    private OutlineTree f3910ak;
    private ScrollView f3911al;
    private LinearLayout f3912am;
    private TextView f3913an;

    private static final String f3900b = "fuckn" + SublistFragment.class.getSimpleName();

    private static int f3898ao = -1;
    private static int f3899ap = -1;

    public static ArrayList<SublistFragment> m4891a(HostContract host,
            HashMap<String, ArrayList<OutlineRow>> map) {
        ArrayList<SublistFragment> result = new ArrayList<>();
        for (String key : map.keySet()) {
            result.add(new SublistFragment().m4899a(host, key, map.get(key)));
        }
        return result;
    }

    public static HashMap<String, ArrayList<OutlineRow>> m4892a(ArrayList<SublistFragment> frags) {
        HashMap<String, ArrayList<OutlineRow>> map = new HashMap<>();
        for (SublistFragment frag : frags) {
            if (frag != null) {
                map.put(frag.f3909aj,
                        OutlineRow.getListOfEntSers(frag.mo4849af().m4988a()));
            }
        }
        return map;
    }

    static int m4893aj() {
        return f3898ao;
    }

    static int m4894ak() {
        return f3899ap;
    }

    private String m4896b() {
        if (Clipboard.m4923a(this.f3910ak)) {
            Toast.makeText(getActivity(), R.string.toast_done, Toast.LENGTH_SHORT).show();
            return "Sub_deleteEntryUndo";
        }
        Toast.makeText(getActivity(), R.string.toast_no_prev_del_entries,
                Toast.LENGTH_SHORT).show();
        return "Sub_deleteEntryUndo";
    }

    static void m4897b(int i, int i2) {
        f3898ao = i;
        f3899ap = i2;
        AppSettings.f3939b = i;
        AppSettings.f3940c = i2;
        AppSettings.m4947l();
    }

    static void m4898d(int i) {
        m4897b(f3898ao, f3899ap + i);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedState) {
        super.onCreateView(inflater, container, savedState);
        setHasOptionsMenu(true);
        return inflater.inflate(R.layout.fragment_sublist, container, false);
    }

    public SublistFragment m4899a(HostContract host, String name, ArrayList<OutlineRow> rows) {
        f3901c = host;
        if (name == null) {
            this.f3909aj = f3901c.mo4770b(Integer.valueOf(R.string.app_name));
        } else {
            this.f3909aj = name;
        }
        this.f3910ak = new OutlineTree(f3901c, this, rows);
        f3898ao = AppSettings.f3939b;
        f3899ap = AppSettings.f3940c;
        return this;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        setRetainInstance(true);
        // Ensure f3901c is set before any row interaction fires, covering the window
        // between onCreate (which adds WelcomeSublistFragment without calling m4899a)
        // and the m4755B async callback that would eventually call m4899a.
        f3901c = (HostContract) context;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        menu.clear();
        inflater.inflate(R.menu.sublist_menu, menu);
        f3902d = menu.findItem(R.id.menu_add_new);
        f3903e = menu.findItem(R.id.menu_move_left);
        f3904f = menu.findItem(R.id.menu_move_right);
        f3905g = menu.findItem(R.id.menu_move_up);
        f3906h = menu.findItem(R.id.menu_move_down);
        f3907i = menu.findItem(R.id.menu_mark_complete);
        f3893ae = menu.findItem(R.id.menu_set_reminder);
        f3894af = menu.findItem(R.id.menu_copy);
        f3895ag = menu.findItem(R.id.menu_paste);
        f3896ah = menu.findItem(R.id.menu_delete);
        f3897ai = menu.findItem(R.id.menu_undo_delete);
        f3907i.setShowAsAction(AppSettings.f3946i ? 0 : 2);
        if (f3898ao == -1) {
            m4901a((OutlineRowView) null);
        } else {
            try {
                m4901a(this.f3910ak.m4988a().get(f3898ao));
            } catch (Error e) {
                Log.e(f3900b, "Index out of bounds: " + e.getMessage());
                m4901a((OutlineRowView) null);
            }
        }
        mo4852am();
        f3901c.mo4772b(false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedState) {
        super.onViewCreated(view, savedState);
        this.f3911al = (ScrollView) view;
        LinearLayout ll = (LinearLayout) this.f3911al.getChildAt(0);
        this.f3913an = (TextView) ll.getChildAt(0);
        this.f3913an.setText(this.f3909aj);
        registerForContextMenu(this.f3913an);
        this.f3912am = (LinearLayout) ll.getChildAt(1);
        this.f3911al.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent e) {
                SublistFragment.f3901c.mo4763a((OutlineRowView) null);
                return false;
            }
        });
        if (f3898ao == -1) {
            mo4852am();
            return;
        }
        try {
            m4901a(this.f3910ak.m4988a().get(f3898ao));
        } catch (Exception e) {
            e.printStackTrace();
            Log.e(f3900b, "Temp Root Index out of bounds: " + e.getMessage());
            m4901a((OutlineRowView) null);
        }
    }

    public void m4900a(LinearLayout ll) {
        this.f3912am = ll;
    }

    void m4901a(OutlineRowView rv) {
        if (rv == null) {
            m4897b(-1, -1);
            this.f3913an.setVisibility(View.VISIBLE);
            f3901c.mo4783u().setVisibility(View.VISIBLE);
            f3901c.mo4784v().setVisibility(View.INVISIBLE);
        } else {
            this.f3913an.setVisibility(View.GONE);
            m4897b(this.f3910ak.m4988a().indexOf(rv),
                    this.f3910ak.m5005i(rv));
            f3901c.mo4783u().setVisibility(View.GONE);
            f3901c.mo4784v().setVisibility(View.VISIBLE);
        }
        m4905an();
        mo4852am();
    }

    public void m4902a(OutlineTree tree) {
        this.f3910ak = tree;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        String event;
        OutlineRowView current = f3901c.mo4788z();
        int itemId = item.getItemId();
        if (current != null) {
            if (itemId == R.id.menu_add_new) {
                event = mo4851al();
            } else if (itemId == R.id.menu_copy) {
                Clipboard.m4919a(this.f3910ak, current);
                event = "Sub_editCopy";
            } else if (itemId == R.id.menu_delete) {
                if (current.f3825h != 0) { current.m4862c(); }
                this.f3910ak.m4992a(current);
                event = "Sub_deleteEntry";
            } else if (itemId == R.id.menu_mark_complete) {
                if (current.f3825h != 0) { current.m4862c(); }
                this.f3910ak.m4996b(current, !current.f3823f);
                f3901c.mo4763a((OutlineRowView) null);
                event = "Sub_markEntryComplete";
            } else if (itemId == R.id.menu_move_down) {
                this.f3910ak.m5003g(current);
                event = "Sub_moveEntryDown";
            } else if (itemId == R.id.menu_move_left) {
                this.f3910ak.m4993a(current, -1);
                event = "Sub_moveEntryLeft";
            } else if (itemId == R.id.menu_move_right) {
                this.f3910ak.m4993a(current, 1);
                event = "Sub_moveEntryRight";
            } else if (itemId == R.id.menu_move_up) {
                this.f3910ak.m5002f(current);
                event = "Sub_moveEntryUp";
            } else if (itemId == R.id.menu_paste) {
                Clipboard.m4918a(f3901c, this.f3910ak,
                        this.f3910ak.m5005i(current) + 1);
                event = "Sub_editPaste";
            } else if (itemId == R.id.menu_set_reminder) {
                if (current.f3825h != 0) {
                    current.m4862c();
                    event = "Sub_cancelReminder";
                } else {
                    new DateTimeUtil.a().show(f3901c.mo4785w(), "datePicker");
                    event = "Sub_setReminder";
                }
            } else if (itemId == R.id.menu_undo_delete) {
                event = m4896b();
            } else {
                event = null;
            }
        } else {
            if (itemId == R.id.menu_add_new) {
                event = mo4851al();
            } else if (itemId == R.id.menu_paste) {
                Clipboard.m4918a(f3901c, this.f3910ak,
                        this.f3910ak.m4988a().size());
                event = "Sub_editPaste";
            } else if (itemId == R.id.menu_undo_delete) {
                event = m4896b();
            } else {
                event = null;
            }
        }
        mo4852am();
        OutlineRowView focused = f3901c.mo4788z();
        if (focused != null) {
            focused.f3822e.requestFocus();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public String mo4848ae() {
        return this.f3909aj;
    }

    @Override
    public OutlineTree mo4849af() {
        return this.f3910ak;
    }

    ScrollView m4903ag() {
        return this.f3911al;
    }

    @Override
    public LinearLayout mo4850ah() {
        return this.f3912am;
    }

    public TextView m4904ai() {
        return this.f3913an;
    }

    @Override
    public String mo4851al() {
        String event;
        if (f3901c.mo4788z() == null) {
            if (f3898ao != -1) {
                this.f3910ak.m4995b();
            } else {
                this.f3910ak.m4991a((OutlineRow) null);
            }
            event = "Sub_createRootEntry";
        } else {
            OutlineRowView focused = f3901c.mo4788z();
            this.f3910ak.m4989a(
                    AppSettings.f3948k
                            ? this.f3910ak.m5005i(focused) + 1
                            : this.f3910ak.m4988a().indexOf(focused),
                    new OutlineRowView(f3901c, this,
                            new OutlineRow(focused.m4859a(), "", false, false, 0L, false)));
            event = "Sub_createSibEntry";
        }
        if (AppSettings.f3947j) {
            try {
                f3901c.mo4761a(f3901c.mo4788z().f3822e, true);
            } catch (Exception e) {
                e.printStackTrace();
                Log.e(f3900b, "Error showing soft keyboard");
            }
        }
        f3901c.mo4759F();
        return event;
    }

    @Override
    public void mo4852am() {
        try {
            this.f3908a = new IndentManager(this);
            this.f3908a.m4983a(this);
        } catch (Exception e) {
        }
        m4905an();
    }

    public void m4905an() {
        if (this.f3910ak == null) {
            return;
        }
        try {
            if (AppSettings.f3945h) {
                f3902d.setVisible(false);
            } else {
                f3902d.setVisible(true);
            }
        } catch (Exception e) {
        }
        OutlineRowView focused = f3901c.mo4788z();
        boolean hasFocus = focused != null;
        try {
            f3905g.setEnabled(hasFocus && this.f3910ak.m5000d(focused));
            f3906h.setEnabled(hasFocus && this.f3910ak.m5001e(focused));
            f3903e.setEnabled(hasFocus && this.f3910ak.m4997b(focused));
            f3904f.setEnabled(hasFocus && this.f3910ak.m4999c(focused));
        } catch (Exception e2) {
        }
        try {
            f3907i.setEnabled(hasFocus);
            f3893ae.setEnabled(hasFocus);
            if (focused == null || focused.f3825h == 0) {
                f3893ae.setTitle(R.string.menu_set_reminder);
            } else {
                f3893ae.setTitle(R.string.menu_cancel_reminder);
            }
            f3894af.setEnabled(hasFocus);
            ArrayList<OutlineRow> copied = Clipboard.m4917a();
            f3895ag.setEnabled(copied != null && !copied.isEmpty());
            f3896ah.setEnabled(hasFocus);
            ArrayList<OutlineRowView> cut = Clipboard.m4925c();
            f3897ai.setEnabled(cut != null && !cut.isEmpty()
                    && Clipboard.m4924b().equals(this.f3909aj));
        } catch (Exception e3) {
        }
        int alphaDisabled = getActivity().getResources().getInteger(R.integer.alphaDisabledIcon);
        int alphaEnabled = getActivity().getResources().getInteger(R.integer.alphaEnabledIcon);
        try {
            f3905g.getIcon().setAlpha(f3905g.isEnabled() ? alphaEnabled : alphaDisabled);
            f3906h.getIcon().setAlpha(f3906h.isEnabled() ? alphaEnabled : alphaDisabled);
            f3903e.getIcon().setAlpha(f3903e.isEnabled() ? alphaEnabled : alphaDisabled);
            f3904f.getIcon().setAlpha(f3904f.isEnabled() ? alphaEnabled : alphaDisabled);
        } catch (Exception e4) {
        }
        try {
            f3907i.getIcon().setAlpha(f3907i.isEnabled() ? alphaEnabled : alphaDisabled);
            f3894af.getIcon().setAlpha(f3894af.isEnabled() ? alphaEnabled : alphaDisabled);
            f3895ag.getIcon().setAlpha(f3895ag.isEnabled() ? alphaEnabled : alphaDisabled);
            f3896ah.getIcon().setAlpha(f3896ah.isEnabled() ? alphaEnabled : alphaDisabled);
            Drawable icon = f3897ai.getIcon();
            icon.setAlpha(f3897ai.isEnabled() ? alphaEnabled : alphaDisabled);
        } catch (Exception e5) {
        }
    }

    void m4906ao() {
        AlertDialog.Builder builder = new AlertDialog.Builder(f3901c.mo4775m());
        builder.setTitle(R.string.menu_delete_list);
        builder.setMessage("Are you positive you want to permanently delete entire list?");
        builder.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                ArrayList<SublistFragment> list = new ArrayList<>();
                list.add(SublistFragment.this);
                SublistFragment.f3901c.mo4768a(list, true);
            }
        });
        builder.setNegativeButton(R.string.cancel, null);
        builder.show();
    }

    public void m4907b(String name) {
        this.f3909aj = name;
        this.f3913an.setText(name);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.menu_context_delete_list) {
            m4906ao();
            return true;
        } else if (id == R.id.menu_context_move_down) {
            f3901c.mo4765a(this, true);
            return true;
        } else if (id == R.id.menu_context_move_up) {
            f3901c.mo4765a(this, false);
            return true;
        } else if (id == R.id.menu_context_rename) {
            new NewSublistDialog().show(f3901c.mo4785w(), "dialog_rename_sublist");
            return true;
        }
        return false;
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public int mo4853e(int i) {
        return getResources().getDimensionPixelSize(i);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View view,
            ContextMenu.ContextMenuInfo info) {
        super.onCreateContextMenu(menu, view, info);
        getActivity().getMenuInflater().inflate(R.menu.sublist_title_context_menu, menu);
    }
}
