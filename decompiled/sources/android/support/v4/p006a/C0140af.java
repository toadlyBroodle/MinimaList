package android.support.v4.p006a;

import android.app.RemoteInput;
import android.os.Bundle;
import android.support.v4.p006a.C0141ag;
import java.util.Set;

/* JADX INFO: renamed from: android.support.v4.a.af */
/* JADX INFO: loaded from: classes.dex */
public final class C0140af extends C0141ag.a {

    /* JADX INFO: renamed from: a */
    private final String f736a;

    /* JADX INFO: renamed from: b */
    private final CharSequence f737b;

    /* JADX INFO: renamed from: c */
    private final CharSequence[] f738c;

    /* JADX INFO: renamed from: d */
    private final boolean f739d;

    /* JADX INFO: renamed from: e */
    private final Bundle f740e;

    /* JADX INFO: renamed from: f */
    private final Set<String> f741f;

    /* JADX INFO: renamed from: a */
    static RemoteInput m807a(C0140af c0140af) {
        return new RemoteInput.Builder(c0140af.m809a()).setLabel(c0140af.m810b()).setChoices(c0140af.m811c()).setAllowFreeFormInput(c0140af.m813e()).addExtras(c0140af.m814f()).build();
    }

    /* JADX INFO: renamed from: a */
    static RemoteInput[] m808a(C0140af[] c0140afArr) {
        if (c0140afArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[c0140afArr.length];
        for (int i = 0; i < c0140afArr.length; i++) {
            remoteInputArr[i] = m807a(c0140afArr[i]);
        }
        return remoteInputArr;
    }

    /* JADX INFO: renamed from: a */
    public String m809a() {
        return this.f736a;
    }

    /* JADX INFO: renamed from: b */
    public CharSequence m810b() {
        return this.f737b;
    }

    /* JADX INFO: renamed from: c */
    public CharSequence[] m811c() {
        return this.f738c;
    }

    /* JADX INFO: renamed from: d */
    public Set<String> m812d() {
        return this.f741f;
    }

    /* JADX INFO: renamed from: e */
    public boolean m813e() {
        return this.f739d;
    }

    /* JADX INFO: renamed from: f */
    public Bundle m814f() {
        return this.f740e;
    }
}
