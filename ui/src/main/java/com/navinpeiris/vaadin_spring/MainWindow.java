/*
 * Copyright 2011 Navin Peiris <navin.peiris@gmail.com>, Melbourne, Australia.
 * All Rights Reserved.
 */

package com.navinpeiris.vaadin_spring;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.vaadin.ui.Label;
import com.vaadin.ui.Window;

/**
 * The main window for the demo.
 * 
 * @author Navin Peiris
 * @since 1.0.0
 */
@Component
@Scope("session")
public class MainWindow extends Window {
    private static final long serialVersionUID = 1L;

    private static int instanceId = 0;

    @Autowired
    private TextLabelService textLabelService;

    public MainWindow() {
        super(VaadinSpringDemoApplication.APPLICATION_TITLE);

        instanceId++;

        addComponent(new Label(VaadinSpringDemoApplication.APPLICATION_TITLE));
    }

    @PostConstruct
    public void addInstanceLabels() {
        addComponent(new Label("MainWindow instanceId: " + instanceId));
        addComponent(new Label(textLabelService.getInstanceText()));
    }
}
