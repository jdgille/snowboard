package com.aston.snowboard.services;

import com.aston.snowboard.domain.Address;

/**
 * Created by jonagill1 on 6/27/2016.
 */
public interface AddressService {

    Iterable<Address> listAllAddresses();

    Address getAddressById(Integer id);

    Address saveAddress(Address address);

    Iterable<Address> saveAddressList(Iterable<Address> addressIterable);

    void deleteAddress(Integer id);
}
