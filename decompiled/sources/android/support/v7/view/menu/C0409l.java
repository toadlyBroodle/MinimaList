package android.support.v7.view.menu;

import android.content.Context;
import android.support.v4.p013e.p014a.InterfaceMenuItemC0196b;
import android.support.v4.p019j.AbstractC0232c;
import android.support.v7.view.menu.MenuItemC0408k;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;

/* JADX INFO: renamed from: android.support.v7.view.menu.l */
/* JADX INFO: loaded from: classes.dex */
class C0409l extends MenuItemC0408k {

    /* JADX INFO: renamed from: android.support.v7.view.menu.l$a */
    class a extends MenuItemC0408k.a implements ActionProvider.VisibilityListener {

        /* JADX INFO: renamed from: c */
        AbstractC0232c.b f2587c;

        public a(Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        @Override // android.support.v4.p019j.AbstractC0232c
        /* JADX INFO: renamed from: a */
        public View mo1680a(MenuItem menuItem) {
            return this.f2582a.onCreateActionView(menuItem);
        }

        @Override // android.support.v4.p019j.AbstractC0232c
        /* JADX INFO: renamed from: a */
        public void mo1682a(AbstractC0232c.b bVar) {
            this.f2587c = bVar;
            ActionProvider actionProvider = this.f2582a;
            if (bVar == null) {
                this = null;
            }
            actionProvider.setVisibilityListener(this);
        }

        @Override // android.support.v4.p019j.AbstractC0232c
        /* JADX INFO: renamed from: b */
        public boolean mo1685b() {
            return this.f2582a.overridesItemVisibility();
        }

        @Override // android.support.v4.p019j.AbstractC0232c
        /* JADX INFO: renamed from: c */
        public boolean mo1686c() {
            return this.f2582a.isVisible();
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z) {
            if (this.f2587c != null) {
                this.f2587c.mo1691a(z);
            }
        }
    }

    C0409l(Context context, InterfaceMenuItemC0196b interfaceMenuItemC0196b) {
        super(context, interfaceMenuItemC0196b);
    }

    @Override // android.support.v7.view.menu.MenuItemC0408k
    /* JADX INFO: renamed from: a */
    MenuItemC0408k.a mo3315a(ActionProvider actionProvider) {
        return new a(this.f2457a, actionProvider);
    }
}
