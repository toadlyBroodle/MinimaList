package ca.toadlybroodledev.minimalist.iface;

import org.junit.Test;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class IfacePackageTest {

    // ---- HostContract --------------------------------------------------------

    @Test
    public void hostContractIsInterface() {
        assertTrue(HostContract.class.isInterface());
    }

    @Test
    public void hostContractHasCorrectMethodCount() {
        // 22 methods: 27 original minus mo4756C, mo4758E (ad hooks),
        // mo4762a (C0556c profile — type deleted), mo4777o (deleted sign-in return type),
        // and mo4776n (Phase 10.4: ProfileFragment retired).
        // mo4778p was already stripped in Phase 3.5, so never in the decompiled file.
        assertEquals(22, HostContract.class.getDeclaredMethods().length);
    }

    @Test
    public void hostContractExcludesAdHooks() {
        Set<String> names = methodNames(HostContract.class);
        assertFalse("ad hook mo4756C must be absent", names.contains("mo4756C"));
        assertFalse("ad hook mo4758E must be absent", names.contains("mo4758E"));
    }

    @Test
    public void hostContractExcludesPremiumGetter() {
        assertFalse("premium getter mo4778p must be absent",
                methodNames(HostContract.class).contains("mo4778p"));
    }

    @Test
    public void hostContractExcludesDeletedTypeReturners() {
        Set<String> names = methodNames(HostContract.class);
        // mo4762a took C0556c (cloud profile, deleted)
        assertFalse("cloud profile setter mo4762a must be absent", names.contains("mo4762a"));
        // mo4777o returned ViewOnClickListenerC0559f (deleted sign-in fragment)
        assertFalse("sign-in fragment getter mo4777o must be absent", names.contains("mo4777o"));
        // mo4776n returned ProfileFragment (Phase 10.4 retired)
        assertFalse("profile getter mo4776n must be absent", names.contains("mo4776n"));
    }

    // ---- RowActionListener ---------------------------------------------------

    @Test
    public void rowActionListenerIsInterface() {
        assertTrue(RowActionListener.class.isInterface());
    }

    @Test
    public void rowActionListenerHasSixMethods() {
        assertEquals(6, RowActionListener.class.getDeclaredMethods().length);
    }

    // ---- FragmentHost --------------------------------------------------------

    @Test
    public void fragmentHostIsInterface() {
        assertTrue(FragmentHost.class.isInterface());
    }

    @Test
    public void fragmentHostHasTwoMethods() {
        assertEquals(2, FragmentHost.class.getDeclaredMethods().length);
    }

    // ---- OutlineHost ---------------------------------------------------------

    @Test
    public void outlineHostIsInterface() {
        assertTrue(OutlineHost.class.isInterface());
    }

    @Test
    public void outlineHostHasSixMethods() {
        assertEquals(6, OutlineHost.class.getDeclaredMethods().length);
    }

    // ---- helpers -------------------------------------------------------------

    private Set<String> methodNames(Class<?> iface) {
        return Arrays.stream(iface.getDeclaredMethods())
                .map(Method::getName)
                .collect(Collectors.toSet());
    }
}
