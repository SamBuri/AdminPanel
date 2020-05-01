/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saburi.adminpanel.utils;

import com.saburi.adminpanel.dbaccess.LicenseGeneratorDA;
import com.saburi.adminpanel.main.MainApp;
import static com.saburi.common.utils.CommonEnums.SearchItemTypes.Revision;
import com.saburi.common.utils.SearchItem;
import com.saburi.common.utils.CommonSearchTree;
import java.util.Arrays;
import java.util.List;
import javafx.scene.control.TreeItem;

/**
 *
 * @author CLINICMASTER13
 */
public class SearchTree extends CommonSearchTree {

   
    private final Class mainClass = MainApp.class;
    private final List<SearchItem> searchItems = Arrays.asList(
             //            Set up
            
            //            Setup End
            //            Main
            new SearchItem(mainClass, new LicenseGeneratorDA(), "LicenseGenerator", "LicenseGenerators", false),
            new SearchItem(mainClass, new LicenseGeneratorDA(), Revision, "LicenseGenerator", "LicenseGenerators", false)
//    Main End
    );
    @Override
    public List<SearchItem> getSearchObjects() {
        commonSearchObjects = super.getSearchObjects();

        if (!commonSearchObjects.containsAll(searchItems)) {
            commonSearchObjects.addAll(searchItems);
        }
        return commonSearchObjects;
    }

    @Override
    public List<TreeItem> getTreeItems() {
        treeItems = super.getTreeItems();
        searchItems.forEach(e -> addTreeItem(e));
        return treeItems;
    }

}
