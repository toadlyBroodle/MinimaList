package ca.toadlybroodledev.sublist.iface;

import android.widget.LinearLayout;
import ca.toadlybroodledev.sublist.MainActivity;

// Ported from decompiled p031b/InterfaceC0551c. Host wiring for child fragments.
public interface FragmentHost {

    // Returns the row container LinearLayout (originally 'ac()')
    LinearLayout mo4846ac();

    // Returns the host activity (originally 'b()')
    MainActivity mo4847b();
}
