package com.google.android.gms.internal;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Display;
import android.view.WindowManager;

/* JADX INFO: renamed from: com.google.android.gms.internal.lx */
/* JADX INFO: loaded from: classes.dex */
@cnb
final class C1733lx implements SensorEventListener {

    /* JADX INFO: renamed from: a */
    private final SensorManager f10979a;

    /* JADX INFO: renamed from: c */
    private final Display f10981c;

    /* JADX INFO: renamed from: f */
    private float[] f10984f;

    /* JADX INFO: renamed from: g */
    private Handler f10985g;

    /* JADX INFO: renamed from: h */
    private InterfaceC1735lz f10986h;

    /* JADX INFO: renamed from: d */
    private final float[] f10982d = new float[9];

    /* JADX INFO: renamed from: e */
    private final float[] f10983e = new float[9];

    /* JADX INFO: renamed from: b */
    private final Object f10980b = new Object();

    C1733lx(Context context) {
        this.f10979a = (SensorManager) context.getSystemService("sensor");
        this.f10981c = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    /* JADX INFO: renamed from: a */
    private final void m11727a(int i, int i2) {
        float f = this.f10983e[i];
        this.f10983e[i] = this.f10983e[i2];
        this.f10983e[i2] = f;
    }

    /* JADX INFO: renamed from: a */
    final void m11728a() {
        if (this.f10985g != null) {
            return;
        }
        Sensor defaultSensor = this.f10979a.getDefaultSensor(11);
        if (defaultSensor == null) {
            C1560fm.m11612c("No Sensor of TYPE_ROTATION_VECTOR");
            return;
        }
        HandlerThread handlerThread = new HandlerThread("OrientationMonitor");
        handlerThread.start();
        this.f10985g = new Handler(handlerThread.getLooper());
        if (this.f10979a.registerListener(this, defaultSensor, 0, this.f10985g)) {
            return;
        }
        C1560fm.m11612c("SensorManager.registerListener failed.");
        m11731b();
    }

    /* JADX INFO: renamed from: a */
    final void m11729a(InterfaceC1735lz interfaceC1735lz) {
        this.f10986h = interfaceC1735lz;
    }

    /* JADX INFO: renamed from: a */
    final boolean m11730a(float[] fArr) {
        boolean z = false;
        synchronized (this.f10980b) {
            if (this.f10984f != null) {
                System.arraycopy(this.f10984f, 0, fArr, 0, this.f10984f.length);
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: b */
    final void m11731b() {
        if (this.f10985g == null) {
            return;
        }
        this.f10979a.unregisterListener(this);
        this.f10985g.post(new RunnableC1734ly(this));
        this.f10985g = null;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr[0] == 0.0f && fArr[1] == 0.0f && fArr[2] == 0.0f) {
            return;
        }
        synchronized (this.f10980b) {
            if (this.f10984f == null) {
                this.f10984f = new float[9];
            }
        }
        SensorManager.getRotationMatrixFromVector(this.f10982d, fArr);
        switch (this.f10981c.getRotation()) {
            case 1:
                SensorManager.remapCoordinateSystem(this.f10982d, 2, 129, this.f10983e);
                break;
            case 2:
                SensorManager.remapCoordinateSystem(this.f10982d, 129, 130, this.f10983e);
                break;
            case 3:
                SensorManager.remapCoordinateSystem(this.f10982d, 130, 1, this.f10983e);
                break;
            default:
                System.arraycopy(this.f10982d, 0, this.f10983e, 0, 9);
                break;
        }
        m11727a(1, 3);
        m11727a(2, 6);
        m11727a(5, 7);
        synchronized (this.f10980b) {
            System.arraycopy(this.f10983e, 0, this.f10984f, 0, 9);
        }
        if (this.f10986h != null) {
            this.f10986h.mo11732a();
        }
    }
}
