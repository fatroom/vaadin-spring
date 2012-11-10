/*
 * Copyright 2011 Navin Peiris <navin.peiris@gmail.com>, Melbourne, Australia.
 * All Rights Reserved.
 */

package com.navinpeiris.vaadin_spring;

import org.springframework.stereotype.Component;

/**
 * A dummy service that should be shared between all user sessions.
 * 
 * @author Navin Peiris
 * @since 1.0.0
 */
@Component
public class TextLabelService {

    private static int instanceId = 0;

    public TextLabelService() {
        instanceId++;
    }

    public String getInstanceText() {
        return "TextLabelService instanceId: " + instanceId;
    }
}
