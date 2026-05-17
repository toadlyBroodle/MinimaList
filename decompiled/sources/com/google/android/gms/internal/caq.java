package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C0710au;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class caq {

    /* JADX INFO: renamed from: a */
    private BlockingQueue<cba> f9681a;

    /* JADX INFO: renamed from: b */
    private ExecutorService f9682b;

    /* JADX INFO: renamed from: e */
    private String f9685e;

    /* JADX INFO: renamed from: f */
    private Context f9686f;

    /* JADX INFO: renamed from: g */
    private String f9687g;

    /* JADX INFO: renamed from: i */
    private File f9689i;

    /* JADX INFO: renamed from: c */
    private LinkedHashMap<String, String> f9683c = new LinkedHashMap<>();

    /* JADX INFO: renamed from: d */
    private Map<String, cau> f9684d = new HashMap();

    /* JADX INFO: renamed from: h */
    private AtomicBoolean f9688h = new AtomicBoolean(false);

    public caq(Context context, String str, String str2, Map<String, String> map) {
        File externalStorageDirectory;
        this.f9686f = context;
        this.f9687g = str;
        this.f9685e = str2;
        this.f9688h.set(((Boolean) bxm.m10409f().m10546a(can.f9410J)).booleanValue());
        if (this.f9688h.get() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
            this.f9689i = new File(externalStorageDirectory, "sdk_csi_data.txt");
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            this.f9683c.put(entry.getKey(), entry.getValue());
        }
        this.f9681a = new ArrayBlockingQueue(30);
        this.f9682b = Executors.newSingleThreadExecutor();
        this.f9682b.execute(new car(this));
        this.f9684d.put("action", cau.f9692b);
        this.f9684d.put("ad_format", cau.f9692b);
        this.f9684d.put("e", cau.f9693c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m10557a() throws Throwable {
        FileOutputStream fileOutputStream;
        while (true) {
            try {
                cba cbaVarTake = this.f9681a.take();
                String strM10582b = cbaVarTake.m10582b();
                if (!TextUtils.isEmpty(strM10582b)) {
                    Map<String, String> mapM10560a = m10560a(this.f9683c, cbaVarTake.m10583c());
                    Uri.Builder builderBuildUpon = Uri.parse(this.f9685e).buildUpon();
                    for (Map.Entry<String, String> entry : mapM10560a.entrySet()) {
                        builderBuildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
                    }
                    StringBuilder sb = new StringBuilder(builderBuildUpon.build().toString());
                    sb.append("&it=").append(strM10582b);
                    String string = sb.toString();
                    if (this.f9688h.get()) {
                        File file = this.f9689i;
                        if (file != null) {
                            try {
                                fileOutputStream = new FileOutputStream(file, true);
                                try {
                                    try {
                                        fileOutputStream.write(string.getBytes());
                                        fileOutputStream.write(10);
                                        try {
                                            fileOutputStream.close();
                                        } catch (IOException e) {
                                            C1560fm.m11613c("CsiReporter: Cannot close file: sdk_csi_data.txt.", e);
                                        }
                                    } catch (IOException e2) {
                                        e = e2;
                                        C1560fm.m11613c("CsiReporter: Cannot write to file: sdk_csi_data.txt.", e);
                                        if (fileOutputStream != null) {
                                            try {
                                                fileOutputStream.close();
                                            } catch (IOException e3) {
                                                C1560fm.m11613c("CsiReporter: Cannot close file: sdk_csi_data.txt.", e3);
                                            }
                                        }
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    if (fileOutputStream != null) {
                                        try {
                                            fileOutputStream.close();
                                        } catch (IOException e4) {
                                            C1560fm.m11613c("CsiReporter: Cannot close file: sdk_csi_data.txt.", e4);
                                        }
                                    }
                                    throw th;
                                }
                            } catch (IOException e5) {
                                e = e5;
                                fileOutputStream = null;
                            } catch (Throwable th2) {
                                th = th2;
                                fileOutputStream = null;
                            }
                        } else {
                            C1560fm.m11615e("CsiReporter: File doesn't exists. Cannot write CSI data to file.");
                        }
                    } else {
                        C0710au.m5569e();
                        C1596gv.m11411b(this.f9686f, this.f9687g, string);
                    }
                }
            } catch (InterruptedException e6) {
                C1560fm.m11613c("CsiReporter:reporter interrupted", e6);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final cau m10559a(String str) {
        cau cauVar = this.f9684d.get(str);
        return cauVar != null ? cauVar : cau.f9691a;
    }

    /* JADX INFO: renamed from: a */
    final Map<String, String> m10560a(Map<String, String> map, Map<String, String> map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        if (map2 == null) {
            return linkedHashMap;
        }
        for (Map.Entry<String, String> entry : map2.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            linkedHashMap.put(key, m10559a(key).mo10566a((String) linkedHashMap.get(key), value));
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: a */
    public final void m10561a(List<String> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        this.f9683c.put("e", TextUtils.join(",", list));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m10562a(cba cbaVar) {
        return this.f9681a.offer(cbaVar);
    }
}
