package com.omeracar.controller;

import com.omeracar.dto.DtoHome;

public interface IHomeController {

    public DtoHome findHomeById(Long id);

}
