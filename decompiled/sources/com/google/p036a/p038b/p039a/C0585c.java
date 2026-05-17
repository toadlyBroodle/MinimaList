package com.google.p036a.p038b.p039a;

import com.google.p036a.AbstractC0629t;
import com.google.p036a.C0614e;
import com.google.p036a.C0627r;
import com.google.p036a.InterfaceC0630u;
import com.google.p036a.p038b.p039a.p040a.C0583a;
import com.google.p036a.p041c.C0608a;
import com.google.p036a.p042d.C0610a;
import com.google.p036a.p042d.C0612c;
import com.google.p036a.p042d.EnumC0611b;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: renamed from: com.google.a.b.a.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0585c extends AbstractC0629t<Date> {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC0630u f4006a = new InterfaceC0630u() { // from class: com.google.a.b.a.c.1
        @Override // com.google.p036a.InterfaceC0630u
        /* JADX INFO: renamed from: a */
        public <T> AbstractC0629t<T> mo5041a(C0614e c0614e, C0608a<T> c0608a) {
            if (c0608a.m5204a() == Date.class) {
                return new C0585c();
            }
            return null;
        }
    };

    /* JADX INFO: renamed from: b */
    private final DateFormat f4007b = DateFormat.getDateTimeInstance(2, 2, Locale.US);

    /* JADX INFO: renamed from: c */
    private final DateFormat f4008c = DateFormat.getDateTimeInstance(2, 2);

    /* JADX INFO: renamed from: a */
    private synchronized Date m5048a(String str) {
        Date dateM5044a;
        try {
            dateM5044a = this.f4008c.parse(str);
        } catch (ParseException e) {
            try {
                dateM5044a = this.f4007b.parse(str);
            } catch (ParseException e2) {
                try {
                    dateM5044a = C0583a.m5044a(str, new ParsePosition(0));
                } catch (ParseException e3) {
                    throw new C0627r(str, e3);
                }
            }
        }
        return dateM5044a;
    }

    @Override // com.google.p036a.AbstractC0629t
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Date mo5040b(C0610a c0610a) throws IOException {
        if (c0610a.mo5061f() != EnumC0611b.NULL) {
            return m5048a(c0610a.mo5063h());
        }
        c0610a.mo5065j();
        return null;
    }

    @Override // com.google.p036a.AbstractC0629t
    /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public synchronized void mo5039a(C0612c c0612c, Date date) {
        if (date == null) {
            c0612c.mo5085f();
        } else {
            c0612c.mo5081b(this.f4007b.format(date));
        }
    }
}
