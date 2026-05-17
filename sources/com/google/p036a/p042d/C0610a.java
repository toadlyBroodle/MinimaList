package com.google.p036a.p042d;

import android.support.design.C0025a;
import com.google.p036a.p038b.AbstractC0600e;
import com.google.p036a.p038b.p039a.C0587e;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;

/* JADX INFO: renamed from: com.google.a.d.a */
/* JADX INFO: loaded from: classes.dex */
public class C0610a implements Closeable {

    /* JADX INFO: renamed from: b */
    private static final char[] f4220b = ")]}'\n".toCharArray();

    /* JADX INFO: renamed from: c */
    private final Reader f4222c;

    /* JADX INFO: renamed from: j */
    private long f4229j;

    /* JADX INFO: renamed from: k */
    private int f4230k;

    /* JADX INFO: renamed from: l */
    private String f4231l;

    /* JADX INFO: renamed from: n */
    private int f4233n;

    /* JADX INFO: renamed from: o */
    private String[] f4234o;

    /* JADX INFO: renamed from: p */
    private int[] f4235p;

    /* JADX INFO: renamed from: d */
    private boolean f4223d = false;

    /* JADX INFO: renamed from: e */
    private final char[] f4224e = new char[1024];

    /* JADX INFO: renamed from: f */
    private int f4225f = 0;

    /* JADX INFO: renamed from: g */
    private int f4226g = 0;

    /* JADX INFO: renamed from: h */
    private int f4227h = 0;

    /* JADX INFO: renamed from: i */
    private int f4228i = 0;

    /* JADX INFO: renamed from: a */
    int f4221a = 0;

    /* JADX INFO: renamed from: m */
    private int[] f4232m = new int[32];

    static {
        AbstractC0600e.f4174a = new AbstractC0600e() { // from class: com.google.a.d.a.1
            @Override // com.google.p036a.p038b.AbstractC0600e
            /* JADX INFO: renamed from: a */
            public void mo5172a(C0610a c0610a) throws IOException {
                if (c0610a instanceof C0587e) {
                    ((C0587e) c0610a).m5070o();
                    return;
                }
                int iM5226r = c0610a.f4221a;
                if (iM5226r == 0) {
                    iM5226r = c0610a.m5226r();
                }
                if (iM5226r == 13) {
                    c0610a.f4221a = 9;
                } else if (iM5226r == 12) {
                    c0610a.f4221a = 8;
                } else {
                    if (iM5226r != 14) {
                        throw new IllegalStateException("Expected a name but was " + c0610a.mo5061f() + c0610a.m5221x());
                    }
                    c0610a.f4221a = 10;
                }
            }
        };
    }

    public C0610a(Reader reader) {
        this.f4233n = 0;
        int[] iArr = this.f4232m;
        int i = this.f4233n;
        this.f4233n = i + 1;
        iArr[i] = 6;
        this.f4234o = new String[32];
        this.f4235p = new int[32];
        if (reader == null) {
            throw new NullPointerException("in == null");
        }
        this.f4222c = reader;
    }

    /* JADX INFO: renamed from: a */
    private void m5207a(int i) {
        if (this.f4233n == this.f4232m.length) {
            int[] iArr = new int[this.f4233n * 2];
            int[] iArr2 = new int[this.f4233n * 2];
            String[] strArr = new String[this.f4233n * 2];
            System.arraycopy(this.f4232m, 0, iArr, 0, this.f4233n);
            System.arraycopy(this.f4235p, 0, iArr2, 0, this.f4233n);
            System.arraycopy(this.f4234o, 0, strArr, 0, this.f4233n);
            this.f4232m = iArr;
            this.f4235p = iArr2;
            this.f4234o = strArr;
        }
        int[] iArr3 = this.f4232m;
        int i2 = this.f4233n;
        this.f4233n = i2 + 1;
        iArr3[i2] = i;
    }

    /* JADX INFO: renamed from: a */
    private boolean m5208a(char c) throws IOException {
        switch (c) {
            case '#':
            case '/':
            case ';':
            case '=':
            case '\\':
                m5219v();
            case '\t':
            case '\n':
            case '\f':
            case '\r':
            case ' ':
            case ',':
            case ':':
            case '[':
            case ']':
            case '{':
            case '}':
                return false;
            default:
                return true;
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m5209a(String str) {
        int i;
        while (true) {
            if (this.f4225f + str.length() > this.f4226g && !m5213b(str.length())) {
                return false;
            }
            if (this.f4224e[this.f4225f] != '\n') {
                for (0; i < str.length(); i + 1) {
                    i = this.f4224e[this.f4225f + i] == str.charAt(i) ? i + 1 : 0;
                }
                return true;
            }
            this.f4227h++;
            this.f4228i = this.f4225f + 1;
            this.f4225f++;
        }
    }

    /* JADX INFO: renamed from: b */
    private int m5210b(boolean z) throws IOException {
        char[] cArr = this.f4224e;
        int i = this.f4225f;
        int i2 = this.f4226g;
        while (true) {
            if (i == i2) {
                this.f4225f = i;
                if (!m5213b(1)) {
                    if (z) {
                        throw new EOFException("End of input" + m5221x());
                    }
                    return -1;
                }
                i = this.f4225f;
                i2 = this.f4226g;
            }
            int i3 = i + 1;
            char c = cArr[i];
            if (c == '\n') {
                this.f4227h++;
                this.f4228i = i3;
                i = i3;
            } else if (c == ' ' || c == '\r') {
                i = i3;
            } else if (c == '\t') {
                i = i3;
            } else if (c == '/') {
                this.f4225f = i3;
                if (i3 == i2) {
                    this.f4225f--;
                    boolean zM5213b = m5213b(2);
                    this.f4225f++;
                    if (!zM5213b) {
                        return c;
                    }
                }
                m5219v();
                switch (cArr[this.f4225f]) {
                    case '*':
                        this.f4225f++;
                        if (!m5209a("*/")) {
                            throw m5211b("Unterminated comment");
                        }
                        i = this.f4225f + 2;
                        i2 = this.f4226g;
                        break;
                        break;
                    case '/':
                        this.f4225f++;
                        m5220w();
                        i = this.f4225f;
                        i2 = this.f4226g;
                        break;
                    default:
                        return c;
                }
            } else {
                if (c != '#') {
                    this.f4225f = i3;
                    return c;
                }
                this.f4225f = i3;
                m5219v();
                m5220w();
                i = this.f4225f;
                i2 = this.f4226g;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private IOException m5211b(String str) throws C0613d {
        throw new C0613d(str + m5221x());
    }

    /* JADX INFO: renamed from: b */
    private String m5212b(char c) throws IOException {
        char[] cArr = this.f4224e;
        StringBuilder sb = new StringBuilder();
        do {
            int i = this.f4225f;
            int i2 = this.f4226g;
            int i3 = i;
            while (i3 < i2) {
                int i4 = i3 + 1;
                char c2 = cArr[i3];
                if (c2 == c) {
                    this.f4225f = i4;
                    sb.append(cArr, i, (i4 - i) - 1);
                    return sb.toString();
                }
                if (c2 == '\\') {
                    this.f4225f = i4;
                    sb.append(cArr, i, (i4 - i) - 1);
                    sb.append(m5222y());
                    i = this.f4225f;
                    i2 = this.f4226g;
                    i4 = i;
                } else if (c2 == '\n') {
                    this.f4227h++;
                    this.f4228i = i4;
                }
                i3 = i4;
            }
            sb.append(cArr, i, i3 - i);
            this.f4225f = i3;
        } while (m5213b(1));
        throw m5211b("Unterminated string");
    }

    /* JADX INFO: renamed from: b */
    private boolean m5213b(int i) throws IOException {
        char[] cArr = this.f4224e;
        this.f4228i -= this.f4225f;
        if (this.f4226g != this.f4225f) {
            this.f4226g -= this.f4225f;
            System.arraycopy(cArr, this.f4225f, cArr, 0, this.f4226g);
        } else {
            this.f4226g = 0;
        }
        this.f4225f = 0;
        do {
            int i2 = this.f4222c.read(cArr, this.f4226g, cArr.length - this.f4226g);
            if (i2 == -1) {
                return false;
            }
            this.f4226g = i2 + this.f4226g;
            if (this.f4227h == 0 && this.f4228i == 0 && this.f4226g > 0 && cArr[0] == 65279) {
                this.f4225f++;
                this.f4228i++;
                i++;
            }
        } while (this.f4226g < i);
        return true;
    }

    /* JADX INFO: renamed from: c */
    private void m5214c(char c) throws IOException {
        char[] cArr = this.f4224e;
        do {
            int i = this.f4225f;
            int i2 = this.f4226g;
            int i3 = i;
            while (i3 < i2) {
                int i4 = i3 + 1;
                char c2 = cArr[i3];
                if (c2 == c) {
                    this.f4225f = i4;
                    return;
                }
                if (c2 == '\\') {
                    this.f4225f = i4;
                    m5222y();
                    i4 = this.f4225f;
                    i2 = this.f4226g;
                } else if (c2 == '\n') {
                    this.f4227h++;
                    this.f4228i = i4;
                }
                i3 = i4;
            }
            this.f4225f = i3;
        } while (m5213b(1));
        throw m5211b("Unterminated string");
    }

    /* JADX INFO: renamed from: o */
    private int m5215o() {
        String str;
        String str2;
        int i;
        char c = this.f4224e[this.f4225f];
        if (c == 't' || c == 'T') {
            str = "true";
            str2 = "TRUE";
            i = 5;
        } else if (c == 'f' || c == 'F') {
            str = "false";
            str2 = "FALSE";
            i = 6;
        } else {
            if (c != 'n' && c != 'N') {
                return 0;
            }
            str = "null";
            str2 = "NULL";
            i = 7;
        }
        int length = str.length();
        for (int i2 = 1; i2 < length; i2++) {
            if (this.f4225f + i2 >= this.f4226g && !m5213b(i2 + 1)) {
                return 0;
            }
            char c2 = this.f4224e[this.f4225f + i2];
            if (c2 != str.charAt(i2) && c2 != str2.charAt(i2)) {
                return 0;
            }
        }
        if ((this.f4225f + length < this.f4226g || m5213b(length + 1)) && m5208a(this.f4224e[this.f4225f + length])) {
            return 0;
        }
        this.f4225f += length;
        this.f4221a = i;
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:?, code lost:
    
        return 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:?, code lost:
    
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:
    
        if (r3 != 2) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
    
        if (r4 == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
    
        if (r6 != Long.MIN_VALUE) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
    
        if (r5 == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002d, code lost:
    
        if (r5 == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002f, code lost:
    
        r15.f4229j = r6;
        r15.f4225f += r10;
        r15.f4221a = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0052, code lost:
    
        if (m5208a(r2) == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0054, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00dc, code lost:
    
        r6 = -r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00e0, code lost:
    
        if (r3 == 2) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00e3, code lost:
    
        if (r3 == 4) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00e6, code lost:
    
        if (r3 != 7) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00e8, code lost:
    
        r15.f4230k = r10;
        r15.f4221a = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00f0, code lost:
    
        return 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0082  */
    /* JADX INFO: renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int m5216s() {
        char c;
        char c2;
        boolean z;
        boolean z2;
        char[] cArr = this.f4224e;
        int i = this.f4225f;
        long j = 0;
        boolean z3 = false;
        boolean z4 = true;
        char c3 = 0;
        int i2 = 0;
        int i3 = this.f4226g;
        int i4 = i;
        while (true) {
            if (i4 + i2 != i3) {
                c = cArr[i4 + i2];
                switch (c) {
                    case '+':
                        if (c3 != 5) {
                            return 0;
                        }
                        c2 = 6;
                        z = z4;
                        z2 = z3;
                        continue;
                        continue;
                        i2++;
                        z3 = z2;
                        z4 = z;
                        c3 = c2;
                        break;
                        break;
                    case '-':
                        if (c3 == 0) {
                            c2 = 1;
                            boolean z5 = z4;
                            z2 = true;
                            z = z5;
                            continue;
                            continue;
                        } else {
                            if (c3 != 5) {
                                return 0;
                            }
                            c2 = 6;
                            z = z4;
                            z2 = z3;
                        }
                        i2++;
                        z3 = z2;
                        z4 = z;
                        c3 = c2;
                        break;
                    case '.':
                        if (c3 != 2) {
                            return 0;
                        }
                        c2 = 3;
                        z = z4;
                        z2 = z3;
                        continue;
                        continue;
                        i2++;
                        z3 = z2;
                        z4 = z;
                        c3 = c2;
                        break;
                        break;
                    case 'E':
                    case 'e':
                        if (c3 != 2 && c3 != 4) {
                            return 0;
                        }
                        c2 = 5;
                        z = z4;
                        z2 = z3;
                        continue;
                        continue;
                        i2++;
                        z3 = z2;
                        z4 = z;
                        c3 = c2;
                        break;
                        break;
                    default:
                        if (c >= '0' && c <= '9') {
                            if (c3 == 1 || c3 == 0) {
                                j = -(c - '0');
                                c2 = 2;
                                z = z4;
                                z2 = z3;
                            } else if (c3 == 2) {
                                if (j == 0) {
                                    return 0;
                                }
                                long j2 = (10 * j) - ((long) (c - '0'));
                                boolean z6 = (j > -922337203685477580L || (j == -922337203685477580L && j2 < j)) & z4;
                                z2 = z3;
                                j = j2;
                                char c4 = c3;
                                z = z6;
                                c2 = c4;
                            } else if (c3 == 3) {
                                c2 = 4;
                                z = z4;
                                z2 = z3;
                            } else if (c3 == 5 || c3 == 6) {
                                c2 = 7;
                                z = z4;
                                z2 = z3;
                            } else {
                                c2 = c3;
                                z = z4;
                                z2 = z3;
                            }
                            i2++;
                            z3 = z2;
                            z4 = z;
                            c3 = c2;
                        }
                        break;
                }
            } else {
                if (i2 == cArr.length) {
                    return 0;
                }
                if (m5213b(i2 + 1)) {
                    i4 = this.f4225f;
                    i3 = this.f4226g;
                    c = cArr[i4 + i2];
                    switch (c) {
                        case '+':
                            break;
                        case '-':
                            break;
                        case '.':
                            break;
                        case 'E':
                        case 'e':
                            break;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: t */
    private String m5217t() throws IOException {
        String string;
        StringBuilder sb = null;
        int i = 0;
        while (true) {
            if (this.f4225f + i < this.f4226g) {
                switch (this.f4224e[this.f4225f + i]) {
                    case '\t':
                    case '\n':
                    case '\f':
                    case '\r':
                    case ' ':
                    case ',':
                    case ':':
                    case '[':
                    case ']':
                    case '{':
                    case '}':
                        break;
                    case '#':
                    case '/':
                    case ';':
                    case '=':
                    case '\\':
                        m5219v();
                        break;
                    default:
                        i++;
                        continue;
                }
            } else if (i >= this.f4224e.length) {
                if (sb == null) {
                    sb = new StringBuilder();
                }
                sb.append(this.f4224e, this.f4225f, i);
                this.f4225f = i + this.f4225f;
                if (m5213b(1)) {
                    i = 0;
                } else {
                    i = 0;
                }
            } else if (m5213b(i + 1)) {
            }
        }
        if (sb == null) {
            string = new String(this.f4224e, this.f4225f, i);
        } else {
            sb.append(this.f4224e, this.f4225f, i);
            string = sb.toString();
        }
        this.f4225f = i + this.f4225f;
        return string;
    }

    /* JADX INFO: renamed from: u */
    private void m5218u() throws IOException {
        do {
            int i = 0;
            while (this.f4225f + i < this.f4226g) {
                switch (this.f4224e[this.f4225f + i]) {
                    case '\t':
                    case '\n':
                    case '\f':
                    case '\r':
                    case ' ':
                    case ',':
                    case ':':
                    case '[':
                    case ']':
                    case '{':
                    case '}':
                        break;
                    case '#':
                    case '/':
                    case ';':
                    case '=':
                    case '\\':
                        m5219v();
                        break;
                    default:
                        i++;
                        break;
                }
                this.f4225f = i + this.f4225f;
                return;
            }
            this.f4225f = i + this.f4225f;
        } while (m5213b(1));
    }

    /* JADX INFO: renamed from: v */
    private void m5219v() throws IOException {
        if (!this.f4223d) {
            throw m5211b("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    /* JADX INFO: renamed from: w */
    private void m5220w() {
        char c;
        do {
            if (this.f4225f >= this.f4226g && !m5213b(1)) {
                return;
            }
            char[] cArr = this.f4224e;
            int i = this.f4225f;
            this.f4225f = i + 1;
            c = cArr[i];
            if (c == '\n') {
                this.f4227h++;
                this.f4228i = this.f4225f;
                return;
            }
        } while (c != '\r');
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public String m5221x() {
        return " at line " + (this.f4227h + 1) + " column " + ((this.f4225f - this.f4228i) + 1) + " path " + mo5071p();
    }

    /* JADX INFO: renamed from: y */
    private char m5222y() throws IOException {
        int i;
        if (this.f4225f == this.f4226g && !m5213b(1)) {
            throw m5211b("Unterminated escape sequence");
        }
        char[] cArr = this.f4224e;
        int i2 = this.f4225f;
        this.f4225f = i2 + 1;
        char c = cArr[i2];
        switch (c) {
            case '\n':
                this.f4227h++;
                this.f4228i = this.f4225f;
                return c;
            case '\"':
            case '\'':
            case '/':
            case '\\':
                return c;
            case 'b':
                return '\b';
            case 'f':
                return '\f';
            case C0025a.j.AppCompatTheme_windowActionBarOverlay /* 110 */:
                return '\n';
            case C0025a.j.AppCompatTheme_windowFixedWidthMajor /* 114 */:
                return '\r';
            case C0025a.j.AppCompatTheme_windowMinWidthMajor /* 116 */:
                return '\t';
            case C0025a.j.AppCompatTheme_windowMinWidthMinor /* 117 */:
                if (this.f4225f + 4 > this.f4226g && !m5213b(4)) {
                    throw m5211b("Unterminated escape sequence");
                }
                int i3 = this.f4225f;
                int i4 = i3 + 4;
                char c2 = 0;
                for (int i5 = i3; i5 < i4; i5++) {
                    char c3 = this.f4224e[i5];
                    char c4 = (char) (c2 << 4);
                    if (c3 >= '0' && c3 <= '9') {
                        i = c3 - '0';
                    } else if (c3 >= 'a' && c3 <= 'f') {
                        i = (c3 - 'a') + 10;
                    } else {
                        if (c3 < 'A' || c3 > 'F') {
                            throw new NumberFormatException("\\u" + new String(this.f4224e, this.f4225f, 4));
                        }
                        i = (c3 - 'A') + 10;
                    }
                    c2 = (char) (c4 + i);
                }
                this.f4225f += 4;
                return c2;
            default:
                throw m5211b("Invalid escape sequence");
        }
    }

    /* JADX INFO: renamed from: z */
    private void m5223z() throws IOException {
        m5210b(true);
        this.f4225f--;
        if (this.f4225f + f4220b.length <= this.f4226g || m5213b(f4220b.length)) {
            for (int i = 0; i < f4220b.length; i++) {
                if (this.f4224e[this.f4225f + i] != f4220b[i]) {
                    return;
                }
            }
            this.f4225f += f4220b.length;
        }
    }

    /* JADX INFO: renamed from: a */
    public void mo5056a() throws IOException {
        int iM5226r = this.f4221a;
        if (iM5226r == 0) {
            iM5226r = m5226r();
        }
        if (iM5226r != 3) {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + mo5061f() + m5221x());
        }
        m5207a(1);
        this.f4235p[this.f4233n - 1] = 0;
        this.f4221a = 0;
    }

    /* JADX INFO: renamed from: a */
    public final void m5224a(boolean z) {
        this.f4223d = z;
    }

    /* JADX INFO: renamed from: b */
    public void mo5057b() throws IOException {
        int iM5226r = this.f4221a;
        if (iM5226r == 0) {
            iM5226r = m5226r();
        }
        if (iM5226r != 4) {
            throw new IllegalStateException("Expected END_ARRAY but was " + mo5061f() + m5221x());
        }
        this.f4233n--;
        int[] iArr = this.f4235p;
        int i = this.f4233n - 1;
        iArr[i] = iArr[i] + 1;
        this.f4221a = 0;
    }

    /* JADX INFO: renamed from: c */
    public void mo5058c() throws IOException {
        int iM5226r = this.f4221a;
        if (iM5226r == 0) {
            iM5226r = m5226r();
        }
        if (iM5226r != 1) {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + mo5061f() + m5221x());
        }
        m5207a(3);
        this.f4221a = 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f4221a = 0;
        this.f4232m[0] = 8;
        this.f4233n = 1;
        this.f4222c.close();
    }

    /* JADX INFO: renamed from: d */
    public void mo5059d() throws IOException {
        int iM5226r = this.f4221a;
        if (iM5226r == 0) {
            iM5226r = m5226r();
        }
        if (iM5226r != 2) {
            throw new IllegalStateException("Expected END_OBJECT but was " + mo5061f() + m5221x());
        }
        this.f4233n--;
        this.f4234o[this.f4233n] = null;
        int[] iArr = this.f4235p;
        int i = this.f4233n - 1;
        iArr[i] = iArr[i] + 1;
        this.f4221a = 0;
    }

    /* JADX INFO: renamed from: e */
    public boolean mo5060e() throws IOException {
        int iM5226r = this.f4221a;
        if (iM5226r == 0) {
            iM5226r = m5226r();
        }
        return (iM5226r == 2 || iM5226r == 4) ? false : true;
    }

    /* JADX INFO: renamed from: f */
    public EnumC0611b mo5061f() throws IOException {
        int iM5226r = this.f4221a;
        if (iM5226r == 0) {
            iM5226r = m5226r();
        }
        switch (iM5226r) {
            case 1:
                return EnumC0611b.BEGIN_OBJECT;
            case 2:
                return EnumC0611b.END_OBJECT;
            case 3:
                return EnumC0611b.BEGIN_ARRAY;
            case 4:
                return EnumC0611b.END_ARRAY;
            case 5:
            case 6:
                return EnumC0611b.BOOLEAN;
            case 7:
                return EnumC0611b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return EnumC0611b.STRING;
            case 12:
            case 13:
            case 14:
                return EnumC0611b.NAME;
            case 15:
            case 16:
                return EnumC0611b.NUMBER;
            case 17:
                return EnumC0611b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    /* JADX INFO: renamed from: g */
    public String mo5062g() throws IOException {
        String strM5212b;
        int iM5226r = this.f4221a;
        if (iM5226r == 0) {
            iM5226r = m5226r();
        }
        if (iM5226r == 14) {
            strM5212b = m5217t();
        } else if (iM5226r == 12) {
            strM5212b = m5212b('\'');
        } else {
            if (iM5226r != 13) {
                throw new IllegalStateException("Expected a name but was " + mo5061f() + m5221x());
            }
            strM5212b = m5212b('\"');
        }
        this.f4221a = 0;
        this.f4234o[this.f4233n - 1] = strM5212b;
        return strM5212b;
    }

    /* JADX INFO: renamed from: h */
    public String mo5063h() throws IOException {
        String str;
        int iM5226r = this.f4221a;
        if (iM5226r == 0) {
            iM5226r = m5226r();
        }
        if (iM5226r == 10) {
            str = m5217t();
        } else if (iM5226r == 8) {
            str = m5212b('\'');
        } else if (iM5226r == 9) {
            str = m5212b('\"');
        } else if (iM5226r == 11) {
            str = this.f4231l;
            this.f4231l = null;
        } else if (iM5226r == 15) {
            str = Long.toString(this.f4229j);
        } else {
            if (iM5226r != 16) {
                throw new IllegalStateException("Expected a string but was " + mo5061f() + m5221x());
            }
            str = new String(this.f4224e, this.f4225f, this.f4230k);
            this.f4225f += this.f4230k;
        }
        this.f4221a = 0;
        int[] iArr = this.f4235p;
        int i = this.f4233n - 1;
        iArr[i] = iArr[i] + 1;
        return str;
    }

    /* JADX INFO: renamed from: i */
    public boolean mo5064i() throws IOException {
        int iM5226r = this.f4221a;
        if (iM5226r == 0) {
            iM5226r = m5226r();
        }
        if (iM5226r == 5) {
            this.f4221a = 0;
            int[] iArr = this.f4235p;
            int i = this.f4233n - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iM5226r != 6) {
            throw new IllegalStateException("Expected a boolean but was " + mo5061f() + m5221x());
        }
        this.f4221a = 0;
        int[] iArr2 = this.f4235p;
        int i2 = this.f4233n - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return false;
    }

    /* JADX INFO: renamed from: j */
    public void mo5065j() throws IOException {
        int iM5226r = this.f4221a;
        if (iM5226r == 0) {
            iM5226r = m5226r();
        }
        if (iM5226r != 7) {
            throw new IllegalStateException("Expected null but was " + mo5061f() + m5221x());
        }
        this.f4221a = 0;
        int[] iArr = this.f4235p;
        int i = this.f4233n - 1;
        iArr[i] = iArr[i] + 1;
    }

    /* JADX INFO: renamed from: k */
    public double mo5066k() throws IOException {
        int iM5226r = this.f4221a;
        if (iM5226r == 0) {
            iM5226r = m5226r();
        }
        if (iM5226r == 15) {
            this.f4221a = 0;
            int[] iArr = this.f4235p;
            int i = this.f4233n - 1;
            iArr[i] = iArr[i] + 1;
            return this.f4229j;
        }
        if (iM5226r == 16) {
            this.f4231l = new String(this.f4224e, this.f4225f, this.f4230k);
            this.f4225f += this.f4230k;
        } else if (iM5226r == 8 || iM5226r == 9) {
            this.f4231l = m5212b(iM5226r == 8 ? '\'' : '\"');
        } else if (iM5226r == 10) {
            this.f4231l = m5217t();
        } else if (iM5226r != 11) {
            throw new IllegalStateException("Expected a double but was " + mo5061f() + m5221x());
        }
        this.f4221a = 11;
        double d = Double.parseDouble(this.f4231l);
        if (!this.f4223d && (Double.isNaN(d) || Double.isInfinite(d))) {
            throw new C0613d("JSON forbids NaN and infinities: " + d + m5221x());
        }
        this.f4231l = null;
        this.f4221a = 0;
        int[] iArr2 = this.f4235p;
        int i2 = this.f4233n - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return d;
    }

    /* JADX INFO: renamed from: l */
    public long mo5067l() throws IOException {
        int iM5226r = this.f4221a;
        if (iM5226r == 0) {
            iM5226r = m5226r();
        }
        if (iM5226r == 15) {
            this.f4221a = 0;
            int[] iArr = this.f4235p;
            int i = this.f4233n - 1;
            iArr[i] = iArr[i] + 1;
            return this.f4229j;
        }
        if (iM5226r == 16) {
            this.f4231l = new String(this.f4224e, this.f4225f, this.f4230k);
            this.f4225f += this.f4230k;
        } else {
            if (iM5226r != 8 && iM5226r != 9 && iM5226r != 10) {
                throw new IllegalStateException("Expected a long but was " + mo5061f() + m5221x());
            }
            if (iM5226r == 10) {
                this.f4231l = m5217t();
            } else {
                this.f4231l = m5212b(iM5226r == 8 ? '\'' : '\"');
            }
            try {
                long j = Long.parseLong(this.f4231l);
                this.f4221a = 0;
                int[] iArr2 = this.f4235p;
                int i2 = this.f4233n - 1;
                iArr2[i2] = iArr2[i2] + 1;
                return j;
            } catch (NumberFormatException e) {
            }
        }
        this.f4221a = 11;
        double d = Double.parseDouble(this.f4231l);
        long j2 = (long) d;
        if (j2 != d) {
            throw new NumberFormatException("Expected a long but was " + this.f4231l + m5221x());
        }
        this.f4231l = null;
        this.f4221a = 0;
        int[] iArr3 = this.f4235p;
        int i3 = this.f4233n - 1;
        iArr3[i3] = iArr3[i3] + 1;
        return j2;
    }

    /* JADX INFO: renamed from: m */
    public int mo5068m() throws IOException {
        int iM5226r = this.f4221a;
        if (iM5226r == 0) {
            iM5226r = m5226r();
        }
        if (iM5226r == 15) {
            int i = (int) this.f4229j;
            if (this.f4229j != i) {
                throw new NumberFormatException("Expected an int but was " + this.f4229j + m5221x());
            }
            this.f4221a = 0;
            int[] iArr = this.f4235p;
            int i2 = this.f4233n - 1;
            iArr[i2] = iArr[i2] + 1;
            return i;
        }
        if (iM5226r == 16) {
            this.f4231l = new String(this.f4224e, this.f4225f, this.f4230k);
            this.f4225f += this.f4230k;
        } else {
            if (iM5226r != 8 && iM5226r != 9 && iM5226r != 10) {
                throw new IllegalStateException("Expected an int but was " + mo5061f() + m5221x());
            }
            if (iM5226r == 10) {
                this.f4231l = m5217t();
            } else {
                this.f4231l = m5212b(iM5226r == 8 ? '\'' : '\"');
            }
            try {
                int i3 = Integer.parseInt(this.f4231l);
                this.f4221a = 0;
                int[] iArr2 = this.f4235p;
                int i4 = this.f4233n - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return i3;
            } catch (NumberFormatException e) {
            }
        }
        this.f4221a = 11;
        double d = Double.parseDouble(this.f4231l);
        int i5 = (int) d;
        if (i5 != d) {
            throw new NumberFormatException("Expected an int but was " + this.f4231l + m5221x());
        }
        this.f4231l = null;
        this.f4221a = 0;
        int[] iArr3 = this.f4235p;
        int i6 = this.f4233n - 1;
        iArr3[i6] = iArr3[i6] + 1;
        return i5;
    }

    /* JADX INFO: renamed from: n */
    public void mo5069n() throws IOException {
        int i = 0;
        do {
            int iM5226r = this.f4221a;
            if (iM5226r == 0) {
                iM5226r = m5226r();
            }
            if (iM5226r == 3) {
                m5207a(1);
                i++;
            } else if (iM5226r == 1) {
                m5207a(3);
                i++;
            } else if (iM5226r == 4 || iM5226r == 2) {
                this.f4233n--;
                i--;
            } else if (iM5226r == 14 || iM5226r == 10) {
                m5218u();
            } else if (iM5226r == 8 || iM5226r == 12) {
                m5214c('\'');
            } else if (iM5226r == 9 || iM5226r == 13) {
                m5214c('\"');
            } else if (iM5226r == 16) {
                this.f4225f += this.f4230k;
            }
            this.f4221a = 0;
        } while (i != 0);
        int[] iArr = this.f4235p;
        int i2 = this.f4233n - 1;
        iArr[i2] = iArr[i2] + 1;
        this.f4234o[this.f4233n - 1] = "null";
    }

    /* JADX INFO: renamed from: p */
    public String mo5071p() {
        StringBuilder sbAppend = new StringBuilder().append('$');
        int i = this.f4233n;
        for (int i2 = 0; i2 < i; i2++) {
            switch (this.f4232m[i2]) {
                case 1:
                case 2:
                    sbAppend.append('[').append(this.f4235p[i2]).append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sbAppend.append('.');
                    if (this.f4234o[i2] != null) {
                        sbAppend.append(this.f4234o[i2]);
                    }
                    break;
            }
        }
        return sbAppend.toString();
    }

    /* JADX INFO: renamed from: q */
    public final boolean m5225q() {
        return this.f4223d;
    }

    /* JADX INFO: renamed from: r */
    int m5226r() throws IOException {
        int i = this.f4232m[this.f4233n - 1];
        if (i == 1) {
            this.f4232m[this.f4233n - 1] = 2;
        } else if (i == 2) {
            switch (m5210b(true)) {
                case 44:
                    break;
                case 59:
                    m5219v();
                    break;
                case 93:
                    this.f4221a = 4;
                    return 4;
                default:
                    throw m5211b("Unterminated array");
            }
        } else {
            if (i == 3 || i == 5) {
                this.f4232m[this.f4233n - 1] = 4;
                if (i == 5) {
                    switch (m5210b(true)) {
                        case 44:
                            break;
                        case 59:
                            m5219v();
                            break;
                        case 125:
                            this.f4221a = 2;
                            return 2;
                        default:
                            throw m5211b("Unterminated object");
                    }
                }
                int iM5210b = m5210b(true);
                switch (iM5210b) {
                    case 34:
                        this.f4221a = 13;
                        return 13;
                    case 39:
                        m5219v();
                        this.f4221a = 12;
                        return 12;
                    case 125:
                        if (i == 5) {
                            throw m5211b("Expected name");
                        }
                        this.f4221a = 2;
                        return 2;
                    default:
                        m5219v();
                        this.f4225f--;
                        if (!m5208a((char) iM5210b)) {
                            throw m5211b("Expected name");
                        }
                        this.f4221a = 14;
                        return 14;
                }
            }
            if (i == 4) {
                this.f4232m[this.f4233n - 1] = 5;
                switch (m5210b(true)) {
                    case 58:
                        break;
                    case 59:
                    case 60:
                    default:
                        throw m5211b("Expected ':'");
                    case 61:
                        m5219v();
                        if ((this.f4225f < this.f4226g || m5213b(1)) && this.f4224e[this.f4225f] == '>') {
                            this.f4225f++;
                        }
                        break;
                }
            } else if (i == 6) {
                if (this.f4223d) {
                    m5223z();
                }
                this.f4232m[this.f4233n - 1] = 7;
            } else if (i == 7) {
                if (m5210b(false) == -1) {
                    this.f4221a = 17;
                    return 17;
                }
                m5219v();
                this.f4225f--;
            } else if (i == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        switch (m5210b(true)) {
            case 34:
                this.f4221a = 9;
                return 9;
            case 39:
                m5219v();
                this.f4221a = 8;
                return 8;
            case 44:
            case 59:
                break;
            case 91:
                this.f4221a = 3;
                return 3;
            case 93:
                if (i == 1) {
                    this.f4221a = 4;
                    return 4;
                }
                break;
            case 123:
                this.f4221a = 1;
                return 1;
            default:
                this.f4225f--;
                int iM5215o = m5215o();
                if (iM5215o != 0) {
                    return iM5215o;
                }
                int iM5216s = m5216s();
                if (iM5216s != 0) {
                    return iM5216s;
                }
                if (!m5208a(this.f4224e[this.f4225f])) {
                    throw m5211b("Expected value");
                }
                m5219v();
                this.f4221a = 10;
                return 10;
        }
        if (i != 1 && i != 2) {
            throw m5211b("Unexpected value");
        }
        m5219v();
        this.f4225f--;
        this.f4221a = 7;
        return 7;
    }

    public String toString() {
        return getClass().getSimpleName() + m5221x();
    }
}
