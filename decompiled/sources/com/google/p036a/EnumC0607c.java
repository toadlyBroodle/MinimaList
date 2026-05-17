package com.google.p036a;

import java.lang.reflect.Field;
import java.util.Locale;

/* JADX INFO: renamed from: com.google.a.c */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0607c implements InterfaceC0609d {
    IDENTITY { // from class: com.google.a.c.1
        @Override // com.google.p036a.InterfaceC0609d
        /* JADX INFO: renamed from: a */
        public String mo5200a(Field field) {
            return field.getName();
        }
    },
    UPPER_CAMEL_CASE { // from class: com.google.a.c.2
        @Override // com.google.p036a.InterfaceC0609d
        /* JADX INFO: renamed from: a */
        public String mo5200a(Field field) {
            return m5198a(field.getName());
        }
    },
    UPPER_CAMEL_CASE_WITH_SPACES { // from class: com.google.a.c.3
        @Override // com.google.p036a.InterfaceC0609d
        /* JADX INFO: renamed from: a */
        public String mo5200a(Field field) {
            return m5198a(m5199a(field.getName(), " "));
        }
    },
    LOWER_CASE_WITH_UNDERSCORES { // from class: com.google.a.c.4
        @Override // com.google.p036a.InterfaceC0609d
        /* JADX INFO: renamed from: a */
        public String mo5200a(Field field) {
            return m5199a(field.getName(), "_").toLowerCase(Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_DASHES { // from class: com.google.a.c.5
        @Override // com.google.p036a.InterfaceC0609d
        /* JADX INFO: renamed from: a */
        public String mo5200a(Field field) {
            return m5199a(field.getName(), "-").toLowerCase(Locale.ENGLISH);
        }
    };

    /* JADX INFO: renamed from: a */
    private static String m5197a(char c, String str, int i) {
        return i < str.length() ? c + str.substring(i) : String.valueOf(c);
    }

    /* JADX INFO: renamed from: a */
    static String m5198a(String str) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        char cCharAt = str.charAt(0);
        while (i < str.length() - 1 && !Character.isLetter(cCharAt)) {
            sb.append(cCharAt);
            i++;
            cCharAt = str.charAt(i);
        }
        return i == str.length() ? sb.toString() : !Character.isUpperCase(cCharAt) ? sb.append(m5197a(Character.toUpperCase(cCharAt), str, i + 1)).toString() : str;
    }

    /* JADX INFO: renamed from: a */
    static String m5199a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (Character.isUpperCase(cCharAt) && sb.length() != 0) {
                sb.append(str2);
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }
}
