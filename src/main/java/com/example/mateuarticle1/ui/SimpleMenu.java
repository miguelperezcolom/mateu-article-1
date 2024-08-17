package com.example.mateuarticle1.ui;

import com.example.mateuarticle1.ui.crud.SimpleCrud;
import io.mateu.core.domain.uidefinition.shared.annotations.MenuOption;

public class SimpleMenu {

    @MenuOption
    SimpleForm sendEmail;

    @MenuOption
    SimpleCrud crud;

}
