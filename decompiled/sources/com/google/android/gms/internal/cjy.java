package com.google.android.gms.internal;

import android.app.DownloadManager;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Environment;
import com.google.android.gms.ads.internal.C0710au;

/* JADX INFO: loaded from: classes.dex */
final class cjy implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ String f10218a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ String f10219b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ cjx f10220c;

    cjy(cjx cjxVar, String str, String str2) {
        this.f10220c = cjxVar;
        this.f10218a = str;
        this.f10219b = str2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        DownloadManager downloadManager = (DownloadManager) this.f10220c.f10217b.getSystemService("download");
        try {
            String str = this.f10218a;
            String str2 = this.f10219b;
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, str2);
            C0710au.m5571g().mo11468a(request);
            downloadManager.enqueue(request);
        } catch (IllegalStateException e) {
            this.f10220c.m11061a("Could not store picture.");
        }
    }
}
