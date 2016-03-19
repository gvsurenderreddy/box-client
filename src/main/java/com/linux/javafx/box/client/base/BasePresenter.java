/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.linux.javafx.box.client.base;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import org.slf4j.Logger;
import static org.slf4j.LoggerFactory.getLogger;

/**
 *
 * @author guru
 */
public class BasePresenter implements Initializable{

    private static final Logger log = getLogger(BasePresenter.class);
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        log.debug("URL : {}", url);
        log.debug("Resource Bundle : {}", rb);
    }
    
}
