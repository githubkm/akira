package com.akira.tenantonboardingplatform.types;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Tenant {
    private String id;
    private String name;
    private String address;
    private String emailId;
    private String phone;
}
