package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.C0710au;
import com.google.android.gms.common.util.InterfaceC1300d;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.internal.mu */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C1757mu extends AbstractC1751mo {

    /* JADX INFO: renamed from: b */
    private static final Set<String> f11075b = Collections.synchronizedSet(new HashSet());

    /* JADX INFO: renamed from: c */
    private static final DecimalFormat f11076c = new DecimalFormat("#,###");

    /* JADX INFO: renamed from: d */
    private File f11077d;

    /* JADX INFO: renamed from: e */
    private boolean f11078e;

    public C1757mu(InterfaceC1739mc interfaceC1739mc) {
        super(interfaceC1739mc);
        File cacheDir = this.f11056a.getCacheDir();
        if (cacheDir == null) {
            C1560fm.m11615e("Context.getCacheDir() returned null");
            return;
        }
        this.f11077d = new File(cacheDir, "admobVideoStreams");
        if (!this.f11077d.isDirectory() && !this.f11077d.mkdirs()) {
            String strValueOf = String.valueOf(this.f11077d.getAbsolutePath());
            C1560fm.m11615e(strValueOf.length() != 0 ? "Could not create preload cache directory at ".concat(strValueOf) : new String("Could not create preload cache directory at "));
            this.f11077d = null;
        } else {
            if (this.f11077d.setReadable(true, false) && this.f11077d.setExecutable(true, false)) {
                return;
            }
            String strValueOf2 = String.valueOf(this.f11077d.getAbsolutePath());
            C1560fm.m11615e(strValueOf2.length() != 0 ? "Could not set cache file permissions at ".concat(strValueOf2) : new String("Could not set cache file permissions at "));
            this.f11077d = null;
        }
    }

    /* JADX INFO: renamed from: a */
    private final File m11796a(File file) {
        return new File(this.f11077d, String.valueOf(file.getName()).concat(".done"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:156:0x0452, code lost:
    
        r12.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x045a, code lost:
    
        if (com.google.android.gms.internal.C1560fm.m11609a(3) == false) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x045c, code lost:
    
        r2 = com.google.android.gms.internal.C1757mu.f11076c.format(r6);
        com.google.android.gms.internal.C1560fm.m11610b(new java.lang.StringBuilder((java.lang.String.valueOf(r2).length() + 22) + java.lang.String.valueOf(r28).length()).append("Preloaded ").append(r2).append(" bytes from ").append(r28).toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0498, code lost:
    
        r13.setReadable(true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x04a1, code lost:
    
        if (r14.isFile() == false) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x04a3, code lost:
    
        r14.setLastModified(java.lang.System.currentTimeMillis());
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x04bd, code lost:
    
        r14.createNewFile();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0507  */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v41 */
    /* JADX WARN: Type inference failed for: r3v42, types: [com.google.android.gms.internal.mo] */
    /* JADX WARN: Type inference failed for: r3v51 */
    /* JADX WARN: Type inference failed for: r3v52 */
    /* JADX WARN: Type inference failed for: r3v56 */
    /* JADX WARN: Type inference failed for: r3v64 */
    /* JADX WARN: Type inference failed for: r3v65 */
    /* JADX WARN: Type inference failed for: r4v17, types: [long] */
    /* JADX WARN: Type inference failed for: r4v21, types: [java.lang.String] */
    @Override // com.google.android.gms.internal.AbstractC1751mo
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo11793a(String str) {
        int i;
        File file;
        String strConcat;
        cal calVarM10409f;
        String str2;
        int i2;
        int responseCode;
        boolean zDelete;
        long jLastModified;
        File file2;
        if (this.f11077d == null) {
            m11792a(str, null, "noCacheDir", null);
            return false;
        }
        do {
            if (this.f11077d == null) {
                i = 0;
            } else {
                int i3 = 0;
                for (File file3 : this.f11077d.listFiles()) {
                    if (!file3.getName().endsWith(".done")) {
                        i3++;
                    }
                }
                i = i3;
            }
            if (i <= ((Integer) bxm.m10409f().m10546a(can.f9658j)).intValue()) {
                bxm.m10404a();
                file = new File(this.f11077d, C1657jb.m11563a(str));
                File fileM11796a = m11796a(file);
                if (file.isFile() && fileM11796a.isFile()) {
                    int length = (int) file.length();
                    String strValueOf = String.valueOf(str);
                    C1560fm.m11610b(strValueOf.length() != 0 ? "Stream cache hit at ".concat(strValueOf) : new String("Stream cache hit at "));
                    m11791a(str, file.getAbsolutePath(), length);
                    return true;
                }
                String strValueOf2 = String.valueOf(this.f11077d.getAbsolutePath());
                String strValueOf3 = String.valueOf(str);
                strConcat = strValueOf3.length() != 0 ? strValueOf2.concat(strValueOf3) : new String(strValueOf2);
                synchronized (f11075b) {
                    if (f11075b.contains(strConcat)) {
                        String strValueOf4 = String.valueOf(str);
                        C1560fm.m11615e(strValueOf4.length() != 0 ? "Stream cache already in progress at ".concat(strValueOf4) : new String("Stream cache already in progress at "));
                        m11792a(str, file.getAbsolutePath(), "inProgress", null);
                        return false;
                    }
                    f11075b.add(strConcat);
                    FileOutputStream fileOutputStream = null;
                    try {
                        C0710au.m5580p();
                        HttpURLConnection httpURLConnectionM11658a = C1701ks.m11658a(str, ((Integer) bxm.m10409f().m10546a(can.f9663o)).intValue());
                        if (!(httpURLConnectionM11658a instanceof HttpURLConnection) || (responseCode = httpURLConnectionM11658a.getResponseCode()) < 400) {
                            int contentLength = httpURLConnectionM11658a.getContentLength();
                            if (contentLength < 0) {
                                String strValueOf5 = String.valueOf(str);
                                C1560fm.m11615e(strValueOf5.length() != 0 ? "Stream cache aborted, missing content-length header at ".concat(strValueOf5) : new String("Stream cache aborted, missing content-length header at "));
                                m11792a(str, file.getAbsolutePath(), "contentLengthMissing", null);
                                f11075b.remove(strConcat);
                                return false;
                            }
                            String str3 = f11076c.format(contentLength);
                            int iIntValue = ((Integer) bxm.m10409f().m10546a(can.f9659k)).intValue();
                            if (contentLength > iIntValue) {
                                C1560fm.m11615e(new StringBuilder(String.valueOf(str3).length() + 33 + String.valueOf(str).length()).append("Content length ").append(str3).append(" exceeds limit at ").append(str).toString());
                                String strValueOf6 = String.valueOf(str3);
                                m11792a(str, file.getAbsolutePath(), "sizeExceeded", strValueOf6.length() != 0 ? "File too big for full file cache. Size: ".concat(strValueOf6) : new String("File too big for full file cache. Size: "));
                                f11075b.remove(strConcat);
                                return false;
                            }
                            StringBuilder sbAppend = new StringBuilder(String.valueOf(str3).length() + 20 + String.valueOf(str).length()).append("Caching ").append(str3);
                            str2 = " bytes from ";
                            C1560fm.m11610b(sbAppend.append(" bytes from ").append(str).toString());
                            ReadableByteChannel readableByteChannelNewChannel = Channels.newChannel(httpURLConnectionM11658a.getInputStream());
                            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                            try {
                                try {
                                    FileChannel channel = fileOutputStream2.getChannel();
                                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(1048576);
                                    InterfaceC1300d interfaceC1300dM5575k = C0710au.m5575k();
                                    i2 = 0;
                                    long jMo7252a = interfaceC1300dM5575k.mo7252a();
                                    C1647is c1647is = new C1647is(((Long) bxm.m10409f().m10546a(can.f9662n)).longValue());
                                    cac<Long> cacVar = can.f9661m;
                                    calVarM10409f = bxm.m10409f();
                                    long jLongValue = ((Long) calVarM10409f.m10546a(cacVar)).longValue();
                                    while (true) {
                                        int i4 = readableByteChannelNewChannel.read(byteBufferAllocate);
                                        if (i4 < 0) {
                                            break;
                                        }
                                        i2 += i4;
                                        try {
                                            try {
                                                if (i2 > iIntValue) {
                                                    String strValueOf7 = String.valueOf(Integer.toString(i2));
                                                    if (strValueOf7.length() != 0) {
                                                        "File too big for full file cache. Size: ".concat(strValueOf7);
                                                    } else {
                                                        new String("File too big for full file cache. Size: ");
                                                    }
                                                    throw new IOException("stream cache file size limit exceeded");
                                                }
                                                byteBufferAllocate.flip();
                                                while (channel.write(byteBufferAllocate) > 0) {
                                                }
                                                byteBufferAllocate.clear();
                                                str2 = 1000 * jLongValue;
                                                if (interfaceC1300dM5575k.mo7252a() - jMo7252a > str2) {
                                                    String string = Long.toString(jLongValue);
                                                    new StringBuilder(String.valueOf(string).length() + 29).append("Timeout exceeded. Limit: ").append(string).append(" sec").toString();
                                                    throw new IOException("stream cache time limit exceeded");
                                                }
                                                if (this.f11078e) {
                                                    throw new IOException("abort requested");
                                                }
                                                if (c1647is.m11540a()) {
                                                    calVarM10409f = this;
                                                    str2 = str;
                                                    C1657jb.f10832a.post(new RunnableC1752mp(calVarM10409f, str2, file.getAbsolutePath(), i2, contentLength, false));
                                                }
                                            } catch (IOException e) {
                                                e = e;
                                                fileOutputStream = fileOutputStream2;
                                            } catch (RuntimeException e2) {
                                                e = e2;
                                                fileOutputStream = fileOutputStream2;
                                            }
                                        } catch (IOException e3) {
                                            e = e3;
                                            calVarM10409f = 0;
                                            fileOutputStream = fileOutputStream2;
                                        } catch (RuntimeException e4) {
                                            e = e4;
                                            calVarM10409f = 0;
                                            fileOutputStream = fileOutputStream2;
                                        }
                                    }
                                } catch (IOException e5) {
                                    e = e5;
                                    calVarM10409f = 0;
                                    str2 = "error";
                                    fileOutputStream = fileOutputStream2;
                                }
                            } catch (RuntimeException e6) {
                                e = e6;
                                calVarM10409f = 0;
                                str2 = "error";
                                fileOutputStream = fileOutputStream2;
                            }
                        } else {
                            str2 = "badUrl";
                            try {
                                String strValueOf8 = String.valueOf(Integer.toString(responseCode));
                                calVarM10409f = strValueOf8.length() != 0 ? "HTTP request failed. Code: ".concat(strValueOf8) : new String("HTTP request failed. Code: ");
                                try {
                                    throw new IOException(new StringBuilder(String.valueOf(str).length() + 32).append("HTTP status code ").append(responseCode).append(" at ").append(str).toString());
                                } catch (IOException e7) {
                                    e = e7;
                                } catch (RuntimeException e8) {
                                    e = e8;
                                }
                            } catch (IOException e9) {
                                e = e9;
                                calVarM10409f = 0;
                            } catch (RuntimeException e10) {
                                e = e10;
                                calVarM10409f = 0;
                            }
                        }
                    } catch (IOException e11) {
                        e = e11;
                        calVarM10409f = 0;
                        str2 = "error";
                    } catch (RuntimeException e12) {
                        e = e12;
                        calVarM10409f = 0;
                        str2 = "error";
                    }
                    if (e instanceof RuntimeException) {
                        C0710au.m5573i().m11292a(e, "VideoStreamFullFileCache.preload");
                    }
                    try {
                        fileOutputStream.close();
                    } catch (IOException e13) {
                    } catch (NullPointerException e14) {
                    }
                    if (this.f11078e) {
                        C1560fm.m11614d(new StringBuilder(String.valueOf(str).length() + 26).append("Preload aborted for URL \"").append(str).append("\"").toString());
                    } else {
                        C1560fm.m11613c(new StringBuilder(String.valueOf(str).length() + 25).append("Preload failed for URL \"").append(str).append("\"").toString(), e);
                    }
                    if (file.exists() && !file.delete()) {
                        String strValueOf9 = String.valueOf(file.getAbsolutePath());
                        C1560fm.m11615e(strValueOf9.length() != 0 ? "Could not delete partial cache file at ".concat(strValueOf9) : new String("Could not delete partial cache file at "));
                    }
                    m11792a(str, file.getAbsolutePath(), str2, calVarM10409f);
                    f11075b.remove(strConcat);
                    return false;
                }
            }
            if (this.f11077d == null) {
                zDelete = false;
            } else {
                File file4 = null;
                long j = Long.MAX_VALUE;
                File[] fileArrListFiles = this.f11077d.listFiles();
                int length2 = fileArrListFiles.length;
                int i5 = 0;
                while (i5 < length2) {
                    File file5 = fileArrListFiles[i5];
                    if (!file5.getName().endsWith(".done")) {
                        jLastModified = file5.lastModified();
                        if (jLastModified < j) {
                            file2 = file5;
                        } else {
                            jLastModified = j;
                            file2 = file4;
                        }
                    }
                    i5++;
                    file4 = file2;
                    j = jLastModified;
                }
                zDelete = false;
                if (file4 != null) {
                    zDelete = file4.delete();
                    File fileM11796a2 = m11796a(file4);
                    if (fileM11796a2.isFile()) {
                        zDelete &= fileM11796a2.delete();
                    }
                }
            }
        } while (zDelete);
        C1560fm.m11615e("Unable to expire stream cache");
        m11792a(str, null, "expireFailed", null);
        return false;
        m11791a(str, file.getAbsolutePath(), i2);
        f11075b.remove(strConcat);
        return true;
    }

    @Override // com.google.android.gms.internal.AbstractC1751mo
    /* JADX INFO: renamed from: b */
    public final void mo11794b() {
        this.f11078e = true;
    }
}
