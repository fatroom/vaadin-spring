/*
 * Copyright 2011 Navin Peiris <navin.peiris@gmail.com>, Melbourne, Australia.
 * All Rights Reserved.
 */

package com.navinpeiris.vaadin_spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;

import com.vaadin.Application;

/**
 * Main application entry point for the Vaadin-Spring Demo Application.
 * 
 * @author Navin Peiris
 * @since 1.0.0
 */
@Configurable
public class VaadinSpringDemoApplication extends Application {
    private static final long serialVersionUID = 1L;

    public static final String APPLICATION_TITLE = "Vaading-Spring Demo";

    @Autowired
    private MainWindow mainWindow;

    @Override
    public void init() {
        setMainWindow(mainWindow);
    }

}
