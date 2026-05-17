package ca.toadlybroodledev.sublist;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.p006a.DialogInterfaceOnCancelListenerC0153i;
import android.text.format.DateFormat;
import android.widget.DatePicker;
import android.widget.TimePicker;
import ca.toadlybroodledev.sublist.p031b.InterfaceC0549a;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: ca.toadlybroodledev.sublist.s */
/* JADX INFO: loaded from: classes.dex */
class C0572s {

    /* JADX INFO: renamed from: a */
    static long f3991a;

    /* JADX INFO: renamed from: b */
    private static InterfaceC0549a f3992b;

    /* JADX INFO: renamed from: c */
    private static long f3993c;

    /* JADX INFO: renamed from: ca.toadlybroodledev.sublist.s$a */
    public static class a extends DialogInterfaceOnCancelListenerC0153i implements DatePickerDialog.OnDateSetListener {
        @Override // android.support.v4.p006a.DialogInterfaceOnCancelListenerC0153i
        /* JADX INFO: renamed from: c */
        public Dialog mo875c(Bundle bundle) {
            Calendar calendar = Calendar.getInstance();
            return new DatePickerDialog(m969k(), this, calendar.get(1), calendar.get(2), calendar.get(5));
        }

        @Override // android.app.DatePickerDialog.OnDateSetListener
        public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
            Calendar calendar = Calendar.getInstance();
            calendar.set(i, i2, i3, 0, 0, 0);
            C0572s.f3991a = calendar.getTimeInMillis();
            new b().mo870a(m973m(), "timePicker");
        }
    }

    /* JADX INFO: renamed from: ca.toadlybroodledev.sublist.s$b */
    public static class b extends DialogInterfaceOnCancelListenerC0153i implements TimePickerDialog.OnTimeSetListener {

        /* JADX INFO: renamed from: ae */
        final Calendar f3994ae = Calendar.getInstance();

        /* JADX INFO: renamed from: af */
        int f3995af = this.f3994ae.get(11);

        /* JADX INFO: renamed from: ag */
        int f3996ag = this.f3994ae.get(12);

        @Override // android.support.v4.p006a.DialogInterfaceOnCancelListenerC0153i
        /* JADX INFO: renamed from: c */
        public Dialog mo875c(Bundle bundle) {
            return new TimePickerDialog(m969k(), this, this.f3995af, this.f3996ag, DateFormat.is24HourFormat(m969k()));
        }

        @Override // android.app.TimePickerDialog.OnTimeSetListener
        public void onTimeSet(TimePicker timePicker, int i, int i2) {
            C0572s.f3991a += C0572s.m5020f(i) + C0572s.m5018e(i2);
            C0572s.f3992b.mo4788z().m4861b();
        }
    }

    /* JADX INFO: renamed from: a */
    static int m5006a(int i) {
        return (int) TimeUnit.DAYS.toHours(i);
    }

    /* JADX INFO: renamed from: a */
    static long m5007a() {
        try {
            return f3992b.mo4775m().getPackageManager().getPackageInfo("ca.toadlybroodledev.sublist", 0).firstInstallTime;
        } catch (PackageManager.NameNotFoundException e) {
            e.getMessage();
            return 0L;
        }
    }

    /* JADX INFO: renamed from: a */
    static String m5008a(long j) {
        TimeZone timeZone = Calendar.getInstance().getTimeZone();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        simpleDateFormat.setTimeZone(timeZone);
        return simpleDateFormat.format(new Date(j));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    static void m5009a(Context context) {
        f3992b = (InterfaceC0549a) context;
    }

    /* JADX INFO: renamed from: b */
    static int m5010b(int i) {
        return (int) TimeUnit.HOURS.toDays(i);
    }

    /* JADX INFO: renamed from: b */
    static String m5011b(long j) {
        TimeZone timeZone = Calendar.getInstance().getTimeZone();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        simpleDateFormat.setTimeZone(timeZone);
        return simpleDateFormat.format(new Date(j));
    }

    /* JADX INFO: renamed from: b */
    static boolean m5012b() {
        if (m5014c() - f3993c <= 30000) {
            return false;
        }
        f3993c = m5014c();
        return true;
    }

    /* JADX INFO: renamed from: c */
    static int m5013c(long j) {
        return (int) TimeUnit.MILLISECONDS.toHours(j);
    }

    /* JADX INFO: renamed from: c */
    static long m5014c() {
        return Calendar.getInstance(TimeZone.getTimeZone("UTC")).getTime().getTime();
    }

    /* JADX INFO: renamed from: d */
    static long m5016d() {
        return Calendar.getInstance().getTime().getTime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static long m5018e(int i) {
        return TimeUnit.MINUTES.toMillis(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static long m5020f(int i) {
        return TimeUnit.HOURS.toMillis(i);
    }
}
