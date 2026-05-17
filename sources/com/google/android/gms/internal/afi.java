package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class afi extends afh {

    /* JADX INFO: renamed from: r */
    private static Object f6638r = new Object();

    /* JADX INFO: renamed from: s */
    private static final String f6639s = afi.class.getSimpleName();

    /* JADX INFO: renamed from: t */
    private static volatile arz f6640t = null;

    /* JADX INFO: renamed from: u */
    private static boolean f6641u = false;

    /* JADX INFO: renamed from: v */
    private static long f6642v = 0;

    /* JADX INFO: renamed from: q */
    protected boolean f6643q;

    /* JADX INFO: renamed from: w */
    private String f6644w;

    /* JADX INFO: renamed from: x */
    private boolean f6645x;

    /* JADX INFO: renamed from: y */
    private boolean f6646y;

    /* JADX INFO: renamed from: z */
    private avs f6647z;

    protected afi(Context context, String str, boolean z) {
        super(context);
        this.f6643q = false;
        this.f6645x = false;
        this.f6646y = false;
        this.f6644w = str;
        this.f6643q = z;
    }

    /* JADX INFO: renamed from: a */
    private static asp m7800a(arz arzVar, MotionEvent motionEvent, DisplayMetrics displayMetrics) throws arw {
        Method methodM8248a = arzVar.m8248a("Qplw2pUqnSpmThNy4cjVdvqrjxx/9Z0jyK1w8BPQVMfA35eh0MC7cXEA3u5Xkcuj", "JqjJogq0azQ/rErdMQn/B0NsEhrIRbxY2b3jvD0/vE8=");
        if (methodM8248a == null || motionEvent == null) {
            throw new arw();
        }
        try {
            return new asp((String) methodM8248a.invoke(null, motionEvent, displayMetrics));
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new arw(e);
        }
    }

    /* JADX INFO: renamed from: a */
    protected static synchronized void m7801a(Context context, boolean z) {
        if (!f6641u) {
            f6642v = atq.m8323a().longValue() / 1000;
            f6640t = m7803b(context, z);
            f6641u = true;
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m7802a(List<Callable<Void>> list) {
        ExecutorService executorServiceM8253c;
        if (f6640t == null || (executorServiceM8253c = f6640t.m8253c()) == null || list.isEmpty()) {
            return;
        }
        try {
            executorServiceM8253c.invokeAll(list, ((Long) bxm.m10409f().m10546a(can.f9522bp)).longValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            Log.d(f6639s, String.format("class methods got exception: %s", atq.m8325a(e)));
        }
    }

    /* JADX INFO: renamed from: b */
    private static arz m7803b(Context context, boolean z) {
        if (f6640t == null) {
            synchronized (f6638r) {
                if (f6640t == null) {
                    arz arzVarM8235a = arz.m8235a(context, "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", z);
                    if (arzVarM8235a.m8252b()) {
                        arzVarM8235a.m8250a("VywbbfxE2QuRqZ5xcIwapO7AdSzfVaSWnmJxmUg+0adJ3QBAH5P7EgXr1uzyY+u6", "JgKAyQW0PWqOrZHk4ZNT0IJH02FdSWTXOOjBnF9RRok=", Context.class);
                        arzVarM8235a.m8250a("yzGxsS8IwfgINPYaD3TFRjRVH+0Pq4QvVGq15MBf/opCBPnlCr4QHvEcReKXEMs7", "kMEgIGkHy2R1ROJUgud//6gDu/wM35rLhA6gUKrjKq0=", Context.class);
                        arzVarM8235a.m8250a("notQcG55r2oh2A1cS/dLfKg9hawk3H86BF0iXzU7AAnhYpfHWl9mq3lZzdkAltxm", "U9ntf5BvZUTabci6TosC4bQNHZ+DOrzvRmpSy4CzkoQ=", Context.class);
                        arzVarM8235a.m8250a("2GI4cQuNT2V9TGPC/Z2McvgqRAU80qquJKbm0BMTxLR8WwMEgJwPEKdGCxKNxeUN", "1Kj5K8xXQ2YA9zbG2Rm9FzZtUD9R2drVmZXzLVF7uLA=", Context.class);
                        arzVarM8235a.m8250a("ZsnUMRH5gS7aUE0TqnSYS8JWwJCKCL7bH7XFSqbI4dWEEyg2o14AuyyBvtsnwc4D", "SFchXCfZXuuDAwXfTJDosXRUHrZZ0v26SJChYX3rL/o=", Context.class);
                        arzVarM8235a.m8250a("lMH30ZU/uP5xaOsdIj/K3/wZfVr7hnOzUHjpO1NWhTJQvW+gY38/OvCWA8Ap4ZOf", "FCjXGcebz7gnog9LMAWyd/isayIV3I84uK1cUtHZ2fI=", Context.class);
                        arzVarM8235a.m8250a("oWVj3eW9lsJMixyFq7g0kyuRqYP087mdDp4dCL3paE/7Ut3Ewp3IcEq6P10MPRyy", "siNRngHYHRLjixmg2PEX5OdKhRHe1h8DNRpJp4wC0pk=", Context.class);
                        arzVarM8235a.m8250a("yATd8qneW4MlwQIx8jIN6cfiWJ28/zOw6vW7xs0IWvNvim2a85v5X4ZiVD1KK9hX", "0wjmexcQnona3bxO7Nd7FrKMEEoBhOp7s6KivBhMQKU=", Context.class);
                        arzVarM8235a.m8250a("Qplw2pUqnSpmThNy4cjVdvqrjxx/9Z0jyK1w8BPQVMfA35eh0MC7cXEA3u5Xkcuj", "JqjJogq0azQ/rErdMQn/B0NsEhrIRbxY2b3jvD0/vE8=", MotionEvent.class, DisplayMetrics.class);
                        arzVarM8235a.m8250a("I8ATAvvv3zdNeDvmT5gQ/ekfiNEF+bBdZZ3FGipPSiGHOLI4yQdK3XpX6xFRuejz", "SRWP8PeqaQflId3WUP9WJTho9Un3bF1tLB8c7UP1Ruo=", MotionEvent.class, DisplayMetrics.class, Integer.TYPE);
                        arzVarM8235a.m8250a("HYkEKMk8dvMdQrlbFR00sh73U7jSOxxrrxd0BhHmEXYlIfEqe1EzBQsw2kucbDs8", "puD1TaAJX/qcP/8PMgKROAswM+eaSDu4sTUEXpqs2fU=", new Class[0]);
                        arzVarM8235a.m8250a("8Hx2xRqW2QZDPiXj7EKgQgzecg5taNOrZe4YkZ9zi7FcQAOy1BO0rYbAdBI9x6Pm", "nJw4XP5tQfSQ6wm+0x6UMq5j2kNiUh+TXa92gyyhaOo=", new Class[0]);
                        arzVarM8235a.m8250a("4w5pMN4cUsuXvD3CJ7PKPSwMmWPClIaNSjeM6jtHahV40Q7EiLps1VIbOcEaCSp4", "5XuSFVTSxDkE27CIZHrBIXal5K53Dv1J/UFXKGBFAXY=", new Class[0]);
                        arzVarM8235a.m8250a("igTfSDGbP3Q2KSYfnqAL0vFW/zSSX6v+f+5s7NdwuKQgo6M7dQVerLATgNETrLAr", "Wz4eX479PrQ8rGu0gkJoEYqOJ2Dr8sAHE85KoBBz7s4=", new Class[0]);
                        arzVarM8235a.m8250a("BiRNVQ0aQHyQJTXKNLbpSFJJy6+rG5ICwTiWxRhS6qdZjM6S9BBOaVfdO1b0Kd8E", "z9Ycw/7CJTzBzg6MPXNZ2oLMXcxWzT8qsF0ig0ITUxc=", new Class[0]);
                        arzVarM8235a.m8250a("2glehmg5UKxyaNPdnG06BLa5QbEzBADKVm3lYiT3+JTkguRZEzOA9BDahqC4W8ki", "wM87KVhGHShMaqkZWTxt04VnU6kJHrMxqQyksEW6glI=", new Class[0]);
                        arzVarM8235a.m8250a("DGPkHpN6F5DQjFiQDfOpLUfwAMooIPhSFT4YA2aSEj+k+u5Kt4pQoimNrK0aCsHP", "V/2NrZQU5cdFMpqYa0Q9vKRizJ0aHS7vWXQS8vp0qlI=", Context.class, Boolean.TYPE);
                        arzVarM8235a.m8250a("hoZ4RlhPWT5MX/I+m/lUD5aYJ9aPmEb2eUGLaeSBLBDs9eDpXoNNJPm6j1dXVkvA", "Z7StFiuQ59x4y88apmlBJn3lPoWOEnuqoEhP2AVUL8A=", StackTraceElement[].class);
                        arzVarM8235a.m8250a("peD/v7hHRn46N2uI0dQKpTtMr7rKDQ+Rzb4yluPWMw4TUUwj2SFV9GkdTp0kog66", "XxfDY0AzBkt4iSC5Sim2fww10jQc1evowDldz5+caY4=", View.class, DisplayMetrics.class);
                        arzVarM8235a.m8250a("cINMMi7uKicDN2DHSf1rHdgax7DU+CM2mIG3cRQw3SI0nkdhPwdVz1PCbewJpJoO", "VWQmr3p+wsDJ15H20t2tLb975qLEArv8gtHgpBQKEOE=", Context.class, Boolean.TYPE);
                        arzVarM8235a.m8250a("6qQh+8GAMu6fM86JkRzoeHiiHD67+MgHO4xhhwcbyPT7CQmAN57q8YytJQRqDjU5", "Qrc1hPZgr+QjlmQtpbdJO1QCxqr2PdTRKIIDeDNdHp8=", View.class, Activity.class);
                        arzVarM8235a.m8250a("HBbZPURZUWU/TDYIx99LmOTdgpFP2mdidp6Zk4sZdEVCGaQNYtmNlQBCP3rgXOne", "pdXBsPFh4N2rQp3r0gjTSQiWtas1GOGaKulNSciQTj0=", Long.TYPE);
                    }
                    f6640t = arzVarM8235a;
                }
            }
        }
        return f6640t;
    }

    @Override // com.google.android.gms.internal.afh
    /* JADX INFO: renamed from: a */
    protected final long mo7796a(StackTraceElement[] stackTraceElementArr) throws arw {
        Method methodM8248a = f6640t.m8248a("hoZ4RlhPWT5MX/I+m/lUD5aYJ9aPmEb2eUGLaeSBLBDs9eDpXoNNJPm6j1dXVkvA", "Z7StFiuQ59x4y88apmlBJn3lPoWOEnuqoEhP2AVUL8A=");
        if (methodM8248a == null || stackTraceElementArr == null) {
            throw new arw();
        }
        try {
            return new arx((String) methodM8248a.invoke(null, stackTraceElementArr)).f7172a.longValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new arw(e);
        }
    }

    @Override // com.google.android.gms.internal.afh
    /* JADX INFO: renamed from: a */
    protected final C1937tl mo7797a(Context context, View view, Activity activity) {
        List listAsList;
        C1937tl c1937tl = new C1937tl();
        if (!TextUtils.isEmpty(this.f6644w)) {
            c1937tl.f11584b = this.f6644w;
        }
        arz arzVarM7803b = m7803b(context, this.f6643q);
        if (arzVarM7803b.m8252b()) {
            try {
                asp aspVarM7800a = m7800a(arzVarM7803b, this.f6619a, this.f6634p);
                c1937tl.f11589g = aspVarM7800a.f7208a;
                c1937tl.f11590h = aspVarM7800a.f7209b;
                c1937tl.f11591i = aspVarM7800a.f7210c;
                if (this.f6633o) {
                    c1937tl.f11603u = aspVarM7800a.f7211d;
                    c1937tl.f11604v = aspVarM7800a.f7212e;
                }
            } catch (arw e) {
            }
            C1958uf c1958uf = new C1958uf();
            if (this.f6621c > 0 && atq.m8326a(this.f6634p)) {
                int iIntValue = ((Integer) bxm.m10409f().m10546a(can.f9527bu)).intValue();
                c1958uf.f11651m = Long.valueOf(atq.m8321a(this.f6628j, iIntValue, this.f6634p));
                if (((Boolean) bxm.m10409f().m10546a(can.f9528bv)).booleanValue()) {
                    c1958uf.f11652n = Long.valueOf(atq.m8321a(this.f6631m - this.f6629k, iIntValue, this.f6634p));
                    c1958uf.f11653o = Long.valueOf(atq.m8321a(this.f6632n - this.f6630l, iIntValue, this.f6634p));
                    c1958uf.f11656r = Long.valueOf(atq.m8321a(this.f6629k, iIntValue, this.f6634p));
                    c1958uf.f11657s = Long.valueOf(atq.m8321a(this.f6630l, iIntValue, this.f6634p));
                }
                if (((Boolean) bxm.m10409f().m10546a(can.f9529bw)).booleanValue() && this.f6633o && this.f6619a != null) {
                    long jM8321a = atq.m8321a(((this.f6629k - this.f6631m) + this.f6619a.getRawX()) - this.f6619a.getX(), iIntValue, this.f6634p);
                    if (jM8321a != 0) {
                        c1958uf.f11654p = Long.valueOf(jM8321a);
                    }
                    long jM8321a2 = atq.m8321a(((this.f6630l - this.f6632n) + this.f6619a.getRawY()) - this.f6619a.getY(), iIntValue, this.f6634p);
                    if (jM8321a2 != 0) {
                        c1958uf.f11655q = Long.valueOf(jM8321a2);
                    }
                }
            }
            try {
                asp aspVarMo7799b = mo7799b(this.f6619a);
                c1958uf.f11639a = aspVarMo7799b.f7208a;
                c1958uf.f11640b = aspVarMo7799b.f7209b;
                c1958uf.f11658t = aspVarMo7799b.f7219l;
                c1958uf.f11659u = aspVarMo7799b.f7220m;
                c1958uf.f11646h = aspVarMo7799b.f7210c;
                if (this.f6633o) {
                    c1958uf.f11641c = aspVarMo7799b.f7212e;
                    c1958uf.f11643e = aspVarMo7799b.f7211d;
                    c1958uf.f11645g = Integer.valueOf(aspVarMo7799b.f7213f.longValue() != 0 ? 1 : 0);
                    if (this.f6622d > 0) {
                        c1958uf.f11642d = atq.m8326a(this.f6634p) ? Long.valueOf(Math.round(this.f6627i / this.f6622d)) : null;
                        c1958uf.f11644f = Long.valueOf(Math.round(this.f6626h / this.f6622d));
                    }
                    c1958uf.f11648j = aspVarMo7799b.f7216i;
                    c1958uf.f11647i = aspVarMo7799b.f7217j;
                    c1958uf.f11649k = Integer.valueOf(aspVarMo7799b.f7218k.longValue() != 0 ? 1 : 0);
                }
            } catch (arw e2) {
            }
            if (this.f6625g > 0) {
                c1958uf.f11650l = Long.valueOf(this.f6625g);
            }
            c1937tl.f11554K = c1958uf;
            if (this.f6621c > 0) {
                c1937tl.f11607y = Long.valueOf(this.f6621c);
            }
            if (this.f6622d > 0) {
                c1937tl.f11606x = Long.valueOf(this.f6622d);
            }
            if (this.f6623e > 0) {
                c1937tl.f11605w = Long.valueOf(this.f6623e);
            }
            if (this.f6624f > 0) {
                c1937tl.f11608z = Long.valueOf(this.f6624f);
            }
            try {
                int size = this.f6620b.size() - 1;
                if (size > 0) {
                    c1937tl.f11555L = new C1958uf[size];
                    for (int i = 0; i < size; i++) {
                        asp aspVarM7800a2 = m7800a(f6640t, this.f6620b.get(i), this.f6634p);
                        C1958uf c1958uf2 = new C1958uf();
                        c1958uf2.f11639a = aspVarM7800a2.f7208a;
                        c1958uf2.f11640b = aspVarM7800a2.f7209b;
                        c1937tl.f11555L[i] = c1958uf2;
                    }
                }
            } catch (arw e3) {
                c1937tl.f11555L = null;
            }
            ArrayList arrayList = new ArrayList();
            if (arzVarM7803b.m8253c() != null) {
                int iM8264n = arzVarM7803b.m8264n();
                arrayList.add(new bfm(arzVarM7803b, c1937tl));
                arrayList.add(new big(arzVarM7803b, "4w5pMN4cUsuXvD3CJ7PKPSwMmWPClIaNSjeM6jtHahV40Q7EiLps1VIbOcEaCSp4", "5XuSFVTSxDkE27CIZHrBIXal5K53Dv1J/UFXKGBFAXY=", c1937tl, iM8264n, 1));
                arrayList.add(new bdr(arzVarM7803b, "HYkEKMk8dvMdQrlbFR00sh73U7jSOxxrrxd0BhHmEXYlIfEqe1EzBQsw2kucbDs8", "puD1TaAJX/qcP/8PMgKROAswM+eaSDu4sTUEXpqs2fU=", c1937tl, f6642v, iM8264n, 25));
                arrayList.add(new bcq(arzVarM7803b, "igTfSDGbP3Q2KSYfnqAL0vFW/zSSX6v+f+5s7NdwuKQgo6M7dQVerLATgNETrLAr", "Wz4eX479PrQ8rGu0gkJoEYqOJ2Dr8sAHE85KoBBz7s4=", c1937tl, iM8264n, 44));
                arrayList.add(new bhf(arzVarM7803b, "ZsnUMRH5gS7aUE0TqnSYS8JWwJCKCL7bH7XFSqbI4dWEEyg2o14AuyyBvtsnwc4D", "SFchXCfZXuuDAwXfTJDosXRUHrZZ0v26SJChYX3rL/o=", c1937tl, iM8264n, 12));
                arrayList.add(new bjh(arzVarM7803b, "lMH30ZU/uP5xaOsdIj/K3/wZfVr7hnOzUHjpO1NWhTJQvW+gY38/OvCWA8Ap4ZOf", "FCjXGcebz7gnog9LMAWyd/isayIV3I84uK1cUtHZ2fI=", c1937tl, iM8264n, 3));
                arrayList.add(new bgh(arzVarM7803b, "BiRNVQ0aQHyQJTXKNLbpSFJJy6+rG5ICwTiWxRhS6qdZjM6S9BBOaVfdO1b0Kd8E", "z9Ycw/7CJTzBzg6MPXNZ2oLMXcxWzT8qsF0ig0ITUxc=", c1937tl, iM8264n, 22));
                arrayList.add(new bbp(arzVarM7803b, "2GI4cQuNT2V9TGPC/Z2McvgqRAU80qquJKbm0BMTxLR8WwMEgJwPEKdGCxKNxeUN", "1Kj5K8xXQ2YA9zbG2Rm9FzZtUD9R2drVmZXzLVF7uLA=", c1937tl, iM8264n, 5));
                arrayList.add(new bnm(arzVarM7803b, "oWVj3eW9lsJMixyFq7g0kyuRqYP087mdDp4dCL3paE/7Ut3Ewp3IcEq6P10MPRyy", "siNRngHYHRLjixmg2PEX5OdKhRHe1h8DNRpJp4wC0pk=", c1937tl, iM8264n, 48));
                arrayList.add(new ayz(arzVarM7803b, "yATd8qneW4MlwQIx8jIN6cfiWJ28/zOw6vW7xs0IWvNvim2a85v5X4ZiVD1KK9hX", "0wjmexcQnona3bxO7Nd7FrKMEEoBhOp7s6KivBhMQKU=", c1937tl, iM8264n, 49));
                arrayList.add(new bnj(arzVarM7803b, "2glehmg5UKxyaNPdnG06BLa5QbEzBADKVm3lYiT3+JTkguRZEzOA9BDahqC4W8ki", "wM87KVhGHShMaqkZWTxt04VnU6kJHrMxqQyksEW6glI=", c1937tl, iM8264n, 51));
                arrayList.add(new bmk(arzVarM7803b, "hoZ4RlhPWT5MX/I+m/lUD5aYJ9aPmEb2eUGLaeSBLBDs9eDpXoNNJPm6j1dXVkvA", "Z7StFiuQ59x4y88apmlBJn3lPoWOEnuqoEhP2AVUL8A=", c1937tl, iM8264n, 45, new Throwable().getStackTrace()));
                arrayList.add(new bnn(arzVarM7803b, "peD/v7hHRn46N2uI0dQKpTtMr7rKDQ+Rzb4yluPWMw4TUUwj2SFV9GkdTp0kog66", "XxfDY0AzBkt4iSC5Sim2fww10jQc1evowDldz5+caY4=", c1937tl, iM8264n, 57, view));
                if (((Boolean) bxm.m10409f().m10546a(can.f9524br)).booleanValue()) {
                    arrayList.add(new blj(arzVarM7803b, "cINMMi7uKicDN2DHSf1rHdgax7DU+CM2mIG3cRQw3SI0nkdhPwdVz1PCbewJpJoO", "VWQmr3p+wsDJ15H20t2tLb975qLEArv8gtHgpBQKEOE=", c1937tl, iM8264n, 61));
                }
                if (((Boolean) bxm.m10409f().m10546a(can.f9525bs)).booleanValue()) {
                    arrayList.add(new ays(arzVarM7803b, "6qQh+8GAMu6fM86JkRzoeHiiHD67+MgHO4xhhwcbyPT7CQmAN57q8YytJQRqDjU5", "Qrc1hPZgr+QjlmQtpbdJO1QCxqr2PdTRKIIDeDNdHp8=", c1937tl, iM8264n, 62, view, activity));
                }
                if (((Boolean) bxm.m10409f().m10546a(can.f9526bt)).booleanValue()) {
                    arrayList.add(new bnk(arzVarM7803b, "HBbZPURZUWU/TDYIx99LmOTdgpFP2mdidp6Zk4sZdEVCGaQNYtmNlQBCP3rgXOne", "pdXBsPFh4N2rQp3r0gjTSQiWtas1GOGaKulNSciQTj0=", c1937tl, iM8264n, 53, this.f6647z));
                }
            }
            listAsList = arrayList;
        } else {
            c1937tl.f11593k = 16384L;
            listAsList = Arrays.asList(new bfm(arzVarM7803b, c1937tl));
        }
        m7802a((List<Callable<Void>>) listAsList);
        return c1937tl;
    }

    @Override // com.google.android.gms.internal.afh
    /* JADX INFO: renamed from: a */
    protected final C1937tl mo7798a(Context context, C1921sw c1921sw) {
        C1937tl c1937tl = new C1937tl();
        if (!TextUtils.isEmpty(this.f6644w)) {
            c1937tl.f11584b = this.f6644w;
        }
        arz arzVarM7803b = m7803b(context, this.f6643q);
        if (arzVarM7803b.m8253c() != null) {
            m7802a(mo7804a(arzVarM7803b, c1937tl, (C1921sw) null));
        }
        return c1937tl;
    }

    /* JADX INFO: renamed from: a */
    protected List<Callable<Void>> mo7804a(arz arzVar, C1937tl c1937tl, C1921sw c1921sw) {
        int iM8264n = arzVar.m8264n();
        ArrayList arrayList = new ArrayList();
        if (!arzVar.m8252b()) {
            c1937tl.f11593k = 16384L;
            return arrayList;
        }
        arrayList.add(new baq(arzVar, "DGPkHpN6F5DQjFiQDfOpLUfwAMooIPhSFT4YA2aSEj+k+u5Kt4pQoimNrK0aCsHP", "V/2NrZQU5cdFMpqYa0Q9vKRizJ0aHS7vWXQS8vp0qlI=", c1937tl, iM8264n, 27, c1921sw));
        arrayList.add(new bdr(arzVar, "HYkEKMk8dvMdQrlbFR00sh73U7jSOxxrrxd0BhHmEXYlIfEqe1EzBQsw2kucbDs8", "puD1TaAJX/qcP/8PMgKROAswM+eaSDu4sTUEXpqs2fU=", c1937tl, f6642v, iM8264n, 25));
        arrayList.add(new big(arzVar, "4w5pMN4cUsuXvD3CJ7PKPSwMmWPClIaNSjeM6jtHahV40Q7EiLps1VIbOcEaCSp4", "5XuSFVTSxDkE27CIZHrBIXal5K53Dv1J/UFXKGBFAXY=", c1937tl, iM8264n, 1));
        arrayList.add(new bki(arzVar, "notQcG55r2oh2A1cS/dLfKg9hawk3H86BF0iXzU7AAnhYpfHWl9mq3lZzdkAltxm", "U9ntf5BvZUTabci6TosC4bQNHZ+DOrzvRmpSy4CzkoQ=", c1937tl, iM8264n, 31));
        arrayList.add(new bnl(arzVar, "8Hx2xRqW2QZDPiXj7EKgQgzecg5taNOrZe4YkZ9zi7FcQAOy1BO0rYbAdBI9x6Pm", "nJw4XP5tQfSQ6wm+0x6UMq5j2kNiUh+TXa92gyyhaOo=", c1937tl, iM8264n, 33));
        arrayList.add(new azr(arzVar, "yzGxsS8IwfgINPYaD3TFRjRVH+0Pq4QvVGq15MBf/opCBPnlCr4QHvEcReKXEMs7", "kMEgIGkHy2R1ROJUgud//6gDu/wM35rLhA6gUKrjKq0=", c1937tl, iM8264n, 29));
        arrayList.add(new bbp(arzVar, "2GI4cQuNT2V9TGPC/Z2McvgqRAU80qquJKbm0BMTxLR8WwMEgJwPEKdGCxKNxeUN", "1Kj5K8xXQ2YA9zbG2Rm9FzZtUD9R2drVmZXzLVF7uLA=", c1937tl, iM8264n, 5));
        arrayList.add(new bhf(arzVar, "ZsnUMRH5gS7aUE0TqnSYS8JWwJCKCL7bH7XFSqbI4dWEEyg2o14AuyyBvtsnwc4D", "SFchXCfZXuuDAwXfTJDosXRUHrZZ0v26SJChYX3rL/o=", c1937tl, iM8264n, 12));
        arrayList.add(new bjh(arzVar, "lMH30ZU/uP5xaOsdIj/K3/wZfVr7hnOzUHjpO1NWhTJQvW+gY38/OvCWA8Ap4ZOf", "FCjXGcebz7gnog9LMAWyd/isayIV3I84uK1cUtHZ2fI=", c1937tl, iM8264n, 3));
        arrayList.add(new bcq(arzVar, "igTfSDGbP3Q2KSYfnqAL0vFW/zSSX6v+f+5s7NdwuKQgo6M7dQVerLATgNETrLAr", "Wz4eX479PrQ8rGu0gkJoEYqOJ2Dr8sAHE85KoBBz7s4=", c1937tl, iM8264n, 44));
        arrayList.add(new bgh(arzVar, "BiRNVQ0aQHyQJTXKNLbpSFJJy6+rG5ICwTiWxRhS6qdZjM6S9BBOaVfdO1b0Kd8E", "z9Ycw/7CJTzBzg6MPXNZ2oLMXcxWzT8qsF0ig0ITUxc=", c1937tl, iM8264n, 22));
        arrayList.add(new bnm(arzVar, "oWVj3eW9lsJMixyFq7g0kyuRqYP087mdDp4dCL3paE/7Ut3Ewp3IcEq6P10MPRyy", "siNRngHYHRLjixmg2PEX5OdKhRHe1h8DNRpJp4wC0pk=", c1937tl, iM8264n, 48));
        arrayList.add(new ayz(arzVar, "yATd8qneW4MlwQIx8jIN6cfiWJ28/zOw6vW7xs0IWvNvim2a85v5X4ZiVD1KK9hX", "0wjmexcQnona3bxO7Nd7FrKMEEoBhOp7s6KivBhMQKU=", c1937tl, iM8264n, 49));
        arrayList.add(new bnj(arzVar, "2glehmg5UKxyaNPdnG06BLa5QbEzBADKVm3lYiT3+JTkguRZEzOA9BDahqC4W8ki", "wM87KVhGHShMaqkZWTxt04VnU6kJHrMxqQyksEW6glI=", c1937tl, iM8264n, 51));
        if (((Boolean) bxm.m10409f().m10546a(can.f9524br)).booleanValue()) {
            arrayList.add(new blj(arzVar, "cINMMi7uKicDN2DHSf1rHdgax7DU+CM2mIG3cRQw3SI0nkdhPwdVz1PCbewJpJoO", "VWQmr3p+wsDJ15H20t2tLb975qLEArv8gtHgpBQKEOE=", c1937tl, iM8264n, 61));
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.afh, com.google.android.gms.internal.afg
    /* JADX INFO: renamed from: a */
    public final void mo5661a(View view) {
        if (((Boolean) bxm.m10409f().m10546a(can.f9526bt)).booleanValue()) {
            if (this.f6647z == null) {
                this.f6647z = new avs(f6640t, view);
            } else {
                this.f6647z.m8532a(view);
            }
        }
    }

    @Override // com.google.android.gms.internal.afh
    /* JADX INFO: renamed from: b */
    protected final asp mo7799b(MotionEvent motionEvent) throws arw {
        Method methodM8248a = f6640t.m8248a("I8ATAvvv3zdNeDvmT5gQ/ekfiNEF+bBdZZ3FGipPSiGHOLI4yQdK3XpX6xFRuejz", "SRWP8PeqaQflId3WUP9WJTho9Un3bF1tLB8c7UP1Ruo=");
        if (methodM8248a == null || motionEvent == null) {
            throw new arw();
        }
        try {
            return new asp((String) methodM8248a.invoke(null, motionEvent, this.f6634p, bxm.m10409f().m10546a(can.f9527bu)));
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new arw(e);
        }
    }
}
