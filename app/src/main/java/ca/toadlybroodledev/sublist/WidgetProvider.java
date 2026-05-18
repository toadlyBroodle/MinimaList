package ca.toadlybroodledev.sublist;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;

// Ported from decompiled WidgetProvider. Home-screen widget; updates bitmap screenshot on app stop.
public class WidgetProvider extends AppWidgetProvider {

    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        try {
            for (int id : appWidgetIds) {
                PendingIntent activity = PendingIntent.getActivity(
                        context, 0, new Intent(context, MainActivity.class),
                        PendingIntent.FLAG_IMMUTABLE);
                RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.widget_layout);
                views.setOnClickPendingIntent(R.id.widget_image_view, activity);
                views.setImageViewBitmap(R.id.widget_image_view, OutlineStore.m4961a(context));
                appWidgetManager.updateAppWidget(id, views);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
