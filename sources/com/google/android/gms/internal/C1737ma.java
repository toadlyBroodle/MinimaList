package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.util.Log;
import com.google.android.gms.ads.internal.C0710au;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* JADX INFO: renamed from: com.google.android.gms.internal.ma */
/* JADX INFO: loaded from: classes.dex */
@cnb
@TargetApi(14)
public final class C1737ma extends Thread implements SurfaceTexture.OnFrameAvailableListener, InterfaceC1735lz {

    /* JADX INFO: renamed from: a */
    private static final float[] f10988a = {-1.0f, -1.0f, -1.0f, 1.0f, -1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f};

    /* JADX INFO: renamed from: A */
    private volatile boolean f10989A;

    /* JADX INFO: renamed from: B */
    private volatile boolean f10990B;

    /* JADX INFO: renamed from: b */
    private final C1733lx f10991b;

    /* JADX INFO: renamed from: c */
    private final float[] f10992c;

    /* JADX INFO: renamed from: d */
    private final float[] f10993d;

    /* JADX INFO: renamed from: e */
    private final float[] f10994e;

    /* JADX INFO: renamed from: f */
    private final float[] f10995f;

    /* JADX INFO: renamed from: g */
    private final float[] f10996g;

    /* JADX INFO: renamed from: h */
    private final float[] f10997h;

    /* JADX INFO: renamed from: i */
    private final float[] f10998i;

    /* JADX INFO: renamed from: j */
    private float f10999j;

    /* JADX INFO: renamed from: k */
    private float f11000k;

    /* JADX INFO: renamed from: l */
    private float f11001l;

    /* JADX INFO: renamed from: m */
    private int f11002m;

    /* JADX INFO: renamed from: n */
    private int f11003n;

    /* JADX INFO: renamed from: o */
    private SurfaceTexture f11004o;

    /* JADX INFO: renamed from: p */
    private SurfaceTexture f11005p;

    /* JADX INFO: renamed from: q */
    private int f11006q;

    /* JADX INFO: renamed from: r */
    private int f11007r;

    /* JADX INFO: renamed from: s */
    private int f11008s;

    /* JADX INFO: renamed from: t */
    private FloatBuffer f11009t;

    /* JADX INFO: renamed from: u */
    private final CountDownLatch f11010u;

    /* JADX INFO: renamed from: v */
    private final Object f11011v;

    /* JADX INFO: renamed from: w */
    private EGL10 f11012w;

    /* JADX INFO: renamed from: x */
    private EGLDisplay f11013x;

    /* JADX INFO: renamed from: y */
    private EGLContext f11014y;

    /* JADX INFO: renamed from: z */
    private EGLSurface f11015z;

    public C1737ma(Context context) {
        super("SphericalVideoProcessor");
        this.f11009t = ByteBuffer.allocateDirect(f10988a.length << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f11009t.put(f10988a).position(0);
        this.f10992c = new float[9];
        this.f10993d = new float[9];
        this.f10994e = new float[9];
        this.f10995f = new float[9];
        this.f10996g = new float[9];
        this.f10997h = new float[9];
        this.f10998i = new float[9];
        this.f10999j = Float.NaN;
        this.f10991b = new C1733lx(context);
        this.f10991b.m11729a(this);
        this.f11010u = new CountDownLatch(1);
        this.f11011v = new Object();
    }

    /* JADX INFO: renamed from: a */
    private static int m11734a(int i, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i);
        m11735a("createShader");
        if (iGlCreateShader != 0) {
            GLES20.glShaderSource(iGlCreateShader, str);
            m11735a("shaderSource");
            GLES20.glCompileShader(iGlCreateShader);
            m11735a("compileShader");
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
            m11735a("getShaderiv");
            if (iArr[0] == 0) {
                Log.e("SphericalVideoRenderer", new StringBuilder(37).append("Could not compile shader ").append(i).append(":").toString());
                Log.e("SphericalVideoRenderer", GLES20.glGetShaderInfoLog(iGlCreateShader));
                GLES20.glDeleteShader(iGlCreateShader);
                m11735a("deleteShader");
                return 0;
            }
        }
        return iGlCreateShader;
    }

    /* JADX INFO: renamed from: a */
    private static void m11735a(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError != 0) {
            Log.e("SphericalVideoRenderer", new StringBuilder(String.valueOf(str).length() + 21).append(str).append(": glError ").append(iGlGetError).toString());
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m11736a(float[] fArr, float f) {
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = (float) Math.cos(f);
        fArr[5] = (float) (-Math.sin(f));
        fArr[6] = 0.0f;
        fArr[7] = (float) Math.sin(f);
        fArr[8] = (float) Math.cos(f);
    }

    /* JADX INFO: renamed from: a */
    private static void m11737a(float[] fArr, float[] fArr2, float[] fArr3) {
        fArr[0] = (fArr2[0] * fArr3[0]) + (fArr2[1] * fArr3[3]) + (fArr2[2] * fArr3[6]);
        fArr[1] = (fArr2[0] * fArr3[1]) + (fArr2[1] * fArr3[4]) + (fArr2[2] * fArr3[7]);
        fArr[2] = (fArr2[0] * fArr3[2]) + (fArr2[1] * fArr3[5]) + (fArr2[2] * fArr3[8]);
        fArr[3] = (fArr2[3] * fArr3[0]) + (fArr2[4] * fArr3[3]) + (fArr2[5] * fArr3[6]);
        fArr[4] = (fArr2[3] * fArr3[1]) + (fArr2[4] * fArr3[4]) + (fArr2[5] * fArr3[7]);
        fArr[5] = (fArr2[3] * fArr3[2]) + (fArr2[4] * fArr3[5]) + (fArr2[5] * fArr3[8]);
        fArr[6] = (fArr2[6] * fArr3[0]) + (fArr2[7] * fArr3[3]) + (fArr2[8] * fArr3[6]);
        fArr[7] = (fArr2[6] * fArr3[1]) + (fArr2[7] * fArr3[4]) + (fArr2[8] * fArr3[7]);
        fArr[8] = (fArr2[6] * fArr3[2]) + (fArr2[7] * fArr3[5]) + (fArr2[8] * fArr3[8]);
    }

    /* JADX INFO: renamed from: b */
    private static void m11738b(float[] fArr, float f) {
        fArr[0] = (float) Math.cos(f);
        fArr[1] = (float) (-Math.sin(f));
        fArr[2] = 0.0f;
        fArr[3] = (float) Math.sin(f);
        fArr[4] = (float) Math.cos(f);
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
    }

    /* JADX INFO: renamed from: d */
    private final void m11739d() {
        while (this.f11008s > 0) {
            this.f11004o.updateTexImage();
            this.f11008s--;
        }
        if (this.f10991b.m11730a(this.f10992c)) {
            if (Float.isNaN(this.f10999j)) {
                float[] fArr = this.f10992c;
                float[] fArr2 = {0.0f, 1.0f, 0.0f};
                float[] fArr3 = {(fArr[0] * fArr2[0]) + (fArr[1] * fArr2[1]) + (fArr[2] * fArr2[2]), (fArr[3] * fArr2[0]) + (fArr[4] * fArr2[1]) + (fArr[5] * fArr2[2]), (fArr[8] * fArr2[2]) + (fArr[6] * fArr2[0]) + (fArr[7] * fArr2[1])};
                this.f10999j = -(((float) Math.atan2(fArr3[1], fArr3[0])) - 1.5707964f);
            }
            m11738b(this.f10997h, this.f10999j + this.f11000k);
        } else {
            m11736a(this.f10992c, -1.5707964f);
            m11738b(this.f10997h, this.f11000k);
        }
        m11736a(this.f10993d, 1.5707964f);
        m11737a(this.f10994e, this.f10997h, this.f10993d);
        m11737a(this.f10995f, this.f10992c, this.f10994e);
        m11736a(this.f10996g, this.f11001l);
        m11737a(this.f10998i, this.f10996g, this.f10995f);
        GLES20.glUniformMatrix3fv(this.f11007r, 1, false, this.f10998i, 0);
        GLES20.glDrawArrays(5, 0, 4);
        m11735a("drawArrays");
        GLES20.glFinish();
        this.f11012w.eglSwapBuffers(this.f11013x, this.f11015z);
    }

    /* JADX INFO: renamed from: e */
    private final boolean m11740e() {
        boolean zEglDestroyContext = false;
        if (this.f11015z != null && this.f11015z != EGL10.EGL_NO_SURFACE) {
            zEglDestroyContext = this.f11012w.eglMakeCurrent(this.f11013x, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT) | false | this.f11012w.eglDestroySurface(this.f11013x, this.f11015z);
            this.f11015z = null;
        }
        if (this.f11014y != null) {
            zEglDestroyContext |= this.f11012w.eglDestroyContext(this.f11013x, this.f11014y);
            this.f11014y = null;
        }
        if (this.f11013x == null) {
            return zEglDestroyContext;
        }
        boolean zEglTerminate = zEglDestroyContext | this.f11012w.eglTerminate(this.f11013x);
        this.f11013x = null;
        return zEglTerminate;
    }

    @Override // com.google.android.gms.internal.InterfaceC1735lz
    /* JADX INFO: renamed from: a */
    public final void mo11732a() {
        synchronized (this.f11011v) {
            this.f11011v.notifyAll();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m11741a(float f, float f2) {
        float f3;
        float f4;
        if (this.f11003n > this.f11002m) {
            f3 = (1.7453293f * f) / this.f11003n;
            f4 = (1.7453293f * f2) / this.f11003n;
        } else {
            f3 = (1.7453293f * f) / this.f11002m;
            f4 = (1.7453293f * f2) / this.f11002m;
        }
        this.f11000k -= f3;
        this.f11001l -= f4;
        if (this.f11001l < -1.5707964f) {
            this.f11001l = -1.5707964f;
        }
        if (this.f11001l > 1.5707964f) {
            this.f11001l = 1.5707964f;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m11742a(int i, int i2) {
        synchronized (this.f11011v) {
            this.f11003n = i;
            this.f11002m = i2;
            this.f10989A = true;
            this.f11011v.notifyAll();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m11743a(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f11003n = i;
        this.f11002m = i2;
        this.f11005p = surfaceTexture;
    }

    /* JADX INFO: renamed from: b */
    public final void m11744b() {
        synchronized (this.f11011v) {
            this.f10990B = true;
            this.f11005p = null;
            this.f11011v.notifyAll();
        }
    }

    /* JADX INFO: renamed from: c */
    public final SurfaceTexture m11745c() {
        if (this.f11005p == null) {
            return null;
        }
        try {
            this.f11010u.await();
        } catch (InterruptedException e) {
        }
        return this.f11004o;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f11008s++;
        synchronized (this.f11011v) {
            this.f11011v.notifyAll();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Object[] objArr;
        int iGlCreateProgram;
        if (this.f11005p == null) {
            C1560fm.m11612c("SphericalVideoProcessor started with no output texture.");
            this.f11010u.countDown();
            return;
        }
        this.f11012w = (EGL10) EGLContext.getEGL();
        this.f11013x = this.f11012w.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        if (this.f11013x == EGL10.EGL_NO_DISPLAY) {
            objArr = false;
        } else {
            if (this.f11012w.eglInitialize(this.f11013x, new int[2])) {
                int[] iArr = new int[1];
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                EGLConfig eGLConfig = (!this.f11012w.eglChooseConfig(this.f11013x, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12325, 16, 12344}, eGLConfigArr, 1, iArr) || iArr[0] <= 0) ? null : eGLConfigArr[0];
                if (eGLConfig == null) {
                    objArr = false;
                } else {
                    this.f11014y = this.f11012w.eglCreateContext(this.f11013x, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
                    if (this.f11014y == null || this.f11014y == EGL10.EGL_NO_CONTEXT) {
                        objArr = false;
                    } else {
                        this.f11015z = this.f11012w.eglCreateWindowSurface(this.f11013x, eGLConfig, this.f11005p, null);
                        objArr = (this.f11015z == null || this.f11015z == EGL10.EGL_NO_SURFACE || !this.f11012w.eglMakeCurrent(this.f11013x, this.f11015z, this.f11015z, this.f11014y)) ? false : true;
                    }
                }
            } else {
                objArr = false;
            }
        }
        cac<String> cacVar = can.f9449aV;
        int iM11734a = m11734a(35633, !((String) bxm.m10409f().m10546a(cacVar)).equals(cacVar.m10536b()) ? (String) bxm.m10409f().m10546a(cacVar) : "attribute highp vec3 aPosition;varying vec3 pos;void main() {  gl_Position = vec4(aPosition, 1.0);  pos = aPosition;}");
        if (iM11734a == 0) {
            iGlCreateProgram = 0;
        } else {
            cac<String> cacVar2 = can.f9450aW;
            int iM11734a2 = m11734a(35632, !((String) bxm.m10409f().m10546a(cacVar2)).equals(cacVar2.m10536b()) ? (String) bxm.m10409f().m10546a(cacVar2) : "#extension GL_OES_EGL_image_external : require\n#define INV_PI 0.3183\nprecision highp float;varying vec3 pos;uniform samplerExternalOES uSplr;uniform mat3 uVMat;uniform float uFOVx;uniform float uFOVy;void main() {  vec3 ray = vec3(pos.x * tan(uFOVx), pos.y * tan(uFOVy), -1);  ray = (uVMat * ray).xyz;  ray = normalize(ray);  vec2 texCrd = vec2(    0.5 + atan(ray.x, - ray.z) * INV_PI * 0.5, acos(ray.y) * INV_PI);  gl_FragColor = vec4(texture2D(uSplr, texCrd).xyz, 1.0);}");
            if (iM11734a2 == 0) {
                iGlCreateProgram = 0;
            } else {
                iGlCreateProgram = GLES20.glCreateProgram();
                m11735a("createProgram");
                if (iGlCreateProgram != 0) {
                    GLES20.glAttachShader(iGlCreateProgram, iM11734a);
                    m11735a("attachShader");
                    GLES20.glAttachShader(iGlCreateProgram, iM11734a2);
                    m11735a("attachShader");
                    GLES20.glLinkProgram(iGlCreateProgram);
                    m11735a("linkProgram");
                    int[] iArr2 = new int[1];
                    GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr2, 0);
                    m11735a("getProgramiv");
                    if (iArr2[0] != 1) {
                        Log.e("SphericalVideoRenderer", "Could not link program: ");
                        Log.e("SphericalVideoRenderer", GLES20.glGetProgramInfoLog(iGlCreateProgram));
                        GLES20.glDeleteProgram(iGlCreateProgram);
                        m11735a("deleteProgram");
                        iGlCreateProgram = 0;
                    } else {
                        GLES20.glValidateProgram(iGlCreateProgram);
                        m11735a("validateProgram");
                    }
                }
            }
        }
        this.f11006q = iGlCreateProgram;
        GLES20.glUseProgram(this.f11006q);
        m11735a("useProgram");
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.f11006q, "aPosition");
        GLES20.glVertexAttribPointer(iGlGetAttribLocation, 3, 5126, false, 12, (Buffer) this.f11009t);
        m11735a("vertexAttribPointer");
        GLES20.glEnableVertexAttribArray(iGlGetAttribLocation);
        m11735a("enableVertexAttribArray");
        int[] iArr3 = new int[1];
        GLES20.glGenTextures(1, iArr3, 0);
        m11735a("genTextures");
        int i = iArr3[0];
        GLES20.glBindTexture(36197, i);
        m11735a("bindTextures");
        GLES20.glTexParameteri(36197, 10240, 9729);
        m11735a("texParameteri");
        GLES20.glTexParameteri(36197, 10241, 9729);
        m11735a("texParameteri");
        GLES20.glTexParameteri(36197, 10242, 33071);
        m11735a("texParameteri");
        GLES20.glTexParameteri(36197, 10243, 33071);
        m11735a("texParameteri");
        this.f11007r = GLES20.glGetUniformLocation(this.f11006q, "uVMat");
        GLES20.glUniformMatrix3fv(this.f11007r, 1, false, new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f}, 0);
        boolean z = this.f11006q != 0;
        if (objArr != true || !z) {
            String strValueOf = String.valueOf(GLUtils.getEGLErrorString(this.f11012w.eglGetError()));
            String strConcat = strValueOf.length() != 0 ? "EGL initialization failed: ".concat(strValueOf) : new String("EGL initialization failed: ");
            C1560fm.m11612c(strConcat);
            C0710au.m5573i().m11292a(new Throwable(strConcat), "SphericalVideoProcessor.run.1");
            m11740e();
            this.f11010u.countDown();
            return;
        }
        this.f11004o = new SurfaceTexture(i);
        this.f11004o.setOnFrameAvailableListener(this);
        this.f11010u.countDown();
        this.f10991b.m11728a();
        try {
            this.f10989A = true;
            while (!this.f10990B) {
                m11739d();
                if (this.f10989A) {
                    GLES20.glViewport(0, 0, this.f11003n, this.f11002m);
                    m11735a("viewport");
                    int iGlGetUniformLocation = GLES20.glGetUniformLocation(this.f11006q, "uFOVx");
                    int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(this.f11006q, "uFOVy");
                    if (this.f11003n > this.f11002m) {
                        GLES20.glUniform1f(iGlGetUniformLocation, 0.87266463f);
                        GLES20.glUniform1f(iGlGetUniformLocation2, (this.f11002m * 0.87266463f) / this.f11003n);
                    } else {
                        GLES20.glUniform1f(iGlGetUniformLocation, (this.f11003n * 0.87266463f) / this.f11002m);
                        GLES20.glUniform1f(iGlGetUniformLocation2, 0.87266463f);
                    }
                    this.f10989A = false;
                }
                try {
                    synchronized (this.f11011v) {
                        if (!this.f10990B && !this.f10989A && this.f11008s == 0) {
                            this.f11011v.wait();
                        }
                    }
                } catch (InterruptedException e) {
                }
            }
        } catch (IllegalStateException e2) {
            C1560fm.m11615e("SphericalVideoProcessor halted unexpectedly.");
        } catch (Throwable th) {
            C1560fm.m11611b("SphericalVideoProcessor died.", th);
            C0710au.m5573i().m11292a(th, "SphericalVideoProcessor.run.2");
        } finally {
            this.f10991b.m11731b();
            this.f11004o.setOnFrameAvailableListener(null);
            this.f11004o = null;
            m11740e();
        }
    }
}
