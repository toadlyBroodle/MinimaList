package ca.toadlybroodle.minimalist;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.widget.DatePicker;
import android.widget.TimePicker;
import androidx.fragment.app.DialogFragment;
import ca.toadlybroodle.minimalist.iface.HostContract;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

// Ported from decompiled C0572s. Date/time helpers + reminder picker dialogs.
class DateTimeUtil {

    static long f3991a;
    private static HostContract f3992b;
    private static long f3993c;

    public static class a extends DialogFragment implements DatePickerDialog.OnDateSetListener {
        @Override
        public Dialog onCreateDialog(Bundle bundle) {
            Calendar calendar = Calendar.getInstance();
            return new DatePickerDialog(getActivity(), this,
                    calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH),
                    calendar.get(Calendar.DAY_OF_MONTH));
        }

        @Override
        public void onDateSet(DatePicker datePicker, int year, int month, int day) {
            Calendar calendar = Calendar.getInstance();
            calendar.set(year, month, day, 0, 0, 0);
            DateTimeUtil.f3991a = calendar.getTimeInMillis();
            new b().show(getParentFragmentManager(), "timePicker");
        }
    }

    public static class b extends DialogFragment implements TimePickerDialog.OnTimeSetListener {

        final Calendar f3994ae = Calendar.getInstance();
        int f3995af = this.f3994ae.get(Calendar.HOUR_OF_DAY);
        int f3996ag = this.f3994ae.get(Calendar.MINUTE);

        @Override
        public Dialog onCreateDialog(Bundle bundle) {
            return new TimePickerDialog(getActivity(), this, this.f3995af, this.f3996ag,
                    DateFormat.is24HourFormat(getActivity()));
        }

        @Override
        public void onTimeSet(TimePicker timePicker, int hour, int minute) {
            DateTimeUtil.f3991a += DateTimeUtil.m5020f(hour) + DateTimeUtil.m5018e(minute);
            DateTimeUtil.f3992b.mo4788z().m4861b();
        }
    }

    static int m5006a(int i) {
        return (int) TimeUnit.DAYS.toHours(i);
    }

    static long m5007a() {
        try {
            android.content.Context ctx = f3992b.mo4775m();
            return ctx.getPackageManager()
                    .getPackageInfo(ctx.getPackageName(), 0).firstInstallTime;
        } catch (PackageManager.NameNotFoundException e) {
            e.getMessage();
            return 0L;
        }
    }

    static String m5008a(long j) {
        TimeZone timeZone = Calendar.getInstance().getTimeZone();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        sdf.setTimeZone(timeZone);
        return sdf.format(new Date(j));
    }

    static void m5009a(Context context) {
        f3992b = (HostContract) context;
    }

    static int m5010b(int i) {
        return (int) TimeUnit.HOURS.toDays(i);
    }

    static String m5011b(long j) {
        TimeZone timeZone = Calendar.getInstance().getTimeZone();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        sdf.setTimeZone(timeZone);
        return sdf.format(new Date(j));
    }

    static boolean m5012b() {
        if (m5014c() - f3993c <= 30000) {
            return false;
        }
        f3993c = m5014c();
        return true;
    }

    static int m5013c(long j) {
        return (int) TimeUnit.MILLISECONDS.toHours(j);
    }

    static long m5014c() {
        return Calendar.getInstance(TimeZone.getTimeZone("UTC")).getTime().getTime();
    }

    static long m5016d() {
        return Calendar.getInstance().getTime().getTime();
    }

    static long m5018e(int i) {
        return TimeUnit.MINUTES.toMillis(i);
    }

    static long m5020f(int i) {
        return TimeUnit.HOURS.toMillis(i);
    }
}
