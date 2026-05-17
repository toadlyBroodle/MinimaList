package ca.toadlybroodledev.sublist.p032c;

import com.google.firebase.database.InterfaceC2270h;

/* JADX INFO: renamed from: ca.toadlybroodledev.sublist.c.c */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC2270h
public class C0556c {
    public int completed;
    public String displayname;
    public String email;
    public long firstConnectTime;
    public long initInstallTime;
    public int invites;
    public long lastConnectTime;
    public int trialHoursRemaining;
    public int uploads;

    public C0556c() {
    }

    public C0556c(String str, String str2, int i, int i2, int i3, long j, long j2, long j3, int i4) {
        this.displayname = str;
        this.email = str2;
        this.completed = i;
        this.invites = i2;
        this.uploads = i3;
        this.initInstallTime = j;
        this.firstConnectTime = j2;
        this.lastConnectTime = j3;
        this.trialHoursRemaining = i4;
    }
}
