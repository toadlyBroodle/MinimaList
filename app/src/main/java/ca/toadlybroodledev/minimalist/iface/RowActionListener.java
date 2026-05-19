package ca.toadlybroodledev.minimalist.iface;

import androidx.fragment.app.Fragment;
import ca.toadlybroodledev.minimalist.MainActivity;
import ca.toadlybroodledev.minimalist.OutlineFragment;
import java.util.ArrayList;

// Ported from decompiled p031b/InterfaceC0550b. Row-action callbacks from fragments to the host.
// ComponentCallbacksC0154j (jadx-renamed android.support.v4.app.Fragment) → androidx Fragment.
public interface RowActionListener {

    // Single-fragment row action (originally 'a(C0563j)')
    void mo4764a(OutlineFragment fragment);

    // Multi-fragment row action (originally 'a(ArrayList<C0563j>)')
    void mo4767a(ArrayList<OutlineFragment> fragments);

    // Fragment lifecycle callback (originally 'b(ComponentCallbacksC0154j)')
    void mo4771b(Fragment fragment);

    // Returns the host activity (originally 'l()')
    MainActivity mo4774l();

    // Returns all OutlineFragments (originally 'x()')
    ArrayList<OutlineFragment> mo4786x();

    // Returns the current OutlineFragment (originally 'y()')
    OutlineFragment mo4787y();
}
