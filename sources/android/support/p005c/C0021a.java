package android.support.p005c;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.util.Log;
import dalvik.system.DexFile;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipFile;

/* JADX INFO: renamed from: android.support.c.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0021a {

    /* JADX INFO: renamed from: a */
    private static final Set<File> f137a = new HashSet();

    /* JADX INFO: renamed from: b */
    private static final boolean f138b = m123a(System.getProperty("java.vm.version"));

    /* JADX INFO: renamed from: android.support.c.a$a */
    private static final class a {
        /* JADX INFO: renamed from: a */
        private static Object[] m130a(Object obj, ArrayList<File> arrayList, File file) {
            return (Object[]) C0021a.m126b(obj, "makeDexElements", (Class<?>[]) new Class[]{ArrayList.class, File.class}).invoke(obj, arrayList, file);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public static void m131b(ClassLoader classLoader, List<? extends File> list, File file) throws IllegalAccessException, NoSuchFieldException {
            Object obj = C0021a.m125b(classLoader, "pathList").get(classLoader);
            C0021a.m127b(obj, "dexElements", m130a(obj, (ArrayList<File>) new ArrayList(list), file));
        }
    }

    /* JADX INFO: renamed from: android.support.c.a$b */
    private static final class b {
        /* JADX INFO: renamed from: a */
        private static Object[] m133a(Object obj, ArrayList<File> arrayList, File file, ArrayList<IOException> arrayList2) {
            return (Object[]) C0021a.m126b(obj, "makeDexElements", (Class<?>[]) new Class[]{ArrayList.class, File.class, ArrayList.class}).invoke(obj, arrayList, file, arrayList2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public static void m134b(ClassLoader classLoader, List<? extends File> list, File file) throws IllegalAccessException, NoSuchFieldException {
            IOException[] iOExceptionArr;
            Object obj = C0021a.m125b(classLoader, "pathList").get(classLoader);
            ArrayList arrayList = new ArrayList();
            C0021a.m127b(obj, "dexElements", m133a(obj, new ArrayList(list), file, arrayList));
            if (arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Log.w("MultiDex", "Exception in makeDexElement", (IOException) it.next());
                }
                Field fieldM125b = C0021a.m125b(obj, "dexElementsSuppressedExceptions");
                IOException[] iOExceptionArr2 = (IOException[]) fieldM125b.get(obj);
                if (iOExceptionArr2 == null) {
                    iOExceptionArr = (IOException[]) arrayList.toArray(new IOException[arrayList.size()]);
                } else {
                    IOException[] iOExceptionArr3 = new IOException[arrayList.size() + iOExceptionArr2.length];
                    arrayList.toArray(iOExceptionArr3);
                    System.arraycopy(iOExceptionArr2, 0, iOExceptionArr3, arrayList.size(), iOExceptionArr2.length);
                    iOExceptionArr = iOExceptionArr3;
                }
                fieldM125b.set(obj, iOExceptionArr);
            }
        }
    }

    /* JADX INFO: renamed from: android.support.c.a$c */
    private static final class c {
        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public static void m136b(ClassLoader classLoader, List<? extends File> list) throws IllegalAccessException, NoSuchFieldException {
            int size = list.size();
            Field fieldM125b = C0021a.m125b(classLoader, "path");
            StringBuilder sb = new StringBuilder((String) fieldM125b.get(classLoader));
            String[] strArr = new String[size];
            File[] fileArr = new File[size];
            ZipFile[] zipFileArr = new ZipFile[size];
            DexFile[] dexFileArr = new DexFile[size];
            ListIterator<? extends File> listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                File next = listIterator.next();
                String absolutePath = next.getAbsolutePath();
                sb.append(':').append(absolutePath);
                int iPreviousIndex = listIterator.previousIndex();
                strArr[iPreviousIndex] = absolutePath;
                fileArr[iPreviousIndex] = next;
                zipFileArr[iPreviousIndex] = new ZipFile(next);
                dexFileArr[iPreviousIndex] = DexFile.loadDex(absolutePath, absolutePath + ".dex", 0);
            }
            fieldM125b.set(classLoader, sb.toString());
            C0021a.m127b(classLoader, "mPaths", strArr);
            C0021a.m127b(classLoader, "mFiles", fileArr);
            C0021a.m127b(classLoader, "mZips", zipFileArr);
            C0021a.m127b(classLoader, "mDexs", dexFileArr);
        }
    }

    /* JADX INFO: renamed from: a */
    private static File m115a(Context context, File file, String str) throws IOException {
        File file2 = new File(file, "code_cache");
        try {
            m120a(file2);
        } catch (IOException e) {
            file2 = new File(context.getFilesDir(), "code_cache");
            m120a(file2);
        }
        File file3 = new File(file2, str);
        m120a(file3);
        return file3;
    }

    /* JADX INFO: renamed from: a */
    public static void m118a(Context context) {
        Log.i("MultiDex", "Installing application");
        if (f138b) {
            Log.i("MultiDex", "VM has multidex support, MultiDex support library is disabled.");
            return;
        }
        if (Build.VERSION.SDK_INT < 4) {
            throw new RuntimeException("MultiDex installation failed. SDK " + Build.VERSION.SDK_INT + " is unsupported. Min SDK version is 4.");
        }
        try {
            ApplicationInfo applicationInfoM124b = m124b(context);
            if (applicationInfoM124b == null) {
                Log.i("MultiDex", "No ApplicationInfo available, i.e. running on a test Context: MultiDex support library is disabled.");
            } else {
                m119a(context, new File(applicationInfoM124b.sourceDir), new File(applicationInfoM124b.dataDir), "secondary-dexes", "");
                Log.i("MultiDex", "install done");
            }
        } catch (Exception e) {
            Log.e("MultiDex", "MultiDex installation failure", e);
            throw new RuntimeException("MultiDex installation failed (" + e.getMessage() + ").");
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m119a(Context context, File file, File file2, String str, String str2) {
        synchronized (f137a) {
            if (f137a.contains(file)) {
                return;
            }
            f137a.add(file);
            if (Build.VERSION.SDK_INT > 20) {
                Log.w("MultiDex", "MultiDex is not guaranteed to work in SDK version " + Build.VERSION.SDK_INT + ": SDK version higher than 20 should be backed by runtime with built-in multidex capabilty but it's not the case here: java.vm.version=\"" + System.getProperty("java.vm.version") + "\"");
            }
            try {
                ClassLoader classLoader = context.getClassLoader();
                if (classLoader == null) {
                    Log.e("MultiDex", "Context class loader is null. Must be running in test mode. Skip patching.");
                    return;
                }
                try {
                    m128c(context);
                } catch (Throwable th) {
                    Log.w("MultiDex", "Something went wrong when trying to clear old MultiDex extraction, continuing without cleaning.", th);
                }
                File fileM115a = m115a(context, file2, str);
                m121a(classLoader, fileM115a, C0023c.m140a(context, file, fileM115a, str2, false));
            } catch (RuntimeException e) {
                Log.w("MultiDex", "Failure while trying to obtain Context class loader. Must be running in test mode. Skip patching.", e);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m120a(File file) throws IOException {
        file.mkdir();
        if (file.isDirectory()) {
            return;
        }
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            Log.e("MultiDex", "Failed to create dir " + file.getPath() + ". Parent file is null.");
        } else {
            Log.e("MultiDex", "Failed to create dir " + file.getPath() + ". parent file is a dir " + parentFile.isDirectory() + ", a file " + parentFile.isFile() + ", exists " + parentFile.exists() + ", readable " + parentFile.canRead() + ", writable " + parentFile.canWrite());
        }
        throw new IOException("Failed to create directory " + file.getPath());
    }

    /* JADX INFO: renamed from: a */
    private static void m121a(ClassLoader classLoader, File file, List<? extends File> list) throws IllegalAccessException, NoSuchFieldException {
        if (list.isEmpty()) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            b.m134b(classLoader, list, file);
        } else if (Build.VERSION.SDK_INT >= 14) {
            a.m131b(classLoader, list, file);
        } else {
            c.m136b(classLoader, list);
        }
    }

    /* JADX INFO: renamed from: a */
    static boolean m123a(String str) {
        boolean z = false;
        if (str != null) {
            Matcher matcher = Pattern.compile("(\\d+)\\.(\\d+)(\\.\\d+)?").matcher(str);
            if (matcher.matches()) {
                try {
                    int i = Integer.parseInt(matcher.group(1));
                    int i2 = Integer.parseInt(matcher.group(2));
                    if (i > 2 || (i == 2 && i2 >= 1)) {
                        z = true;
                    }
                } catch (NumberFormatException e) {
                }
            }
        }
        Log.i("MultiDex", "VM with version " + str + (z ? " has multidex support" : " does not have multidex support"));
        return z;
    }

    /* JADX INFO: renamed from: b */
    private static ApplicationInfo m124b(Context context) {
        try {
            return context.getApplicationInfo();
        } catch (RuntimeException e) {
            Log.w("MultiDex", "Failure while trying to obtain ApplicationInfo from Context. Must be running in test mode. Skip patching.", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static Field m125b(Object obj, String str) throws NoSuchFieldException {
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            try {
                Field declaredField = superclass.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException e) {
            }
        }
        throw new NoSuchFieldException("Field " + str + " not found in " + obj.getClass());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static Method m126b(Object obj, String str, Class<?>... clsArr) throws NoSuchMethodException {
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            try {
                Method declaredMethod = superclass.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException e) {
            }
        }
        throw new NoSuchMethodException("Method " + str + " with parameters " + Arrays.asList(clsArr) + " not found in " + obj.getClass());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static void m127b(Object obj, String str, Object[] objArr) throws IllegalAccessException, NoSuchFieldException {
        Field fieldM125b = m125b(obj, str);
        Object[] objArr2 = (Object[]) fieldM125b.get(obj);
        Object[] objArr3 = (Object[]) Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
        System.arraycopy(objArr2, 0, objArr3, 0, objArr2.length);
        System.arraycopy(objArr, 0, objArr3, objArr2.length, objArr.length);
        fieldM125b.set(obj, objArr3);
    }

    /* JADX INFO: renamed from: c */
    private static void m128c(Context context) {
        File file = new File(context.getFilesDir(), "secondary-dexes");
        if (file.isDirectory()) {
            Log.i("MultiDex", "Clearing old secondary dex dir (" + file.getPath() + ").");
            File[] fileArrListFiles = file.listFiles();
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
            if (file.delete()) {
                Log.i("MultiDex", "Deleted old secondary dex dir " + file.getPath());
            } else {
                Log.w("MultiDex", "Failed to delete secondary dex dir " + file.getPath());
            }
        }
    }
}
