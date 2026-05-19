package ca.toadlybroodle.minimalist;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;
import ca.toadlybroodle.minimalist.iface.RowActionListener;
import ca.toadlybroodle.minimalist.model.OutlineRow;
import java.util.ArrayList;
import java.util.Iterator;

// Ported from decompiled C0538a. Creates or renames a sublist via AlertDialog.
public class NewSublistDialog extends DialogFragment {

    protected static RowActionListener f3745ae;

    EditText f3746af;

    boolean m4801b(String str) {
        if (!m4803d(str)) {
            return false;
        }
        OutlineFragment newFrag = new OutlineFragment().m4899a(
                (ca.toadlybroodle.minimalist.iface.HostContract) getActivity(), str,
                (ArrayList<OutlineRow>) null);
        ArrayList<OutlineFragment> list = new ArrayList<>();
        list.add(newFrag);
        f3745ae.mo4767a(list);
        f3745ae.mo4764a(newFrag);
        return true;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedState) {
        View view = getActivity().getLayoutInflater().inflate(
                R.layout.fragment_dialog_create_new_sub, (ViewGroup) null);
        String tag = getTag();
        f3745ae = (RowActionListener) getActivity();
        this.f3746af = (EditText) view.findViewById(R.id.new_sublist_name_input);
        if ("dialog_create_sublist".equals(tag)) {
            return new AlertDialog.Builder(getActivity())
                    .setView(view)
                    .setTitle(R.string.new_minimalist)
                    .setMessage(R.string.prompt_new_sublist_name)
                    .setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            NewSublistDialog.this.m4801b(
                                    NewSublistDialog.this.f3746af.getText().toString());
                        }
                    })
                    .setNegativeButton(R.string.cancel, null)
                    .create();
        }
        if ("dialog_rename_sublist".equals(tag)) {
            return new AlertDialog.Builder(getActivity())
                    .setView(view)
                    .setTitle(R.string.dialog_rename_title)
                    .setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            NewSublistDialog.this.m4802c(
                                    NewSublistDialog.this.f3746af.getText().toString());
                        }
                    })
                    .setNegativeButton(R.string.cancel, null)
                    .create();
        }
        return null;
    }

    boolean m4802c(String str) {
        if (!m4803d(str)) {
            return false;
        }
        DrawerCustomLayout drawer = ((ca.toadlybroodle.minimalist.iface.HostContract) getActivity()).mo4782t();
        OutlineFragment frag = f3745ae.mo4787y();
        drawer.m4799b(frag);
        frag.m4907b(str);
        drawer.m4798a(frag);
        return true;
    }

    boolean m4803d(String str) {
        if (str.equals("")) {
            Toast.makeText(getActivity(), R.string.toast_new_sublist_name_not_blank, Toast.LENGTH_SHORT).show();
            return false;
        }
        Iterator<OutlineFragment> it = f3745ae.mo4786x().iterator();
        while (it.hasNext()) {
            if (it.next().mo4848ae().toLowerCase().equals(str.toLowerCase())) {
                Toast.makeText(getActivity(), R.string.toast_choose_new_name_for_sublist, Toast.LENGTH_SHORT).show();
                return false;
            }
        }
        return true;
    }
}
