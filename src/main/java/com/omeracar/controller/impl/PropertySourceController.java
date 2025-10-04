package com.omeracar.controller.impl;

import com.omeracar.configuration.DataSource;
import com.omeracar.configuration.GlobalProperties;
import com.omeracar.configuration.Server;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/api/property")
public class PropertySourceController {

    @Autowired
    private GlobalProperties globalProperties;

    @GetMapping("/datasource")
    public DataSource getDataSource() {

        return null;
    }

    @GetMapping(value = "/getServers")
    public List<Server> getServers() {
        return globalProperties.getServers();
    }
}
