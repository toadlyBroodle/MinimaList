package com.google.p036a.p038b.p039a;

import com.google.p036a.AbstractC0629t;
import com.google.p036a.C0614e;
import com.google.p036a.C0627r;
import com.google.p036a.InterfaceC0630u;
import com.google.p036a.p041c.C0608a;
import com.google.p036a.p042d.C0610a;
import com.google.p036a.p042d.C0612c;
import com.google.p036a.p042d.EnumC0611b;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* JADX INFO: renamed from: com.google.a.b.a.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0592j extends AbstractC0629t<Date> {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC0630u f4046a = new InterfaceC0630u() { // from class: com.google.a.b.a.j.1
        @Override // com.google.p036a.InterfaceC0630u
        /* JADX INFO: renamed from: a */
        public <T> AbstractC0629t<T> mo5041a(C0614e c0614e, C0608a<T> c0608a) {
            if (c0608a.m5204a() == Date.class) {
                return new C0592j();
            }
            return null;
        }
    };

    /* JADX INFO: renamed from: b */
    private final DateFormat f4047b = new SimpleDateFormat("MMM d, yyyy");

    @Override // com.google.p036a.AbstractC0629t
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public synchronized Date mo5040b(C0610a c0610a) {
        Date date;
        if (c0610a.mo5061f() == EnumC0611b.NULL) {
            c0610a.mo5065j();
            date = null;
        } else {
            try {
                date = new Date(this.f4047b.parse(c0610a.mo5063h()).getTime());
            } catch (ParseException e) {
                throw new C0627r(e);
            }
        }
        return date;
    }

    @Override // com.google.p036a.AbstractC0629t
    /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public synchronized void mo5039a(C0612c c0612c, Date date) {
        c0612c.mo5081b(date == null ? null : this.f4047b.format((java.util.Date) date));
    }
}
