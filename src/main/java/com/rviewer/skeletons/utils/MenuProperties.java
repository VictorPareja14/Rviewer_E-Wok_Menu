package com.rviewer.skeletons.utils;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

import java.util.List;

@ConfigurationPropertiesScan
@Data
public class MenuProperties {
    @Value("${menuPrices}")
    private List<String> menuPrices;

}
