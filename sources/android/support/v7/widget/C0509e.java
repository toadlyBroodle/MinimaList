package android.support.v7.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.util.Xml;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: renamed from: android.support.v7.widget.e */
/* JADX INFO: loaded from: classes.dex */
class C0509e extends DataSetObservable {

    /* JADX INFO: renamed from: a */
    static final String f3563a = C0509e.class.getSimpleName();

    /* JADX INFO: renamed from: e */
    private static final Object f3564e = new Object();

    /* JADX INFO: renamed from: f */
    private static final Map<String, C0509e> f3565f = new HashMap();

    /* JADX INFO: renamed from: b */
    final Context f3566b;

    /* JADX INFO: renamed from: c */
    final String f3567c;

    /* JADX INFO: renamed from: d */
    boolean f3568d;

    /* JADX INFO: renamed from: g */
    private final Object f3569g;

    /* JADX INFO: renamed from: h */
    private final List<a> f3570h;

    /* JADX INFO: renamed from: i */
    private final List<c> f3571i;

    /* JADX INFO: renamed from: j */
    private Intent f3572j;

    /* JADX INFO: renamed from: k */
    private b f3573k;

    /* JADX INFO: renamed from: l */
    private int f3574l;

    /* JADX INFO: renamed from: m */
    private boolean f3575m;

    /* JADX INFO: renamed from: n */
    private boolean f3576n;

    /* JADX INFO: renamed from: o */
    private boolean f3577o;

    /* JADX INFO: renamed from: p */
    private d f3578p;

    /* JADX INFO: renamed from: android.support.v7.widget.e$a */
    public static final class a implements Comparable<a> {

        /* JADX INFO: renamed from: a */
        public final ResolveInfo f3579a;

        /* JADX INFO: renamed from: b */
        public float f3580b;

        public a(ResolveInfo resolveInfo) {
            this.f3579a = resolveInfo;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            return Float.floatToIntBits(aVar.f3580b) - Float.floatToIntBits(this.f3580b);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && Float.floatToIntBits(this.f3580b) == Float.floatToIntBits(((a) obj).f3580b);
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f3580b) + 31;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append("resolveInfo:").append(this.f3579a.toString());
            sb.append("; weight:").append(new BigDecimal(this.f3580b));
            sb.append("]");
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: android.support.v7.widget.e$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void m4620a(Intent intent, List<a> list, List<c> list2);
    }

    /* JADX INFO: renamed from: android.support.v7.widget.e$c */
    public static final class c {

        /* JADX INFO: renamed from: a */
        public final ComponentName f3581a;

        /* JADX INFO: renamed from: b */
        public final long f3582b;

        /* JADX INFO: renamed from: c */
        public final float f3583c;

        public c(ComponentName componentName, long j, float f) {
            this.f3581a = componentName;
            this.f3582b = j;
            this.f3583c = f;
        }

        public c(String str, long j, float f) {
            this(ComponentName.unflattenFromString(str), j, f);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                c cVar = (c) obj;
                if (this.f3581a == null) {
                    if (cVar.f3581a != null) {
                        return false;
                    }
                } else if (!this.f3581a.equals(cVar.f3581a)) {
                    return false;
                }
                return this.f3582b == cVar.f3582b && Float.floatToIntBits(this.f3583c) == Float.floatToIntBits(cVar.f3583c);
            }
            return false;
        }

        public int hashCode() {
            return (((((this.f3581a == null ? 0 : this.f3581a.hashCode()) + 31) * 31) + ((int) (this.f3582b ^ (this.f3582b >>> 32)))) * 31) + Float.floatToIntBits(this.f3583c);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append("; activity:").append(this.f3581a);
            sb.append("; time:").append(this.f3582b);
            sb.append("; weight:").append(new BigDecimal(this.f3583c));
            sb.append("]");
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: android.support.v7.widget.e$d */
    public interface d {
        /* JADX INFO: renamed from: a */
        boolean m4621a(C0509e c0509e, Intent intent);
    }

    /* JADX INFO: renamed from: android.support.v7.widget.e$e */
    private final class e extends AsyncTask<Object, Void, Void> {
        e() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Object... objArr) {
            List list = (List) objArr[0];
            String str = (String) objArr[1];
            try {
                FileOutputStream fileOutputStreamOpenFileOutput = C0509e.this.f3566b.openFileOutput(str, 0);
                XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
                try {
                    try {
                        try {
                            xmlSerializerNewSerializer.setOutput(fileOutputStreamOpenFileOutput, null);
                            xmlSerializerNewSerializer.startDocument("UTF-8", true);
                            xmlSerializerNewSerializer.startTag(null, "historical-records");
                            int size = list.size();
                            for (int i = 0; i < size; i++) {
                                c cVar = (c) list.remove(0);
                                xmlSerializerNewSerializer.startTag(null, "historical-record");
                                xmlSerializerNewSerializer.attribute(null, "activity", cVar.f3581a.flattenToString());
                                xmlSerializerNewSerializer.attribute(null, "time", String.valueOf(cVar.f3582b));
                                xmlSerializerNewSerializer.attribute(null, "weight", String.valueOf(cVar.f3583c));
                                xmlSerializerNewSerializer.endTag(null, "historical-record");
                            }
                            xmlSerializerNewSerializer.endTag(null, "historical-records");
                            xmlSerializerNewSerializer.endDocument();
                            C0509e.this.f3568d = true;
                            if (fileOutputStreamOpenFileOutput != null) {
                                try {
                                    fileOutputStreamOpenFileOutput.close();
                                } catch (IOException e) {
                                }
                            }
                        } catch (IOException e2) {
                            Log.e(C0509e.f3563a, "Error writing historical record file: " + C0509e.this.f3567c, e2);
                            C0509e.this.f3568d = true;
                            if (fileOutputStreamOpenFileOutput != null) {
                                try {
                                    fileOutputStreamOpenFileOutput.close();
                                } catch (IOException e3) {
                                }
                            }
                        }
                    } catch (IllegalArgumentException e4) {
                        Log.e(C0509e.f3563a, "Error writing historical record file: " + C0509e.this.f3567c, e4);
                        C0509e.this.f3568d = true;
                        if (fileOutputStreamOpenFileOutput != null) {
                            try {
                                fileOutputStreamOpenFileOutput.close();
                            } catch (IOException e5) {
                            }
                        }
                    } catch (IllegalStateException e6) {
                        Log.e(C0509e.f3563a, "Error writing historical record file: " + C0509e.this.f3567c, e6);
                        C0509e.this.f3568d = true;
                        if (fileOutputStreamOpenFileOutput != null) {
                            try {
                                fileOutputStreamOpenFileOutput.close();
                            } catch (IOException e7) {
                            }
                        }
                    }
                } catch (Throwable th) {
                    C0509e.this.f3568d = true;
                    if (fileOutputStreamOpenFileOutput != null) {
                        try {
                            fileOutputStreamOpenFileOutput.close();
                        } catch (IOException e8) {
                        }
                    }
                    throw th;
                }
            } catch (FileNotFoundException e9) {
                Log.e(C0509e.f3563a, "Error writing historical record file: " + str, e9);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m4605a(c cVar) {
        boolean zAdd = this.f3571i.add(cVar);
        if (zAdd) {
            this.f3576n = true;
            m4611h();
            m4606c();
            m4608e();
            notifyChanged();
        }
        return zAdd;
    }

    /* JADX INFO: renamed from: c */
    private void m4606c() {
        if (!this.f3575m) {
            throw new IllegalStateException("No preceding call to #readHistoricalData");
        }
        if (this.f3576n) {
            this.f3576n = false;
            if (TextUtils.isEmpty(this.f3567c)) {
                return;
            }
            new e().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new ArrayList(this.f3571i), this.f3567c);
        }
    }

    /* JADX INFO: renamed from: d */
    private void m4607d() {
        boolean zM4609f = m4609f() | m4610g();
        m4611h();
        if (zM4609f) {
            m4608e();
            notifyChanged();
        }
    }

    /* JADX INFO: renamed from: e */
    private boolean m4608e() {
        if (this.f3573k == null || this.f3572j == null || this.f3570h.isEmpty() || this.f3571i.isEmpty()) {
            return false;
        }
        this.f3573k.m4620a(this.f3572j, this.f3570h, Collections.unmodifiableList(this.f3571i));
        return true;
    }

    /* JADX INFO: renamed from: f */
    private boolean m4609f() {
        if (!this.f3577o || this.f3572j == null) {
            return false;
        }
        this.f3577o = false;
        this.f3570h.clear();
        List<ResolveInfo> listQueryIntentActivities = this.f3566b.getPackageManager().queryIntentActivities(this.f3572j, 0);
        int size = listQueryIntentActivities.size();
        for (int i = 0; i < size; i++) {
            this.f3570h.add(new a(listQueryIntentActivities.get(i)));
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    private boolean m4610g() {
        if (!this.f3568d || !this.f3576n || TextUtils.isEmpty(this.f3567c)) {
            return false;
        }
        this.f3568d = false;
        this.f3575m = true;
        m4612i();
        return true;
    }

    /* JADX INFO: renamed from: h */
    private void m4611h() {
        int size = this.f3571i.size() - this.f3574l;
        if (size <= 0) {
            return;
        }
        this.f3576n = true;
        for (int i = 0; i < size; i++) {
            this.f3571i.remove(0);
        }
    }

    /* JADX INFO: renamed from: i */
    private void m4612i() {
        FileInputStream fileInputStreamOpenFileInput;
        try {
            try {
                fileInputStreamOpenFileInput = this.f3566b.openFileInput(this.f3567c);
                try {
                    try {
                        XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                        xmlPullParserNewPullParser.setInput(fileInputStreamOpenFileInput, "UTF-8");
                        for (int next = 0; next != 1 && next != 2; next = xmlPullParserNewPullParser.next()) {
                        }
                        if (!"historical-records".equals(xmlPullParserNewPullParser.getName())) {
                            throw new XmlPullParserException("Share records file does not start with historical-records tag.");
                        }
                        List<c> list = this.f3571i;
                        list.clear();
                        while (true) {
                            int next2 = xmlPullParserNewPullParser.next();
                            if (next2 == 1) {
                                if (fileInputStreamOpenFileInput != null) {
                                    try {
                                        fileInputStreamOpenFileInput.close();
                                        return;
                                    } catch (IOException e2) {
                                        return;
                                    }
                                }
                                return;
                            }
                            if (next2 != 3 && next2 != 4) {
                                if (!"historical-record".equals(xmlPullParserNewPullParser.getName())) {
                                    throw new XmlPullParserException("Share records file not well-formed.");
                                }
                                list.add(new c(xmlPullParserNewPullParser.getAttributeValue(null, "activity"), Long.parseLong(xmlPullParserNewPullParser.getAttributeValue(null, "time")), Float.parseFloat(xmlPullParserNewPullParser.getAttributeValue(null, "weight"))));
                            }
                        }
                    } catch (XmlPullParserException e3) {
                        Log.e(f3563a, "Error reading historical recrod file: " + this.f3567c, e3);
                        if (fileInputStreamOpenFileInput != null) {
                            try {
                                fileInputStreamOpenFileInput.close();
                            } catch (IOException e4) {
                            }
                        }
                    }
                } catch (IOException e5) {
                    Log.e(f3563a, "Error reading historical recrod file: " + this.f3567c, e5);
                    if (fileInputStreamOpenFileInput != null) {
                        try {
                            fileInputStreamOpenFileInput.close();
                        } catch (IOException e6) {
                        }
                    }
                }
            } catch (FileNotFoundException e7) {
            }
        } catch (Throwable th) {
            if (fileInputStreamOpenFileInput != null) {
                try {
                    fileInputStreamOpenFileInput.close();
                } catch (IOException e8) {
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public int m4613a() {
        int size;
        synchronized (this.f3569g) {
            m4607d();
            size = this.f3570h.size();
        }
        return size;
    }

    /* JADX INFO: renamed from: a */
    public int m4614a(ResolveInfo resolveInfo) {
        synchronized (this.f3569g) {
            m4607d();
            List<a> list = this.f3570h;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (list.get(i).f3579a == resolveInfo) {
                    return i;
                }
            }
            return -1;
        }
    }

    /* JADX INFO: renamed from: a */
    public ResolveInfo m4615a(int i) {
        ResolveInfo resolveInfo;
        synchronized (this.f3569g) {
            m4607d();
            resolveInfo = this.f3570h.get(i).f3579a;
        }
        return resolveInfo;
    }

    /* JADX INFO: renamed from: b */
    public Intent m4616b(int i) {
        synchronized (this.f3569g) {
            if (this.f3572j == null) {
                return null;
            }
            m4607d();
            a aVar = this.f3570h.get(i);
            ComponentName componentName = new ComponentName(aVar.f3579a.activityInfo.packageName, aVar.f3579a.activityInfo.name);
            Intent intent = new Intent(this.f3572j);
            intent.setComponent(componentName);
            if (this.f3578p != null) {
                if (this.f3578p.m4621a(this, new Intent(intent))) {
                    return null;
                }
            }
            m4605a(new c(componentName, System.currentTimeMillis(), 1.0f));
            return intent;
        }
    }

    /* JADX INFO: renamed from: b */
    public ResolveInfo m4617b() {
        synchronized (this.f3569g) {
            m4607d();
            if (this.f3570h.isEmpty()) {
                return null;
            }
            return this.f3570h.get(0).f3579a;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m4618c(int i) {
        synchronized (this.f3569g) {
            m4607d();
            a aVar = this.f3570h.get(i);
            a aVar2 = this.f3570h.get(0);
            m4605a(new c(new ComponentName(aVar.f3579a.activityInfo.packageName, aVar.f3579a.activityInfo.name), System.currentTimeMillis(), aVar2 != null ? (aVar2.f3580b - aVar.f3580b) + 5.0f : 1.0f));
        }
    }
}
