package com.rviewer.skeletons;

import com.rviewer.skeletons.constant.MenuConstants;
import com.rviewer.skeletons.utils.MenuCommonsHelper;


public class RviewerSkeleton {
    MenuCommonsHelper menuCommonsHelper = new MenuCommonsHelper();
    public void start(){

        System.out.println("Elige un menú");
        System.out.println("-E-Wok Menu:");
        System.out.println(menuCommonsHelper.showMenu());
        System.out.println(menuCommonsHelper.orderMenu());
        System.out.println("Acaba el programa");

    }
}
