package com.google.android.gms.internal;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes.dex */
final class bmp {

    /* JADX INFO: renamed from: a */
    private BlockingQueue<ByteBuffer> f8441a;

    /* JADX INFO: renamed from: e */
    private bme f8445e;

    /* JADX INFO: renamed from: f */
    private WritableByteChannel f8446f;

    /* JADX INFO: renamed from: b */
    private final Random f8442b = new Random();

    /* JADX INFO: renamed from: c */
    private volatile boolean f8443c = false;

    /* JADX INFO: renamed from: d */
    private boolean f8444d = false;

    /* JADX INFO: renamed from: g */
    private final Thread f8447g = bme.m9639a().newThread(new bmq(this));

    bmp(bme bmeVar, String str, int i) {
        bme.m9642b().mo9638a(this.f8447g, new StringBuilder(String.valueOf(str).length() + 18).append(str).append("Writer-").append(i).toString());
        this.f8445e = bmeVar;
        this.f8441a = new LinkedBlockingQueue();
    }

    /* JADX INFO: renamed from: c */
    private final void m9666c() throws InterruptedException, IOException {
        this.f8446f.write(this.f8441a.take());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public final void m9667d() {
        while (!this.f8443c && !Thread.interrupted()) {
            try {
                m9666c();
            } catch (IOException e) {
                this.f8445e.m9647a(new bml("IO Exception", e));
                return;
            } catch (InterruptedException e2) {
                return;
            }
        }
        for (int i = 0; i < this.f8441a.size(); i++) {
            m9666c();
        }
    }

    /* JADX INFO: renamed from: a */
    final void m9668a() {
        this.f8443c = true;
    }

    /* JADX INFO: renamed from: a */
    final synchronized void m9669a(byte b, boolean z, byte[] bArr) {
        synchronized (this) {
            int length = bArr.length;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate((length >= 126 ? length <= 65535 ? 8 : 14 : 6) + bArr.length);
            byteBufferAllocate.put((byte) (b | (-128)));
            if (length < 126) {
                byteBufferAllocate.put((byte) (length | 128));
            } else if (length <= 65535) {
                byteBufferAllocate.put((byte) -2);
                byteBufferAllocate.putShort((short) length);
            } else {
                byteBufferAllocate.put((byte) -1);
                byteBufferAllocate.putInt(0);
                byteBufferAllocate.putInt(length);
            }
            byte[] bArr2 = new byte[4];
            this.f8442b.nextBytes(bArr2);
            byteBufferAllocate.put(bArr2);
            for (int i = 0; i < bArr.length; i++) {
                byteBufferAllocate.put((byte) (bArr[i] ^ bArr2[i % 4]));
            }
            byteBufferAllocate.flip();
            if (this.f8443c && (this.f8444d || b != 8)) {
                throw new bml("Shouldn't be sending");
            }
            if (b == 8) {
                this.f8444d = true;
            }
            this.f8441a.add(byteBufferAllocate);
        }
    }

    /* JADX INFO: renamed from: a */
    final void m9670a(OutputStream outputStream) {
        this.f8446f = Channels.newChannel(outputStream);
    }

    /* JADX INFO: renamed from: b */
    final Thread m9671b() {
        return this.f8447g;
    }
}
