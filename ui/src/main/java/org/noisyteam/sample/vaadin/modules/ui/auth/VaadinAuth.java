package org.noisyteam.sample.vaadin.modules.ui.auth;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;

/**
 * Created with IntelliJ IDEA.
 * User: fatroom
 * Date: 11/20/12
 * Time: 1:01 AM
 * To change this template use File | Settings | File Templates.
 */
public class VaadinAuth implements AuthenticationProvider {
    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
