/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saburi.adminpanel.main;

import com.saburi.common.utils.FXUIUtils;

/**
 *
 * @author Hp
 */
public class Main {
    public static void main(String[] args) {
        try {
            MainApp.main(args);
        } catch (Exception e) {
            FXUIUtils.errorMessage(e);
        }
    }
}
