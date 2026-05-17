package com.google.android.gms.internal;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@cnb
public class ckf {

    /* JADX INFO: renamed from: a */
    private final InterfaceC1758mv f10246a;

    /* JADX INFO: renamed from: b */
    private final String f10247b;

    public ckf(InterfaceC1758mv interfaceC1758mv) {
        this(interfaceC1758mv, "");
    }

    public ckf(InterfaceC1758mv interfaceC1758mv, String str) {
        this.f10246a = interfaceC1758mv;
        this.f10247b = str;
    }

    /* JADX INFO: renamed from: a */
    public final void m11059a(int i, int i2, int i3, int i4) {
        try {
            this.f10246a.mo5713a("onSizeChanged", new JSONObject().put("x", i).put("y", i2).put("width", i3).put("height", i4));
        } catch (JSONException e) {
            C1560fm.m11611b("Error occured while dispatching size change.", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m11060a(int i, int i2, int i3, int i4, float f, int i5) {
        try {
            this.f10246a.mo5713a("onScreenInfoChanged", new JSONObject().put("width", i).put("height", i2).put("maxSizeWidth", i3).put("maxSizeHeight", i4).put("density", f).put("rotation", i5));
        } catch (JSONException e) {
            C1560fm.m11611b("Error occured while obtaining screen information.", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m11061a(String str) {
        try {
            this.f10246a.mo5713a("onError", new JSONObject().put("message", str).put("action", this.f10247b));
        } catch (JSONException e) {
            C1560fm.m11611b("Error occurred while dispatching error event.", e);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m11062b(int i, int i2, int i3, int i4) {
        try {
            this.f10246a.mo5713a("onDefaultPositionReceived", new JSONObject().put("x", i).put("y", i2).put("width", i3).put("height", i4));
        } catch (JSONException e) {
            C1560fm.m11611b("Error occured while dispatching default position.", e);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m11063b(String str) {
        try {
            this.f10246a.mo5713a("onReadyEventReceived", new JSONObject().put("js", str));
        } catch (JSONException e) {
            C1560fm.m11611b("Error occured while dispatching ready Event.", e);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m11064c(String str) {
        try {
            this.f10246a.mo5713a("onStateChanged", new JSONObject().put("state", str));
        } catch (JSONException e) {
            C1560fm.m11611b("Error occured while dispatching state change.", e);
        }
    }
}
