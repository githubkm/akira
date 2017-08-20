package com.akira.tenantonboardingplatform.operation;

import java.util.UUID;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.akira.tenantonboardingplatform.exception.RequestValidationException;
import com.akira.tenantonboardingplatform.types.Tenant;

public class RegisterTenantOperationTest {

    private RegisterTenantOperation op;

    private String id;
    private String name;
    private String address;
    private String emailId;
    private String phone;

    @Before
    public void setup() {
        op = new RegisterTenantOperation();
        id = UUID.randomUUID().toString();
        name = UUID.randomUUID().toString();
        address = UUID.randomUUID().toString();
        emailId = UUID.randomUUID().toString();
        phone = UUID.randomUUID().toString();
    }

    @Test
    public void testRegisterTenant() {
        Assert.assertNull(op.registerTenant(new Tenant(id, name, address, emailId, phone)));
    }

    @Test(expected = RequestValidationException.class)
    public void testRegisterTenantWithInvalidName() {
        op.registerTenant(new Tenant(id, null, address, emailId, phone));
    }

    @Test(expected = RequestValidationException.class)
    public void testRegisterTenantWithInvalidAddress() {
        op.registerTenant(new Tenant(id, name, null, emailId, phone));
    }

    @Test(expected = RequestValidationException.class)
    public void testRegisterTenantWithInvalidEmailId() {
        op.registerTenant(new Tenant(id, name, address, null, phone));
    }

    @Test(expected = RequestValidationException.class)
    public void testRegisterTenantWithInvalidPhone() {
        op.registerTenant(new Tenant(id, name, address, emailId, null));
    }

}
