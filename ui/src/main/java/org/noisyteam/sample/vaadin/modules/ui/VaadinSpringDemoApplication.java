/*
 * Copyright 2011 Navin Peiris <navin.peiris@gmail.com>, Melbourne, Australia.
 * All Rights Reserved.
 */

package org.noisyteam.sample.vaadin.modules.ui;

import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.*;
import org.noisyteam.sample.vaadin.modules.common.SampleModule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;

import java.util.List;

/**
 * Main application entry point for the Vaadin-Spring Demo Application.
 * 
 * @author Navin Peiris
 * @since 1.0.0
 */
@Configurable
public class VaadinSpringDemoApplication extends UI {
    private static final long serialVersionUID = 1L;

    public static final String APPLICATION_TITLE = "Vaading-Spring Demo";

    @Autowired
    private List<SampleModule> modules;

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        // Create an empty tab sheet.
        TabSheet tabsheet = new TabSheet();

// Create a component to put in a tab and put
// some content in it.
        VerticalLayout myTabRoot = new VerticalLayout();
        myTabRoot.addComponent(new Label("Hello, I am a Tab!"));

// Add the component to the tab sheet as a new tab.
        tabsheet.addTab(myTabRoot);
//        Component cmp = new MainWindow();
//        ((MainWindow)cmp).addInstanceLabels();
        for (SampleModule module: modules) {
            tabsheet.addTab(module.getView());
            tabsheet.getTab(module.getView()).setCaption(module.getName());
        }

// Get the Tab holding the component and set its caption.
        tabsheet.getTab(myTabRoot).setCaption("My Tab");
        addComponent(tabsheet);
    }
}
