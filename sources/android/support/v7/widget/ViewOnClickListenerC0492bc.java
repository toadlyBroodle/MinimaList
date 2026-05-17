package android.support.v7.widget;

import android.R;
import android.app.SearchManager;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.p007b.C0175b;
import android.support.v4.widget.AbstractC0328l;
import android.support.v7.p022a.C0333a;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: android.support.v7.widget.bc */
/* JADX INFO: loaded from: classes.dex */
class ViewOnClickListenerC0492bc extends AbstractC0328l implements View.OnClickListener {

    /* JADX INFO: renamed from: j */
    private final SearchManager f3433j;

    /* JADX INFO: renamed from: k */
    private final SearchView f3434k;

    /* JADX INFO: renamed from: l */
    private final SearchableInfo f3435l;

    /* JADX INFO: renamed from: m */
    private final Context f3436m;

    /* JADX INFO: renamed from: n */
    private final WeakHashMap<String, Drawable.ConstantState> f3437n;

    /* JADX INFO: renamed from: o */
    private final int f3438o;

    /* JADX INFO: renamed from: p */
    private boolean f3439p;

    /* JADX INFO: renamed from: q */
    private int f3440q;

    /* JADX INFO: renamed from: r */
    private ColorStateList f3441r;

    /* JADX INFO: renamed from: s */
    private int f3442s;

    /* JADX INFO: renamed from: t */
    private int f3443t;

    /* JADX INFO: renamed from: u */
    private int f3444u;

    /* JADX INFO: renamed from: v */
    private int f3445v;

    /* JADX INFO: renamed from: w */
    private int f3446w;

    /* JADX INFO: renamed from: x */
    private int f3447x;

    /* JADX INFO: renamed from: android.support.v7.widget.bc$a */
    private static final class a {

        /* JADX INFO: renamed from: a */
        public final TextView f3448a;

        /* JADX INFO: renamed from: b */
        public final TextView f3449b;

        /* JADX INFO: renamed from: c */
        public final ImageView f3450c;

        /* JADX INFO: renamed from: d */
        public final ImageView f3451d;

        /* JADX INFO: renamed from: e */
        public final ImageView f3452e;

        public a(View view) {
            this.f3448a = (TextView) view.findViewById(R.id.text1);
            this.f3449b = (TextView) view.findViewById(R.id.text2);
            this.f3450c = (ImageView) view.findViewById(R.id.icon1);
            this.f3451d = (ImageView) view.findViewById(R.id.icon2);
            this.f3452e = (ImageView) view.findViewById(C0333a.f.edit_query);
        }
    }

    public ViewOnClickListenerC0492bc(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.f3439p = false;
        this.f3440q = 1;
        this.f3442s = -1;
        this.f3443t = -1;
        this.f3444u = -1;
        this.f3445v = -1;
        this.f3446w = -1;
        this.f3447x = -1;
        this.f3433j = (SearchManager) this.f1666d.getSystemService("search");
        this.f3434k = searchView;
        this.f3435l = searchableInfo;
        this.f3438o = searchView.getSuggestionCommitIconResId();
        this.f3436m = context;
        this.f3437n = weakHashMap;
    }

    /* JADX INFO: renamed from: a */
    private Drawable m4480a(ComponentName componentName) {
        String strFlattenToShortString = componentName.flattenToShortString();
        if (!this.f3437n.containsKey(strFlattenToShortString)) {
            Drawable drawableM4487b = m4487b(componentName);
            this.f3437n.put(strFlattenToShortString, drawableM4487b != null ? drawableM4487b.getConstantState() : null);
            return drawableM4487b;
        }
        Drawable.ConstantState constantState = this.f3437n.get(strFlattenToShortString);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable(this.f3436m.getResources());
    }

    /* JADX INFO: renamed from: a */
    private Drawable m4481a(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int i = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f3436m.getPackageName() + "/" + i;
            Drawable drawableM4489b = m4489b(str2);
            if (drawableM4489b != null) {
                return drawableM4489b;
            }
            Drawable drawableM1337a = C0175b.m1337a(this.f3436m, i);
            m4486a(str2, drawableM1337a);
            return drawableM1337a;
        } catch (Resources.NotFoundException e) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
            return null;
        } catch (NumberFormatException e2) {
            Drawable drawableM4489b2 = m4489b(str);
            if (drawableM4489b2 != null) {
                return drawableM4489b2;
            }
            Drawable drawableM4488b = m4488b(Uri.parse(str));
            m4486a(str, drawableM4488b);
            return drawableM4488b;
        }
    }

    /* JADX INFO: renamed from: a */
    private static String m4482a(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m4483a(Cursor cursor, String str) {
        return m4482a(cursor, cursor.getColumnIndex(str));
    }

    /* JADX INFO: renamed from: a */
    private void m4484a(ImageView imageView, Drawable drawable, int i) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    /* JADX INFO: renamed from: a */
    private void m4485a(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m4486a(String str, Drawable drawable) {
        if (drawable != null) {
            this.f3437n.put(str, drawable.getConstantState());
        }
    }

    /* JADX INFO: renamed from: b */
    private Drawable m4487b(ComponentName componentName) {
        PackageManager packageManager = this.f1666d.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            Log.w("SuggestionsAdapter", "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString());
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("SuggestionsAdapter", e.toString());
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    private Drawable m4488b(Uri uri) {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return m4496a(uri);
                } catch (Resources.NotFoundException e) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            }
            InputStream inputStreamOpenInputStream = this.f3436m.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream == null) {
                throw new FileNotFoundException("Failed to open " + uri);
            }
            try {
                Drawable drawableCreateFromStream = Drawable.createFromStream(inputStreamOpenInputStream, null);
                try {
                    inputStreamOpenInputStream.close();
                    return drawableCreateFromStream;
                } catch (IOException e2) {
                    Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e2);
                    return drawableCreateFromStream;
                }
            } finally {
            }
        } catch (FileNotFoundException e3) {
            Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e3.getMessage());
            return null;
        }
        Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e3.getMessage());
        return null;
    }

    /* JADX INFO: renamed from: b */
    private Drawable m4489b(String str) {
        Drawable.ConstantState constantState = this.f3437n.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    /* JADX INFO: renamed from: b */
    private CharSequence m4490b(CharSequence charSequence) {
        if (this.f3441r == null) {
            TypedValue typedValue = new TypedValue();
            this.f1666d.getTheme().resolveAttribute(C0333a.a.textColorSearchUrl, typedValue, true);
            this.f3441r = this.f1666d.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f3441r, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    /* JADX INFO: renamed from: d */
    private void m4491d(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras == null || extras.getBoolean("in_progress")) {
        }
    }

    /* JADX INFO: renamed from: e */
    private Drawable m4492e(Cursor cursor) {
        if (this.f3445v == -1) {
            return null;
        }
        Drawable drawableM4481a = m4481a(cursor.getString(this.f3445v));
        return drawableM4481a == null ? m4494g(cursor) : drawableM4481a;
    }

    /* JADX INFO: renamed from: f */
    private Drawable m4493f(Cursor cursor) {
        if (this.f3446w == -1) {
            return null;
        }
        return m4481a(cursor.getString(this.f3446w));
    }

    /* JADX INFO: renamed from: g */
    private Drawable m4494g(Cursor cursor) {
        Drawable drawableM4480a = m4480a(this.f3435l.getSearchActivity());
        return drawableM4480a != null ? drawableM4480a : this.f1666d.getPackageManager().getDefaultActivityIcon();
    }

    /* JADX INFO: renamed from: a */
    Cursor m4495a(SearchableInfo searchableInfo, String str, int i) {
        String suggestAuthority;
        String[] strArr;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder builderFragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            builderFragment.appendEncodedPath(suggestPath);
        }
        builderFragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            builderFragment.appendPath(str);
            strArr = null;
        }
        if (i > 0) {
            builderFragment.appendQueryParameter("limit", String.valueOf(i));
        }
        return this.f1666d.getContentResolver().query(builderFragment.build(), null, suggestSelection, strArr, null);
    }

    @Override // android.support.v4.widget.AbstractC0320d, android.support.v4.widget.C0321e.a
    /* JADX INFO: renamed from: a */
    public Cursor mo2379a(CharSequence charSequence) {
        String string = charSequence == null ? "" : charSequence.toString();
        if (this.f3434k.getVisibility() != 0 || this.f3434k.getWindowVisibility() != 0) {
            return null;
        }
        try {
            Cursor cursorM4495a = m4495a(this.f3435l, string, 50);
            if (cursorM4495a != null) {
                cursorM4495a.getCount();
                return cursorM4495a;
            }
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    Drawable m4496a(Uri uri) throws FileNotFoundException {
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f1666d.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException e) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException("More than two path segments: " + uri);
                }
                identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (identifier == 0) {
                throw new FileNotFoundException("No resource found for: " + uri);
            }
            return resourcesForApplication.getDrawable(identifier);
        } catch (PackageManager.NameNotFoundException e2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    @Override // android.support.v4.widget.AbstractC0328l, android.support.v4.widget.AbstractC0320d
    /* JADX INFO: renamed from: a */
    public View mo2380a(Context context, Cursor cursor, ViewGroup viewGroup) {
        View viewMo2380a = super.mo2380a(context, cursor, viewGroup);
        viewMo2380a.setTag(new a(viewMo2380a));
        ((ImageView) viewMo2380a.findViewById(C0333a.f.edit_query)).setImageResource(this.f3438o);
        return viewMo2380a;
    }

    /* JADX INFO: renamed from: a */
    public void m4497a(int i) {
        this.f3440q = i;
    }

    @Override // android.support.v4.widget.AbstractC0320d, android.support.v4.widget.C0321e.a
    /* JADX INFO: renamed from: a */
    public void mo2382a(Cursor cursor) {
        if (this.f3439p) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.mo2382a(cursor);
            if (cursor != null) {
                this.f3442s = cursor.getColumnIndex("suggest_text_1");
                this.f3443t = cursor.getColumnIndex("suggest_text_2");
                this.f3444u = cursor.getColumnIndex("suggest_text_2_url");
                this.f3445v = cursor.getColumnIndex("suggest_icon_1");
                this.f3446w = cursor.getColumnIndex("suggest_icon_2");
                this.f3447x = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    @Override // android.support.v4.widget.AbstractC0320d
    /* JADX INFO: renamed from: a */
    public void mo2383a(View view, Context context, Cursor cursor) {
        a aVar = (a) view.getTag();
        int i = this.f3447x != -1 ? cursor.getInt(this.f3447x) : 0;
        if (aVar.f3448a != null) {
            m4485a(aVar.f3448a, m4482a(cursor, this.f3442s));
        }
        if (aVar.f3449b != null) {
            String strM4482a = m4482a(cursor, this.f3444u);
            CharSequence charSequenceM4490b = strM4482a != null ? m4490b((CharSequence) strM4482a) : m4482a(cursor, this.f3443t);
            if (TextUtils.isEmpty(charSequenceM4490b)) {
                if (aVar.f3448a != null) {
                    aVar.f3448a.setSingleLine(false);
                    aVar.f3448a.setMaxLines(2);
                }
            } else if (aVar.f3448a != null) {
                aVar.f3448a.setSingleLine(true);
                aVar.f3448a.setMaxLines(1);
            }
            m4485a(aVar.f3449b, charSequenceM4490b);
        }
        if (aVar.f3450c != null) {
            m4484a(aVar.f3450c, m4492e(cursor), 4);
        }
        if (aVar.f3451d != null) {
            m4484a(aVar.f3451d, m4493f(cursor), 8);
        }
        if (this.f3440q != 2 && (this.f3440q != 1 || (i & 1) == 0)) {
            aVar.f3452e.setVisibility(8);
            return;
        }
        aVar.f3452e.setVisibility(0);
        aVar.f3452e.setTag(aVar.f3448a.getText());
        aVar.f3452e.setOnClickListener(this);
    }

    @Override // android.support.v4.widget.AbstractC0320d, android.support.v4.widget.C0321e.a
    /* JADX INFO: renamed from: c */
    public CharSequence mo2387c(Cursor cursor) {
        String strM4483a;
        String strM4483a2;
        if (cursor == null) {
            return null;
        }
        String strM4483a3 = m4483a(cursor, "suggest_intent_query");
        if (strM4483a3 != null) {
            return strM4483a3;
        }
        if (this.f3435l.shouldRewriteQueryFromData() && (strM4483a2 = m4483a(cursor, "suggest_intent_data")) != null) {
            return strM4483a2;
        }
        if (!this.f3435l.shouldRewriteQueryFromText() || (strM4483a = m4483a(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return strM4483a;
    }

    @Override // android.support.v4.widget.AbstractC0320d, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View viewB = mo2385b(this.f1666d, this.f1665c, viewGroup);
            if (viewB != null) {
                ((a) viewB.getTag()).f3448a.setText(e.toString());
            }
            return viewB;
        }
    }

    @Override // android.support.v4.widget.AbstractC0320d, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View viewMo2380a = mo2380a(this.f1666d, this.f1665c, viewGroup);
            if (viewMo2380a != null) {
                ((a) viewMo2380a.getTag()).f3448a.setText(e.toString());
            }
            return viewMo2380a;
        }
    }

    @Override // android.support.v4.widget.AbstractC0320d, android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        m4491d(mo2378a());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        m4491d(mo2378a());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f3434k.m3562a((CharSequence) tag);
        }
    }
}
