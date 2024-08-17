package com.example.mateuarticle1.ui;

import com.example.mateuarticle1.ui.crud.SimpleCrud;
import io.mateu.core.domain.uidefinition.core.interfaces.HasAppTitle;
import io.mateu.core.domain.uidefinition.shared.annotations.MateuUI;
import io.mateu.core.domain.uidefinition.shared.annotations.MenuOption;
import io.mateu.core.domain.uidefinition.shared.annotations.Submenu;

@MateuUI("")
public class HelloWorld implements HasAppTitle {

    @MenuOption
    SimpleForm sendEmail;

    @MenuOption
    SimpleCrud crud;

    @Submenu
    SimpleMenu submenu;

    @Override
    public String getAppTitle() {
        return "My app";
    }
}
