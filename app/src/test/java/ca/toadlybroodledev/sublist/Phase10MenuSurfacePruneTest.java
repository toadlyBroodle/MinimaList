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

    // ---- 10.4: ProfileFragment forward-compat stub -------------------------
    // Phase 10.4 deleted the real ProfileFragment; a minimal stub must remain
    // so FragmentManager saved-state restore on Moto G upgrade doesn't crash
    // with InstantiationException. Stub is dropped in Phase 10.2 rename.

    @Test
    public void profileFragmentIsMinimalStub() {
        assertTrue("ProfileFragment.java stub must exist (Phase 10.4 FM crash fix)",
                exists("app/src/main/java/ca/toadlybroodledev/sublist/ProfileFragment.java"));
        String src = read(
                "app/src/main/java/ca/toadlybroodledev/sublist/ProfileFragment.java");
        assertTrue("ProfileFragment stub must extend Fragment",
                src.contains("extends Fragment"));
        assertFalse("ProfileFragment stub must not contain cloud-profile code",
                src.contains("mo4865ac"));
        assertFalse("ProfileFragment stub must not import Firebase",
                src.contains("import com.google.firebase"));
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

    // ---- 10.6 (follow-up): cloud-era SettingsFragment UI vestiges removed ---
    // The pre-2018 build shipped four cloud-era controls in fragment_settings:
    //   - "Rate :)"           → Google Play store intent (Phase 3 strip target,
    //                            but UI surface lingered)
    //   - "Email Lonely Dev"  → mailto: support contact (cloud-era support
    //                            channel; Phase 3 stripped Firebase Analytics
    //                            but the support button survived)
    //   - "Privacy Policy"    → ACTION_VIEW against toadlybroodle.ca portfolio
    //                            URL (replaced by GitHub source-link contract
    //                            since the local-only build has no data
    //                            handling to disclose)
    //   - "anonymous analytics" Switch → AppSettings flag toggled Firebase
    //                            Analytics gathering (Phase 3.2 deleted the
    //                            collection path; flag was an orphaned setter)
    // All four UI surfaces and their backing strings/handlers are removed.
    // AppSettings.m4946k() / m4935c() retained (still referenced by source-scan
    // tests in earlier phases via grep; non-load-bearing — flagged for Phase
    // 10.2 deletion alongside the package rename).

    @Test
    public void fragmentSettingsDropsRateSupportPrivacyAnonControls() {
        String xml = read("app/src/main/res/layout/fragment_settings.xml");
        assertFalse("fragment_settings.xml must not declare @+id/settings_rate",
                xml.contains("@+id/settings_rate"));
        assertFalse("fragment_settings.xml must not declare @+id/settings_support",
                xml.contains("@+id/settings_support"));
        assertFalse("fragment_settings.xml must not declare @+id/settings_privacy_policy",
                xml.contains("@+id/settings_privacy_policy"));
        assertFalse("fragment_settings.xml must not declare @+id/settings_send_anon_data",
                xml.contains("@+id/settings_send_anon_data"));
    }

    @Test
    public void fragmentSettingsLargeDropsRateSupportPrivacyAnonControls() {
        String xml = read("app/src/main/res/layout-large/fragment_settings.xml");
        assertFalse("layout-large fragment_settings.xml must not declare @+id/settings_rate",
                xml.contains("@+id/settings_rate"));
        assertFalse("layout-large fragment_settings.xml must not declare @+id/settings_support",
                xml.contains("@+id/settings_support"));
        assertFalse("layout-large fragment_settings.xml must not declare @+id/settings_privacy_policy",
                xml.contains("@+id/settings_privacy_policy"));
        assertFalse("layout-large fragment_settings.xml must not declare @+id/settings_send_anon_data",
                xml.contains("@+id/settings_send_anon_data"));
    }

    @Test
    public void orphanedSettingsButtonStringsRemoved() {
        String xml = read("app/src/main/res/values/strings.xml");
        String[] dead = {
                "name=\"settings_rate\"",
                "name=\"settings_support\"",
                "name=\"settings_privacy_policy\"",
                "name=\"settings_send_anon_data\"",
                "name=\"email_support_subject\"",
        };
        for (String key : dead) {
            assertFalse("strings.xml must not contain orphaned key " + key + " (10.6)",
                    xml.contains(key));
        }
    }

    @Test
    public void settingsFragmentDropsClickHandlersForRemovedControls() {
        String src = read(
                "app/src/main/java/ca/toadlybroodledev/sublist/SettingsFragment.java");
        assertFalse("SettingsFragment must not reference R.id.settings_rate (10.6)",
                src.contains("R.id.settings_rate"));
        assertFalse("SettingsFragment must not reference R.id.settings_support (10.6)",
                src.contains("R.id.settings_support"));
        assertFalse("SettingsFragment must not reference R.id.settings_privacy_policy (10.6)",
                src.contains("R.id.settings_privacy_policy"));
        assertFalse("SettingsFragment must not reference R.id.settings_send_anon_data (10.6)",
                src.contains("R.id.settings_send_anon_data"));
        assertFalse("SettingsFragment must not retain market: rate-intent handler (10.6)",
                src.contains("market://details"));
        assertFalse("SettingsFragment must not retain mailto: support handler (10.6)",
                src.contains("Intent.ACTION_SENDTO"));
        assertFalse("SettingsFragment must not retain privacy-policy URL handler (10.6)",
                src.contains("apps-privacy-policy"));
    }

    @Test
    public void mainActivityDropsBackgroundColorWiringForRemovedButtons() {
        String src = read("app/src/main/java/ca/toadlybroodledev/sublist/MainActivity.java");
        assertFalse("MainActivity must not setBackgroundColor f3877aj (rate button, 10.6)",
                src.contains("f3877aj"));
        assertFalse("MainActivity must not setBackgroundColor f3878ak (support button, 10.6)",
                src.contains("f3878ak"));
        assertFalse("MainActivity must not setBackgroundColor f3879al (privacy button, 10.6)",
                src.contains("f3879al"));
        // The new Contribute on GitHub button (f3880ap) must receive the accent
        // background color sweep like the rest of the Settings buttons.
        assertTrue("MainActivity must setBackgroundColor for f3880ap (Contribute on GitHub button, 10.6)",
                src.contains("f3880ap.setBackgroundColor"));
    }
}
