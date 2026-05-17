package com.google.p036a.p038b.p039a.p040a;

import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/* JADX INFO: renamed from: com.google.a.b.a.a.a */
/* JADX INFO: loaded from: classes.dex */
public class C0583a {

    /* JADX INFO: renamed from: a */
    private static final TimeZone f4002a = TimeZone.getTimeZone("UTC");

    /* JADX INFO: renamed from: a */
    private static int m5042a(String str, int i) {
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt < '0' || cCharAt > '9') {
                return i;
            }
            i++;
        }
        return str.length();
    }

    /* JADX INFO: renamed from: a */
    private static int m5043a(String str, int i, int i2) {
        int i3;
        if (i < 0 || i2 > str.length() || i > i2) {
            throw new NumberFormatException(str);
        }
        int i4 = 0;
        if (i < i2) {
            i3 = i + 1;
            int iDigit = Character.digit(str.charAt(i), 10);
            if (iDigit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i, i2));
            }
            i4 = -iDigit;
        } else {
            i3 = i;
        }
        while (i3 < i2) {
            int i5 = i3 + 1;
            int iDigit2 = Character.digit(str.charAt(i3), 10);
            if (iDigit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i, i2));
            }
            i4 = (i4 * 10) - iDigit2;
            i3 = i5;
        }
        return -i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0221  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Date m5044a(String str, ParsePosition parsePosition) throws ParseException {
        Exception exc;
        String message;
        int i;
        int i2;
        int i3;
        int i4;
        int length;
        TimeZone timeZone;
        char cCharAt;
        try {
            int index = parsePosition.getIndex();
            int i5 = index + 4;
            int iM5043a = m5043a(str, index, i5);
            int i6 = m5045a(str, i5, '-') ? i5 + 1 : i5;
            int i7 = i6 + 2;
            int iM5043a2 = m5043a(str, i6, i7);
            int i8 = m5045a(str, i7, '-') ? i7 + 1 : i7;
            int i9 = i8 + 2;
            int iM5043a3 = m5043a(str, i8, i9);
            boolean zM5045a = m5045a(str, i9, 'T');
            if (!zM5045a && str.length() <= i9) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(iM5043a, iM5043a2 - 1, iM5043a3);
                parsePosition.setIndex(i9);
                return gregorianCalendar.getTime();
            }
            if (zM5045a) {
                int i10 = i9 + 1;
                int i11 = i10 + 2;
                int iM5043a4 = m5043a(str, i10, i11);
                int i12 = m5045a(str, i11, ':') ? i11 + 1 : i11;
                i9 = i12 + 2;
                int iM5043a5 = m5043a(str, i12, i9);
                if (m5045a(str, i9, ':')) {
                    i9++;
                }
                if (str.length() <= i9 || (cCharAt = str.charAt(i9)) == 'Z' || cCharAt == '+' || cCharAt == '-') {
                    i3 = iM5043a5;
                    i4 = iM5043a4;
                    i = 0;
                    i2 = 0;
                } else {
                    int i13 = i9 + 2;
                    int iM5043a6 = m5043a(str, i9, i13);
                    if (iM5043a6 > 59 && iM5043a6 < 63) {
                        iM5043a6 = 59;
                    }
                    if (m5045a(str, i13, '.')) {
                        int i14 = i13 + 1;
                        int iM5042a = m5042a(str, i14 + 1);
                        int iMin = Math.min(iM5042a, i14 + 3);
                        int iM5043a7 = m5043a(str, i14, iMin);
                        switch (iMin - i14) {
                            case 1:
                                iM5043a7 *= 100;
                                break;
                            case 2:
                                iM5043a7 *= 10;
                                break;
                        }
                        i4 = iM5043a4;
                        i2 = iM5043a6;
                        i9 = iM5042a;
                        i3 = iM5043a5;
                        i = iM5043a7;
                    } else {
                        i4 = iM5043a4;
                        i2 = iM5043a6;
                        i9 = i13;
                        i3 = iM5043a5;
                        i = 0;
                    }
                }
            } else {
                i = 0;
                i2 = 0;
                i3 = 0;
                i4 = 0;
            }
            if (str.length() <= i9) {
                throw new IllegalArgumentException("No time zone indicator");
            }
            char cCharAt2 = str.charAt(i9);
            if (cCharAt2 == 'Z') {
                timeZone = f4002a;
                length = i9 + 1;
            } else {
                if (cCharAt2 != '+' && cCharAt2 != '-') {
                    throw new IndexOutOfBoundsException("Invalid time zone indicator '" + cCharAt2 + "'");
                }
                String strSubstring = str.substring(i9);
                if (strSubstring.length() < 5) {
                    strSubstring = strSubstring + "00";
                }
                length = i9 + strSubstring.length();
                if ("+0000".equals(strSubstring) || "+00:00".equals(strSubstring)) {
                    timeZone = f4002a;
                } else {
                    String str2 = "GMT" + strSubstring;
                    timeZone = TimeZone.getTimeZone(str2);
                    String id = timeZone.getID();
                    if (!id.equals(str2) && !id.replace(":", "").equals(str2)) {
                        throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str2 + " given, resolves to " + timeZone.getID());
                    }
                }
            }
            GregorianCalendar gregorianCalendar2 = new GregorianCalendar(timeZone);
            gregorianCalendar2.setLenient(false);
            gregorianCalendar2.set(1, iM5043a);
            gregorianCalendar2.set(2, iM5043a2 - 1);
            gregorianCalendar2.set(5, iM5043a3);
            gregorianCalendar2.set(11, i4);
            gregorianCalendar2.set(12, i3);
            gregorianCalendar2.set(13, i2);
            gregorianCalendar2.set(14, i);
            parsePosition.setIndex(length);
            return gregorianCalendar2.getTime();
        } catch (NumberFormatException e) {
            exc = e;
            String str3 = str == null ? null : '\"' + str + "'";
            message = exc.getMessage();
            if (message == null || message.isEmpty()) {
                message = "(" + exc.getClass().getName() + ")";
            }
            ParseException parseException = new ParseException("Failed to parse date [" + str3 + "]: " + message, parsePosition.getIndex());
            parseException.initCause(exc);
            throw parseException;
        } catch (IllegalArgumentException e2) {
            exc = e2;
            if (str == null) {
            }
            message = exc.getMessage();
            if (message == null) {
                message = "(" + exc.getClass().getName() + ")";
            }
            ParseException parseException2 = new ParseException("Failed to parse date [" + str3 + "]: " + message, parsePosition.getIndex());
            parseException2.initCause(exc);
            throw parseException2;
        } catch (IndexOutOfBoundsException e3) {
            exc = e3;
            if (str == null) {
            }
            message = exc.getMessage();
            if (message == null) {
            }
            ParseException parseException22 = new ParseException("Failed to parse date [" + str3 + "]: " + message, parsePosition.getIndex());
            parseException22.initCause(exc);
            throw parseException22;
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m5045a(String str, int i, char c) {
        return i < str.length() && str.charAt(i) == c;
    }
}
