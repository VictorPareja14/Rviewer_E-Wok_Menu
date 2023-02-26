package com.rviewer.skeletons.utils;

import org.springframework.beans.factory.annotation.Value;

public class MenuPrices {
    @Value("${menu.price.1}")
    private int priceFirstMenu;
    @Value("${menu.price.2}")
    private int priceSecondMenu;
    @Value("${menu.price.3}")
    private int priceThirdMenu;
    @Value("${menu.price.4}")
    private int priceFourthMenu;
}
