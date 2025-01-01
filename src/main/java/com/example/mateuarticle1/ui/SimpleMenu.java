package com.example.mateuarticle1.ui;

import com.example.mateuarticle1.ui.crud.SimpleCrud;
import io.mateu.uidl.annotations.MenuOption;

public class SimpleMenu {

    @MenuOption
    SimpleForm sendEmail;

    @MenuOption
    SimpleCrud crud;

}
