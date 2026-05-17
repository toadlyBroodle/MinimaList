package com.google.android.gms.appinvite;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TabHost;
import android.widget.TabWidget;
import android.widget.TextView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class PreviewActivity extends Activity {
    /* JADX INFO: renamed from: a */
    private final View m6084a(Context context, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = LayoutInflater.from(context).inflate(bundle.getInt("com.google.android.gms.appinvite.LAYOUT_RES_ID"), viewGroup, false);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("com.google.android.gms.appinvite.VIEWS");
        if (parcelableArrayList != null) {
            ArrayList arrayList = parcelableArrayList;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                Bundle bundle2 = (Bundle) arrayList.get(i);
                View viewFindViewById = viewInflate.findViewById(bundle2.getInt("View_id"));
                for (String str : bundle2.keySet()) {
                    switch (str) {
                        case "View_backgroundColor":
                            viewFindViewById.setBackgroundColor(bundle2.getInt(str));
                            break;
                        case "View_minHeight":
                            viewFindViewById.setMinimumHeight(bundle2.getInt(str));
                            break;
                        case "View_onClickListener":
                            switch (bundle2.getString(str)) {
                                case "close":
                                    viewFindViewById.setOnClickListener(new ViewOnClickListenerC0914g(this));
                                    break;
                            }
                            break;
                        case "TextView_text":
                            if (viewFindViewById instanceof TextView) {
                                ((TextView) viewFindViewById).setText(bundle2.getCharSequence(str));
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "TextView_textColor":
                            if (viewFindViewById instanceof TextView) {
                                ((TextView) viewFindViewById).setTextColor(bundle2.getInt(str));
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "TextView_isTitle":
                            if (!(viewFindViewById instanceof TextView) || !bundle2.getBoolean(str)) {
                                break;
                            } else {
                                setTitle(((TextView) viewFindViewById).getText());
                                break;
                            }
                            break;
                        case "WebView_data":
                            if (viewFindViewById instanceof ViewGroup) {
                                WebView webView = new WebView(this);
                                webView.loadData(bundle2.getString(str), "text/html; charset=utf-8", "UTF-8");
                                ((ViewGroup) viewFindViewById).addView(webView, new ViewGroup.LayoutParams(-1, -1));
                                break;
                            } else {
                                break;
                            }
                            break;
                    }
                }
                i = i2;
            }
        }
        return viewInflate;
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getCallingActivity() == null || !"com.google.android.gms".equals(getCallingActivity().getPackageName())) {
            finish();
            return;
        }
        try {
            Context contextCreatePackageContext = createPackageContext("com.google.android.gms", 0);
            Bundle extras = getIntent().getExtras();
            View viewM6084a = m6084a(contextCreatePackageContext, null, extras);
            if (viewM6084a == null) {
                finish();
                return;
            }
            TabHost tabHost = (TabHost) viewM6084a.findViewById(R.id.tabhost);
            TabWidget tabWidget = (TabWidget) viewM6084a.findViewById(R.id.tabs);
            ArrayList parcelableArrayList = extras.getParcelableArrayList("com.google.android.gms.appinvite.TABS");
            if (tabHost != null && tabWidget != null && parcelableArrayList != null) {
                tabHost.setup();
                ArrayList arrayList = parcelableArrayList;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    Bundle bundle2 = (Bundle) obj;
                    TabHost.TabSpec tabSpecNewTabSpec = tabHost.newTabSpec(bundle2.getString("tabTag"));
                    tabSpecNewTabSpec.setContent(bundle2.getInt("tabContentId"));
                    tabSpecNewTabSpec.setIndicator(m6084a(contextCreatePackageContext, tabWidget, bundle2));
                    tabHost.addTab(tabSpecNewTabSpec);
                }
            }
            setContentView(viewM6084a);
        } catch (PackageManager.NameNotFoundException e) {
            finish();
        }
    }
}
