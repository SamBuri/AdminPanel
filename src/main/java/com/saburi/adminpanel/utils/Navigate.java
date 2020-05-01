/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saburi.adminpanel.utils;

import com.saburi.adminpanel.main.MainApp;
import com.saburi.common.dbaccess.DBAccess;
import com.saburi.common.utils.Navigation;
import com.saburi.common.utils.Utilities.FormMode;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;

/**
 *
 * @author Hp
 */
public class Navigate {

    public static Class mainClass = MainApp.class;

    public static FXMLLoader getUILoader(String ui) {
        return Navigation.getUILoader(mainClass, ui + ".fxml");
    }

    public static void editMenuItemClick(MenuItem menuItem, String uiName, String title, FormMode formMode) {

        Navigation.editMenuItemClick(mainClass, menuItem, uiName, title, formMode);
    }

    public static void editMenuItemClick(MenuItem menuItem, String uiName, String title, FormMode formMode, boolean maximise) {

        Navigation.editMenuItemClick(mainClass, menuItem, uiName, title, formMode, maximise);
    }

    public static void editMenuItemClick(Button button, Node node, String uiName, String title, FormMode formMode, boolean maximised) {
        Navigation.editMenuItemClick(mainClass, button, node, uiName, title, formMode, maximised);

    }

    public static void editMenuItemClickIgnoreParent(MenuItem menuItem, String uiName, String title, FormMode formMode) {

        Navigation.editMenuItemClickIgnoreParent(mainClass, menuItem, uiName, title, formMode);

    }

    public static void editMenuItemClickIgnoreParent(MenuItem menuItem, String uiName, String title, FormMode formMode, boolean maximise) {

        Navigation.editMenuItemClickIgnoreParent(mainClass, menuItem, uiName, title, formMode, maximise);

    }

    public static void viewMenuItemClick(MenuItem menuItem, DBAccess oDBAccess, String objectName,
            String uiCaption, boolean restrainColumns, boolean maximised) {
        Navigation.viewMenuItemClick(mainClass, menuItem, oDBAccess, objectName, uiCaption, restrainColumns, maximised);

    }
    
     public static void viewMenuItemClick(MenuItem menuItem, DBAccess oDBAccess, String objectName,
            String uiCaption, boolean restrainColumns, boolean maximised, boolean editable, boolean printable) {
        Navigation.viewMenuItemClick(mainClass, menuItem, oDBAccess, objectName, uiCaption, restrainColumns, maximised, editable, printable);

    }

    public static void viewMenuItemClickOptionalRight(MenuItem menuItem, DBAccess oDBAccess, String objectName,
            String uiCaption, boolean restrainColumns, boolean maximised) {
        Navigation.viewMenuItemClickOptionalRight(mainClass, menuItem, oDBAccess, objectName, uiCaption, restrainColumns, maximised);
    }

    public static void viewMenuItemClickIgnoreParent(MenuItem menuItem, DBAccess oDBAccess, String objectName,
            String uiCaption, boolean restrainColumns, boolean maximised) {
        Navigation.viewMenuItemClickIgnoreParent(mainClass, menuItem, oDBAccess, objectName, uiCaption, restrainColumns, maximised);
    }

    public static void viewMenuItemClick(MenuItem menuItem, DBAccess oDBAccess, String objectName, String uiName,
            String uiCaption, boolean restrainColumns, boolean maximised) {
        Navigation.viewMenuItemClick(mainClass, menuItem, oDBAccess, objectName, uiName, uiCaption, restrainColumns, maximised);
    }

    public static void viewMenuItemClickHasWithoutParent(MenuItem menuItem, DBAccess oDBAccess, String objectName,
            String uiName, String uiCaption, boolean restrainColumns, boolean maximised) {
        Navigation.viewMenuItemClickHasWithoutParent(mainClass, menuItem, oDBAccess, objectName, uiName, uiCaption, restrainColumns, maximised);
    }

}
