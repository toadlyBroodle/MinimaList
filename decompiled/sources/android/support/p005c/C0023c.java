package android.support.p005c;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

/* JADX INFO: renamed from: android.support.c.c */
/* JADX INFO: loaded from: classes.dex */
final class C0023c {

    /* JADX INFO: renamed from: android.support.c.c$a */
    private static class a extends File {

        /* JADX INFO: renamed from: a */
        public long f140a;

        public a(File file, String str) {
            super(file, str);
            this.f140a = -1L;
        }
    }

    /* JADX INFO: renamed from: a */
    private static long m137a(File file) {
        long jLastModified = file.lastModified();
        return jLastModified == -1 ? jLastModified - 1 : jLastModified;
    }

    /* JADX INFO: renamed from: a */
    private static SharedPreferences m138a(Context context) {
        return context.getSharedPreferences("multidex.version", Build.VERSION.SDK_INT < 11 ? 0 : 4);
    }

    /* JADX INFO: renamed from: a */
    private static List<a> m139a(Context context, File file, File file2, String str) throws IOException {
        Log.i("MultiDex", "loading existing secondary dex files");
        String str2 = file.getName() + ".classes";
        SharedPreferences sharedPreferencesM138a = m138a(context);
        int i = sharedPreferencesM138a.getInt(str + "dex.number", 1);
        ArrayList arrayList = new ArrayList(i - 1);
        for (int i2 = 2; i2 <= i; i2++) {
            a aVar = new a(file2, str2 + i2 + ".zip");
            if (!aVar.isFile()) {
                throw new IOException("Missing extracted secondary dex file '" + aVar.getPath() + "'");
            }
            aVar.f140a = m147b(aVar);
            long j = sharedPreferencesM138a.getLong(str + "dex.crc." + i2, -1L);
            long j2 = sharedPreferencesM138a.getLong(str + "dex.time." + i2, -1L);
            long jLastModified = aVar.lastModified();
            if (j2 != jLastModified || j != aVar.f140a) {
                throw new IOException("Invalid extracted dex: " + aVar + " (key \"" + str + "\"), expected modification time: " + j2 + ", modification time: " + jLastModified + ", expected crc: " + j + ", file crc: " + aVar.f140a);
            }
            arrayList.add(aVar);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    static List<? extends File> m140a(Context context, File file, File file2, String str, boolean z) throws Throwable {
        FileLock fileLockLock;
        List<a> listM141a;
        Log.i("MultiDex", "MultiDexExtractor.load(" + file.getPath() + ", " + z + ", " + str + ")");
        long jM147b = m147b(file);
        File file3 = new File(file2, "MultiDex.lock");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        FileChannel fileChannel = null;
        FileLock fileLock = null;
        try {
            FileChannel channel = randomAccessFile.getChannel();
            try {
                Log.i("MultiDex", "Blocking on lock " + file3.getPath());
                fileLockLock = channel.lock();
            } catch (Throwable th) {
                th = th;
                fileChannel = channel;
            }
            try {
                Log.i("MultiDex", file3.getPath() + " locked");
                if (z || m146a(context, file, jM147b, str)) {
                    Log.i("MultiDex", "Detected that extraction must be performed.");
                    listM141a = m141a(file, file2);
                    m142a(context, str, m137a(file), jM147b, listM141a);
                } else {
                    try {
                        listM141a = m139a(context, file, file2, str);
                    } catch (IOException e) {
                        Log.w("MultiDex", "Failed to reload existing extracted secondary dex files, falling back to fresh extraction", e);
                        listM141a = m141a(file, file2);
                        m142a(context, str, m137a(file), jM147b, listM141a);
                    }
                }
                if (fileLockLock != null) {
                    try {
                        fileLockLock.release();
                        e = null;
                    } catch (IOException e2) {
                        e = e2;
                        Log.e("MultiDex", "Failed to release lock on " + file3.getPath());
                    }
                } else {
                    e = null;
                }
                if (channel != null) {
                    m143a(channel);
                }
                m143a(randomAccessFile);
                if (e != null) {
                    throw e;
                }
                Log.i("MultiDex", "load found " + listM141a.size() + " secondary dex files");
                return listM141a;
            } catch (Throwable th2) {
                th = th2;
                fileLock = fileLockLock;
                fileChannel = channel;
                if (fileLock != null) {
                    try {
                        fileLock.release();
                    } catch (IOException e3) {
                        Log.e("MultiDex", "Failed to release lock on " + file3.getPath());
                    }
                }
                if (fileChannel != null) {
                    m143a(fileChannel);
                }
                m143a(randomAccessFile);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: renamed from: a */
    private static List<a> m141a(File file, File file2) {
        String str = file.getName() + ".classes";
        m144a(file2, str);
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(file);
        try {
            ZipEntry entry = zipFile.getEntry("classes2.dex");
            int i = 2;
            while (entry != null) {
                a aVar = new a(file2, str + i + ".zip");
                arrayList.add(aVar);
                Log.i("MultiDex", "Extraction is needed for file " + aVar);
                boolean z = false;
                int i2 = 0;
                while (i2 < 3 && !z) {
                    int i3 = i2 + 1;
                    m145a(zipFile, entry, aVar, str);
                    try {
                        aVar.f140a = m147b(aVar);
                        z = true;
                    } catch (IOException e) {
                        Log.w("MultiDex", "Failed to read crc from " + aVar.getAbsolutePath(), e);
                        z = false;
                    }
                    Log.i("MultiDex", "Extraction " + (z ? "succeeded" : "failed") + " - length " + aVar.getAbsolutePath() + ": " + aVar.length() + " - crc: " + aVar.f140a);
                    if (!z) {
                        aVar.delete();
                        if (aVar.exists()) {
                            Log.w("MultiDex", "Failed to delete corrupted secondary dex '" + aVar.getPath() + "'");
                            i2 = i3;
                        }
                    }
                    i2 = i3;
                }
                if (!z) {
                    throw new IOException("Could not create zip file " + aVar.getAbsolutePath() + " for secondary dex (" + i + ")");
                }
                int i4 = i + 1;
                entry = zipFile.getEntry("classes" + i4 + ".dex");
                i = i4;
            }
            return arrayList;
        } finally {
            try {
                zipFile.close();
            } catch (IOException e2) {
                Log.w("MultiDex", "Failed to close resource", e2);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m142a(Context context, String str, long j, long j2, List<a> list) {
        SharedPreferences.Editor editorEdit = m138a(context).edit();
        editorEdit.putLong(str + "timestamp", j);
        editorEdit.putLong(str + "crc", j2);
        editorEdit.putInt(str + "dex.number", list.size() + 1);
        int i = 2;
        Iterator<a> it = list.iterator();
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                editorEdit.commit();
                return;
            }
            a next = it.next();
            editorEdit.putLong(str + "dex.crc." + i2, next.f140a);
            editorEdit.putLong(str + "dex.time." + i2, next.lastModified());
            i = i2 + 1;
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m143a(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
            Log.w("MultiDex", "Failed to close resource", e);
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m144a(File file, final String str) {
        File[] fileArrListFiles = file.listFiles(new FileFilter() { // from class: android.support.c.c.1
            @Override // java.io.FileFilter
            public boolean accept(File file2) {
                String name = file2.getName();
                return (name.startsWith(str) || name.equals("MultiDex.lock")) ? false : true;
            }
        });
        if (fileArrListFiles == null) {
            Log.w("MultiDex", "Failed to list secondary dex dir content (" + file.getPath() + ").");
            return;
        }
        for (File file2 : fileArrListFiles) {
            Log.i("MultiDex", "Trying to delete old file " + file2.getPath() + " of size " + file2.length());
            if (file2.delete()) {
                Log.i("MultiDex", "Deleted old file " + file2.getPath());
            } else {
                Log.w("MultiDex", "Failed to delete old file " + file2.getPath());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m145a(ZipFile zipFile, ZipEntry zipEntry, File file, String str) throws IOException {
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        File fileCreateTempFile = File.createTempFile("tmp-" + str, ".zip", file.getParentFile());
        Log.i("MultiDex", "Extracting " + fileCreateTempFile.getPath());
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(fileCreateTempFile)));
            try {
                ZipEntry zipEntry2 = new ZipEntry("classes.dex");
                zipEntry2.setTime(zipEntry.getTime());
                zipOutputStream.putNextEntry(zipEntry2);
                byte[] bArr = new byte[16384];
                for (int i = inputStream.read(bArr); i != -1; i = inputStream.read(bArr)) {
                    zipOutputStream.write(bArr, 0, i);
                }
                zipOutputStream.closeEntry();
                zipOutputStream.close();
                if (!fileCreateTempFile.setReadOnly()) {
                    throw new IOException("Failed to mark readonly \"" + fileCreateTempFile.getAbsolutePath() + "\" (tmp of \"" + file.getAbsolutePath() + "\")");
                }
                Log.i("MultiDex", "Renaming to " + file.getPath());
                if (!fileCreateTempFile.renameTo(file)) {
                    throw new IOException("Failed to rename \"" + fileCreateTempFile.getAbsolutePath() + "\" to \"" + file.getAbsolutePath() + "\"");
                }
            } catch (Throwable th) {
                zipOutputStream.close();
                throw th;
            }
        } finally {
            m143a(inputStream);
            fileCreateTempFile.delete();
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m146a(Context context, File file, long j, String str) {
        SharedPreferences sharedPreferencesM138a = m138a(context);
        return (sharedPreferencesM138a.getLong(new StringBuilder().append(str).append("timestamp").toString(), -1L) == m137a(file) && sharedPreferencesM138a.getLong(new StringBuilder().append(str).append("crc").toString(), -1L) == j) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    private static long m147b(File file) throws IOException {
        long jM148a = C0024d.m148a(file);
        return jM148a == -1 ? jM148a - 1 : jM148a;
    }
}
