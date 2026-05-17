package com.google.android.gms.ads.internal;

import android.os.AsyncTask;
import com.google.android.gms.internal.C1560fm;
import com.google.android.gms.internal.afk;
import com.google.android.gms.internal.bxm;
import com.google.android.gms.internal.can;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.as */
/* JADX INFO: loaded from: classes.dex */
final class AsyncTaskC0708as extends AsyncTask<Void, Void, String> {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ BinderC0704ao f4462a;

    private AsyncTaskC0708as(BinderC0704ao binderC0704ao) {
        this.f4462a = binderC0704ao;
    }

    /* synthetic */ AsyncTaskC0708as(BinderC0704ao binderC0704ao, C0705ap c0705ap) {
        this(binderC0704ao);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String doInBackground(Void... voidArr) {
        try {
            this.f4462a.f4457h = (afk) this.f4462a.f4452c.get(((Long) bxm.m10409f().m10546a(can.f9569cj)).longValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e = e;
            C1560fm.m11613c("Failed to load ad data", e);
        } catch (ExecutionException e2) {
            e = e2;
            C1560fm.m11613c("Failed to load ad data", e);
        } catch (TimeoutException e3) {
            C1560fm.m11615e("Timed out waiting for ad data");
        }
        return this.f4462a.m5552c();
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(String str) {
        String str2 = str;
        if (this.f4462a.f4455f == null || str2 == null) {
            return;
        }
        this.f4462a.f4455f.loadUrl(str2);
    }
}
