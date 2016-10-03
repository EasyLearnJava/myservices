package com.easylearnjava.api.model;

import javax.validation.constraints.Pattern;

public class AddressParamV1 {

    private String address;

    @Pattern(regexp = "(\\d{5}) (.*)")
    public String getAddress() {
        return address;
    }

    public void setAddress(final String address) {
        this.address = address;
    }
}
