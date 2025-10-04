package com.omeracar.services.impl;

import com.omeracar.dto.DtoAddress;
import com.omeracar.dto.DtoCustomer;
import com.omeracar.entities.Address;
import com.omeracar.entities.Customer;
import com.omeracar.repository.CustomerRepository;
import com.omeracar.services.ICustomerService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerServiceImpl implements ICustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public DtoCustomer findCustomerById(Long id) {

        DtoCustomer dtoCustomer = new DtoCustomer();
        DtoAddress dtoAddress =new DtoAddress();

        Optional<Customer> optional = customerRepository.findById(id);

        if (optional.isEmpty()) {
            return null;
        }
        Customer customer = optional.get();
        Address address = optional.get().getAddress();

        BeanUtils.copyProperties(customer,dtoCustomer);
        BeanUtils.copyProperties(address,dtoAddress);//customerden address gelmedigi icin addressdto dan ayrica aldik

        dtoCustomer.setAddress(dtoAddress);//burda da ayri aldigimiz adressi customerin icine setledik

        return dtoCustomer;

    }
}
