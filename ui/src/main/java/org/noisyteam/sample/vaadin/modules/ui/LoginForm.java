package org.noisyteam.sample.vaadin.modules.ui;

import com.vaadin.server.Page;
import com.vaadin.ui.Button;
import com.vaadin.ui.Component;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.VerticalLayout;
import org.noisyteam.sample.vaadin.modules.common.SampleModule;
import org.springframework.context.annotation.Scope;
import org.springframework.security.core.context.SecurityContextHolder;

import javax.annotation.PostConstruct;

/**
 * Created with IntelliJ IDEA.
 * User: fatroom
 * Date: 11/19/12
 * Time: 10:37 PM
 * To change this template use File | Settings | File Templates.
 */
@org.springframework.stereotype.Component
@Scope("session")
public class LoginForm extends CustomComponent implements SampleModule {


    @PostConstruct
    public void buildLayout() {
        VerticalLayout layout = new VerticalLayout();
        Button button = new Button("Logout");
        button.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(Button.ClickEvent event) {
                getSession().close();
                //SecurityContextHolder.clearContext();
                Page.getCurrent().setLocation("j_spring_security_logout");
            }
        });
        layout.addComponent(button);
        setCompositionRoot(layout);
    }

    @Override
    public String getName() {
        return "Logout";  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Component getView() {
        return this;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
