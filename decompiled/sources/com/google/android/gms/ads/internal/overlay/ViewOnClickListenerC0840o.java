package com.google.android.gms.ads.internal.overlay;

import android.R;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import com.google.android.gms.internal.C1657jb;
import com.google.android.gms.internal.bxm;
import com.google.android.gms.internal.cnb;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.overlay.o */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class ViewOnClickListenerC0840o extends FrameLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    private final ImageButton f4833a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC0845t f4834b;

    public ViewOnClickListenerC0840o(Context context, C0841p c0841p, InterfaceC0845t interfaceC0845t) {
        super(context);
        this.f4834b = interfaceC0845t;
        setOnClickListener(this);
        this.f4833a = new ImageButton(context);
        this.f4833a.setImageResource(R.drawable.btn_dialog);
        this.f4833a.setBackgroundColor(0);
        this.f4833a.setOnClickListener(this);
        ImageButton imageButton = this.f4833a;
        bxm.m10404a();
        int iM11560a = C1657jb.m11560a(context, c0841p.f4835a);
        bxm.m10404a();
        int iM11560a2 = C1657jb.m11560a(context, 0);
        bxm.m10404a();
        int iM11560a3 = C1657jb.m11560a(context, c0841p.f4836b);
        bxm.m10404a();
        imageButton.setPadding(iM11560a, iM11560a2, iM11560a3, C1657jb.m11560a(context, c0841p.f4838d));
        this.f4833a.setContentDescription("Interstitial close button");
        bxm.m10404a();
        C1657jb.m11560a(context, c0841p.f4839e);
        ImageButton imageButton2 = this.f4833a;
        bxm.m10404a();
        int iM11560a4 = C1657jb.m11560a(context, c0841p.f4839e + c0841p.f4835a + c0841p.f4836b);
        bxm.m10404a();
        addView(imageButton2, new FrameLayout.LayoutParams(iM11560a4, C1657jb.m11560a(context, c0841p.f4839e + c0841p.f4838d), 17));
    }

    /* JADX INFO: renamed from: a */
    public final void m5805a(boolean z, boolean z2) {
        if (!z2) {
            this.f4833a.setVisibility(0);
        } else if (z) {
            this.f4833a.setVisibility(4);
        } else {
            this.f4833a.setVisibility(8);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.f4834b != null) {
            this.f4834b.mo5789c();
        }
    }
}
