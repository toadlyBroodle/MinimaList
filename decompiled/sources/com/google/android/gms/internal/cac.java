package com.google.android.gms.internal;

import android.content.SharedPreferences;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@cnb
public abstract class cac<T> {

    /* JADX INFO: renamed from: a */
    private final int f9383a;

    /* JADX INFO: renamed from: b */
    private final String f9384b;

    /* JADX INFO: renamed from: c */
    private final T f9385c;

    private cac(int i, String str, T t) {
        this.f9383a = i;
        this.f9384b = str;
        this.f9385c = t;
        bxm.m10408e().m10541a(this);
    }

    /* synthetic */ cac(int i, String str, Object obj, cad cadVar) {
        this(i, str, obj);
    }

    /* JADX INFO: renamed from: a */
    public static cac<String> m10525a(int i, String str) {
        cac<String> cacVarM10530a = m10530a(i, str, (String) null);
        bxm.m10408e().m10543b(cacVarM10530a);
        return cacVarM10530a;
    }

    /* JADX INFO: renamed from: a */
    public static cac<Float> m10526a(int i, String str, float f) {
        return new cah(i, str, Float.valueOf(0.0f));
    }

    /* JADX INFO: renamed from: a */
    public static cac<Integer> m10527a(int i, String str, int i2) {
        return new cae(i, str, Integer.valueOf(i2));
    }

    /* JADX INFO: renamed from: a */
    public static cac<Long> m10528a(int i, String str, long j) {
        return new cag(i, str, Long.valueOf(j));
    }

    /* JADX INFO: renamed from: a */
    public static cac<Boolean> m10529a(int i, String str, Boolean bool) {
        return new cad(i, str, bool);
    }

    /* JADX INFO: renamed from: a */
    public static cac<String> m10530a(int i, String str, String str2) {
        return new cai(i, str, str2);
    }

    /* JADX INFO: renamed from: b */
    public static cac<String> m10531b(int i, String str) {
        cac<String> cacVarM10530a = m10530a(i, str, (String) null);
        bxm.m10408e().m10544c(cacVarM10530a);
        return cacVarM10530a;
    }

    /* JADX INFO: renamed from: a */
    protected abstract T mo10532a(SharedPreferences sharedPreferences);

    /* JADX INFO: renamed from: a */
    protected abstract T mo10533a(JSONObject jSONObject);

    /* JADX INFO: renamed from: a */
    public final String m10534a() {
        return this.f9384b;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo10535a(SharedPreferences.Editor editor, T t);

    /* JADX INFO: renamed from: b */
    public final T m10536b() {
        return this.f9385c;
    }

    /* JADX INFO: renamed from: c */
    public final int m10537c() {
        return this.f9383a;
    }
}
