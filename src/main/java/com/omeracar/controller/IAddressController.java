package com.omeracar.controller;

import com.omeracar.dto.DtoAddress;

public interface IAddressController {

    public DtoAddress findAddressById(Long id);
}
