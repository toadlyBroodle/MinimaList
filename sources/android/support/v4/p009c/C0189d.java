package android.support.v4.p009c;

import android.content.Context;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.support.v4.p017h.C0205b;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* JADX INFO: renamed from: android.support.v4.c.d */
/* JADX INFO: loaded from: classes.dex */
class C0189d extends C0192g {
    C0189d() {
    }

    /* JADX INFO: renamed from: a */
    private File m1434a(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String str = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(str).st_mode)) {
                return new File(str);
            }
            return null;
        } catch (ErrnoException e) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[Catch: IOException -> 0x0056, SYNTHETIC, TRY_ENTER, TRY_LEAVE, TryCatch #2 {IOException -> 0x0056, blocks: (B:6:0x000e, B:56:0x0084, B:60:0x008f, B:59:0x008b, B:20:0x003e, B:41:0x0064, B:40:0x0060, B:31:0x0052, B:63:0x0098, B:62:0x0094, B:32:0x0055), top: B:71:0x000e, inners: #0, #1, #3 }] */
    @Override // android.support.v4.p009c.C0192g, android.support.v4.p009c.C0188c.a
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Typeface mo1432a(Context context, CancellationSignal cancellationSignal, C0205b.b[] bVarArr, int i) throws Throwable {
        Throwable th;
        Throwable th2;
        if (bVarArr.length < 1) {
            return null;
        }
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(m1449a(bVarArr, i).m1497a(), "r", cancellationSignal);
            Throwable th3 = null;
            try {
                try {
                    File fileM1434a = m1434a(parcelFileDescriptorOpenFileDescriptor);
                    if (fileM1434a != null && fileM1434a.canRead()) {
                        Typeface typefaceCreateFromFile = Typeface.createFromFile(fileM1434a);
                        if (parcelFileDescriptorOpenFileDescriptor != null) {
                            if (0 != 0) {
                                try {
                                    parcelFileDescriptorOpenFileDescriptor.close();
                                } catch (Throwable th4) {
                                    th3.addSuppressed(th4);
                                }
                            } else {
                                parcelFileDescriptorOpenFileDescriptor.close();
                            }
                        }
                        return typefaceCreateFromFile;
                    }
                    FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                    Throwable th5 = null;
                    try {
                        Typeface typefaceM1448a = super.m1448a(context, fileInputStream);
                        if (fileInputStream != null) {
                            if (0 != 0) {
                                try {
                                    fileInputStream.close();
                                } catch (Throwable th6) {
                                    th5.addSuppressed(th6);
                                }
                            } else {
                                fileInputStream.close();
                            }
                        }
                        if (parcelFileDescriptorOpenFileDescriptor != null) {
                            if (0 != 0) {
                                try {
                                    parcelFileDescriptorOpenFileDescriptor.close();
                                } catch (Throwable th7) {
                                    th3.addSuppressed(th7);
                                }
                            } else {
                                parcelFileDescriptorOpenFileDescriptor.close();
                            }
                        }
                        return typefaceM1448a;
                    } catch (Throwable th8) {
                        th = th8;
                        try {
                            throw th;
                        } catch (Throwable th9) {
                            th = th9;
                            if (fileInputStream != null) {
                                if (th != null) {
                                    try {
                                        fileInputStream.close();
                                    } catch (Throwable th10) {
                                        th.addSuppressed(th10);
                                    }
                                } else {
                                    fileInputStream.close();
                                }
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th11) {
                    th2 = th11;
                    th = null;
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                    }
                }
            } catch (Throwable th12) {
                try {
                    throw th12;
                } catch (Throwable th13) {
                    th = th12;
                    th2 = th13;
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        throw th2;
                    }
                    if (th == null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                        throw th2;
                    }
                    try {
                        parcelFileDescriptorOpenFileDescriptor.close();
                        throw th2;
                    } catch (Throwable th14) {
                        th.addSuppressed(th14);
                        throw th2;
                    }
                }
            }
        } catch (IOException e) {
            return null;
        }
        return null;
    }
}
