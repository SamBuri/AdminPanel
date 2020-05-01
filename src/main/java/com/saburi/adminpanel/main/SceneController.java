/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saburi.adminpanel.main;

import com.saburi.adminpanel.dbaccess.LicenseGeneratorDA;
import com.saburi.common.utils.Utilities.FormMode;
import static com.saburi.adminpanel.utils.Navigate.editMenuItemClick;
import static com.saburi.adminpanel.utils.Navigate.viewMenuItemClick;
import com.saburi.adminpanel.utils.SearchTree;
import com.saburi.common.controllers.CommonSceneController;
import com.saburi.common.utils.FXUIUtils;
import static com.saburi.common.utils.Navigation.loadSearchEngine;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;

import javafx.scene.control.MenuItem;

/**
 * FXML Controller class
 *
 * @author ClinicMaster13
 */
public class SceneController extends CommonSceneController {
    @FXML
    private MenuItem spmLicenseGeneratorNew, spmLicenseGeneratorEdit, spmLicenseGeneratorView;

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            super.init();
            loadSearchEngine(mnuSearchEngine, new SearchTree().getTreeItems(), true);
            editMenuItemClick(spmLicenseGeneratorNew, "LicenseGenerator", "License Generator", FormMode.Save);
            editMenuItemClick(spmLicenseGeneratorEdit, "LicenseGenerator", "License Generator", FormMode.Update);
            viewMenuItemClick(spmLicenseGeneratorView, new LicenseGeneratorDA(), "LicenseGenerator", "License Generators", false, true);
            
        } catch (Exception e) {
            FXUIUtils.errorMessage(e);
        }
        
    }
    
}
