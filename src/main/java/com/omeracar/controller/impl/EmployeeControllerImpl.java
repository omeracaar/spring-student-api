package com.omeracar.controller.impl;

import com.omeracar.controller.IEmployeeController;
import com.omeracar.dto.DtoEmployee;
import com.omeracar.services.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/api/employee")
public class EmployeeControllerImpl implements IEmployeeController {

    @Autowired
    private IEmployeeService iEmployeeService;

    @GetMapping(path = "/list")
    @Override
    public List<DtoEmployee> findAllEmployees(Long id) {
        return iEmployeeService.findAllEmployees(id);
    }
}
