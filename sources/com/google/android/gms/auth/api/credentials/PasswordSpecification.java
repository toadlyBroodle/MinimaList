package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.AbstractC2011we;
import com.google.android.gms.internal.C2014wh;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes.dex */
public final class PasswordSpecification extends AbstractC2011we implements ReflectedParcelable {
    public static final Parcelable.Creator<PasswordSpecification> CREATOR = new C0922b();

    /* JADX INFO: renamed from: a */
    public static final PasswordSpecification f5016a = new C0919a().m6106a(12, 16).m6107a("abcdefghijkmnopqrstxyzABCDEFGHJKLMNPQRSTXY3456789").m6108a("abcdefghijkmnopqrstxyz", 1).m6108a("ABCDEFGHJKLMNPQRSTXY", 1).m6108a("3456789", 1).m6109a();

    /* JADX INFO: renamed from: b */
    private static PasswordSpecification f5017b = new C0919a().m6106a(12, 16).m6107a("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890").m6108a("abcdefghijklmnopqrstuvwxyz", 1).m6108a("ABCDEFGHIJKLMNOPQRSTUVWXYZ", 1).m6108a("1234567890", 1).m6109a();

    /* JADX INFO: renamed from: c */
    private String f5018c;

    /* JADX INFO: renamed from: d */
    private List<String> f5019d;

    /* JADX INFO: renamed from: e */
    private List<Integer> f5020e;

    /* JADX INFO: renamed from: f */
    private int f5021f;

    /* JADX INFO: renamed from: g */
    private int f5022g;

    /* JADX INFO: renamed from: h */
    private final int[] f5023h;

    /* JADX INFO: renamed from: i */
    private final Random f5024i;

    /* JADX INFO: renamed from: com.google.android.gms.auth.api.credentials.PasswordSpecification$a */
    public static class C0919a {

        /* JADX INFO: renamed from: a */
        private final TreeSet<Character> f5025a = new TreeSet<>();

        /* JADX INFO: renamed from: b */
        private final List<String> f5026b = new ArrayList();

        /* JADX INFO: renamed from: c */
        private final List<Integer> f5027c = new ArrayList();

        /* JADX INFO: renamed from: d */
        private int f5028d = 12;

        /* JADX INFO: renamed from: e */
        private int f5029e = 16;

        /* JADX INFO: renamed from: a */
        private static TreeSet<Character> m6105a(String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                throw new C0920b(String.valueOf(str2).concat(" cannot be null or empty"));
            }
            TreeSet<Character> treeSet = new TreeSet<>();
            for (char c : str.toCharArray()) {
                if (PasswordSpecification.m6102a(c, 32, 126)) {
                    throw new C0920b(String.valueOf(str2).concat(" must only contain ASCII printable characters"));
                }
                treeSet.add(Character.valueOf(c));
            }
            return treeSet;
        }

        /* JADX INFO: renamed from: a */
        public final C0919a m6106a(int i, int i2) {
            this.f5028d = 12;
            this.f5029e = 16;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public final C0919a m6107a(String str) {
            this.f5025a.addAll(m6105a(str, "allowedChars"));
            return this;
        }

        /* JADX INFO: renamed from: a */
        public final C0919a m6108a(String str, int i) {
            this.f5026b.add(PasswordSpecification.m6103b(m6105a(str, "requiredChars")));
            this.f5027c.add(1);
            return this;
        }

        /* JADX INFO: renamed from: a */
        public final PasswordSpecification m6109a() {
            if (this.f5025a.isEmpty()) {
                throw new C0920b("no allowed characters specified");
            }
            Iterator<Integer> it = this.f5027c.iterator();
            int iIntValue = 0;
            while (it.hasNext()) {
                iIntValue = it.next().intValue() + iIntValue;
            }
            if (iIntValue > this.f5029e) {
                throw new C0920b("required character count cannot be greater than the max password size");
            }
            boolean[] zArr = new boolean[95];
            Iterator<String> it2 = this.f5026b.iterator();
            while (it2.hasNext()) {
                for (char c : it2.next().toCharArray()) {
                    if (zArr[c - ' ']) {
                        throw new C0920b(new StringBuilder(58).append("character ").append(c).append(" occurs in more than one required character set").toString());
                    }
                    zArr[c - ' '] = true;
                }
            }
            return new PasswordSpecification(PasswordSpecification.m6103b(this.f5025a), this.f5026b, this.f5027c, this.f5028d, this.f5029e);
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.auth.api.credentials.PasswordSpecification$b */
    public static class C0920b extends Error {
        public C0920b(String str) {
            super(str);
        }
    }

    PasswordSpecification(String str, List<String> list, List<Integer> list2, int i, int i2) {
        this.f5018c = str;
        this.f5019d = Collections.unmodifiableList(list);
        this.f5020e = Collections.unmodifiableList(list2);
        this.f5021f = i;
        this.f5022g = i2;
        int[] iArr = new int[95];
        Arrays.fill(iArr, -1);
        Iterator<String> it = this.f5019d.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            int length = it.next().toCharArray().length;
            for (int i4 = 0; i4 < length; i4++) {
                iArr[r5[i4] - ' '] = i3;
            }
            i3++;
        }
        this.f5023h = iArr;
        this.f5024i = new SecureRandom();
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ boolean m6102a(int i, int i2, int i3) {
        return m6104b(i, 32, 126);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static String m6103b(Collection<Character> collection) {
        char[] cArr = new char[collection.size()];
        int i = 0;
        Iterator<Character> it = collection.iterator();
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                return new String(cArr);
            }
            i = i2 + 1;
            cArr[i2] = it.next().charValue();
        }
    }

    /* JADX INFO: renamed from: b */
    private static boolean m6104b(int i, int i2, int i3) {
        return i < 32 || i > 126;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM12512a = C2014wh.m12512a(parcel);
        C2014wh.m12524a(parcel, 1, this.f5018c, false);
        C2014wh.m12535b(parcel, 2, this.f5019d, false);
        C2014wh.m12525a(parcel, 3, this.f5020e, false);
        C2014wh.m12516a(parcel, 4, this.f5021f);
        C2014wh.m12516a(parcel, 5, this.f5022g);
        C2014wh.m12513a(parcel, iM12512a);
    }
}
