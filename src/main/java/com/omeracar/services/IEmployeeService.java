package com.omeracar.services;

import com.omeracar.dto.DtoEmployee;

import java.util.List;

public interface IEmployeeService {

    public List<DtoEmployee> findAllEmployees(Long id);

}
