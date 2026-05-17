package com.google.android.gms.internal;

import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import com.google.android.gms.internal.InterfaceC1860qp;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: com.google.android.gms.internal.qq */
/* JADX INFO: loaded from: classes.dex */
class C1861qq<T extends InterfaceC1860qp> extends C1830pm {

    /* JADX INFO: renamed from: a */
    private InterfaceC1862qr<T> f11384a;

    public C1861qq(C1834pq c1834pq, InterfaceC1862qr<T> interfaceC1862qr) {
        super(c1834pq);
        this.f11384a = interfaceC1862qr;
    }

    /* JADX INFO: renamed from: a */
    private final T m12163a(XmlResourceParser xmlResourceParser) {
        try {
            xmlResourceParser.next();
            int eventType = xmlResourceParser.getEventType();
            while (eventType != 1) {
                if (xmlResourceParser.getEventType() == 2) {
                    String lowerCase = xmlResourceParser.getName().toLowerCase();
                    if (lowerCase.equals("screenname")) {
                        String attributeValue = xmlResourceParser.getAttributeValue(null, "name");
                        String strTrim = xmlResourceParser.nextText().trim();
                        if (!TextUtils.isEmpty(attributeValue) && !TextUtils.isEmpty(strTrim)) {
                            this.f11384a.mo12167a(attributeValue, strTrim);
                        }
                    } else if (lowerCase.equals("string")) {
                        String attributeValue2 = xmlResourceParser.getAttributeValue(null, "name");
                        String strTrim2 = xmlResourceParser.nextText().trim();
                        if (!TextUtils.isEmpty(attributeValue2) && strTrim2 != null) {
                            this.f11384a.mo12169b(attributeValue2, strTrim2);
                        }
                    } else if (lowerCase.equals("bool")) {
                        String attributeValue3 = xmlResourceParser.getAttributeValue(null, "name");
                        String strTrim3 = xmlResourceParser.nextText().trim();
                        if (!TextUtils.isEmpty(attributeValue3) && !TextUtils.isEmpty(strTrim3)) {
                            try {
                                this.f11384a.mo12168a(attributeValue3, Boolean.parseBoolean(strTrim3));
                            } catch (NumberFormatException e) {
                                m12029c("Error parsing bool configuration value", strTrim3, e);
                            }
                        }
                    } else if (lowerCase.equals("integer")) {
                        String attributeValue4 = xmlResourceParser.getAttributeValue(null, "name");
                        String strTrim4 = xmlResourceParser.nextText().trim();
                        if (!TextUtils.isEmpty(attributeValue4) && !TextUtils.isEmpty(strTrim4)) {
                            try {
                                this.f11384a.mo12166a(attributeValue4, Integer.parseInt(strTrim4));
                            } catch (NumberFormatException e2) {
                                m12029c("Error parsing int configuration value", strTrim4, e2);
                            }
                        }
                    }
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException e3) {
            m12034e("Error parsing tracker configuration file", e3);
        } catch (XmlPullParserException e4) {
            m12034e("Error parsing tracker configuration file", e4);
        }
        return (T) this.f11384a.mo12165a();
    }

    /* JADX INFO: renamed from: a */
    public final T m12164a(int i) {
        try {
            return (T) m12163a(m12036h().m12057b().getResources().getXml(i));
        } catch (Resources.NotFoundException e) {
            m12031d("inflate() called with unknown resourceId", e);
            return null;
        }
    }
}
