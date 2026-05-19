package ca.toadlybroodledev.minimalist.iface;

import android.widget.LinearLayout;
import ca.toadlybroodledev.minimalist.OutlineTree;

// Ported from decompiled p031b/InterfaceC0552d. Fragment-side accessors for outline state.
public interface OutlineHost {

    // Returns the sublist name (originally 'ae()')
    String mo4848ae();

    // Returns the OutlineTree data container (originally 'af()')
    OutlineTree mo4849af();

    // Returns the root LinearLayout (originally 'ah()')
    LinearLayout mo4850ah();

    // Returns the mode label string (originally 'al()')
    String mo4851al();

    // Mode-reset callback (originally 'am()')
    void mo4852am();

    // Returns the indent level for a given index (originally 'e(int)')
    int mo4853e(int i);
}
