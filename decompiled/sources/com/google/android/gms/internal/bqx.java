package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
final class bqx {
    /* JADX INFO: renamed from: a */
    static String m10003a(bob bobVar) {
        bqy bqyVar = new bqy(bobVar);
        StringBuilder sb = new StringBuilder(bqyVar.mo10005a());
        for (int i = 0; i < bqyVar.mo10005a(); i++) {
            byte bMo10004a = bqyVar.mo10004a(i);
            switch (bMo10004a) {
                case 7:
                    sb.append("\\a");
                    break;
                case 8:
                    sb.append("\\b");
                    break;
                case 9:
                    sb.append("\\t");
                    break;
                case 10:
                    sb.append("\\n");
                    break;
                case 11:
                    sb.append("\\v");
                    break;
                case 12:
                    sb.append("\\f");
                    break;
                case 13:
                    sb.append("\\r");
                    break;
                case 34:
                    sb.append("\\\"");
                    break;
                case 39:
                    sb.append("\\'");
                    break;
                case 92:
                    sb.append("\\\\");
                    break;
                default:
                    if (bMo10004a < 32 || bMo10004a > 126) {
                        sb.append('\\');
                        sb.append((char) (((bMo10004a >>> 6) & 3) + 48));
                        sb.append((char) (((bMo10004a >>> 3) & 7) + 48));
                        sb.append((char) ((bMo10004a & 7) + 48));
                    } else {
                        sb.append((char) bMo10004a);
                    }
                    break;
            }
        }
        return sb.toString();
    }
}
