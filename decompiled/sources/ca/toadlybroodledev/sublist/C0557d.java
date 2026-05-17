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
import ca.toadlybroodledev.sublist.C0566m;
import ca.toadlybroodledev.sublist.p031b.InterfaceC0549a;
import ca.toadlybroodledev.sublist.p031b.InterfaceC0552d;
import ca.toadlybroodledev.sublist.p032c.C0554a;

/* JADX INFO: renamed from: ca.toadlybroodledev.sublist.d */
/* JADX INFO: loaded from: classes.dex */
public class C0557d {

    /* JADX INFO: renamed from: a */
    InterfaceC0549a f3818a;

    /* JADX INFO: renamed from: b */
    InterfaceC0552d f3819b;

    /* JADX INFO: renamed from: c */
    LinearLayout f3820c;

    /* JADX INFO: renamed from: d */
    ImageView f3821d;

    /* JADX INFO: renamed from: e */
    public EditText f3822e;

    /* JADX INFO: renamed from: f */
    public boolean f3823f;

    /* JADX INFO: renamed from: g */
    public boolean f3824g;

    /* JADX INFO: renamed from: h */
    public long f3825h;

    /* JADX INFO: renamed from: i */
    boolean f3826i;

    /* JADX INFO: renamed from: j */
    private final String f3827j = "fuckn" + getClass().getSimpleName();

    /* JADX INFO: renamed from: k */
    private int f3828k;

    C0557d(InterfaceC0549a interfaceC0549a, InterfaceC0552d interfaceC0552d, C0554a c0554a) {
        this.f3818a = interfaceC0549a;
        this.f3819b = interfaceC0552d;
        this.f3820c = (LinearLayout) ((LayoutInflater) this.f3818a.mo4775m().getSystemService("layout_inflater")).inflate(R.layout.entry_layout, (ViewGroup) null);
        this.f3821d = (ImageView) this.f3820c.getChildAt(0);
        this.f3822e = (EditText) this.f3820c.getChildAt(1);
        this.f3828k = c0554a.indent;
        this.f3823f = c0554a.complete;
        this.f3824g = c0554a.collapsed;
        this.f3822e.setText(c0554a.text);
        this.f3825h = c0554a.reminder;
        this.f3826i = c0554a.isInstr;
        this.f3821d.setOnClickListener(new View.OnClickListener() { // from class: ca.toadlybroodledev.sublist.d.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                C0557d.this.f3819b.mo4849af().m4994a(C0557d.this, !C0557d.this.f3824g);
                C0557d.this.m4858e();
            }
        });
        this.f3820c.setOnTouchListener(new View.OnTouchListener() { // from class: ca.toadlybroodledev.sublist.d.2
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                C0557d.this.m4858e();
                return false;
            }
        });
        if (c0554a.isInstr) {
            return;
        }
        this.f3820c.setOnLongClickListener(new View.OnLongClickListener() { // from class: ca.toadlybroodledev.sublist.d.3
            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                C0557d.this.m4857d();
                return true;
            }
        });
        this.f3821d.setOnLongClickListener(new View.OnLongClickListener() { // from class: ca.toadlybroodledev.sublist.d.4
            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                C0557d.this.m4857d();
                return true;
            }
        });
        this.f3822e.addTextChangedListener(new TextWatcher() { // from class: ca.toadlybroodledev.sublist.d.5
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                if (C0557d.this.f3822e.getLayout().getLineCount() > 3) {
                    C0557d.this.f3822e.getText().delete(C0557d.this.f3822e.getText().length() - 1, C0557d.this.f3822e.getText().length());
                }
                C0557d.this.f3818a.mo4779q().m4976a(false, false);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        });
        this.f3822e.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: ca.toadlybroodledev.sublist.d.6
            @Override // android.widget.TextView.OnEditorActionListener
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                try {
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (i != 6) {
                    if (i == 5) {
                        if (C0566m.f3950m == C0566m.a.NEW_ENTRY.m4960a()) {
                            C0557d.this.f3819b.mo4851al();
                            C0557d.this.f3819b.mo4852am();
                        }
                    }
                    return false;
                }
                if (C0566m.f3950m == C0566m.a.CLOSE_KEYS.m4960a()) {
                    C0557d.this.f3818a.mo4761a((View) textView, false);
                }
                return true;
            }
        });
        this.f3822e.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: ca.toadlybroodledev.sublist.d.7
            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z) {
                if (z) {
                    C0557d.this.m4858e();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public void m4857d() {
        C0563j c0563jMo4787y = this.f3818a.mo4787y();
        if (c0563jMo4787y.mo4849af() != null) {
            c0563jMo4787y.m4901a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public void m4858e() {
        if (this.f3819b.mo4849af() != null) {
            this.f3818a.mo4763a(this);
        }
    }

    /* JADX INFO: renamed from: a */
    public int m4859a() {
        return this.f3828k;
    }

    /* JADX INFO: renamed from: a */
    void m4860a(int i) {
        this.f3828k = i;
    }

    /* JADX INFO: renamed from: b */
    void m4861b() {
        Context contextMo4775m = this.f3818a.mo4775m();
        Intent intent = new Intent(contextMo4775m, (Class<?>) ReceiverNotification.class);
        intent.putExtra("notification", this.f3822e.getText());
        PendingIntent broadcast = PendingIntent.getBroadcast(contextMo4775m, hashCode(), intent, 0);
        AlarmManager alarmManager = (AlarmManager) contextMo4775m.getSystemService("alarm");
        if (C0572s.f3991a <= C0572s.m5016d()) {
            Toast.makeText(contextMo4775m, R.string.choose_future_date_time, 1).show();
            return;
        }
        this.f3825h = C0572s.f3991a;
        alarmManager.set(0, this.f3825h, broadcast);
        this.f3819b.mo4852am();
        Toast.makeText(contextMo4775m, this.f3818a.mo4770b(Integer.valueOf(R.string.reminder_set_for)) + C0572s.m5008a(C0572s.f3991a), 1).show();
        this.f3818a.mo4759F();
    }

    /* JADX INFO: renamed from: c */
    void m4862c() {
        Context contextMo4775m = this.f3818a.mo4775m();
        Intent intent = new Intent(contextMo4775m, (Class<?>) ReceiverNotification.class);
        intent.putExtra("notification", this.f3822e.getText());
        ((AlarmManager) contextMo4775m.getSystemService("alarm")).cancel(PendingIntent.getBroadcast(contextMo4775m, hashCode(), intent, 0));
        this.f3825h = 0L;
        this.f3818a.mo4759F();
        Toast.makeText(contextMo4775m, R.string.reminder_canceled, 0).show();
    }
}
