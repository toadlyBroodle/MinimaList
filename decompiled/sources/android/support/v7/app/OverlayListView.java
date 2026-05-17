package android.support.v7.app;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.animation.Interpolator;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class OverlayListView extends ListView {

    /* JADX INFO: renamed from: a */
    private final List<C0343a> f1886a;

    /* JADX INFO: renamed from: android.support.v7.app.OverlayListView$a */
    public static class C0343a {

        /* JADX INFO: renamed from: a */
        private BitmapDrawable f1887a;

        /* JADX INFO: renamed from: b */
        private float f1888b;

        /* JADX INFO: renamed from: c */
        private Rect f1889c;

        /* JADX INFO: renamed from: d */
        private Interpolator f1890d;

        /* JADX INFO: renamed from: e */
        private long f1891e;

        /* JADX INFO: renamed from: f */
        private Rect f1892f;

        /* JADX INFO: renamed from: g */
        private int f1893g;

        /* JADX INFO: renamed from: h */
        private float f1894h;

        /* JADX INFO: renamed from: i */
        private float f1895i;

        /* JADX INFO: renamed from: j */
        private long f1896j;

        /* JADX INFO: renamed from: k */
        private boolean f1897k;

        /* JADX INFO: renamed from: l */
        private boolean f1898l;

        /* JADX INFO: renamed from: m */
        private a f1899m;

        /* JADX INFO: renamed from: android.support.v7.app.OverlayListView$a$a */
        public interface a {
            /* JADX INFO: renamed from: a */
            void m2545a();
        }

        /* JADX INFO: renamed from: a */
        public BitmapDrawable m2543a() {
            return this.f1887a;
        }

        /* JADX INFO: renamed from: a */
        public boolean m2544a(long j) {
            if (this.f1898l) {
                return false;
            }
            float fMax = this.f1897k ? Math.max(0.0f, Math.min(1.0f, (j - this.f1896j) / this.f1891e)) : 0.0f;
            float interpolation = this.f1890d == null ? fMax : this.f1890d.getInterpolation(fMax);
            int i = (int) (this.f1893g * interpolation);
            this.f1889c.top = this.f1892f.top + i;
            this.f1889c.bottom = i + this.f1892f.bottom;
            this.f1888b = (interpolation * (this.f1895i - this.f1894h)) + this.f1894h;
            if (this.f1887a != null && this.f1889c != null) {
                this.f1887a.setAlpha((int) (this.f1888b * 255.0f));
                this.f1887a.setBounds(this.f1889c);
            }
            if (this.f1897k && fMax >= 1.0f) {
                this.f1898l = true;
                if (this.f1899m != null) {
                    this.f1899m.m2545a();
                }
            }
            return !this.f1898l;
        }
    }

    public OverlayListView(Context context) {
        super(context);
        this.f1886a = new ArrayList();
    }

    public OverlayListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1886a = new ArrayList();
    }

    public OverlayListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1886a = new ArrayList();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f1886a.size() > 0) {
            Iterator<C0343a> it = this.f1886a.iterator();
            while (it.hasNext()) {
                C0343a next = it.next();
                BitmapDrawable bitmapDrawableM2543a = next.m2543a();
                if (bitmapDrawableM2543a != null) {
                    bitmapDrawableM2543a.draw(canvas);
                }
                if (!next.m2544a(getDrawingTime())) {
                    it.remove();
                }
            }
        }
    }
}
