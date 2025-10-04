package com.omeracar.controller.impl;

import com.omeracar.controller.IAddressController;
import com.omeracar.dto.DtoAddress;
import com.omeracar.services.IAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/api/address")
public class AddressControllerImpl implements IAddressController{

    @Autowired
    private IAddressService iAdressService;

    @GetMapping("/list/{id}")
    @Override
    public DtoAddress findAddressById(@PathVariable(name = "id") Long id) {
        return iAdressService.findAddressById(id);
    }
}
