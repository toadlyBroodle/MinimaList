package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.util.Range;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.iz */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C1654iz {

    /* JADX INFO: renamed from: b */
    private static List<MediaCodecInfo> f10821b;

    /* JADX INFO: renamed from: a */
    private static Map<String, List<Map<String, Object>>> f10820a = new HashMap();

    /* JADX INFO: renamed from: c */
    private static final Object f10822c = new Object();

    @TargetApi(16)
    /* JADX INFO: renamed from: a */
    public static List<Map<String, Object>> m11551a(String str) {
        synchronized (f10822c) {
            if (f10820a.containsKey(str)) {
                return f10820a.get(str);
            }
            try {
                synchronized (f10822c) {
                    if (f10821b == null) {
                        if (Build.VERSION.SDK_INT >= 21) {
                            f10821b = Arrays.asList(new MediaCodecList(0).getCodecInfos());
                        } else if (Build.VERSION.SDK_INT >= 16) {
                            int codecCount = MediaCodecList.getCodecCount();
                            f10821b = new ArrayList(codecCount);
                            for (int i = 0; i < codecCount; i++) {
                                f10821b.add(MediaCodecList.getCodecInfoAt(i));
                            }
                        } else {
                            f10821b = Collections.emptyList();
                        }
                    }
                }
                ArrayList arrayList = new ArrayList();
                for (MediaCodecInfo mediaCodecInfo : f10821b) {
                    if (!mediaCodecInfo.isEncoder() && Arrays.asList(mediaCodecInfo.getSupportedTypes()).contains(str)) {
                        HashMap map = new HashMap();
                        map.put("codecName", mediaCodecInfo.getName());
                        MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
                        ArrayList arrayList2 = new ArrayList();
                        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : capabilitiesForType.profileLevels) {
                            arrayList2.add(new Integer[]{Integer.valueOf(codecProfileLevel.profile), Integer.valueOf(codecProfileLevel.level)});
                        }
                        map.put("profileLevels", arrayList2);
                        if (Build.VERSION.SDK_INT >= 21) {
                            MediaCodecInfo.VideoCapabilities videoCapabilities = capabilitiesForType.getVideoCapabilities();
                            map.put("bitRatesBps", m11552a(videoCapabilities.getBitrateRange()));
                            map.put("widthAlignment", Integer.valueOf(videoCapabilities.getWidthAlignment()));
                            map.put("heightAlignment", Integer.valueOf(videoCapabilities.getHeightAlignment()));
                            map.put("frameRates", m11552a(videoCapabilities.getSupportedFrameRates()));
                            map.put("widths", m11552a(videoCapabilities.getSupportedWidths()));
                            map.put("heights", m11552a(videoCapabilities.getSupportedHeights()));
                        }
                        if (Build.VERSION.SDK_INT >= 23) {
                            map.put("instancesLimit", Integer.valueOf(capabilitiesForType.getMaxSupportedInstances()));
                        }
                        arrayList.add(map);
                    }
                }
                f10820a.put(str, arrayList);
                return arrayList;
            } catch (LinkageError e) {
                e = e;
                HashMap map2 = new HashMap();
                map2.put("error", e.getClass().getSimpleName());
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(map2);
                f10820a.put(str, arrayList3);
                return arrayList3;
            } catch (RuntimeException e2) {
                e = e2;
                HashMap map22 = new HashMap();
                map22.put("error", e.getClass().getSimpleName());
                ArrayList arrayList32 = new ArrayList();
                arrayList32.add(map22);
                f10820a.put(str, arrayList32);
                return arrayList32;
            }
        }
    }

    @TargetApi(21)
    /* JADX INFO: renamed from: a */
    private static Integer[] m11552a(Range<Integer> range) {
        return new Integer[]{(Integer) range.getLower(), (Integer) range.getUpper()};
    }
}
