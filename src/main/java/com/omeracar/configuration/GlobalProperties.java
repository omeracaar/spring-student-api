package com.omeracar.configuration;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@Data
@ConfigurationProperties(prefix = "app")
public class GlobalProperties {

    private List<Server> servers;

}



