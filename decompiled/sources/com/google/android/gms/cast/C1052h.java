package com.google.android.gms.cast;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.p052a.C1072a;
import com.google.android.gms.internal.AbstractC2011we;
import com.google.android.gms.internal.C2000vu;
import com.google.android.gms.internal.C2014wh;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.cast.h */
/* JADX INFO: loaded from: classes.dex */
public class C1052h extends AbstractC2011we {

    /* JADX INFO: renamed from: c */
    private final List<C1072a> f5381c;

    /* JADX INFO: renamed from: d */
    private Bundle f5382d;

    /* JADX INFO: renamed from: e */
    private int f5383e;

    /* JADX INFO: renamed from: a */
    private static final String[] f5379a = {null, "String", "int", "double", "ISO-8601 date String"};
    public static final Parcelable.Creator<C1052h> CREATOR = new C1062r();

    /* JADX INFO: renamed from: b */
    private static final a f5380b = new a().m6552a("com.google.android.gms.cast.metadata.CREATION_DATE", "creationDateTime", 4).m6552a("com.google.android.gms.cast.metadata.RELEASE_DATE", "releaseDate", 4).m6552a("com.google.android.gms.cast.metadata.BROADCAST_DATE", "originalAirdate", 4).m6552a("com.google.android.gms.cast.metadata.TITLE", "title", 1).m6552a("com.google.android.gms.cast.metadata.SUBTITLE", "subtitle", 1).m6552a("com.google.android.gms.cast.metadata.ARTIST", "artist", 1).m6552a("com.google.android.gms.cast.metadata.ALBUM_ARTIST", "albumArtist", 1).m6552a("com.google.android.gms.cast.metadata.ALBUM_TITLE", "albumName", 1).m6552a("com.google.android.gms.cast.metadata.COMPOSER", "composer", 1).m6552a("com.google.android.gms.cast.metadata.DISC_NUMBER", "discNumber", 2).m6552a("com.google.android.gms.cast.metadata.TRACK_NUMBER", "trackNumber", 2).m6552a("com.google.android.gms.cast.metadata.SEASON_NUMBER", "season", 2).m6552a("com.google.android.gms.cast.metadata.EPISODE_NUMBER", "episode", 2).m6552a("com.google.android.gms.cast.metadata.SERIES_TITLE", "seriesTitle", 1).m6552a("com.google.android.gms.cast.metadata.STUDIO", "studio", 1).m6552a("com.google.android.gms.cast.metadata.WIDTH", "width", 2).m6552a("com.google.android.gms.cast.metadata.HEIGHT", "height", 2).m6552a("com.google.android.gms.cast.metadata.LOCATION_NAME", "location", 1).m6552a("com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "latitude", 3).m6552a("com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "longitude", 3);

    /* JADX INFO: renamed from: com.google.android.gms.cast.h$a */
    static class a {

        /* JADX INFO: renamed from: a */
        private final Map<String, String> f5384a = new HashMap();

        /* JADX INFO: renamed from: b */
        private final Map<String, String> f5385b = new HashMap();

        /* JADX INFO: renamed from: c */
        private final Map<String, Integer> f5386c = new HashMap();

        /* JADX INFO: renamed from: a */
        public final a m6552a(String str, String str2, int i) {
            this.f5384a.put(str, str2);
            this.f5385b.put(str2, str);
            this.f5386c.put(str, Integer.valueOf(i));
            return this;
        }

        /* JADX INFO: renamed from: a */
        public final String m6553a(String str) {
            return this.f5384a.get(str);
        }

        /* JADX INFO: renamed from: b */
        public final String m6554b(String str) {
            return this.f5385b.get(str);
        }

        /* JADX INFO: renamed from: c */
        public final int m6555c(String str) {
            Integer num = this.f5386c.get(str);
            if (num != null) {
                return num.intValue();
            }
            return 0;
        }
    }

    public C1052h() {
        this(0);
    }

    public C1052h(int i) {
        this(new ArrayList(), new Bundle(), i);
    }

    C1052h(List<C1072a> list, Bundle bundle, int i) {
        this.f5381c = list;
        this.f5382d = bundle;
        this.f5383e = i;
    }

    /* JADX INFO: renamed from: a */
    private static void m6541a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("null and empty keys are not allowed");
        }
        int iM6555c = f5380b.m6555c(str);
        if (iM6555c == i || iM6555c == 0) {
            return;
        }
        String str2 = f5379a[i];
        throw new IllegalArgumentException(new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length()).append("Value for ").append(str).append(" must be a ").append(str2).toString());
    }

    /* JADX INFO: renamed from: a */
    private final void m6542a(JSONObject jSONObject, String... strArr) {
        try {
            for (String str : strArr) {
                if (this.f5382d.containsKey(str)) {
                    switch (f5380b.m6555c(str)) {
                        case 1:
                        case 4:
                            jSONObject.put(f5380b.m6553a(str), this.f5382d.getString(str));
                            break;
                        case 2:
                            jSONObject.put(f5380b.m6553a(str), this.f5382d.getInt(str));
                            break;
                        case 3:
                            jSONObject.put(f5380b.m6553a(str), this.f5382d.getDouble(str));
                            break;
                    }
                }
            }
            for (String str2 : this.f5382d.keySet()) {
                if (!str2.startsWith("com.google.")) {
                    Object obj = this.f5382d.get(str2);
                    if (obj instanceof String) {
                        jSONObject.put(str2, obj);
                    } else if (obj instanceof Integer) {
                        jSONObject.put(str2, obj);
                    } else if (obj instanceof Double) {
                        jSONObject.put(str2, obj);
                    }
                }
            }
        } catch (JSONException e) {
        }
    }

    /* JADX INFO: renamed from: a */
    private final boolean m6543a(Bundle bundle, Bundle bundle2) {
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if ((obj instanceof Bundle) && (obj2 instanceof Bundle) && !m6543a((Bundle) obj, (Bundle) obj2)) {
                return false;
            }
            if (obj == null) {
                if (obj2 != null || !bundle2.containsKey(str)) {
                    return false;
                }
            } else if (!obj.equals(obj2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    private final void m6544b(JSONObject jSONObject, String... strArr) {
        HashSet hashSet = new HashSet(Arrays.asList(strArr));
        try {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (!"metadataType".equals(next)) {
                    String strM6554b = f5380b.m6554b(next);
                    if (strM6554b == null) {
                        Object obj = jSONObject.get(next);
                        if (obj instanceof String) {
                            this.f5382d.putString(next, (String) obj);
                        } else if (obj instanceof Integer) {
                            this.f5382d.putInt(next, ((Integer) obj).intValue());
                        } else if (obj instanceof Double) {
                            this.f5382d.putDouble(next, ((Double) obj).doubleValue());
                        }
                    } else if (hashSet.contains(strM6554b)) {
                        try {
                            Object obj2 = jSONObject.get(next);
                            if (obj2 != null) {
                                switch (f5380b.m6555c(strM6554b)) {
                                    case 1:
                                        if (obj2 instanceof String) {
                                            this.f5382d.putString(strM6554b, (String) obj2);
                                        }
                                        break;
                                    case 2:
                                        if (obj2 instanceof Integer) {
                                            this.f5382d.putInt(strM6554b, ((Integer) obj2).intValue());
                                        }
                                        break;
                                    case 3:
                                        if (obj2 instanceof Double) {
                                            this.f5382d.putDouble(strM6554b, ((Double) obj2).doubleValue());
                                        }
                                        break;
                                    case 4:
                                        if ((obj2 instanceof String) && C2000vu.m12475a((String) obj2) != null) {
                                            this.f5382d.putString(strM6554b, (String) obj2);
                                        }
                                        break;
                                }
                            }
                        } catch (JSONException e) {
                        }
                    }
                }
            }
        } catch (JSONException e2) {
        }
    }

    /* JADX INFO: renamed from: a */
    public int m6545a() {
        return this.f5383e;
    }

    /* JADX INFO: renamed from: a */
    public String m6546a(String str) {
        m6541a(str, 1);
        return this.f5382d.getString(str);
    }

    /* JADX INFO: renamed from: a */
    public final void m6547a(JSONObject jSONObject) {
        m6548b();
        this.f5383e = 0;
        try {
            this.f5383e = jSONObject.getInt("metadataType");
        } catch (JSONException e) {
        }
        C2000vu.m12476a(this.f5381c, jSONObject);
        switch (this.f5383e) {
            case 0:
                m6544b(jSONObject, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
                break;
            case 1:
                m6544b(jSONObject, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.STUDIO", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
                break;
            case 2:
                m6544b(jSONObject, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.SERIES_TITLE", "com.google.android.gms.cast.metadata.SEASON_NUMBER", "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "com.google.android.gms.cast.metadata.BROADCAST_DATE");
                break;
            case 3:
                m6544b(jSONObject, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ALBUM_TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "com.google.android.gms.cast.metadata.COMPOSER", "com.google.android.gms.cast.metadata.TRACK_NUMBER", "com.google.android.gms.cast.metadata.DISC_NUMBER", "com.google.android.gms.cast.metadata.RELEASE_DATE");
                break;
            case 4:
                m6544b(jSONObject, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.LOCATION_NAME", "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "com.google.android.gms.cast.metadata.WIDTH", "com.google.android.gms.cast.metadata.HEIGHT", "com.google.android.gms.cast.metadata.CREATION_DATE");
                break;
            default:
                m6544b(jSONObject, new String[0]);
                break;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m6548b() {
        this.f5382d.clear();
        this.f5381c.clear();
    }

    /* JADX INFO: renamed from: c */
    public final JSONObject m6549c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("metadataType", this.f5383e);
        } catch (JSONException e) {
        }
        C2000vu.m12477a(jSONObject, this.f5381c);
        switch (this.f5383e) {
            case 0:
                m6542a(jSONObject, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
                return jSONObject;
            case 1:
                m6542a(jSONObject, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.STUDIO", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
                return jSONObject;
            case 2:
                m6542a(jSONObject, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.SERIES_TITLE", "com.google.android.gms.cast.metadata.SEASON_NUMBER", "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "com.google.android.gms.cast.metadata.BROADCAST_DATE");
                return jSONObject;
            case 3:
                m6542a(jSONObject, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.ALBUM_TITLE", "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "com.google.android.gms.cast.metadata.COMPOSER", "com.google.android.gms.cast.metadata.TRACK_NUMBER", "com.google.android.gms.cast.metadata.DISC_NUMBER", "com.google.android.gms.cast.metadata.RELEASE_DATE");
                return jSONObject;
            case 4:
                m6542a(jSONObject, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.LOCATION_NAME", "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "com.google.android.gms.cast.metadata.WIDTH", "com.google.android.gms.cast.metadata.HEIGHT", "com.google.android.gms.cast.metadata.CREATION_DATE");
                return jSONObject;
            default:
                m6542a(jSONObject, new String[0]);
                return jSONObject;
        }
    }

    /* JADX INFO: renamed from: d */
    public List<C1072a> m6550d() {
        return this.f5381c;
    }

    /* JADX INFO: renamed from: e */
    public boolean m6551e() {
        return (this.f5381c == null || this.f5381c.isEmpty()) ? false : true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1052h)) {
            return false;
        }
        C1052h c1052h = (C1052h) obj;
        return m6543a(this.f5382d, c1052h.f5382d) && this.f5381c.equals(c1052h.f5381c);
    }

    public int hashCode() {
        int iHashCode = 17;
        Iterator<String> it = this.f5382d.keySet().iterator();
        while (true) {
            int i = iHashCode;
            if (!it.hasNext()) {
                return (i * 31) + this.f5381c.hashCode();
            }
            iHashCode = this.f5382d.get(it.next()).hashCode() + (i * 31);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iM12512a = C2014wh.m12512a(parcel);
        C2014wh.m12537c(parcel, 2, m6550d(), false);
        C2014wh.m12518a(parcel, 3, this.f5382d, false);
        C2014wh.m12516a(parcel, 4, m6545a());
        C2014wh.m12513a(parcel, iM12512a);
    }
}
