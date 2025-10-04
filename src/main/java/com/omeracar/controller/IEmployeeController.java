package com.omeracar.controller;

import com.omeracar.dto.DtoEmployee;

import java.util.List;

public interface IEmployeeController {

    public List<DtoEmployee> findAllEmployees(Long id);
}