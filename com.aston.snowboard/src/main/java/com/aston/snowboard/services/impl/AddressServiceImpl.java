package com.aston.snowboard.services.impl;

import com.aston.snowboard.domain.Address;
import com.aston.snowboard.repositories.AddressRepository;
import com.aston.snowboard.services.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by jonagill1 on 6/27/2016.
 */

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressRepository addressRepository;

    @Override
    public Iterable<Address> listAllAddresses() {
        return addressRepository.findAll();
    }

    @Override
    public Address getAddressById(Integer id) {
        return addressRepository.findOne(id);
    }

    @Override
    public Address saveAddress(Address address) {
        return addressRepository.save(address);
    }

    @Override
    public Iterable<Address> saveAddressList(Iterable<Address> addressIterable) {
        return addressRepository.save(addressIterable);
    }

    @Override
    public void deleteAddress(Integer id) {
        addressRepository.delete(id);
    }
}
