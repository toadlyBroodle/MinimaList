package com.google.android.gms.appinvite;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C1221aj;

/* JADX INFO: renamed from: com.google.android.gms.appinvite.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0910c {

    /* JADX INFO: renamed from: a */
    private static final String[] f4991a = {"jpg", "jpeg", "png"};

    /* JADX INFO: renamed from: com.google.android.gms.appinvite.c$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private final Intent f4992a;

        /* JADX INFO: renamed from: b */
        private String f4993b;

        /* JADX INFO: renamed from: c */
        private String f4994c;

        public a(CharSequence charSequence) {
            C1221aj.m7065a(charSequence);
            this.f4992a = new Intent("com.google.android.gms.appinvite.ACTION_APP_INVITE");
            this.f4992a.putExtra("com.google.android.gms.appinvite.TITLE", charSequence);
            this.f4992a.setPackage("com.google.android.gms");
        }

        /* JADX INFO: renamed from: a */
        public final Intent m6089a() {
            if (!TextUtils.isEmpty(this.f4993b)) {
                C1221aj.m7068a(this.f4994c, (Object) "Email html content must be set when email subject is set.");
                C1221aj.m7075b(this.f4992a.getData() == null, "Custom image must not be set when email html content is set.");
                C1221aj.m7075b(TextUtils.isEmpty(this.f4992a.getCharSequenceExtra("com.google.android.gms.appinvite.BUTTON_TEXT")), "Call to action text must not be set when email html content is set.");
                this.f4992a.putExtra("com.google.android.gms.appinvite.EMAIL_SUBJECT", this.f4993b);
                this.f4992a.putExtra("com.google.android.gms.appinvite.EMAIL_CONTENT", this.f4994c);
            } else if (!TextUtils.isEmpty(this.f4994c)) {
                throw new IllegalArgumentException("Email subject must be set when email html content is set.");
            }
            return this.f4992a;
        }

        /* JADX INFO: renamed from: a */
        public final a m6090a(Uri uri) {
            if (uri != null) {
                this.f4992a.putExtra("com.google.android.gms.appinvite.DEEP_LINK_URL", uri);
            } else {
                this.f4992a.removeExtra("com.google.android.gms.appinvite.DEEP_LINK_URL");
            }
            return this;
        }

        /* JADX INFO: renamed from: a */
        public final a m6091a(CharSequence charSequence) {
            if (charSequence != null && charSequence.length() > 100) {
                throw new IllegalArgumentException(String.format("Message must be %d chars or less.", 100));
            }
            this.f4992a.putExtra("com.google.android.gms.appinvite.MESSAGE", charSequence);
            return this;
        }

        /* JADX INFO: renamed from: b */
        public final a m6092b(Uri uri) {
            C1221aj.m7065a(uri);
            C1221aj.m7075b(uri.isAbsolute(), "Image uri is not an absolute uri. Did you forget to add a scheme to the Uri?");
            String lowerCase = uri.getScheme().toLowerCase();
            boolean z = lowerCase.equals("android.resource") || lowerCase.equals("content") || lowerCase.equals("file");
            C1221aj.m7075b(z || lowerCase.equals("http") || lowerCase.equals("https"), "Image uri must be a content URI with scheme \"android.resource\", \"content\" or \"file\", or a network url with scheme \"http\" or \"https\".");
            if (!z) {
                String lastPathSegment = uri.getLastPathSegment();
                String lowerCase2 = (lastPathSegment == null || lastPathSegment.lastIndexOf(".") == -1) ? null : lastPathSegment.substring(lastPathSegment.lastIndexOf(".") + 1, lastPathSegment.length()).toLowerCase();
                C1221aj.m7075b(TextUtils.isEmpty(lowerCase2) || C0910c.m6088b(lowerCase2), String.valueOf(lowerCase2).concat(" images are not supported. Only jpg, jpeg, or png images are supported."));
            }
            this.f4992a.setData(uri.buildUpon().scheme(lowerCase).build());
            if (z) {
                this.f4992a.addFlags(1);
            }
            return this;
        }

        /* JADX INFO: renamed from: b */
        public final a m6093b(CharSequence charSequence) {
            if (charSequence == null || charSequence.length() < 2 || charSequence.length() > 20) {
                throw new IllegalArgumentException(String.format("Text must be between %d and %d chars in length.", 2, 20));
            }
            this.f4992a.putExtra("com.google.android.gms.appinvite.BUTTON_TEXT", charSequence);
            return this;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String[] m6087a(int i, Intent intent) {
        if (i == -1) {
            return intent.getStringArrayExtra("com.google.android.gms.appinvite.RESULT_INVITATION_IDS");
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static boolean m6088b(String str) {
        for (int i = 0; i < f4991a.length; i++) {
            if (f4991a[i].equals(str)) {
                return true;
            }
        }
        return false;
    }
}
