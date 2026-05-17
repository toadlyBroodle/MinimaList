package com.google.ads.mediation;

import com.google.android.gms.internal.C1668jm;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.google.ads.mediation.e */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class C0648e {

    /* JADX INFO: renamed from: com.google.ads.mediation.e$a */
    public static final class a extends Exception {
        public a(String str) {
            super(str);
        }
    }

    /* JADX INFO: renamed from: com.google.ads.mediation.e$b */
    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface b {
        /* JADX INFO: renamed from: a */
        String m5319a();

        /* JADX INFO: renamed from: b */
        boolean m5320b() default true;
    }

    /* JADX INFO: renamed from: a */
    public void m5318a(Map<String, String> map) throws a {
        HashMap map2 = new HashMap();
        for (Field field : getClass().getFields()) {
            b bVar = (b) field.getAnnotation(b.class);
            if (bVar != null) {
                map2.put(bVar.m5319a(), field);
            }
        }
        if (map2.isEmpty()) {
            C1668jm.m11615e("No server options fields detected. To suppress this message either add a field with the @Parameter annotation, or override the load() method.");
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            Field field2 = (Field) map2.remove(entry.getKey());
            if (field2 != null) {
                try {
                    field2.set(this, entry.getValue());
                } catch (IllegalAccessException e) {
                    String key = entry.getKey();
                    C1668jm.m11615e(new StringBuilder(String.valueOf(key).length() + 49).append("Server option \"").append(key).append("\" could not be set: Illegal Access").toString());
                } catch (IllegalArgumentException e2) {
                    String key2 = entry.getKey();
                    C1668jm.m11615e(new StringBuilder(String.valueOf(key2).length() + 43).append("Server option \"").append(key2).append("\" could not be set: Bad Type").toString());
                }
            } else {
                String key3 = entry.getKey();
                String value = entry.getValue();
                C1668jm.m11610b(new StringBuilder(String.valueOf(key3).length() + 31 + String.valueOf(value).length()).append("Unexpected server option: ").append(key3).append(" = \"").append(value).append("\"").toString());
            }
        }
        StringBuilder sb = new StringBuilder();
        for (Field field3 : map2.values()) {
            if (((b) field3.getAnnotation(b.class)).m5320b()) {
                String strValueOf = String.valueOf(((b) field3.getAnnotation(b.class)).m5319a());
                C1668jm.m11615e(strValueOf.length() != 0 ? "Required server option missing: ".concat(strValueOf) : new String("Required server option missing: "));
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(((b) field3.getAnnotation(b.class)).m5319a());
            }
        }
        if (sb.length() > 0) {
            String strValueOf2 = String.valueOf(sb.toString());
            throw new a(strValueOf2.length() != 0 ? "Required server option(s) missing: ".concat(strValueOf2) : new String("Required server option(s) missing: "));
        }
    }
}
