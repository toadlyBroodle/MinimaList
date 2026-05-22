# MinimaList HUMAN-action backlog (handoff doc)

> Active blockers requiring an out-of-band human action — anything the autonomous dev cycle cannot perform from inside its own iteration. **NOT** for deferred work (use the SPEC's `## Deferred / out of scope` section), and **NOT** for acceptance tests the cycle can't self-verify. HUMAN.md is the "the cycle needs you to do this out-of-band" list.
>
> Every skill reads this on start. Top of file is highest urgency; within each section, newest-first.

## Item schema

Each entry uses the form:

```
- [ ] H<phase>.<n> [easy|medium|hard] **<short title>**
  <one-paragraph body: what the human must do, where, why the cycle can't do it.>
  Blocks: <comma-separated SPEC IDs the human action is gating, or "none" if orthogonal>.
  Verify: <optional one-line shell check the supervisor/manager auto-runs on next tick; pass = move to ## Done, fail = reopen>.
  Filed by: <skill-name> at <utc-iso>.
  Source: <verdict path, transcript path, "/feedback chat <id>", or "review of <sha>">.
```

`<phase>` matches the SPEC.md phase the action is gating; `<n>` is 1-indexed within HUMAN.md per phase, independent of SPEC.md's counter. IDs are stable once assigned; gaps from removed/closed items are valid.

## Blocking

(Highest-urgency items — open `## Blocking` entries block the dev cycle from picking dependent SPEC items. The cycle emits `[blocked-on-human]` and bails if its picked item's SPEC ID appears in any `Blocks:` line here.)

## High

(Important but not actively blocking the cycle. The dev cycle continues past these unless picked-item gating exists.)

- [ ] H15.1 [medium] **Submit the F-Droid merge request to fdroiddata**
  F-Droid listings are created by a merge request against `gitlab.com/fdroid/fdroiddata`, not from the app repo. Once Phase 15.1–15.5 are complete (LICENSE, fastlane metadata, `buildToolsVersion` pin, the `v107` tag, and the linted `docs/fdroid/ca.toadlybroodle.minimalist.yml` draft), fork `fdroiddata` on GitLab, add the YAML at `metadata/ca.toadlybroodle.minimalist.yml`, and open the merge request — then monitor it and respond to reviewer feedback over the following days. The autonomous cycle cannot do this: it needs a GitLab account, the GitLab web UI/auth, and a multi-day human reviewer exchange. Full procedure in `docs/FDROID.md` Steps 6–7.
  Blocks: none — terminal deliverable of Phase 15; depends on 15.1–15.5 being complete first.
  Filed by: claude (chat with user) at 2026-05-22T08:11Z.
  Source: chat with user 2026-05-22 + docs/FDROID.md Steps 6–7.

## Medium

## Low

## Done

(Audit trail of closed entries — newest-first. The supervisor/manager moves items here after `[x]` is set AND the `Verify:` check passes. Entries keep their original H-ID and pick up a `(verified <utc>)` suffix.)

---

## How this file evolves

- **Who writes:** `sst-supervisor` (primary, post-chain), `sst-dev-review` (when a review finding's fix is human-only), `sst-manager` (on-demand `/feedback` routing), or a hand-edit.
- **Who closes:** the human user (manual `[ ]` -> `[x]`). The supervisor/manager auto-verifies on the next tick via the optional `Verify:` shell line.
- **Who reads:** every skill on cycle start. `sst-dev-cycle` especially uses `## Blocking` `Blocks:` lines to decide whether to emit `[blocked-on-human]` and bail.
- **Ordering:** newest-first within each section; sections themselves run top-to-bottom from most-urgent to least.
- **Cross-reference convention:** SPEC.md items blocked on a HUMAN entry carry a `(blocked-on H<phase>.<n>)` annotation on the item line.
- **ID gaps are valid.** Removed entries leave their ID slot empty; never renumber.
- **Distinction from the SPEC's Deferred section.** Deferred work is "we will look at this later"; a HUMAN.md item is "a human must do this out-of-band for the F-Droid/release work to land."
