package com.google.android.gms.internal;

import java.io.UnsupportedEncodingException;
import java.lang.Character;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class bvg {
    /* JADX INFO: renamed from: a */
    public static int m10320a(String str) {
        byte[] bytes;
        int i;
        int i2 = 0;
        try {
            bytes = str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            bytes = str.getBytes();
        }
        int length = bytes.length;
        int i3 = (length & (-4)) + 0;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i3) {
            int i6 = ((bytes[i4] & 255) | ((bytes[i4 + 1] & 255) << 8) | ((bytes[i4 + 2] & 255) << 16) | (bytes[i4 + 3] << 24)) * (-862048943);
            int i7 = i5 ^ (((i6 >>> 17) | (i6 << 15)) * 461845907);
            i4 += 4;
            i5 = (-430675100) + (((i7 >>> 19) | (i7 << 13)) * 5);
        }
        switch (length & 3) {
            case 3:
                i2 = (bytes[i3 + 2] & 255) << 16;
            case 2:
                i2 |= (bytes[i3 + 1] & 255) << 8;
            case 1:
                int i8 = ((bytes[i3] & 255) | i2) * (-862048943);
                i = (((i8 >>> 17) | (i8 << 15)) * 461845907) ^ i5;
                break;
            default:
                i = i5;
                break;
        }
        int i9 = i ^ length;
        int i10 = (i9 ^ (i9 >>> 16)) * (-2048144789);
        int i11 = (i10 ^ (i10 >>> 13)) * (-1028477387);
        return i11 ^ (i11 >>> 16);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x009f  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String[] m10321a(String str, boolean z) {
        boolean z2;
        int i;
        boolean z3;
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        char[] charArray = str.toCharArray();
        int length = str.length();
        boolean z4 = false;
        int i2 = 0;
        int i3 = 0;
        while (i3 < length) {
            int iCodePointAt = Character.codePointAt(charArray, i3);
            int iCharCount = Character.charCount(iCodePointAt);
            if (Character.isLetter(iCodePointAt)) {
                Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(iCodePointAt);
                if (!(unicodeBlockOf == Character.UnicodeBlock.BOPOMOFO || unicodeBlockOf == Character.UnicodeBlock.BOPOMOFO_EXTENDED || unicodeBlockOf == Character.UnicodeBlock.CJK_COMPATIBILITY || unicodeBlockOf == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS || unicodeBlockOf == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT || unicodeBlockOf == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS || unicodeBlockOf == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A || unicodeBlockOf == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B || unicodeBlockOf == Character.UnicodeBlock.ENCLOSED_CJK_LETTERS_AND_MONTHS || unicodeBlockOf == Character.UnicodeBlock.HANGUL_JAMO || unicodeBlockOf == Character.UnicodeBlock.HANGUL_SYLLABLES || unicodeBlockOf == Character.UnicodeBlock.HIRAGANA || unicodeBlockOf == Character.UnicodeBlock.KATAKANA || unicodeBlockOf == Character.UnicodeBlock.KATAKANA_PHONETIC_EXTENSIONS)) {
                    if ((iCodePointAt >= 65382 && iCodePointAt <= 65437) || (iCodePointAt >= 65441 && iCodePointAt <= 65500)) {
                    }
                }
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (z4) {
                    arrayList.add(new String(charArray, i2, i3 - i2));
                }
                arrayList.add(new String(charArray, i3, iCharCount));
                i = i2;
                z3 = false;
            } else if (Character.isLetterOrDigit(iCodePointAt) || Character.getType(iCodePointAt) == 6 || Character.getType(iCodePointAt) == 8) {
                if (!z4) {
                    i2 = i3;
                }
                i = i2;
                z3 = true;
            } else if (z && Character.charCount(iCodePointAt) == 1 && Character.toChars(iCodePointAt)[0] == '\'') {
                if (!z4) {
                    i2 = i3;
                }
                i = i2;
                z3 = true;
            } else if (z4) {
                arrayList.add(new String(charArray, i2, i3 - i2));
                i = i2;
                z3 = false;
            } else {
                boolean z5 = z4;
                i = i2;
                z3 = z5;
            }
            i3 += iCharCount;
            boolean z6 = z3;
            i2 = i;
            z4 = z6;
        }
        if (z4) {
            arrayList.add(new String(charArray, i2, i3 - i2));
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }
}
