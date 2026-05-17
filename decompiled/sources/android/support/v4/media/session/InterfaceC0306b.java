package android.support.v4.media.session;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.InterfaceC0305a;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.view.KeyEvent;
import java.util.List;

/* JADX INFO: renamed from: android.support.v4.media.session.b */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0306b extends IInterface {

    /* JADX INFO: renamed from: android.support.v4.media.session.b$a */
    public static abstract class a extends Binder implements InterfaceC0306b {

        /* JADX INFO: renamed from: android.support.v4.media.session.b$a$a, reason: collision with other inner class name */
        private static class C2324a implements InterfaceC0306b {

            /* JADX INFO: renamed from: a */
            private IBinder f1593a;

            C2324a(IBinder iBinder) {
                this.f1593a = iBinder;
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: a */
            public void mo2164a(int i) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcelObtain.writeInt(i);
                    this.f1593a.transact(44, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: a */
            public void mo2165a(int i, int i2, String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeString(str);
                    this.f1593a.transact(11, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: a */
            public void mo2166a(long j) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcelObtain.writeLong(j);
                    this.f1593a.transact(17, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: a */
            public void mo2167a(Uri uri, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (uri != null) {
                        parcelObtain.writeInt(1);
                        uri.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.f1593a.transact(36, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: a */
            public void mo2168a(MediaDescriptionCompat mediaDescriptionCompat) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (mediaDescriptionCompat != null) {
                        parcelObtain.writeInt(1);
                        mediaDescriptionCompat.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.f1593a.transact(41, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: a */
            public void mo2169a(MediaDescriptionCompat mediaDescriptionCompat, int i) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (mediaDescriptionCompat != null) {
                        parcelObtain.writeInt(1);
                        mediaDescriptionCompat.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeInt(i);
                    this.f1593a.transact(42, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: a */
            public void mo2170a(RatingCompat ratingCompat) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (ratingCompat != null) {
                        parcelObtain.writeInt(1);
                        ratingCompat.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.f1593a.transact(25, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: a */
            public void mo2171a(RatingCompat ratingCompat, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (ratingCompat != null) {
                        parcelObtain.writeInt(1);
                        ratingCompat.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.f1593a.transact(51, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: a */
            public void mo2172a(InterfaceC0305a interfaceC0305a) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcelObtain.writeStrongBinder(interfaceC0305a != null ? interfaceC0305a.asBinder() : null);
                    this.f1593a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: a */
            public void mo2173a(String str, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcelObtain.writeString(str);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.f1593a.transact(34, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: a */
            public void mo2174a(String str, Bundle bundle, MediaSessionCompat.ResultReceiverWrapper resultReceiverWrapper) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcelObtain.writeString(str);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (resultReceiverWrapper != null) {
                        parcelObtain.writeInt(1);
                        resultReceiverWrapper.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.f1593a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: a */
            public void mo2175a(boolean z) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.f1593a.transact(46, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: a */
            public boolean mo2176a() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f1593a.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: a */
            public boolean mo2177a(KeyEvent keyEvent) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (keyEvent != null) {
                        parcelObtain.writeInt(1);
                        keyEvent.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.f1593a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f1593a;
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: b */
            public String mo2178b() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f1593a.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: b */
            public void mo2179b(int i) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcelObtain.writeInt(i);
                    this.f1593a.transact(39, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: b */
            public void mo2180b(int i, int i2, String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeString(str);
                    this.f1593a.transact(12, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: b */
            public void mo2181b(long j) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcelObtain.writeLong(j);
                    this.f1593a.transact(24, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: b */
            public void mo2182b(Uri uri, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (uri != null) {
                        parcelObtain.writeInt(1);
                        uri.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.f1593a.transact(16, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: b */
            public void mo2183b(MediaDescriptionCompat mediaDescriptionCompat) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (mediaDescriptionCompat != null) {
                        parcelObtain.writeInt(1);
                        mediaDescriptionCompat.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.f1593a.transact(43, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: b */
            public void mo2184b(InterfaceC0305a interfaceC0305a) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcelObtain.writeStrongBinder(interfaceC0305a != null ? interfaceC0305a.asBinder() : null);
                    this.f1593a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: b */
            public void mo2185b(String str, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcelObtain.writeString(str);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.f1593a.transact(35, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: b */
            public void mo2186b(boolean z) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.f1593a.transact(40, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: c */
            public String mo2187c() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f1593a.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: c */
            public void mo2188c(int i) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcelObtain.writeInt(i);
                    this.f1593a.transact(48, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: c */
            public void mo2189c(String str, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcelObtain.writeString(str);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.f1593a.transact(14, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: d */
            public PendingIntent mo2190d() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f1593a.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: d */
            public void mo2191d(String str, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcelObtain.writeString(str);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.f1593a.transact(15, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: e */
            public long mo2192e() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f1593a.transact(9, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readLong();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: e */
            public void mo2193e(String str, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcelObtain.writeString(str);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.f1593a.transact(26, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: f */
            public ParcelableVolumeInfo mo2194f() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f1593a.transact(10, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? ParcelableVolumeInfo.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: g */
            public MediaMetadataCompat mo2195g() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f1593a.transact(27, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? MediaMetadataCompat.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: h */
            public PlaybackStateCompat mo2196h() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f1593a.transact(28, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? PlaybackStateCompat.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: i */
            public List<MediaSessionCompat.QueueItem> mo2197i() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f1593a.transact(29, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createTypedArrayList(MediaSessionCompat.QueueItem.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: j */
            public CharSequence mo2198j() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f1593a.transact(30, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: k */
            public Bundle mo2199k() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f1593a.transact(31, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: l */
            public int mo2200l() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f1593a.transact(32, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: m */
            public boolean mo2201m() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f1593a.transact(45, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: n */
            public int mo2202n() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f1593a.transact(37, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: o */
            public boolean mo2203o() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f1593a.transact(38, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: p */
            public int mo2204p() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f1593a.transact(47, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: q */
            public void mo2205q() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f1593a.transact(33, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: r */
            public void mo2206r() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f1593a.transact(13, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: s */
            public void mo2207s() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f1593a.transact(18, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: t */
            public void mo2208t() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f1593a.transact(19, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: u */
            public void mo2209u() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f1593a.transact(20, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: v */
            public void mo2210v() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f1593a.transact(21, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: w */
            public void mo2211w() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f1593a.transact(22, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.InterfaceC0306b
            /* JADX INFO: renamed from: x */
            public void mo2212x() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f1593a.transact(23, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "android.support.v4.media.session.IMediaSession");
        }

        /* JADX INFO: renamed from: a */
        public static InterfaceC0306b m2250a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0306b)) ? new C2324a(iBinder) : (InterfaceC0306b) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo2174a(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? MediaSessionCompat.ResultReceiverWrapper.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    boolean zA = mo2177a(parcel.readInt() != 0 ? (KeyEvent) KeyEvent.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(zA ? 1 : 0);
                    return true;
                case 3:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo2172a(InterfaceC0305a.a.m2249a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo2184b(InterfaceC0305a.a.m2249a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    boolean zA2 = mo2176a();
                    parcel2.writeNoException();
                    parcel2.writeInt(zA2 ? 1 : 0);
                    return true;
                case 6:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    String strB = mo2178b();
                    parcel2.writeNoException();
                    parcel2.writeString(strB);
                    return true;
                case 7:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    String strC = mo2187c();
                    parcel2.writeNoException();
                    parcel2.writeString(strC);
                    return true;
                case 8:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    PendingIntent pendingIntentD = mo2190d();
                    parcel2.writeNoException();
                    if (pendingIntentD == null) {
                        parcel2.writeInt(0);
                        return true;
                    }
                    parcel2.writeInt(1);
                    pendingIntentD.writeToParcel(parcel2, 1);
                    return true;
                case 9:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    long jE = mo2192e();
                    parcel2.writeNoException();
                    parcel2.writeLong(jE);
                    return true;
                case 10:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    ParcelableVolumeInfo parcelableVolumeInfoF = mo2194f();
                    parcel2.writeNoException();
                    if (parcelableVolumeInfoF == null) {
                        parcel2.writeInt(0);
                        return true;
                    }
                    parcel2.writeInt(1);
                    parcelableVolumeInfoF.writeToParcel(parcel2, 1);
                    return true;
                case 11:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo2165a(parcel.readInt(), parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 12:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo2180b(parcel.readInt(), parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 13:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo2206r();
                    parcel2.writeNoException();
                    return true;
                case 14:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo2189c(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 15:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo2191d(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 16:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo2182b(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 17:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo2166a(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 18:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo2207s();
                    parcel2.writeNoException();
                    return true;
                case 19:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo2208t();
                    parcel2.writeNoException();
                    return true;
                case 20:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo2209u();
                    parcel2.writeNoException();
                    return true;
                case 21:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo2210v();
                    parcel2.writeNoException();
                    return true;
                case 22:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo2211w();
                    parcel2.writeNoException();
                    return true;
                case 23:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo2212x();
                    parcel2.writeNoException();
                    return true;
                case 24:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo2181b(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 25:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo2170a(parcel.readInt() != 0 ? RatingCompat.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 26:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo2193e(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 27:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    MediaMetadataCompat mediaMetadataCompatG = mo2195g();
                    parcel2.writeNoException();
                    if (mediaMetadataCompatG == null) {
                        parcel2.writeInt(0);
                        return true;
                    }
                    parcel2.writeInt(1);
                    mediaMetadataCompatG.writeToParcel(parcel2, 1);
                    return true;
                case 28:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    PlaybackStateCompat playbackStateCompatH = mo2196h();
                    parcel2.writeNoException();
                    if (playbackStateCompatH == null) {
                        parcel2.writeInt(0);
                        return true;
                    }
                    parcel2.writeInt(1);
                    playbackStateCompatH.writeToParcel(parcel2, 1);
                    return true;
                case 29:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    List<MediaSessionCompat.QueueItem> listI = mo2197i();
                    parcel2.writeNoException();
                    parcel2.writeTypedList(listI);
                    return true;
                case 30:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    CharSequence charSequenceJ = mo2198j();
                    parcel2.writeNoException();
                    if (charSequenceJ == null) {
                        parcel2.writeInt(0);
                        return true;
                    }
                    parcel2.writeInt(1);
                    TextUtils.writeToParcel(charSequenceJ, parcel2, 1);
                    return true;
                case 31:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    Bundle bundleK = mo2199k();
                    parcel2.writeNoException();
                    if (bundleK == null) {
                        parcel2.writeInt(0);
                        return true;
                    }
                    parcel2.writeInt(1);
                    bundleK.writeToParcel(parcel2, 1);
                    return true;
                case 32:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    int iL = mo2200l();
                    parcel2.writeNoException();
                    parcel2.writeInt(iL);
                    return true;
                case 33:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo2205q();
                    parcel2.writeNoException();
                    return true;
                case 34:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo2173a(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 35:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo2185b(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 36:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo2167a(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 37:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    int iN = mo2202n();
                    parcel2.writeNoException();
                    parcel2.writeInt(iN);
                    return true;
                case 38:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    boolean zO = mo2203o();
                    parcel2.writeNoException();
                    parcel2.writeInt(zO ? 1 : 0);
                    return true;
                case 39:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo2179b(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 40:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo2186b(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 41:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo2168a(parcel.readInt() != 0 ? MediaDescriptionCompat.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 42:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo2169a(parcel.readInt() != 0 ? MediaDescriptionCompat.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 43:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo2183b(parcel.readInt() != 0 ? MediaDescriptionCompat.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 44:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo2164a(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 45:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    boolean zM = mo2201m();
                    parcel2.writeNoException();
                    parcel2.writeInt(zM ? 1 : 0);
                    return true;
                case 46:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo2175a(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 47:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    int iP = mo2204p();
                    parcel2.writeNoException();
                    parcel2.writeInt(iP);
                    return true;
                case 48:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo2188c(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 51:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo2171a(parcel.readInt() != 0 ? RatingCompat.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("android.support.v4.media.session.IMediaSession");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    void mo2164a(int i);

    /* JADX INFO: renamed from: a */
    void mo2165a(int i, int i2, String str);

    /* JADX INFO: renamed from: a */
    void mo2166a(long j);

    /* JADX INFO: renamed from: a */
    void mo2167a(Uri uri, Bundle bundle);

    /* JADX INFO: renamed from: a */
    void mo2168a(MediaDescriptionCompat mediaDescriptionCompat);

    /* JADX INFO: renamed from: a */
    void mo2169a(MediaDescriptionCompat mediaDescriptionCompat, int i);

    /* JADX INFO: renamed from: a */
    void mo2170a(RatingCompat ratingCompat);

    /* JADX INFO: renamed from: a */
    void mo2171a(RatingCompat ratingCompat, Bundle bundle);

    /* JADX INFO: renamed from: a */
    void mo2172a(InterfaceC0305a interfaceC0305a);

    /* JADX INFO: renamed from: a */
    void mo2173a(String str, Bundle bundle);

    /* JADX INFO: renamed from: a */
    void mo2174a(String str, Bundle bundle, MediaSessionCompat.ResultReceiverWrapper resultReceiverWrapper);

    /* JADX INFO: renamed from: a */
    void mo2175a(boolean z);

    /* JADX INFO: renamed from: a */
    boolean mo2176a();

    /* JADX INFO: renamed from: a */
    boolean mo2177a(KeyEvent keyEvent);

    /* JADX INFO: renamed from: b */
    String mo2178b();

    /* JADX INFO: renamed from: b */
    void mo2179b(int i);

    /* JADX INFO: renamed from: b */
    void mo2180b(int i, int i2, String str);

    /* JADX INFO: renamed from: b */
    void mo2181b(long j);

    /* JADX INFO: renamed from: b */
    void mo2182b(Uri uri, Bundle bundle);

    /* JADX INFO: renamed from: b */
    void mo2183b(MediaDescriptionCompat mediaDescriptionCompat);

    /* JADX INFO: renamed from: b */
    void mo2184b(InterfaceC0305a interfaceC0305a);

    /* JADX INFO: renamed from: b */
    void mo2185b(String str, Bundle bundle);

    /* JADX INFO: renamed from: b */
    void mo2186b(boolean z);

    /* JADX INFO: renamed from: c */
    String mo2187c();

    /* JADX INFO: renamed from: c */
    void mo2188c(int i);

    /* JADX INFO: renamed from: c */
    void mo2189c(String str, Bundle bundle);

    /* JADX INFO: renamed from: d */
    PendingIntent mo2190d();

    /* JADX INFO: renamed from: d */
    void mo2191d(String str, Bundle bundle);

    /* JADX INFO: renamed from: e */
    long mo2192e();

    /* JADX INFO: renamed from: e */
    void mo2193e(String str, Bundle bundle);

    /* JADX INFO: renamed from: f */
    ParcelableVolumeInfo mo2194f();

    /* JADX INFO: renamed from: g */
    MediaMetadataCompat mo2195g();

    /* JADX INFO: renamed from: h */
    PlaybackStateCompat mo2196h();

    /* JADX INFO: renamed from: i */
    List<MediaSessionCompat.QueueItem> mo2197i();

    /* JADX INFO: renamed from: j */
    CharSequence mo2198j();

    /* JADX INFO: renamed from: k */
    Bundle mo2199k();

    /* JADX INFO: renamed from: l */
    int mo2200l();

    /* JADX INFO: renamed from: m */
    boolean mo2201m();

    /* JADX INFO: renamed from: n */
    int mo2202n();

    /* JADX INFO: renamed from: o */
    boolean mo2203o();

    /* JADX INFO: renamed from: p */
    int mo2204p();

    /* JADX INFO: renamed from: q */
    void mo2205q();

    /* JADX INFO: renamed from: r */
    void mo2206r();

    /* JADX INFO: renamed from: s */
    void mo2207s();

    /* JADX INFO: renamed from: t */
    void mo2208t();

    /* JADX INFO: renamed from: u */
    void mo2209u();

    /* JADX INFO: renamed from: v */
    void mo2210v();

    /* JADX INFO: renamed from: w */
    void mo2211w();

    /* JADX INFO: renamed from: x */
    void mo2212x();
}
