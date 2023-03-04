package com.rviewer.skeletons.utils;


import com.rviewer.skeletons.constant.MenuConstants;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

import java.util.*;

public class MenuCommonsHelper {

    private static final Logger log = LogManager.getLogger(MenuCommonsHelper.class);
   private List<String> wokMenu = new ArrayList<>();

    public String showMenu(){
        wokMenu.add(MenuConstants.WOK_MENU_1);
        wokMenu.add(MenuConstants.WOK_MENU_2);
        wokMenu.add(MenuConstants.WOK_MENU_3);
        wokMenu.add(MenuConstants.WOK_MENU_4);
        String list = Arrays.toString(wokMenu.toArray()).replace("[", "").replace("]", "").replace(",","");
        return list;
    }
    public int orderMenu(int menuNumber, int quantity){
        Scanner in = new Scanner(System.in);
        menuNumber=in.nextInt();

        switch (menuNumber){
            case 1:
                menuNumber=MenuConstants.WOK_MENU_1_PRICE;
                break;
            case 2:
                menuNumber=MenuConstants.WOK_MENU_2_PRICE;
                break;
            case 3:
                menuNumber=MenuConstants.WOK_MENU_3_PRICE;
                break;
            case 4:
                menuNumber=MenuConstants.WOK_MENU_4_PRICE;
                break;

        }
        System.out.println(MenuConstants.WOK_CHOOSE_QUANTITY+quantity);
        int total = totalPayment(menuNumber,quantity);
        System.out.println(MenuConstants.WOK_TOTAL_PAYMENT+total);
        return menuNumber;
    }

    public int totalPayment(int menuNumber, int quantity){
        int result = quantity * menuNumber;
        return result;

    }
}
