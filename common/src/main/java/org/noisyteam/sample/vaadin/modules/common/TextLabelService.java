/*
 * Copyright 2011 Navin Peiris <navin.peiris@gmail.com>, Melbourne, Australia.
 * All Rights Reserved.
 */

package org.noisyteam.sample.vaadin.modules.common;

import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * A dummy service that should be shared between all user sessions.
 * 
 * @author Navin Peiris
 * @since 1.0.0
 */
@Component
public class TextLabelService {

    private static AtomicInteger instanceId = new AtomicInteger(0);

    public TextLabelService() {
        instanceId.incrementAndGet();
    }

    public String getInstanceText() {
        return "TextLabelService instanceId: " + instanceId;
    }
}
