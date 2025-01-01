package com.example.mateuarticle1.ui;

import com.example.mateuarticle1.ui.crud.SimpleCrud;
import io.mateu.uidl.annotations.MateuUI;
import io.mateu.uidl.annotations.MenuOption;
import io.mateu.uidl.annotations.Submenu;
import io.mateu.uidl.interfaces.HasAppTitle;

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
