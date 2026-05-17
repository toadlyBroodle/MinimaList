package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.C0710au;
import com.google.android.gms.common.util.C1308l;
import java.io.DataInputStream;
import java.io.IOException;

/* JADX INFO: renamed from: com.google.android.gms.internal.am */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C1372am extends AbstractC2011we {
    public static final Parcelable.Creator<C1372am> CREATOR = new C1374ao();

    /* JADX INFO: renamed from: a */
    private ParcelFileDescriptor f6969a;

    /* JADX INFO: renamed from: b */
    private Parcelable f6970b;

    /* JADX INFO: renamed from: c */
    private boolean f6971c;

    public C1372am(ParcelFileDescriptor parcelFileDescriptor) {
        this.f6969a = parcelFileDescriptor;
        this.f6970b = null;
        this.f6971c = true;
    }

    public C1372am(InterfaceC2015wi interfaceC2015wi) {
        this.f6969a = null;
        this.f6970b = interfaceC2015wi;
        this.f6971c = false;
    }

    /* JADX INFO: renamed from: a */
    private final ParcelFileDescriptor m8087a() {
        if (this.f6969a == null) {
            Parcel parcelObtain = Parcel.obtain();
            try {
                this.f6970b.writeToParcel(parcelObtain, 0);
                byte[] bArrMarshall = parcelObtain.marshall();
                parcelObtain.recycle();
                this.f6969a = m8088a(bArrMarshall);
            } catch (Throwable th) {
                parcelObtain.recycle();
                throw th;
            }
        }
        return this.f6969a;
    }

    /* JADX INFO: renamed from: a */
    private final <T> ParcelFileDescriptor m8088a(byte[] bArr) {
        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream;
        try {
            ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe = ParcelFileDescriptor.createPipe();
            autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptorArrCreatePipe[1]);
            try {
                new Thread(new RunnableC1373an(this, autoCloseOutputStream, bArr)).start();
                return parcelFileDescriptorArrCreatePipe[0];
            } catch (IOException e) {
                e = e;
                C1560fm.m11611b("Error transporting the ad response", e);
                C0710au.m5573i().m11292a(e, "LargeParcelTeleporter.pipeData.2");
                C1308l.m7275a(autoCloseOutputStream);
                return null;
            }
        } catch (IOException e2) {
            e = e2;
            autoCloseOutputStream = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final <T extends InterfaceC2015wi> T m8089a(Parcelable.Creator<T> creator) {
        if (this.f6971c) {
            if (this.f6969a == null) {
                C1560fm.m11612c("File descriptor is empty, returning null.");
                return null;
            }
            DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(this.f6969a));
            try {
                try {
                    byte[] bArr = new byte[dataInputStream.readInt()];
                    dataInputStream.readFully(bArr, 0, bArr.length);
                    C1308l.m7275a(dataInputStream);
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.unmarshall(bArr, 0, bArr.length);
                        parcelObtain.setDataPosition(0);
                        this.f6970b = creator.createFromParcel(parcelObtain);
                        parcelObtain.recycle();
                        this.f6971c = false;
                    } catch (Throwable th) {
                        parcelObtain.recycle();
                        throw th;
                    }
                } catch (IOException e) {
                    C1560fm.m11611b("Could not read from parcel file descriptor", e);
                    C1308l.m7275a(dataInputStream);
                    return null;
                }
            } catch (Throwable th2) {
                C1308l.m7275a(dataInputStream);
                throw th2;
            }
        }
        return (T) this.f6970b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        m8087a();
        int iM12512a = C2014wh.m12512a(parcel);
        C2014wh.m12520a(parcel, 2, (Parcelable) this.f6969a, i, false);
        C2014wh.m12513a(parcel, iM12512a);
    }
}
