package ca.toadlybroodledev.sublist;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import ca.toadlybroodledev.sublist.iface.HostContract;
import ca.toadlybroodledev.sublist.iface.OutlineHost;
import ca.toadlybroodledev.sublist.model.OutlineRow;

// Ported from decompiled C0557d. Per-row view widget; wraps EditText + reminder scheduling.
public class OutlineRowView {

    HostContract f3818a;
    OutlineHost f3819b;
    LinearLayout f3820c;
    ImageView f3821d;
    public EditText f3822e;
    public boolean f3823f;   // complete
    public boolean f3824g;   // collapsed
    public long f3825h;      // reminder timestamp
    public boolean f3826i;   // isInstr

    private final String f3827j = "fuckn" + getClass().getSimpleName();
    private int f3828k;      // indent

    OutlineRowView(HostContract host, OutlineHost outlineHost, OutlineRow row) {
        this.f3818a = host;
        this.f3819b = outlineHost;
        this.f3820c = (LinearLayout) ((LayoutInflater) this.f3818a.mo4775m()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE))
                .inflate(R.layout.entry_layout, (ViewGroup) null);
        this.f3821d = (ImageView) this.f3820c.getChildAt(0);
        this.f3822e = (EditText) this.f3820c.getChildAt(1);
        this.f3828k = row.indent;
        this.f3823f = row.complete;
        this.f3824g = row.collapsed;
        this.f3822e.setText(row.text);
        this.f3825h = row.reminder;
        this.f3826i = row.isInstr;
        this.f3821d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OutlineRowView.this.f3819b.mo4849af()
                        .m4994a(OutlineRowView.this, !OutlineRowView.this.f3824g);
                OutlineRowView.this.m4858e();
            }
        });
        this.f3820c.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                OutlineRowView.this.m4858e();
                return false;
            }
        });
        if (row.isInstr) {
            return;
        }
        this.f3820c.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                OutlineRowView.this.m4857d();
                return true;
            }
        });
        this.f3821d.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                OutlineRowView.this.m4857d();
                return true;
            }
        });
        this.f3822e.addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable editable) {
                if (OutlineRowView.this.f3822e.getLayout().getLineCount() > 3) {
                    OutlineRowView.this.f3822e.getText()
                            .delete(OutlineRowView.this.f3822e.getText().length() - 1,
                                    OutlineRowView.this.f3822e.getText().length());
                }
                OutlineRowView.this.f3818a.mo4779q().m4976a(false, false);
            }

            @Override
            public void beforeTextChanged(CharSequence c, int i, int i2, int i3) {
            }

            @Override
            public void onTextChanged(CharSequence c, int i, int i2, int i3) {
            }
        });
        this.f3822e.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                try {
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (i != 6) {
                    if (i == 5) {
                        if (AppSettings.f3950m == AppSettings.KeyboardAction.NEW_ENTRY.m4960a()) {
                            OutlineRowView.this.f3819b.mo4851al();
                            OutlineRowView.this.f3819b.mo4852am();
                        }
                    }
                    return false;
                }
                if (AppSettings.f3950m == AppSettings.KeyboardAction.CLOSE_KEYS.m4960a()) {
                    OutlineRowView.this.f3818a.mo4761a(textView, false);
                }
                return true;
            }
        });
        this.f3822e.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean z) {
                if (z) {
                    OutlineRowView.this.m4858e();
                }
            }
        });
    }

    private void m4857d() {
        SublistFragment frag = this.f3818a.mo4787y();
        if (frag.mo4849af() != null) {
            frag.m4901a(this);
        }
    }

    private void m4858e() {
        if (this.f3819b.mo4849af() != null) {
            this.f3818a.mo4763a(this);
        }
    }

    public int m4859a() {
        return this.f3828k;
    }

    void m4860a(int i) {
        this.f3828k = i;
    }

    void m4861b() {
        Context ctx = this.f3818a.mo4775m();
        Intent intent = new Intent(ctx, ReceiverNotification.class);
        intent.putExtra("notification", this.f3822e.getText());
        PendingIntent pi = PendingIntent.getBroadcast(ctx, hashCode(), intent, 0);
        AlarmManager am = (AlarmManager) ctx.getSystemService(Context.ALARM_SERVICE);
        if (DateTimeUtil.f3991a <= DateTimeUtil.m5016d()) {
            Toast.makeText(ctx, R.string.choose_future_date_time, Toast.LENGTH_LONG).show();
            return;
        }
        this.f3825h = DateTimeUtil.f3991a;
        am.set(0, this.f3825h, pi);
        this.f3819b.mo4852am();
        Toast.makeText(ctx,
                this.f3818a.mo4770b(Integer.valueOf(R.string.reminder_set_for))
                        + DateTimeUtil.m5008a(DateTimeUtil.f3991a),
                Toast.LENGTH_LONG).show();
        this.f3818a.mo4759F();
    }

    void m4862c() {
        Context ctx = this.f3818a.mo4775m();
        Intent intent = new Intent(ctx, ReceiverNotification.class);
        intent.putExtra("notification", this.f3822e.getText());
        ((AlarmManager) ctx.getSystemService(Context.ALARM_SERVICE))
                .cancel(PendingIntent.getBroadcast(ctx, hashCode(), intent, 0));
        this.f3825h = 0L;
        this.f3818a.mo4759F();
        Toast.makeText(ctx, R.string.reminder_canceled, Toast.LENGTH_SHORT).show();
    }
}
