package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.ads.internal.C0710au;
import com.google.android.gms.common.internal.C1231at;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.lq */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C1726lq extends FrameLayout implements InterfaceC1723ln {

    /* JADX INFO: renamed from: a */
    private final InterfaceC1739mc f10953a;

    /* JADX INFO: renamed from: b */
    private final FrameLayout f10954b;

    /* JADX INFO: renamed from: c */
    private final cba f10955c;

    /* JADX INFO: renamed from: d */
    private final RunnableC1741me f10956d;

    /* JADX INFO: renamed from: e */
    private final long f10957e;

    /* JADX INFO: renamed from: f */
    private AbstractC1724lo f10958f;

    /* JADX INFO: renamed from: g */
    private boolean f10959g;

    /* JADX INFO: renamed from: h */
    private boolean f10960h;

    /* JADX INFO: renamed from: i */
    private boolean f10961i;

    /* JADX INFO: renamed from: j */
    private boolean f10962j;

    /* JADX INFO: renamed from: k */
    private long f10963k;

    /* JADX INFO: renamed from: l */
    private long f10964l;

    /* JADX INFO: renamed from: m */
    private String f10965m;

    /* JADX INFO: renamed from: n */
    private Bitmap f10966n;

    /* JADX INFO: renamed from: o */
    private ImageView f10967o;

    /* JADX INFO: renamed from: p */
    private boolean f10968p;

    public C1726lq(Context context, InterfaceC1739mc interfaceC1739mc, int i, boolean z, cba cbaVar, C1738mb c1738mb) {
        super(context);
        this.f10953a = interfaceC1739mc;
        this.f10955c = cbaVar;
        this.f10954b = new FrameLayout(context);
        addView(this.f10954b, new FrameLayout.LayoutParams(-1, -1));
        C1231at.m7087a(interfaceC1739mc.mo11756e());
        this.f10958f = interfaceC1739mc.mo11756e().f4577b.mo11698a(context, interfaceC1739mc, i, z, cbaVar, c1738mb);
        if (this.f10958f != null) {
            this.f10954b.addView(this.f10958f, new FrameLayout.LayoutParams(-1, -1, 17));
            if (((Boolean) bxm.m10409f().m10546a(can.f9667s)).booleanValue()) {
                m11717m();
            }
        }
        this.f10967o = new ImageView(context);
        this.f10957e = ((Long) bxm.m10409f().m10546a(can.f9671w)).longValue();
        this.f10962j = ((Boolean) bxm.m10409f().m10546a(can.f9669u)).booleanValue();
        if (this.f10955c != null) {
            this.f10955c.m10579a("spinner_used", this.f10962j ? "1" : "0");
        }
        this.f10956d = new RunnableC1741me(this);
        if (this.f10958f != null) {
            this.f10958f.mo11682a(this);
        }
        if (this.f10958f == null) {
            mo11691a("AdVideoUnderlay Error", "Allocating player failed.");
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m11700a(InterfaceC1739mc interfaceC1739mc) {
        HashMap map = new HashMap();
        map.put("event", "no_video_view");
        interfaceC1739mc.m11751a("onVideoEvent", map);
    }

    /* JADX INFO: renamed from: a */
    public static void m11701a(InterfaceC1739mc interfaceC1739mc, String str) {
        HashMap map = new HashMap();
        map.put("event", "decoderProps");
        map.put("error", str);
        interfaceC1739mc.m11751a("onVideoEvent", map);
    }

    /* JADX INFO: renamed from: a */
    public static void m11702a(InterfaceC1739mc interfaceC1739mc, Map<String, List<Map<String, Object>>> map) {
        HashMap map2 = new HashMap();
        map2.put("event", "decoderProps");
        map2.put("mimeTypes", map);
        interfaceC1739mc.m11751a("onVideoEvent", map2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m11703a(String str, String... strArr) {
        HashMap map = new HashMap();
        map.put("event", str);
        int length = strArr.length;
        int i = 0;
        String str2 = null;
        while (i < length) {
            String str3 = strArr[i];
            if (str2 != null) {
                map.put(str2, str3);
                str3 = null;
            }
            i++;
            str2 = str3;
        }
        this.f10953a.m11751a("onVideoEvent", map);
    }

    /* JADX INFO: renamed from: p */
    private final boolean m11704p() {
        return this.f10967o.getParent() != null;
    }

    /* JADX INFO: renamed from: q */
    private final void m11705q() {
        if (this.f10953a.mo11755d() == null || !this.f10960h || this.f10961i) {
            return;
        }
        this.f10953a.mo11755d().getWindow().clearFlags(128);
        this.f10960h = false;
    }

    @Override // com.google.android.gms.internal.InterfaceC1723ln
    /* JADX INFO: renamed from: a */
    public final void mo11689a() {
        this.f10956d.m11771b();
        C1596gv.f10711a.post(new RunnableC1727lr(this));
    }

    /* JADX INFO: renamed from: a */
    public final void m11706a(float f) {
        if (this.f10958f == null) {
            return;
        }
        AbstractC1724lo abstractC1724lo = this.f10958f;
        abstractC1724lo.f10952b.m11774a(f);
        abstractC1724lo.mo11686e();
    }

    /* JADX INFO: renamed from: a */
    public final void m11707a(float f, float f2) {
        if (this.f10958f != null) {
            this.f10958f.mo11680a(f, f2);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m11708a(int i) {
        if (this.f10958f == null) {
            return;
        }
        this.f10958f.mo11681a(i);
    }

    @Override // com.google.android.gms.internal.InterfaceC1723ln
    /* JADX INFO: renamed from: a */
    public final void mo11690a(int i, int i2) {
        if (this.f10962j) {
            int iMax = Math.max(i / ((Integer) bxm.m10409f().m10546a(can.f9670v)).intValue(), 1);
            int iMax2 = Math.max(i2 / ((Integer) bxm.m10409f().m10546a(can.f9670v)).intValue(), 1);
            if (this.f10966n != null && this.f10966n.getWidth() == iMax && this.f10966n.getHeight() == iMax2) {
                return;
            }
            this.f10966n = Bitmap.createBitmap(iMax, iMax2, Bitmap.Config.ARGB_8888);
            this.f10968p = false;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m11709a(int i, int i2, int i3, int i4) {
        if (i3 == 0 || i4 == 0) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i4);
        layoutParams.setMargins(i, i2, 0, 0);
        this.f10954b.setLayoutParams(layoutParams);
        requestLayout();
    }

    @TargetApi(14)
    /* JADX INFO: renamed from: a */
    public final void m11710a(MotionEvent motionEvent) {
        if (this.f10958f == null) {
            return;
        }
        this.f10958f.dispatchTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: a */
    public final void m11711a(String str) {
        this.f10965m = str;
    }

    @Override // com.google.android.gms.internal.InterfaceC1723ln
    /* JADX INFO: renamed from: a */
    public final void mo11691a(String str, String str2) {
        m11703a("error", "what", str, "extra", str2);
    }

    @Override // com.google.android.gms.internal.InterfaceC1723ln
    /* JADX INFO: renamed from: b */
    public final void mo11692b() {
        if (this.f10958f != null && this.f10964l == 0) {
            m11703a("canplaythrough", "duration", String.valueOf(this.f10958f.getDuration() / 1000.0f), "videoWidth", String.valueOf(this.f10958f.getVideoWidth()), "videoHeight", String.valueOf(this.f10958f.getVideoHeight()));
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC1723ln
    /* JADX INFO: renamed from: c */
    public final void mo11693c() {
        if (this.f10953a.mo11755d() != null && !this.f10960h) {
            this.f10961i = (this.f10953a.mo11755d().getWindow().getAttributes().flags & 128) != 0;
            if (!this.f10961i) {
                this.f10953a.mo11755d().getWindow().addFlags(128);
                this.f10960h = true;
            }
        }
        this.f10959g = true;
    }

    @Override // com.google.android.gms.internal.InterfaceC1723ln
    /* JADX INFO: renamed from: d */
    public final void mo11694d() {
        m11703a("pause", new String[0]);
        m11705q();
        this.f10959g = false;
    }

    @Override // com.google.android.gms.internal.InterfaceC1723ln
    /* JADX INFO: renamed from: e */
    public final void mo11695e() {
        m11703a("ended", new String[0]);
        m11705q();
    }

    @Override // com.google.android.gms.internal.InterfaceC1723ln
    /* JADX INFO: renamed from: f */
    public final void mo11696f() {
        if (this.f10968p && this.f10966n != null && !m11704p()) {
            this.f10967o.setImageBitmap(this.f10966n);
            this.f10967o.invalidate();
            this.f10954b.addView(this.f10967o, new FrameLayout.LayoutParams(-1, -1));
            this.f10954b.bringChildToFront(this.f10967o);
        }
        this.f10956d.m11770a();
        this.f10964l = this.f10963k;
        C1596gv.f10711a.post(new RunnableC1728ls(this));
    }

    @Override // com.google.android.gms.internal.InterfaceC1723ln
    /* JADX INFO: renamed from: g */
    public final void mo11697g() {
        if (this.f10959g && m11704p()) {
            this.f10954b.removeView(this.f10967o);
        }
        if (this.f10966n != null) {
            long jMo7253b = C0710au.m5575k().mo7253b();
            if (this.f10958f.getBitmap(this.f10966n) != null) {
                this.f10968p = true;
            }
            long jMo7253b2 = C0710au.m5575k().mo7253b() - jMo7253b;
            if (C1560fm.m11344a()) {
                C1560fm.m11343a(new StringBuilder(46).append("Spinner frame grab took ").append(jMo7253b2).append("ms").toString());
            }
            if (jMo7253b2 > this.f10957e) {
                C1560fm.m11615e("Spinner frame grab crossed jank threshold! Suspending spinner.");
                this.f10962j = false;
                this.f10966n = null;
                if (this.f10955c != null) {
                    this.f10955c.m10579a("spinner_jank", Long.toString(jMo7253b2));
                }
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m11712h() {
        if (this.f10958f == null) {
            return;
        }
        if (TextUtils.isEmpty(this.f10965m)) {
            m11703a("no_src", new String[0]);
        } else {
            this.f10958f.setVideoPath(this.f10965m);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m11713i() {
        if (this.f10958f == null) {
            return;
        }
        this.f10958f.mo11685d();
    }

    /* JADX INFO: renamed from: j */
    public final void m11714j() {
        if (this.f10958f == null) {
            return;
        }
        this.f10958f.mo11684c();
    }

    /* JADX INFO: renamed from: k */
    public final void m11715k() {
        if (this.f10958f == null) {
            return;
        }
        AbstractC1724lo abstractC1724lo = this.f10958f;
        abstractC1724lo.f10952b.m11775a(true);
        abstractC1724lo.mo11686e();
    }

    /* JADX INFO: renamed from: l */
    public final void m11716l() {
        if (this.f10958f == null) {
            return;
        }
        AbstractC1724lo abstractC1724lo = this.f10958f;
        abstractC1724lo.f10952b.m11775a(false);
        abstractC1724lo.mo11686e();
    }

    @TargetApi(14)
    /* JADX INFO: renamed from: m */
    public final void m11717m() {
        if (this.f10958f == null) {
            return;
        }
        TextView textView = new TextView(this.f10958f.getContext());
        String strValueOf = String.valueOf(this.f10958f.mo11679a());
        textView.setText(strValueOf.length() != 0 ? "AdMob - ".concat(strValueOf) : new String("AdMob - "));
        textView.setTextColor(-65536);
        textView.setBackgroundColor(-256);
        this.f10954b.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
        this.f10954b.bringChildToFront(textView);
    }

    /* JADX INFO: renamed from: n */
    public final void m11718n() {
        this.f10956d.m11770a();
        if (this.f10958f != null) {
            this.f10958f.mo11683b();
        }
        m11705q();
    }

    /* JADX INFO: renamed from: o */
    final void m11719o() {
        if (this.f10958f == null) {
            return;
        }
        long currentPosition = this.f10958f.getCurrentPosition();
        if (this.f10963k == currentPosition || currentPosition <= 0) {
            return;
        }
        m11703a("timeupdate", "time", String.valueOf(currentPosition / 1000.0f));
        this.f10963k = currentPosition;
    }
}
