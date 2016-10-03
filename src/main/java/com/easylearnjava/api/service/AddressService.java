package com.easylearnjava.api.service;

import org.springframework.stereotype.Service;

import com.easylearnjava.api.model.Address;


@Service
public class AddressService {

    private Address address;

    public Address load() {
        return address;
    }

    public void save(final Address address) {
        this.address = address;
    }
}
