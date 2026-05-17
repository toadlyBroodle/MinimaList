package com.google.android.gms.internal;

import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.common.api.Status;
import com.google.firebase.C2146a;
import com.google.firebase.C2214c;
import com.google.firebase.C2224d;
import com.google.firebase.C2284f;
import com.google.firebase.auth.C2171d;
import com.google.firebase.auth.C2172e;
import com.google.firebase.auth.C2173f;
import com.google.firebase.auth.C2174g;
import com.google.firebase.auth.C2175h;
import com.google.firebase.auth.C2176i;
import com.google.firebase.auth.C2196j;
import com.google.firebase.auth.C2197k;
import com.google.firebase.auth.C2204r;
import com.google.firebase.p053a.p054a.C2148a;

/* JADX INFO: loaded from: classes.dex */
public final class aze {

    /* JADX INFO: renamed from: a */
    private static SparseArray<Pair<String, String>> f7607a;

    static {
        SparseArray<Pair<String, String>> sparseArray = new SparseArray<>();
        f7607a = sparseArray;
        sparseArray.put(17000, new Pair<>("ERROR_INVALID_CUSTOM_TOKEN", "The custom token format is incorrect. Please check the documentation."));
        f7607a.put(17002, new Pair<>("ERROR_CUSTOM_TOKEN_MISMATCH", "The custom token corresponds to a different audience."));
        f7607a.put(17004, new Pair<>("ERROR_INVALID_CREDENTIAL", "The supplied auth credential is malformed or has expired."));
        f7607a.put(17008, new Pair<>("ERROR_INVALID_EMAIL", "The email address is badly formatted."));
        f7607a.put(17009, new Pair<>("ERROR_WRONG_PASSWORD", "The password is invalid or the user does not have a password."));
        f7607a.put(17024, new Pair<>("ERROR_USER_MISMATCH", "The supplied credentials do not correspond to the previously signed in user."));
        f7607a.put(17014, new Pair<>("ERROR_REQUIRES_RECENT_LOGIN", "This operation is sensitive and requires recent authentication. Log in again before retrying this request."));
        f7607a.put(17012, new Pair<>("ERROR_ACCOUNT_EXISTS_WITH_DIFFERENT_CREDENTIAL", "An account already exists with the same email address but different sign-in credentials. Sign in using a provider associated with this email address."));
        f7607a.put(17007, new Pair<>("ERROR_EMAIL_ALREADY_IN_USE", "The email address is already in use by another account."));
        f7607a.put(17025, new Pair<>("ERROR_CREDENTIAL_ALREADY_IN_USE", "This credential is already associated with a different user account."));
        f7607a.put(17005, new Pair<>("ERROR_USER_DISABLED", "The user account has been disabled by an administrator."));
        f7607a.put(17021, new Pair<>("ERROR_USER_TOKEN_EXPIRED", "The user's credential is no longer valid. The user must sign in again."));
        f7607a.put(17011, new Pair<>("ERROR_USER_NOT_FOUND", "There is no user record corresponding to this identifier. The user may have been deleted."));
        f7607a.put(17017, new Pair<>("ERROR_INVALID_USER_TOKEN", "The user's credential is no longer valid. The user must sign in again."));
        f7607a.put(17006, new Pair<>("ERROR_OPERATION_NOT_ALLOWED", "This operation is not allowed. You must enable this service in the console."));
        f7607a.put(17026, new Pair<>("ERROR_WEAK_PASSWORD", "The given password is invalid."));
        f7607a.put(17029, new Pair<>("ERROR_EXPIRED_ACTION_CODE", "The out of band code has expired."));
        f7607a.put(17030, new Pair<>("ERROR_INVALID_ACTION_CODE", "The out of band code is invalid. This can happen if the code is malformed, expired, or has already been used."));
        f7607a.put(17031, new Pair<>("ERROR_INVALID_MESSAGE_PAYLOAD", "The email template corresponding to this action contains invalid characters in its message. Please fix by going to the Auth email templates section in the Firebase Console."));
        f7607a.put(17033, new Pair<>("ERROR_INVALID_RECIPIENT_EMAIL", "The email corresponding to this action failed to send as the provided recipient email address is invalid."));
        f7607a.put(17032, new Pair<>("ERROR_INVALID_SENDER", "The email template corresponding to this action contains an invalid sender email or name. Please fix by going to the Auth email templates section in the Firebase Console."));
        f7607a.put(17034, new Pair<>("ERROR_MISSING_EMAIL", "An email address must be provided."));
        f7607a.put(17035, new Pair<>("ERROR_MISSING_PASSWORD", "A password must be provided."));
        f7607a.put(17041, new Pair<>("ERROR_MISSING_PHONE_NUMBER", "To send verification codes, provide a phone number for the recipient."));
        f7607a.put(17042, new Pair<>("ERROR_INVALID_PHONE_NUMBER", "The format of the phone number provided is incorrect. Please enter the phone number in a format that can be parsed into E.164 format. E.164 phone numbers are written in the format [+][country code][subscriber number including area code]."));
        f7607a.put(17043, new Pair<>("ERROR_MISSING_VERIFICATION_CODE", "The Phone Auth Credential was created with an empty sms verification Code"));
        f7607a.put(17044, new Pair<>("ERROR_INVALID_VERIFICATION_CODE", "The sms verification code used to create the phone auth credential is invalid. Please resend the verification code sms and be sure use the verification code provided by the user."));
        f7607a.put(17045, new Pair<>("ERROR_MISSING_VERIFICATION_ID", "The Phone Auth Credential was created with an empty verification ID"));
        f7607a.put(17046, new Pair<>("ERROR_INVALID_VERIFICATION_ID", "The verification ID used to create the phone auth credential is invalid."));
        f7607a.put(17049, new Pair<>("ERROR_RETRY_PHONE_AUTH", "An error occurred during authentication using the PhoneAuthCredential. Please retry authentication."));
        f7607a.put(17051, new Pair<>("ERROR_SESSION_EXPIRED", "The sms code has expired. Please re-send the verification code to try again."));
        f7607a.put(17052, new Pair<>("ERROR_QUOTA_EXCEEDED", "The sms quota for this project has been exceeded."));
        f7607a.put(17028, new Pair<>("ERROR_APP_NOT_AUTHORIZED", "This app is not authorized to use Firebase Authentication. Please verifythat the correct package name and SHA-1 are configured in the Firebase Console."));
        f7607a.put(17056, new Pair<>("ERROR_API_NOT_AVAILABLE", "The API that you are calling is not available on devices without Google Play Services."));
    }

    /* JADX INFO: renamed from: a */
    public static C2196j m8712a(Status status, C2204r c2204r) {
        int iM6627e = status.m6627e();
        return new C2196j(m8714a(iM6627e), m8715a(m8716b(iM6627e), status), c2204r);
    }

    /* JADX INFO: renamed from: a */
    public static C2214c m8713a(Status status) {
        int iM6627e = status.m6627e();
        String strM8715a = m8715a(m8716b(iM6627e), status);
        switch (iM6627e) {
            case 17000:
                return new C2174g(m8714a(iM6627e), strM8715a);
            case 17002:
            case 17004:
            case 17008:
            case 17009:
            case 17024:
                return new C2174g(m8714a(iM6627e), strM8715a);
            case 17005:
            case 17011:
            case 17017:
            case 17021:
                return new C2175h(m8714a(iM6627e), strM8715a);
            case 17006:
                return new C2173f(m8714a(iM6627e), strM8715a);
            case 17007:
            case 17012:
            case 17025:
                return new C2196j(m8714a(iM6627e), strM8715a);
            case 17010:
                return new C2284f(m8715a("We have blocked all requests from this device due to unusual activity. Try again later.", status));
            case 17014:
                return new C2176i(m8714a(iM6627e), strM8715a);
            case 17015:
                return new C2214c(m8715a("User has already been linked to the given provider.", status));
            case 17016:
                return new C2214c(m8715a("User was not linked to an account with the given provider.", status));
            case 17020:
                return new C2224d(m8715a("A network error (such as timeout, interrupted connection or unreachable host) has occurred.", status));
            case 17026:
                return new C2197k(m8714a(iM6627e), strM8715a, status.m6624b());
            case 17028:
                return new C2173f(m8714a(iM6627e), strM8715a);
            case 17029:
            case 17030:
                return new C2171d(m8714a(iM6627e), strM8715a);
            case 17031:
            case 17032:
            case 17033:
                return new C2172e(m8714a(iM6627e), strM8715a);
            case 17034:
            case 17035:
            case 17041:
            case 17042:
            case 17043:
            case 17044:
            case 17045:
            case 17046:
            case 17049:
            case 17051:
                return new C2174g(m8714a(iM6627e), strM8715a);
            case 17052:
                return new C2284f(strM8715a);
            case 17056:
                return new C2146a(strM8715a);
            case 17495:
                return new C2148a(m8715a("Please sign in before trying to get a token.", status));
            case 17499:
                return new C2214c(m8715a("An internal error has occurred.", status));
            default:
                return new C2214c("An internal error has occurred.");
        }
    }

    /* JADX INFO: renamed from: a */
    private static String m8714a(int i) {
        Pair<String, String> pair = f7607a.get(i);
        return pair != null ? (String) pair.first : "INTERNAL_ERROR";
    }

    /* JADX INFO: renamed from: a */
    private static String m8715a(String str, Status status) {
        return TextUtils.isEmpty(status.m6624b()) ? str : String.format(String.valueOf(str).concat(" [ %s ]"), status.m6624b());
    }

    /* JADX INFO: renamed from: b */
    private static String m8716b(int i) {
        Pair<String, String> pair = f7607a.get(i);
        return pair != null ? (String) pair.second : "An internal error happened";
    }
}
