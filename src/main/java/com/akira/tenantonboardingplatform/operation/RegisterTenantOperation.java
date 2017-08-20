package com.akira.tenantonboardingplatform.operation;

import com.akira.tenantonboardingplatform.exception.RequestValidationException;
import com.akira.tenantonboardingplatform.types.Tenant;
import com.google.common.base.Strings;

public class RegisterTenantOperation {

    public String registerTenant(final Tenant tenant) {
        if (!isRequestValid(tenant)) {
            throw new RequestValidationException("Invalid RegisterTenant operation request.");
        }
        return null;
    }

    private boolean isRequestValid(Tenant tenant) {
        return tenant != null && 
                !Strings.isNullOrEmpty(tenant.getEmailId()) && 
                !Strings.isNullOrEmpty(tenant.getName()) && 
                !Strings.isNullOrEmpty(tenant.getPhone()) && 
                !Strings.isNullOrEmpty(tenant.getAddress());
    }

}
