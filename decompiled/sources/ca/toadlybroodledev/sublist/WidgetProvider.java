package ca.toadlybroodledev.sublist;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;

/* JADX INFO: loaded from: classes.dex */
public class WidgetProvider extends AppWidgetProvider {
    @Override // android.appwidget.AppWidgetProvider
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        try {
            for (int i : iArr) {
                PendingIntent activity = PendingIntent.getActivity(context, 0, new Intent(context, (Class<?>) ActMain.class), 0);
                RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget_layout);
                remoteViews.setOnClickPendingIntent(R.id.widget_image_view, activity);
                remoteViews.setImageViewBitmap(R.id.widget_image_view, C0567n.m4961a(context));
                appWidgetManager.updateAppWidget(i, remoteViews);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
