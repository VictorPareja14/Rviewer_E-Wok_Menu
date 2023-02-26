package com.rviewer.skeletons;

import com.rviewer.skeletons.utils.MenuCommonsHelper;

public class RviewerSkeleton {
    private MenuCommonsHelper menuCommonsHelper = new MenuCommonsHelper();
    public void start(){
        System.out.println("Inicia el programa");
        System.out.println("-E-Wok Menu:");
        System.out.println(menuCommonsHelper.showMenu());
        System.out.println("Acaba el programa");

    }
}
