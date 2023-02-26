package com.rviewer.skeletons.utils;

import com.rviewer.skeletons.constant.ApplicationConstants;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MenuCommonsHelper {

    public List<String> showMenu(){
        List<String> wokMenu = new ArrayList<>();
        wokMenu.add(ApplicationConstants.WOK_MENU_1);
        wokMenu.add(ApplicationConstants.WOK_MENU_2);
        wokMenu.add(ApplicationConstants.WOK_MENU_3);
        wokMenu.add(ApplicationConstants.WOK_MENU_4);
        Collections.replaceAll(wokMenu,",","");
        return wokMenu;
    }
}
