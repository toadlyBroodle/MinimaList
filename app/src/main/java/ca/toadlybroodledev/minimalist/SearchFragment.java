package ca.toadlybroodledev.minimalist;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import ca.toadlybroodledev.minimalist.iface.FragmentHost;
import ca.toadlybroodledev.minimalist.iface.HostContract;
import java.util.ArrayList;

// Ported from decompiled ViewOnClickListenerC0561h. Search UI fragment backed by SublistRenderer.
public class SearchFragment extends OutlineFragment
        implements View.OnClickListener, FragmentHost {

    private final String f3864b = "Fuckn" + getClass().getSimpleName();
    private HostContract f3865c;
    private SublistRenderer f3866d;
    private LinearLayout f3867e;
    private Button f3868f;
    private EditText f3869g;

    void m4882c(View view) {
        ArrayList<OutlineRowView> result = new ArrayList<>();
        String query = this.f3869g.getText().toString().toLowerCase();
        for (OutlineRowView rv : m4883ad()) {
            if (rv.f3822e.getText().toString().contains(query)) {
                result.add(rv);
            }
        }
        this.f3866d.m4979a(result);
        this.f3865c.mo4761a(view, false);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedState) {
        return inflater.inflate(R.layout.fragment_search, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedState) {
        this.f3865c = (HostContract) getContext();
        this.f3867e = (LinearLayout) this.f3865c.mo4760a(Integer.valueOf(R.id.search_lin_lay));
        this.f3868f = (Button) this.f3865c.mo4760a(Integer.valueOf(R.id.sublist_search_button));
        this.f3869g = (EditText) this.f3865c.mo4760a(Integer.valueOf(R.id.sublist_search_text));
        this.f3869g.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int actionId, KeyEvent event) {
                if (actionId == 6) {
                    try {
                        SearchFragment.this.m4882c(textView);
                        return true;
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                return false;
            }
        });
        this.f3869g.setSingleLine();
        this.f3869g.setImeOptions(6);
        this.f3868f.setOnClickListener(this);
        this.f3866d = new SublistRenderer(this);
    }

    @Override
    public LinearLayout mo4846ac() {
        return this.f3867e;
    }

    public ArrayList<OutlineRowView> m4883ad() {
        ArrayList<OutlineRowView> result = new ArrayList<>();
        for (OutlineFragment frag : this.f3865c.mo4786x()) {
            result.addAll(frag.mo4849af().m4988a());
        }
        return result;
    }

    @Override
    public MainActivity mo4847b() {
        return (MainActivity) getActivity();
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.sublist_search_button) {
            m4882c(view);
        }
    }
}
