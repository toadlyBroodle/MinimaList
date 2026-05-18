package ca.toadlybroodledev.sublist.iface;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.FragmentTransaction;
import ca.toadlybroodledev.sublist.DrawerCustomLayout;
import ca.toadlybroodledev.sublist.OutlineFab;
import ca.toadlybroodledev.sublist.OutlineRowView;
import ca.toadlybroodledev.sublist.OutlineStore;
import ca.toadlybroodledev.sublist.ProfileFragment;
import ca.toadlybroodledev.sublist.SettingsFragment;
import ca.toadlybroodledev.sublist.SublistFragment;
import ca.toadlybroodledev.sublist.model.OutlineRow;
import java.util.ArrayList;
import java.util.HashMap;

// Ported from decompiled p031b/InterfaceC0549a. Sole implementor: ActMain (MainActivity).
// Dropped in this port (Phase 4.3):
//   mo4756C, mo4758E — AdMob hooks (Phase 3.4 no-ops, removed per Phase 4.3 spec)
//   mo4762a(C0556c)  — cloud user-profile setter; C0556c deleted (Phase 3.3/4)
//   mo4777o()        — returned ViewOnClickListenerC0559f (Sign-In fragment, Phase 3.3 deleted)
//   mo4778p()        — premium getter; already stripped in Phase 3.5
public interface HostContract {

    // Fragment-input callback (originally 'F')
    void mo4759F();

    // Returns a View by index (originally 'a(Integer)')
    View mo4760a(Integer num);

    // Show/hide a view (originally 'a(View, boolean)')
    void mo4761a(View view, boolean z);

    // Outline row-view action (originally 'a(C0557d)')
    void mo4763a(OutlineRowView rowView);

    // Fragment action — add/show (originally 'a(C0563j, boolean)')
    void mo4765a(SublistFragment fragment, boolean z);

    // Multi-fragment action (originally 'a(ArrayList<C0563j>, boolean)')
    void mo4768a(ArrayList<SublistFragment> fragments, boolean z);

    // Persist outline data map (originally 'a(HashMap<String, ArrayList<C0554a>>)')
    void mo4769a(HashMap<String, ArrayList<OutlineRow>> map);

    // Returns a string by index (originally 'b(Integer)')
    String mo4770b(Integer num);

    // Boolean toggle (originally 'b(boolean)')
    void mo4772b(boolean z);

    // Integer action (originally 'c(int)')
    void mo4773c(int i);

    // Returns the host Context (originally 'm()')
    Context mo4775m();

    // Returns the ProfileFragment (originally 'n()')
    ProfileFragment mo4776n();

    // Fragment input callback (named method — kept as-is)
    void onFragmentInput(View view);

    // Returns the OutlineStore (originally 'q()')
    OutlineStore mo4779q();

    // Returns the SettingsFragment (originally 'r()')
    SettingsFragment mo4780r();

    // Returns the OutlineFab (originally 's()')
    OutlineFab mo4781s();

    // Returns the DrawerCustomLayout (originally 't()')
    DrawerCustomLayout mo4782t();

    // Returns header ImageView (originally 'u()')
    ImageView mo4783u();

    // Returns secondary ImageView (originally 'v()')
    ImageView mo4784v();

    // Returns the FragmentTransaction (originally 'w()'; support AbstractC0164t → AndroidX)
    FragmentTransaction mo4785w();

    // Returns the list of all SublistFragments (originally 'x()')
    ArrayList<SublistFragment> mo4786x();

    // Returns the currently visible SublistFragment (originally 'y()')
    SublistFragment mo4787y();

    // Returns the currently focused OutlineRowView (originally 'z()')
    OutlineRowView mo4788z();
}
