package com.google.android.gms.internal;

import android.net.Uri;
import com.google.android.gms.common.internal.C1221aj;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class apn extends akb {

    /* JADX INFO: renamed from: a */
    private final ahe f7023a;

    public apn(ahe aheVar) {
        this.f7023a = aheVar;
    }

    @Override // com.google.android.gms.internal.akb
    /* JADX INFO: renamed from: a */
    protected final arh<?> mo8073a(aii aiiVar, arh<?>... arhVarArr) {
        C1221aj.m7074b(true);
        C1221aj.m7074b(arhVarArr.length > 0);
        arh<?> arhVar = arhVarArr[0];
        C1221aj.m7074b(!(arhVar instanceof arn));
        arh<?> arhVar2 = arhVarArr.length > 1 ? arhVarArr[1] : arn.f7154e;
        C1221aj.m7074b(arhVar2 == arn.f7154e || (arhVar2 instanceof aro));
        arh<?> arhVar3 = arhVarArr.length > 2 ? arhVarArr[2] : arn.f7154e;
        C1221aj.m7074b(arhVar3 == arn.f7154e || !(arhVar3 instanceof arn));
        Uri.Builder builderBuildUpon = Uri.parse(aka.m8083d(arhVar)).buildUpon();
        if (arhVar2 != arn.f7154e) {
            for (arh<?> arhVar4 : ((aro) arhVar2).mo8208b()) {
                C1221aj.m7074b(arhVar4 instanceof arr);
                for (Map.Entry<String, arh<?>> entry : ((arr) arhVar4).mo8208b().entrySet()) {
                    builderBuildUpon.appendQueryParameter(entry.getKey().toString(), aka.m8083d(arv.m8225a(aiiVar, entry.getValue())));
                }
            }
        }
        String string = builderBuildUpon.build().toString();
        if (arhVar3 == arn.f7154e) {
            this.f7023a.mo7898a(string);
            String strValueOf = String.valueOf(string);
            ahs.m7947d(strValueOf.length() != 0 ? "SendPixel: url = ".concat(strValueOf) : new String("SendPixel: url = "));
        } else {
            String strM8083d = aka.m8083d(arhVar3);
            this.f7023a.mo7899a(string, strM8083d);
            ahs.m7947d(new StringBuilder(String.valueOf(string).length() + 30 + String.valueOf(strM8083d).length()).append("SendPixel: url = ").append(string).append(", uniqueId = ").append(strM8083d).toString());
        }
        return arn.f7154e;
    }
}
