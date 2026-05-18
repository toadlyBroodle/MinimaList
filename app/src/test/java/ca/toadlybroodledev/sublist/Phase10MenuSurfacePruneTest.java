package ca.toadlybroodledev.sublist;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Phase 10.4 + 10.5: prune obsolete UI surface.
 *
 * 10.4 — Drop the "Profile" and "Invite friends" drawer-menu entries and delete
 *        ProfileFragment.java + every ProfileFragment reference (HostContract.mo4776n,
 *        MainActivity.f3707q, OutlineTree.m4996b call to mo4776n().m4865ac, etc.).
 *
 * 10.5 — Replace donate / premium-upgrade items in SettingsFragment with a single
 *        "Contribute on GitHub" button (Intent.ACTION_VIEW against
 *        https://github.com/toadlyBroodle/MinimaList). Strip orphaned donation /
 *        premium / invite / profile strings from res/values/strings.xml. Add
 *        an https <data> entry to the <queries> block in AndroidManifest.xml.
 */
public class Phase10MenuSurfacePruneTest {

    private static final String GITHUB_URL = "https://github.com/toadlyBroodle/MinimaList";

    private File projectRoot() {
        File dir = new File(System.getProperty("user.dir"));
        while (dir != null) {
            if (new File(dir, "settings.gradle.kts").exists()) return dir;
            dir = dir.getParentFile();
        }
        throw new IllegalStateException("Cannot find project root");
    }

    private String read(String rel) {
        try {
            return new String(Files.readAllBytes(new File(projectRoot(), rel).toPath()));
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    private boolean exists(String rel) {
        return new File(projectRoot(), rel).exists();
    }

    // ---- 10.4: menu prune --------------------------------------------------

    @Test
    public void drawerMenuDropsProfileItem() {
        String xml = read("app/src/main/res/menu/drawer_menu.xml");
        assertFalse("drawer_menu.xml must not declare @+id/menu_profile (Phase 10.4)",
                xml.contains("@+id/menu_profile"));
    }

    @Test
    public void drawerMenuDropsInviteItem() {
        String xml = read("app/src/main/res/menu/drawer_menu.xml");
        assertFalse("drawer_menu.xml must not declare @+id/menu_invite (Phase 10.4)",
                xml.contains("@+id/menu_invite"));
    }

    // ---- 10.4: ProfileFragment deletion ------------------------------------

    @Test
    public void profileFragmentFileDeleted() {
        assertFalse("ProfileFragment.java must be deleted (Phase 10.4)",
                exists("app/src/main/java/ca/toadlybroodledev/sublist/ProfileFragment.java"));
    }

    @Test
    public void hostContractDropsProfileGetter() {
        String src = read("app/src/main/java/ca/toadlybroodledev/sublist/iface/HostContract.java");
        assertFalse("HostContract must not declare mo4776n() (Phase 10.4)",
                src.contains("mo4776n"));
        assertFalse("HostContract must not import ProfileFragment (Phase 10.4)",
                src.contains("import ca.toadlybroodledev.sublist.ProfileFragment"));
    }

    @Test
    public void mainActivityDropsProfileWiring() {
        String src = read("app/src/main/java/ca/toadlybroodledev/sublist/MainActivity.java");
        assertFalse("MainActivity must not declare ProfileFragment field (Phase 10.4)",
                src.contains("ProfileFragment f3707q"));
        assertFalse("MainActivity must not new ProfileFragment() (Phase 10.4)",
                src.contains("new ProfileFragment()"));
    }

    @Test
    public void outlineTreeDropsProfileCall() {
        String src = read("app/src/main/java/ca/toadlybroodledev/sublist/OutlineTree.java");
        assertFalse("OutlineTree must not call hostContract.mo4776n() (Phase 10.4)",
                src.contains("mo4776n"));
    }

    @Test
    public void drawerCustomLayoutDropsProfileCase() {
        String src = read(
                "app/src/main/java/ca/toadlybroodledev/sublist/DrawerCustomLayout.java");
        assertFalse("DrawerCustomLayout must not reference R.id.menu_profile (Phase 10.4)",
                src.contains("R.id.menu_profile"));
        assertFalse("DrawerCustomLayout must not reference f3707q (ProfileFragment) (10.4)",
                src.contains("f3707q"));
    }

    // ---- 10.4: orphaned strings (invite/profile/menu_profile) --------------

    @Test
    public void orphanedInviteAndProfileStringsRemoved() {
        String xml = read("app/src/main/res/values/strings.xml");
        String[] dead = {
                // menu entries
                "name=\"menu_profile\"",
                "name=\"menu_invite_friends\"",
                // invite/invitation
                "name=\"invitation_cta\"",
                "name=\"invitation_message\"",
                "name=\"invitation_title\"",
                "name=\"invite_friends_format\"",
                "name=\"invite_promo_text\"",
                "name=\"invite_welcome\"",
                "name=\"invites_failed\"",
                "name=\"info_10_days_per_invite\"",
                // profile fragment
                "name=\"profile_completed_fmt\"",
                "name=\"profile_data_sync_title\"",
                "name=\"profile_expires_never\"",
                "name=\"profile_invite_friends\"",
                "name=\"profile_minimalists_converted\"",
                "name=\"profile_not_signed_in\"",
                "name=\"profile_prem_not_yet\"",
                "name=\"profile_premium_days\"",
                "name=\"profile_premium_expires_text\"",
                "name=\"profile_premium_for_every_invite\"",
                "name=\"profile_premium_member\"",
                "name=\"profile_premium_share_title\"",
                "name=\"profile_premium_trial\"",
                "name=\"profile_pull_down\"",
                "name=\"profile_purchase_premium\"",
                "name=\"profile_push_up\"",
                "name=\"profile_unlock_premium_features_title\"",
                "name=\"profile_user_title\"",
        };
        for (String key : dead) {
            assertFalse("strings.xml must not contain orphaned key " + key + " (Phase 10.4)",
                    xml.contains(key));
        }
    }

    // ---- 10.5: donate/premium pruned, GitHub contribute item added ---------

    @Test
    public void orphanedDonatePremiumStringsRemoved() {
        String xml = read("app/src/main/res/values/strings.xml");
        String[] dead = {
                "name=\"billing_please_sign_in\"",
                "name=\"dialog_premium_feature_purchase\"",
                "name=\"dialog_purchase_premium\"",
                "name=\"info_prem_features\"",
                "name=\"info_remove_ads\"",
                "name=\"info_unlock_prem_features_forever\"",
                "name=\"info_try_prem_invites\"",
                "name=\"info_signed_in_enable_prem_features\"",
                "name=\"toast_purchase_premium_thanks\"",
        };
        for (String key : dead) {
            assertFalse("strings.xml must not contain orphaned key " + key + " (Phase 10.5)",
                    xml.contains(key));
        }
    }

    @Test
    public void contributeGithubStringPresent() {
        String xml = read("app/src/main/res/values/strings.xml");
        assertTrue("strings.xml must declare settings_contribute_github (Phase 10.5)",
                xml.contains("name=\"settings_contribute_github\""));
    }

    @Test
    public void fragmentSettingsHasContributeGithubButton() {
        String xml = read("app/src/main/res/layout/fragment_settings.xml");
        assertTrue("fragment_settings.xml must declare @+id/settings_contribute_github (10.5)",
                xml.contains("@+id/settings_contribute_github"));
    }

    @Test
    public void settingsFragmentHandlesContributeGithubClick() {
        String src = read(
                "app/src/main/java/ca/toadlybroodledev/sublist/SettingsFragment.java");
        assertTrue("SettingsFragment must reference R.id.settings_contribute_github (10.5)",
                src.contains("R.id.settings_contribute_github"));
        assertTrue("SettingsFragment must reference the MinimaList GitHub URL (10.5)",
                src.contains(GITHUB_URL));
        assertTrue("SettingsFragment must use Intent.ACTION_VIEW for GitHub link (10.5)",
                src.contains("Intent.ACTION_VIEW"));
    }

    @Test
    public void manifestQueriesIncludesHttpsScheme() {
        String xml = read("app/src/main/AndroidManifest.xml");
        // <queries> block must declare an https-scheme intent so resolveActivity()
        // can return non-null for the GitHub launch on Android 11+.
        int queriesStart = xml.indexOf("<queries>");
        int queriesEnd = xml.indexOf("</queries>");
        assertTrue("AndroidManifest must contain a <queries> block (Phase 10.5)",
                queriesStart >= 0 && queriesEnd > queriesStart);
        String queries = xml.substring(queriesStart, queriesEnd);
        assertTrue("AndroidManifest <queries> must declare an https <data> scheme (Phase 10.5)",
                queries.contains("android:scheme=\"https\""));
    }
}
