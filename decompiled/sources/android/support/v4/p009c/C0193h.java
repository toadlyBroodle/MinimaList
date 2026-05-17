package android.support.v4.p009c;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/* JADX INFO: renamed from: android.support.v4.c.h */
/* JADX INFO: loaded from: classes.dex */
public class C0193h {
    /* JADX INFO: renamed from: a */
    public static File m1452a(Context context) {
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= 100) {
                return null;
            }
            File file = new File(context.getCacheDir(), str + i2);
            if (file.createNewFile()) {
                return file;
            }
            i = i2 + 1;
        }
    }

    /* JADX INFO: renamed from: a */
    public static ByteBuffer m1453a(Context context, Resources resources, int i) {
        ByteBuffer byteBufferM1455a = null;
        File fileM1452a = m1452a(context);
        if (fileM1452a != null) {
            try {
                if (m1457a(fileM1452a, resources, i)) {
                    byteBufferM1455a = m1455a(fileM1452a);
                }
            } finally {
                fileM1452a.delete();
            }
        }
        return byteBufferM1455a;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[Catch: IOException -> 0x0048, SYNTHETIC, TRY_ENTER, TRY_LEAVE, TryCatch #2 {IOException -> 0x0048, blocks: (B:3:0x0005, B:13:0x0031, B:34:0x0057, B:33:0x0053, B:24:0x0044, B:50:0x0077, B:49:0x0073, B:25:0x0047), top: B:55:0x0005, inners: #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[Catch: Throwable -> 0x003a, all -> 0x004f, SYNTHETIC, TRY_ENTER, TryCatch #1 {Throwable -> 0x003a, blocks: (B:5:0x000c, B:28:0x004b, B:16:0x0036, B:46:0x006e, B:45:0x006a, B:43:0x0068), top: B:54:0x000c }] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ByteBuffer m1454a(Context context, CancellationSignal cancellationSignal, Uri uri) throws Throwable {
        Throwable th;
        Throwable th2;
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", cancellationSignal);
            Throwable th3 = null;
            try {
                try {
                    FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                    Throwable th4 = null;
                    try {
                        FileChannel channel = fileInputStream.getChannel();
                        MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                        if (fileInputStream != null) {
                            if (0 != 0) {
                                try {
                                    fileInputStream.close();
                                } catch (Throwable th5) {
                                    th4.addSuppressed(th5);
                                }
                            } else {
                                fileInputStream.close();
                            }
                        }
                        if (parcelFileDescriptorOpenFileDescriptor == null) {
                            return map;
                        }
                        if (0 == 0) {
                            parcelFileDescriptorOpenFileDescriptor.close();
                            return map;
                        }
                        try {
                            parcelFileDescriptorOpenFileDescriptor.close();
                            return map;
                        } catch (Throwable th6) {
                            th3.addSuppressed(th6);
                            return map;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        th2 = null;
                        if (fileInputStream != null) {
                        }
                    }
                } catch (Throwable th8) {
                    try {
                        throw th8;
                    } catch (Throwable th9) {
                        th = th8;
                        th = th9;
                        if (parcelFileDescriptorOpenFileDescriptor != null) {
                            throw th;
                        }
                        if (th == null) {
                            parcelFileDescriptorOpenFileDescriptor.close();
                            throw th;
                        }
                        try {
                            parcelFileDescriptorOpenFileDescriptor.close();
                            throw th;
                        } catch (Throwable th10) {
                            th.addSuppressed(th10);
                            throw th;
                        }
                    }
                }
            } catch (Throwable th11) {
                th = th11;
                th = null;
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                }
            }
        } catch (IOException e) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[Catch: IOException -> 0x0024, SYNTHETIC, TRY_ENTER, TryCatch #3 {IOException -> 0x0024, blocks: (B:3:0x0001, B:8:0x001b, B:14:0x0027, B:11:0x0020, B:22:0x0035, B:26:0x003e, B:25:0x003a, B:23:0x0038), top: B:32:0x0001, inners: #2, #5 }] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static ByteBuffer m1455a(File file) throws Throwable {
        Throwable th;
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            Throwable th2 = null;
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                if (fileInputStream == null) {
                    return map;
                }
                if (0 == 0) {
                    fileInputStream.close();
                    return map;
                }
                try {
                    fileInputStream.close();
                    return map;
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                    return map;
                }
            } catch (Throwable th4) {
                th = th4;
                th = null;
                if (fileInputStream != null) {
                }
            }
        } catch (IOException e) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m1456a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m1457a(File file, Resources resources, int i) {
        InputStream inputStreamOpenRawResource = null;
        try {
            inputStreamOpenRawResource = resources.openRawResource(i);
            return m1458a(file, inputStreamOpenRawResource);
        } finally {
            m1456a(inputStreamOpenRawResource);
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m1458a(File file, InputStream inputStream) throws Throwable {
        FileOutputStream fileOutputStream;
        try {
            fileOutputStream = new FileOutputStream(file, false);
            try {
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = inputStream.read(bArr);
                        if (i == -1) {
                            m1456a(fileOutputStream);
                            return true;
                        }
                        fileOutputStream.write(bArr, 0, i);
                    }
                } catch (IOException e) {
                    e = e;
                    Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
                    m1456a(fileOutputStream);
                    return false;
                }
            } catch (Throwable th) {
                th = th;
                m1456a(fileOutputStream);
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            fileOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = null;
            m1456a(fileOutputStream);
            throw th;
        }
    }
}
