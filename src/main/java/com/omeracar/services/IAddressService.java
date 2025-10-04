package com.omeracar.services;

import com.omeracar.dto.DtoAddress;

public interface IAddressService {

    public DtoAddress findAddressById(Long id);

}
