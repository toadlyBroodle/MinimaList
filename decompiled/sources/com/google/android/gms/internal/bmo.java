package com.google.android.gms.internal;

import android.support.design.C0025a;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes.dex */
final class bmo {

    /* JADX INFO: renamed from: b */
    private bme f8436b;

    /* JADX INFO: renamed from: e */
    private blz f8439e;

    /* JADX INFO: renamed from: a */
    private DataInputStream f8435a = null;

    /* JADX INFO: renamed from: c */
    private bmj f8437c = null;

    /* JADX INFO: renamed from: d */
    private byte[] f8438d = new byte[C0025a.j.AppCompatTheme_windowFixedHeightMajor];

    /* JADX INFO: renamed from: f */
    private volatile boolean f8440f = false;

    bmo(bme bmeVar) {
        this.f8436b = null;
        this.f8436b = bmeVar;
    }

    /* JADX INFO: renamed from: a */
    private final int m9660a(byte[] bArr, int i, int i2) throws IOException {
        this.f8435a.readFully(bArr, i, i2);
        return i2;
    }

    /* JADX INFO: renamed from: a */
    private final void m9661a(bml bmlVar) {
        this.f8440f = true;
        this.f8436b.m9647a(bmlVar);
    }

    /* JADX INFO: renamed from: a */
    final void m9662a() {
        int iM9660a;
        boolean z;
        this.f8437c = this.f8436b.m9650c();
        while (!this.f8440f) {
            try {
                iM9660a = m9660a(this.f8438d, 0, 1) + 0;
                z = (this.f8438d[0] & 128) != 0;
            } catch (bml e) {
                m9661a(e);
            } catch (SocketTimeoutException e2) {
            } catch (IOException e3) {
                m9661a(new bml("IO Error", e3));
            }
            if ((this.f8438d[0] & 112) != 0) {
                throw new bml("Invalid frame received");
            }
            byte b = (byte) (this.f8438d[0] & 15);
            int iM9660a2 = iM9660a + m9660a(this.f8438d, iM9660a, 1);
            byte b2 = this.f8438d[1];
            long j = 0;
            if (b2 < 126) {
                j = b2;
            } else if (b2 == 126) {
                m9660a(this.f8438d, iM9660a2, 2);
                j = ((this.f8438d[2] & 255) << 8) | (this.f8438d[3] & 255);
            } else if (b2 == 127) {
                int iM9660a3 = m9660a(this.f8438d, iM9660a2, 8) + iM9660a2;
                byte[] bArr = this.f8438d;
                int i = iM9660a3 - 8;
                j = ((long) (bArr[i + 7] & 255)) + (((long) bArr[i]) << 56) + (((long) (bArr[i + 1] & 255)) << 48) + (((long) (bArr[i + 2] & 255)) << 40) + (((long) (bArr[i + 3] & 255)) << 32) + (((long) (bArr[i + 4] & 255)) << 24) + ((long) ((bArr[i + 5] & 255) << 16)) + ((long) ((bArr[i + 6] & 255) << 8));
            }
            byte[] bArr2 = new byte[(int) j];
            m9660a(bArr2, 0, (int) j);
            if (b == 8) {
                this.f8436b.m9653f();
            } else if (b == 10) {
                continue;
            } else {
                if (b != 1 && b != 2 && b != 9 && b != 0) {
                    throw new bml(new StringBuilder(24).append("Unsupported opcode: ").append((int) b).toString());
                }
                if (b == 9) {
                    if (!z) {
                        throw new bml("PING must not fragment across frames");
                    }
                    if (bArr2.length > 125) {
                        throw new bml("PING frame too long");
                    }
                    this.f8436b.m9649a(bArr2);
                } else {
                    if (this.f8439e != null && b != 0) {
                        throw new bml("Failed to continue outstanding frame");
                    }
                    if (this.f8439e == null && b == 0) {
                        throw new bml("Received continuing frame, but there's nothing to continue");
                    }
                    if (this.f8439e == null) {
                        this.f8439e = b == 2 ? new bly() : new bma();
                    }
                    if (!this.f8439e.mo9636a(bArr2)) {
                        throw new bml("Failed to decode frame");
                    }
                    if (z) {
                        bmn bmnVarMo9635a = this.f8439e.mo9635a();
                        this.f8439e = null;
                        if (bmnVarMo9635a == null) {
                            throw new bml("Failed to decode whole message");
                        }
                        this.f8437c.mo9072a(bmnVarMo9635a);
                    } else {
                        continue;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    final void m9663a(DataInputStream dataInputStream) {
        this.f8435a = dataInputStream;
    }

    /* JADX INFO: renamed from: b */
    final void m9664b() {
        this.f8440f = true;
    }
}
