package ca.toadlybroodledev.sublist.iface;

import androidx.fragment.app.Fragment;
import ca.toadlybroodledev.sublist.MainActivity;
import ca.toadlybroodledev.sublist.SublistFragment;
import java.util.ArrayList;

// Ported from decompiled p031b/InterfaceC0550b. Row-action callbacks from fragments to the host.
// ComponentCallbacksC0154j (jadx-renamed android.support.v4.app.Fragment) → androidx Fragment.
public interface RowActionListener {

    // Single-fragment row action (originally 'a(C0563j)')
    void mo4764a(SublistFragment fragment);

    // Multi-fragment row action (originally 'a(ArrayList<C0563j>)')
    void mo4767a(ArrayList<SublistFragment> fragments);

    // Fragment lifecycle callback (originally 'b(ComponentCallbacksC0154j)')
    void mo4771b(Fragment fragment);

    // Returns the host activity (originally 'l()')
    MainActivity mo4774l();

    // Returns all SublistFragments (originally 'x()')
    ArrayList<SublistFragment> mo4786x();

    // Returns the current SublistFragment (originally 'y()')
    SublistFragment mo4787y();
}
