/*
 * Copyright 2011 Navin Peiris <navin.peiris@gmail.com>, Melbourne, Australia.
 * All Rights Reserved.
 */

package org.noisyteam.sample.vaadin.modules.a;

import javax.annotation.PostConstruct;

import com.vaadin.ui.VerticalLayout;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.vaadin.ui.Label;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * The main window for the demo.
 * 
 * @author Navin Peiris
 * @since 1.0.0
 */
@Component
@Scope("session")
public class MainWindow extends VerticalLayout {
    private static final long serialVersionUID = 1L;
    public static final String APPLICATION_TITLE = "Vaading-Spring Demo";

    private static AtomicInteger instanceId = new AtomicInteger(0);

    @Autowired
    private TextLabelService textLabelService;

    public MainWindow() {

        instanceId.incrementAndGet();

    }

    @PostConstruct
    public void addInstanceLabels() {

        addComponent(new Label(APPLICATION_TITLE));

        addComponent(new Label("MainWindow instanceId: " + instanceId));
        addComponent(new Label(textLabelService.getInstanceText()));
    }
}
