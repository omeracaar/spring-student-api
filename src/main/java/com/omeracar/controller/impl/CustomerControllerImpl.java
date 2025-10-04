package com.omeracar.controller.impl;

import com.omeracar.controller.ICustomerController;
import com.omeracar.dto.DtoCustomer;
import com.omeracar.services.ICustomerService;
import com.omeracar.services.impl.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rest/api/customer")
public class CustomerControllerImpl implements ICustomerController {

    @Autowired
    private ICustomerService customerService;

    @GetMapping(path = "/list/{id}")
    @Override
    public DtoCustomer findCustomerById(@PathVariable(name = "id")Long id) {
        return customerService.findCustomerById(id);
    }

}
